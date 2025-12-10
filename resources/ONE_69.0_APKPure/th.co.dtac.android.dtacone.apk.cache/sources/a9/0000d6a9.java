package p000;

import com.google.android.gms.internal.firebase_ml.zzhj;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: iw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20524iw2 extends zzhj {

    /* renamed from: a */
    public final HttpURLConnection f67175a;

    /* renamed from: b */
    public final int f67176b;

    /* renamed from: c */
    public final String f67177c;

    /* renamed from: d */
    public final ArrayList f67178d;

    /* renamed from: e */
    public final ArrayList f67179e;

    public C20524iw2(HttpURLConnection httpURLConnection) {
        ArrayList arrayList = new ArrayList();
        this.f67178d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f67179e = arrayList2;
        this.f67175a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.f67176b = responseCode == -1 ? 0 : responseCode;
        this.f67177c = httpURLConnection.getResponseMessage();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                for (String str : entry.getValue()) {
                    if (str != null) {
                        arrayList.add(key);
                        arrayList2.add(str);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final long m29642a() {
        String headerField = this.f67175a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final void disconnect() {
        this.f67175a.disconnect();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final InputStream getContent() {
        InputStream errorStream;
        try {
            errorStream = this.f67175a.getInputStream();
        } catch (IOException unused) {
            errorStream = this.f67175a.getErrorStream();
        }
        if (errorStream == null) {
            return null;
        }
        return new Aw2(this, errorStream);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String getContentEncoding() {
        return this.f67175a.getContentEncoding();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String getContentType() {
        return this.f67175a.getHeaderField("Content-Type");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String getReasonPhrase() {
        return this.f67177c;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final int getStatusCode() {
        return this.f67176b;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String zzag(int i) {
        return (String) this.f67178d.get(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String zzah(int i) {
        return (String) this.f67179e.get(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String zzgp() {
        String headerField = this.f67175a.getHeaderField(0);
        if (headerField != null && headerField.startsWith("HTTP/1.")) {
            return headerField;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final int zzgq() {
        return this.f67178d.size();
    }
}