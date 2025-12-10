package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11695c;

/* renamed from: jT */
/* loaded from: classes.dex */
public final class C11522jT implements WindowInsets {

    /* renamed from: a */
    public final WindowInsets f67321a;

    /* renamed from: b */
    public final WindowInsets f67322b;

    public C11522jT(WindowInsets included, WindowInsets excluded) {
        Intrinsics.checkNotNullParameter(included, "included");
        Intrinsics.checkNotNullParameter(excluded, "excluded");
        this.f67321a = included;
        this.f67322b = excluded;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11522jT)) {
            return false;
        }
        C11522jT c11522jT = (C11522jT) obj;
        if (Intrinsics.areEqual(c11522jT.f67321a, this.f67321a) && Intrinsics.areEqual(c11522jT.f67322b, this.f67322b)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return AbstractC11695c.coerceAtLeast(this.f67321a.getBottom(density) - this.f67322b.getBottom(density), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return AbstractC11695c.coerceAtLeast(this.f67321a.getLeft(density, layoutDirection) - this.f67322b.getLeft(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return AbstractC11695c.coerceAtLeast(this.f67321a.getRight(density, layoutDirection) - this.f67322b.getRight(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return AbstractC11695c.coerceAtLeast(this.f67321a.getTop(density) - this.f67322b.getTop(density), 0);
    }

    public int hashCode() {
        return (this.f67321a.hashCode() * 31) + this.f67322b.hashCode();
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f67321a + " - " + this.f67322b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}