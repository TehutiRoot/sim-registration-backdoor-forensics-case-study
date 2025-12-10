package androidx.compose.foundation.layout;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087@\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m29142d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "sides", "plus-gK_yJZ4", "(II)I", "plus", "", "hasAny-bkgdKaI$foundation_layout_release", "(II)Z", "hasAny", "", "toString-impl", "(I)Ljava/lang/String;", "toString", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "hashCode-impl", "hashCode", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "Companion", "foundation-layout_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* loaded from: classes.dex */
public final class WindowInsetsSides {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f13409b;

    /* renamed from: c */
    public static final int f13410c;

    /* renamed from: d */
    public static final int f13411d;

    /* renamed from: e */
    public static final int f13412e;

    /* renamed from: f */
    public static final int f13413f;

    /* renamed from: g */
    public static final int f13414g;

    /* renamed from: h */
    public static final int f13415h;

    /* renamed from: i */
    public static final int f13416i;

    /* renamed from: j */
    public static final int f13417j;

    /* renamed from: k */
    public static final int f13418k;

    /* renamed from: l */
    public static final int f13419l;

    /* renamed from: m */
    public static final int f13420m;

    /* renamed from: a */
    public final int f13421a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001f\u0010\n\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001f\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m29142d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "()V", "AllowLeftInLtr", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "getAllowLeftInLtr-JoeWqyM$foundation_layout_release", "()I", "I", "AllowLeftInRtl", "getAllowLeftInRtl-JoeWqyM$foundation_layout_release", "AllowRightInLtr", "getAllowRightInLtr-JoeWqyM$foundation_layout_release", "AllowRightInRtl", "getAllowRightInRtl-JoeWqyM$foundation_layout_release", "Bottom", "getBottom-JoeWqyM", "End", "getEnd-JoeWqyM", "Horizontal", "getHorizontal-JoeWqyM", "Left", "getLeft-JoeWqyM", "Right", "getRight-JoeWqyM", "Start", "getStart-JoeWqyM", "Top", "getTop-JoeWqyM", "Vertical", "getVertical-JoeWqyM", "foundation-layout_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m69768getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f13409b;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m69769getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f13411d;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m69770getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f13410c;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release  reason: not valid java name */
        public final int m69771getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f13412e;
        }

        /* renamed from: getBottom-JoeWqyM  reason: not valid java name */
        public final int m69772getBottomJoeWqyM() {
            return WindowInsetsSides.f13416i;
        }

        /* renamed from: getEnd-JoeWqyM  reason: not valid java name */
        public final int m69773getEndJoeWqyM() {
            return WindowInsetsSides.f13414g;
        }

        /* renamed from: getHorizontal-JoeWqyM  reason: not valid java name */
        public final int m69774getHorizontalJoeWqyM() {
            return WindowInsetsSides.f13419l;
        }

        /* renamed from: getLeft-JoeWqyM  reason: not valid java name */
        public final int m69775getLeftJoeWqyM() {
            return WindowInsetsSides.f13417j;
        }

        /* renamed from: getRight-JoeWqyM  reason: not valid java name */
        public final int m69776getRightJoeWqyM() {
            return WindowInsetsSides.f13418k;
        }

        /* renamed from: getStart-JoeWqyM  reason: not valid java name */
        public final int m69777getStartJoeWqyM() {
            return WindowInsetsSides.f13413f;
        }

        /* renamed from: getTop-JoeWqyM  reason: not valid java name */
        public final int m69778getTopJoeWqyM() {
            return WindowInsetsSides.f13415h;
        }

        /* renamed from: getVertical-JoeWqyM  reason: not valid java name */
        public final int m69779getVerticalJoeWqyM() {
            return WindowInsetsSides.f13420m;
        }

        public Companion() {
        }
    }

    static {
        int m61257a = m61257a(8);
        f13409b = m61257a;
        int m61257a2 = m61257a(4);
        f13410c = m61257a2;
        int m61257a3 = m61257a(2);
        f13411d = m61257a3;
        int m61257a4 = m61257a(1);
        f13412e = m61257a4;
        f13413f = m69765plusgK_yJZ4(m61257a, m61257a4);
        f13414g = m69765plusgK_yJZ4(m61257a2, m61257a3);
        int m61257a5 = m61257a(16);
        f13415h = m61257a5;
        int m61257a6 = m61257a(32);
        f13416i = m61257a6;
        int m69765plusgK_yJZ4 = m69765plusgK_yJZ4(m61257a, m61257a3);
        f13417j = m69765plusgK_yJZ4;
        int m69765plusgK_yJZ42 = m69765plusgK_yJZ4(m61257a2, m61257a4);
        f13418k = m69765plusgK_yJZ42;
        f13419l = m69765plusgK_yJZ4(m69765plusgK_yJZ4, m69765plusgK_yJZ42);
        f13420m = m69765plusgK_yJZ4(m61257a5, m61257a6);
    }

    public /* synthetic */ WindowInsetsSides(int i) {
        this.f13421a = i;
    }

    /* renamed from: a */
    public static int m61257a(int i) {
        return i;
    }

    /* renamed from: b */
    public static final String m61256b(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = f13413f;
        if ((i & i2) == i2) {
            m61255c(sb, "Start");
        }
        int i3 = f13417j;
        if ((i & i3) == i3) {
            m61255c(sb, "Left");
        }
        int i4 = f13415h;
        if ((i & i4) == i4) {
            m61255c(sb, "Top");
        }
        int i5 = f13414g;
        if ((i & i5) == i5) {
            m61255c(sb, "End");
        }
        int i6 = f13418k;
        if ((i & i6) == i6) {
            m61255c(sb, "Right");
        }
        int i7 = f13416i;
        if ((i & i7) == i7) {
            m61255c(sb, "Bottom");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m69760boximpl(int i) {
        return new WindowInsetsSides(i);
    }

    /* renamed from: c */
    public static final void m61255c(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m69761equalsimpl(int i, Object obj) {
        return (obj instanceof WindowInsetsSides) && i == ((WindowInsetsSides) obj).m69767unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m69762equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release  reason: not valid java name */
    public static final boolean m69763hasAnybkgdKaI$foundation_layout_release(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m69764hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: plus-gK_yJZ4  reason: not valid java name */
    public static final int m69765plusgK_yJZ4(int i, int i2) {
        return m61257a(i | i2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m69766toStringimpl(int i) {
        return "WindowInsetsSides(" + m61256b(i) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m69761equalsimpl(this.f13421a, obj);
    }

    public int hashCode() {
        return m69764hashCodeimpl(this.f13421a);
    }

    @NotNull
    public String toString() {
        return m69766toStringimpl(this.f13421a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m69767unboximpl() {
        return this.f13421a;
    }
}