package org.apache.http.impl.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class DefaultHttpRequestRetryHandler implements HttpRequestRetryHandler {
    public static final DefaultHttpRequestRetryHandler INSTANCE = new DefaultHttpRequestRetryHandler();

    /* renamed from: a */
    public final int f74067a;

    /* renamed from: b */
    public final boolean f74068b;

    /* renamed from: c */
    public final Set f74069c;

    public DefaultHttpRequestRetryHandler(int i, boolean z, Collection<Class<? extends IOException>> collection) {
        this.f74067a = i;
        this.f74068b = z;
        HashSet hashSet = new HashSet();
        this.f74069c = hashSet;
        hashSet.addAll(collection);
    }

    public int getRetryCount() {
        return this.f74067a;
    }

    public boolean handleAsIdempotent(HttpRequest httpRequest) {
        return !(httpRequest instanceof HttpEntityEnclosingRequest);
    }

    public boolean isRequestSentRetryEnabled() {
        return this.f74068b;
    }

    @Deprecated
    public boolean requestIsAborted(HttpRequest httpRequest) {
        if (httpRequest instanceof RequestWrapper) {
            httpRequest = ((RequestWrapper) httpRequest).getOriginal();
        }
        if ((httpRequest instanceof HttpUriRequest) && ((HttpUriRequest) httpRequest).isAborted()) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        Args.notNull(iOException, "Exception parameter");
        Args.notNull(httpContext, "HTTP context");
        if (i > this.f74067a || this.f74069c.contains(iOException.getClass())) {
            return false;
        }
        for (Class cls : this.f74069c) {
            if (cls.isInstance(iOException)) {
                return false;
            }
        }
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        HttpRequest request = adapt.getRequest();
        if (requestIsAborted(request)) {
            return false;
        }
        if (!handleAsIdempotent(request) && adapt.isRequestSent() && !this.f74068b) {
            return false;
        }
        return true;
    }

    public DefaultHttpRequestRetryHandler(int i, boolean z) {
        this(i, z, Arrays.asList(InterruptedIOException.class, UnknownHostException.class, ConnectException.class, NoRouteToHostException.class, SSLException.class));
    }

    public DefaultHttpRequestRetryHandler() {
        this(3, false);
    }
}
