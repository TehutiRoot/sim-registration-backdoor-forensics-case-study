package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class TabLayoutMediator {

    /* renamed from: a */
    public final TabLayout f50981a;

    /* renamed from: b */
    public final ViewPager2 f50982b;

    /* renamed from: c */
    public final boolean f50983c;

    /* renamed from: d */
    public final boolean f50984d;

    /* renamed from: e */
    public final TabConfigurationStrategy f50985e;

    /* renamed from: f */
    public RecyclerView.Adapter f50986f;

    /* renamed from: g */
    public boolean f50987g;

    /* renamed from: h */
    public C7107b f50988h;

    /* renamed from: i */
    public TabLayout.OnTabSelectedListener f50989i;

    /* renamed from: j */
    public RecyclerView.AdapterDataObserver f50990j;

    /* loaded from: classes4.dex */
    public interface TabConfigurationStrategy {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i);
    }

    /* renamed from: com.google.android.material.tabs.TabLayoutMediator$a */
    /* loaded from: classes4.dex */
    public class C7106a extends RecyclerView.AdapterDataObserver {
        public C7106a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            TabLayoutMediator.this.m43876a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            TabLayoutMediator.this.m43876a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            TabLayoutMediator.this.m43876a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            TabLayoutMediator.this.m43876a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            TabLayoutMediator.this.m43876a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            TabLayoutMediator.this.m43876a();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayoutMediator$b */
    /* loaded from: classes4.dex */
    public static class C7107b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        public final WeakReference f50992a;

        /* renamed from: b */
        public int f50993b;

        /* renamed from: c */
        public int f50994c;

        public C7107b(TabLayout tabLayout) {
            this.f50992a = new WeakReference(tabLayout);
            m43875a();
        }

        /* renamed from: a */
        public void m43875a() {
            this.f50994c = 0;
            this.f50993b = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            this.f50993b = this.f50994c;
            this.f50994c = i;
            TabLayout tabLayout = (TabLayout) this.f50992a.get();
            if (tabLayout != null) {
                tabLayout.m43951E(this.f50994c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            TabLayout tabLayout = (TabLayout) this.f50992a.get();
            if (tabLayout != null) {
                int i3 = this.f50994c;
                if (i3 == 2 && this.f50993b != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (i3 == 2 && this.f50993b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                tabLayout.m43925z(i, f, z, z2, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f50992a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f50994c;
                if (i2 != 0 && (i2 != 2 || this.f50993b != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i), z);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayoutMediator$c */
    /* loaded from: classes4.dex */
    public static class C7108c implements TabLayout.OnTabSelectedListener {

        /* renamed from: a */
        public final ViewPager2 f50995a;

        /* renamed from: b */
        public final boolean f50996b;

        public C7108c(ViewPager2 viewPager2, boolean z) {
            this.f50995a = viewPager2;
            this.f50996b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            this.f50995a.setCurrentItem(tab.getPosition(), this.f50996b);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, true, tabConfigurationStrategy);
    }

    /* renamed from: a */
    public void m43876a() {
        this.f50981a.removeAllTabs();
        RecyclerView.Adapter adapter = this.f50986f;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab newTab = this.f50981a.newTab();
                this.f50985e.onConfigureTab(newTab, i);
                this.f50981a.addTab(newTab, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f50982b.getCurrentItem(), this.f50981a.getTabCount() - 1);
                if (min != this.f50981a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f50981a;
                    tabLayout.selectTab(tabLayout.getTabAt(min));
                }
            }
        }
    }

    public void attach() {
        if (!this.f50987g) {
            RecyclerView.Adapter adapter = this.f50982b.getAdapter();
            this.f50986f = adapter;
            if (adapter != null) {
                this.f50987g = true;
                C7107b c7107b = new C7107b(this.f50981a);
                this.f50988h = c7107b;
                this.f50982b.registerOnPageChangeCallback(c7107b);
                C7108c c7108c = new C7108c(this.f50982b, this.f50984d);
                this.f50989i = c7108c;
                this.f50981a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) c7108c);
                if (this.f50983c) {
                    C7106a c7106a = new C7106a();
                    this.f50990j = c7106a;
                    this.f50986f.registerAdapterDataObserver(c7106a);
                }
                m43876a();
                this.f50981a.setScrollPosition(this.f50982b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public void detach() {
        RecyclerView.Adapter adapter;
        if (this.f50983c && (adapter = this.f50986f) != null) {
            adapter.unregisterAdapterDataObserver(this.f50990j);
            this.f50990j = null;
        }
        this.f50981a.removeOnTabSelectedListener(this.f50989i);
        this.f50982b.unregisterOnPageChangeCallback(this.f50988h);
        this.f50989i = null;
        this.f50988h = null;
        this.f50986f = null;
        this.f50987g = false;
    }

    public boolean isAttached() {
        return this.f50987g;
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, z, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, boolean z2, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this.f50981a = tabLayout;
        this.f50982b = viewPager2;
        this.f50983c = z;
        this.f50984d = z2;
        this.f50985e = tabConfigurationStrategy;
    }
}
