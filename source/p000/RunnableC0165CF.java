package p000;

import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* renamed from: CF */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0165CF implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f646a;

    public /* synthetic */ RunnableC0165CF(DelayMetCommandHandler delayMetCommandHandler) {
        this.f646a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DelayMetCommandHandler.m52263b(this.f646a);
    }
}
