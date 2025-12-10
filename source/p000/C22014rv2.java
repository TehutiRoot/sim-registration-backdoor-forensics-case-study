package p000;

import com.google.android.gms.internal.firebase_ml.zzhj;
import com.google.android.gms.internal.firebase_ml.zzhk;
import com.google.android.gms.internal.firebase_ml.zzmt;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* renamed from: rv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22014rv2 extends zzhk {

    /* renamed from: e */
    public final HttpURLConnection f77504e;

    public C22014rv2(HttpURLConnection httpURLConnection) {
        this.f77504e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhk
    public final void addHeader(String str, String str2) {
        this.f77504e.addRequestProperty(str, str2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhk
    public final void zza(int i, int i2) {
        this.f77504e.setReadTimeout(i2);
        this.f77504e.setConnectTimeout(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhk
    public final zzhj zzgs() {
        boolean z;
        HttpURLConnection httpURLConnection = this.f77504e;
        if (zzgr() != null) {
            String contentType = getContentType();
            if (contentType != null) {
                addHeader("Content-Type", contentType);
            }
            String contentEncoding = getContentEncoding();
            if (contentEncoding != null) {
                addHeader("Content-Encoding", contentEncoding);
            }
            long contentLength = getContentLength();
            int i = (contentLength > 0L ? 1 : (contentLength == 0L ? 0 : -1));
            if (i >= 0) {
                httpURLConnection.setRequestProperty("Content-Length", Long.toString(contentLength));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if (!"POST".equals(requestMethod) && !"PUT".equals(requestMethod)) {
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Object[] objArr = {requestMethod};
                if (!z) {
                    throw new IllegalArgumentException(zzmt.zzb("%s with non-zero content length is not supported", objArr));
                }
            } else {
                httpURLConnection.setDoOutput(true);
                if (i >= 0 && contentLength <= 2147483647L) {
                    httpURLConnection.setFixedLengthStreamingMode((int) contentLength);
                } else {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    zzgr().writeTo(outputStream);
                    outputStream.close();
                } catch (Throwable th2) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                    throw th2;
                }
            }
        }
        try {
            httpURLConnection.connect();
            return new C20982lv2(httpURLConnection);
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }
}
