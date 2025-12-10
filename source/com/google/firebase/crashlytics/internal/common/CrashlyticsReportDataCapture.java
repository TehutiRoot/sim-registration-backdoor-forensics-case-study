package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class CrashlyticsReportDataCapture {

    /* renamed from: g */
    public static final Map f54796g;

    /* renamed from: h */
    public static final String f54797h;

    /* renamed from: a */
    public final Context f54798a;

    /* renamed from: b */
    public final IdManager f54799b;

    /* renamed from: c */
    public final AppData f54800c;

    /* renamed from: d */
    public final StackTraceTrimmingStrategy f54801d;

    /* renamed from: e */
    public final SettingsProvider f54802e;

    /* renamed from: f */
    public final ProcessDetailsProvider f54803f = ProcessDetailsProvider.INSTANCE;

    static {
        HashMap hashMap = new HashMap();
        f54796g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f54797h = String.format(Locale.US, "Crashlytics Android SDK/%s", BuildConfig.VERSION_NAME);
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider) {
        this.f54798a = context;
        this.f54799b = idManager;
        this.f54800c = appData;
        this.f54801d = stackTraceTrimmingStrategy;
        this.f54802e = settingsProvider;
    }

    /* renamed from: c */
    public static long m39092c(long j) {
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    /* renamed from: d */
    public static int m39091d() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f54796g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final CrashlyticsReport.ApplicationExitInfo m39094a(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list;
        if (this.f54802e.getSettingsSync().featureFlagData.collectBuildIds && this.f54800c.buildIdInfoList.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (BuildIdInfo buildIdInfo : this.f54800c.buildIdInfoList) {
                arrayList.add(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder().setLibraryName(buildIdInfo.getLibraryName()).setArch(buildIdInfo.getArch()).setBuildId(buildIdInfo.getBuildId()).build());
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReasonCode()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(applicationExitInfo.getTraceFile()).setBuildIdMappingForArch(list).build();
    }

    /* renamed from: b */
    public final CrashlyticsReport.Builder m39093b() {
        return CrashlyticsReport.builder().setSdkVersion(BuildConfig.VERSION_NAME).setGmpAppId(this.f54800c.googleAppId).setInstallationUuid(this.f54799b.getInstallIds().getCrashlyticsInstallId()).setFirebaseInstallationId(this.f54799b.getInstallIds().getFirebaseInstallationId()).setFirebaseAuthenticationToken(this.f54799b.getInstallIds().getFirebaseAuthenticationToken()).setBuildVersion(this.f54800c.versionCode).setDisplayVersion(this.f54800c.versionName).setPlatform(4);
    }

    public CrashlyticsReport.Session.Event captureAnrEventData(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        int i = this.f54798a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.Session.Event.builder().setType("anr").setTimestamp(applicationExitInfo.getTimestamp()).setApp(m39088g(i, m39094a(applicationExitInfo))).setDevice(m39086i(i)).build();
    }

    public CrashlyticsReport.Session.Event captureEventData(Throwable th2, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f54798a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.Session.Event.builder().setType(str).setTimestamp(j).setApp(m39087h(i3, TrimmedThrowableData.makeTrimmedThrowableData(th2, this.f54801d), thread, i, i2, z)).setDevice(m39086i(i3)).build();
    }

    public CrashlyticsReport captureReportData(String str, long j) {
        return m39093b().setSession(m39078q(str, j)).build();
    }

    /* renamed from: e */
    public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage m39090e() {
        return CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder().setBaseAddress(0L).setSize(0L).setName(this.f54800c.packageName).setUuid(this.f54800c.buildId).build();
    }

    /* renamed from: f */
    public final List m39089f() {
        return Collections.singletonList(m39090e());
    }

    /* renamed from: g */
    public final CrashlyticsReport.Session.Event.Application m39088g(int i, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        boolean z;
        if (applicationExitInfo.getImportance() != 100) {
            z = true;
        } else {
            z = false;
        }
        return CrashlyticsReport.Session.Event.Application.builder().setBackground(Boolean.valueOf(z)).setCurrentProcessDetails(m39071x(applicationExitInfo)).setUiOrientation(i).setExecution(m39083l(applicationExitInfo)).build();
    }

    /* renamed from: h */
    public final CrashlyticsReport.Session.Event.Application m39087h(int i, TrimmedThrowableData trimmedThrowableData, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        boolean z2;
        CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails = this.f54803f.getCurrentProcessDetails(this.f54798a);
        if (currentProcessDetails.getImportance() > 0) {
            if (currentProcessDetails.getImportance() != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        return CrashlyticsReport.Session.Event.Application.builder().setBackground(bool).setCurrentProcessDetails(currentProcessDetails).setAppProcessDetails(this.f54803f.getAppProcessDetails(this.f54798a)).setUiOrientation(i).setExecution(m39082m(trimmedThrowableData, thread, i2, i3, z)).build();
    }

    /* renamed from: i */
    public final CrashlyticsReport.Session.Event.Device m39086i(int i) {
        Double d;
        C1834Za m65220a = C1834Za.m65220a(this.f54798a);
        Float m65219b = m65220a.m65219b();
        if (m65219b != null) {
            d = Double.valueOf(m65219b.doubleValue());
        } else {
            d = null;
        }
        int m65218c = m65220a.m65218c();
        boolean proximitySensorEnabled = CommonUtils.getProximitySensorEnabled(this.f54798a);
        long m39092c = m39092c(CommonUtils.calculateTotalRamInBytes(this.f54798a) - CommonUtils.calculateFreeRamInBytes(this.f54798a));
        return CrashlyticsReport.Session.Event.Device.builder().setBatteryLevel(d).setBatteryVelocity(m65218c).setProximityOn(proximitySensorEnabled).setOrientation(i).setRamUsed(m39092c).setDiskUsed(CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath())).build();
    }

    /* renamed from: j */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception m39085j(TrimmedThrowableData trimmedThrowableData, int i, int i2) {
        return m39084k(trimmedThrowableData, i, i2, 0);
    }

    /* renamed from: k */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception m39084k(TrimmedThrowableData trimmedThrowableData, int i, int i2, int i3) {
        String str = trimmedThrowableData.className;
        String str2 = trimmedThrowableData.localizedMessage;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.stacktrace;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.cause;
        if (i3 >= i2) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.cause;
                i4++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder overflowCount = CrashlyticsReport.Session.Event.Application.Execution.Exception.builder().setType(str).setReason(str2).setFrames(m39080o(stackTraceElementArr, i)).setOverflowCount(i4);
        if (trimmedThrowableData2 != null && i4 == 0) {
            overflowCount.setCausedBy(m39084k(trimmedThrowableData2, i, i2, i3 + 1));
        }
        return overflowCount.build();
    }

    /* renamed from: l */
    public final CrashlyticsReport.Session.Event.Application.Execution m39083l(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.Execution.builder().setAppExitInfo(applicationExitInfo).setSignal(m39075t()).setBinaries(m39089f()).build();
    }

    /* renamed from: m */
    public final CrashlyticsReport.Session.Event.Application.Execution m39082m(TrimmedThrowableData trimmedThrowableData, Thread thread, int i, int i2, boolean z) {
        return CrashlyticsReport.Session.Event.Application.Execution.builder().setThreads(m39072w(trimmedThrowableData, thread, i, z)).setException(m39085j(trimmedThrowableData, i, i2)).setSignal(m39075t()).setBinaries(m39089f()).build();
    }

    /* renamed from: n */
    public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame m39081n(StackTraceElement stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        long j;
        long j2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            j = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j2 = stackTraceElement.getLineNumber();
        }
        return builder.setPc(j).setSymbol(str).setFile(fileName).setOffset(j2).build();
    }

    /* renamed from: o */
    public final List m39080o(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(m39081n(stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder().setImportance(i)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p */
    public final CrashlyticsReport.Session.Application m39079p() {
        return CrashlyticsReport.Session.Application.builder().setIdentifier(this.f54799b.getAppIdentifier()).setVersion(this.f54800c.versionCode).setDisplayVersion(this.f54800c.versionName).setInstallationUuid(this.f54799b.getInstallIds().getCrashlyticsInstallId()).setDevelopmentPlatform(this.f54800c.developmentPlatformProvider.getDevelopmentPlatform()).setDevelopmentPlatformVersion(this.f54800c.developmentPlatformProvider.getDevelopmentPlatformVersion()).build();
    }

    /* renamed from: q */
    public final CrashlyticsReport.Session m39078q(String str, long j) {
        return CrashlyticsReport.Session.builder().setStartedAt(j).setIdentifier(str).setGenerator(f54797h).setApp(m39079p()).setOs(m39076s()).setDevice(m39077r()).setGeneratorType(3).build();
    }

    /* renamed from: r */
    public final CrashlyticsReport.Session.Device m39077r() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m39091d = m39091d();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long calculateTotalRamInBytes = CommonUtils.calculateTotalRamInBytes(this.f54798a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean isEmulator = CommonUtils.isEmulator();
        int deviceState = CommonUtils.getDeviceState();
        String str = Build.MANUFACTURER;
        return CrashlyticsReport.Session.Device.builder().setArch(m39091d).setModel(Build.MODEL).setCores(availableProcessors).setRam(calculateTotalRamInBytes).setDiskSpace(blockCount).setSimulator(isEmulator).setState(deviceState).setManufacturer(str).setModelClass(Build.PRODUCT).build();
    }

    /* renamed from: s */
    public final CrashlyticsReport.Session.OperatingSystem m39076s() {
        return CrashlyticsReport.Session.OperatingSystem.builder().setPlatform(3).setVersion(Build.VERSION.RELEASE).setBuildVersion(Build.VERSION.CODENAME).setJailbroken(CommonUtils.isRooted()).build();
    }

    /* renamed from: t */
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal m39075t() {
        return CrashlyticsReport.Session.Event.Application.Execution.Signal.builder().setName("0").setCode("0").setAddress(0L).build();
    }

    /* renamed from: u */
    public final CrashlyticsReport.Session.Event.Application.Execution.Thread m39074u(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m39073v(thread, stackTraceElementArr, 0);
    }

    /* renamed from: v */
    public final CrashlyticsReport.Session.Event.Application.Execution.Thread m39073v(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return CrashlyticsReport.Session.Event.Application.Execution.Thread.builder().setName(thread.getName()).setImportance(i).setFrames(m39080o(stackTraceElementArr, i)).build();
    }

    /* renamed from: w */
    public final List m39072w(TrimmedThrowableData trimmedThrowableData, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m39073v(thread, trimmedThrowableData.stacktrace, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m39074u(key, this.f54801d.getTrimmedStackTrace(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: x */
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails m39071x(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return this.f54803f.buildProcessDetails(applicationExitInfo.getProcessName(), applicationExitInfo.getPid(), applicationExitInfo.getImportance());
    }
}
