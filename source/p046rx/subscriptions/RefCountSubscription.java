package p046rx.subscriptions;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Subscription;

/* renamed from: rx.subscriptions.RefCountSubscription */
/* loaded from: classes7.dex */
public final class RefCountSubscription implements Subscription {

    /* renamed from: c */
    public static final C13876a f79514c = new C13876a(false, 0);

    /* renamed from: a */
    public final Subscription f79515a;

    /* renamed from: b */
    public final AtomicReference f79516b = new AtomicReference(f79514c);

    /* renamed from: rx.subscriptions.RefCountSubscription$InnerSubscription */
    /* loaded from: classes7.dex */
    public static final class InnerSubscription extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 7005765588239987643L;
        final RefCountSubscription parent;

        public InnerSubscription(RefCountSubscription refCountSubscription) {
            this.parent = refCountSubscription;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            if (get() != 0) {
                return true;
            }
            return false;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(0, 1)) {
                this.parent.m22735a();
            }
        }
    }

    /* renamed from: rx.subscriptions.RefCountSubscription$a */
    /* loaded from: classes7.dex */
    public static final class C13876a {

        /* renamed from: a */
        public final boolean f79517a;

        /* renamed from: b */
        public final int f79518b;

        public C13876a(boolean z, int i) {
            this.f79517a = z;
            this.f79518b = i;
        }

        /* renamed from: a */
        public C13876a m22733a() {
            return new C13876a(this.f79517a, this.f79518b + 1);
        }

        /* renamed from: b */
        public C13876a m22732b() {
            return new C13876a(this.f79517a, this.f79518b - 1);
        }

        /* renamed from: c */
        public C13876a m22731c() {
            return new C13876a(true, this.f79518b);
        }
    }

    public RefCountSubscription(Subscription subscription) {
        if (subscription != null) {
            this.f79515a = subscription;
            return;
        }
        throw new IllegalArgumentException(OperatorName.CLOSE_AND_STROKE);
    }

    /* renamed from: a */
    public void m22735a() {
        C13876a c13876a;
        C13876a m22732b;
        AtomicReference atomicReference = this.f79516b;
        do {
            c13876a = (C13876a) atomicReference.get();
            m22732b = c13876a.m22732b();
        } while (!AbstractC17300An1.m69050a(atomicReference, c13876a, m22732b));
        m22734b(m22732b);
    }

    /* renamed from: b */
    public final void m22734b(C13876a c13876a) {
        if (c13876a.f79517a && c13876a.f79518b == 0) {
            this.f79515a.unsubscribe();
        }
    }

    public Subscription get() {
        C13876a c13876a;
        AtomicReference atomicReference = this.f79516b;
        do {
            c13876a = (C13876a) atomicReference.get();
            if (c13876a.f79517a) {
                return Subscriptions.unsubscribed();
            }
        } while (!AbstractC17300An1.m69050a(atomicReference, c13876a, c13876a.m22733a()));
        return new InnerSubscription(this);
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        return ((C13876a) this.f79516b.get()).f79517a;
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        C13876a c13876a;
        C13876a m22731c;
        AtomicReference atomicReference = this.f79516b;
        do {
            c13876a = (C13876a) atomicReference.get();
            if (c13876a.f79517a) {
                return;
            }
            m22731c = c13876a.m22731c();
        } while (!AbstractC17300An1.m69050a(atomicReference, c13876a, m22731c));
        m22734b(m22731c);
    }
}
