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
@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0003\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u0004\u0010\t\u0082\u0001\u0013\u001e\u001f !\"#$%&'()*+,-./0¨\u00061"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode;", "", "", "isCurve", "isQuad", "<init>", "(ZZ)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "ArcTo", HTTP.CONN_CLOSE, "CurveTo", "HorizontalTo", "LineTo", "MoveTo", "QuadTo", "ReflectiveCurveTo", "ReflectiveQuadTo", "RelativeArcTo", "RelativeCurveTo", "RelativeHorizontalTo", "RelativeLineTo", "RelativeMoveTo", "RelativeQuadTo", "RelativeReflectiveCurveTo", "RelativeReflectiveQuadTo", "RelativeVerticalTo", "VerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.vector.PathNode */
/* loaded from: classes2.dex */
public abstract class PathNode {

    /* renamed from: a */
    public final boolean f29425a;

    /* renamed from: b */
    public final boolean f29426b;

    @Immutable
    @Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0007\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b\b\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010\u000e¨\u00060"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartX", "arcStartY", "<init>", "(FFFZZFF)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getHorizontalEllipseRadius", "d", "getVerticalEllipseRadius", "e", "getTheta", OperatorName.FILL_NON_ZERO, "Z", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "getArcStartX", "i", "getArcStartY", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ArcTo */
    /* loaded from: classes2.dex */
    public static final class ArcTo extends PathNode {

        /* renamed from: c */
        public final float f29427c;

        /* renamed from: d */
        public final float f29428d;

        /* renamed from: e */
        public final float f29429e;

        /* renamed from: f */
        public final boolean f29430f;

        /* renamed from: g */
        public final boolean f29431g;

        /* renamed from: h */
        public final float f29432h;

        /* renamed from: i */
        public final float f29433i;

        public ArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.f29427c = f;
            this.f29428d = f2;
            this.f29429e = f3;
            this.f29430f = z;
            this.f29431g = z2;
            this.f29432h = f4;
            this.f29433i = f5;
        }

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = arcTo.f29427c;
            }
            if ((i & 2) != 0) {
                f2 = arcTo.f29428d;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = arcTo.f29429e;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = arcTo.f29430f;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = arcTo.f29431g;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = arcTo.f29432h;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = arcTo.f29433i;
            }
            return arcTo.copy(f, f6, f7, z3, z4, f8, f5);
        }

        public final float component1() {
            return this.f29427c;
        }

        public final float component2() {
            return this.f29428d;
        }

        public final float component3() {
            return this.f29429e;
        }

        public final boolean component4() {
            return this.f29430f;
        }

        public final boolean component5() {
            return this.f29431g;
        }

        public final float component6() {
            return this.f29432h;
        }

        public final float component7() {
            return this.f29433i;
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
                return Float.compare(this.f29427c, arcTo.f29427c) == 0 && Float.compare(this.f29428d, arcTo.f29428d) == 0 && Float.compare(this.f29429e, arcTo.f29429e) == 0 && this.f29430f == arcTo.f29430f && this.f29431g == arcTo.f29431g && Float.compare(this.f29432h, arcTo.f29432h) == 0 && Float.compare(this.f29433i, arcTo.f29433i) == 0;
            }
            return false;
        }

        public final float getArcStartX() {
            return this.f29432h;
        }

        public final float getArcStartY() {
            return this.f29433i;
        }

        public final float getHorizontalEllipseRadius() {
            return this.f29427c;
        }

        public final float getTheta() {
            return this.f29429e;
        }

        public final float getVerticalEllipseRadius() {
            return this.f29428d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f29427c) * 31) + Float.floatToIntBits(this.f29428d)) * 31) + Float.floatToIntBits(this.f29429e)) * 31;
            boolean z = this.f29430f;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (floatToIntBits + i2) * 31;
            boolean z2 = this.f29431g;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return ((((i3 + i) * 31) + Float.floatToIntBits(this.f29432h)) * 31) + Float.floatToIntBits(this.f29433i);
        }

        public final boolean isMoreThanHalf() {
            return this.f29430f;
        }

        public final boolean isPositiveArc() {
            return this.f29431g;
        }

        @NotNull
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f29427c + ", verticalEllipseRadius=" + this.f29428d + ", theta=" + this.f29429e + ", isMoreThanHalf=" + this.f29430f + ", isPositiveArc=" + this.f29431g + ", arcStartX=" + this.f29432h + ", arcStartY=" + this.f29433i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode;", "()V", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
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
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\f¨\u0006,"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "x3", "y3", "<init>", "(FFFFFF)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "copy", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX1", "d", "getY1", "e", "getX2", OperatorName.FILL_NON_ZERO, "getY2", OperatorName.NON_STROKING_GRAY, "getX3", OperatorName.CLOSE_PATH, "getY3", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$CurveTo */
    /* loaded from: classes2.dex */
    public static final class CurveTo extends PathNode {

        /* renamed from: c */
        public final float f29434c;

        /* renamed from: d */
        public final float f29435d;

        /* renamed from: e */
        public final float f29436e;

        /* renamed from: f */
        public final float f29437f;

        /* renamed from: g */
        public final float f29438g;

        /* renamed from: h */
        public final float f29439h;

        public CurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f29434c = f;
            this.f29435d = f2;
            this.f29436e = f3;
            this.f29437f = f4;
            this.f29438g = f5;
            this.f29439h = f6;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = curveTo.f29434c;
            }
            if ((i & 2) != 0) {
                f2 = curveTo.f29435d;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = curveTo.f29436e;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = curveTo.f29437f;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = curveTo.f29438g;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = curveTo.f29439h;
            }
            return curveTo.copy(f, f7, f8, f9, f10, f6);
        }

        public final float component1() {
            return this.f29434c;
        }

        public final float component2() {
            return this.f29435d;
        }

        public final float component3() {
            return this.f29436e;
        }

        public final float component4() {
            return this.f29437f;
        }

        public final float component5() {
            return this.f29438g;
        }

        public final float component6() {
            return this.f29439h;
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
                return Float.compare(this.f29434c, curveTo.f29434c) == 0 && Float.compare(this.f29435d, curveTo.f29435d) == 0 && Float.compare(this.f29436e, curveTo.f29436e) == 0 && Float.compare(this.f29437f, curveTo.f29437f) == 0 && Float.compare(this.f29438g, curveTo.f29438g) == 0 && Float.compare(this.f29439h, curveTo.f29439h) == 0;
            }
            return false;
        }

        public final float getX1() {
            return this.f29434c;
        }

        public final float getX2() {
            return this.f29436e;
        }

        public final float getX3() {
            return this.f29438g;
        }

        public final float getY1() {
            return this.f29435d;
        }

        public final float getY2() {
            return this.f29437f;
        }

        public final float getY3() {
            return this.f29439h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f29434c) * 31) + Float.floatToIntBits(this.f29435d)) * 31) + Float.floatToIntBits(this.f29436e)) * 31) + Float.floatToIntBits(this.f29437f)) * 31) + Float.floatToIntBits(this.f29438g)) * 31) + Float.floatToIntBits(this.f29439h);
        }

        @NotNull
        public String toString() {
            return "CurveTo(x1=" + this.f29434c + ", y1=" + this.f29435d + ", x2=" + this.f29436e + ", y2=" + this.f29437f + ", x3=" + this.f29438g + ", y3=" + this.f29439h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$HorizontalTo */
    /* loaded from: classes2.dex */
    public static final class HorizontalTo extends PathNode {

        /* renamed from: c */
        public final float f29440c;

        public HorizontalTo(float f) {
            super(false, false, 3, null);
            this.f29440c = f;
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontalTo.f29440c;
            }
            return horizontalTo.copy(f);
        }

        public final float component1() {
            return this.f29440c;
        }

        @NotNull
        public final HorizontalTo copy(float f) {
            return new HorizontalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f29440c, ((HorizontalTo) obj).f29440c) == 0;
        }

        public final float getX() {
            return this.f29440c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f29440c);
        }

        @NotNull
        public String toString() {
            return "HorizontalTo(x=" + this.f29440c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX", "d", "getY", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$LineTo */
    /* loaded from: classes2.dex */
    public static final class LineTo extends PathNode {

        /* renamed from: c */
        public final float f29441c;

        /* renamed from: d */
        public final float f29442d;

        public LineTo(float f, float f2) {
            super(false, false, 3, null);
            this.f29441c = f;
            this.f29442d = f2;
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = lineTo.f29441c;
            }
            if ((i & 2) != 0) {
                f2 = lineTo.f29442d;
            }
            return lineTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29441c;
        }

        public final float component2() {
            return this.f29442d;
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
                return Float.compare(this.f29441c, lineTo.f29441c) == 0 && Float.compare(this.f29442d, lineTo.f29442d) == 0;
            }
            return false;
        }

        public final float getX() {
            return this.f29441c;
        }

        public final float getY() {
            return this.f29442d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29441c) * 31) + Float.floatToIntBits(this.f29442d);
        }

        @NotNull
        public String toString() {
            return "LineTo(x=" + this.f29441c + ", y=" + this.f29442d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX", "d", "getY", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$MoveTo */
    /* loaded from: classes2.dex */
    public static final class MoveTo extends PathNode {

        /* renamed from: c */
        public final float f29443c;

        /* renamed from: d */
        public final float f29444d;

        public MoveTo(float f, float f2) {
            super(false, false, 3, null);
            this.f29443c = f;
            this.f29444d = f2;
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = moveTo.f29443c;
            }
            if ((i & 2) != 0) {
                f2 = moveTo.f29444d;
            }
            return moveTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29443c;
        }

        public final float component2() {
            return this.f29444d;
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
                return Float.compare(this.f29443c, moveTo.f29443c) == 0 && Float.compare(this.f29444d, moveTo.f29444d) == 0;
            }
            return false;
        }

        public final float getX() {
            return this.f29443c;
        }

        public final float getY() {
            return this.f29444d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29443c) * 31) + Float.floatToIntBits(this.f29444d);
        }

        @NotNull
        public String toString() {
            return "MoveTo(x=" + this.f29443c + ", y=" + this.f29444d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\n¨\u0006$"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX1", "d", "getY1", "e", "getX2", OperatorName.FILL_NON_ZERO, "getY2", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$QuadTo */
    /* loaded from: classes2.dex */
    public static final class QuadTo extends PathNode {

        /* renamed from: c */
        public final float f29445c;

        /* renamed from: d */
        public final float f29446d;

        /* renamed from: e */
        public final float f29447e;

        /* renamed from: f */
        public final float f29448f;

        public QuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.f29445c = f;
            this.f29446d = f2;
            this.f29447e = f3;
            this.f29448f = f4;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = quadTo.f29445c;
            }
            if ((i & 2) != 0) {
                f2 = quadTo.f29446d;
            }
            if ((i & 4) != 0) {
                f3 = quadTo.f29447e;
            }
            if ((i & 8) != 0) {
                f4 = quadTo.f29448f;
            }
            return quadTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f29445c;
        }

        public final float component2() {
            return this.f29446d;
        }

        public final float component3() {
            return this.f29447e;
        }

        public final float component4() {
            return this.f29448f;
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
                return Float.compare(this.f29445c, quadTo.f29445c) == 0 && Float.compare(this.f29446d, quadTo.f29446d) == 0 && Float.compare(this.f29447e, quadTo.f29447e) == 0 && Float.compare(this.f29448f, quadTo.f29448f) == 0;
            }
            return false;
        }

        public final float getX1() {
            return this.f29445c;
        }

        public final float getX2() {
            return this.f29447e;
        }

        public final float getY1() {
            return this.f29446d;
        }

        public final float getY2() {
            return this.f29448f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f29445c) * 31) + Float.floatToIntBits(this.f29446d)) * 31) + Float.floatToIntBits(this.f29447e)) * 31) + Float.floatToIntBits(this.f29448f);
        }

        @NotNull
        public String toString() {
            return "QuadTo(x1=" + this.f29445c + ", y1=" + this.f29446d + ", x2=" + this.f29447e + ", y2=" + this.f29448f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\n¨\u0006$"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX1", "d", "getY1", "e", "getX2", OperatorName.FILL_NON_ZERO, "getY2", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ReflectiveCurveTo */
    /* loaded from: classes2.dex */
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: c */
        public final float f29449c;

        /* renamed from: d */
        public final float f29450d;

        /* renamed from: e */
        public final float f29451e;

        /* renamed from: f */
        public final float f29452f;

        public ReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f29449c = f;
            this.f29450d = f2;
            this.f29451e = f3;
            this.f29452f = f4;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveCurveTo.f29449c;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveCurveTo.f29450d;
            }
            if ((i & 4) != 0) {
                f3 = reflectiveCurveTo.f29451e;
            }
            if ((i & 8) != 0) {
                f4 = reflectiveCurveTo.f29452f;
            }
            return reflectiveCurveTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f29449c;
        }

        public final float component2() {
            return this.f29450d;
        }

        public final float component3() {
            return this.f29451e;
        }

        public final float component4() {
            return this.f29452f;
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
                return Float.compare(this.f29449c, reflectiveCurveTo.f29449c) == 0 && Float.compare(this.f29450d, reflectiveCurveTo.f29450d) == 0 && Float.compare(this.f29451e, reflectiveCurveTo.f29451e) == 0 && Float.compare(this.f29452f, reflectiveCurveTo.f29452f) == 0;
            }
            return false;
        }

        public final float getX1() {
            return this.f29449c;
        }

        public final float getX2() {
            return this.f29451e;
        }

        public final float getY1() {
            return this.f29450d;
        }

        public final float getY2() {
            return this.f29452f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f29449c) * 31) + Float.floatToIntBits(this.f29450d)) * 31) + Float.floatToIntBits(this.f29451e)) * 31) + Float.floatToIntBits(this.f29452f);
        }

        @NotNull
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f29449c + ", y1=" + this.f29450d + ", x2=" + this.f29451e + ", y2=" + this.f29452f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getX", "d", "getY", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ReflectiveQuadTo */
    /* loaded from: classes2.dex */
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: c */
        public final float f29453c;

        /* renamed from: d */
        public final float f29454d;

        public ReflectiveQuadTo(float f, float f2) {
            super(false, true, 1, null);
            this.f29453c = f;
            this.f29454d = f2;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveQuadTo.f29453c;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveQuadTo.f29454d;
            }
            return reflectiveQuadTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29453c;
        }

        public final float component2() {
            return this.f29454d;
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
                return Float.compare(this.f29453c, reflectiveQuadTo.f29453c) == 0 && Float.compare(this.f29454d, reflectiveQuadTo.f29454d) == 0;
            }
            return false;
        }

        public final float getX() {
            return this.f29453c;
        }

        public final float getY() {
            return this.f29454d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29453c) * 31) + Float.floatToIntBits(this.f29454d);
        }

        @NotNull
        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f29453c + ", y=" + this.f29454d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0007\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b\b\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010\u000e¨\u00060"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartDx", "arcStartDy", "<init>", "(FFFZZFF)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getHorizontalEllipseRadius", "d", "getVerticalEllipseRadius", "e", "getTheta", OperatorName.FILL_NON_ZERO, "Z", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "getArcStartDx", "i", "getArcStartDy", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeArcTo */
    /* loaded from: classes2.dex */
    public static final class RelativeArcTo extends PathNode {

        /* renamed from: c */
        public final float f29455c;

        /* renamed from: d */
        public final float f29456d;

        /* renamed from: e */
        public final float f29457e;

        /* renamed from: f */
        public final boolean f29458f;

        /* renamed from: g */
        public final boolean f29459g;

        /* renamed from: h */
        public final float f29460h;

        /* renamed from: i */
        public final float f29461i;

        public RelativeArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.f29455c = f;
            this.f29456d = f2;
            this.f29457e = f3;
            this.f29458f = z;
            this.f29459g = z2;
            this.f29460h = f4;
            this.f29461i = f5;
        }

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeArcTo.f29455c;
            }
            if ((i & 2) != 0) {
                f2 = relativeArcTo.f29456d;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = relativeArcTo.f29457e;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = relativeArcTo.f29458f;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = relativeArcTo.f29459g;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = relativeArcTo.f29460h;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = relativeArcTo.f29461i;
            }
            return relativeArcTo.copy(f, f6, f7, z3, z4, f8, f5);
        }

        public final float component1() {
            return this.f29455c;
        }

        public final float component2() {
            return this.f29456d;
        }

        public final float component3() {
            return this.f29457e;
        }

        public final boolean component4() {
            return this.f29458f;
        }

        public final boolean component5() {
            return this.f29459g;
        }

        public final float component6() {
            return this.f29460h;
        }

        public final float component7() {
            return this.f29461i;
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
                return Float.compare(this.f29455c, relativeArcTo.f29455c) == 0 && Float.compare(this.f29456d, relativeArcTo.f29456d) == 0 && Float.compare(this.f29457e, relativeArcTo.f29457e) == 0 && this.f29458f == relativeArcTo.f29458f && this.f29459g == relativeArcTo.f29459g && Float.compare(this.f29460h, relativeArcTo.f29460h) == 0 && Float.compare(this.f29461i, relativeArcTo.f29461i) == 0;
            }
            return false;
        }

        public final float getArcStartDx() {
            return this.f29460h;
        }

        public final float getArcStartDy() {
            return this.f29461i;
        }

        public final float getHorizontalEllipseRadius() {
            return this.f29455c;
        }

        public final float getTheta() {
            return this.f29457e;
        }

        public final float getVerticalEllipseRadius() {
            return this.f29456d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f29455c) * 31) + Float.floatToIntBits(this.f29456d)) * 31) + Float.floatToIntBits(this.f29457e)) * 31;
            boolean z = this.f29458f;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (floatToIntBits + i2) * 31;
            boolean z2 = this.f29459g;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return ((((i3 + i) * 31) + Float.floatToIntBits(this.f29460h)) * 31) + Float.floatToIntBits(this.f29461i);
        }

        public final boolean isMoreThanHalf() {
            return this.f29458f;
        }

        public final boolean isPositiveArc() {
            return this.f29459g;
        }

        @NotNull
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f29455c + ", verticalEllipseRadius=" + this.f29456d + ", theta=" + this.f29457e + ", isMoreThanHalf=" + this.f29458f + ", isPositiveArc=" + this.f29459g + ", arcStartDx=" + this.f29460h + ", arcStartDy=" + this.f29461i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\f¨\u0006,"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "<init>", "(FFFFFF)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "copy", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx1", "d", "getDy1", "e", "getDx2", OperatorName.FILL_NON_ZERO, "getDy2", OperatorName.NON_STROKING_GRAY, "getDx3", OperatorName.CLOSE_PATH, "getDy3", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeCurveTo */
    /* loaded from: classes2.dex */
    public static final class RelativeCurveTo extends PathNode {

        /* renamed from: c */
        public final float f29462c;

        /* renamed from: d */
        public final float f29463d;

        /* renamed from: e */
        public final float f29464e;

        /* renamed from: f */
        public final float f29465f;

        /* renamed from: g */
        public final float f29466g;

        /* renamed from: h */
        public final float f29467h;

        public RelativeCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f29462c = f;
            this.f29463d = f2;
            this.f29464e = f3;
            this.f29465f = f4;
            this.f29466g = f5;
            this.f29467h = f6;
        }

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeCurveTo.f29462c;
            }
            if ((i & 2) != 0) {
                f2 = relativeCurveTo.f29463d;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = relativeCurveTo.f29464e;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = relativeCurveTo.f29465f;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = relativeCurveTo.f29466g;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = relativeCurveTo.f29467h;
            }
            return relativeCurveTo.copy(f, f7, f8, f9, f10, f6);
        }

        public final float component1() {
            return this.f29462c;
        }

        public final float component2() {
            return this.f29463d;
        }

        public final float component3() {
            return this.f29464e;
        }

        public final float component4() {
            return this.f29465f;
        }

        public final float component5() {
            return this.f29466g;
        }

        public final float component6() {
            return this.f29467h;
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
                return Float.compare(this.f29462c, relativeCurveTo.f29462c) == 0 && Float.compare(this.f29463d, relativeCurveTo.f29463d) == 0 && Float.compare(this.f29464e, relativeCurveTo.f29464e) == 0 && Float.compare(this.f29465f, relativeCurveTo.f29465f) == 0 && Float.compare(this.f29466g, relativeCurveTo.f29466g) == 0 && Float.compare(this.f29467h, relativeCurveTo.f29467h) == 0;
            }
            return false;
        }

        public final float getDx1() {
            return this.f29462c;
        }

        public final float getDx2() {
            return this.f29464e;
        }

        public final float getDx3() {
            return this.f29466g;
        }

        public final float getDy1() {
            return this.f29463d;
        }

        public final float getDy2() {
            return this.f29465f;
        }

        public final float getDy3() {
            return this.f29467h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f29462c) * 31) + Float.floatToIntBits(this.f29463d)) * 31) + Float.floatToIntBits(this.f29464e)) * 31) + Float.floatToIntBits(this.f29465f)) * 31) + Float.floatToIntBits(this.f29466g)) * 31) + Float.floatToIntBits(this.f29467h);
        }

        @NotNull
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f29462c + ", dy1=" + this.f29463d + ", dx2=" + this.f29464e + ", dy2=" + this.f29465f + ", dx3=" + this.f29466g + ", dy3=" + this.f29467h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeHorizontalTo */
    /* loaded from: classes2.dex */
    public static final class RelativeHorizontalTo extends PathNode {

        /* renamed from: c */
        public final float f29468c;

        public RelativeHorizontalTo(float f) {
            super(false, false, 3, null);
            this.f29468c = f;
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeHorizontalTo.f29468c;
            }
            return relativeHorizontalTo.copy(f);
        }

        public final float component1() {
            return this.f29468c;
        }

        @NotNull
        public final RelativeHorizontalTo copy(float f) {
            return new RelativeHorizontalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.f29468c, ((RelativeHorizontalTo) obj).f29468c) == 0;
        }

        public final float getDx() {
            return this.f29468c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f29468c);
        }

        @NotNull
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f29468c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx", "d", "getDy", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo */
    /* loaded from: classes2.dex */
    public static final class RelativeLineTo extends PathNode {

        /* renamed from: c */
        public final float f29469c;

        /* renamed from: d */
        public final float f29470d;

        public RelativeLineTo(float f, float f2) {
            super(false, false, 3, null);
            this.f29469c = f;
            this.f29470d = f2;
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeLineTo.f29469c;
            }
            if ((i & 2) != 0) {
                f2 = relativeLineTo.f29470d;
            }
            return relativeLineTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29469c;
        }

        public final float component2() {
            return this.f29470d;
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
                return Float.compare(this.f29469c, relativeLineTo.f29469c) == 0 && Float.compare(this.f29470d, relativeLineTo.f29470d) == 0;
            }
            return false;
        }

        public final float getDx() {
            return this.f29469c;
        }

        public final float getDy() {
            return this.f29470d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29469c) * 31) + Float.floatToIntBits(this.f29470d);
        }

        @NotNull
        public String toString() {
            return "RelativeLineTo(dx=" + this.f29469c + ", dy=" + this.f29470d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx", "d", "getDy", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeMoveTo */
    /* loaded from: classes2.dex */
    public static final class RelativeMoveTo extends PathNode {

        /* renamed from: c */
        public final float f29471c;

        /* renamed from: d */
        public final float f29472d;

        public RelativeMoveTo(float f, float f2) {
            super(false, false, 3, null);
            this.f29471c = f;
            this.f29472d = f2;
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeMoveTo.f29471c;
            }
            if ((i & 2) != 0) {
                f2 = relativeMoveTo.f29472d;
            }
            return relativeMoveTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29471c;
        }

        public final float component2() {
            return this.f29472d;
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
                return Float.compare(this.f29471c, relativeMoveTo.f29471c) == 0 && Float.compare(this.f29472d, relativeMoveTo.f29472d) == 0;
            }
            return false;
        }

        public final float getDx() {
            return this.f29471c;
        }

        public final float getDy() {
            return this.f29472d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29471c) * 31) + Float.floatToIntBits(this.f29472d);
        }

        @NotNull
        public String toString() {
            return "RelativeMoveTo(dx=" + this.f29471c + ", dy=" + this.f29472d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\n¨\u0006$"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx1", "d", "getDy1", "e", "getDx2", OperatorName.FILL_NON_ZERO, "getDy2", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeQuadTo */
    /* loaded from: classes2.dex */
    public static final class RelativeQuadTo extends PathNode {

        /* renamed from: c */
        public final float f29473c;

        /* renamed from: d */
        public final float f29474d;

        /* renamed from: e */
        public final float f29475e;

        /* renamed from: f */
        public final float f29476f;

        public RelativeQuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.f29473c = f;
            this.f29474d = f2;
            this.f29475e = f3;
            this.f29476f = f4;
        }

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeQuadTo.f29473c;
            }
            if ((i & 2) != 0) {
                f2 = relativeQuadTo.f29474d;
            }
            if ((i & 4) != 0) {
                f3 = relativeQuadTo.f29475e;
            }
            if ((i & 8) != 0) {
                f4 = relativeQuadTo.f29476f;
            }
            return relativeQuadTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f29473c;
        }

        public final float component2() {
            return this.f29474d;
        }

        public final float component3() {
            return this.f29475e;
        }

        public final float component4() {
            return this.f29476f;
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
                return Float.compare(this.f29473c, relativeQuadTo.f29473c) == 0 && Float.compare(this.f29474d, relativeQuadTo.f29474d) == 0 && Float.compare(this.f29475e, relativeQuadTo.f29475e) == 0 && Float.compare(this.f29476f, relativeQuadTo.f29476f) == 0;
            }
            return false;
        }

        public final float getDx1() {
            return this.f29473c;
        }

        public final float getDx2() {
            return this.f29475e;
        }

        public final float getDy1() {
            return this.f29474d;
        }

        public final float getDy2() {
            return this.f29476f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f29473c) * 31) + Float.floatToIntBits(this.f29474d)) * 31) + Float.floatToIntBits(this.f29475e)) * 31) + Float.floatToIntBits(this.f29476f);
        }

        @NotNull
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f29473c + ", dy1=" + this.f29474d + ", dx2=" + this.f29475e + ", dy2=" + this.f29476f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\n¨\u0006$"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx1", "d", "getDy1", "e", "getDx2", OperatorName.FILL_NON_ZERO, "getDy2", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveCurveTo */
    /* loaded from: classes2.dex */
    public static final class RelativeReflectiveCurveTo extends PathNode {

        /* renamed from: c */
        public final float f29477c;

        /* renamed from: d */
        public final float f29478d;

        /* renamed from: e */
        public final float f29479e;

        /* renamed from: f */
        public final float f29480f;

        public RelativeReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f29477c = f;
            this.f29478d = f2;
            this.f29479e = f3;
            this.f29480f = f4;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveCurveTo.f29477c;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveCurveTo.f29478d;
            }
            if ((i & 4) != 0) {
                f3 = relativeReflectiveCurveTo.f29479e;
            }
            if ((i & 8) != 0) {
                f4 = relativeReflectiveCurveTo.f29480f;
            }
            return relativeReflectiveCurveTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f29477c;
        }

        public final float component2() {
            return this.f29478d;
        }

        public final float component3() {
            return this.f29479e;
        }

        public final float component4() {
            return this.f29480f;
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
                return Float.compare(this.f29477c, relativeReflectiveCurveTo.f29477c) == 0 && Float.compare(this.f29478d, relativeReflectiveCurveTo.f29478d) == 0 && Float.compare(this.f29479e, relativeReflectiveCurveTo.f29479e) == 0 && Float.compare(this.f29480f, relativeReflectiveCurveTo.f29480f) == 0;
            }
            return false;
        }

        public final float getDx1() {
            return this.f29477c;
        }

        public final float getDx2() {
            return this.f29479e;
        }

        public final float getDy1() {
            return this.f29478d;
        }

        public final float getDy2() {
            return this.f29480f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f29477c) * 31) + Float.floatToIntBits(this.f29478d)) * 31) + Float.floatToIntBits(this.f29479e)) * 31) + Float.floatToIntBits(this.f29480f);
        }

        @NotNull
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f29477c + ", dy1=" + this.f29478d + ", dx2=" + this.f29479e + ", dy2=" + this.f29480f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDx", "d", "getDy", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveQuadTo */
    /* loaded from: classes2.dex */
    public static final class RelativeReflectiveQuadTo extends PathNode {

        /* renamed from: c */
        public final float f29481c;

        /* renamed from: d */
        public final float f29482d;

        public RelativeReflectiveQuadTo(float f, float f2) {
            super(false, true, 1, null);
            this.f29481c = f;
            this.f29482d = f2;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveQuadTo.f29481c;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveQuadTo.f29482d;
            }
            return relativeReflectiveQuadTo.copy(f, f2);
        }

        public final float component1() {
            return this.f29481c;
        }

        public final float component2() {
            return this.f29482d;
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
                return Float.compare(this.f29481c, relativeReflectiveQuadTo.f29481c) == 0 && Float.compare(this.f29482d, relativeReflectiveQuadTo.f29482d) == 0;
            }
            return false;
        }

        public final float getDx() {
            return this.f29481c;
        }

        public final float getDy() {
            return this.f29482d;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f29481c) * 31) + Float.floatToIntBits(this.f29482d);
        }

        @NotNull
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f29481c + ", dy=" + this.f29482d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dy", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getDy", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeVerticalTo */
    /* loaded from: classes2.dex */
    public static final class RelativeVerticalTo extends PathNode {

        /* renamed from: c */
        public final float f29483c;

        public RelativeVerticalTo(float f) {
            super(false, false, 3, null);
            this.f29483c = f;
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeVerticalTo.f29483c;
            }
            return relativeVerticalTo.copy(f);
        }

        public final float component1() {
            return this.f29483c;
        }

        @NotNull
        public final RelativeVerticalTo copy(float f) {
            return new RelativeVerticalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.f29483c, ((RelativeVerticalTo) obj).f29483c) == 0;
        }

        public final float getDy() {
            return this.f29483c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f29483c);
        }

        @NotNull
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f29483c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Immutable
    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CURVE_TO, "F", "getY", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$VerticalTo */
    /* loaded from: classes2.dex */
    public static final class VerticalTo extends PathNode {

        /* renamed from: c */
        public final float f29484c;

        public VerticalTo(float f) {
            super(false, false, 3, null);
            this.f29484c = f;
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = verticalTo.f29484c;
            }
            return verticalTo.copy(f);
        }

        public final float component1() {
            return this.f29484c;
        }

        @NotNull
        public final VerticalTo copy(float f) {
            return new VerticalTo(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f29484c, ((VerticalTo) obj).f29484c) == 0;
        }

        public final float getY() {
            return this.f29484c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f29484c);
        }

        @NotNull
        public String toString() {
            return "VerticalTo(y=" + this.f29484c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    public final boolean isCurve() {
        return this.f29425a;
    }

    public final boolean isQuad() {
        return this.f29426b;
    }

    public PathNode(boolean z, boolean z2) {
        this.f29425a = z;
        this.f29426b = z2;
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null);
    }
}
