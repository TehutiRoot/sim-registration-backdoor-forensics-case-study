package io.realm.internal;

import io.realm.SetChangeSet;
import io.realm.internal.ObservableSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class OsSet implements NativeObject, OsCollection {
    public static final int NOT_FOUND = -1;

    /* renamed from: e */
    public static final long f66756e = nativeGetFinalizerPtr();

    /* renamed from: a */
    public final long f66757a;

    /* renamed from: b */
    public final NativeContext f66758b;

    /* renamed from: c */
    public final OsSharedRealm f66759c;

    /* renamed from: d */
    public final Table f66760d;

    /* loaded from: classes5.dex */
    public enum ExternalCollectionOperation {
        CONTAINS_ALL,
        ADD_ALL,
        REMOVE_ALL,
        RETAIN_ALL
    }

    /* renamed from: io.realm.internal.OsSet$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11319a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66761a;

        static {
            int[] iArr = new int[ExternalCollectionOperation.values().length];
            f66761a = iArr;
            try {
                iArr[ExternalCollectionOperation.CONTAINS_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66761a[ExternalCollectionOperation.ADD_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66761a[ExternalCollectionOperation.REMOVE_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66761a[ExternalCollectionOperation.RETAIN_ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public OsSet(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm sharedRealm = uncheckedRow.getTable().getSharedRealm();
        this.f66759c = sharedRealm;
        long[] nativeCreate = nativeCreate(sharedRealm.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.f66757a = nativeCreate[0];
        NativeContext nativeContext = sharedRealm.context;
        this.f66758b = nativeContext;
        nativeContext.addReference(this);
        if (nativeCreate[1] != 0) {
            this.f66760d = new Table(sharedRealm, nativeCreate[1]);
        } else {
            this.f66760d = null;
        }
    }

    private static native boolean nativeAddAllRealmAnyCollection(long j, long j2);

    private static native long[] nativeAddBinary(long j, byte[] bArr);

    private static native long[] nativeAddBoolean(long j, boolean z);

    private static native long[] nativeAddDate(long j, long j2);

    private static native long[] nativeAddDecimal128(long j, long j2, long j3);

    private static native long[] nativeAddDouble(long j, double d);

    private static native long[] nativeAddFloat(long j, float f);

    private static native long[] nativeAddLong(long j, long j2);

    private static native long[] nativeAddNull(long j);

    private static native long[] nativeAddObjectId(long j, String str);

    private static native long[] nativeAddRealmAny(long j, long j2);

    private static native long[] nativeAddRow(long j, long j2);

    private static native long[] nativeAddString(long j, String str);

    private static native long[] nativeAddUUID(long j, String str);

    private static native boolean nativeAsymmetricDifference(long j, long j2);

    private static native void nativeClear(long j);

    private static native boolean nativeContainsAll(long j, long j2);

    private static native boolean nativeContainsAllRealmAnyCollection(long j, long j2);

    private static native boolean nativeContainsBinary(long j, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j, boolean z);

    private static native boolean nativeContainsDate(long j, long j2);

    private static native boolean nativeContainsDecimal128(long j, long j2, long j3);

    private static native boolean nativeContainsDouble(long j, double d);

    private static native boolean nativeContainsFloat(long j, float f);

    private static native boolean nativeContainsLong(long j, long j2);

    private static native boolean nativeContainsNull(long j);

    private static native boolean nativeContainsObjectId(long j, String str);

    private static native boolean nativeContainsRealmAny(long j, long j2);

    private static native boolean nativeContainsRow(long j, long j2);

    private static native boolean nativeContainsString(long j, String str);

    private static native boolean nativeContainsUUID(long j, String str);

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native void nativeDeleteAll(long j);

    private static native long nativeFreeze(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j);

    private static native long nativeGetRealmAny(long j, int i);

    private static native long nativeGetRow(long j, int i);

    private static native Object nativeGetValueAtIndex(long j, int i);

    private static native boolean nativeIntersect(long j, long j2);

    private static native boolean nativeIsValid(long j);

    private static native boolean nativeRemoveAllRealmAnyCollection(long j, long j2);

    private static native long[] nativeRemoveBinary(long j, byte[] bArr);

    private static native long[] nativeRemoveBoolean(long j, boolean z);

    private static native long[] nativeRemoveDate(long j, long j2);

    private static native long[] nativeRemoveDecimal128(long j, long j2, long j3);

    private static native long[] nativeRemoveDouble(long j, double d);

    private static native long[] nativeRemoveFloat(long j, float f);

    private static native long[] nativeRemoveLong(long j, long j2);

    private static native long[] nativeRemoveNull(long j);

    private static native long[] nativeRemoveObjectId(long j, String str);

    private static native long[] nativeRemoveRealmAny(long j, long j2);

    private static native long[] nativeRemoveRow(long j, long j2);

    private static native long[] nativeRemoveString(long j, String str);

    private static native long[] nativeRemoveUUID(long j, String str);

    private static native boolean nativeRetainAllRealmAnyCollection(long j, long j2);

    private static native long nativeSize(long j);

    private static native void nativeStartListening(long j, ObservableSet observableSet);

    private static native void nativeStopListening(long j);

    private static native boolean nativeUnion(long j, long j2);

    /* renamed from: a */
    public final boolean m29533a(NativeRealmAnyCollection nativeRealmAnyCollection) {
        if (size() == 0) {
            return false;
        }
        if (nativeRealmAnyCollection.getSize() == 0) {
            clear();
            return true;
        }
        return nativeRetainAllRealmAnyCollection(this.f66757a, nativeRealmAnyCollection.getNativePtr());
    }

    public boolean add(@Nullable Boolean bool) {
        long[] nativeAddBoolean;
        if (bool == null) {
            nativeAddBoolean = nativeAddNull(this.f66757a);
        } else {
            nativeAddBoolean = nativeAddBoolean(this.f66757a, bool.booleanValue());
        }
        return nativeAddBoolean[1] != 0;
    }

    public boolean addRealmAny(long j) {
        if (nativeAddRealmAny(this.f66757a, j)[1] != 0) {
            return true;
        }
        return false;
    }

    public boolean addRow(long j) {
        if (nativeAddRow(this.f66757a, j)[1] != 0) {
            return true;
        }
        return false;
    }

    public boolean asymmetricDifference(OsSet osSet) {
        return nativeAsymmetricDifference(this.f66757a, osSet.getNativePtr());
    }

    public void clear() {
        nativeClear(this.f66757a);
    }

    public boolean collectionFunnel(NativeRealmAnyCollection nativeRealmAnyCollection, ExternalCollectionOperation externalCollectionOperation) {
        int i = C11319a.f66761a[externalCollectionOperation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return m29533a(nativeRealmAnyCollection);
                    }
                    throw new IllegalStateException("Unexpected value: " + externalCollectionOperation);
                }
                return nativeRemoveAllRealmAnyCollection(this.f66757a, nativeRealmAnyCollection.getNativePtr());
            }
            return nativeAddAllRealmAnyCollection(this.f66757a, nativeRealmAnyCollection.getNativePtr());
        }
        return nativeContainsAllRealmAnyCollection(this.f66757a, nativeRealmAnyCollection.getNativePtr());
    }

    public boolean contains(@Nullable Boolean bool) {
        if (bool == null) {
            return nativeContainsNull(this.f66757a);
        }
        return nativeContainsBoolean(this.f66757a, bool.booleanValue());
    }

    public boolean containsAll(OsSet osSet) {
        return nativeContainsAll(this.f66757a, osSet.getNativePtr());
    }

    public boolean containsRealmAny(long j) {
        return nativeContainsRealmAny(this.f66757a, j);
    }

    public boolean containsRow(long j) {
        return nativeContainsRow(this.f66757a, j);
    }

    public void deleteAll() {
        nativeDeleteAll(this.f66757a);
    }

    public OsSet freeze(OsSharedRealm osSharedRealm) {
        return new OsSet(osSharedRealm, nativeFreeze(this.f66757a, osSharedRealm.getNativePtr()), this.f66760d);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66756e;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.f66757a;
    }

    public TableQuery getQuery() {
        return new TableQuery(this.f66758b, this.f66760d, nativeGetQuery(this.f66757a));
    }

    public long getRealmAny(int i) {
        return nativeGetRealmAny(this.f66757a, i);
    }

    public long getRow(int i) {
        return nativeGetRow(this.f66757a, i);
    }

    public Table getTargetTable() {
        return this.f66760d;
    }

    public Object getValueAtIndex(int i) {
        return nativeGetValueAtIndex(this.f66757a, i);
    }

    public boolean intersect(OsSet osSet) {
        return nativeIntersect(this.f66757a, osSet.getNativePtr());
    }

    @Override // io.realm.internal.OsCollection
    public boolean isValid() {
        return nativeIsValid(this.f66757a);
    }

    public <T> void notifyChangeListeners(long j, ObserverPairList<ObservableSet.SetObserverPair<T>> observerPairList) {
        SetChangeSet setChangeSet = new SetChangeSet(new OsCollectionChangeSet(j, false));
        if (setChangeSet.isEmpty()) {
            return;
        }
        observerPairList.foreach(new ObservableSet.Callback(setChangeSet));
    }

    public boolean remove(@Nullable Boolean bool) {
        long[] nativeRemoveBoolean;
        if (bool == null) {
            nativeRemoveBoolean = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveBoolean = nativeRemoveBoolean(this.f66757a, bool.booleanValue());
        }
        return nativeRemoveBoolean[1] == 1;
    }

    public boolean removeRealmAny(long j) {
        if (nativeRemoveRealmAny(this.f66757a, j)[1] != 0) {
            return true;
        }
        return false;
    }

    public boolean removeRow(long j) {
        if (nativeRemoveRow(this.f66757a, j)[1] != 0) {
            return true;
        }
        return false;
    }

    public long size() {
        return nativeSize(this.f66757a);
    }

    public void startListening(ObservableSet observableSet) {
        nativeStartListening(this.f66757a, observableSet);
    }

    public void stopListening() {
        nativeStopListening(this.f66757a);
    }

    public boolean union(OsSet osSet) {
        return nativeUnion(this.f66757a, osSet.getNativePtr());
    }

    public boolean contains(@Nullable String str) {
        if (str == null) {
            return nativeContainsNull(this.f66757a);
        }
        return nativeContainsString(this.f66757a, str);
    }

    public boolean add(@Nullable String str) {
        long[] nativeAddString;
        if (str == null) {
            nativeAddString = nativeAddNull(this.f66757a);
        } else {
            nativeAddString = nativeAddString(this.f66757a, str);
        }
        return nativeAddString[1] != 0;
    }

    public boolean remove(@Nullable String str) {
        long[] nativeRemoveString;
        if (str == null) {
            nativeRemoveString = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveString = nativeRemoveString(this.f66757a, str);
        }
        return nativeRemoveString[1] == 1;
    }

    public boolean contains(@Nullable Long l) {
        if (l == null) {
            return nativeContainsNull(this.f66757a);
        }
        return nativeContainsLong(this.f66757a, l.longValue());
    }

    public boolean add(@Nullable Integer num) {
        long[] nativeAddLong;
        if (num == null) {
            nativeAddLong = nativeAddNull(this.f66757a);
        } else {
            nativeAddLong = nativeAddLong(this.f66757a, num.longValue());
        }
        return nativeAddLong[1] != 0;
    }

    public boolean contains(@Nullable Float f) {
        if (f == null) {
            return nativeContainsNull(this.f66757a);
        }
        return nativeContainsFloat(this.f66757a, f.floatValue());
    }

    public boolean remove(@Nullable Integer num) {
        long[] nativeRemoveLong;
        if (num == null) {
            nativeRemoveLong = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveLong = nativeRemoveLong(this.f66757a, num.longValue());
        }
        return nativeRemoveLong[1] == 1;
    }

    public boolean contains(@Nullable Double d) {
        if (d == null) {
            return nativeContainsNull(this.f66757a);
        }
        return nativeContainsDouble(this.f66757a, d.doubleValue());
    }

    public OsSet(OsSharedRealm osSharedRealm, long j, Table table) {
        this.f66759c = osSharedRealm;
        this.f66757a = j;
        NativeContext nativeContext = osSharedRealm.context;
        this.f66758b = nativeContext;
        this.f66760d = table;
        nativeContext.addReference(this);
    }

    public boolean add(@Nullable Long l) {
        long[] nativeAddLong;
        if (l == null) {
            nativeAddLong = nativeAddNull(this.f66757a);
        } else {
            nativeAddLong = nativeAddLong(this.f66757a, l.longValue());
        }
        return nativeAddLong[1] != 0;
    }

    public boolean remove(@Nullable Long l) {
        long[] nativeRemoveLong;
        if (l == null) {
            nativeRemoveLong = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveLong = nativeRemoveLong(this.f66757a, l.longValue());
        }
        return nativeRemoveLong[1] == 1;
    }

    public boolean contains(@Nullable byte[] bArr) {
        if (bArr == null) {
            return nativeContainsNull(this.f66757a);
        }
        return nativeContainsBinary(this.f66757a, bArr);
    }

    public boolean add(@Nullable Short sh) {
        long[] nativeAddLong;
        if (sh == null) {
            nativeAddLong = nativeAddNull(this.f66757a);
        } else {
            nativeAddLong = nativeAddLong(this.f66757a, sh.longValue());
        }
        return nativeAddLong[1] != 0;
    }

    public boolean contains(@Nullable Date date) {
        if (date == null) {
            return nativeContainsNull(this.f66757a);
        }
        return nativeContainsDate(this.f66757a, date.getTime());
    }

    public boolean remove(@Nullable Short sh) {
        long[] nativeRemoveLong;
        if (sh == null) {
            nativeRemoveLong = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveLong = nativeRemoveLong(this.f66757a, sh.longValue());
        }
        return nativeRemoveLong[1] == 1;
    }

    public boolean contains(@Nullable Decimal128 decimal128) {
        if (decimal128 == null) {
            return nativeContainsNull(this.f66757a);
        }
        return nativeContainsDecimal128(this.f66757a, decimal128.getLow(), decimal128.getHigh());
    }

    public boolean add(@Nullable Byte b) {
        long[] nativeAddLong;
        if (b == null) {
            nativeAddLong = nativeAddNull(this.f66757a);
        } else {
            nativeAddLong = nativeAddLong(this.f66757a, b.longValue());
        }
        return nativeAddLong[1] != 0;
    }

    public boolean remove(@Nullable Byte b) {
        long[] nativeRemoveLong;
        if (b == null) {
            nativeRemoveLong = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveLong = nativeRemoveLong(this.f66757a, b.longValue());
        }
        return nativeRemoveLong[1] == 1;
    }

    public boolean contains(@Nullable ObjectId objectId) {
        if (objectId == null) {
            return nativeContainsNull(this.f66757a);
        }
        return nativeContainsObjectId(this.f66757a, objectId.toString());
    }

    public boolean add(@Nullable Float f) {
        long[] nativeAddFloat;
        if (f == null) {
            nativeAddFloat = nativeAddNull(this.f66757a);
        } else {
            nativeAddFloat = nativeAddFloat(this.f66757a, f.floatValue());
        }
        return nativeAddFloat[1] != 0;
    }

    public boolean contains(@Nullable UUID uuid) {
        if (uuid == null) {
            return nativeContainsNull(this.f66757a);
        }
        return nativeContainsUUID(this.f66757a, uuid.toString());
    }

    public boolean remove(@Nullable Float f) {
        long[] nativeRemoveFloat;
        if (f == null) {
            nativeRemoveFloat = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveFloat = nativeRemoveFloat(this.f66757a, f.floatValue());
        }
        return nativeRemoveFloat[1] == 1;
    }

    public boolean add(@Nullable Double d) {
        long[] nativeAddDouble;
        if (d == null) {
            nativeAddDouble = nativeAddNull(this.f66757a);
        } else {
            nativeAddDouble = nativeAddDouble(this.f66757a, d.doubleValue());
        }
        return nativeAddDouble[1] != 0;
    }

    public boolean remove(@Nullable Double d) {
        long[] nativeRemoveDouble;
        if (d == null) {
            nativeRemoveDouble = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveDouble = nativeRemoveDouble(this.f66757a, d.doubleValue());
        }
        return nativeRemoveDouble[1] == 1;
    }

    public boolean add(@Nullable byte[] bArr) {
        long[] nativeAddBinary;
        if (bArr == null) {
            nativeAddBinary = nativeAddNull(this.f66757a);
        } else {
            nativeAddBinary = nativeAddBinary(this.f66757a, bArr);
        }
        return nativeAddBinary[1] != 0;
    }

    public boolean remove(@Nullable byte[] bArr) {
        long[] nativeRemoveBinary;
        if (bArr == null) {
            nativeRemoveBinary = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveBinary = nativeRemoveBinary(this.f66757a, bArr);
        }
        return nativeRemoveBinary[1] == 1;
    }

    public boolean add(@Nullable Date date) {
        long[] nativeAddDate;
        if (date == null) {
            nativeAddDate = nativeAddNull(this.f66757a);
        } else {
            nativeAddDate = nativeAddDate(this.f66757a, date.getTime());
        }
        return nativeAddDate[1] != 0;
    }

    public boolean remove(@Nullable Date date) {
        long[] nativeRemoveDate;
        if (date == null) {
            nativeRemoveDate = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveDate = nativeRemoveDate(this.f66757a, date.getTime());
        }
        return nativeRemoveDate[1] == 1;
    }

    public boolean add(@Nullable Decimal128 decimal128) {
        long[] nativeAddDecimal128;
        if (decimal128 == null) {
            nativeAddDecimal128 = nativeAddNull(this.f66757a);
        } else {
            nativeAddDecimal128 = nativeAddDecimal128(this.f66757a, decimal128.getLow(), decimal128.getHigh());
        }
        return nativeAddDecimal128[1] != 0;
    }

    public boolean remove(@Nullable Decimal128 decimal128) {
        long[] nativeRemoveDecimal128;
        if (decimal128 == null) {
            nativeRemoveDecimal128 = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveDecimal128 = nativeRemoveDecimal128(this.f66757a, decimal128.getLow(), decimal128.getHigh());
        }
        return nativeRemoveDecimal128[1] == 1;
    }

    public boolean add(@Nullable ObjectId objectId) {
        long[] nativeAddObjectId;
        if (objectId == null) {
            nativeAddObjectId = nativeAddNull(this.f66757a);
        } else {
            nativeAddObjectId = nativeAddObjectId(this.f66757a, objectId.toString());
        }
        return nativeAddObjectId[1] != 0;
    }

    public boolean remove(@Nullable ObjectId objectId) {
        long[] nativeRemoveObjectId;
        if (objectId == null) {
            nativeRemoveObjectId = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveObjectId = nativeRemoveObjectId(this.f66757a, objectId.toString());
        }
        return nativeRemoveObjectId[1] == 1;
    }

    public boolean add(@Nullable UUID uuid) {
        long[] nativeAddUUID;
        if (uuid == null) {
            nativeAddUUID = nativeAddNull(this.f66757a);
        } else {
            nativeAddUUID = nativeAddUUID(this.f66757a, uuid.toString());
        }
        return nativeAddUUID[1] != 0;
    }

    public boolean remove(@Nullable UUID uuid) {
        long[] nativeRemoveUUID;
        if (uuid == null) {
            nativeRemoveUUID = nativeRemoveNull(this.f66757a);
        } else {
            nativeRemoveUUID = nativeRemoveUUID(this.f66757a, uuid.toString());
        }
        return nativeRemoveUUID[1] == 1;
    }
}
