package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.tabs.C7098a;
import com.google.android.material.tabs.TabLayout;

/* renamed from: iR */
/* loaded from: classes4.dex */
public class C10453iR extends C7098a {
    /* renamed from: e */
    public static float m30978e(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    public static float m30977f(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.C7098a
    /* renamed from: d */
    public void mo30979d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float m30977f;
        float m30978e;
        RectF m43861a = C7098a.m43861a(tabLayout, view);
        RectF m43861a2 = C7098a.m43861a(tabLayout, view2);
        if (m43861a.left < m43861a2.left) {
            m30977f = m30978e(f);
            m30978e = m30977f(f);
        } else {
            m30977f = m30977f(f);
            m30978e = m30978e(f);
        }
        drawable.setBounds(AnimationUtils.lerp((int) m43861a.left, (int) m43861a2.left, m30977f), drawable.getBounds().top, AnimationUtils.lerp((int) m43861a.right, (int) m43861a2.right, m30978e), drawable.getBounds().bottom);
    }
}