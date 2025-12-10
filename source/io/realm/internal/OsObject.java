package io.realm.internal;

import io.realm.ObjectChangeSet;
import io.realm.RealmFieldType;
import io.realm.RealmModel;
import io.realm.RealmObjectChangeListener;
import io.realm.exceptions.RealmException;
import io.realm.internal.ObserverPairList;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.ObjectId;

@Keep
/* loaded from: classes5.dex */
public class OsObject implements NativeObject {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private ObserverPairList<ObjectObserverPair> observerPairs = new ObserverPairList<>();

    /* loaded from: classes5.dex */
    public static class ObjectObserverPair<T extends RealmModel> extends ObserverPairList.ObserverPair<T, RealmObjectChangeListener<T>> {
        public ObjectObserverPair(T t, RealmObjectChangeListener<T> realmObjectChangeListener) {
            super(t, realmObjectChangeListener);
        }

        public void onChange(T t, @Nullable ObjectChangeSet objectChangeSet) {
            ((RealmObjectChangeListener) this.listener).onChange(t, objectChangeSet);
        }
    }

    /* renamed from: io.realm.internal.OsObject$a */
    /* loaded from: classes5.dex */
    public static class C11300a implements ObserverPairList.Callback {

        /* renamed from: a */
        public final String[] f66704a;

        public C11300a(String[] strArr) {
            this.f66704a = strArr;
        }

        /* renamed from: a */
        public final ObjectChangeSet m29549a() {
            boolean z;
            String[] strArr = this.f66704a;
            if (strArr == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                strArr = new String[0];
            }
            return new C11301b(strArr, z);
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        /* renamed from: b */
        public void onCalled(ObjectObserverPair objectObserverPair, Object obj) {
            objectObserverPair.onChange((RealmModel) obj, m29549a());
        }
    }

    /* renamed from: io.realm.internal.OsObject$b */
    /* loaded from: classes5.dex */
    public static class C11301b implements ObjectChangeSet {

        /* renamed from: a */
        public final String[] f66705a;

        /* renamed from: b */
        public final boolean f66706b;

        public C11301b(String[] strArr, boolean z) {
            this.f66705a = strArr;
            this.f66706b = z;
        }

        @Override // io.realm.ObjectChangeSet
        public String[] getChangedFields() {
            return this.f66705a;
        }

        @Override // io.realm.ObjectChangeSet
        public boolean isDeleted() {
            return this.f66706b;
        }

        @Override // io.realm.ObjectChangeSet
        public boolean isFieldChanged(String str) {
            for (String str2 : this.f66705a) {
                if (str2.equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.addReference(this);
    }

    public static UncheckedRow create(Table table) {
        return new UncheckedRow(table.getSharedRealm().context, table, nativeCreateNewObject(table.getNativePtr()));
    }

    public static long createEmbeddedObject(Table table, long j, long j2) {
        return nativeCreateEmbeddedObject(table.getNativePtr(), j, j2);
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.getNativePtr());
    }

    public static long createRowWithPrimaryKey(Table table, long j, @Nullable Object obj) {
        long parseLong;
        boolean z;
        RealmFieldType columnType = table.getColumnType(j);
        OsSharedRealm sharedRealm = table.getSharedRealm();
        if (columnType == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + obj);
            }
            return nativeCreateRowWithStringPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, (String) obj);
        } else if (columnType == RealmFieldType.INTEGER) {
            if (obj == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(obj.toString());
            }
            long j2 = parseLong;
            long nativePtr = sharedRealm.getNativePtr();
            long nativePtr2 = table.getNativePtr();
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            return nativeCreateRowWithLongPrimaryKey(nativePtr, nativePtr2, j, j2, z);
        } else {
            String str = null;
            if (columnType == RealmFieldType.OBJECT_ID) {
                if (obj != null && !(obj instanceof ObjectId)) {
                    throw new IllegalArgumentException("Primary key value is not an ObjectId: " + obj);
                }
                if (obj != null) {
                    str = obj.toString();
                }
                return nativeCreateRowWithObjectIdPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, str);
            } else if (columnType == RealmFieldType.UUID) {
                if (obj != null && !(obj instanceof UUID)) {
                    throw new IllegalArgumentException("Primary key value is not an UUID: " + obj);
                }
                if (obj != null) {
                    str = obj.toString();
                }
                return nativeCreateRowWithUUIDPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, str);
            } else {
                throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + columnType);
            }
        }
    }

    public static UncheckedRow createWithPrimaryKey(Table table, @Nullable Object obj) {
        String obj2;
        String obj3;
        long parseLong;
        boolean z;
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType columnType = table.getColumnType(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm sharedRealm = table.getSharedRealm();
        if (columnType == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + obj);
            }
            return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithStringPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
        } else if (columnType == RealmFieldType.INTEGER) {
            if (obj == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(obj.toString());
            }
            long j = parseLong;
            NativeContext nativeContext = sharedRealm.context;
            long nativePtr = sharedRealm.getNativePtr();
            long nativePtr2 = table.getNativePtr();
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            return new UncheckedRow(nativeContext, table, nativeCreateNewObjectWithLongPrimaryKey(nativePtr, nativePtr2, andVerifyPrimaryKeyColumnIndex, j, z));
        } else if (columnType == RealmFieldType.OBJECT_ID) {
            if (obj == null) {
                obj3 = null;
            } else {
                obj3 = obj.toString();
            }
            return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj3));
        } else if (columnType == RealmFieldType.UUID) {
            if (obj == null) {
                obj2 = null;
            } else {
                obj2 = obj.toString();
            }
            return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithUUIDPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj2));
        } else {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + columnType);
        }
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(table.getSharedRealm(), table.getClassName());
        if (primaryKeyForObject != null) {
            return table.getColumnKey(primaryKeyForObject);
        }
        throw new IllegalStateException(table.getName() + " has no primary key defined.");
    }

    private static native long nativeCreate(long j, long j2);

    private static native long nativeCreateEmbeddedObject(long j, long j2, long j3);

    private static native long nativeCreateNewObject(long j);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateRow(long j);

    private static native long nativeCreateRowWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.foreach(new C11300a(strArr));
    }

    public <T extends RealmModel> void addListener(T t, RealmObjectChangeListener<T> realmObjectChangeListener) {
        if (this.observerPairs.isEmpty()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.add(new ObjectObserverPair(t, realmObjectChangeListener));
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativePtr;
    }

    public <T extends RealmModel> void removeListener(T t) {
        this.observerPairs.m29551a(t);
        if (this.observerPairs.isEmpty()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(ObserverPairList<ObjectObserverPair> observerPairList) {
        if (this.observerPairs.isEmpty()) {
            this.observerPairs = observerPairList;
            if (!observerPairList.isEmpty()) {
                nativeStartListening(this.nativePtr);
                return;
            }
            return;
        }
        throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
    }

    public <T extends RealmModel> void removeListener(T t, RealmObjectChangeListener<T> realmObjectChangeListener) {
        this.observerPairs.remove(t, realmObjectChangeListener);
        if (this.observerPairs.isEmpty()) {
            nativeStopListening(this.nativePtr);
        }
    }
}
