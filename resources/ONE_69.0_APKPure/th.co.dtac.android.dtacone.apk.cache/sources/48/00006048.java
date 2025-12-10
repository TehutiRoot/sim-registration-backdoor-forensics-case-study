package androidx.compose.p003ui.graphics.colorspace;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJV\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b%\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\r¨\u0006)"}, m29142d2 = {"Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "", "gamma", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, "<init>", "(DDDDDDD)V", "component1", "()D", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(DDDDDDD)Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getGamma", "getA", "getB", "getC", "getD", "getE", OperatorName.NON_STROKING_GRAY, "getF", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.colorspace.TransferParameters */
/* loaded from: classes2.dex */
public final class TransferParameters {

    /* renamed from: a */
    public final double f29385a;

    /* renamed from: b */
    public final double f29386b;

    /* renamed from: c */
    public final double f29387c;

    /* renamed from: d */
    public final double f29388d;

    /* renamed from: e */
    public final double f29389e;

    /* renamed from: f */
    public final double f29390f;

    /* renamed from: g */
    public final double f29391g;

    public TransferParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f29385a = d;
        this.f29386b = d2;
        this.f29387c = d3;
        this.f29388d = d4;
        this.f29389e = d5;
        this.f29390f = d6;
        this.f29391g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        } else if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        } else {
            if (d5 >= 1.0d && d4 == 0.0d) {
                throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
            }
            if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
                throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
            }
            if (d4 < 0.0d) {
                throw new IllegalArgumentException("The transfer function must be increasing");
            }
            if (d2 < 0.0d || d < 0.0d) {
                throw new IllegalArgumentException("The transfer function must be positive or increasing");
            }
        }
    }

    public final double component1() {
        return this.f29385a;
    }

    public final double component2() {
        return this.f29386b;
    }

    public final double component3() {
        return this.f29387c;
    }

    public final double component4() {
        return this.f29388d;
    }

    public final double component5() {
        return this.f29389e;
    }

    public final double component6() {
        return this.f29390f;
    }

    public final double component7() {
        return this.f29391g;
    }

    @NotNull
    public final TransferParameters copy(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        return new TransferParameters(d, d2, d3, d4, d5, d6, d7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransferParameters) {
            TransferParameters transferParameters = (TransferParameters) obj;
            return Double.compare(this.f29385a, transferParameters.f29385a) == 0 && Double.compare(this.f29386b, transferParameters.f29386b) == 0 && Double.compare(this.f29387c, transferParameters.f29387c) == 0 && Double.compare(this.f29388d, transferParameters.f29388d) == 0 && Double.compare(this.f29389e, transferParameters.f29389e) == 0 && Double.compare(this.f29390f, transferParameters.f29390f) == 0 && Double.compare(this.f29391g, transferParameters.f29391g) == 0;
        }
        return false;
    }

    public final double getA() {
        return this.f29386b;
    }

    public final double getB() {
        return this.f29387c;
    }

    public final double getC() {
        return this.f29388d;
    }

    public final double getD() {
        return this.f29389e;
    }

    public final double getE() {
        return this.f29390f;
    }

    public final double getF() {
        return this.f29391g;
    }

    public final double getGamma() {
        return this.f29385a;
    }

    public int hashCode() {
        return (((((((((((Double.doubleToLongBits(this.f29385a) * 31) + Double.doubleToLongBits(this.f29386b)) * 31) + Double.doubleToLongBits(this.f29387c)) * 31) + Double.doubleToLongBits(this.f29388d)) * 31) + Double.doubleToLongBits(this.f29389e)) * 31) + Double.doubleToLongBits(this.f29390f)) * 31) + Double.doubleToLongBits(this.f29391g);
    }

    @NotNull
    public String toString() {
        return "TransferParameters(gamma=" + this.f29385a + ", a=" + this.f29386b + ", b=" + this.f29387c + ", c=" + this.f29388d + ", d=" + this.f29389e + ", e=" + this.f29390f + ", f=" + this.f29391g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ TransferParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7);
    }
}