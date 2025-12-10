package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.focus.FocusRequesterModifierNode;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: U30 */
/* loaded from: classes2.dex */
public final class U30 extends Modifier.Node implements FocusRequesterModifierNode {

    /* renamed from: n */
    public FocusRequester f6507n;

    public U30(FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.f6507n = focusRequester;
    }

    /* renamed from: a */
    public final FocusRequester m66273a() {
        return this.f6507n;
    }

    /* renamed from: b */
    public final void m66272b(FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f6507n = focusRequester;
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.f6507n.getFocusRequesterNodes$ui_release().add(this);
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onDetach() {
        this.f6507n.getFocusRequesterNodes$ui_release().remove(this);
        super.onDetach();
    }
}