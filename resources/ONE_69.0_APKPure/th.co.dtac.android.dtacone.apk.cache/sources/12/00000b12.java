package p000;

import android.view.KeyEvent;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.input.key.KeyInputModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Lh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18020Lh0 extends Modifier.Node implements KeyInputModifierNode {

    /* renamed from: n */
    public Function1 f3660n;

    /* renamed from: o */
    public Function1 f3661o;

    public C18020Lh0(Function1 function1, Function1 function12) {
        this.f3660n = function1;
        this.f3661o = function12;
    }

    /* renamed from: a */
    public final void m67528a(Function1 function1) {
        this.f3660n = function1;
    }

    /* renamed from: b */
    public final void m67527b(Function1 function1) {
        this.f3661o = function1;
    }

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean mo69365onKeyEventZmokQxo(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = this.f3660n;
        if (function1 != null) {
            return ((Boolean) function1.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72771boximpl(event))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean mo69366onPreKeyEventZmokQxo(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = this.f3661o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72771boximpl(event))).booleanValue();
        }
        return false;
    }
}