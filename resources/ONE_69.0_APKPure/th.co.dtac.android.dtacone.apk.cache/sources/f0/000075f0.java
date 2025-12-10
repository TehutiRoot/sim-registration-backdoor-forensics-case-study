package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class CompositePageTransformer implements ViewPager2.PageTransformer {

    /* renamed from: a */
    public final List f38198a = new ArrayList();

    public void addTransformer(@NonNull ViewPager2.PageTransformer pageTransformer) {
        this.f38198a.add(pageTransformer);
    }

    public void removeTransformer(@NonNull ViewPager2.PageTransformer pageTransformer) {
        this.f38198a.remove(pageTransformer);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NonNull View view, float f) {
        for (ViewPager2.PageTransformer pageTransformer : this.f38198a) {
            pageTransformer.transformPage(view, f);
        }
    }
}