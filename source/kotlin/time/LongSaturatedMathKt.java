package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0007\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0012\u001a'\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0012\u001a\u0014\u0010\u001a\u001a\u00020\u0019*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m28850d2 = {"", "value", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/Duration;", TypedValues.TransitionType.S_DURATION, "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAdd", "durationInUnit", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JJJ)J", OperatorName.CURVE_TO, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(J)J", "valueNs", "origin", "saturatingDiff", "(JJLkotlin/time/DurationUnit;)J", "origin1", "origin2", "saturatingOriginsDiff", "value1", "value2", "d", "", "isSaturated", "(J)Z", "kotlin-stdlib"}, m28849k = 2, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes6.dex */
public final class LongSaturatedMathKt {
    /* renamed from: a */
    public static final long m27413a(long j, long j2, long j3) {
        if (Duration.m74556isInfiniteimpl(j2) && (j ^ j3) < 0) {
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        return j;
    }

    /* renamed from: b */
    public static final long m27412b(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        Duration.Companion companion = Duration.Companion;
        if (i < 0) {
            return companion.m74605getNEG_INFINITEUwyO8pc$kotlin_stdlib();
        }
        return companion.m74604getINFINITEUwyO8pc();
    }

    /* renamed from: c */
    public static final long m27411c(long j, DurationUnit durationUnit, long j2) {
        long m74532divUwyO8pc = Duration.m74532divUwyO8pc(j2, 2);
        long m74570toLongimpl = Duration.m74570toLongimpl(m74532divUwyO8pc, durationUnit);
        if ((1 | (m74570toLongimpl - 1)) == Long.MAX_VALUE) {
            return m74570toLongimpl;
        }
        return m74629saturatingAddNuflL3o(m74629saturatingAddNuflL3o(j, durationUnit, m74532divUwyO8pc), durationUnit, Duration.m74559minusLRDsOJo(j2, m74532divUwyO8pc));
    }

    /* renamed from: d */
    public static final long m27410d(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
            if (durationUnit.compareTo(durationUnit2) < 0) {
                long convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
                long j4 = (j % convertDurationUnit) - (j2 % convertDurationUnit);
                Duration.Companion companion = Duration.Companion;
                return Duration.m74560plusLRDsOJo(DurationKt.toDuration((j / convertDurationUnit) - (j2 / convertDurationUnit), durationUnit2), DurationKt.toDuration(j4, durationUnit));
            }
            return Duration.m74577unaryMinusUwyO8pc(m27412b(j3));
        }
        return DurationKt.toDuration(j3, durationUnit);
    }

    public static final boolean isSaturated(long j) {
        return ((j - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o  reason: not valid java name */
    public static final long m74629saturatingAddNuflL3o(long j, @NotNull DurationUnit unit, long j2) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long m74570toLongimpl = Duration.m74570toLongimpl(j2, unit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return m27413a(j, j2, m74570toLongimpl);
        }
        if ((1 | (m74570toLongimpl - 1)) == Long.MAX_VALUE) {
            return m27411c(j, unit, j2);
        }
        long j3 = j + m74570toLongimpl;
        if (((j ^ j3) & (m74570toLongimpl ^ j3)) < 0) {
            if (j >= 0) {
                return Long.MAX_VALUE;
            }
            return Long.MIN_VALUE;
        }
        return j3;
    }

    public static final long saturatingDiff(long j, long j2, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return Duration.m74577unaryMinusUwyO8pc(m27412b(j2));
        }
        return m27410d(j, j2, unit);
    }

    public static final long saturatingOriginsDiff(long j, long j2, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return Duration.Companion.m74606getZEROUwyO8pc();
            }
            return Duration.m74577unaryMinusUwyO8pc(m27412b(j2));
        } else if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return m27412b(j);
        } else {
            return m27410d(j, j2, unit);
        }
    }
}
