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
    public final Single f77792a;

    /* renamed from: b */
    public final Func1 f77793b;

    /* renamed from: rx.internal.operators.CompletableFlatMapSingleToCompletable$a */
    /* loaded from: classes7.dex */
    public static final class C13445a extends SingleSubscriber implements CompletableSubscriber {

        /* renamed from: b */
        public final CompletableSubscriber f77794b;

        /* renamed from: c */
        public final Func1 f77795c;

        public C13445a(CompletableSubscriber completableSubscriber, Func1 func1) {
            this.f77794b = completableSubscriber;
            this.f77795c = func1;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f77794b.onCompleted();
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f77794b.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            add(subscription);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            try {
                Completable completable = (Completable) this.f77795c.call(obj);
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
        this.f77792a = single;
        this.f77793b = func1;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        C13445a c13445a = new C13445a(completableSubscriber, this.f77793b);
        completableSubscriber.onSubscribe(c13445a);
        this.f77792a.subscribe(c13445a);
    }
}
