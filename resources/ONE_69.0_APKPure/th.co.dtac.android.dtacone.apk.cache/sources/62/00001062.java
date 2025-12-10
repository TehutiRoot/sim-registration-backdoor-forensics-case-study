package p000;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: RF */
/* loaded from: classes4.dex */
public class ScheduledFutureC1208RF extends AbstractResolvableFuture implements ScheduledFuture {

    /* renamed from: h */
    public final ScheduledFuture f5450h;

    /* renamed from: RF$a */
    /* loaded from: classes4.dex */
    public class C1209a implements InterfaceC1210b {
        public C1209a() {
        }

        @Override // p000.ScheduledFutureC1208RF.InterfaceC1210b
        /* renamed from: a */
        public void mo66677a(Throwable th2) {
            ScheduledFutureC1208RF.this.setException(th2);
        }

        @Override // p000.ScheduledFutureC1208RF.InterfaceC1210b
        public void set(Object obj) {
            ScheduledFutureC1208RF.this.set(obj);
        }
    }

    /* renamed from: RF$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC1210b {
        /* renamed from: a */
        void mo66677a(Throwable th2);

        void set(Object obj);
    }

    /* renamed from: RF$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC1211c {
        /* renamed from: a */
        ScheduledFuture mo66676a(InterfaceC1210b interfaceC1210b);
    }

    public ScheduledFutureC1208RF(InterfaceC1211c interfaceC1211c) {
        this.f5450h = interfaceC1211c.mo66676a(new C1209a());
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public void afterDone() {
        this.f5450h.cancel(wasInterrupted());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f5450h.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: o */
    public int compareTo(Delayed delayed) {
        return this.f5450h.compareTo(delayed);
    }
}