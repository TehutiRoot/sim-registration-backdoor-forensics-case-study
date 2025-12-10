package p046rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.subjects.Subject;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.BufferUntilSubscriber */
/* loaded from: classes7.dex */
public final class BufferUntilSubscriber<T> extends Subject<T, T> {

    /* renamed from: d */
    public static final Observer f77779d = new C13440a();

    /* renamed from: b */
    public final State f77780b;

    /* renamed from: c */
    public boolean f77781c;

    /* renamed from: rx.internal.operators.BufferUntilSubscriber$State */
    /* loaded from: classes7.dex */
    public static final class State<T> extends AtomicReference<Observer<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        boolean emitting;
        final Object guard = new Object();
        final ConcurrentLinkedQueue<Object> buffer = new ConcurrentLinkedQueue<>();

        public boolean casObserverRef(Observer<? super T> observer, Observer<? super T> observer2) {
            return compareAndSet(observer, observer2);
        }
    }

    /* renamed from: rx.internal.operators.BufferUntilSubscriber$a */
    /* loaded from: classes7.dex */
    public static class C13440a implements Observer {
        @Override // p046rx.Observer
        public void onCompleted() {
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
        }
    }

    /* renamed from: rx.internal.operators.BufferUntilSubscriber$b */
    /* loaded from: classes7.dex */
    public static final class C13441b implements Observable.OnSubscribe {

        /* renamed from: a */
        public final State f77782a;

        /* renamed from: rx.internal.operators.BufferUntilSubscriber$b$a */
        /* loaded from: classes7.dex */
        public class C13442a implements Action0 {
            public C13442a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13441b.this.f77782a.set(BufferUntilSubscriber.f77779d);
            }
        }

        public C13441b(State state) {
            this.f77782a = state;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            boolean z;
            if (this.f77782a.casObserverRef(null, subscriber)) {
                subscriber.add(Subscriptions.create(new C13442a()));
                synchronized (this.f77782a.guard) {
                    try {
                        State state = this.f77782a;
                        if (!state.emitting) {
                            z = true;
                            state.emitting = true;
                        } else {
                            z = false;
                        }
                    } finally {
                    }
                }
                if (!z) {
                    return;
                }
                while (true) {
                    Object poll = this.f77782a.buffer.poll();
                    if (poll != null) {
                        NotificationLite.accept(this.f77782a.get(), poll);
                    } else {
                        synchronized (this.f77782a.guard) {
                            try {
                                if (this.f77782a.buffer.isEmpty()) {
                                    this.f77782a.emitting = false;
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } else {
                subscriber.onError(new IllegalStateException("Only one subscriber allowed!"));
            }
        }
    }

    public BufferUntilSubscriber(State state) {
        super(new C13441b(state));
        this.f77780b = state;
    }

    public static <T> BufferUntilSubscriber<T> create() {
        return new BufferUntilSubscriber<>(new State());
    }

    /* renamed from: c */
    public final void m23154c(Object obj) {
        synchronized (this.f77780b.guard) {
            try {
                this.f77780b.buffer.add(obj);
                if (this.f77780b.get() != null) {
                    State state = this.f77780b;
                    if (!state.emitting) {
                        this.f77781c = true;
                        state.emitting = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f77781c) {
            return;
        }
        while (true) {
            Object poll = this.f77780b.buffer.poll();
            if (poll != null) {
                NotificationLite.accept(this.f77780b.get(), poll);
            } else {
                return;
            }
        }
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        boolean z;
        synchronized (this.f77780b.guard) {
            if (this.f77780b.get() != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        if (this.f77781c) {
            this.f77780b.get().onCompleted();
        } else {
            m23154c(NotificationLite.completed());
        }
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        if (this.f77781c) {
            this.f77780b.get().onError(th2);
        } else {
            m23154c(NotificationLite.error(th2));
        }
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        if (this.f77781c) {
            this.f77780b.get().onNext(t);
        } else {
            m23154c(NotificationLite.next(t));
        }
    }
}
