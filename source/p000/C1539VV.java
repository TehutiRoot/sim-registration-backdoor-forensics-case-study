package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.tabs.C7109a;
import com.google.android.material.tabs.TabLayout;

/* renamed from: VV */
/* loaded from: classes4.dex */
public class C1539VV extends C7109a {
    @Override // com.google.android.material.tabs.C7109a
    /* renamed from: d */
    public void mo31544d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float lerp;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF m43874a = C7109a.m43874a(tabLayout, view);
        if (i < 0) {
            lerp = AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            lerp = AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) m43874a.left, drawable.getBounds().top, (int) m43874a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (lerp * 255.0f));
    }
}
