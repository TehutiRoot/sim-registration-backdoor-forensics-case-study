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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m29142d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/DurationUnit;", "unit", "<init>", "(Lkotlin/time/DurationUnit;)V", "", "read", "()D", "Lkotlin/time/ComparableTimeMark;", "markNow", "()Lkotlin/time/ComparableTimeMark;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
@Deprecated(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@ExperimentalTime
/* loaded from: classes6.dex */
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {

    /* renamed from: a */
    public final DurationUnit f70585a;

    /* renamed from: kotlin.time.AbstractDoubleTimeSource$a */
    /* loaded from: classes6.dex */
    public static final class C12003a implements ComparableTimeMark {

        /* renamed from: a */
        public final double f70586a;

        /* renamed from: b */
        public final AbstractDoubleTimeSource f70587b;

        /* renamed from: c */
        public final long f70588c;

        public /* synthetic */ C12003a(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, abstractDoubleTimeSource, j);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
        public long mo74706elapsedNowUwyO8pc() {
            return Duration.m74743minusLRDsOJo(DurationKt.toDuration(this.f70587b.read() - this.f70586a, this.f70587b.getUnit()), this.f70588c);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(Object obj) {
            if ((obj instanceof C12003a) && Intrinsics.areEqual(this.f70587b, ((C12003a) obj).f70587b) && Duration.m74718equalsimpl0(mo74708minusUwyO8pc((ComparableTimeMark) obj), Duration.Companion.m74790getZEROUwyO8pc())) {
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
            return Duration.m74738hashCodeimpl(Duration.m74744plusLRDsOJo(DurationKt.toDuration(this.f70586a, this.f70587b.getUnit()), this.f70588c));
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* renamed from: minus-LRDsOJo  reason: not valid java name */
        public ComparableTimeMark mo74707minusLRDsOJo(long j) {
            return ComparableTimeMark.DefaultImpls.m74710minusLRDsOJo(this, j);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc  reason: not valid java name */
        public long mo74708minusUwyO8pc(ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof C12003a) {
                C12003a c12003a = (C12003a) other;
                if (Intrinsics.areEqual(this.f70587b, c12003a.f70587b)) {
                    if (Duration.m74718equalsimpl0(this.f70588c, c12003a.f70588c) && Duration.m74740isInfiniteimpl(this.f70588c)) {
                        return Duration.Companion.m74790getZEROUwyO8pc();
                    }
                    long m74743minusLRDsOJo = Duration.m74743minusLRDsOJo(this.f70588c, c12003a.f70588c);
                    long duration = DurationKt.toDuration(this.f70586a - c12003a.f70586a, this.f70587b.getUnit());
                    if (Duration.m74718equalsimpl0(duration, Duration.m74761unaryMinusUwyO8pc(m74743minusLRDsOJo))) {
                        return Duration.Companion.m74790getZEROUwyO8pc();
                    }
                    return Duration.m74744plusLRDsOJo(duration, m74743minusLRDsOJo);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public String toString() {
            return "DoubleTimeMark(" + this.f70586a + DurationUnitKt__DurationUnitKt.shortName(this.f70587b.getUnit()) + " + " + ((Object) Duration.m74757toStringimpl(this.f70588c)) + ", " + this.f70587b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C12003a(double d, AbstractDoubleTimeSource timeSource, long j) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f70586a = d;
            this.f70587b = timeSource;
            this.f70588c = j;
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo  reason: not valid java name */
        public ComparableTimeMark mo74709plusLRDsOJo(long j) {
            return new C12003a(this.f70586a, this.f70587b, Duration.m74744plusLRDsOJo(this.f70588c, j), null);
        }
    }

    public AbstractDoubleTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f70585a = unit;
    }

    @NotNull
    public final DurationUnit getUnit() {
        return this.f70585a;
    }

    public abstract double read();

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new C12003a(read(), this, Duration.Companion.m74790getZEROUwyO8pc(), null);
    }
}