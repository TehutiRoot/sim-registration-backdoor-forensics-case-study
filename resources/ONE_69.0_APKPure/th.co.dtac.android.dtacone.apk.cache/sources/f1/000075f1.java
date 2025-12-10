package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes2.dex */
public final class MarginPageTransformer implements ViewPager2.PageTransformer {

    /* renamed from: a */
    public final int f38199a;

    public MarginPageTransformer(@InterfaceC2037Px int i) {
        Preconditions.checkArgumentNonnegative(i, "Margin must be non-negative");
        this.f38199a = i;
    }

    /* renamed from: a */
    public final ViewPager2 m52378a(View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NonNull View view, float f) {
        ViewPager2 m52378a = m52378a(view);
        float f2 = this.f38199a * f;
        if (m52378a.getOrientation() == 0) {
            if (m52378a.m52375c()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }
}