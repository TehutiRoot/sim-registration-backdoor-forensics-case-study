package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;

/* renamed from: fT */
/* loaded from: classes.dex */
public final class C10227fT implements WindowInsets {

    /* renamed from: a */
    public final WindowInsets f61819a;

    /* renamed from: b */
    public final WindowInsets f61820b;

    public C10227fT(WindowInsets included, WindowInsets excluded) {
        Intrinsics.checkNotNullParameter(included, "included");
        Intrinsics.checkNotNullParameter(excluded, "excluded");
        this.f61819a = included;
        this.f61820b = excluded;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10227fT)) {
            return false;
        }
        C10227fT c10227fT = (C10227fT) obj;
        if (Intrinsics.areEqual(c10227fT.f61819a, this.f61819a) && Intrinsics.areEqual(c10227fT.f61820b, this.f61820b)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return AbstractC11719c.coerceAtLeast(this.f61819a.getBottom(density) - this.f61820b.getBottom(density), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return AbstractC11719c.coerceAtLeast(this.f61819a.getLeft(density, layoutDirection) - this.f61820b.getLeft(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return AbstractC11719c.coerceAtLeast(this.f61819a.getRight(density, layoutDirection) - this.f61820b.getRight(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return AbstractC11719c.coerceAtLeast(this.f61819a.getTop(density) - this.f61820b.getTop(density), 0);
    }

    public int hashCode() {
        return (this.f61819a.hashCode() * 31) + this.f61820b.hashCode();
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f61819a + " - " + this.f61820b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
