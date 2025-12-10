package p046rx.observers;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p046rx.Notification;
import p046rx.Observer;
import p046rx.Subscriber;
import p046rx.exceptions.CompositeException;

/* renamed from: rx.observers.TestSubscriber */
/* loaded from: classes7.dex */
public class TestSubscriber<T> extends Subscriber<T> {

    /* renamed from: h */
    public static final Observer f79390h = new C13837a();

    /* renamed from: a */
    public final Observer f79391a;

    /* renamed from: b */
    public final List f79392b;

    /* renamed from: c */
    public final List f79393c;

    /* renamed from: d */
    public int f79394d;

    /* renamed from: e */
    public final CountDownLatch f79395e;

    /* renamed from: f */
    public volatile int f79396f;

    /* renamed from: g */
    public volatile Thread f79397g;

    /* renamed from: rx.observers.TestSubscriber$a */
    /* loaded from: classes7.dex */
    public static class C13837a implements Observer {
        @Override // p046rx.Observer
        public void onCompleted() {
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
        }
    }

    public TestSubscriber(long j) {
        this(f79390h, j);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public void assertCompleted() {
        int i = this.f79394d;
        if (i == 0) {
            m22783c("Not completed!");
        } else if (i > 1) {
            m22783c("Completed multiple times: " + i);
        }
    }

    public void assertError(Class<? extends Throwable> cls) {
        List list = this.f79393c;
        if (list.isEmpty()) {
            m22783c("No errors");
        } else if (list.size() <= 1) {
            if (cls.isInstance(list.get(0))) {
                return;
            }
            AssertionError assertionError = new AssertionError("Exceptions differ; expected: " + cls + ", actual: " + list.get(0));
            assertionError.initCause((Throwable) list.get(0));
            throw assertionError;
        } else {
            AssertionError assertionError2 = new AssertionError("Multiple errors: " + list.size());
            assertionError2.initCause(new CompositeException(list));
            throw assertionError2;
        }
    }

    public void assertNoErrors() {
        if (!getOnErrorEvents().isEmpty()) {
            m22783c("Unexpected onError events");
        }
    }

    public void assertNoTerminalEvent() {
        List list = this.f79393c;
        int i = this.f79394d;
        if (!list.isEmpty() || i > 0) {
            if (list.isEmpty()) {
                m22783c("Found " + list.size() + " errors and " + i + " completion events instead of none");
            } else if (list.size() == 1) {
                m22783c("Found " + list.size() + " errors and " + i + " completion events instead of none");
            } else {
                m22783c("Found " + list.size() + " errors and " + i + " completion events instead of none");
            }
        }
    }

    public void assertNoValues() {
        int size = this.f79392b.size();
        if (size != 0) {
            m22783c("No onNext events expected yet some received: " + size);
        }
    }

    public void assertNotCompleted() {
        int i = this.f79394d;
        if (i == 1) {
            m22783c("Completed!");
        } else if (i > 1) {
            m22783c("Completed multiple times: " + i);
        }
    }

    public void assertReceivedOnNext(List<T> list) {
        if (this.f79392b.size() != list.size()) {
            m22783c("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.f79392b.size() + ".\nProvided values: " + list + "\nActual values: " + this.f79392b + "\n");
        }
        for (int i = 0; i < list.size(); i++) {
            m22784b(list.get(i), i);
        }
    }

    public void assertTerminalEvent() {
        if (this.f79393c.size() > 1) {
            m22783c("Too many onError events: " + this.f79393c.size());
        }
        if (this.f79394d > 1) {
            m22783c("Too many onCompleted events: " + this.f79394d);
        }
        if (this.f79394d == 1 && this.f79393c.size() == 1) {
            m22783c("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.f79394d == 0 && this.f79393c.isEmpty()) {
            m22783c("No terminal events received.");
        }
    }

    public void assertUnsubscribed() {
        if (!isUnsubscribed()) {
            m22783c("Not unsubscribed.");
        }
    }

    public void assertValue(T t) {
        assertReceivedOnNext(Collections.singletonList(t));
    }

    public void assertValueCount(int i) {
        int size = this.f79392b.size();
        if (size != i) {
            m22783c("Number of onNext events differ; expected: " + i + ", actual: " + size);
        }
    }

    public void assertValues(T... tArr) {
        assertReceivedOnNext(Arrays.asList(tArr));
    }

    public final void assertValuesAndClear(T t, T... tArr) {
        assertValueCount(tArr.length + 1);
        m22784b(t, 0);
        int i = 0;
        while (i < tArr.length) {
            T t2 = tArr[i];
            i++;
            m22784b(t2, i);
        }
        this.f79392b.clear();
        this.f79396f = 0;
    }

    public void awaitTerminalEvent() {
        try {
            this.f79395e.await();
        } catch (InterruptedException e) {
            throw new IllegalStateException("Interrupted", e);
        }
    }

    public void awaitTerminalEventAndUnsubscribeOnTimeout(long j, TimeUnit timeUnit) {
        try {
            if (!this.f79395e.await(j, timeUnit)) {
                unsubscribe();
            }
        } catch (InterruptedException unused) {
            unsubscribe();
        }
    }

    public final boolean awaitValueCount(int i, long j, TimeUnit timeUnit) {
        while (j != 0 && this.f79396f < i) {
            try {
                timeUnit.sleep(1L);
                j--;
            } catch (InterruptedException e) {
                throw new IllegalStateException("Interrupted", e);
            }
        }
        if (this.f79396f >= i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m22784b(Object obj, int i) {
        String str;
        Object obj2 = this.f79392b.get(i);
        if (obj == null) {
            if (obj2 != null) {
                m22783c("Value at index: " + i + " expected: [null] but was: [" + obj2 + "]\n");
            }
        } else if (!obj.equals(obj2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Value at index: ");
            sb.append(i);
            sb.append(" expected: [");
            sb.append(obj);
            sb.append("] (");
            sb.append(obj.getClass().getSimpleName());
            sb.append(") but was: [");
            sb.append(obj2);
            sb.append("] (");
            if (obj2 != null) {
                str = obj2.getClass().getSimpleName();
            } else {
                str = AbstractJsonLexerKt.NULL;
            }
            sb.append(str);
            sb.append(")\n");
            m22783c(sb.toString());
        }
    }

    /* renamed from: c */
    public final void m22783c(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        int i = this.f79394d;
        sb.append(i);
        sb.append(" completion");
        if (i != 1) {
            sb.append('s');
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (!this.f79393c.isEmpty()) {
            int size = this.f79393c.size();
            sb.append(" (+");
            sb.append(size);
            sb.append(" error");
            if (size != 1) {
                sb.append('s');
            }
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.f79393c.isEmpty()) {
            if (this.f79393c.size() == 1) {
                assertionError.initCause((Throwable) this.f79393c.get(0));
            } else {
                assertionError.initCause(new CompositeException(this.f79393c));
            }
        }
        throw assertionError;
    }

    public final int getCompletions() {
        return this.f79394d;
    }

    public Thread getLastSeenThread() {
        return this.f79397g;
    }

    @Deprecated
    public List<Notification<T>> getOnCompletedEvents() {
        int i;
        int i2 = this.f79394d;
        if (i2 != 0) {
            i = i2;
        } else {
            i = 1;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Notification.createOnCompleted());
        }
        return arrayList;
    }

    public List<Throwable> getOnErrorEvents() {
        return this.f79393c;
    }

    public List<T> getOnNextEvents() {
        return this.f79392b;
    }

    public final int getValueCount() {
        return this.f79396f;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        try {
            this.f79394d++;
            this.f79397g = Thread.currentThread();
            this.f79391a.onCompleted();
        } finally {
            this.f79395e.countDown();
        }
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        try {
            this.f79397g = Thread.currentThread();
            this.f79393c.add(th2);
            this.f79391a.onError(th2);
        } finally {
            this.f79395e.countDown();
        }
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79397g = Thread.currentThread();
        this.f79392b.add(t);
        this.f79396f = this.f79392b.size();
        this.f79391a.onNext(t);
    }

    public void requestMore(long j) {
        request(j);
    }

    public TestSubscriber(Observer<T> observer, long j) {
        this.f79395e = new CountDownLatch(1);
        observer.getClass();
        this.f79391a = observer;
        if (j >= 0) {
            request(j);
        }
        this.f79392b = new ArrayList();
        this.f79393c = new ArrayList();
    }

    public static <T> TestSubscriber<T> create(long j) {
        return new TestSubscriber<>(j);
    }

    public static <T> TestSubscriber<T> create(Observer<T> observer, long j) {
        return new TestSubscriber<>(observer, j);
    }

    public void awaitTerminalEvent(long j, TimeUnit timeUnit) {
        try {
            this.f79395e.await(j, timeUnit);
        } catch (InterruptedException e) {
            throw new IllegalStateException("Interrupted", e);
        }
    }

    public static <T> TestSubscriber<T> create(Subscriber<T> subscriber) {
        return new TestSubscriber<>((Subscriber) subscriber);
    }

    public static <T> TestSubscriber<T> create(Observer<T> observer) {
        return new TestSubscriber<>(observer);
    }

    public TestSubscriber(Subscriber<T> subscriber) {
        this(subscriber, -1L);
    }

    public TestSubscriber(Observer<T> observer) {
        this(observer, -1L);
    }

    public TestSubscriber() {
        this(-1L);
    }

    public void assertError(Throwable th2) {
        List list = this.f79393c;
        if (list.isEmpty()) {
            m22783c("No errors");
        } else if (list.size() > 1) {
            m22783c("Multiple errors");
        } else if (th2.equals(list.get(0))) {
        } else {
            m22783c("Exceptions differ; expected: " + th2 + ", actual: " + list.get(0));
        }
    }
}
