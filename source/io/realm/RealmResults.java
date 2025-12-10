package io.realm;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.realm.internal.OsResults;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import io.realm.p021rx.CollectionChange;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class RealmResults<E> extends AbstractC11423q {

    /* renamed from: io.realm.RealmResults$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11283a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66645a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f66645a = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66645a[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66645a[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66645a[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66645a[RealmFieldType.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66645a[RealmFieldType.DECIMAL128.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66645a[RealmFieldType.OBJECT_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66645a[RealmFieldType.UUID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66645a[RealmFieldType.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66645a[RealmFieldType.INTEGER_LIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66645a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66645a[RealmFieldType.STRING_LIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f66645a[RealmFieldType.BINARY_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f66645a[RealmFieldType.DATE_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f66645a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f66645a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f66645a[RealmFieldType.UUID_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f66645a[RealmFieldType.FLOAT_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f66645a[RealmFieldType.DOUBLE_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public RealmResults(BaseRealm baseRealm, OsResults osResults, Class cls) {
        this(baseRealm, osResults, cls, false);
    }

    /* renamed from: m */
    public static RealmResults m29590m(DynamicRealm dynamicRealm, UncheckedRow uncheckedRow, Table table, String str) {
        return new RealmResults(dynamicRealm, OsResults.createForBacklinks(dynamicRealm.sharedRealm, uncheckedRow, table, str), Table.getClassNameForTable(table.getName()));
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        super.add(i, obj);
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(int i, Collection collection) {
        return super.addAll(i, collection);
    }

    public void addChangeListener(RealmChangeListener<RealmResults<E>> realmChangeListener) {
        m29596g(realmChangeListener);
        this.f66913c.addListener((OsResults) this, (RealmChangeListener<OsResults>) realmChangeListener);
    }

    public Observable<CollectionChange<RealmResults<E>>> asChangesetObservable() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return baseRealm.configuration.getRxFactory().changesetsFrom((Realm) this.baseRealm, this);
        }
        if (baseRealm instanceof DynamicRealm) {
            return baseRealm.configuration.getRxFactory().changesetsFrom((DynamicRealm) baseRealm, this);
        }
        throw new UnsupportedOperationException(this.baseRealm.getClass() + " does not support RxJava2.");
    }

    public Flowable<RealmResults<E>> asFlowable() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return baseRealm.configuration.getRxFactory().from((Realm) this.baseRealm, this);
        }
        if (baseRealm instanceof DynamicRealm) {
            return baseRealm.configuration.getRxFactory().from((DynamicRealm) baseRealm, this);
        }
        throw new UnsupportedOperationException(this.baseRealm.getClass() + " does not support RxJava2.");
    }

    public String asJSON() {
        return this.f66913c.toJSON(-1);
    }

    @Override // io.realm.AbstractC11423q, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ double average(String str) {
        return super.average(str);
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractCollection, java.util.Collection, java.util.List, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean contains(@Nullable Object obj) {
        return super.contains(obj);
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ OrderedRealmCollectionSnapshot createSnapshot() {
        return super.createSnapshot();
    }

    @Override // io.realm.AbstractC11423q, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean deleteAllFromRealm() {
        return super.deleteAllFromRealm();
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ boolean deleteFirstFromRealm() {
        return super.deleteFirstFromRealm();
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ void deleteFromRealm(int i) {
        super.deleteFromRealm(i);
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ boolean deleteLastFromRealm() {
        return super.deleteLastFromRealm();
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object first() {
        return super.first();
    }

    /* renamed from: g */
    public final void m29596g(Object obj) {
        if (obj != null) {
            this.baseRealm.checkIfValid();
            this.baseRealm.sharedRealm.capabilities.checkCanDeliverNotification("Listeners cannot be used on current thread.");
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractList, java.util.List
    @Nullable
    public /* bridge */ /* synthetic */ Object get(int i) {
        return super.get(i);
    }

    @Override // io.realm.AbstractC11423q
    public /* bridge */ /* synthetic */ Realm getRealm() {
        return super.getRealm();
    }

    /* renamed from: h */
    public final void m29595h(Object obj, boolean z) {
        if (z && obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (this.baseRealm.isClosed()) {
            RealmLog.warn("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.baseRealm.configuration.getPath());
        }
    }

    /* renamed from: i */
    public final void m29594i(String str) {
        if (!Util.isEmptyString(str)) {
            return;
        }
        throw new IllegalArgumentException("Non-empty 'fieldname' required.");
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
        this.baseRealm.checkIfValid();
        return this.f66913c.isLoaded();
    }

    @Override // io.realm.AbstractC11423q, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isManaged() {
        return super.isManaged();
    }

    @Override // io.realm.AbstractC11423q, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isValid() {
        return super.isValid();
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    /* renamed from: j */
    public final Row m29593j(String str, RealmModel realmModel) {
        if (realmModel != null) {
            if (RealmObject.isManaged(realmModel) && RealmObject.isValid(realmModel)) {
                ProxyState realmGet$proxyState = ((RealmObjectProxy) realmModel).realmGet$proxyState();
                if (realmGet$proxyState.getRealm$realm().getPath().equals(this.baseRealm.getPath())) {
                    Table table = this.f66913c.getTable();
                    Table linkTarget = table.getLinkTarget(table.getColumnKey(str));
                    Table table2 = realmGet$proxyState.getRow$realm().getTable();
                    if (linkTarget.hasSameSchema(table2)) {
                        return realmGet$proxyState.getRow$realm();
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "Type of object is wrong. Was '%s', expected '%s'", table2.getClassName(), linkTarget.getClassName()));
                }
                throw new IllegalArgumentException("'value' does not belong to the same Realm as the RealmResults.");
            }
            throw new IllegalArgumentException("'value' is not a valid, managed Realm object.");
        }
        return null;
    }

    /* renamed from: k */
    public final void m29592k(String str, RealmFieldType realmFieldType) {
        String className = this.f66913c.getTable().getClassName();
        RealmFieldType fieldType = this.baseRealm.getSchema().get(className).getFieldType(str);
        if (fieldType == realmFieldType) {
            return;
        }
        throw new IllegalArgumentException(String.format("The field '%s.%s' is not of the expected type. Actual: %s, Expected: %s", className, str, fieldType, realmFieldType));
    }

    /* renamed from: l */
    public final void m29591l(RealmList realmList, Class cls) {
        if (!realmList.isEmpty()) {
            Class<?> cls2 = realmList.first().getClass();
            if (!cls.isAssignableFrom(cls2)) {
                throw new IllegalArgumentException(String.format("List contained the wrong type of elements. Elements of type '%s' was expected, but the actual type is '%s'", cls, cls2));
            }
        }
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object last() {
        return super.last();
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
        this.baseRealm.checkIfValid();
        this.f66913c.load();
        return true;
    }

    @Override // io.realm.AbstractC11423q, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number max(String str) {
        return super.max(str);
    }

    @Override // io.realm.AbstractC11423q, io.realm.RealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Date maxDate(String str) {
        return super.maxDate(str);
    }

    @Override // io.realm.AbstractC11423q, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number min(String str) {
        return super.min(str);
    }

    @Override // io.realm.AbstractC11423q, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Date minDate(String str) {
        return super.minDate(str);
    }

    /* renamed from: n */
    public final Class m29589n(RealmList realmList) {
        if (!realmList.isEmpty()) {
            return realmList.first().getClass();
        }
        return Long.class;
    }

    /* renamed from: o */
    public final String m29588o(String str) {
        if (this.baseRealm instanceof Realm) {
            String internalFieldName = this.baseRealm.getSchema().getColumnInfo(this.f66913c.getTable().getClassName()).getInternalFieldName(str);
            if (internalFieldName != null) {
                return internalFieldName;
            }
            throw new IllegalArgumentException(String.format("Field '%s' does not exists.", str));
        }
        return str;
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object remove(int i) {
        return super.remove(i);
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public void removeAllChangeListeners() {
        m29595h(null, false);
        this.f66913c.removeAllListeners();
    }

    public void removeChangeListener(RealmChangeListener<RealmResults<E>> realmChangeListener) {
        m29595h(realmChangeListener, true);
        this.f66913c.removeListener((OsResults) this, (RealmChangeListener<OsResults>) realmChangeListener);
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return super.set(i, obj);
    }

    public void setBlob(String str, @Nullable byte[] bArr) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.BINARY);
        this.f66913c.setBlob(m29588o, bArr);
    }

    public void setBoolean(String str, boolean z) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.BOOLEAN);
        this.f66913c.setBoolean(m29588o, z);
    }

    public void setByte(String str, byte b) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.INTEGER);
        this.f66913c.setInt(m29588o, b);
    }

    public void setDate(String str, @Nullable Date date) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.DATE);
        this.f66913c.setDate(m29588o, date);
    }

    public void setDecimal128(String str, @Nullable Decimal128 decimal128) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.DECIMAL128);
        this.f66913c.setDecimal128(m29588o, decimal128);
    }

    public void setDouble(String str, double d) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.DOUBLE);
        this.f66913c.setDouble(m29588o, d);
    }

    public void setFloat(String str, float f) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.FLOAT);
        this.f66913c.setFloat(m29588o, f);
    }

    public void setInt(String str, int i) {
        m29594i(str);
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.INTEGER);
        this.baseRealm.checkIfValidAndInTransaction();
        this.f66913c.setInt(m29588o, i);
    }

    public <T> void setList(String str, RealmList<T> realmList) {
        m29594i(str);
        String m29588o = m29588o(str);
        this.baseRealm.checkIfValidAndInTransaction();
        if (realmList != null) {
            RealmFieldType fieldType = this.baseRealm.getSchema().m29581g(this.f66913c.getTable().getClassName()).getFieldType(m29588o);
            switch (C11283a.f66645a[fieldType.ordinal()]) {
                case 9:
                    m29591l(realmList, RealmModel.class);
                    m29593j(m29588o, (RealmModel) realmList.first(null));
                    this.f66913c.setModelList(m29588o, realmList);
                    return;
                case 10:
                    Class m29589n = m29589n(realmList);
                    if (m29589n.equals(Integer.class)) {
                        this.f66913c.setIntegerList(m29588o, realmList);
                        return;
                    } else if (m29589n.equals(Long.class)) {
                        this.f66913c.setLongList(m29588o, realmList);
                        return;
                    } else if (m29589n.equals(Short.class)) {
                        this.f66913c.setShortList(m29588o, realmList);
                        return;
                    } else if (m29589n.equals(Byte.class)) {
                        this.f66913c.setByteList(m29588o, realmList);
                        return;
                    } else {
                        throw new IllegalArgumentException(String.format("List contained the wrong type of elements. Elements that can be mapped to Integers was expected, but the actual type is '%s'", m29589n));
                    }
                case 11:
                    m29591l(realmList, Boolean.class);
                    this.f66913c.setBooleanList(m29588o, realmList);
                    return;
                case 12:
                    m29591l(realmList, String.class);
                    this.f66913c.setStringList(m29588o, realmList);
                    return;
                case 13:
                    m29591l(realmList, byte[].class);
                    this.f66913c.setByteArrayList(m29588o, realmList);
                    return;
                case 14:
                    m29591l(realmList, Date.class);
                    this.f66913c.setDateList(m29588o, realmList);
                    return;
                case 15:
                    m29591l(realmList, Decimal128.class);
                    this.f66913c.setDecimal128List(m29588o, realmList);
                    return;
                case 16:
                    m29591l(realmList, ObjectId.class);
                    this.f66913c.setObjectIdList(m29588o, realmList);
                    return;
                case 17:
                    m29591l(realmList, UUID.class);
                    this.f66913c.setUUIDList(m29588o, realmList);
                    return;
                case 18:
                    m29591l(realmList, Float.class);
                    this.f66913c.setFloatList(m29588o, realmList);
                    return;
                case 19:
                    m29591l(realmList, Double.class);
                    this.f66913c.setDoubleList(m29588o, realmList);
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Field '%s' is not a list but a %s", m29588o, fieldType));
            }
        }
        throw new IllegalArgumentException("Non-null 'list' required");
    }

    public void setLong(String str, long j) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.INTEGER);
        this.f66913c.setInt(m29588o, j);
    }

    public void setNull(String str) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        this.f66913c.setNull(str);
    }

    public void setObject(String str, @Nullable RealmModel realmModel) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.OBJECT);
        this.f66913c.setObject(m29588o, m29593j(m29588o, realmModel));
    }

    public void setObjectId(String str, @Nullable ObjectId objectId) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.OBJECT_ID);
        this.f66913c.setObjectId(m29588o, objectId);
    }

    public void setShort(String str, short s) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.INTEGER);
        this.f66913c.setInt(m29588o, s);
    }

    public void setString(String str, @Nullable String str2) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.STRING);
        this.f66913c.setString(m29588o, str2);
    }

    public void setUUID(String str, @Nullable UUID uuid) {
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        m29592k(m29588o, RealmFieldType.UUID);
        this.f66913c.setUUID(m29588o, uuid);
    }

    public void setValue(String str, @Nullable Object obj) {
        String str2;
        m29594i(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String m29588o = m29588o(str);
        boolean z = obj instanceof String;
        if (z) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        String className = this.f66913c.getTable().getClassName();
        RealmObjectSchema realmObjectSchema = getRealm().getSchema().get(className);
        if (realmObjectSchema.hasField(m29588o)) {
            if (obj == null) {
                this.f66913c.setNull(m29588o);
                return;
            }
            RealmFieldType fieldType = realmObjectSchema.getFieldType(m29588o);
            if (z && fieldType != RealmFieldType.STRING) {
                switch (C11283a.f66645a[fieldType.ordinal()]) {
                    case 1:
                        obj = Boolean.valueOf(Boolean.parseBoolean(str2));
                        break;
                    case 2:
                        obj = Long.valueOf(Long.parseLong(str2));
                        break;
                    case 3:
                        obj = Float.valueOf(Float.parseFloat(str2));
                        break;
                    case 4:
                        obj = Double.valueOf(Double.parseDouble(str2));
                        break;
                    case 5:
                        obj = JsonUtils.stringToDate(str2);
                        break;
                    case 6:
                        obj = Decimal128.parse(str2);
                        break;
                    case 7:
                        obj = new ObjectId(str2);
                        break;
                    case 8:
                        obj = UUID.fromString(str2);
                        break;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.US, "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead", m29588o, obj));
                }
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class) {
                setBoolean(m29588o, ((Boolean) obj).booleanValue());
                return;
            } else if (cls == Short.class) {
                setShort(m29588o, ((Short) obj).shortValue());
                return;
            } else if (cls == Integer.class) {
                setInt(m29588o, ((Integer) obj).intValue());
                return;
            } else if (cls == Long.class) {
                setLong(m29588o, ((Long) obj).longValue());
                return;
            } else if (cls == Byte.class) {
                setByte(m29588o, ((Byte) obj).byteValue());
                return;
            } else if (cls == Float.class) {
                setFloat(m29588o, ((Float) obj).floatValue());
                return;
            } else if (cls == Double.class) {
                setDouble(m29588o, ((Double) obj).doubleValue());
                return;
            } else if (cls == String.class) {
                setString(m29588o, (String) obj);
                return;
            } else if (obj instanceof Date) {
                setDate(m29588o, (Date) obj);
                return;
            } else if (obj instanceof Decimal128) {
                setDecimal128(m29588o, (Decimal128) obj);
                return;
            } else if (obj instanceof ObjectId) {
                setObjectId(m29588o, (ObjectId) obj);
                return;
            } else if (obj instanceof UUID) {
                setUUID(m29588o, (UUID) obj);
                return;
            } else if (obj instanceof byte[]) {
                setBlob(m29588o, (byte[]) obj);
                return;
            } else if (obj instanceof RealmModel) {
                setObject(m29588o, (RealmModel) obj);
                return;
            } else if (cls == RealmList.class) {
                setList(m29588o, (RealmList) obj);
                return;
            } else {
                throw new IllegalArgumentException("Value is of a type not supported: " + obj.getClass());
            }
        }
        throw new IllegalArgumentException(String.format("Field '%s' could not be found in class '%s'", m29588o, className));
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ RealmResults sort(String str) {
        return super.sort(str);
    }

    @Override // io.realm.AbstractC11423q, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number sum(String str) {
        return super.sum(str);
    }

    @Override // io.realm.RealmCollection
    public RealmQuery<E> where() {
        this.baseRealm.checkIfValid();
        return RealmQuery.m29614d(this);
    }

    public RealmResults(BaseRealm baseRealm, OsResults osResults, Class cls, boolean z) {
        super(baseRealm, osResults, cls, AbstractC11423q.getCollectionOperator(z, baseRealm, osResults, cls, null));
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object first(@Nullable Object obj) {
        return super.first(obj);
    }

    @Override // io.realm.internal.Freezable
    public RealmResults<E> freeze() {
        if (isValid()) {
            BaseRealm freeze = this.baseRealm.freeze();
            OsResults freeze2 = this.f66913c.freeze(freeze.sharedRealm);
            String str = this.f66912b;
            if (str != null) {
                return new RealmResults<>(freeze, freeze2, str);
            }
            return new RealmResults<>(freeze, freeze2, this.f66911a);
        }
        throw new IllegalStateException("Only valid, managed RealmResults can be frozen.");
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object last(@Nullable Object obj) {
        return super.last(obj);
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    @Override // io.realm.AbstractC11423q, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ RealmResults sort(String str, Sort sort) {
        return super.sort(str, sort);
    }

    public RealmResults(BaseRealm baseRealm, OsResults osResults, String str) {
        this(baseRealm, osResults, str, false);
    }

    public void addChangeListener(OrderedRealmCollectionChangeListener<RealmResults<E>> orderedRealmCollectionChangeListener) {
        m29596g(orderedRealmCollectionChangeListener);
        this.f66913c.addListener((OsResults) this, (OrderedRealmCollectionChangeListener<OsResults>) orderedRealmCollectionChangeListener);
    }

    public void removeChangeListener(OrderedRealmCollectionChangeListener<RealmResults<E>> orderedRealmCollectionChangeListener) {
        m29595h(orderedRealmCollectionChangeListener, true);
        this.f66913c.removeListener((OsResults) this, (OrderedRealmCollectionChangeListener<OsResults>) orderedRealmCollectionChangeListener);
    }

    @Override // io.realm.AbstractC11423q, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ RealmResults sort(String[] strArr, Sort[] sortArr) {
        return super.sort(strArr, sortArr);
    }

    public RealmResults(BaseRealm baseRealm, OsResults osResults, String str, boolean z) {
        super(baseRealm, osResults, str, AbstractC11423q.getCollectionOperator(z, baseRealm, osResults, null, str));
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort, String str2, Sort sort2) {
        return sort(new String[]{str, str2}, new Sort[]{sort, sort2});
    }
}
