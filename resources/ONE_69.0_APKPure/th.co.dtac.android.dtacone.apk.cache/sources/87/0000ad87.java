package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public class CycleDetectingLockFactory {

    /* renamed from: b */
    public static final ConcurrentMap f54322b = new MapMaker().weakKeys().makeMap();

    /* renamed from: c */
    public static final C17503Di0 f54323c = new C17503Di0(CycleDetectingLockFactory.class);

    /* renamed from: d */
    public static final ThreadLocal f54324d = new C8228a();

    /* renamed from: a */
    public final Policy f54325a;

    /* loaded from: classes4.dex */
    public final class CycleDetectingReentrantLock extends ReentrantLock implements InterfaceC8229b {
        private final C8230c lockGraphNode;

        public /* synthetic */ CycleDetectingReentrantLock(CycleDetectingLockFactory cycleDetectingLockFactory, C8230c c8230c, boolean z, C8228a c8228a) {
            this(c8230c, z);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC8229b
        public C8230c getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC8229b
        public boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.m39536a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m39529h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m39536a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m39529h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m39536a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m39529h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m39529h(this);
            }
        }

        private CycleDetectingReentrantLock(C8230c c8230c, boolean z) {
            super(z);
            this.lockGraphNode = (C8230c) Preconditions.checkNotNull(c8230c);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m39536a(this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m39529h(this);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements InterfaceC8229b {
        private final C8230c lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        private final CycleDetectingReentrantWriteLock writeLock;

        public /* synthetic */ CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, C8230c c8230c, boolean z, C8228a c8228a) {
            this(c8230c, z);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC8229b
        public C8230c getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC8229b
        public boolean isAcquiredByCurrentThread() {
            if (!isWriteLockedByCurrentThread() && getReadHoldCount() <= 0) {
                return false;
            }
            return true;
        }

        private CycleDetectingReentrantReadWriteLock(C8230c c8230c, boolean z) {
            super(z);
            this.readLock = new CycleDetectingReentrantReadLock(this);
            this.writeLock = new CycleDetectingReentrantWriteLock(this);
            this.lockGraphNode = (C8230c) Preconditions.checkNotNull(c8230c);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.readLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.writeLock;
        }
    }

    /* loaded from: classes4.dex */
    public static class ExampleStackTrace extends IllegalStateException {
        static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.m40917of(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), C8230c.class.getName());

        public ExampleStackTrace(C8230c c8230c, C8230c c8230c2) {
            super(c8230c.m39524d() + " -> " + c8230c2.m39524d());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                if (WithExplicitOrdering.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(EMPTY_STACK_TRACE);
                    return;
                } else if (!EXCLUDED_CLASS_NAMES.contains(stackTrace[i].getClassName())) {
                    setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                    return;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum Policies implements Policy {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f54323c.m68797a().log(Level.SEVERE, "Detected potential deadlock", (Throwable) potentialDeadlockException);
            }
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        };

        /* synthetic */ Policies(C8228a c8228a) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface Policy {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    /* loaded from: classes4.dex */
    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        public /* synthetic */ PotentialDeadlockException(C8230c c8230c, C8230c c8230c2, ExampleStackTrace exampleStackTrace, C8228a c8228a) {
            this(c8230c, c8230c2, exampleStackTrace);
        }

        public ExampleStackTrace getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th2 = this.conflictingStackTrace; th2 != null; th2 = th2.getCause()) {
                sb.append(", ");
                sb.append(th2.getMessage());
            }
            return sb.toString();
        }

        private PotentialDeadlockException(C8230c c8230c, C8230c c8230c2, ExampleStackTrace exampleStackTrace) {
            super(c8230c, c8230c2);
            this.conflictingStackTrace = exampleStackTrace;
            initCause(exampleStackTrace);
        }
    }

    /* loaded from: classes4.dex */
    public static final class WithExplicitOrdering<E extends Enum<E>> extends CycleDetectingLockFactory {

        /* renamed from: e */
        public final Map f54326e;

        public WithExplicitOrdering(Policy policy, Map map) {
            super(policy, null);
            this.f54326e = map;
        }

        public ReentrantLock newReentrantLock(E e) {
            return newReentrantLock((WithExplicitOrdering<E>) e, false);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e) {
            return newReentrantReadWriteLock((WithExplicitOrdering<E>) e, false);
        }

        public ReentrantLock newReentrantLock(E e, boolean z) {
            if (this.f54325a == Policies.DISABLED) {
                return new ReentrantLock(z);
            }
            C8230c c8230c = (C8230c) this.f54326e.get(e);
            Objects.requireNonNull(c8230c);
            return new CycleDetectingReentrantLock(this, c8230c, z, null);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e, boolean z) {
            if (this.f54325a == Policies.DISABLED) {
                return new ReentrantReadWriteLock(z);
            }
            C8230c c8230c = (C8230c) this.f54326e.get(e);
            Objects.requireNonNull(c8230c);
            return new CycleDetectingReentrantReadWriteLock(this, c8230c, z, null);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    /* loaded from: classes4.dex */
    public class C8228a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList initialValue() {
            return Lists.newArrayListWithCapacity(3);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8229b {
        C8230c getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$c */
    /* loaded from: classes4.dex */
    public static class C8230c {

        /* renamed from: a */
        public final Map f54327a = new MapMaker().weakKeys().makeMap();

        /* renamed from: b */
        public final Map f54328b = new MapMaker().weakKeys().makeMap();

        /* renamed from: c */
        public final String f54329c;

        public C8230c(String str) {
            this.f54329c = (String) Preconditions.checkNotNull(str);
        }

        /* renamed from: a */
        public void m39527a(Policy policy, C8230c c8230c) {
            boolean z;
            if (this != c8230c) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Attempted to acquire multiple locks with the same rank %s", c8230c.m39524d());
            if (this.f54327a.containsKey(c8230c)) {
                return;
            }
            PotentialDeadlockException potentialDeadlockException = (PotentialDeadlockException) this.f54328b.get(c8230c);
            if (potentialDeadlockException != null) {
                policy.handlePotentialDeadlock(new PotentialDeadlockException(c8230c, this, potentialDeadlockException.getConflictingStackTrace(), null));
                return;
            }
            ExampleStackTrace m39525c = c8230c.m39525c(this, Sets.newIdentityHashSet());
            if (m39525c == null) {
                this.f54327a.put(c8230c, new ExampleStackTrace(c8230c, this));
                return;
            }
            PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(c8230c, this, m39525c, null);
            this.f54328b.put(c8230c, potentialDeadlockException2);
            policy.handlePotentialDeadlock(potentialDeadlockException2);
        }

        /* renamed from: b */
        public void m39526b(Policy policy, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m39527a(policy, (C8230c) it.next());
            }
        }

        /* renamed from: c */
        public final ExampleStackTrace m39525c(C8230c c8230c, Set set) {
            if (!set.add(this)) {
                return null;
            }
            ExampleStackTrace exampleStackTrace = (ExampleStackTrace) this.f54327a.get(c8230c);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (Map.Entry entry : this.f54327a.entrySet()) {
                C8230c c8230c2 = (C8230c) entry.getKey();
                ExampleStackTrace m39525c = c8230c2.m39525c(c8230c, set);
                if (m39525c != null) {
                    ExampleStackTrace exampleStackTrace2 = new ExampleStackTrace(c8230c2, this);
                    exampleStackTrace2.setStackTrace(((ExampleStackTrace) entry.getValue()).getStackTrace());
                    exampleStackTrace2.initCause(m39525c);
                    return exampleStackTrace2;
                }
            }
            return null;
        }

        /* renamed from: d */
        public String m39524d() {
            return this.f54329c;
        }
    }

    public /* synthetic */ CycleDetectingLockFactory(Policy policy, C8228a c8228a) {
        this(policy);
    }

    /* renamed from: e */
    public static Map m39532e(Class cls) {
        EnumMap newEnumMap = Maps.newEnumMap(cls);
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(length);
        int i = 0;
        for (Enum r6 : enumArr) {
            C8230c c8230c = new C8230c(m39531f(r6));
            newArrayListWithCapacity.add(c8230c);
            newEnumMap.put((EnumMap) r6, (Enum) c8230c);
        }
        for (int i2 = 1; i2 < length; i2++) {
            ((C8230c) newArrayListWithCapacity.get(i2)).m39526b(Policies.THROW, newArrayListWithCapacity.subList(0, i2));
        }
        while (i < length - 1) {
            i++;
            ((C8230c) newArrayListWithCapacity.get(i)).m39526b(Policies.DISABLED, newArrayListWithCapacity.subList(i, length));
        }
        return Collections.unmodifiableMap(newEnumMap);
    }

    /* renamed from: f */
    public static String m39531f(Enum r2) {
        return r2.getDeclaringClass().getSimpleName() + "." + r2.name();
    }

    /* renamed from: g */
    public static Map m39530g(Class cls) {
        ConcurrentMap concurrentMap = f54322b;
        Map map = (Map) concurrentMap.get(cls);
        if (map != null) {
            return map;
        }
        Map m39532e = m39532e(cls);
        return (Map) MoreObjects.firstNonNull((Map) concurrentMap.putIfAbsent(cls, m39532e), m39532e);
    }

    /* renamed from: h */
    public static void m39529h(InterfaceC8229b interfaceC8229b) {
        if (!interfaceC8229b.isAcquiredByCurrentThread()) {
            ArrayList arrayList = (ArrayList) f54324d.get();
            Objects.requireNonNull(arrayList);
            C8230c lockGraphNode = interfaceC8229b.getLockGraphNode();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == lockGraphNode) {
                    arrayList.remove(size);
                    return;
                }
            }
        }
    }

    public static CycleDetectingLockFactory newInstance(Policy policy) {
        return new CycleDetectingLockFactory(policy);
    }

    public static <E extends Enum<E>> WithExplicitOrdering<E> newInstanceWithExplicitOrdering(Class<E> cls, Policy policy) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(policy);
        return new WithExplicitOrdering<>(policy, m39530g(cls));
    }

    /* renamed from: a */
    public final void m39536a(InterfaceC8229b interfaceC8229b) {
        if (!interfaceC8229b.isAcquiredByCurrentThread()) {
            ArrayList arrayList = (ArrayList) f54324d.get();
            Objects.requireNonNull(arrayList);
            C8230c lockGraphNode = interfaceC8229b.getLockGraphNode();
            lockGraphNode.m39526b(this.f54325a, arrayList);
            arrayList.add(lockGraphNode);
        }
    }

    public ReentrantLock newReentrantLock(String str) {
        return newReentrantLock(str, false);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str) {
        return newReentrantReadWriteLock(str, false);
    }

    public CycleDetectingLockFactory(Policy policy) {
        this.f54325a = (Policy) Preconditions.checkNotNull(policy);
    }

    public ReentrantLock newReentrantLock(String str, boolean z) {
        if (this.f54325a == Policies.DISABLED) {
            return new ReentrantLock(z);
        }
        return new CycleDetectingReentrantLock(this, new C8230c(str), z, null);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str, boolean z) {
        if (this.f54325a == Policies.DISABLED) {
            return new ReentrantReadWriteLock(z);
        }
        return new CycleDetectingReentrantReadWriteLock(this, new C8230c(str), z, null);
    }

    /* loaded from: classes4.dex */
    public class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {
        @Weak
        final CycleDetectingReentrantReadWriteLock readWriteLock;

        public CycleDetectingReentrantReadLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.m39536a(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m39529h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m39536a(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m39529h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m39536a(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m39529h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m39529h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m39536a(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m39529h(this.readWriteLock);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {
        @Weak
        final CycleDetectingReentrantReadWriteLock readWriteLock;

        public CycleDetectingReentrantWriteLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.m39536a(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m39529h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m39536a(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m39529h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m39536a(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m39529h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m39529h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m39536a(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m39529h(this.readWriteLock);
            }
        }
    }
}