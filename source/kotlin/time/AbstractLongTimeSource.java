package kotlin.time;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.9")
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m28850d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/DurationUnit;", "unit", "<init>", "(Lkotlin/time/DurationUnit;)V", "", "read", "()J", "Lkotlin/time/ComparableTimeMark;", "markNow", "()Lkotlin/time/ComparableTimeMark;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Lazy;", "zero", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes6.dex */
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    /* renamed from: a */
    public final DurationUnit f70555a;

    /* renamed from: b */
    public final Lazy f70556b;

    /* renamed from: kotlin.time.AbstractLongTimeSource$a */
    /* loaded from: classes6.dex */
    public static final class C12028a implements ComparableTimeMark {

        /* renamed from: a */
        public final long f70557a;

        /* renamed from: b */
        public final AbstractLongTimeSource f70558b;

        /* renamed from: c */
        public final long f70559c;

        public /* synthetic */ C12028a(long j, AbstractLongTimeSource abstractLongTimeSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
        public long mo74522elapsedNowUwyO8pc() {
            return Duration.m74559minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.f70558b.m27431a(), this.f70557a, this.f70558b.getUnit()), this.f70559c);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(Object obj) {
            if ((obj instanceof C12028a) && Intrinsics.areEqual(this.f70558b, ((C12028a) obj).f70558b) && Duration.m74534equalsimpl0(mo74524minusUwyO8pc((ComparableTimeMark) obj), Duration.Companion.m74606getZEROUwyO8pc())) {
                return true;
            }
            return false;
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return (Duration.m74554hashCodeimpl(this.f70559c) * 37) + AbstractC17792Ig1.m67882a(this.f70557a);
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo74523minusLRDsOJo(long j) {
            return ComparableTimeMark.DefaultImpls.m74526minusLRDsOJo(this, j);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc */
        public long mo74524minusUwyO8pc(ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof C12028a) {
                C12028a c12028a = (C12028a) other;
                if (Intrinsics.areEqual(this.f70558b, c12028a.f70558b)) {
                    return Duration.m74560plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.f70557a, c12028a.f70557a, this.f70558b.getUnit()), Duration.m74559minusLRDsOJo(this.f70559c, c12028a.f70559c));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public String toString() {
            return "LongTimeMark(" + this.f70557a + DurationUnitKt__DurationUnitKt.shortName(this.f70558b.getUnit()) + " + " + ((Object) Duration.m74573toStringimpl(this.f70559c)) + ", " + this.f70558b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C12028a(long j, AbstractLongTimeSource timeSource, long j2) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f70557a = j;
            this.f70558b = timeSource;
            this.f70559c = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo74525plusLRDsOJo(long j) {
            DurationUnit unit = this.f70558b.getUnit();
            if (Duration.m74556isInfiniteimpl(j)) {
                return new C12028a(LongSaturatedMathKt.m74629saturatingAddNuflL3o(this.f70557a, unit, j), this.f70558b, Duration.Companion.m74606getZEROUwyO8pc(), null);
            }
            long m74576truncateToUwyO8pc$kotlin_stdlib = Duration.m74576truncateToUwyO8pc$kotlin_stdlib(j, unit);
            long m74560plusLRDsOJo = Duration.m74560plusLRDsOJo(Duration.m74559minusLRDsOJo(j, m74576truncateToUwyO8pc$kotlin_stdlib), this.f70559c);
            long m74629saturatingAddNuflL3o = LongSaturatedMathKt.m74629saturatingAddNuflL3o(this.f70557a, unit, m74576truncateToUwyO8pc$kotlin_stdlib);
            long m74576truncateToUwyO8pc$kotlin_stdlib2 = Duration.m74576truncateToUwyO8pc$kotlin_stdlib(m74560plusLRDsOJo, unit);
            long m74629saturatingAddNuflL3o2 = LongSaturatedMathKt.m74629saturatingAddNuflL3o(m74629saturatingAddNuflL3o, unit, m74576truncateToUwyO8pc$kotlin_stdlib2);
            long m74559minusLRDsOJo = Duration.m74559minusLRDsOJo(m74560plusLRDsOJo, m74576truncateToUwyO8pc$kotlin_stdlib2);
            long m74549getInWholeNanosecondsimpl = Duration.m74549getInWholeNanosecondsimpl(m74559minusLRDsOJo);
            if (m74629saturatingAddNuflL3o2 != 0 && m74549getInWholeNanosecondsimpl != 0 && (m74629saturatingAddNuflL3o2 ^ m74549getInWholeNanosecondsimpl) < 0) {
                long duration = DurationKt.toDuration(AbstractC21140mr0.getSign(m74549getInWholeNanosecondsimpl), unit);
                m74629saturatingAddNuflL3o2 = LongSaturatedMathKt.m74629saturatingAddNuflL3o(m74629saturatingAddNuflL3o2, unit, duration);
                m74559minusLRDsOJo = Duration.m74559minusLRDsOJo(m74559minusLRDsOJo, duration);
            }
            if ((1 | (m74629saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                m74559minusLRDsOJo = Duration.Companion.m74606getZEROUwyO8pc();
            }
            return new C12028a(m74629saturatingAddNuflL3o2, this.f70558b, m74559minusLRDsOJo, null);
        }
    }

    public AbstractLongTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f70555a = unit;
        this.f70556b = LazyKt__LazyJVMKt.lazy(new AbstractLongTimeSource$zero$2(this));
    }

    /* renamed from: a */
    public final long m27431a() {
        return read() - m27430b();
    }

    /* renamed from: b */
    public final long m27430b() {
        return ((Number) this.f70556b.getValue()).longValue();
    }

    @NotNull
    public final DurationUnit getUnit() {
        return this.f70555a;
    }

    public abstract long read();

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new C12028a(m27431a(), this, Duration.Companion.m74606getZEROUwyO8pc(), null);
    }
}
