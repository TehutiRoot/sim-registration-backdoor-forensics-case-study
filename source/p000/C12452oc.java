package p000;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.FabPlacement;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.OutlineKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathOperation;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.CoreConstants;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oc */
/* loaded from: classes.dex */
public final class C12452oc implements Shape {

    /* renamed from: a */
    public final Shape f72739a;

    /* renamed from: b */
    public final FabPlacement f72740b;

    public C12452oc(Shape cutoutShape, FabPlacement fabPlacement) {
        Intrinsics.checkNotNullParameter(cutoutShape, "cutoutShape");
        Intrinsics.checkNotNullParameter(fabPlacement, "fabPlacement");
        this.f72739a = cutoutShape;
        this.f72740b = fabPlacement;
    }

    /* renamed from: a */
    public final void m25903a(Path path, LayoutDirection layoutDirection, Density density) {
        float f;
        float f2;
        f = AppBarKt.f14354e;
        float mo69438toPx0680j_4 = density.mo69438toPx0680j_4(f);
        float f3 = 2 * mo69438toPx0680j_4;
        long Size = SizeKt.Size(this.f72740b.getWidth() + f3, this.f72740b.getHeight() + f3);
        float left = this.f72740b.getLeft() - mo69438toPx0680j_4;
        float m71571getWidthimpl = left + Size.m71571getWidthimpl(Size);
        float m71568getHeightimpl = Size.m71568getHeightimpl(Size) / 2.0f;
        OutlineKt.addOutline(path, this.f72739a.mo69357createOutlinePq9zytI(Size, layoutDirection, density));
        path.mo71639translatek4lQ0M(OffsetKt.Offset(left, -m71568getHeightimpl));
        if (Intrinsics.areEqual(this.f72739a, RoundedCornerShapeKt.getCircleShape())) {
            f2 = AppBarKt.f14355f;
            m25902b(path, left, m71571getWidthimpl, m71568getHeightimpl, density.mo69438toPx0680j_4(f2), 0.0f);
        }
    }

    /* renamed from: b */
    public final void m25902b(Path path, float f, float f2, float f3, float f4, float f5) {
        float f6 = -((float) Math.sqrt((f3 * f3) - (f5 * f5)));
        float f7 = f3 + f6;
        float f8 = f + f7;
        float f9 = f2 - f7;
        Pair<Float, Float> calculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f6 - 1.0f, f5, f3);
        float floatValue = calculateRoundedEdgeIntercept.component1().floatValue() + f3;
        float floatValue2 = calculateRoundedEdgeIntercept.component2().floatValue() - f5;
        float f10 = f8 - f4;
        path.moveTo(f10, 0.0f);
        path.quadraticBezierTo(f8 - 1.0f, 0.0f, f + floatValue, floatValue2);
        path.lineTo(f2 - floatValue, floatValue2);
        path.quadraticBezierTo(f9 + 1.0f, 0.0f, f4 + f9, 0.0f);
        path.close();
    }

    @Override // androidx.compose.p003ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo69357createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect(new Rect(0.0f, 0.0f, Size.m71571getWidthimpl(j), Size.m71568getHeightimpl(j)));
        Path Path2 = AndroidPath_androidKt.Path();
        m25903a(Path2, layoutDirection, density);
        Path2.mo71636opN5in7k0(Path, Path2, PathOperation.Companion.m71984getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12452oc)) {
            return false;
        }
        C12452oc c12452oc = (C12452oc) obj;
        if (Intrinsics.areEqual(this.f72739a, c12452oc.f72739a) && Intrinsics.areEqual(this.f72740b, c12452oc.f72740b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f72739a.hashCode() * 31) + this.f72740b.hashCode();
    }

    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.f72739a + ", fabPlacement=" + this.f72740b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
