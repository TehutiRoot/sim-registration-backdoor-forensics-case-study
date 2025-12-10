package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\u0006H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u0006H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0017H\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u001bH\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0017H\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0019J!\u0010\u001e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u001bH\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\"\u001a\u00020\u001fH\u0017¢\u0006\u0004\b \u0010!J\u0010\u0010%\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010)\u001a\u00020&2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b*\u0010+\u0012\u0004\b,\u0010-R#\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u0013R#\u0010\b\u001a\u00020\u00068FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, m28850d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "", "packedValue", "constructor-impl", "(J)J", "Landroidx/compose/ui/unit/Dp;", "width", "height", "copy-DwJknco", "(JFF)J", "copy", "other", "minus-e_xh8Ic", "(JJ)J", "minus", "plus-e_xh8Ic", "plus", "component1-D9Ej5fM", "(J)F", "component1", "component2-D9Ej5fM", "component2", "", "times-Gh9hcWk", "(JI)J", "times", "", "(JF)J", "div-Gh9hcWk", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getPackedValue$annotations", "()V", "getWidth-D9Ej5fM", "getWidth-D9Ej5fM$annotations", "getHeight-D9Ej5fM", "getHeight-D9Ej5fM$annotations", "Companion", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n473#3:568\n154#3:569\n58#4:562\n51#4:563\n92#4:564\n88#4:565\n75#4:566\n71#4:567\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n391#1:558\n404#1:560\n391#1:559\n404#1:561\n447#1:568\n457#1:569\n418#1:562\n425#1:563\n434#1:564\n437#1:565\n440#1:566\n443#1:567\n*E\n"})
/* renamed from: androidx.compose.ui.unit.DpSize */
/* loaded from: classes2.dex */
public final class DpSize {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final long f31755b;

    /* renamed from: c */
    public static final long f31756c;

    /* renamed from: a */
    public final long f31757a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m28850d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", OperatorName.SET_LINE_CAPSTYLE, "Zero", "getZero-MYxV2XQ", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.unit.DpSize$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ  reason: not valid java name */
        public final long m73765getUnspecifiedMYxV2XQ() {
            return DpSize.f31756c;
        }

        /* renamed from: getZero-MYxV2XQ  reason: not valid java name */
        public final long m73766getZeroMYxV2XQ() {
            return DpSize.f31755b;
        }

        public Companion() {
        }
    }

    static {
        float f = 0;
        f31755b = DpKt.m73680DpSizeYgX7TsA(C3641Dp.m73658constructorimpl(f), C3641Dp.m73658constructorimpl(f));
        C3641Dp.Companion companion = C3641Dp.Companion;
        f31756c = DpKt.m73680DpSizeYgX7TsA(companion.m73678getUnspecifiedD9Ej5fM(), companion.m73678getUnspecifiedD9Ej5fM());
    }

    public /* synthetic */ DpSize(long j) {
        this.f31757a = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DpSize m73744boximpl(long j) {
        return new DpSize(j);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    public static final float m73745component1D9Ej5fM(long j) {
        return m73756getWidthD9Ej5fM(j);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM  reason: not valid java name */
    public static final float m73746component2D9Ej5fM(long j) {
        return m73754getHeightD9Ej5fM(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m73747constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-DwJknco  reason: not valid java name */
    public static final long m73748copyDwJknco(long j, float f, float f2) {
        return DpKt.m73680DpSizeYgX7TsA(f, f2);
    }

    /* renamed from: copy-DwJknco$default  reason: not valid java name */
    public static /* synthetic */ long m73749copyDwJknco$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m73756getWidthD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m73754getHeightD9Ej5fM(j);
        }
        return m73748copyDwJknco(j, f, f2);
    }

    @Stable
    /* renamed from: div-Gh9hcWk  reason: not valid java name */
    public static final long m73751divGh9hcWk(long j, int i) {
        float f = i;
        return DpKt.m73680DpSizeYgX7TsA(C3641Dp.m73658constructorimpl(m73756getWidthD9Ej5fM(j) / f), C3641Dp.m73658constructorimpl(m73754getHeightD9Ej5fM(j) / f));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73752equalsimpl(long j, Object obj) {
        return (obj instanceof DpSize) && j == ((DpSize) obj).m73764unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73753equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public static final float m73754getHeightD9Ej5fM(long j) {
        if (j != f31756c) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return C3641Dp.m73658constructorimpl(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m73755getHeightD9Ej5fM$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public static final float m73756getWidthD9Ej5fM(long j) {
        if (j != f31756c) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return C3641Dp.m73658constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m73757getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73758hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic  reason: not valid java name */
    public static final long m73759minuse_xh8Ic(long j, long j2) {
        return DpKt.m73680DpSizeYgX7TsA(C3641Dp.m73658constructorimpl(m73756getWidthD9Ej5fM(j) - m73756getWidthD9Ej5fM(j2)), C3641Dp.m73658constructorimpl(m73754getHeightD9Ej5fM(j) - m73754getHeightD9Ej5fM(j2)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic  reason: not valid java name */
    public static final long m73760pluse_xh8Ic(long j, long j2) {
        return DpKt.m73680DpSizeYgX7TsA(C3641Dp.m73658constructorimpl(m73756getWidthD9Ej5fM(j) + m73756getWidthD9Ej5fM(j2)), C3641Dp.m73658constructorimpl(m73754getHeightD9Ej5fM(j) + m73754getHeightD9Ej5fM(j2)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk  reason: not valid java name */
    public static final long m73762timesGh9hcWk(long j, int i) {
        float f = i;
        return DpKt.m73680DpSizeYgX7TsA(C3641Dp.m73658constructorimpl(m73756getWidthD9Ej5fM(j) * f), C3641Dp.m73658constructorimpl(m73754getHeightD9Ej5fM(j) * f));
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73763toStringimpl(long j) {
        if (j != Companion.m73765getUnspecifiedMYxV2XQ()) {
            return ((Object) C3641Dp.m73669toStringimpl(m73756getWidthD9Ej5fM(j))) + " x " + ((Object) C3641Dp.m73669toStringimpl(m73754getHeightD9Ej5fM(j)));
        }
        return "DpSize.Unspecified";
    }

    public boolean equals(Object obj) {
        return m73752equalsimpl(this.f31757a, obj);
    }

    public int hashCode() {
        return m73758hashCodeimpl(this.f31757a);
    }

    @Stable
    @NotNull
    public String toString() {
        return m73763toStringimpl(this.f31757a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m73764unboximpl() {
        return this.f31757a;
    }

    @Stable
    /* renamed from: div-Gh9hcWk  reason: not valid java name */
    public static final long m73750divGh9hcWk(long j, float f) {
        return DpKt.m73680DpSizeYgX7TsA(C3641Dp.m73658constructorimpl(m73756getWidthD9Ej5fM(j) / f), C3641Dp.m73658constructorimpl(m73754getHeightD9Ej5fM(j) / f));
    }

    @Stable
    /* renamed from: times-Gh9hcWk  reason: not valid java name */
    public static final long m73761timesGh9hcWk(long j, float f) {
        return DpKt.m73680DpSizeYgX7TsA(C3641Dp.m73658constructorimpl(m73756getWidthD9Ej5fM(j) * f), C3641Dp.m73658constructorimpl(m73754getHeightD9Ej5fM(j) * f));
    }
}
