package ru.tinkoff.scrollingpagerindicator;

import android.database.DataSetObserver;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes5.dex */
public class ViewPagerAttacher implements ScrollingPagerIndicator.PagerAttacher<ViewPager> {

    /* renamed from: a */
    public DataSetObserver f77683a;

    /* renamed from: b */
    public ViewPager.OnPageChangeListener f77684b;

    /* renamed from: c */
    public ViewPager f77685c;

    /* renamed from: d */
    public PagerAdapter f77686d;

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ViewPagerAttacher$a */
    /* loaded from: classes5.dex */
    public class C13307a extends DataSetObserver {

        /* renamed from: a */
        public final /* synthetic */ ScrollingPagerIndicator f77687a;

        public C13307a(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f77687a = scrollingPagerIndicator;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            this.f77687a.reattach();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            onChanged();
        }
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ViewPagerAttacher$b */
    /* loaded from: classes5.dex */
    public class C13308b implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public boolean f77689a = true;

        /* renamed from: b */
        public final /* synthetic */ ScrollingPagerIndicator f77690b;

        /* renamed from: c */
        public final /* synthetic */ ViewPager f77691c;

        public C13308b(ScrollingPagerIndicator scrollingPagerIndicator, ViewPager viewPager) {
            this.f77690b = scrollingPagerIndicator;
            this.f77691c = viewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f77689a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.f77690b.onPageScrolled(i, f);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f77689a) {
                this.f77690b.setDotCount(ViewPagerAttacher.this.f77686d.getCount());
                this.f77690b.setCurrentPosition(this.f77691c.getCurrentItem());
            }
        }
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.PagerAttacher
    public void detachFromPager() {
        this.f77686d.unregisterDataSetObserver(this.f77683a);
        this.f77685c.removeOnPageChangeListener(this.f77684b);
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.PagerAttacher
    public void attachToPager(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull ViewPager viewPager) {
        PagerAdapter adapter = viewPager.getAdapter();
        this.f77686d = adapter;
        if (adapter != null) {
            this.f77685c = viewPager;
            scrollingPagerIndicator.setDotCount(adapter.getCount());
            scrollingPagerIndicator.setCurrentPosition(viewPager.getCurrentItem());
            C13307a c13307a = new C13307a(scrollingPagerIndicator);
            this.f77683a = c13307a;
            this.f77686d.registerDataSetObserver(c13307a);
            C13308b c13308b = new C13308b(scrollingPagerIndicator, viewPager);
            this.f77684b = c13308b;
            viewPager.addOnPageChangeListener(c13308b);
            return;
        }
        throw new IllegalStateException("Set adapter before call attachToPager() method");
    }
}