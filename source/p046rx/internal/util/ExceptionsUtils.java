package p046rx.internal.util;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.exceptions.CompositeException;

/* renamed from: rx.internal.util.ExceptionsUtils */
/* loaded from: classes7.dex */
public enum ExceptionsUtils {
    ;
    
    private static final Throwable TERMINATED = new Throwable("Terminated");

    public static boolean addThrowable(AtomicReference<Throwable> atomicReference, Throwable th2) {
        Throwable th3;
        Throwable compositeException;
        do {
            th3 = atomicReference.get();
            if (th3 == TERMINATED) {
                return false;
            }
            if (th3 == null) {
                compositeException = th2;
            } else if (th3 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th3).getExceptions());
                arrayList.add(th2);
                compositeException = new CompositeException(arrayList);
            } else {
                compositeException = new CompositeException(th3, th2);
            }
        } while (!AbstractC17300An1.m69050a(atomicReference, th3, compositeException));
        return true;
    }

    public static boolean isTerminated(AtomicReference<Throwable> atomicReference) {
        return isTerminated(atomicReference.get());
    }

    public static Throwable terminate(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        Throwable th3 = TERMINATED;
        if (th2 != th3) {
            return atomicReference.getAndSet(th3);
        }
        return th2;
    }

    public static boolean isTerminated(Throwable th2) {
        return th2 == TERMINATED;
    }
}
