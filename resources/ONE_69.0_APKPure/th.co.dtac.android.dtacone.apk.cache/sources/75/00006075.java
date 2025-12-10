package androidx.compose.p003ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m29143d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0003\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u0004\u0010\t\u0082\u0001\u0013\u001e\u001f !\"#$%&'()*+,-./0¨\u00061"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode;", "", "", "isCurve", "isQuad", "<init>", "(ZZ)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "ArcTo", HTTP.CONN_CLOSE, "CurveTo", "HorizontalTo", "LineTo", "MoveTo", "QuadTo", "ReflectiveCurveTo", "ReflectiveQuadTo", "RelativeArcTo", "RelativeCurveTo", "RelativeHorizontalTo", "RelativeLineTo", "RelativeMoveTo", "RelativeQuadTo", "RelativeReflectiveCurveTo", "RelativeReflectiveQuadTo", "RelativeVerticalTo", "VerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.vector.PathNode */
/* loaded from: classes2.dex */
public abstract class PathNode {

    /* renamed from: a */
    public final boolean f29513a;

    /* renamed from: b */
    public final boolean f29514b;

    @Immutable
    @Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0007\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b\b\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010\u000e¨\u00060"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartX", "arcStartY", "<init>", "(FFFZZFF)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getHorizontalEllipseRadius", "d", "getVerticalEllipseRadius", "e", "getTheta", OperatorName.FILL_NON_ZERO, "Z", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "getArcStartX", "i", "getArcStartY", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ArcTo */
    /* loaded from: classes2.dex */
    public static final class ArcTo extends PathNode {

        /* renamed from: c */
        public final float f29515c;

        /* renamed from: d */
        public final float f29516d;

        /* renamed from: e */
        public final float f29517e;

        /* renamed from: f */
        public final boolean f29518f;

        /* renamed from: g */
        public final boolean f29519g;

        /* renamed from: h */
        public final float f29520h;

        /* renamed from: i */
        public final float f29521i;

        public ArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.f29515c = f;
            this.f29516d = f2;
            this.f29517e = f3;
            this.f29518f = z;
            this.f29519g = z2;
            this.f29520h = f4;
            this.f29521i = f5;
        }

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = arcTo.f29515c;
            }
            if ((i & 2) != 0) {
                f2 = arcTo.f29516d;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = arcTo.f29517e;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = arcTo.f29518f;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = arcTo.f29519g;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = arcTo.f29520h;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = arcTo.f29521i;
            }
            return arcTo.copy(f, f6, f7, z3, z4, f8, f5);
        }

        public final float component1() {
            return this.f29515c;
        }

        public final float component2() {
            return this.f29516d;
        }

        public final float component3() {
            return this.f29517e;
        }

        public final boolean component4() {
            return this.f29518f;
        }

        public final boolean component5() {
            return this.f29519g;
        }

        public final float component6() {
            return this.f29520h;
        }

        public final float component7() {
            return this.f29521i;
        }

        @NotNull
        public final ArcTo copy(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new ArcTo(f, f2, f3, z, z2, f4, f5);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ArcTo) {
                ArcTo arcTo = (ArcTo) obj;
                return Float.compare(this.f29515c, arcTo.f29515c) == 0 && Float.compare(this.f29516d, arcTo.f29516d) == 0 && Float.compare(this.f29517e, arcTo.f29517e) == 0 && this.f29518f == arcTo.f29518f && this.f29519g == arcTo.f29519g && Float.compare(this.f29520h, arcTo.f29520h) == 0 && Float.compare(this.f29521i, arcTo.f29521i) == 0;
            }
            return false;
        }

        public final float getArcStartX() {
            return this.f29520h;
        }

        public final float getArcStartY() {
            return this.f29521i;
        }

        public final float getHorizontalEllipseRadius() {
            return this.f29515c;
        }

        public final float getTheta() {
            return this.f29517e;
        }

        public final float getVerticalEllipseRadius() {
            return this.f29516d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f29515c) * 31) + Float.floatToIntBits(this.f29516d)) * 31) + Float.floatToIntBits(this.f29517e)) * 31;
            boolean z = this.f29518f;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (floatToIntBits + i2) * 31;
            boolean z2 = this.f29519g;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return ((((i3 + i) * 31) + Float.floatToIntBits(this.f29520h)) * 31) + Float.floatToIntBits(this.f29521i);
        }

        public final boolean isMoreThanHalf() {
            return this.f29518f;
        }

        public final boolean isPositiveArc() {
            return this.f29519g;
        }

        @NotNull
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f29515c + ", verticalEllipseRadius=" + this.f29516d + ", theta=" + this.f29517e + ", isMoreThanHalf=" + this.f29518f + ", isPositiveArc=" + this.f29519g + ", arcStartX=" + this.f29520h + ", arcStartY=" + this.f29521i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode;", "()V", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$Close */
    /* loaded from: classes2.dex */
    public static final class Close extends PathNode {
        @NotNull
        public static final Close INSTANCE = new Close();

        public Close() {
            super(false, false, 3, null);
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\f¨\u0006,"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "x3", "y3", "<init>", "(FFFFFF)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "copy", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX1", "d", "getY1", "e", "getX2", OperatorName.FILL_NON_ZERO, "getY2", OperatorName.NON_STROKING_GRAY, "getX3", OperatorName.CLOSE_PATH, "getY3", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$CurveTo */
    /* loaded from: classes2.dex */
    public static final class CurveTo extends PathNode {

        /* renamed from: c */
        public final float f29522c;

        /* renamed from: d */
        public final float f29523d;

        /* renamed from: e */
        public final float f29524e;

        /* renamed from: f */
        public final float f29525f;

        /* renamed from: g */
        public final float f29526g;

        /* renamed from: h */
        public final float f29527h;

        public CurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f29522c = f;
            this.f29523d = f2;
            this.f29524e = f3;
            this.f29525f = f4;
            this.f29526g = f5;
            this.f29527h = f6;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = curveTo.f29522c;
            }
            if ((i & 2) != 0) {
                f2 = curveTo.f29523d;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = curveTo.f29524e;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = curveTo.f29525f;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = curveTo.f29526g;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = curveTo.f29527h;
            }
            return curveTo.copy(f, f7, f8, f9, f10, f6);
        }

        public final float component1() {
            return this.f29522c;
        }

        public final float component2() {
            return this.f29523d;
        }

        public final float component3() {
            return this.f29524e;
        }

        public final float component4() {
            return this.f29525f;
        }

        public final float component5() {
            return this.f29526g;
        }

        public final float component6() {
            return this.f29527h;
        }

        @NotNull
        public final CurveTo copy(float f, float f2, float f3, float f4, float f5, float f6) {
            return new CurveTo(f, f2, f3, f4, f5, f6);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CurveTo) {
                CurveTo curveTo = (CurveTo) obj;
                return Float.compare(this.f29522c, curveTo.f29522c) == 0 && Float.compare(this.f29523d, curveTo.f29523d) == 0 && Float.compare(this.f29524e, curveTo.f29524e) == 0 && Float.compare(this.f29525f, curveTo.f29525f) == 0 && Float.compare(this.f29526g, curveTo.f29526g) == 0 && Float.compare(this.f29527h, curveTo.f29527h) == 0;
            }
            return false;
        }

        public final float getX1() {
            return this.f29522c;
        }

        public final float getX2() {
            return this.f29524e;
        }

        public final float getX3() {
            return this.f29526g;
        }

        public final float getY1() {
            return this.f29523d;
        }

        public final float getY2() {
            return this.f29525f;
        }

        public final float getY3() {
            return this.f29527h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f29522c) * 31) + Float.floatToIntBits(this.f29523d)) * 31) + Float.floatToIntBits(this.f29524e)) * 31) + Float.floatToIntBits(this.f29525f)) * 31) + Float.floatToIntBits(this.f29526g)) * 31) + Float.floatToIntBits(this.f29527h);
        }

        @NotNull
        public String toString() {
            return "CurveTo(x1=" + this.f29522c + ", y1=" + this.f29523d + ", x2=" + this.f29524e + ", y2=" + this.f29525f + ", x3=" + this.f29526g + ", y3=" + this.f29527h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$HorizontalTo */
    /* loaded from: classes2.dex */
    public static final class HorizontalTo extends PathNode {

        /* renamed from: c */
        public final float f29528c;

        public HorizontalTo(float f) {
            super(false, false, 3, null);
            this.f29528c = f;
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontalTo.f29528c;
            }
            return horizontalTo.copy(f);
        }

        public final float component1() {
            return this.f29528c;
        }

        @NotNull
        public final HorizontalTo copy(float f) {
            return new HorizontalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f29528c, ((HorizontalTo) obj).f29528c) == 0;
        }

        public final float getX() {
            return this.f29528c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f29528c);
        }

        @NotNull
        public String toString() {
            return "HorizontalTo(x=" + this.f29528c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX", "d", "getY", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$LineTo */
    /* loaded from: classes2.dex */
    public static final class LineTo extends PathNode {

        /* renamed from: c */
        public final float f29529c;

        /* renamed from: d */
        public final float f29530d;

        public LineTo(float f, float f2) {
            super(false, false, 3, null);
            this.f29529c = f;
            this.f29530d = f2;
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = lineTo.f29529c;
            }
            if ((i & 2) != 0) {
                f2 = lineTo.f29530d;
            }
            return lineTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29529c;
        }

        public final float component2() {
            return this.f29530d;
        }

        @NotNull
        public final LineTo copy(float f, float f2) {
            return new LineTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LineTo) {
                LineTo lineTo = (LineTo) obj;
                return Float.compare(this.f29529c, lineTo.f29529c) == 0 && Float.compare(this.f29530d, lineTo.f29530d) == 0;
            }
            return false;
        }

        public final float getX() {
            return this.f29529c;
        }

        public final float getY() {
            return this.f29530d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29529c) * 31) + Float.floatToIntBits(this.f29530d);
        }

        @NotNull
        public String toString() {
            return "LineTo(x=" + this.f29529c + ", y=" + this.f29530d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX", "d", "getY", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$MoveTo */
    /* loaded from: classes2.dex */
    public static final class MoveTo extends PathNode {

        /* renamed from: c */
        public final float f29531c;

        /* renamed from: d */
        public final float f29532d;

        public MoveTo(float f, float f2) {
            super(false, false, 3, null);
            this.f29531c = f;
            this.f29532d = f2;
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = moveTo.f29531c;
            }
            if ((i & 2) != 0) {
                f2 = moveTo.f29532d;
            }
            return moveTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29531c;
        }

        public final float component2() {
            return this.f29532d;
        }

        @NotNull
        public final MoveTo copy(float f, float f2) {
            return new MoveTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MoveTo) {
                MoveTo moveTo = (MoveTo) obj;
                return Float.compare(this.f29531c, moveTo.f29531c) == 0 && Float.compare(this.f29532d, moveTo.f29532d) == 0;
            }
            return false;
        }

        public final float getX() {
            return this.f29531c;
        }

        public final float getY() {
            return this.f29532d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29531c) * 31) + Float.floatToIntBits(this.f29532d);
        }

        @NotNull
        public String toString() {
            return "MoveTo(x=" + this.f29531c + ", y=" + this.f29532d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\n¨\u0006$"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX1", "d", "getY1", "e", "getX2", OperatorName.FILL_NON_ZERO, "getY2", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$QuadTo */
    /* loaded from: classes2.dex */
    public static final class QuadTo extends PathNode {

        /* renamed from: c */
        public final float f29533c;

        /* renamed from: d */
        public final float f29534d;

        /* renamed from: e */
        public final float f29535e;

        /* renamed from: f */
        public final float f29536f;

        public QuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.f29533c = f;
            this.f29534d = f2;
            this.f29535e = f3;
            this.f29536f = f4;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = quadTo.f29533c;
            }
            if ((i & 2) != 0) {
                f2 = quadTo.f29534d;
            }
            if ((i & 4) != 0) {
                f3 = quadTo.f29535e;
            }
            if ((i & 8) != 0) {
                f4 = quadTo.f29536f;
            }
            return quadTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f29533c;
        }

        public final float component2() {
            return this.f29534d;
        }

        public final float component3() {
            return this.f29535e;
        }

        public final float component4() {
            return this.f29536f;
        }

        @NotNull
        public final QuadTo copy(float f, float f2, float f3, float f4) {
            return new QuadTo(f, f2, f3, f4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof QuadTo) {
                QuadTo quadTo = (QuadTo) obj;
                return Float.compare(this.f29533c, quadTo.f29533c) == 0 && Float.compare(this.f29534d, quadTo.f29534d) == 0 && Float.compare(this.f29535e, quadTo.f29535e) == 0 && Float.compare(this.f29536f, quadTo.f29536f) == 0;
            }
            return false;
        }

        public final float getX1() {
            return this.f29533c;
        }

        public final float getX2() {
            return this.f29535e;
        }

        public final float getY1() {
            return this.f29534d;
        }

        public final float getY2() {
            return this.f29536f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f29533c) * 31) + Float.floatToIntBits(this.f29534d)) * 31) + Float.floatToIntBits(this.f29535e)) * 31) + Float.floatToIntBits(this.f29536f);
        }

        @NotNull
        public String toString() {
            return "QuadTo(x1=" + this.f29533c + ", y1=" + this.f29534d + ", x2=" + this.f29535e + ", y2=" + this.f29536f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\n¨\u0006$"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX1", "d", "getY1", "e", "getX2", OperatorName.FILL_NON_ZERO, "getY2", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ReflectiveCurveTo */
    /* loaded from: classes2.dex */
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: c */
        public final float f29537c;

        /* renamed from: d */
        public final float f29538d;

        /* renamed from: e */
        public final float f29539e;

        /* renamed from: f */
        public final float f29540f;

        public ReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f29537c = f;
            this.f29538d = f2;
            this.f29539e = f3;
            this.f29540f = f4;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveCurveTo.f29537c;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveCurveTo.f29538d;
            }
            if ((i & 4) != 0) {
                f3 = reflectiveCurveTo.f29539e;
            }
            if ((i & 8) != 0) {
                f4 = reflectiveCurveTo.f29540f;
            }
            return reflectiveCurveTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f29537c;
        }

        public final float component2() {
            return this.f29538d;
        }

        public final float component3() {
            return this.f29539e;
        }

        public final float component4() {
            return this.f29540f;
        }

        @NotNull
        public final ReflectiveCurveTo copy(float f, float f2, float f3, float f4) {
            return new ReflectiveCurveTo(f, f2, f3, f4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ReflectiveCurveTo) {
                ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
                return Float.compare(this.f29537c, reflectiveCurveTo.f29537c) == 0 && Float.compare(this.f29538d, reflectiveCurveTo.f29538d) == 0 && Float.compare(this.f29539e, reflectiveCurveTo.f29539e) == 0 && Float.compare(this.f29540f, reflectiveCurveTo.f29540f) == 0;
            }
            return false;
        }

        public final float getX1() {
            return this.f29537c;
        }

        public final float getX2() {
            return this.f29539e;
        }

        public final float getY1() {
            return this.f29538d;
        }

        public final float getY2() {
            return this.f29540f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f29537c) * 31) + Float.floatToIntBits(this.f29538d)) * 31) + Float.floatToIntBits(this.f29539e)) * 31) + Float.floatToIntBits(this.f29540f);
        }

        @NotNull
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f29537c + ", y1=" + this.f29538d + ", x2=" + this.f29539e + ", y2=" + this.f29540f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX", "d", "getY", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ReflectiveQuadTo */
    /* loaded from: classes2.dex */
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: c */
        public final float f29541c;

        /* renamed from: d */
        public final float f29542d;

        public ReflectiveQuadTo(float f, float f2) {
            super(false, true, 1, null);
            this.f29541c = f;
            this.f29542d = f2;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveQuadTo.f29541c;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveQuadTo.f29542d;
            }
            return reflectiveQuadTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29541c;
        }

        public final float component2() {
            return this.f29542d;
        }

        @NotNull
        public final ReflectiveQuadTo copy(float f, float f2) {
            return new ReflectiveQuadTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ReflectiveQuadTo) {
                ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
                return Float.compare(this.f29541c, reflectiveQuadTo.f29541c) == 0 && Float.compare(this.f29542d, reflectiveQuadTo.f29542d) == 0;
            }
            return false;
        }

        public final float getX() {
            return this.f29541c;
        }

        public final float getY() {
            return this.f29542d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29541c) * 31) + Float.floatToIntBits(this.f29542d);
        }

        @NotNull
        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f29541c + ", y=" + this.f29542d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0007\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b\b\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010\u000e¨\u00060"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartDx", "arcStartDy", "<init>", "(FFFZZFF)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getHorizontalEllipseRadius", "d", "getVerticalEllipseRadius", "e", "getTheta", OperatorName.FILL_NON_ZERO, "Z", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "getArcStartDx", "i", "getArcStartDy", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeArcTo */
    /* loaded from: classes2.dex */
    public static final class RelativeArcTo extends PathNode {

        /* renamed from: c */
        public final float f29543c;

        /* renamed from: d */
        public final float f29544d;

        /* renamed from: e */
        public final float f29545e;

        /* renamed from: f */
        public final boolean f29546f;

        /* renamed from: g */
        public final boolean f29547g;

        /* renamed from: h */
        public final float f29548h;

        /* renamed from: i */
        public final float f29549i;

        public RelativeArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.f29543c = f;
            this.f29544d = f2;
            this.f29545e = f3;
            this.f29546f = z;
            this.f29547g = z2;
            this.f29548h = f4;
            this.f29549i = f5;
        }

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeArcTo.f29543c;
            }
            if ((i & 2) != 0) {
                f2 = relativeArcTo.f29544d;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = relativeArcTo.f29545e;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = relativeArcTo.f29546f;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = relativeArcTo.f29547g;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = relativeArcTo.f29548h;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = relativeArcTo.f29549i;
            }
            return relativeArcTo.copy(f, f6, f7, z3, z4, f8, f5);
        }

        public final float component1() {
            return this.f29543c;
        }

        public final float component2() {
            return this.f29544d;
        }

        public final float component3() {
            return this.f29545e;
        }

        public final boolean component4() {
            return this.f29546f;
        }

        public final boolean component5() {
            return this.f29547g;
        }

        public final float component6() {
            return this.f29548h;
        }

        public final float component7() {
            return this.f29549i;
        }

        @NotNull
        public final RelativeArcTo copy(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new RelativeArcTo(f, f2, f3, z, z2, f4, f5);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RelativeArcTo) {
                RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
                return Float.compare(this.f29543c, relativeArcTo.f29543c) == 0 && Float.compare(this.f29544d, relativeArcTo.f29544d) == 0 && Float.compare(this.f29545e, relativeArcTo.f29545e) == 0 && this.f29546f == relativeArcTo.f29546f && this.f29547g == relativeArcTo.f29547g && Float.compare(this.f29548h, relativeArcTo.f29548h) == 0 && Float.compare(this.f29549i, relativeArcTo.f29549i) == 0;
            }
            return false;
        }

        public final float getArcStartDx() {
            return this.f29548h;
        }

        public final float getArcStartDy() {
            return this.f29549i;
        }

        public final float getHorizontalEllipseRadius() {
            return this.f29543c;
        }

        public final float getTheta() {
            return this.f29545e;
        }

        public final float getVerticalEllipseRadius() {
            return this.f29544d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f29543c) * 31) + Float.floatToIntBits(this.f29544d)) * 31) + Float.floatToIntBits(this.f29545e)) * 31;
            boolean z = this.f29546f;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (floatToIntBits + i2) * 31;
            boolean z2 = this.f29547g;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return ((((i3 + i) * 31) + Float.floatToIntBits(this.f29548h)) * 31) + Float.floatToIntBits(this.f29549i);
        }

        public final boolean isMoreThanHalf() {
            return this.f29546f;
        }

        public final boolean isPositiveArc() {
            return this.f29547g;
        }

        @NotNull
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f29543c + ", verticalEllipseRadius=" + this.f29544d + ", theta=" + this.f29545e + ", isMoreThanHalf=" + this.f29546f + ", isPositiveArc=" + this.f29547g + ", arcStartDx=" + this.f29548h + ", arcStartDy=" + this.f29549i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\f¨\u0006,"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "<init>", "(FFFFFF)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "copy", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx1", "d", "getDy1", "e", "getDx2", OperatorName.FILL_NON_ZERO, "getDy2", OperatorName.NON_STROKING_GRAY, "getDx3", OperatorName.CLOSE_PATH, "getDy3", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeCurveTo */
    /* loaded from: classes2.dex */
    public static final class RelativeCurveTo extends PathNode {

        /* renamed from: c */
        public final float f29550c;

        /* renamed from: d */
        public final float f29551d;

        /* renamed from: e */
        public final float f29552e;

        /* renamed from: f */
        public final float f29553f;

        /* renamed from: g */
        public final float f29554g;

        /* renamed from: h */
        public final float f29555h;

        public RelativeCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f29550c = f;
            this.f29551d = f2;
            this.f29552e = f3;
            this.f29553f = f4;
            this.f29554g = f5;
            this.f29555h = f6;
        }

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeCurveTo.f29550c;
            }
            if ((i & 2) != 0) {
                f2 = relativeCurveTo.f29551d;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = relativeCurveTo.f29552e;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = relativeCurveTo.f29553f;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = relativeCurveTo.f29554g;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = relativeCurveTo.f29555h;
            }
            return relativeCurveTo.copy(f, f7, f8, f9, f10, f6);
        }

        public final float component1() {
            return this.f29550c;
        }

        public final float component2() {
            return this.f29551d;
        }

        public final float component3() {
            return this.f29552e;
        }

        public final float component4() {
            return this.f29553f;
        }

        public final float component5() {
            return this.f29554g;
        }

        public final float component6() {
            return this.f29555h;
        }

        @NotNull
        public final RelativeCurveTo copy(float f, float f2, float f3, float f4, float f5, float f6) {
            return new RelativeCurveTo(f, f2, f3, f4, f5, f6);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RelativeCurveTo) {
                RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
                return Float.compare(this.f29550c, relativeCurveTo.f29550c) == 0 && Float.compare(this.f29551d, relativeCurveTo.f29551d) == 0 && Float.compare(this.f29552e, relativeCurveTo.f29552e) == 0 && Float.compare(this.f29553f, relativeCurveTo.f29553f) == 0 && Float.compare(this.f29554g, relativeCurveTo.f29554g) == 0 && Float.compare(this.f29555h, relativeCurveTo.f29555h) == 0;
            }
            return false;
        }

        public final float getDx1() {
            return this.f29550c;
        }

        public final float getDx2() {
            return this.f29552e;
        }

        public final float getDx3() {
            return this.f29554g;
        }

        public final float getDy1() {
            return this.f29551d;
        }

        public final float getDy2() {
            return this.f29553f;
        }

        public final float getDy3() {
            return this.f29555h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f29550c) * 31) + Float.floatToIntBits(this.f29551d)) * 31) + Float.floatToIntBits(this.f29552e)) * 31) + Float.floatToIntBits(this.f29553f)) * 31) + Float.floatToIntBits(this.f29554g)) * 31) + Float.floatToIntBits(this.f29555h);
        }

        @NotNull
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f29550c + ", dy1=" + this.f29551d + ", dx2=" + this.f29552e + ", dy2=" + this.f29553f + ", dx3=" + this.f29554g + ", dy3=" + this.f29555h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeHorizontalTo */
    /* loaded from: classes2.dex */
    public static final class RelativeHorizontalTo extends PathNode {

        /* renamed from: c */
        public final float f29556c;

        public RelativeHorizontalTo(float f) {
            super(false, false, 3, null);
            this.f29556c = f;
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeHorizontalTo.f29556c;
            }
            return relativeHorizontalTo.copy(f);
        }

        public final float component1() {
            return this.f29556c;
        }

        @NotNull
        public final RelativeHorizontalTo copy(float f) {
            return new RelativeHorizontalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.f29556c, ((RelativeHorizontalTo) obj).f29556c) == 0;
        }

        public final float getDx() {
            return this.f29556c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f29556c);
        }

        @NotNull
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f29556c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx", "d", "getDy", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo */
    /* loaded from: classes2.dex */
    public static final class RelativeLineTo extends PathNode {

        /* renamed from: c */
        public final float f29557c;

        /* renamed from: d */
        public final float f29558d;

        public RelativeLineTo(float f, float f2) {
            super(false, false, 3, null);
            this.f29557c = f;
            this.f29558d = f2;
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeLineTo.f29557c;
            }
            if ((i & 2) != 0) {
                f2 = relativeLineTo.f29558d;
            }
            return relativeLineTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29557c;
        }

        public final float component2() {
            return this.f29558d;
        }

        @NotNull
        public final RelativeLineTo copy(float f, float f2) {
            return new RelativeLineTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RelativeLineTo) {
                RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
                return Float.compare(this.f29557c, relativeLineTo.f29557c) == 0 && Float.compare(this.f29558d, relativeLineTo.f29558d) == 0;
            }
            return false;
        }

        public final float getDx() {
            return this.f29557c;
        }

        public final float getDy() {
            return this.f29558d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29557c) * 31) + Float.floatToIntBits(this.f29558d);
        }

        @NotNull
        public String toString() {
            return "RelativeLineTo(dx=" + this.f29557c + ", dy=" + this.f29558d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx", "d", "getDy", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeMoveTo */
    /* loaded from: classes2.dex */
    public static final class RelativeMoveTo extends PathNode {

        /* renamed from: c */
        public final float f29559c;

        /* renamed from: d */
        public final float f29560d;

        public RelativeMoveTo(float f, float f2) {
            super(false, false, 3, null);
            this.f29559c = f;
            this.f29560d = f2;
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeMoveTo.f29559c;
            }
            if ((i & 2) != 0) {
                f2 = relativeMoveTo.f29560d;
            }
            return relativeMoveTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29559c;
        }

        public final float component2() {
            return this.f29560d;
        }

        @NotNull
        public final RelativeMoveTo copy(float f, float f2) {
            return new RelativeMoveTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RelativeMoveTo) {
                RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
                return Float.compare(this.f29559c, relativeMoveTo.f29559c) == 0 && Float.compare(this.f29560d, relativeMoveTo.f29560d) == 0;
            }
            return false;
        }

        public final float getDx() {
            return this.f29559c;
        }

        public final float getDy() {
            return this.f29560d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29559c) * 31) + Float.floatToIntBits(this.f29560d);
        }

        @NotNull
        public String toString() {
            return "RelativeMoveTo(dx=" + this.f29559c + ", dy=" + this.f29560d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\n¨\u0006$"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx1", "d", "getDy1", "e", "getDx2", OperatorName.FILL_NON_ZERO, "getDy2", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeQuadTo */
    /* loaded from: classes2.dex */
    public static final class RelativeQuadTo extends PathNode {

        /* renamed from: c */
        public final float f29561c;

        /* renamed from: d */
        public final float f29562d;

        /* renamed from: e */
        public final float f29563e;

        /* renamed from: f */
        public final float f29564f;

        public RelativeQuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.f29561c = f;
            this.f29562d = f2;
            this.f29563e = f3;
            this.f29564f = f4;
        }

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeQuadTo.f29561c;
            }
            if ((i & 2) != 0) {
                f2 = relativeQuadTo.f29562d;
            }
            if ((i & 4) != 0) {
                f3 = relativeQuadTo.f29563e;
            }
            if ((i & 8) != 0) {
                f4 = relativeQuadTo.f29564f;
            }
            return relativeQuadTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f29561c;
        }

        public final float component2() {
            return this.f29562d;
        }

        public final float component3() {
            return this.f29563e;
        }

        public final float component4() {
            return this.f29564f;
        }

        @NotNull
        public final RelativeQuadTo copy(float f, float f2, float f3, float f4) {
            return new RelativeQuadTo(f, f2, f3, f4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RelativeQuadTo) {
                RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
                return Float.compare(this.f29561c, relativeQuadTo.f29561c) == 0 && Float.compare(this.f29562d, relativeQuadTo.f29562d) == 0 && Float.compare(this.f29563e, relativeQuadTo.f29563e) == 0 && Float.compare(this.f29564f, relativeQuadTo.f29564f) == 0;
            }
            return false;
        }

        public final float getDx1() {
            return this.f29561c;
        }

        public final float getDx2() {
            return this.f29563e;
        }

        public final float getDy1() {
            return this.f29562d;
        }

        public final float getDy2() {
            return this.f29564f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f29561c) * 31) + Float.floatToIntBits(this.f29562d)) * 31) + Float.floatToIntBits(this.f29563e)) * 31) + Float.floatToIntBits(this.f29564f);
        }

        @NotNull
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f29561c + ", dy1=" + this.f29562d + ", dx2=" + this.f29563e + ", dy2=" + this.f29564f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\n¨\u0006$"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx1", "d", "getDy1", "e", "getDx2", OperatorName.FILL_NON_ZERO, "getDy2", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveCurveTo */
    /* loaded from: classes2.dex */
    public static final class RelativeReflectiveCurveTo extends PathNode {

        /* renamed from: c */
        public final float f29565c;

        /* renamed from: d */
        public final float f29566d;

        /* renamed from: e */
        public final float f29567e;

        /* renamed from: f */
        public final float f29568f;

        public RelativeReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f29565c = f;
            this.f29566d = f2;
            this.f29567e = f3;
            this.f29568f = f4;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveCurveTo.f29565c;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveCurveTo.f29566d;
            }
            if ((i & 4) != 0) {
                f3 = relativeReflectiveCurveTo.f29567e;
            }
            if ((i & 8) != 0) {
                f4 = relativeReflectiveCurveTo.f29568f;
            }
            return relativeReflectiveCurveTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f29565c;
        }

        public final float component2() {
            return this.f29566d;
        }

        public final float component3() {
            return this.f29567e;
        }

        public final float component4() {
            return this.f29568f;
        }

        @NotNull
        public final RelativeReflectiveCurveTo copy(float f, float f2, float f3, float f4) {
            return new RelativeReflectiveCurveTo(f, f2, f3, f4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RelativeReflectiveCurveTo) {
                RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
                return Float.compare(this.f29565c, relativeReflectiveCurveTo.f29565c) == 0 && Float.compare(this.f29566d, relativeReflectiveCurveTo.f29566d) == 0 && Float.compare(this.f29567e, relativeReflectiveCurveTo.f29567e) == 0 && Float.compare(this.f29568f, relativeReflectiveCurveTo.f29568f) == 0;
            }
            return false;
        }

        public final float getDx1() {
            return this.f29565c;
        }

        public final float getDx2() {
            return this.f29567e;
        }

        public final float getDy1() {
            return this.f29566d;
        }

        public final float getDy2() {
            return this.f29568f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f29565c) * 31) + Float.floatToIntBits(this.f29566d)) * 31) + Float.floatToIntBits(this.f29567e)) * 31) + Float.floatToIntBits(this.f29568f);
        }

        @NotNull
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f29565c + ", dy1=" + this.f29566d + ", dx2=" + this.f29567e + ", dy2=" + this.f29568f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx", "d", "getDy", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveQuadTo */
    /* loaded from: classes2.dex */
    public static final class RelativeReflectiveQuadTo extends PathNode {

        /* renamed from: c */
        public final float f29569c;

        /* renamed from: d */
        public final float f29570d;

        public RelativeReflectiveQuadTo(float f, float f2) {
            super(false, true, 1, null);
            this.f29569c = f;
            this.f29570d = f2;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveQuadTo.f29569c;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveQuadTo.f29570d;
            }
            return relativeReflectiveQuadTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29569c;
        }

        public final float component2() {
            return this.f29570d;
        }

        @NotNull
        public final RelativeReflectiveQuadTo copy(float f, float f2) {
            return new RelativeReflectiveQuadTo(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RelativeReflectiveQuadTo) {
                RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
                return Float.compare(this.f29569c, relativeReflectiveQuadTo.f29569c) == 0 && Float.compare(this.f29570d, relativeReflectiveQuadTo.f29570d) == 0;
            }
            return false;
        }

        public final float getDx() {
            return this.f29569c;
        }

        public final float getDy() {
            return this.f29570d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29569c) * 31) + Float.floatToIntBits(this.f29570d);
        }

        @NotNull
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f29569c + ", dy=" + this.f29570d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dy", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDy", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeVerticalTo */
    /* loaded from: classes2.dex */
    public static final class RelativeVerticalTo extends PathNode {

        /* renamed from: c */
        public final float f29571c;

        public RelativeVerticalTo(float f) {
            super(false, false, 3, null);
            this.f29571c = f;
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeVerticalTo.f29571c;
            }
            return relativeVerticalTo.copy(f);
        }

        public final float component1() {
            return this.f29571c;
        }

        @NotNull
        public final RelativeVerticalTo copy(float f) {
            return new RelativeVerticalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.f29571c, ((RelativeVerticalTo) obj).f29571c) == 0;
        }

        public final float getDy() {
            return this.f29571c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f29571c);
        }

        @NotNull
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f29571c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getY", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$VerticalTo */
    /* loaded from: classes2.dex */
    public static final class VerticalTo extends PathNode {

        /* renamed from: c */
        public final float f29572c;

        public VerticalTo(float f) {
            super(false, false, 3, null);
            this.f29572c = f;
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = verticalTo.f29572c;
            }
            return verticalTo.copy(f);
        }

        public final float component1() {
            return this.f29572c;
        }

        @NotNull
        public final VerticalTo copy(float f) {
            return new VerticalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f29572c, ((VerticalTo) obj).f29572c) == 0;
        }

        public final float getY() {
            return this.f29572c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f29572c);
        }

        @NotNull
        public String toString() {
            return "VerticalTo(y=" + this.f29572c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    public final boolean isCurve() {
        return this.f29513a;
    }

    public final boolean isQuad() {
        return this.f29514b;
    }

    public PathNode(boolean z, boolean z2) {
        this.f29513a = z;
        this.f29514b = z2;
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null);
    }
}