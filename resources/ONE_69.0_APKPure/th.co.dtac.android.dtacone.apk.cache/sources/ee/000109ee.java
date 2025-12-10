package p046rx.internal.operators;

import java.io.Serializable;
import p046rx.Observer;

/* renamed from: rx.internal.operators.NotificationLite */
/* loaded from: classes7.dex */
public final class NotificationLite {

    /* renamed from: a */
    public static final Object f78069a = new Serializable() { // from class: rx.internal.operators.NotificationLite.1
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }
    };

    /* renamed from: b */
    public static final Object f78070b = new Serializable() { // from class: rx.internal.operators.NotificationLite.2
        private static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }
    };

    /* renamed from: rx.internal.operators.NotificationLite$OnErrorSentinel */
    /* loaded from: classes7.dex */
    public static final class OnErrorSentinel implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: e */
        final Throwable f78071e;

        public OnErrorSentinel(Throwable th2) {
            this.f78071e = th2;
        }

        public String toString() {
            return "Notification=>Error:" + this.f78071e;
        }
    }

    public static <T> boolean accept(Observer<? super T> observer, Object obj) {
        if (obj == f78069a) {
            observer.onCompleted();
            return true;
        } else if (obj == f78070b) {
            observer.onNext(null);
            return false;
        } else if (obj != null) {
            if (obj.getClass() == OnErrorSentinel.class) {
                observer.onError(((OnErrorSentinel) obj).f78071e);
                return true;
            }
            observer.onNext(obj);
            return false;
        } else {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
    }

    public static Object completed() {
        return f78069a;
    }

    public static Object error(Throwable th2) {
        return new OnErrorSentinel(th2);
    }

    public static Throwable getError(Object obj) {
        return ((OnErrorSentinel) obj).f78071e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        if (obj == f78070b) {
            return null;
        }
        return obj;
    }

    public static boolean isCompleted(Object obj) {
        if (obj == f78069a) {
            return true;
        }
        return false;
    }

    public static boolean isError(Object obj) {
        return obj instanceof OnErrorSentinel;
    }

    public static boolean isNext(Object obj) {
        if (obj != null && !isError(obj) && !isCompleted(obj)) {
            return true;
        }
        return false;
    }

    public static boolean isNull(Object obj) {
        if (obj == f78070b) {
            return true;
        }
        return false;
    }

    public static <T> Object next(T t) {
        if (t == null) {
            return f78070b;
        }
        return t;
    }
}