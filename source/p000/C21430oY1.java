package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oY1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21430oY1 implements WindowInsets {

    /* renamed from: a */
    public final WindowInsets f72727a;

    /* renamed from: b */
    public final WindowInsets f72728b;

    public C21430oY1(WindowInsets first, WindowInsets second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f72727a = first;
        this.f72728b = second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21430oY1)) {
            return false;
        }
        C21430oY1 c21430oY1 = (C21430oY1) obj;
        if (Intrinsics.areEqual(c21430oY1.f72727a, this.f72727a) && Intrinsics.areEqual(c21430oY1.f72728b, this.f72728b)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Math.max(this.f72727a.getBottom(density), this.f72728b.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f72727a.getLeft(density, layoutDirection), this.f72728b.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f72727a.getRight(density, layoutDirection), this.f72728b.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Math.max(this.f72727a.getTop(density), this.f72728b.getTop(density));
    }

    public int hashCode() {
        return this.f72727a.hashCode() + (this.f72728b.hashCode() * 31);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f72727a + " ∪ " + this.f72728b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
