package p000;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p003ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p003ui.graphics.Matrix;
import androidx.compose.p003ui.platform.AndroidComposeView_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pg */
/* loaded from: classes2.dex */
public final class C13105pg implements InterfaceC12456og {

    /* renamed from: a */
    public final int[] f76646a = new int[2];

    /* renamed from: b */
    public final float[] f76647b = Matrix.m71927constructorimpl$default(null, 1, null);

    @Override // p000.InterfaceC12456og
    /* renamed from: a */
    public void mo23297a(View view, float[] matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix.m71936resetimpl(matrix);
        m23637d(view, matrix);
    }

    /* renamed from: b */
    public final void m23639b(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.m71615setFromtUYjHk(this.f76647b, matrix);
        AndroidComposeView_androidKt.m59242c(fArr, this.f76647b);
    }

    /* renamed from: c */
    public final void m23638c(float[] fArr, float f, float f2) {
        Matrix.m71936resetimpl(this.f76647b);
        Matrix.m71947translateimpl$default(this.f76647b, f, f2, 0.0f, 4, null);
        AndroidComposeView_androidKt.m59242c(fArr, this.f76647b);
    }

    /* renamed from: d */
    public final void m23637d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m23637d((View) parent, fArr);
            m23638c(fArr, -view.getScrollX(), -view.getScrollY());
            m23638c(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f76646a;
            view.getLocationInWindow(iArr);
            m23638c(fArr, -view.getScrollX(), -view.getScrollY());
            m23638c(fArr, iArr[0], iArr[1]);
        }
        android.graphics.Matrix viewMatrix = view.getMatrix();
        if (!viewMatrix.isIdentity()) {
            Intrinsics.checkNotNullExpressionValue(viewMatrix, "viewMatrix");
            m23639b(fArr, viewMatrix);
        }
    }
}
