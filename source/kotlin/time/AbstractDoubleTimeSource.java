package kotlin.time;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/DurationUnit;", "unit", "<init>", "(Lkotlin/time/DurationUnit;)V", "", "read", "()D", "Lkotlin/time/ComparableTimeMark;", "markNow", "()Lkotlin/time/ComparableTimeMark;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
@Deprecated(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@ExperimentalTime
/* loaded from: classes6.dex */
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {

    /* renamed from: a */
    public final DurationUnit f70551a;

    /* renamed from: kotlin.time.AbstractDoubleTimeSource$a */
    /* loaded from: classes6.dex */
    public static final class C12027a implements ComparableTimeMark {

        /* renamed from: a */
        public final double f70552a;

        /* renamed from: b */
        public final AbstractDoubleTimeSource f70553b;

        /* renamed from: c */
        public final long f70554c;

        public /* synthetic */ C12027a(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, abstractDoubleTimeSource, j);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
        public long mo74522elapsedNowUwyO8pc() {
            return Duration.m74559minusLRDsOJo(DurationKt.toDuration(this.f70553b.read() - this.f70552a, this.f70553b.getUnit()), this.f70554c);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(Object obj) {
            if ((obj instanceof C12027a) && Intrinsics.areEqual(this.f70553b, ((C12027a) obj).f70553b) && Duration.m74534equalsimpl0(mo74524minusUwyO8pc((ComparableTimeMark) obj), Duration.Companion.m74606getZEROUwyO8pc())) {
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
            return Duration.m74554hashCodeimpl(Duration.m74560plusLRDsOJo(DurationKt.toDuration(this.f70552a, this.f70553b.getUnit()), this.f70554c));
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* renamed from: minus-LRDsOJo  reason: not valid java name */
        public ComparableTimeMark mo74523minusLRDsOJo(long j) {
            return ComparableTimeMark.DefaultImpls.m74526minusLRDsOJo(this, j);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc  reason: not valid java name */
        public long mo74524minusUwyO8pc(ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof C12027a) {
                C12027a c12027a = (C12027a) other;
                if (Intrinsics.areEqual(this.f70553b, c12027a.f70553b)) {
                    if (Duration.m74534equalsimpl0(this.f70554c, c12027a.f70554c) && Duration.m74556isInfiniteimpl(this.f70554c)) {
                        return Duration.Companion.m74606getZEROUwyO8pc();
                    }
                    long m74559minusLRDsOJo = Duration.m74559minusLRDsOJo(this.f70554c, c12027a.f70554c);
                    long duration = DurationKt.toDuration(this.f70552a - c12027a.f70552a, this.f70553b.getUnit());
                    if (Duration.m74534equalsimpl0(duration, Duration.m74577unaryMinusUwyO8pc(m74559minusLRDsOJo))) {
                        return Duration.Companion.m74606getZEROUwyO8pc();
                    }
                    return Duration.m74560plusLRDsOJo(duration, m74559minusLRDsOJo);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public String toString() {
            return "DoubleTimeMark(" + this.f70552a + DurationUnitKt__DurationUnitKt.shortName(this.f70553b.getUnit()) + " + " + ((Object) Duration.m74573toStringimpl(this.f70554c)) + ", " + this.f70553b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C12027a(double d, AbstractDoubleTimeSource timeSource, long j) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f70552a = d;
            this.f70553b = timeSource;
            this.f70554c = j;
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo  reason: not valid java name */
        public ComparableTimeMark mo74525plusLRDsOJo(long j) {
            return new C12027a(this.f70552a, this.f70553b, Duration.m74560plusLRDsOJo(this.f70554c, j), null);
        }
    }

    public AbstractDoubleTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f70551a = unit;
    }

    @NotNull
    public final DurationUnit getUnit() {
        return this.f70551a;
    }

    public abstract double read();

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new C12027a(read(), this, Duration.Companion.m74606getZEROUwyO8pc(), null);
    }
}
