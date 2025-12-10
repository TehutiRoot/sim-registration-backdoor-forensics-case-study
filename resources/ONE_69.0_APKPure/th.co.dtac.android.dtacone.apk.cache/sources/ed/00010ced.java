package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s2 */
/* loaded from: classes.dex */
public final class C13887s2 implements WindowInsets {

    /* renamed from: a */
    public final WindowInsets f79758a;

    /* renamed from: b */
    public final WindowInsets f79759b;

    public C13887s2(WindowInsets first, WindowInsets second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f79758a = first;
        this.f79759b = second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13887s2)) {
            return false;
        }
        C13887s2 c13887s2 = (C13887s2) obj;
        if (Intrinsics.areEqual(c13887s2.f79758a, this.f79758a) && Intrinsics.areEqual(c13887s2.f79759b, this.f79759b)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f79758a.getBottom(density) + this.f79759b.getBottom(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f79758a.getLeft(density, layoutDirection) + this.f79759b.getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f79758a.getRight(density, layoutDirection) + this.f79759b.getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f79758a.getTop(density) + this.f79759b.getTop(density);
    }

    public int hashCode() {
        return this.f79758a.hashCode() + (this.f79759b.hashCode() * 31);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f79758a + " + " + this.f79759b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}