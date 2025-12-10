package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: classes2.dex */
public final class C5214a extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a */
    public final List f38154a;

    public C5214a(int i) {
        this.f38154a = new ArrayList(i);
    }

    /* renamed from: a */
    public void m52385a(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f38154a.add(onPageChangeCallback);
    }

    /* renamed from: b */
    public void m52384b(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f38154a.remove(onPageChangeCallback);
    }

    /* renamed from: c */
    public final void m52383c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
        try {
            for (ViewPager2.OnPageChangeCallback onPageChangeCallback : this.f38154a) {
                onPageChangeCallback.onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            m52383c(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, int i2) {
        try {
            for (ViewPager2.OnPageChangeCallback onPageChangeCallback : this.f38154a) {
                onPageChangeCallback.onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m52383c(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
        try {
            for (ViewPager2.OnPageChangeCallback onPageChangeCallback : this.f38154a) {
                onPageChangeCallback.onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            m52383c(e);
        }
    }
}
