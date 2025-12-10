package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusEventModifierNode;
import androidx.compose.p003ui.focus.FocusState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E30 */
/* loaded from: classes2.dex */
public final class E30 extends Modifier.Node implements FocusEventModifierNode {

    /* renamed from: n */
    public Function1 f1237n;

    public E30(Function1 onFocusEvent) {
        Intrinsics.checkNotNullParameter(onFocusEvent, "onFocusEvent");
        this.f1237n = onFocusEvent;
    }

    /* renamed from: a */
    public final void m68703a(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f1237n = function1;
    }

    @Override // androidx.compose.p003ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        this.f1237n.invoke(focusState);
    }
}