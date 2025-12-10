package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolException;
import org.apache.http.UnsupportedHttpVersionException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.EncodingUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class HttpService {

    /* renamed from: a */
    public volatile HttpParams f74612a;

    /* renamed from: b */
    public volatile HttpProcessor f74613b;

    /* renamed from: c */
    public volatile HttpRequestHandlerMapper f74614c;

    /* renamed from: d */
    public volatile ConnectionReuseStrategy f74615d;

    /* renamed from: e */
    public volatile HttpResponseFactory f74616e;

    /* renamed from: f */
    public volatile HttpExpectationVerifier f74617f;

    /* renamed from: org.apache.http.protocol.HttpService$a */
    /* loaded from: classes6.dex */
    public static class C12614a implements HttpRequestHandlerMapper {

        /* renamed from: a */
        public final HttpRequestHandlerResolver f74618a;

        public C12614a(HttpRequestHandlerResolver httpRequestHandlerResolver) {
            this.f74618a = httpRequestHandlerResolver;
        }

        @Override // org.apache.http.protocol.HttpRequestHandlerMapper
        public HttpRequestHandler lookup(HttpRequest httpRequest) {
            return this.f74618a.lookup(httpRequest.getRequestLine().getUri());
        }
    }

    @Deprecated
    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerResolver httpRequestHandlerResolver, HttpExpectationVerifier httpExpectationVerifier, HttpParams httpParams) {
        this(httpProcessor, connectionReuseStrategy, httpResponseFactory, new C12614a(httpRequestHandlerResolver), httpExpectationVerifier);
        this.f74612a = httpParams;
    }

    /* renamed from: a */
    public final boolean m24548a(HttpRequest httpRequest, HttpResponse httpResponse) {
        int statusCode;
        if ((httpRequest != null && "HEAD".equalsIgnoreCase(httpRequest.getRequestLine().getMethod())) || (statusCode = httpResponse.getStatusLine().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) {
            return false;
        }
        return true;
    }

    public void doService(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        HttpRequestHandler httpRequestHandler;
        if (this.f74614c != null) {
            httpRequestHandler = this.f74614c.lookup(httpRequest);
        } else {
            httpRequestHandler = null;
        }
        if (httpRequestHandler != null) {
            httpRequestHandler.handle(httpRequest, httpResponse, httpContext);
        } else {
            httpResponse.setStatusCode(501);
        }
    }

    @Deprecated
    public HttpParams getParams() {
        return this.f74612a;
    }

    public void handleException(HttpException httpException, HttpResponse httpResponse) {
        if (httpException instanceof MethodNotSupportedException) {
            httpResponse.setStatusCode(501);
        } else if (httpException instanceof UnsupportedHttpVersionException) {
            httpResponse.setStatusCode(505);
        } else if (httpException instanceof ProtocolException) {
            httpResponse.setStatusCode(400);
        } else {
            httpResponse.setStatusCode(500);
        }
        String message = httpException.getMessage();
        if (message == null) {
            message = httpException.toString();
        }
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(EncodingUtils.getAsciiBytes(message));
        byteArrayEntity.setContentType("text/plain; charset=US-ASCII");
        httpResponse.setEntity(byteArrayEntity);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleRequest(org.apache.http.HttpServerConnection r9, org.apache.http.protocol.HttpContext r10) throws java.io.IOException, org.apache.http.HttpException {
        /*
            r8 = this;
            java.lang.String r0 = "http.connection"
            r10.setAttribute(r0, r9)
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = 0
            org.apache.http.HttpRequest r2 = r9.receiveRequestHeader()     // Catch: org.apache.http.HttpException -> L84
            boolean r3 = r2 instanceof org.apache.http.HttpEntityEnclosingRequest     // Catch: org.apache.http.HttpException -> L3d
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == 0) goto L5e
            r3 = r2
            org.apache.http.HttpEntityEnclosingRequest r3 = (org.apache.http.HttpEntityEnclosingRequest) r3     // Catch: org.apache.http.HttpException -> L3d
            boolean r3 = r3.expectContinue()     // Catch: org.apache.http.HttpException -> L3d
            if (r3 == 0) goto L58
            org.apache.http.HttpResponseFactory r3 = r8.f74616e     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpVersion r5 = org.apache.http.HttpVersion.HTTP_1_1     // Catch: org.apache.http.HttpException -> L3d
            r6 = 100
            org.apache.http.HttpResponse r3 = r3.newHttpResponse(r5, r6, r10)     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.protocol.HttpExpectationVerifier r5 = r8.f74617f     // Catch: org.apache.http.HttpException -> L3d
            if (r5 == 0) goto L3f
            org.apache.http.protocol.HttpExpectationVerifier r5 = r8.f74617f     // Catch: org.apache.http.HttpException -> L2f
            r5.verify(r2, r3, r10)     // Catch: org.apache.http.HttpException -> L2f
            goto L3f
        L2f:
            r3 = move-exception
            org.apache.http.HttpResponseFactory r5 = r8.f74616e     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpVersion r6 = org.apache.http.HttpVersion.HTTP_1_0     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpResponse r5 = r5.newHttpResponse(r6, r0, r10)     // Catch: org.apache.http.HttpException -> L3d
            r8.handleException(r3, r5)     // Catch: org.apache.http.HttpException -> L3d
            r3 = r5
            goto L3f
        L3d:
            r1 = move-exception
            goto L88
        L3f:
            org.apache.http.StatusLine r5 = r3.getStatusLine()     // Catch: org.apache.http.HttpException -> L3d
            int r5 = r5.getStatusCode()     // Catch: org.apache.http.HttpException -> L3d
            if (r5 >= r4) goto L56
            r9.sendResponseHeader(r3)     // Catch: org.apache.http.HttpException -> L3d
            r9.flush()     // Catch: org.apache.http.HttpException -> L3d
            r3 = r2
            org.apache.http.HttpEntityEnclosingRequest r3 = (org.apache.http.HttpEntityEnclosingRequest) r3     // Catch: org.apache.http.HttpException -> L3d
            r9.receiveRequestEntity(r3)     // Catch: org.apache.http.HttpException -> L3d
            goto L5e
        L56:
            r1 = r3
            goto L5e
        L58:
            r3 = r2
            org.apache.http.HttpEntityEnclosingRequest r3 = (org.apache.http.HttpEntityEnclosingRequest) r3     // Catch: org.apache.http.HttpException -> L3d
            r9.receiveRequestEntity(r3)     // Catch: org.apache.http.HttpException -> L3d
        L5e:
            java.lang.String r3 = "http.request"
            r10.setAttribute(r3, r2)     // Catch: org.apache.http.HttpException -> L3d
            if (r1 != 0) goto L75
            org.apache.http.HttpResponseFactory r1 = r8.f74616e     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpVersion r3 = org.apache.http.HttpVersion.HTTP_1_1     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpResponse r1 = r1.newHttpResponse(r3, r4, r10)     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.protocol.HttpProcessor r3 = r8.f74613b     // Catch: org.apache.http.HttpException -> L3d
            r3.process(r2, r10)     // Catch: org.apache.http.HttpException -> L3d
            r8.doService(r2, r1, r10)     // Catch: org.apache.http.HttpException -> L3d
        L75:
            boolean r3 = r2 instanceof org.apache.http.HttpEntityEnclosingRequest     // Catch: org.apache.http.HttpException -> L3d
            if (r3 == 0) goto L94
            r3 = r2
            org.apache.http.HttpEntityEnclosingRequest r3 = (org.apache.http.HttpEntityEnclosingRequest) r3     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.HttpEntity r3 = r3.getEntity()     // Catch: org.apache.http.HttpException -> L3d
            org.apache.http.util.EntityUtils.consume(r3)     // Catch: org.apache.http.HttpException -> L3d
            goto L94
        L84:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
        L88:
            org.apache.http.HttpResponseFactory r3 = r8.f74616e
            org.apache.http.HttpVersion r4 = org.apache.http.HttpVersion.HTTP_1_0
            org.apache.http.HttpResponse r0 = r3.newHttpResponse(r4, r0, r10)
            r8.handleException(r1, r0)
            r1 = r0
        L94:
            java.lang.String r0 = "http.response"
            r10.setAttribute(r0, r1)
            org.apache.http.protocol.HttpProcessor r0 = r8.f74613b
            r0.process(r1, r10)
            r9.sendResponseHeader(r1)
            boolean r0 = r8.m24548a(r2, r1)
            if (r0 == 0) goto Laa
            r9.sendResponseEntity(r1)
        Laa:
            r9.flush()
            org.apache.http.ConnectionReuseStrategy r0 = r8.f74615d
            boolean r10 = r0.keepAlive(r1, r10)
            if (r10 != 0) goto Lb8
            r9.close()
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.protocol.HttpService.handleRequest(org.apache.http.HttpServerConnection, org.apache.http.protocol.HttpContext):void");
    }

    @Deprecated
    public void setConnReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        this.f74615d = connectionReuseStrategy;
    }

    @Deprecated
    public void setExpectationVerifier(HttpExpectationVerifier httpExpectationVerifier) {
        this.f74617f = httpExpectationVerifier;
    }

    @Deprecated
    public void setHandlerResolver(HttpRequestHandlerResolver httpRequestHandlerResolver) {
        this.f74614c = new C12614a(httpRequestHandlerResolver);
    }

    @Deprecated
    public void setHttpProcessor(HttpProcessor httpProcessor) {
        Args.notNull(httpProcessor, "HTTP processor");
        this.f74613b = httpProcessor;
    }

    @Deprecated
    public void setParams(HttpParams httpParams) {
        this.f74612a = httpParams;
    }

    @Deprecated
    public void setResponseFactory(HttpResponseFactory httpResponseFactory) {
        Args.notNull(httpResponseFactory, "Response factory");
        this.f74616e = httpResponseFactory;
    }

    @Deprecated
    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerResolver httpRequestHandlerResolver, HttpParams httpParams) {
        this(httpProcessor, connectionReuseStrategy, httpResponseFactory, new C12614a(httpRequestHandlerResolver), (HttpExpectationVerifier) null);
        this.f74612a = httpParams;
    }

    @Deprecated
    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory) {
        this.f74612a = null;
        this.f74613b = null;
        this.f74614c = null;
        this.f74615d = null;
        this.f74616e = null;
        this.f74617f = null;
        setHttpProcessor(httpProcessor);
        setConnReuseStrategy(connectionReuseStrategy);
        setResponseFactory(httpResponseFactory);
    }

    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerMapper httpRequestHandlerMapper, HttpExpectationVerifier httpExpectationVerifier) {
        this.f74612a = null;
        this.f74613b = null;
        this.f74614c = null;
        this.f74615d = null;
        this.f74616e = null;
        this.f74617f = null;
        this.f74613b = (HttpProcessor) Args.notNull(httpProcessor, "HTTP processor");
        this.f74615d = connectionReuseStrategy == null ? DefaultConnectionReuseStrategy.INSTANCE : connectionReuseStrategy;
        this.f74616e = httpResponseFactory == null ? DefaultHttpResponseFactory.INSTANCE : httpResponseFactory;
        this.f74614c = httpRequestHandlerMapper;
        this.f74617f = httpExpectationVerifier;
    }

    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerMapper httpRequestHandlerMapper) {
        this(httpProcessor, connectionReuseStrategy, httpResponseFactory, httpRequestHandlerMapper, (HttpExpectationVerifier) null);
    }

    public HttpService(HttpProcessor httpProcessor, HttpRequestHandlerMapper httpRequestHandlerMapper) {
        this(httpProcessor, (ConnectionReuseStrategy) null, (HttpResponseFactory) null, httpRequestHandlerMapper, (HttpExpectationVerifier) null);
    }
}
