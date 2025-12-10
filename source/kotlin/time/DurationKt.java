package kotlin.time;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.CharRange;
import kotlin.ranges.LongRange;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0014\u001a\u001f\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0014\u001a\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0014\"\u0014\u0010!\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010$\"\u001e\u0010*\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'\"\u001e\u0010*\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010+\u001a\u0004\b&\u0010\u0014\"\u001e\u0010*\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010-\u001a\u0004\b&\u0010,\"\u001e\u00100\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010'\"\u001e\u00100\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u0014\"\u001e\u00100\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010,\"\u001e\u00103\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010)\u001a\u0004\b1\u0010'\"\u001e\u00103\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u0014\"\u001e\u00103\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010,\"\u001e\u00106\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010)\u001a\u0004\b4\u0010'\"\u001e\u00106\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010+\u001a\u0004\b4\u0010\u0014\"\u001e\u00106\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010,\"\u001e\u00109\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010)\u001a\u0004\b7\u0010'\"\u001e\u00109\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010+\u001a\u0004\b7\u0010\u0014\"\u001e\u00109\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010,\"\u001e\u0010<\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010)\u001a\u0004\b:\u0010'\"\u001e\u0010<\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010+\u001a\u0004\b:\u0010\u0014\"\u001e\u0010<\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010-\u001a\u0004\b:\u0010,\"\u001e\u0010?\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010)\u001a\u0004\b=\u0010'\"\u001e\u0010?\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010+\u001a\u0004\b=\u0010\u0014\"\u001e\u0010?\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010-\u001a\u0004\b=\u0010,¨\u0006@"}, m28850d2 = {"", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/Duration;", "toDuration", "(ILkotlin/time/DurationUnit;)J", "", "(JLkotlin/time/DurationUnit;)J", "", "(DLkotlin/time/DurationUnit;)J", "", "value", "", "strictIso", OperatorName.CLOSE_PATH, "(Ljava/lang/String;Z)J", "i", "(Ljava/lang/String;)J", "nanos", OperatorName.NON_STROKING_GRAY, "(J)J", "millis", OperatorName.FILL_NON_ZERO, "normalNanos", "d", "normalMillis", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "normalValue", "unitDiscriminator", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JI)J", "e", OperatorName.CURVE_TO, "NANOS_IN_MILLIS", "I", "MAX_NANOS", OperatorName.SET_LINE_CAPSTYLE, "MAX_MILLIS", "getNanoseconds", "(I)J", "getNanoseconds$annotations", "(I)V", "nanoseconds", "(J)V", "(D)J", "(D)V", "getMicroseconds", "getMicroseconds$annotations", "microseconds", "getMilliseconds", "getMilliseconds$annotations", "milliseconds", "getSeconds", "getSeconds$annotations", "seconds", "getMinutes", "getMinutes$annotations", "minutes", "getHours", "getHours$annotations", "hours", "getDays", "getDays$annotations", "days", "kotlin-stdlib"}, m28849k = 2, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n1447#1,6:1497\n1450#1,3:1503\n1447#1,6:1506\n1447#1,6:1512\n1450#1,3:1521\n1#2:1496\n1726#3,3:1518\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1497,6\n1405#1:1503,3\n1408#1:1506,6\n1411#1:1512,6\n1447#1:1521,3\n1436#1:1518,3\n*E\n"})
/* loaded from: classes6.dex */
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    public static final int NANOS_IN_MILLIS = 1000000;

    /* renamed from: a */
    public static final long m27422a(long j, int i) {
        return Duration.m74529constructorimpl((j << 1) + i);
    }

    /* renamed from: b */
    public static final long m27421b(long j) {
        return Duration.m74529constructorimpl((j << 1) + 1);
    }

    /* renamed from: c */
    public static final long m27420c(long j) {
        if (new LongRange(-4611686018426L, 4611686018426L).contains(j)) {
            return m27419d(m27417f(j));
        }
        return m27421b(AbstractC11719c.coerceIn(j, -4611686018427387903L, (long) MAX_MILLIS));
    }

    /* renamed from: d */
    public static final long m27419d(long j) {
        return Duration.m74529constructorimpl(j << 1);
    }

    /* renamed from: e */
    public static final long m27418e(long j) {
        if (new LongRange(-4611686018426999999L, MAX_NANOS).contains(j)) {
            return m27419d(j);
        }
        return m27421b(m27416g(j));
    }

    /* renamed from: f */
    public static final long m27417f(long j) {
        return j * ((long) NANOS_IN_MILLIS);
    }

    /* renamed from: g */
    public static final long m27416g(long j) {
        return j / ((long) NANOS_IN_MILLIS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(double d) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(double d) {
    }

    /* renamed from: h */
    public static final long m27415h(String str, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        long j;
        String str2 = str;
        int length = str.length();
        if (length != 0) {
            Duration.Companion companion = Duration.Companion;
            long m74606getZEROUwyO8pc = companion.m74606getZEROUwyO8pc();
            char charAt = str2.charAt(0);
            if (charAt == '+' || charAt == '-') {
                i = 1;
            } else {
                i = 0;
            }
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && StringsKt__StringsKt.startsWith$default((CharSequence) str2, '-', false, 2, (Object) null)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (length > i) {
                char c = '9';
                char c2 = '0';
                if (str2.charAt(i) == 'P') {
                    int i2 = i + 1;
                    if (i2 != length) {
                        DurationUnit durationUnit = null;
                        boolean z4 = false;
                        while (i2 < length) {
                            if (str2.charAt(i2) == 'T') {
                                if (!z4 && (i2 = i2 + 1) != length) {
                                    z4 = true;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                int i3 = i2;
                                while (i3 < str.length()) {
                                    char charAt2 = str2.charAt(i3);
                                    if (!new CharRange(c2, c).contains(charAt2) && !StringsKt__StringsKt.contains$default((CharSequence) "+-.", charAt2, false, 2, (Object) null)) {
                                        break;
                                    }
                                    i3++;
                                    c = '9';
                                    c2 = '0';
                                }
                                Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                                String substring = str2.substring(i2, i3);
                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = i2 + substring.length();
                                    if (length2 >= 0 && length2 <= StringsKt__StringsKt.getLastIndex(str)) {
                                        char charAt3 = str2.charAt(length2);
                                        i2 = length2 + 1;
                                        DurationUnit durationUnitByIsoChar = DurationUnitKt__DurationUnitKt.durationUnitByIsoChar(charAt3, z4);
                                        if (durationUnit != null && durationUnit.compareTo(durationUnitByIsoChar) <= 0) {
                                            throw new IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) substring, '.', 0, false, 6, (Object) null);
                                        if (durationUnitByIsoChar == DurationUnit.SECONDS && indexOf$default > 0) {
                                            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring2 = substring.substring(0, indexOf$default);
                                            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                            long m74560plusLRDsOJo = Duration.m74560plusLRDsOJo(m74606getZEROUwyO8pc, toDuration(m27414i(substring2), durationUnitByIsoChar));
                                            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring3 = substring.substring(indexOf$default);
                                            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                                            m74606getZEROUwyO8pc = Duration.m74560plusLRDsOJo(m74560plusLRDsOJo, toDuration(Double.parseDouble(substring3), durationUnitByIsoChar));
                                        } else {
                                            m74606getZEROUwyO8pc = Duration.m74560plusLRDsOJo(m74606getZEROUwyO8pc, toDuration(m27414i(substring), durationUnitByIsoChar));
                                        }
                                        durationUnit = durationUnitByIsoChar;
                                        c = '9';
                                        c2 = '0';
                                        str2 = str;
                                    } else {
                                        throw new IllegalArgumentException("Missing unit for value " + substring);
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (!z) {
                    String str3 = "Unexpected order of duration components";
                    if (AbstractC20204hN1.regionMatches(str, i, "Infinity", 0, Math.max(length - i, 8), true)) {
                        m74606getZEROUwyO8pc = companion.m74604getINFINITEUwyO8pc();
                    } else {
                        boolean z5 = !z2;
                        if (z2 && str.charAt(i) == '(' && StringsKt___StringsKt.last(str) == ')') {
                            i++;
                            length--;
                            if (i != length) {
                                j = m74606getZEROUwyO8pc;
                                z5 = true;
                            } else {
                                throw new IllegalArgumentException("No components");
                            }
                        } else {
                            j = m74606getZEROUwyO8pc;
                        }
                        boolean z6 = false;
                        DurationUnit durationUnit2 = null;
                        while (i < length) {
                            if (z6 && z5) {
                                while (i < str.length() && str.charAt(i) == ' ') {
                                    i++;
                                }
                            }
                            int i4 = i;
                            while (i4 < str.length()) {
                                char charAt4 = str.charAt(i4);
                                if (!new CharRange('0', '9').contains(charAt4) && charAt4 != '.') {
                                    break;
                                }
                                i4++;
                            }
                            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                            String substring4 = str.substring(i, i4);
                            Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                            if (substring4.length() != 0) {
                                int length3 = i + substring4.length();
                                int i5 = length3;
                                while (i5 < str.length()) {
                                    if (!new CharRange('a', 'z').contains(str.charAt(i5))) {
                                        break;
                                    }
                                    i5++;
                                }
                                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                                String substring5 = str.substring(length3, i5);
                                Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
                                i = length3 + substring5.length();
                                DurationUnit durationUnitByShortName = DurationUnitKt__DurationUnitKt.durationUnitByShortName(substring5);
                                if (durationUnit2 == null || durationUnit2.compareTo(durationUnitByShortName) > 0) {
                                    String str4 = str3;
                                    int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) substring4, '.', 0, false, 6, (Object) null);
                                    if (indexOf$default2 > 0) {
                                        Intrinsics.checkNotNull(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring6 = substring4.substring(0, indexOf$default2);
                                        Intrinsics.checkNotNullExpressionValue(substring6, "substring(...)");
                                        long m74560plusLRDsOJo2 = Duration.m74560plusLRDsOJo(j, toDuration(Long.parseLong(substring6), durationUnitByShortName));
                                        Intrinsics.checkNotNull(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring7 = substring4.substring(indexOf$default2);
                                        Intrinsics.checkNotNullExpressionValue(substring7, "substring(...)");
                                        j = Duration.m74560plusLRDsOJo(m74560plusLRDsOJo2, toDuration(Double.parseDouble(substring7), durationUnitByShortName));
                                        if (i < length) {
                                            throw new IllegalArgumentException("Fractional component must be last");
                                        }
                                    } else {
                                        j = Duration.m74560plusLRDsOJo(j, toDuration(Long.parseLong(substring4), durationUnitByShortName));
                                    }
                                    durationUnit2 = durationUnitByShortName;
                                    str3 = str4;
                                    z6 = true;
                                } else {
                                    throw new IllegalArgumentException(str3);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        m74606getZEROUwyO8pc = j;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                if (z3) {
                    return Duration.m74577unaryMinusUwyO8pc(m74606getZEROUwyO8pc);
                }
                return m74606getZEROUwyO8pc;
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0073  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long m27414i(java.lang.String r9) {
        /*
            int r0 = r9.length()
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            if (r0 <= 0) goto L18
            java.lang.String r5 = "+-"
            char r6 = r9.charAt(r4)
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default(r5, r6, r4, r3, r2)
            if (r5 == 0) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            int r0 = r0 - r5
            r6 = 16
            if (r0 <= r6) goto L6b
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r6 = kotlin.text.StringsKt__StringsKt.getLastIndex(r9)
            r0.<init>(r5, r6)
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L35
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L35
            goto L5a
        L35:
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L5a
            r5 = r0
            kotlin.collections.IntIterator r5 = (kotlin.collections.IntIterator) r5
            int r5 = r5.nextInt()
            kotlin.ranges.CharRange r6 = new kotlin.ranges.CharRange
            r7 = 48
            r8 = 57
            r6.<init>(r7, r8)
            char r5 = r9.charAt(r5)
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L39
            goto L6b
        L5a:
            char r9 = r9.charAt(r4)
            r0 = 45
            if (r9 != r0) goto L65
            r0 = -9223372036854775808
            goto L6a
        L65:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6a:
            return r0
        L6b:
            java.lang.String r0 = "+"
            boolean r0 = p000.AbstractC20204hN1.startsWith$default(r9, r0, r4, r3, r2)
            if (r0 == 0) goto L77
            java.lang.String r9 = kotlin.text.StringsKt___StringsKt.drop(r9, r1)
        L77:
            long r0 = java.lang.Long.parseLong(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.DurationKt.m27414i(java.lang.String):long");
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(int i, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(DurationUnit.SECONDS) <= 0) {
            return m27419d(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i, unit, DurationUnit.NANOSECONDS));
        }
        return toDuration(i, unit);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(int i) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(long j) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(long j) {
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(long j, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long convertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(MAX_NANOS, durationUnit, unit);
        if (new LongRange(-convertDurationUnitOverflow, convertDurationUnitOverflow).contains(j)) {
            return m27419d(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j, unit, durationUnit));
        }
        return m27421b(AbstractC11719c.coerceIn(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, (long) MAX_MILLIS));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(double d, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, unit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(convertDurationUnit)) {
            long roundToLong = AbstractC21140mr0.roundToLong(convertDurationUnit);
            if (new LongRange(-4611686018426999999L, MAX_NANOS).contains(roundToLong)) {
                return m27419d(roundToLong);
            }
            return m27420c(AbstractC21140mr0.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, unit, DurationUnit.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }
}
