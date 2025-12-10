package p000;

import android.view.View;
import androidx.transition.AbstractC5110e;

/* renamed from: t42  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC22278t42 extends AbstractC5110e {

    /* renamed from: e */
    public static boolean f80084e = true;

    @Override // androidx.transition.AbstractC5110e
    /* renamed from: c */
    public float mo22731c(View view) {
        float transitionAlpha;
        if (f80084e) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f80084e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.AbstractC5110e
    /* renamed from: g */
    public void mo22729g(View view, float f) {
        if (f80084e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f80084e = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // androidx.transition.AbstractC5110e
    /* renamed from: a */
    public void mo22732a(View view) {
    }

    @Override // androidx.transition.AbstractC5110e
    /* renamed from: d */
    public void mo22730d(View view) {
    }
}