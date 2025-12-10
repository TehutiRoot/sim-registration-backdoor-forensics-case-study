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
    public final BaseRealm f66677a;

    /* renamed from: b */
    public final OsMap f66678b;

    /* renamed from: c */
    public final IteratorType f66679c;

    /* renamed from: d */
    public final AbstractC1003OS f66680d;

    /* renamed from: e */
    public final AbstractC19240bX1 f66681e;

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
    public static /* synthetic */ class C11250a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66682a;

        static {
            int[] iArr = new int[IteratorType.values().length];
            f66682a = iArr;
            try {
                iArr[IteratorType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66682a[IteratorType.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66682a[IteratorType.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66682a[IteratorType.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66682a[IteratorType.FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66682a[IteratorType.DOUBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66682a[IteratorType.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66682a[IteratorType.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66682a[IteratorType.DATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66682a[IteratorType.DECIMAL128.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66682a[IteratorType.BINARY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66682a[IteratorType.OBJECT_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f66682a[IteratorType.UUID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f66682a[IteratorType.MIXED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f66682a[IteratorType.OBJECT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$b */
    /* loaded from: classes5.dex */
    public static class C11251b extends AbstractC11257h {
        public C11251b(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (byte[]) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$c */
    /* loaded from: classes5.dex */
    public static class C11252c extends AbstractC11257h {
        public C11252c(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Boolean) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$d */
    /* loaded from: classes5.dex */
    public static class C11253d extends AbstractC11257h {
        public C11253d(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            Object obj = entryForPrimitive.second;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Byte.valueOf(((Long) obj).byteValue()));
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$e */
    /* loaded from: classes5.dex */
    public static class C11254e extends AbstractC11257h {
        public C11254e(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Date) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$f */
    /* loaded from: classes5.dex */
    public static class C11255f extends AbstractC11257h {
        public C11255f(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Decimal128) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$g */
    /* loaded from: classes5.dex */
    public static class C11256g extends AbstractC11257h {
        public C11256g(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Double) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$h */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11257h implements Iterator {

        /* renamed from: a */
        public final OsMap f66683a;

        /* renamed from: b */
        public final BaseRealm f66684b;

        /* renamed from: c */
        public int f66685c = -1;

        public AbstractC11257h(OsMap osMap, BaseRealm baseRealm) {
            this.f66683a = osMap;
            this.f66684b = baseRealm;
        }

        /* renamed from: a */
        public abstract Map.Entry mo29964a(int i);

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry next() {
            this.f66685c++;
            long size = this.f66683a.size();
            int i = this.f66685c;
            if (i < size) {
                return mo29964a(i);
            }
            throw new NoSuchElementException("Cannot access index " + this.f66685c + " when size is " + size + ". Remember to check hasNext() before using next().");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f66685c + 1 < this.f66683a.size()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$i */
    /* loaded from: classes5.dex */
    public static class C11258i extends AbstractC11257h {
        public C11258i(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Float) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$j */
    /* loaded from: classes5.dex */
    public static class C11259j extends AbstractC11257h {
        public C11259j(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            Object obj = entryForPrimitive.second;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Integer.valueOf(((Long) obj).intValue()));
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$k */
    /* loaded from: classes5.dex */
    public static class C11260k extends AbstractC11257h {
        public C11260k(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            Object obj = entryForPrimitive.second;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Long) obj);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$l */
    /* loaded from: classes5.dex */
    public static class C11261l extends AbstractC11257h {
        public C11261l(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (ObjectId) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$m */
    /* loaded from: classes5.dex */
    public static class C11262m extends AbstractC11257h {
        public C11262m(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair keyRealmAnyPair = this.f66683a.getKeyRealmAnyPair(i);
            return new AbstractMap.SimpleImmutableEntry(keyRealmAnyPair.first, new RealmAny(RealmAnyOperator.m30044b(this.f66684b, (NativeRealmAny) keyRealmAnyPair.second)));
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$n */
    /* loaded from: classes5.dex */
    public static class C11263n extends AbstractC11257h {

        /* renamed from: d */
        public final AbstractC19240bX1 f66686d;

        public C11263n(OsMap osMap, BaseRealm baseRealm, AbstractC19240bX1 abstractC19240bX1) {
            super(osMap, baseRealm);
            this.f66686d = abstractC19240bX1;
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair keyObjRowPair = this.f66683a.getKeyObjRowPair(i);
            Object obj = keyObjRowPair.first;
            long longValue = ((Long) keyObjRowPair.second).longValue();
            if (longValue == -1) {
                return new AbstractMap.SimpleImmutableEntry(obj, null);
            }
            return this.f66686d.mo29476b(this.f66684b, longValue, obj);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$o */
    /* loaded from: classes5.dex */
    public static class C11264o extends AbstractC11257h {
        public C11264o(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            Object obj = entryForPrimitive.second;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Short.valueOf(((Long) obj).shortValue()));
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$p */
    /* loaded from: classes5.dex */
    public static class C11265p extends AbstractC11257h {
        public C11265p(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (String) entryForPrimitive.second);
        }
    }

    /* renamed from: io.realm.RealmMapEntrySet$q */
    /* loaded from: classes5.dex */
    public static class C11266q extends AbstractC11257h {
        public C11266q(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.AbstractC11257h
        /* renamed from: a */
        public Map.Entry mo29964a(int i) {
            Pair entryForPrimitive = this.f66683a.getEntryForPrimitive(i);
            if (entryForPrimitive.second == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (UUID) entryForPrimitive.second);
        }
    }

    public RealmMapEntrySet(BaseRealm baseRealm, OsMap osMap, IteratorType iteratorType, AbstractC19240bX1 abstractC19240bX1) {
        this.f66677a = baseRealm;
        this.f66678b = osMap;
        this.f66679c = iteratorType;
        this.f66680d = new R50();
        this.f66681e = abstractC19240bX1;
    }

    /* renamed from: b */
    public static AbstractC11257h m29966b(IteratorType iteratorType, OsMap osMap, BaseRealm baseRealm, AbstractC19240bX1 abstractC19240bX1) {
        switch (C11250a.f66682a[iteratorType.ordinal()]) {
            case 1:
                return new C11260k(osMap, baseRealm);
            case 2:
                return new C11253d(osMap, baseRealm);
            case 3:
                return new C11264o(osMap, baseRealm);
            case 4:
                return new C11259j(osMap, baseRealm);
            case 5:
                return new C11258i(osMap, baseRealm);
            case 6:
                return new C11256g(osMap, baseRealm);
            case 7:
                return new C11265p(osMap, baseRealm);
            case 8:
                return new C11252c(osMap, baseRealm);
            case 9:
                return new C11254e(osMap, baseRealm);
            case 10:
                return new C11255f(osMap, baseRealm);
            case 11:
                return new C11251b(osMap, baseRealm);
            case 12:
                return new C11261l(osMap, baseRealm);
            case 13:
                return new C11266q(osMap, baseRealm);
            case 14:
                return new C11262m(osMap, baseRealm);
            case 15:
                if (abstractC19240bX1 != null) {
                    return new C11263n(osMap, baseRealm, abstractC19240bX1);
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
            } else if (entry != null && this.f66680d.m67117b(entry, (Map.Entry) obj)) {
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
        if (this.f66678b.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m29966b(this.f66679c, this.f66678b, this.f66677a, this.f66681e);
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
        long size = this.f66678b.size();
        if (size < 2147483647L) {
            return (int) size;
        }
        return Integer.MAX_VALUE;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[(int) this.f66678b.size()];
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
        long size = this.f66678b.size();
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

    public RealmMapEntrySet(BaseRealm baseRealm, OsMap osMap, IteratorType iteratorType, AbstractC1003OS abstractC1003OS, AbstractC19240bX1 abstractC19240bX1) {
        this.f66677a = baseRealm;
        this.f66678b = osMap;
        this.f66679c = iteratorType;
        this.f66680d = abstractC1003OS;
        this.f66681e = abstractC19240bX1;
    }
}