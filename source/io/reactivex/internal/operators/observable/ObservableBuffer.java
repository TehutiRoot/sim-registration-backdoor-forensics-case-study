package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends AbstractC11091a {

    /* renamed from: a */
    public final int f65035a;

    /* renamed from: b */
    public final int f65036b;

    /* renamed from: c */
    public final Callable f65037c;

    /* loaded from: classes5.dex */
    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -8223395059921494546L;
        final Callable<U> bufferSupplier;
        final ArrayDeque<U> buffers = new ArrayDeque<>();
        final int count;
        final Observer<? super U> downstream;
        long index;
        final int skip;
        Disposable upstream;

        public BufferSkipObserver(Observer<? super U> observer, int i, int i2, Callable<U> callable) {
            this.downstream = observer;
            this.count = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.buffers.clear();
            this.downstream.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j = this.index;
            this.index = 1 + j;
            if (j % this.skip == 0) {
                try {
                    this.buffers.offer((Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th2) {
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th2);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onNext(next);
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

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBuffer$a */
    /* loaded from: classes5.dex */
    public static final class C10969a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65038a;

        /* renamed from: b */
        public final int f65039b;

        /* renamed from: c */
        public final Callable f65040c;

        /* renamed from: d */
        public Collection f65041d;

        /* renamed from: e */
        public int f65042e;

        /* renamed from: f */
        public Disposable f65043f;

        public C10969a(Observer observer, int i, Callable callable) {
            this.f65038a = observer;
            this.f65039b = i;
            this.f65040c = callable;
        }

        /* renamed from: a */
        public boolean m29991a() {
            try {
                this.f65041d = (Collection) ObjectHelper.requireNonNull(this.f65040c.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65041d = null;
                Disposable disposable = this.f65043f;
                if (disposable == null) {
                    EmptyDisposable.error(th2, this.f65038a);
                    return false;
                }
                disposable.dispose();
                this.f65038a.onError(th2);
                return false;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65043f.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65043f.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Collection collection = this.f65041d;
            if (collection != null) {
                this.f65041d = null;
                if (!collection.isEmpty()) {
                    this.f65038a.onNext(collection);
                }
                this.f65038a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65041d = null;
            this.f65038a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            Collection collection = this.f65041d;
            if (collection != null) {
                collection.add(obj);
                int i = this.f65042e + 1;
                this.f65042e = i;
                if (i >= this.f65039b) {
                    this.f65038a.onNext(collection);
                    this.f65042e = 0;
                    m29991a();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65043f, disposable)) {
                this.f65043f = disposable;
                this.f65038a.onSubscribe(this);
            }
        }
    }

    public ObservableBuffer(ObservableSource<T> observableSource, int i, int i2, Callable<U> callable) {
        super(observableSource);
        this.f65035a = i;
        this.f65036b = i2;
        this.f65037c = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        int i = this.f65036b;
        int i2 = this.f65035a;
        if (i == i2) {
            C10969a c10969a = new C10969a(observer, i2, this.f65037c);
            if (c10969a.m29991a()) {
                this.source.subscribe(c10969a);
                return;
            }
            return;
        }
        this.source.subscribe(new BufferSkipObserver(observer, this.f65035a, this.f65036b, this.f65037c));
    }
}
