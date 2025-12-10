package p000;

import android.view.View;
import androidx.transition.AbstractC5128e;

/* renamed from: w32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC22726w32 extends AbstractC5128e {

    /* renamed from: e */
    public static boolean f107890e = true;

    @Override // androidx.transition.AbstractC5128e
    /* renamed from: c */
    public float mo930c(View view) {
        float transitionAlpha;
        if (f107890e) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f107890e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.AbstractC5128e
    /* renamed from: g */
    public void mo928g(View view, float f) {
        if (f107890e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f107890e = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // androidx.transition.AbstractC5128e
    /* renamed from: a */
    public void mo931a(View view) {
    }

    @Override // androidx.transition.AbstractC5128e
    /* renamed from: d */
    public void mo929d(View view) {
    }
}
