package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class CrashlyticsReportPersistence {

    /* renamed from: e */
    public static final Charset f55368e = Charset.forName("UTF-8");

    /* renamed from: f */
    public static final int f55369f = 15;

    /* renamed from: g */
    public static final CrashlyticsReportJsonTransform f55370g = new CrashlyticsReportJsonTransform();

    /* renamed from: h */
    public static final Comparator f55371h = new Comparator() { // from class: xz
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return CrashlyticsReportPersistence.m38825d((File) obj, (File) obj2);
        }
    };

    /* renamed from: i */
    public static final FilenameFilter f55372i = new FilenameFilter() { // from class: yz
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return CrashlyticsReportPersistence.m38828a(file, str);
        }
    };

    /* renamed from: a */
    public final AtomicInteger f55373a = new AtomicInteger(0);

    /* renamed from: b */
    public final FileStore f55374b;

    /* renamed from: c */
    public final SettingsProvider f55375c;

    /* renamed from: d */
    public final CrashlyticsAppQualitySessionsSubscriber f55376d;

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsProvider settingsProvider, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.f55374b = fileStore;
        this.f55375c = settingsProvider;
        this.f55376d = crashlyticsAppQualitySessionsSubscriber;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m38828a(File file, String str) {
        return str.startsWith("event");
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m38827b(File file, String str) {
        return m38815n(file, str);
    }

    /* renamed from: c */
    public static /* synthetic */ int m38826c(File file, File file2) {
        return m38812q(file, file2);
    }

    /* renamed from: d */
    public static /* synthetic */ int m38825d(File file, File file2) {
        return m38814o(file, file2);
    }

    /* renamed from: f */
    public static int m38823f(List list, int i) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i) {
                return size;
            }
            FileStore.m38797h(file);
            size--;
        }
        return size;
    }

    /* renamed from: h */
    public static long m38821h(long j) {
        return j * 1000;
    }

    /* renamed from: j */
    public static String m38819j(int i, boolean z) {
        String str;
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i));
        if (z) {
            str = "_";
        } else {
            str = "";
        }
        return "event" + format + str;
    }

    /* renamed from: l */
    public static String m38817l(String str) {
        return str.substring(0, f55369f);
    }

    /* renamed from: m */
    public static boolean m38816m(String str) {
        if (str.startsWith("event") && str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m38815n(File file, String str) {
        if (str.startsWith("event") && !str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static /* synthetic */ int m38814o(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* renamed from: q */
    public static int m38812q(File file, File file2) {
        return m38817l(file.getName()).compareTo(m38817l(file2.getName()));
    }

    /* renamed from: r */
    public static String m38811r(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f55368e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: w */
    public static void m38806w(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f55368e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: x */
    public static void m38805x(File file, String str, long j) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f55368e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m38821h(j));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void deleteAllReports() {
        m38820i(this.f55374b.getReports());
        m38820i(this.f55374b.getPriorityReports());
        m38820i(this.f55374b.getNativeReports());
    }

    /* renamed from: e */
    public final SortedSet m38824e(String str) {
        this.f55374b.cleanupPreviousFileSystems();
        SortedSet<String> openSessionIds = getOpenSessionIds();
        if (str != null) {
            openSessionIds.remove(str);
        }
        if (openSessionIds.size() <= 8) {
            return openSessionIds;
        }
        while (openSessionIds.size() > 8) {
            String last = openSessionIds.last();
            Logger logger = Logger.getLogger();
            logger.m39140d("Removing session over cap: " + last);
            this.f55374b.deleteSessionFiles(last);
            openSessionIds.remove(last);
        }
        return openSessionIds;
    }

    public void finalizeReports(@Nullable String str, long j) {
        for (String str2 : m38824e(str)) {
            Logger logger = Logger.getLogger();
            logger.m39134v("Finalizing report for session " + str2);
            m38809t(str2, j);
            this.f55374b.deleteSessionFiles(str2);
        }
        m38822g();
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        File sessionFile = this.f55374b.getSessionFile(str, "report");
        Logger logger = Logger.getLogger();
        logger.m39140d("Writing native session report for " + str + " to file: " + sessionFile);
        m38810s(sessionFile, filesPayload, str, applicationExitInfo);
    }

    /* renamed from: g */
    public final void m38822g() {
        int i = this.f55375c.getSettingsSync().sessionData.maxCompleteSessionsCount;
        List m38818k = m38818k();
        int size = m38818k.size();
        if (size <= i) {
            return;
        }
        for (File file : m38818k.subList(i, size)) {
            file.delete();
        }
    }

    public SortedSet<String> getOpenSessionIds() {
        return new TreeSet(this.f55374b.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(String str) {
        return this.f55374b.getSessionFile(str, "start-time").lastModified();
    }

    public boolean hasFinalizedReports() {
        if (this.f55374b.getReports().isEmpty() && this.f55374b.getPriorityReports().isEmpty() && this.f55374b.getNativeReports().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void m38820i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: k */
    public final List m38818k() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f55374b.getPriorityReports());
        arrayList.addAll(this.f55374b.getNativeReports());
        Comparator comparator = f55371h;
        Collections.sort(arrayList, comparator);
        List<File> reports = this.f55374b.getReports();
        Collections.sort(reports, comparator);
        arrayList.addAll(reports);
        return arrayList;
    }

    @NonNull
    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        List<File> m38818k = m38818k();
        ArrayList arrayList = new ArrayList();
        for (File file : m38818k) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.create(f55370g.reportFromJson(m38811r(file)), file.getName(), file));
            } catch (IOException e) {
                Logger logger = Logger.getLogger();
                logger.m39131w("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str) {
        persistEvent(event, str, false);
    }

    public void persistReport(@NonNull CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            Logger.getLogger().m39140d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            m38806w(this.f55374b.getSessionFile(identifier, "report"), f55370g.reportToJson(crashlyticsReport));
            m38805x(this.f55374b.getSessionFile(identifier, "start-time"), "", session.getStartedAt());
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.m39139d("Could not persist report for session " + identifier, e);
        }
    }

    /* renamed from: s */
    public final void m38810s(File file, CrashlyticsReport.FilesPayload filesPayload, String str, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        String appQualitySessionId = this.f55376d.getAppQualitySessionId(str);
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f55370g;
            m38806w(this.f55374b.getNativeReport(str), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportJsonTransform.reportFromJson(m38811r(file)).withNdkPayload(filesPayload).withApplicationExitInfo(applicationExitInfo).withAppQualitySessionId(appQualitySessionId)));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.m39131w("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: t */
    public final void m38809t(String str, long j) {
        boolean z;
        List<File> sessionFiles = this.f55374b.getSessionFiles(str, f55372i);
        if (sessionFiles.isEmpty()) {
            Logger logger = Logger.getLogger();
            logger.m39134v("Session " + str + " has no events.");
            return;
        }
        Collections.sort(sessionFiles);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : sessionFiles) {
                try {
                    arrayList.add(f55370g.eventFromJson(m38811r(file)));
                } catch (IOException e) {
                    Logger logger2 = Logger.getLogger();
                    logger2.m39131w("Could not add event to report for " + file, e);
                }
                if (z || m38816m(file.getName())) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            Logger logger3 = Logger.getLogger();
            logger3.m39132w("Could not parse event files for session " + str);
            return;
        }
        m38808u(this.f55374b.getSessionFile(str, "report"), arrayList, j, z, UserMetadata.readUserId(str, this.f55374b), this.f55376d.getAppQualitySessionId(str));
    }

    /* renamed from: u */
    public final void m38808u(File file, List list, long j, boolean z, String str, String str2) {
        File report;
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f55370g;
            CrashlyticsReport withEvents = crashlyticsReportJsonTransform.reportFromJson(m38811r(file)).withSessionEndFields(j, z, str).withAppQualitySessionId(str2).withEvents(list);
            CrashlyticsReport.Session session = withEvents.getSession();
            if (session == null) {
                return;
            }
            Logger logger = Logger.getLogger();
            logger.m39140d("appQualitySessionId: " + str2);
            if (z) {
                report = this.f55374b.getPriorityReport(session.getIdentifier());
            } else {
                report = this.f55374b.getReport(session.getIdentifier());
            }
            m38806w(report, crashlyticsReportJsonTransform.reportToJson(withEvents));
        } catch (IOException e) {
            Logger logger2 = Logger.getLogger();
            logger2.m39131w("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: v */
    public final int m38807v(String str, int i) {
        List<File> sessionFiles = this.f55374b.getSessionFiles(str, new FilenameFilter() { // from class: zz
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return CrashlyticsReportPersistence.m38827b(file, str2);
            }
        });
        Collections.sort(sessionFiles, new Comparator() { // from class: Az
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CrashlyticsReportPersistence.m38826c((File) obj, (File) obj2);
            }
        });
        return m38823f(sessionFiles, i);
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str, boolean z) {
        int i = this.f55375c.getSettingsSync().sessionData.maxCustomExceptionEvents;
        try {
            m38806w(this.f55374b.getSessionFile(str, m38819j(this.f55373a.getAndIncrement(), z)), f55370g.eventToJson(event));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.m39131w("Could not persist event for session " + str, e);
        }
        m38807v(str, i);
    }
}
