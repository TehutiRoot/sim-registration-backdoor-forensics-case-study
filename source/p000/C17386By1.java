package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p003ui.input.rotary.RotaryScrollEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: By1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17386By1 extends Modifier.Node implements RotaryInputModifierNode {

    /* renamed from: n */
    public Function1 f574n;

    /* renamed from: o */
    public Function1 f575o;

    public C17386By1(Function1 function1, Function1 function12) {
        this.f574n = function1;
        this.f575o = function12;
    }

    /* renamed from: a */
    public final void m68845a(Function1 function1) {
        this.f574n = function1;
    }

    /* renamed from: b */
    public final void m68844b(Function1 function1) {
        this.f575o = function1;
    }

    @Override // androidx.compose.p003ui.input.rotary.RotaryInputModifierNode
    public boolean onPreRotaryScrollEvent(RotaryScrollEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = this.f575o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(event)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p003ui.input.rotary.RotaryInputModifierNode
    public boolean onRotaryScrollEvent(RotaryScrollEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = this.f574n;
        if (function1 != null) {
            return ((Boolean) function1.invoke(event)).booleanValue();
        }
        return false;
    }
}
