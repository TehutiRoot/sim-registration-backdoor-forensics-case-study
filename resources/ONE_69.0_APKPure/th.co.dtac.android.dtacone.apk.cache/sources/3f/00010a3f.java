package p046rx.internal.operators;

import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.AssemblyStackTraceException;

/* renamed from: rx.internal.operators.OnSubscribeOnAssemblySingle */
/* loaded from: classes7.dex */
public final class OnSubscribeOnAssemblySingle<T> implements Single.OnSubscribe<T> {
    public static volatile boolean fullStackTrace;

    /* renamed from: a */
    public final Single.OnSubscribe f78244a;

    /* renamed from: b */
    public final String f78245b = OnSubscribeOnAssembly.m23300a();

    /* renamed from: rx.internal.operators.OnSubscribeOnAssemblySingle$a */
    /* loaded from: classes7.dex */
    public static final class C13493a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f78246b;

        /* renamed from: c */
        public final String f78247c;

        public C13493a(SingleSubscriber singleSubscriber, String str) {
            this.f78246b = singleSubscriber;
            this.f78247c = str;
            singleSubscriber.add(this);
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            new AssemblyStackTraceException(this.f78247c).attachTo(th2);
            this.f78246b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f78246b.onSuccess(obj);
        }
    }

    public OnSubscribeOnAssemblySingle(Single.OnSubscribe<T> onSubscribe) {
        this.f78244a = onSubscribe;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        this.f78244a.call(new C13493a(singleSubscriber, this.f78245b));
    }
}