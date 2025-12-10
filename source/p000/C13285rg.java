package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: rg */
/* loaded from: classes2.dex */
public final class C13285rg implements InterfaceC12456og {

    /* renamed from: a */
    public final Matrix f77362a = new Matrix();

    /* renamed from: b */
    public final int[] f77363b = new int[2];

    @Override // p000.InterfaceC12456og
    @DoNotInline
    /* renamed from: a */
    public void mo23297a(@NotNull View view, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f77362a.reset();
        view.transformMatrixToGlobal(this.f77362a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f77363b);
        int[] iArr = this.f77363b;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f77363b;
        this.f77362a.postTranslate(iArr2[0] - i, iArr2[1] - i2);
        AndroidMatrixConversions_androidKt.m71615setFromtUYjHk(matrix, this.f77362a);
    }
}
