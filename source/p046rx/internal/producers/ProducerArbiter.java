package p046rx.internal.producers;

import p046rx.Producer;

/* renamed from: rx.internal.producers.ProducerArbiter */
/* loaded from: classes7.dex */
public final class ProducerArbiter implements Producer {

    /* renamed from: g */
    public static final Producer f79045g = new C13727a();

    /* renamed from: a */
    public long f79046a;

    /* renamed from: b */
    public Producer f79047b;

    /* renamed from: c */
    public boolean f79048c;

    /* renamed from: d */
    public long f79049d;

    /* renamed from: e */
    public long f79050e;

    /* renamed from: f */
    public Producer f79051f;

    /* renamed from: rx.internal.producers.ProducerArbiter$a */
    /* loaded from: classes7.dex */
    public static class C13727a implements Producer {
        @Override // p046rx.Producer
        public void request(long j) {
        }
    }

    public void emitLoop() {
        while (true) {
            synchronized (this) {
                try {
                    long j = this.f79049d;
                    long j2 = this.f79050e;
                    Producer producer = this.f79051f;
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i == 0 && j2 == 0 && producer == null) {
                        this.f79048c = false;
                        return;
                    }
                    this.f79049d = 0L;
                    this.f79050e = 0L;
                    this.f79051f = null;
                    long j3 = this.f79046a;
                    if (j3 != Long.MAX_VALUE) {
                        long j4 = j3 + j;
                        if (j4 >= 0 && j4 != Long.MAX_VALUE) {
                            j3 = j4 - j2;
                            if (j3 >= 0) {
                                this.f79046a = j3;
                            } else {
                                throw new IllegalStateException("more produced than requested");
                            }
                        } else {
                            this.f79046a = Long.MAX_VALUE;
                            j3 = Long.MAX_VALUE;
                        }
                    }
                    if (producer != null) {
                        if (producer == f79045g) {
                            this.f79047b = null;
                        } else {
                            this.f79047b = producer;
                            producer.request(j3);
                        }
                    } else {
                        Producer producer2 = this.f79047b;
                        if (producer2 != null && i != 0) {
                            producer2.request(j);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void produced(long j) {
        if (j > 0) {
            synchronized (this) {
                try {
                    if (this.f79048c) {
                        this.f79050e += j;
                        return;
                    }
                    this.f79048c = true;
                    try {
                        long j2 = this.f79046a;
                        if (j2 != Long.MAX_VALUE) {
                            long j3 = j2 - j;
                            if (j3 >= 0) {
                                this.f79046a = j3;
                            } else {
                                throw new IllegalStateException("more items arrived than were requested");
                            }
                        }
                        emitLoop();
                        return;
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f79048c = false;
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        }
        throw new IllegalArgumentException("n > 0 required");
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
                    if (this.f79048c) {
                        this.f79049d += j;
                        return;
                    }
                    this.f79048c = true;
                    try {
                        long j2 = this.f79046a + j;
                        if (j2 < 0) {
                            j2 = Long.MAX_VALUE;
                        }
                        this.f79046a = j2;
                        Producer producer = this.f79047b;
                        if (producer != null) {
                            producer.request(j);
                        }
                        emitLoop();
                        return;
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f79048c = false;
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        }
        throw new IllegalArgumentException("n >= 0 required");
    }

    public void setProducer(Producer producer) {
        synchronized (this) {
            try {
                if (this.f79048c) {
                    if (producer == null) {
                        producer = f79045g;
                    }
                    this.f79051f = producer;
                    return;
                }
                this.f79048c = true;
                try {
                    this.f79047b = producer;
                    if (producer != null) {
                        producer.request(this.f79046a);
                    }
                    emitLoop();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f79048c = false;
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }
}
