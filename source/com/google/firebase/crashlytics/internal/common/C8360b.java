package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.C8360b;
import com.google.firebase.crashlytics.internal.common.C8368c;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.crashlytics.internal.common.b */
/* loaded from: classes4.dex */
public class C8360b {

    /* renamed from: t */
    public static final FilenameFilter f54844t = new FilenameFilter() { // from class: Xy
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C8360b.m39010a(file, str);
        }
    };

    /* renamed from: a */
    public final Context f54845a;

    /* renamed from: b */
    public final DataCollectionArbiter f54846b;

    /* renamed from: c */
    public final C12186kz f54847c;

    /* renamed from: d */
    public final UserMetadata f54848d;

    /* renamed from: e */
    public final CrashlyticsWorkers f54849e;

    /* renamed from: f */
    public final IdManager f54850f;

    /* renamed from: g */
    public final FileStore f54851g;

    /* renamed from: h */
    public final AppData f54852h;

    /* renamed from: i */
    public final LogFileManager f54853i;

    /* renamed from: j */
    public final CrashlyticsNativeComponent f54854j;

    /* renamed from: k */
    public final AnalyticsEventLogger f54855k;

    /* renamed from: l */
    public final CrashlyticsAppQualitySessionsSubscriber f54856l;

    /* renamed from: m */
    public final SessionReportingCoordinator f54857m;

    /* renamed from: n */
    public C8368c f54858n;

    /* renamed from: o */
    public SettingsProvider f54859o = null;

    /* renamed from: p */
    public final TaskCompletionSource f54860p = new TaskCompletionSource();

    /* renamed from: q */
    public final TaskCompletionSource f54861q = new TaskCompletionSource();

    /* renamed from: r */
    public final TaskCompletionSource f54862r = new TaskCompletionSource();

    /* renamed from: s */
    public final AtomicBoolean f54863s = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.b$a */
    /* loaded from: classes4.dex */
    public class C8361a implements C8368c.InterfaceC8369a {
        public C8361a() {
            C8360b.this = r1;
        }

        @Override // com.google.firebase.crashlytics.internal.common.C8368c.InterfaceC8369a
        /* renamed from: a */
        public void mo38970a(SettingsProvider settingsProvider, Thread thread, Throwable th2) {
            C8360b.this.m39028I(settingsProvider, thread, th2);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.b$b */
    /* loaded from: classes4.dex */
    public class CallableC8362b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ long f54865a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f54866b;

        /* renamed from: c */
        public final /* synthetic */ Thread f54867c;

        /* renamed from: d */
        public final /* synthetic */ SettingsProvider f54868d;

        /* renamed from: e */
        public final /* synthetic */ boolean f54869e;

        /* renamed from: com.google.firebase.crashlytics.internal.common.b$b$a */
        /* loaded from: classes4.dex */
        public class C8363a implements SuccessContinuation {

            /* renamed from: a */
            public final /* synthetic */ String f54871a;

            public C8363a(String str) {
                CallableC8362b.this = r1;
                this.f54871a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a */
            public Task then(Settings settings) {
                String str = null;
                if (settings != null) {
                    Task m39021P = C8360b.this.m39021P();
                    SessionReportingCoordinator sessionReportingCoordinator = C8360b.this.f54857m;
                    CrashlyticsWorker crashlyticsWorker = C8360b.this.f54849e.common;
                    if (CallableC8362b.this.f54869e) {
                        str = this.f54871a;
                    }
                    return Tasks.whenAll(m39021P, sessionReportingCoordinator.sendReports(crashlyticsWorker, str));
                }
                Logger.getLogger().m39132w("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        public CallableC8362b(long j, Throwable th2, Thread thread, SettingsProvider settingsProvider, boolean z) {
            C8360b.this = r1;
            this.f54865a = j;
            this.f54866b = th2;
            this.f54867c = thread;
            this.f54868d = settingsProvider;
            this.f54869e = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Task call() {
            long m39030G = C8360b.m39030G(this.f54865a);
            String m39034C = C8360b.this.m39034C();
            if (m39034C == null) {
                Logger.getLogger().m39138e("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            C8360b.this.f54847c.m26579a();
            C8360b.this.f54857m.persistFatalEvent(this.f54866b, this.f54867c, m39034C, m39030G);
            C8360b.this.m38981x(this.f54865a);
            C8360b.this.m38984u(this.f54868d);
            C8360b.this.m38982w(new C10318gg().m31071c(), Boolean.valueOf(this.f54869e));
            if (!C8360b.this.f54846b.isAutomaticDataCollectionEnabled()) {
                return Tasks.forResult(null);
            }
            return this.f54868d.getSettingsAsync().onSuccessTask(C8360b.this.f54849e.common, new C8363a(m39034C));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.b$c */
    /* loaded from: classes4.dex */
    public class C8364c implements SuccessContinuation {
        public C8364c() {
            C8360b.this = r1;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task then(Void r1) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.b$d */
    /* loaded from: classes4.dex */
    public class C8365d implements SuccessContinuation {

        /* renamed from: a */
        public final /* synthetic */ Task f54874a;

        /* renamed from: com.google.firebase.crashlytics.internal.common.b$d$a */
        /* loaded from: classes4.dex */
        public class C8366a implements SuccessContinuation {
            public C8366a() {
                C8365d.this = r1;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a */
            public Task then(Settings settings) {
                if (settings != null) {
                    C8360b.this.m39021P();
                    C8360b.this.f54857m.sendReports(C8360b.this.f54849e.common);
                    C8360b.this.f54862r.trySetResult(null);
                    return Tasks.forResult(null);
                }
                Logger.getLogger().m39132w("Received null app settings at app startup. Cannot send cached reports");
                return Tasks.forResult(null);
            }
        }

        public C8365d(Task task) {
            C8360b.this = r1;
            this.f54874a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task then(Boolean bool) {
            if (!bool.booleanValue()) {
                Logger.getLogger().m39134v("Deleting cached crash reports...");
                C8360b.m38987r(C8360b.this.m39023N());
                C8360b.this.f54857m.removeAllReports();
                C8360b.this.f54862r.trySetResult(null);
                return Tasks.forResult(null);
            }
            Logger.getLogger().m39140d("Sending cached crash reports...");
            C8360b.this.f54846b.grantDataCollectionPermission(bool.booleanValue());
            return this.f54874a.onSuccessTask(C8360b.this.f54849e.common, new C8366a());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.b$e */
    /* loaded from: classes4.dex */
    public class CallableC8367e implements Callable {

        /* renamed from: a */
        public final /* synthetic */ long f54877a;

        public CallableC8367e(long j) {
            C8360b.this = r1;
            this.f54877a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f54877a);
            C8360b.this.f54855k.logEvent("_ae", bundle);
            return null;
        }
    }

    public C8360b(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, C12186kz c12186kz, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        this.f54845a = context;
        this.f54850f = idManager;
        this.f54846b = dataCollectionArbiter;
        this.f54851g = fileStore;
        this.f54847c = c12186kz;
        this.f54852h = appData;
        this.f54848d = userMetadata;
        this.f54853i = logFileManager;
        this.f54854j = crashlyticsNativeComponent;
        this.f54855k = analyticsEventLogger;
        this.f54856l = crashlyticsAppQualitySessionsSubscriber;
        this.f54857m = sessionReportingCoordinator;
        this.f54849e = crashlyticsWorkers;
    }

    /* renamed from: B */
    public static boolean m39035B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: D */
    public static long m39033D() {
        return m39030G(System.currentTimeMillis());
    }

    /* renamed from: E */
    public static List m39032E(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        File sessionFile = fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
        File sessionFile2 = fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
        File sessionFile3 = fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1771Yf("logs_file", "logs", bArr));
        arrayList.add(new C16973wW("crash_meta_file", "metadata", nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new C16973wW("session_meta_file", "session", nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new C16973wW("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new C16973wW("device_meta_file", "device", nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new C16973wW("os_meta_file", "os", nativeSessionFileProvider.getOsFile()));
        arrayList.add(m39018S(nativeSessionFileProvider));
        arrayList.add(new C16973wW("user_meta_file", "user", sessionFile));
        arrayList.add(new C16973wW("keys_file", UserMetadata.KEYDATA_FILENAME, sessionFile2));
        arrayList.add(new C16973wW("rollouts_file", "rollouts", sessionFile3));
        return arrayList;
    }

    /* renamed from: G */
    public static long m39030G(long j) {
        return j / 1000;
    }

    /* renamed from: R */
    public static boolean m39019R(String str, File file, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        if (file == null || !file.exists()) {
            Logger logger = Logger.getLogger();
            logger.m39132w("No minidump data found for session " + str);
        }
        if (applicationExitInfo == null) {
            Logger logger2 = Logger.getLogger();
            logger2.m39136i("No Tombstones data found for session " + str);
        }
        if ((file == null || !file.exists()) && applicationExitInfo == null) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public static NG0 m39018S(NativeSessionFileProvider nativeSessionFileProvider) {
        File minidumpFile = nativeSessionFileProvider.getMinidumpFile();
        if (minidumpFile != null && minidumpFile.exists()) {
            return new C16973wW("minidump_file", "minidump", minidumpFile);
        }
        return new C1771Yf("minidump_file", "minidump", new byte[]{0});
    }

    /* renamed from: U */
    public static byte[] m39016U(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m39010a(File file, String str) {
        return str.startsWith(".ae");
    }

    /* renamed from: b */
    public static /* synthetic */ void m39008b(C8360b c8360b, String str) {
        c8360b.m39025L(str);
    }

    /* renamed from: o */
    public static StaticSessionData.AppData m38990o(IdManager idManager, AppData appData) {
        return StaticSessionData.AppData.create(idManager.getAppIdentifier(), appData.versionCode, appData.versionName, idManager.getInstallIds().getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), appData.developmentPlatformProvider);
    }

    /* renamed from: p */
    public static StaticSessionData.DeviceData m38989p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.calculateTotalRamInBytes(context), statFs.getBlockCount() * statFs.getBlockSize(), CommonUtils.isEmulator(), CommonUtils.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    public static StaticSessionData.OsData m38988q() {
        return StaticSessionData.OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted());
    }

    /* renamed from: r */
    public static void m38987r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: A */
    public boolean m39036A(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.checkBackgroundThread();
        if (m39026K()) {
            Logger.getLogger().m39132w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().m39134v("Finalizing previously open sessions.");
        try {
            m38983v(true, settingsProvider, true);
            Logger.getLogger().m39134v("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Logger.getLogger().m39137e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* renamed from: C */
    public final String m39034C() {
        SortedSet<String> listSortedOpenSessionIds = this.f54857m.listSortedOpenSessionIds();
        if (!listSortedOpenSessionIds.isEmpty()) {
            return listSortedOpenSessionIds.first();
        }
        return null;
    }

    /* renamed from: F */
    public final InputStream m39031F(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Logger.getLogger().m39132w("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream == null) {
            Logger.getLogger().m39136i("No version control information found");
            return null;
        }
        return resourceAsStream;
    }

    /* renamed from: H */
    public String m39029H() {
        InputStream m39031F = m39031F("META-INF/version-control-info.textproto");
        if (m39031F == null) {
            return null;
        }
        Logger.getLogger().m39140d("Read version control info");
        return Base64.encodeToString(m39016U(m39031F), 0);
    }

    /* renamed from: I */
    public void m39028I(SettingsProvider settingsProvider, Thread thread, Throwable th2) {
        m39027J(settingsProvider, thread, th2, false);
    }

    /* renamed from: J */
    public synchronized void m39027J(SettingsProvider settingsProvider, Thread thread, Throwable th2, boolean z) {
        Logger logger = Logger.getLogger();
        logger.m39140d("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        Task submitTask = this.f54849e.common.submitTask(new CallableC8362b(System.currentTimeMillis(), th2, thread, settingsProvider, z));
        if (!z) {
            try {
                try {
                    Utils.awaitEvenIfOnMainThread(submitTask);
                } catch (Exception e) {
                    Logger.getLogger().m39137e("Error handling uncaught exception", e);
                }
            } catch (TimeoutException unused) {
                Logger.getLogger().m39138e("Cannot send reports. Timed out while fetching settings.");
            }
        }
    }

    /* renamed from: K */
    public boolean m39026K() {
        C8368c c8368c = this.f54858n;
        if (c8368c != null && c8368c.m38972a()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final /* synthetic */ void m39025L(String str) {
        m38982w(str, Boolean.FALSE);
    }

    /* renamed from: N */
    public List m39023N() {
        return this.f54851g.getCommonFiles(f54844t);
    }

    /* renamed from: O */
    public final Task m39022O(long j) {
        if (m39035B()) {
            Logger.getLogger().m39132w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        Logger.getLogger().m39140d("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new CallableC8367e(j));
    }

    /* renamed from: P */
    public final Task m39021P() {
        ArrayList arrayList = new ArrayList();
        for (File file : m39023N()) {
            try {
                arrayList.add(m39022O(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger logger = Logger.getLogger();
                logger.m39132w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* renamed from: Q */
    public void m39020Q(Thread thread, Throwable th2) {
        SettingsProvider settingsProvider = this.f54859o;
        if (settingsProvider == null) {
            Logger.getLogger().m39132w("settingsProvider not set");
        } else {
            m39027J(settingsProvider, thread, th2, true);
        }
    }

    /* renamed from: T */
    public void m39017T(final String str) {
        this.f54849e.common.submit(new Runnable() { // from class: Wy
            {
                C8360b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8360b.m39008b(C8360b.this, str);
            }
        });
    }

    /* renamed from: V */
    public void m39015V() {
        try {
            String m39029H = m39029H();
            if (m39029H != null) {
                m39011Z("com.crashlytics.version-control-info", m39029H);
                Logger.getLogger().m39136i("Saved version control info");
            }
        } catch (IOException e) {
            Logger.getLogger().m39131w("Unable to save version control info", e);
        }
    }

    /* renamed from: W */
    public Task m39014W() {
        this.f54861q.trySetResult(Boolean.TRUE);
        return this.f54862r.getTask();
    }

    /* renamed from: X */
    public void m39013X(String str, String str2) {
        try {
            this.f54848d.setCustomKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f54845a;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().m39138e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* renamed from: Y */
    public void m39012Y(Map map) {
        this.f54848d.setCustomKeys(map);
    }

    /* renamed from: Z */
    public void m39011Z(String str, String str2) {
        try {
            this.f54848d.setInternalKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f54845a;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().m39138e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* renamed from: a0 */
    public void m39009a0(String str) {
        this.f54848d.setUserId(str);
    }

    /* renamed from: b0 */
    public void m39007b0(Task task) {
        if (!this.f54857m.hasReportsToSend()) {
            Logger.getLogger().m39134v("No crash reports are available to be sent.");
            this.f54860p.trySetResult(Boolean.FALSE);
            return;
        }
        Logger.getLogger().m39134v("Crash reports are available to be sent.");
        m39005c0().onSuccessTask(this.f54849e.common, new C8365d(task));
    }

    /* renamed from: c0 */
    public final Task m39005c0() {
        if (this.f54846b.isAutomaticDataCollectionEnabled()) {
            Logger.getLogger().m39140d("Automatic data collection is enabled. Allowing upload.");
            this.f54860p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        Logger.getLogger().m39140d("Automatic data collection is disabled.");
        Logger.getLogger().m39134v("Notifying that unsent reports are available.");
        this.f54860p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.f54846b.waitForAutomaticDataCollectionEnabled().onSuccessTask(new C8364c());
        Logger.getLogger().m39140d("Waiting for send/deleteUnsentReports to be called.");
        return CrashlyticsTasks.race(onSuccessTask, this.f54861q.getTask());
    }

    /* renamed from: d0 */
    public final void m39003d0(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.f54845a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f54857m.persistRelevantAppExitInfoEvent(str, historicalProcessExitReasons, new LogFileManager(this.f54851g, str), UserMetadata.loadFromExistingSession(str, this.f54851g, this.f54849e));
                return;
            }
            Logger logger = Logger.getLogger();
            logger.m39134v("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        Logger logger2 = Logger.getLogger();
        logger2.m39134v("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: e0 */
    public void m39001e0(Thread thread, Throwable th2, Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!m39026K()) {
            long m39030G = m39030G(currentTimeMillis);
            String m39034C = m39034C();
            if (m39034C == null) {
                Logger.getLogger().m39132w("Tried to write a non-fatal exception while no session was open.");
                return;
            }
            this.f54857m.persistNonFatalEvent(th2, thread, new EventMetadata(m39034C, m39030G, map));
        }
    }

    /* renamed from: f0 */
    public void m38999f0(long j, String str) {
        if (!m39026K()) {
            this.f54853i.writeToLog(j, str);
        }
    }

    /* renamed from: n */
    public Task m38991n() {
        if (!this.f54863s.compareAndSet(false, true)) {
            Logger.getLogger().m39132w("checkForUnsentReports should only be called once per execution.");
            return Tasks.forResult(Boolean.FALSE);
        }
        return this.f54860p.getTask();
    }

    /* renamed from: s */
    public Task m38986s() {
        this.f54861q.trySetResult(Boolean.FALSE);
        return this.f54862r.getTask();
    }

    /* renamed from: t */
    public boolean m38985t() {
        CrashlyticsWorkers.checkBackgroundThread();
        if (!this.f54847c.m26577c()) {
            String m39034C = m39034C();
            if (m39034C != null && this.f54854j.hasCrashDataForSession(m39034C)) {
                return true;
            }
            return false;
        }
        Logger.getLogger().m39134v("Found previous crash marker.");
        this.f54847c.m26576d();
        return true;
    }

    /* renamed from: u */
    public void m38984u(SettingsProvider settingsProvider) {
        m38983v(false, settingsProvider, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public final void m38983v(boolean z, SettingsProvider settingsProvider, boolean z2) {
        String str;
        CrashlyticsWorkers.checkBackgroundThread();
        ArrayList arrayList = new ArrayList(this.f54857m.listSortedOpenSessionIds());
        if (arrayList.size() <= z) {
            Logger.getLogger().m39134v("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z ? 1 : 0);
        if (z2 && settingsProvider.getSettingsSync().featureFlagData.collectAnrs) {
            m39003d0(str2);
        } else {
            Logger.getLogger().m39134v("ANR feature disabled.");
        }
        if (z2 && this.f54854j.hasCrashDataForSession(str2)) {
            m38979z(str2);
        }
        if (z != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f54856l.setSessionId(null);
            str = null;
        }
        this.f54857m.finalizeSessions(m39033D(), str);
    }

    /* renamed from: w */
    public final void m38982w(String str, Boolean bool) {
        long m39033D = m39033D();
        Logger logger = Logger.getLogger();
        logger.m39140d("Opening a new session with ID " + str);
        this.f54854j.prepareNativeSession(str, String.format(Locale.US, "Crashlytics Android SDK/%s", CrashlyticsCore.getVersion()), m39033D, StaticSessionData.create(m38990o(this.f54850f, this.f54852h), m38988q(), m38989p(this.f54845a)));
        if (bool.booleanValue() && str != null) {
            this.f54848d.setNewSession(str);
        }
        this.f54853i.setCurrentSession(str);
        this.f54856l.setSessionId(str);
        this.f54857m.onBeginSession(str, m39033D);
    }

    /* renamed from: x */
    public final void m38981x(long j) {
        try {
            FileStore fileStore = this.f54851g;
            if (!fileStore.getCommonFile(".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Logger.getLogger().m39131w("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: y */
    public void m38980y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        this.f54859o = settingsProvider;
        m39017T(str);
        C8368c c8368c = new C8368c(new C8361a(), settingsProvider, uncaughtExceptionHandler, this.f54854j);
        this.f54858n = c8368c;
        Thread.setDefaultUncaughtExceptionHandler(c8368c);
    }

    /* renamed from: z */
    public final void m38979z(String str) {
        Logger logger = Logger.getLogger();
        logger.m39134v("Finalizing native report for session " + str);
        NativeSessionFileProvider sessionFileProvider = this.f54854j.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        CrashlyticsReport.ApplicationExitInfo applicationExitInto = sessionFileProvider.getApplicationExitInto();
        if (m39019R(str, minidumpFile, applicationExitInto)) {
            Logger.getLogger().m39132w("No native core present");
            return;
        }
        long lastModified = minidumpFile.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.f54851g, str);
        File nativeSessionDir = this.f54851g.getNativeSessionDir(str);
        if (!nativeSessionDir.isDirectory()) {
            Logger.getLogger().m39132w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m38981x(lastModified);
        List<NG0> m39032E = m39032E(sessionFileProvider, str, this.f54851g, logFileManager.getBytesForLog());
        OG0.m67103b(nativeSessionDir, m39032E);
        Logger.getLogger().m39140d("CrashlyticsController#finalizePreviousNativeSession");
        this.f54857m.finalizeSessionWithNativeEvent(str, m39032E, applicationExitInto);
        logFileManager.clearLog();
    }
}
