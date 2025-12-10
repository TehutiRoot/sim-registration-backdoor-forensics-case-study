package p046rx.subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Actions;
import p046rx.internal.operators.NotificationLite;
import p046rx.subscriptions.Subscriptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rx.subjects.SubjectSubscriptionManager */
/* loaded from: classes7.dex */
public final class SubjectSubscriptionManager<T> extends AtomicReference<State<T>> implements Observable.OnSubscribe<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    boolean active;
    volatile Object latest;
    Action1<SubjectObserver<T>> onAdded;
    Action1<SubjectObserver<T>> onStart;
    Action1<SubjectObserver<T>> onTerminated;

    /* renamed from: rx.subjects.SubjectSubscriptionManager$State */
    /* loaded from: classes7.dex */
    public static final class State<T> {

        /* renamed from: c */
        public static final SubjectObserver[] f79487c;

        /* renamed from: d */
        public static final State f79488d;

        /* renamed from: e */
        public static final State f79489e;

        /* renamed from: a */
        public final boolean f79490a;

        /* renamed from: b */
        public final SubjectObserver[] f79491b;

        static {
            SubjectObserver[] subjectObserverArr = new SubjectObserver[0];
            f79487c = subjectObserverArr;
            f79488d = new State(true, subjectObserverArr);
            f79489e = new State(false, subjectObserverArr);
        }

        public State(boolean z, SubjectObserver[] subjectObserverArr) {
            this.f79490a = z;
            this.f79491b = subjectObserverArr;
        }

        public State add(SubjectObserver subjectObserver) {
            SubjectObserver[] subjectObserverArr = this.f79491b;
            int length = subjectObserverArr.length;
            SubjectObserver[] subjectObserverArr2 = new SubjectObserver[length + 1];
            System.arraycopy(subjectObserverArr, 0, subjectObserverArr2, 0, length);
            subjectObserverArr2[length] = subjectObserver;
            return new State(this.f79490a, subjectObserverArr2);
        }

        public State remove(SubjectObserver subjectObserver) {
            SubjectObserver[] subjectObserverArr = this.f79491b;
            int length = subjectObserverArr.length;
            if (length == 1 && subjectObserverArr[0] == subjectObserver) {
                return f79489e;
            }
            if (length == 0) {
                return this;
            }
            int i = length - 1;
            SubjectObserver[] subjectObserverArr2 = new SubjectObserver[i];
            int i2 = 0;
            for (SubjectObserver subjectObserver2 : subjectObserverArr) {
                if (subjectObserver2 != subjectObserver) {
                    if (i2 == i) {
                        return this;
                    }
                    subjectObserverArr2[i2] = subjectObserver2;
                    i2++;
                }
            }
            if (i2 == 0) {
                return f79489e;
            }
            if (i2 < i) {
                SubjectObserver[] subjectObserverArr3 = new SubjectObserver[i2];
                System.arraycopy(subjectObserverArr2, 0, subjectObserverArr3, 0, i2);
                subjectObserverArr2 = subjectObserverArr3;
            }
            return new State(this.f79490a, subjectObserverArr2);
        }
    }

    /* renamed from: rx.subjects.SubjectSubscriptionManager$SubjectObserver */
    /* loaded from: classes7.dex */
    public static final class SubjectObserver<T> implements Observer<T> {

        /* renamed from: a */
        public final Subscriber f79492a;

        /* renamed from: b */
        public boolean f79493b = true;

        /* renamed from: c */
        public boolean f79494c;

        /* renamed from: d */
        public List f79495d;

        /* renamed from: e */
        public boolean f79496e;

        /* renamed from: f */
        public volatile Object f79497f;

        public SubjectObserver(Subscriber<? super T> subscriber) {
            this.f79492a = subscriber;
        }

        /* renamed from: a */
        public void m22744a(Object obj) {
            if (obj != null) {
                NotificationLite.accept(this.f79492a, obj);
            }
        }

        /* renamed from: b */
        public void m22743b(Object obj) {
            synchronized (this) {
                if (this.f79493b && !this.f79494c) {
                    boolean z = false;
                    this.f79493b = false;
                    if (obj != null) {
                        z = true;
                    }
                    this.f79494c = z;
                    if (obj != null) {
                        m22742c(null, obj);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m22742c(java.util.List r5, java.lang.Object r6) {
            /*
                r4 = this;
                r0 = 1
                r1 = 1
            L2:
                r2 = 0
                if (r5 == 0) goto L1a
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L17
            L9:
                boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r3 == 0) goto L1a
                java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L17
                r4.m22744a(r3)     // Catch: java.lang.Throwable -> L17
                goto L9
            L17:
                r5 = move-exception
                r0 = 0
                goto L36
            L1a:
                if (r1 == 0) goto L20
                r4.m22744a(r6)     // Catch: java.lang.Throwable -> L17
                r1 = 0
            L20:
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L17
                java.util.List r5 = r4.f79495d     // Catch: java.lang.Throwable -> L2e
                r3 = 0
                r4.f79495d = r3     // Catch: java.lang.Throwable -> L2e
                if (r5 != 0) goto L31
                r4.f79494c = r2     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
                return
            L2c:
                r5 = move-exception
                goto L33
            L2e:
                r5 = move-exception
                r0 = 0
                goto L33
            L31:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
                goto L2
            L33:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
                throw r5     // Catch: java.lang.Throwable -> L35
            L35:
                r5 = move-exception
            L36:
                if (r0 != 0) goto L40
                monitor-enter(r4)
                r4.f79494c = r2     // Catch: java.lang.Throwable -> L3d
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                goto L40
            L3d:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                throw r5
            L40:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.subjects.SubjectSubscriptionManager.SubjectObserver.m22742c(java.util.List, java.lang.Object):void");
        }

        /* renamed from: d */
        public void m22741d(Object obj) {
            if (!this.f79496e) {
                synchronized (this) {
                    try {
                        this.f79493b = false;
                        if (this.f79494c) {
                            if (this.f79495d == null) {
                                this.f79495d = new ArrayList();
                            }
                            this.f79495d.add(obj);
                            return;
                        }
                        this.f79496e = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            NotificationLite.accept(this.f79492a, obj);
        }

        public <I> I index() {
            return (I) this.f79497f;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79492a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79492a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(T t) {
            this.f79492a.onNext(t);
        }

        public void index(Object obj) {
            this.f79497f = obj;
        }
    }

    /* renamed from: rx.subjects.SubjectSubscriptionManager$a */
    /* loaded from: classes7.dex */
    public class C13870a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ SubjectObserver f79498a;

        public C13870a(SubjectObserver subjectObserver) {
            this.f79498a = subjectObserver;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            SubjectSubscriptionManager.this.remove(this.f79498a);
        }
    }

    public SubjectSubscriptionManager() {
        super(State.f79489e);
        this.active = true;
        this.onStart = Actions.empty();
        this.onAdded = Actions.empty();
        this.onTerminated = Actions.empty();
    }

    public boolean add(SubjectObserver<T> subjectObserver) {
        State<T> state;
        do {
            state = get();
            if (state.f79490a) {
                this.onTerminated.call(subjectObserver);
                return false;
            }
        } while (!compareAndSet(state, state.add(subjectObserver)));
        this.onAdded.call(subjectObserver);
        return true;
    }

    public void addUnsubscriber(Subscriber<? super T> subscriber, SubjectObserver<T> subjectObserver) {
        subscriber.add(Subscriptions.create(new C13870a(subjectObserver)));
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public Object getLatest() {
        return this.latest;
    }

    public SubjectObserver<T>[] next(Object obj) {
        setLatest(obj);
        return get().f79491b;
    }

    public SubjectObserver<T>[] observers() {
        return get().f79491b;
    }

    public void remove(SubjectObserver<T> subjectObserver) {
        State<T> state;
        State<T> remove;
        do {
            state = get();
            if (state.f79490a || (remove = state.remove(subjectObserver)) == state) {
                return;
            }
        } while (!compareAndSet(state, remove));
    }

    public void setLatest(Object obj) {
        this.latest = obj;
    }

    public SubjectObserver<T>[] terminate(Object obj) {
        setLatest(obj);
        this.active = false;
        if (get().f79490a) {
            return State.f79487c;
        }
        return getAndSet(State.f79488d).f79491b;
    }

    public void call(Subscriber<? super T> subscriber) {
        SubjectObserver<T> subjectObserver = new SubjectObserver<>(subscriber);
        addUnsubscriber(subscriber, subjectObserver);
        this.onStart.call(subjectObserver);
        if (!subscriber.isUnsubscribed() && add(subjectObserver) && subscriber.isUnsubscribed()) {
            remove(subjectObserver);
        }
    }
}
