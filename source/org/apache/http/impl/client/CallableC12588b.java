package org.apache.http.impl.client;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.protocol.HttpContext;

/* renamed from: org.apache.http.impl.client.b */
/* loaded from: classes6.dex */
public class CallableC12588b implements Callable {

    /* renamed from: a */
    public final HttpUriRequest f74187a;

    /* renamed from: b */
    public final HttpClient f74188b;

    /* renamed from: c */
    public final AtomicBoolean f74189c = new AtomicBoolean(false);

    /* renamed from: d */
    public final long f74190d = System.currentTimeMillis();

    /* renamed from: e */
    public long f74191e = -1;

    /* renamed from: f */
    public long f74192f = -1;

    /* renamed from: g */
    public final HttpContext f74193g;

    /* renamed from: h */
    public final ResponseHandler f74194h;

    /* renamed from: i */
    public final FutureCallback f74195i;

    /* renamed from: j */
    public final FutureRequestExecutionMetrics f74196j;

    public CallableC12588b(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler responseHandler, FutureCallback futureCallback, FutureRequestExecutionMetrics futureRequestExecutionMetrics) {
        this.f74188b = httpClient;
        this.f74194h = responseHandler;
        this.f74187a = httpUriRequest;
        this.f74193g = httpContext;
        this.f74195i = futureCallback;
        this.f74196j = futureRequestExecutionMetrics;
    }

    /* renamed from: a */
    public void m24654a() {
        this.f74189c.set(true);
        FutureCallback futureCallback = this.f74195i;
        if (futureCallback != null) {
            futureCallback.cancelled();
        }
    }

    /* renamed from: b */
    public long m24653b() {
        return this.f74192f;
    }

    /* renamed from: c */
    public long m24652c() {
        return this.f74190d;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        if (!this.f74189c.get()) {
            try {
                this.f74196j.m24671a().incrementAndGet();
                this.f74191e = System.currentTimeMillis();
                try {
                    this.f74196j.m24668d().decrementAndGet();
                    Object execute = this.f74188b.execute(this.f74187a, this.f74194h, this.f74193g);
                    this.f74192f = System.currentTimeMillis();
                    this.f74196j.m24667e().m24663c(this.f74191e);
                    FutureCallback futureCallback = this.f74195i;
                    if (futureCallback != null) {
                        futureCallback.completed(execute);
                    }
                    return execute;
                } catch (Exception e) {
                    this.f74196j.m24670b().m24663c(this.f74191e);
                    this.f74192f = System.currentTimeMillis();
                    FutureCallback futureCallback2 = this.f74195i;
                    if (futureCallback2 != null) {
                        futureCallback2.failed(e);
                    }
                    throw e;
                }
            } finally {
                this.f74196j.m24669c().m24663c(this.f74191e);
                this.f74196j.m24666f().m24663c(this.f74191e);
                this.f74196j.m24671a().decrementAndGet();
            }
        }
        throw new IllegalStateException("call has been cancelled for request " + this.f74187a.getURI());
    }

    /* renamed from: d */
    public long m24651d() {
        return this.f74191e;
    }
}
