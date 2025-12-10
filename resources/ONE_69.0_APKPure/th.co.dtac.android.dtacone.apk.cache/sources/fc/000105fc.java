package p000;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p003ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p003ui.graphics.Matrix;
import androidx.compose.p003ui.platform.AndroidComposeView_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pg */
/* loaded from: classes2.dex */
public final class C13107pg implements InterfaceC12456og {

    /* renamed from: a */
    public final int[] f76872a = new int[2];

    /* renamed from: b */
    public final float[] f76873b = Matrix.m72111constructorimpl$default(null, 1, null);

    @Override // p000.InterfaceC12456og
    /* renamed from: a */
    public void mo23471a(View view, float[] matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix.m72120resetimpl(matrix);
        m23792d(view, matrix);
    }

    /* renamed from: b */
    public final void m23794b(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.m71799setFromtUYjHk(this.f76873b, matrix);
        AndroidComposeView_androidKt.m59192c(fArr, this.f76873b);
    }

    /* renamed from: c */
    public final void m23793c(float[] fArr, float f, float f2) {
        Matrix.m72120resetimpl(this.f76873b);
        Matrix.m72131translateimpl$default(this.f76873b, f, f2, 0.0f, 4, null);
        AndroidComposeView_androidKt.m59192c(fArr, this.f76873b);
    }

    /* renamed from: d */
    public final void m23792d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m23792d((View) parent, fArr);
            m23793c(fArr, -view.getScrollX(), -view.getScrollY());
            m23793c(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f76872a;
            view.getLocationInWindow(iArr);
            m23793c(fArr, -view.getScrollX(), -view.getScrollY());
            m23793c(fArr, iArr[0], iArr[1]);
        }
        android.graphics.Matrix viewMatrix = view.getMatrix();
        if (!viewMatrix.isIdentity()) {
            Intrinsics.checkNotNullExpressionValue(viewMatrix, "viewMatrix");
            m23794b(fArr, viewMatrix);
        }
    }
}