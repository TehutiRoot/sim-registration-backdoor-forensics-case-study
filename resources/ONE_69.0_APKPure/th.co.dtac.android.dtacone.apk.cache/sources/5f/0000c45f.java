package p000;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: dH0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19547dH0 extends LowLevelHttpResponse {

    /* renamed from: a */
    public final HttpURLConnection f61168a;

    /* renamed from: b */
    public final int f61169b;

    /* renamed from: c */
    public final String f61170c;

    /* renamed from: d */
    public final ArrayList f61171d;

    /* renamed from: e */
    public final ArrayList f61172e;

    public C19547dH0(HttpURLConnection httpURLConnection) {
        ArrayList arrayList = new ArrayList();
        this.f61171d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f61172e = arrayList2;
        this.f61168a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.f61169b = responseCode == -1 ? 0 : responseCode;
        this.f61170c = httpURLConnection.getResponseMessage();
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

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public void disconnect() {
        this.f61168a.disconnect();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public InputStream getContent() {
        InputStream errorStream;
        try {
            errorStream = this.f61168a.getInputStream();
        } catch (IOException unused) {
            errorStream = this.f61168a.getErrorStream();
        }
        if (errorStream == null) {
            return null;
        }
        return new C10053a(errorStream);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentEncoding() {
        return this.f61168a.getContentEncoding();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public long getContentLength() {
        String headerField = this.f61168a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentType() {
        return this.f61168a.getHeaderField("Content-Type");
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.f61171d.size();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderName(int i) {
        return (String) this.f61171d.get(i);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderValue(int i) {
        return (String) this.f61172e.get(i);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        return this.f61170c;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getStatusCode() {
        return this.f61169b;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getStatusLine() {
        String headerField = this.f61168a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    /* renamed from: dH0$a */
    /* loaded from: classes4.dex */
    public final class C10053a extends FilterInputStream {

        /* renamed from: a */
        public long f61173a;

        public C10053a(InputStream inputStream) {
            super(inputStream);
            this.f61173a = 0L;
        }

        /* renamed from: b */
        public final void m31907b() {
            long contentLength = C19547dH0.this.getContentLength();
            if (contentLength == -1) {
                return;
            }
            long j = this.f61173a;
            if (j != 0 && j < contentLength) {
                throw new IOException("Connection closed prematurely: bytesRead = " + this.f61173a + ", Content-Length = " + contentLength);
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (read == -1) {
                m31907b();
            } else {
                this.f61173a += read;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) {
            long skip = ((FilterInputStream) this).in.skip(j);
            this.f61173a += skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                m31907b();
            } else {
                this.f61173a++;
            }
            return read;
        }
    }
}