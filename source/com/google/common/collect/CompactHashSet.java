package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtIncompatible
/* loaded from: classes4.dex */
public class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    @VisibleForTesting
    @CheckForNull
    transient Object[] elements;
    @CheckForNull
    private transient int[] entries;
    private transient int metadata;
    private transient int size;
    @CheckForNull
    private transient Object table;

    /* renamed from: com.google.common.collect.CompactHashSet$a */
    /* loaded from: classes4.dex */
    public class C7589a implements Iterator {

        /* renamed from: a */
        public int f53077a;

        /* renamed from: b */
        public int f53078b;

        /* renamed from: c */
        public int f53079c = -1;

        public C7589a() {
            this.f53077a = CompactHashSet.this.metadata;
            this.f53078b = CompactHashSet.this.firstEntryIndex();
        }

        /* renamed from: a */
        public final void m41045a() {
            if (CompactHashSet.this.metadata == this.f53077a) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public void m41044b() {
            this.f53077a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53078b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            m41045a();
            if (hasNext()) {
                int i = this.f53078b;
                this.f53079c = i;
                Object element = CompactHashSet.this.element(i);
                this.f53078b = CompactHashSet.this.getSuccessor(this.f53078b);
                return element;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            m41045a();
            if (this.f53079c >= 0) {
                z = true;
            } else {
                z = false;
            }
            AbstractC5406bs.m51811e(z);
            m41044b();
            CompactHashSet compactHashSet = CompactHashSet.this;
            compactHashSet.remove(compactHashSet.element(this.f53079c));
            this.f53078b = CompactHashSet.this.adjustAfterRemove(this.f53078b, this.f53079c);
            this.f53079c = -1;
        }
    }

    public CompactHashSet() {
        init(3);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    private Set<E> createHashFloodingResistantDelegate(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i) {
        return new CompactHashSet<>(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E element(int i) {
        return (E) requireElements()[i];
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + readInt);
    }

    private Object[] requireElements() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object requireTable() {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void resizeMeMaybe(int i) {
        int min;
        int length = requireEntries().length;
        if (i > length && (min = Math.min((int) LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(min);
        }
    }

    @CanIgnoreReturnValue
    private int resizeTable(int i, int i2, int i3, int i4) {
        Object m29030a = AbstractC11608ju.m29030a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AbstractC11608ju.m29022i(m29030a, i3 & i5, i4 + 1);
        }
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int m29023h = AbstractC11608ju.m29023h(requireTable, i6);
            while (m29023h != 0) {
                int i7 = m29023h - 1;
                int i8 = requireEntries[i7];
                int m29029b = AbstractC11608ju.m29029b(i8, i) | i6;
                int i9 = m29029b & i5;
                int m29023h2 = AbstractC11608ju.m29023h(m29030a, i9);
                AbstractC11608ju.m29022i(m29030a, i9, m29023h);
                requireEntries[i7] = AbstractC11608ju.m29027d(m29029b, m29023h2, i5);
                m29023h = AbstractC11608ju.m29028c(i8, i);
            }
        }
        this.table = m29030a;
        setHashTableMask(i5);
        return i5;
    }

    private void setElement(int i, E e) {
        requireElements()[i] = e;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = AbstractC11608ju.m29027d(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    @J2ktIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(E e) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.add(e);
        }
        int[] requireEntries = requireEntries();
        Object[] requireElements = requireElements();
        int i = this.size;
        int i2 = i + 1;
        int m902d = AbstractC22736w70.m902d(e);
        int hashTableMask = hashTableMask();
        int i3 = m902d & hashTableMask;
        int m29023h = AbstractC11608ju.m29023h(requireTable(), i3);
        if (m29023h == 0) {
            if (i2 > hashTableMask) {
                hashTableMask = resizeTable(hashTableMask, AbstractC11608ju.m29026e(hashTableMask), m902d, i);
            } else {
                AbstractC11608ju.m29022i(requireTable(), i3, i2);
            }
        } else {
            int m29029b = AbstractC11608ju.m29029b(m902d, hashTableMask);
            int i4 = 0;
            while (true) {
                int i5 = m29023h - 1;
                int i6 = requireEntries[i5];
                if (AbstractC11608ju.m29029b(i6, hashTableMask) == m29029b && com.google.common.base.Objects.equal(e, requireElements[i5])) {
                    return false;
                }
                int m29028c = AbstractC11608ju.m29028c(i6, hashTableMask);
                i4++;
                if (m29028c == 0) {
                    if (i4 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(e);
                    }
                    if (i2 > hashTableMask) {
                        hashTableMask = resizeTable(hashTableMask, AbstractC11608ju.m29026e(hashTableMask), m902d, i);
                    } else {
                        requireEntries[i5] = AbstractC11608ju.m29027d(i6, i2, hashTableMask);
                    }
                } else {
                    m29023h = m29028c;
                }
            }
        }
        resizeMeMaybe(i2);
        insertEntry(i, e, m902d, hashTableMask);
        this.size = i2;
        incrementModCount();
        return true;
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int m29021j = AbstractC11608ju.m29021j(i);
        this.table = AbstractC11608ju.m29030a(m29021j);
        setHashTableMask(m29021j - 1);
        this.entries = new int[i];
        this.elements = new Object[i];
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            delegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireElements(), 0, this.size, (Object) null);
        AbstractC11608ju.m29024g(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.contains(obj);
        }
        int m902d = AbstractC22736w70.m902d(obj);
        int hashTableMask = hashTableMask();
        int m29023h = AbstractC11608ju.m29023h(requireTable(), m902d & hashTableMask);
        if (m29023h == 0) {
            return false;
        }
        int m29029b = AbstractC11608ju.m29029b(m902d, hashTableMask);
        do {
            int i = m29023h - 1;
            int entry = entry(i);
            if (AbstractC11608ju.m29029b(entry, hashTableMask) == m29029b && com.google.common.base.Objects.equal(obj, element(i))) {
                return true;
            }
            m29023h = AbstractC11608ju.m29028c(entry, hashTableMask);
        } while (m29023h != 0);
        return false;
    }

    @CanIgnoreReturnValue
    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.add(element(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    @VisibleForTesting
    @CheckForNull
    public Set<E> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 >= this.size) {
            return -1;
        }
        return i2;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public void init(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Expected size must be >= 0");
        this.metadata = Ints.constrainToRange(i, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public void insertEntry(int i, E e, int i2, int i3) {
        setEntry(i, AbstractC11608ju.m29027d(i2, 0, i3));
        setElement(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public boolean isUsingHashFloodingResistance() {
        if (delegateOrNull() != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.iterator();
        }
        return new C7589a();
    }

    public void moveLastEntry(int i, int i2) {
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireElements = requireElements();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj = requireElements[i3];
            requireElements[i] = obj;
            requireElements[i3] = null;
            requireEntries[i] = requireEntries[i3];
            requireEntries[i3] = 0;
            int m902d = AbstractC22736w70.m902d(obj) & i2;
            int m29023h = AbstractC11608ju.m29023h(requireTable, m902d);
            if (m29023h == size) {
                AbstractC11608ju.m29022i(requireTable, m902d, i + 1);
                return;
            }
            while (true) {
                int i4 = m29023h - 1;
                int i5 = requireEntries[i4];
                int m29028c = AbstractC11608ju.m29028c(i5, i2);
                if (m29028c == size) {
                    requireEntries[i4] = AbstractC11608ju.m29027d(i5, i + 1, i2);
                    return;
                }
                m29023h = m29028c;
            }
        } else {
            requireElements[i] = null;
            requireEntries[i] = 0;
        }
    }

    public boolean needsAllocArrays() {
        if (this.table == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        int hashTableMask = hashTableMask();
        int m29025f = AbstractC11608ju.m29025f(obj, null, hashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (m29025f == -1) {
            return false;
        }
        moveLastEntry(m29025f, hashTableMask);
        this.size--;
        incrementModCount();
        return true;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.elements = Arrays.copyOf(requireElements(), i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set<E> delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.toArray() : Arrays.copyOf(requireElements(), this.size);
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            Set<E> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            createHashFloodingResistantDelegate.addAll(delegateOrNull);
            this.table = createHashFloodingResistantDelegate;
            return;
        }
        int i = this.size;
        if (i < requireEntries().length) {
            resizeEntries(i);
        }
        int m29021j = AbstractC11608ju.m29021j(i);
        int hashTableMask = hashTableMask();
        if (m29021j < hashTableMask) {
            resizeTable(hashTableMask, m29021j, 0, 0);
        }
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(collection.size());
        createWithExpectedSize.addAll(collection);
        return createWithExpectedSize;
    }

    public CompactHashSet(int i) {
        init(i);
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(createWithExpectedSize, eArr);
        return createWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (needsAllocArrays()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return (T[]) delegateOrNull.toArray(tArr);
        }
        return (T[]) ObjectArrays.m40554g(requireElements(), 0, this.size, tArr);
    }
}
