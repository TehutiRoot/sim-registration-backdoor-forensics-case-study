package org.apache.http.impl.client;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public class FutureRequestExecutionService implements Closeable {

    /* renamed from: a */
    public final HttpClient f74092a;

    /* renamed from: b */
    public final ExecutorService f74093b;

    /* renamed from: c */
    public final FutureRequestExecutionMetrics f74094c = new FutureRequestExecutionMetrics();

    /* renamed from: d */
    public final AtomicBoolean f74095d = new AtomicBoolean(false);

    public FutureRequestExecutionService(HttpClient httpClient, ExecutorService executorService) {
        this.f74092a = httpClient;
        this.f74093b = executorService;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f74095d.set(true);
        this.f74093b.shutdownNow();
        HttpClient httpClient = this.f74092a;
        if (httpClient instanceof Closeable) {
            ((Closeable) httpClient).close();
        }
    }

    public <T> HttpRequestFutureTask<T> execute(HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler<T> responseHandler) {
        return execute(httpUriRequest, httpContext, responseHandler, null);
    }

    public FutureRequestExecutionMetrics metrics() {
        return this.f74094c;
    }

    public <T> HttpRequestFutureTask<T> execute(HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler<T> responseHandler, FutureCallback<T> futureCallback) {
        if (!this.f74095d.get()) {
            this.f74094c.m24668d().incrementAndGet();
            HttpRequestFutureTask<T> httpRequestFutureTask = new HttpRequestFutureTask<>(httpUriRequest, new CallableC12588b(this.f74092a, httpUriRequest, httpContext, responseHandler, futureCallback, this.f74094c));
            this.f74093b.execute(httpRequestFutureTask);
            return httpRequestFutureTask;
        }
        throw new IllegalStateException("Close has been called on this httpclient instance.");
    }
}
