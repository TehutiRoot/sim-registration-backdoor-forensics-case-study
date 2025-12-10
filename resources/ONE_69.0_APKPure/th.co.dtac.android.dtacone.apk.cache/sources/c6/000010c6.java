package p000;

import android.view.KeyEvent;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.input.key.SoftKeyboardInterceptionModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Rf0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18404Rf0 extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {

    /* renamed from: n */
    public Function1 f5586n;

    /* renamed from: o */
    public Function1 f5587o;

    public C18404Rf0(Function1 function1, Function1 function12) {
        this.f5586n = function1;
        this.f5587o = function12;
    }

    /* renamed from: a */
    public final void m66610a(Function1 function1) {
        this.f5586n = function1;
    }

    /* renamed from: b */
    public final void m66609b(Function1 function1) {
        this.f5587o = function1;
    }

    @Override // androidx.compose.p003ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo  reason: not valid java name */
    public boolean mo69369onInterceptKeyBeforeSoftKeyboardZmokQxo(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = this.f5586n;
        if (function1 != null) {
            return ((Boolean) function1.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72771boximpl(event))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p003ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo  reason: not valid java name */
    public boolean mo69370onPreInterceptKeyBeforeSoftKeyboardZmokQxo(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = this.f5587o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72771boximpl(event))).booleanValue();
        }
        return false;
    }
}