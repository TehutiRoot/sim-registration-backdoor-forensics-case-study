package p000;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.CtorCache;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* renamed from: P32 */
/* loaded from: classes6.dex */
public final class P32 extends CtorCache {

    /* renamed from: a */
    public static final P32 f4629a = new P32();

    /* renamed from: b */
    public static final ReentrantReadWriteLock f4630b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public static final WeakHashMap f4631c = new WeakHashMap();

    @Override // kotlinx.coroutines.internal.CtorCache
    public Function1 get(Class cls) {
        int i;
        Function1 m26853a;
        ReentrantReadWriteLock reentrantReadWriteLock = f4630b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            Function1 function1 = (Function1) f4631c.get(cls);
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
                WeakHashMap weakHashMap = f4631c;
                Function1 function12 = (Function1) weakHashMap.get(cls);
                if (function12 == null) {
                    m26853a = ExceptionsConstructorKt.m26853a(cls);
                    weakHashMap.put(cls, m26853a);
                    while (i2 < i) {
                        readLock2.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    return m26853a;
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
