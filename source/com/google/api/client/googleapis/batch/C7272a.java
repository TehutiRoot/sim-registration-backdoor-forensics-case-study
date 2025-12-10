package com.google.api.client.googleapis.batch;

import com.google.api.client.googleapis.batch.BatchRequest;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.util.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.google.api.client.googleapis.batch.a */
/* loaded from: classes4.dex */
public final class C7272a {

    /* renamed from: a */
    public final String f51861a;

    /* renamed from: b */
    public final List f51862b;

    /* renamed from: c */
    public final InputStream f51863c;

    /* renamed from: d */
    public boolean f51864d = true;

    /* renamed from: e */
    public List f51865e = new ArrayList();

    /* renamed from: f */
    public int f51866f = 0;

    /* renamed from: g */
    public final boolean f51867g;

    /* renamed from: com.google.api.client.googleapis.batch.a$a */
    /* loaded from: classes4.dex */
    public class C7273a extends FilterInputStream {
        public C7273a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* renamed from: com.google.api.client.googleapis.batch.a$b */
    /* loaded from: classes4.dex */
    public static class C7274b extends LowLevelHttpRequest {

        /* renamed from: e */
        public InputStream f51869e;

        /* renamed from: f */
        public int f51870f;

        /* renamed from: g */
        public List f51871g;

        /* renamed from: h */
        public List f51872h;

        public C7274b(InputStream inputStream, int i, List list, List list2) {
            this.f51869e = inputStream;
            this.f51870f = i;
            this.f51871g = list;
            this.f51872h = list2;
        }

        @Override // com.google.api.client.http.LowLevelHttpRequest
        public void addHeader(String str, String str2) {
        }

        @Override // com.google.api.client.http.LowLevelHttpRequest
        public LowLevelHttpResponse execute() {
            return new C7275c(this.f51869e, this.f51870f, this.f51871g, this.f51872h);
        }
    }

    /* renamed from: com.google.api.client.googleapis.batch.a$c */
    /* loaded from: classes4.dex */
    public static class C7275c extends LowLevelHttpResponse {

        /* renamed from: a */
        public InputStream f51873a;

        /* renamed from: b */
        public int f51874b;

        /* renamed from: c */
        public List f51875c;

        /* renamed from: d */
        public List f51876d;

        public C7275c(InputStream inputStream, int i, List list, List list2) {
            this.f51875c = new ArrayList();
            new ArrayList();
            this.f51873a = inputStream;
            this.f51874b = i;
            this.f51875c = list;
            this.f51876d = list2;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public InputStream getContent() {
            return this.f51873a;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getContentEncoding() {
            return null;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public long getContentLength() {
            return 0L;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getContentType() {
            return null;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public int getHeaderCount() {
            return this.f51875c.size();
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getHeaderName(int i) {
            return (String) this.f51875c.get(i);
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getHeaderValue(int i) {
            return (String) this.f51876d.get(i);
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getReasonPhrase() {
            return null;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public int getStatusCode() {
            return this.f51874b;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getStatusLine() {
            return null;
        }
    }

    /* renamed from: com.google.api.client.googleapis.batch.a$d */
    /* loaded from: classes4.dex */
    public static class C7276d extends HttpTransport {

        /* renamed from: c */
        public int f51877c;

        /* renamed from: d */
        public InputStream f51878d;

        /* renamed from: e */
        public List f51879e;

        /* renamed from: f */
        public List f51880f;

        public C7276d(int i, InputStream inputStream, List list, List list2) {
            this.f51877c = i;
            this.f51878d = inputStream;
            this.f51879e = list;
            this.f51880f = list2;
        }

        @Override // com.google.api.client.http.HttpTransport
        public LowLevelHttpRequest buildRequest(String str, String str2) {
            return new C7274b(this.f51878d, this.f51877c, this.f51879e, this.f51880f);
        }
    }

    public C7272a(InputStream inputStream, String str, List list, boolean z) {
        this.f51861a = str;
        this.f51862b = list;
        this.f51867g = z;
        this.f51863c = inputStream;
        m41812a(m41807f());
    }

    /* renamed from: h */
    public static InputStream m41805h(byte[] bArr) {
        int length = bArr.length;
        if (length > 0 && bArr[length - 1] == 10) {
            length--;
        }
        if (length > 0 && bArr[length - 1] == 13) {
            length--;
        }
        return new ByteArrayInputStream(bArr, 0, length);
    }

    /* renamed from: i */
    public static String m41804i(String str) {
        if (str.endsWith("\r\n")) {
            return str.substring(0, str.length() - 2);
        }
        if (str.endsWith("\n")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* renamed from: a */
    public final void m41812a(String str) {
        if (str.equals(this.f51861a + HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
            this.f51864d = false;
            this.f51863c.close();
        }
    }

    /* renamed from: b */
    public final HttpResponse m41811b(int i, InputStream inputStream, List list, List list2) {
        HttpRequest buildPostRequest = new C7276d(i, inputStream, list, list2).createRequestFactory().buildPostRequest(new GenericUrl(HttpTesting.SIMPLE_URL), null);
        buildPostRequest.setLoggingEnabled(false);
        buildPostRequest.setThrowExceptionOnExecuteError(false);
        return buildPostRequest.execute();
    }

    /* renamed from: c */
    public final Object m41810c(Class cls, HttpResponse httpResponse, BatchRequest.C7271b c7271b) {
        if (cls == Void.class) {
            return null;
        }
        return c7271b.f51860d.getParser().parseAndClose(httpResponse.getContent(), httpResponse.getContentCharset(), (Class<Object>) cls);
    }

    /* renamed from: d */
    public final void m41809d(BatchRequest.C7271b c7271b, int i, HttpResponse httpResponse) {
        boolean z;
        boolean z2;
        BatchCallback batchCallback = c7271b.f51857a;
        HttpHeaders headers = httpResponse.getHeaders();
        HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler = c7271b.f51860d.getUnsuccessfulResponseHandler();
        if (HttpStatusCodes.isSuccess(i)) {
            if (batchCallback == null) {
                return;
            }
            batchCallback.onSuccess(m41810c(c7271b.f51858b, httpResponse, c7271b), headers);
            return;
        }
        HttpContent content = c7271b.f51860d.getContent();
        boolean z3 = true;
        if (this.f51867g && (content == null || content.retrySupported())) {
            z = true;
        } else {
            z = false;
        }
        if (unsuccessfulResponseHandler != null) {
            z2 = unsuccessfulResponseHandler.handleResponse(c7271b.f51860d, httpResponse, z);
        } else {
            z2 = false;
        }
        z3 = (z2 || !c7271b.f51860d.handleRedirect(httpResponse.getStatusCode(), httpResponse.getHeaders())) ? false : false;
        if (z && (z2 || z3)) {
            this.f51865e.add(c7271b);
        } else if (batchCallback == null) {
        } else {
            batchCallback.onFailure(m41810c(c7271b.f51859c, httpResponse, c7271b), headers);
        }
    }

    /* renamed from: e */
    public void m41808e() {
        String m41807f;
        String m41807f2;
        InputStream c7273a;
        String m41806g;
        this.f51866f++;
        do {
            m41807f = m41807f();
            if (m41807f == null) {
                break;
            }
        } while (!m41807f.equals(""));
        int parseInt = Integer.parseInt(m41807f().split(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)[1]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j = -1;
        while (true) {
            m41807f2 = m41807f();
            if (m41807f2 == null || m41807f2.equals("")) {
                break;
            }
            String[] split = m41807f2.split(": ", 2);
            String str = split[0];
            String str2 = split[1];
            arrayList.add(str);
            arrayList2.add(str2);
            if ("Content-Length".equalsIgnoreCase(str.trim())) {
                j = Long.parseLong(str2);
            }
        }
        int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i == 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                m41806g = m41806g();
                if (m41806g == null || m41806g.startsWith(this.f51861a)) {
                    break;
                }
                byteArrayOutputStream.write(m41806g.getBytes("ISO-8859-1"));
            }
            c7273a = m41805h(byteArrayOutputStream.toByteArray());
            m41807f2 = m41804i(m41806g);
        } else {
            c7273a = new C7273a(ByteStreams.limit(this.f51863c, j));
        }
        m41809d((BatchRequest.C7271b) this.f51862b.get(this.f51866f - 1), parseInt, m41811b(parseInt, c7273a, arrayList, arrayList2));
        while (true) {
            if (c7273a.skip(j) <= 0 && c7273a.read() == -1) {
                break;
            }
        }
        if (i != 0) {
            m41807f2 = m41807f();
        }
        while (m41807f2 != null && m41807f2.length() == 0) {
            m41807f2 = m41807f();
        }
        m41812a(m41807f2);
    }

    /* renamed from: f */
    public final String m41807f() {
        return m41804i(m41806g());
    }

    /* renamed from: g */
    public final String m41806g() {
        int read = this.f51863c.read();
        if (read == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (read != -1) {
            sb.append((char) read);
            if (read == 10) {
                break;
            }
            read = this.f51863c.read();
        }
        return sb.toString();
    }
}
