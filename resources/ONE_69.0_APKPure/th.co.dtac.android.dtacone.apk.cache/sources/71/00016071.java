package p000;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22903wi1 implements WindowInsets {

    /* renamed from: a */
    public final PaddingValues f108536a;

    public C22903wi1(PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f108536a = paddingValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22903wi1)) {
            return false;
        }
        return Intrinsics.areEqual(((C22903wi1) obj).f108536a, this.f108536a);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo69616roundToPx0680j_4(this.f108536a.mo69342calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo69616roundToPx0680j_4(this.f108536a.mo69343calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo69616roundToPx0680j_4(this.f108536a.mo69344calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo69616roundToPx0680j_4(this.f108536a.mo69345calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.f108536a.hashCode();
    }

    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        float mo69343calculateLeftPaddingu2uoSUM = this.f108536a.mo69343calculateLeftPaddingu2uoSUM(layoutDirection);
        float mo69345calculateTopPaddingD9Ej5fM = this.f108536a.mo69345calculateTopPaddingD9Ej5fM();
        float mo69344calculateRightPaddingu2uoSUM = this.f108536a.mo69344calculateRightPaddingu2uoSUM(layoutDirection);
        float mo69342calculateBottomPaddingD9Ej5fM = this.f108536a.mo69342calculateBottomPaddingD9Ej5fM();
        return "PaddingValues(" + ((Object) C3623Dp.m73853toStringimpl(mo69343calculateLeftPaddingu2uoSUM)) + ", " + ((Object) C3623Dp.m73853toStringimpl(mo69345calculateTopPaddingD9Ej5fM)) + ", " + ((Object) C3623Dp.m73853toStringimpl(mo69344calculateRightPaddingu2uoSUM)) + ", " + ((Object) C3623Dp.m73853toStringimpl(mo69342calculateBottomPaddingD9Ej5fM)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}