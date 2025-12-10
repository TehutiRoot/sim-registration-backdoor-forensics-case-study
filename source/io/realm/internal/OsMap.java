package io.realm.internal;

import io.realm.internal.android.TypeUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.util.Pair;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class OsMap implements NativeObject {
    public static final int NOT_FOUND = -1;

    /* renamed from: d */
    public static final long f66698d = nativeGetFinalizerPtr();

    /* renamed from: a */
    public final long f66699a;

    /* renamed from: b */
    public final NativeContext f66700b;

    /* renamed from: c */
    public final Table f66701c;

    public OsMap(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm sharedRealm = uncheckedRow.getTable().getSharedRealm();
        long[] nativeCreate = nativeCreate(sharedRealm.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.f66699a = nativeCreate[0];
        if (nativeCreate[1] != -1) {
            this.f66701c = new Table(sharedRealm, nativeCreate[1]);
        } else {
            this.f66701c = null;
        }
        NativeContext nativeContext = sharedRealm.context;
        this.f66700b = nativeContext;
        nativeContext.addReference(this);
    }

    private static native void nativeClear(long j);

    private static native boolean nativeContainsBinary(long j, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j, boolean z);

    private static native boolean nativeContainsDate(long j, long j2);

    private static native boolean nativeContainsDecimal128(long j, long j2, long j3);

    private static native boolean nativeContainsDouble(long j, double d);

    private static native boolean nativeContainsFloat(long j, float f);

    private static native boolean nativeContainsKey(long j, String str);

    private static native boolean nativeContainsLong(long j, long j2);

    private static native boolean nativeContainsNull(long j);

    private static native boolean nativeContainsObjectId(long j, String str);

    private static native boolean nativeContainsRealmAny(long j, long j2);

    private static native boolean nativeContainsRealmModel(long j, long j2, long j3);

    private static native boolean nativeContainsString(long j, String str);

    private static native boolean nativeContainsUUID(long j, String str);

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native long nativeCreateAndPutEmbeddedObject(long j, String str);

    private static native long nativeFreeze(long j, long j2);

    private static native Object[] nativeGetEntryForModel(long j, int i);

    private static native Object[] nativeGetEntryForPrimitive(long j, int i);

    private static native Object[] nativeGetEntryForRealmAny(long j, int i);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmAnyPtr(long j, String str);

    private static native long nativeGetRow(long j, String str);

    private static native Object nativeGetValue(long j, String str);

    private static native boolean nativeIsValid(long j);

    private static native long nativeKeys(long j);

    private static native void nativePutBinary(long j, String str, byte[] bArr);

    private static native void nativePutBoolean(long j, String str, boolean z);

    private static native void nativePutDate(long j, String str, long j2);

    private static native void nativePutDecimal128(long j, String str, long j2, long j3);

    private static native void nativePutDouble(long j, String str, double d);

    private static native void nativePutFloat(long j, String str, float f);

    private static native void nativePutLong(long j, String str, long j2);

    private static native void nativePutNull(long j, String str);

    private static native void nativePutObjectId(long j, String str, String str2);

    private static native void nativePutRealmAny(long j, String str, long j2);

    private static native void nativePutRow(long j, String str, long j2);

    private static native void nativePutString(long j, String str, String str2);

    private static native void nativePutUUID(long j, String str, String str2);

    private static native void nativeRemove(long j, String str);

    private static native long nativeSize(long j);

    private static native void nativeStartListening(long j, ObservableMap observableMap);

    private static native void nativeStopListening(long j);

    private static native long nativeValues(long j);

    public void clear() {
        nativeClear(this.f66699a);
    }

    public boolean containsKey(Object obj) {
        return nativeContainsKey(this.f66699a, (String) obj);
    }

    public boolean containsPrimitiveValue(@Nullable Object obj) {
        if (obj == null) {
            return nativeContainsNull(this.f66699a);
        }
        if (obj instanceof Integer) {
            return nativeContainsLong(this.f66699a, ((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return nativeContainsLong(this.f66699a, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return nativeContainsDouble(this.f66699a, ((Double) obj).doubleValue());
        }
        if (obj instanceof Short) {
            return nativeContainsLong(this.f66699a, ((Short) obj).longValue());
        }
        if (obj instanceof Byte) {
            return nativeContainsLong(this.f66699a, ((Byte) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return nativeContainsBoolean(this.f66699a, ((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return nativeContainsString(this.f66699a, (String) obj);
        }
        if (obj instanceof Byte[]) {
            return nativeContainsBinary(this.f66699a, TypeUtils.convertNonPrimitiveBinaryToPrimitive((Byte[]) obj));
        }
        if (obj instanceof byte[]) {
            return nativeContainsBinary(this.f66699a, (byte[]) obj);
        }
        if (obj instanceof Float) {
            return nativeContainsFloat(this.f66699a, ((Float) obj).floatValue());
        }
        if (obj instanceof UUID) {
            return nativeContainsUUID(this.f66699a, obj.toString());
        }
        if (obj instanceof ObjectId) {
            return nativeContainsObjectId(this.f66699a, ((ObjectId) obj).toString());
        }
        if (obj instanceof Date) {
            return nativeContainsDate(this.f66699a, ((Date) obj).getTime());
        }
        if (obj instanceof Decimal128) {
            Decimal128 decimal128 = (Decimal128) obj;
            return nativeContainsDecimal128(this.f66699a, decimal128.getHigh(), decimal128.getLow());
        }
        throw new IllegalArgumentException("Invalid object type: " + obj.getClass().getCanonicalName());
    }

    public boolean containsRealmAnyValue(long j) {
        return nativeContainsRealmAny(this.f66699a, j);
    }

    public boolean containsRealmModel(long j, long j2) {
        return nativeContainsRealmModel(this.f66699a, j, j2);
    }

    public long createAndPutEmbeddedObject(Object obj) {
        return nativeCreateAndPutEmbeddedObject(this.f66699a, (String) obj);
    }

    public OsMap freeze(OsSharedRealm osSharedRealm) {
        return new OsMap(osSharedRealm, nativeFreeze(this.f66699a, osSharedRealm.getNativePtr()), this.f66701c);
    }

    @Nullable
    public Object get(Object obj) {
        return nativeGetValue(this.f66699a, (String) obj);
    }

    public <K> Pair<K, Object> getEntryForPrimitive(int i) {
        Object[] nativeGetEntryForPrimitive = nativeGetEntryForPrimitive(this.f66699a, i);
        return new Pair<>((String) nativeGetEntryForPrimitive[0], nativeGetEntryForPrimitive[1]);
    }

    public <K> Pair<K, Long> getKeyObjRowPair(int i) {
        Object[] nativeGetEntryForModel = nativeGetEntryForModel(this.f66699a, i);
        String str = (String) nativeGetEntryForModel[0];
        Long l = (Long) nativeGetEntryForModel[1];
        if (l.longValue() == -1) {
            return new Pair<>(str, -1L);
        }
        return new Pair<>(str, l);
    }

    public <K> Pair<K, NativeRealmAny> getKeyRealmAnyPair(int i) {
        Object[] nativeGetEntryForRealmAny = nativeGetEntryForRealmAny(this.f66699a, i);
        return new Pair<>((String) nativeGetEntryForRealmAny[0], new NativeRealmAny(((Long) nativeGetEntryForRealmAny[1]).longValue()));
    }

    public long getModelRowKey(Object obj) {
        return nativeGetRow(this.f66699a, (String) obj);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66698d;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.f66699a;
    }

    public long getRealmAnyPtr(Object obj) {
        return nativeGetRealmAnyPtr(this.f66699a, (String) obj);
    }

    public Table getTargetTable() {
        return this.f66701c;
    }

    public boolean isValid() {
        return nativeIsValid(this.f66699a);
    }

    public void put(Object obj, @Nullable Object obj2) {
        if (obj2 == null) {
            try {
                nativePutNull(this.f66699a, (String) obj);
                return;
            } catch (IllegalArgumentException e) {
                if (e.getMessage().contains("Value cannot be null")) {
                    throw new NullPointerException(e.getMessage());
                }
                throw e;
            }
        }
        String canonicalName = obj2.getClass().getCanonicalName();
        if (Long.class.getCanonicalName().equals(canonicalName)) {
            nativePutLong(this.f66699a, (String) obj, ((Long) obj2).longValue());
        } else if (Integer.class.getCanonicalName().equals(canonicalName)) {
            nativePutLong(this.f66699a, (String) obj, ((Integer) obj2).intValue());
        } else if (Short.class.getCanonicalName().equals(canonicalName)) {
            nativePutLong(this.f66699a, (String) obj, ((Short) obj2).shortValue());
        } else if (Byte.class.getCanonicalName().equals(canonicalName)) {
            nativePutLong(this.f66699a, (String) obj, ((Byte) obj2).byteValue());
        } else if (Float.class.getCanonicalName().equals(canonicalName)) {
            nativePutFloat(this.f66699a, (String) obj, ((Float) obj2).floatValue());
        } else if (Double.class.getCanonicalName().equals(canonicalName)) {
            nativePutDouble(this.f66699a, (String) obj, ((Double) obj2).doubleValue());
        } else if (String.class.getCanonicalName().equals(canonicalName)) {
            nativePutString(this.f66699a, (String) obj, (String) obj2);
        } else if (Boolean.class.getCanonicalName().equals(canonicalName)) {
            nativePutBoolean(this.f66699a, (String) obj, ((Boolean) obj2).booleanValue());
        } else if (Date.class.getCanonicalName().equals(canonicalName)) {
            nativePutDate(this.f66699a, (String) obj, ((Date) obj2).getTime());
        } else if (Decimal128.class.getCanonicalName().equals(canonicalName)) {
            Decimal128 decimal128 = (Decimal128) obj2;
            nativePutDecimal128(this.f66699a, (String) obj, decimal128.getHigh(), decimal128.getLow());
        } else if (Byte[].class.getCanonicalName().equals(canonicalName)) {
            nativePutBinary(this.f66699a, (String) obj, TypeUtils.convertNonPrimitiveBinaryToPrimitive((Byte[]) obj2));
        } else if (byte[].class.getCanonicalName().equals(canonicalName)) {
            nativePutBinary(this.f66699a, (String) obj, (byte[]) obj2);
        } else if (ObjectId.class.getCanonicalName().equals(canonicalName)) {
            nativePutObjectId(this.f66699a, (String) obj, ((ObjectId) obj2).toString());
        } else if (UUID.class.getCanonicalName().equals(canonicalName)) {
            nativePutUUID(this.f66699a, (String) obj, obj2.toString());
        } else {
            throw new UnsupportedOperationException("Class '" + canonicalName + "' not supported.");
        }
    }

    public void putRealmAny(Object obj, long j) {
        nativePutRealmAny(this.f66699a, (String) obj, j);
    }

    public void putRow(Object obj, long j) {
        nativePutRow(this.f66699a, (String) obj, j);
    }

    public void remove(Object obj) {
        nativeRemove(this.f66699a, (String) obj);
    }

    public long size() {
        return nativeSize(this.f66699a);
    }

    public void startListening(ObservableMap observableMap) {
        nativeStartListening(this.f66699a, observableMap);
    }

    public void stopListening() {
        nativeStopListening(this.f66699a);
    }

    public Pair<Table, Long> tableAndKeyPtrs() {
        return new Pair<>(this.f66701c, Long.valueOf(nativeKeys(this.f66699a)));
    }

    public Pair<Table, Long> tableAndValuePtrs() {
        return new Pair<>(this.f66701c, Long.valueOf(nativeValues(this.f66699a)));
    }

    public OsMap(OsSharedRealm osSharedRealm, long j, Table table) {
        this.f66699a = j;
        this.f66701c = table;
        NativeContext nativeContext = osSharedRealm.context;
        this.f66700b = nativeContext;
        nativeContext.addReference(this);
    }
}
