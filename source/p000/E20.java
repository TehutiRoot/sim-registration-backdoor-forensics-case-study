package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E20 */
/* loaded from: classes.dex */
public final class E20 implements WindowInsets {

    /* renamed from: a */
    public final float f1189a;

    /* renamed from: b */
    public final float f1190b;

    /* renamed from: c */
    public final float f1191c;

    /* renamed from: d */
    public final float f1192d;

    public /* synthetic */ E20(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E20)) {
            return false;
        }
        E20 e20 = (E20) obj;
        if (C3641Dp.m73663equalsimpl0(this.f1189a, e20.f1189a) && C3641Dp.m73663equalsimpl0(this.f1190b, e20.f1190b) && C3641Dp.m73663equalsimpl0(this.f1191c, e20.f1191c) && C3641Dp.m73663equalsimpl0(this.f1192d, e20.f1192d)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo69432roundToPx0680j_4(this.f1192d);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo69432roundToPx0680j_4(this.f1189a);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo69432roundToPx0680j_4(this.f1191c);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo69432roundToPx0680j_4(this.f1190b);
    }

    public int hashCode() {
        return (((((C3641Dp.m73664hashCodeimpl(this.f1189a) * 31) + C3641Dp.m73664hashCodeimpl(this.f1190b)) * 31) + C3641Dp.m73664hashCodeimpl(this.f1191c)) * 31) + C3641Dp.m73664hashCodeimpl(this.f1192d);
    }

    public String toString() {
        return "Insets(left=" + ((Object) C3641Dp.m73669toStringimpl(this.f1189a)) + ", top=" + ((Object) C3641Dp.m73669toStringimpl(this.f1190b)) + ", right=" + ((Object) C3641Dp.m73669toStringimpl(this.f1191c)) + ", bottom=" + ((Object) C3641Dp.m73669toStringimpl(this.f1192d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public E20(float f, float f2, float f3, float f4) {
        this.f1189a = f;
        this.f1190b = f2;
        this.f1191c = f3;
        this.f1192d = f4;
    }
}
