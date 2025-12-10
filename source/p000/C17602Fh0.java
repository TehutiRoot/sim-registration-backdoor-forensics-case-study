package p000;

import android.view.KeyEvent;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.input.key.KeyInputModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Fh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17602Fh0 extends Modifier.Node implements KeyInputModifierNode {

    /* renamed from: n */
    public Function1 f1672n;

    /* renamed from: o */
    public Function1 f1673o;

    public C17602Fh0(Function1 function1, Function1 function12) {
        this.f1672n = function1;
        this.f1673o = function12;
    }

    /* renamed from: a */
    public final void m68375a(Function1 function1) {
        this.f1672n = function1;
    }

    /* renamed from: b */
    public final void m68374b(Function1 function1) {
        this.f1673o = function1;
    }

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean mo69161onKeyEventZmokQxo(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = this.f1672n;
        if (function1 != null) {
            return ((Boolean) function1.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72587boximpl(event))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean mo69162onPreKeyEventZmokQxo(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = this.f1673o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72587boximpl(event))).booleanValue();
        }
        return false;
    }
}
