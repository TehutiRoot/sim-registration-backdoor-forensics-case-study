package p000;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: wW */
/* loaded from: classes4.dex */
public class C16973wW implements NG0 {

    /* renamed from: a */
    public final File f108023a;

    /* renamed from: b */
    public final String f108024b;

    /* renamed from: c */
    public final String f108025c;

    public C16973wW(String str, String str2, File file) {
        this.f108024b = str;
        this.f108025c = str2;
        this.f108023a = file;
    }

    /* renamed from: d */
    private byte[] m830d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream mo832b = mo832b();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (mo832b == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (mo832b != null) {
                    mo832b.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = mo832b.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        mo832b.close();
                        return byteArray;
                    }
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p000.NG0
    /* renamed from: a */
    public String mo833a() {
        return this.f108025c;
    }

    @Override // p000.NG0
    /* renamed from: b */
    public InputStream mo832b() {
        if (this.f108023a.exists() && this.f108023a.isFile()) {
            try {
                return new FileInputStream(this.f108023a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // p000.NG0
    /* renamed from: c */
    public CrashlyticsReport.FilesPayload.File mo831c() {
        byte[] m830d = m830d();
        if (m830d != null) {
            return CrashlyticsReport.FilesPayload.File.builder().setContents(m830d).setFilename(this.f108024b).build();
        }
        return null;
    }
}
