package p046rx.observers;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p046rx.Notification;
import p046rx.Observer;
import p046rx.exceptions.CompositeException;

@Deprecated
/* renamed from: rx.observers.TestObserver */
/* loaded from: classes7.dex */
public class TestObserver<T> implements Observer<T> {

    /* renamed from: e */
    public static final Observer f79591e = new C13837a();

    /* renamed from: a */
    public final Observer f79592a;

    /* renamed from: b */
    public final List f79593b;

    /* renamed from: c */
    public final List f79594c;

    /* renamed from: d */
    public final List f79595d;

    /* renamed from: rx.observers.TestObserver$a */
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

    public TestObserver(Observer<T> observer) {
        this.f79593b = new ArrayList();
        this.f79594c = new ArrayList();
        this.f79595d = new ArrayList();
        this.f79592a = observer;
    }

    /* renamed from: a */
    public final void m22973a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        int size = this.f79595d.size();
        sb.append(size);
        sb.append(" completion");
        if (size != 1) {
            sb.append('s');
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (!this.f79594c.isEmpty()) {
            int size2 = this.f79594c.size();
            sb.append(" (+");
            sb.append(size2);
            sb.append(" error");
            if (size2 != 1) {
                sb.append('s');
            }
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.f79594c.isEmpty()) {
            if (this.f79594c.size() == 1) {
                assertionError.initCause((Throwable) this.f79594c.get(0));
            } else {
                assertionError.initCause(new CompositeException(this.f79594c));
            }
        }
        throw assertionError;
    }

    public void assertReceivedOnNext(List<T> list) {
        String str;
        if (this.f79593b.size() != list.size()) {
            m22973a("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.f79593b.size() + ".\nProvided values: " + list + "\nActual values: " + this.f79593b + "\n");
        }
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            Object obj = this.f79593b.get(i);
            if (t == null) {
                if (obj != null) {
                    m22973a("Value at index: " + i + " expected to be [null] but was: [" + obj + "]\n");
                }
            } else if (!t.equals(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Value at index: ");
                sb.append(i);
                sb.append(" expected to be [");
                sb.append(t);
                sb.append("] (");
                sb.append(t.getClass().getSimpleName());
                sb.append(") but was: [");
                sb.append(obj);
                sb.append("] (");
                if (obj != null) {
                    str = obj.getClass().getSimpleName();
                } else {
                    str = AbstractJsonLexerKt.NULL;
                }
                sb.append(str);
                sb.append(")\n");
                m22973a(sb.toString());
            }
        }
    }

    public void assertTerminalEvent() {
        if (this.f79594c.size() > 1) {
            m22973a("Too many onError events: " + this.f79594c.size());
        }
        if (this.f79595d.size() > 1) {
            m22973a("Too many onCompleted events: " + this.f79595d.size());
        }
        if (this.f79595d.size() == 1 && this.f79594c.size() == 1) {
            m22973a("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.f79595d.isEmpty() && this.f79594c.isEmpty()) {
            m22973a("No terminal events received.");
        }
    }

    public List<Object> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f79593b);
        arrayList.add(this.f79594c);
        arrayList.add(this.f79595d);
        return Collections.unmodifiableList(arrayList);
    }

    public List<Notification<T>> getOnCompletedEvents() {
        return Collections.unmodifiableList(this.f79595d);
    }

    public List<Throwable> getOnErrorEvents() {
        return Collections.unmodifiableList(this.f79594c);
    }

    public List<T> getOnNextEvents() {
        return Collections.unmodifiableList(this.f79593b);
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f79595d.add(Notification.createOnCompleted());
        this.f79592a.onCompleted();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f79594c.add(th2);
        this.f79592a.onError(th2);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79593b.add(t);
        this.f79592a.onNext(t);
    }

    public TestObserver() {
        this.f79593b = new ArrayList();
        this.f79594c = new ArrayList();
        this.f79595d = new ArrayList();
        this.f79592a = f79591e;
    }
}