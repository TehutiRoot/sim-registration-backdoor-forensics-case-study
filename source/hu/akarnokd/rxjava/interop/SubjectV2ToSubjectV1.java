package hu.akarnokd.rxjava.interop;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.MissingBackpressureException;
import p046rx.subjects.Subject;

/* loaded from: classes5.dex */
public final class SubjectV2ToSubjectV1 extends Subject {

    /* renamed from: b */
    public final C10421a f62638b;

    /* loaded from: classes5.dex */
    public static final class SourceObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Subscription, Producer {
        private static final long serialVersionUID = -6567012932544037069L;
        final Subscriber<? super T> actual;
        final AtomicLong requested = new AtomicLong();

        public SourceObserver(Subscriber<? super T> subscriber) {
            this.actual = subscriber;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            lazySet(DisposableHelper.DISPOSED);
            this.actual.onCompleted();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            lazySet(DisposableHelper.DISPOSED);
            this.actual.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.requested.get() != 0) {
                this.actual.onNext(t);
                BackpressureHelper.produced(this.requested, 1L);
                return;
            }
            unsubscribe();
            this.actual.onError(new MissingBackpressureException());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // p046rx.Producer
        public void request(long j) {
            if (j > 0) {
                BackpressureHelper.add(this.requested, j);
            }
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            DisposableHelper.dispose(this);
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.SubjectV2ToSubjectV1$a */
    /* loaded from: classes5.dex */
    public static final class C10421a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final io.reactivex.subjects.Subject f62639a;

        public C10421a(io.reactivex.subjects.Subject subject) {
            this.f62639a = subject;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            SourceObserver sourceObserver = new SourceObserver(subscriber);
            subscriber.add(sourceObserver);
            subscriber.setProducer(sourceObserver);
            this.f62639a.subscribe(sourceObserver);
        }

        /* renamed from: b */
        public boolean m30719b() {
            return this.f62639a.hasObservers();
        }

        /* renamed from: c */
        public void m30718c() {
            this.f62639a.onComplete();
        }

        /* renamed from: d */
        public void m30717d(Throwable th2) {
            this.f62639a.onError(th2);
        }

        /* renamed from: e */
        public void m30716e(Object obj) {
            this.f62639a.onNext(obj);
        }
    }

    public SubjectV2ToSubjectV1(C10421a c10421a) {
        super(c10421a);
        this.f62638b = c10421a;
    }

    /* renamed from: c */
    public static Subject m30721c(io.reactivex.subjects.Subject subject) {
        return new SubjectV2ToSubjectV1(new C10421a(subject));
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        return this.f62638b.m30719b();
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f62638b.m30718c();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f62638b.m30717d(th2);
    }

    @Override // p046rx.Observer
    public void onNext(Object obj) {
        this.f62638b.m30716e(obj);
    }
}
