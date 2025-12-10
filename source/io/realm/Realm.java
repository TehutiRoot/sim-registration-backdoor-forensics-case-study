package io.realm;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.JsonReader;
import io.reactivex.Flowable;
import io.realm.BaseRealm;
import io.realm.Realm;
import io.realm.RealmCache;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmError;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.internal.ColumnIndices;
import io.realm.internal.ObjectServerFacade;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmCore;
import io.realm.internal.RealmNotifier;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.async.RealmAsyncTaskImpl;
import io.realm.internal.async.RealmThreadPoolExecutor;
import io.realm.log.RealmLog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class Realm extends BaseRealm {
    public static final String DEFAULT_REALM_NAME = "default.realm";
    public static final int ENCRYPTION_KEY_LENGTH = 64;

    /* renamed from: i */
    public static final Object f66522i = new Object();

    /* renamed from: j */
    public static RealmConfiguration f66523j;

    /* renamed from: h */
    public final RealmSchema f66524h;

    /* loaded from: classes5.dex */
    public static abstract class Callback extends BaseRealm.InstanceCallback<Realm> {
        @Override // io.realm.BaseRealm.InstanceCallback
        public void onError(Throwable th2) {
            super.onError(th2);
        }

        @Override // io.realm.BaseRealm.InstanceCallback
        public abstract void onSuccess(Realm realm);
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

        void execute(Realm realm);
    }

    /* renamed from: io.realm.Realm$a */
    /* loaded from: classes5.dex */
    public class RunnableC11241a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ RealmConfiguration f66525a;

        /* renamed from: b */
        public final /* synthetic */ Transaction f66526b;

        /* renamed from: c */
        public final /* synthetic */ boolean f66527c;

        /* renamed from: d */
        public final /* synthetic */ Transaction.OnSuccess f66528d;

        /* renamed from: e */
        public final /* synthetic */ RealmNotifier f66529e;

        /* renamed from: f */
        public final /* synthetic */ Transaction.OnError f66530f;

        /* renamed from: io.realm.Realm$a$a */
        /* loaded from: classes5.dex */
        public class RunnableC11242a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ OsSharedRealm.VersionID f66532a;

            /* renamed from: io.realm.Realm$a$a$a */
            /* loaded from: classes5.dex */
            public class RunnableC11243a implements Runnable {
                public RunnableC11243a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    RunnableC11241a.this.f66528d.onSuccess();
                }
            }

            public RunnableC11242a(OsSharedRealm.VersionID versionID) {
                this.f66532a = versionID;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (Realm.this.isClosed()) {
                    RunnableC11241a.this.f66528d.onSuccess();
                } else if (Realm.this.sharedRealm.getVersionID().compareTo(this.f66532a) < 0) {
                    Realm.this.sharedRealm.realmNotifier.addTransactionCallback(new RunnableC11243a());
                } else {
                    RunnableC11241a.this.f66528d.onSuccess();
                }
            }
        }

        /* renamed from: io.realm.Realm$a$b */
        /* loaded from: classes5.dex */
        public class RunnableC11244b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Throwable f66535a;

            public RunnableC11244b(Throwable th2) {
                this.f66535a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Transaction.OnError onError = RunnableC11241a.this.f66530f;
                if (onError != null) {
                    onError.onError(this.f66535a);
                    return;
                }
                throw new RealmException("Async transaction failed", this.f66535a);
            }
        }

        public RunnableC11241a(RealmConfiguration realmConfiguration, Transaction transaction, boolean z, Transaction.OnSuccess onSuccess, RealmNotifier realmNotifier, Transaction.OnError onError) {
            this.f66525a = realmConfiguration;
            this.f66526b = transaction;
            this.f66527c = z;
            this.f66528d = onSuccess;
            this.f66529e = realmNotifier;
            this.f66530f = onError;
        }

        @Override // java.lang.Runnable
        public void run() {
            OsSharedRealm.VersionID versionID;
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f66525a);
            realm.beginTransaction();
            Throwable th2 = null;
            try {
                this.f66526b.execute(realm);
            } catch (Throwable th3) {
                try {
                    if (realm.isInTransaction()) {
                        realm.cancelTransaction();
                    }
                    realm.close();
                    versionID = null;
                    th2 = th3;
                } finally {
                }
            }
            if (Thread.currentThread().isInterrupted()) {
                try {
                    if (realm.isInTransaction()) {
                        realm.cancelTransaction();
                    }
                    return;
                } finally {
                }
            }
            realm.commitTransaction();
            versionID = realm.sharedRealm.getVersionID();
            try {
                if (realm.isInTransaction()) {
                    realm.cancelTransaction();
                }
                if (this.f66527c) {
                    if (versionID != null && this.f66528d != null) {
                        this.f66529e.post(new RunnableC11242a(versionID));
                    } else if (th2 != null) {
                        this.f66529e.post(new RunnableC11244b(th2));
                    }
                } else if (th2 == null) {
                } else {
                    throw new RealmException("Async transaction failed", th2);
                }
            } finally {
            }
        }
    }

    /* renamed from: io.realm.Realm$b */
    /* loaded from: classes5.dex */
    public class C11245b implements RealmCache.InterfaceC11249c {

        /* renamed from: a */
        public final /* synthetic */ AtomicInteger f66537a;

        public C11245b(AtomicInteger atomicInteger) {
            this.f66537a = atomicInteger;
        }

        @Override // io.realm.RealmCache.InterfaceC11249c
        /* renamed from: a */
        public void mo29678a(int i) {
            this.f66537a.set(i);
        }
    }

    public Realm(RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        super(realmCache, m29712w(realmCache.m29689l().getSchemaMediator()), versionID);
        this.f66524h = new C17590Fd0(this, new ColumnIndices(this.configuration.getSchemaMediator(), this.sharedRealm.getSchemaInfo()));
        if (this.configuration.isReadOnly()) {
            RealmProxyMediator schemaMediator = this.configuration.getSchemaMediator();
            for (Class<? extends RealmModel> cls : schemaMediator.getModelClasses()) {
                String tableNameForClass = Table.getTableNameForClass(schemaMediator.getSimpleClassName(cls));
                if (!this.sharedRealm.hasTable(tableNameForClass)) {
                    this.sharedRealm.close();
                    throw new RealmMigrationNeededException(this.configuration.getPath(), String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", Table.getClassNameForTable(tableNameForClass)));
                }
            }
        }
    }

    /* renamed from: E */
    public static void m29723E(Context context, String str) {
        if (BaseRealm.f66469f == null) {
            if (context != null) {
                m29719p(context);
                if (!m29722F(context)) {
                    RealmCore.loadLibrary(context);
                    setDefaultConfiguration(new RealmConfiguration.Builder(context).build());
                    ObjectServerFacade.getSyncFacadeIfPossible().initialize(context, str, new ObjectServerFacade.RealmCacheAccessor() { // from class: ms1
                        @Override // io.realm.internal.ObjectServerFacade.RealmCacheAccessor
                        public final Realm createRealmOrGetFromCache(RealmConfiguration realmConfiguration, OsSharedRealm.VersionID versionID) {
                            Realm m29721G;
                            m29721G = Realm.m29721G(realmConfiguration, versionID);
                            return m29721G;
                        }
                    }, new ObjectServerFacade.RealmInstanceFactory() { // from class: ns1
                        @Override // io.realm.internal.ObjectServerFacade.RealmInstanceFactory
                        public final Realm createInstance(OsSharedRealm osSharedRealm) {
                            return Realm.m29710y(osSharedRealm);
                        }
                    });
                    if (context.getApplicationContext() != null) {
                        BaseRealm.f66469f = context.getApplicationContext();
                    } else {
                        BaseRealm.f66469f = context;
                    }
                    OsSharedRealm.initialize(new File(context.getFilesDir(), ".realm.temp"));
                    return;
                }
                throw new RealmError("Could not initialize Realm: Instant apps are not currently supported.");
            }
            throw new IllegalArgumentException("Non-null context required.");
        }
    }

    /* renamed from: F */
    public static boolean m29722F(Context context) {
        boolean isInstantApp;
        if (Build.VERSION.SDK_INT >= 26) {
            isInstantApp = context.getPackageManager().isInstantApp();
            return isInstantApp;
        }
        try {
            return ((Boolean) Class.forName("com.google.android.gms.instantapps.PackageManagerCompat").getMethod("isInstantApp", null).invoke(Class.forName("com.google.android.gms.instantapps.InstantApps").getMethod("getPackageManagerCompat", Context.class).invoke(null, context), null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: G */
    public static /* synthetic */ Realm m29721G(RealmConfiguration realmConfiguration, OsSharedRealm.VersionID versionID) {
        return (Realm) RealmCache.m29695f(realmConfiguration, Realm.class, versionID);
    }

    public static boolean compactRealm(RealmConfiguration realmConfiguration) {
        return BaseRealm.compactRealm(realmConfiguration);
    }

    public static boolean deleteRealm(RealmConfiguration realmConfiguration) {
        return BaseRealm.deleteRealm(realmConfiguration);
    }

    @Nullable
    public static Context getApplicationContext() {
        return BaseRealm.f66469f;
    }

    @Nullable
    public static RealmConfiguration getDefaultConfiguration() {
        RealmConfiguration realmConfiguration;
        synchronized (f66522i) {
            realmConfiguration = f66523j;
        }
        return realmConfiguration;
    }

    public static Realm getDefaultInstance() {
        RealmConfiguration defaultConfiguration = getDefaultConfiguration();
        if (defaultConfiguration == null) {
            if (BaseRealm.f66469f == null) {
                throw new IllegalStateException("Call `Realm.init(Context)` before calling this method.");
            }
            throw new IllegalStateException("Set default configuration by using `Realm.setDefaultConfiguration(RealmConfiguration)`.");
        }
        return (Realm) RealmCache.m29696e(defaultConfiguration, Realm.class);
    }

    @Nullable
    public static Object getDefaultModule() {
        try {
            Constructor<?> constructor = DefaultRealmModule.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(null);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e);
        } catch (InstantiationException e2) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e2);
        } catch (InvocationTargetException e3) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e3);
        }
    }

    public static int getGlobalInstanceCount(RealmConfiguration realmConfiguration) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        RealmCache.m29684q(realmConfiguration, new C11245b(atomicInteger));
        return atomicInteger.get();
    }

    public static Realm getInstance(RealmConfiguration realmConfiguration) {
        if (realmConfiguration != null) {
            return (Realm) RealmCache.m29696e(realmConfiguration, Realm.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public static RealmAsyncTask getInstanceAsync(RealmConfiguration realmConfiguration, Callback callback) {
        if (realmConfiguration != null) {
            return RealmCache.m29694g(realmConfiguration, callback, Realm.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public static int getLocalInstanceCount(RealmConfiguration realmConfiguration) {
        return RealmCache.m29688m(realmConfiguration);
    }

    public static synchronized void init(Context context) {
        synchronized (Realm.class) {
            m29723E(context, "");
        }
    }

    public static void migrateRealm(RealmConfiguration realmConfiguration) throws FileNotFoundException {
        migrateRealm(realmConfiguration, null);
    }

    /* renamed from: p */
    public static void m29719p(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            if (filesDir.exists()) {
                return;
            }
            try {
                filesDir.mkdirs();
            } catch (SecurityException unused) {
            }
        }
        if (filesDir == null || !filesDir.exists()) {
            long[] jArr = {1, 2, 5, 10, 16};
            long j = 0;
            int i = -1;
            do {
                if (context.getFilesDir() != null && context.getFilesDir().exists()) {
                    break;
                }
                i++;
                long j2 = jArr[Math.min(i, 4)];
                SystemClock.sleep(j2);
                j += j2;
            } while (j <= 200);
        }
        if (context.getFilesDir() != null && context.getFilesDir().exists()) {
            return;
        }
        throw new IllegalStateException("Context.getFilesDir() returns " + context.getFilesDir() + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154");
    }

    public static void removeDefaultConfiguration() {
        synchronized (f66522i) {
            f66523j = null;
        }
    }

    public static void setDefaultConfiguration(RealmConfiguration realmConfiguration) {
        if (realmConfiguration != null) {
            synchronized (f66522i) {
                f66523j = realmConfiguration;
            }
            return;
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    /* renamed from: w */
    public static OsSchemaInfo m29712w(RealmProxyMediator realmProxyMediator) {
        return new OsSchemaInfo(realmProxyMediator.getExpectedObjectSchemaInfoMap().values());
    }

    /* renamed from: x */
    public static Realm m29711x(RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        return new Realm(realmCache, versionID);
    }

    /* renamed from: y */
    public static Realm m29710y(OsSharedRealm osSharedRealm) {
        return new Realm(osSharedRealm);
    }

    /* renamed from: A */
    public RealmModel m29727A(Class cls, boolean z, List list) {
        Table m29580h = this.f66524h.m29580h(cls);
        if (OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, this.configuration.getSchemaMediator().getSimpleClassName(cls)) == null) {
            return this.configuration.getSchemaMediator().newInstance(cls, this, OsObject.create(m29580h), this.f66524h.m29584d(cls), z, list);
        }
        throw new RealmException(String.format(Locale.US, "'%s' has a primary key, use 'createObject(Class<E>, Object)' instead.", m29580h.getClassName()));
    }

    /* renamed from: B */
    public final Scanner m29726B(InputStream inputStream) {
        return new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
    }

    /* renamed from: C */
    public Table m29725C(Class cls) {
        return this.f66524h.m29580h(cls);
    }

    /* renamed from: D */
    public boolean m29724D(Class cls) {
        return this.configuration.getSchemaMediator().hasPrimaryKey(cls);
    }

    public void addChangeListener(RealmChangeListener<Realm> realmChangeListener) {
        addListener(realmChangeListener);
    }

    public Flowable<Realm> asFlowable() {
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

    public <E extends RealmModel> List<E> copyFromRealm(Iterable<E> iterable) {
        return copyFromRealm(iterable, Integer.MAX_VALUE);
    }

    public <E extends RealmModel> E copyToRealm(E e, ImportFlag... importFlagArr) {
        m29716s(e);
        return (E) m29714u(e, false, new HashMap(), Util.toSet(importFlagArr));
    }

    public <E extends RealmModel> E copyToRealmOrUpdate(E e, ImportFlag... importFlagArr) {
        m29716s(e);
        m29718q(e.getClass());
        return (E) m29714u(e, true, new HashMap(), Util.toSet(importFlagArr));
    }

    public <E extends RealmModel> void createAllFromJson(Class<E> cls, JSONArray jSONArray) {
        if (cls == null || jSONArray == null) {
            return;
        }
        checkIfValid();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, jSONArray.getJSONObject(i), false);
            } catch (JSONException e) {
                throw new RealmException("Could not map JSON", e);
            }
        }
    }

    public <E extends RealmModel> E createEmbeddedObject(Class<E> cls, RealmModel realmModel, String str) {
        checkIfValid();
        Util.checkNull(realmModel, "parentObject");
        Util.checkEmpty(str, "parentProperty");
        if (RealmObject.isManaged(realmModel) && RealmObject.isValid(realmModel)) {
            return (E) this.configuration.getSchemaMediator().newInstance(cls, this, m29755m(this.f66524h.m29582f(cls).getClassName(), (RealmObjectProxy) realmModel, str, this.f66524h, this.f66524h.m29582f(realmModel.getClass())), this.f66524h.m29584d(cls), true, Collections.EMPTY_LIST);
        }
        throw new IllegalArgumentException("Only valid, managed objects can be a parent to an embedded object.");
    }

    public <E extends RealmModel> E createObject(Class<E> cls) {
        checkIfValid();
        RealmProxyMediator schemaMediator = this.configuration.getSchemaMediator();
        if (!schemaMediator.isEmbedded(cls)) {
            return (E) m29727A(cls, true, Collections.emptyList());
        }
        throw new IllegalArgumentException("This class is marked embedded. Use `createEmbeddedObject(class, parent, property)` instead:  " + schemaMediator.getSimpleClassName(cls));
    }

    @Nullable
    public <E extends RealmModel> E createObjectFromJson(Class<E> cls, JSONObject jSONObject) {
        if (cls == null || jSONObject == null) {
            return null;
        }
        checkIfValid();
        try {
            return (E) this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, jSONObject, false);
        } catch (JSONException e) {
            throw new RealmException("Could not map JSON", e);
        }
    }

    public <E extends RealmModel> void createOrUpdateAllFromJson(Class<E> cls, JSONArray jSONArray) {
        if (cls == null || jSONArray == null) {
            return;
        }
        checkIfValid();
        m29718q(cls);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, jSONArray.getJSONObject(i), true);
            } catch (JSONException e) {
                throw new RealmException("Could not map JSON", e);
            }
        }
    }

    public <E extends RealmModel> E createOrUpdateObjectFromJson(Class<E> cls, JSONObject jSONObject) {
        if (cls == null || jSONObject == null) {
            return null;
        }
        checkIfValid();
        m29718q(cls);
        try {
            return (E) this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, jSONObject, true);
        } catch (JSONException e) {
            throw new RealmException("Could not map JSON", e);
        }
    }

    public void delete(Class<? extends RealmModel> cls) {
        checkIfValid();
        this.f66524h.m29580h(cls).clear();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void deleteAll() {
        super.deleteAll();
    }

    public void executeTransaction(Transaction transaction) {
        if (transaction != null) {
            checkIfValid();
            checkAllowWritesOnUiThread();
            beginTransaction();
            try {
                transaction.execute(this);
                commitTransaction();
                return;
            } catch (Throwable th2) {
                if (isInTransaction()) {
                    cancelTransaction();
                } else {
                    RealmLog.warn("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
                throw th2;
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
        return this.f66524h;
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ long getVersion() {
        return super.getVersion();
    }

    public void insert(Collection<? extends RealmModel> collection) {
        checkIfValidAndInTransaction();
        if (collection != null) {
            if (collection.isEmpty()) {
                return;
            }
            this.configuration.getSchemaMediator().insert(this, collection);
            return;
        }
        throw new IllegalArgumentException("Null objects cannot be inserted into Realm.");
    }

    public void insertOrUpdate(Collection<? extends RealmModel> collection) {
        checkIfValidAndInTransaction();
        if (collection != null) {
            if (collection.isEmpty()) {
                return;
            }
            this.configuration.getSchemaMediator().insertOrUpdate(this, collection);
            return;
        }
        throw new IllegalArgumentException("Null objects cannot be inserted into Realm.");
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
        for (RealmObjectSchema realmObjectSchema : this.f66524h.getAll()) {
            if (!realmObjectSchema.getClassName().startsWith("__") && realmObjectSchema.m29619f().size() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isFrozen() {
        return super.isFrozen();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isInTransaction() {
        return super.isInTransaction();
    }

    /* renamed from: q */
    public final void m29718q(Class cls) {
        if (m29724D(cls)) {
            return;
        }
        throw new IllegalArgumentException("A RealmObject with no @PrimaryKey cannot be updated: " + cls.toString());
    }

    /* renamed from: r */
    public final void m29717r(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException("maxDepth must be > 0. It was: " + i);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void refresh() {
        super.refresh();
    }

    public void removeAllChangeListeners() {
        removeAllListeners();
    }

    public void removeChangeListener(RealmChangeListener<Realm> realmChangeListener) {
        removeListener(realmChangeListener);
    }

    /* renamed from: s */
    public final void m29716s(RealmModel realmModel) {
        if (realmModel != null) {
            return;
        }
        throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
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

    /* renamed from: t */
    public final void m29715t(RealmModel realmModel) {
        if (realmModel != null) {
            if (RealmObject.isManaged(realmModel) && RealmObject.isValid(realmModel)) {
                if (!(realmModel instanceof DynamicRealmObject)) {
                    return;
                }
                throw new IllegalArgumentException("DynamicRealmObject cannot be copied from Realm.");
            }
            throw new IllegalArgumentException("Only valid managed objects can be copied from Realm.");
        }
        throw new IllegalArgumentException("Null objects cannot be copied from Realm.");
    }

    /* renamed from: u */
    public final RealmModel m29714u(RealmModel realmModel, boolean z, Map map, Set set) {
        checkIfValid();
        if (isInTransaction()) {
            if (!this.configuration.getSchemaMediator().isEmbedded(Util.getOriginalModelClass(realmModel.getClass()))) {
                try {
                    return this.configuration.getSchemaMediator().copyOrUpdate(this, realmModel, z, map, set);
                } catch (RuntimeException e) {
                    if (e.getMessage().startsWith("Attempting to create an object of type")) {
                        throw new RealmPrimaryKeyConstraintException(e.getMessage());
                    }
                    throw e;
                }
            }
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
        throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
    }

    /* renamed from: v */
    public final RealmModel m29713v(RealmModel realmModel, int i, Map map) {
        checkIfValid();
        return this.configuration.getSchemaMediator().createDetachedCopy(realmModel, i, map);
    }

    @Override // io.realm.BaseRealm
    @Deprecated
    public /* bridge */ /* synthetic */ boolean waitForChange() {
        return super.waitForChange();
    }

    public <E extends RealmModel> RealmQuery<E> where(Class<E> cls) {
        checkIfValid();
        return RealmQuery.m29616b(this, cls);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void writeCopyTo(File file) {
        super.writeCopyTo(file);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void writeEncryptedCopyTo(File file, byte[] bArr) {
        super.writeEncryptedCopyTo(file, bArr);
    }

    /* renamed from: z */
    public RealmModel m29709z(Class cls, Object obj, boolean z, List list) {
        return this.configuration.getSchemaMediator().newInstance(cls, this, OsObject.createWithPrimaryKey(this.f66524h.m29580h(cls), obj), this.f66524h.m29584d(cls), z, list);
    }

    public static void migrateRealm(RealmConfiguration realmConfiguration, @Nullable RealmMigration realmMigration) throws FileNotFoundException {
        BaseRealm.migrateRealm(realmConfiguration, realmMigration);
    }

    public <E extends RealmModel> List<E> copyFromRealm(Iterable<E> iterable, int i) {
        ArrayList arrayList;
        m29717r(i);
        if (iterable == null) {
            return new ArrayList(0);
        }
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        for (E e : iterable) {
            m29715t(e);
            arrayList.add(m29713v(e, i, hashMap));
        }
        return arrayList;
    }

    public RealmAsyncTask executeTransactionAsync(Transaction transaction, Transaction.OnSuccess onSuccess) {
        if (onSuccess != null) {
            return executeTransactionAsync(transaction, onSuccess, null);
        }
        throw new IllegalArgumentException("onSuccess callback can't be null");
    }

    @Override // io.realm.BaseRealm
    public Realm freeze() {
        return (Realm) RealmCache.m29695f(this.configuration, Realm.class, this.sharedRealm.getVersionID());
    }

    public <E extends RealmModel> List<E> copyToRealm(Iterable<E> iterable, ImportFlag... importFlagArr) {
        ArrayList arrayList;
        if (iterable == null) {
            return new ArrayList();
        }
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        for (E e : iterable) {
            m29716s(e);
            arrayList.add(m29714u(e, false, hashMap, Util.toSet(importFlagArr)));
        }
        return arrayList;
    }

    public <E extends RealmModel> List<E> copyToRealmOrUpdate(Iterable<E> iterable, ImportFlag... importFlagArr) {
        ArrayList arrayList;
        if (iterable == null) {
            return new ArrayList(0);
        }
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        Set set = Util.toSet(importFlagArr);
        for (E e : iterable) {
            m29716s(e);
            arrayList.add(m29714u(e, true, hashMap, set));
        }
        return arrayList;
    }

    @Nullable
    public <E extends RealmModel> E createObjectFromJson(Class<E> cls, String str) {
        if (cls == null || str == null || str.length() == 0) {
            return null;
        }
        try {
            return (E) createObjectFromJson(cls, new JSONObject(str));
        } catch (JSONException e) {
            throw new RealmException("Could not create Json object from string", e);
        }
    }

    public RealmAsyncTask executeTransactionAsync(Transaction transaction, Transaction.OnError onError) {
        if (onError != null) {
            return executeTransactionAsync(transaction, null, onError);
        }
        throw new IllegalArgumentException("onError callback can't be null");
    }

    public <E extends RealmModel> void createAllFromJson(Class<E> cls, String str) {
        if (cls == null || str == null || str.length() == 0) {
            return;
        }
        try {
            createAllFromJson(cls, new JSONArray(str));
        } catch (JSONException e) {
            throw new RealmException("Could not create JSON array from string", e);
        }
    }

    public <E extends RealmModel> E createOrUpdateObjectFromJson(Class<E> cls, String str) {
        if (cls == null || str == null || str.length() == 0) {
            return null;
        }
        checkIfValid();
        m29718q(cls);
        try {
            return (E) createOrUpdateObjectFromJson(cls, new JSONObject(str));
        } catch (JSONException e) {
            throw new RealmException("Could not create Json object from string", e);
        }
    }

    public void insert(RealmModel realmModel) {
        checkIfValidAndInTransaction();
        if (realmModel != null) {
            this.configuration.getSchemaMediator().insert(this, realmModel, new HashMap());
            return;
        }
        throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
    }

    public void insertOrUpdate(RealmModel realmModel) {
        checkIfValidAndInTransaction();
        if (realmModel != null) {
            this.configuration.getSchemaMediator().insertOrUpdate(this, realmModel, new HashMap());
            return;
        }
        throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
    }

    public <E extends RealmModel> E createObject(Class<E> cls, @Nullable Object obj) {
        checkIfValid();
        RealmProxyMediator schemaMediator = this.configuration.getSchemaMediator();
        if (!schemaMediator.isEmbedded(cls)) {
            return (E) m29709z(cls, obj, true, Collections.emptyList());
        }
        throw new IllegalArgumentException("This class is marked embedded. Use `createEmbeddedObject(class, parent, property)` instead:  " + schemaMediator.getSimpleClassName(cls));
    }

    public <E extends RealmModel> void createOrUpdateAllFromJson(Class<E> cls, String str) {
        if (cls == null || str == null || str.length() == 0) {
            return;
        }
        checkIfValid();
        m29718q(cls);
        try {
            createOrUpdateAllFromJson(cls, new JSONArray(str));
        } catch (JSONException e) {
            throw new RealmException("Could not create JSON array from string", e);
        }
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
                RealmThreadPoolExecutor realmThreadPoolExecutor = BaseRealm.f66470g;
                return new RealmAsyncTaskImpl(realmThreadPoolExecutor.submitTransaction(new RunnableC11241a(configuration, transaction, canDeliverNotification, onSuccess, realmNotifier, onError)), realmThreadPoolExecutor);
            }
            throw new IllegalStateException("Write transactions on a frozen Realm is not allowed.");
        }
        throw new IllegalArgumentException("Transaction should not be null");
    }

    @Nullable
    public <E extends RealmModel> E createObjectFromJson(Class<E> cls, InputStream inputStream) throws IOException {
        E e;
        Scanner scanner = null;
        if (cls == null || inputStream == null) {
            return null;
        }
        checkIfValid();
        try {
            if (OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, this.configuration.getSchemaMediator().getSimpleClassName(cls)) != null) {
                try {
                    scanner = m29726B(inputStream);
                    e = (E) this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, new JSONObject(scanner.next()), false);
                    scanner.close();
                } catch (JSONException e2) {
                    throw new RealmException("Failed to read JSON", e2);
                }
            } else {
                JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, "UTF-8"));
                try {
                    e = (E) this.configuration.getSchemaMediator().createUsingJsonStream(cls, this, jsonReader);
                } finally {
                    jsonReader.close();
                }
            }
            return e;
        } catch (Throwable th2) {
            if (scanner != null) {
                scanner.close();
            }
            throw th2;
        }
    }

    public <E extends RealmModel> void createAllFromJson(Class<E> cls, InputStream inputStream) throws IOException {
        if (cls == null || inputStream == null) {
            return;
        }
        checkIfValid();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, "UTF-8"));
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                this.configuration.getSchemaMediator().createUsingJsonStream(cls, this, jsonReader);
            }
            jsonReader.endArray();
            jsonReader.close();
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    public <E extends RealmModel> E copyFromRealm(E e) {
        return (E) copyFromRealm((Realm) e, Integer.MAX_VALUE);
    }

    public <E extends RealmModel> E createOrUpdateObjectFromJson(Class<E> cls, InputStream inputStream) {
        Scanner scanner = null;
        if (cls == null || inputStream == null) {
            return null;
        }
        checkIfValid();
        m29718q(cls);
        try {
            try {
                scanner = m29726B(inputStream);
                E e = (E) createOrUpdateObjectFromJson(cls, new JSONObject(scanner.next()));
                scanner.close();
                return e;
            } catch (JSONException e2) {
                throw new RealmException("Failed to read JSON", e2);
            }
        } catch (Throwable th2) {
            if (scanner != null) {
                scanner.close();
            }
            throw th2;
        }
    }

    public <E extends RealmModel> E copyFromRealm(E e, int i) {
        m29717r(i);
        m29715t(e);
        return (E) m29713v(e, i, new HashMap());
    }

    public <E extends RealmModel> void createOrUpdateAllFromJson(Class<E> cls, InputStream inputStream) {
        if (cls == null || inputStream == null) {
            return;
        }
        checkIfValid();
        m29718q(cls);
        Scanner scanner = null;
        try {
            try {
                scanner = m29726B(inputStream);
                JSONArray jSONArray = new JSONArray(scanner.next());
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, jSONArray.getJSONObject(i), true);
                }
                scanner.close();
            } catch (JSONException e) {
                throw new RealmException("Failed to read JSON", e);
            }
        } catch (Throwable th2) {
            if (scanner != null) {
                scanner.close();
            }
            throw th2;
        }
    }

    public Realm(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.f66524h = new C17590Fd0(this, new ColumnIndices(this.configuration.getSchemaMediator(), osSharedRealm.getSchemaInfo()));
    }
}
