package p000;

import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* renamed from: DF */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0233DF implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f963a;

    public /* synthetic */ RunnableC0233DF(DelayMetCommandHandler delayMetCommandHandler) {
        this.f963a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DelayMetCommandHandler.m52215b(this.f963a);
    }
}