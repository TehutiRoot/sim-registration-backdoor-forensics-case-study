package p000;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: QF */
/* loaded from: classes4.dex */
public class ScheduledFutureC1158QF extends AbstractResolvableFuture implements ScheduledFuture {

    /* renamed from: h */
    public final ScheduledFuture f5012h;

    /* renamed from: QF$a */
    /* loaded from: classes4.dex */
    public class C1159a implements InterfaceC1160b {
        public C1159a() {
        }

        @Override // p000.ScheduledFutureC1158QF.InterfaceC1160b
        /* renamed from: a */
        public void mo66630a(Throwable th2) {
            ScheduledFutureC1158QF.this.setException(th2);
        }

        @Override // p000.ScheduledFutureC1158QF.InterfaceC1160b
        public void set(Object obj) {
            ScheduledFutureC1158QF.this.set(obj);
        }
    }

    /* renamed from: QF$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC1160b {
        /* renamed from: a */
        void mo66630a(Throwable th2);

        void set(Object obj);
    }

    /* renamed from: QF$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC1161c {
        /* renamed from: a */
        ScheduledFuture mo66629a(InterfaceC1160b interfaceC1160b);
    }

    public ScheduledFutureC1158QF(InterfaceC1161c interfaceC1161c) {
        this.f5012h = interfaceC1161c.mo66629a(new C1159a());
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public void afterDone() {
        this.f5012h.cancel(wasInterrupted());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f5012h.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: o */
    public int compareTo(Delayed delayed) {
        return this.f5012h.compareTo(delayed);
    }
}
