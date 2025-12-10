package hu.akarnokd.rxjava.interop;

import hu.akarnokd.rxjava.interop.FlowableV2ToObservableV1;
import io.reactivex.processors.FlowableProcessor;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.subjects.Subject;

/* renamed from: hu.akarnokd.rxjava.interop.b */
/* loaded from: classes5.dex */
public final class C10425b extends Subject {

    /* renamed from: b */
    public final C10426a f62644b;

    /* renamed from: hu.akarnokd.rxjava.interop.b$a */
    /* loaded from: classes5.dex */
    public static final class C10426a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final FlowableProcessor f62645a;

        public C10426a(FlowableProcessor flowableProcessor) {
            this.f62645a = flowableProcessor;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            FlowableV2ToObservableV1.SourceSubscriber sourceSubscriber = new FlowableV2ToObservableV1.SourceSubscriber(subscriber);
            subscriber.add(sourceSubscriber);
            subscriber.setProducer(sourceSubscriber);
            this.f62645a.subscribe(sourceSubscriber);
        }

        /* renamed from: b */
        public boolean m30713b() {
            return this.f62645a.hasSubscribers();
        }

        /* renamed from: c */
        public void m30712c() {
            this.f62645a.onComplete();
        }

        /* renamed from: d */
        public void m30711d(Throwable th2) {
            this.f62645a.onError(th2);
        }

        /* renamed from: e */
        public void m30710e(Object obj) {
            this.f62645a.onNext(obj);
        }
    }

    public C10425b(C10426a c10426a) {
        super(c10426a);
        this.f62644b = c10426a;
    }

    /* renamed from: c */
    public static Subject m30715c(FlowableProcessor flowableProcessor) {
        return new C10425b(new C10426a(flowableProcessor));
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        return this.f62644b.m30713b();
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f62644b.m30712c();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f62644b.m30711d(th2);
    }

    @Override // p046rx.Observer
    public void onNext(Object obj) {
        this.f62644b.m30710e(obj);
    }
}
