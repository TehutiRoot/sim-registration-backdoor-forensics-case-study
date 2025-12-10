package p000;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: E32 */
/* loaded from: classes2.dex */
public class E32 extends D32 {
    @Override // p000.AbstractC22726w32, androidx.transition.AbstractC5128e
    /* renamed from: c */
    public float mo930c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // p000.C23242z32, androidx.transition.AbstractC5128e
    /* renamed from: e */
    public void mo140e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // p000.B32, androidx.transition.AbstractC5128e
    /* renamed from: f */
    public void mo52582f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.AbstractC22726w32, androidx.transition.AbstractC5128e
    /* renamed from: g */
    public void mo928g(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000.D32, androidx.transition.AbstractC5128e
    /* renamed from: h */
    public void mo52581h(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000.C23242z32, androidx.transition.AbstractC5128e
    /* renamed from: i */
    public void mo139i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000.C23242z32, androidx.transition.AbstractC5128e
    /* renamed from: j */
    public void mo138j(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
