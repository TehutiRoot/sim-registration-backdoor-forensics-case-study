package p046rx.android.schedulers;

import android.os.Handler;
import p046rx.Scheduler;

@Deprecated
/* renamed from: rx.android.schedulers.HandlerScheduler */
/* loaded from: classes5.dex */
public final class HandlerScheduler extends C18065Mm0 {
    public HandlerScheduler(Handler handler) {
        super(handler);
    }

    @Deprecated
    public static HandlerScheduler from(Handler handler) {
        if (handler != null) {
            return new HandlerScheduler(handler);
        }
        throw new NullPointerException("handler == null");
    }

    @Override // p000.C18065Mm0, p046rx.Scheduler
    public /* bridge */ /* synthetic */ Scheduler.Worker createWorker() {
        return super.createWorker();
    }
}
