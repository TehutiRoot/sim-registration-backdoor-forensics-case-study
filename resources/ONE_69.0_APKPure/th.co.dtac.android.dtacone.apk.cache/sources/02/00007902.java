package p000;

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: cH0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19374cH0 extends LowLevelHttpRequest {

    /* renamed from: g */
    public static final InterfaceC5422c f39386g = new C5421b();

    /* renamed from: e */
    public final HttpURLConnection f39387e;

    /* renamed from: f */
    public int f39388f = 0;

    /* renamed from: cH0$a */
    /* loaded from: classes4.dex */
    public class CallableC5420a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5422c f39389a;

        /* renamed from: b */
        public final /* synthetic */ OutputStream f39390b;

        /* renamed from: c */
        public final /* synthetic */ StreamingContent f39391c;

        public CallableC5420a(InterfaceC5422c interfaceC5422c, OutputStream outputStream, StreamingContent streamingContent) {
            this.f39389a = interfaceC5422c;
            this.f39390b = outputStream;
            this.f39391c = streamingContent;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            this.f39389a.mo51709a(this.f39390b, this.f39391c);
            return Boolean.TRUE;
        }
    }

    /* renamed from: cH0$b */
    /* loaded from: classes4.dex */
    public static class C5421b implements InterfaceC5422c {
        @Override // p000.C19374cH0.InterfaceC5422c
        /* renamed from: a */
        public void mo51709a(OutputStream outputStream, StreamingContent streamingContent) {
            streamingContent.writeTo(outputStream);
        }
    }

    /* renamed from: cH0$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC5422c {
        /* renamed from: a */
        void mo51709a(OutputStream outputStream, StreamingContent streamingContent);
    }

    public C19374cH0(HttpURLConnection httpURLConnection) {
        this.f39387e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    /* renamed from: a */
    public LowLevelHttpResponse m51713a(InterfaceC5422c interfaceC5422c) {
        boolean z;
        HttpURLConnection httpURLConnection = this.f39387e;
        if (getStreamingContent() != null) {
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
                Preconditions.checkArgument(z, "%s with non-zero content length is not supported", requestMethod);
            } else {
                httpURLConnection.setDoOutput(true);
                if (i >= 0 && contentLength <= 2147483647L) {
                    httpURLConnection.setFixedLengthStreamingMode((int) contentLength);
                } else {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    try {
                        m51711c(interfaceC5422c, outputStream);
                        outputStream.close();
                    } catch (Throwable th2) {
                        try {
                            outputStream.close();
                        } catch (IOException unused) {
                        }
                        throw th2;
                    }
                } catch (IOException e) {
                    if (m51712b(httpURLConnection)) {
                        try {
                            outputStream.close();
                        } catch (IOException unused2) {
                        }
                    } else {
                        throw e;
                    }
                }
            }
        } else if ("DELETE".equals(httpURLConnection.getRequestMethod())) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(0L);
        }
        try {
            httpURLConnection.connect();
            return new C19547dH0(httpURLConnection);
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void addHeader(String str, String str2) {
        this.f39387e.addRequestProperty(str, str2);
    }

    /* renamed from: b */
    public final boolean m51712b(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() <= 0) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void m51711c(InterfaceC5422c interfaceC5422c, OutputStream outputStream) {
        if (this.f39388f == 0) {
            interfaceC5422c.mo51709a(outputStream, getStreamingContent());
            return;
        }
        CallableC5420a callableC5420a = new CallableC5420a(interfaceC5422c, outputStream, getStreamingContent());
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future submit = newSingleThreadExecutor.submit(new FutureTask(callableC5420a), null);
        newSingleThreadExecutor.shutdown();
        try {
            submit.get(this.f39388f, TimeUnit.MILLISECONDS);
            if (!newSingleThreadExecutor.isTerminated()) {
                newSingleThreadExecutor.shutdown();
            }
        } catch (InterruptedException e) {
            throw new IOException("Socket write interrupted", e);
        } catch (ExecutionException e2) {
            throw new IOException("Exception in socket write", e2);
        } catch (TimeoutException e3) {
            throw new IOException("Socket write timed out", e3);
        }
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public LowLevelHttpResponse execute() {
        return m51713a(f39386g);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setTimeout(int i, int i2) {
        this.f39387e.setReadTimeout(i2);
        this.f39387e.setConnectTimeout(i);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setWriteTimeout(int i) {
        this.f39388f = i;
    }
}