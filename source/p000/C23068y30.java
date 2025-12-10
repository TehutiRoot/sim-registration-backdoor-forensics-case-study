package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusEventModifierNode;
import androidx.compose.p003ui.focus.FocusState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y30  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C23068y30 extends Modifier.Node implements FocusEventModifierNode {

    /* renamed from: n */
    public Function1 f108606n;

    /* renamed from: o */
    public FocusState f108607o;

    public C23068y30(Function1 onFocusChanged) {
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        this.f108606n = onFocusChanged;
    }

    /* renamed from: a */
    public final void m348a(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f108606n = function1;
    }

    @Override // androidx.compose.p003ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (!Intrinsics.areEqual(this.f108607o, focusState)) {
            this.f108607o = focusState;
            this.f108606n.invoke(focusState);
        }
    }
}
