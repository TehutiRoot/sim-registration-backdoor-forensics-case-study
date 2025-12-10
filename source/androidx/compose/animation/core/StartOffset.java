package androidx.compose.animation.core;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u001e\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B\u0014\b\u0002\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011\u0088\u0001\t\u0092\u0001\u00020\bø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "", "offsetMillis", "Landroidx/compose/animation/core/StartOffsetType;", "offsetType", "constructor-impl", "(II)J", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", OperatorName.SET_LINE_CAPSTYLE, "getOffsetMillis-impl", "getOffsetType-Eo1U57Q", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* loaded from: classes.dex */
public final class StartOffset {

    /* renamed from: a */
    public final long f12580a;

    public /* synthetic */ StartOffset(long j) {
        this.f12580a = j;
    }

    /* renamed from: a */
    public static long m61684a(long j) {
        return j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StartOffset m69279boximpl(long j) {
        return new StartOffset(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m69280constructorimpl(int i, int i2) {
        return m61684a(i * i2);
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ long m69281constructorimpl$default(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = StartOffsetType.Companion.m69295getDelayEo1U57Q();
        }
        return m69280constructorimpl(i, i2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m69282equalsimpl(long j, Object obj) {
        return (obj instanceof StartOffset) && j == ((StartOffset) obj).m69288unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m69283equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getOffsetMillis-impl  reason: not valid java name */
    public static final int m69284getOffsetMillisimpl(long j) {
        return Math.abs((int) j);
    }

    /* renamed from: getOffsetType-Eo1U57Q  reason: not valid java name */
    public static final int m69285getOffsetTypeEo1U57Q(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return StartOffsetType.Companion.m69296getFastForwardEo1U57Q();
        }
        if (!z) {
            return StartOffsetType.Companion.m69295getDelayEo1U57Q();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m69286hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m69287toStringimpl(long j) {
        return "StartOffset(value=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m69282equalsimpl(this.f12580a, obj);
    }

    public int hashCode() {
        return m69286hashCodeimpl(this.f12580a);
    }

    public String toString() {
        return m69287toStringimpl(this.f12580a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m69288unboximpl() {
        return this.f12580a;
    }
}
