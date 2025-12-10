package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes.dex */
public final class OnBackInstance {

    /* renamed from: a */
    public final boolean f8716a;

    /* renamed from: b */
    public final Channel f8717b = ChannelKt.Channel$default(-2, BufferOverflow.SUSPEND, null, 4, null);

    /* renamed from: c */
    public final Job f8718c;

    public OnBackInstance(CoroutineScope coroutineScope, boolean z, Function2 function2) {
        Job m65753e;
        this.f8716a = z;
        m65753e = AbstractC1552Vc.m65753e(coroutineScope, null, null, new OnBackInstance$job$1(function2, this, null), 3, null);
        this.f8718c = m65753e;
    }

    /* renamed from: a */
    public final void m64766a() {
        this.f8717b.cancel(new CancellationException("onBack cancelled"));
        Job.DefaultImpls.cancel$default(this.f8718c, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: b */
    public final boolean m64765b() {
        return SendChannel.DefaultImpls.close$default(this.f8717b, null, 1, null);
    }

    /* renamed from: c */
    public final Channel m64764c() {
        return this.f8717b;
    }

    /* renamed from: d */
    public final boolean m64763d() {
        return this.f8716a;
    }

    /* renamed from: e */
    public final Object m64762e(BackEventCompat backEventCompat) {
        return this.f8717b.mo74066trySendJP2dKIU(backEventCompat);
    }
}
