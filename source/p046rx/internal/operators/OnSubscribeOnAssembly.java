package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.AssemblyStackTraceException;

/* renamed from: rx.internal.operators.OnSubscribeOnAssembly */
/* loaded from: classes7.dex */
public final class OnSubscribeOnAssembly<T> implements Observable.OnSubscribe<T> {
    public static volatile boolean fullStackTrace;

    /* renamed from: a */
    public final Observable.OnSubscribe f78030a;

    /* renamed from: b */
    public final String f78031b = m23112a();

    /* renamed from: rx.internal.operators.OnSubscribeOnAssembly$a */
    /* loaded from: classes7.dex */
    public static final class C13490a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78032a;

        /* renamed from: b */
        public final String f78033b;

        public C13490a(Subscriber subscriber, String str) {
            super(subscriber);
            this.f78032a = subscriber;
            this.f78033b = str;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78032a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            new AssemblyStackTraceException(this.f78033b).attachTo(th2);
            this.f78032a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78032a.onNext(obj);
        }
    }

    public OnSubscribeOnAssembly(Observable.OnSubscribe<T> onSubscribe) {
        this.f78030a = onSubscribe;
    }

    /* renamed from: a */
    public static String m23112a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder("Assembly trace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            if (fullStackTrace || (stackTraceElement.getLineNumber() > 1 && !stackTraceElement2.contains("RxJavaHooks.") && !stackTraceElement2.contains("OnSubscribeOnAssembly") && !stackTraceElement2.contains(".junit.runner") && !stackTraceElement2.contains(".junit4.runner") && !stackTraceElement2.contains(".junit.internal") && !stackTraceElement2.contains("sun.reflect") && !stackTraceElement2.contains("java.lang.Thread.") && !stackTraceElement2.contains("ThreadPoolExecutor") && !stackTraceElement2.contains("org.apache.catalina.") && !stackTraceElement2.contains("org.apache.tomcat."))) {
                sb.append("\n at ");
                sb.append(stackTraceElement2);
            }
        }
        sb.append("\nOriginal exception:");
        return sb.toString();
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        this.f78030a.call(new C13490a(subscriber, this.f78031b));
    }
}
