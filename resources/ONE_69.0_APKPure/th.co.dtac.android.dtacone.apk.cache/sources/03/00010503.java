package org.reactivestreams;

import java.util.Objects;
import java.util.concurrent.Flow;

/* loaded from: classes5.dex */
public final class FlowAdapters {

    /* renamed from: org.reactivestreams.FlowAdapters$a */
    /* loaded from: classes5.dex */
    public static final class Flow$PublisherC13034a implements Flow.Publisher {

        /* renamed from: a */
        public final Publisher f76489a;

        public Flow$PublisherC13034a(Publisher publisher) {
            this.f76489a = publisher;
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber subscriber) {
            C13040g c13040g;
            Publisher publisher = this.f76489a;
            if (subscriber == null) {
                c13040g = null;
            } else {
                c13040g = new C13040g(subscriber);
            }
            publisher.subscribe(c13040g);
        }
    }

    /* renamed from: org.reactivestreams.FlowAdapters$b */
    /* loaded from: classes5.dex */
    public static final class Flow$ProcessorC13035b implements Flow.Processor {

        /* renamed from: a */
        public final Processor f76490a;

        public Flow$ProcessorC13035b(Processor processor) {
            this.f76490a = processor;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f76490a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th2) {
            this.f76490a.onError(th2);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(Object obj) {
            this.f76490a.onNext(obj);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            C13041h c13041h;
            Processor processor = this.f76490a;
            if (subscription == null) {
                c13041h = null;
            } else {
                c13041h = new C13041h(subscription);
            }
            processor.onSubscribe(c13041h);
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber subscriber) {
            C13040g c13040g;
            Processor processor = this.f76490a;
            if (subscriber == null) {
                c13040g = null;
            } else {
                c13040g = new C13040g(subscriber);
            }
            processor.subscribe(c13040g);
        }
    }

    /* renamed from: org.reactivestreams.FlowAdapters$c */
    /* loaded from: classes5.dex */
    public static final class Flow$SubscriberC13036c implements Flow.Subscriber {

        /* renamed from: a */
        public final Subscriber f76491a;

        public Flow$SubscriberC13036c(Subscriber subscriber) {
            this.f76491a = subscriber;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f76491a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th2) {
            this.f76491a.onError(th2);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(Object obj) {
            this.f76491a.onNext(obj);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            C13041h c13041h;
            Subscriber subscriber = this.f76491a;
            if (subscription == null) {
                c13041h = null;
            } else {
                c13041h = new C13041h(subscription);
            }
            subscriber.onSubscribe(c13041h);
        }
    }

    /* renamed from: org.reactivestreams.FlowAdapters$d */
    /* loaded from: classes5.dex */
    public static final class Flow$SubscriptionC13037d implements Flow.Subscription {

        /* renamed from: a */
        public final Subscription f76492a;

        public Flow$SubscriptionC13037d(Subscription subscription) {
            this.f76492a = subscription;
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void cancel() {
            this.f76492a.cancel();
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void request(long j) {
            this.f76492a.request(j);
        }
    }

    /* renamed from: org.reactivestreams.FlowAdapters$e */
    /* loaded from: classes5.dex */
    public static final class C13038e implements Publisher {

        /* renamed from: a */
        public final Flow.Publisher f76493a;

        public C13038e(Flow.Publisher publisher) {
            this.f76493a = publisher;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber subscriber) {
            Flow$SubscriberC13036c flow$SubscriberC13036c;
            Flow.Publisher publisher = this.f76493a;
            if (subscriber == null) {
                flow$SubscriberC13036c = null;
            } else {
                flow$SubscriberC13036c = new Flow$SubscriberC13036c(subscriber);
            }
            publisher.subscribe(flow$SubscriberC13036c);
        }
    }

    /* renamed from: org.reactivestreams.FlowAdapters$f */
    /* loaded from: classes5.dex */
    public static final class C13039f implements Processor {

        /* renamed from: a */
        public final Flow.Processor f76494a;

        public C13039f(Flow.Processor processor) {
            this.f76494a = processor;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f76494a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f76494a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f76494a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            Flow$SubscriptionC13037d flow$SubscriptionC13037d;
            Flow.Processor processor = this.f76494a;
            if (subscription == null) {
                flow$SubscriptionC13037d = null;
            } else {
                flow$SubscriptionC13037d = new Flow$SubscriptionC13037d(subscription);
            }
            processor.onSubscribe(flow$SubscriptionC13037d);
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber subscriber) {
            Flow$SubscriberC13036c flow$SubscriberC13036c;
            Flow.Processor processor = this.f76494a;
            if (subscriber == null) {
                flow$SubscriberC13036c = null;
            } else {
                flow$SubscriberC13036c = new Flow$SubscriberC13036c(subscriber);
            }
            processor.subscribe(flow$SubscriberC13036c);
        }
    }

    /* renamed from: org.reactivestreams.FlowAdapters$g */
    /* loaded from: classes5.dex */
    public static final class C13040g implements Subscriber {

        /* renamed from: a */
        public final Flow.Subscriber f76495a;

        public C13040g(Flow.Subscriber subscriber) {
            this.f76495a = subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f76495a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f76495a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f76495a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            Flow$SubscriptionC13037d flow$SubscriptionC13037d;
            Flow.Subscriber subscriber = this.f76495a;
            if (subscription == null) {
                flow$SubscriptionC13037d = null;
            } else {
                flow$SubscriptionC13037d = new Flow$SubscriptionC13037d(subscription);
            }
            subscriber.onSubscribe(flow$SubscriptionC13037d);
        }
    }

    /* renamed from: org.reactivestreams.FlowAdapters$h */
    /* loaded from: classes5.dex */
    public static final class C13041h implements Subscription {

        /* renamed from: a */
        public final Flow.Subscription f76496a;

        public C13041h(Flow.Subscription subscription) {
            this.f76496a = subscription;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f76496a.cancel();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f76496a.request(j);
        }
    }

    public static <T, U> Flow.Processor<T, U> toFlowProcessor(Processor<? super T, ? extends U> processor) {
        Objects.requireNonNull(processor, "reactiveStreamsProcessor");
        if (processor instanceof C13039f) {
            return ((C13039f) processor).f76494a;
        }
        if (AbstractC20543j30.m29624a(processor)) {
            return AbstractC20716k30.m29283a(processor);
        }
        return new Flow$ProcessorC13035b(processor);
    }

    public static <T> Flow.Publisher<T> toFlowPublisher(Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "reactiveStreamsPublisher");
        if (publisher instanceof C13038e) {
            return ((C13038e) publisher).f76493a;
        }
        if (AbstractC19851f30.m31557a(publisher)) {
            return AbstractC20024g30.m31440a(publisher);
        }
        return new Flow$PublisherC13034a(publisher);
    }

    public static <T> Flow.Subscriber<T> toFlowSubscriber(Subscriber<T> subscriber) {
        Objects.requireNonNull(subscriber, "reactiveStreamsSubscriber");
        if (subscriber instanceof C13040g) {
            return ((C13040g) subscriber).f76495a;
        }
        if (AbstractC20197h30.m31295a(subscriber)) {
            return AbstractC20370i30.m31051a(subscriber);
        }
        return new Flow$SubscriberC13036c(subscriber);
    }

    public static <T, U> Processor<T, U> toProcessor(Flow.Processor<? super T, ? extends U> processor) {
        Objects.requireNonNull(processor, "flowProcessor");
        if (processor instanceof Flow$ProcessorC13035b) {
            return ((Flow$ProcessorC13035b) processor).f76490a;
        }
        if (processor instanceof Processor) {
            return (Processor) processor;
        }
        return new C13039f(processor);
    }

    public static <T> Publisher<T> toPublisher(Flow.Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "flowPublisher");
        if (publisher instanceof Flow$PublisherC13034a) {
            return ((Flow$PublisherC13034a) publisher).f76489a;
        }
        if (publisher instanceof Publisher) {
            return (Publisher) publisher;
        }
        return new C13038e(publisher);
    }

    public static <T> Subscriber<T> toSubscriber(Flow.Subscriber<T> subscriber) {
        Objects.requireNonNull(subscriber, "flowSubscriber");
        if (subscriber instanceof Flow$SubscriberC13036c) {
            return ((Flow$SubscriberC13036c) subscriber).f76491a;
        }
        if (subscriber instanceof Subscriber) {
            return (Subscriber) subscriber;
        }
        return new C13040g(subscriber);
    }
}