package io.realm;

import io.reactivex.Flowable;
import io.realm.BaseRealm;
import io.realm.RealmCache;
import io.realm.exceptions.RealmException;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.async.RealmAsyncTaskImpl;
import io.realm.internal.async.RealmThreadPoolExecutor;
import io.realm.log.RealmLog;
import java.io.File;
import java.util.Locale;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class DynamicRealm extends BaseRealm {

    /* renamed from: h */
    public final RealmSchema f66555h;

    /* loaded from: classes5.dex */
    public static abstract class Callback extends BaseRealm.InstanceCallback<DynamicRealm> {
        @Override // io.realm.BaseRealm.InstanceCallback
        public void onError(Throwable th2) {
            super.onError(th2);
        }

        @Override // io.realm.BaseRealm.InstanceCallback
        public abstract void onSuccess(DynamicRealm dynamicRealm);
    }

    /* loaded from: classes5.dex */
    public interface Transaction {

        /* loaded from: classes5.dex */
        public static class Callback {
            public void onError(Exception exc) {
            }

            public void onSuccess() {
            }
        }

        /* loaded from: classes5.dex */
        public interface OnError {
            void onError(Throwable th2);
        }

        /* loaded from: classes5.dex */
        public interface OnSuccess {
            void onSuccess();
        }

        void execute(DynamicRealm dynamicRealm);
    }

    /* renamed from: io.realm.DynamicRealm$a */
    /* loaded from: classes5.dex */
    public class C11217a implements RealmCache.InterfaceC11236c {

        /* renamed from: a */
        public final /* synthetic */ RealmCache f66556a;

        public C11217a(RealmCache realmCache) {
            this.f66556a = realmCache;
        }

        @Override // io.realm.RealmCache.InterfaceC11236c
        /* renamed from: a */
        public void mo30018a(int i) {
            if (i > 0 || this.f66556a.m30029l().isReadOnly() || OsObjectStore.getSchemaVersion(DynamicRealm.this.sharedRealm) != -1) {
                return;
            }
            DynamicRealm.this.sharedRealm.beginTransaction();
            if (OsObjectStore.getSchemaVersion(DynamicRealm.this.sharedRealm) == -1) {
                OsObjectStore.setSchemaVersion(DynamicRealm.this.sharedRealm, -1L);
            }
            DynamicRealm.this.sharedRealm.commitTransaction();
        }
    }

    /* renamed from: io.realm.DynamicRealm$b */
    /* loaded from: classes5.dex */
    public class RunnableC11218b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ RealmConfiguration f66558a;

        /* renamed from: b */
        public final /* synthetic */ Transaction f66559b;

        /* renamed from: c */
        public final /* synthetic */ boolean f66560c;

        /* renamed from: d */
        public final /* synthetic */ Transaction.OnSuccess f66561d;

        /* renamed from: e */
        public final /* synthetic */ RealmNotifier f66562e;

        /* renamed from: f */
        public final /* synthetic */ Transaction.OnError f66563f;

        /* renamed from: io.realm.DynamicRealm$b$a */
        /* loaded from: classes5.dex */
        public class RunnableC11219a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ OsSharedRealm.VersionID f66565a;

            /* renamed from: io.realm.DynamicRealm$b$a$a */
            /* loaded from: classes5.dex */
            public class RunnableC11220a implements Runnable {
                public RunnableC11220a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    RunnableC11218b.this.f66561d.onSuccess();
                }
            }

            public RunnableC11219a(OsSharedRealm.VersionID versionID) {
                this.f66565a = versionID;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (DynamicRealm.this.isClosed()) {
                    RunnableC11218b.this.f66561d.onSuccess();
                } else if (DynamicRealm.this.sharedRealm.getVersionID().compareTo(this.f66565a) < 0) {
                    DynamicRealm.this.sharedRealm.realmNotifier.addTransactionCallback(new RunnableC11220a());
                } else {
                    RunnableC11218b.this.f66561d.onSuccess();
                }
            }
        }

        /* renamed from: io.realm.DynamicRealm$b$b */
        /* loaded from: classes5.dex */
        public class RunnableC11221b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Throwable f66568a;

            public RunnableC11221b(Throwable th2) {
                this.f66568a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Transaction.OnError onError = RunnableC11218b.this.f66563f;
                if (onError != null) {
                    onError.onError(this.f66568a);
                    return;
                }
                throw new RealmException("Async transaction failed", this.f66568a);
            }
        }

        public RunnableC11218b(RealmConfiguration realmConfiguration, Transaction transaction, boolean z, Transaction.OnSuccess onSuccess, RealmNotifier realmNotifier, Transaction.OnError onError) {
            this.f66558a = realmConfiguration;
            this.f66559b = transaction;
            this.f66560c = z;
            this.f66561d = onSuccess;
            this.f66562e = realmNotifier;
            this.f66563f = onError;
        }

        @Override // java.lang.Runnable
        public void run() {
            OsSharedRealm.VersionID versionID;
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f66558a);
            dynamicRealm.beginTransaction();
            Throwable th2 = null;
            try {
                this.f66559b.execute(dynamicRealm);
            } catch (Throwable th3) {
                try {
                    if (dynamicRealm.isInTransaction()) {
                        dynamicRealm.cancelTransaction();
                    }
                    dynamicRealm.close();
                    versionID = null;
                    th2 = th3;
                } finally {
                }
            }
            if (Thread.currentThread().isInterrupted()) {
                try {
                    if (dynamicRealm.isInTransaction()) {
                        dynamicRealm.cancelTransaction();
                    }
                    return;
                } finally {
                }
            }
            dynamicRealm.commitTransaction();
            versionID = dynamicRealm.sharedRealm.getVersionID();
            try {
                if (dynamicRealm.isInTransaction()) {
                    dynamicRealm.cancelTransaction();
                }
                if (this.f66560c) {
                    if (versionID != null && this.f66561d != null) {
                        this.f66562e.post(new RunnableC11219a(versionID));
                    } else if (th2 != null) {
                        this.f66562e.post(new RunnableC11221b(th2));
                    }
                } else if (th2 == null) {
                } else {
                    throw new RealmException("Async transaction failed", th2);
                }
            } finally {
            }
        }
    }

    public DynamicRealm(RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        super(realmCache, (OsSchemaInfo) null, versionID);
        RealmCache.m30024q(realmCache.m30029l(), new C11217a(realmCache));
        this.f66555h = new C11407n(this);
    }

    public static DynamicRealm getInstance(RealmConfiguration realmConfiguration) {
        if (realmConfiguration != null) {
            return (DynamicRealm) RealmCache.m30036e(realmConfiguration, DynamicRealm.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public static RealmAsyncTask getInstanceAsync(RealmConfiguration realmConfiguration, Callback callback) {
        if (realmConfiguration != null) {
            return RealmCache.m30034g(realmConfiguration, callback, DynamicRealm.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    /* renamed from: o */
    public static DynamicRealm m30086o(RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        return new DynamicRealm(realmCache, versionID);
    }

    /* renamed from: p */
    public static DynamicRealm m30085p(OsSharedRealm osSharedRealm) {
        return new DynamicRealm(osSharedRealm);
    }

    public void addChangeListener(RealmChangeListener<DynamicRealm> realmChangeListener) {
        addListener(realmChangeListener);
    }

    public Flowable<DynamicRealm> asFlowable() {
        return this.configuration.getRxFactory().from(this);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void beginTransaction() {
        super.beginTransaction();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void cancelTransaction() {
        super.cancelTransaction();
    }

    @Override // io.realm.BaseRealm, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void commitTransaction() {
        super.commitTransaction();
    }

    public DynamicRealmObject createEmbeddedObject(String str, DynamicRealmObject dynamicRealmObject, String str2) {
        checkIfValid();
        Util.checkNull(dynamicRealmObject, "parentObject");
        Util.checkEmpty(str2, "parentProperty");
        if (RealmObject.isManaged(dynamicRealmObject) && RealmObject.isValid(dynamicRealmObject)) {
            String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, str);
            if (primaryKeyForObject == null) {
                String type = dynamicRealmObject.getType();
                RealmObjectSchema realmObjectSchema = this.f66555h.get(type);
                if (realmObjectSchema != null) {
                    return new DynamicRealmObject(this, m30095m(str, dynamicRealmObject, str2, this.f66555h, realmObjectSchema));
                }
                throw new IllegalStateException(String.format("No schema found for '%s'.", type));
            }
            throw new RealmException(String.format(Locale.US, "'%s' has a primary key field '%s', embedded objects cannot have primary keys.", str, primaryKeyForObject));
        }
        throw new IllegalArgumentException("Only valid, managed objects can be a parent to an embedded object.");
    }

    public DynamicRealmObject createObject(String str) {
        checkIfValid();
        Table m29919i = this.f66555h.m29919i(str);
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, str);
        if (primaryKeyForObject == null) {
            return new DynamicRealmObject(this, CheckedRow.getFromRow(OsObject.create(m29919i)));
        }
        throw new RealmException(String.format(Locale.US, "'%s' has a primary key field '%s', use  'createObject(String, Object)' instead.", str, primaryKeyForObject));
    }

    public void delete(String str) {
        checkIfValid();
        checkIfInTransaction();
        this.f66555h.m29919i(str).clear();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void deleteAll() {
        super.deleteAll();
    }

    public void executeTransaction(Transaction transaction) {
        if (transaction != null) {
            checkAllowWritesOnUiThread();
            beginTransaction();
            try {
                transaction.execute(this);
                commitTransaction();
                return;
            } catch (RuntimeException e) {
                if (isInTransaction()) {
                    cancelTransaction();
                } else {
                    RealmLog.warn("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException("Transaction should not be null");
    }

    public RealmAsyncTask executeTransactionAsync(Transaction transaction) {
        return executeTransactionAsync(transaction, null, null);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ RealmConfiguration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ long getNumberOfActiveVersions() {
        return super.getNumberOfActiveVersions();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ String getPath() {
        return super.getPath();
    }

    @Override // io.realm.BaseRealm
    public RealmSchema getSchema() {
        return this.f66555h;
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ long getVersion() {
        return super.getVersion();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isAutoRefresh() {
        return super.isAutoRefresh();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    public boolean isEmpty() {
        checkIfValid();
        return this.sharedRealm.isEmpty();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isFrozen() {
        return super.isFrozen();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isInTransaction() {
        return super.isInTransaction();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void refresh() {
        super.refresh();
    }

    public void removeAllChangeListeners() {
        removeAllListeners();
    }

    public void removeChangeListener(RealmChangeListener<DynamicRealm> realmChangeListener) {
        removeListener(realmChangeListener);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void setAutoRefresh(boolean z) {
        super.setAutoRefresh(z);
    }

    @Override // io.realm.BaseRealm
    @Deprecated
    public /* bridge */ /* synthetic */ void stopWaitForChange() {
        super.stopWaitForChange();
    }

    @Override // io.realm.BaseRealm
    @Deprecated
    public /* bridge */ /* synthetic */ boolean waitForChange() {
        return super.waitForChange();
    }

    public RealmQuery<DynamicRealmObject> where(String str) {
        checkIfValid();
        if (this.sharedRealm.hasTable(Table.getTableNameForClass(str))) {
            return RealmQuery.m29957a(this, str);
        }
        throw new IllegalArgumentException("Class does not exist in the Realm and cannot be queried: " + str);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void writeCopyTo(File file) {
        super.writeCopyTo(file);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void writeEncryptedCopyTo(File file, byte[] bArr) {
        super.writeEncryptedCopyTo(file, bArr);
    }

    public RealmAsyncTask executeTransactionAsync(Transaction transaction, Transaction.OnSuccess onSuccess) {
        if (onSuccess != null) {
            return executeTransactionAsync(transaction, onSuccess, null);
        }
        throw new IllegalArgumentException("onSuccess callback can't be null");
    }

    @Override // io.realm.BaseRealm
    public DynamicRealm freeze() {
        OsSharedRealm.VersionID versionID;
        try {
            versionID = this.sharedRealm.getVersionID();
        } catch (IllegalStateException unused) {
            getVersion();
            versionID = this.sharedRealm.getVersionID();
        }
        return (DynamicRealm) RealmCache.m30035f(this.configuration, DynamicRealm.class, versionID);
    }

    public DynamicRealm(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.f66555h = new C11407n(this);
    }

    public RealmAsyncTask executeTransactionAsync(Transaction transaction, Transaction.OnError onError) {
        if (onError != null) {
            return executeTransactionAsync(transaction, null, onError);
        }
        throw new IllegalArgumentException("onError callback can't be null");
    }

    public DynamicRealmObject createObject(String str, Object obj) {
        return new DynamicRealmObject(this, CheckedRow.getFromRow(OsObject.createWithPrimaryKey(this.f66555h.m29919i(str), obj)));
    }

    public RealmAsyncTask executeTransactionAsync(Transaction transaction, @Nullable Transaction.OnSuccess onSuccess, @Nullable Transaction.OnError onError) {
        checkIfValid();
        if (transaction != null) {
            if (!isFrozen()) {
                boolean canDeliverNotification = this.sharedRealm.capabilities.canDeliverNotification();
                if (onSuccess != null || onError != null) {
                    this.sharedRealm.capabilities.checkCanDeliverNotification("Callback cannot be delivered on current thread.");
                }
                RealmConfiguration configuration = getConfiguration();
                RealmNotifier realmNotifier = this.sharedRealm.realmNotifier;
                RealmThreadPoolExecutor realmThreadPoolExecutor = BaseRealm.f66533g;
                return new RealmAsyncTaskImpl(realmThreadPoolExecutor.submitTransaction(new RunnableC11218b(configuration, transaction, canDeliverNotification, onSuccess, realmNotifier, onError)), realmThreadPoolExecutor);
            }
            throw new IllegalStateException("Write transactions on a frozen Realm is not allowed.");
        }
        throw new IllegalArgumentException("Transaction should not be null");
    }
}