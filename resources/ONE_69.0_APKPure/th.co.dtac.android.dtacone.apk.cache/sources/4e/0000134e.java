package p000;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: UG0 */
/* loaded from: classes4.dex */
public abstract class UG0 {
    /* renamed from: a */
    public static void m66224a(InputStream inputStream, File file) {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        CommonUtils.closeQuietly(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    CommonUtils.closeQuietly(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: b */
    public static void m66223b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TG0 tg0 = (TG0) it.next();
            InputStream inputStream = null;
            try {
                inputStream = tg0.mo65435b();
                if (inputStream != null) {
                    m66224a(inputStream, new File(file, tg0.mo65436a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                CommonUtils.closeQuietly(null);
                throw th2;
            }
            CommonUtils.closeQuietly(inputStream);
        }
    }
}