package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.annotation.CheckForNull;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Iterators {

    /* loaded from: classes4.dex */
    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            AbstractC5406bs.m51811e(false);
        }
    }

    /* renamed from: com.google.common.collect.Iterators$a */
    /* loaded from: classes4.dex */
    public class C7656a implements Enumeration {

        /* renamed from: a */
        public final /* synthetic */ Iterator f53226a;

        public C7656a(Iterator it) {
            this.f53226a = it;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f53226a.hasNext();
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            return this.f53226a.next();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$b */
    /* loaded from: classes4.dex */
    public class C7657b extends UnmodifiableIterator {

        /* renamed from: a */
        public final /* synthetic */ Iterator f53227a;

        public C7657b(Iterator it) {
            this.f53227a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53227a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f53227a.next();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$c */
    /* loaded from: classes4.dex */
    public class C7658c implements Iterator {

        /* renamed from: a */
        public Iterator f53228a = Iterators.m40837g();

        /* renamed from: b */
        public final /* synthetic */ Iterable f53229b;

        public C7658c(Iterable iterable) {
            this.f53229b = iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f53228a.hasNext() && !this.f53229b.iterator().hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f53228a.hasNext()) {
                Iterator it = this.f53229b.iterator();
                this.f53228a = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.f53228a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f53228a.remove();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$d */
    /* loaded from: classes4.dex */
    public class C7659d extends UnmodifiableIterator {

        /* renamed from: a */
        public int f53230a = 0;

        /* renamed from: b */
        public final /* synthetic */ Iterator[] f53231b;

        public C7659d(Iterator[] itArr) {
            this.f53231b = itArr;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Iterator next() {
            if (hasNext()) {
                Iterator it = this.f53231b[this.f53230a];
                Objects.requireNonNull(it);
                Iterator it2 = it;
                Iterator[] itArr = this.f53231b;
                int i = this.f53230a;
                itArr[i] = null;
                this.f53230a = i + 1;
                return it2;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53230a < this.f53231b.length) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.Iterators$e */
    /* loaded from: classes4.dex */
    public class C7660e extends UnmodifiableIterator {

        /* renamed from: a */
        public final /* synthetic */ Iterator f53232a;

        /* renamed from: b */
        public final /* synthetic */ int f53233b;

        /* renamed from: c */
        public final /* synthetic */ boolean f53234c;

        public C7660e(Iterator it, int i, boolean z) {
            this.f53232a = it;
            this.f53233b = i;
            this.f53234c = z;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public List next() {
            if (hasNext()) {
                Object[] objArr = new Object[this.f53233b];
                int i = 0;
                while (i < this.f53233b && this.f53232a.hasNext()) {
                    objArr[i] = this.f53232a.next();
                    i++;
                }
                for (int i2 = i; i2 < this.f53233b; i2++) {
                    objArr[i2] = null;
                }
                List unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                if (!this.f53234c && i != this.f53233b) {
                    return unmodifiableList.subList(0, i);
                }
                return unmodifiableList;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53232a.hasNext();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$f */
    /* loaded from: classes4.dex */
    public class C7661f extends AbstractIterator {

        /* renamed from: c */
        public final /* synthetic */ Iterator f53235c;

        /* renamed from: d */
        public final /* synthetic */ Predicate f53236d;

        public C7661f(Iterator it, Predicate predicate) {
            this.f53235c = it;
            this.f53236d = predicate;
        }

        @Override // com.google.common.collect.AbstractIterator
        public Object computeNext() {
            while (this.f53235c.hasNext()) {
                Object next = this.f53235c.next();
                if (this.f53236d.apply(next)) {
                    return next;
                }
            }
            return endOfData();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$g */
    /* loaded from: classes4.dex */
    public class C7662g extends YU1 {

        /* renamed from: b */
        public final /* synthetic */ Function f53237b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7662g(Iterator it, Function function) {
            super(it);
            this.f53237b = function;
        }

        @Override // p000.YU1
        /* renamed from: a */
        public Object mo40369a(Object obj) {
            return this.f53237b.apply(obj);
        }
    }

    /* renamed from: com.google.common.collect.Iterators$h */
    /* loaded from: classes4.dex */
    public class C7663h implements Iterator {

        /* renamed from: a */
        public int f53238a;

        /* renamed from: b */
        public final /* synthetic */ int f53239b;

        /* renamed from: c */
        public final /* synthetic */ Iterator f53240c;

        public C7663h(int i, Iterator it) {
            this.f53239b = i;
            this.f53240c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53238a < this.f53239b && this.f53240c.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                this.f53238a++;
                return this.f53240c.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f53240c.remove();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$i */
    /* loaded from: classes4.dex */
    public class C7664i extends UnmodifiableIterator {

        /* renamed from: a */
        public final /* synthetic */ Iterator f53241a;

        public C7664i(Iterator it) {
            this.f53241a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53241a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Object next = this.f53241a.next();
            this.f53241a.remove();
            return next;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* renamed from: com.google.common.collect.Iterators$j */
    /* loaded from: classes4.dex */
    public class C7665j extends UnmodifiableIterator {

        /* renamed from: a */
        public final /* synthetic */ Enumeration f53242a;

        public C7665j(Enumeration enumeration) {
            this.f53242a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53242a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f53242a.nextElement();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$k */
    /* loaded from: classes4.dex */
    public static final class C7666k extends AbstractC1139Q {

        /* renamed from: d */
        public static final UnmodifiableListIterator f53243d = new C7666k(new Object[0], 0);

        /* renamed from: c */
        public final Object[] f53244c;

        public C7666k(Object[] objArr, int i) {
            super(objArr.length, i);
            this.f53244c = objArr;
        }

        @Override // p000.AbstractC1139Q
        /* renamed from: a */
        public Object mo40539a(int i) {
            return this.f53244c[i];
        }
    }

    /* renamed from: com.google.common.collect.Iterators$l */
    /* loaded from: classes4.dex */
    public static class C7667l implements Iterator {

        /* renamed from: a */
        public Iterator f53245a;

        /* renamed from: b */
        public Iterator f53246b = Iterators.m40839e();

        /* renamed from: c */
        public Iterator f53247c;

        /* renamed from: d */
        public Deque f53248d;

        public C7667l(Iterator it) {
            this.f53247c = (Iterator) Preconditions.checkNotNull(it);
        }

        /* renamed from: a */
        public final Iterator m40831a() {
            while (true) {
                Iterator it = this.f53247c;
                if (it != null && it.hasNext()) {
                    return this.f53247c;
                }
                Deque deque = this.f53248d;
                if (deque != null && !deque.isEmpty()) {
                    this.f53247c = (Iterator) this.f53248d.removeFirst();
                } else {
                    return null;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.f53246b)).hasNext()) {
                Iterator m40831a = m40831a();
                this.f53247c = m40831a;
                if (m40831a == null) {
                    return false;
                }
                Iterator it = (Iterator) m40831a.next();
                this.f53246b = it;
                if (it instanceof C7667l) {
                    C7667l c7667l = (C7667l) it;
                    this.f53246b = c7667l.f53246b;
                    if (this.f53248d == null) {
                        this.f53248d = new ArrayDeque();
                    }
                    this.f53248d.addFirst(this.f53247c);
                    if (c7667l.f53248d != null) {
                        while (!c7667l.f53248d.isEmpty()) {
                            this.f53248d.addFirst((Iterator) c7667l.f53248d.removeLast());
                        }
                    }
                    this.f53247c = c7667l.f53247c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Iterator it = this.f53246b;
                this.f53245a = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator it = this.f53245a;
            if (it != null) {
                it.remove();
                this.f53245a = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    /* renamed from: com.google.common.collect.Iterators$m */
    /* loaded from: classes4.dex */
    public static class C7668m extends UnmodifiableIterator {

        /* renamed from: a */
        public final Queue f53249a;

        public C7668m(Iterable iterable, final Comparator comparator) {
            this.f53249a = new PriorityQueue(2, new Comparator() { // from class: yg0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m40829b;
                    m40829b = Iterators.C7668m.m40829b(comparator, (PeekingIterator) obj, (PeekingIterator) obj2);
                    return m40829b;
                }
            });
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Iterator it2 = (Iterator) it.next();
                if (it2.hasNext()) {
                    this.f53249a.add(Iterators.peekingIterator(it2));
                }
            }
        }

        /* renamed from: b */
        public static /* synthetic */ int m40829b(Comparator comparator, PeekingIterator peekingIterator, PeekingIterator peekingIterator2) {
            return comparator.compare(peekingIterator.peek(), peekingIterator2.peek());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f53249a.isEmpty();
        }

        @Override // java.util.Iterator
        public Object next() {
            PeekingIterator peekingIterator = (PeekingIterator) this.f53249a.remove();
            Object next = peekingIterator.next();
            if (peekingIterator.hasNext()) {
                this.f53249a.add(peekingIterator);
            }
            return next;
        }
    }

    /* renamed from: com.google.common.collect.Iterators$n */
    /* loaded from: classes4.dex */
    public static class C7669n implements PeekingIterator {

        /* renamed from: a */
        public final Iterator f53250a;

        /* renamed from: b */
        public boolean f53251b;

        /* renamed from: c */
        public Object f53252c;

        public C7669n(Iterator it) {
            this.f53250a = (Iterator) Preconditions.checkNotNull(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f53251b && !this.f53250a.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public Object next() {
            if (!this.f53251b) {
                return this.f53250a.next();
            }
            Object m25936a = AbstractC21396oJ0.m25936a(this.f53252c);
            this.f53251b = false;
            this.f53252c = null;
            return m25936a;
        }

        @Override // com.google.common.collect.PeekingIterator
        public Object peek() {
            if (!this.f53251b) {
                this.f53252c = this.f53250a.next();
                this.f53251b = true;
            }
            return AbstractC21396oJ0.m25936a(this.f53252c);
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.f53251b, "Can't remove after you've peeked at next");
            this.f53250a.remove();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$o */
    /* loaded from: classes4.dex */
    public static final class C7670o extends UnmodifiableIterator {

        /* renamed from: a */
        public final Object f53253a;

        /* renamed from: b */
        public boolean f53254b;

        public C7670o(Object obj) {
            this.f53253a = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f53254b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f53254b) {
                this.f53254b = true;
                return this.f53253a;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    public static void m40843a(int i) {
        if (i >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + i + ") must not be negative");
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static int advance(Iterator<?> it, int i) {
        boolean z;
        Preconditions.checkNotNull(it);
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static <T> boolean all(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            if (!predicate.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it, Predicate<? super T> predicate) {
        if (indexOf(it, predicate) != -1) {
            return true;
        }
        return false;
    }

    public static <T> Enumeration<T> asEnumeration(Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new C7656a(it);
    }

    /* renamed from: b */
    public static void m40842b(Iterator it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: c */
    public static Iterator m40841c(Iterator... itArr) {
        for (Iterator it : (Iterator[]) Preconditions.checkNotNull(itArr)) {
            Preconditions.checkNotNull(it);
        }
        return concat(m40840d(itArr));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        return concat(m40840d(it, it2));
    }

    public static <T> Iterator<T> consumingIterator(Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new C7664i(it);
    }

    public static boolean contains(Iterator<?> it, @CheckForNull Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new C7658c(iterable);
    }

    /* renamed from: d */
    public static Iterator m40840d(Iterator... itArr) {
        return new C7659d(itArr);
    }

    /* renamed from: e */
    public static UnmodifiableIterator m40839e() {
        return m40838f();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean elementsEqual(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.google.common.base.Objects.equal(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Iterators.elementsEqual(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: f */
    public static UnmodifiableListIterator m40838f() {
        return C7666k.f53243d;
    }

    public static <T> UnmodifiableIterator<T> filter(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        return new C7661f(it, predicate);
    }

    public static <T> T find(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... tArr) {
        return m40836h(tArr, 0);
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new C7665j(enumeration);
    }

    public static int frequency(Iterator<?> it, @CheckForNull Object obj) {
        int i = 0;
        while (contains(it, obj)) {
            i++;
        }
        return i;
    }

    /* renamed from: g */
    public static Iterator m40837g() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> T get(Iterator<T> it, int i) {
        m40843a(i);
        int advance = advance(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException("position (" + i + ") must be less than the number of elements that remained (" + advance + ")");
    }

    public static <T> T getLast(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T getNext(Iterator<? extends T> it, T t) {
        if (it.hasNext()) {
            return it.next();
        }
        return t;
    }

    public static <T> T getOnlyElement(Iterator<T> it) {
        T next = it.next();
        if (it.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append("expected one element but was: <");
            sb.append(next);
            for (int i = 0; i < 4 && it.hasNext(); i++) {
                sb.append(", ");
                sb.append(it.next());
            }
            if (it.hasNext()) {
                sb.append(", ...");
            }
            sb.append(Typography.greater);
            throw new IllegalArgumentException(sb.toString());
        }
        return next;
    }

    /* renamed from: h */
    public static UnmodifiableListIterator m40836h(Object[] objArr, int i) {
        if (objArr.length == 0) {
            Preconditions.checkPositionIndex(i, objArr.length);
            return m40838f();
        }
        return new C7666k(objArr, i);
    }

    /* renamed from: i */
    public static UnmodifiableIterator m40835i(Iterator it, int i, boolean z) {
        boolean z2;
        Preconditions.checkNotNull(it);
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        return new C7660e(it, i, z);
    }

    public static <T> int indexOf(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: j */
    public static Object m40834j(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static <T> Iterator<T> limit(Iterator<T> it, int i) {
        boolean z;
        Preconditions.checkNotNull(it);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "limit is negative");
        return new C7663h(i, it);
    }

    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterable, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new C7668m(iterable, comparator);
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it, int i) {
        return m40835i(it, i, true);
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it, int i) {
        return m40835i(it, i, false);
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it) {
        if (it instanceof C7669n) {
            return (C7669n) it;
        }
        return new C7669n(it);
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(T t) {
        return new C7670o(t);
    }

    public static int size(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return Ints.saturatedCast(j);
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) Iterables.toArray(Lists.newArrayList(it), cls);
    }

    public static String toString(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new C7662g(it, function);
    }

    public static <T> Optional<T> tryFind(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return Optional.m41313of(next);
            }
        }
        return Optional.absent();
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(Iterator<? extends T> it) {
        Preconditions.checkNotNull(it);
        if (it instanceof UnmodifiableIterator) {
            return (UnmodifiableIterator) it;
        }
        return new C7657b(it);
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    public static <T> T getLast(Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) getLast(it) : t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        return concat(m40840d(it, it2, it3));
    }

    @GwtIncompatible
    public static <T> UnmodifiableIterator<T> filter(Iterator<?> it, Class<T> cls) {
        return filter(it, Predicates.instanceOf(cls));
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> peekingIterator) {
        return (PeekingIterator) Preconditions.checkNotNull(peekingIterator);
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> unmodifiableIterator) {
        return (UnmodifiableIterator) Preconditions.checkNotNull(unmodifiableIterator);
    }

    public static <T> T get(Iterator<? extends T> it, int i, T t) {
        m40843a(i);
        advance(it, i);
        return (T) getNext(it, t);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @CheckForNull
    public static <T> T find(Iterator<? extends T> it, Predicate<? super T> predicate, @CheckForNull T t) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        Preconditions.checkNotNull(it4);
        return concat(m40840d(it, it2, it3, it4));
    }

    public static <T> T getOnlyElement(Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) getOnlyElement(it) : t;
    }

    @SafeVarargs
    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return m40841c((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it) {
        return new C7667l(it);
    }
}
