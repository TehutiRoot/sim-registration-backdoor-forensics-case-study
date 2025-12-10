package p046rx.internal.operators;

import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.AssemblyStackTraceException;

/* renamed from: rx.internal.operators.OnSubscribeOnAssemblySingle */
/* loaded from: classes7.dex */
public final class OnSubscribeOnAssemblySingle<T> implements Single.OnSubscribe<T> {
    public static volatile boolean fullStackTrace;

    /* renamed from: a */
    public final Single.OnSubscribe f78038a;

    /* renamed from: b */
    public final String f78039b = OnSubscribeOnAssembly.m23112a();

    /* renamed from: rx.internal.operators.OnSubscribeOnAssemblySingle$a */
    /* loaded from: classes7.dex */
    public static final class C13492a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f78040b;

        /* renamed from: c */
        public final String f78041c;

        public C13492a(SingleSubscriber singleSubscriber, String str) {
            this.f78040b = singleSubscriber;
            this.f78041c = str;
            singleSubscriber.add(this);
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            new AssemblyStackTraceException(this.f78041c).attachTo(th2);
            this.f78040b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f78040b.onSuccess(obj);
        }
    }

    public OnSubscribeOnAssemblySingle(Single.OnSubscribe<T> onSubscribe) {
        this.f78038a = onSubscribe;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        this.f78038a.call(new C13492a(singleSubscriber, this.f78039b));
    }
}
