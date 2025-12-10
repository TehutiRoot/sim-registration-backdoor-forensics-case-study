package p000;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

/* renamed from: kz */
/* loaded from: classes4.dex */
public class C12186kz {

    /* renamed from: a */
    public final String f71499a;

    /* renamed from: b */
    public final FileStore f71500b;

    public C12186kz(String str, FileStore fileStore) {
        this.f71499a = str;
        this.f71500b = fileStore;
    }

    /* renamed from: a */
    public boolean m26579a() {
        try {
            return m26578b().createNewFile();
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.m39137e("Error creating marker: " + this.f71499a, e);
            return false;
        }
    }

    /* renamed from: b */
    public final File m26578b() {
        return this.f71500b.getCommonFile(this.f71499a);
    }

    /* renamed from: c */
    public boolean m26577c() {
        return m26578b().exists();
    }

    /* renamed from: d */
    public boolean m26576d() {
        return m26578b().delete();
    }
}
