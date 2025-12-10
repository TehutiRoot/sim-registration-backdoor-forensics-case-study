package p046rx.subjects;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.observers.SerializedObserver;

/* renamed from: rx.subjects.SerializedSubject */
/* loaded from: classes7.dex */
public class SerializedSubject<T, R> extends Subject<T, R> {

    /* renamed from: b */
    public final SerializedObserver f79484b;

    /* renamed from: c */
    public final Subject f79485c;

    /* renamed from: rx.subjects.SerializedSubject$a */
    /* loaded from: classes7.dex */
    public class C13869a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Subject f79486a;

        public C13869a(Subject subject) {
            this.f79486a = subject;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            this.f79486a.unsafeSubscribe(subscriber);
        }
    }

    public SerializedSubject(Subject<T, R> subject) {
        super(new C13869a(subject));
        this.f79485c = subject;
        this.f79484b = new SerializedObserver(subject);
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        return this.f79485c.hasObservers();
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f79484b.onCompleted();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f79484b.onError(th2);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79484b.onNext(t);
    }
}
