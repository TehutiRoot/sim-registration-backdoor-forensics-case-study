package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class ObservableTakeLastTimed<T> extends AbstractC11078a {

    /* renamed from: a */
    public final long f65639a;

    /* renamed from: b */
    public final long f65640b;

    /* renamed from: c */
    public final TimeUnit f65641c;

    /* renamed from: d */
    public final Scheduler f65642d;

    /* renamed from: e */
    public final int f65643e;

    /* renamed from: f */
    public final boolean f65644f;

    /* loaded from: classes5.dex */
    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        final Observer<? super T> downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        Disposable upstream;

        public TakeLastTimedObserver(Observer<? super T> observer, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
            this.downstream = observer;
            this.count = j;
            this.time = j2;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i);
            this.delayError = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                if (compareAndSet(false, true)) {
                    this.queue.clear();
                }
            }
        }

        public void drain() {
            Throwable th2;
            if (!compareAndSet(false, true)) {
                return;
            }
            Observer<? super T> observer = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z = this.delayError;
            while (!this.cancelled) {
                if (!z && (th2 = this.error) != null) {
                    spscLinkedArrayQueue.clear();
                    observer.onError(th2);
                    return;
                }
                Object poll = spscLinkedArrayQueue.poll();
                if (poll == null) {
                    Throwable th3 = this.error;
                    if (th3 != null) {
                        observer.onError(th3);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                Object poll2 = spscLinkedArrayQueue.poll();
                if (((Long) poll).longValue() >= this.scheduler.now(this.unit) - this.time) {
                    observer.onNext(poll2);
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            boolean z;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            long now = this.scheduler.now(this.unit);
            long j = this.time;
            long j2 = this.count;
            if (j2 == Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            spscLinkedArrayQueue.offer(Long.valueOf(now), t);
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() <= now - j || (!z && (spscLinkedArrayQueue.size() >> 1) > j2)) {
                    spscLinkedArrayQueue.poll();
                    spscLinkedArrayQueue.poll();
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastTimed(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
        super(observableSource);
        this.f65639a = j;
        this.f65640b = j2;
        this.f65641c = timeUnit;
        this.f65642d = scheduler;
        this.f65643e = i;
        this.f65644f = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new TakeLastTimedObserver(observer, this.f65639a, this.f65640b, this.f65641c, this.f65642d, this.f65643e, this.f65644f));
    }
}