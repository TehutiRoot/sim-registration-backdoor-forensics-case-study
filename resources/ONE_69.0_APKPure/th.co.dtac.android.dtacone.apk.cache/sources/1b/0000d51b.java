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
    protected final AbstractC11273c setStrategy;

    /* renamed from: io.realm.RealmSet$c */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11273c implements Set, ManageableObject, RealmCollection {
        public AbstractC11273c() {
        }

        /* renamed from: a */
        public abstract void mo29908a(RealmSet realmSet, RealmChangeListener realmChangeListener);

        /* renamed from: b */
        public abstract void mo29907b(RealmSet realmSet, SetChangeListener setChangeListener);

        /* renamed from: c */
        public abstract RealmSet mo29906c();

        /* renamed from: d */
        public abstract OsSet mo29905d();

        /* renamed from: e */
        public abstract Class mo29904e();

        /* renamed from: f */
        public abstract String mo29903f();

        /* renamed from: g */
        public abstract void mo29902g();

        /* renamed from: h */
        public abstract void mo29901h(RealmSet realmSet, RealmChangeListener realmChangeListener);

        /* renamed from: i */
        public abstract void mo29900i(RealmSet realmSet, SetChangeListener setChangeListener);
    }

    /* renamed from: io.realm.RealmSet$d */
    /* loaded from: classes5.dex */
    public static class C11274d extends AbstractC11273c {

        /* renamed from: a */
        public final Set f66718a;

        public C11274d() {
            super();
            this.f66718a = new HashSet();
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: a */
        public void mo29908a(RealmSet realmSet, RealmChangeListener realmChangeListener) {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not support change listeners.");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            return this.f66718a.add(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f66718a.addAll(collection);
        }

        @Override // io.realm.RealmCollection
        public double average(String str) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: b */
        public void mo29907b(RealmSet realmSet, SetChangeListener setChangeListener) {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not support change listeners.");
        }

        @Override // io.realm.internal.Freezable
        /* renamed from: c */
        public RealmSet freeze() {
            throw new UnsupportedOperationException("Unmanaged RealmSets cannot be frozen.");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f66718a.clear();
        }

        @Override // java.util.Set, java.util.Collection, io.realm.RealmCollection, java.util.List
        public boolean contains(Object obj) {
            return this.f66718a.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f66718a.containsAll(collection);
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: d */
        public OsSet mo29905d() {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not have a representation in native code.");
        }

        @Override // io.realm.RealmCollection
        public boolean deleteAllFromRealm() {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: e */
        public Class mo29904e() {
            throw new UnsupportedOperationException("Unmanaged sets do not support retrieving the value class.");
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: f */
        public String mo29903f() {
            throw new UnsupportedOperationException("Unmanaged sets do not support retrieving the value class name.");
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: g */
        public void mo29902g() {
            throw new UnsupportedOperationException("Cannot remove change listeners because unmanaged RealmSets do not support change listeners.");
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: h */
        public void mo29901h(RealmSet realmSet, RealmChangeListener realmChangeListener) {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmSets do not support change listeners.");
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: i */
        public void mo29900i(RealmSet realmSet, SetChangeListener setChangeListener) {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmSets do not support change listeners.");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f66718a.isEmpty();
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
            return this.f66718a.iterator();
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
            return this.f66718a.remove(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f66718a.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f66718a.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f66718a.size();
        }

        @Override // io.realm.RealmCollection
        public Number sum(String str) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return this.f66718a.toArray();
        }

        @Override // io.realm.RealmCollection
        public RealmQuery where() {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return this.f66718a.toArray(objArr);
        }

        public C11274d(Collection collection) {
            this();
            this.f66718a.addAll(collection);
        }
    }

    public RealmSet() {
        this.setStrategy = new C11274d();
    }

    /* renamed from: b */
    public static C11272b m29912b(BaseRealm baseRealm, OsSet osSet, Class cls) {
        AbstractC23181yH1 c23186yJ0;
        if (CollectionUtils.m30089c(cls)) {
            return new C11272b(new C21725pt1(baseRealm, osSet, cls), cls);
        }
        if (cls == Boolean.class) {
            c23186yJ0 = new C5444cc(baseRealm, osSet, Boolean.class);
        } else if (cls == String.class) {
            c23186yJ0 = new TN1(baseRealm, osSet, String.class);
        } else if (cls == Integer.class) {
            c23186yJ0 = new C22201sf0(baseRealm, osSet, Integer.class);
        } else if (cls == Long.class) {
            c23186yJ0 = new C18165Nm0(baseRealm, osSet, Long.class);
        } else if (cls == Short.class) {
            c23186yJ0 = new C22492uI1(baseRealm, osSet, Short.class);
        } else if (cls == Byte.class) {
            c23186yJ0 = new C1305Sf(baseRealm, osSet, Byte.class);
        } else if (cls == Float.class) {
            c23186yJ0 = new W20(baseRealm, osSet, Float.class);
        } else if (cls == Double.class) {
            c23186yJ0 = new C1506VJ(baseRealm, osSet, Double.class);
        } else if (cls == byte[].class) {
            c23186yJ0 = new C10463ib(baseRealm, osSet, byte[].class);
        } else if (cls == Date.class) {
            c23186yJ0 = new C1144QD(baseRealm, osSet, Date.class);
        } else if (cls == Decimal128.class) {
            c23186yJ0 = new C10132eE(baseRealm, osSet, Decimal128.class);
        } else if (cls == ObjectId.class) {
            c23186yJ0 = new WJ0(baseRealm, osSet, ObjectId.class);
        } else if (cls == UUID.class) {
            c23186yJ0 = new RX1(baseRealm, osSet, UUID.class);
        } else if (cls == RealmAny.class) {
            c23186yJ0 = new C11467s(baseRealm, osSet, RealmAny.class);
        } else if (cls == Number.class) {
            c23186yJ0 = new C23186yJ0(baseRealm, osSet, Number.class);
        } else {
            throw new UnsupportedOperationException("getStrategy: missing class '" + cls.getSimpleName() + OperatorName.SHOW_TEXT_LINE);
        }
        return new C11272b(c23186yJ0, cls);
    }

    /* renamed from: c */
    public static C11272b m29911c(BaseRealm baseRealm, OsSet osSet, String str) {
        AbstractC23181yH1 c0650jl;
        if (str.equals(Boolean.class.getCanonicalName())) {
            c0650jl = new C5444cc(baseRealm, osSet, Boolean.class);
        } else if (str.equals(String.class.getCanonicalName())) {
            c0650jl = new TN1(baseRealm, osSet, String.class);
        } else if (str.equals(Integer.class.getCanonicalName())) {
            c0650jl = new C22201sf0(baseRealm, osSet, Integer.class);
        } else if (str.equals(Long.class.getCanonicalName())) {
            c0650jl = new C18165Nm0(baseRealm, osSet, Long.class);
        } else if (str.equals(Short.class.getCanonicalName())) {
            c0650jl = new C22492uI1(baseRealm, osSet, Short.class);
        } else if (str.equals(Byte.class.getCanonicalName())) {
            c0650jl = new C1305Sf(baseRealm, osSet, Byte.class);
        } else if (str.equals(Float.class.getCanonicalName())) {
            c0650jl = new W20(baseRealm, osSet, Float.class);
        } else if (str.equals(Double.class.getCanonicalName())) {
            c0650jl = new C1506VJ(baseRealm, osSet, Double.class);
        } else if (str.equals(byte[].class.getCanonicalName())) {
            c0650jl = new C10463ib(baseRealm, osSet, byte[].class);
        } else if (str.equals(Date.class.getCanonicalName())) {
            c0650jl = new C1144QD(baseRealm, osSet, Date.class);
        } else if (str.equals(Decimal128.class.getCanonicalName())) {
            c0650jl = new C10132eE(baseRealm, osSet, Decimal128.class);
        } else if (str.equals(ObjectId.class.getCanonicalName())) {
            c0650jl = new WJ0(baseRealm, osSet, ObjectId.class);
        } else if (str.equals(UUID.class.getCanonicalName())) {
            c0650jl = new RX1(baseRealm, osSet, UUID.class);
        } else if (str.equals(RealmAny.class.getCanonicalName())) {
            c0650jl = new C11467s(baseRealm, osSet, RealmAny.class);
        } else {
            c0650jl = new C0650JL(baseRealm, osSet, str);
        }
        return new C11272b(c0650jl, c0650jl.m389o());
    }

    /* renamed from: a */
    public OsSet m29913a() {
        return this.setStrategy.mo29905d();
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
        this.setStrategy.mo29908a(this, realmChangeListener);
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
        return this.setStrategy.mo29904e();
    }

    public String getValueClassName() {
        return this.setStrategy.mo29903f();
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
        this.setStrategy.mo29902g();
    }

    public void removeChangeListener(RealmChangeListener<RealmSet<E>> realmChangeListener) {
        this.setStrategy.mo29901h(this, realmChangeListener);
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
        this.setStrategy.mo29907b(this, setChangeListener);
    }

    @Override // io.realm.internal.Freezable
    public RealmSet<E> freeze() {
        return this.setStrategy.mo29906c();
    }

    public void removeChangeListener(SetChangeListener<E> setChangeListener) {
        this.setStrategy.mo29900i(this, setChangeListener);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.setStrategy.toArray(tArr);
    }

    /* renamed from: io.realm.RealmSet$b */
    /* loaded from: classes5.dex */
    public static class C11272b extends AbstractC11273c {

        /* renamed from: a */
        public final AbstractC23181yH1 f66716a;

        /* renamed from: b */
        public Class f66717b;

        public C11272b(AbstractC23181yH1 abstractC23181yH1, Class cls) {
            super();
            this.f66716a = abstractC23181yH1;
            this.f66717b = cls;
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: a */
        public void mo29908a(RealmSet realmSet, RealmChangeListener realmChangeListener) {
            this.f66716a.m398d(realmSet, realmChangeListener);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            return this.f66716a.mo323a(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            m29909k(collection);
            return this.f66716a.m399b(collection);
        }

        @Override // io.realm.RealmCollection
        public double average(String str) {
            return where().average(str);
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: b */
        public void mo29907b(RealmSet realmSet, SetChangeListener setChangeListener) {
            this.f66716a.m397e(realmSet, setChangeListener);
        }

        @Override // io.realm.internal.Freezable
        /* renamed from: c */
        public RealmSet freeze() {
            return this.f66716a.m392l();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f66716a.m396f();
        }

        @Override // java.util.Set, java.util.Collection, io.realm.RealmCollection, java.util.List
        public boolean contains(Object obj) {
            return this.f66716a.m395g(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            m29909k(collection);
            return this.f66716a.m394h(collection);
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: d */
        public OsSet mo29905d() {
            return this.f66716a.m390n();
        }

        @Override // io.realm.RealmCollection
        public boolean deleteAllFromRealm() {
            this.f66716a.f108990a.checkIfValid();
            if (!this.f66716a.m386r()) {
                this.f66716a.m393k();
                return true;
            }
            return false;
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: e */
        public Class mo29904e() {
            return this.f66716a.m389o();
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: f */
        public String mo29903f() {
            return this.f66716a.m388p();
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: g */
        public void mo29902g() {
            this.f66716a.m405B();
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: h */
        public void mo29901h(RealmSet realmSet, RealmChangeListener realmChangeListener) {
            this.f66716a.m404D(realmSet, realmChangeListener);
        }

        @Override // io.realm.RealmSet.AbstractC11273c
        /* renamed from: i */
        public void mo29900i(RealmSet realmSet, SetChangeListener setChangeListener) {
            this.f66716a.m403E(realmSet, setChangeListener);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f66716a.m386r();
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
            return this.f66716a.m385s();
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
            return this.f66716a.m381w();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f66716a.m380x();
        }

        /* renamed from: j */
        public final void m29910j(Object[] objArr) {
            if (objArr != null) {
                String simpleName = this.f66717b.getSimpleName();
                String simpleName2 = objArr.getClass().getComponentType().getSimpleName();
                if (simpleName.equals(simpleName2)) {
                    return;
                }
                throw new ArrayStoreException("Array type must be of type '" + simpleName + "' but it was of type '" + simpleName2 + "'.");
            }
            throw new NullPointerException("Cannot pass a null array when calling 'toArray'.");
        }

        /* renamed from: k */
        public final void m29909k(Collection collection) {
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
            return this.f66716a.m378z(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            m29909k(collection);
            return this.f66716a.m406A(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            m29909k(collection);
            return this.f66716a.m402G(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f66716a.m401I();
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
            return this.f66716a.mo400J();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            m29910j(objArr);
            long size = size();
            Object[] objArr2 = (((long) objArr.length) == size || ((long) objArr.length) > size) ? objArr : (Object[]) Array.newInstance(this.f66717b, (int) size);
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
        this.setStrategy = new C11274d(collection);
    }

    public RealmSet(BaseRealm baseRealm, OsSet osSet, Class<E> cls) {
        this.setStrategy = m29912b(baseRealm, osSet, cls);
    }

    public RealmSet(BaseRealm baseRealm, OsSet osSet, String str) {
        this.setStrategy = m29911c(baseRealm, osSet, str);
    }
}