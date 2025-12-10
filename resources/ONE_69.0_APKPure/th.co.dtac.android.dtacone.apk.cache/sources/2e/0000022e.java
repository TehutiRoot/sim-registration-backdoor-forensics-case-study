package p000;

import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* renamed from: CF */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0167CF implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f697a;

    public /* synthetic */ RunnableC0167CF(DelayMetCommandHandler delayMetCommandHandler) {
        this.f697a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DelayMetCommandHandler.m52216a(this.f697a);
    }
}