package io.realm;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.realm.internal.ManageableObject;
import io.realm.internal.OsSet;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class RealmSet<E> implements Set<E>, ManageableObject, RealmCollection<E> {
    protected final AbstractC11286c setStrategy;

    /* renamed from: io.realm.RealmSet$c */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11286c implements Set, ManageableObject, RealmCollection {
        public AbstractC11286c() {
        }

        /* renamed from: a */
        public abstract void mo29568a(RealmSet realmSet, RealmChangeListener realmChangeListener);

        /* renamed from: b */
        public abstract void mo29567b(RealmSet realmSet, SetChangeListener setChangeListener);

        /* renamed from: c */
        public abstract RealmSet mo29566c();

        /* renamed from: d */
        public abstract OsSet mo29565d();

        /* renamed from: e */
        public abstract Class mo29564e();

        /* renamed from: f */
        public abstract String mo29563f();

        /* renamed from: g */
        public abstract void mo29562g();

        /* renamed from: h */
        public abstract void mo29561h(RealmSet realmSet, RealmChangeListener realmChangeListener);

        /* renamed from: i */
        public abstract void mo29560i(RealmSet realmSet, SetChangeListener setChangeListener);
    }

    /* renamed from: io.realm.RealmSet$d */
    /* loaded from: classes5.dex */
    public static class C11287d extends AbstractC11286c {

        /* renamed from: a */
        public final Set f66655a;

        public C11287d() {
            super();
            this.f66655a = new HashSet();
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: a */
        public void mo29568a(RealmSet realmSet, RealmChangeListener realmChangeListener) {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not support change listeners.");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            return this.f66655a.add(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f66655a.addAll(collection);
        }

        @Override // io.realm.RealmCollection
        public double average(String str) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: b */
        public void mo29567b(RealmSet realmSet, SetChangeListener setChangeListener) {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not support change listeners.");
        }

        @Override // io.realm.internal.Freezable
        /* renamed from: c */
        public RealmSet freeze() {
            throw new UnsupportedOperationException("Unmanaged RealmSets cannot be frozen.");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f66655a.clear();
        }

        @Override // java.util.Set, java.util.Collection, io.realm.RealmCollection, java.util.List
        public boolean contains(Object obj) {
            return this.f66655a.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f66655a.containsAll(collection);
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: d */
        public OsSet mo29565d() {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not have a representation in native code.");
        }

        @Override // io.realm.RealmCollection
        public boolean deleteAllFromRealm() {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: e */
        public Class mo29564e() {
            throw new UnsupportedOperationException("Unmanaged sets do not support retrieving the value class.");
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: f */
        public String mo29563f() {
            throw new UnsupportedOperationException("Unmanaged sets do not support retrieving the value class name.");
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: g */
        public void mo29562g() {
            throw new UnsupportedOperationException("Cannot remove change listeners because unmanaged RealmSets do not support change listeners.");
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: h */
        public void mo29561h(RealmSet realmSet, RealmChangeListener realmChangeListener) {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmSets do not support change listeners.");
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: i */
        public void mo29560i(RealmSet realmSet, SetChangeListener setChangeListener) {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmSets do not support change listeners.");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f66655a.isEmpty();
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
            return false;
        }

        @Override // io.realm.RealmCollection
        public boolean isLoaded() {
            return true;
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isManaged() {
            return false;
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isValid() {
            return true;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f66655a.iterator();
        }

        @Override // io.realm.RealmCollection
        public boolean load() {
            return true;
        }

        @Override // io.realm.RealmCollection
        public Number max(String str) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // io.realm.RealmCollection
        public Date maxDate(String str) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // io.realm.RealmCollection
        public Number min(String str) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // io.realm.RealmCollection
        public Date minDate(String str) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return this.f66655a.remove(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f66655a.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f66655a.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f66655a.size();
        }

        @Override // io.realm.RealmCollection
        public Number sum(String str) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return this.f66655a.toArray();
        }

        @Override // io.realm.RealmCollection
        public RealmQuery where() {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return this.f66655a.toArray(objArr);
        }

        public C11287d(Collection collection) {
            this();
            this.f66655a.addAll(collection);
        }
    }

    public RealmSet() {
        this.setStrategy = new C11287d();
    }

    /* renamed from: b */
    public static C11285b m29572b(BaseRealm baseRealm, OsSet osSet, Class cls) {
        BG1 c22084sJ0;
        if (CollectionUtils.m29749c(cls)) {
            return new C11285b(new C22176ss1(baseRealm, osSet, cls), cls);
        }
        if (cls == Boolean.class) {
            c22084sJ0 = new C5455cc(baseRealm, osSet, Boolean.class);
        } else if (cls == String.class) {
            c22084sJ0 = new WM1(baseRealm, osSet, String.class);
        } else if (cls == Integer.class) {
            c22084sJ0 = new C21104mf0(baseRealm, osSet, Integer.class);
        } else if (cls == Long.class) {
            c22084sJ0 = new C17745Hm0(baseRealm, osSet, Long.class);
        } else if (cls == Short.class) {
            c22084sJ0 = new C22939xH1(baseRealm, osSet, Short.class);
        } else if (cls == Byte.class) {
            c22084sJ0 = new C1331Sf(baseRealm, osSet, Byte.class);
        } else if (cls == Float.class) {
            c22084sJ0 = new S20(baseRealm, osSet, Float.class);
        } else if (cls == Double.class) {
            c22084sJ0 = new C1453UJ(baseRealm, osSet, Double.class);
        } else if (cls == byte[].class) {
            c22084sJ0 = new C10476ib(baseRealm, osSet, byte[].class);
        } else if (cls == Date.class) {
            c22084sJ0 = new C1084PD(baseRealm, osSet, Date.class);
        } else if (cls == Decimal128.class) {
            c22084sJ0 = new C10057dE(baseRealm, osSet, Decimal128.class);
        } else if (cls == ObjectId.class) {
            c22084sJ0 = new QJ0(baseRealm, osSet, ObjectId.class);
        } else if (cls == UUID.class) {
            c22084sJ0 = new UW1(baseRealm, osSet, UUID.class);
        } else if (cls == RealmAny.class) {
            c22084sJ0 = new C11480s(baseRealm, osSet, RealmAny.class);
        } else if (cls == Number.class) {
            c22084sJ0 = new C22084sJ0(baseRealm, osSet, Number.class);
        } else {
            throw new UnsupportedOperationException("getStrategy: missing class '" + cls.getSimpleName() + OperatorName.SHOW_TEXT_LINE);
        }
        return new C11285b(c22084sJ0, cls);
    }

    /* renamed from: c */
    public static C11285b m29571c(BaseRealm baseRealm, OsSet osSet, String str) {
        BG1 c0592il;
        if (str.equals(Boolean.class.getCanonicalName())) {
            c0592il = new C5455cc(baseRealm, osSet, Boolean.class);
        } else if (str.equals(String.class.getCanonicalName())) {
            c0592il = new WM1(baseRealm, osSet, String.class);
        } else if (str.equals(Integer.class.getCanonicalName())) {
            c0592il = new C21104mf0(baseRealm, osSet, Integer.class);
        } else if (str.equals(Long.class.getCanonicalName())) {
            c0592il = new C17745Hm0(baseRealm, osSet, Long.class);
        } else if (str.equals(Short.class.getCanonicalName())) {
            c0592il = new C22939xH1(baseRealm, osSet, Short.class);
        } else if (str.equals(Byte.class.getCanonicalName())) {
            c0592il = new C1331Sf(baseRealm, osSet, Byte.class);
        } else if (str.equals(Float.class.getCanonicalName())) {
            c0592il = new S20(baseRealm, osSet, Float.class);
        } else if (str.equals(Double.class.getCanonicalName())) {
            c0592il = new C1453UJ(baseRealm, osSet, Double.class);
        } else if (str.equals(byte[].class.getCanonicalName())) {
            c0592il = new C10476ib(baseRealm, osSet, byte[].class);
        } else if (str.equals(Date.class.getCanonicalName())) {
            c0592il = new C1084PD(baseRealm, osSet, Date.class);
        } else if (str.equals(Decimal128.class.getCanonicalName())) {
            c0592il = new C10057dE(baseRealm, osSet, Decimal128.class);
        } else if (str.equals(ObjectId.class.getCanonicalName())) {
            c0592il = new QJ0(baseRealm, osSet, ObjectId.class);
        } else if (str.equals(UUID.class.getCanonicalName())) {
            c0592il = new UW1(baseRealm, osSet, UUID.class);
        } else if (str.equals(RealmAny.class.getCanonicalName())) {
            c0592il = new C11480s(baseRealm, osSet, RealmAny.class);
        } else {
            c0592il = new C0592IL(baseRealm, osSet, str);
        }
        return new C11285b(c0592il, c0592il.m68968o());
    }

    /* renamed from: a */
    public OsSet m29573a() {
        return this.setStrategy.mo29565d();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(@Nullable E e) {
        return this.setStrategy.add(e);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.setStrategy.addAll(collection);
    }

    public void addChangeListener(RealmChangeListener<RealmSet<E>> realmChangeListener) {
        this.setStrategy.mo29568a(this, realmChangeListener);
    }

    @Override // io.realm.RealmCollection
    public double average(String str) {
        return this.setStrategy.average(str);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.setStrategy.clear();
    }

    @Override // java.util.Set, java.util.Collection, io.realm.RealmCollection, java.util.List
    public boolean contains(@Nullable Object obj) {
        return this.setStrategy.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.setStrategy.containsAll(collection);
    }

    @Override // io.realm.RealmCollection
    public boolean deleteAllFromRealm() {
        return this.setStrategy.deleteAllFromRealm();
    }

    public Class<E> getValueClass() {
        return this.setStrategy.mo29564e();
    }

    public String getValueClassName() {
        return this.setStrategy.mo29563f();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.setStrategy.isEmpty();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
        return this.setStrategy.isFrozen();
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
        return true;
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isManaged() {
        return this.setStrategy.isManaged();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isValid() {
        return this.setStrategy.isValid();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.setStrategy.iterator();
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
        return true;
    }

    @Override // io.realm.RealmCollection
    @Nullable
    public Number max(String str) {
        return this.setStrategy.max(str);
    }

    @Override // io.realm.RealmCollection
    @Nullable
    public Date maxDate(String str) {
        return this.setStrategy.maxDate(str);
    }

    @Override // io.realm.RealmCollection
    @Nullable
    public Number min(String str) {
        return this.setStrategy.min(str);
    }

    @Override // io.realm.RealmCollection
    @Nullable
    public Date minDate(String str) {
        return this.setStrategy.minDate(str);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(@Nullable Object obj) {
        return this.setStrategy.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.setStrategy.removeAll(collection);
    }

    public void removeAllChangeListeners() {
        this.setStrategy.mo29562g();
    }

    public void removeChangeListener(RealmChangeListener<RealmSet<E>> realmChangeListener) {
        this.setStrategy.mo29561h(this, realmChangeListener);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.setStrategy.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.setStrategy.size();
    }

    @Override // io.realm.RealmCollection
    public Number sum(String str) {
        return this.setStrategy.sum(str);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.setStrategy.toArray();
    }

    @Override // io.realm.RealmCollection
    public RealmQuery<E> where() {
        return this.setStrategy.where();
    }

    public void addChangeListener(SetChangeListener<E> setChangeListener) {
        this.setStrategy.mo29567b(this, setChangeListener);
    }

    @Override // io.realm.internal.Freezable
    public RealmSet<E> freeze() {
        return this.setStrategy.mo29566c();
    }

    public void removeChangeListener(SetChangeListener<E> setChangeListener) {
        this.setStrategy.mo29560i(this, setChangeListener);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.setStrategy.toArray(tArr);
    }

    /* renamed from: io.realm.RealmSet$b */
    /* loaded from: classes5.dex */
    public static class C11285b extends AbstractC11286c {

        /* renamed from: a */
        public final BG1 f66653a;

        /* renamed from: b */
        public Class f66654b;

        public C11285b(BG1 bg1, Class cls) {
            super();
            this.f66653a = bg1;
            this.f66654b = cls;
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: a */
        public void mo29568a(RealmSet realmSet, RealmChangeListener realmChangeListener) {
            this.f66653a.m68977d(realmSet, realmChangeListener);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            return this.f66653a.mo585a(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            m29569k(collection);
            return this.f66653a.m68978b(collection);
        }

        @Override // io.realm.RealmCollection
        public double average(String str) {
            return where().average(str);
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: b */
        public void mo29567b(RealmSet realmSet, SetChangeListener setChangeListener) {
            this.f66653a.m68976e(realmSet, setChangeListener);
        }

        @Override // io.realm.internal.Freezable
        /* renamed from: c */
        public RealmSet freeze() {
            return this.f66653a.m68971l();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f66653a.m68975f();
        }

        @Override // java.util.Set, java.util.Collection, io.realm.RealmCollection, java.util.List
        public boolean contains(Object obj) {
            return this.f66653a.m68974g(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            m29569k(collection);
            return this.f66653a.m68973h(collection);
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: d */
        public OsSet mo29565d() {
            return this.f66653a.m68969n();
        }

        @Override // io.realm.RealmCollection
        public boolean deleteAllFromRealm() {
            this.f66653a.f339a.checkIfValid();
            if (!this.f66653a.m68965r()) {
                this.f66653a.m68972k();
                return true;
            }
            return false;
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: e */
        public Class mo29564e() {
            return this.f66653a.m68968o();
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: f */
        public String mo29563f() {
            return this.f66653a.m68967p();
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: g */
        public void mo29562g() {
            this.f66653a.m68983B();
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: h */
        public void mo29561h(RealmSet realmSet, RealmChangeListener realmChangeListener) {
            this.f66653a.m68982D(realmSet, realmChangeListener);
        }

        @Override // io.realm.RealmSet.AbstractC11286c
        /* renamed from: i */
        public void mo29560i(RealmSet realmSet, SetChangeListener setChangeListener) {
            this.f66653a.m68981E(realmSet, setChangeListener);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f66653a.m68965r();
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
            return this.f66653a.m68964s();
        }

        @Override // io.realm.RealmCollection
        public boolean isLoaded() {
            return true;
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isManaged() {
            return true;
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isValid() {
            return this.f66653a.m68960w();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f66653a.m68959x();
        }

        /* renamed from: j */
        public final void m29570j(Object[] objArr) {
            if (objArr != null) {
                String simpleName = this.f66654b.getSimpleName();
                String simpleName2 = objArr.getClass().getComponentType().getSimpleName();
                if (simpleName.equals(simpleName2)) {
                    return;
                }
                throw new ArrayStoreException("Array type must be of type '" + simpleName + "' but it was of type '" + simpleName2 + "'.");
            }
            throw new NullPointerException("Cannot pass a null array when calling 'toArray'.");
        }

        /* renamed from: k */
        public final void m29569k(Collection collection) {
            if (collection != null) {
                return;
            }
            throw new NullPointerException("Collection must not be null.");
        }

        @Override // io.realm.RealmCollection
        public boolean load() {
            return true;
        }

        @Override // io.realm.RealmCollection
        public Number max(String str) {
            return where().max(str);
        }

        @Override // io.realm.RealmCollection
        public Date maxDate(String str) {
            return where().maximumDate(str);
        }

        @Override // io.realm.RealmCollection
        public Number min(String str) {
            return where().min(str);
        }

        @Override // io.realm.RealmCollection
        public Date minDate(String str) {
            return where().minimumDate(str);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return this.f66653a.m68957z(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            m29569k(collection);
            return this.f66653a.m68984A(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            m29569k(collection);
            return this.f66653a.m68980G(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f66653a.m68979I();
        }

        @Override // io.realm.RealmCollection
        public Number sum(String str) {
            return where().sum(str);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            Object[] objArr = new Object[size()];
            Iterator it = iterator();
            int i = 0;
            while (it.hasNext()) {
                objArr[i] = it.next();
                i++;
            }
            return objArr;
        }

        @Override // io.realm.RealmCollection
        public RealmQuery where() {
            return this.f66653a.mo22545J();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            m29570j(objArr);
            long size = size();
            Object[] objArr2 = (((long) objArr.length) == size || ((long) objArr.length) > size) ? objArr : (Object[]) Array.newInstance(this.f66654b, (int) size);
            Iterator it = iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (next == null) {
                    objArr2[i] = null;
                } else {
                    objArr2[i] = next;
                }
                i++;
            }
            if (objArr.length > size) {
                objArr2[i] = null;
            }
            return objArr2;
        }
    }

    public RealmSet(Collection<E> collection) {
        this.setStrategy = new C11287d(collection);
    }

    public RealmSet(BaseRealm baseRealm, OsSet osSet, Class<E> cls) {
        this.setStrategy = m29572b(baseRealm, osSet, cls);
    }

    public RealmSet(BaseRealm baseRealm, OsSet osSet, String str) {
        this.setStrategy = m29571c(baseRealm, osSet, str);
    }
}
