package kotlin.time;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.LongRange;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.6")
@Metadata(m28851d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b>\b\u0087@\u0018\u0000 ¡\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¡\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u001b\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010%\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\r\u0010'\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\bJ\r\u0010)\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\bJ\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\bJ\r\u0010-\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\bJ\u0018\u00100\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u009d\u0001\u0010=\u001a\u00028\u0000\"\u0004\b\u0000\u001012u\u0010:\u001aq\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(6\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(8\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(9\u0012\u0004\u0012\u00028\u000002H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b;\u0010<J\u0088\u0001\u0010=\u001a\u00028\u0000\"\u0004\b\u0000\u001012`\u0010:\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(6\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(8\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(9\u0012\u0004\u0012\u00028\u00000>H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b;\u0010?Js\u0010=\u001a\u00028\u0000\"\u0004\b\u0000\u001012K\u0010:\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(8\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(9\u0012\u0004\u0012\u00028\u00000@H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b;\u0010AJ^\u0010=\u001a\u00028\u0000\"\u0004\b\u0000\u0010126\u0010:\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(8\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(9\u0012\u0004\u0012\u00028\u00000BH\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b;\u0010CJ\u0015\u0010F\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bD\u0010EJ\u0015\u0010H\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bG\u0010$J\u0015\u0010K\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bI\u0010JJ\u000f\u0010M\u001a\u00020\u0002H\u0007¢\u0006\u0004\bL\u0010\u0005J\u000f\u0010O\u001a\u00020\u0002H\u0007¢\u0006\u0004\bN\u0010\u0005J\u000f\u0010S\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ?\u0010[\u001a\u00020Z*\u00060Tj\u0002`U2\u0006\u0010V\u001a\u00020\u00162\u0006\u0010W\u001a\u00020\u00162\u0006\u0010X\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020P2\u0006\u0010Y\u001a\u00020\u0006H\u0002¢\u0006\u0004\b[\u0010\\J\u001f\u0010S\u001a\u00020P2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010]\u001a\u00020\u0016¢\u0006\u0004\bQ\u0010^J\r\u0010`\u001a\u00020P¢\u0006\u0004\b_\u0010RJ\u0010\u0010c\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\ba\u0010bJ\u001a\u0010g\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010dHÖ\u0003¢\u0006\u0004\be\u0010fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010hR\u0014\u0010j\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0014\u0010m\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bn\u0010\u0005R\u001a\u0010s\u001a\u00020\u00168@X\u0081\u0004¢\u0006\f\u0012\u0004\bq\u0010r\u001a\u0004\bp\u0010bR\u001a\u0010v\u001a\u00020\u00168@X\u0081\u0004¢\u0006\f\u0012\u0004\bu\u0010r\u001a\u0004\bt\u0010bR\u001a\u0010y\u001a\u00020\u00168@X\u0081\u0004¢\u0006\f\u0012\u0004\bx\u0010r\u001a\u0004\bw\u0010bR\u001a\u0010|\u001a\u00020\u00168@X\u0081\u0004¢\u0006\f\u0012\u0004\b{\u0010r\u001a\u0004\bz\u0010bR\u001b\u0010\u0080\u0001\u001a\u00020\u001b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u007f\u0010r\u001a\u0004\b}\u0010~R\u001d\u0010\u0083\u0001\u001a\u00020\u001b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010r\u001a\u0005\b\u0081\u0001\u0010~R\u001d\u0010\u0086\u0001\u001a\u00020\u001b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010r\u001a\u0005\b\u0084\u0001\u0010~R\u001d\u0010\u0089\u0001\u001a\u00020\u001b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0088\u0001\u0010r\u001a\u0005\b\u0087\u0001\u0010~R\u001d\u0010\u008c\u0001\u001a\u00020\u001b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008b\u0001\u0010r\u001a\u0005\b\u008a\u0001\u0010~R\u001d\u0010\u008f\u0001\u001a\u00020\u001b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u0010r\u001a\u0005\b\u008d\u0001\u0010~R\u001d\u0010\u0092\u0001\u001a\u00020\u001b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0091\u0001\u0010r\u001a\u0005\b\u0090\u0001\u0010~R\u0013\u0010\u0094\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u0005R\u0013\u0010\u0096\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\u0005R\u0013\u0010\u0098\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010\u0005R\u0013\u0010\u009a\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010\u0005R\u0013\u0010\u009c\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\u0005R\u0013\u0010\u009e\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u0005R\u0013\u0010 \u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006¢\u0001"}, m28850d2 = {"Lkotlin/time/Duration;", "", "", "rawValue", "constructor-impl", "(J)J", "", OperatorName.FILL_NON_ZERO, "(J)Z", "e", "unaryMinus-UwyO8pc", "unaryMinus", "other", "plus-LRDsOJo", "(JJ)J", "plus", "thisMillis", "otherNanos", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JJJ)J", "minus-LRDsOJo", "minus", "", "scale", "times-UwyO8pc", "(JI)J", "times", "", "(JD)J", "div-UwyO8pc", "div", "div-LRDsOJo", "(JJ)D", "Lkotlin/time/DurationUnit;", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "truncateTo", "isNegative-impl", "isNegative", "isPositive-impl", "isPositive", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "compareTo-LRDsOJo", "(JJ)I", "compareTo", "T", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "action", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "toComponents", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toDouble", "toLong-impl", "toLong", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toInt", "toLongNanoseconds-impl", "toLongNanoseconds", "toLongMilliseconds-impl", "toLongMilliseconds", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString-impl", "toIsoString", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", OperatorName.SET_LINE_CAPSTYLE, "d", "value", OperatorName.CURVE_TO, "(J)Lkotlin/time/DurationUnit;", "storageUnit", "getAbsoluteValue-UwyO8pc", "absoluteValue", "getHoursComponent-impl", "getHoursComponent$annotations", "()V", "hoursComponent", "getMinutesComponent-impl", "getMinutesComponent$annotations", "minutesComponent", "getSecondsComponent-impl", "getSecondsComponent$annotations", "secondsComponent", "getNanosecondsComponent-impl", "getNanosecondsComponent$annotations", "nanosecondsComponent", "getInDays-impl", "(J)D", "getInDays$annotations", "inDays", "getInHours-impl", "getInHours$annotations", "inHours", "getInMinutes-impl", "getInMinutes$annotations", "inMinutes", "getInSeconds-impl", "getInSeconds$annotations", "inSeconds", "getInMilliseconds-impl", "getInMilliseconds$annotations", "inMilliseconds", "getInMicroseconds-impl", "getInMicroseconds$annotations", "inMicroseconds", "getInNanoseconds-impl", "getInNanoseconds$annotations", "inNanoseconds", "getInWholeDays-impl", "inWholeDays", "getInWholeHours-impl", "inWholeHours", "getInWholeMinutes-impl", "inWholeMinutes", "getInWholeSeconds-impl", "inWholeSeconds", "getInWholeMilliseconds-impl", "inWholeMilliseconds", "getInWholeMicroseconds-impl", "inWholeMicroseconds", "getInWholeNanoseconds-impl", "inWholeNanoseconds", "Companion", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
@JvmInline
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1495:1\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n38#1:1500\n683#1,2:1501\n700#1,2:1510\n163#2,6:1503\n1#3:1509\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1496\n40#1:1497\n458#1:1498\n478#1:1499\n662#1:1500\n979#1:1501,2\n1070#1:1510,2\n1021#1:1503,6\n*E\n"})
/* loaded from: classes6.dex */
public final class Duration implements Comparable<Duration> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final long f70560b = m74529constructorimpl(0);

    /* renamed from: c */
    public static final long f70561c = DurationKt.access$durationOfMillis(DurationKt.MAX_MILLIS);

    /* renamed from: d */
    public static final long f70562d = DurationKt.access$durationOfMillis(-4611686018427387903L);

    /* renamed from: a */
    public final long f70563a;

    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b$\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0011J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000eJ\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0012J\u001a\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000eJ\u001a\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b#\u0010!J\u001a\u0010'\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b(\u0010&R\u001a\u0010*\u001a\u00020\f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u001d\u00100\u001a\u00020\f8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\"\u0010\u000f\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u000eR\"\u0010\u000f\u001a\u00020\f*\u00020\u00108Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b3\u00105\u001a\u0004\b2\u0010\u0011R\"\u0010\u000f\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b3\u00106\u001a\u0004\b2\u0010\u0012R\"\u0010\u0014\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010\u000eR\"\u0010\u0014\u001a\u00020\f*\u00020\u00108Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010\u0011R\"\u0010\u0014\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010\u0012R\"\u0010\u0016\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010\u000eR\"\u0010\u0016\u001a\u00020\f*\u00020\u00108Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b:\u00105\u001a\u0004\b9\u0010\u0011R\"\u0010\u0016\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010\u0012R\"\u0010\u0018\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010\u000eR\"\u0010\u0018\u001a\u00020\f*\u00020\u00108Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b<\u00105\u001a\u0004\b;\u0010\u0011R\"\u0010\u0018\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010\u0012R\"\u0010\u001a\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010\u000eR\"\u0010\u001a\u001a\u00020\f*\u00020\u00108Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b>\u00105\u001a\u0004\b=\u0010\u0011R\"\u0010\u001a\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b>\u00106\u001a\u0004\b=\u0010\u0012R\"\u0010\u001c\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b@\u00104\u001a\u0004\b?\u0010\u000eR\"\u0010\u001c\u001a\u00020\f*\u00020\u00108Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b@\u00105\u001a\u0004\b?\u0010\u0011R\"\u0010\u001c\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010\u0012R\"\u0010\u001e\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bB\u00104\u001a\u0004\bA\u0010\u000eR\"\u0010\u001e\u001a\u00020\f*\u00020\u00108Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bB\u00105\u001a\u0004\bA\u0010\u0011R\"\u0010\u001e\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010\u0012\u0082\u0002\u0004\n\u0002\b!¨\u0006C"}, m28850d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "", "value", "Lkotlin/time/DurationUnit;", "sourceUnit", "targetUnit", "convert", "(DLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)D", "", "Lkotlin/time/Duration;", "nanoseconds-UwyO8pc", "(I)J", "nanoseconds", "", "(J)J", "(D)J", "microseconds-UwyO8pc", "microseconds", "milliseconds-UwyO8pc", "milliseconds", "seconds-UwyO8pc", "seconds", "minutes-UwyO8pc", "minutes", "hours-UwyO8pc", "hours", "days-UwyO8pc", "days", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parse", "parseIsoString-UwyO8pc", "parseIsoString", "parseOrNull-FghU774", "(Ljava/lang/String;)Lkotlin/time/Duration;", "parseOrNull", "parseIsoStringOrNull-FghU774", "parseIsoStringOrNull", "ZERO", OperatorName.SET_LINE_CAPSTYLE, "getZERO-UwyO8pc", "()J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "getNanoseconds-UwyO8pc", "getNanoseconds-UwyO8pc$annotations", "(I)V", "(J)V", "(D)V", "getMicroseconds-UwyO8pc", "getMicroseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "getMilliseconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "getSeconds-UwyO8pc$annotations", "getMinutes-UwyO8pc", "getMinutes-UwyO8pc$annotations", "getHours-UwyO8pc", "getHours-UwyO8pc$annotations", "getDays-UwyO8pc", "getDays-UwyO8pc$annotations", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74580getDaysUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74583getHoursUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74586getMicrosecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74589getMillisecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74592getMinutesUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74595getNanosecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74598getSecondsUwyO8pc$annotations(double d) {
        }

        @ExperimentalTime
        public final double convert(double d, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, sourceUnit, targetUnit);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74602daysUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.DAYS);
        }

        /* renamed from: getINFINITE-UwyO8pc  reason: not valid java name */
        public final long m74604getINFINITEUwyO8pc() {
            return Duration.f70561c;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib  reason: not valid java name */
        public final long m74605getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.f70562d;
        }

        /* renamed from: getZERO-UwyO8pc  reason: not valid java name */
        public final long m74606getZEROUwyO8pc() {
            return Duration.f70560b;
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74608hoursUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74611microsecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74614millisecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74617minutesUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74620nanosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.NANOSECONDS);
        }

        /* renamed from: parse-UwyO8pc  reason: not valid java name */
        public final long m74622parseUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, false);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc  reason: not valid java name */
        public final long m74623parseIsoStringUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }

        @Nullable
        /* renamed from: parseIsoStringOrNull-FghU774  reason: not valid java name */
        public final Duration m74624parseIsoStringOrNullFghU774(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m74527boximpl(DurationKt.access$parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        /* renamed from: parseOrNull-FghU774  reason: not valid java name */
        public final Duration m74625parseOrNullFghU774(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m74527boximpl(DurationKt.access$parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74627secondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.SECONDS);
        }

        public Companion() {
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74581getDaysUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74584getHoursUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74587getMicrosecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74590getMillisecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74593getMinutesUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74596getNanosecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74599getSecondsUwyO8pc$annotations(int i) {
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74603daysUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74609hoursUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74612microsecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74615millisecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74618minutesUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74621nanosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74628secondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74582getDaysUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74585getHoursUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74588getMicrosecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74591getMillisecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74594getMinutesUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74597getNanosecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m74600getSecondsUwyO8pc$annotations(long j) {
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74601daysUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74607hoursUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74610microsecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74613millisecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74616minutesUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74619nanosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final /* synthetic */ long m74626secondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.SECONDS);
        }
    }

    public /* synthetic */ Duration(long j) {
        this.f70563a = j;
    }

    /* renamed from: a */
    public static final long m27429a(long j, long j2, long j3) {
        long access$nanosToMillis = DurationKt.access$nanosToMillis(j3);
        long j4 = j2 + access$nanosToMillis;
        if (new LongRange(-4611686018426L, 4611686018426L).contains(j4)) {
            return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(j4) + (j3 - DurationKt.access$millisToNanos(access$nanosToMillis)));
        }
        return DurationKt.access$durationOfMillis(AbstractC11719c.coerceIn(j4, -4611686018427387903L, (long) DurationKt.MAX_MILLIS));
    }

    /* renamed from: b */
    public static final void m27428b(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String padStart = StringsKt__StringsKt.padStart(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) padStart, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Duration m74527boximpl(long j) {
        return new Duration(j);
    }

    /* renamed from: c */
    public static final DurationUnit m27427c(long j) {
        if (m27424f(j)) {
            return DurationUnit.NANOSECONDS;
        }
        return DurationUnit.MILLISECONDS;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m74529constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m27424f(j)) {
                if (!new LongRange(-4611686018426999999L, DurationKt.MAX_NANOS).contains(m27426d(j))) {
                    throw new AssertionError(m27426d(j) + " ns is out of nanoseconds range");
                }
            } else if (new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS).contains(m27426d(j))) {
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m27426d(j))) {
                    throw new AssertionError(m27426d(j) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(m27426d(j) + " ms is out of milliseconds range");
            }
        }
        return j;
    }

    /* renamed from: d */
    public static final long m27426d(long j) {
        return j >> 1;
    }

    /* renamed from: div-LRDsOJo  reason: not valid java name */
    public static final double m74530divLRDsOJo(long j, long j2) {
        DurationUnit durationUnit = (DurationUnit) AbstractC16931vu.maxOf(m27427c(j), m27427c(j2));
        return m74567toDoubleimpl(j, durationUnit) / m74567toDoubleimpl(j2, durationUnit);
    }

    /* renamed from: div-UwyO8pc  reason: not valid java name */
    public static final long m74532divUwyO8pc(long j, int i) {
        if (i == 0) {
            if (m74558isPositiveimpl(j)) {
                return f70561c;
            }
            if (m74557isNegativeimpl(j)) {
                return f70562d;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        } else if (m27424f(j)) {
            return DurationKt.access$durationOfNanos(m27426d(j) / i);
        } else {
            if (m74556isInfiniteimpl(j)) {
                return m74562timesUwyO8pc(j, AbstractC21140mr0.getSign(i));
            }
            long j2 = i;
            long m27426d = m27426d(j) / j2;
            if (new LongRange(-4611686018426L, 4611686018426L).contains(m27426d)) {
                return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(m27426d) + (DurationKt.access$millisToNanos(m27426d(j) - (m27426d * j2)) / j2));
            }
            return DurationKt.access$durationOfMillis(m27426d);
        }
    }

    /* renamed from: e */
    public static final boolean m27425e(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m74533equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m74579unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m74534equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final boolean m27424f(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc  reason: not valid java name */
    public static final long m74535getAbsoluteValueUwyO8pc(long j) {
        if (m74557isNegativeimpl(j)) {
            return m74577unaryMinusUwyO8pc(j);
        }
        return j;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl  reason: not valid java name */
    public static final int m74536getHoursComponentimpl(long j) {
        if (m74556isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m74545getInWholeHoursimpl(j) % 24);
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInDays$annotations() {
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInHours$annotations() {
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    /* renamed from: getInWholeDays-impl  reason: not valid java name */
    public static final long m74544getInWholeDaysimpl(long j) {
        return m74570toLongimpl(j, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl  reason: not valid java name */
    public static final long m74545getInWholeHoursimpl(long j) {
        return m74570toLongimpl(j, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl  reason: not valid java name */
    public static final long m74546getInWholeMicrosecondsimpl(long j) {
        return m74570toLongimpl(j, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl  reason: not valid java name */
    public static final long m74547getInWholeMillisecondsimpl(long j) {
        if (m27425e(j) && m74555isFiniteimpl(j)) {
            return m27426d(j);
        }
        return m74570toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl  reason: not valid java name */
    public static final long m74548getInWholeMinutesimpl(long j) {
        return m74570toLongimpl(j, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl  reason: not valid java name */
    public static final long m74549getInWholeNanosecondsimpl(long j) {
        long m27426d = m27426d(j);
        if (!m27424f(j)) {
            if (m27426d > 9223372036854L) {
                return Long.MAX_VALUE;
            }
            if (m27426d < -9223372036854L) {
                return Long.MIN_VALUE;
            }
            return DurationKt.access$millisToNanos(m27426d);
        }
        return m27426d;
    }

    /* renamed from: getInWholeSeconds-impl  reason: not valid java name */
    public static final long m74550getInWholeSecondsimpl(long j) {
        return m74570toLongimpl(j, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl  reason: not valid java name */
    public static final int m74551getMinutesComponentimpl(long j) {
        if (m74556isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m74548getInWholeMinutesimpl(j) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl  reason: not valid java name */
    public static final int m74552getNanosecondsComponentimpl(long j) {
        long m27426d;
        if (m74556isInfiniteimpl(j)) {
            return 0;
        }
        if (m27425e(j)) {
            m27426d = DurationKt.access$millisToNanos(m27426d(j) % 1000);
        } else {
            m27426d = m27426d(j) % 1000000000;
        }
        return (int) m27426d;
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl  reason: not valid java name */
    public static final int m74553getSecondsComponentimpl(long j) {
        if (m74556isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m74550getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m74554hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m74555isFiniteimpl(long j) {
        return !m74556isInfiniteimpl(j);
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m74556isInfiniteimpl(long j) {
        if (j != f70561c && j != f70562d) {
            return false;
        }
        return true;
    }

    /* renamed from: isNegative-impl  reason: not valid java name */
    public static final boolean m74557isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: isPositive-impl  reason: not valid java name */
    public static final boolean m74558isPositiveimpl(long j) {
        return j > 0;
    }

    /* renamed from: minus-LRDsOJo  reason: not valid java name */
    public static final long m74559minusLRDsOJo(long j, long j2) {
        return m74560plusLRDsOJo(j, m74577unaryMinusUwyO8pc(j2));
    }

    /* renamed from: plus-LRDsOJo  reason: not valid java name */
    public static final long m74560plusLRDsOJo(long j, long j2) {
        if (m74556isInfiniteimpl(j)) {
            if (!m74555isFiniteimpl(j2) && (j2 ^ j) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j;
        } else if (m74556isInfiniteimpl(j2)) {
            return j2;
        } else {
            if ((((int) j) & 1) == (((int) j2) & 1)) {
                long m27426d = m27426d(j) + m27426d(j2);
                if (m27424f(j)) {
                    return DurationKt.access$durationOfNanosNormalized(m27426d);
                }
                return DurationKt.access$durationOfMillisNormalized(m27426d);
            } else if (m27425e(j)) {
                return m27429a(j, m27426d(j), m27426d(j2));
            } else {
                return m27429a(j, m27426d(j2), m27426d(j));
            }
        }
    }

    /* renamed from: times-UwyO8pc  reason: not valid java name */
    public static final long m74562timesUwyO8pc(long j, int i) {
        if (m74556isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m74577unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        } else if (i == 0) {
            return f70560b;
        } else {
            long m27426d = m27426d(j);
            long j2 = i;
            long j3 = m27426d * j2;
            if (m27424f(j)) {
                if (new LongRange(-2147483647L, 2147483647L).contains(m27426d)) {
                    return DurationKt.access$durationOfNanos(j3);
                }
                if (j3 / j2 == m27426d) {
                    return DurationKt.access$durationOfNanosNormalized(j3);
                }
                long access$nanosToMillis = DurationKt.access$nanosToMillis(m27426d);
                long j4 = access$nanosToMillis * j2;
                long access$nanosToMillis2 = DurationKt.access$nanosToMillis((m27426d - DurationKt.access$millisToNanos(access$nanosToMillis)) * j2) + j4;
                if (j4 / j2 != access$nanosToMillis || (access$nanosToMillis2 ^ j4) < 0) {
                    return AbstractC21140mr0.getSign(m27426d) * AbstractC21140mr0.getSign(i) > 0 ? f70561c : f70562d;
                }
                return DurationKt.access$durationOfMillis(AbstractC11719c.coerceIn(access$nanosToMillis2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            } else if (j3 / j2 == m27426d) {
                return DurationKt.access$durationOfMillis(AbstractC11719c.coerceIn(j3, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            } else {
                return AbstractC21140mr0.getSign(m27426d) * AbstractC21140mr0.getSign(i) > 0 ? f70561c : f70562d;
            }
        }
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m74566toComponentsimpl(long j, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m74544getInWholeDaysimpl(j)), Integer.valueOf(m74536getHoursComponentimpl(j)), Integer.valueOf(m74551getMinutesComponentimpl(j)), Integer.valueOf(m74553getSecondsComponentimpl(j)), Integer.valueOf(m74552getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m74567toDoubleimpl(long j, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == f70561c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f70562d) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m27426d(j), m27427c(j), unit);
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m74568toIntimpl(long j, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) AbstractC11719c.coerceIn(m74570toLongimpl(j, unit), -2147483648L, 2147483647L);
    }

    @NotNull
    /* renamed from: toIsoString-impl  reason: not valid java name */
    public static final String m74569toIsoStringimpl(long j) {
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        if (m74557isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long m74535getAbsoluteValueUwyO8pc = m74535getAbsoluteValueUwyO8pc(j);
        long m74545getInWholeHoursimpl = m74545getInWholeHoursimpl(m74535getAbsoluteValueUwyO8pc);
        int m74551getMinutesComponentimpl = m74551getMinutesComponentimpl(m74535getAbsoluteValueUwyO8pc);
        int m74553getSecondsComponentimpl = m74553getSecondsComponentimpl(m74535getAbsoluteValueUwyO8pc);
        int m74552getNanosecondsComponentimpl = m74552getNanosecondsComponentimpl(m74535getAbsoluteValueUwyO8pc);
        if (m74556isInfiniteimpl(j)) {
            m74545getInWholeHoursimpl = 9999999999999L;
        }
        boolean z3 = false;
        if (m74545getInWholeHoursimpl != 0) {
            z = true;
        } else {
            z = false;
        }
        if (m74553getSecondsComponentimpl == 0 && m74552getNanosecondsComponentimpl == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (m74551getMinutesComponentimpl != 0 || (z2 && z)) {
            z3 = true;
        }
        if (z) {
            sb.append(m74545getInWholeHoursimpl);
            sb.append('H');
        }
        if (z3) {
            sb.append(m74551getMinutesComponentimpl);
            sb.append('M');
        }
        if (z2 || (!z && !z3)) {
            m27428b(j, sb, m74553getSecondsComponentimpl, m74552getNanosecondsComponentimpl, 9, "S", true);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m74570toLongimpl(long j, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == f70561c) {
            return Long.MAX_VALUE;
        }
        if (j == f70562d) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m27426d(j), m27427c(j), unit);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m74573toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f70561c) {
            return "Infinity";
        }
        if (j == f70562d) {
            return "-Infinity";
        }
        boolean m74557isNegativeimpl = m74557isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (m74557isNegativeimpl) {
            sb.append('-');
        }
        long m74535getAbsoluteValueUwyO8pc = m74535getAbsoluteValueUwyO8pc(j);
        long m74544getInWholeDaysimpl = m74544getInWholeDaysimpl(m74535getAbsoluteValueUwyO8pc);
        int m74536getHoursComponentimpl = m74536getHoursComponentimpl(m74535getAbsoluteValueUwyO8pc);
        int m74551getMinutesComponentimpl = m74551getMinutesComponentimpl(m74535getAbsoluteValueUwyO8pc);
        int m74553getSecondsComponentimpl = m74553getSecondsComponentimpl(m74535getAbsoluteValueUwyO8pc);
        int m74552getNanosecondsComponentimpl = m74552getNanosecondsComponentimpl(m74535getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m74544getInWholeDaysimpl != 0;
        boolean z2 = m74536getHoursComponentimpl != 0;
        boolean z3 = m74551getMinutesComponentimpl != 0;
        boolean z4 = (m74553getSecondsComponentimpl == 0 && m74552getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m74544getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(TokenParser.f74560SP);
            }
            sb.append(m74536getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(TokenParser.f74560SP);
            }
            sb.append(m74551getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(TokenParser.f74560SP);
            }
            if (m74553getSecondsComponentimpl != 0 || z || z2 || z3) {
                m27428b(j, sb, m74553getSecondsComponentimpl, m74552getNanosecondsComponentimpl, 9, OperatorName.CLOSE_AND_STROKE, false);
            } else if (m74552getNanosecondsComponentimpl >= 1000000) {
                m27428b(j, sb, m74552getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, m74552getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (m74552getNanosecondsComponentimpl >= 1000) {
                m27428b(j, sb, m74552getNanosecondsComponentimpl / 1000, m74552getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m74552getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (m74557isNegativeimpl && i > 1) {
            sb.insert(1, CoreConstants.LEFT_PARENTHESIS_CHAR).append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: toString-impl$default  reason: not valid java name */
    public static /* synthetic */ String m74575toStringimpl$default(long j, DurationUnit durationUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m74574toStringimpl(j, durationUnit, i);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib  reason: not valid java name */
    public static final long m74576truncateToUwyO8pc$kotlin_stdlib(long j, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit m27427c = m27427c(j);
        if (unit.compareTo(m27427c) > 0 && !m74556isInfiniteimpl(j)) {
            return DurationKt.toDuration(m27426d(j) - (m27426d(j) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, m27427c)), m27427c);
        }
        return j;
    }

    /* renamed from: unaryMinus-UwyO8pc  reason: not valid java name */
    public static final long m74577unaryMinusUwyO8pc(long j) {
        return DurationKt.access$durationOf(-m27426d(j), ((int) j) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m74578compareToLRDsOJo(duration.m74579unboximpl());
    }

    /* renamed from: compareTo-LRDsOJo  reason: not valid java name */
    public int m74578compareToLRDsOJo(long j) {
        return m74528compareToLRDsOJo(this.f70563a, j);
    }

    public boolean equals(Object obj) {
        return m74533equalsimpl(this.f70563a, obj);
    }

    public int hashCode() {
        return m74554hashCodeimpl(this.f70563a);
    }

    @NotNull
    public String toString() {
        return m74573toStringimpl(this.f70563a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m74579unboximpl() {
        return this.f70563a;
    }

    /* renamed from: compareTo-LRDsOJo  reason: not valid java name */
    public static int m74528compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m74557isNegativeimpl(j) ? -i : i;
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m74565toComponentsimpl(long j, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m74545getInWholeHoursimpl(j)), Integer.valueOf(m74551getMinutesComponentimpl(j)), Integer.valueOf(m74553getSecondsComponentimpl(j)), Integer.valueOf(m74552getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m74564toComponentsimpl(long j, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m74548getInWholeMinutesimpl(j)), Integer.valueOf(m74553getSecondsComponentimpl(j)), Integer.valueOf(m74552getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m74563toComponentsimpl(long j, @NotNull Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m74550getInWholeSecondsimpl(j)), Integer.valueOf(m74552getNanosecondsComponentimpl(j)));
    }

    /* renamed from: div-UwyO8pc  reason: not valid java name */
    public static final long m74531divUwyO8pc(long j, double d) {
        int roundToInt = AbstractC21140mr0.roundToInt(d);
        if (roundToInt == d && roundToInt != 0) {
            return m74532divUwyO8pc(j, roundToInt);
        }
        DurationUnit m27427c = m27427c(j);
        return DurationKt.toDuration(m74567toDoubleimpl(j, m27427c) / d, m27427c);
    }

    /* renamed from: times-UwyO8pc  reason: not valid java name */
    public static final long m74561timesUwyO8pc(long j, double d) {
        int roundToInt = AbstractC21140mr0.roundToInt(d);
        if (roundToInt == d) {
            return m74562timesUwyO8pc(j, roundToInt);
        }
        DurationUnit m27427c = m27427c(j);
        return DurationKt.toDuration(m74567toDoubleimpl(j, m27427c) * d, m27427c);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static final String m74574toStringimpl(long j, @NotNull DurationUnit unit, int i) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i >= 0) {
            double m74567toDoubleimpl = m74567toDoubleimpl(j, unit);
            if (Double.isInfinite(m74567toDoubleimpl)) {
                return String.valueOf(m74567toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(m74567toDoubleimpl, AbstractC11719c.coerceAtMost(i, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
    }
}
