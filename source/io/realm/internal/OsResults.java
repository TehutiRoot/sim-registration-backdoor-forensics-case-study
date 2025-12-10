package io.realm.internal;

import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmChangeListener;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.Sort;
import io.realm.internal.ObservableCollection;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class OsResults implements NativeObject, ObservableCollection {
    public static final byte AGGREGATE_FUNCTION_AVERAGE = 3;
    public static final byte AGGREGATE_FUNCTION_MAXIMUM = 2;
    public static final byte AGGREGATE_FUNCTION_MINIMUM = 1;
    public static final byte AGGREGATE_FUNCTION_SUM = 4;
    public static final byte MODE_EMPTY = 0;
    public static final byte MODE_LIST = 2;
    public static final byte MODE_QUERY = 3;
    public static final byte MODE_TABLE = 1;
    public static final byte MODE_TABLEVIEW = 4;

    /* renamed from: f */
    public static final long f66733f = nativeGetFinalizerPtr();

    /* renamed from: a */
    public final long f66734a;

    /* renamed from: b */
    public final OsSharedRealm f66735b;

    /* renamed from: c */
    public final NativeContext f66736c;

    /* renamed from: d */
    public final Table f66737d;
    protected boolean loaded;

    /* renamed from: e */
    public boolean f66738e = false;
    protected final ObserverPairList<ObservableCollection.CollectionObserverPair> observerPairs = new ObserverPairList<>();

    /* loaded from: classes5.dex */
    public enum Aggregate {
        MINIMUM((byte) 1),
        MAXIMUM((byte) 2),
        AVERAGE((byte) 3),
        SUM((byte) 4);
        
        private final byte value;

        Aggregate(byte b) {
            this.value = b;
        }

        public byte getValue() {
            return this.value;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class Iterator<T> implements java.util.Iterator<T> {
        protected OsResults iteratorOsResults;
        protected int pos = -1;

        public Iterator(OsResults osResults) {
            if (!osResults.f66735b.isClosed()) {
                this.iteratorOsResults = osResults;
                if (osResults.f66738e) {
                    return;
                }
                if (osResults.f66735b.isInTransaction()) {
                    m29538b();
                    return;
                } else {
                    this.iteratorOsResults.f66735b.addIterator(this);
                    return;
                }
            }
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }

        /* renamed from: a */
        public void m29539a() {
            if (this.iteratorOsResults != null) {
                return;
            }
            throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
        }

        /* renamed from: b */
        public void m29538b() {
            this.iteratorOsResults = this.iteratorOsResults.createSnapshot();
        }

        /* renamed from: c */
        public Object m29537c(int i) {
            return getInternal(i, this.iteratorOsResults);
        }

        public abstract T convertRowToObject(UncheckedRow uncheckedRow);

        /* renamed from: d */
        public void m29536d() {
            this.iteratorOsResults = null;
        }

        public abstract T getInternal(int i, OsResults osResults);

        @Override // java.util.Iterator
        public boolean hasNext() {
            m29539a();
            if (this.pos + 1 < this.iteratorOsResults.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @Nullable
        public T next() {
            m29539a();
            int i = this.pos + 1;
            this.pos = i;
            if (i < this.iteratorOsResults.size()) {
                return (T) m29537c(this.pos);
            }
            throw new NoSuchElementException("Cannot access index " + this.pos + " when size is " + this.iteratorOsResults.size() + ". Remember to check hasNext() before using next().");
        }

        @Override // java.util.Iterator
        @Deprecated
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class ListIterator<T> extends Iterator<T> implements java.util.ListIterator<T> {
        public ListIterator(OsResults osResults, int i) {
            super(osResults);
            if (i >= 0 && i <= this.iteratorOsResults.size()) {
                this.pos = i - 1;
                return;
            }
            throw new IndexOutOfBoundsException("Starting location must be a valid index: [0, " + (this.iteratorOsResults.size() - 1) + "]. Yours was " + i);
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void add(@Nullable T t) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            m29539a();
            if (this.pos >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            m29539a();
            return this.pos + 1;
        }

        @Override // java.util.ListIterator
        @Nullable
        public T previous() {
            m29539a();
            try {
                this.pos--;
                return (T) m29537c(this.pos);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException("Cannot access index less than zero. This was " + this.pos + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            m29539a();
            return this.pos;
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void set(@Nullable T t) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }

    /* loaded from: classes5.dex */
    public enum Mode {
        EMPTY,
        TABLE,
        PRIMITIVE_LIST,
        QUERY,
        TABLEVIEW;

        public static Mode getByValue(byte b) {
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 4) {
                                return TABLEVIEW;
                            }
                            throw new IllegalArgumentException("Invalid value: " + ((int) b));
                        }
                        return QUERY;
                    }
                    return PRIMITIVE_LIST;
                }
                return TABLE;
            }
            return EMPTY;
        }
    }

    /* renamed from: io.realm.internal.OsResults$a */
    /* loaded from: classes5.dex */
    public class C11304a implements InterfaceC11318o {
        public C11304a() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addDoubleList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$b */
    /* loaded from: classes5.dex */
    public class C11305b implements InterfaceC11318o {
        public C11305b() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addObjectList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$c */
    /* loaded from: classes5.dex */
    public class C11306c implements InterfaceC11318o {
        public C11306c() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addDecimal128List(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$d */
    /* loaded from: classes5.dex */
    public class C11307d implements InterfaceC11318o {
        public C11307d() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addObjectIdList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$e */
    /* loaded from: classes5.dex */
    public class C11308e implements InterfaceC11318o {
        public C11308e() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addUUIDList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$f */
    /* loaded from: classes5.dex */
    public class C11309f implements InterfaceC11318o {
        public C11309f() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addStringList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$g */
    /* loaded from: classes5.dex */
    public class C11310g implements InterfaceC11318o {
        public C11310g() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addByteList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$h */
    /* loaded from: classes5.dex */
    public class C11311h implements InterfaceC11318o {
        public C11311h() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addShortList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$i */
    /* loaded from: classes5.dex */
    public class C11312i implements InterfaceC11318o {
        public C11312i() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addIntegerList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$j */
    /* loaded from: classes5.dex */
    public class C11313j implements InterfaceC11318o {
        public C11313j() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addLongList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$k */
    /* loaded from: classes5.dex */
    public class C11314k implements InterfaceC11318o {
        public C11314k() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addBooleanList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$l */
    /* loaded from: classes5.dex */
    public class C11315l implements InterfaceC11318o {
        public C11315l() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addByteArrayList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$m */
    /* loaded from: classes5.dex */
    public class C11316m implements InterfaceC11318o {
        public C11316m() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addDateList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$n */
    /* loaded from: classes5.dex */
    public class C11317n implements InterfaceC11318o {
        public C11317n() {
        }

        @Override // io.realm.internal.OsResults.InterfaceC11318o
        /* renamed from: a */
        public void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList) {
            osObjectBuilder.addFloatList(0L, realmList);
        }
    }

    /* renamed from: io.realm.internal.OsResults$o */
    /* loaded from: classes5.dex */
    public interface InterfaceC11318o {
        /* renamed from: a */
        void mo29535a(OsObjectBuilder osObjectBuilder, RealmList realmList);
    }

    public OsResults(OsSharedRealm osSharedRealm, long j) {
        this.f66735b = osSharedRealm;
        NativeContext nativeContext = osSharedRealm.context;
        this.f66736c = nativeContext;
        this.f66734a = j;
        nativeContext.addReference(this);
        this.loaded = getMode() != Mode.QUERY;
        this.f66737d = new Table(osSharedRealm, nativeGetTable(j));
    }

    public static OsResults createForBacklinks(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow, Table table, String str) {
        return new OsResults(osSharedRealm, table, nativeCreateResultsFromBacklinks(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr(), table.getNativePtr(), table.getColumnKey(str)));
    }

    public static OsResults createFromMap(OsSharedRealm osSharedRealm, long j) {
        return new OsResults(osSharedRealm, j);
    }

    public static OsResults createFromQuery(OsSharedRealm osSharedRealm, TableQuery tableQuery) {
        tableQuery.validateQuery();
        return new OsResults(osSharedRealm, tableQuery.getTable(), nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr()));
    }

    /* renamed from: d */
    public static long m29540d(long j, String str, long j2) {
        try {
            return nativeStringDescriptor(j, str, j2);
        } catch (IllegalStateException e) {
            if (e.getMessage().contains("Realm accessed from incorrect thread.")) {
                throw e;
            }
            throw new IllegalArgumentException("Illegal Argument: " + e.getMessage());
        }
    }

    private static native Object nativeAggregate(long j, long j2, byte b);

    private static native void nativeClear(long j);

    private static native boolean nativeContains(long j, long j2);

    public static native long nativeCreateResults(long j, long j2);

    private static native long nativeCreateResultsFromBacklinks(long j, long j2, long j3, long j4);

    private static native long nativeCreateSnapshot(long j);

    private static native void nativeDelete(long j, long j2);

    private static native boolean nativeDeleteFirst(long j);

    private static native boolean nativeDeleteLast(long j);

    private static native void nativeEvaluateQueryIfNeeded(long j, boolean z);

    private static native long nativeFirstRow(long j);

    private static native long nativeFreeze(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j);

    private static native long nativeGetRow(long j, int i);

    private static native long nativeGetTable(long j);

    private static native Object nativeGetValue(long j, int i);

    private static native long nativeIndexOf(long j, long j2);

    private static native boolean nativeIsValid(long j);

    private static native long nativeLastRow(long j);

    private static native void nativeSetBinary(long j, String str, @Nullable byte[] bArr);

    private static native void nativeSetBoolean(long j, String str, boolean z);

    private static native void nativeSetDecimal128(long j, String str, long j2, long j3);

    private static native void nativeSetDouble(long j, String str, double d);

    private static native void nativeSetFloat(long j, String str, float f);

    private static native void nativeSetInt(long j, String str, long j2);

    private static native void nativeSetList(long j, String str, long j2);

    private static native void nativeSetNull(long j, String str);

    private static native void nativeSetObject(long j, String str, long j2);

    private static native void nativeSetObjectId(long j, String str, String str2);

    private static native void nativeSetString(long j, String str, @Nullable String str2);

    private static native void nativeSetTimestamp(long j, String str, long j2);

    private static native void nativeSetUUID(long j, String str, String str2);

    private static native long nativeSize(long j);

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    private static native long nativeStringDescriptor(long j, String str, long j2);

    private static native long nativeWhere(long j);

    private static native String toJSON(long j, int i);

    public <T> void addListener(T t, OrderedRealmCollectionChangeListener<T> orderedRealmCollectionChangeListener) {
        if (this.observerPairs.isEmpty()) {
            nativeStartListening(this.f66734a);
        }
        this.observerPairs.add(new ObservableCollection.CollectionObserverPair(t, orderedRealmCollectionChangeListener));
    }

    public Date aggregateDate(Aggregate aggregate, long j) {
        try {
            return (Date) nativeAggregate(this.f66734a, j, aggregate.getValue());
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException("Illegal Argument: " + e.getMessage());
        }
    }

    public Number aggregateNumber(Aggregate aggregate, long j) {
        try {
            return (Number) nativeAggregate(this.f66734a, j, aggregate.getValue());
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException("Illegal Argument: " + e.getMessage());
        }
    }

    /* renamed from: c */
    public final void m29541c(String str, RealmList realmList, InterfaceC11318o interfaceC11318o) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(getTable(), Collections.EMPTY_SET);
        interfaceC11318o.mo29535a(osObjectBuilder, realmList);
        try {
            nativeSetList(this.f66734a, str, osObjectBuilder.getNativePtr());
        } finally {
            osObjectBuilder.close();
        }
    }

    public void clear() {
        nativeClear(this.f66734a);
    }

    public boolean contains(UncheckedRow uncheckedRow) {
        return nativeContains(this.f66734a, uncheckedRow.getNativePtr());
    }

    public OsResults createSnapshot() {
        if (this.f66738e) {
            return this;
        }
        OsResults osResults = new OsResults(this.f66735b, this.f66737d, nativeCreateSnapshot(this.f66734a));
        osResults.f66738e = true;
        return osResults;
    }

    public void delete(long j) {
        nativeDelete(this.f66734a, j);
    }

    public boolean deleteFirst() {
        return nativeDeleteFirst(this.f66734a);
    }

    public boolean deleteLast() {
        return nativeDeleteLast(this.f66734a);
    }

    public OsResults distinct(@Nullable OsKeyPathMapping osKeyPathMapping, String[] strArr) {
        long j;
        String buildDistinctDescriptor = TableQuery.buildDistinctDescriptor(strArr);
        OsSharedRealm osSharedRealm = this.f66735b;
        Table table = this.f66737d;
        long j2 = this.f66734a;
        if (osKeyPathMapping != null) {
            j = osKeyPathMapping.getNativePtr();
        } else {
            j = 0;
        }
        return new OsResults(osSharedRealm, table, m29540d(j2, buildDistinctDescriptor, j));
    }

    public UncheckedRow firstUncheckedRow() {
        long nativeFirstRow = nativeFirstRow(this.f66734a);
        if (nativeFirstRow != 0) {
            return this.f66737d.getUncheckedRowByPointer(nativeFirstRow);
        }
        return null;
    }

    public OsResults freeze(OsSharedRealm osSharedRealm) {
        OsResults osResults = new OsResults(osSharedRealm, this.f66737d.freeze(osSharedRealm), nativeFreeze(this.f66734a, osSharedRealm.getNativePtr()));
        if (isLoaded()) {
            osResults.load();
        }
        return osResults;
    }

    public Mode getMode() {
        return Mode.getByValue(nativeGetMode(this.f66734a));
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66733f;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.f66734a;
    }

    public Table getTable() {
        return this.f66737d;
    }

    public UncheckedRow getUncheckedRow(int i) {
        return this.f66737d.getUncheckedRowByPointer(nativeGetRow(this.f66734a, i));
    }

    public Object getValue(int i) {
        return nativeGetValue(this.f66734a, i);
    }

    public int indexOf(UncheckedRow uncheckedRow) {
        long nativeIndexOf = nativeIndexOf(this.f66734a, uncheckedRow.getNativePtr());
        if (nativeIndexOf > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) nativeIndexOf;
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public boolean isValid() {
        return nativeIsValid(this.f66734a);
    }

    public UncheckedRow lastUncheckedRow() {
        long nativeLastRow = nativeLastRow(this.f66734a);
        if (nativeLastRow != 0) {
            return this.f66737d.getUncheckedRowByPointer(nativeLastRow);
        }
        return null;
    }

    public void load() {
        if (this.loaded) {
            return;
        }
        try {
            nativeEvaluateQueryIfNeeded(this.f66734a, false);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("Cannot sort on a collection property")) {
                throw new IllegalStateException("Illegal Argument: " + e.getMessage());
            }
        } catch (IllegalStateException e2) {
            throw new IllegalArgumentException("Illegal Argument: " + e2.getMessage());
        }
        notifyChangeListeners(0L);
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j) {
        OsCollectionChangeSet osCollectionChangeSet;
        if (j == 0) {
            osCollectionChangeSet = new EmptyLoadChangeSet();
        } else {
            osCollectionChangeSet = new OsCollectionChangeSet(j, !isLoaded());
        }
        if (osCollectionChangeSet.isEmpty() && isLoaded()) {
            return;
        }
        this.loaded = true;
        this.observerPairs.foreach(new ObservableCollection.Callback(osCollectionChangeSet));
    }

    public void removeAllListeners() {
        this.observerPairs.clear();
        nativeStopListening(this.f66734a);
    }

    public <T> void removeListener(T t, OrderedRealmCollectionChangeListener<T> orderedRealmCollectionChangeListener) {
        this.observerPairs.remove(t, orderedRealmCollectionChangeListener);
        if (this.observerPairs.isEmpty()) {
            nativeStopListening(this.f66734a);
        }
    }

    public void setBlob(String str, @Nullable byte[] bArr) {
        nativeSetBinary(this.f66734a, str, bArr);
    }

    public void setBoolean(String str, boolean z) {
        nativeSetBoolean(this.f66734a, str, z);
    }

    public void setBooleanList(String str, RealmList<Boolean> realmList) {
        m29541c(str, realmList, new C11314k());
    }

    public void setByteArrayList(String str, RealmList<byte[]> realmList) {
        m29541c(str, realmList, new C11315l());
    }

    public void setByteList(String str, RealmList<Byte> realmList) {
        m29541c(str, realmList, new C11310g());
    }

    public void setDate(String str, @Nullable Date date) {
        if (date == null) {
            nativeSetNull(this.f66734a, str);
        } else {
            nativeSetTimestamp(this.f66734a, str, date.getTime());
        }
    }

    public void setDateList(String str, RealmList<Date> realmList) {
        m29541c(str, realmList, new C11316m());
    }

    public void setDecimal128(String str, @Nullable Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeSetNull(this.f66734a, str);
        } else {
            nativeSetDecimal128(this.f66734a, str, decimal128.getLow(), decimal128.getHigh());
        }
    }

    public void setDecimal128List(String str, RealmList<Decimal128> realmList) {
        m29541c(str, realmList, new C11306c());
    }

    public void setDouble(String str, double d) {
        nativeSetDouble(this.f66734a, str, d);
    }

    public void setDoubleList(String str, RealmList<Double> realmList) {
        m29541c(str, realmList, new C11304a());
    }

    public void setFloat(String str, float f) {
        nativeSetFloat(this.f66734a, str, f);
    }

    public void setFloatList(String str, RealmList<Float> realmList) {
        m29541c(str, realmList, new C11317n());
    }

    public void setInt(String str, long j) {
        nativeSetInt(this.f66734a, str, j);
    }

    public void setIntegerList(String str, RealmList<Integer> realmList) {
        m29541c(str, realmList, new C11312i());
    }

    public void setLongList(String str, RealmList<Long> realmList) {
        m29541c(str, realmList, new C11313j());
    }

    public void setModelList(String str, RealmList<RealmModel> realmList) {
        m29541c(str, realmList, new C11305b());
    }

    public void setNull(String str) {
        nativeSetNull(this.f66734a, str);
    }

    public void setObject(String str, @Nullable Row row) {
        long nativePtr;
        if (row == null) {
            setNull(str);
            return;
        }
        if (row instanceof UncheckedRow) {
            nativePtr = ((UncheckedRow) row).getNativePtr();
        } else if (row instanceof CheckedRow) {
            nativePtr = ((CheckedRow) row).getNativePtr();
        } else {
            throw new UnsupportedOperationException("Unsupported Row type: " + row.getClass().getCanonicalName());
        }
        nativeSetObject(this.f66734a, str, nativePtr);
    }

    public void setObjectId(String str, @Nullable ObjectId objectId) {
        if (objectId == null) {
            nativeSetNull(this.f66734a, str);
        } else {
            nativeSetObjectId(this.f66734a, str, objectId.toString());
        }
    }

    public void setObjectIdList(String str, RealmList<ObjectId> realmList) {
        m29541c(str, realmList, new C11307d());
    }

    public void setShortList(String str, RealmList<Short> realmList) {
        m29541c(str, realmList, new C11311h());
    }

    public void setString(String str, @Nullable String str2) {
        nativeSetString(this.f66734a, str, str2);
    }

    public void setStringList(String str, RealmList<String> realmList) {
        m29541c(str, realmList, new C11309f());
    }

    public void setUUID(String str, @Nullable UUID uuid) {
        if (uuid == null) {
            nativeSetNull(this.f66734a, str);
        } else {
            nativeSetUUID(this.f66734a, str, uuid.toString());
        }
    }

    public void setUUIDList(String str, RealmList<UUID> realmList) {
        m29541c(str, realmList, new C11308e());
    }

    public long size() {
        return nativeSize(this.f66734a);
    }

    public OsResults sort(@Nullable OsKeyPathMapping osKeyPathMapping, String str, Sort sort) {
        return new OsResults(this.f66735b, this.f66737d, m29540d(this.f66734a, TableQuery.buildSortDescriptor(new String[]{str}, new Sort[]{sort}), osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0L));
    }

    public String toJSON(int i) {
        return toJSON(this.f66734a, i);
    }

    public TableQuery where() {
        return new TableQuery(this.f66736c, this.f66737d, nativeWhere(this.f66734a));
    }

    public OsResults sort(@Nullable OsKeyPathMapping osKeyPathMapping, String[] strArr, Sort[] sortArr) {
        if (sortArr != null && sortArr.length != 0) {
            if (strArr.length == sortArr.length) {
                return new OsResults(this.f66735b, this.f66737d, m29540d(this.f66734a, TableQuery.buildSortDescriptor(strArr, sortArr), osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0L));
            }
            throw new IllegalArgumentException("Number of fields and sort orders do not match.");
        }
        throw new IllegalArgumentException("You must provide at least one sort order.");
    }

    public <T> void removeListener(T t, RealmChangeListener<T> realmChangeListener) {
        removeListener((OsResults) t, (OrderedRealmCollectionChangeListener<OsResults>) new ObservableCollection.RealmChangeListenerWrapper(realmChangeListener));
    }

    public <T> void addListener(T t, RealmChangeListener<T> realmChangeListener) {
        addListener((OsResults) t, (OrderedRealmCollectionChangeListener<OsResults>) new ObservableCollection.RealmChangeListenerWrapper(realmChangeListener));
    }

    public OsResults(OsSharedRealm osSharedRealm, Table table, long j) {
        this.f66735b = osSharedRealm;
        NativeContext nativeContext = osSharedRealm.context;
        this.f66736c = nativeContext;
        this.f66737d = table;
        this.f66734a = j;
        nativeContext.addReference(this);
        this.loaded = getMode() != Mode.QUERY;
    }
}
