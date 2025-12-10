package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.C12047a;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* renamed from: ki0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20769ki0 extends C12047a {

    /* renamed from: e */
    public final Continuation f67993e;

    public C20769ki0(CoroutineContext coroutineContext, BroadcastChannel broadcastChannel, Function2 function2) {
        super(coroutineContext, broadcastChannel, false);
        this.f67993e = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() {
        CancellableKt.startCoroutineCancellable(this.f67993e, this);
    }

    @Override // kotlinx.coroutines.channels.C12047a, kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel openSubscription() {
        ReceiveChannel openSubscription = m27125I().openSubscription();
        start();
        return openSubscription;
    }
}
