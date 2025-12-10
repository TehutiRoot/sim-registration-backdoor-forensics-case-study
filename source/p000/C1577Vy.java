package p000;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* renamed from: Vy */
/* loaded from: classes4.dex */
public class C1577Vy {

    /* renamed from: d */
    public static final FilenameFilter f7085d = new FilenameFilter() { // from class: Ty
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C1577Vy.m65726a(file, str);
        }
    };

    /* renamed from: e */
    public static final Comparator f7086e = new Comparator() { // from class: Uy
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1577Vy.m65725b((File) obj, (File) obj2);
        }
    };

    /* renamed from: a */
    public final FileStore f7087a;

    /* renamed from: b */
    public String f7088b = null;

    /* renamed from: c */
    public String f7089c = null;

    public C1577Vy(FileStore fileStore) {
        this.f7087a = fileStore;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m65726a(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* renamed from: b */
    public static /* synthetic */ int m65725b(File file, File file2) {
        return m65722e(file, file2);
    }

    /* renamed from: e */
    public static /* synthetic */ int m65722e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    /* renamed from: f */
    public static void m65721f(FileStore fileStore, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                fileStore.getSessionFile(str, "aqs." + str2).createNewFile();
            } catch (IOException e) {
                Logger.getLogger().m39131w("Failed to persist App Quality Sessions session id.", e);
            }
        }
    }

    /* renamed from: g */
    public static String m65720g(FileStore fileStore, String str) {
        List<File> sessionFiles = fileStore.getSessionFiles(str, f7085d);
        if (sessionFiles.isEmpty()) {
            Logger.getLogger().m39132w("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File) Collections.min(sessionFiles, f7086e)).getName().substring(4);
    }

    /* renamed from: c */
    public synchronized String m65724c(String str) {
        if (Objects.equals(this.f7088b, str)) {
            return this.f7089c;
        }
        return m65720g(this.f7087a, str);
    }

    /* renamed from: h */
    public synchronized void m65719h(String str) {
        if (!Objects.equals(this.f7089c, str)) {
            m65721f(this.f7087a, this.f7088b, str);
            this.f7089c = str;
        }
    }

    /* renamed from: i */
    public synchronized void m65718i(String str) {
        if (!Objects.equals(this.f7088b, str)) {
            m65721f(this.f7087a, str, this.f7089c);
            this.f7088b = str;
        }
    }
}
