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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m29142d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/DurationUnit;", "unit", "<init>", "(Lkotlin/time/DurationUnit;)V", "", "read", "()J", "Lkotlin/time/ComparableTimeMark;", "markNow", "()Lkotlin/time/ComparableTimeMark;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Lazy;", "zero", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes6.dex */
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    /* renamed from: a */
    public final DurationUnit f70589a;

    /* renamed from: b */
    public final Lazy f70590b;

    /* renamed from: kotlin.time.AbstractLongTimeSource$a */
    /* loaded from: classes6.dex */
    public static final class C12004a implements ComparableTimeMark {

        /* renamed from: a */
        public final long f70591a;

        /* renamed from: b */
        public final AbstractLongTimeSource f70592b;

        /* renamed from: c */
        public final long f70593c;

        public /* synthetic */ C12004a(long j, AbstractLongTimeSource abstractLongTimeSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
        public long mo74706elapsedNowUwyO8pc() {
            return Duration.m74743minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.f70592b.m27723a(), this.f70591a, this.f70592b.getUnit()), this.f70593c);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(Object obj) {
            if ((obj instanceof C12004a) && Intrinsics.areEqual(this.f70592b, ((C12004a) obj).f70592b) && Duration.m74718equalsimpl0(mo74708minusUwyO8pc((ComparableTimeMark) obj), Duration.Companion.m74790getZEROUwyO8pc())) {
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
            return (Duration.m74738hashCodeimpl(this.f70593c) * 37) + AbstractC17631Fh1.m68395a(this.f70591a);
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo74707minusLRDsOJo(long j) {
            return ComparableTimeMark.DefaultImpls.m74710minusLRDsOJo(this, j);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc */
        public long mo74708minusUwyO8pc(ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof C12004a) {
                C12004a c12004a = (C12004a) other;
                if (Intrinsics.areEqual(this.f70592b, c12004a.f70592b)) {
                    return Duration.m74744plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.f70591a, c12004a.f70591a, this.f70592b.getUnit()), Duration.m74743minusLRDsOJo(this.f70593c, c12004a.f70593c));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public String toString() {
            return "LongTimeMark(" + this.f70591a + DurationUnitKt__DurationUnitKt.shortName(this.f70592b.getUnit()) + " + " + ((Object) Duration.m74757toStringimpl(this.f70593c)) + ", " + this.f70592b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C12004a(long j, AbstractLongTimeSource timeSource, long j2) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f70591a = j;
            this.f70592b = timeSource;
            this.f70593c = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo74709plusLRDsOJo(long j) {
            DurationUnit unit = this.f70592b.getUnit();
            if (Duration.m74740isInfiniteimpl(j)) {
                return new C12004a(LongSaturatedMathKt.m74813saturatingAddNuflL3o(this.f70591a, unit, j), this.f70592b, Duration.Companion.m74790getZEROUwyO8pc(), null);
            }
            long m74760truncateToUwyO8pc$kotlin_stdlib = Duration.m74760truncateToUwyO8pc$kotlin_stdlib(j, unit);
            long m74744plusLRDsOJo = Duration.m74744plusLRDsOJo(Duration.m74743minusLRDsOJo(j, m74760truncateToUwyO8pc$kotlin_stdlib), this.f70593c);
            long m74813saturatingAddNuflL3o = LongSaturatedMathKt.m74813saturatingAddNuflL3o(this.f70591a, unit, m74760truncateToUwyO8pc$kotlin_stdlib);
            long m74760truncateToUwyO8pc$kotlin_stdlib2 = Duration.m74760truncateToUwyO8pc$kotlin_stdlib(m74744plusLRDsOJo, unit);
            long m74813saturatingAddNuflL3o2 = LongSaturatedMathKt.m74813saturatingAddNuflL3o(m74813saturatingAddNuflL3o, unit, m74760truncateToUwyO8pc$kotlin_stdlib2);
            long m74743minusLRDsOJo = Duration.m74743minusLRDsOJo(m74744plusLRDsOJo, m74760truncateToUwyO8pc$kotlin_stdlib2);
            long m74733getInWholeNanosecondsimpl = Duration.m74733getInWholeNanosecondsimpl(m74743minusLRDsOJo);
            if (m74813saturatingAddNuflL3o2 != 0 && m74733getInWholeNanosecondsimpl != 0 && (m74813saturatingAddNuflL3o2 ^ m74733getInWholeNanosecondsimpl) < 0) {
                long duration = DurationKt.toDuration(AbstractC22237sr0.getSign(m74733getInWholeNanosecondsimpl), unit);
                m74813saturatingAddNuflL3o2 = LongSaturatedMathKt.m74813saturatingAddNuflL3o(m74813saturatingAddNuflL3o2, unit, duration);
                m74743minusLRDsOJo = Duration.m74743minusLRDsOJo(m74743minusLRDsOJo, duration);
            }
            if ((1 | (m74813saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                m74743minusLRDsOJo = Duration.Companion.m74790getZEROUwyO8pc();
            }
            return new C12004a(m74813saturatingAddNuflL3o2, this.f70592b, m74743minusLRDsOJo, null);
        }
    }

    public AbstractLongTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f70589a = unit;
        this.f70590b = LazyKt__LazyJVMKt.lazy(new AbstractLongTimeSource$zero$2(this));
    }

    /* renamed from: a */
    public final long m27723a() {
        return read() - m27722b();
    }

    /* renamed from: b */
    public final long m27722b() {
        return ((Number) this.f70590b.getValue()).longValue();
    }

    @NotNull
    public final DurationUnit getUnit() {
        return this.f70589a;
    }

    public abstract long read();

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new C12004a(m27723a(), this, Duration.Companion.m74790getZEROUwyO8pc(), null);
    }
}