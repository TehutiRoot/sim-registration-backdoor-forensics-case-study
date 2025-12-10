package io.realm.internal;

import io.realm.FrozenPendingRow;
import io.realm.RealmChangeListener;
import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class PendingRow implements Row {

    /* renamed from: a */
    public OsSharedRealm f66825a;

    /* renamed from: b */
    public OsResults f66826b;

    /* renamed from: c */
    public RealmChangeListener f66827c;

    /* renamed from: d */
    public WeakReference f66828d;

    /* renamed from: e */
    public boolean f66829e;

    /* loaded from: classes5.dex */
    public interface FrontEnd {
        void onQueryFinished(Row row);
    }

    /* renamed from: io.realm.internal.PendingRow$a */
    /* loaded from: classes5.dex */
    public class C11307a implements RealmChangeListener {
        public C11307a() {
        }

        @Override // io.realm.RealmChangeListener
        /* renamed from: a */
        public void onChange(PendingRow pendingRow) {
            PendingRow.this.m29870c();
        }
    }

    public PendingRow(OsSharedRealm osSharedRealm, TableQuery tableQuery, boolean z) {
        this.f66825a = osSharedRealm;
        this.f66826b = OsResults.createFromQuery(osSharedRealm, tableQuery);
        C11307a c11307a = new C11307a();
        this.f66827c = c11307a;
        this.f66826b.addListener((OsResults) this, (RealmChangeListener<OsResults>) c11307a);
        this.f66829e = z;
        osSharedRealm.addPendingRow(this);
    }

    /* renamed from: b */
    public final void m29871b() {
        this.f66826b.removeListener((OsResults) this, (RealmChangeListener<OsResults>) this.f66827c);
        this.f66826b = null;
        this.f66827c = null;
        this.f66825a.removePendingRow(this);
    }

    /* renamed from: c */
    public final void m29870c() {
        WeakReference weakReference = this.f66828d;
        if (weakReference != null) {
            FrontEnd frontEnd = (FrontEnd) weakReference.get();
            if (frontEnd == null) {
                m29871b();
                return;
            } else if (this.f66826b.isValid()) {
                UncheckedRow firstUncheckedRow = this.f66826b.firstUncheckedRow();
                m29871b();
                if (firstUncheckedRow != null) {
                    if (this.f66829e) {
                        firstUncheckedRow = CheckedRow.getFromRow(firstUncheckedRow);
                    }
                    frontEnd.onQueryFinished(firstUncheckedRow);
                    return;
                }
                frontEnd.onQueryFinished(InvalidRow.INSTANCE);
                return;
            } else {
                m29871b();
                return;
            }
        }
        throw new IllegalStateException("The 'frontEnd' has not been set.");
    }

    @Override // io.realm.internal.Row
    public void checkIfAttached() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public long createEmbeddedObject(long j, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public void executeQuery() {
        if (this.f66826b != null) {
            m29870c();
            return;
        }
        throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
    }

    @Override // io.realm.internal.Row
    public Row freeze(OsSharedRealm osSharedRealm) {
        return FrozenPendingRow.INSTANCE;
    }

    @Override // io.realm.internal.Row
    public byte[] getBinaryByteArray(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public boolean getBoolean(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public long getColumnCount() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public long getColumnKey(String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public String[] getColumnNames() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public RealmFieldType getColumnType(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public Date getDate(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public Decimal128 getDecimal128(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public double getDouble(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public float getFloat(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public long getLink(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public long getLong(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public OsList getModelList(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public OsMap getModelMap(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public OsSet getModelSet(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public NativeRealmAny getNativeRealmAny(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public ObjectId getObjectId(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public long getObjectKey() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public OsMap getRealmAnyMap(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public OsSet getRealmAnySet(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public String getString(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public Table getTable() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public UUID getUUID(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public OsList getValueList(long j, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public OsMap getValueMap(long j, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public OsSet getValueSet(long j, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public boolean hasColumn(String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public boolean isLoaded() {
        return false;
    }

    @Override // io.realm.internal.Row
    public boolean isNull(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public boolean isNullLink(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public boolean isValid() {
        return false;
    }

    @Override // io.realm.internal.Row
    public void nullifyLink(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setBinaryByteArray(long j, byte[] bArr) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setBoolean(long j, boolean z) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setDate(long j, Date date) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setDecimal128(long j, Decimal128 decimal128) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setDouble(long j, double d) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setFloat(long j, float f) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public void setFrontEnd(FrontEnd frontEnd) {
        this.f66828d = new WeakReference(frontEnd);
    }

    @Override // io.realm.internal.Row
    public void setLink(long j, long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setLong(long j, long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setNull(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setObjectId(long j, ObjectId objectId) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setRealmAny(long j, long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setString(long j, String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.Row
    public void setUUID(long j, UUID uuid) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
}