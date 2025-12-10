package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.focus.FocusRequesterModifierNode;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q30 */
/* loaded from: classes2.dex */
public final class Q30 extends Modifier.Node implements FocusRequesterModifierNode {

    /* renamed from: n */
    public FocusRequester f4941n;

    public Q30(FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.f4941n = focusRequester;
    }

    /* renamed from: a */
    public final FocusRequester m66691a() {
        return this.f4941n;
    }

    /* renamed from: b */
    public final void m66690b(FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f4941n = focusRequester;
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.f4941n.getFocusRequesterNodes$ui_release().add(this);
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onDetach() {
        this.f4941n.getFocusRequesterNodes$ui_release().remove(this);
        super.onDetach();
    }
}
