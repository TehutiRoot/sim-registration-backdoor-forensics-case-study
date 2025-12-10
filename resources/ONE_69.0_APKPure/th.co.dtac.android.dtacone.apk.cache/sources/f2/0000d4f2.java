package io.realm;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.realm.internal.InvalidRow;
import io.realm.internal.OsList;
import io.realm.internal.OsResults;
import io.realm.internal.RealmObjectProxy;
import io.realm.p021rx.CollectionChange;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class RealmList<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: a */
    public final AbstractC18038Ln0 f66668a;

    /* renamed from: b */
    public List f66669b;
    public final BaseRealm baseRealm;
    @Nullable
    protected String className;
    @Nullable
    protected Class<E> clazz;

    /* renamed from: io.realm.RealmList$b */
    /* loaded from: classes5.dex */
    public class C11244b implements Iterator {

        /* renamed from: a */
        public int f66670a;

        /* renamed from: b */
        public int f66671b;

        /* renamed from: c */
        public int f66672c;

        public C11244b() {
            this.f66670a = 0;
            this.f66671b = -1;
            this.f66672c = ((AbstractList) RealmList.this).modCount;
        }

        /* renamed from: a */
        public final void m29981a() {
            if (((AbstractList) RealmList.this).modCount == this.f66672c) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            RealmList.this.m29988g();
            m29981a();
            if (this.f66670a != RealmList.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            RealmList.this.m29988g();
            m29981a();
            int i = this.f66670a;
            try {
                Object obj = RealmList.this.get(i);
                this.f66671b = i;
                this.f66670a = i + 1;
                return obj;
            } catch (IndexOutOfBoundsException unused) {
                m29981a();
                throw new NoSuchElementException("Cannot access index " + i + " when size is " + RealmList.this.size() + ". Remember to check hasNext() before using next().");
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            RealmList.this.m29988g();
            if (this.f66671b >= 0) {
                m29981a();
                try {
                    RealmList.this.remove(this.f66671b);
                    int i = this.f66671b;
                    int i2 = this.f66670a;
                    if (i < i2) {
                        this.f66670a = i2 - 1;
                    }
                    this.f66671b = -1;
                    this.f66672c = ((AbstractList) RealmList.this).modCount;
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException("Cannot call remove() twice. Must call next() in between.");
        }
    }

    /* renamed from: io.realm.RealmList$c */
    /* loaded from: classes5.dex */
    public class C11245c extends C11244b implements ListIterator {
        public C11245c(int i) {
            super();
            if (i >= 0 && i <= RealmList.this.size()) {
                this.f66670a = i;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Starting location must be a valid index: [0, ");
            sb.append(RealmList.this.size() - 1);
            sb.append("]. Index was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            RealmList.this.baseRealm.checkIfValid();
            m29981a();
            try {
                int i = this.f66670a;
                RealmList.this.add(i, obj);
                this.f66671b = -1;
                this.f66670a = i + 1;
                this.f66672c = ((AbstractList) RealmList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f66670a != 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f66670a;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            m29981a();
            int i = this.f66670a - 1;
            try {
                Object obj = RealmList.this.get(i);
                this.f66670a = i;
                this.f66671b = i;
                return obj;
            } catch (IndexOutOfBoundsException unused) {
                m29981a();
                throw new NoSuchElementException("Cannot access index less than zero. This was " + i + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f66670a - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            RealmList.this.baseRealm.checkIfValid();
            if (this.f66671b >= 0) {
                m29981a();
                try {
                    RealmList.this.set(this.f66671b, obj);
                    this.f66672c = ((AbstractList) RealmList.this).modCount;
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException();
        }
    }

    public RealmList() {
        this.baseRealm = null;
        this.f66668a = null;
        this.f66669b = new ArrayList();
    }

    /* renamed from: h */
    private Object m29987h(boolean z, Object obj) {
        if (isManaged()) {
            m29988g();
            if (!this.f66668a.m67497o()) {
                return get(0);
            }
        } else {
            List list = this.f66669b;
            if (list != null && !list.isEmpty()) {
                return this.f66669b.get(0);
            }
        }
        if (!z) {
            return obj;
        }
        throw new IndexOutOfBoundsException("The list is empty.");
    }

    /* renamed from: l */
    public static boolean m29983l(Class cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    /* renamed from: m */
    private Object m29982m(boolean z, Object obj) {
        if (isManaged()) {
            m29988g();
            if (!this.f66668a.m67497o()) {
                return get(this.f66668a.m67491w() - 1);
            }
        } else {
            List list = this.f66669b;
            if (list != null && !list.isEmpty()) {
                List list2 = this.f66669b;
                return list2.get(list2.size() - 1);
            }
        }
        if (!z) {
            return obj;
        }
        throw new IndexOutOfBoundsException("The list is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, @Nullable E e) {
        if (isManaged()) {
            m29988g();
            this.f66668a.m67498l(i, e);
        } else {
            this.f66669b.add(i, e);
        }
        ((AbstractList) this).modCount++;
    }

    public void addChangeListener(OrderedRealmCollectionChangeListener<RealmList<E>> orderedRealmCollectionChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, orderedRealmCollectionChangeListener, true);
        this.f66668a.m67499k().addListener((OsList) this, (OrderedRealmCollectionChangeListener<OsList>) orderedRealmCollectionChangeListener);
    }

    public Observable<CollectionChange<RealmList<E>>> asChangesetObservable() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return baseRealm.configuration.getRxFactory().changesetsFrom((Realm) this.baseRealm, this);
        }
        if (baseRealm instanceof DynamicRealm) {
            return baseRealm.configuration.getRxFactory().changesetsFrom((DynamicRealm) baseRealm, this);
        }
        throw new UnsupportedOperationException(this.baseRealm.getClass() + " does not support RxJava2.");
    }

    public Flowable<RealmList<E>> asFlowable() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return baseRealm.configuration.getRxFactory().from((Realm) this.baseRealm, this);
        }
        if (baseRealm instanceof DynamicRealm) {
            return baseRealm.configuration.getRxFactory().from((DynamicRealm) this.baseRealm, this);
        }
        throw new UnsupportedOperationException(this.baseRealm.getClass() + " does not support RxJava2.");
    }

    @Override // io.realm.RealmCollection
    public double average(String str) {
        return where().average(str);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (isManaged()) {
            m29988g();
            this.f66668a.m67493s();
        } else {
            this.f66669b.clear();
        }
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, io.realm.RealmCollection
    public boolean contains(@Nullable Object obj) {
        if (isManaged()) {
            this.baseRealm.checkIfValid();
            if ((obj instanceof RealmObjectProxy) && ((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm() == InvalidRow.INSTANCE) {
                return false;
            }
            return super.contains(obj);
        }
        return this.f66669b.contains(obj);
    }

    @Override // io.realm.OrderedRealmCollection
    public OrderedRealmCollectionSnapshot<E> createSnapshot() {
        if (isManaged()) {
            m29988g();
            if (this.f66668a.mo26194i()) {
                if (this.className != null) {
                    BaseRealm baseRealm = this.baseRealm;
                    return new OrderedRealmCollectionSnapshot<>(baseRealm, OsResults.createFromQuery(baseRealm.sharedRealm, this.f66668a.m67499k().getQuery()), this.className);
                }
                BaseRealm baseRealm2 = this.baseRealm;
                return new OrderedRealmCollectionSnapshot<>(baseRealm2, OsResults.createFromQuery(baseRealm2.sharedRealm, this.f66668a.m67499k().getQuery()), this.clazz);
            }
            throw new UnsupportedOperationException("This feature is available only when the element type is implementing RealmModel.");
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // io.realm.RealmCollection
    public boolean deleteAllFromRealm() {
        if (isManaged()) {
            m29988g();
            if (!this.f66668a.m67497o()) {
                this.f66668a.m67501g();
                ((AbstractList) this).modCount++;
                return true;
            }
            return false;
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteFirstFromRealm() {
        if (isManaged()) {
            if (this.f66668a.m67497o()) {
                return false;
            }
            deleteFromRealm(0);
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // io.realm.OrderedRealmCollection
    public void deleteFromRealm(int i) {
        if (isManaged()) {
            m29988g();
            this.f66668a.m67502f(i);
            ((AbstractList) this).modCount++;
            return;
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteLastFromRealm() {
        if (isManaged()) {
            if (!this.f66668a.m67497o()) {
                this.f66668a.m67500h();
                ((AbstractList) this).modCount++;
                return true;
            }
            return false;
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // io.realm.OrderedRealmCollection
    @Nullable
    public E first() {
        return (E) m29987h(true, null);
    }

    /* renamed from: g */
    public final void m29988g() {
        this.baseRealm.checkIfValid();
    }

    @Override // java.util.AbstractList, java.util.List
    @Nullable
    public E get(int i) {
        if (isManaged()) {
            m29988g();
            return (E) this.f66668a.mo26193j(i);
        }
        return (E) this.f66669b.get(i);
    }

    public Realm getRealm() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm == null) {
            return null;
        }
        baseRealm.checkIfValid();
        BaseRealm baseRealm2 = this.baseRealm;
        if (baseRealm2 instanceof Realm) {
            return (Realm) baseRealm2;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }

    /* renamed from: i */
    public final AbstractC18038Ln0 m29986i(BaseRealm baseRealm, OsList osList, Class cls, String str) {
        if (cls != null && !m29983l(cls)) {
            if (cls == String.class) {
                return new RN1(baseRealm, osList, cls);
            }
            if (cls != Long.class && cls != Integer.class && cls != Short.class && cls != Byte.class) {
                if (cls == Boolean.class) {
                    return new C5364bc(baseRealm, osList, cls);
                }
                if (cls == byte[].class) {
                    return new C10374hb(baseRealm, osList, cls);
                }
                if (cls == Double.class) {
                    return new C1435UJ(baseRealm, osList, cls);
                }
                if (cls == Float.class) {
                    return new V20(baseRealm, osList, cls);
                }
                if (cls == Date.class) {
                    return new C1074PD(baseRealm, osList, cls);
                }
                if (cls == Decimal128.class) {
                    return new C10049dE(baseRealm, osList, cls);
                }
                if (cls == ObjectId.class) {
                    return new VJ0(baseRealm, osList, cls);
                }
                if (cls == UUID.class) {
                    return new QX1(baseRealm, osList, cls);
                }
                if (cls == RealmAny.class) {
                    return new C21033lt1(baseRealm, osList, cls);
                }
                throw new IllegalArgumentException("Unexpected value class: " + cls.getName());
            }
            return new C18100Mm0(baseRealm, osList, cls);
        }
        return new C21379nt1(baseRealm, osList, cls, str);
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm != null && baseRealm.isFrozen()) {
            return true;
        }
        return false;
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
        return true;
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isManaged() {
        if (this.baseRealm != null) {
            return true;
        }
        return false;
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isValid() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm == null) {
            return true;
        }
        if (baseRealm.isClosed()) {
            return false;
        }
        return m29984k();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @Nonnull
    public Iterator<E> iterator() {
        if (isManaged()) {
            return new C11244b();
        }
        return super.iterator();
    }

    /* renamed from: j */
    public OsList m29985j() {
        return this.f66668a.m67499k();
    }

    /* renamed from: k */
    public final boolean m29984k() {
        AbstractC18038Ln0 abstractC18038Ln0 = this.f66668a;
        if (abstractC18038Ln0 != null && abstractC18038Ln0.m67496p()) {
            return true;
        }
        return false;
    }

    @Override // io.realm.OrderedRealmCollection
    @Nullable
    public E last() {
        return (E) m29982m(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    @Nonnull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
        return true;
    }

    @Override // io.realm.RealmCollection
    @Nullable
    public Number max(String str) {
        return where().max(str);
    }

    @Override // io.realm.RealmCollection
    @Nullable
    public Date maxDate(String str) {
        return where().maximumDate(str);
    }

    @Override // io.realm.RealmCollection
    @Nullable
    public Number min(String str) {
        return where().min(str);
    }

    @Override // io.realm.RealmCollection
    @Nullable
    public Date minDate(String str) {
        return where().minimumDate(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void move(int i, int i2) {
        if (isManaged()) {
            m29988g();
            this.f66668a.m67495q(i, i2);
            return;
        }
        int size = this.f66669b.size();
        if (i >= 0 && size > i) {
            if (i2 >= 0 && size > i2) {
                this.f66669b.add(i2, this.f66669b.remove(i));
                return;
            }
            throw new IndexOutOfBoundsException("Invalid index " + i2 + ", size is " + size);
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + size);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        E e;
        if (isManaged()) {
            m29988g();
            e = get(i);
            this.f66668a.m67494r(i);
        } else {
            e = (E) this.f66669b.remove(i);
        }
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        if (isManaged() && !this.baseRealm.isInTransaction()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.removeAll(collection);
    }

    public void removeAllChangeListeners() {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, null, false);
        this.f66668a.m67499k().removeAllListeners();
    }

    public void removeChangeListener(OrderedRealmCollectionChangeListener<RealmList<E>> orderedRealmCollectionChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, orderedRealmCollectionChangeListener, true);
        this.f66668a.m67499k().removeListener((OsList) this, (OrderedRealmCollectionChangeListener<OsList>) orderedRealmCollectionChangeListener);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, @Nullable E e) {
        if (isManaged()) {
            m29988g();
            return (E) this.f66668a.m67492t(i, e);
        }
        return (E) this.f66669b.set(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (isManaged()) {
            m29988g();
            return this.f66668a.m67491w();
        }
        return this.f66669b.size();
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str) {
        return sort(str, Sort.ASCENDING);
    }

    @Override // io.realm.RealmCollection
    public Number sum(String str) {
        return where().sum(str);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (!isManaged()) {
            sb.append("RealmList<?>@[");
            int size = size();
            while (i < size) {
                E e = get(i);
                if (e instanceof RealmModel) {
                    sb.append(System.identityHashCode(e));
                } else if (e instanceof byte[]) {
                    sb.append("byte[");
                    sb.append(((byte[]) e).length);
                    sb.append("]");
                } else {
                    sb.append(e);
                }
                sb.append(",");
                i++;
            }
            if (size() > 0) {
                sb.setLength(sb.length() - 1);
            }
            sb.append("]");
        } else {
            sb.append("RealmList<");
            String str = this.className;
            if (str != null) {
                sb.append(str);
            } else if (m29983l(this.clazz)) {
                sb.append(this.baseRealm.getSchema().m29922f(this.clazz).getClassName());
            } else {
                Class<E> cls = this.clazz;
                if (cls == byte[].class) {
                    sb.append(cls.getSimpleName());
                } else {
                    sb.append(cls.getName());
                }
            }
            sb.append(">@[");
            if (!m29984k()) {
                sb.append("invalid");
            } else if (m29983l(this.clazz)) {
                while (i < size()) {
                    sb.append(((RealmObjectProxy) get(i)).realmGet$proxyState().getRow$realm().getObjectKey());
                    sb.append(",");
                    i++;
                }
                if (size() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            } else {
                while (i < size()) {
                    E e2 = get(i);
                    if (e2 instanceof byte[]) {
                        sb.append("byte[");
                        sb.append(((byte[]) e2).length);
                        sb.append("]");
                    } else {
                        sb.append(e2);
                    }
                    sb.append(",");
                    i++;
                }
                if (size() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // io.realm.RealmCollection
    public RealmQuery<E> where() {
        if (isManaged()) {
            m29988g();
            if (this.f66668a.mo26194i()) {
                return RealmQuery.m29955c(this);
            }
            throw new UnsupportedOperationException("This feature is available only when the element type is implementing RealmModel.");
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // io.realm.OrderedRealmCollection
    @Nullable
    public E first(@Nullable E e) {
        return (E) m29987h(false, e);
    }

    @Override // io.realm.internal.Freezable
    public RealmList<E> freeze() {
        if (isManaged()) {
            if (isValid()) {
                BaseRealm freeze = this.baseRealm.freeze();
                OsList freeze2 = m29985j().freeze(freeze.sharedRealm);
                String str = this.className;
                if (str != null) {
                    return new RealmList<>(str, freeze2, freeze);
                }
                return new RealmList<>(this.clazz, freeze2, freeze);
            }
            throw new IllegalStateException("Only valid, managed RealmLists can be frozen.");
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // io.realm.OrderedRealmCollection
    @Nullable
    public E last(@Nullable E e) {
        return (E) m29982m(false, e);
    }

    @Override // java.util.AbstractList, java.util.List
    @Nonnull
    public ListIterator<E> listIterator(int i) {
        if (isManaged()) {
            return new C11245c(i);
        }
        return super.listIterator(i);
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort) {
        if (isManaged()) {
            return where().sort(str, sort).findAll();
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    public void addChangeListener(RealmChangeListener<RealmList<E>> realmChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, realmChangeListener, true);
        this.f66668a.m67499k().addListener((OsList) this, (RealmChangeListener<OsList>) realmChangeListener);
    }

    public void removeChangeListener(RealmChangeListener<RealmList<E>> realmChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, realmChangeListener, true);
        this.f66668a.m67499k().removeListener((OsList) this, (RealmChangeListener<OsList>) realmChangeListener);
    }

    public RealmList(E... eArr) {
        if (eArr != null) {
            this.baseRealm = null;
            this.f66668a = null;
            ArrayList arrayList = new ArrayList(eArr.length);
            this.f66669b = arrayList;
            Collections.addAll(arrayList, eArr);
            return;
        }
        throw new IllegalArgumentException("The objects argument cannot be null");
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort, String str2, Sort sort2) {
        return sort(new String[]{str, str2}, new Sort[]{sort, sort2});
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(@Nullable E e) {
        if (isManaged()) {
            m29988g();
            this.f66668a.m67505a(e);
        } else {
            this.f66669b.add(e);
        }
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String[] strArr, Sort[] sortArr) {
        if (isManaged()) {
            return where().sort(strArr, sortArr).findAll();
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(@Nullable Object obj) {
        if (isManaged() && !this.baseRealm.isInTransaction()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.remove(obj);
    }

    public RealmList(Class cls, OsList osList, BaseRealm baseRealm) {
        this.clazz = cls;
        this.f66668a = m29986i(baseRealm, osList, cls, null);
        this.baseRealm = baseRealm;
    }

    public RealmList(String str, OsList osList, BaseRealm baseRealm) {
        this.baseRealm = baseRealm;
        this.className = str;
        this.f66668a = m29986i(baseRealm, osList, null, str);
    }
}