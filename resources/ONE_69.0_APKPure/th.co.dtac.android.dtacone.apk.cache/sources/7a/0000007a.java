package p000;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: AW */
/* loaded from: classes4.dex */
public class C0035AW implements TG0 {

    /* renamed from: a */
    public final File f116a;

    /* renamed from: b */
    public final String f117b;

    /* renamed from: c */
    public final String f118c;

    public C0035AW(String str, String str2, File file) {
        this.f117b = str;
        this.f118c = str2;
        this.f116a = file;
    }

    /* renamed from: d */
    private byte[] m69271d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream mo65435b = mo65435b();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (mo65435b == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (mo65435b != null) {
                    mo65435b.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = mo65435b.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        mo65435b.close();
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

    @Override // p000.TG0
    /* renamed from: a */
    public String mo65436a() {
        return this.f118c;
    }

    @Override // p000.TG0
    /* renamed from: b */
    public InputStream mo65435b() {
        if (this.f116a.exists() && this.f116a.isFile()) {
            try {
                return new FileInputStream(this.f116a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // p000.TG0
    /* renamed from: c */
    public CrashlyticsReport.FilesPayload.File mo65434c() {
        byte[] m69271d = m69271d();
        if (m69271d != null) {
            return CrashlyticsReport.FilesPayload.File.builder().setContents(m69271d).setFilename(this.f117b).build();
        }
        return null;
    }
}