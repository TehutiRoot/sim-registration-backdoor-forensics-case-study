package androidx.compose.p003ui.text.android;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0011\u0010\u0018\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/ui/text/android/VerticalPaddings;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getTopPadding-impl", "topPadding", "getBottomPadding-impl", "bottomPadding", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.kt\nandroidx/compose/ui/text/android/InlineClassUtilsKt\n*L\n1#1,1033:1\n32#2:1034\n39#2:1035\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n892#1:1034\n895#1:1035\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.VerticalPaddings */
/* loaded from: classes2.dex */
public final class VerticalPaddings {

    /* renamed from: a */
    public final long f31164a;

    public /* synthetic */ VerticalPaddings(long j) {
        this.f31164a = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m73249boximpl(long j) {
        return new VerticalPaddings(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m73250constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73251equalsimpl(long j, Object obj) {
        return (obj instanceof VerticalPaddings) && j == ((VerticalPaddings) obj).m73257unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73252equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getBottomPadding-impl  reason: not valid java name */
    public static final int m73253getBottomPaddingimpl(long j) {
        return (int) (j & BodyPartID.bodyIdMax);
    }

    /* renamed from: getTopPadding-impl  reason: not valid java name */
    public static final int m73254getTopPaddingimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73255hashCodeimpl(long j) {
        return AbstractC17792Ig1.m67882a(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73256toStringimpl(long j) {
        return "VerticalPaddings(packedValue=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m73251equalsimpl(this.f31164a, obj);
    }

    public int hashCode() {
        return m73255hashCodeimpl(this.f31164a);
    }

    public String toString() {
        return m73256toStringimpl(this.f31164a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m73257unboximpl() {
        return this.f31164a;
    }
}
