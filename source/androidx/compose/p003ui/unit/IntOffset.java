package androidx.compose.p003ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 52\u00020\u0001:\u00015B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\n\u0010\bJ*\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0087\nø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0087\nø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0018\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0005J!\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ!\u0010\"\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010&\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010\bJ\u001a\u0010,\u001a\u00020)2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u00100R\u001a\u0010\f\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\bR\u001a\u0010\r\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, m28850d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)I", "component1", "component2-impl", "component2", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "copy-iSbpLlY", "(JII)J", "copy", "other", "minus-qkQi6aY", "(JJ)J", "minus", "plus-qkQi6aY", "plus", "unaryMinus-nOcc-ac", "unaryMinus", "", "operand", "times-Bjo55l4", "(JF)J", "times", "div-Bjo55l4", "div", "rem-Bjo55l4", "(JI)J", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getPackedValue$annotations", "()V", "getX-impl", "getX$annotations", "getY-impl", "getY$annotations", "Companion", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n55#2:180\n62#2:181\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n53#1:180\n60#1:181\n*E\n"})
/* renamed from: androidx.compose.ui.unit.IntOffset */
/* loaded from: classes2.dex */
public final class IntOffset {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final long f31758b = IntOffsetKt.IntOffset(0, 0);

    /* renamed from: a */
    public final long f31759a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntOffset;", "getZero-nOcc-ac", "()J", OperatorName.SET_LINE_CAPSTYLE, "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.unit.IntOffset$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-nOcc-ac  reason: not valid java name */
        public final long m73786getZeronOccac() {
            return IntOffset.f31758b;
        }

        public Companion() {
        }
    }

    public /* synthetic */ IntOffset(long j) {
        this.f31759a = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ IntOffset m73767boximpl(long j) {
        return new IntOffset(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final int m73768component1impl(long j) {
        return m73776getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final int m73769component2impl(long j) {
        return m73777getYimpl(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m73770constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-iSbpLlY  reason: not valid java name */
    public static final long m73771copyiSbpLlY(long j, int i, int i2) {
        return IntOffsetKt.IntOffset(i, i2);
    }

    /* renamed from: copy-iSbpLlY$default  reason: not valid java name */
    public static /* synthetic */ long m73772copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = m73776getXimpl(j);
        }
        if ((i3 & 2) != 0) {
            i2 = m73777getYimpl(j);
        }
        return m73771copyiSbpLlY(j, i, i2);
    }

    @Stable
    /* renamed from: div-Bjo55l4  reason: not valid java name */
    public static final long m73773divBjo55l4(long j, float f) {
        return IntOffsetKt.IntOffset(AbstractC21140mr0.roundToInt(m73776getXimpl(j) / f), AbstractC21140mr0.roundToInt(m73777getYimpl(j) / f));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73774equalsimpl(long j, Object obj) {
        return (obj instanceof IntOffset) && j == ((IntOffset) obj).m73785unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73775equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final int m73776getXimpl(long j) {
        return (int) (j >> 32);
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final int m73777getYimpl(long j) {
        return (int) (j & BodyPartID.bodyIdMax);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73778hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    @Stable
    /* renamed from: minus-qkQi6aY  reason: not valid java name */
    public static final long m73779minusqkQi6aY(long j, long j2) {
        return IntOffsetKt.IntOffset(m73776getXimpl(j) - m73776getXimpl(j2), m73777getYimpl(j) - m73777getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-qkQi6aY  reason: not valid java name */
    public static final long m73780plusqkQi6aY(long j, long j2) {
        return IntOffsetKt.IntOffset(m73776getXimpl(j) + m73776getXimpl(j2), m73777getYimpl(j) + m73777getYimpl(j2));
    }

    @Stable
    /* renamed from: rem-Bjo55l4  reason: not valid java name */
    public static final long m73781remBjo55l4(long j, int i) {
        return IntOffsetKt.IntOffset(m73776getXimpl(j) % i, m73777getYimpl(j) % i);
    }

    @Stable
    /* renamed from: times-Bjo55l4  reason: not valid java name */
    public static final long m73782timesBjo55l4(long j, float f) {
        return IntOffsetKt.IntOffset(AbstractC21140mr0.roundToInt(m73776getXimpl(j) * f), AbstractC21140mr0.roundToInt(m73777getYimpl(j) * f));
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73783toStringimpl(long j) {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + m73776getXimpl(j) + ", " + m73777getYimpl(j) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Stable
    /* renamed from: unaryMinus-nOcc-ac  reason: not valid java name */
    public static final long m73784unaryMinusnOccac(long j) {
        return IntOffsetKt.IntOffset(-m73776getXimpl(j), -m73777getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m73774equalsimpl(this.f31759a, obj);
    }

    public int hashCode() {
        return m73778hashCodeimpl(this.f31759a);
    }

    @Stable
    @NotNull
    public String toString() {
        return m73783toStringimpl(this.f31759a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m73785unboximpl() {
        return this.f31759a;
    }
}
