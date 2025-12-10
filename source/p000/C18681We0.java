package p000;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: We0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18681We0 implements PaddingValues {

    /* renamed from: a */
    public final WindowInsets f7252a;

    /* renamed from: b */
    public final Density f7253b;

    public C18681We0(WindowInsets insets, Density density) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f7252a = insets;
        this.f7253b = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo69156calculateBottomPaddingD9Ej5fM() {
        Density density = this.f7253b;
        return density.mo69435toDpu2uoSUM(this.f7252a.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo69157calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Density density = this.f7253b;
        return density.mo69435toDpu2uoSUM(this.f7252a.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo69158calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Density density = this.f7253b;
        return density.mo69435toDpu2uoSUM(this.f7252a.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo69159calculateTopPaddingD9Ej5fM() {
        Density density = this.f7253b;
        return density.mo69435toDpu2uoSUM(this.f7252a.getTop(density));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18681We0)) {
            return false;
        }
        C18681We0 c18681We0 = (C18681We0) obj;
        if (Intrinsics.areEqual(this.f7252a, c18681We0.f7252a) && Intrinsics.areEqual(this.f7253b, c18681We0.f7253b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f7252a.hashCode() * 31) + this.f7253b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f7252a + ", density=" + this.f7253b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
