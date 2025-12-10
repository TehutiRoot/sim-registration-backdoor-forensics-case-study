package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class FileStore {

    /* renamed from: a */
    public final String f55377a;

    /* renamed from: b */
    public final File f55378b;

    /* renamed from: c */
    public final File f55379c;

    /* renamed from: d */
    public final File f55380d;

    /* renamed from: e */
    public final File f55381e;

    /* renamed from: f */
    public final File f55382f;

    /* renamed from: g */
    public final File f55383g;

    public FileStore(Context context) {
        String processName;
        String str;
        this.f55377a = ProcessDetailsProvider.INSTANCE.getCurrentProcessDetails(context).getProcessName();
        File filesDir = context.getFilesDir();
        this.f55378b = filesDir;
        if (m38794k()) {
            str = ".crashlytics.v3" + File.separator + m38795j(processName);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File m38799f = m38799f(new File(filesDir, str));
        this.f55379c = m38799f;
        this.f55380d = m38799f(new File(m38799f, "open-sessions"));
        this.f55381e = m38799f(new File(m38799f, "reports"));
        this.f55382f = m38799f(new File(m38799f, "priority-reports"));
        this.f55383g = m38799f(new File(m38799f, "native-reports"));
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m38804a(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    /* renamed from: f */
    public static synchronized File m38799f(File file) {
        synchronized (FileStore.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    Logger logger = Logger.getLogger();
                    logger.m39140d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Logger logger2 = Logger.getLogger();
                    logger2.m39138e("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static File m38798g(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: h */
    public static boolean m38797h(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m38797h(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: i */
    public static List m38796i(Object[] objArr) {
        if (objArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(objArr);
    }

    /* renamed from: j */
    public static String m38795j(String str) {
        if (str.length() > 40) {
            return CommonUtils.sha1(str);
        }
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    /* renamed from: b */
    public final void m38803b(String str) {
        File file = new File(this.f55378b, str);
        if (file.exists() && m38797h(file)) {
            Logger logger = Logger.getLogger();
            logger.m39140d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: c */
    public final void m38802c(final String str) {
        String[] list;
        if (this.f55378b.exists() && (list = this.f55378b.list(new FilenameFilter() { // from class: mX
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return FileStore.m38804a(str, file, str2);
            }
        })) != null) {
            for (String str2 : list) {
                m38803b(str2);
            }
        }
    }

    public void cleanupPreviousFileSystems() {
        m38803b(".com.google.firebase.crashlytics");
        m38803b(".com.google.firebase.crashlytics-ndk");
        if (m38794k()) {
            m38803b(".com.google.firebase.crashlytics.files.v1");
            m38802c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    /* renamed from: d */
    public final File m38801d(String str) {
        return m38798g(new File(this.f55380d, str));
    }

    @VisibleForTesting
    public void deleteAllCrashlyticsFiles() {
        m38797h(this.f55379c);
    }

    public boolean deleteSessionFiles(String str) {
        return m38797h(new File(this.f55380d, str));
    }

    public List<String> getAllOpenSessionIds() {
        return m38796i(this.f55380d.list());
    }

    public File getCommonFile(String str) {
        return new File(this.f55379c, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return m38796i(this.f55379c.listFiles(filenameFilter));
    }

    public File getNativeReport(String str) {
        return new File(this.f55383g, str);
    }

    public List<File> getNativeReports() {
        return m38796i(this.f55383g.listFiles());
    }

    public File getNativeSessionDir(String str) {
        return m38798g(new File(m38801d(str), "native"));
    }

    public File getPriorityReport(String str) {
        return new File(this.f55382f, str);
    }

    public List<File> getPriorityReports() {
        return m38796i(this.f55382f.listFiles());
    }

    public File getReport(String str) {
        return new File(this.f55381e, str);
    }

    public List<File> getReports() {
        return m38796i(this.f55381e.listFiles());
    }

    public File getSessionFile(String str, String str2) {
        return new File(m38801d(str), str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        return m38796i(m38801d(str).listFiles(filenameFilter));
    }

    /* renamed from: k */
    public final boolean m38794k() {
        return !this.f55377a.isEmpty();
    }
}
