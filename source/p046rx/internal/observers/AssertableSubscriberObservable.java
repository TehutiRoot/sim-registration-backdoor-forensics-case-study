package p046rx.internal.observers;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.observers.AssertableSubscriber;
import p046rx.observers.TestSubscriber;

/* renamed from: rx.internal.observers.AssertableSubscriberObservable */
/* loaded from: classes5.dex */
public class AssertableSubscriberObservable<T> extends Subscriber<T> implements AssertableSubscriber<T> {

    /* renamed from: a */
    public final TestSubscriber f77747a;

    public AssertableSubscriberObservable(TestSubscriber<T> testSubscriber) {
        this.f77747a = testSubscriber;
    }

    public static <T> AssertableSubscriberObservable<T> create(long j) {
        TestSubscriber testSubscriber = new TestSubscriber(j);
        AssertableSubscriberObservable<T> assertableSubscriberObservable = new AssertableSubscriberObservable<>(testSubscriber);
        assertableSubscriberObservable.add(testSubscriber);
        return assertableSubscriberObservable;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertCompleted() {
        this.f77747a.assertCompleted();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertError(Class<? extends Throwable> cls) {
        this.f77747a.assertError(cls);
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> assertFailure(Class<? extends Throwable> cls, T... tArr) {
        this.f77747a.assertValues(tArr);
        this.f77747a.assertError(cls);
        this.f77747a.assertNotCompleted();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> assertFailureAndMessage(Class<? extends Throwable> cls, String str, T... tArr) {
        this.f77747a.assertValues(tArr);
        this.f77747a.assertError(cls);
        this.f77747a.assertNotCompleted();
        String message = this.f77747a.getOnErrorEvents().get(0).getMessage();
        if (message != str && (str == null || !str.equals(message))) {
            throw new AssertionError("Error message differs. Expected: '" + str + "', Received: '" + message + OperatorName.SHOW_TEXT_LINE);
        }
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertNoErrors() {
        this.f77747a.assertNoErrors();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertNoTerminalEvent() {
        this.f77747a.assertNoTerminalEvent();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertNoValues() {
        this.f77747a.assertNoValues();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertNotCompleted() {
        this.f77747a.assertNotCompleted();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertReceivedOnNext(List<T> list) {
        this.f77747a.assertReceivedOnNext(list);
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> assertResult(T... tArr) {
        this.f77747a.assertValues(tArr);
        this.f77747a.assertNoErrors();
        this.f77747a.assertCompleted();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertTerminalEvent() {
        this.f77747a.assertTerminalEvent();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertUnsubscribed() {
        this.f77747a.assertUnsubscribed();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertValue(T t) {
        this.f77747a.assertValue(t);
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertValueCount(int i) {
        this.f77747a.assertValueCount(i);
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertValues(T... tArr) {
        this.f77747a.assertValues(tArr);
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> assertValuesAndClear(T t, T... tArr) {
        this.f77747a.assertValuesAndClear(t, tArr);
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> awaitTerminalEvent() {
        this.f77747a.awaitTerminalEvent();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> awaitTerminalEventAndUnsubscribeOnTimeout(long j, TimeUnit timeUnit) {
        this.f77747a.awaitTerminalEventAndUnsubscribeOnTimeout(j, timeUnit);
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> awaitValueCount(int i, long j, TimeUnit timeUnit) {
        if (this.f77747a.awaitValueCount(i, j, timeUnit)) {
            return this;
        }
        throw new AssertionError("Did not receive enough values in time. Expected: " + i + ", Actual: " + this.f77747a.getValueCount());
    }

    @Override // p046rx.observers.AssertableSubscriber
    public final int getCompletions() {
        return this.f77747a.getCompletions();
    }

    @Override // p046rx.observers.AssertableSubscriber
    public Thread getLastSeenThread() {
        return this.f77747a.getLastSeenThread();
    }

    @Override // p046rx.observers.AssertableSubscriber
    public List<Throwable> getOnErrorEvents() {
        return this.f77747a.getOnErrorEvents();
    }

    @Override // p046rx.observers.AssertableSubscriber
    public List<T> getOnNextEvents() {
        return this.f77747a.getOnNextEvents();
    }

    @Override // p046rx.observers.AssertableSubscriber
    public final int getValueCount() {
        return this.f77747a.getValueCount();
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f77747a.onCompleted();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f77747a.onError(th2);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f77747a.onNext(t);
    }

    @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
    public void onStart() {
        this.f77747a.onStart();
    }

    @Override // p046rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> perform(Action0 action0) {
        action0.call();
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> requestMore(long j) {
        this.f77747a.requestMore(j);
        return this;
    }

    @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
    public void setProducer(Producer producer) {
        this.f77747a.setProducer(producer);
    }

    public String toString() {
        return this.f77747a.toString();
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertError(Throwable th2) {
        this.f77747a.assertError(th2);
        return this;
    }

    @Override // p046rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> awaitTerminalEvent(long j, TimeUnit timeUnit) {
        this.f77747a.awaitTerminalEvent(j, timeUnit);
        return this;
    }
}
