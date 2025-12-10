package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eRE\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128W@WX\u0097\u000eø\u0001\u0000¢\u0006\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aRE\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128W@WX\u0097\u000eø\u0001\u0000¢\u0006\u0012\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR$\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR$\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR$\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR$\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR$\u0010+\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR$\u0010.\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000eø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "canFocus", "", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "<anonymous parameter 0>", "Landroidx/compose/ui/focus/FocusRequester;", "down", "getDown", "()Landroidx/compose/ui/focus/FocusRequester;", "setDown", "(Landroidx/compose/ui/focus/FocusRequester;)V", "end", "getEnd", "setEnd", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "enter", "getEnter$annotations", "()V", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "exit", "getExit$annotations", "getExit", "setExit", "left", "getLeft", "setLeft", "next", "getNext", "setNext", "previous", "getPrevious", "setPrevious", "right", "getRight", "setRight", "start", "getStart", "setStart", "up", "getUp", "setUp", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.focus.FocusProperties */
/* loaded from: classes2.dex */
public interface FocusProperties {
    boolean getCanFocus();

    @NotNull
    FocusRequester getDown();

    @NotNull
    FocusRequester getEnd();

    @ExperimentalComposeUiApi
    @NotNull
    Function1<FocusDirection, FocusRequester> getEnter();

    @ExperimentalComposeUiApi
    @NotNull
    Function1<FocusDirection, FocusRequester> getExit();

    @NotNull
    FocusRequester getLeft();

    @NotNull
    FocusRequester getNext();

    @NotNull
    FocusRequester getPrevious();

    @NotNull
    FocusRequester getRight();

    @NotNull
    FocusRequester getStart();

    @NotNull
    FocusRequester getUp();

    void setCanFocus(boolean z);

    void setDown(@NotNull FocusRequester focusRequester);

    void setEnd(@NotNull FocusRequester focusRequester);

    @ExperimentalComposeUiApi
    void setEnter(@NotNull Function1<? super FocusDirection, FocusRequester> function1);

    @ExperimentalComposeUiApi
    void setExit(@NotNull Function1<? super FocusDirection, FocusRequester> function1);

    void setLeft(@NotNull FocusRequester focusRequester);

    void setNext(@NotNull FocusRequester focusRequester);

    void setPrevious(@NotNull FocusRequester focusRequester);

    void setRight(@NotNull FocusRequester focusRequester);

    void setStart(@NotNull FocusRequester focusRequester);

    void setUp(@NotNull FocusRequester focusRequester);

    /* renamed from: androidx.compose.ui.focus.FocusProperties$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        /* renamed from: a */
        public static FocusRequester m59824a(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        /* renamed from: b */
        public static FocusRequester m59823b(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        /* renamed from: c */
        public static Function1 m59822c(FocusProperties focusProperties) {
            return FocusProperties$enter$1.INSTANCE;
        }

        /* renamed from: d */
        public static Function1 m59821d(FocusProperties focusProperties) {
            return FocusProperties$exit$1.INSTANCE;
        }

        /* renamed from: e */
        public static FocusRequester m59820e(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        /* renamed from: f */
        public static FocusRequester m59819f(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        /* renamed from: g */
        public static FocusRequester m59818g(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        /* renamed from: h */
        public static FocusRequester m59817h(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        /* renamed from: i */
        public static FocusRequester m59816i(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        /* renamed from: j */
        public static FocusRequester m59815j(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        /* renamed from: k */
        public static void m59814k(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: l */
        public static void m59813l(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: m */
        public static void m59812m(FocusProperties focusProperties, Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "<anonymous parameter 0>");
        }

        /* renamed from: n */
        public static void m59811n(FocusProperties focusProperties, Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "<anonymous parameter 0>");
        }

        /* renamed from: o */
        public static void m59810o(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: p */
        public static void m59809p(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: q */
        public static void m59808q(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: r */
        public static void m59807r(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: s */
        public static void m59806s(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: t */
        public static void m59805t(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: u */
        public static /* synthetic */ void m59804u() {
        }

        /* renamed from: v */
        public static /* synthetic */ void m59803v() {
        }
    }
}
