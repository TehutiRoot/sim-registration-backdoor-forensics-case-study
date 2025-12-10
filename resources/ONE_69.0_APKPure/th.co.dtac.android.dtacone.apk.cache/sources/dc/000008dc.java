package p000;

import p046rx.Scheduler;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;

/* renamed from: JK1 */
/* loaded from: classes7.dex */
public class JK1 implements Action0 {

    /* renamed from: a */
    public final Action0 f2977a;

    /* renamed from: b */
    public final Scheduler.Worker f2978b;

    /* renamed from: c */
    public final long f2979c;

    public JK1(Action0 action0, Scheduler.Worker worker, long j) {
        this.f2977a = action0;
        this.f2978b = worker;
        this.f2979c = j;
    }

    @Override // p046rx.functions.Action0
    public void call() {
        if (this.f2978b.isUnsubscribed()) {
            return;
        }
        long now = this.f2979c - this.f2978b.now();
        if (now > 0) {
            try {
                Thread.sleep(now);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Exceptions.propagate(e);
            }
        }
        if (this.f2978b.isUnsubscribed()) {
            return;
        }
        this.f2977a.call();
    }
}