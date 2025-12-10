package p000;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: z32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C23242z32 extends AbstractC22726w32 {

    /* renamed from: f */
    public static boolean f108966f = true;

    /* renamed from: g */
    public static boolean f108967g = true;

    /* renamed from: h */
    public static boolean f108968h = true;

    @Override // androidx.transition.AbstractC5128e
    /* renamed from: e */
    public void mo140e(View view, Matrix matrix) {
        if (f108966f) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f108966f = false;
            }
        }
    }

    @Override // androidx.transition.AbstractC5128e
    /* renamed from: i */
    public void mo139i(View view, Matrix matrix) {
        if (f108967g) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f108967g = false;
            }
        }
    }

    @Override // androidx.transition.AbstractC5128e
    /* renamed from: j */
    public void mo138j(View view, Matrix matrix) {
        if (f108968h) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f108968h = false;
            }
        }
    }
}
