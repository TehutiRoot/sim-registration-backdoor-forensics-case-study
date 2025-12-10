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
    public final Single f79199a;

    /* renamed from: b */
    public final Func1 f79200b;

    /* renamed from: rx.internal.operators.SingleOnSubscribeMap$a */
    /* loaded from: classes7.dex */
    public static final class C13715a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f79201b;

        /* renamed from: c */
        public final Func1 f79202c;

        /* renamed from: d */
        public boolean f79203d;

        public C13715a(SingleSubscriber singleSubscriber, Func1 func1) {
            this.f79201b = singleSubscriber;
            this.f79202c = func1;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            if (this.f79203d) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f79203d = true;
            this.f79201b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            try {
                this.f79201b.onSuccess(this.f79202c.call(obj));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
            }
        }
    }

    public SingleOnSubscribeMap(Single<T> single, Func1<? super T, ? extends R> func1) {
        this.f79199a = single;
        this.f79200b = func1;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super R> singleSubscriber) {
        C13715a c13715a = new C13715a(singleSubscriber, this.f79200b);
        singleSubscriber.add(c13715a);
        this.f79199a.subscribe(c13715a);
    }
}