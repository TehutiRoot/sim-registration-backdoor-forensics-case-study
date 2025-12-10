package io.realm;

import android.content.Context;
import android.os.Looper;
import io.realm.Realm;
import io.realm.RealmCache;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.CheckedRow;
import io.realm.internal.ColumnInfo;
import io.realm.internal.InvalidRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.internal.async.RealmThreadPoolExecutor;
import io.realm.log.RealmLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class BaseRealm implements Closeable {

    /* renamed from: f */
    public static volatile Context f66469f;

    /* renamed from: a */
    public final boolean f66471a;

    /* renamed from: b */
    public final long f66472b;

    /* renamed from: c */
    public RealmCache f66473c;
    protected final RealmConfiguration configuration;

    /* renamed from: d */
    public boolean f66474d;

    /* renamed from: e */
    public OsSharedRealm.SchemaChangedCallback f66475e;
    public OsSharedRealm sharedRealm;

    /* renamed from: g */
    public static final RealmThreadPoolExecutor f66470g = RealmThreadPoolExecutor.newDefaultExecutor();
    public static final RealmThreadPoolExecutor WRITE_EXECUTOR = RealmThreadPoolExecutor.newSingleThreadExecutor();
    public static final C11229g objectContext = new C11229g();

    /* loaded from: classes5.dex */
    public static abstract class InstanceCallback<T extends BaseRealm> {
        public void onError(Throwable th2) {
            throw new RealmException("Exception happens when initializing Realm in the background thread.", th2);
        }

        public abstract void onSuccess(T t);
    }

    /* loaded from: classes5.dex */
    public static final class RealmObjectContext {

        /* renamed from: a */
        public BaseRealm f66476a;

        /* renamed from: b */
        public Row f66477b;

        /* renamed from: c */
        public ColumnInfo f66478c;

        /* renamed from: d */
        public boolean f66479d;

        /* renamed from: e */
        public List f66480e;

        /* renamed from: a */
        public BaseRealm m29753a() {
            return this.f66476a;
        }

        public void clear() {
            this.f66476a = null;
            this.f66477b = null;
            this.f66478c = null;
            this.f66479d = false;
            this.f66480e = null;
        }

        public boolean getAcceptDefaultValue() {
            return this.f66479d;
        }

        public ColumnInfo getColumnInfo() {
            return this.f66478c;
        }

        public List<String> getExcludeFields() {
            return this.f66480e;
        }

        public Row getRow() {
            return this.f66477b;
        }

        public void set(BaseRealm baseRealm, Row row, ColumnInfo columnInfo, boolean z, List<String> list) {
            this.f66476a = baseRealm;
            this.f66477b = row;
            this.f66478c = columnInfo;
            this.f66479d = z;
            this.f66480e = list;
        }
    }

    /* renamed from: io.realm.BaseRealm$a */
    /* loaded from: classes5.dex */
    public class C11223a implements OsSharedRealm.SchemaChangedCallback {
        public C11223a() {
        }

        @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
        public void onSchemaChanged() {
            RealmSchema schema = BaseRealm.this.getSchema();
            if (schema != null) {
                schema.m29575m();
            }
            if (BaseRealm.this instanceof Realm) {
                schema.createKeyPathMapping();
            }
        }
    }

    /* renamed from: io.realm.BaseRealm$b */
    /* loaded from: classes5.dex */
    public class C11224b implements OsSharedRealm.InitializationCallback {

        /* renamed from: a */
        public final /* synthetic */ Realm.Transaction f66482a;

        public C11224b(Realm.Transaction transaction) {
            this.f66482a = transaction;
        }

        @Override // io.realm.internal.OsSharedRealm.InitializationCallback
        public void onInit(OsSharedRealm osSharedRealm) {
            this.f66482a.execute(Realm.m29710y(osSharedRealm));
        }
    }

    /* renamed from: io.realm.BaseRealm$c */
    /* loaded from: classes5.dex */
    public class C11225c implements RealmCache.InterfaceC11248b {
        public C11225c() {
        }

        @Override // io.realm.RealmCache.InterfaceC11248b
        /* renamed from: a */
        public void mo29679a() {
            OsSharedRealm osSharedRealm = BaseRealm.this.sharedRealm;
            if (osSharedRealm != null && !osSharedRealm.isClosed()) {
                BaseRealm.this.sharedRealm.stopWaitForChange();
                return;
            }
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
    }

    /* renamed from: io.realm.BaseRealm$d */
    /* loaded from: classes5.dex */
    public class RunnableC11226d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ RealmConfiguration f66485a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f66486b;

        public RunnableC11226d(RealmConfiguration realmConfiguration, AtomicBoolean atomicBoolean) {
            this.f66485a = realmConfiguration;
            this.f66486b = atomicBoolean;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f66486b.set(Util.deleteRealm(this.f66485a.getPath(), this.f66485a.getRealmDirectory(), this.f66485a.getRealmFileName()));
        }
    }

    /* renamed from: io.realm.BaseRealm$e */
    /* loaded from: classes5.dex */
    public class C11227e implements RealmCache.InterfaceC11249c {

        /* renamed from: a */
        public final /* synthetic */ RealmConfiguration f66487a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f66488b;

        /* renamed from: c */
        public final /* synthetic */ RealmMigration f66489c;

        public C11227e(RealmConfiguration realmConfiguration, AtomicBoolean atomicBoolean, RealmMigration realmMigration) {
            this.f66487a = realmConfiguration;
            this.f66488b = atomicBoolean;
            this.f66489c = realmMigration;
        }

        @Override // io.realm.RealmCache.InterfaceC11249c
        /* renamed from: a */
        public void mo29678a(int i) {
            OsSharedRealm.MigrationCallback migrationCallback;
            if (i == 0) {
                if (!new File(this.f66487a.getPath()).exists()) {
                    this.f66488b.set(true);
                    return;
                }
                OsSchemaInfo osSchemaInfo = new OsSchemaInfo(this.f66487a.getSchemaMediator().getExpectedObjectSchemaInfoMap().values());
                RealmMigration realmMigration = this.f66489c;
                if (realmMigration == null) {
                    realmMigration = this.f66487a.getMigration();
                }
                if (realmMigration != null) {
                    migrationCallback = BaseRealm.m29760g(realmMigration);
                } else {
                    migrationCallback = null;
                }
                OsSharedRealm osSharedRealm = OsSharedRealm.getInstance(new OsRealmConfig.Builder(this.f66487a).autoUpdateNotification(false).schemaInfo(osSchemaInfo).migrationCallback(migrationCallback), OsSharedRealm.VersionID.LIVE);
                if (osSharedRealm != null) {
                    osSharedRealm.close();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot migrate a Realm file that is already open: " + this.f66487a.getPath());
        }
    }

    /* renamed from: io.realm.BaseRealm$f */
    /* loaded from: classes5.dex */
    public class C11228f implements OsSharedRealm.MigrationCallback {

        /* renamed from: a */
        public final /* synthetic */ RealmMigration f66490a;

        public C11228f(RealmMigration realmMigration) {
            this.f66490a = realmMigration;
        }

        @Override // io.realm.internal.OsSharedRealm.MigrationCallback
        public void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2) {
            this.f66490a.migrate(DynamicRealm.m29745p(osSharedRealm), j, j2);
        }
    }

    /* renamed from: io.realm.BaseRealm$g */
    /* loaded from: classes5.dex */
    public static final class C11229g extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public RealmObjectContext initialValue() {
            return new RealmObjectContext();
        }
    }

    public BaseRealm(RealmCache realmCache, OsSchemaInfo osSchemaInfo, OsSharedRealm.VersionID versionID) {
        this(realmCache.m29689l(), osSchemaInfo, versionID);
        this.f66473c = realmCache;
    }

    public static boolean compactRealm(RealmConfiguration realmConfiguration) {
        OsSharedRealm osSharedRealm = OsSharedRealm.getInstance(realmConfiguration, OsSharedRealm.VersionID.LIVE);
        boolean compact = osSharedRealm.compact();
        osSharedRealm.close();
        return compact;
    }

    public static boolean deleteRealm(RealmConfiguration realmConfiguration) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if (OsObjectStore.callWithLock(realmConfiguration, new RunnableC11226d(realmConfiguration, atomicBoolean))) {
            return atomicBoolean.get();
        }
        throw new IllegalStateException("It's not allowed to delete the file associated with an open Realm. Remember to close() all the instances of the Realm before deleting its file: " + realmConfiguration.getPath());
    }

    /* renamed from: g */
    public static OsSharedRealm.MigrationCallback m29760g(RealmMigration realmMigration) {
        return new C11228f(realmMigration);
    }

    public static void migrateRealm(RealmConfiguration realmConfiguration, @Nullable RealmMigration realmMigration) throws FileNotFoundException {
        if (realmConfiguration != null) {
            if (!realmConfiguration.isSyncConfiguration()) {
                if (realmMigration == null && realmConfiguration.getMigration() == null) {
                    throw new RealmMigrationNeededException(realmConfiguration.getPath(), "RealmMigration must be provided.");
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                RealmCache.m29684q(realmConfiguration, new C11227e(realmConfiguration, atomicBoolean, realmMigration));
                if (!atomicBoolean.get()) {
                    return;
                }
                throw new FileNotFoundException("Cannot migrate a Realm file which doesn't exist: " + realmConfiguration.getPath());
            }
            throw new IllegalArgumentException("Manual migrations are not supported for synced Realms");
        }
        throw new IllegalArgumentException("RealmConfiguration must be provided");
    }

    public <T extends BaseRealm> void addListener(RealmChangeListener<T> realmChangeListener) {
        if (realmChangeListener != null) {
            checkIfValid();
            this.sharedRealm.capabilities.checkCanDeliverNotification("Listeners cannot be used on current thread.");
            if (!this.f66471a) {
                this.sharedRealm.realmNotifier.addChangeListener(this, realmChangeListener);
                return;
            }
            throw new IllegalStateException("It is not possible to add a change listener to a frozen Realm since it never changes.");
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public void beginTransaction() {
        checkIfValid();
        this.sharedRealm.beginTransaction();
    }

    public void cancelTransaction() {
        checkIfValid();
        this.sharedRealm.cancelTransaction();
    }

    public void checkAllowQueriesOnUiThread() {
        if (m29754n().capabilities.isMainThread() && !getConfiguration().isAllowQueriesOnUiThread()) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'.");
        }
    }

    public void checkAllowWritesOnUiThread() {
        if (m29754n().capabilities.isMainThread() && !getConfiguration().isAllowWritesOnUiThread()) {
            throw new RealmException("Running transactions on the UI thread has been disabled. It can be enabled by setting 'RealmConfiguration.Builder.allowWritesOnUiThread(true)'.");
        }
    }

    public void checkIfInTransaction() {
        if (this.sharedRealm.isInTransaction()) {
            return;
        }
        throw new IllegalStateException("Changing Realm data can only be done from inside a transaction.");
    }

    public void checkIfValid() {
        OsSharedRealm osSharedRealm = this.sharedRealm;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            if (!this.f66471a && this.f66472b != Thread.currentThread().getId()) {
                throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
            }
            return;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }

    public void checkIfValidAndInTransaction() {
        if (isInTransaction()) {
            return;
        }
        throw new IllegalStateException("Changing Realm data can only be done from inside a transaction.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f66471a && this.f66472b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
        RealmCache realmCache = this.f66473c;
        if (realmCache != null) {
            realmCache.m29681t(this);
        } else {
            m29759i();
        }
    }

    public void commitTransaction() {
        checkIfValid();
        this.sharedRealm.commitTransaction();
    }

    /* renamed from: d */
    public void m29761d() {
        if (!this.configuration.isSyncConfiguration()) {
            return;
        }
        throw new UnsupportedOperationException("You cannot perform destructive changes to a schema of a synced Realm");
    }

    public void deleteAll() {
        checkIfValid();
        for (RealmObjectSchema realmObjectSchema : getSchema().getAll()) {
            getSchema().m29579i(realmObjectSchema.getClassName()).clear();
        }
    }

    public void finalize() throws Throwable {
        OsSharedRealm osSharedRealm;
        if (this.f66474d && (osSharedRealm = this.sharedRealm) != null && !osSharedRealm.isClosed()) {
            RealmLog.warn("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.configuration.getPath());
            RealmCache realmCache = this.f66473c;
            if (realmCache != null) {
                realmCache.m29682s();
            }
        }
        super.finalize();
    }

    public abstract BaseRealm freeze();

    public RealmConfiguration getConfiguration() {
        return this.configuration;
    }

    public long getNumberOfActiveVersions() {
        checkIfValid();
        return m29754n().getNumberOfVersions();
    }

    public String getPath() {
        return this.configuration.getPath();
    }

    public abstract RealmSchema getSchema();

    public long getVersion() {
        return OsObjectStore.getSchemaVersion(this.sharedRealm);
    }

    /* renamed from: i */
    public void m29759i() {
        this.f66473c = null;
        OsSharedRealm osSharedRealm = this.sharedRealm;
        if (osSharedRealm != null && this.f66474d) {
            osSharedRealm.close();
            this.sharedRealm = null;
        }
    }

    public boolean isAutoRefresh() {
        return this.sharedRealm.isAutoRefresh();
    }

    public boolean isClosed() {
        if (!this.f66471a && this.f66472b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
        OsSharedRealm osSharedRealm = this.sharedRealm;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            return false;
        }
        return true;
    }

    public boolean isFrozen() {
        OsSharedRealm osSharedRealm = this.sharedRealm;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            return this.f66471a;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }

    public boolean isInTransaction() {
        checkIfValid();
        return this.sharedRealm.isInTransaction();
    }

    /* renamed from: j */
    public RealmModel m29758j(Class cls, long j, boolean z, List list) {
        return this.configuration.getSchemaMediator().newInstance(cls, this, getSchema().m29580h(cls).getUncheckedRow(j), getSchema().m29584d(cls), z, list);
    }

    /* renamed from: k */
    public RealmModel m29757k(Class cls, String str, long j) {
        boolean z;
        Table m29580h;
        Row row;
        Row row2;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m29580h = getSchema().m29579i(str);
        } else {
            m29580h = getSchema().m29580h(cls);
        }
        if (z) {
            if (j != -1) {
                row2 = m29580h.getCheckedRow(j);
            } else {
                row2 = InvalidRow.INSTANCE;
            }
            return new DynamicRealmObject(this, row2);
        }
        RealmProxyMediator schemaMediator = this.configuration.getSchemaMediator();
        if (j != -1) {
            row = m29580h.getUncheckedRow(j);
        } else {
            row = InvalidRow.INSTANCE;
        }
        return schemaMediator.newInstance(cls, this, row, getSchema().m29584d(cls), false, Collections.emptyList());
    }

    /* renamed from: l */
    public RealmModel m29756l(Class cls, String str, UncheckedRow uncheckedRow) {
        if (str != null) {
            return new DynamicRealmObject(this, CheckedRow.getFromRow(uncheckedRow));
        }
        return this.configuration.getSchemaMediator().newInstance(cls, this, uncheckedRow, getSchema().m29584d(cls), false, Collections.emptyList());
    }

    /* renamed from: m */
    public Row m29755m(String str, RealmObjectProxy realmObjectProxy, String str2, RealmSchema realmSchema, RealmObjectSchema realmObjectSchema) {
        long m29620d = realmObjectSchema.m29620d(str2);
        RealmFieldType fieldType = realmObjectSchema.getFieldType(str2);
        Row row$realm = realmObjectProxy.realmGet$proxyState().getRow$realm();
        if (realmObjectSchema.m29618g(realmObjectSchema.getFieldType(str2))) {
            String mo29388e = realmObjectSchema.mo29388e(str2);
            if (mo29388e.equals(str)) {
                return realmSchema.m29579i(str).getCheckedRow(row$realm.createEmbeddedObject(m29620d, fieldType));
            }
            throw new IllegalArgumentException(String.format("Parent type %s expects that property '%s' be of type %s but was %s.", realmObjectSchema.getClassName(), str2, mo29388e, str));
        }
        throw new IllegalArgumentException(String.format("Field '%s' does not contain a valid link", str2));
    }

    /* renamed from: n */
    public OsSharedRealm m29754n() {
        return this.sharedRealm;
    }

    public void refresh() {
        checkIfValid();
        checkAllowQueriesOnUiThread();
        if (!isInTransaction()) {
            this.sharedRealm.refresh();
            return;
        }
        throw new IllegalStateException("Cannot refresh a Realm instance inside a transaction.");
    }

    public void removeAllListeners() {
        if (isClosed()) {
            RealmLog.warn("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.configuration.getPath());
        }
        this.sharedRealm.realmNotifier.removeChangeListeners(this);
    }

    public <T extends BaseRealm> void removeListener(RealmChangeListener<T> realmChangeListener) {
        if (realmChangeListener != null) {
            if (isClosed()) {
                RealmLog.warn("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.configuration.getPath());
            }
            this.sharedRealm.realmNotifier.removeChangeListener(this, realmChangeListener);
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public void setAutoRefresh(boolean z) {
        checkIfValid();
        this.sharedRealm.setAutoRefresh(z);
    }

    public void stopWaitForChange() {
        RealmCache realmCache = this.f66473c;
        if (realmCache != null) {
            realmCache.m29683r(new C11225c());
            return;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }

    public boolean waitForChange() {
        checkIfValid();
        if (!isInTransaction()) {
            if (Looper.myLooper() == null) {
                boolean waitForChange = this.sharedRealm.waitForChange();
                if (waitForChange) {
                    this.sharedRealm.refresh();
                }
                return waitForChange;
            }
            throw new IllegalStateException("Cannot wait for changes inside a Looper thread. Use RealmChangeListeners instead.");
        }
        throw new IllegalStateException("Cannot wait for changes inside of a transaction.");
    }

    public void writeCopyTo(File file) {
        if (file != null) {
            checkIfValid();
            this.sharedRealm.writeCopy(file, null);
            return;
        }
        throw new IllegalArgumentException("The destination argument cannot be null");
    }

    public void writeEncryptedCopyTo(File file, byte[] bArr) {
        if (file != null) {
            checkIfValid();
            this.sharedRealm.writeCopy(file, bArr);
            return;
        }
        throw new IllegalArgumentException("The destination argument cannot be null");
    }

    public BaseRealm(RealmConfiguration realmConfiguration, OsSchemaInfo osSchemaInfo, OsSharedRealm.VersionID versionID) {
        this.f66475e = new C11223a();
        this.f66472b = Thread.currentThread().getId();
        this.configuration = realmConfiguration;
        this.f66473c = null;
        OsSharedRealm.MigrationCallback m29760g = (osSchemaInfo == null || realmConfiguration.getMigration() == null) ? null : m29760g(realmConfiguration.getMigration());
        Realm.Transaction initialDataTransaction = realmConfiguration.getInitialDataTransaction();
        OsSharedRealm osSharedRealm = OsSharedRealm.getInstance(new OsRealmConfig.Builder(realmConfiguration).fifoFallbackDir(new File(f66469f.getFilesDir(), ".realm.temp")).autoUpdateNotification(true).migrationCallback(m29760g).schemaInfo(osSchemaInfo).initializationCallback(initialDataTransaction != null ? new C11224b(initialDataTransaction) : null), versionID);
        this.sharedRealm = osSharedRealm;
        this.f66471a = osSharedRealm.isFrozen();
        this.f66474d = true;
        this.sharedRealm.registerSchemaChangedCallback(this.f66475e);
    }

    public BaseRealm(OsSharedRealm osSharedRealm) {
        this.f66475e = new C11223a();
        this.f66472b = Thread.currentThread().getId();
        this.configuration = osSharedRealm.getConfiguration();
        this.f66473c = null;
        this.sharedRealm = osSharedRealm;
        this.f66471a = osSharedRealm.isFrozen();
        this.f66474d = false;
    }
}
