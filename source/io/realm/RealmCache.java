package io.realm;

import io.realm.BaseRealm;
import io.realm.internal.ObjectServerFacade;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import io.realm.internal.Util;
import io.realm.internal.android.AndroidCapabilities;
import io.realm.internal.android.AndroidRealmNotifier;
import io.realm.internal.async.RealmAsyncTaskImpl;
import io.realm.internal.async.RealmThreadPoolExecutor;
import io.realm.internal.util.Pair;
import io.realm.log.RealmLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class RealmCache {

    /* renamed from: f */
    public static final List f66542f = new ArrayList();

    /* renamed from: g */
    public static final Collection f66543g = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final String f66545b;

    /* renamed from: c */
    public RealmConfiguration f66546c;

    /* renamed from: a */
    public final Map f66544a = new HashMap();

    /* renamed from: d */
    public final AtomicBoolean f66547d = new AtomicBoolean(false);

    /* renamed from: e */
    public final Set f66548e = new HashSet();

    /* loaded from: classes5.dex */
    public enum RealmCacheType {
        TYPED_REALM,
        DYNAMIC_REALM;

        public static RealmCacheType valueOf(Class<? extends BaseRealm> cls) {
            if (cls == Realm.class) {
                return TYPED_REALM;
            }
            if (cls == DynamicRealm.class) {
                return DYNAMIC_REALM;
            }
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
    }

    /* renamed from: io.realm.RealmCache$a */
    /* loaded from: classes5.dex */
    public class RunnableC11247a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ File f66549a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f66550b;

        /* renamed from: c */
        public final /* synthetic */ boolean f66551c;

        /* renamed from: d */
        public final /* synthetic */ String f66552d;

        public RunnableC11247a(File file, RealmConfiguration realmConfiguration, boolean z, String str) {
            this.f66549a = file;
            this.f66550b = realmConfiguration;
            this.f66551c = z;
            this.f66552d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f66549a != null) {
                RealmCache.m29698c(this.f66550b.getAssetFilePath(), this.f66549a);
            }
            if (this.f66551c) {
                RealmCache.m29698c(ObjectServerFacade.getFacade(this.f66550b.isSyncConfiguration()).getSyncServerCertificateAssetName(this.f66550b), new File(this.f66552d));
            }
        }
    }

    /* renamed from: io.realm.RealmCache$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11248b {
        /* renamed from: a */
        void mo29679a();
    }

    /* renamed from: io.realm.RealmCache$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC11249c {
        /* renamed from: a */
        void mo29678a(int i);
    }

    /* renamed from: io.realm.RealmCache$d */
    /* loaded from: classes5.dex */
    public static class RunnableC11250d implements Runnable {

        /* renamed from: a */
        public final RealmConfiguration f66553a;

        /* renamed from: b */
        public final BaseRealm.InstanceCallback f66554b;

        /* renamed from: c */
        public final Class f66555c;

        /* renamed from: d */
        public final CountDownLatch f66556d = new CountDownLatch(1);

        /* renamed from: e */
        public final RealmNotifier f66557e;

        /* renamed from: f */
        public Future f66558f;

        /* renamed from: io.realm.RealmCache$d$a */
        /* loaded from: classes5.dex */
        public class RunnableC11251a implements Runnable {
            public RunnableC11251a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (RunnableC11250d.this.f66558f != null && !RunnableC11250d.this.f66558f.isCancelled()) {
                    BaseRealm baseRealm = null;
                    try {
                        BaseRealm m29696e = RealmCache.m29696e(RunnableC11250d.this.f66553a, RunnableC11250d.this.f66555c);
                        RunnableC11250d.this.f66556d.countDown();
                        th = null;
                        baseRealm = m29696e;
                    } catch (Throwable th2) {
                        th = th2;
                        RunnableC11250d.this.f66556d.countDown();
                    }
                    if (baseRealm != null) {
                        RunnableC11250d.this.f66554b.onSuccess(baseRealm);
                        return;
                    } else {
                        RunnableC11250d.this.f66554b.onError(th);
                        return;
                    }
                }
                RunnableC11250d.this.f66556d.countDown();
            }
        }

        /* renamed from: io.realm.RealmCache$d$b */
        /* loaded from: classes5.dex */
        public class RunnableC11252b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Throwable f66560a;

            public RunnableC11252b(Throwable th2) {
                this.f66560a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC11250d.this.f66554b.onError(this.f66560a);
            }
        }

        public RunnableC11250d(RealmNotifier realmNotifier, RealmConfiguration realmConfiguration, BaseRealm.InstanceCallback instanceCallback, Class cls) {
            this.f66553a = realmConfiguration;
            this.f66555c = cls;
            this.f66554b = instanceCallback;
            this.f66557e = realmNotifier;
        }

        /* renamed from: g */
        public void m29672g(Future future) {
            this.f66558f = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseRealm baseRealm = null;
            try {
                try {
                    baseRealm = RealmCache.m29696e(this.f66553a, this.f66555c);
                    if (!this.f66557e.post(new RunnableC11251a())) {
                        this.f66556d.countDown();
                    }
                    if (!this.f66556d.await(2L, TimeUnit.SECONDS)) {
                        RealmLog.warn("Timeout for creating Realm instance in foreground thread in `CreateRealmRunnable` ", new Object[0]);
                    }
                    if (baseRealm == null) {
                        return;
                    }
                }
            } catch (InterruptedException e) {
                RealmLog.warn(e, "`CreateRealmRunnable` has been interrupted.", new Object[0]);
                if (baseRealm == null) {
                    return;
                }
            }
            baseRealm.close();
        }
    }

    /* renamed from: io.realm.RealmCache$e */
    /* loaded from: classes5.dex */
    public static class C11253e extends AbstractC11254f {

        /* renamed from: c */
        public BaseRealm f66562c;

        public C11253e() {
            super(null);
        }

        @Override // io.realm.RealmCache.AbstractC11254f
        /* renamed from: a */
        public void mo29668a() {
            String path = this.f66562c.getPath();
            this.f66563a.set(null);
            this.f66562c = null;
            if (this.f66564b.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + path + " not be negative.");
        }

        @Override // io.realm.RealmCache.AbstractC11254f
        /* renamed from: c */
        public BaseRealm mo29667c() {
            return this.f66562c;
        }

        @Override // io.realm.RealmCache.AbstractC11254f
        /* renamed from: d */
        public int mo29666d() {
            return this.f66564b.get();
        }

        @Override // io.realm.RealmCache.AbstractC11254f
        /* renamed from: e */
        public boolean mo29665e() {
            if (this.f66562c != null) {
                return true;
            }
            return false;
        }

        @Override // io.realm.RealmCache.AbstractC11254f
        /* renamed from: g */
        public void mo29664g(BaseRealm baseRealm) {
            this.f66562c = baseRealm;
            this.f66563a.set(0);
            this.f66564b.incrementAndGet();
        }

        public /* synthetic */ C11253e(RunnableC11247a runnableC11247a) {
            this();
        }
    }

    public RealmCache(String str) {
        this.f66545b = str;
    }

    /* renamed from: b */
    public static void m29699b(RealmConfiguration realmConfiguration) {
        File file;
        if (realmConfiguration.hasAssetFile()) {
            file = new File(realmConfiguration.getRealmDirectory(), realmConfiguration.getRealmFileName());
        } else {
            file = null;
        }
        String syncServerCertificateFilePath = ObjectServerFacade.getFacade(realmConfiguration.isSyncConfiguration()).getSyncServerCertificateFilePath(realmConfiguration);
        boolean z = !Util.isEmptyString(syncServerCertificateFilePath);
        if (file != null || z) {
            OsObjectStore.callWithLock(realmConfiguration, new RunnableC11247a(file, realmConfiguration, z, syncServerCertificateFilePath));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m29698c(java.lang.String r6, java.io.File r7) {
        /*
            boolean r0 = r7.exists()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            android.content.Context r1 = io.realm.BaseRealm.f66469f     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            java.io.InputStream r1 = r1.open(r6)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            if (r1 == 0) goto L4d
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
        L1d:
            int r3 = r1.read(r7)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r4 = -1
            if (r3 <= r4) goto L2f
            r4 = 0
            r2.write(r7, r4, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            goto L1d
        L29:
            r6 = move-exception
        L2a:
            r0 = r1
            goto L85
        L2c:
            r7 = move-exception
        L2d:
            r0 = r1
            goto L6b
        L2f:
            r1.close()     // Catch: java.io.IOException -> L33
            goto L34
        L33:
            r0 = move-exception
        L34:
            r2.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r6 = move-exception
            if (r0 != 0) goto L3c
            r0 = r6
        L3c:
            if (r0 != 0) goto L3f
            return
        L3f:
            io.realm.exceptions.RealmFileException r6 = new io.realm.exceptions.RealmFileException
            io.realm.exceptions.RealmFileException$Kind r7 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR
            r6.<init>(r7, r0)
            throw r6
        L47:
            r6 = move-exception
            r2 = r0
            goto L2a
        L4a:
            r7 = move-exception
            r2 = r0
            goto L2d
        L4d:
            io.realm.exceptions.RealmFileException r7 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            io.realm.exceptions.RealmFileException$Kind r2 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r3.<init>()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            java.lang.String r4 = "Invalid input stream to the asset file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r3.append(r6)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r7.<init>(r2, r3)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            throw r7     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
        L66:
            r6 = move-exception
            r2 = r0
            goto L85
        L69:
            r7 = move-exception
            r2 = r0
        L6b:
            io.realm.exceptions.RealmFileException r1 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L84
            io.realm.exceptions.RealmFileException$Kind r3 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "Could not resolve the path to the asset file: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L84
            r4.append(r6)     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L84
            r1.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r6 = move-exception
        L85:
            if (r0 == 0) goto L8c
            r0.close()     // Catch: java.io.IOException -> L8b
            goto L8c
        L8b:
        L8c:
            if (r2 == 0) goto L91
            r2.close()     // Catch: java.io.IOException -> L91
        L91:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmCache.m29698c(java.lang.String, java.io.File):void");
    }

    /* renamed from: e */
    public static BaseRealm m29696e(RealmConfiguration realmConfiguration, Class cls) {
        return m29690k(realmConfiguration.getPath(), true).m29693h(realmConfiguration, cls, OsSharedRealm.VersionID.LIVE);
    }

    /* renamed from: f */
    public static BaseRealm m29695f(RealmConfiguration realmConfiguration, Class cls, OsSharedRealm.VersionID versionID) {
        return m29690k(realmConfiguration.getPath(), true).m29693h(realmConfiguration, cls, versionID);
    }

    /* renamed from: g */
    public static RealmAsyncTask m29694g(RealmConfiguration realmConfiguration, BaseRealm.InstanceCallback instanceCallback, Class cls) {
        return m29690k(realmConfiguration.getPath(), true).m29692i(realmConfiguration, instanceCallback, cls);
    }

    /* renamed from: k */
    public static RealmCache m29690k(String str, boolean z) {
        RealmCache realmCache;
        List list = f66542f;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                realmCache = null;
                while (it.hasNext()) {
                    RealmCache realmCache2 = (RealmCache) ((WeakReference) it.next()).get();
                    if (realmCache2 == null) {
                        it.remove();
                    } else if (realmCache2.f66545b.equals(str)) {
                        realmCache = realmCache2;
                    }
                }
                if (realmCache == null && z) {
                    realmCache = new RealmCache(str);
                    f66542f.add(new WeakReference(realmCache));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return realmCache;
    }

    /* renamed from: m */
    public static int m29688m(RealmConfiguration realmConfiguration) {
        int i = 0;
        RealmCache m29690k = m29690k(realmConfiguration.getPath(), false);
        if (m29690k == null) {
            return 0;
        }
        for (AbstractC11254f abstractC11254f : m29690k.f66544a.values()) {
            i += abstractC11254f.mo29666d();
        }
        return i;
    }

    /* renamed from: q */
    public static void m29684q(RealmConfiguration realmConfiguration, InterfaceC11249c interfaceC11249c) {
        synchronized (f66542f) {
            try {
                RealmCache m29690k = m29690k(realmConfiguration.getPath(), false);
                if (m29690k == null) {
                    interfaceC11249c.mo29678a(0);
                } else {
                    m29690k.m29691j(interfaceC11249c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m29697d(Class cls, AbstractC11254f abstractC11254f, OsSharedRealm.VersionID versionID) {
        BaseRealm m29746o;
        if (cls == Realm.class) {
            m29746o = Realm.m29711x(this, versionID);
            m29746o.getSchema().createKeyPathMapping();
        } else if (cls == DynamicRealm.class) {
            m29746o = DynamicRealm.m29746o(this, versionID);
        } else {
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
        abstractC11254f.mo29664g(m29746o);
    }

    /* renamed from: h */
    public final synchronized BaseRealm m29693h(RealmConfiguration realmConfiguration, Class cls, OsSharedRealm.VersionID versionID) {
        BaseRealm mo29667c;
        try {
            AbstractC11254f m29687n = m29687n(cls, versionID);
            boolean z = false;
            if (m29686o() == 0) {
                z = true;
            }
            if (z) {
                m29699b(realmConfiguration);
                boolean z2 = !realmConfiguration.realmExists();
                if (realmConfiguration.isSyncConfiguration()) {
                    if (!z2) {
                        if (this.f66548e.contains(realmConfiguration.getPath())) {
                        }
                    }
                    ObjectServerFacade.getSyncFacadeIfPossible().wrapObjectStoreSessionIfRequired(new OsRealmConfig.Builder(realmConfiguration).build());
                    ObjectServerFacade.getSyncFacadeIfPossible().downloadInitialRemoteChanges(realmConfiguration);
                    this.f66548e.remove(realmConfiguration.getPath());
                }
                this.f66546c = realmConfiguration;
            } else {
                m29680u(realmConfiguration);
            }
            if (!m29687n.mo29665e()) {
                m29697d(cls, m29687n, versionID);
            }
            m29687n.m29670f(1);
            mo29667c = m29687n.mo29667c();
            if (z) {
                ObjectServerFacade.getSyncFacadeIfPossible().downloadInitialFlexibleSyncData(Realm.m29710y(mo29667c.sharedRealm), realmConfiguration);
                if (!realmConfiguration.isReadOnly()) {
                    mo29667c.refresh();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return mo29667c;
    }

    /* renamed from: i */
    public final synchronized RealmAsyncTask m29692i(RealmConfiguration realmConfiguration, BaseRealm.InstanceCallback instanceCallback, Class cls) {
        RealmThreadPoolExecutor realmThreadPoolExecutor;
        Future<?> submitTransaction;
        try {
            AndroidCapabilities androidCapabilities = new AndroidCapabilities();
            androidCapabilities.checkCanDeliverNotification("Realm instances cannot be loaded asynchronously on a non-looper thread.");
            if (instanceCallback != null) {
                if (realmConfiguration.isSyncConfiguration() && !realmConfiguration.realmExists()) {
                    this.f66548e.add(realmConfiguration.getPath());
                }
                RunnableC11250d runnableC11250d = new RunnableC11250d(new AndroidRealmNotifier(null, androidCapabilities), realmConfiguration, instanceCallback, cls);
                realmThreadPoolExecutor = BaseRealm.f66470g;
                submitTransaction = realmThreadPoolExecutor.submitTransaction(runnableC11250d);
                runnableC11250d.m29672g(submitTransaction);
                ObjectServerFacade.getSyncFacadeIfPossible().createNativeSyncSession(realmConfiguration);
            } else {
                throw new IllegalArgumentException("The callback cannot be null.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new RealmAsyncTaskImpl(submitTransaction, realmThreadPoolExecutor);
    }

    /* renamed from: j */
    public final synchronized void m29691j(InterfaceC11249c interfaceC11249c) {
        interfaceC11249c.mo29678a(m29686o());
    }

    /* renamed from: l */
    public RealmConfiguration m29689l() {
        return this.f66546c;
    }

    /* renamed from: n */
    public final AbstractC11254f m29687n(Class cls, OsSharedRealm.VersionID versionID) {
        Pair pair = new Pair(RealmCacheType.valueOf(cls), versionID);
        AbstractC11254f abstractC11254f = (AbstractC11254f) this.f66544a.get(pair);
        if (abstractC11254f == null) {
            if (versionID.equals(OsSharedRealm.VersionID.LIVE)) {
                abstractC11254f = new C11255g(null);
            } else {
                abstractC11254f = new C11253e(null);
            }
            this.f66544a.put(pair, abstractC11254f);
        }
        return abstractC11254f;
    }

    /* renamed from: o */
    public final int m29686o() {
        int i = 0;
        for (AbstractC11254f abstractC11254f : this.f66544a.values()) {
            i += abstractC11254f.m29671b();
        }
        return i;
    }

    /* renamed from: p */
    public final int m29685p() {
        int i = 0;
        for (AbstractC11254f abstractC11254f : this.f66544a.values()) {
            if (abstractC11254f instanceof C11255g) {
                i += abstractC11254f.m29671b();
            }
        }
        return i;
    }

    /* renamed from: r */
    public synchronized void m29683r(InterfaceC11248b interfaceC11248b) {
        interfaceC11248b.mo29679a();
    }

    /* renamed from: s */
    public void m29682s() {
        if (!this.f66547d.getAndSet(true)) {
            f66543g.add(this);
        }
    }

    /* renamed from: t */
    public synchronized void m29681t(BaseRealm baseRealm) {
        OsSharedRealm.VersionID versionID;
        BaseRealm mo29667c;
        try {
            String path = baseRealm.getPath();
            Class<?> cls = baseRealm.getClass();
            if (baseRealm.isFrozen()) {
                versionID = baseRealm.sharedRealm.getVersionID();
            } else {
                versionID = OsSharedRealm.VersionID.LIVE;
            }
            AbstractC11254f m29687n = m29687n(cls, versionID);
            int mo29666d = m29687n.mo29666d();
            if (mo29666d <= 0) {
                RealmLog.warn("%s has been closed already. refCount is %s", path, Integer.valueOf(mo29666d));
                return;
            }
            int i = mo29666d - 1;
            if (i == 0) {
                m29687n.mo29668a();
                baseRealm.m29759i();
                if (m29685p() == 0) {
                    this.f66546c = null;
                    for (AbstractC11254f abstractC11254f : this.f66544a.values()) {
                        if ((abstractC11254f instanceof C11253e) && (mo29667c = abstractC11254f.mo29667c()) != null) {
                            while (!mo29667c.isClosed()) {
                                mo29667c.close();
                            }
                        }
                    }
                    ObjectServerFacade.getFacade(baseRealm.getConfiguration().isSyncConfiguration()).realmClosed(baseRealm.getConfiguration());
                }
            } else {
                m29687n.m29669h(i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: u */
    public final void m29680u(RealmConfiguration realmConfiguration) {
        if (this.f66546c.equals(realmConfiguration)) {
            return;
        }
        if (Arrays.equals(this.f66546c.getEncryptionKey(), realmConfiguration.getEncryptionKey())) {
            RealmMigration migration = realmConfiguration.getMigration();
            RealmMigration migration2 = this.f66546c.getMigration();
            if (migration2 != null && migration != null && migration2.getClass().equals(migration.getClass()) && !migration.equals(migration2)) {
                throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: " + realmConfiguration.getMigration().getClass().getCanonicalName());
            }
            throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. \nCached configuration: \n" + this.f66546c + "\n\nNew configuration: \n" + realmConfiguration);
        }
        throw new IllegalArgumentException("Wrong key used to decrypt Realm.");
    }

    /* renamed from: io.realm.RealmCache$g */
    /* loaded from: classes5.dex */
    public static class C11255g extends AbstractC11254f {

        /* renamed from: c */
        public final ThreadLocal f66565c;

        public C11255g() {
            super(null);
            this.f66565c = new ThreadLocal();
        }

        @Override // io.realm.RealmCache.AbstractC11254f
        /* renamed from: a */
        public void mo29668a() {
            String path = ((BaseRealm) this.f66565c.get()).getPath();
            this.f66563a.set(null);
            this.f66565c.set(null);
            if (this.f66564b.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + path + " can not be negative.");
        }

        @Override // io.realm.RealmCache.AbstractC11254f
        /* renamed from: c */
        public BaseRealm mo29667c() {
            return (BaseRealm) this.f66565c.get();
        }

        @Override // io.realm.RealmCache.AbstractC11254f
        /* renamed from: d */
        public int mo29666d() {
            Integer num = (Integer) this.f66563a.get();
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        @Override // io.realm.RealmCache.AbstractC11254f
        /* renamed from: e */
        public boolean mo29665e() {
            if (this.f66565c.get() != null) {
                return true;
            }
            return false;
        }

        @Override // io.realm.RealmCache.AbstractC11254f
        /* renamed from: g */
        public void mo29664g(BaseRealm baseRealm) {
            this.f66565c.set(baseRealm);
            this.f66563a.set(0);
            this.f66564b.incrementAndGet();
        }

        public /* synthetic */ C11255g(RunnableC11247a runnableC11247a) {
            this();
        }
    }

    /* renamed from: io.realm.RealmCache$f */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11254f {

        /* renamed from: a */
        public final ThreadLocal f66563a;

        /* renamed from: b */
        public AtomicInteger f66564b;

        public AbstractC11254f() {
            this.f66563a = new ThreadLocal();
            this.f66564b = new AtomicInteger(0);
        }

        /* renamed from: a */
        public abstract void mo29668a();

        /* renamed from: b */
        public int m29671b() {
            return this.f66564b.get();
        }

        /* renamed from: c */
        public abstract BaseRealm mo29667c();

        /* renamed from: d */
        public abstract int mo29666d();

        /* renamed from: e */
        public abstract boolean mo29665e();

        /* renamed from: f */
        public void m29670f(int i) {
            Integer num = (Integer) this.f66563a.get();
            ThreadLocal threadLocal = this.f66563a;
            if (num != null) {
                i += num.intValue();
            }
            threadLocal.set(Integer.valueOf(i));
        }

        /* renamed from: g */
        public abstract void mo29664g(BaseRealm baseRealm);

        /* renamed from: h */
        public void m29669h(int i) {
            this.f66563a.set(Integer.valueOf(i));
        }

        public /* synthetic */ AbstractC11254f(RunnableC11247a runnableC11247a) {
            this();
        }
    }
}
