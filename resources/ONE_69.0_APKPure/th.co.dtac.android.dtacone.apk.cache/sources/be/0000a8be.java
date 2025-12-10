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
    public class C7578a implements Iterator {

        /* renamed from: a */
        public int f53089a;

        /* renamed from: b */
        public int f53090b;

        /* renamed from: c */
        public int f53091c = -1;

        public C7578a() {
            this.f53089a = CompactHashSet.this.metadata;
            this.f53090b = CompactHashSet.this.firstEntryIndex();
        }

        /* renamed from: a */
        public final void m41034a() {
            if (CompactHashSet.this.metadata == this.f53089a) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public void m41033b() {
            this.f53089a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53090b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            m41034a();
            if (hasNext()) {
                int i = this.f53090b;
                this.f53091c = i;
                Object element = CompactHashSet.this.element(i);
                this.f53090b = CompactHashSet.this.getSuccessor(this.f53090b);
                return element;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            m41034a();
            if (this.f53091c >= 0) {
                z = true;
            } else {
                z = false;
            }
            AbstractC5383bs.m51874e(z);
            m41033b();
            CompactHashSet compactHashSet = CompactHashSet.this;
            compactHashSet.remove(compactHashSet.element(this.f53091c));
            this.f53090b = CompactHashSet.this.adjustAfterRemove(this.f53090b, this.f53091c);
            this.f53091c = -1;
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
        Object m29323a = AbstractC11594ju.m29323a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AbstractC11594ju.m29315i(m29323a, i3 & i5, i4 + 1);
        }
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int m29316h = AbstractC11594ju.m29316h(requireTable, i6);
            while (m29316h != 0) {
                int i7 = m29316h - 1;
                int i8 = requireEntries[i7];
                int m29322b = AbstractC11594ju.m29322b(i8, i) | i6;
                int i9 = m29322b & i5;
                int m29316h2 = AbstractC11594ju.m29316h(m29323a, i9);
                AbstractC11594ju.m29315i(m29323a, i9, m29316h);
                requireEntries[i7] = AbstractC11594ju.m29320d(m29322b, m29316h2, i5);
                m29316h = AbstractC11594ju.m29321c(i8, i);
            }
        }
        this.table = m29323a;
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
        this.metadata = AbstractC11594ju.m29320d(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
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
        int m68994d = C70.m68994d(e);
        int hashTableMask = hashTableMask();
        int i3 = m68994d & hashTableMask;
        int m29316h = AbstractC11594ju.m29316h(requireTable(), i3);
        if (m29316h == 0) {
            if (i2 > hashTableMask) {
                hashTableMask = resizeTable(hashTableMask, AbstractC11594ju.m29319e(hashTableMask), m68994d, i);
            } else {
                AbstractC11594ju.m29315i(requireTable(), i3, i2);
            }
        } else {
            int m29322b = AbstractC11594ju.m29322b(m68994d, hashTableMask);
            int i4 = 0;
            while (true) {
                int i5 = m29316h - 1;
                int i6 = requireEntries[i5];
                if (AbstractC11594ju.m29322b(i6, hashTableMask) == m29322b && com.google.common.base.Objects.equal(e, requireElements[i5])) {
                    return false;
                }
                int m29321c = AbstractC11594ju.m29321c(i6, hashTableMask);
                i4++;
                if (m29321c == 0) {
                    if (i4 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(e);
                    }
                    if (i2 > hashTableMask) {
                        hashTableMask = resizeTable(hashTableMask, AbstractC11594ju.m29319e(hashTableMask), m68994d, i);
                    } else {
                        requireEntries[i5] = AbstractC11594ju.m29320d(i6, i2, hashTableMask);
                    }
                } else {
                    m29316h = m29321c;
                }
            }
        }
        resizeMeMaybe(i2);
        insertEntry(i, e, m68994d, hashTableMask);
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
        int m29314j = AbstractC11594ju.m29314j(i);
        this.table = AbstractC11594ju.m29323a(m29314j);
        setHashTableMask(m29314j - 1);
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
        AbstractC11594ju.m29317g(requireTable());
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
        int m68994d = C70.m68994d(obj);
        int hashTableMask = hashTableMask();
        int m29316h = AbstractC11594ju.m29316h(requireTable(), m68994d & hashTableMask);
        if (m29316h == 0) {
            return false;
        }
        int m29322b = AbstractC11594ju.m29322b(m68994d, hashTableMask);
        do {
            int i = m29316h - 1;
            int entry = entry(i);
            if (AbstractC11594ju.m29322b(entry, hashTableMask) == m29322b && com.google.common.base.Objects.equal(obj, element(i))) {
                return true;
            }
            m29316h = AbstractC11594ju.m29321c(entry, hashTableMask);
        } while (m29316h != 0);
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
        setEntry(i, AbstractC11594ju.m29320d(i2, 0, i3));
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
        return new C7578a();
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
            int m68994d = C70.m68994d(obj) & i2;
            int m29316h = AbstractC11594ju.m29316h(requireTable, m68994d);
            if (m29316h == size) {
                AbstractC11594ju.m29315i(requireTable, m68994d, i + 1);
                return;
            }
            while (true) {
                int i4 = m29316h - 1;
                int i5 = requireEntries[i4];
                int m29321c = AbstractC11594ju.m29321c(i5, i2);
                if (m29321c == size) {
                    requireEntries[i4] = AbstractC11594ju.m29320d(i5, i + 1, i2);
                    return;
                }
                m29316h = m29321c;
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
        int m29318f = AbstractC11594ju.m29318f(obj, null, hashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (m29318f == -1) {
            return false;
        }
        moveLastEntry(m29318f, hashTableMask);
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
        int m29314j = AbstractC11594ju.m29314j(i);
        int hashTableMask = hashTableMask();
        if (m29314j < hashTableMask) {
            resizeTable(hashTableMask, m29314j, 0, 0);
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
        return (T[]) ObjectArrays.m40543g(requireElements(), 0, this.size, tArr);
    }
}