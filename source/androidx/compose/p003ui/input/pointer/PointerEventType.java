package androidx.compose.p003ui.input.pointer;

import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType;", "", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.input.pointer.PointerEventType */
/* loaded from: classes2.dex */
public final class PointerEventType {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f29929b = m59616a(0);

    /* renamed from: c */
    public static final int f29930c = m59616a(1);

    /* renamed from: d */
    public static final int f29931d = m59616a(2);

    /* renamed from: e */
    public static final int f29932e = m59616a(3);

    /* renamed from: f */
    public static final int f29933f = m59616a(4);

    /* renamed from: g */
    public static final int f29934g = m59616a(5);

    /* renamed from: h */
    public static final int f29935h = m59616a(6);

    /* renamed from: a */
    public final int f29936a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType$Companion;", "", "()V", "Enter", "Landroidx/compose/ui/input/pointer/PointerEventType;", "getEnter-7fucELk", "()I", "I", "Exit", "getExit-7fucELk", "Move", "getMove-7fucELk", TrackerConstant.ACTION_PRESS, "getPress-7fucELk", "Release", "getRelease-7fucELk", "Scroll", "getScroll-7fucELk", OpenTypeScript.UNKNOWN, "getUnknown-7fucELk", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.PointerEventType$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEnter-7fucELk  reason: not valid java name */
        public final int m72668getEnter7fucELk() {
            return PointerEventType.f29933f;
        }

        /* renamed from: getExit-7fucELk  reason: not valid java name */
        public final int m72669getExit7fucELk() {
            return PointerEventType.f29934g;
        }

        /* renamed from: getMove-7fucELk  reason: not valid java name */
        public final int m72670getMove7fucELk() {
            return PointerEventType.f29932e;
        }

        /* renamed from: getPress-7fucELk  reason: not valid java name */
        public final int m72671getPress7fucELk() {
            return PointerEventType.f29930c;
        }

        /* renamed from: getRelease-7fucELk  reason: not valid java name */
        public final int m72672getRelease7fucELk() {
            return PointerEventType.f29931d;
        }

        /* renamed from: getScroll-7fucELk  reason: not valid java name */
        public final int m72673getScroll7fucELk() {
            return PointerEventType.f29935h;
        }

        /* renamed from: getUnknown-7fucELk  reason: not valid java name */
        public final int m72674getUnknown7fucELk() {
            return PointerEventType.f29929b;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PointerEventType(int i) {
        this.f29936a = i;
    }

    /* renamed from: a */
    public static int m59616a(int i) {
        return i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerEventType m72662boximpl(int i) {
        return new PointerEventType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m72663equalsimpl(int i, Object obj) {
        return (obj instanceof PointerEventType) && i == ((PointerEventType) obj).m72667unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m72664equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m72665hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m72666toStringimpl(int i) {
        if (m72664equalsimpl0(i, f29930c)) {
            return TrackerConstant.ACTION_PRESS;
        }
        if (m72664equalsimpl0(i, f29931d)) {
            return "Release";
        }
        if (m72664equalsimpl0(i, f29932e)) {
            return "Move";
        }
        if (m72664equalsimpl0(i, f29933f)) {
            return "Enter";
        }
        if (m72664equalsimpl0(i, f29934g)) {
            return "Exit";
        }
        if (m72664equalsimpl0(i, f29935h)) {
            return "Scroll";
        }
        return OpenTypeScript.UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m72663equalsimpl(this.f29936a, obj);
    }

    public int hashCode() {
        return m72665hashCodeimpl(this.f29936a);
    }

    @NotNull
    public String toString() {
        return m72666toStringimpl(this.f29936a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m72667unboximpl() {
        return this.f29936a;
    }
}
