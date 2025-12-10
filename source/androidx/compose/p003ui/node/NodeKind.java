package androidx.compose.p003ui.node;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\n\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0086\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\f¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0004\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m28850d2 = {"Landroidx/compose/ui/node/NodeKind;", "T", "", "", "mask", "constructor-impl", "(I)I", "other", "or-H91voCI", "(II)I", "or", "or-impl", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getMask", "()I", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.node.NodeKind */
/* loaded from: classes2.dex */
public final class NodeKind<T> {

    /* renamed from: a */
    public final int f30413a;

    public /* synthetic */ NodeKind(int i) {
        this.f30413a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ NodeKind m72960boximpl(int i) {
        return new NodeKind(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> int m72961constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m72962equalsimpl(int i, Object obj) {
        return (obj instanceof NodeKind) && i == ((NodeKind) obj).m72968unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m72963equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m72964hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: or-H91voCI  reason: not valid java name */
    public static final int m72965orH91voCI(int i, int i2) {
        return i | i2;
    }

    /* renamed from: or-impl  reason: not valid java name */
    public static final int m72966orimpl(int i, int i2) {
        return i | i2;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m72967toStringimpl(int i) {
        return "NodeKind(mask=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m72962equalsimpl(this.f30413a, obj);
    }

    public final int getMask() {
        return this.f30413a;
    }

    public int hashCode() {
        return m72964hashCodeimpl(this.f30413a);
    }

    public String toString() {
        return m72967toStringimpl(this.f30413a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m72968unboximpl() {
        return this.f30413a;
    }
}
