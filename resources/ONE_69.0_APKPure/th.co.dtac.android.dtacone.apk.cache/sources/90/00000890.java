package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: J20 */
/* loaded from: classes.dex */
public final class J20 implements WindowInsets {

    /* renamed from: a */
    public final int f2884a;

    /* renamed from: b */
    public final int f2885b;

    /* renamed from: c */
    public final int f2886c;

    /* renamed from: d */
    public final int f2887d;

    public J20(int i, int i2, int i3, int i4) {
        this.f2884a = i;
        this.f2885b = i2;
        this.f2886c = i3;
        this.f2887d = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J20)) {
            return false;
        }
        J20 j20 = (J20) obj;
        if (this.f2884a == j20.f2884a && this.f2885b == j20.f2885b && this.f2886c == j20.f2886c && this.f2887d == j20.f2887d) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f2887d;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f2884a;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f2886c;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f2885b;
    }

    public int hashCode() {
        return (((((this.f2884a * 31) + this.f2885b) * 31) + this.f2886c) * 31) + this.f2887d;
    }

    public String toString() {
        return "Insets(left=" + this.f2884a + ", top=" + this.f2885b + ", right=" + this.f2886c + ", bottom=" + this.f2887d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}