package p046rx.internal.operators;

import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnErrorThrowable;
import p046rx.functions.Func1;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleOnSubscribeMap */
/* loaded from: classes7.dex */
public final class SingleOnSubscribeMap<T, R> implements Single.OnSubscribe<R> {

    /* renamed from: a */
    public final Single f78993a;

    /* renamed from: b */
    public final Func1 f78994b;

    /* renamed from: rx.internal.operators.SingleOnSubscribeMap$a */
    /* loaded from: classes7.dex */
    public static final class C13714a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f78995b;

        /* renamed from: c */
        public final Func1 f78996c;

        /* renamed from: d */
        public boolean f78997d;

        public C13714a(SingleSubscriber singleSubscriber, Func1 func1) {
            this.f78995b = singleSubscriber;
            this.f78996c = func1;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            if (this.f78997d) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78997d = true;
            this.f78995b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            try {
                this.f78995b.onSuccess(this.f78996c.call(obj));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
            }
        }
    }

    public SingleOnSubscribeMap(Single<T> single, Func1<? super T, ? extends R> func1) {
        this.f78993a = single;
        this.f78994b = func1;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super R> singleSubscriber) {
        C13714a c13714a = new C13714a(singleSubscriber, this.f78994b);
        singleSubscriber.add(c13714a);
        this.f78993a.subscribe(c13714a);
    }
}
