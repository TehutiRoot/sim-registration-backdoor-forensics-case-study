package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.9")
@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, m28850d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "WithComparableMarks", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes6.dex */
public interface TimeSource {
    @NotNull
    public static final Companion Companion = Companion.f70568a;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lkotlin/time/TimeSource$Companion;", "", "()V", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f70568a = new Companion();
    }

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, m28850d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* loaded from: classes6.dex */
    public static final class Monotonic implements WithComparableMarks {
        @NotNull
        public static final Monotonic INSTANCE = new Monotonic();

        @SinceKotlin(version = "1.9")
        @Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001b\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010!\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010(\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006+"}, m28850d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", "constructor-impl", "(J)J", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "elapsedNow", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(JJ)J", "plus", "minus-LRDsOJo", "minus", "", "hasPassedNow-impl", "(J)Z", "hasPassedNow", "hasNotPassedNow-impl", "hasNotPassedNow", "other", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "minus-6eNON_k", "", "compareTo-6eNON_k", "(JJ)I", "compareTo", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
        @JvmInline
        @WasExperimental(markerClass = {ExperimentalTime.class})
        /* loaded from: classes6.dex */
        public static final class ValueTimeMark implements ComparableTimeMark {

            /* renamed from: a */
            public final long f70569a;

            public /* synthetic */ ValueTimeMark(long j) {
                this.f70569a = j;
            }

            /* renamed from: box-impl  reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m74638boximpl(long j) {
                return new ValueTimeMark(j);
            }

            /* renamed from: compareTo-6eNON_k  reason: not valid java name */
            public static final int m74639compareTo6eNON_k(long j, long j2) {
                return Duration.m74528compareToLRDsOJo(m74648minus6eNON_k(j, j2), Duration.Companion.m74606getZEROUwyO8pc());
            }

            /* renamed from: compareTo-impl  reason: not valid java name */
            public static int m74640compareToimpl(long j, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m74638boximpl(j).compareTo(other);
            }

            /* renamed from: constructor-impl  reason: not valid java name */
            public static long m74641constructorimpl(long j) {
                return j;
            }

            /* renamed from: equals-impl  reason: not valid java name */
            public static boolean m74643equalsimpl(long j, Object obj) {
                return (obj instanceof ValueTimeMark) && j == ((ValueTimeMark) obj).m74653unboximpl();
            }

            /* renamed from: equals-impl0  reason: not valid java name */
            public static final boolean m74644equalsimpl0(long j, long j2) {
                return j == j2;
            }

            /* renamed from: hasNotPassedNow-impl  reason: not valid java name */
            public static boolean m74645hasNotPassedNowimpl(long j) {
                return Duration.m74557isNegativeimpl(m74642elapsedNowUwyO8pc(j));
            }

            /* renamed from: hasPassedNow-impl  reason: not valid java name */
            public static boolean m74646hasPassedNowimpl(long j) {
                return !Duration.m74557isNegativeimpl(m74642elapsedNowUwyO8pc(j));
            }

            /* renamed from: hashCode-impl  reason: not valid java name */
            public static int m74647hashCodeimpl(long j) {
                return AbstractC17792Ig1.m67882a(j);
            }

            /* renamed from: minus-6eNON_k  reason: not valid java name */
            public static final long m74648minus6eNON_k(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m74631differenceBetweenfRLX17w(j, j2);
            }

            /* renamed from: toString-impl  reason: not valid java name */
            public static String m74652toStringimpl(long j) {
                return "ValueTimeMark(reading=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: elapsedNow-UwyO8pc */
            public long mo74522elapsedNowUwyO8pc() {
                return m74642elapsedNowUwyO8pc(this.f70569a);
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(Object obj) {
                return m74643equalsimpl(this.f70569a, obj);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m74645hasNotPassedNowimpl(this.f70569a);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m74646hasPassedNowimpl(this.f70569a);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m74647hashCodeimpl(this.f70569a);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo74523minusLRDsOJo(long j) {
                return m74638boximpl(mo74523minusLRDsOJo(j));
            }

            @Override // kotlin.time.ComparableTimeMark
            /* renamed from: minus-UwyO8pc */
            public long mo74524minusUwyO8pc(@NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m74650minusUwyO8pc(this.f70569a, other);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo74525plusLRDsOJo(long j) {
                return m74638boximpl(mo74525plusLRDsOJo(j));
            }

            public String toString() {
                return m74652toStringimpl(this.f70569a);
            }

            /* renamed from: unbox-impl  reason: not valid java name */
            public final /* synthetic */ long m74653unboximpl() {
                return this.f70569a;
            }

            /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
            public static long m74642elapsedNowUwyO8pc(long j) {
                return MonotonicTimeSource.INSTANCE.m74632elapsedFrom6eNON_k(j);
            }

            /* renamed from: minus-UwyO8pc  reason: not valid java name */
            public static long m74650minusUwyO8pc(long j, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m74648minus6eNON_k(j, ((ValueTimeMark) other).m74653unboximpl());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m74652toStringimpl(j)) + " and " + other);
            }

            @Override // java.lang.Comparable
            public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo74523minusLRDsOJo(long j) {
                return m74638boximpl(mo74523minusLRDsOJo(j));
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo74525plusLRDsOJo(long j) {
                return m74638boximpl(mo74525plusLRDsOJo(j));
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public long mo74523minusLRDsOJo(long j) {
                return m74649minusLRDsOJo(this.f70569a, j);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public long mo74525plusLRDsOJo(long j) {
                return m74651plusLRDsOJo(this.f70569a, j);
            }

            /* renamed from: minus-LRDsOJo  reason: not valid java name */
            public static long m74649minusLRDsOJo(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m74630adjustReading6QKq23U(j, Duration.m74577unaryMinusUwyO8pc(j2));
            }

            /* renamed from: plus-LRDsOJo  reason: not valid java name */
            public static long m74651plusLRDsOJo(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m74630adjustReading6QKq23U(j, j2);
            }
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m74638boximpl(m74637markNowz9LOYto());
        }

        /* renamed from: markNow-z9LOYto  reason: not valid java name */
        public long m74637markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m74633markNowz9LOYto();
        }

        @NotNull
        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m74638boximpl(m74637markNowz9LOYto());
        }
    }

    @SinceKotlin(version = "1.9")
    @Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m28850d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
    @WasExperimental(markerClass = {ExperimentalTime.class})
    /* loaded from: classes6.dex */
    public interface WithComparableMarks extends TimeSource {
        @Override // kotlin.time.TimeSource
        @NotNull
        ComparableTimeMark markNow();
    }

    @NotNull
    TimeMark markNow();
}
