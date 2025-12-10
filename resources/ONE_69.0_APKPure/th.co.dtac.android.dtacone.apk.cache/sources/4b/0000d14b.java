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
public final class ObservableBuffer<T, U extends Collection<? super T>> extends AbstractC11078a {

    /* renamed from: a */
    public final int f65098a;

    /* renamed from: b */
    public final int f65099b;

    /* renamed from: c */
    public final Callable f65100c;

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
    public static final class C10956a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65101a;

        /* renamed from: b */
        public final int f65102b;

        /* renamed from: c */
        public final Callable f65103c;

        /* renamed from: d */
        public Collection f65104d;

        /* renamed from: e */
        public int f65105e;

        /* renamed from: f */
        public Disposable f65106f;

        public C10956a(Observer observer, int i, Callable callable) {
            this.f65101a = observer;
            this.f65102b = i;
            this.f65103c = callable;
        }

        /* renamed from: a */
        public boolean m30331a() {
            try {
                this.f65104d = (Collection) ObjectHelper.requireNonNull(this.f65103c.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65104d = null;
                Disposable disposable = this.f65106f;
                if (disposable == null) {
                    EmptyDisposable.error(th2, this.f65101a);
                    return false;
                }
                disposable.dispose();
                this.f65101a.onError(th2);
                return false;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65106f.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65106f.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Collection collection = this.f65104d;
            if (collection != null) {
                this.f65104d = null;
                if (!collection.isEmpty()) {
                    this.f65101a.onNext(collection);
                }
                this.f65101a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65104d = null;
            this.f65101a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            Collection collection = this.f65104d;
            if (collection != null) {
                collection.add(obj);
                int i = this.f65105e + 1;
                this.f65105e = i;
                if (i >= this.f65102b) {
                    this.f65101a.onNext(collection);
                    this.f65105e = 0;
                    m30331a();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65106f, disposable)) {
                this.f65106f = disposable;
                this.f65101a.onSubscribe(this);
            }
        }
    }

    public ObservableBuffer(ObservableSource<T> observableSource, int i, int i2, Callable<U> callable) {
        super(observableSource);
        this.f65098a = i;
        this.f65099b = i2;
        this.f65100c = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        int i = this.f65099b;
        int i2 = this.f65098a;
        if (i == i2) {
            C10956a c10956a = new C10956a(observer, i2, this.f65100c);
            if (c10956a.m30331a()) {
                this.source.subscribe(c10956a);
                return;
            }
            return;
        }
        this.source.subscribe(new BufferSkipObserver(observer, this.f65098a, this.f65099b, this.f65100c));
    }
}