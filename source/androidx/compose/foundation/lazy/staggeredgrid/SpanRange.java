package androidx.compose.foundation.lazy.staggeredgrid;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081@\u0018\u00002\u00020\u0001B\u001c\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001b\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0012\u0010\u001d\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0012\u0010\u001f\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010\u0088\u0001\b\u0092\u0001\u00020\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "", "", "lane", "span", "constructor-impl", "(II)J", "", "packedValue", PDPageLabelRange.STYLE_LETTERS_LOWER, "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", OperatorName.SET_LINE_CAPSTYLE, "getPackedValue", "()J", "getStart-impl", "start", "getEnd-impl", "end", "getSize-impl", "size", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1158:1\n907#1:1162\n906#1:1164\n48#2:1159\n55#2:1160\n62#2:1161\n62#2:1163\n55#2:1165\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n908#1:1162\n908#1:1164\n904#1:1159\n906#1:1160\n907#1:1161\n908#1:1163\n908#1:1165\n*E\n"})
/* loaded from: classes.dex */
public final class SpanRange {

    /* renamed from: a */
    public final long f13819a;

    public /* synthetic */ SpanRange(long j) {
        this.f13819a = j;
    }

    /* renamed from: a */
    public static long m61130a(long j) {
        return j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ SpanRange m69662boximpl(long j) {
        return new SpanRange(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m69663constructorimpl(int i, int i2) {
        return m61130a(((i2 + i) & BodyPartID.bodyIdMax) | (i << 32));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m69664equalsimpl(long j, Object obj) {
        return (obj instanceof SpanRange) && j == ((SpanRange) obj).m69671unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m69665equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getEnd-impl  reason: not valid java name */
    public static final int m69666getEndimpl(long j) {
        return (int) (j & BodyPartID.bodyIdMax);
    }

    /* renamed from: getSize-impl  reason: not valid java name */
    public static final int m69667getSizeimpl(long j) {
        return ((int) (BodyPartID.bodyIdMax & j)) - ((int) (j >> 32));
    }

    /* renamed from: getStart-impl  reason: not valid java name */
    public static final int m69668getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m69669hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m69670toStringimpl(long j) {
        return "SpanRange(packedValue=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m69664equalsimpl(this.f13819a, obj);
    }

    public final long getPackedValue() {
        return this.f13819a;
    }

    public int hashCode() {
        return m69669hashCodeimpl(this.f13819a);
    }

    public String toString() {
        return m69670toStringimpl(this.f13819a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m69671unboximpl() {
        return this.f13819a;
    }
}
