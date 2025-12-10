package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.focus.FocusRequester;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001f\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010#\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010'\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\"\u0010+\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\"\u0010/\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012R7\u00109\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\f008\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b2\u00103\u0012\u0004\b8\u0010\u0003\u001a\u0004\b4\u00105\"\u0004\b6\u00107R7\u0010>\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\f008\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b:\u00103\u0012\u0004\b=\u0010\u0003\u001a\u0004\b;\u00105\"\u0004\b<\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/FocusRequester;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/focus/FocusRequester;", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", OperatorName.CURVE_TO, "getPrevious", "setPrevious", "previous", "d", "getUp", "setUp", "up", "e", "getDown", "setDown", "down", OperatorName.FILL_NON_ZERO, "getLeft", "setLeft", "left", OperatorName.NON_STROKING_GRAY, "getRight", "setRight", "right", OperatorName.CLOSE_PATH, "getStart", "setStart", "start", "i", "getEnd", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlin/jvm/functions/Function1;", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "getEnter$annotations", "enter", OperatorName.NON_STROKING_CMYK, "getExit", "setExit", "getExit$annotations", "exit", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.FocusPropertiesImpl */
/* loaded from: classes2.dex */
public final class FocusPropertiesImpl implements FocusProperties {

    /* renamed from: a */
    public boolean f28923a = true;

    /* renamed from: b */
    public FocusRequester f28924b;

    /* renamed from: c */
    public FocusRequester f28925c;

    /* renamed from: d */
    public FocusRequester f28926d;

    /* renamed from: e */
    public FocusRequester f28927e;

    /* renamed from: f */
    public FocusRequester f28928f;

    /* renamed from: g */
    public FocusRequester f28929g;

    /* renamed from: h */
    public FocusRequester f28930h;

    /* renamed from: i */
    public FocusRequester f28931i;

    /* renamed from: j */
    public Function1 f28932j;

    /* renamed from: k */
    public Function1 f28933k;

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.Companion;
        this.f28924b = companion.getDefault();
        this.f28925c = companion.getDefault();
        this.f28926d = companion.getDefault();
        this.f28927e = companion.getDefault();
        this.f28928f = companion.getDefault();
        this.f28929g = companion.getDefault();
        this.f28930h = companion.getDefault();
        this.f28931i = companion.getDefault();
        this.f28932j = FocusPropertiesImpl$enter$1.INSTANCE;
        this.f28933k = FocusPropertiesImpl$exit$1.INSTANCE;
    }

    public static /* synthetic */ void getEnter$annotations() {
    }

    public static /* synthetic */ void getExit$annotations() {
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.f28923a;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getDown() {
        return this.f28927e;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getEnd() {
        return this.f28931i;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public Function1<FocusDirection, FocusRequester> getEnter() {
        return this.f28932j;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public Function1<FocusDirection, FocusRequester> getExit() {
        return this.f28933k;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getLeft() {
        return this.f28928f;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getNext() {
        return this.f28924b;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getPrevious() {
        return this.f28925c;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getRight() {
        return this.f28929g;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getStart() {
        return this.f28930h;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getUp() {
        return this.f28926d;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        this.f28923a = z;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setDown(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f28927e = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setEnd(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f28931i = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setEnter(@NotNull Function1<? super FocusDirection, FocusRequester> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f28932j = function1;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setExit(@NotNull Function1<? super FocusDirection, FocusRequester> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f28933k = function1;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setLeft(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f28928f = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setNext(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f28924b = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setPrevious(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f28925c = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setRight(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f28929g = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setStart(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f28930h = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setUp(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f28926d = focusRequester;
    }
}
