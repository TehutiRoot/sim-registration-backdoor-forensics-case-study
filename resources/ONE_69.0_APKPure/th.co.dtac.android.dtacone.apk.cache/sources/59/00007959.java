package p000;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19433cf0 implements PaddingValues {

    /* renamed from: a */
    public final WindowInsets f39476a;

    /* renamed from: b */
    public final Density f39477b;

    public C19433cf0(WindowInsets insets, Density density) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f39476a = insets;
        this.f39477b = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo69342calculateBottomPaddingD9Ej5fM() {
        Density density = this.f39477b;
        return density.mo69619toDpu2uoSUM(this.f39476a.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo69343calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Density density = this.f39477b;
        return density.mo69619toDpu2uoSUM(this.f39476a.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo69344calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Density density = this.f39477b;
        return density.mo69619toDpu2uoSUM(this.f39476a.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo69345calculateTopPaddingD9Ej5fM() {
        Density density = this.f39477b;
        return density.mo69619toDpu2uoSUM(this.f39476a.getTop(density));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19433cf0)) {
            return false;
        }
        C19433cf0 c19433cf0 = (C19433cf0) obj;
        if (Intrinsics.areEqual(this.f39476a, c19433cf0.f39476a) && Intrinsics.areEqual(this.f39477b, c19433cf0.f39477b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f39476a.hashCode() * 31) + this.f39477b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f39476a + ", density=" + this.f39477b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}