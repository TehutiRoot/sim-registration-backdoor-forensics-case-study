package p000;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: w42  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C22797w42 extends AbstractC22278t42 {

    /* renamed from: f */
    public static boolean f108308f = true;

    /* renamed from: g */
    public static boolean f108309g = true;

    /* renamed from: h */
    public static boolean f108310h = true;

    @Override // androidx.transition.AbstractC5110e
    /* renamed from: e */
    public void mo803e(View view, Matrix matrix) {
        if (f108308f) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f108308f = false;
            }
        }
    }

    @Override // androidx.transition.AbstractC5110e
    /* renamed from: i */
    public void mo802i(View view, Matrix matrix) {
        if (f108309g) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f108309g = false;
            }
        }
    }

    @Override // androidx.transition.AbstractC5110e
    /* renamed from: j */
    public void mo801j(View view, Matrix matrix) {
        if (f108310h) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f108310h = false;
            }
        }
    }
}