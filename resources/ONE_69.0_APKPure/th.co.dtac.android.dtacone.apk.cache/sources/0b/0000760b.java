package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.b */
/* loaded from: classes2.dex */
public final class C5197b extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a */
    public final LinearLayoutManager f38243a;

    /* renamed from: b */
    public ViewPager2.PageTransformer f38244b;

    public C5197b(LinearLayoutManager linearLayoutManager) {
        this.f38243a = linearLayoutManager;
    }

    /* renamed from: a */
    public ViewPager2.PageTransformer m52334a() {
        return this.f38244b;
    }

    /* renamed from: b */
    public void m52333b(ViewPager2.PageTransformer pageTransformer) {
        this.f38244b = pageTransformer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f38244b == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f38243a.getChildCount(); i3++) {
            View childAt = this.f38243a.getChildAt(i3);
            if (childAt != null) {
                this.f38244b.transformPage(childAt, (this.f38243a.getPosition(childAt) - i) + f2);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f38243a.getChildCount())));
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
    }
}