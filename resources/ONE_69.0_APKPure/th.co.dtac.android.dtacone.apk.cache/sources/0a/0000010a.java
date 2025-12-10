package p000;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: B42 */
/* loaded from: classes2.dex */
public class B42 extends A42 {
    @Override // p000.AbstractC22278t42, androidx.transition.AbstractC5110e
    /* renamed from: c */
    public float mo22731c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // p000.C22797w42, androidx.transition.AbstractC5110e
    /* renamed from: e */
    public void mo803e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // p000.C23143y42, androidx.transition.AbstractC5110e
    /* renamed from: f */
    public void mo429f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.AbstractC22278t42, androidx.transition.AbstractC5110e
    /* renamed from: g */
    public void mo22729g(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000.A42, androidx.transition.AbstractC5110e
    /* renamed from: h */
    public void mo52533h(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000.C22797w42, androidx.transition.AbstractC5110e
    /* renamed from: i */
    public void mo802i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000.C22797w42, androidx.transition.AbstractC5110e
    /* renamed from: j */
    public void mo801j(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}