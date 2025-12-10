package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FragmentPagerAdapter extends PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;

    /* renamed from: c */
    public final FragmentManager f35623c;

    /* renamed from: d */
    public final int f35624d;

    /* renamed from: e */
    public FragmentTransaction f35625e;

    /* renamed from: f */
    public Fragment f35626f;

    /* renamed from: g */
    public boolean f35627g;

    @Deprecated
    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    /* renamed from: b */
    public static String m54264b(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f35625e == null) {
            this.f35625e = this.f35623c.beginTransaction();
        }
        this.f35625e.detach(fragment);
        if (fragment.equals(this.f35626f)) {
            this.f35626f = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f35625e;
        if (fragmentTransaction != null) {
            if (!this.f35627g) {
                try {
                    this.f35627g = true;
                    fragmentTransaction.commitNowAllowingStateLoss();
                } finally {
                    this.f35627g = false;
                }
            }
            this.f35625e = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int i);

    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        if (this.f35625e == null) {
            this.f35625e = this.f35623c.beginTransaction();
        }
        long itemId = getItemId(i);
        Fragment findFragmentByTag = this.f35623c.findFragmentByTag(m54264b(viewGroup.getId(), itemId));
        if (findFragmentByTag != null) {
            this.f35625e.attach(findFragmentByTag);
        } else {
            findFragmentByTag = getItem(i);
            this.f35625e.add(viewGroup.getId(), findFragmentByTag, m54264b(viewGroup.getId(), itemId));
        }
        if (findFragmentByTag != this.f35626f) {
            findFragmentByTag.setMenuVisibility(false);
            if (this.f35624d == 1) {
                this.f35625e.setMaxLifecycle(findFragmentByTag, Lifecycle.State.STARTED);
            } else {
                findFragmentByTag.setUserVisibleHint(false);
            }
        }
        return findFragmentByTag;
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
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f35626f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f35624d == 1) {
                    if (this.f35625e == null) {
                        this.f35625e = this.f35623c.beginTransaction();
                    }
                    this.f35625e.setMaxLifecycle(this.f35626f, Lifecycle.State.STARTED);
                } else {
                    this.f35626f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f35624d == 1) {
                if (this.f35625e == null) {
                    this.f35625e = this.f35623c.beginTransaction();
                }
                this.f35625e.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f35626f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager, int i) {
        this.f35625e = null;
        this.f35626f = null;
        this.f35623c = fragmentManager;
        this.f35624d = i;
    }
}