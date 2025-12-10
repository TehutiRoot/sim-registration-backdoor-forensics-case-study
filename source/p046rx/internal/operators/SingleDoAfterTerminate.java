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
    public final Single f78949a;

    /* renamed from: b */
    public final Action0 f78950b;

    /* renamed from: rx.internal.operators.SingleDoAfterTerminate$a */
    /* loaded from: classes7.dex */
    public static final class C13706a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f78951b;

        /* renamed from: c */
        public final Action0 f78952c;

        public C13706a(SingleSubscriber singleSubscriber, Action0 action0) {
            this.f78951b = singleSubscriber;
            this.f78952c = action0;
        }

        /* renamed from: a */
        public void m22929a() {
            try {
                this.f78952c.call();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            try {
                this.f78951b.onError(th2);
            } finally {
                m22929a();
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            try {
                this.f78951b.onSuccess(obj);
            } finally {
                m22929a();
            }
        }
    }

    public SingleDoAfterTerminate(Single<T> single, Action0 action0) {
        this.f78949a = single;
        this.f78950b = action0;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13706a c13706a = new C13706a(singleSubscriber, this.f78950b);
        singleSubscriber.add(c13706a);
        this.f78949a.subscribe(c13706a);
    }
}
