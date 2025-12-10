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
    public static final Observer f77985d = new C13441a();

    /* renamed from: b */
    public final State f77986b;

    /* renamed from: c */
    public boolean f77987c;

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
    public static class C13441a implements Observer {
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
    public static final class C13442b implements Observable.OnSubscribe {

        /* renamed from: a */
        public final State f77988a;

        /* renamed from: rx.internal.operators.BufferUntilSubscriber$b$a */
        /* loaded from: classes7.dex */
        public class C13443a implements Action0 {
            public C13443a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13442b.this.f77988a.set(BufferUntilSubscriber.f77985d);
            }
        }

        public C13442b(State state) {
            this.f77988a = state;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            boolean z;
            if (this.f77988a.casObserverRef(null, subscriber)) {
                subscriber.add(Subscriptions.create(new C13443a()));
                synchronized (this.f77988a.guard) {
                    try {
                        State state = this.f77988a;
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
                    Object poll = this.f77988a.buffer.poll();
                    if (poll != null) {
                        NotificationLite.accept(this.f77988a.get(), poll);
                    } else {
                        synchronized (this.f77988a.guard) {
                            try {
                                if (this.f77988a.buffer.isEmpty()) {
                                    this.f77988a.emitting = false;
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
        super(new C13442b(state));
        this.f77986b = state;
    }

    public static <T> BufferUntilSubscriber<T> create() {
        return new BufferUntilSubscriber<>(new State());
    }

    /* renamed from: c */
    public final void m23342c(Object obj) {
        synchronized (this.f77986b.guard) {
            try {
                this.f77986b.buffer.add(obj);
                if (this.f77986b.get() != null) {
                    State state = this.f77986b;
                    if (!state.emitting) {
                        this.f77987c = true;
                        state.emitting = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f77987c) {
            return;
        }
        while (true) {
            Object poll = this.f77986b.buffer.poll();
            if (poll != null) {
                NotificationLite.accept(this.f77986b.get(), poll);
            } else {
                return;
            }
        }
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        boolean z;
        synchronized (this.f77986b.guard) {
            if (this.f77986b.get() != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        if (this.f77987c) {
            this.f77986b.get().onCompleted();
        } else {
            m23342c(NotificationLite.completed());
        }
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        if (this.f77987c) {
            this.f77986b.get().onError(th2);
        } else {
            m23342c(NotificationLite.error(th2));
        }
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        if (this.f77987c) {
            this.f77986b.get().onNext(t);
        } else {
            m23342c(NotificationLite.next(t));
        }
    }
}