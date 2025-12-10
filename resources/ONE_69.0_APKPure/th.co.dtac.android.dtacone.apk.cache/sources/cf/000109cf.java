package p046rx.internal.operators;

import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.CompletableFlatMapSingleToCompletable */
/* loaded from: classes7.dex */
public final class CompletableFlatMapSingleToCompletable<T> implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Single f77998a;

    /* renamed from: b */
    public final Func1 f77999b;

    /* renamed from: rx.internal.operators.CompletableFlatMapSingleToCompletable$a */
    /* loaded from: classes7.dex */
    public static final class C13446a extends SingleSubscriber implements CompletableSubscriber {

        /* renamed from: b */
        public final CompletableSubscriber f78000b;

        /* renamed from: c */
        public final Func1 f78001c;

        public C13446a(CompletableSubscriber completableSubscriber, Func1 func1) {
            this.f78000b = completableSubscriber;
            this.f78001c = func1;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f78000b.onCompleted();
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f78000b.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            add(subscription);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            try {
                Completable completable = (Completable) this.f78001c.call(obj);
                if (completable == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    completable.subscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }
    }

    public CompletableFlatMapSingleToCompletable(Single<T> single, Func1<? super T, ? extends Completable> func1) {
        this.f77998a = single;
        this.f77999b = func1;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        C13446a c13446a = new C13446a(completableSubscriber, this.f77999b);
        completableSubscriber.onSubscribe(c13446a);
        this.f77998a.subscribe(c13446a);
    }
}