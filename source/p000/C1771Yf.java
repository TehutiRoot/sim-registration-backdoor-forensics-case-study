package p000;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: Yf */
/* loaded from: classes4.dex */
public class C1771Yf implements NG0 {

    /* renamed from: a */
    public final byte[] f7810a;

    /* renamed from: b */
    public final String f7811b;

    /* renamed from: c */
    public final String f7812c;

    public C1771Yf(String str, String str2, byte[] bArr) {
        this.f7811b = str;
        this.f7812c = str2;
        this.f7810a = bArr;
    }

    @Override // p000.NG0
    /* renamed from: a */
    public String mo833a() {
        return this.f7812c;
    }

    @Override // p000.NG0
    /* renamed from: b */
    public InputStream mo832b() {
        if (m65327e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f7810a);
    }

    @Override // p000.NG0
    /* renamed from: c */
    public CrashlyticsReport.FilesPayload.File mo831c() {
        byte[] m65328d = m65328d();
        if (m65328d == null) {
            return null;
        }
        return CrashlyticsReport.FilesPayload.File.builder().setContents(m65328d).setFilename(this.f7811b).build();
    }

    /* renamed from: d */
    public final byte[] m65328d() {
        if (m65327e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f7810a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final boolean m65327e() {
        byte[] bArr = this.f7810a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }
}
