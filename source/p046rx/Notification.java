package p046rx;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.message.TokenParser;

/* renamed from: rx.Notification */
/* loaded from: classes5.dex */
public final class Notification<T> {

    /* renamed from: d */
    public static final Notification f77653d = new Notification(Kind.OnCompleted, null, null);

    /* renamed from: a */
    public final Kind f77654a;

    /* renamed from: b */
    public final Throwable f77655b;

    /* renamed from: c */
    public final Object f77656c;

    /* renamed from: rx.Notification$Kind */
    /* loaded from: classes5.dex */
    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    public Notification(Kind kind, Object obj, Throwable th2) {
        this.f77656c = obj;
        this.f77655b = th2;
        this.f77654a = kind;
    }

    public static <T> Notification<T> createOnCompleted() {
        return f77653d;
    }

    public static <T> Notification<T> createOnError(Throwable th2) {
        return new Notification<>(Kind.OnError, null, th2);
    }

    public static <T> Notification<T> createOnNext(T t) {
        return new Notification<>(Kind.OnNext, t, null);
    }

    public void accept(Observer<? super T> observer) {
        Kind kind = this.f77654a;
        if (kind == Kind.OnNext) {
            observer.onNext(getValue());
        } else if (kind == Kind.OnCompleted) {
            observer.onCompleted();
        } else {
            observer.onError(getThrowable());
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != Notification.class) {
            return false;
        }
        Notification notification = (Notification) obj;
        if (notification.getKind() != getKind()) {
            return false;
        }
        Object obj2 = this.f77656c;
        Object obj3 = notification.f77656c;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Throwable th2 = this.f77655b;
        Throwable th3 = notification.f77655b;
        if (th2 != th3 && (th2 == null || !th2.equals(th3))) {
            return false;
        }
        return true;
    }

    public Kind getKind() {
        return this.f77654a;
    }

    public Throwable getThrowable() {
        return this.f77655b;
    }

    public T getValue() {
        return (T) this.f77656c;
    }

    public boolean hasThrowable() {
        if (isOnError() && this.f77655b != null) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (isOnNext() && this.f77656c != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = getKind().hashCode();
        if (hasValue()) {
            hashCode = (hashCode * 31) + getValue().hashCode();
        }
        if (hasThrowable()) {
            return (hashCode * 31) + getThrowable().hashCode();
        }
        return hashCode;
    }

    public boolean isOnCompleted() {
        if (getKind() == Kind.OnCompleted) {
            return true;
        }
        return false;
    }

    public boolean isOnError() {
        if (getKind() == Kind.OnError) {
            return true;
        }
        return false;
    }

    public boolean isOnNext() {
        if (getKind() == Kind.OnNext) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(super.toString());
        sb.append(TokenParser.f74560SP);
        sb.append(getKind());
        if (hasValue()) {
            sb.append(TokenParser.f74560SP);
            sb.append(getValue());
        }
        if (hasThrowable()) {
            sb.append(TokenParser.f74560SP);
            sb.append(getThrowable().getMessage());
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Deprecated
    public static <T> Notification<T> createOnCompleted(Class<T> cls) {
        return f77653d;
    }
}
