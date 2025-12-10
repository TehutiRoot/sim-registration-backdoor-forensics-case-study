package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Immutable
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\f\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m29142d2 = {"Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getCurrentLineSpan-impl", "getCurrentLineSpan$annotations", "()V", "currentLineSpan", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* loaded from: classes.dex */
public final class GridItemSpan {

    /* renamed from: a */
    public final long f13553a;

    public /* synthetic */ GridItemSpan(long j) {
        this.f13553a = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m69791boximpl(long j) {
        return new GridItemSpan(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m69792constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m69793equalsimpl(long j, Object obj) {
        return (obj instanceof GridItemSpan) && j == ((GridItemSpan) obj).m69798unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m69794equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getCurrentLineSpan$annotations() {
    }

    /* renamed from: getCurrentLineSpan-impl  reason: not valid java name */
    public static final int m69795getCurrentLineSpanimpl(long j) {
        return (int) j;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m69796hashCodeimpl(long j) {
        return AbstractC17631Fh1.m68395a(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m69797toStringimpl(long j) {
        return "GridItemSpan(packedValue=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m69793equalsimpl(this.f13553a, obj);
    }

    public int hashCode() {
        return m69796hashCodeimpl(this.f13553a);
    }

    public String toString() {
        return m69797toStringimpl(this.f13553a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m69798unboximpl() {
        return this.f13553a;
    }
}