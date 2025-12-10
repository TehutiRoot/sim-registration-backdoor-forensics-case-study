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
public class C1564Vy {

    /* renamed from: d */
    public static final FilenameFilter f7148d = new FilenameFilter() { // from class: Ty
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C1564Vy.m65837a(file, str);
        }
    };

    /* renamed from: e */
    public static final Comparator f7149e = new Comparator() { // from class: Uy
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1564Vy.m65836b((File) obj, (File) obj2);
        }
    };

    /* renamed from: a */
    public final FileStore f7150a;

    /* renamed from: b */
    public String f7151b = null;

    /* renamed from: c */
    public String f7152c = null;

    public C1564Vy(FileStore fileStore) {
        this.f7150a = fileStore;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m65837a(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* renamed from: b */
    public static /* synthetic */ int m65836b(File file, File file2) {
        return m65833e(file, file2);
    }

    /* renamed from: e */
    public static /* synthetic */ int m65833e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    /* renamed from: f */
    public static void m65832f(FileStore fileStore, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                fileStore.getSessionFile(str, "aqs." + str2).createNewFile();
            } catch (IOException e) {
                Logger.getLogger().m39123w("Failed to persist App Quality Sessions session id.", e);
            }
        }
    }

    /* renamed from: g */
    public static String m65831g(FileStore fileStore, String str) {
        List<File> sessionFiles = fileStore.getSessionFiles(str, f7148d);
        if (sessionFiles.isEmpty()) {
            Logger.getLogger().m39124w("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File) Collections.min(sessionFiles, f7149e)).getName().substring(4);
    }

    /* renamed from: c */
    public synchronized String m65835c(String str) {
        if (Objects.equals(this.f7151b, str)) {
            return this.f7152c;
        }
        return m65831g(this.f7150a, str);
    }

    /* renamed from: h */
    public synchronized void m65830h(String str) {
        if (!Objects.equals(this.f7152c, str)) {
            m65832f(this.f7150a, this.f7151b, str);
            this.f7152c = str;
        }
    }

    /* renamed from: i */
    public synchronized void m65829i(String str) {
        if (!Objects.equals(this.f7151b, str)) {
            m65832f(this.f7150a, str, this.f7152c);
            this.f7151b = str;
        }
    }
}