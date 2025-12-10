package p000;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: Yf */
/* loaded from: classes4.dex */
public class C1750Yf implements TG0 {

    /* renamed from: a */
    public final byte[] f7910a;

    /* renamed from: b */
    public final String f7911b;

    /* renamed from: c */
    public final String f7912c;

    public C1750Yf(String str, String str2, byte[] bArr) {
        this.f7911b = str;
        this.f7912c = str2;
        this.f7910a = bArr;
    }

    @Override // p000.TG0
    /* renamed from: a */
    public String mo65436a() {
        return this.f7912c;
    }

    @Override // p000.TG0
    /* renamed from: b */
    public InputStream mo65435b() {
        if (m65432e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f7910a);
    }

    @Override // p000.TG0
    /* renamed from: c */
    public CrashlyticsReport.FilesPayload.File mo65434c() {
        byte[] m65433d = m65433d();
        if (m65433d == null) {
            return null;
        }
        return CrashlyticsReport.FilesPayload.File.builder().setContents(m65433d).setFilename(this.f7911b).build();
    }

    /* renamed from: d */
    public final byte[] m65433d() {
        if (m65432e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f7910a);
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
    public final boolean m65432e() {
        byte[] bArr = this.f7910a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }
}