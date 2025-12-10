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
    public static final ConcurrentMap f54310b = new MapMaker().weakKeys().makeMap();

    /* renamed from: c */
    public static final C23005xi0 f54311c = new C23005xi0(CycleDetectingLockFactory.class);

    /* renamed from: d */
    public static final ThreadLocal f54312d = new C8239a();

    /* renamed from: a */
    public final Policy f54313a;

    /* loaded from: classes4.dex */
    public final class CycleDetectingReentrantLock extends ReentrantLock implements InterfaceC8240b {
        private final C8241c lockGraphNode;

        public /* synthetic */ CycleDetectingReentrantLock(CycleDetectingLockFactory cycleDetectingLockFactory, C8241c c8241c, boolean z, C8239a c8239a) {
            this(c8241c, z);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC8240b
        public C8241c getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC8240b
        public boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.m39544a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m39537h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m39544a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m39537h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m39544a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m39537h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m39537h(this);
            }
        }

        private CycleDetectingReentrantLock(C8241c c8241c, boolean z) {
            super(z);
            this.lockGraphNode = (C8241c) Preconditions.checkNotNull(c8241c);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m39544a(this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m39537h(this);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements InterfaceC8240b {
        private final C8241c lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        private final CycleDetectingReentrantWriteLock writeLock;

        public /* synthetic */ CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, C8241c c8241c, boolean z, C8239a c8239a) {
            this(c8241c, z);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC8240b
        public C8241c getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.InterfaceC8240b
        public boolean isAcquiredByCurrentThread() {
            if (!isWriteLockedByCurrentThread() && getReadHoldCount() <= 0) {
                return false;
            }
            return true;
        }

        private CycleDetectingReentrantReadWriteLock(C8241c c8241c, boolean z) {
            super(z);
            this.readLock = new CycleDetectingReentrantReadLock(this);
            this.writeLock = new CycleDetectingReentrantWriteLock(this);
            this.lockGraphNode = (C8241c) Preconditions.checkNotNull(c8241c);
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
        static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.m40928of(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), C8241c.class.getName());

        public ExampleStackTrace(C8241c c8241c, C8241c c8241c2) {
            super(c8241c.m39532d() + " -> " + c8241c2.m39532d());
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
                CycleDetectingLockFactory.f54311c.m405a().log(Level.SEVERE, "Detected potential deadlock", (Throwable) potentialDeadlockException);
            }
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        };

        /* synthetic */ Policies(C8239a c8239a) {
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

        public /* synthetic */ PotentialDeadlockException(C8241c c8241c, C8241c c8241c2, ExampleStackTrace exampleStackTrace, C8239a c8239a) {
            this(c8241c, c8241c2, exampleStackTrace);
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

        private PotentialDeadlockException(C8241c c8241c, C8241c c8241c2, ExampleStackTrace exampleStackTrace) {
            super(c8241c, c8241c2);
            this.conflictingStackTrace = exampleStackTrace;
            initCause(exampleStackTrace);
        }
    }

    /* loaded from: classes4.dex */
    public static final class WithExplicitOrdering<E extends Enum<E>> extends CycleDetectingLockFactory {

        /* renamed from: e */
        public final Map f54314e;

        public WithExplicitOrdering(Policy policy, Map map) {
            super(policy, null);
            this.f54314e = map;
        }

        public ReentrantLock newReentrantLock(E e) {
            return newReentrantLock((WithExplicitOrdering<E>) e, false);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e) {
            return newReentrantReadWriteLock((WithExplicitOrdering<E>) e, false);
        }

        public ReentrantLock newReentrantLock(E e, boolean z) {
            if (this.f54313a == Policies.DISABLED) {
                return new ReentrantLock(z);
            }
            C8241c c8241c = (C8241c) this.f54314e.get(e);
            Objects.requireNonNull(c8241c);
            return new CycleDetectingReentrantLock(this, c8241c, z, null);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E e, boolean z) {
            if (this.f54313a == Policies.DISABLED) {
                return new ReentrantReadWriteLock(z);
            }
            C8241c c8241c = (C8241c) this.f54314e.get(e);
            Objects.requireNonNull(c8241c);
            return new CycleDetectingReentrantReadWriteLock(this, c8241c, z, null);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    /* loaded from: classes4.dex */
    public class C8239a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList initialValue() {
            return Lists.newArrayListWithCapacity(3);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8240b {
        C8241c getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$c */
    /* loaded from: classes4.dex */
    public static class C8241c {

        /* renamed from: a */
        public final Map f54315a = new MapMaker().weakKeys().makeMap();

        /* renamed from: b */
        public final Map f54316b = new MapMaker().weakKeys().makeMap();

        /* renamed from: c */
        public final String f54317c;

        public C8241c(String str) {
            this.f54317c = (String) Preconditions.checkNotNull(str);
        }

        /* renamed from: a */
        public void m39535a(Policy policy, C8241c c8241c) {
            boolean z;
            if (this != c8241c) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Attempted to acquire multiple locks with the same rank %s", c8241c.m39532d());
            if (this.f54315a.containsKey(c8241c)) {
                return;
            }
            PotentialDeadlockException potentialDeadlockException = (PotentialDeadlockException) this.f54316b.get(c8241c);
            if (potentialDeadlockException != null) {
                policy.handlePotentialDeadlock(new PotentialDeadlockException(c8241c, this, potentialDeadlockException.getConflictingStackTrace(), null));
                return;
            }
            ExampleStackTrace m39533c = c8241c.m39533c(this, Sets.newIdentityHashSet());
            if (m39533c == null) {
                this.f54315a.put(c8241c, new ExampleStackTrace(c8241c, this));
                return;
            }
            PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(c8241c, this, m39533c, null);
            this.f54316b.put(c8241c, potentialDeadlockException2);
            policy.handlePotentialDeadlock(potentialDeadlockException2);
        }

        /* renamed from: b */
        public void m39534b(Policy policy, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m39535a(policy, (C8241c) it.next());
            }
        }

        /* renamed from: c */
        public final ExampleStackTrace m39533c(C8241c c8241c, Set set) {
            if (!set.add(this)) {
                return null;
            }
            ExampleStackTrace exampleStackTrace = (ExampleStackTrace) this.f54315a.get(c8241c);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (Map.Entry entry : this.f54315a.entrySet()) {
                C8241c c8241c2 = (C8241c) entry.getKey();
                ExampleStackTrace m39533c = c8241c2.m39533c(c8241c, set);
                if (m39533c != null) {
                    ExampleStackTrace exampleStackTrace2 = new ExampleStackTrace(c8241c2, this);
                    exampleStackTrace2.setStackTrace(((ExampleStackTrace) entry.getValue()).getStackTrace());
                    exampleStackTrace2.initCause(m39533c);
                    return exampleStackTrace2;
                }
            }
            return null;
        }

        /* renamed from: d */
        public String m39532d() {
            return this.f54317c;
        }
    }

    public /* synthetic */ CycleDetectingLockFactory(Policy policy, C8239a c8239a) {
        this(policy);
    }

    /* renamed from: e */
    public static Map m39540e(Class cls) {
        EnumMap newEnumMap = Maps.newEnumMap(cls);
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(length);
        int i = 0;
        for (Enum r6 : enumArr) {
            C8241c c8241c = new C8241c(m39539f(r6));
            newArrayListWithCapacity.add(c8241c);
            newEnumMap.put((EnumMap) r6, (Enum) c8241c);
        }
        for (int i2 = 1; i2 < length; i2++) {
            ((C8241c) newArrayListWithCapacity.get(i2)).m39534b(Policies.THROW, newArrayListWithCapacity.subList(0, i2));
        }
        while (i < length - 1) {
            i++;
            ((C8241c) newArrayListWithCapacity.get(i)).m39534b(Policies.DISABLED, newArrayListWithCapacity.subList(i, length));
        }
        return Collections.unmodifiableMap(newEnumMap);
    }

    /* renamed from: f */
    public static String m39539f(Enum r2) {
        return r2.getDeclaringClass().getSimpleName() + "." + r2.name();
    }

    /* renamed from: g */
    public static Map m39538g(Class cls) {
        ConcurrentMap concurrentMap = f54310b;
        Map map = (Map) concurrentMap.get(cls);
        if (map != null) {
            return map;
        }
        Map m39540e = m39540e(cls);
        return (Map) MoreObjects.firstNonNull((Map) concurrentMap.putIfAbsent(cls, m39540e), m39540e);
    }

    /* renamed from: h */
    public static void m39537h(InterfaceC8240b interfaceC8240b) {
        if (!interfaceC8240b.isAcquiredByCurrentThread()) {
            ArrayList arrayList = (ArrayList) f54312d.get();
            Objects.requireNonNull(arrayList);
            C8241c lockGraphNode = interfaceC8240b.getLockGraphNode();
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
        return new WithExplicitOrdering<>(policy, m39538g(cls));
    }

    /* renamed from: a */
    public final void m39544a(InterfaceC8240b interfaceC8240b) {
        if (!interfaceC8240b.isAcquiredByCurrentThread()) {
            ArrayList arrayList = (ArrayList) f54312d.get();
            Objects.requireNonNull(arrayList);
            C8241c lockGraphNode = interfaceC8240b.getLockGraphNode();
            lockGraphNode.m39534b(this.f54313a, arrayList);
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
        this.f54313a = (Policy) Preconditions.checkNotNull(policy);
    }

    public ReentrantLock newReentrantLock(String str, boolean z) {
        if (this.f54313a == Policies.DISABLED) {
            return new ReentrantLock(z);
        }
        return new CycleDetectingReentrantLock(this, new C8241c(str), z, null);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str, boolean z) {
        if (this.f54313a == Policies.DISABLED) {
            return new ReentrantReadWriteLock(z);
        }
        return new CycleDetectingReentrantReadWriteLock(this, new C8241c(str), z, null);
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
            CycleDetectingLockFactory.this.m39544a(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m39537h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m39544a(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m39537h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m39544a(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m39537h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m39537h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m39544a(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m39537h(this.readWriteLock);
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
            CycleDetectingLockFactory.this.m39544a(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m39537h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.m39544a(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m39537h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.m39544a(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m39537h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m39537h(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.m39544a(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m39537h(this.readWriteLock);
            }
        }
    }
}
