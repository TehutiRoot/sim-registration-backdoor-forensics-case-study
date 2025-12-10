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

/* renamed from: WG0 */
/* loaded from: classes4.dex */
public final class WG0 extends LowLevelHttpRequest {

    /* renamed from: g */
    public static final InterfaceC1599c f7177g = new C1598b();

    /* renamed from: e */
    public final HttpURLConnection f7178e;

    /* renamed from: f */
    public int f7179f = 0;

    /* renamed from: WG0$a */
    /* loaded from: classes4.dex */
    public class CallableC1597a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1599c f7180a;

        /* renamed from: b */
        public final /* synthetic */ OutputStream f7181b;

        /* renamed from: c */
        public final /* synthetic */ StreamingContent f7182c;

        public CallableC1597a(InterfaceC1599c interfaceC1599c, OutputStream outputStream, StreamingContent streamingContent) {
            this.f7180a = interfaceC1599c;
            this.f7181b = outputStream;
            this.f7182c = streamingContent;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            this.f7180a.mo65645a(this.f7181b, this.f7182c);
            return Boolean.TRUE;
        }
    }

    /* renamed from: WG0$b */
    /* loaded from: classes4.dex */
    public static class C1598b implements InterfaceC1599c {
        @Override // p000.WG0.InterfaceC1599c
        /* renamed from: a */
        public void mo65645a(OutputStream outputStream, StreamingContent streamingContent) {
            streamingContent.writeTo(outputStream);
        }
    }

    /* renamed from: WG0$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC1599c {
        /* renamed from: a */
        void mo65645a(OutputStream outputStream, StreamingContent streamingContent);
    }

    public WG0(HttpURLConnection httpURLConnection) {
        this.f7178e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    /* renamed from: a */
    public LowLevelHttpResponse m65649a(InterfaceC1599c interfaceC1599c) {
        boolean z;
        HttpURLConnection httpURLConnection = this.f7178e;
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
                        m65647c(interfaceC1599c, outputStream);
                        outputStream.close();
                    } catch (Throwable th2) {
                        try {
                            outputStream.close();
                        } catch (IOException unused) {
                        }
                        throw th2;
                    }
                } catch (IOException e) {
                    if (m65648b(httpURLConnection)) {
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
            return new XG0(httpURLConnection);
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void addHeader(String str, String str2) {
        this.f7178e.addRequestProperty(str, str2);
    }

    /* renamed from: b */
    public final boolean m65648b(HttpURLConnection httpURLConnection) {
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
    public final void m65647c(InterfaceC1599c interfaceC1599c, OutputStream outputStream) {
        if (this.f7179f == 0) {
            interfaceC1599c.mo65645a(outputStream, getStreamingContent());
            return;
        }
        CallableC1597a callableC1597a = new CallableC1597a(interfaceC1599c, outputStream, getStreamingContent());
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future submit = newSingleThreadExecutor.submit(new FutureTask(callableC1597a), null);
        newSingleThreadExecutor.shutdown();
        try {
            submit.get(this.f7179f, TimeUnit.MILLISECONDS);
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
        return m65649a(f7177g);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setTimeout(int i, int i2) {
        this.f7178e.setReadTimeout(i2);
        this.f7178e.setConnectTimeout(i);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setWriteTimeout(int i) {
        this.f7179f = i;
    }
}
