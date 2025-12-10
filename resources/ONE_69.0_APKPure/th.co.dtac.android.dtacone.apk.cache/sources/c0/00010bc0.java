package p046rx.internal.producers;

import java.util.ArrayList;
import java.util.List;
import p046rx.Observer;
import p046rx.Producer;
import p046rx.Subscriber;

/* renamed from: rx.internal.producers.ProducerObserverArbiter */
/* loaded from: classes7.dex */
public final class ProducerObserverArbiter<T> implements Producer, Observer<T> {

    /* renamed from: j */
    public static final Producer f79258j = new C13729a();

    /* renamed from: a */
    public final Subscriber f79259a;

    /* renamed from: b */
    public boolean f79260b;

    /* renamed from: c */
    public List f79261c;

    /* renamed from: d */
    public Producer f79262d;

    /* renamed from: e */
    public long f79263e;

    /* renamed from: f */
    public long f79264f;

    /* renamed from: g */
    public Producer f79265g;

    /* renamed from: h */
    public Object f79266h;

    /* renamed from: i */
    public volatile boolean f79267i;

    /* renamed from: rx.internal.producers.ProducerObserverArbiter$a */
    /* loaded from: classes7.dex */
    public static class C13729a implements Producer {
        @Override // p046rx.Producer
        public void request(long j) {
        }
    }

    public ProducerObserverArbiter(Subscriber<? super T> subscriber) {
        this.f79259a = subscriber;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0009, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m23113a() {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.producers.ProducerObserverArbiter.m23113a():void");
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        synchronized (this) {
            try {
                if (this.f79260b) {
                    this.f79266h = Boolean.TRUE;
                    return;
                }
                this.f79260b = true;
                this.f79259a.onCompleted();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        boolean z;
        synchronized (this) {
            try {
                if (this.f79260b) {
                    this.f79266h = th2;
                    z = false;
                } else {
                    this.f79260b = true;
                    z = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z) {
            this.f79259a.onError(th2);
        } else {
            this.f79267i = true;
        }
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        synchronized (this) {
            try {
                if (this.f79260b) {
                    List list = this.f79261c;
                    if (list == null) {
                        list = new ArrayList(4);
                        this.f79261c = list;
                    }
                    list.add(t);
                    return;
                }
                this.f79260b = true;
                try {
                    this.f79259a.onNext(t);
                    long j = this.f79263e;
                    if (j != Long.MAX_VALUE) {
                        this.f79263e = j - 1;
                    }
                    m23113a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f79260b = false;
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }

    @Override // p046rx.Producer
    public void request(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f79260b) {
                        this.f79264f += j;
                        return;
                    }
                    this.f79260b = true;
                    Producer producer = this.f79262d;
                    try {
                        long j2 = this.f79263e + j;
                        if (j2 < 0) {
                            j2 = Long.MAX_VALUE;
                        }
                        this.f79263e = j2;
                        m23113a();
                        if (producer != null) {
                            producer.request(j);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f79260b = false;
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        throw new IllegalArgumentException("n >= 0 required");
    }

    public void setProducer(Producer producer) {
        synchronized (this) {
            try {
                if (this.f79260b) {
                    if (producer == null) {
                        producer = f79258j;
                    }
                    this.f79265g = producer;
                    return;
                }
                this.f79260b = true;
                this.f79262d = producer;
                long j = this.f79263e;
                try {
                    m23113a();
                    if (producer != null && j != 0) {
                        producer.request(j);
                    }
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f79260b = false;
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}