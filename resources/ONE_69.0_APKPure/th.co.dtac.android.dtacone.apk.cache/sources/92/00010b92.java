package p046rx.internal.operators;

import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleDoAfterTerminate */
/* loaded from: classes7.dex */
public final class SingleDoAfterTerminate<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single f79155a;

    /* renamed from: b */
    public final Action0 f79156b;

    /* renamed from: rx.internal.operators.SingleDoAfterTerminate$a */
    /* loaded from: classes7.dex */
    public static final class C13707a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f79157b;

        /* renamed from: c */
        public final Action0 f79158c;

        public C13707a(SingleSubscriber singleSubscriber, Action0 action0) {
            this.f79157b = singleSubscriber;
            this.f79158c = action0;
        }

        /* renamed from: a */
        public void m23117a() {
            try {
                this.f79158c.call();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            try {
                this.f79157b.onError(th2);
            } finally {
                m23117a();
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            try {
                this.f79157b.onSuccess(obj);
            } finally {
                m23117a();
            }
        }
    }

    public SingleDoAfterTerminate(Single<T> single, Action0 action0) {
        this.f79155a = single;
        this.f79156b = action0;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13707a c13707a = new C13707a(singleSubscriber, this.f79156b);
        singleSubscriber.add(c13707a);
        this.f79155a.subscribe(c13707a);
    }
}