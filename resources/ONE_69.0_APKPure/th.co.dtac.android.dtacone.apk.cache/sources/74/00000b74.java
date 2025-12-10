package p000;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.CtorCache;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* renamed from: M42 */
/* loaded from: classes6.dex */
public final class M42 extends CtorCache {

    /* renamed from: a */
    public static final M42 f3801a = new M42();

    /* renamed from: b */
    public static final ReentrantReadWriteLock f3802b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public static final WeakHashMap f3803c = new WeakHashMap();

    @Override // kotlinx.coroutines.internal.CtorCache
    public Function1 get(Class cls) {
        int i;
        Function1 m27145a;
        ReentrantReadWriteLock reentrantReadWriteLock = f3802b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            Function1 function1 = (Function1) f3803c.get(cls);
            if (function1 != null) {
                return function1;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap weakHashMap = f3803c;
                Function1 function12 = (Function1) weakHashMap.get(cls);
                if (function12 == null) {
                    m27145a = ExceptionsConstructorKt.m27145a(cls);
                    weakHashMap.put(cls, m27145a);
                    while (i2 < i) {
                        readLock2.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    return m27145a;
                }
                return function12;
            } finally {
                while (i2 < i) {
                    readLock2.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}