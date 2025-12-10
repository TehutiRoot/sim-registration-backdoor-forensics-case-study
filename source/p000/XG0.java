package p000;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: XG0 */
/* loaded from: classes4.dex */
public final class XG0 extends LowLevelHttpResponse {

    /* renamed from: a */
    public final HttpURLConnection f7434a;

    /* renamed from: b */
    public final int f7435b;

    /* renamed from: c */
    public final String f7436c;

    /* renamed from: d */
    public final ArrayList f7437d;

    /* renamed from: e */
    public final ArrayList f7438e;

    public XG0(HttpURLConnection httpURLConnection) {
        ArrayList arrayList = new ArrayList();
        this.f7437d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f7438e = arrayList2;
        this.f7434a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.f7435b = responseCode == -1 ? 0 : responseCode;
        this.f7436c = httpURLConnection.getResponseMessage();
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
        this.f7434a.disconnect();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public InputStream getContent() {
        InputStream errorStream;
        try {
            errorStream = this.f7434a.getInputStream();
        } catch (IOException unused) {
            errorStream = this.f7434a.getErrorStream();
        }
        if (errorStream == null) {
            return null;
        }
        return new C1668a(errorStream);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentEncoding() {
        return this.f7434a.getContentEncoding();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public long getContentLength() {
        String headerField = this.f7434a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentType() {
        return this.f7434a.getHeaderField("Content-Type");
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.f7437d.size();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderName(int i) {
        return (String) this.f7437d.get(i);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderValue(int i) {
        return (String) this.f7438e.get(i);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        return this.f7436c;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getStatusCode() {
        return this.f7435b;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getStatusLine() {
        String headerField = this.f7434a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    /* renamed from: XG0$a */
    /* loaded from: classes4.dex */
    public final class C1668a extends FilterInputStream {

        /* renamed from: a */
        public long f7439a;

        public C1668a(InputStream inputStream) {
            super(inputStream);
            this.f7439a = 0L;
        }

        /* renamed from: b */
        public final void m65529b() {
            long contentLength = XG0.this.getContentLength();
            if (contentLength == -1) {
                return;
            }
            long j = this.f7439a;
            if (j != 0 && j < contentLength) {
                throw new IOException("Connection closed prematurely: bytesRead = " + this.f7439a + ", Content-Length = " + contentLength);
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (read == -1) {
                m65529b();
            } else {
                this.f7439a += read;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) {
            long skip = ((FilterInputStream) this).in.skip(j);
            this.f7439a += skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                m65529b();
            } else {
                this.f7439a++;
            }
            return read;
        }
    }
}
