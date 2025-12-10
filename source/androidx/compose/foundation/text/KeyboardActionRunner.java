package androidx.compose.foundation.text;

import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.TextInputSession;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, m28850d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "<init>", "()V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "", "runAction-KlQnJC8", "(I)V", "runAction", "defaultKeyboardAction-KlQnJC8", "defaultKeyboardAction", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "Landroidx/compose/ui/text/input/TextInputSession;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "inputSession", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {

    /* renamed from: a */
    public TextInputSession f13976a;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8  reason: not valid java name */
    public void mo69736defaultKeyboardActionKlQnJC8(int i) {
        boolean m73353equalsimpl0;
        boolean m73353equalsimpl02;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m73353equalsimpl0(i, companion.m73368getNexteUduSuo())) {
            getFocusManager().mo71450moveFocus3ESFkO8(FocusDirection.Companion.m71445getNextdhqQ8s());
        } else if (ImeAction.m73353equalsimpl0(i, companion.m73370getPreviouseUduSuo())) {
            getFocusManager().mo71450moveFocus3ESFkO8(FocusDirection.Companion.m71447getPreviousdhqQ8s());
        } else if (ImeAction.m73353equalsimpl0(i, companion.m73366getDoneeUduSuo())) {
            TextInputSession textInputSession = this.f13976a;
            if (textInputSession != null) {
                textInputSession.hideSoftwareKeyboard();
            }
        } else {
            boolean z = true;
            if (ImeAction.m73353equalsimpl0(i, companion.m73367getGoeUduSuo())) {
                m73353equalsimpl0 = true;
            } else {
                m73353equalsimpl0 = ImeAction.m73353equalsimpl0(i, companion.m73371getSearcheUduSuo());
            }
            if (m73353equalsimpl0) {
                m73353equalsimpl02 = true;
            } else {
                m73353equalsimpl02 = ImeAction.m73353equalsimpl0(i, companion.m73372getSendeUduSuo());
            }
            if (!m73353equalsimpl02) {
                z = ImeAction.m73353equalsimpl0(i, companion.m73365getDefaulteUduSuo());
            }
            if (!z) {
                ImeAction.m73353equalsimpl0(i, companion.m73369getNoneeUduSuo());
            }
        }
    }

    @NotNull
    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    @Nullable
    public final TextInputSession getInputSession() {
        return this.f13976a;
    }

    @NotNull
    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8  reason: not valid java name */
    public final void m69737runActionKlQnJC8(int i) {
        boolean m73353equalsimpl0;
        Function1<KeyboardActionScope, Unit> function1;
        ImeAction.Companion companion = ImeAction.Companion;
        Unit unit = null;
        if (ImeAction.m73353equalsimpl0(i, companion.m73366getDoneeUduSuo())) {
            function1 = getKeyboardActions().getOnDone();
        } else if (ImeAction.m73353equalsimpl0(i, companion.m73367getGoeUduSuo())) {
            function1 = getKeyboardActions().getOnGo();
        } else if (ImeAction.m73353equalsimpl0(i, companion.m73368getNexteUduSuo())) {
            function1 = getKeyboardActions().getOnNext();
        } else if (ImeAction.m73353equalsimpl0(i, companion.m73370getPreviouseUduSuo())) {
            function1 = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m73353equalsimpl0(i, companion.m73371getSearcheUduSuo())) {
            function1 = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m73353equalsimpl0(i, companion.m73372getSendeUduSuo())) {
            function1 = getKeyboardActions().getOnSend();
        } else {
            if (ImeAction.m73353equalsimpl0(i, companion.m73365getDefaulteUduSuo())) {
                m73353equalsimpl0 = true;
            } else {
                m73353equalsimpl0 = ImeAction.m73353equalsimpl0(i, companion.m73369getNoneeUduSuo());
            }
            if (m73353equalsimpl0) {
                function1 = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (function1 != null) {
            function1.invoke(this);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            mo69736defaultKeyboardActionKlQnJC8(i);
        }
    }

    public final void setFocusManager(@NotNull FocusManager focusManager) {
        Intrinsics.checkNotNullParameter(focusManager, "<set-?>");
        this.focusManager = focusManager;
    }

    public final void setInputSession(@Nullable TextInputSession textInputSession) {
        this.f13976a = textInputSession;
    }

    public final void setKeyboardActions(@NotNull KeyboardActions keyboardActions) {
        Intrinsics.checkNotNullParameter(keyboardActions, "<set-?>");
        this.keyboardActions = keyboardActions;
    }
}
