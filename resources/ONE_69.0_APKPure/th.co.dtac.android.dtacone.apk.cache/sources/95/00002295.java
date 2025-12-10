package androidx.compose.animation.core;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0000\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n\u001a\u0015\u0010\f\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n¨\u0006\r"}, m29142d2 = {"complexQuadraticFormula", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", PDPageLabelRange.STYLE_LETTERS_LOWER, "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "complexSqrt", "num", "minus", "other", "plus", "times", "animation-core_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n103#1:113\n107#1:119\n103#1:123\n103#1:134\n35#2,2:114\n54#2,3:116\n66#2,3:120\n35#2,2:124\n54#2,3:126\n35#2,2:129\n66#2,3:131\n35#2,2:135\n54#2,3:137\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n88#1:113\n89#1:119\n89#1:123\n107#1:134\n88#1:114,2\n88#1:116,3\n89#1:120,3\n89#1:124,2\n89#1:126,3\n103#1:129,2\n107#1:131,3\n107#1:135,2\n111#1:137,3\n*E\n"})
/* loaded from: classes.dex */
public final class ComplexDoubleKt {
    @NotNull
    public static final Pair<ComplexDouble, ComplexDouble> complexQuadraticFormula(double d, double d2, double d3) {
        double d4 = (d2 * d2) - ((4.0d * d) * d3);
        double d5 = 1.0d / (d * 2.0d);
        double d6 = -d2;
        ComplexDouble complexSqrt = complexSqrt(d4);
        complexSqrt.f12548a += d6;
        complexSqrt.f12548a *= d5;
        complexSqrt.f12549b *= d5;
        ComplexDouble complexSqrt2 = complexSqrt(d4);
        double d7 = -1;
        complexSqrt2.f12548a *= d7;
        complexSqrt2.f12549b *= d7;
        complexSqrt2.f12548a += d6;
        complexSqrt2.f12548a *= d5;
        complexSqrt2.f12549b *= d5;
        return TuplesKt.m29136to(complexSqrt, complexSqrt2);
    }

    @NotNull
    public static final ComplexDouble complexSqrt(double d) {
        if (d < 0.0d) {
            return new ComplexDouble(0.0d, Math.sqrt(Math.abs(d)));
        }
        return new ComplexDouble(Math.sqrt(d), 0.0d);
    }

    @NotNull
    public static final ComplexDouble minus(double d, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d2 = -1;
        other.f12548a *= d2;
        other.f12549b *= d2;
        other.f12548a += d;
        return other;
    }

    @NotNull
    public static final ComplexDouble plus(double d, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other.f12548a += d;
        return other;
    }

    @NotNull
    public static final ComplexDouble times(double d, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other.f12548a *= d;
        other.f12549b *= d;
        return other;
    }
}