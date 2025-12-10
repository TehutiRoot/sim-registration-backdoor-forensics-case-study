package ru.tinkoff.scrollingpagerindicator;

import android.database.DataSetObserver;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes5.dex */
public class ViewPagerAttacher implements ScrollingPagerIndicator.PagerAttacher<ViewPager> {

    /* renamed from: a */
    public DataSetObserver f77490a;

    /* renamed from: b */
    public ViewPager.OnPageChangeListener f77491b;

    /* renamed from: c */
    public ViewPager f77492c;

    /* renamed from: d */
    public PagerAdapter f77493d;

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ViewPagerAttacher$a */
    /* loaded from: classes5.dex */
    public class C13306a extends DataSetObserver {

        /* renamed from: a */
        public final /* synthetic */ ScrollingPagerIndicator f77494a;

        public C13306a(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f77494a = scrollingPagerIndicator;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            this.f77494a.reattach();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            onChanged();
        }
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ViewPagerAttacher$b */
    /* loaded from: classes5.dex */
    public class C13307b implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public boolean f77496a = true;

        /* renamed from: b */
        public final /* synthetic */ ScrollingPagerIndicator f77497b;

        /* renamed from: c */
        public final /* synthetic */ ViewPager f77498c;

        public C13307b(ScrollingPagerIndicator scrollingPagerIndicator, ViewPager viewPager) {
            this.f77497b = scrollingPagerIndicator;
            this.f77498c = viewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f77496a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.f77497b.onPageScrolled(i, f);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f77496a) {
                this.f77497b.setDotCount(ViewPagerAttacher.this.f77493d.getCount());
                this.f77497b.setCurrentPosition(this.f77498c.getCurrentItem());
            }
        }
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.PagerAttacher
    public void detachFromPager() {
        this.f77493d.unregisterDataSetObserver(this.f77490a);
        this.f77492c.removeOnPageChangeListener(this.f77491b);
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.PagerAttacher
    public void attachToPager(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull ViewPager viewPager) {
        PagerAdapter adapter = viewPager.getAdapter();
        this.f77493d = adapter;
        if (adapter != null) {
            this.f77492c = viewPager;
            scrollingPagerIndicator.setDotCount(adapter.getCount());
            scrollingPagerIndicator.setCurrentPosition(viewPager.getCurrentItem());
            C13306a c13306a = new C13306a(scrollingPagerIndicator);
            this.f77490a = c13306a;
            this.f77493d.registerDataSetObserver(c13306a);
            C13307b c13307b = new C13307b(scrollingPagerIndicator, viewPager);
            this.f77491b = c13307b;
            viewPager.addOnPageChangeListener(c13307b);
            return;
        }
        throw new IllegalStateException("Set adapter before call attachToPager() method");
    }
}
