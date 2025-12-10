package p000;

import com.google.android.gms.internal.firebase_ml.zzhj;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: lv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20982lv2 extends zzhj {

    /* renamed from: a */
    public final HttpURLConnection f71766a;

    /* renamed from: b */
    public final int f71767b;

    /* renamed from: c */
    public final String f71768c;

    /* renamed from: d */
    public final ArrayList f71769d;

    /* renamed from: e */
    public final ArrayList f71770e;

    public C20982lv2(HttpURLConnection httpURLConnection) {
        ArrayList arrayList = new ArrayList();
        this.f71769d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f71770e = arrayList2;
        this.f71766a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.f71767b = responseCode == -1 ? 0 : responseCode;
        this.f71768c = httpURLConnection.getResponseMessage();
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
    public final long m26409a() {
        String headerField = this.f71766a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final void disconnect() {
        this.f71766a.disconnect();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final InputStream getContent() {
        InputStream errorStream;
        try {
            errorStream = this.f71766a.getInputStream();
        } catch (IOException unused) {
            errorStream = this.f71766a.getErrorStream();
        }
        if (errorStream == null) {
            return null;
        }
        return new Dv2(this, errorStream);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String getContentEncoding() {
        return this.f71766a.getContentEncoding();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String getContentType() {
        return this.f71766a.getHeaderField("Content-Type");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String getReasonPhrase() {
        return this.f71768c;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final int getStatusCode() {
        return this.f71767b;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String zzag(int i) {
        return (String) this.f71769d.get(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String zzah(int i) {
        return (String) this.f71770e.get(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final String zzgp() {
        String headerField = this.f71766a.getHeaderField(0);
        if (headerField != null && headerField.startsWith("HTTP/1.")) {
            return headerField;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhj
    public final int zzgq() {
        return this.f71769d.size();
    }
}
