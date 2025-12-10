package com.google.api.client.googleapis.services;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.googleapis.batch.BatchCallback;
import com.google.api.client.googleapis.batch.BatchRequest;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GZipEncoding;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseInterceptor;
import com.google.api.client.http.UriTemplate;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.common.base.Joiner;
import com.google.common.base.StandardSystemProperty;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public abstract class AbstractGoogleClientRequest<T> extends GenericData {
    protected static final String API_VERSION_HEADER = "X-Goog-Api-Version";
    public static final String USER_AGENT_SUFFIX = "Google-API-Java-Client";

    /* renamed from: c */
    public final AbstractGoogleClient f51973c;

    /* renamed from: d */
    public final String f51974d;

    /* renamed from: e */
    public final String f51975e;

    /* renamed from: f */
    public final HttpContent f51976f;

    /* renamed from: h */
    public HttpHeaders f51978h;

    /* renamed from: j */
    public String f51980j;

    /* renamed from: k */
    public boolean f51981k;

    /* renamed from: l */
    public boolean f51982l;

    /* renamed from: m */
    public Class f51983m;

    /* renamed from: n */
    public MediaHttpUploader f51984n;

    /* renamed from: o */
    public MediaHttpDownloader f51985o;

    /* renamed from: g */
    public HttpHeaders f51977g = new HttpHeaders();

    /* renamed from: i */
    public int f51979i = -1;

    /* renamed from: com.google.api.client.googleapis.services.AbstractGoogleClientRequest$a */
    /* loaded from: classes4.dex */
    public static class C7281a implements HttpRequestInitializer {

        /* renamed from: a */
        public final /* synthetic */ String f51986a;

        public C7281a(String str) {
            this.f51986a = str;
        }

        @Override // com.google.api.client.http.HttpRequestInitializer
        public void initialize(HttpRequest httpRequest) {
            httpRequest.getHeaders().setUserAgent(this.f51986a);
        }
    }

    /* renamed from: com.google.api.client.googleapis.services.AbstractGoogleClientRequest$b */
    /* loaded from: classes4.dex */
    public static class C7282b implements HttpRequestInitializer {

        /* renamed from: a */
        public final /* synthetic */ HttpRequestInitializer f51987a;

        /* renamed from: b */
        public final /* synthetic */ String f51988b;

        public C7282b(HttpRequestInitializer httpRequestInitializer, String str) {
            this.f51987a = httpRequestInitializer;
            this.f51988b = str;
        }

        @Override // com.google.api.client.http.HttpRequestInitializer
        public void initialize(HttpRequest httpRequest) {
            this.f51987a.initialize(httpRequest);
            httpRequest.getHeaders().setUserAgent(this.f51988b);
        }
    }

    /* renamed from: com.google.api.client.googleapis.services.AbstractGoogleClientRequest$c */
    /* loaded from: classes4.dex */
    public class C7283c implements HttpResponseInterceptor {

        /* renamed from: a */
        public final /* synthetic */ HttpResponseInterceptor f51989a;

        /* renamed from: b */
        public final /* synthetic */ HttpRequest f51990b;

        public C7283c(HttpResponseInterceptor httpResponseInterceptor, HttpRequest httpRequest) {
            this.f51989a = httpResponseInterceptor;
            this.f51990b = httpRequest;
        }

        @Override // com.google.api.client.http.HttpResponseInterceptor
        public void interceptResponse(HttpResponse httpResponse) {
            HttpResponseInterceptor httpResponseInterceptor = this.f51989a;
            if (httpResponseInterceptor != null) {
                httpResponseInterceptor.interceptResponse(httpResponse);
            }
            if (!httpResponse.isSuccessStatusCode() && this.f51990b.getThrowExceptionOnExecuteError()) {
                throw AbstractGoogleClientRequest.this.newExceptionOnError(httpResponse);
            }
        }
    }

    /* renamed from: com.google.api.client.googleapis.services.AbstractGoogleClientRequest$d */
    /* loaded from: classes4.dex */
    public static class C7284d {

        /* renamed from: b */
        public static final String f51992b = new C7284d().toString();

        /* renamed from: a */
        public final String f51993a;

        public C7284d() {
            this(m41773d(), StandardSystemProperty.OS_NAME.value(), StandardSystemProperty.OS_VERSION.value(), GoogleUtils.VERSION);
        }

        /* renamed from: a */
        public static String m41776a(String str) {
            return str.toLowerCase().replaceAll("[^\\w\\d\\-]", HelpFormatter.DEFAULT_OPT_PREFIX);
        }

        /* renamed from: b */
        public static String m41775b(String str) {
            return m41774c(str, str);
        }

        /* renamed from: c */
        public static String m41774c(String str, String str2) {
            if (str == null) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+\\.\\d+\\.\\d+).*").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return str2;
        }

        /* renamed from: d */
        public static String m41773d() {
            String property = System.getProperty("java.version");
            if (property == null) {
                return null;
            }
            String m41774c = m41774c(property, null);
            if (m41774c != null) {
                return m41774c;
            }
            Matcher matcher = Pattern.compile("^(\\d+)[^\\d]?").matcher(property);
            if (!matcher.find()) {
                return null;
            }
            return matcher.group(1) + ".0.0";
        }

        public String toString() {
            String property = System.getProperty("org.graalvm.nativeimage.imagecode");
            if (property != null && property.equals("runtime")) {
                String[] split = this.f51993a.split(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                if (split.length > 0 && split[0].startsWith("gl-java")) {
                    split[0] = split[0] + "-graalvm";
                    return Joiner.m41322on(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).join(split);
                }
            }
            return this.f51993a;
        }

        public C7284d(String str, String str2, String str3, String str4) {
            StringBuilder sb = new StringBuilder("gl-java/");
            sb.append(m41775b(str));
            sb.append(" gdcl/");
            sb.append(m41775b(str4));
            if (str2 != null && str3 != null) {
                sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                sb.append(m41776a(str2));
                sb.append(RemoteSettings.FORWARD_SLASH_STRING);
                sb.append(m41775b(str3));
            }
            this.f51993a = sb.toString();
        }
    }

    public AbstractGoogleClientRequest(AbstractGoogleClient abstractGoogleClient, String str, String str2, HttpContent httpContent, Class<T> cls) {
        this.f51983m = (Class) Preconditions.checkNotNull(cls);
        this.f51973c = (AbstractGoogleClient) Preconditions.checkNotNull(abstractGoogleClient);
        this.f51974d = (String) Preconditions.checkNotNull(str);
        this.f51975e = (String) Preconditions.checkNotNull(str2);
        this.f51976f = httpContent;
        String applicationName = abstractGoogleClient.getApplicationName();
        if (applicationName != null) {
            HttpHeaders httpHeaders = this.f51977g;
            httpHeaders.setUserAgent(applicationName + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + USER_AGENT_SUFFIX + RemoteSettings.FORWARD_SLASH_STRING + GoogleUtils.VERSION);
        } else {
            HttpHeaders httpHeaders2 = this.f51977g;
            httpHeaders2.setUserAgent("Google-API-Java-Client/" + GoogleUtils.VERSION);
        }
        this.f51977g.set("X-Goog-Api-Client", (Object) C7284d.f51992b);
    }

    /* renamed from: c */
    public static HttpRequestInitializer m41777c(String str, HttpRequestInitializer httpRequestInitializer) {
        if (str == null) {
            return httpRequestInitializer;
        }
        if (httpRequestInitializer == null) {
            return new C7281a(str);
        }
        return new C7282b(httpRequestInitializer, str);
    }

    /* renamed from: a */
    public final HttpRequest m41779a(boolean z) {
        boolean z2;
        String str;
        boolean z3 = false;
        if (this.f51984n == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Preconditions.checkArgument((!z || this.f51974d.equals("GET")) ? true : true);
        if (z) {
            str = "HEAD";
        } else {
            str = this.f51974d;
        }
        HttpRequest buildRequest = getAbstractGoogleClient().getRequestFactory().buildRequest(str, buildHttpRequestUrl(), this.f51976f);
        new MethodOverride().intercept(buildRequest);
        buildRequest.setParser(getAbstractGoogleClient().getObjectParser());
        if (this.f51976f == null && (this.f51974d.equals("POST") || this.f51974d.equals("PUT") || this.f51974d.equals("PATCH"))) {
            buildRequest.setContent(new EmptyContent());
        }
        buildRequest.getHeaders().putAll(this.f51977g);
        if (!this.f51981k) {
            buildRequest.setEncoding(new GZipEncoding());
        }
        buildRequest.setResponseReturnRawInputStream(this.f51982l);
        buildRequest.setResponseInterceptor(new C7283c(buildRequest.getResponseInterceptor(), buildRequest));
        return buildRequest;
    }

    /* renamed from: b */
    public final HttpResponse m41778b(boolean z) {
        HttpResponse upload;
        if (this.f51984n == null) {
            upload = m41779a(z).execute();
        } else {
            GenericUrl buildHttpRequestUrl = buildHttpRequestUrl();
            boolean throwExceptionOnExecuteError = getAbstractGoogleClient().getRequestFactory().buildRequest(this.f51974d, buildHttpRequestUrl, this.f51976f).getThrowExceptionOnExecuteError();
            upload = this.f51984n.setInitiationHeaders(this.f51977g).setDisableGZipContent(this.f51981k).upload(buildHttpRequestUrl);
            upload.getRequest().setParser(getAbstractGoogleClient().getObjectParser());
            if (throwExceptionOnExecuteError && !upload.isSuccessStatusCode()) {
                throw newExceptionOnError(upload);
            }
        }
        this.f51978h = upload.getHeaders();
        this.f51979i = upload.getStatusCode();
        this.f51980j = upload.getStatusMessage();
        return upload;
    }

    public HttpRequest buildHttpRequest() throws IOException {
        return m41779a(false);
    }

    public GenericUrl buildHttpRequestUrl() {
        return new GenericUrl(UriTemplate.expand(this.f51973c.getBaseUrl(), this.f51975e, this, true));
    }

    public HttpRequest buildHttpRequestUsingHead() throws IOException {
        return m41779a(true);
    }

    public final void checkRequiredParameter(Object obj, String str) {
        boolean z;
        if (!this.f51973c.getSuppressRequiredParameterChecks() && obj == null) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "Required parameter %s must be specified", str);
    }

    public T execute() throws IOException {
        return (T) executeUnparsed().parseAs((Class<Object>) this.f51983m);
    }

    public void executeAndDownloadTo(OutputStream outputStream) throws IOException {
        executeUnparsed().download(outputStream);
    }

    public InputStream executeAsInputStream() throws IOException {
        return executeUnparsed().getContent();
    }

    public HttpResponse executeMedia() throws IOException {
        set("alt", (Object) "media");
        return executeUnparsed();
    }

    public void executeMediaAndDownloadTo(OutputStream outputStream) throws IOException {
        MediaHttpDownloader mediaHttpDownloader = this.f51985o;
        if (mediaHttpDownloader == null) {
            executeMedia().download(outputStream);
        } else {
            mediaHttpDownloader.download(buildHttpRequestUrl(), this.f51977g, outputStream);
        }
    }

    public InputStream executeMediaAsInputStream() throws IOException {
        return executeMedia().getContent();
    }

    public HttpResponse executeUnparsed() throws IOException {
        return m41778b(false);
    }

    public HttpResponse executeUsingHead() throws IOException {
        boolean z;
        if (this.f51984n == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        HttpResponse m41778b = m41778b(true);
        m41778b.ignore();
        return m41778b;
    }

    public AbstractGoogleClient getAbstractGoogleClient() {
        return this.f51973c;
    }

    public final boolean getDisableGZipContent() {
        return this.f51981k;
    }

    public final HttpContent getHttpContent() {
        return this.f51976f;
    }

    public final HttpHeaders getLastResponseHeaders() {
        return this.f51978h;
    }

    public final int getLastStatusCode() {
        return this.f51979i;
    }

    public final String getLastStatusMessage() {
        return this.f51980j;
    }

    public final MediaHttpDownloader getMediaHttpDownloader() {
        return this.f51985o;
    }

    public final MediaHttpUploader getMediaHttpUploader() {
        return this.f51984n;
    }

    public final HttpHeaders getRequestHeaders() {
        return this.f51977g;
    }

    public final String getRequestMethod() {
        return this.f51974d;
    }

    public final Class<T> getResponseClass() {
        return this.f51983m;
    }

    public final boolean getReturnRawInputSteam() {
        return this.f51982l;
    }

    public final String getUriTemplate() {
        return this.f51975e;
    }

    public final void initializeMediaDownload() {
        HttpRequestFactory requestFactory = this.f51973c.getRequestFactory();
        this.f51985o = new MediaHttpDownloader(requestFactory.getTransport(), requestFactory.getInitializer());
    }

    public final void initializeMediaUpload(AbstractInputStreamContent abstractInputStreamContent) {
        HttpRequestFactory requestFactory = this.f51973c.getRequestFactory();
        MediaHttpUploader mediaHttpUploader = new MediaHttpUploader(abstractInputStreamContent, requestFactory.getTransport(), m41777c(this.f51973c.getApplicationName(), requestFactory.getInitializer()));
        this.f51984n = mediaHttpUploader;
        mediaHttpUploader.setInitiationRequestMethod(this.f51974d);
        HttpContent httpContent = this.f51976f;
        if (httpContent != null) {
            this.f51984n.setMetadata(httpContent);
        }
    }

    public IOException newExceptionOnError(HttpResponse httpResponse) {
        return new HttpResponseException(httpResponse);
    }

    public final <E> void queue(BatchRequest batchRequest, Class<E> cls, BatchCallback<T, E> batchCallback) throws IOException {
        boolean z;
        if (this.f51984n == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Batching media requests is not supported");
        batchRequest.queue(buildHttpRequest(), getResponseClass(), cls, batchCallback);
    }

    public AbstractGoogleClientRequest<T> setDisableGZipContent(boolean z) {
        this.f51981k = z;
        return this;
    }

    public AbstractGoogleClientRequest<T> setRequestHeaders(HttpHeaders httpHeaders) {
        this.f51977g = httpHeaders;
        return this;
    }

    public AbstractGoogleClientRequest<T> setReturnRawInputStream(boolean z) {
        this.f51982l = z;
        return this;
    }

    @Override // com.google.api.client.util.GenericData
    public AbstractGoogleClientRequest<T> set(String str, Object obj) {
        return (AbstractGoogleClientRequest) super.set(str, obj);
    }
}
