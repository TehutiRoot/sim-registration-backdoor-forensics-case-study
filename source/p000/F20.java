package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: F20 */
/* loaded from: classes.dex */
public final class F20 implements WindowInsets {

    /* renamed from: a */
    public final int f1489a;

    /* renamed from: b */
    public final int f1490b;

    /* renamed from: c */
    public final int f1491c;

    /* renamed from: d */
    public final int f1492d;

    public F20(int i, int i2, int i3, int i4) {
        this.f1489a = i;
        this.f1490b = i2;
        this.f1491c = i3;
        this.f1492d = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F20)) {
            return false;
        }
        F20 f20 = (F20) obj;
        if (this.f1489a == f20.f1489a && this.f1490b == f20.f1490b && this.f1491c == f20.f1491c && this.f1492d == f20.f1492d) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f1492d;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f1489a;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f1491c;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f1490b;
    }

    public int hashCode() {
        return (((((this.f1489a * 31) + this.f1490b) * 31) + this.f1491c) * 31) + this.f1492d;
    }

    public String toString() {
        return "Insets(left=" + this.f1489a + ", top=" + this.f1490b + ", right=" + this.f1491c + ", bottom=" + this.f1492d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
