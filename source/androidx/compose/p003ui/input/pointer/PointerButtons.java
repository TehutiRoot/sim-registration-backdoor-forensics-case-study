package androidx.compose.p003ui.input.pointer;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerButtons;", "", "", "Landroidx/compose/ui/input/pointer/NativePointerButtons;", "packedValue", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.input.pointer.PointerButtons */
/* loaded from: classes2.dex */
public final class PointerButtons {

    /* renamed from: a */
    public final int f29923a;

    public /* synthetic */ PointerButtons(int i) {
        this.f29923a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerButtons m72649boximpl(int i) {
        return new PointerButtons(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m72650constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m72651equalsimpl(int i, Object obj) {
        return (obj instanceof PointerButtons) && i == ((PointerButtons) obj).m72655unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m72652equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m72653hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m72654toStringimpl(int i) {
        return "PointerButtons(packedValue=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m72651equalsimpl(this.f29923a, obj);
    }

    public int hashCode() {
        return m72653hashCodeimpl(this.f29923a);
    }

    public String toString() {
        return m72654toStringimpl(this.f29923a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m72655unboximpl() {
        return this.f29923a;
    }
}
