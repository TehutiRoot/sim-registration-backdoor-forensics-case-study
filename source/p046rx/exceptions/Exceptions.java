package p046rx.exceptions;

import java.util.HashSet;
import java.util.List;
import p046rx.Observer;
import p046rx.SingleSubscriber;

/* renamed from: rx.exceptions.Exceptions */
/* loaded from: classes5.dex */
public final class Exceptions {
    public static void addCause(Throwable th2, Throwable th3) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (th2.getCause() != null) {
            int i2 = i + 1;
            if (i >= 25) {
                return;
            }
            th2 = th2.getCause();
            if (!hashSet.contains(th2.getCause())) {
                hashSet.add(th2.getCause());
                i = i2;
            }
        }
        try {
            th2.initCause(th3);
        } catch (Throwable unused) {
        }
    }

    public static Throwable getFinalCause(Throwable th2) {
        int i = 0;
        while (th2.getCause() != null) {
            int i2 = i + 1;
            if (i >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th2 = th2.getCause();
            i = i2;
        }
        return th2;
    }

    public static RuntimeException propagate(Throwable th2) {
        if (!(th2 instanceof RuntimeException)) {
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            throw new RuntimeException(th2);
        }
        throw ((RuntimeException) th2);
    }

    public static void throwIfAny(List<? extends Throwable> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                Throwable th2 = list.get(0);
                if (!(th2 instanceof RuntimeException)) {
                    if (th2 instanceof Error) {
                        throw ((Error) th2);
                    }
                    throw new RuntimeException(th2);
                }
                throw ((RuntimeException) th2);
            }
            throw new CompositeException(list);
        }
    }

    public static void throwIfFatal(Throwable th2) {
        if (!(th2 instanceof OnErrorNotImplementedException)) {
            if (!(th2 instanceof OnErrorFailedException)) {
                if (!(th2 instanceof OnCompletedFailedException)) {
                    if (!(th2 instanceof VirtualMachineError)) {
                        if (!(th2 instanceof ThreadDeath)) {
                            if (!(th2 instanceof LinkageError)) {
                                return;
                            }
                            throw ((LinkageError) th2);
                        }
                        throw ((ThreadDeath) th2);
                    }
                    throw ((VirtualMachineError) th2);
                }
                throw ((OnCompletedFailedException) th2);
            }
            throw ((OnErrorFailedException) th2);
        }
        throw ((OnErrorNotImplementedException) th2);
    }

    public static void throwOrReport(Throwable th2, Observer<?> observer, Object obj) {
        throwIfFatal(th2);
        observer.onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
    }

    public static void throwOrReport(Throwable th2, SingleSubscriber<?> singleSubscriber, Object obj) {
        throwIfFatal(th2);
        singleSubscriber.onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
    }

    public static void throwOrReport(Throwable th2, Observer<?> observer) {
        throwIfFatal(th2);
        observer.onError(th2);
    }

    public static void throwOrReport(Throwable th2, SingleSubscriber<?> singleSubscriber) {
        throwIfFatal(th2);
        singleSubscriber.onError(th2);
    }
}
