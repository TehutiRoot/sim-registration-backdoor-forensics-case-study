package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class UncheckedRow implements NativeObject, Row {

    /* renamed from: b */
    public static final long f66790b = nativeGetFinalizerPtr();

    /* renamed from: a */
    public final long f66791a;
    protected final NativeContext context;
    protected final Table parent;

    /* renamed from: io.realm.internal.UncheckedRow$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11325a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66792a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f66792a = iArr;
            try {
                iArr[RealmFieldType.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66792a[RealmFieldType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public UncheckedRow(NativeContext nativeContext, Table table, long j) {
        this.context = nativeContext;
        this.parent = table;
        this.f66791a = j;
        nativeContext.addReference(this);
    }

    /* renamed from: a */
    public static UncheckedRow m29513a(NativeContext nativeContext, Table table, long j) {
        return new UncheckedRow(nativeContext, table, table.nativeGetRowPtr(table.getNativePtr(), j));
    }

    /* renamed from: b */
    public static UncheckedRow m29512b(NativeContext nativeContext, Table table, long j) {
        return new UncheckedRow(nativeContext, table, j);
    }

    private static native long nativeGetFinalizerPtr();

    @Override // io.realm.internal.Row
    public void checkIfAttached() {
        if (isValid()) {
            return;
        }
        throw new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
    }

    public CheckedRow convertToChecked() {
        return CheckedRow.getFromRow(this);
    }

    @Override // io.realm.internal.Row
    public long createEmbeddedObject(long j, RealmFieldType realmFieldType) {
        int i = C11325a.f66792a[realmFieldType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return getModelList(j).createAndAddEmbeddedObject();
            }
            throw new IllegalArgumentException("Wrong parentPropertyType, expected OBJECT or LIST but received " + realmFieldType);
        }
        this.parent.m29523a();
        return nativeCreateEmbeddedObject(this.f66791a, j);
    }

    public Row freeze(OsSharedRealm osSharedRealm) {
        if (!isValid()) {
            return InvalidRow.INSTANCE;
        }
        return new UncheckedRow(this.context, this.parent.freeze(osSharedRealm), nativeFreeze(this.f66791a, osSharedRealm.getNativePtr()));
    }

    @Override // io.realm.internal.Row
    public byte[] getBinaryByteArray(long j) {
        return nativeGetByteArray(this.f66791a, j);
    }

    @Override // io.realm.internal.Row
    public boolean getBoolean(long j) {
        return nativeGetBoolean(this.f66791a, j);
    }

    @Override // io.realm.internal.Row
    public long getColumnCount() {
        return nativeGetColumnCount(this.f66791a);
    }

    @Override // io.realm.internal.Row
    public long getColumnKey(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.f66791a, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    @Override // io.realm.internal.Row
    public String[] getColumnNames() {
        return nativeGetColumnNames(this.f66791a);
    }

    @Override // io.realm.internal.Row
    public RealmFieldType getColumnType(long j) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f66791a, j));
    }

    @Override // io.realm.internal.Row
    public Date getDate(long j) {
        return new Date(nativeGetTimestamp(this.f66791a, j));
    }

    @Override // io.realm.internal.Row
    public Decimal128 getDecimal128(long j) {
        long[] nativeGetDecimal128 = nativeGetDecimal128(this.f66791a, j);
        if (nativeGetDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeGetDecimal128[1], nativeGetDecimal128[0]);
        }
        return null;
    }

    @Override // io.realm.internal.Row
    public double getDouble(long j) {
        return nativeGetDouble(this.f66791a, j);
    }

    @Override // io.realm.internal.Row
    public float getFloat(long j) {
        return nativeGetFloat(this.f66791a, j);
    }

    @Override // io.realm.internal.Row
    public long getLink(long j) {
        return nativeGetLink(this.f66791a, j);
    }

    @Override // io.realm.internal.Row
    public long getLong(long j) {
        return nativeGetLong(this.f66791a, j);
    }

    public OsList getModelList(long j) {
        return new OsList(this, j);
    }

    public OsMap getModelMap(long j) {
        return new OsMap(this, j);
    }

    public OsSet getModelSet(long j) {
        return new OsSet(this, j);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66790b;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.f66791a;
    }

    @Override // io.realm.internal.Row
    public NativeRealmAny getNativeRealmAny(long j) {
        return new NativeRealmAny(nativeGetRealmAny(this.f66791a, j));
    }

    @Override // io.realm.internal.Row
    public ObjectId getObjectId(long j) {
        return new ObjectId(nativeGetObjectId(this.f66791a, j));
    }

    @Override // io.realm.internal.Row
    public long getObjectKey() {
        return nativeGetObjectKey(this.f66791a);
    }

    public OsMap getRealmAnyMap(long j) {
        return new OsMap(this, j);
    }

    public OsSet getRealmAnySet(long j) {
        return new OsSet(this, j);
    }

    @Override // io.realm.internal.Row
    public String getString(long j) {
        return nativeGetString(this.f66791a, j);
    }

    @Override // io.realm.internal.Row
    public Table getTable() {
        return this.parent;
    }

    @Override // io.realm.internal.Row
    public UUID getUUID(long j) {
        return UUID.fromString(nativeGetUUID(this.f66791a, j));
    }

    public OsList getValueList(long j, RealmFieldType realmFieldType) {
        return new OsList(this, j);
    }

    public OsMap getValueMap(long j, RealmFieldType realmFieldType) {
        return new OsMap(this, j);
    }

    public OsSet getValueSet(long j, RealmFieldType realmFieldType) {
        return new OsSet(this, j);
    }

    @Override // io.realm.internal.Row
    public boolean hasColumn(String str) {
        return nativeHasColumn(this.f66791a, str);
    }

    @Override // io.realm.internal.Row
    public boolean isLoaded() {
        return true;
    }

    public boolean isNull(long j) {
        return nativeIsNull(this.f66791a, j);
    }

    public boolean isNullLink(long j) {
        return nativeIsNullLink(this.f66791a, j);
    }

    @Override // io.realm.internal.Row
    public boolean isValid() {
        long j = this.f66791a;
        if (j != 0 && nativeIsValid(j)) {
            return true;
        }
        return false;
    }

    public native long nativeCreateEmbeddedObject(long j, long j2);

    public native long nativeFreeze(long j, long j2);

    public native boolean nativeGetBoolean(long j, long j2);

    public native byte[] nativeGetByteArray(long j, long j2);

    public native long nativeGetColumnCount(long j);

    public native long nativeGetColumnKey(long j, String str);

    public native String[] nativeGetColumnNames(long j);

    public native int nativeGetColumnType(long j, long j2);

    public native long[] nativeGetDecimal128(long j, long j2);

    public native double nativeGetDouble(long j, long j2);

    public native float nativeGetFloat(long j, long j2);

    public native long nativeGetLink(long j, long j2);

    public native long nativeGetLong(long j, long j2);

    public native String nativeGetObjectId(long j, long j2);

    public native long nativeGetObjectKey(long j);

    public native long nativeGetRealmAny(long j, long j2);

    public native String nativeGetString(long j, long j2);

    public native long nativeGetTimestamp(long j, long j2);

    public native String nativeGetUUID(long j, long j2);

    public native boolean nativeHasColumn(long j, String str);

    public native boolean nativeIsNull(long j, long j2);

    public native boolean nativeIsNullLink(long j, long j2);

    public native boolean nativeIsValid(long j);

    public native void nativeNullifyLink(long j, long j2);

    public native void nativeSetBoolean(long j, long j2, boolean z);

    public native void nativeSetByteArray(long j, long j2, @Nullable byte[] bArr);

    public native void nativeSetDecimal128(long j, long j2, long j3, long j4);

    public native void nativeSetDouble(long j, long j2, double d);

    public native void nativeSetFloat(long j, long j2, float f);

    public native void nativeSetLink(long j, long j2, long j3);

    public native void nativeSetLong(long j, long j2, long j3);

    public native void nativeSetNull(long j, long j2);

    public native void nativeSetObjectId(long j, long j2, String str);

    public native void nativeSetRealmAny(long j, long j2, long j3);

    public native void nativeSetString(long j, long j2, String str);

    public native void nativeSetTimestamp(long j, long j2, long j3);

    public native void nativeSetUUID(long j, long j2, String str);

    @Override // io.realm.internal.Row
    public void nullifyLink(long j) {
        this.parent.m29523a();
        nativeNullifyLink(this.f66791a, j);
    }

    @Override // io.realm.internal.Row
    public void setBinaryByteArray(long j, @Nullable byte[] bArr) {
        this.parent.m29523a();
        nativeSetByteArray(this.f66791a, j, bArr);
    }

    @Override // io.realm.internal.Row
    public void setBoolean(long j, boolean z) {
        this.parent.m29523a();
        nativeSetBoolean(this.f66791a, j, z);
    }

    @Override // io.realm.internal.Row
    public void setDate(long j, Date date) {
        this.parent.m29523a();
        if (date != null) {
            nativeSetTimestamp(this.f66791a, j, date.getTime());
            return;
        }
        throw new IllegalArgumentException("Null Date is not allowed.");
    }

    @Override // io.realm.internal.Row
    public void setDecimal128(long j, @Nullable Decimal128 decimal128) {
        this.parent.m29523a();
        if (decimal128 == null) {
            nativeSetNull(this.f66791a, j);
        } else {
            nativeSetDecimal128(this.f66791a, j, decimal128.getLow(), decimal128.getHigh());
        }
    }

    @Override // io.realm.internal.Row
    public void setDouble(long j, double d) {
        this.parent.m29523a();
        nativeSetDouble(this.f66791a, j, d);
    }

    @Override // io.realm.internal.Row
    public void setFloat(long j, float f) {
        this.parent.m29523a();
        nativeSetFloat(this.f66791a, j, f);
    }

    @Override // io.realm.internal.Row
    public void setLink(long j, long j2) {
        this.parent.m29523a();
        nativeSetLink(this.f66791a, j, j2);
    }

    @Override // io.realm.internal.Row
    public void setLong(long j, long j2) {
        this.parent.m29523a();
        nativeSetLong(this.f66791a, j, j2);
    }

    public void setNull(long j) {
        this.parent.m29523a();
        nativeSetNull(this.f66791a, j);
    }

    @Override // io.realm.internal.Row
    public void setObjectId(long j, @Nullable ObjectId objectId) {
        this.parent.m29523a();
        if (objectId == null) {
            nativeSetNull(this.f66791a, j);
        } else {
            nativeSetObjectId(this.f66791a, j, objectId.toString());
        }
    }

    @Override // io.realm.internal.Row
    public void setRealmAny(long j, long j2) {
        this.parent.m29523a();
        nativeSetRealmAny(this.f66791a, j, j2);
    }

    @Override // io.realm.internal.Row
    public void setString(long j, @Nullable String str) {
        this.parent.m29523a();
        if (str == null) {
            nativeSetNull(this.f66791a, j);
        } else {
            nativeSetString(this.f66791a, j, str);
        }
    }

    @Override // io.realm.internal.Row
    public void setUUID(long j, @Nullable UUID uuid) {
        this.parent.m29523a();
        if (uuid == null) {
            nativeSetNull(this.f66791a, j);
        } else {
            nativeSetUUID(this.f66791a, j, uuid.toString());
        }
    }

    public UncheckedRow(UncheckedRow uncheckedRow) {
        this.context = uncheckedRow.context;
        this.parent = uncheckedRow.parent;
        this.f66791a = uncheckedRow.f66791a;
    }
}
