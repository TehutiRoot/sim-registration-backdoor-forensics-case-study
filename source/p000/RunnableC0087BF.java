package p000;

import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* renamed from: BF */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0087BF implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f332a;

    public /* synthetic */ RunnableC0087BF(DelayMetCommandHandler delayMetCommandHandler) {
        this.f332a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DelayMetCommandHandler.m52264a(this.f332a);
    }
}
