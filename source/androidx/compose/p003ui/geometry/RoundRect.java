package androidx.compose.p003ui.geometry;

import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001MBR\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0019\u0010&\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010%J\u0019\u0010*\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010%J\u0019\u0010,\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010%Jf\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b8\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010 R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010%R \u0010\t\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u0010%R \u0010\n\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010%R \u0010\u000b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010%R\u0018\u0010H\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0011\u0010J\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010 R\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, m28850d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "", "left", "top", "right", "bottom", "Landroidx/compose/ui/geometry/CornerRadius;", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "<init>", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Landroidx/compose/ui/geometry/RoundRect;", "min", "radius1", "radius2", "limit", PDPageLabelRange.STYLE_LETTERS_LOWER, "(FFFF)F", "Landroidx/compose/ui/geometry/Offset;", "point", "", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()F", "component2", "component3", "component4", "component5-kKHJgLs", "()J", "component5", "component6-kKHJgLs", "component6", "component7-kKHJgLs", "component7", "component8-kKHJgLs", "component8", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "copy", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getLeft", "getTop", OperatorName.CURVE_TO, "getRight", "d", "getBottom", "e", OperatorName.SET_LINE_CAPSTYLE, "getTopLeftCornerRadius-kKHJgLs", OperatorName.FILL_NON_ZERO, "getTopRightCornerRadius-kKHJgLs", OperatorName.NON_STROKING_GRAY, "getBottomRightCornerRadius-kKHJgLs", OperatorName.CLOSE_PATH, "getBottomLeftCornerRadius-kKHJgLs", "i", "Landroidx/compose/ui/geometry/RoundRect;", "_scaledRadiiRect", "getWidth", "width", "getHeight", "height", "Companion", "ui-geometry_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.geometry.RoundRect */
/* loaded from: classes2.dex */
public final class RoundRect {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: j */
    public static final RoundRect f28956j = RoundRectKt.m71556RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m71487getZerokKHJgLs());

    /* renamed from: a */
    public final float f28957a;

    /* renamed from: b */
    public final float f28958b;

    /* renamed from: c */
    public final float f28959c;

    /* renamed from: d */
    public final float f28960d;

    /* renamed from: e */
    public final long f28961e;

    /* renamed from: f */
    public final long f28962f;

    /* renamed from: g */
    public final long f28963g;

    /* renamed from: h */
    public final long f28964h;

    /* renamed from: i */
    public RoundRect f28965i;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.geometry.RoundRect$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.f28956j;
        }

        public Companion() {
        }
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    @NotNull
    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    /* renamed from: a */
    public final float m59766a(float f, float f2, float f3, float f4) {
        float f5 = f2 + f3;
        if (f5 > f4 && f5 != 0.0f) {
            return Math.min(f, f4 / f5);
        }
        return f;
    }

    /* renamed from: b */
    public final RoundRect m59765b() {
        RoundRect roundRect = this.f28965i;
        if (roundRect == null) {
            float m59766a = m59766a(m59766a(m59766a(m59766a(1.0f, CornerRadius.m71478getYimpl(this.f28964h), CornerRadius.m71478getYimpl(this.f28961e), getHeight()), CornerRadius.m71477getXimpl(this.f28961e), CornerRadius.m71477getXimpl(this.f28962f), getWidth()), CornerRadius.m71478getYimpl(this.f28962f), CornerRadius.m71478getYimpl(this.f28963g), getHeight()), CornerRadius.m71477getXimpl(this.f28963g), CornerRadius.m71477getXimpl(this.f28964h), getWidth());
            RoundRect roundRect2 = new RoundRect(this.f28957a * m59766a, this.f28958b * m59766a, this.f28959c * m59766a, this.f28960d * m59766a, CornerRadiusKt.CornerRadius(CornerRadius.m71477getXimpl(this.f28961e) * m59766a, CornerRadius.m71478getYimpl(this.f28961e) * m59766a), CornerRadiusKt.CornerRadius(CornerRadius.m71477getXimpl(this.f28962f) * m59766a, CornerRadius.m71478getYimpl(this.f28962f) * m59766a), CornerRadiusKt.CornerRadius(CornerRadius.m71477getXimpl(this.f28963g) * m59766a, CornerRadius.m71478getYimpl(this.f28963g) * m59766a), CornerRadiusKt.CornerRadius(CornerRadius.m71477getXimpl(this.f28964h) * m59766a, CornerRadius.m71478getYimpl(this.f28964h) * m59766a), null);
            this.f28965i = roundRect2;
            return roundRect2;
        }
        return roundRect;
    }

    public final float component1() {
        return this.f28957a;
    }

    public final float component2() {
        return this.f28958b;
    }

    public final float component3() {
        return this.f28959c;
    }

    public final float component4() {
        return this.f28960d;
    }

    /* renamed from: component5-kKHJgLs  reason: not valid java name */
    public final long m71544component5kKHJgLs() {
        return this.f28961e;
    }

    /* renamed from: component6-kKHJgLs  reason: not valid java name */
    public final long m71545component6kKHJgLs() {
        return this.f28962f;
    }

    /* renamed from: component7-kKHJgLs  reason: not valid java name */
    public final long m71546component7kKHJgLs() {
        return this.f28963g;
    }

    /* renamed from: component8-kKHJgLs  reason: not valid java name */
    public final long m71547component8kKHJgLs() {
        return this.f28964h;
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m71548containsk4lQ0M(long j) {
        float m71502getXimpl;
        float m71503getYimpl;
        float m71477getXimpl;
        float m71478getYimpl;
        if (Offset.m71502getXimpl(j) < this.f28957a || Offset.m71502getXimpl(j) >= this.f28959c || Offset.m71503getYimpl(j) < this.f28958b || Offset.m71503getYimpl(j) >= this.f28960d) {
            return false;
        }
        RoundRect m59765b = m59765b();
        if (Offset.m71502getXimpl(j) < this.f28957a + CornerRadius.m71477getXimpl(m59765b.f28961e) && Offset.m71503getYimpl(j) < this.f28958b + CornerRadius.m71478getYimpl(m59765b.f28961e)) {
            m71502getXimpl = (Offset.m71502getXimpl(j) - this.f28957a) - CornerRadius.m71477getXimpl(m59765b.f28961e);
            m71503getYimpl = (Offset.m71503getYimpl(j) - this.f28958b) - CornerRadius.m71478getYimpl(m59765b.f28961e);
            m71477getXimpl = CornerRadius.m71477getXimpl(m59765b.f28961e);
            m71478getYimpl = CornerRadius.m71478getYimpl(m59765b.f28961e);
        } else if (Offset.m71502getXimpl(j) > this.f28959c - CornerRadius.m71477getXimpl(m59765b.f28962f) && Offset.m71503getYimpl(j) < this.f28958b + CornerRadius.m71478getYimpl(m59765b.f28962f)) {
            m71502getXimpl = (Offset.m71502getXimpl(j) - this.f28959c) + CornerRadius.m71477getXimpl(m59765b.f28962f);
            m71503getYimpl = (Offset.m71503getYimpl(j) - this.f28958b) - CornerRadius.m71478getYimpl(m59765b.f28962f);
            m71477getXimpl = CornerRadius.m71477getXimpl(m59765b.f28962f);
            m71478getYimpl = CornerRadius.m71478getYimpl(m59765b.f28962f);
        } else if (Offset.m71502getXimpl(j) > this.f28959c - CornerRadius.m71477getXimpl(m59765b.f28963g) && Offset.m71503getYimpl(j) > this.f28960d - CornerRadius.m71478getYimpl(m59765b.f28963g)) {
            m71502getXimpl = (Offset.m71502getXimpl(j) - this.f28959c) + CornerRadius.m71477getXimpl(m59765b.f28963g);
            m71503getYimpl = (Offset.m71503getYimpl(j) - this.f28960d) + CornerRadius.m71478getYimpl(m59765b.f28963g);
            m71477getXimpl = CornerRadius.m71477getXimpl(m59765b.f28963g);
            m71478getYimpl = CornerRadius.m71478getYimpl(m59765b.f28963g);
        } else if (Offset.m71502getXimpl(j) >= this.f28957a + CornerRadius.m71477getXimpl(m59765b.f28964h) || Offset.m71503getYimpl(j) <= this.f28960d - CornerRadius.m71478getYimpl(m59765b.f28964h)) {
            return true;
        } else {
            m71502getXimpl = (Offset.m71502getXimpl(j) - this.f28957a) - CornerRadius.m71477getXimpl(m59765b.f28964h);
            m71503getYimpl = (Offset.m71503getYimpl(j) - this.f28960d) + CornerRadius.m71478getYimpl(m59765b.f28964h);
            m71477getXimpl = CornerRadius.m71477getXimpl(m59765b.f28964h);
            m71478getYimpl = CornerRadius.m71478getYimpl(m59765b.f28964h);
        }
        float f = m71502getXimpl / m71477getXimpl;
        float f2 = m71503getYimpl / m71478getYimpl;
        if ((f * f) + (f2 * f2) > 1.0f) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: copy-MDFrsts  reason: not valid java name */
    public final RoundRect m71549copyMDFrsts(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        return new RoundRect(f, f2, f3, f4, j, j2, j3, j4, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundRect) {
            RoundRect roundRect = (RoundRect) obj;
            return Float.compare(this.f28957a, roundRect.f28957a) == 0 && Float.compare(this.f28958b, roundRect.f28958b) == 0 && Float.compare(this.f28959c, roundRect.f28959c) == 0 && Float.compare(this.f28960d, roundRect.f28960d) == 0 && CornerRadius.m71476equalsimpl0(this.f28961e, roundRect.f28961e) && CornerRadius.m71476equalsimpl0(this.f28962f, roundRect.f28962f) && CornerRadius.m71476equalsimpl0(this.f28963g, roundRect.f28963g) && CornerRadius.m71476equalsimpl0(this.f28964h, roundRect.f28964h);
        }
        return false;
    }

    public final float getBottom() {
        return this.f28960d;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m71550getBottomLeftCornerRadiuskKHJgLs() {
        return this.f28964h;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m71551getBottomRightCornerRadiuskKHJgLs() {
        return this.f28963g;
    }

    public final float getHeight() {
        return this.f28960d - this.f28958b;
    }

    public final float getLeft() {
        return this.f28957a;
    }

    public final float getRight() {
        return this.f28959c;
    }

    public final float getTop() {
        return this.f28958b;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m71552getTopLeftCornerRadiuskKHJgLs() {
        return this.f28961e;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m71553getTopRightCornerRadiuskKHJgLs() {
        return this.f28962f;
    }

    public final float getWidth() {
        return this.f28959c - this.f28957a;
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.f28957a) * 31) + Float.floatToIntBits(this.f28958b)) * 31) + Float.floatToIntBits(this.f28959c)) * 31) + Float.floatToIntBits(this.f28960d)) * 31) + CornerRadius.m71479hashCodeimpl(this.f28961e)) * 31) + CornerRadius.m71479hashCodeimpl(this.f28962f)) * 31) + CornerRadius.m71479hashCodeimpl(this.f28963g)) * 31) + CornerRadius.m71479hashCodeimpl(this.f28964h);
    }

    @NotNull
    public String toString() {
        long j = this.f28961e;
        long j2 = this.f28962f;
        long j3 = this.f28963g;
        long j4 = this.f28964h;
        String str = GeometryUtilsKt.toStringAsFixed(this.f28957a, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28958b, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28959c, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28960d, 1);
        if (CornerRadius.m71476equalsimpl0(j, j2) && CornerRadius.m71476equalsimpl0(j2, j3) && CornerRadius.m71476equalsimpl0(j3, j4)) {
            if (CornerRadius.m71477getXimpl(j) == CornerRadius.m71478getYimpl(j)) {
                return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m71477getXimpl(j), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
            return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m71477getXimpl(j), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m71478getYimpl(j), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m71483toStringimpl(j)) + ", topRight=" + ((Object) CornerRadius.m71483toStringimpl(j2)) + ", bottomRight=" + ((Object) CornerRadius.m71483toStringimpl(j3)) + ", bottomLeft=" + ((Object) CornerRadius.m71483toStringimpl(j4)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f28957a = f;
        this.f28958b = f2;
        this.f28959c = f3;
        this.f28960d = f4;
        this.f28961e = j;
        this.f28962f = j2;
        this.f28963g = j3;
        this.f28964h = j4;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, (i & 16) != 0 ? CornerRadius.Companion.m71487getZerokKHJgLs() : j, (i & 32) != 0 ? CornerRadius.Companion.m71487getZerokKHJgLs() : j2, (i & 64) != 0 ? CornerRadius.Companion.m71487getZerokKHJgLs() : j3, (i & 128) != 0 ? CornerRadius.Companion.m71487getZerokKHJgLs() : j4, null);
    }
}
