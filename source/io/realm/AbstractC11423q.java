package io.realm;

import io.realm.internal.InvalidRow;
import io.realm.internal.OsResults;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.NativeRealmAny;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import javax.annotation.Nullable;

/* renamed from: io.realm.q */
/* loaded from: classes5.dex */
public abstract class AbstractC11423q extends AbstractList implements OrderedRealmCollection {

    /* renamed from: a */
    public final Class f66911a;

    /* renamed from: b */
    public final String f66912b;
    public final BaseRealm baseRealm;

    /* renamed from: c */
    public final OsResults f66913c;

    /* renamed from: d */
    public final AbstractC11425b f66914d;

    /* renamed from: io.realm.q$a */
    /* loaded from: classes5.dex */
    public static class C11424a extends C11428e {
        public C11424a(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.AbstractC11423q.C11428e, io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: g */
        public Byte mo29362d(int i) {
            return Byte.valueOf(((Long) this.f66916b.getValue(i)).byteValue());
        }

        @Override // io.realm.AbstractC11423q.C11428e, io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: h */
        public Byte mo29361e(int i, OsResults osResults) {
            Long l = (Long) osResults.getValue(i);
            if (l == null) {
                return null;
            }
            return Byte.valueOf(l.byteValue());
        }
    }

    /* renamed from: io.realm.q$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11425b {

        /* renamed from: a */
        public final BaseRealm f66915a;

        /* renamed from: b */
        public final OsResults f66916b;

        /* renamed from: c */
        public final Class f66917c;

        /* renamed from: d */
        public final String f66918d;

        public AbstractC11425b(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            this.f66915a = baseRealm;
            this.f66916b = osResults;
            this.f66917c = cls;
            this.f66918d = str;
        }

        /* renamed from: a */
        public abstract Object mo29367a(UncheckedRow uncheckedRow);

        /* renamed from: b */
        public Object m29370b(UncheckedRow uncheckedRow, boolean z, Object obj) {
            if (uncheckedRow != null) {
                return this.f66915a.m29756l(this.f66917c, this.f66918d, uncheckedRow);
            }
            if (!z) {
                return obj;
            }
            throw new IndexOutOfBoundsException("No results were found.");
        }

        /* renamed from: c */
        public abstract Object mo29366c(boolean z, Object obj);

        /* renamed from: d */
        public abstract Object mo29362d(int i);

        /* renamed from: e */
        public abstract Object mo29361e(int i, OsResults osResults);

        /* renamed from: f */
        public abstract Object mo29365f(boolean z, Object obj);
    }

    /* renamed from: io.realm.q$c */
    /* loaded from: classes5.dex */
    public static class C11426c extends C11428e {
        public C11426c(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.AbstractC11423q.C11428e, io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: g */
        public Integer mo29362d(int i) {
            return Integer.valueOf(((Long) this.f66916b.getValue(i)).intValue());
        }

        @Override // io.realm.AbstractC11423q.C11428e, io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: h */
        public Integer mo29361e(int i, OsResults osResults) {
            Long l = (Long) osResults.getValue(i);
            if (l == null) {
                return null;
            }
            return Integer.valueOf(l.intValue());
        }
    }

    /* renamed from: io.realm.q$d */
    /* loaded from: classes5.dex */
    public static class C11427d extends AbstractC11425b {
        public C11427d(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: a */
        public Object mo29367a(UncheckedRow uncheckedRow) {
            return this.f66915a.m29756l(this.f66917c, this.f66918d, uncheckedRow);
        }

        @Override // io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: c */
        public Object mo29366c(boolean z, Object obj) {
            return m29370b(this.f66916b.firstUncheckedRow(), z, obj);
        }

        @Override // io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: d */
        public Object mo29362d(int i) {
            return this.f66915a.m29756l(this.f66917c, this.f66918d, this.f66916b.getUncheckedRow(i));
        }

        @Override // io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: e */
        public Object mo29361e(int i, OsResults osResults) {
            return mo29367a(osResults.getUncheckedRow(i));
        }

        @Override // io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: f */
        public Object mo29365f(boolean z, Object obj) {
            return m29370b(this.f66916b.lastUncheckedRow(), z, obj);
        }
    }

    /* renamed from: io.realm.q$e */
    /* loaded from: classes5.dex */
    public static class C11428e extends AbstractC11425b {
        public C11428e(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: a */
        public Object mo29367a(UncheckedRow uncheckedRow) {
            throw new UnsupportedOperationException("Method 'convertRowToObject' cannot be used on primitive Realm collections.");
        }

        @Override // io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: c */
        public Object mo29366c(boolean z, Object obj) {
            if (this.f66916b.size() != 0) {
                return this.f66916b.getValue(0);
            }
            return obj;
        }

        @Override // io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: d */
        public Object mo29362d(int i) {
            return this.f66916b.getValue(i);
        }

        @Override // io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: e */
        public Object mo29361e(int i, OsResults osResults) {
            return osResults.getValue(i);
        }

        @Override // io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: f */
        public Object mo29365f(boolean z, Object obj) {
            int size = (int) this.f66916b.size();
            if (size != 0) {
                return this.f66916b.getValue(size - 1);
            }
            return obj;
        }
    }

    /* renamed from: io.realm.q$f */
    /* loaded from: classes5.dex */
    public static class C11429f extends C11428e {
        public C11429f(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.AbstractC11423q.C11428e, io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: g */
        public RealmAny mo29362d(int i) {
            return new RealmAny(RealmAnyOperator.m29704b(this.f66915a, (NativeRealmAny) this.f66916b.getValue(i)));
        }

        @Override // io.realm.AbstractC11423q.C11428e, io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: h */
        public RealmAny mo29361e(int i, OsResults osResults) {
            return new RealmAny(RealmAnyOperator.m29704b(this.f66915a, (NativeRealmAny) osResults.getValue(i)));
        }
    }

    /* renamed from: io.realm.q$g */
    /* loaded from: classes5.dex */
    public class C11430g extends OsResults.Iterator {
        public C11430g() {
            super(AbstractC11423q.this.f66913c);
        }

        @Override // io.realm.internal.OsResults.Iterator
        public Object convertRowToObject(UncheckedRow uncheckedRow) {
            return AbstractC11423q.this.f66914d.mo29367a(uncheckedRow);
        }

        @Override // io.realm.internal.OsResults.Iterator
        public Object getInternal(int i, OsResults osResults) {
            return AbstractC11423q.this.f66914d.mo29361e(i, osResults);
        }
    }

    /* renamed from: io.realm.q$h */
    /* loaded from: classes5.dex */
    public class C11431h extends OsResults.ListIterator {
        public C11431h(int i) {
            super(AbstractC11423q.this.f66913c, i);
        }

        @Override // io.realm.internal.OsResults.Iterator
        public Object convertRowToObject(UncheckedRow uncheckedRow) {
            return AbstractC11423q.this.f66914d.mo29367a(uncheckedRow);
        }

        @Override // io.realm.internal.OsResults.Iterator
        public Object getInternal(int i, OsResults osResults) {
            return AbstractC11423q.this.f66914d.mo29361e(i, osResults);
        }
    }

    /* renamed from: io.realm.q$i */
    /* loaded from: classes5.dex */
    public static class C11432i extends C11428e {
        public C11432i(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.AbstractC11423q.C11428e, io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: g */
        public Short mo29362d(int i) {
            return Short.valueOf(((Long) this.f66916b.getValue(i)).shortValue());
        }

        @Override // io.realm.AbstractC11423q.C11428e, io.realm.AbstractC11423q.AbstractC11425b
        /* renamed from: h */
        public Short mo29361e(int i, OsResults osResults) {
            Long l = (Long) osResults.getValue(i);
            if (l == null) {
                return null;
            }
            return Short.valueOf(l.shortValue());
        }
    }

    public AbstractC11423q(BaseRealm baseRealm, OsResults osResults, Class cls) {
        this(baseRealm, osResults, cls, null, getCollectionOperator(false, baseRealm, osResults, cls, null));
    }

    public static <T> AbstractC11425b getCollectionOperator(boolean z, BaseRealm baseRealm, OsResults osResults, @Nullable Class<T> cls, @Nullable String str) {
        if (z) {
            if (cls == Integer.class) {
                return new C11426c(baseRealm, osResults, Integer.class, str);
            }
            if (cls == Short.class) {
                return new C11432i(baseRealm, osResults, Short.class, str);
            }
            if (cls == Byte.class) {
                return new C11424a(baseRealm, osResults, Byte.class, str);
            }
            if (cls == RealmAny.class) {
                return new C11429f(baseRealm, osResults, RealmAny.class, str);
            }
            return new C11428e(baseRealm, osResults, cls, str);
        }
        return new C11427d(baseRealm, osResults, cls, str);
    }

    /* renamed from: a */
    public RealmResults m29378a(OsResults osResults) {
        RealmResults realmResults;
        String str = this.f66912b;
        if (str != null) {
            realmResults = new RealmResults(this.baseRealm, osResults, str);
        } else {
            realmResults = new RealmResults(this.baseRealm, osResults, this.f66911a);
        }
        realmResults.load();
        return realmResults;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public double average(String str) {
        this.baseRealm.checkIfValid();
        return this.f66913c.aggregateNumber(OsResults.Aggregate.AVERAGE, m29376c(str)).doubleValue();
    }

    /* renamed from: b */
    public final Object m29377b(boolean z, Object obj) {
        return this.f66914d.mo29366c(z, obj);
    }

    /* renamed from: c */
    public final long m29376c(String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.contains(".")) {
                long columnKey = this.f66913c.getTable().getColumnKey(str);
                if (columnKey >= 0) {
                    return columnKey;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' does not exist.", str));
            }
            throw new IllegalArgumentException("Aggregates on child object fields are not supported: " + str);
        }
        throw new IllegalArgumentException("Non-empty field name required.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, io.realm.RealmCollection
    public boolean contains(Object obj) {
        if (!isLoaded() || ((obj instanceof RealmObjectProxy) && ((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm() == InvalidRow.INSTANCE)) {
            return false;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof byte[]) && (obj instanceof byte[])) {
                if (Arrays.equals((byte[]) next, (byte[]) obj)) {
                    return true;
                }
            } else if (next != null && next.equals(obj)) {
                return true;
            } else {
                if (next == null && obj == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public OrderedRealmCollectionSnapshot createSnapshot() {
        String str = this.f66912b;
        if (str != null) {
            return new OrderedRealmCollectionSnapshot(this.baseRealm, this.f66913c, str);
        }
        return new OrderedRealmCollectionSnapshot(this.baseRealm, this.f66913c, this.f66911a);
    }

    /* renamed from: d */
    public OsResults m29375d() {
        return this.f66913c;
    }

    public boolean deleteAllFromRealm() {
        this.baseRealm.checkIfValid();
        if (size() > 0) {
            this.f66913c.clear();
            return true;
        }
        return false;
    }

    public boolean deleteFirstFromRealm() {
        this.baseRealm.checkIfValidAndInTransaction();
        return this.f66913c.deleteFirst();
    }

    public void deleteFromRealm(int i) {
        this.baseRealm.checkIfValidAndInTransaction();
        this.f66913c.delete(i);
    }

    public boolean deleteLastFromRealm() {
        this.baseRealm.checkIfValidAndInTransaction();
        return this.f66913c.deleteLast();
    }

    /* renamed from: e */
    public Table m29374e() {
        return this.f66913c.getTable();
    }

    /* renamed from: f */
    public final Object m29373f(boolean z, Object obj) {
        return this.f66914d.mo29365f(z, obj);
    }

    public Object first() {
        return m29377b(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        this.baseRealm.checkIfValid();
        return this.f66914d.mo29362d(i);
    }

    public Realm getRealm() {
        this.baseRealm.checkIfValid();
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return (Realm) baseRealm;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }

    public boolean isManaged() {
        return true;
    }

    public boolean isValid() {
        return this.f66913c.isValid();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C11430g();
    }

    public Object last() {
        return m29373f(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return new C11431h(0);
    }

    public Number max(String str) {
        this.baseRealm.checkIfValid();
        return this.f66913c.aggregateNumber(OsResults.Aggregate.MAXIMUM, m29376c(str));
    }

    public Date maxDate(String str) {
        this.baseRealm.checkIfValid();
        return this.f66913c.aggregateDate(OsResults.Aggregate.MAXIMUM, m29376c(str));
    }

    public Number min(String str) {
        this.baseRealm.checkIfValid();
        return this.f66913c.aggregateNumber(OsResults.Aggregate.MINIMUM, m29376c(str));
    }

    public Date minDate(String str) {
        this.baseRealm.checkIfValid();
        return this.f66913c.aggregateDate(OsResults.Aggregate.MINIMUM, m29376c(str));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (isLoaded()) {
            long size = this.f66913c.size();
            if (size > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) size;
        }
        return 0;
    }

    public RealmResults sort(String str) {
        return m29378a(this.f66913c.sort(this.baseRealm.getSchema().m29583e(), str, Sort.ASCENDING));
    }

    public Number sum(String str) {
        this.baseRealm.checkIfValid();
        return this.f66913c.aggregateNumber(OsResults.Aggregate.SUM, m29376c(str));
    }

    public AbstractC11423q(BaseRealm baseRealm, OsResults osResults, Class cls, AbstractC11425b abstractC11425b) {
        this(baseRealm, osResults, cls, null, abstractC11425b);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public Object first(Object obj) {
        return m29377b(false, obj);
    }

    public Object last(Object obj) {
        return m29373f(false, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return new C11431h(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public AbstractC11423q(BaseRealm baseRealm, OsResults osResults, String str) {
        this(baseRealm, osResults, null, str, getCollectionOperator(false, baseRealm, osResults, null, str));
    }

    public RealmResults sort(String str, Sort sort) {
        return m29378a(this.f66913c.sort(this.baseRealm.getSchema().m29583e(), str, sort));
    }

    public AbstractC11423q(BaseRealm baseRealm, OsResults osResults, String str, AbstractC11425b abstractC11425b) {
        this(baseRealm, osResults, null, str, abstractC11425b);
    }

    public AbstractC11423q(BaseRealm baseRealm, OsResults osResults, Class cls, String str, AbstractC11425b abstractC11425b) {
        this.baseRealm = baseRealm;
        this.f66913c = osResults;
        this.f66911a = cls;
        this.f66912b = str;
        this.f66914d = abstractC11425b;
    }

    public RealmResults sort(String[] strArr, Sort[] sortArr) {
        return m29378a(this.f66913c.sort(this.baseRealm.getSchema().m29583e(), strArr, sortArr));
    }
}
