package androidx.compose.animation.core;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u000b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\f\u0010\tJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u000f\u0010\tJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0011\u0010 \u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006#"}, m28850d2 = {"Landroidx/compose/animation/core/ComplexDouble;", "", "", "_real", "_imaginary", "<init>", "(DD)V", "other", "plus", "(D)Landroidx/compose/animation/core/ComplexDouble;", "(Landroidx/compose/animation/core/ComplexDouble;)Landroidx/compose/animation/core/ComplexDouble;", "minus", "times", "unaryMinus", "()Landroidx/compose/animation/core/ComplexDouble;", "div", "copy", "(DD)Landroidx/compose/animation/core/ComplexDouble;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "D", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getReal", "()D", "real", "getImaginary", "imaginary", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n35#1,2:113\n66#1,3:115\n40#1,3:118\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n46#1:113,2\n50#1:115,3\n50#1:118,3\n*E\n"})
/* loaded from: classes.dex */
public final class ComplexDouble {

    /* renamed from: a */
    public double f12460a;

    /* renamed from: b */
    public double f12461b;

    public ComplexDouble(double d, double d2) {
        this.f12460a = d;
        this.f12461b = d2;
    }

    public static /* synthetic */ ComplexDouble copy$default(ComplexDouble complexDouble, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = complexDouble.f12460a;
        }
        if ((i & 2) != 0) {
            d2 = complexDouble.f12461b;
        }
        return complexDouble.copy(d, d2);
    }

    @NotNull
    public final ComplexDouble copy(double d, double d2) {
        return new ComplexDouble(d, d2);
    }

    @NotNull
    public final ComplexDouble div(double d) {
        this.f12460a /= d;
        this.f12461b /= d;
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplexDouble) {
            ComplexDouble complexDouble = (ComplexDouble) obj;
            return Double.compare(this.f12460a, complexDouble.f12460a) == 0 && Double.compare(this.f12461b, complexDouble.f12461b) == 0;
        }
        return false;
    }

    public final double getImaginary() {
        return this.f12461b;
    }

    public final double getReal() {
        return this.f12460a;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.f12460a) * 31) + Double.doubleToLongBits(this.f12461b);
    }

    @NotNull
    public final ComplexDouble minus(double d) {
        this.f12460a += -d;
        return this;
    }

    @NotNull
    public final ComplexDouble plus(double d) {
        this.f12460a += d;
        return this;
    }

    @NotNull
    public final ComplexDouble times(double d) {
        this.f12460a *= d;
        this.f12461b *= d;
        return this;
    }

    @NotNull
    public String toString() {
        return "ComplexDouble(_real=" + this.f12460a + ", _imaginary=" + this.f12461b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @NotNull
    public final ComplexDouble unaryMinus() {
        double d = -1;
        this.f12460a *= d;
        this.f12461b *= d;
        return this;
    }

    @NotNull
    public final ComplexDouble minus(@NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d = -1;
        other.f12460a *= d;
        other.f12461b *= d;
        this.f12460a += other.getReal();
        this.f12461b += other.getImaginary();
        return this;
    }

    @NotNull
    public final ComplexDouble plus(@NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f12460a += other.getReal();
        this.f12461b += other.getImaginary();
        return this;
    }

    @NotNull
    public final ComplexDouble times(@NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f12460a = (getReal() * other.getReal()) - (getImaginary() * other.getImaginary());
        this.f12461b = (getReal() * other.getImaginary()) + (other.getReal() * getImaginary());
        return this;
    }
}
