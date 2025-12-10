package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class TabLayoutMediator {

    /* renamed from: a */
    public final TabLayout f50993a;

    /* renamed from: b */
    public final ViewPager2 f50994b;

    /* renamed from: c */
    public final boolean f50995c;

    /* renamed from: d */
    public final boolean f50996d;

    /* renamed from: e */
    public final TabConfigurationStrategy f50997e;

    /* renamed from: f */
    public RecyclerView.Adapter f50998f;

    /* renamed from: g */
    public boolean f50999g;

    /* renamed from: h */
    public C7096b f51000h;

    /* renamed from: i */
    public TabLayout.OnTabSelectedListener f51001i;

    /* renamed from: j */
    public RecyclerView.AdapterDataObserver f51002j;

    /* loaded from: classes4.dex */
    public interface TabConfigurationStrategy {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i);
    }

    /* renamed from: com.google.android.material.tabs.TabLayoutMediator$a */
    /* loaded from: classes4.dex */
    public class C7095a extends RecyclerView.AdapterDataObserver {
        public C7095a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            TabLayoutMediator.this.m43863a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            TabLayoutMediator.this.m43863a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            TabLayoutMediator.this.m43863a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            TabLayoutMediator.this.m43863a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            TabLayoutMediator.this.m43863a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            TabLayoutMediator.this.m43863a();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayoutMediator$b */
    /* loaded from: classes4.dex */
    public static class C7096b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        public final WeakReference f51004a;

        /* renamed from: b */
        public int f51005b;

        /* renamed from: c */
        public int f51006c;

        public C7096b(TabLayout tabLayout) {
            this.f51004a = new WeakReference(tabLayout);
            m43862a();
        }

        /* renamed from: a */
        public void m43862a() {
            this.f51006c = 0;
            this.f51005b = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            this.f51005b = this.f51006c;
            this.f51006c = i;
            TabLayout tabLayout = (TabLayout) this.f51004a.get();
            if (tabLayout != null) {
                tabLayout.m43938E(this.f51006c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            TabLayout tabLayout = (TabLayout) this.f51004a.get();
            if (tabLayout != null) {
                int i3 = this.f51006c;
                if (i3 == 2 && this.f51005b != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (i3 == 2 && this.f51005b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                tabLayout.m43912z(i, f, z, z2, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f51004a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f51006c;
                if (i2 != 0 && (i2 != 2 || this.f51005b != 0)) {
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
    public static class C7097c implements TabLayout.OnTabSelectedListener {

        /* renamed from: a */
        public final ViewPager2 f51007a;

        /* renamed from: b */
        public final boolean f51008b;

        public C7097c(ViewPager2 viewPager2, boolean z) {
            this.f51007a = viewPager2;
            this.f51008b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            this.f51007a.setCurrentItem(tab.getPosition(), this.f51008b);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, true, tabConfigurationStrategy);
    }

    /* renamed from: a */
    public void m43863a() {
        this.f50993a.removeAllTabs();
        RecyclerView.Adapter adapter = this.f50998f;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab newTab = this.f50993a.newTab();
                this.f50997e.onConfigureTab(newTab, i);
                this.f50993a.addTab(newTab, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f50994b.getCurrentItem(), this.f50993a.getTabCount() - 1);
                if (min != this.f50993a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f50993a;
                    tabLayout.selectTab(tabLayout.getTabAt(min));
                }
            }
        }
    }

    public void attach() {
        if (!this.f50999g) {
            RecyclerView.Adapter adapter = this.f50994b.getAdapter();
            this.f50998f = adapter;
            if (adapter != null) {
                this.f50999g = true;
                C7096b c7096b = new C7096b(this.f50993a);
                this.f51000h = c7096b;
                this.f50994b.registerOnPageChangeCallback(c7096b);
                C7097c c7097c = new C7097c(this.f50994b, this.f50996d);
                this.f51001i = c7097c;
                this.f50993a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) c7097c);
                if (this.f50995c) {
                    C7095a c7095a = new C7095a();
                    this.f51002j = c7095a;
                    this.f50998f.registerAdapterDataObserver(c7095a);
                }
                m43863a();
                this.f50993a.setScrollPosition(this.f50994b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public void detach() {
        RecyclerView.Adapter adapter;
        if (this.f50995c && (adapter = this.f50998f) != null) {
            adapter.unregisterAdapterDataObserver(this.f51002j);
            this.f51002j = null;
        }
        this.f50993a.removeOnTabSelectedListener(this.f51001i);
        this.f50994b.unregisterOnPageChangeCallback(this.f51000h);
        this.f51001i = null;
        this.f51000h = null;
        this.f50998f = null;
        this.f50999g = false;
    }

    public boolean isAttached() {
        return this.f50999g;
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, z, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, boolean z2, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this.f50993a = tabLayout;
        this.f50994b = viewPager2;
        this.f50995c = z;
        this.f50996d = z2;
        this.f50997e = tabConfigurationStrategy;
    }
}