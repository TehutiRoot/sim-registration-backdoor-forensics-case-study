package io.realm;

import android.content.Context;
import io.realm.Realm;
import io.realm.annotations.RealmModule;
import io.realm.coroutines.FlowFactory;
import io.realm.coroutines.RealmFlowFactory;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmCore;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Util;
import io.realm.internal.modules.CompositeMediator;
import io.realm.internal.modules.FilterableMediator;
import io.realm.p021rx.RealmObservableFactory;
import io.realm.p021rx.RxObservableFactory;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class RealmConfiguration {
    protected static final RealmProxyMediator DEFAULT_MODULE_MEDIATOR;
    public static final String DEFAULT_REALM_NAME = "default.realm";

    /* renamed from: t */
    public static final Object f66566t;

    /* renamed from: a */
    public final File f66567a;

    /* renamed from: b */
    public final String f66568b;

    /* renamed from: c */
    public final String f66569c;

    /* renamed from: d */
    public final String f66570d;

    /* renamed from: e */
    public final byte[] f66571e;

    /* renamed from: f */
    public final long f66572f;

    /* renamed from: g */
    public final RealmMigration f66573g;

    /* renamed from: h */
    public final boolean f66574h;

    /* renamed from: i */
    public final OsRealmConfig.Durability f66575i;

    /* renamed from: j */
    public final RealmProxyMediator f66576j;

    /* renamed from: k */
    public final RxObservableFactory f66577k;

    /* renamed from: l */
    public final FlowFactory f66578l;

    /* renamed from: m */
    public final Realm.Transaction f66579m;

    /* renamed from: n */
    public final boolean f66580n;

    /* renamed from: o */
    public final CompactOnLaunchCallback f66581o;

    /* renamed from: p */
    public final long f66582p;

    /* renamed from: q */
    public final boolean f66583q;

    /* renamed from: r */
    public final boolean f66584r;

    /* renamed from: s */
    public final boolean f66585s;

    /* loaded from: classes5.dex */
    public static class Builder {

        /* renamed from: a */
        public File f66586a;

        /* renamed from: b */
        public String f66587b;

        /* renamed from: c */
        public String f66588c;

        /* renamed from: d */
        public byte[] f66589d;

        /* renamed from: e */
        public long f66590e;

        /* renamed from: f */
        public RealmMigration f66591f;

        /* renamed from: g */
        public boolean f66592g;

        /* renamed from: h */
        public OsRealmConfig.Durability f66593h;

        /* renamed from: i */
        public HashSet f66594i;

        /* renamed from: j */
        public HashSet f66595j;

        /* renamed from: k */
        public boolean f66596k;

        /* renamed from: l */
        public RxObservableFactory f66597l;

        /* renamed from: m */
        public FlowFactory f66598m;

        /* renamed from: n */
        public Realm.Transaction f66599n;

        /* renamed from: o */
        public boolean f66600o;

        /* renamed from: p */
        public CompactOnLaunchCallback f66601p;

        /* renamed from: q */
        public long f66602q;

        /* renamed from: r */
        public boolean f66603r;

        /* renamed from: s */
        public boolean f66604s;

        public Builder() {
            this(BaseRealm.f66469f);
        }

        /* renamed from: a */
        public final void m29661a(Object obj) {
            if (obj.getClass().isAnnotationPresent(RealmModule.class)) {
                return;
            }
            throw new IllegalArgumentException(obj.getClass().getCanonicalName() + " is not a RealmModule. Add @RealmModule to the class definition.");
        }

        public final Builder addModule(Object obj) {
            if (obj != null) {
                m29661a(obj);
                this.f66594i.add(obj);
            }
            return this;
        }

        public Builder allowQueriesOnUiThread(boolean z) {
            this.f66604s = z;
            return this;
        }

        public Builder allowWritesOnUiThread(boolean z) {
            this.f66603r = z;
            return this;
        }

        public Builder assetFile(String str) {
            if (!Util.isEmptyString(str)) {
                if (this.f66593h != OsRealmConfig.Durability.MEM_ONLY) {
                    if (!this.f66592g) {
                        this.f66588c = str;
                        return this;
                    }
                    throw new IllegalStateException("Realm cannot use an asset file when previously configured to clear its schema in migration by calling deleteRealmIfMigrationNeeded().");
                }
                throw new RealmException("Realm can not use in-memory configuration if asset file is present.");
            }
            throw new IllegalArgumentException("A non-empty asset file path must be provided");
        }

        /* renamed from: b */
        public final void m29660b(Context context) {
            this.f66586a = context.getFilesDir();
            this.f66587b = "default.realm";
            this.f66589d = null;
            this.f66590e = 0L;
            this.f66591f = null;
            this.f66592g = false;
            this.f66593h = OsRealmConfig.Durability.FULL;
            this.f66600o = false;
            this.f66601p = null;
            if (RealmConfiguration.f66566t != null) {
                this.f66594i.add(RealmConfiguration.f66566t);
            }
            this.f66603r = false;
            this.f66604s = true;
        }

        public RealmConfiguration build() {
            if (this.f66600o) {
                if (this.f66599n == null) {
                    if (this.f66588c != null) {
                        if (!this.f66592g) {
                            if (this.f66601p != null) {
                                throw new IllegalStateException("'compactOnLaunch()' and read-only Realms cannot be combined");
                            }
                        } else {
                            throw new IllegalStateException("'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined");
                        }
                    } else {
                        throw new IllegalStateException("Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided.");
                    }
                } else {
                    throw new IllegalStateException("This Realm is marked as read-only. Read-only Realms cannot use initialData(Realm.Transaction).");
                }
            }
            if (this.f66597l == null && Util.isRxJavaAvailable()) {
                this.f66597l = new RealmObservableFactory(true);
            }
            if (this.f66598m == null && Util.isCoroutinesAvailable()) {
                this.f66598m = new RealmFlowFactory(Boolean.TRUE);
            }
            return new RealmConfiguration(new File(this.f66586a, this.f66587b), this.f66588c, this.f66589d, this.f66590e, this.f66591f, this.f66592g, this.f66593h, RealmConfiguration.createSchemaMediator(this.f66594i, this.f66595j, this.f66596k), this.f66597l, this.f66598m, this.f66599n, this.f66600o, this.f66601p, false, this.f66602q, this.f66603r, this.f66604s);
        }

        public Builder compactOnLaunch() {
            return compactOnLaunch(new DefaultCompactOnLaunchCallback());
        }

        public Builder deleteRealmIfMigrationNeeded() {
            String str = this.f66588c;
            if (str != null && str.length() != 0) {
                throw new IllegalStateException("Realm cannot clear its schema when previously configured to use an asset file by calling assetFile().");
            }
            this.f66592g = true;
            return this;
        }

        public Builder directory(File file) {
            if (file != null) {
                if (!file.isFile()) {
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IllegalArgumentException("Could not create the specified directory: " + file.getAbsolutePath() + ".");
                    } else if (file.canWrite()) {
                        this.f66586a = file;
                        return this;
                    } else {
                        throw new IllegalArgumentException("Realm directory is not writable: " + file.getAbsolutePath() + ".");
                    }
                }
                throw new IllegalArgumentException("'dir' is a file, not a directory: " + file.getAbsolutePath() + ".");
            }
            throw new IllegalArgumentException("Non-null 'dir' required.");
        }

        public Builder encryptionKey(byte[] bArr) {
            if (bArr != null) {
                if (bArr.length == 64) {
                    this.f66589d = Arrays.copyOf(bArr, bArr.length);
                    return this;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "The provided key must be %s bytes. Yours was: %s", 64, Integer.valueOf(bArr.length)));
            }
            throw new IllegalArgumentException("A non-null key must be provided");
        }

        public Builder flowFactory(@Nonnull FlowFactory flowFactory) {
            if (flowFactory != null) {
                this.f66598m = flowFactory;
                return this;
            }
            throw new IllegalArgumentException("The provided Flow factory must not be null.");
        }

        public Builder inMemory() {
            if (Util.isEmptyString(this.f66588c)) {
                this.f66593h = OsRealmConfig.Durability.MEM_ONLY;
                return this;
            }
            throw new RealmException("Realm can not use in-memory configuration if asset file is present.");
        }

        public Builder initialData(Realm.Transaction transaction) {
            this.f66599n = transaction;
            return this;
        }

        public Builder maxNumberOfActiveVersions(long j) {
            if (j >= 1) {
                this.f66602q = j;
                return this;
            }
            throw new IllegalArgumentException("Only positive numbers above 0 are allowed. Yours was: " + j);
        }

        public Builder migration(RealmMigration realmMigration) {
            if (realmMigration != null) {
                this.f66591f = realmMigration;
                return this;
            }
            throw new IllegalArgumentException("A non-null migration must be provided");
        }

        public Builder modules(Object obj, Object... objArr) {
            this.f66594i.clear();
            addModule(obj);
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    addModule(obj2);
                }
            }
            return this;
        }

        public Builder name(String str) {
            if (str != null && !str.isEmpty()) {
                this.f66587b = str;
                return this;
            }
            throw new IllegalArgumentException("A non-empty filename must be provided");
        }

        public Builder readOnly() {
            this.f66600o = true;
            return this;
        }

        public Builder rxFactory(@Nonnull RxObservableFactory rxObservableFactory) {
            if (rxObservableFactory != null) {
                this.f66597l = rxObservableFactory;
                return this;
            }
            throw new IllegalArgumentException("The provided Rx Observable factory must not be null.");
        }

        public Builder schemaVersion(long j) {
            if (j >= 0) {
                this.f66590e = j;
                return this;
            }
            throw new IllegalArgumentException("Realm schema version numbers must be 0 (zero) or higher. Yours was: " + j);
        }

        public Builder(Context context) {
            this.f66594i = new HashSet();
            this.f66595j = new HashSet();
            this.f66596k = false;
            this.f66602q = Long.MAX_VALUE;
            if (context != null) {
                RealmCore.loadLibrary(context);
                m29660b(context);
                return;
            }
            throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
        }

        public Builder compactOnLaunch(CompactOnLaunchCallback compactOnLaunchCallback) {
            if (compactOnLaunchCallback != null) {
                this.f66601p = compactOnLaunchCallback;
                return this;
            }
            throw new IllegalArgumentException("A non-null compactOnLaunch must be provided");
        }
    }

    static {
        Object defaultModule = Realm.getDefaultModule();
        f66566t = defaultModule;
        if (defaultModule != null) {
            RealmProxyMediator m29662b = m29662b(defaultModule.getClass().getCanonicalName());
            if (m29662b.transformerApplied()) {
                DEFAULT_MODULE_MEDIATOR = m29662b;
                return;
            }
            throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://docs.mongodb.com/realm/sdk/android/install/#customize-dependecies-defined-by-the-realm-gradle-plugin");
        }
        DEFAULT_MODULE_MEDIATOR = null;
    }

    public RealmConfiguration(File file, @Nullable String str, @Nullable byte[] bArr, long j, @Nullable RealmMigration realmMigration, boolean z, OsRealmConfig.Durability durability, RealmProxyMediator realmProxyMediator, @Nullable RxObservableFactory rxObservableFactory, @Nullable FlowFactory flowFactory, @Nullable Realm.Transaction transaction, boolean z2, @Nullable CompactOnLaunchCallback compactOnLaunchCallback, boolean z3, long j2, boolean z4, boolean z5) {
        this.f66567a = file.getParentFile();
        this.f66568b = file.getName();
        this.f66569c = file.getAbsolutePath();
        this.f66570d = str;
        this.f66571e = bArr;
        this.f66572f = j;
        this.f66573g = realmMigration;
        this.f66574h = z;
        this.f66575i = durability;
        this.f66576j = realmProxyMediator;
        this.f66577k = rxObservableFactory;
        this.f66578l = flowFactory;
        this.f66579m = transaction;
        this.f66580n = z2;
        this.f66581o = compactOnLaunchCallback;
        this.f66585s = z3;
        this.f66582p = j2;
        this.f66583q = z4;
        this.f66584r = z5;
    }

    /* renamed from: b */
    public static RealmProxyMediator m29662b(String str) {
        String[] split = str.split("\\.");
        String format = String.format(Locale.US, "io.realm.%s%s", split[split.length - 1], "Mediator");
        try {
            Constructor<?> constructor = Class.forName(format).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (RealmProxyMediator) constructor.newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RealmException("Could not find " + format, e);
        } catch (IllegalAccessException e2) {
            throw new RealmException("Could not create an instance of " + format, e2);
        } catch (InstantiationException e3) {
            throw new RealmException("Could not create an instance of " + format, e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Could not create an instance of " + format, e4);
        }
    }

    public static RealmProxyMediator createSchemaMediator(Set<Object> set, Set<Class<? extends RealmModel>> set2, boolean z) {
        if (set2.size() > 0) {
            return new FilterableMediator(DEFAULT_MODULE_MEDIATOR, set2, z);
        }
        if (set.size() == 1) {
            return m29662b(set.iterator().next().getClass().getCanonicalName());
        }
        RealmProxyMediator[] realmProxyMediatorArr = new RealmProxyMediator[set.size()];
        int i = 0;
        for (Object obj : set) {
            realmProxyMediatorArr[i] = m29662b(obj.getClass().getCanonicalName());
            i++;
        }
        return new CompositeMediator(realmProxyMediatorArr);
    }

    public static RealmConfiguration forRecovery(String str, @Nullable byte[] bArr, RealmProxyMediator realmProxyMediator) {
        return new RealmConfiguration(new File(str), null, bArr, 0L, null, false, OsRealmConfig.Durability.FULL, realmProxyMediator, null, null, null, true, null, true, Long.MAX_VALUE, false, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealmConfiguration realmConfiguration = (RealmConfiguration) obj;
        if (this.f66572f != realmConfiguration.f66572f || this.f66574h != realmConfiguration.f66574h || this.f66580n != realmConfiguration.f66580n || this.f66585s != realmConfiguration.f66585s) {
            return false;
        }
        File file = this.f66567a;
        if (file == null ? realmConfiguration.f66567a != null : !file.equals(realmConfiguration.f66567a)) {
            return false;
        }
        String str = this.f66568b;
        if (str == null ? realmConfiguration.f66568b != null : !str.equals(realmConfiguration.f66568b)) {
            return false;
        }
        if (!this.f66569c.equals(realmConfiguration.f66569c)) {
            return false;
        }
        String str2 = this.f66570d;
        if (str2 == null ? realmConfiguration.f66570d != null : !str2.equals(realmConfiguration.f66570d)) {
            return false;
        }
        if (!Arrays.equals(this.f66571e, realmConfiguration.f66571e)) {
            return false;
        }
        RealmMigration realmMigration = this.f66573g;
        if (realmMigration == null ? realmConfiguration.f66573g != null : !realmMigration.equals(realmConfiguration.f66573g)) {
            return false;
        }
        if (this.f66575i != realmConfiguration.f66575i || !this.f66576j.equals(realmConfiguration.f66576j)) {
            return false;
        }
        RxObservableFactory rxObservableFactory = this.f66577k;
        if (rxObservableFactory == null ? realmConfiguration.f66577k != null : !rxObservableFactory.equals(realmConfiguration.f66577k)) {
            return false;
        }
        Realm.Transaction transaction = this.f66579m;
        if (transaction == null ? realmConfiguration.f66579m != null : !transaction.equals(realmConfiguration.f66579m)) {
            return false;
        }
        CompactOnLaunchCallback compactOnLaunchCallback = this.f66581o;
        if (compactOnLaunchCallback == null ? realmConfiguration.f66581o != null : !compactOnLaunchCallback.equals(realmConfiguration.f66581o)) {
            return false;
        }
        if (this.f66582p == realmConfiguration.f66582p) {
            return true;
        }
        return false;
    }

    @Nullable
    public String getAssetFilePath() {
        return this.f66570d;
    }

    public CompactOnLaunchCallback getCompactOnLaunchCallback() {
        return this.f66581o;
    }

    public OsRealmConfig.Durability getDurability() {
        return this.f66575i;
    }

    public byte[] getEncryptionKey() {
        byte[] bArr = this.f66571e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public FlowFactory getFlowFactory() {
        FlowFactory flowFactory = this.f66578l;
        if (flowFactory != null) {
            return flowFactory;
        }
        throw new UnsupportedOperationException("The coroutines framework is missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/Kotlin/kotlinx.coroutines#android for more details");
    }

    public Realm.Transaction getInitialDataTransaction() {
        return this.f66579m;
    }

    public Realm getInstance(OsSharedRealm.VersionID versionID) {
        return (Realm) RealmCache.m29695f(this, Realm.class, versionID);
    }

    public long getMaxNumberOfActiveVersions() {
        return this.f66582p;
    }

    public RealmMigration getMigration() {
        return this.f66573g;
    }

    public String getPath() {
        return this.f66569c;
    }

    public File getRealmDirectory() {
        return this.f66567a;
    }

    public String getRealmFileName() {
        return this.f66568b;
    }

    public Set<Class<? extends RealmModel>> getRealmObjectClasses() {
        return this.f66576j.getModelClasses();
    }

    public RxObservableFactory getRxFactory() {
        RxObservableFactory rxObservableFactory = this.f66577k;
        if (rxObservableFactory != null) {
            return rxObservableFactory;
        }
        throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/realm/realm-java/tree/master/examples/rxJavaExample for more details.");
    }

    public RealmProxyMediator getSchemaMediator() {
        return this.f66576j;
    }

    public long getSchemaVersion() {
        return this.f66572f;
    }

    public boolean hasAssetFile() {
        return !Util.isEmptyString(this.f66570d);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        File file = this.f66567a;
        int i7 = 0;
        if (file != null) {
            i = file.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        String str = this.f66568b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode = (((i8 + i2) * 31) + this.f66569c.hashCode()) * 31;
        String str2 = this.f66570d;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        long j = this.f66572f;
        int hashCode2 = (((((hashCode + i3) * 31) + Arrays.hashCode(this.f66571e)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        RealmMigration realmMigration = this.f66573g;
        if (realmMigration != null) {
            i4 = realmMigration.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode3 = (((((((hashCode2 + i4) * 31) + (this.f66574h ? 1 : 0)) * 31) + this.f66575i.hashCode()) * 31) + this.f66576j.hashCode()) * 31;
        RxObservableFactory rxObservableFactory = this.f66577k;
        if (rxObservableFactory != null) {
            i5 = rxObservableFactory.hashCode();
        } else {
            i5 = 0;
        }
        int i9 = (hashCode3 + i5) * 31;
        Realm.Transaction transaction = this.f66579m;
        if (transaction != null) {
            i6 = transaction.hashCode();
        } else {
            i6 = 0;
        }
        int i10 = (((i9 + i6) * 31) + (this.f66580n ? 1 : 0)) * 31;
        CompactOnLaunchCallback compactOnLaunchCallback = this.f66581o;
        if (compactOnLaunchCallback != null) {
            i7 = compactOnLaunchCallback.hashCode();
        }
        long j2 = this.f66582p;
        return ((((i10 + i7) * 31) + (this.f66585s ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean isAllowQueriesOnUiThread() {
        return this.f66584r;
    }

    public boolean isAllowWritesOnUiThread() {
        return this.f66583q;
    }

    public boolean isReadOnly() {
        return this.f66580n;
    }

    public boolean isRecoveryConfiguration() {
        return this.f66585s;
    }

    public boolean isSyncConfiguration() {
        return false;
    }

    public boolean realmExists() {
        return new File(this.f66569c).exists();
    }

    public boolean shouldDeleteRealmIfMigrationNeeded() {
        return this.f66574h;
    }

    public String toString() {
        String str;
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("realmDirectory: ");
        File file = this.f66567a;
        if (file != null) {
            str = file.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("\n");
        sb.append("realmFileName : ");
        sb.append(this.f66568b);
        sb.append("\n");
        sb.append("canonicalPath: ");
        sb.append(this.f66569c);
        sb.append("\n");
        sb.append("key: ");
        sb.append("[length: ");
        if (this.f66571e == null) {
            i = 0;
        } else {
            i = 64;
        }
        sb.append(i);
        sb.append("]");
        sb.append("\n");
        sb.append("schemaVersion: ");
        sb.append(Long.toString(this.f66572f));
        sb.append("\n");
        sb.append("migration: ");
        sb.append(this.f66573g);
        sb.append("\n");
        sb.append("deleteRealmIfMigrationNeeded: ");
        sb.append(this.f66574h);
        sb.append("\n");
        sb.append("durability: ");
        sb.append(this.f66575i);
        sb.append("\n");
        sb.append("schemaMediator: ");
        sb.append(this.f66576j);
        sb.append("\n");
        sb.append("readOnly: ");
        sb.append(this.f66580n);
        sb.append("\n");
        sb.append("compactOnLaunch: ");
        sb.append(this.f66581o);
        sb.append("\n");
        sb.append("maxNumberOfActiveVersions: ");
        sb.append(this.f66582p);
        return sb.toString();
    }
}
