package p046rx.internal.operators;

import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.exceptions.AssemblyStackTraceException;

/* renamed from: rx.internal.operators.OnSubscribeOnAssemblyCompletable */
/* loaded from: classes7.dex */
public final class OnSubscribeOnAssemblyCompletable<T> implements Completable.OnSubscribe {
    public static volatile boolean fullStackTrace;

    /* renamed from: a */
    public final Completable.OnSubscribe f78034a;

    /* renamed from: b */
    public final String f78035b = OnSubscribeOnAssembly.m23112a();

    /* renamed from: rx.internal.operators.OnSubscribeOnAssemblyCompletable$a */
    /* loaded from: classes7.dex */
    public static final class C13491a implements CompletableSubscriber {

        /* renamed from: a */
        public final CompletableSubscriber f78036a;

        /* renamed from: b */
        public final String f78037b;

        public C13491a(CompletableSubscriber completableSubscriber, String str) {
            this.f78036a = completableSubscriber;
            this.f78037b = str;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f78036a.onCompleted();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            new AssemblyStackTraceException(this.f78037b).attachTo(th2);
            this.f78036a.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f78036a.onSubscribe(subscription);
        }
    }

    public OnSubscribeOnAssemblyCompletable(Completable.OnSubscribe onSubscribe) {
        this.f78034a = onSubscribe;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        this.f78034a.call(new C13491a(completableSubscriber, this.f78035b));
    }
}
