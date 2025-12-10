package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* renamed from: ni0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C21285ni0 extends C17182zF {

    /* renamed from: d */
    public final Continuation f72425d;

    public C21285ni0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f72425d = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() {
        CancellableKt.startCoroutineCancellable(this.f72425d, this);
    }
}
