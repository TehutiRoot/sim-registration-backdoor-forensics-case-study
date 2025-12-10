package com.google.api.client.http;

import com.google.api.client.util.Beta;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.opencensus.trace.AttributeValue;
import io.opencensus.trace.Span;
import io.opencensus.trace.Tracer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
public final class HttpRequest {
    public static final int DEFAULT_NUMBER_OF_RETRIES = 10;
    public static final String USER_AGENT_SUFFIX;
    public static final String VERSION;

    /* renamed from: a */
    public HttpExecuteInterceptor f52093a;

    /* renamed from: h */
    public HttpContent f52100h;

    /* renamed from: i */
    public final HttpTransport f52101i;

    /* renamed from: j */
    public String f52102j;

    /* renamed from: k */
    public GenericUrl f52103k;

    /* renamed from: o */
    public HttpUnsuccessfulResponseHandler f52107o;

    /* renamed from: p */
    public HttpIOExceptionHandler f52108p;

    /* renamed from: q */
    public HttpResponseInterceptor f52109q;

    /* renamed from: r */
    public ObjectParser f52110r;

    /* renamed from: s */
    public HttpEncoding f52111s;

    /* renamed from: t */
    public BackOffPolicy f52112t;

    /* renamed from: y */
    public boolean f52117y;

    /* renamed from: b */
    public HttpHeaders f52094b = new HttpHeaders();

    /* renamed from: c */
    public HttpHeaders f52095c = new HttpHeaders();

    /* renamed from: d */
    public int f52096d = 10;

    /* renamed from: e */
    public int f52097e = 16384;

    /* renamed from: f */
    public boolean f52098f = true;

    /* renamed from: g */
    public boolean f52099g = true;

    /* renamed from: l */
    public int f52104l = 20000;

    /* renamed from: m */
    public int f52105m = 20000;

    /* renamed from: n */
    public int f52106n = 0;

    /* renamed from: u */
    public boolean f52113u = true;

    /* renamed from: v */
    public boolean f52114v = false;

    /* renamed from: w */
    public boolean f52115w = true;

    /* renamed from: x */
    public boolean f52116x = false;

    /* renamed from: z */
    public Sleeper f52118z = Sleeper.DEFAULT;

    /* renamed from: A */
    public final Tracer f52091A = OpenCensusUtils.getTracer();

    /* renamed from: B */
    public boolean f52092B = false;

    /* renamed from: com.google.api.client.http.HttpRequest$a */
    /* loaded from: classes4.dex */
    public class CallableC7297a implements Callable {
        public CallableC7297a() {
            HttpRequest.this = r1;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public HttpResponse call() {
            return HttpRequest.this.execute();
        }
    }

    static {
        String m41753b = m41753b();
        VERSION = m41753b;
        USER_AGENT_SUFFIX = "Google-HTTP-Java-Client/" + m41753b + " (gzip)";
    }

    public HttpRequest(HttpTransport httpTransport, String str) {
        this.f52101i = httpTransport;
        setRequestMethod(str);
    }

    /* renamed from: a */
    public static void m41754a(Span span, String str, String str2) {
        if (str2 != null) {
            span.putAttribute(str, AttributeValue.stringAttributeValue(str2));
        }
    }

    /* renamed from: b */
    public static String m41753b() {
        String str = "unknown-version";
        try {
            InputStream resourceAsStream = HttpRequest.class.getResourceAsStream("/com/google/api/client/http/google-http-client.properties");
            if (resourceAsStream != null) {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                str = properties.getProperty("google-http-client.version");
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(9:(2:20|(25:22|(1:24)|25|(2:27|(1:29)(1:30))|31|(1:33)|34|(1:175)(1:38)|39|(8:41|(1:43)|44|(1:46)(1:173)|47|(5:49|(2:51|(1:53))(1:171)|(2:55|(1:57))|58|(1:60))(1:172)|(1:62)|63)(1:174)|(2:65|(3:67|(1:69)|70))|(1:170)(1:73)|74|75|76|77|(1:79)|80|81|82|(3:113|114|(7:116|(1:118)(1:138)|(3:120|(1:(3:128|129|(2:131|132)))|122)|135|(1:137)|87|(4:90|(1:92)|93|(4:95|(1:97)|98|(1:110)(3:102|103|104))(1:111))(1:89)))|(1:85)(1:112)|86|87|(0)(0)))(1:177)|80|81|82|(0)|(0)(0)|86|87|(0)(0))|76|77|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x027d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0298, code lost:
        if (r1.f52116x != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x02a4, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x02af, code lost:
        if (r9 != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x02b1, code lost:
        r8.log(java.util.logging.Level.WARNING, "exception thrown while executing request", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x02b8, code lost:
        r4.close();
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0264 A[Catch: all -> 0x027a, IOException -> 0x027d, TRY_LEAVE, TryCatch #4 {IOException -> 0x027d, blocks: (B:276:0x025e, B:278:0x0264, B:287:0x028c, B:289:0x0292, B:290:0x0295), top: B:366:0x025e, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0359 A[LOOP:0: B:198:0x0035->B:359:0x0359, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x02be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x031b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.api.client.http.HttpEncodingStreamingContent] */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.google.api.client.util.LoggingStreamingContent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.api.client.http.HttpResponse execute() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.http.HttpRequest.execute():com.google.api.client.http.HttpResponse");
    }

    @Beta
    public Future<HttpResponse> executeAsync(Executor executor) {
        FutureTask futureTask = new FutureTask(new CallableC7297a());
        executor.execute(futureTask);
        return futureTask;
    }

    @Beta
    @Deprecated
    public BackOffPolicy getBackOffPolicy() {
        return this.f52112t;
    }

    public int getConnectTimeout() {
        return this.f52104l;
    }

    public HttpContent getContent() {
        return this.f52100h;
    }

    public int getContentLoggingLimit() {
        return this.f52097e;
    }

    public HttpEncoding getEncoding() {
        return this.f52111s;
    }

    public boolean getFollowRedirects() {
        return this.f52113u;
    }

    public HttpHeaders getHeaders() {
        return this.f52094b;
    }

    @Beta
    public HttpIOExceptionHandler getIOExceptionHandler() {
        return this.f52108p;
    }

    public HttpExecuteInterceptor getInterceptor() {
        return this.f52093a;
    }

    public int getNumberOfRetries() {
        return this.f52096d;
    }

    public final ObjectParser getParser() {
        return this.f52110r;
    }

    public int getReadTimeout() {
        return this.f52105m;
    }

    public String getRequestMethod() {
        return this.f52102j;
    }

    public HttpHeaders getResponseHeaders() {
        return this.f52095c;
    }

    public HttpResponseInterceptor getResponseInterceptor() {
        return this.f52109q;
    }

    public boolean getResponseReturnRawInputStream() {
        return this.f52092B;
    }

    @Beta
    @Deprecated
    public boolean getRetryOnExecuteIOException() {
        return this.f52116x;
    }

    public Sleeper getSleeper() {
        return this.f52118z;
    }

    public boolean getSuppressUserAgentSuffix() {
        return this.f52117y;
    }

    public boolean getThrowExceptionOnExecuteError() {
        return this.f52115w;
    }

    public HttpTransport getTransport() {
        return this.f52101i;
    }

    public HttpUnsuccessfulResponseHandler getUnsuccessfulResponseHandler() {
        return this.f52107o;
    }

    public GenericUrl getUrl() {
        return this.f52103k;
    }

    public boolean getUseRawRedirectUrls() {
        return this.f52114v;
    }

    public int getWriteTimeout() {
        return this.f52106n;
    }

    public boolean handleRedirect(int i, HttpHeaders httpHeaders) {
        String location = httpHeaders.getLocation();
        if (getFollowRedirects() && HttpStatusCodes.isRedirect(i) && location != null) {
            setUrl(new GenericUrl(this.f52103k.toURL(location), this.f52114v));
            if (i == 303) {
                setRequestMethod("GET");
                setContent(null);
            }
            this.f52094b.setAuthorization((String) null);
            this.f52094b.setIfMatch(null);
            this.f52094b.setIfNoneMatch(null);
            this.f52094b.setIfModifiedSince(null);
            this.f52094b.setIfUnmodifiedSince(null);
            this.f52094b.setIfRange(null);
            return true;
        }
        return false;
    }

    public boolean isCurlLoggingEnabled() {
        return this.f52099g;
    }

    public boolean isLoggingEnabled() {
        return this.f52098f;
    }

    @Beta
    @Deprecated
    public HttpRequest setBackOffPolicy(BackOffPolicy backOffPolicy) {
        this.f52112t = backOffPolicy;
        return this;
    }

    public HttpRequest setConnectTimeout(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f52104l = i;
        return this;
    }

    public HttpRequest setContent(HttpContent httpContent) {
        this.f52100h = httpContent;
        return this;
    }

    public HttpRequest setContentLoggingLimit(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The content logging limit must be non-negative.");
        this.f52097e = i;
        return this;
    }

    public HttpRequest setCurlLoggingEnabled(boolean z) {
        this.f52099g = z;
        return this;
    }

    public HttpRequest setEncoding(HttpEncoding httpEncoding) {
        this.f52111s = httpEncoding;
        return this;
    }

    public HttpRequest setFollowRedirects(boolean z) {
        this.f52113u = z;
        return this;
    }

    public HttpRequest setHeaders(HttpHeaders httpHeaders) {
        this.f52094b = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    @Beta
    public HttpRequest setIOExceptionHandler(HttpIOExceptionHandler httpIOExceptionHandler) {
        this.f52108p = httpIOExceptionHandler;
        return this;
    }

    public HttpRequest setInterceptor(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.f52093a = httpExecuteInterceptor;
        return this;
    }

    public HttpRequest setLoggingEnabled(boolean z) {
        this.f52098f = z;
        return this;
    }

    public HttpRequest setNumberOfRetries(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f52096d = i;
        return this;
    }

    public HttpRequest setParser(ObjectParser objectParser) {
        this.f52110r = objectParser;
        return this;
    }

    public HttpRequest setReadTimeout(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f52105m = i;
        return this;
    }

    public HttpRequest setRequestMethod(String str) {
        boolean z;
        if (str != null && !HttpMediaType.m41756b(str)) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z);
        this.f52102j = str;
        return this;
    }

    public HttpRequest setResponseHeaders(HttpHeaders httpHeaders) {
        this.f52095c = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpRequest setResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        this.f52109q = httpResponseInterceptor;
        return this;
    }

    public HttpRequest setResponseReturnRawInputStream(boolean z) {
        this.f52092B = z;
        return this;
    }

    @Beta
    @Deprecated
    public HttpRequest setRetryOnExecuteIOException(boolean z) {
        this.f52116x = z;
        return this;
    }

    public HttpRequest setSleeper(Sleeper sleeper) {
        this.f52118z = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }

    public HttpRequest setSuppressUserAgentSuffix(boolean z) {
        this.f52117y = z;
        return this;
    }

    public HttpRequest setThrowExceptionOnExecuteError(boolean z) {
        this.f52115w = z;
        return this;
    }

    public HttpRequest setUnsuccessfulResponseHandler(HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler) {
        this.f52107o = httpUnsuccessfulResponseHandler;
        return this;
    }

    public HttpRequest setUrl(GenericUrl genericUrl) {
        this.f52103k = (GenericUrl) Preconditions.checkNotNull(genericUrl);
        return this;
    }

    public HttpRequest setUseRawRedirectUrls(boolean z) {
        this.f52114v = z;
        return this;
    }

    public HttpRequest setWriteTimeout(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f52106n = i;
        return this;
    }

    @Beta
    public Future<HttpResponse> executeAsync() {
        return executeAsync(Executors.newFixedThreadPool(1, new ThreadFactoryBuilder().setDaemon(true).build()));
    }
}
