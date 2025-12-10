package org.apache.http.client.methods;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.HeaderGroup;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class RequestBuilder {

    /* renamed from: a */
    public String f73794a;

    /* renamed from: b */
    public Charset f73795b;

    /* renamed from: c */
    public ProtocolVersion f73796c;

    /* renamed from: d */
    public URI f73797d;

    /* renamed from: e */
    public HeaderGroup f73798e;

    /* renamed from: f */
    public HttpEntity f73799f;

    /* renamed from: g */
    public List f73800g;

    /* renamed from: h */
    public RequestConfig f73801h;

    /* renamed from: org.apache.http.client.methods.RequestBuilder$a */
    /* loaded from: classes6.dex */
    public static class C12563a extends HttpEntityEnclosingRequestBase {

        /* renamed from: f */
        public final String f73802f;

        public C12563a(String str) {
            this.f73802f = str;
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return this.f73802f;
        }
    }

    /* renamed from: org.apache.http.client.methods.RequestBuilder$b */
    /* loaded from: classes6.dex */
    public static class C12564b extends HttpRequestBase {

        /* renamed from: e */
        public final String f73803e;

        public C12564b(String str) {
            this.f73803e = str;
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return this.f73803e;
        }
    }

    public RequestBuilder(String str) {
        this.f73795b = Consts.UTF_8;
        this.f73794a = str;
    }

    public static RequestBuilder copy(HttpRequest httpRequest) {
        Args.notNull(httpRequest, "HTTP request");
        return new RequestBuilder().m25020a(httpRequest);
    }

    public static RequestBuilder create(String str) {
        Args.notBlank(str, "HTTP method");
        return new RequestBuilder(str);
    }

    public static RequestBuilder delete() {
        return new RequestBuilder("DELETE");
    }

    public static RequestBuilder get() {
        return new RequestBuilder("GET");
    }

    public static RequestBuilder head() {
        return new RequestBuilder("HEAD");
    }

    public static RequestBuilder options() {
        return new RequestBuilder("OPTIONS");
    }

    public static RequestBuilder patch() {
        return new RequestBuilder("PATCH");
    }

    public static RequestBuilder post() {
        return new RequestBuilder("POST");
    }

    public static RequestBuilder put() {
        return new RequestBuilder("PUT");
    }

    public static RequestBuilder trace() {
        return new RequestBuilder("TRACE");
    }

    /* renamed from: a */
    public final RequestBuilder m25020a(HttpRequest httpRequest) {
        if (httpRequest == null) {
            return this;
        }
        this.f73794a = httpRequest.getRequestLine().getMethod();
        this.f73796c = httpRequest.getRequestLine().getProtocolVersion();
        if (this.f73798e == null) {
            this.f73798e = new HeaderGroup();
        }
        this.f73798e.clear();
        this.f73798e.setHeaders(httpRequest.getAllHeaders());
        this.f73800g = null;
        this.f73799f = null;
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            ContentType contentType = ContentType.get(entity);
            if (contentType != null && contentType.getMimeType().equals(ContentType.APPLICATION_FORM_URLENCODED.getMimeType())) {
                try {
                    this.f73795b = contentType.getCharset();
                    List<NameValuePair> parse = URLEncodedUtils.parse(entity);
                    if (!parse.isEmpty()) {
                        this.f73800g = parse;
                    }
                } catch (IOException unused) {
                }
            } else {
                this.f73799f = entity;
            }
        }
        if (httpRequest instanceof HttpUriRequest) {
            this.f73797d = ((HttpUriRequest) httpRequest).getURI();
        } else {
            this.f73797d = URI.create(httpRequest.getRequestLine().getUri());
        }
        if (httpRequest instanceof Configurable) {
            this.f73801h = ((Configurable) httpRequest).getConfig();
        } else {
            this.f73801h = null;
        }
        return this;
    }

    public RequestBuilder addHeader(Header header) {
        if (this.f73798e == null) {
            this.f73798e = new HeaderGroup();
        }
        this.f73798e.addHeader(header);
        return this;
    }

    public RequestBuilder addParameter(NameValuePair nameValuePair) {
        Args.notNull(nameValuePair, "Name value pair");
        if (this.f73800g == null) {
            this.f73800g = new LinkedList();
        }
        this.f73800g.add(nameValuePair);
        return this;
    }

    public RequestBuilder addParameters(NameValuePair... nameValuePairArr) {
        for (NameValuePair nameValuePair : nameValuePairArr) {
            addParameter(nameValuePair);
        }
        return this;
    }

    public HttpUriRequest build() {
        HttpRequestBase httpRequestBase;
        URI uri = this.f73797d;
        if (uri == null) {
            uri = URI.create(RemoteSettings.FORWARD_SLASH_STRING);
        }
        HttpEntity httpEntity = this.f73799f;
        List list = this.f73800g;
        if (list != null && !list.isEmpty()) {
            if (httpEntity == null && ("POST".equalsIgnoreCase(this.f73794a) || "PUT".equalsIgnoreCase(this.f73794a))) {
                List list2 = this.f73800g;
                Charset charset = this.f73795b;
                if (charset == null) {
                    charset = HTTP.DEF_CONTENT_CHARSET;
                }
                httpEntity = new UrlEncodedFormEntity(list2, charset);
            } else {
                try {
                    uri = new URIBuilder(uri).setCharset(this.f73795b).addParameters(this.f73800g).build();
                } catch (URISyntaxException unused) {
                }
            }
        }
        if (httpEntity == null) {
            httpRequestBase = new C12564b(this.f73794a);
        } else {
            C12563a c12563a = new C12563a(this.f73794a);
            c12563a.setEntity(httpEntity);
            httpRequestBase = c12563a;
        }
        httpRequestBase.setProtocolVersion(this.f73796c);
        httpRequestBase.setURI(uri);
        HeaderGroup headerGroup = this.f73798e;
        if (headerGroup != null) {
            httpRequestBase.setHeaders(headerGroup.getAllHeaders());
        }
        httpRequestBase.setConfig(this.f73801h);
        return httpRequestBase;
    }

    public Charset getCharset() {
        return this.f73795b;
    }

    public RequestConfig getConfig() {
        return this.f73801h;
    }

    public HttpEntity getEntity() {
        return this.f73799f;
    }

    public Header getFirstHeader(String str) {
        HeaderGroup headerGroup = this.f73798e;
        if (headerGroup != null) {
            return headerGroup.getFirstHeader(str);
        }
        return null;
    }

    public Header[] getHeaders(String str) {
        HeaderGroup headerGroup = this.f73798e;
        if (headerGroup != null) {
            return headerGroup.getHeaders(str);
        }
        return null;
    }

    public Header getLastHeader(String str) {
        HeaderGroup headerGroup = this.f73798e;
        if (headerGroup != null) {
            return headerGroup.getLastHeader(str);
        }
        return null;
    }

    public String getMethod() {
        return this.f73794a;
    }

    public List<NameValuePair> getParameters() {
        if (this.f73800g != null) {
            return new ArrayList(this.f73800g);
        }
        return new ArrayList();
    }

    public URI getUri() {
        return this.f73797d;
    }

    public ProtocolVersion getVersion() {
        return this.f73796c;
    }

    public RequestBuilder removeHeader(Header header) {
        if (this.f73798e == null) {
            this.f73798e = new HeaderGroup();
        }
        this.f73798e.removeHeader(header);
        return this;
    }

    public RequestBuilder removeHeaders(String str) {
        HeaderGroup headerGroup;
        if (str != null && (headerGroup = this.f73798e) != null) {
            HeaderIterator it = headerGroup.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.nextHeader().getName())) {
                    it.remove();
                }
            }
        }
        return this;
    }

    public RequestBuilder setCharset(Charset charset) {
        this.f73795b = charset;
        return this;
    }

    public RequestBuilder setConfig(RequestConfig requestConfig) {
        this.f73801h = requestConfig;
        return this;
    }

    public RequestBuilder setEntity(HttpEntity httpEntity) {
        this.f73799f = httpEntity;
        return this;
    }

    public RequestBuilder setHeader(Header header) {
        if (this.f73798e == null) {
            this.f73798e = new HeaderGroup();
        }
        this.f73798e.updateHeader(header);
        return this;
    }

    public RequestBuilder setUri(URI uri) {
        this.f73797d = uri;
        return this;
    }

    public RequestBuilder setVersion(ProtocolVersion protocolVersion) {
        this.f73796c = protocolVersion;
        return this;
    }

    public String toString() {
        return "RequestBuilder [method=" + this.f73794a + ", charset=" + this.f73795b + ", version=" + this.f73796c + ", uri=" + this.f73797d + ", headerGroup=" + this.f73798e + ", entity=" + this.f73799f + ", parameters=" + this.f73800g + ", config=" + this.f73801h + "]";
    }

    public static RequestBuilder delete(URI uri) {
        return new RequestBuilder("DELETE", uri);
    }

    public static RequestBuilder get(URI uri) {
        return new RequestBuilder("GET", uri);
    }

    public static RequestBuilder head(URI uri) {
        return new RequestBuilder("HEAD", uri);
    }

    public static RequestBuilder options(URI uri) {
        return new RequestBuilder("OPTIONS", uri);
    }

    public static RequestBuilder patch(URI uri) {
        return new RequestBuilder("PATCH", uri);
    }

    public static RequestBuilder post(URI uri) {
        return new RequestBuilder("POST", uri);
    }

    public static RequestBuilder put(URI uri) {
        return new RequestBuilder("PUT", uri);
    }

    public static RequestBuilder trace(URI uri) {
        return new RequestBuilder("TRACE", uri);
    }

    public RequestBuilder setUri(String str) {
        this.f73797d = str != null ? URI.create(str) : null;
        return this;
    }

    public static RequestBuilder delete(String str) {
        return new RequestBuilder("DELETE", str);
    }

    public static RequestBuilder get(String str) {
        return new RequestBuilder("GET", str);
    }

    public static RequestBuilder head(String str) {
        return new RequestBuilder("HEAD", str);
    }

    public static RequestBuilder options(String str) {
        return new RequestBuilder("OPTIONS", str);
    }

    public static RequestBuilder patch(String str) {
        return new RequestBuilder("PATCH", str);
    }

    public static RequestBuilder post(String str) {
        return new RequestBuilder("POST", str);
    }

    public static RequestBuilder put(String str) {
        return new RequestBuilder("PUT", str);
    }

    public static RequestBuilder trace(String str) {
        return new RequestBuilder("TRACE", str);
    }

    public RequestBuilder(String str, URI uri) {
        this.f73794a = str;
        this.f73797d = uri;
    }

    public RequestBuilder addHeader(String str, String str2) {
        if (this.f73798e == null) {
            this.f73798e = new HeaderGroup();
        }
        this.f73798e.addHeader(new BasicHeader(str, str2));
        return this;
    }

    public RequestBuilder setHeader(String str, String str2) {
        if (this.f73798e == null) {
            this.f73798e = new HeaderGroup();
        }
        this.f73798e.updateHeader(new BasicHeader(str, str2));
        return this;
    }

    public RequestBuilder addParameter(String str, String str2) {
        return addParameter(new BasicNameValuePair(str, str2));
    }

    public RequestBuilder(String str, String str2) {
        this.f73794a = str;
        this.f73797d = str2 != null ? URI.create(str2) : null;
    }

    public RequestBuilder() {
        this(null);
    }
}