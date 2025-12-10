package io.realm.internal;

import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmChangeListener;
import io.realm.internal.ObservableCollection;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class OsList implements NativeObject, ObservableCollection, OsCollection {

    /* renamed from: e */
    public static final long f66693e = nativeGetFinalizerPtr();

    /* renamed from: a */
    public final long f66694a;

    /* renamed from: b */
    public final NativeContext f66695b;

    /* renamed from: c */
    public final Table f66696c;

    /* renamed from: d */
    public final ObserverPairList f66697d = new ObserverPairList();

    public OsList(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm sharedRealm = uncheckedRow.getTable().getSharedRealm();
        long[] nativeCreate = nativeCreate(sharedRealm.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.f66694a = nativeCreate[0];
        NativeContext nativeContext = sharedRealm.context;
        this.f66695b = nativeContext;
        nativeContext.addReference(this);
        if (nativeCreate[1] != 0) {
            this.f66696c = new Table(sharedRealm, nativeCreate[1]);
        } else {
            this.f66696c = null;
        }
    }

    private static native void nativeAddBinary(long j, @Nullable byte[] bArr);

    private static native void nativeAddBoolean(long j, boolean z);

    private static native void nativeAddDate(long j, long j2);

    private static native void nativeAddDecimal128(long j, long j2, long j3);

    private static native void nativeAddDouble(long j, double d);

    private static native void nativeAddFloat(long j, float f);

    private static native void nativeAddLong(long j, long j2);

    private static native void nativeAddNull(long j);

    private static native void nativeAddObjectId(long j, String str);

    private static native void nativeAddRealmAny(long j, long j2);

    private static native void nativeAddRow(long j, long j2);

    private static native void nativeAddString(long j, @Nullable String str);

    private static native void nativeAddUUID(long j, String str);

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native long nativeCreateAndAddEmbeddedObject(long j, long j2);

    private static native long nativeCreateAndSetEmbeddedObject(long j, long j2);

    private static native void nativeDelete(long j, long j2);

    private static native void nativeDeleteAll(long j);

    private static native long nativeFreeze(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j);

    private static native long nativeGetRow(long j, long j2);

    private static native Object nativeGetValue(long j, long j2);

    private static native void nativeInsertBinary(long j, long j2, @Nullable byte[] bArr);

    private static native void nativeInsertBoolean(long j, long j2, boolean z);

    private static native void nativeInsertDate(long j, long j2, long j3);

    private static native void nativeInsertDecimal128(long j, long j2, long j3, long j4);

    private static native void nativeInsertDouble(long j, long j2, double d);

    private static native void nativeInsertFloat(long j, long j2, float f);

    private static native void nativeInsertLong(long j, long j2, long j3);

    private static native void nativeInsertNull(long j, long j2);

    private static native void nativeInsertObjectId(long j, long j2, String str);

    private static native void nativeInsertRealmAny(long j, long j2, long j3);

    private static native void nativeInsertRow(long j, long j2, long j3);

    private static native void nativeInsertString(long j, long j2, @Nullable String str);

    private static native void nativeInsertUUID(long j, long j2, String str);

    private static native boolean nativeIsValid(long j);

    private static native void nativeMove(long j, long j2, long j3);

    private static native void nativeRemove(long j, long j2);

    private static native void nativeRemoveAll(long j);

    private static native void nativeSetBinary(long j, long j2, @Nullable byte[] bArr);

    private static native void nativeSetBoolean(long j, long j2, boolean z);

    private static native void nativeSetDate(long j, long j2, long j3);

    private static native void nativeSetDecimal128(long j, long j2, long j3, long j4);

    private static native void nativeSetDouble(long j, long j2, double d);

    private static native void nativeSetFloat(long j, long j2, float f);

    private static native void nativeSetLong(long j, long j2, long j3);

    private static native void nativeSetNull(long j, long j2);

    private static native void nativeSetObjectId(long j, long j2, String str);

    private static native void nativeSetRealmAny(long j, long j2, long j3);

    private static native void nativeSetRow(long j, long j2, long j3);

    private static native void nativeSetString(long j, long j2, @Nullable String str);

    private static native void nativeSetUUID(long j, long j2, String str);

    private static native long nativeSize(long j);

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    public void addBinary(@Nullable byte[] bArr) {
        nativeAddBinary(this.f66694a, bArr);
    }

    public void addBoolean(boolean z) {
        nativeAddBoolean(this.f66694a, z);
    }

    public void addDate(@Nullable Date date) {
        if (date == null) {
            nativeAddNull(this.f66694a);
        } else {
            nativeAddDate(this.f66694a, date.getTime());
        }
    }

    public void addDecimal128(@Nullable Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeAddNull(this.f66694a);
        } else {
            nativeAddDecimal128(this.f66694a, decimal128.getLow(), decimal128.getHigh());
        }
    }

    public void addDouble(double d) {
        nativeAddDouble(this.f66694a, d);
    }

    public void addFloat(float f) {
        nativeAddFloat(this.f66694a, f);
    }

    public <T> void addListener(T t, OrderedRealmCollectionChangeListener<T> orderedRealmCollectionChangeListener) {
        if (this.f66697d.isEmpty()) {
            nativeStartListening(this.f66694a);
        }
        this.f66697d.add(new ObservableCollection.CollectionObserverPair(t, orderedRealmCollectionChangeListener));
    }

    public void addLong(long j) {
        nativeAddLong(this.f66694a, j);
    }

    public void addNull() {
        nativeAddNull(this.f66694a);
    }

    public void addObjectId(@Nullable ObjectId objectId) {
        if (objectId == null) {
            nativeAddNull(this.f66694a);
        } else {
            nativeAddObjectId(this.f66694a, objectId.toString());
        }
    }

    public void addRealmAny(long j) {
        nativeAddRealmAny(this.f66694a, j);
    }

    public void addRow(long j) {
        nativeAddRow(this.f66694a, j);
    }

    public void addString(@Nullable String str) {
        nativeAddString(this.f66694a, str);
    }

    public void addUUID(@Nullable UUID uuid) {
        if (uuid == null) {
            nativeAddNull(this.f66694a);
        } else {
            nativeAddUUID(this.f66694a, uuid.toString());
        }
    }

    public long createAndAddEmbeddedObject() {
        return nativeCreateAndAddEmbeddedObject(this.f66694a, size());
    }

    public long createAndSetEmbeddedObject(long j) {
        return nativeCreateAndSetEmbeddedObject(this.f66694a, j);
    }

    public void delete(long j) {
        nativeDelete(this.f66694a, j);
    }

    public void deleteAll() {
        nativeDeleteAll(this.f66694a);
    }

    public OsList freeze(OsSharedRealm osSharedRealm) {
        Table table;
        long nativeFreeze = nativeFreeze(this.f66694a, osSharedRealm.getNativePtr());
        Table table2 = this.f66696c;
        if (table2 != null) {
            table = table2.freeze(osSharedRealm);
        } else {
            table = null;
        }
        return new OsList(osSharedRealm, nativeFreeze, table);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66693e;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.f66694a;
    }

    public TableQuery getQuery() {
        return new TableQuery(this.f66695b, this.f66696c, nativeGetQuery(this.f66694a));
    }

    public Table getTargetTable() {
        return this.f66696c;
    }

    public UncheckedRow getUncheckedRow(long j) {
        return this.f66696c.getUncheckedRowByPointer(nativeGetRow(this.f66694a, j));
    }

    @Nullable
    public Object getValue(long j) {
        return nativeGetValue(this.f66694a, j);
    }

    public void insertBinary(long j, @Nullable byte[] bArr) {
        nativeInsertBinary(this.f66694a, j, bArr);
    }

    public void insertBoolean(long j, boolean z) {
        nativeInsertBoolean(this.f66694a, j, z);
    }

    public void insertDate(long j, @Nullable Date date) {
        if (date == null) {
            nativeInsertNull(this.f66694a, j);
        } else {
            nativeInsertDate(this.f66694a, j, date.getTime());
        }
    }

    public void insertDecimal128(long j, @Nullable Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeInsertNull(this.f66694a, j);
        } else {
            nativeInsertDecimal128(this.f66694a, j, decimal128.getLow(), decimal128.getHigh());
        }
    }

    public void insertDouble(long j, double d) {
        nativeInsertDouble(this.f66694a, j, d);
    }

    public void insertFloat(long j, float f) {
        nativeInsertFloat(this.f66694a, j, f);
    }

    public void insertLong(long j, long j2) {
        nativeInsertLong(this.f66694a, j, j2);
    }

    public void insertNull(long j) {
        nativeInsertNull(this.f66694a, j);
    }

    public void insertObjectId(long j, @Nullable ObjectId objectId) {
        if (objectId == null) {
            nativeInsertNull(this.f66694a, j);
        } else {
            nativeInsertObjectId(this.f66694a, j, objectId.toString());
        }
    }

    public void insertRealmAny(long j, long j2) {
        nativeInsertRealmAny(this.f66694a, j, j2);
    }

    public void insertRow(long j, long j2) {
        nativeInsertRow(this.f66694a, j, j2);
    }

    public void insertString(long j, @Nullable String str) {
        nativeInsertString(this.f66694a, j, str);
    }

    public void insertUUID(long j, @Nullable UUID uuid) {
        if (uuid == null) {
            nativeInsertNull(this.f66694a, j);
        } else {
            nativeInsertUUID(this.f66694a, j, uuid.toString());
        }
    }

    public boolean isEmpty() {
        if (nativeSize(this.f66694a) <= 0) {
            return true;
        }
        return false;
    }

    @Override // io.realm.internal.OsCollection
    public boolean isValid() {
        return nativeIsValid(this.f66694a);
    }

    public void move(long j, long j2) {
        nativeMove(this.f66694a, j, j2);
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j) {
        OsCollectionChangeSet osCollectionChangeSet = new OsCollectionChangeSet(j, false);
        if (osCollectionChangeSet.isEmpty()) {
            return;
        }
        this.f66697d.foreach(new ObservableCollection.Callback(osCollectionChangeSet));
    }

    public void remove(long j) {
        nativeRemove(this.f66694a, j);
    }

    public void removeAll() {
        nativeRemoveAll(this.f66694a);
    }

    public void removeAllListeners() {
        this.f66697d.clear();
        nativeStopListening(this.f66694a);
    }

    public <T> void removeListener(T t, OrderedRealmCollectionChangeListener<T> orderedRealmCollectionChangeListener) {
        this.f66697d.remove(t, orderedRealmCollectionChangeListener);
        if (this.f66697d.isEmpty()) {
            nativeStopListening(this.f66694a);
        }
    }

    public void setBinary(long j, @Nullable byte[] bArr) {
        nativeSetBinary(this.f66694a, j, bArr);
    }

    public void setBoolean(long j, boolean z) {
        nativeSetBoolean(this.f66694a, j, z);
    }

    public void setDate(long j, @Nullable Date date) {
        if (date == null) {
            nativeSetNull(this.f66694a, j);
        } else {
            nativeSetDate(this.f66694a, j, date.getTime());
        }
    }

    public void setDecimal128(long j, @Nullable Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeSetNull(this.f66694a, j);
        } else {
            nativeSetDecimal128(this.f66694a, j, decimal128.getLow(), decimal128.getHigh());
        }
    }

    public void setDouble(long j, double d) {
        nativeSetDouble(this.f66694a, j, d);
    }

    public void setFloat(long j, float f) {
        nativeSetFloat(this.f66694a, j, f);
    }

    public void setLong(long j, long j2) {
        nativeSetLong(this.f66694a, j, j2);
    }

    public void setNull(long j) {
        nativeSetNull(this.f66694a, j);
    }

    public void setObjectId(long j, @Nullable ObjectId objectId) {
        if (objectId == null) {
            nativeSetNull(this.f66694a, j);
        } else {
            nativeSetObjectId(this.f66694a, j, objectId.toString());
        }
    }

    public void setRealmAny(long j, long j2) {
        nativeSetRealmAny(this.f66694a, j, j2);
    }

    public void setRow(long j, long j2) {
        nativeSetRow(this.f66694a, j, j2);
    }

    public void setString(long j, @Nullable String str) {
        nativeSetString(this.f66694a, j, str);
    }

    public void setUUID(long j, @Nullable UUID uuid) {
        if (uuid == null) {
            nativeSetNull(this.f66694a, j);
        } else {
            nativeSetUUID(this.f66694a, j, uuid.toString());
        }
    }

    public long size() {
        return nativeSize(this.f66694a);
    }

    public long createAndAddEmbeddedObject(long j) {
        return nativeCreateAndAddEmbeddedObject(this.f66694a, j);
    }

    public <T> void removeListener(T t, RealmChangeListener<T> realmChangeListener) {
        removeListener((OsList) t, (OrderedRealmCollectionChangeListener<OsList>) new ObservableCollection.RealmChangeListenerWrapper(realmChangeListener));
    }

    public <T> void addListener(T t, RealmChangeListener<T> realmChangeListener) {
        addListener((OsList) t, (OrderedRealmCollectionChangeListener<OsList>) new ObservableCollection.RealmChangeListenerWrapper(realmChangeListener));
    }

    public OsList(OsSharedRealm osSharedRealm, long j, Table table) {
        this.f66694a = j;
        this.f66696c = table;
        NativeContext nativeContext = osSharedRealm.context;
        this.f66695b = nativeContext;
        nativeContext.addReference(this);
    }
}
