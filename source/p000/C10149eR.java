package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.tabs.C7109a;
import com.google.android.material.tabs.TabLayout;

/* renamed from: eR */
/* loaded from: classes4.dex */
public class C10149eR extends C7109a {
    /* renamed from: e */
    public static float m31543e(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    public static float m31542f(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.C7109a
    /* renamed from: d */
    public void mo31544d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float m31542f;
        float m31543e;
        RectF m43874a = C7109a.m43874a(tabLayout, view);
        RectF m43874a2 = C7109a.m43874a(tabLayout, view2);
        if (m43874a.left < m43874a2.left) {
            m31542f = m31543e(f);
            m31543e = m31542f(f);
        } else {
            m31542f = m31542f(f);
            m31543e = m31543e(f);
        }
        drawable.setBounds(AnimationUtils.lerp((int) m43874a.left, (int) m43874a2.left, m31542f), drawable.getBounds().top, AnimationUtils.lerp((int) m43874a.right, (int) m43874a2.right, m31543e), drawable.getBounds().bottom);
    }
}
