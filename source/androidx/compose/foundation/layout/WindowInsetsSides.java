package androidx.compose.foundation.layout;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087@\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "sides", "plus-gK_yJZ4", "(II)I", "plus", "", "hasAny-bkgdKaI$foundation_layout_release", "(II)Z", "hasAny", "", "toString-impl", "(I)Ljava/lang/String;", "toString", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "hashCode-impl", "hashCode", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "Companion", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* loaded from: classes.dex */
public final class WindowInsetsSides {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f13321b;

    /* renamed from: c */
    public static final int f13322c;

    /* renamed from: d */
    public static final int f13323d;

    /* renamed from: e */
    public static final int f13324e;

    /* renamed from: f */
    public static final int f13325f;

    /* renamed from: g */
    public static final int f13326g;

    /* renamed from: h */
    public static final int f13327h;

    /* renamed from: i */
    public static final int f13328i;

    /* renamed from: j */
    public static final int f13329j;

    /* renamed from: k */
    public static final int f13330k;

    /* renamed from: l */
    public static final int f13331l;

    /* renamed from: m */
    public static final int f13332m;

    /* renamed from: a */
    public final int f13333a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001f\u0010\n\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001f\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m28850d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "()V", "AllowLeftInLtr", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "getAllowLeftInLtr-JoeWqyM$foundation_layout_release", "()I", "I", "AllowLeftInRtl", "getAllowLeftInRtl-JoeWqyM$foundation_layout_release", "AllowRightInLtr", "getAllowRightInLtr-JoeWqyM$foundation_layout_release", "AllowRightInRtl", "getAllowRightInRtl-JoeWqyM$foundation_layout_release", "Bottom", "getBottom-JoeWqyM", "End", "getEnd-JoeWqyM", "Horizontal", "getHorizontal-JoeWqyM", "Left", "getLeft-JoeWqyM", "Right", "getRight-JoeWqyM", "Start", "getStart-JoeWqyM", "Top", "getTop-JoeWqyM", "Vertical", "getVertical-JoeWqyM", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m69584getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f13321b;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m69585getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f13323d;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m69586getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f13322c;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m69587getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f13324e;
        }

        /* renamed from: getBottom-JoeWqyM  reason: not valid java name */
        public final int m69588getBottomJoeWqyM() {
            return WindowInsetsSides.f13328i;
        }

        /* renamed from: getEnd-JoeWqyM  reason: not valid java name */
        public final int m69589getEndJoeWqyM() {
            return WindowInsetsSides.f13326g;
        }

        /* renamed from: getHorizontal-JoeWqyM  reason: not valid java name */
        public final int m69590getHorizontalJoeWqyM() {
            return WindowInsetsSides.f13331l;
        }

        /* renamed from: getLeft-JoeWqyM  reason: not valid java name */
        public final int m69591getLeftJoeWqyM() {
            return WindowInsetsSides.f13329j;
        }

        /* renamed from: getRight-JoeWqyM  reason: not valid java name */
        public final int m69592getRightJoeWqyM() {
            return WindowInsetsSides.f13330k;
        }

        /* renamed from: getStart-JoeWqyM  reason: not valid java name */
        public final int m69593getStartJoeWqyM() {
            return WindowInsetsSides.f13325f;
        }

        /* renamed from: getTop-JoeWqyM  reason: not valid java name */
        public final int m69594getTopJoeWqyM() {
            return WindowInsetsSides.f13327h;
        }

        /* renamed from: getVertical-JoeWqyM  reason: not valid java name */
        public final int m69595getVerticalJoeWqyM() {
            return WindowInsetsSides.f13332m;
        }

        public Companion() {
        }
    }

    static {
        int m61307a = m61307a(8);
        f13321b = m61307a;
        int m61307a2 = m61307a(4);
        f13322c = m61307a2;
        int m61307a3 = m61307a(2);
        f13323d = m61307a3;
        int m61307a4 = m61307a(1);
        f13324e = m61307a4;
        f13325f = m69581plusgK_yJZ4(m61307a, m61307a4);
        f13326g = m69581plusgK_yJZ4(m61307a2, m61307a3);
        int m61307a5 = m61307a(16);
        f13327h = m61307a5;
        int m61307a6 = m61307a(32);
        f13328i = m61307a6;
        int m69581plusgK_yJZ4 = m69581plusgK_yJZ4(m61307a, m61307a3);
        f13329j = m69581plusgK_yJZ4;
        int m69581plusgK_yJZ42 = m69581plusgK_yJZ4(m61307a2, m61307a4);
        f13330k = m69581plusgK_yJZ42;
        f13331l = m69581plusgK_yJZ4(m69581plusgK_yJZ4, m69581plusgK_yJZ42);
        f13332m = m69581plusgK_yJZ4(m61307a5, m61307a6);
    }

    public /* synthetic */ WindowInsetsSides(int i) {
        this.f13333a = i;
    }

    /* renamed from: a */
    public static int m61307a(int i) {
        return i;
    }

    /* renamed from: b */
    public static final String m61306b(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = f13325f;
        if ((i & i2) == i2) {
            m61305c(sb, "Start");
        }
        int i3 = f13329j;
        if ((i & i3) == i3) {
            m61305c(sb, "Left");
        }
        int i4 = f13327h;
        if ((i & i4) == i4) {
            m61305c(sb, "Top");
        }
        int i5 = f13326g;
        if ((i & i5) == i5) {
            m61305c(sb, "End");
        }
        int i6 = f13330k;
        if ((i & i6) == i6) {
            m61305c(sb, "Right");
        }
        int i7 = f13328i;
        if ((i & i7) == i7) {
            m61305c(sb, "Bottom");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m69576boximpl(int i) {
        return new WindowInsetsSides(i);
    }

    /* renamed from: c */
    public static final void m61305c(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m69577equalsimpl(int i, Object obj) {
        return (obj instanceof WindowInsetsSides) && i == ((WindowInsetsSides) obj).m69583unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m69578equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release  reason: not valid java name */
    public static final boolean m69579hasAnybkgdKaI$foundation_layout_release(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m69580hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: plus-gK_yJZ4  reason: not valid java name */
    public static final int m69581plusgK_yJZ4(int i, int i2) {
        return m61307a(i | i2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m69582toStringimpl(int i) {
        return "WindowInsetsSides(" + m61306b(i) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m69577equalsimpl(this.f13333a, obj);
    }

    public int hashCode() {
        return m69580hashCodeimpl(this.f13333a);
    }

    @NotNull
    public String toString() {
        return m69582toStringimpl(this.f13333a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m69583unboximpl() {
        return this.f13333a;
    }
}
