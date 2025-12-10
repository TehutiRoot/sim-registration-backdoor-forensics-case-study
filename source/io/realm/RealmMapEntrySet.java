package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.util.Pair;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class RealmMapEntrySet implements Set {

    /* renamed from: a */
    public final BaseRealm f66614a;

    /* renamed from: b */
    public final OsMap f66615b;

    /* renamed from: c */
    public final IteratorType f66616c;

    /* renamed from: d */
    public final AbstractC0740KS f66617d;

    /* renamed from: e */
    public final AbstractC19706eW1 f66618e;

    /* loaded from: classes5.dex */
    public enum IteratorType {
        LONG,
        BYTE,
        SHORT,
        INTEGER,
        FLOAT,
        DOUBLE,
        STRING,
        BOOLEAN,
        DATE,
        DECIMAL128,
        BINARY,
        OBJECT_ID,
        UUID,
        MIXED,
        OBJECT
    }

    /* renamed from: io.realm.RealmMapEntrySet$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11263a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66619a;

        static {
            int[] iArr = new int[IteratorType.values().length];
            f66619a = iArr;
            try {
                iArr[IteratorType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66619a[IteratorType.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66619a[IteratorType.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66619a[IteratorType.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66619a[IteratorType.FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66619a[IteratorType.DOUBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66619a[IteratorType.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66619a[IteratorType.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66619a[IteratorType.DATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66619a[IteratorType.DECIMAL128.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66619a[IteratorType.BINARY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66619a[IteratorType.OBJECT_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f66619a[IteratorType.UUID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f66619a[IteratorType.MIXED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f66619a[IteratorType.OBJECT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$b */
    /* loaded from: classes5.dex */
    public static class C11264b extends AbstractC11270h {
        public C11264b(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (byte[]) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$c */
    /* loaded from: classes5.dex */
    public static class C11265c extends AbstractC11270h {
        public C11265c(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Boolean) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$d */
    /* loaded from: classes5.dex */
    public static class C11266d extends AbstractC11270h {
        public C11266d(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            Object obj = entryForPrimitive.second;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Byte.valueOf(((Long) obj).byteValue()));
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$e */
    /* loaded from: classes5.dex */
    public static class C11267e extends AbstractC11270h {
        public C11267e(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Date) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$f */
    /* loaded from: classes5.dex */
    public static class C11268f extends AbstractC11270h {
        public C11268f(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Decimal128) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$g */
    /* loaded from: classes5.dex */
    public static class C11269g extends AbstractC11270h {
        public C11269g(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Double) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$h */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11270h implements Iterator {

        /* renamed from: a */
        public final OsMap f66620a;

        /* renamed from: b */
        public final BaseRealm f66621b;

        /* renamed from: c */
        public int f66622c = -1;

        public AbstractC11270h(OsMap osMap, BaseRealm baseRealm) {
            this.f66620a = osMap;
            this.f66621b = baseRealm;
        }

        /* renamed from: a */
        public abstract Map.Entry mo29624a(int i);

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry next() {
            this.f66622c++;
            long size = this.f66620a.size();
            int i = this.f66622c;
            if (i < size) {
                return mo29624a(i);
            }
            throw new NoSuchElementException("Cannot access index " + this.f66622c + " when size is " + size + ". Remember to check hasNext() before using next().");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f66622c + 1 < this.f66620a.size()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$i */
    /* loaded from: classes5.dex */
    public static class C11271i extends AbstractC11270h {
        public C11271i(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Float) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$j */
    /* loaded from: classes5.dex */
    public static class C11272j extends AbstractC11270h {
        public C11272j(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            Object obj = entryForPrimitive.second;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Integer.valueOf(((Long) obj).intValue()));
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$k */
    /* loaded from: classes5.dex */
    public static class C11273k extends AbstractC11270h {
        public C11273k(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            Object obj = entryForPrimitive.second;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Long) obj);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$l */
    /* loaded from: classes5.dex */
    public static class C11274l extends AbstractC11270h {
        public C11274l(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (ObjectId) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$m */
    /* loaded from: classes5.dex */
    public static class C11275m extends AbstractC11270h {
        public C11275m(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair keyRealmAnyPair = this.f66620a.getKeyRealmAnyPair(i);
            return new AbstractMap.SimpleImmutableEntry(keyRealmAnyPair.first, new RealmAny(RealmAnyOperator.m29704b(this.f66621b, (NativeRealmAny) keyRealmAnyPair.second)));
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$n */
    /* loaded from: classes5.dex */
    public static class C11276n extends AbstractC11270h {

        /* renamed from: d */
        public final AbstractC19706eW1 f66623d;

        public C11276n(OsMap osMap, BaseRealm baseRealm, AbstractC19706eW1 abstractC19706eW1) {
            super(osMap, baseRealm);
            this.f66623d = abstractC19706eW1;
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair keyObjRowPair = this.f66620a.getKeyObjRowPair(i);
            Object obj = keyObjRowPair.first;
            long longValue = ((Long) keyObjRowPair.second).longValue();
            if (longValue == -1) {
                return new AbstractMap.SimpleImmutableEntry(obj, null);
            }
            return this.f66623d.mo31533b(this.f66621b, longValue, obj);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$o */
    /* loaded from: classes5.dex */
    public static class C11277o extends AbstractC11270h {
        public C11277o(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            Object obj = entryForPrimitive.second;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Short.valueOf(((Long) obj).shortValue()));
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$p */
    /* loaded from: classes5.dex */
    public static class C11278p extends AbstractC11270h {
        public C11278p(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (String) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$q */
    /* loaded from: classes5.dex */
    public static class C11279q extends AbstractC11270h {
        public C11279q(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11270h
        /* renamed from: a */
        public Map.Entry mo29624a(int i) {
            Pair entryForPrimitive = this.f66620a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (UUID) entryForPrimitive.second);
        }
    }

    public RealmMapEntrySet(BaseRealm baseRealm, OsMap osMap, IteratorType iteratorType, AbstractC19706eW1 abstractC19706eW1) {
        this.f66614a = baseRealm;
        this.f66615b = osMap;
        this.f66616c = iteratorType;
        this.f66617d = new N50();
        this.f66618e = abstractC19706eW1;
    }

    /* renamed from: b */
    public static AbstractC11270h m29626b(IteratorType iteratorType, OsMap osMap, BaseRealm baseRealm, AbstractC19706eW1 abstractC19706eW1) {
        switch (C11263a.f66619a[iteratorType.ordinal()]) {
            case 1:
                return new C11273k(osMap, baseRealm);
            case 2:
                return new C11266d(osMap, baseRealm);
            case 3:
                return new C11277o(osMap, baseRealm);
            case 4:
                return new C11272j(osMap, baseRealm);
            case 5:
                return new C11271i(osMap, baseRealm);
            case 6:
                return new C11269g(osMap, baseRealm);
            case 7:
                return new C11278p(osMap, baseRealm);
            case 8:
                return new C11265c(osMap, baseRealm);
            case 9:
                return new C11267e(osMap, baseRealm);
            case 10:
                return new C11268f(osMap, baseRealm);
            case 11:
                return new C11264b(osMap, baseRealm);
            case 12:
                return new C11274l(osMap, baseRealm);
            case 13:
                return new C11279q(osMap, baseRealm);
            case 14:
                return new C11275m(osMap, baseRealm);
            case 15:
                if (abstractC19706eW1 != null) {
                    return new C11276n(osMap, baseRealm, abstractC19706eW1);
                }
                throw new IllegalArgumentException("Missing class container when creating RealmModelValueIterator.");
            default:
                throw new IllegalArgumentException("Invalid iterator type.");
        }
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry == null && obj == null) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                break;
            } else if (entry != null && this.f66617d.m67615b(entry, (Map.Entry) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean containsAll(java.util.Collection r4) {
        /*
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lb
            boolean r4 = r3.isEmpty()
            return r4
        Lb:
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r4.next()
            boolean r1 = r0 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 == 0) goto L26
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto Lf
        L26:
            return r2
        L27:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmMapEntrySet.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        if (this.f66615b.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m29626b(this.f66616c, this.f66615b, this.f66614a, this.f66618e);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        long size = this.f66615b.size();
        if (size < 2147483647L) {
            return (int) size;
        }
        return Integer.MAX_VALUE;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[(int) this.f66615b.size()];
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = (Map.Entry) it.next();
            i++;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        long size = this.f66615b.size();
        Object[] objArr2 = (((long) objArr.length) == size || ((long) objArr.length) > size) ? objArr : (Object[]) Array.newInstance(Map.Entry.class, (int) size);
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr2[i] = (Map.Entry) it.next();
            i++;
        }
        if (objArr.length > size) {
            objArr2[i] = null;
        }
        return objArr2;
    }

    public RealmMapEntrySet(BaseRealm baseRealm, OsMap osMap, IteratorType iteratorType, AbstractC0740KS abstractC0740KS, AbstractC19706eW1 abstractC19706eW1) {
        this.f66614a = baseRealm;
        this.f66615b = osMap;
        this.f66616c = iteratorType;
        this.f66617d = abstractC0740KS;
        this.f66618e = abstractC19706eW1;
    }
}
