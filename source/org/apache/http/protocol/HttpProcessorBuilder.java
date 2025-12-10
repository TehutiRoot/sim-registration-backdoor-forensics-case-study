package org.apache.http.protocol;

import java.util.LinkedList;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;

/* loaded from: classes6.dex */
public class HttpProcessorBuilder {

    /* renamed from: a */
    public C16994wm f74608a;

    /* renamed from: b */
    public C16994wm f74609b;

    public static HttpProcessorBuilder create() {
        return new HttpProcessorBuilder();
    }

    /* renamed from: a */
    public final C16994wm m24551a() {
        if (this.f74608a == null) {
            this.f74608a = new C16994wm();
        }
        return this.f74608a;
    }

    public HttpProcessorBuilder add(HttpRequestInterceptor httpRequestInterceptor) {
        return addLast(httpRequestInterceptor);
    }

    public HttpProcessorBuilder addAll(HttpRequestInterceptor... httpRequestInterceptorArr) {
        return addAllLast(httpRequestInterceptorArr);
    }

    public HttpProcessorBuilder addAllFirst(HttpRequestInterceptor... httpRequestInterceptorArr) {
        if (httpRequestInterceptorArr == null) {
            return this;
        }
        m24551a().m721a(httpRequestInterceptorArr);
        return this;
    }

    public HttpProcessorBuilder addAllLast(HttpRequestInterceptor... httpRequestInterceptorArr) {
        if (httpRequestInterceptorArr == null) {
            return this;
        }
        m24551a().m720b(httpRequestInterceptorArr);
        return this;
    }

    public HttpProcessorBuilder addFirst(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        m24551a().m719c(httpRequestInterceptor);
        return this;
    }

    public HttpProcessorBuilder addLast(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        m24551a().m718d(httpRequestInterceptor);
        return this;
    }

    /* renamed from: b */
    public final C16994wm m24550b() {
        if (this.f74609b == null) {
            this.f74609b = new C16994wm();
        }
        return this.f74609b;
    }

    public HttpProcessor build() {
        LinkedList linkedList;
        C16994wm c16994wm = this.f74608a;
        LinkedList linkedList2 = null;
        if (c16994wm != null) {
            linkedList = c16994wm.m717e();
        } else {
            linkedList = null;
        }
        C16994wm c16994wm2 = this.f74609b;
        if (c16994wm2 != null) {
            linkedList2 = c16994wm2.m717e();
        }
        return new ImmutableHttpProcessor(linkedList, linkedList2);
    }

    public HttpProcessorBuilder add(HttpResponseInterceptor httpResponseInterceptor) {
        return addLast(httpResponseInterceptor);
    }

    public HttpProcessorBuilder addAll(HttpResponseInterceptor... httpResponseInterceptorArr) {
        return addAllLast(httpResponseInterceptorArr);
    }

    public HttpProcessorBuilder addAllFirst(HttpResponseInterceptor... httpResponseInterceptorArr) {
        if (httpResponseInterceptorArr == null) {
            return this;
        }
        m24550b().m721a(httpResponseInterceptorArr);
        return this;
    }

    public HttpProcessorBuilder addAllLast(HttpResponseInterceptor... httpResponseInterceptorArr) {
        if (httpResponseInterceptorArr == null) {
            return this;
        }
        m24550b().m720b(httpResponseInterceptorArr);
        return this;
    }

    public HttpProcessorBuilder addFirst(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        m24550b().m719c(httpResponseInterceptor);
        return this;
    }

    public HttpProcessorBuilder addLast(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        m24550b().m718d(httpResponseInterceptor);
        return this;
    }
}
