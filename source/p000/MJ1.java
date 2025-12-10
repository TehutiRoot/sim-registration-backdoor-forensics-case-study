package p000;

import p046rx.Scheduler;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;

/* renamed from: MJ1 */
/* loaded from: classes7.dex */
public class MJ1 implements Action0 {

    /* renamed from: a */
    public final Action0 f3741a;

    /* renamed from: b */
    public final Scheduler.Worker f3742b;

    /* renamed from: c */
    public final long f3743c;

    public MJ1(Action0 action0, Scheduler.Worker worker, long j) {
        this.f3741a = action0;
        this.f3742b = worker;
        this.f3743c = j;
    }

    @Override // p046rx.functions.Action0
    public void call() {
        if (this.f3742b.isUnsubscribed()) {
            return;
        }
        long now = this.f3743c - this.f3742b.now();
        if (now > 0) {
            try {
                Thread.sleep(now);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Exceptions.propagate(e);
            }
        }
        if (this.f3742b.isUnsubscribed()) {
            return;
        }
        this.f3741a.call();
    }
}
