package org.apache.http.impl.client;

import java.util.concurrent.FutureTask;
import org.apache.http.client.methods.HttpUriRequest;

/* loaded from: classes6.dex */
public class HttpRequestFutureTask<V> extends FutureTask<V> {

    /* renamed from: a */
    public final HttpUriRequest f74153a;

    /* renamed from: b */
    public final CallableC12588b f74154b;

    public HttpRequestFutureTask(HttpUriRequest httpUriRequest, CallableC12588b callableC12588b) {
        super(callableC12588b);
        this.f74153a = httpUriRequest;
        this.f74154b = callableC12588b;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f74154b.m24654a();
        if (z) {
            this.f74153a.abort();
        }
        return super.cancel(z);
    }

    public long endedTime() {
        if (isDone()) {
            return this.f74154b.m24653b();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    public long requestDuration() {
        if (isDone()) {
            return endedTime() - startedTime();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    public long scheduledTime() {
        return this.f74154b.m24652c();
    }

    public long startedTime() {
        return this.f74154b.m24651d();
    }

    public long taskDuration() {
        if (isDone()) {
            return endedTime() - scheduledTime();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    public String toString() {
        return this.f74153a.getRequestLine().getUri();
    }
}
