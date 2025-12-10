package kotlin.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.text.HexFormat;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000H\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\t\u001aG\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aG\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0012\u001a'\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!\u001a#\u0010#\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020%2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010&\u001a\u001d\u0010'\u001a\u00020%*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b'\u0010(\u001a1\u0010)\u001a\u00020%*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b)\u0010*\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020+2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010,\u001a\u001d\u0010-\u001a\u00020+*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b-\u0010.\u001a1\u0010/\u001a\u00020+*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b/\u00100\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u00101\u001a\u001d\u00102\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b2\u00103\u001a1\u00104\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b4\u00105\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00192\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u00106\u001a\u001d\u00107\u001a\u00020\u0019*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b7\u00108\u001a1\u00109\u001a\u00020\u0019*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b9\u0010:\u001a#\u0010<\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u0006H\u0003¢\u0006\u0004\b<\u0010=\u001a7\u0010?\u001a\u00020\u0019*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u0006H\u0003¢\u0006\u0004\b?\u0010@\u001a3\u0010C\u001a\u00020\u0006*\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010D\u001a3\u0010H\u001a\u00020G*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bH\u0010I\u001a\u001b\u0010J\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010K\"\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010M¨\u0006O"}, m29142d2 = {"", "Lkotlin/text/HexFormat;", "format", "", "toHexString", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "", "startIndex", "endIndex", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "formattedStringLength", "(IIIIIII)I", "hexToByteArray", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", OperatorName.NON_STROKING_GRAY, "(Ljava/lang/String;IILkotlin/text/HexFormat;)[B", "stringLength", "parsedByteArrayMaxSize", "", "charsPerElement", "elementsPerSet", "elementSeparatorLength", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JII)J", "charsPerSet", OperatorName.MOVE_TO, "(JJI)J", FirebaseAnalytics.Param.INDEX, "d", "(Ljava/lang/String;II)I", "", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToByte", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", OperatorName.FILL_NON_ZERO, "(Ljava/lang/String;IILkotlin/text/HexFormat;)B", "", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToShort", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", OperatorName.NON_STROKING_CMYK, "(Ljava/lang/String;IILkotlin/text/HexFormat;)S", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToInt", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", OperatorName.CLOSE_PATH, "(Ljava/lang/String;IILkotlin/text/HexFormat;)I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToLong", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "i", "(Ljava/lang/String;IILkotlin/text/HexFormat;)J", "bits", OperatorName.LINE_TO, "(JLkotlin/text/HexFormat;I)Ljava/lang/String;", "maxDigits", OperatorName.SET_LINE_JOINSTYLE, "(Ljava/lang/String;IILkotlin/text/HexFormat;I)J", "part", "partName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)I", "", "requireMaxLength", "", OperatorName.CURVE_TO, "(Ljava/lang/String;IIIZ)V", "e", "(Ljava/lang/String;I)I", "", "[I", "HEX_DIGITS_TO_DECIMAL", "kotlin-stdlib"}, m29141k = 2, m29140mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,591:1\n1#2:592\n1183#3,3:593\n1183#3,3:596\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n13#1:593,3\n14#1:596,3\n*E\n"})
/* loaded from: classes6.dex */
public final class HexExtensionsKt {

    /* renamed from: a */
    public static final int[] f70540a;

    static {
        int[] iArr = new int[128];
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            iArr[i2] = -1;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < "0123456789abcdef".length()) {
            iArr["0123456789abcdef".charAt(i3)] = i4;
            i3++;
            i4++;
        }
        int i5 = 0;
        while (i < "0123456789ABCDEF".length()) {
            iArr["0123456789ABCDEF".charAt(i)] = i5;
            i++;
            i5++;
        }
        f70540a = iArr;
    }

    /* renamed from: a */
    public static final long m27754a(long j, int i, int i2) {
        if (i > 0) {
            long j2 = i;
            return (j * j2) + (i2 * (j2 - 1));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: b */
    public static final int m27753b(String str, String str2, int i, int i2, String str3) {
        int length = str2.length() + i;
        if (length <= i2 && AbstractC19741eO1.regionMatches(str, i, str2, 0, str2.length(), true)) {
            return length;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(str3);
        sb.append(" \"");
        sb.append(str2);
        sb.append("\" at index ");
        sb.append(i);
        sb.append(", but was ");
        int coerceAtMost = AbstractC11695c.coerceAtMost(length, i2);
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, coerceAtMost);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb.append(substring);
        throw new NumberFormatException(sb.toString());
    }

    /* renamed from: c */
    public static final void m27752c(String str, int i, int i2, int i3, boolean z) {
        String str2;
        int i4 = i2 - i;
        if (z) {
            if (i4 == i3) {
                return;
            }
        } else if (i4 <= i3) {
            return;
        }
        if (z) {
            str2 = "exactly";
        } else {
            str2 = "at most";
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + TokenParser.f74644SP + i3 + " hexadecimal digits at index " + i + ", but was " + substring + " of length " + i4);
    }

    /* renamed from: d */
    public static final int m27751d(String str, int i, int i2) {
        if (str.charAt(i) == '\r') {
            int i3 = i + 1;
            if (i3 < i2 && str.charAt(i3) == '\n') {
                return i + 2;
            }
            return i3;
        } else if (str.charAt(i) == '\n') {
            return i + 1;
        } else {
            throw new NumberFormatException("Expected a new line at index " + i + ", but was " + str.charAt(i));
        }
    }

    /* renamed from: e */
    public static final int m27750e(String str, int i) {
        int i2;
        char charAt = str.charAt(i);
        if (charAt <= 127 && (i2 = f70540a[charAt]) >= 0) {
            return i2;
        }
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i + ", but was " + str.charAt(i));
    }

    /* renamed from: f */
    public static final byte m27749f(String str, int i, int i2, HexFormat hexFormat) {
        return (byte) m27745j(str, i, i2, hexFormat, 2);
    }

    public static final int formattedStringLength(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (i > 0) {
            int i10 = (i - 1) / i2;
            int i11 = (i2 - 1) / i3;
            int i12 = i % i2;
            if (i12 != 0) {
                i2 = i12;
            }
            long j = i10 + (((i11 * i10) + ((i2 - 1) / i3)) * i4) + (((i8 - i10) - i9) * i5) + (i * (i6 + 2 + i7));
            if (AbstractC11695c.intRangeContains((ClosedRange<Integer>) new IntRange(0, Integer.MAX_VALUE), j)) {
                return (int) j;
            }
            throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m74334toStringimpl(ULong.m74330constructorimpl(j))));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: g */
    public static final byte[] m27748g(String str, int i, int i2, HexFormat hexFormat) {
        int i3 = i;
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i3, i2, str.length());
        if (i3 == i2) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        String bytePrefix = bytes.getBytePrefix();
        String byteSuffix = bytes.getByteSuffix();
        String byteSeparator = bytes.getByteSeparator();
        String groupSeparator = bytes.getGroupSeparator();
        String str2 = byteSeparator;
        int parsedByteArrayMaxSize = parsedByteArrayMaxSize(i2 - i3, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] bArr = new byte[parsedByteArrayMaxSize];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < i2) {
            if (i5 == bytesPerLine) {
                i3 = m27751d(str, i3, i2);
                i5 = 0;
            } else if (i6 == bytesPerGroup) {
                i3 = m27753b(str, groupSeparator, i3, i2, "group separator");
            } else {
                if (i6 != 0) {
                    i3 = m27753b(str, str2, i3, i2, "byte separator");
                }
                i5++;
                i6++;
                int m27753b = m27753b(str, bytePrefix, i3, i2, "byte prefix");
                m27752c(str, m27753b, AbstractC11695c.coerceAtMost(m27753b + 2, i2), 2, true);
                bArr[i4] = (byte) ((m27750e(str, m27753b) << 4) | m27750e(str, m27753b + 1));
                i3 = m27753b(str, byteSuffix, m27753b + 2, i2, "byte suffix");
                i4++;
                str2 = str2;
            }
            i6 = 0;
            i5++;
            i6++;
            int m27753b2 = m27753b(str, bytePrefix, i3, i2, "byte prefix");
            m27752c(str, m27753b2, AbstractC11695c.coerceAtMost(m27753b2 + 2, i2), 2, true);
            bArr[i4] = (byte) ((m27750e(str, m27753b2) << 4) | m27750e(str, m27753b2 + 1));
            i3 = m27753b(str, byteSuffix, m27753b2 + 2, i2, "byte suffix");
            i4++;
            str2 = str2;
        }
        if (i4 != parsedByteArrayMaxSize) {
            byte[] copyOf = Arrays.copyOf(bArr, i4);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            return copyOf;
        }
        return bArr;
    }

    /* renamed from: h */
    public static final int m27747h(String str, int i, int i2, HexFormat hexFormat) {
        return (int) m27745j(str, i, i2, hexFormat, 8);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final byte hexToByte(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return m27749f(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final byte[] hexToByteArray(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return m27748g(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final int hexToInt(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return m27747h(str, 0, str.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final long hexToLong(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return m27746i(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final short hexToShort(@NotNull String str, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return m27744k(str, 0, str.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    /* renamed from: i */
    public static final long m27746i(String str, int i, int i2, HexFormat hexFormat) {
        return m27745j(str, i, i2, hexFormat, 16);
    }

    /* renamed from: j */
    public static final long m27745j(String str, int i, int i2, HexFormat hexFormat, int i3) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        String prefix = hexFormat.getNumber().getPrefix();
        String suffix = hexFormat.getNumber().getSuffix();
        if (prefix.length() + suffix.length() < i2 - i) {
            int m27753b = m27753b(str, prefix, i, i2, "prefix");
            int length = i2 - suffix.length();
            m27753b(str, suffix, length, i2, "suffix");
            m27752c(str, m27753b, length, i3, false);
            long j = 0;
            while (m27753b < length) {
                j = (j << 4) | m27750e(str, m27753b);
                m27753b++;
            }
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected a hexadecimal number with prefix \"");
        sb.append(prefix);
        sb.append("\" and suffix \"");
        sb.append(suffix);
        sb.append("\", but was ");
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb.append(substring);
        throw new NumberFormatException(sb.toString());
    }

    /* renamed from: k */
    public static final short m27744k(String str, int i, int i2, HexFormat hexFormat) {
        return (short) m27745j(str, i, i2, hexFormat, 4);
    }

    /* renamed from: l */
    public static final String m27743l(long j, HexFormat hexFormat, int i) {
        String str;
        if ((i & 3) == 0) {
            if (hexFormat.getUpperCase()) {
                str = "0123456789ABCDEF";
            } else {
                str = "0123456789abcdef";
            }
            String prefix = hexFormat.getNumber().getPrefix();
            String suffix = hexFormat.getNumber().getSuffix();
            boolean removeLeadingZeros = hexFormat.getNumber().getRemoveLeadingZeros();
            StringBuilder sb = new StringBuilder(prefix.length() + (i >> 2) + suffix.length());
            sb.append(prefix);
            while (i > 0) {
                i -= 4;
                int i2 = (int) ((j >> i) & 15);
                if (removeLeadingZeros && i2 == 0 && i > 0) {
                    removeLeadingZeros = true;
                } else {
                    removeLeadingZeros = false;
                }
                if (!removeLeadingZeros) {
                    sb.append(str.charAt(i2));
                }
            }
            sb.append(suffix);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: m */
    public static final long m27742m(long j, long j2, int i) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }

    public static final int parsedByteArrayMaxSize(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long m27754a;
        int i8;
        int i9;
        if (i > 0) {
            long j = i6 + 2 + i7;
            long m27754a2 = m27754a(j, i3, i5);
            if (i2 <= i3) {
                m27754a = m27754a(j, i2, i5);
            } else {
                m27754a = m27754a(m27754a2, i2 / i3, i4);
                int i10 = i2 % i3;
                if (i10 != 0) {
                    m27754a = m27754a + i4 + m27754a(j, i10, i5);
                }
            }
            long j2 = i;
            long m27742m = m27742m(j2, m27754a, 1);
            long j3 = j2 - ((m27754a + 1) * m27742m);
            long m27742m2 = m27742m(j3, m27754a2, i4);
            long j4 = j3 - ((m27754a2 + i4) * m27742m2);
            long m27742m3 = m27742m(j4, j, i5);
            if (j4 - ((j + i5) * m27742m3) > 0) {
                i9 = i2;
                i8 = 1;
            } else {
                i8 = 0;
                i9 = i2;
            }
            return (int) ((m27742m * i9) + (m27742m2 * i3) + m27742m3 + i8);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(@NotNull byte[] bArr, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[SYNTHETIC] */
    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.ExperimentalStdlibApi
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String toHexString(@org.jetbrains.annotations.NotNull byte[] r17, int r18, int r19, @org.jetbrains.annotations.NotNull kotlin.text.HexFormat r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "format"
            r4 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.collections.AbstractList$Companion r3 = kotlin.collections.AbstractList.Companion
            int r5 = r0.length
            r3.checkBoundsIndexes$kotlin_stdlib(r1, r2, r5)
            if (r1 != r2) goto L1d
            java.lang.String r0 = ""
            return r0
        L1d:
            boolean r3 = r20.getUpperCase()
            if (r3 == 0) goto L26
            java.lang.String r3 = "0123456789ABCDEF"
            goto L28
        L26:
            java.lang.String r3 = "0123456789abcdef"
        L28:
            kotlin.text.HexFormat$BytesHexFormat r4 = r20.getBytes()
            int r12 = r4.getBytesPerLine()
            int r13 = r4.getBytesPerGroup()
            java.lang.String r14 = r4.getBytePrefix()
            java.lang.String r15 = r4.getByteSuffix()
            java.lang.String r11 = r4.getByteSeparator()
            java.lang.String r4 = r4.getGroupSeparator()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r11.length()
            int r10 = r14.length()
            int r16 = r15.length()
            r6 = r12
            r7 = r13
            r1 = r11
            r11 = r16
            int r5 = formattedStringLength(r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r8 = r18
            r9 = 0
            r10 = 0
        L68:
            if (r8 >= r2) goto La2
            r11 = r0[r8]
            r7 = r11 & 255(0xff, float:3.57E-43)
            if (r9 != r12) goto L78
            r9 = 10
            r6.append(r9)
            r9 = 0
        L76:
            r10 = 0
            goto L7e
        L78:
            if (r10 != r13) goto L7e
            r6.append(r4)
            goto L76
        L7e:
            if (r10 == 0) goto L83
            r6.append(r1)
        L83:
            r6.append(r14)
            int r7 = r7 >> 4
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r7 = r11 & 15
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r6.append(r15)
            int r10 = r10 + 1
            int r9 = r9 + 1
            int r8 = r8 + 1
            goto L68
        La2:
            int r0 = r6.length()
            if (r5 != r0) goto Lb2
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        Lb2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexExtensionsKt.toHexString(byte[], int, int, kotlin.text.HexFormat):java.lang.String");
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, i, i2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte b, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(b, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(s, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(int i, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(i, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(j, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(byte b, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return m27743l(b, format, 8);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(short s, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return m27743l(s, format, 16);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(int i, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return m27743l(i, format, 32);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(long j, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return m27743l(j, format, 64);
    }
}