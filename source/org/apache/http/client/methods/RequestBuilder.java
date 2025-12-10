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
    public String f73710a;

    /* renamed from: b */
    public Charset f73711b;

    /* renamed from: c */
    public ProtocolVersion f73712c;

    /* renamed from: d */
    public URI f73713d;

    /* renamed from: e */
    public HeaderGroup f73714e;

    /* renamed from: f */
    public HttpEntity f73715f;

    /* renamed from: g */
    public List f73716g;

    /* renamed from: h */
    public RequestConfig f73717h;

    /* renamed from: org.apache.http.client.methods.RequestBuilder$a */
    /* loaded from: classes6.dex */
    public static class C12563a extends HttpEntityEnclosingRequestBase {

        /* renamed from: f */
        public final String f73718f;

        public C12563a(String str) {
            this.f73718f = str;
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return this.f73718f;
        }
    }

    /* renamed from: org.apache.http.client.methods.RequestBuilder$b */
    /* loaded from: classes6.dex */
    public static class C12564b extends HttpRequestBase {

        /* renamed from: e */
        public final String f73719e;

        public C12564b(String str) {
            this.f73719e = str;
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return this.f73719e;
        }
    }

    public RequestBuilder(String str) {
        this.f73711b = Consts.UTF_8;
        this.f73710a = str;
    }

    public static RequestBuilder copy(HttpRequest httpRequest) {
        Args.notNull(httpRequest, "HTTP request");
        return new RequestBuilder().m24830a(httpRequest);
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
    public final RequestBuilder m24830a(HttpRequest httpRequest) {
        if (httpRequest == null) {
            return this;
        }
        this.f73710a = httpRequest.getRequestLine().getMethod();
        this.f73712c = httpRequest.getRequestLine().getProtocolVersion();
        if (this.f73714e == null) {
            this.f73714e = new HeaderGroup();
        }
        this.f73714e.clear();
        this.f73714e.setHeaders(httpRequest.getAllHeaders());
        this.f73716g = null;
        this.f73715f = null;
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            ContentType contentType = ContentType.get(entity);
            if (contentType != null && contentType.getMimeType().equals(ContentType.APPLICATION_FORM_URLENCODED.getMimeType())) {
                try {
                    this.f73711b = contentType.getCharset();
                    List<NameValuePair> parse = URLEncodedUtils.parse(entity);
                    if (!parse.isEmpty()) {
                        this.f73716g = parse;
                    }
                } catch (IOException unused) {
                }
            } else {
                this.f73715f = entity;
            }
        }
        if (httpRequest instanceof HttpUriRequest) {
            this.f73713d = ((HttpUriRequest) httpRequest).getURI();
        } else {
            this.f73713d = URI.create(httpRequest.getRequestLine().getUri());
        }
        if (httpRequest instanceof Configurable) {
            this.f73717h = ((Configurable) httpRequest).getConfig();
        } else {
            this.f73717h = null;
        }
        return this;
    }

    public RequestBuilder addHeader(Header header) {
        if (this.f73714e == null) {
            this.f73714e = new HeaderGroup();
        }
        this.f73714e.addHeader(header);
        return this;
    }

    public RequestBuilder addParameter(NameValuePair nameValuePair) {
        Args.notNull(nameValuePair, "Name value pair");
        if (this.f73716g == null) {
            this.f73716g = new LinkedList();
        }
        this.f73716g.add(nameValuePair);
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
        URI uri = this.f73713d;
        if (uri == null) {
            uri = URI.create(RemoteSettings.FORWARD_SLASH_STRING);
        }
        HttpEntity httpEntity = this.f73715f;
        List list = this.f73716g;
        if (list != null && !list.isEmpty()) {
            if (httpEntity == null && ("POST".equalsIgnoreCase(this.f73710a) || "PUT".equalsIgnoreCase(this.f73710a))) {
                List list2 = this.f73716g;
                Charset charset = this.f73711b;
                if (charset == null) {
                    charset = HTTP.DEF_CONTENT_CHARSET;
                }
                httpEntity = new UrlEncodedFormEntity(list2, charset);
            } else {
                try {
                    uri = new URIBuilder(uri).setCharset(this.f73711b).addParameters(this.f73716g).build();
                } catch (URISyntaxException unused) {
                }
            }
        }
        if (httpEntity == null) {
            httpRequestBase = new C12564b(this.f73710a);
        } else {
            C12563a c12563a = new C12563a(this.f73710a);
            c12563a.setEntity(httpEntity);
            httpRequestBase = c12563a;
        }
        httpRequestBase.setProtocolVersion(this.f73712c);
        httpRequestBase.setURI(uri);
        HeaderGroup headerGroup = this.f73714e;
        if (headerGroup != null) {
            httpRequestBase.setHeaders(headerGroup.getAllHeaders());
        }
        httpRequestBase.setConfig(this.f73717h);
        return httpRequestBase;
    }

    public Charset getCharset() {
        return this.f73711b;
    }

    public RequestConfig getConfig() {
        return this.f73717h;
    }

    public HttpEntity getEntity() {
        return this.f73715f;
    }

    public Header getFirstHeader(String str) {
        HeaderGroup headerGroup = this.f73714e;
        if (headerGroup != null) {
            return headerGroup.getFirstHeader(str);
        }
        return null;
    }

    public Header[] getHeaders(String str) {
        HeaderGroup headerGroup = this.f73714e;
        if (headerGroup != null) {
            return headerGroup.getHeaders(str);
        }
        return null;
    }

    public Header getLastHeader(String str) {
        HeaderGroup headerGroup = this.f73714e;
        if (headerGroup != null) {
            return headerGroup.getLastHeader(str);
        }
        return null;
    }

    public String getMethod() {
        return this.f73710a;
    }

    public List<NameValuePair> getParameters() {
        if (this.f73716g != null) {
            return new ArrayList(this.f73716g);
        }
        return new ArrayList();
    }

    public URI getUri() {
        return this.f73713d;
    }

    public ProtocolVersion getVersion() {
        return this.f73712c;
    }

    public RequestBuilder removeHeader(Header header) {
        if (this.f73714e == null) {
            this.f73714e = new HeaderGroup();
        }
        this.f73714e.removeHeader(header);
        return this;
    }

    public RequestBuilder removeHeaders(String str) {
        HeaderGroup headerGroup;
        if (str != null && (headerGroup = this.f73714e) != null) {
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
        this.f73711b = charset;
        return this;
    }

    public RequestBuilder setConfig(RequestConfig requestConfig) {
        this.f73717h = requestConfig;
        return this;
    }

    public RequestBuilder setEntity(HttpEntity httpEntity) {
        this.f73715f = httpEntity;
        return this;
    }

    public RequestBuilder setHeader(Header header) {
        if (this.f73714e == null) {
            this.f73714e = new HeaderGroup();
        }
        this.f73714e.updateHeader(header);
        return this;
    }

    public RequestBuilder setUri(URI uri) {
        this.f73713d = uri;
        return this;
    }

    public RequestBuilder setVersion(ProtocolVersion protocolVersion) {
        this.f73712c = protocolVersion;
        return this;
    }

    public String toString() {
        return "RequestBuilder [method=" + this.f73710a + ", charset=" + this.f73711b + ", version=" + this.f73712c + ", uri=" + this.f73713d + ", headerGroup=" + this.f73714e + ", entity=" + this.f73715f + ", parameters=" + this.f73716g + ", config=" + this.f73717h + "]";
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
        this.f73713d = str != null ? URI.create(str) : null;
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
        this.f73710a = str;
        this.f73713d = uri;
    }

    public RequestBuilder addHeader(String str, String str2) {
        if (this.f73714e == null) {
            this.f73714e = new HeaderGroup();
        }
        this.f73714e.addHeader(new BasicHeader(str, str2));
        return this;
    }

    public RequestBuilder setHeader(String str, String str2) {
        if (this.f73714e == null) {
            this.f73714e = new HeaderGroup();
        }
        this.f73714e.updateHeader(new BasicHeader(str, str2));
        return this;
    }

    public RequestBuilder addParameter(String str, String str2) {
        return addParameter(new BasicNameValuePair(str, str2));
    }

    public RequestBuilder(String str, String str2) {
        this.f73710a = str;
        this.f73713d = str2 != null ? URI.create(str2) : null;
    }

    public RequestBuilder() {
        this(null);
    }
}
