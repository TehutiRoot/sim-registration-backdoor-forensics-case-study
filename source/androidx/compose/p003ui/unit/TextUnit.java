package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J!\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\nø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0086\nø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000eJ!\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000fH\u0086\nø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0010J!\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\nø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ!\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0086\nø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000fH\u0086\nø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u001e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010 \u001a\u00020\u001d2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0005R\u001a\u0010)\u001a\u00020'8Fø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010,\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u00101\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u00100\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, m28850d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "", "packedValue", "constructor-impl", "(J)J", "unaryMinus-XSAIIZE", "unaryMinus", "", "other", "div-kPz2Gy4", "(JF)J", "div", "", "(JD)J", "", "(JI)J", "times-kPz2Gy4", "times", "compareTo--R2X_6o", "(JJ)I", "compareTo", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getRawType-impl", "getRawType$annotations", "()V", "rawType", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "type", "isSp-impl", "(J)Z", "isSp", "isEm-impl", "isEm", "getValue-impl", "(J)F", "value", "Companion", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.unit.TextUnit */
/* loaded from: classes2.dex */
public final class TextUnit {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final TextUnitType[] f31767b;

    /* renamed from: c */
    public static final long f31768c;

    /* renamed from: a */
    public final long f31769a;

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", OperatorName.SET_LINE_CAPSTYLE, "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.unit.TextUnit$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations  reason: not valid java name */
        public static /* synthetic */ void m73849getUnspecifiedXSAIIZE$annotations() {
        }

        @NotNull
        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.f31767b;
        }

        /* renamed from: getUnspecified-XSAIIZE  reason: not valid java name */
        public final long m73850getUnspecifiedXSAIIZE() {
            return TextUnit.f31768c;
        }

        public Companion() {
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        f31767b = new TextUnitType[]{TextUnitType.m73864boximpl(companion.m73873getUnspecifiedUIouoOA()), TextUnitType.m73864boximpl(companion.m73872getSpUIouoOA()), TextUnitType.m73864boximpl(companion.m73871getEmUIouoOA())};
        f31768c = TextUnitKt.pack(0L, Float.NaN);
    }

    public /* synthetic */ TextUnit(long j) {
        this.f31769a = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextUnit m73829boximpl(long j) {
        return new TextUnit(j);
    }

    /* renamed from: compareTo--R2X_6o  reason: not valid java name */
    public static final int m73830compareToR2X_6o(long j, long j2) {
        TextUnitKt.m73853checkArithmeticNB67dxo(j, j2);
        return Float.compare(m73839getValueimpl(j), m73839getValueimpl(j2));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m73831constructorimpl(long j) {
        return j;
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m73833divkPz2Gy4(long j, float f) {
        TextUnitKt.m73852checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m73837getRawTypeimpl(j), m73839getValueimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73835equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).m73848unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73836equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @PublishedApi
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl  reason: not valid java name */
    public static final long m73837getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA  reason: not valid java name */
    public static final long m73838getTypeUIouoOA(long j) {
        return f31767b[(int) (m73837getRawTypeimpl(j) >>> 32)].m73870unboximpl();
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    public static final float m73839getValueimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73840hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    /* renamed from: isEm-impl  reason: not valid java name */
    public static final boolean m73841isEmimpl(long j) {
        if (m73837getRawTypeimpl(j) == 8589934592L) {
            return true;
        }
        return false;
    }

    /* renamed from: isSp-impl  reason: not valid java name */
    public static final boolean m73842isSpimpl(long j) {
        if (m73837getRawTypeimpl(j) == 4294967296L) {
            return true;
        }
        return false;
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m73844timeskPz2Gy4(long j, float f) {
        TextUnitKt.m73852checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m73837getRawTypeimpl(j), m73839getValueimpl(j) * f);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73846toStringimpl(long j) {
        long m73838getTypeUIouoOA = m73838getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73873getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73872getSpUIouoOA())) {
            return m73839getValueimpl(j) + ".sp";
        } else if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73871getEmUIouoOA())) {
            return m73839getValueimpl(j) + ".em";
        } else {
            return "Invalid";
        }
    }

    /* renamed from: unaryMinus-XSAIIZE  reason: not valid java name */
    public static final long m73847unaryMinusXSAIIZE(long j) {
        TextUnitKt.m73852checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m73837getRawTypeimpl(j), -m73839getValueimpl(j));
    }

    public boolean equals(Object obj) {
        return m73835equalsimpl(this.f31769a, obj);
    }

    public int hashCode() {
        return m73840hashCodeimpl(this.f31769a);
    }

    @NotNull
    public String toString() {
        return m73846toStringimpl(this.f31769a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m73848unboximpl() {
        return this.f31769a;
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m73832divkPz2Gy4(long j, double d) {
        TextUnitKt.m73852checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m73837getRawTypeimpl(j), (float) (m73839getValueimpl(j) / d));
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m73843timeskPz2Gy4(long j, double d) {
        TextUnitKt.m73852checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m73837getRawTypeimpl(j), (float) (m73839getValueimpl(j) * d));
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m73834divkPz2Gy4(long j, int i) {
        TextUnitKt.m73852checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m73837getRawTypeimpl(j), m73839getValueimpl(j) / i);
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m73845timeskPz2Gy4(long j, int i) {
        TextUnitKt.m73852checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m73837getRawTypeimpl(j), m73839getValueimpl(j) * i);
    }
}
