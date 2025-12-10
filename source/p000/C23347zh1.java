package p000;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23347zh1 implements WindowInsets {

    /* renamed from: a */
    public final PaddingValues f109152a;

    public C23347zh1(PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f109152a = paddingValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23347zh1)) {
            return false;
        }
        return Intrinsics.areEqual(((C23347zh1) obj).f109152a, this.f109152a);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo69432roundToPx0680j_4(this.f109152a.mo69156calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo69432roundToPx0680j_4(this.f109152a.mo69157calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo69432roundToPx0680j_4(this.f109152a.mo69158calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo69432roundToPx0680j_4(this.f109152a.mo69159calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.f109152a.hashCode();
    }

    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        float mo69157calculateLeftPaddingu2uoSUM = this.f109152a.mo69157calculateLeftPaddingu2uoSUM(layoutDirection);
        float mo69159calculateTopPaddingD9Ej5fM = this.f109152a.mo69159calculateTopPaddingD9Ej5fM();
        float mo69158calculateRightPaddingu2uoSUM = this.f109152a.mo69158calculateRightPaddingu2uoSUM(layoutDirection);
        float mo69156calculateBottomPaddingD9Ej5fM = this.f109152a.mo69156calculateBottomPaddingD9Ej5fM();
        return "PaddingValues(" + ((Object) C3641Dp.m73669toStringimpl(mo69157calculateLeftPaddingu2uoSUM)) + ", " + ((Object) C3641Dp.m73669toStringimpl(mo69159calculateTopPaddingD9Ej5fM)) + ", " + ((Object) C3641Dp.m73669toStringimpl(mo69158calculateRightPaddingu2uoSUM)) + ", " + ((Object) C3641Dp.m73669toStringimpl(mo69156calculateBottomPaddingD9Ej5fM)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
