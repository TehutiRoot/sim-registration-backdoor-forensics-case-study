package th.p047co.dtac.android.dtacone.data.cache.realm;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.subscriptions.Subscriptions;
import th.p047co.dtac.android.dtacone.data.cache.realm.OnSubscribeRealm;

/* renamed from: th.co.dtac.android.dtacone.data.cache.realm.OnSubscribeRealm */
/* loaded from: classes7.dex */
public abstract class OnSubscribeRealm<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final RealmConfiguration f83428a;

    /* renamed from: b */
    public final List f83429b = new ArrayList();

    /* renamed from: c */
    public final AtomicBoolean f83430c = new AtomicBoolean();

    /* renamed from: d */
    public final Object f83431d = new Object();

    public OnSubscribeRealm(RealmConfiguration realmConfiguration) {
        this.f83428a = realmConfiguration;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19590a(OnSubscribeRealm onSubscribeRealm, Subscriber subscriber) {
        onSubscribeRealm.m19589b(subscriber);
    }

    /* renamed from: b */
    public final /* synthetic */ void m19589b(Subscriber subscriber) {
        synchronized (this.f83431d) {
            try {
                this.f83429b.remove(subscriber);
                if (this.f83429b.isEmpty()) {
                    this.f83430c.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final Subscription m19588c(final Subscriber subscriber) {
        return Subscriptions.create(new Action0() { // from class: zK0
            @Override // p046rx.functions.Action0
            public final void call() {
                OnSubscribeRealm.m19590a(OnSubscribeRealm.this, subscriber);
            }
        });
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    /* renamed from: d */
    public final void m19587d() {
        for (int i = 0; i < this.f83429b.size(); i++) {
            ((Subscriber) this.f83429b.get(i)).onCompleted();
        }
    }

    /* renamed from: e */
    public final void m19586e(Throwable th2) {
        for (int i = 0; i < this.f83429b.size(); i++) {
            ((Subscriber) this.f83429b.get(i)).onError(th2);
        }
    }

    /* renamed from: f */
    public final void m19585f(Object obj) {
        for (int i = 0; i < this.f83429b.size(); i++) {
            ((Subscriber) this.f83429b.get(i)).onNext(obj);
        }
    }

    public abstract T get(Realm realm);

    /* JADX WARN: Removed duplicated region for block: B:88:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void call(p046rx.Subscriber<? super T> r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f83431d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.f83430c     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L24
            java.util.List r2 = r6.f83429b     // Catch: java.lang.Throwable -> L21
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L24
            rx.Subscription r1 = r6.m19588c(r7)     // Catch: java.lang.Throwable -> L21
            r7.add(r1)     // Catch: java.lang.Throwable -> L21
            java.util.List r1 = r6.f83429b     // Catch: java.lang.Throwable -> L21
            r1.add(r7)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r7 = move-exception
            goto L9d
        L24:
            if (r1 == 0) goto L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            rx.Subscription r0 = r6.m19588c(r7)
            r7.add(r0)
            java.util.List r0 = r6.f83429b
            r0.add(r7)
            io.realm.RealmConfiguration r7 = r6.f83428a
            io.realm.Realm r7 = io.realm.Realm.getInstance(r7)
            r0 = 0
            r1 = 1
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f83430c     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            boolean r3 = r3.get()     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            if (r3 != 0) goto L62
            r7.beginTransaction()     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            java.lang.Object r2 = r6.get(r7)     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            if (r2 == 0) goto L5f
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f83430c     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            boolean r3 = r3.get()     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            if (r3 != 0) goto L5f
            r7.commitTransaction()     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
            goto L62
        L5b:
            r3 = move-exception
            goto L64
        L5d:
            r3 = move-exception
            goto L6c
        L5f:
            r7.cancelTransaction()     // Catch: java.lang.Error -> L5b java.lang.RuntimeException -> L5d
        L62:
            r3 = 0
            goto L7a
        L64:
            r7.cancelTransaction()
            r6.m19586e(r3)
        L6a:
            r3 = 1
            goto L7a
        L6c:
            r7.cancelTransaction()
            io.realm.exceptions.RealmException r4 = new io.realm.exceptions.RealmException
            java.lang.String r5 = "Error during transaction."
            r4.<init>(r5, r3)
            r6.m19586e(r4)
            goto L6a
        L7a:
            if (r2 == 0) goto L89
            java.util.concurrent.atomic.AtomicBoolean r4 = r6.f83430c
            boolean r4 = r4.get()
            if (r4 != 0) goto L89
            if (r3 != 0) goto L89
            r6.m19585f(r2)
        L89:
            r7.close()     // Catch: io.realm.exceptions.RealmException -> L8e
            r1 = r3
            goto L92
        L8e:
            r7 = move-exception
            r6.m19586e(r7)
        L92:
            if (r1 != 0) goto L97
            r6.m19587d()
        L97:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f83430c
            r7.set(r0)
            return
        L9d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.data.cache.realm.OnSubscribeRealm.call(rx.Subscriber):void");
    }
}
