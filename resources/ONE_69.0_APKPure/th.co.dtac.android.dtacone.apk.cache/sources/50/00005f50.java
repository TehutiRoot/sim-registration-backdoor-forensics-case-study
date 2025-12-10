package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.focus.FocusDirection */
/* loaded from: classes2.dex */
public final class FocusDirection {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f28987b = m71614constructorimpl(1);

    /* renamed from: c */
    public static final int f28988c = m71614constructorimpl(2);

    /* renamed from: d */
    public static final int f28989d = m71614constructorimpl(3);

    /* renamed from: e */
    public static final int f28990e = m71614constructorimpl(4);

    /* renamed from: f */
    public static final int f28991f = m71614constructorimpl(5);

    /* renamed from: g */
    public static final int f28992g = m71614constructorimpl(6);

    /* renamed from: h */
    public static final int f28993h;

    /* renamed from: i */
    public static final int f28994i;

    /* renamed from: j */
    public static final int f28995j;

    /* renamed from: k */
    public static final int f28996k;

    /* renamed from: a */
    public final int f28997a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R'\u0010\b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0006R'\u0010\u000b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0006R'\u0010\u000e\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0014\u0010\u0006R'\u0010\u0015\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m29142d2 = {"Landroidx/compose/ui/focus/FocusDirection$Companion;", "", "()V", "Down", "Landroidx/compose/ui/focus/FocusDirection;", "getDown-dhqQ-8s", "()I", "I", "Enter", "getEnter-dhqQ-8s$annotations", "getEnter-dhqQ-8s", "Exit", "getExit-dhqQ-8s$annotations", "getExit-dhqQ-8s", "In", "getIn-dhqQ-8s$annotations", "getIn-dhqQ-8s", "Left", "getLeft-dhqQ-8s", "Next", "getNext-dhqQ-8s", "Out", "getOut-dhqQ-8s$annotations", "getOut-dhqQ-8s", "Previous", "getPrevious-dhqQ-8s", "Right", "getRight-dhqQ-8s", "Up", "getUp-dhqQ-8s", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusDirection$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-dhqQ-8s$annotations  reason: not valid java name */
        public static /* synthetic */ void m71620getEnterdhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getExit-dhqQ-8s$annotations  reason: not valid java name */
        public static /* synthetic */ void m71621getExitdhqQ8s$annotations() {
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Use FocusDirection.Enter instead.", replaceWith = @ReplaceWith(expression = "Enter", imports = {"androidx.compose.ui.focus.FocusDirection.Companion.Enter"}))
        @ExperimentalComposeUiApi
        /* renamed from: getIn-dhqQ-8s$annotations  reason: not valid java name */
        public static /* synthetic */ void m71622getIndhqQ8s$annotations() {
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Use FocusDirection.Exit instead.", replaceWith = @ReplaceWith(expression = "Exit", imports = {"androidx.compose.ui.focus.FocusDirection.Companion.Exit"}))
        @ExperimentalComposeUiApi
        /* renamed from: getOut-dhqQ-8s$annotations  reason: not valid java name */
        public static /* synthetic */ void m71623getOutdhqQ8s$annotations() {
        }

        /* renamed from: getDown-dhqQ-8s  reason: not valid java name */
        public final int m71624getDowndhqQ8s() {
            return FocusDirection.f28992g;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-dhqQ-8s  reason: not valid java name */
        public final int m71625getEnterdhqQ8s() {
            return FocusDirection.f28993h;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getExit-dhqQ-8s  reason: not valid java name */
        public final int m71626getExitdhqQ8s() {
            return FocusDirection.f28994i;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getIn-dhqQ-8s  reason: not valid java name */
        public final int m71627getIndhqQ8s() {
            return FocusDirection.f28995j;
        }

        /* renamed from: getLeft-dhqQ-8s  reason: not valid java name */
        public final int m71628getLeftdhqQ8s() {
            return FocusDirection.f28989d;
        }

        /* renamed from: getNext-dhqQ-8s  reason: not valid java name */
        public final int m71629getNextdhqQ8s() {
            return FocusDirection.f28987b;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getOut-dhqQ-8s  reason: not valid java name */
        public final int m71630getOutdhqQ8s() {
            return FocusDirection.f28996k;
        }

        /* renamed from: getPrevious-dhqQ-8s  reason: not valid java name */
        public final int m71631getPreviousdhqQ8s() {
            return FocusDirection.f28988c;
        }

        /* renamed from: getRight-dhqQ-8s  reason: not valid java name */
        public final int m71632getRightdhqQ8s() {
            return FocusDirection.f28990e;
        }

        /* renamed from: getUp-dhqQ-8s  reason: not valid java name */
        public final int m71633getUpdhqQ8s() {
            return FocusDirection.f28991f;
        }

        public Companion() {
        }
    }

    static {
        int m71614constructorimpl = m71614constructorimpl(7);
        f28993h = m71614constructorimpl;
        int m71614constructorimpl2 = m71614constructorimpl(8);
        f28994i = m71614constructorimpl2;
        f28995j = m71614constructorimpl;
        f28996k = m71614constructorimpl2;
    }

    public /* synthetic */ FocusDirection(int i) {
        this.f28997a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FocusDirection m71613boximpl(int i) {
        return new FocusDirection(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m71614constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m71615equalsimpl(int i, Object obj) {
        return (obj instanceof FocusDirection) && i == ((FocusDirection) obj).m71619unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m71616equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m71617hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m71618toStringimpl(int i) {
        if (m71616equalsimpl0(i, f28987b)) {
            return "Next";
        }
        if (m71616equalsimpl0(i, f28988c)) {
            return "Previous";
        }
        if (m71616equalsimpl0(i, f28989d)) {
            return "Left";
        }
        if (m71616equalsimpl0(i, f28990e)) {
            return "Right";
        }
        if (m71616equalsimpl0(i, f28991f)) {
            return "Up";
        }
        if (m71616equalsimpl0(i, f28992g)) {
            return "Down";
        }
        if (m71616equalsimpl0(i, f28993h)) {
            return "Enter";
        }
        if (m71616equalsimpl0(i, f28994i)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m71615equalsimpl(this.f28997a, obj);
    }

    public int hashCode() {
        return m71617hashCodeimpl(this.f28997a);
    }

    @NotNull
    public String toString() {
        return m71618toStringimpl(this.f28997a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m71619unboximpl() {
        return this.f28997a;
    }
}