package p000;

import android.view.KeyEvent;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.input.key.SoftKeyboardInterceptionModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Lf0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17980Lf0 extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {

    /* renamed from: n */
    public Function1 f3517n;

    /* renamed from: o */
    public Function1 f3518o;

    public C17980Lf0(Function1 function1, Function1 function12) {
        this.f3517n = function1;
        this.f3518o = function12;
    }

    /* renamed from: a */
    public final void m67506a(Function1 function1) {
        this.f3517n = function1;
    }

    /* renamed from: b */
    public final void m67505b(Function1 function1) {
        this.f3518o = function1;
    }

    @Override // androidx.compose.p003ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo  reason: not valid java name */
    public boolean mo69182onInterceptKeyBeforeSoftKeyboardZmokQxo(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = this.f3517n;
        if (function1 != null) {
            return ((Boolean) function1.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72587boximpl(event))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p003ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo  reason: not valid java name */
    public boolean mo69183onPreInterceptKeyBeforeSoftKeyboardZmokQxo(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = this.f3518o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72587boximpl(event))).booleanValue();
        }
        return false;
    }
}
