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
    public static final Producer f79052j = new C13728a();

    /* renamed from: a */
    public final Subscriber f79053a;

    /* renamed from: b */
    public boolean f79054b;

    /* renamed from: c */
    public List f79055c;

    /* renamed from: d */
    public Producer f79056d;

    /* renamed from: e */
    public long f79057e;

    /* renamed from: f */
    public long f79058f;

    /* renamed from: g */
    public Producer f79059g;

    /* renamed from: h */
    public Object f79060h;

    /* renamed from: i */
    public volatile boolean f79061i;

    /* renamed from: rx.internal.producers.ProducerObserverArbiter$a */
    /* loaded from: classes7.dex */
    public static class C13728a implements Producer {
        @Override // p046rx.Producer
        public void request(long j) {
        }
    }

    public ProducerObserverArbiter(Subscriber<? super T> subscriber) {
        this.f79053a = subscriber;
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
    public void m22925a() {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.producers.ProducerObserverArbiter.m22925a():void");
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        synchronized (this) {
            try {
                if (this.f79054b) {
                    this.f79060h = Boolean.TRUE;
                    return;
                }
                this.f79054b = true;
                this.f79053a.onCompleted();
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
                if (this.f79054b) {
                    this.f79060h = th2;
                    z = false;
                } else {
                    this.f79054b = true;
                    z = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z) {
            this.f79053a.onError(th2);
        } else {
            this.f79061i = true;
        }
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        synchronized (this) {
            try {
                if (this.f79054b) {
                    List list = this.f79055c;
                    if (list == null) {
                        list = new ArrayList(4);
                        this.f79055c = list;
                    }
                    list.add(t);
                    return;
                }
                this.f79054b = true;
                try {
                    this.f79053a.onNext(t);
                    long j = this.f79057e;
                    if (j != Long.MAX_VALUE) {
                        this.f79057e = j - 1;
                    }
                    m22925a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f79054b = false;
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
                    if (this.f79054b) {
                        this.f79058f += j;
                        return;
                    }
                    this.f79054b = true;
                    Producer producer = this.f79056d;
                    try {
                        long j2 = this.f79057e + j;
                        if (j2 < 0) {
                            j2 = Long.MAX_VALUE;
                        }
                        this.f79057e = j2;
                        m22925a();
                        if (producer != null) {
                            producer.request(j);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f79054b = false;
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
                if (this.f79054b) {
                    if (producer == null) {
                        producer = f79052j;
                    }
                    this.f79059g = producer;
                    return;
                }
                this.f79054b = true;
                this.f79056d = producer;
                long j = this.f79057e;
                try {
                    m22925a();
                    if (producer != null && j != 0) {
                        producer.request(j);
                    }
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f79054b = false;
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
