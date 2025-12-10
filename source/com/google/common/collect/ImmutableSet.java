package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: classes4.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    private static final long serialVersionUID = 912559;
    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableList<E> asList;

    /* loaded from: classes4.dex */
    public static class Builder<E> extends ImmutableCollection.AbstractC7620a {

        /* renamed from: d */
        public Object[] f53187d;

        /* renamed from: e */
        public int f53188e;

        public Builder() {
            super(4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.AbstractC7620a, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.AbstractC7620a add(Object obj) {
            return add((Builder<E>) obj);
        }

        /* renamed from: d */
        public final void m40924d(Object obj) {
            Objects.requireNonNull(this.f53187d);
            int length = this.f53187d.length - 1;
            int hashCode = obj.hashCode();
            int m903c = AbstractC22736w70.m903c(hashCode);
            while (true) {
                int i = m903c & length;
                Object[] objArr = this.f53187d;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    objArr[i] = obj;
                    this.f53188e += hashCode;
                    super.add(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    m903c = i + 1;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public Builder mo40855e(Builder builder) {
            if (this.f53187d != null) {
                for (int i = 0; i < builder.f53140b; i++) {
                    Object obj = builder.f53139a[i];
                    Objects.requireNonNull(obj);
                    add((Builder<E>) obj);
                }
            } else {
                m41000b(builder.f53139a, builder.f53140b);
            }
            return this;
        }

        public Builder(int i, boolean z) {
            super(i);
            if (z) {
                this.f53187d = new Object[ImmutableSet.chooseTableSize(i)];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.AbstractC7620a, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
            ImmutableSet<E> construct;
            int i = this.f53140b;
            if (i != 0) {
                if (i != 1) {
                    if (this.f53187d == null || ImmutableSet.chooseTableSize(i) != this.f53187d.length) {
                        construct = ImmutableSet.construct(this.f53140b, this.f53139a);
                        this.f53140b = construct.size();
                    } else {
                        Object[] copyOf = ImmutableSet.shouldTrim(this.f53140b, this.f53139a.length) ? Arrays.copyOf(this.f53139a, this.f53140b) : this.f53139a;
                        int i2 = this.f53188e;
                        Object[] objArr = this.f53187d;
                        construct = new RegularImmutableSet<>(copyOf, i2, objArr, objArr.length - 1, this.f53140b);
                    }
                    this.f53141c = true;
                    this.f53187d = null;
                    return construct;
                }
                Object obj = this.f53139a[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.m40930of(obj);
            }
            return ImmutableSet.m40931of();
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC7620a, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.f53187d != null) {
                for (E e : iterable) {
                    add((Builder<E>) e);
                }
            } else {
                super.addAll((Iterable) iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC7620a, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e) {
            Preconditions.checkNotNull(e);
            if (this.f53187d != null && ImmutableSet.chooseTableSize(this.f53140b) <= this.f53187d.length) {
                m40924d(e);
                return this;
            }
            this.f53187d = null;
            super.add((Object) e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            Preconditions.checkNotNull(it);
            while (it.hasNext()) {
                add((Builder<E>) it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC7620a, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            if (this.f53187d != null) {
                for (E e : eArr) {
                    add((Builder<E>) e);
                }
            } else {
                super.add((Object[]) eArr);
            }
            return this;
        }
    }

    @J2ktIncompatible
    /* loaded from: classes4.dex */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int i) {
        AbstractC5406bs.m51814b(i, "expectedSize");
        return new Builder<>(i, true);
    }

    @VisibleForTesting
    public static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < CUTOFF) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * DESIRED_LOAD_FACTOR < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        Preconditions.checkArgument(z, "collection too large");
        return 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> construct(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int chooseTableSize = chooseTableSize(i);
                Object[] objArr2 = new Object[chooseTableSize];
                int i2 = chooseTableSize - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object m40560a = ObjectArrays.m40560a(objArr[i5], i5);
                    int hashCode = m40560a.hashCode();
                    int m903c = AbstractC22736w70.m903c(hashCode);
                    while (true) {
                        int i6 = m903c & i2;
                        Object obj = objArr2[i6];
                        if (obj == null) {
                            objArr[i4] = m40560a;
                            objArr2[i6] = m40560a;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj.equals(m40560a)) {
                            break;
                        } else {
                            m903c++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new SingletonImmutableSet(obj2);
                } else if (chooseTableSize(i4) < chooseTableSize / 2) {
                    return construct(i4, objArr);
                } else {
                    if (shouldTrim(i4, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
                }
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return m40930of(obj3);
        }
        return m40931of();
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m40931of() {
        return RegularImmutableSet.EMPTY;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return AbstractC7963f.m40299u0();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList == null) {
            ImmutableList<E> createAsList = createAsList();
            this.asList = createAsList;
            return createAsList;
        }
        return immutableList;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.m40548a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.m40547b(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract UnmodifiableIterator<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m40930of(E e) {
        return new SingletonImmutableSet(e);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m40929of(E e, E e2) {
        return construct(2, e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m40928of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m40927of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m40926of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> ImmutableSet<E> m40925of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m40931of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return m40930of((Object) next);
        }
        return new Builder().add((Builder) next).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return construct(eArr.length, (Object[]) eArr.clone());
            }
            return m40930of((Object) eArr[0]);
        }
        return m40931of();
    }
}
