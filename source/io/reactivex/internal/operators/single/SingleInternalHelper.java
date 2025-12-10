package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

/* loaded from: classes5.dex */
public final class SingleInternalHelper {

    /* loaded from: classes5.dex */
    public enum NoSuchElementCallable implements Callable<NoSuchElementException> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    /* loaded from: classes5.dex */
    public enum ToFlowable implements Function<SingleSource, Publisher> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public Publisher apply(SingleSource singleSource) {
            return new SingleToFlowable(singleSource);
        }
    }

    /* loaded from: classes5.dex */
    public enum ToObservable implements Function<SingleSource, Observable> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public Observable apply(SingleSource singleSource) {
            return new SingleToObservable(singleSource);
        }
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleInternalHelper$a */
    /* loaded from: classes5.dex */
    public static final class C11129a implements Iterable {

        /* renamed from: a */
        public final Iterable f65957a;

        public C11129a(Iterable iterable) {
            this.f65957a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C11130b(this.f65957a.iterator());
        }
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleInternalHelper$b */
    /* loaded from: classes5.dex */
    public static final class C11130b implements Iterator {

        /* renamed from: a */
        public final Iterator f65958a;

        public C11130b(Iterator it) {
            this.f65958a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Flowable next() {
            return new SingleToFlowable((SingleSource) this.f65958a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65958a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static <T> Callable<NoSuchElementException> emptyThrower() {
        return NoSuchElementCallable.INSTANCE;
    }

    public static <T> Iterable<? extends Flowable<T>> iterableToFlowable(Iterable<? extends SingleSource<? extends T>> iterable) {
        return new C11129a(iterable);
    }

    public static <T> Function<SingleSource<? extends T>, Publisher<? extends T>> toFlowable() {
        return ToFlowable.INSTANCE;
    }

    public static <T> Function<SingleSource<? extends T>, Observable<? extends T>> toObservable() {
        return ToObservable.INSTANCE;
    }
}
