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
    public final Completable.OnSubscribe f78240a;

    /* renamed from: b */
    public final String f78241b = OnSubscribeOnAssembly.m23300a();

    /* renamed from: rx.internal.operators.OnSubscribeOnAssemblyCompletable$a */
    /* loaded from: classes7.dex */
    public static final class C13492a implements CompletableSubscriber {

        /* renamed from: a */
        public final CompletableSubscriber f78242a;

        /* renamed from: b */
        public final String f78243b;

        public C13492a(CompletableSubscriber completableSubscriber, String str) {
            this.f78242a = completableSubscriber;
            this.f78243b = str;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f78242a.onCompleted();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            new AssemblyStackTraceException(this.f78243b).attachTo(th2);
            this.f78242a.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f78242a.onSubscribe(subscription);
        }
    }

    public OnSubscribeOnAssemblyCompletable(Completable.OnSubscribe onSubscribe) {
        this.f78240a = onSubscribe;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        this.f78240a.call(new C13492a(completableSubscriber, this.f78241b));
    }
}