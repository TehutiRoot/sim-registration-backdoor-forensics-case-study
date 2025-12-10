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
    public final boolean f8804a;

    /* renamed from: b */
    public final Channel f8805b = ChannelKt.Channel$default(-2, BufferOverflow.SUSPEND, null, 4, null);

    /* renamed from: c */
    public final Job f8806c;

    public OnBackInstance(CoroutineScope coroutineScope, boolean z, Function2 function2) {
        Job m65885e;
        this.f8804a = z;
        m65885e = AbstractC1539Vc.m65885e(coroutineScope, null, null, new OnBackInstance$job$1(function2, this, null), 3, null);
        this.f8806c = m65885e;
    }

    /* renamed from: a */
    public final void m64717a() {
        this.f8805b.cancel(new CancellationException("onBack cancelled"));
        Job.DefaultImpls.cancel$default(this.f8806c, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: b */
    public final boolean m64716b() {
        return SendChannel.DefaultImpls.close$default(this.f8805b, null, 1, null);
    }

    /* renamed from: c */
    public final Channel m64715c() {
        return this.f8805b;
    }

    /* renamed from: d */
    public final boolean m64714d() {
        return this.f8804a;
    }

    /* renamed from: e */
    public final Object m64713e(BackEventCompat backEventCompat) {
        return this.f8805b.mo74250trySendJP2dKIU(backEventCompat);
    }
}