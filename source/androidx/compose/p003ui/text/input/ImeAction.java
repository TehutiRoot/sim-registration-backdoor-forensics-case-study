package androidx.compose.p003ui.text.input;

import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.text.input.ImeAction */
/* loaded from: classes2.dex */
public final class ImeAction {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f31369b = m73351constructorimpl(1);

    /* renamed from: c */
    public static final int f31370c = m73351constructorimpl(0);

    /* renamed from: d */
    public static final int f31371d = m73351constructorimpl(2);

    /* renamed from: e */
    public static final int f31372e = m73351constructorimpl(3);

    /* renamed from: f */
    public static final int f31373f = m73351constructorimpl(4);

    /* renamed from: g */
    public static final int f31374g = m73351constructorimpl(5);

    /* renamed from: h */
    public static final int f31375h = m73351constructorimpl(6);

    /* renamed from: i */
    public static final int f31376i = m73351constructorimpl(7);

    /* renamed from: a */
    public final int f31377a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R'\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R'\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R'\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R'\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m28850d2 = {"Landroidx/compose/ui/text/input/ImeAction$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Landroidx/compose/ui/text/input/ImeAction;", "getDefault-eUduSuo$annotations", "getDefault-eUduSuo", "()I", "I", "Done", "getDone-eUduSuo$annotations", "getDone-eUduSuo", "Go", "getGo-eUduSuo$annotations", "getGo-eUduSuo", "Next", "getNext-eUduSuo$annotations", "getNext-eUduSuo", "None", "getNone-eUduSuo$annotations", "getNone-eUduSuo", "Previous", "getPrevious-eUduSuo$annotations", "getPrevious-eUduSuo", "Search", "getSearch-eUduSuo$annotations", "getSearch-eUduSuo", "Send", "getSend-eUduSuo$annotations", "getSend-eUduSuo", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.input.ImeAction$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getDefault-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m73357getDefaulteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getDone-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m73358getDoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getGo-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m73359getGoeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNext-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m73360getNexteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNone-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m73361getNoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getPrevious-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m73362getPreviouseUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSearch-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m73363getSearcheUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSend-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m73364getSendeUduSuo$annotations() {
        }

        /* renamed from: getDefault-eUduSuo  reason: not valid java name */
        public final int m73365getDefaulteUduSuo() {
            return ImeAction.f31369b;
        }

        /* renamed from: getDone-eUduSuo  reason: not valid java name */
        public final int m73366getDoneeUduSuo() {
            return ImeAction.f31376i;
        }

        /* renamed from: getGo-eUduSuo  reason: not valid java name */
        public final int m73367getGoeUduSuo() {
            return ImeAction.f31371d;
        }

        /* renamed from: getNext-eUduSuo  reason: not valid java name */
        public final int m73368getNexteUduSuo() {
            return ImeAction.f31375h;
        }

        /* renamed from: getNone-eUduSuo  reason: not valid java name */
        public final int m73369getNoneeUduSuo() {
            return ImeAction.f31370c;
        }

        /* renamed from: getPrevious-eUduSuo  reason: not valid java name */
        public final int m73370getPreviouseUduSuo() {
            return ImeAction.f31374g;
        }

        /* renamed from: getSearch-eUduSuo  reason: not valid java name */
        public final int m73371getSearcheUduSuo() {
            return ImeAction.f31372e;
        }

        /* renamed from: getSend-eUduSuo  reason: not valid java name */
        public final int m73372getSendeUduSuo() {
            return ImeAction.f31373f;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ImeAction(int i) {
        this.f31377a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ImeAction m73350boximpl(int i) {
        return new ImeAction(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m73351constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73352equalsimpl(int i, Object obj) {
        return (obj instanceof ImeAction) && i == ((ImeAction) obj).m73356unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73353equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73354hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73355toStringimpl(int i) {
        if (m73353equalsimpl0(i, f31370c)) {
            return "None";
        }
        if (m73353equalsimpl0(i, f31369b)) {
            return Constant.OnePostpaidVerifyKey.Default;
        }
        if (m73353equalsimpl0(i, f31371d)) {
            return "Go";
        }
        if (m73353equalsimpl0(i, f31372e)) {
            return "Search";
        }
        if (m73353equalsimpl0(i, f31373f)) {
            return "Send";
        }
        if (m73353equalsimpl0(i, f31374g)) {
            return "Previous";
        }
        if (m73353equalsimpl0(i, f31375h)) {
            return "Next";
        }
        if (m73353equalsimpl0(i, f31376i)) {
            return "Done";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m73352equalsimpl(this.f31377a, obj);
    }

    public int hashCode() {
        return m73354hashCodeimpl(this.f31377a);
    }

    @NotNull
    public String toString() {
        return m73355toStringimpl(this.f31377a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m73356unboximpl() {
        return this.f31377a;
    }
}
