package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s2 */
/* loaded from: classes.dex */
public final class C13886s2 implements WindowInsets {

    /* renamed from: a */
    public final WindowInsets f79543a;

    /* renamed from: b */
    public final WindowInsets f79544b;

    public C13886s2(WindowInsets first, WindowInsets second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f79543a = first;
        this.f79544b = second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13886s2)) {
            return false;
        }
        C13886s2 c13886s2 = (C13886s2) obj;
        if (Intrinsics.areEqual(c13886s2.f79543a, this.f79543a) && Intrinsics.areEqual(c13886s2.f79544b, this.f79544b)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f79543a.getBottom(density) + this.f79544b.getBottom(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f79543a.getLeft(density, layoutDirection) + this.f79544b.getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f79543a.getRight(density, layoutDirection) + this.f79544b.getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f79543a.getTop(density) + this.f79544b.getTop(density);
    }

    public int hashCode() {
        return this.f79543a.hashCode() + (this.f79544b.hashCode() * 31);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f79543a + " + " + this.f79544b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
