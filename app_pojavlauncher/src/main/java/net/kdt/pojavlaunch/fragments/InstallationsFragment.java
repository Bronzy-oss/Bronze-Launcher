package net.kdt.pojavlaunch.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import net.kdt.pojavlaunch.Tools;
import net.kdt.pojavlaunch.instances.DisplayInstance;
import net.kdt.pojavlaunch.instances.Instances;
import net.kdt.pojavlaunch.instances.InstanceAdapter;

import git.artdeell.mojo.R;

/** Shows all instances in a scrollable list (Installations tab). */
public class InstallationsFragment extends Fragment {
    public static final String TAG = "InstallationsFragment";
    private final InstanceAdapter mAdapter = new InstanceAdapter(null);
    private ListView mListView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_installations, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mListView = view.findViewById(R.id.installations_list);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener((parent, v, position, id) -> {
            Object item = mAdapter.getItem(position);
            if (item instanceof DisplayInstance) {
                Instances.setSelectedInstance((DisplayInstance) item);
                Tools.swapFragment(getActivity(), InstanceEditorFragment.class, InstanceEditorFragment.TAG, null);
            }
        });
        loadInstances();
    }

    private void loadInstances() {
        new Thread(() -> {
            try {
                final Instances instances = Instances.loadDisplay();
                Tools.runOnUiThread(() -> mAdapter.applyInstances(instances));
            } catch (Exception e) {
                Tools.runOnUiThread(() -> Tools.showError(getContext(), e));
            }
        }).start();
    }
}
