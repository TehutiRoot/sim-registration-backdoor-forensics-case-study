package androidx.compose.p003ui.graphics;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.text.AbstractC12026a;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081@\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001TB\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0007B\u0012\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\nJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010 \u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0013J\r\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010&\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001e\u0010*\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0016\u00100\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\nJ\u0016\u00102\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\nJ\u0016\u00104\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\nJ\u0016\u00106\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u0010\nJ\u0016\u00108\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u0010\nJ\r\u0010<\u001a\u000209¢\u0006\u0004\b:\u0010;J\r\u0010>\u001a\u000209¢\u0006\u0004\b=\u0010;J\r\u0010@\u001a\u000209¢\u0006\u0004\b?\u0010;J\r\u0010B\u001a\u000209¢\u0006\u0004\bA\u0010;J\r\u0010D\u001a\u00020#¢\u0006\u0004\bC\u0010%J\u0010\u0010F\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bE\u0010\u0013J\u001a\u0010J\u001a\u0002092\b\u0010'\u001a\u0004\u0018\u00010GHÖ\u0003¢\u0006\u0004\bH\u0010IR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010+\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bO\u0010\nR\u0011\u0010Q\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bP\u0010\u0013R\u0011\u0010S\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bR\u0010\u0013\u0088\u0001\t\u0092\u0001\u00020\bø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, m28850d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "", "value", "constructor-impl", "(F)S", "", "(D)S", "", "halfValue", "(S)S", "", "toByte-impl", "(S)B", "toByte", "toShort-impl", "toShort", "", "toInt-impl", "(S)I", "toInt", "", "toLong-impl", "(S)J", "toLong", "toFloat-impl", "(S)F", "toFloat", "toDouble-impl", "(S)D", "toDouble", "toBits-impl", "toBits", "toRawBits-impl", "toRawBits", "", "toString-impl", "(S)Ljava/lang/String;", "toString", "other", "compareTo-41bOqos", "(SS)I", "compareTo", "sign", "withSign-qCeQghg", "(SS)S", "withSign", "absoluteValue-slo4al4", "absoluteValue", "round-slo4al4", "round", "ceil-slo4al4", "ceil", "floor-slo4al4", "floor", "trunc-slo4al4", "trunc", "", "isNaN-impl", "(S)Z", "isNaN", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "isNormalized-impl", "isNormalized", "toHexString-impl", "toHexString", "hashCode-impl", "hashCode", "", "equals-impl", "(SLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "S", "getHalfValue", "()S", "getSign-slo4al4", "getExponent-impl", "exponent", "getSignificand-impl", "significand", "Companion", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.graphics.Float16 */
/* loaded from: classes2.dex */
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;

    /* renamed from: n */
    public static final float f29070n;

    /* renamed from: a */
    public final short f29071a;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final short f29058b = m71836constructorimpl((short) 5120);

    /* renamed from: c */
    public static final short f29059c = m71836constructorimpl((short) -1025);

    /* renamed from: d */
    public static final short f29060d = m71836constructorimpl((short) 31743);

    /* renamed from: e */
    public static final short f29061e = m71836constructorimpl((short) 1024);

    /* renamed from: f */
    public static final short f29062f = m71836constructorimpl((short) 1);

    /* renamed from: g */
    public static final short f29063g = m71836constructorimpl((short) 32256);

    /* renamed from: h */
    public static final short f29064h = m71836constructorimpl((short) -1024);

    /* renamed from: i */
    public static final short f29065i = m71836constructorimpl((short) ShortCompanionObject.MIN_VALUE);

    /* renamed from: j */
    public static final short f29066j = m71836constructorimpl((short) 31744);

    /* renamed from: k */
    public static final short f29067k = m71836constructorimpl((short) 0);

    /* renamed from: l */
    public static final short f29068l = m71835constructorimpl(1.0f);

    /* renamed from: m */
    public static final short f29069m = m71835constructorimpl(-1.0f);

    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R \u0010\u0014\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R \u0010\u0016\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R \u0010\u0018\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R \u0010\u001a\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R \u0010\u001c\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R \u0010\u001e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R \u0010 \u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011R \u0010\"\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010%R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010%R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010%R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010%R\u0014\u0010-\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010%R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010%R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010%R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010%R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010%R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010%R\u0014\u00106\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010%R\u0014\u00107\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010%R\u001d\u00108\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b8\u0010\u000fR\u001d\u00109\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b9\u0010\u000fR\u0014\u0010:\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, m28850d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "<init>", "()V", "", "value", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(S)I", "", OperatorName.FILL_NON_ZERO, PDPageLabelRange.STYLE_LETTERS_LOWER, "(F)S", "Landroidx/compose/ui/graphics/Float16;", "Epsilon", "S", "getEpsilon-slo4al4", "()S", "LowestValue", "getLowestValue-slo4al4", "MaxValue", "getMaxValue-slo4al4", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "FP16_COMBINED", "I", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "F", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "MaxExponent", "MinExponent", "NegativeOne", "One", "Size", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.Float16$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final short m59749a(float f) {
            int i;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i2 = floatToRawIntBits >>> 31;
            int i3 = (floatToRawIntBits >>> 23) & 255;
            int i4 = 8388607 & floatToRawIntBits;
            int i5 = 31;
            int i6 = 0;
            if (i3 == 255) {
                if (i4 != 0) {
                    i6 = 512;
                }
            } else {
                int i7 = i3 - 112;
                if (i7 >= 31) {
                    i5 = 49;
                } else if (i7 <= 0) {
                    if (i7 >= -10) {
                        int i8 = (8388608 | i4) >> (1 - i7);
                        if ((i8 & 4096) != 0) {
                            i8 += 8192;
                        }
                        i6 = i8 >> 13;
                    }
                    i5 = 0;
                } else {
                    i6 = i4 >> 13;
                    if ((floatToRawIntBits & 4096) != 0) {
                        i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                        return (short) i;
                    }
                    i5 = i7;
                }
            }
            i = (i2 << 15) | (i5 << 10) | i6;
            return (short) i;
        }

        /* renamed from: b */
        public final int m59748b(short s) {
            return (s & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (s & UShort.MAX_VALUE) : s & UShort.MAX_VALUE;
        }

        /* renamed from: getEpsilon-slo4al4  reason: not valid java name */
        public final short m71863getEpsilonslo4al4() {
            return Float16.f29058b;
        }

        /* renamed from: getLowestValue-slo4al4  reason: not valid java name */
        public final short m71864getLowestValueslo4al4() {
            return Float16.f29059c;
        }

        /* renamed from: getMaxValue-slo4al4  reason: not valid java name */
        public final short m71865getMaxValueslo4al4() {
            return Float16.f29060d;
        }

        /* renamed from: getMinNormal-slo4al4  reason: not valid java name */
        public final short m71866getMinNormalslo4al4() {
            return Float16.f29061e;
        }

        /* renamed from: getMinValue-slo4al4  reason: not valid java name */
        public final short m71867getMinValueslo4al4() {
            return Float16.f29062f;
        }

        /* renamed from: getNaN-slo4al4  reason: not valid java name */
        public final short m71868getNaNslo4al4() {
            return Float16.f29063g;
        }

        /* renamed from: getNegativeInfinity-slo4al4  reason: not valid java name */
        public final short m71869getNegativeInfinityslo4al4() {
            return Float16.f29064h;
        }

        /* renamed from: getNegativeZero-slo4al4  reason: not valid java name */
        public final short m71870getNegativeZeroslo4al4() {
            return Float16.f29065i;
        }

        /* renamed from: getPositiveInfinity-slo4al4  reason: not valid java name */
        public final short m71871getPositiveInfinityslo4al4() {
            return Float16.f29066j;
        }

        /* renamed from: getPositiveZero-slo4al4  reason: not valid java name */
        public final short m71872getPositiveZeroslo4al4() {
            return Float16.f29067k;
        }

        public Companion() {
        }
    }

    static {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        f29070n = Float.intBitsToFloat(1056964608);
    }

    public /* synthetic */ Float16(short s) {
        this.f29071a = s;
    }

    /* renamed from: absoluteValue-slo4al4  reason: not valid java name */
    public static final short m71830absoluteValueslo4al4(short s) {
        return m71836constructorimpl((short) (s & ShortCompanionObject.MAX_VALUE));
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Float16 m71831boximpl(short s) {
        return new Float16(s);
    }

    /* renamed from: ceil-slo4al4  reason: not valid java name */
    public static final short m71832ceilslo4al4(short s) {
        int i = 65535 & s;
        int i2 = s & ShortCompanionObject.MAX_VALUE;
        int i3 = 1;
        if (i2 < 15360) {
            int i4 = s & ShortCompanionObject.MIN_VALUE;
            int i5 = ~(i >> 15);
            if (i2 == 0) {
                i3 = 0;
            }
            i = ((-(i5 & i3)) & 15360) | i4;
        } else if (i2 < 25600) {
            int i6 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + (((i >> 15) - 1) & i6)) & (~i6);
        }
        return m71836constructorimpl((short) i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m71836constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m71837equalsimpl(short s, Object obj) {
        return (obj instanceof Float16) && s == ((Float16) obj).m71862unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m71838equalsimpl0(short s, short s2) {
        return s == s2;
    }

    /* renamed from: floor-slo4al4  reason: not valid java name */
    public static final short m71839floorslo4al4(short s) {
        int i = 65535;
        int i2 = s & UShort.MAX_VALUE;
        int i3 = s & ShortCompanionObject.MAX_VALUE;
        if (i3 < 15360) {
            int i4 = s & ShortCompanionObject.MIN_VALUE;
            if (i2 <= 32768) {
                i = 0;
            }
            i2 = i4 | (i & 15360);
        } else if (i3 < 25600) {
            int i5 = (1 << (25 - (i3 >> 10))) - 1;
            i2 = (i2 + ((-(i2 >> 15)) & i5)) & (~i5);
        }
        return m71836constructorimpl((short) i2);
    }

    /* renamed from: getExponent-impl  reason: not valid java name */
    public static final int m71840getExponentimpl(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4  reason: not valid java name */
    public static final short m71841getSignslo4al4(short s) {
        if (m71846isNaNimpl(s)) {
            return f29063g;
        }
        if (m71833compareTo41bOqos(s, f29065i) < 0) {
            return f29069m;
        }
        if (m71833compareTo41bOqos(s, f29067k) > 0) {
            return f29068l;
        }
        return s;
    }

    /* renamed from: getSignificand-impl  reason: not valid java name */
    public static final int m71842getSignificandimpl(short s) {
        return s & 1023;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m71843hashCodeimpl(short s) {
        return s;
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m71844isFiniteimpl(short s) {
        return (s & ShortCompanionObject.MAX_VALUE) != 31744;
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m71845isInfiniteimpl(short s) {
        return (s & ShortCompanionObject.MAX_VALUE) == 31744;
    }

    /* renamed from: isNaN-impl  reason: not valid java name */
    public static final boolean m71846isNaNimpl(short s) {
        return (s & ShortCompanionObject.MAX_VALUE) > 31744;
    }

    /* renamed from: isNormalized-impl  reason: not valid java name */
    public static final boolean m71847isNormalizedimpl(short s) {
        int i = s & 31744;
        return (i == 0 || i == 31744) ? false : true;
    }

    /* renamed from: round-slo4al4  reason: not valid java name */
    public static final short m71848roundslo4al4(short s) {
        int i = 65535;
        int i2 = s & UShort.MAX_VALUE;
        int i3 = s & ShortCompanionObject.MAX_VALUE;
        if (i3 < 15360) {
            int i4 = s & ShortCompanionObject.MIN_VALUE;
            if (i3 < 14336) {
                i = 0;
            }
            i2 = i4 | (i & 15360);
        } else if (i3 < 25600) {
            int i5 = i3 >> 10;
            i2 = (i2 + (1 << (24 - i5))) & (~((1 << (25 - i5)) - 1));
        }
        return m71836constructorimpl((short) i2);
    }

    /* renamed from: toBits-impl  reason: not valid java name */
    public static final int m71849toBitsimpl(short s) {
        if (m71846isNaNimpl(s)) {
            return f29063g;
        }
        return s & UShort.MAX_VALUE;
    }

    /* renamed from: toByte-impl  reason: not valid java name */
    public static final byte m71850toByteimpl(short s) {
        return (byte) m71852toFloatimpl(s);
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m71851toDoubleimpl(short s) {
        return m71852toFloatimpl(s);
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    public static final float m71852toFloatimpl(short s) {
        int i;
        int i2;
        int i3 = 32768 & s;
        int i4 = ((65535 & s) >>> 10) & 31;
        int i5 = s & 1023;
        if (i4 == 0) {
            if (i5 != 0) {
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                float intBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - f29070n;
                if (i3 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            int i6 = i5 << 13;
            if (i4 == 31) {
                if (i6 != 0) {
                    i6 |= 4194304;
                }
                i = i6;
                i2 = 255;
            } else {
                int i7 = i4 + 112;
                i = i6;
                i2 = i7;
            }
        }
        int i8 = (i2 << 23) | (i3 << 16) | i;
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(i8);
    }

    @NotNull
    /* renamed from: toHexString-impl  reason: not valid java name */
    public static final String m71853toHexStringimpl(short s) {
        StringBuilder sb = new StringBuilder();
        int i = 65535 & s;
        int i2 = i >>> 15;
        int i3 = (i >>> 10) & 31;
        int i4 = s & 1023;
        if (i3 == 31) {
            if (i4 == 0) {
                if (i2 != 0) {
                    sb.append('-');
                }
                sb.append("Infinity");
            } else {
                sb.append("NaN");
            }
        } else {
            if (i2 == 1) {
                sb.append('-');
            }
            if (i3 == 0) {
                if (i4 == 0) {
                    sb.append("0x0.0p0");
                } else {
                    sb.append("0x0.");
                    String num = Integer.toString(i4, AbstractC12026a.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
                    sb.append(new Regex("0{2,}$").replaceFirst(num, ""));
                    sb.append("p-14");
                }
            } else {
                sb.append("0x1.");
                String num2 = Integer.toString(i4, AbstractC12026a.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num2, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(num2, ""));
                sb.append('p');
                sb.append(String.valueOf(i3 - 15));
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "o.toString()");
        return sb2;
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m71854toIntimpl(short s) {
        return (int) m71852toFloatimpl(s);
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m71855toLongimpl(short s) {
        return m71852toFloatimpl(s);
    }

    /* renamed from: toRawBits-impl  reason: not valid java name */
    public static final int m71856toRawBitsimpl(short s) {
        return s & UShort.MAX_VALUE;
    }

    /* renamed from: toShort-impl  reason: not valid java name */
    public static final short m71857toShortimpl(short s) {
        return (short) m71852toFloatimpl(s);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m71858toStringimpl(short s) {
        return String.valueOf(m71852toFloatimpl(s));
    }

    /* renamed from: trunc-slo4al4  reason: not valid java name */
    public static final short m71859truncslo4al4(short s) {
        int i = 65535 & s;
        int i2 = s & ShortCompanionObject.MAX_VALUE;
        if (i2 < 15360) {
            i = 32768 & s;
        } else if (i2 < 25600) {
            i &= ~((1 << (25 - (i2 >> 10))) - 1);
        }
        return m71836constructorimpl((short) i);
    }

    /* renamed from: withSign-qCeQghg  reason: not valid java name */
    public static final short m71860withSignqCeQghg(short s, short s2) {
        return m71836constructorimpl((short) ((s & ShortCompanionObject.MAX_VALUE) | (s2 & ShortCompanionObject.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m71861compareTo41bOqos(float16.m71862unboximpl());
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public int m71861compareTo41bOqos(short s) {
        return m71833compareTo41bOqos(this.f29071a, s);
    }

    public boolean equals(Object obj) {
        return m71837equalsimpl(this.f29071a, obj);
    }

    public final short getHalfValue() {
        return this.f29071a;
    }

    public int hashCode() {
        return m71843hashCodeimpl(this.f29071a);
    }

    @NotNull
    public String toString() {
        return m71858toStringimpl(this.f29071a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m71862unboximpl() {
        return this.f29071a;
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public static int m71833compareTo41bOqos(short s, short s2) {
        if (m71846isNaNimpl(s)) {
            return !m71846isNaNimpl(s2) ? 1 : 0;
        }
        if (m71846isNaNimpl(s2)) {
            return -1;
        }
        Companion companion = Companion;
        return Intrinsics.compare(companion.m59748b(s), companion.m59748b(s2));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m71835constructorimpl(float f) {
        return m71836constructorimpl(Companion.m59749a(f));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m71834constructorimpl(double d) {
        return m71835constructorimpl((float) d);
    }
}
