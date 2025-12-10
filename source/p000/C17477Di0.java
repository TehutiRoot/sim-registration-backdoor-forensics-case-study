package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* renamed from: Di0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17477Di0 extends FL1 {

    /* renamed from: d */
    public final Continuation f1076d;

    public C17477Di0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f1076d = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() {
        CancellableKt.startCoroutineCancellable(this.f1076d, this);
    }
}
