package androidx.compose.p003ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 42\u00020\u0001:\u00014B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\n\u0010\bJ*\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0005J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ!\u0010 \u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010(\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010,\u001a\u00020)2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010\f\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\bR\u001a\u0010\r\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, m28850d2 = {"Landroidx/compose/ui/unit/Velocity;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "copy-OhffZ5M", "(JFF)J", "copy", "unaryMinus-9UxMQ8M", "unaryMinus", "other", "minus-AH228Gc", "(JJ)J", "minus", "plus-AH228Gc", "plus", "operand", "times-adjELrA", "(JF)J", "times", "div-adjELrA", "div", "rem-adjELrA", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getX-impl", "getX$annotations", "()V", "getY-impl", "getY$annotations", "Companion", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,144:1\n34#2:145\n41#2:146\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n45#1:145\n52#1:146\n*E\n"})
/* renamed from: androidx.compose.ui.unit.Velocity */
/* loaded from: classes2.dex */
public final class Velocity {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final long f31774b = VelocityKt.Velocity(0.0f, 0.0f);

    /* renamed from: a */
    public final long f31775a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, m28850d2 = {"Landroidx/compose/ui/unit/Velocity$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/Velocity;", "getZero-9UxMQ8M$annotations", "getZero-9UxMQ8M", "()J", OperatorName.SET_LINE_CAPSTYLE, "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.unit.Velocity$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getZero-9UxMQ8M$annotations  reason: not valid java name */
        public static /* synthetic */ void m73893getZero9UxMQ8M$annotations() {
        }

        /* renamed from: getZero-9UxMQ8M  reason: not valid java name */
        public final long m73894getZero9UxMQ8M() {
            return Velocity.f31774b;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Velocity(long j) {
        this.f31775a = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Velocity m73874boximpl(long j) {
        return new Velocity(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m73875component1impl(long j) {
        return m73883getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m73876component2impl(long j) {
        return m73884getYimpl(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m73877constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-OhffZ5M  reason: not valid java name */
    public static final long m73878copyOhffZ5M(long j, float f, float f2) {
        return VelocityKt.Velocity(f, f2);
    }

    /* renamed from: copy-OhffZ5M$default  reason: not valid java name */
    public static /* synthetic */ long m73879copyOhffZ5M$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m73883getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m73884getYimpl(j);
        }
        return m73878copyOhffZ5M(j, f, f2);
    }

    @Stable
    /* renamed from: div-adjELrA  reason: not valid java name */
    public static final long m73880divadjELrA(long j, float f) {
        return VelocityKt.Velocity(m73883getXimpl(j) / f, m73884getYimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73881equalsimpl(long j, Object obj) {
        return (obj instanceof Velocity) && j == ((Velocity) obj).m73892unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73882equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m73883getXimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m73884getYimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73885hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    @Stable
    /* renamed from: minus-AH228Gc  reason: not valid java name */
    public static final long m73886minusAH228Gc(long j, long j2) {
        return VelocityKt.Velocity(m73883getXimpl(j) - m73883getXimpl(j2), m73884getYimpl(j) - m73884getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-AH228Gc  reason: not valid java name */
    public static final long m73887plusAH228Gc(long j, long j2) {
        return VelocityKt.Velocity(m73883getXimpl(j) + m73883getXimpl(j2), m73884getYimpl(j) + m73884getYimpl(j2));
    }

    @Stable
    /* renamed from: rem-adjELrA  reason: not valid java name */
    public static final long m73888remadjELrA(long j, float f) {
        return VelocityKt.Velocity(m73883getXimpl(j) % f, m73884getYimpl(j) % f);
    }

    @Stable
    /* renamed from: times-adjELrA  reason: not valid java name */
    public static final long m73889timesadjELrA(long j, float f) {
        return VelocityKt.Velocity(m73883getXimpl(j) * f, m73884getYimpl(j) * f);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73890toStringimpl(long j) {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + m73883getXimpl(j) + ", " + m73884getYimpl(j) + ") px/sec";
    }

    @Stable
    /* renamed from: unaryMinus-9UxMQ8M  reason: not valid java name */
    public static final long m73891unaryMinus9UxMQ8M(long j) {
        return VelocityKt.Velocity(-m73883getXimpl(j), -m73884getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m73881equalsimpl(this.f31775a, obj);
    }

    public int hashCode() {
        return m73885hashCodeimpl(this.f31775a);
    }

    @NotNull
    public String toString() {
        return m73890toStringimpl(this.f31775a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m73892unboximpl() {
        return this.f31775a;
    }
}
