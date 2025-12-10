package th.p047co.dtac.android.dtacone.adapter;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.adapter.ViewPagerCardAdapter */
/* loaded from: classes7.dex */
public class ViewPagerCardAdapter extends FragmentStatePagerAdapter {

    /* renamed from: j */
    public List f80986j;

    /* renamed from: k */
    public List f80987k;

    public ViewPagerCardAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f80986j = new ArrayList();
        this.f80987k = new ArrayList();
    }

    public void addFragmentCard(Fragment fragment, String str) {
        this.f80986j.add(fragment);
        this.f80987k.add(str);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List list = this.f80986j;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        return (Fragment) this.f80986j.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return (CharSequence) this.f80987k.get(i);
    }

    public void removeFragment() {
        this.f80986j.clear();
        this.f80987k.clear();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        return null;
    }
}
