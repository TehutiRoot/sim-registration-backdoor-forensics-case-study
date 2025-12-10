package p046rx.observers;

import p046rx.Observer;
import p046rx.exceptions.Exceptions;
import p046rx.internal.operators.NotificationLite;

/* renamed from: rx.observers.SerializedObserver */
/* loaded from: classes7.dex */
public class SerializedObserver<T> implements Observer<T> {

    /* renamed from: a */
    public final Observer f79370a;

    /* renamed from: b */
    public boolean f79371b;

    /* renamed from: c */
    public volatile boolean f79372c;

    /* renamed from: d */
    public C13830a f79373d;

    /* renamed from: rx.observers.SerializedObserver$a */
    /* loaded from: classes7.dex */
    public static final class C13830a {

        /* renamed from: a */
        public Object[] f79374a;

        /* renamed from: b */
        public int f79375b;

        /* renamed from: a */
        public void m22786a(Object obj) {
            int i = this.f79375b;
            Object[] objArr = this.f79374a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f79374a = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[(i >> 2) + i];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.f79374a = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.f79375b = i + 1;
        }
    }

    public SerializedObserver(Observer<? super T> observer) {
        this.f79370a = observer;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        if (this.f79372c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f79372c) {
                    return;
                }
                this.f79372c = true;
                if (this.f79371b) {
                    C13830a c13830a = this.f79373d;
                    if (c13830a == null) {
                        c13830a = new C13830a();
                        this.f79373d = c13830a;
                    }
                    c13830a.m22786a(NotificationLite.completed());
                    return;
                }
                this.f79371b = true;
                this.f79370a.onCompleted();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        Exceptions.throwIfFatal(th2);
        if (this.f79372c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f79372c) {
                    return;
                }
                this.f79372c = true;
                if (this.f79371b) {
                    C13830a c13830a = this.f79373d;
                    if (c13830a == null) {
                        c13830a = new C13830a();
                        this.f79373d = c13830a;
                    }
                    c13830a.m22786a(NotificationLite.error(th2));
                    return;
                }
                this.f79371b = true;
                this.f79370a.onError(th2);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x002f, code lost:
        continue;
     */
    @Override // p046rx.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onNext(T r7) {
        /*
            r6 = this;
            boolean r0 = r6.f79372c
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r6)
            boolean r0 = r6.f79372c     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r7 = move-exception
            goto L73
        Le:
            boolean r0 = r6.f79371b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L26
            rx.observers.SerializedObserver$a r0 = r6.f79373d     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L1d
            rx.observers.SerializedObserver$a r0 = new rx.observers.SerializedObserver$a     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            r6.f79373d = r0     // Catch: java.lang.Throwable -> Lc
        L1d:
            java.lang.Object r7 = p046rx.internal.operators.NotificationLite.next(r7)     // Catch: java.lang.Throwable -> Lc
            r0.m22786a(r7)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            return
        L26:
            r0 = 1
            r6.f79371b = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            rx.Observer r1 = r6.f79370a     // Catch: java.lang.Throwable -> L6a
            r1.onNext(r7)     // Catch: java.lang.Throwable -> L6a
        L2f:
            monitor-enter(r6)
            rx.observers.SerializedObserver$a r1 = r6.f79373d     // Catch: java.lang.Throwable -> L39
            r2 = 0
            if (r1 != 0) goto L3b
            r6.f79371b = r2     // Catch: java.lang.Throwable -> L39
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r7 = move-exception
            goto L68
        L3b:
            r3 = 0
            r6.f79373d = r3     // Catch: java.lang.Throwable -> L39
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r1 = r1.f79374a
            int r3 = r1.length
        L42:
            if (r2 >= r3) goto L2f
            r4 = r1[r2]
            if (r4 != 0) goto L49
            goto L2f
        L49:
            rx.Observer r5 = r6.f79370a     // Catch: java.lang.Throwable -> L54
            boolean r4 = p046rx.internal.operators.NotificationLite.accept(r5, r4)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L56
            r6.f79372c = r0     // Catch: java.lang.Throwable -> L54
            return
        L54:
            r1 = move-exception
            goto L59
        L56:
            int r2 = r2 + 1
            goto L42
        L59:
            r6.f79372c = r0
            p046rx.exceptions.Exceptions.throwIfFatal(r1)
            rx.Observer r0 = r6.f79370a
            java.lang.Throwable r7 = p046rx.exceptions.OnErrorThrowable.addValueAsLastCause(r1, r7)
            r0.onError(r7)
            return
        L68:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            throw r7
        L6a:
            r1 = move-exception
            r6.f79372c = r0
            rx.Observer r0 = r6.f79370a
            p046rx.exceptions.Exceptions.throwOrReport(r1, r0, r7)
            return
        L73:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p046rx.observers.SerializedObserver.onNext(java.lang.Object):void");
    }
}
