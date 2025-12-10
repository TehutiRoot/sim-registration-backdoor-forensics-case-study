package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FragmentStatePagerAdapter extends PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;

    /* renamed from: c */
    public final FragmentManager f35540c;

    /* renamed from: d */
    public final int f35541d;

    /* renamed from: e */
    public FragmentTransaction f35542e;

    /* renamed from: f */
    public ArrayList f35543f;

    /* renamed from: g */
    public ArrayList f35544g;

    /* renamed from: h */
    public Fragment f35545h;

    /* renamed from: i */
    public boolean f35546i;

    @Deprecated
    public FragmentStatePagerAdapter(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.f35542e == null) {
            this.f35542e = this.f35540c.beginTransaction();
        }
        while (this.f35543f.size() <= i) {
            this.f35543f.add(null);
        }
        ArrayList arrayList = this.f35543f;
        if (fragment.isAdded()) {
            savedState = this.f35540c.saveFragmentInstanceState(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.f35544g.set(i, null);
        this.f35542e.remove(fragment);
        if (fragment.equals(this.f35545h)) {
            this.f35545h = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f35542e;
        if (fragmentTransaction != null) {
            if (!this.f35546i) {
                try {
                    this.f35546i = true;
                    fragmentTransaction.commitNowAllowingStateLoss();
                } finally {
                    this.f35546i = false;
                }
            }
            this.f35542e = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f35544g.size() > i && (fragment = (Fragment) this.f35544g.get(i)) != null) {
            return fragment;
        }
        if (this.f35542e == null) {
            this.f35542e = this.f35540c.beginTransaction();
        }
        Fragment item = getItem(i);
        if (this.f35543f.size() > i && (savedState = (Fragment.SavedState) this.f35543f.get(i)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.f35544g.size() <= i) {
            this.f35544g.add(null);
        }
        item.setMenuVisibility(false);
        if (this.f35541d == 0) {
            item.setUserVisibleHint(false);
        }
        this.f35544g.set(i, item);
        this.f35542e.add(viewGroup.getId(), item);
        if (this.f35541d == 1) {
            this.f35542e.setMaxLifecycle(item, Lifecycle.State.STARTED);
        }
        return item;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f35543f.clear();
            this.f35544g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f35543f.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(OperatorName.FILL_NON_ZERO)) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.f35540c.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.f35544g.size() <= parseInt) {
                            this.f35544g.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.f35544g.set(parseInt, fragment);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f35543f.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f35543f.size()];
            this.f35543f.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f35544g.size(); i++) {
            Fragment fragment = (Fragment) this.f35544g.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f35540c.putFragment(bundle, OperatorName.FILL_NON_ZERO + i, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f35545h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f35541d == 1) {
                    if (this.f35542e == null) {
                        this.f35542e = this.f35540c.beginTransaction();
                    }
                    this.f35542e.setMaxLifecycle(this.f35545h, Lifecycle.State.STARTED);
                } else {
                    this.f35545h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f35541d == 1) {
                if (this.f35542e == null) {
                    this.f35542e = this.f35540c.beginTransaction();
                }
                this.f35542e.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f35545h = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public FragmentStatePagerAdapter(@NonNull FragmentManager fragmentManager, int i) {
        this.f35542e = null;
        this.f35543f = new ArrayList();
        this.f35544g = new ArrayList();
        this.f35545h = null;
        this.f35540c = fragmentManager;
        this.f35541d = i;
    }
}
