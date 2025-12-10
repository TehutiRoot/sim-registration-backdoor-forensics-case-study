package androidx.compose.animation.core;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001e\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m28850d2 = {"Landroidx/compose/animation/core/Motion;", "", "", "packedValue", "constructor-impl", "(J)J", "", "value", "velocity", "copy-XB9eQnU", "(JFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getPackedValue", "()J", "getValue-impl", "(J)F", "getVelocity-impl", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,243:1\n34#2:244\n41#2:245\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n47#1:244\n49#1:245\n*E\n"})
/* loaded from: classes.dex */
public final class Motion {

    /* renamed from: a */
    public final long f12556a;

    public /* synthetic */ Motion(long j) {
        this.f12556a = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Motion m69266boximpl(long j) {
        return new Motion(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m69267constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-XB9eQnU  reason: not valid java name */
    public static final long m69268copyXB9eQnU(long j, float f, float f2) {
        return SpringSimulationKt.Motion(f, f2);
    }

    /* renamed from: copy-XB9eQnU$default  reason: not valid java name */
    public static /* synthetic */ long m69269copyXB9eQnU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m69272getValueimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m69273getVelocityimpl(j);
        }
        return m69268copyXB9eQnU(j, f, f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m69270equalsimpl(long j, Object obj) {
        return (obj instanceof Motion) && j == ((Motion) obj).m69276unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m69271equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    public static final float m69272getValueimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getVelocity-impl  reason: not valid java name */
    public static final float m69273getVelocityimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m69274hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m69275toStringimpl(long j) {
        return "Motion(packedValue=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m69270equalsimpl(this.f12556a, obj);
    }

    public final long getPackedValue() {
        return this.f12556a;
    }

    public int hashCode() {
        return m69274hashCodeimpl(this.f12556a);
    }

    public String toString() {
        return m69275toStringimpl(this.f12556a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m69276unboximpl() {
        return this.f12556a;
    }
}
