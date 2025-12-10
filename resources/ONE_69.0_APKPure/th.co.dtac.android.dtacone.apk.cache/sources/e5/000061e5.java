package androidx.compose.p003ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
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

@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\n\u0010\bJ*\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010#\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010'R\u001a\u0010\f\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\bR\u001a\u0010\r\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m29142d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "scaleX", "scaleY", "copy-8GGzs04", "(JFF)J", "copy", "operand", "times-44nBxM0", "(JF)J", "times", "div-44nBxM0", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getPackedValue$annotations", "()V", "getScaleX-impl", "getScaleX$annotations", "getScaleY-impl", "getScaleY$annotations", "Companion", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n34#2:198\n41#2:199\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n51#1:198\n65#1:199\n*E\n"})
/* renamed from: androidx.compose.ui.layout.ScaleFactor */
/* loaded from: classes2.dex */
public final class ScaleFactor {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final long f30245b = ScaleFactorKt.ScaleFactor(Float.NaN, Float.NaN);

    /* renamed from: a */
    public final long f30246a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, m29142d2 = {"Landroidx/compose/ui/layout/ScaleFactor$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/layout/ScaleFactor;", "getUnspecified-_hLwfpc$annotations", "getUnspecified-_hLwfpc", "()J", OperatorName.SET_LINE_CAPSTYLE, "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.layout.ScaleFactor$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-_hLwfpc$annotations  reason: not valid java name */
        public static /* synthetic */ void m73059getUnspecified_hLwfpc$annotations() {
        }

        /* renamed from: getUnspecified-_hLwfpc  reason: not valid java name */
        public final long m73060getUnspecified_hLwfpc() {
            return ScaleFactor.f30245b;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ScaleFactor(long j) {
        this.f30246a = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m73044boximpl(long j) {
        return new ScaleFactor(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m73045component1impl(long j) {
        return m73053getScaleXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m73046component2impl(long j) {
        return m73054getScaleYimpl(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m73047constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-8GGzs04  reason: not valid java name */
    public static final long m73048copy8GGzs04(long j, float f, float f2) {
        return ScaleFactorKt.ScaleFactor(f, f2);
    }

    /* renamed from: copy-8GGzs04$default  reason: not valid java name */
    public static /* synthetic */ long m73049copy8GGzs04$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m73053getScaleXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m73054getScaleYimpl(j);
        }
        return m73048copy8GGzs04(j, f, f2);
    }

    @Stable
    /* renamed from: div-44nBxM0  reason: not valid java name */
    public static final long m73050div44nBxM0(long j, float f) {
        return ScaleFactorKt.ScaleFactor(m73053getScaleXimpl(j) / f, m73054getScaleYimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73051equalsimpl(long j, Object obj) {
        return (obj instanceof ScaleFactor) && j == ((ScaleFactor) obj).m73058unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73052equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getScaleX$annotations() {
    }

    /* renamed from: getScaleX-impl  reason: not valid java name */
    public static final float m73053getScaleXimpl(long j) {
        if (j != f30245b) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: getScaleY-impl  reason: not valid java name */
    public static final float m73054getScaleYimpl(long j) {
        if (j != f30245b) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73055hashCodeimpl(long j) {
        return AbstractC17631Fh1.m68395a(j);
    }

    @Stable
    /* renamed from: times-44nBxM0  reason: not valid java name */
    public static final long m73056times44nBxM0(long j, float f) {
        return ScaleFactorKt.ScaleFactor(m73053getScaleXimpl(j) * f, m73054getScaleYimpl(j) * f);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73057toStringimpl(long j) {
        float m59471a;
        float m59471a2;
        StringBuilder sb = new StringBuilder();
        sb.append("ScaleFactor(");
        m59471a = ScaleFactorKt.m59471a(m73053getScaleXimpl(j));
        sb.append(m59471a);
        sb.append(", ");
        m59471a2 = ScaleFactorKt.m59471a(m73054getScaleYimpl(j));
        sb.append(m59471a2);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        return m73051equalsimpl(this.f30246a, obj);
    }

    public int hashCode() {
        return m73055hashCodeimpl(this.f30246a);
    }

    @NotNull
    public String toString() {
        return m73057toStringimpl(this.f30246a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m73058unboximpl() {
        return this.f30246a;
    }
}