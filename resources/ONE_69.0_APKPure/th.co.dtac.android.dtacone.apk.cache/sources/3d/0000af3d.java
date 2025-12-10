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
import com.google.firebase.crashlytics.internal.common.C8349b;
import com.google.firebase.crashlytics.internal.common.C8357c;
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
public class C8349b {

    /* renamed from: t */
    public static final FilenameFilter f54856t = new FilenameFilter() { // from class: Xy
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C8349b.m39002a(file, str);
        }
    };

    /* renamed from: a */
    public final Context f54857a;

    /* renamed from: b */
    public final DataCollectionArbiter f54858b;

    /* renamed from: c */
    public final C12163kz f54859c;

    /* renamed from: d */
    public final UserMetadata f54860d;

    /* renamed from: e */
    public final CrashlyticsWorkers f54861e;

    /* renamed from: f */
    public final IdManager f54862f;

    /* renamed from: g */
    public final FileStore f54863g;

    /* renamed from: h */
    public final AppData f54864h;

    /* renamed from: i */
    public final LogFileManager f54865i;

    /* renamed from: j */
    public final CrashlyticsNativeComponent f54866j;

    /* renamed from: k */
    public final AnalyticsEventLogger f54867k;

    /* renamed from: l */
    public final CrashlyticsAppQualitySessionsSubscriber f54868l;

    /* renamed from: m */
    public final SessionReportingCoordinator f54869m;

    /* renamed from: n */
    public C8357c f54870n;

    /* renamed from: o */
    public SettingsProvider f54871o = null;

    /* renamed from: p */
    public final TaskCompletionSource f54872p = new TaskCompletionSource();

    /* renamed from: q */
    public final TaskCompletionSource f54873q = new TaskCompletionSource();

    /* renamed from: r */
    public final TaskCompletionSource f54874r = new TaskCompletionSource();

    /* renamed from: s */
    public final AtomicBoolean f54875s = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.b$a */
    /* loaded from: classes4.dex */
    public class C8350a implements C8357c.InterfaceC8358a {
        public C8350a() {
            C8349b.this = r1;
        }

        @Override // com.google.firebase.crashlytics.internal.common.C8357c.InterfaceC8358a
        /* renamed from: a */
        public void mo38962a(SettingsProvider settingsProvider, Thread thread, Throwable th2) {
            C8349b.this.m39020I(settingsProvider, thread, th2);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.b$b */
    /* loaded from: classes4.dex */
    public class CallableC8351b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ long f54877a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f54878b;

        /* renamed from: c */
        public final /* synthetic */ Thread f54879c;

        /* renamed from: d */
        public final /* synthetic */ SettingsProvider f54880d;

        /* renamed from: e */
        public final /* synthetic */ boolean f54881e;

        /* renamed from: com.google.firebase.crashlytics.internal.common.b$b$a */
        /* loaded from: classes4.dex */
        public class C8352a implements SuccessContinuation {

            /* renamed from: a */
            public final /* synthetic */ String f54883a;

            public C8352a(String str) {
                CallableC8351b.this = r1;
                this.f54883a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a */
            public Task then(Settings settings) {
                String str = null;
                if (settings != null) {
                    Task m39013P = C8349b.this.m39013P();
                    SessionReportingCoordinator sessionReportingCoordinator = C8349b.this.f54869m;
                    CrashlyticsWorker crashlyticsWorker = C8349b.this.f54861e.common;
                    if (CallableC8351b.this.f54881e) {
                        str = this.f54883a;
                    }
                    return Tasks.whenAll(m39013P, sessionReportingCoordinator.sendReports(crashlyticsWorker, str));
                }
                Logger.getLogger().m39124w("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        public CallableC8351b(long j, Throwable th2, Thread thread, SettingsProvider settingsProvider, boolean z) {
            C8349b.this = r1;
            this.f54877a = j;
            this.f54878b = th2;
            this.f54879c = thread;
            this.f54880d = settingsProvider;
            this.f54881e = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Task call() {
            long m39022G = C8349b.m39022G(this.f54877a);
            String m39026C = C8349b.this.m39026C();
            if (m39026C == null) {
                Logger.getLogger().m39130e("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            C8349b.this.f54859c.m26881a();
            C8349b.this.f54869m.persistFatalEvent(this.f54878b, this.f54879c, m39026C, m39022G);
            C8349b.this.m38973x(this.f54877a);
            C8349b.this.m38976u(this.f54880d);
            C8349b.this.m38974w(new C10306gg().m31362c(), Boolean.valueOf(this.f54881e));
            if (!C8349b.this.f54858b.isAutomaticDataCollectionEnabled()) {
                return Tasks.forResult(null);
            }
            return this.f54880d.getSettingsAsync().onSuccessTask(C8349b.this.f54861e.common, new C8352a(m39026C));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.b$c */
    /* loaded from: classes4.dex */
    public class C8353c implements SuccessContinuation {
        public C8353c() {
            C8349b.this = r1;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task then(Void r1) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.b$d */
    /* loaded from: classes4.dex */
    public class C8354d implements SuccessContinuation {

        /* renamed from: a */
        public final /* synthetic */ Task f54886a;

        /* renamed from: com.google.firebase.crashlytics.internal.common.b$d$a */
        /* loaded from: classes4.dex */
        public class C8355a implements SuccessContinuation {
            public C8355a() {
                C8354d.this = r1;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a */
            public Task then(Settings settings) {
                if (settings != null) {
                    C8349b.this.m39013P();
                    C8349b.this.f54869m.sendReports(C8349b.this.f54861e.common);
                    C8349b.this.f54874r.trySetResult(null);
                    return Tasks.forResult(null);
                }
                Logger.getLogger().m39124w("Received null app settings at app startup. Cannot send cached reports");
                return Tasks.forResult(null);
            }
        }

        public C8354d(Task task) {
            C8349b.this = r1;
            this.f54886a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task then(Boolean bool) {
            if (!bool.booleanValue()) {
                Logger.getLogger().m39126v("Deleting cached crash reports...");
                C8349b.m38979r(C8349b.this.m39015N());
                C8349b.this.f54869m.removeAllReports();
                C8349b.this.f54874r.trySetResult(null);
                return Tasks.forResult(null);
            }
            Logger.getLogger().m39132d("Sending cached crash reports...");
            C8349b.this.f54858b.grantDataCollectionPermission(bool.booleanValue());
            return this.f54886a.onSuccessTask(C8349b.this.f54861e.common, new C8355a());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.b$e */
    /* loaded from: classes4.dex */
    public class CallableC8356e implements Callable {

        /* renamed from: a */
        public final /* synthetic */ long f54889a;

        public CallableC8356e(long j) {
            C8349b.this = r1;
            this.f54889a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f54889a);
            C8349b.this.f54867k.logEvent("_ae", bundle);
            return null;
        }
    }

    public C8349b(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, C12163kz c12163kz, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        this.f54857a = context;
        this.f54862f = idManager;
        this.f54858b = dataCollectionArbiter;
        this.f54863g = fileStore;
        this.f54859c = c12163kz;
        this.f54864h = appData;
        this.f54860d = userMetadata;
        this.f54865i = logFileManager;
        this.f54866j = crashlyticsNativeComponent;
        this.f54867k = analyticsEventLogger;
        this.f54868l = crashlyticsAppQualitySessionsSubscriber;
        this.f54869m = sessionReportingCoordinator;
        this.f54861e = crashlyticsWorkers;
    }

    /* renamed from: B */
    public static boolean m39027B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: D */
    public static long m39025D() {
        return m39022G(System.currentTimeMillis());
    }

    /* renamed from: E */
    public static List m39024E(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        File sessionFile = fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
        File sessionFile2 = fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
        File sessionFile3 = fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1750Yf("logs_file", "logs", bArr));
        arrayList.add(new C0035AW("crash_meta_file", "metadata", nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new C0035AW("session_meta_file", "session", nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new C0035AW("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new C0035AW("device_meta_file", "device", nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new C0035AW("os_meta_file", "os", nativeSessionFileProvider.getOsFile()));
        arrayList.add(m39010S(nativeSessionFileProvider));
        arrayList.add(new C0035AW("user_meta_file", "user", sessionFile));
        arrayList.add(new C0035AW("keys_file", UserMetadata.KEYDATA_FILENAME, sessionFile2));
        arrayList.add(new C0035AW("rollouts_file", "rollouts", sessionFile3));
        return arrayList;
    }

    /* renamed from: G */
    public static long m39022G(long j) {
        return j / 1000;
    }

    /* renamed from: R */
    public static boolean m39011R(String str, File file, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        if (file == null || !file.exists()) {
            Logger logger = Logger.getLogger();
            logger.m39124w("No minidump data found for session " + str);
        }
        if (applicationExitInfo == null) {
            Logger logger2 = Logger.getLogger();
            logger2.m39128i("No Tombstones data found for session " + str);
        }
        if ((file == null || !file.exists()) && applicationExitInfo == null) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public static TG0 m39010S(NativeSessionFileProvider nativeSessionFileProvider) {
        File minidumpFile = nativeSessionFileProvider.getMinidumpFile();
        if (minidumpFile != null && minidumpFile.exists()) {
            return new C0035AW("minidump_file", "minidump", minidumpFile);
        }
        return new C1750Yf("minidump_file", "minidump", new byte[]{0});
    }

    /* renamed from: U */
    public static byte[] m39008U(InputStream inputStream) {
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
    public static /* synthetic */ boolean m39002a(File file, String str) {
        return str.startsWith(".ae");
    }

    /* renamed from: b */
    public static /* synthetic */ void m39000b(C8349b c8349b, String str) {
        c8349b.m39017L(str);
    }

    /* renamed from: o */
    public static StaticSessionData.AppData m38982o(IdManager idManager, AppData appData) {
        return StaticSessionData.AppData.create(idManager.getAppIdentifier(), appData.versionCode, appData.versionName, idManager.getInstallIds().getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), appData.developmentPlatformProvider);
    }

    /* renamed from: p */
    public static StaticSessionData.DeviceData m38981p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.calculateTotalRamInBytes(context), statFs.getBlockCount() * statFs.getBlockSize(), CommonUtils.isEmulator(), CommonUtils.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    public static StaticSessionData.OsData m38980q() {
        return StaticSessionData.OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted());
    }

    /* renamed from: r */
    public static void m38979r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: A */
    public boolean m39028A(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.checkBackgroundThread();
        if (m39018K()) {
            Logger.getLogger().m39124w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().m39126v("Finalizing previously open sessions.");
        try {
            m38975v(true, settingsProvider, true);
            Logger.getLogger().m39126v("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Logger.getLogger().m39129e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* renamed from: C */
    public final String m39026C() {
        SortedSet<String> listSortedOpenSessionIds = this.f54869m.listSortedOpenSessionIds();
        if (!listSortedOpenSessionIds.isEmpty()) {
            return listSortedOpenSessionIds.first();
        }
        return null;
    }

    /* renamed from: F */
    public final InputStream m39023F(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Logger.getLogger().m39124w("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream == null) {
            Logger.getLogger().m39128i("No version control information found");
            return null;
        }
        return resourceAsStream;
    }

    /* renamed from: H */
    public String m39021H() {
        InputStream m39023F = m39023F("META-INF/version-control-info.textproto");
        if (m39023F == null) {
            return null;
        }
        Logger.getLogger().m39132d("Read version control info");
        return Base64.encodeToString(m39008U(m39023F), 0);
    }

    /* renamed from: I */
    public void m39020I(SettingsProvider settingsProvider, Thread thread, Throwable th2) {
        m39019J(settingsProvider, thread, th2, false);
    }

    /* renamed from: J */
    public synchronized void m39019J(SettingsProvider settingsProvider, Thread thread, Throwable th2, boolean z) {
        Logger logger = Logger.getLogger();
        logger.m39132d("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        Task submitTask = this.f54861e.common.submitTask(new CallableC8351b(System.currentTimeMillis(), th2, thread, settingsProvider, z));
        if (!z) {
            try {
                try {
                    Utils.awaitEvenIfOnMainThread(submitTask);
                } catch (Exception e) {
                    Logger.getLogger().m39129e("Error handling uncaught exception", e);
                }
            } catch (TimeoutException unused) {
                Logger.getLogger().m39130e("Cannot send reports. Timed out while fetching settings.");
            }
        }
    }

    /* renamed from: K */
    public boolean m39018K() {
        C8357c c8357c = this.f54870n;
        if (c8357c != null && c8357c.m38964a()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final /* synthetic */ void m39017L(String str) {
        m38974w(str, Boolean.FALSE);
    }

    /* renamed from: N */
    public List m39015N() {
        return this.f54863g.getCommonFiles(f54856t);
    }

    /* renamed from: O */
    public final Task m39014O(long j) {
        if (m39027B()) {
            Logger.getLogger().m39124w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        Logger.getLogger().m39132d("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new CallableC8356e(j));
    }

    /* renamed from: P */
    public final Task m39013P() {
        ArrayList arrayList = new ArrayList();
        for (File file : m39015N()) {
            try {
                arrayList.add(m39014O(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger logger = Logger.getLogger();
                logger.m39124w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* renamed from: Q */
    public void m39012Q(Thread thread, Throwable th2) {
        SettingsProvider settingsProvider = this.f54871o;
        if (settingsProvider == null) {
            Logger.getLogger().m39124w("settingsProvider not set");
        } else {
            m39019J(settingsProvider, thread, th2, true);
        }
    }

    /* renamed from: T */
    public void m39009T(final String str) {
        this.f54861e.common.submit(new Runnable() { // from class: Wy
            @Override // java.lang.Runnable
            public final void run() {
                C8349b.m39000b(C8349b.this, str);
            }
        });
    }

    /* renamed from: V */
    public void m39007V() {
        try {
            String m39021H = m39021H();
            if (m39021H != null) {
                m39003Z("com.crashlytics.version-control-info", m39021H);
                Logger.getLogger().m39128i("Saved version control info");
            }
        } catch (IOException e) {
            Logger.getLogger().m39123w("Unable to save version control info", e);
        }
    }

    /* renamed from: W */
    public Task m39006W() {
        this.f54873q.trySetResult(Boolean.TRUE);
        return this.f54874r.getTask();
    }

    /* renamed from: X */
    public void m39005X(String str, String str2) {
        try {
            this.f54860d.setCustomKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f54857a;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().m39130e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* renamed from: Y */
    public void m39004Y(Map map) {
        this.f54860d.setCustomKeys(map);
    }

    /* renamed from: Z */
    public void m39003Z(String str, String str2) {
        try {
            this.f54860d.setInternalKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f54857a;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().m39130e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* renamed from: a0 */
    public void m39001a0(String str) {
        this.f54860d.setUserId(str);
    }

    /* renamed from: b0 */
    public void m38999b0(Task task) {
        if (!this.f54869m.hasReportsToSend()) {
            Logger.getLogger().m39126v("No crash reports are available to be sent.");
            this.f54872p.trySetResult(Boolean.FALSE);
            return;
        }
        Logger.getLogger().m39126v("Crash reports are available to be sent.");
        m38997c0().onSuccessTask(this.f54861e.common, new C8354d(task));
    }

    /* renamed from: c0 */
    public final Task m38997c0() {
        if (this.f54858b.isAutomaticDataCollectionEnabled()) {
            Logger.getLogger().m39132d("Automatic data collection is enabled. Allowing upload.");
            this.f54872p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        Logger.getLogger().m39132d("Automatic data collection is disabled.");
        Logger.getLogger().m39126v("Notifying that unsent reports are available.");
        this.f54872p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.f54858b.waitForAutomaticDataCollectionEnabled().onSuccessTask(new C8353c());
        Logger.getLogger().m39132d("Waiting for send/deleteUnsentReports to be called.");
        return CrashlyticsTasks.race(onSuccessTask, this.f54873q.getTask());
    }

    /* renamed from: d0 */
    public final void m38995d0(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.f54857a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f54869m.persistRelevantAppExitInfoEvent(str, historicalProcessExitReasons, new LogFileManager(this.f54863g, str), UserMetadata.loadFromExistingSession(str, this.f54863g, this.f54861e));
                return;
            }
            Logger logger = Logger.getLogger();
            logger.m39126v("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        Logger logger2 = Logger.getLogger();
        logger2.m39126v("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: e0 */
    public void m38993e0(Thread thread, Throwable th2, Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!m39018K()) {
            long m39022G = m39022G(currentTimeMillis);
            String m39026C = m39026C();
            if (m39026C == null) {
                Logger.getLogger().m39124w("Tried to write a non-fatal exception while no session was open.");
                return;
            }
            this.f54869m.persistNonFatalEvent(th2, thread, new EventMetadata(m39026C, m39022G, map));
        }
    }

    /* renamed from: f0 */
    public void m38991f0(long j, String str) {
        if (!m39018K()) {
            this.f54865i.writeToLog(j, str);
        }
    }

    /* renamed from: n */
    public Task m38983n() {
        if (!this.f54875s.compareAndSet(false, true)) {
            Logger.getLogger().m39124w("checkForUnsentReports should only be called once per execution.");
            return Tasks.forResult(Boolean.FALSE);
        }
        return this.f54872p.getTask();
    }

    /* renamed from: s */
    public Task m38978s() {
        this.f54873q.trySetResult(Boolean.FALSE);
        return this.f54874r.getTask();
    }

    /* renamed from: t */
    public boolean m38977t() {
        CrashlyticsWorkers.checkBackgroundThread();
        if (!this.f54859c.m26879c()) {
            String m39026C = m39026C();
            if (m39026C != null && this.f54866j.hasCrashDataForSession(m39026C)) {
                return true;
            }
            return false;
        }
        Logger.getLogger().m39126v("Found previous crash marker.");
        this.f54859c.m26878d();
        return true;
    }

    /* renamed from: u */
    public void m38976u(SettingsProvider settingsProvider) {
        m38975v(false, settingsProvider, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public final void m38975v(boolean z, SettingsProvider settingsProvider, boolean z2) {
        String str;
        CrashlyticsWorkers.checkBackgroundThread();
        ArrayList arrayList = new ArrayList(this.f54869m.listSortedOpenSessionIds());
        if (arrayList.size() <= z) {
            Logger.getLogger().m39126v("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z ? 1 : 0);
        if (z2 && settingsProvider.getSettingsSync().featureFlagData.collectAnrs) {
            m38995d0(str2);
        } else {
            Logger.getLogger().m39126v("ANR feature disabled.");
        }
        if (z2 && this.f54866j.hasCrashDataForSession(str2)) {
            m38971z(str2);
        }
        if (z != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f54868l.setSessionId(null);
            str = null;
        }
        this.f54869m.finalizeSessions(m39025D(), str);
    }

    /* renamed from: w */
    public final void m38974w(String str, Boolean bool) {
        long m39025D = m39025D();
        Logger logger = Logger.getLogger();
        logger.m39132d("Opening a new session with ID " + str);
        this.f54866j.prepareNativeSession(str, String.format(Locale.US, "Crashlytics Android SDK/%s", CrashlyticsCore.getVersion()), m39025D, StaticSessionData.create(m38982o(this.f54862f, this.f54864h), m38980q(), m38981p(this.f54857a)));
        if (bool.booleanValue() && str != null) {
            this.f54860d.setNewSession(str);
        }
        this.f54865i.setCurrentSession(str);
        this.f54868l.setSessionId(str);
        this.f54869m.onBeginSession(str, m39025D);
    }

    /* renamed from: x */
    public final void m38973x(long j) {
        try {
            FileStore fileStore = this.f54863g;
            if (!fileStore.getCommonFile(".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Logger.getLogger().m39123w("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: y */
    public void m38972y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        this.f54871o = settingsProvider;
        m39009T(str);
        C8357c c8357c = new C8357c(new C8350a(), settingsProvider, uncaughtExceptionHandler, this.f54866j);
        this.f54870n = c8357c;
        Thread.setDefaultUncaughtExceptionHandler(c8357c);
    }

    /* renamed from: z */
    public final void m38971z(String str) {
        Logger logger = Logger.getLogger();
        logger.m39126v("Finalizing native report for session " + str);
        NativeSessionFileProvider sessionFileProvider = this.f54866j.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        CrashlyticsReport.ApplicationExitInfo applicationExitInto = sessionFileProvider.getApplicationExitInto();
        if (m39011R(str, minidumpFile, applicationExitInto)) {
            Logger.getLogger().m39124w("No native core present");
            return;
        }
        long lastModified = minidumpFile.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.f54863g, str);
        File nativeSessionDir = this.f54863g.getNativeSessionDir(str);
        if (!nativeSessionDir.isDirectory()) {
            Logger.getLogger().m39124w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m38973x(lastModified);
        List<TG0> m39024E = m39024E(sessionFileProvider, str, this.f54863g, logFileManager.getBytesForLog());
        UG0.m66223b(nativeSessionDir, m39024E);
        Logger.getLogger().m39132d("CrashlyticsController#finalizePreviousNativeSession");
        this.f54869m.finalizeSessionWithNativeEvent(str, m39024E, applicationExitInto);
        logFileManager.clearLog();
    }
}