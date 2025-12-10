package p000;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* renamed from: Q9 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1140Q9 {
    /* renamed from: a */
    public static long m66835a(AwaitPointerEventScope awaitPointerEventScope) {
        return Size.Companion.m71764getZeroNHjbRc();
    }

    /* renamed from: b */
    public static Object m66834b(AwaitPointerEventScope awaitPointerEventScope, long j, Function2 function2, Continuation continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }

    /* renamed from: c */
    public static Object m66833c(AwaitPointerEventScope awaitPointerEventScope, long j, Function2 function2, Continuation continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }

    /* renamed from: t */
    public static /* synthetic */ Object m66816t(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }
}