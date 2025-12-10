package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusEventModifierNode;
import androidx.compose.p003ui.focus.FocusState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C30 */
/* loaded from: classes2.dex */
public final class C30 extends Modifier.Node implements FocusEventModifierNode {

    /* renamed from: n */
    public Function1 f633n;

    /* renamed from: o */
    public FocusState f634o;

    public C30(Function1 onFocusChanged) {
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        this.f633n = onFocusChanged;
    }

    /* renamed from: a */
    public final void m69020a(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f633n = function1;
    }

    @Override // androidx.compose.p003ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (!Intrinsics.areEqual(this.f634o, focusState)) {
            this.f634o = focusState;
            this.f633n.invoke(focusState);
        }
    }
}