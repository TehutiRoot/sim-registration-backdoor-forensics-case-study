package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class SessionReportingCoordinator {

    /* renamed from: a */
    public final CrashlyticsReportDataCapture f54833a;

    /* renamed from: b */
    public final CrashlyticsReportPersistence f54834b;

    /* renamed from: c */
    public final DataTransportCrashlyticsReportSender f54835c;

    /* renamed from: d */
    public final LogFileManager f54836d;

    /* renamed from: e */
    public final UserMetadata f54837e;

    /* renamed from: f */
    public final IdManager f54838f;

    /* renamed from: g */
    public final CrashlyticsWorkers f54839g;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager, CrashlyticsWorkers crashlyticsWorkers) {
        this.f54833a = crashlyticsReportDataCapture;
        this.f54834b = crashlyticsReportPersistence;
        this.f54835c = dataTransportCrashlyticsReportSender;
        this.f54836d = logFileManager;
        this.f54837e = userMetadata;
        this.f54838f = idManager;
        this.f54839g = crashlyticsWorkers;
    }

    /* renamed from: a */
    public static /* synthetic */ void m39053a(SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsReport.Session.Event event, EventMetadata eventMetadata, boolean z) {
        sessionReportingCoordinator.m39041m(event, eventMetadata, z);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m39052b(SessionReportingCoordinator sessionReportingCoordinator, Task task) {
        return sessionReportingCoordinator.m39040n(task);
    }

    /* renamed from: c */
    public static /* synthetic */ int m39051c(CrashlyticsReport.CustomAttribute customAttribute, CrashlyticsReport.CustomAttribute customAttribute2) {
        return m39042l(customAttribute, customAttribute2);
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    public static SessionReportingCoordinator create(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy, settingsProvider), new CrashlyticsReportPersistence(fileStore, settingsProvider, crashlyticsAppQualitySessionsSubscriber), DataTransportCrashlyticsReportSender.create(context, settingsProvider, onDemandCounter), logFileManager, userMetadata, idManager, crashlyticsWorkers);
    }

    /* renamed from: h */
    public static CrashlyticsReport.ApplicationExitInfo m39046h(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = convertInputStreamToString(traceInputStream);
            }
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e);
            logger.m39132w(sb.toString());
        }
        CrashlyticsReport.ApplicationExitInfo.Builder builder = CrashlyticsReport.ApplicationExitInfo.builder();
        importance = applicationExitInfo.getImportance();
        CrashlyticsReport.ApplicationExitInfo.Builder importance2 = builder.setImportance(importance);
        processName = applicationExitInfo.getProcessName();
        CrashlyticsReport.ApplicationExitInfo.Builder processName2 = importance2.setProcessName(processName);
        reason = applicationExitInfo.getReason();
        CrashlyticsReport.ApplicationExitInfo.Builder reasonCode = processName2.setReasonCode(reason);
        timestamp = applicationExitInfo.getTimestamp();
        CrashlyticsReport.ApplicationExitInfo.Builder timestamp2 = reasonCode.setTimestamp(timestamp);
        pid = applicationExitInfo.getPid();
        CrashlyticsReport.ApplicationExitInfo.Builder pid2 = timestamp2.setPid(pid);
        pss = applicationExitInfo.getPss();
        CrashlyticsReport.ApplicationExitInfo.Builder pss2 = pid2.setPss(pss);
        rss = applicationExitInfo.getRss();
        return pss2.setRss(rss).setTraceFile(str).build();
    }

    /* renamed from: k */
    public static List m39043k(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.builder().setKey((String) entry.getKey()).setValue((String) entry.getValue()).build());
        }
        Collections.sort(arrayList, new Comparator() { // from class: yG1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SessionReportingCoordinator.m39051c((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: l */
    public static /* synthetic */ int m39042l(CrashlyticsReport.CustomAttribute customAttribute, CrashlyticsReport.CustomAttribute customAttribute2) {
        return customAttribute.getKey().compareTo(customAttribute2.getKey());
    }

    /* renamed from: d */
    public final CrashlyticsReport.Session.Event m39050d(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        return m39049e(event, logFileManager, userMetadata, Collections.emptyMap());
    }

    /* renamed from: e */
    public final CrashlyticsReport.Session.Event m39049e(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata, Map map) {
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        String logString = logFileManager.getLogString();
        if (logString != null) {
            builder.setLog(CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            Logger.getLogger().m39134v("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> m39043k = m39043k(userMetadata.getCustomKeys(map));
        List<CrashlyticsReport.CustomAttribute> m39043k2 = m39043k(userMetadata.getInternalKeys());
        if (!m39043k.isEmpty() || !m39043k2.isEmpty()) {
            builder.setApp(event.getApp().toBuilder().setCustomAttributes(m39043k).setInternalKeys(m39043k2).build());
        }
        return builder.build();
    }

    /* renamed from: f */
    public final CrashlyticsReport.Session.Event m39048f(CrashlyticsReport.Session.Event event, Map map) {
        return m39047g(m39049e(event, this.f54836d, this.f54837e, map), this.f54837e);
    }

    public void finalizeSessionWithNativeEvent(@NonNull String str, @NonNull List<NG0> list, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        Logger.getLogger().m39140d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (NG0 ng0 : list) {
            CrashlyticsReport.FilesPayload.File mo831c = ng0.mo831c();
            if (mo831c != null) {
                arrayList.add(mo831c);
            }
        }
        this.f54834b.finalizeSessionWithNativeEvent(str, CrashlyticsReport.FilesPayload.builder().setFiles(Collections.unmodifiableList(arrayList)).build(), applicationExitInfo);
    }

    public void finalizeSessions(long j, @Nullable String str) {
        this.f54834b.finalizeReports(str, j);
    }

    /* renamed from: g */
    public final CrashlyticsReport.Session.Event m39047g(CrashlyticsReport.Session.Event event, UserMetadata userMetadata) {
        List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutsState = userMetadata.getRolloutsState();
        if (rolloutsState.isEmpty()) {
            return event;
        }
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        builder.setRollouts(CrashlyticsReport.Session.Event.RolloutsState.builder().setRolloutAssignments(rolloutsState).build());
        return builder.build();
    }

    public boolean hasReportsToSend() {
        return this.f54834b.hasFinalizedReports();
    }

    /* renamed from: i */
    public final CrashlyticsReportWithSessionId m39045i(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        if (crashlyticsReportWithSessionId.getReport().getFirebaseInstallationId() != null && crashlyticsReportWithSessionId.getReport().getFirebaseAuthenticationToken() != null) {
            return crashlyticsReportWithSessionId;
        }
        FirebaseInstallationId fetchTrueFid = this.f54838f.fetchTrueFid(true);
        return CrashlyticsReportWithSessionId.create(crashlyticsReportWithSessionId.getReport().withFirebaseInstallationId(fetchTrueFid.getFid()).withFirebaseAuthenticationToken(fetchTrueFid.getAuthToken()), crashlyticsReportWithSessionId.getSessionId(), crashlyticsReportWithSessionId.getReportFile());
    }

    /* renamed from: j */
    public final ApplicationExitInfo m39044j(String str, List list) {
        long timestamp;
        int reason;
        long startTimestampMillis = this.f54834b.getStartTimestampMillis(str);
        for (Object obj : list) {
            ApplicationExitInfo m22514a = AbstractC22211t40.m22514a(obj);
            timestamp = m22514a.getTimestamp();
            if (timestamp >= startTimestampMillis) {
                reason = m22514a.getReason();
                if (reason == 6) {
                    return m22514a;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public SortedSet<String> listSortedOpenSessionIds() {
        return this.f54834b.getOpenSessionIds();
    }

    /* renamed from: m */
    public final /* synthetic */ void m39041m(CrashlyticsReport.Session.Event event, EventMetadata eventMetadata, boolean z) {
        Logger.getLogger().m39140d("disk worker: log non-fatal event to persistence");
        this.f54834b.persistEvent(event, eventMetadata.getSessionId(), z);
    }

    /* renamed from: n */
    public final boolean m39040n(Task task) {
        if (task.isSuccessful()) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) task.getResult();
            Logger logger = Logger.getLogger();
            logger.m39140d("Crashlytics report successfully enqueued to DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
            File reportFile = crashlyticsReportWithSessionId.getReportFile();
            if (reportFile.delete()) {
                Logger logger2 = Logger.getLogger();
                logger2.m39140d("Deleted report file: " + reportFile.getPath());
                return true;
            }
            Logger logger3 = Logger.getLogger();
            logger3.m39132w("Crashlytics could not delete report file: " + reportFile.getPath());
            return true;
        }
        Logger.getLogger().m39131w("Crashlytics report could not be enqueued to DataTransport", task.getException());
        return false;
    }

    /* renamed from: o */
    public final void m39039o(Throwable th2, Thread thread, String str, final EventMetadata eventMetadata, boolean z) {
        final boolean equals = str.equals(AppMeasurement.CRASH_ORIGIN);
        final CrashlyticsReport.Session.Event m39048f = m39048f(this.f54833a.captureEventData(th2, thread, str, eventMetadata.getTimestamp(), 4, 8, z), eventMetadata.getAdditionalCustomKeys());
        if (!z) {
            this.f54839g.diskWrite.submit(new Runnable() { // from class: wG1
                @Override // java.lang.Runnable
                public final void run() {
                    SessionReportingCoordinator.m39053a(SessionReportingCoordinator.this, m39048f, eventMetadata, equals);
                }
            });
        } else {
            this.f54834b.persistEvent(m39048f, eventMetadata.getSessionId(), equals);
        }
    }

    public void onBeginSession(@NonNull String str, long j) {
        this.f54834b.persistReport(this.f54833a.captureReportData(str, j));
    }

    public void persistFatalEvent(@NonNull Throwable th2, @NonNull Thread thread, @NonNull String str, long j) {
        Logger logger = Logger.getLogger();
        logger.m39134v("Persisting fatal event for session " + str);
        m39039o(th2, thread, AppMeasurement.CRASH_ORIGIN, new EventMetadata(str, j), true);
    }

    public void persistNonFatalEvent(@NonNull Throwable th2, @NonNull Thread thread, @NonNull EventMetadata eventMetadata) {
        Logger logger = Logger.getLogger();
        logger.m39134v("Persisting non-fatal event for session " + eventMetadata.getSessionId());
        m39039o(th2, thread, Constants.IPC_BUNDLE_KEY_SEND_ERROR, eventMetadata, false);
    }

    @RequiresApi(api = 30)
    public void persistRelevantAppExitInfoEvent(String str, List<ApplicationExitInfo> list, LogFileManager logFileManager, UserMetadata userMetadata) {
        ApplicationExitInfo m39044j = m39044j(str, list);
        if (m39044j == null) {
            Logger logger = Logger.getLogger();
            logger.m39134v("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.Session.Event captureAnrEventData = this.f54833a.captureAnrEventData(m39046h(m39044j));
        Logger logger2 = Logger.getLogger();
        logger2.m39140d("Persisting anr for session " + str);
        this.f54834b.persistEvent(m39047g(m39050d(captureAnrEventData, logFileManager, userMetadata), userMetadata), str, true);
    }

    public void removeAllReports() {
        this.f54834b.deleteAllReports();
    }

    public Task<Void> sendReports(@NonNull Executor executor) {
        return sendReports(executor, null);
    }

    public Task<Void> sendReports(@NonNull Executor executor, @Nullable String str) {
        List<CrashlyticsReportWithSessionId> loadFinalizedReports = this.f54834b.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : loadFinalizedReports) {
            if (str == null || str.equals(crashlyticsReportWithSessionId.getSessionId())) {
                arrayList.add(this.f54835c.enqueueReport(m39045i(crashlyticsReportWithSessionId), str != null).continueWith(executor, new Continuation() { // from class: xG1
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(SessionReportingCoordinator.m39052b(SessionReportingCoordinator.this, task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
