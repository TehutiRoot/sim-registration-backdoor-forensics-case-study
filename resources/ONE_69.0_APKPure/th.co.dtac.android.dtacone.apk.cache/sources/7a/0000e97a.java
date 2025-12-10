package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lZ1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20974lZ1 implements WindowInsets {

    /* renamed from: a */
    public final WindowInsets f71752a;

    /* renamed from: b */
    public final WindowInsets f71753b;

    public C20974lZ1(WindowInsets first, WindowInsets second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f71752a = first;
        this.f71753b = second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20974lZ1)) {
            return false;
        }
        C20974lZ1 c20974lZ1 = (C20974lZ1) obj;
        if (Intrinsics.areEqual(c20974lZ1.f71752a, this.f71752a) && Intrinsics.areEqual(c20974lZ1.f71753b, this.f71753b)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Math.max(this.f71752a.getBottom(density), this.f71753b.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f71752a.getLeft(density, layoutDirection), this.f71753b.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f71752a.getRight(density, layoutDirection), this.f71753b.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Math.max(this.f71752a.getTop(density), this.f71753b.getTop(density));
    }

    public int hashCode() {
        return this.f71752a.hashCode() + (this.f71753b.hashCode() * 31);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f71752a + " ∪ " + this.f71753b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}