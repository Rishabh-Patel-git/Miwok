package com.example.miwok;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CategoryFragmentAdapter extends FragmentStateAdapter {

    private String[] titles = new String[]{"Numbers","Colors","Family","Phrases"};

    public CategoryFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position ==0)
            return new Numbers_fragment();
        else if(position == 1)
            return new ColorsFragment();
        else if(position == 2)
            return new FamilyMembersFragment();
        else
            return new PhrasesFragment();
    }
}
