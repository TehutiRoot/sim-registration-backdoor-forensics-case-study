package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: I20 */
/* loaded from: classes.dex */
public final class I20 implements WindowInsets {

    /* renamed from: a */
    public final float f2551a;

    /* renamed from: b */
    public final float f2552b;

    /* renamed from: c */
    public final float f2553c;

    /* renamed from: d */
    public final float f2554d;

    public /* synthetic */ I20(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I20)) {
            return false;
        }
        I20 i20 = (I20) obj;
        if (C3623Dp.m73847equalsimpl0(this.f2551a, i20.f2551a) && C3623Dp.m73847equalsimpl0(this.f2552b, i20.f2552b) && C3623Dp.m73847equalsimpl0(this.f2553c, i20.f2553c) && C3623Dp.m73847equalsimpl0(this.f2554d, i20.f2554d)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo69616roundToPx0680j_4(this.f2554d);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo69616roundToPx0680j_4(this.f2551a);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo69616roundToPx0680j_4(this.f2553c);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo69616roundToPx0680j_4(this.f2552b);
    }

    public int hashCode() {
        return (((((C3623Dp.m73848hashCodeimpl(this.f2551a) * 31) + C3623Dp.m73848hashCodeimpl(this.f2552b)) * 31) + C3623Dp.m73848hashCodeimpl(this.f2553c)) * 31) + C3623Dp.m73848hashCodeimpl(this.f2554d);
    }

    public String toString() {
        return "Insets(left=" + ((Object) C3623Dp.m73853toStringimpl(this.f2551a)) + ", top=" + ((Object) C3623Dp.m73853toStringimpl(this.f2552b)) + ", right=" + ((Object) C3623Dp.m73853toStringimpl(this.f2553c)) + ", bottom=" + ((Object) C3623Dp.m73853toStringimpl(this.f2554d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public I20(float f, float f2, float f3, float f4) {
        this.f2551a = f;
        this.f2552b = f2;
        this.f2553c = f3;
        this.f2554d = f4;
    }
}