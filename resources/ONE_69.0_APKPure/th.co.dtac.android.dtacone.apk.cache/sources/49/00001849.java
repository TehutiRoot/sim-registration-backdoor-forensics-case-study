package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.tabs.C7098a;
import com.google.android.material.tabs.TabLayout;

/* renamed from: ZV */
/* loaded from: classes4.dex */
public class C1808ZV extends C7098a {
    @Override // com.google.android.material.tabs.C7098a
    /* renamed from: d */
    public void mo30979d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float lerp;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF m43861a = C7098a.m43861a(tabLayout, view);
        if (i < 0) {
            lerp = AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            lerp = AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) m43861a.left, drawable.getBounds().top, (int) m43861a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (lerp * 255.0f));
    }
}