package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes2.dex */
public final class MarginPageTransformer implements ViewPager2.PageTransformer {

    /* renamed from: a */
    public final int f38111a;

    public MarginPageTransformer(@InterfaceC2055Px int i) {
        Preconditions.checkArgumentNonnegative(i, "Margin must be non-negative");
        this.f38111a = i;
    }

    /* renamed from: a */
    public final ViewPager2 m52426a(View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NonNull View view, float f) {
        ViewPager2 m52426a = m52426a(view);
        float f2 = this.f38111a * f;
        if (m52426a.getOrientation() == 0) {
            if (m52426a.m52423c()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }
}
