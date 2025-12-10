package org.apache.http.impl.client;

import com.zxy.tiny.common.UriUtil;
import java.io.Closeable;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.BackoffManager;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.InputStreamFactory;
import org.apache.http.client.protocol.RequestAcceptEncoding;
import org.apache.http.client.protocol.RequestAddCookies;
import org.apache.http.client.protocol.RequestAuthCache;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.protocol.RequestDefaultHeaders;
import org.apache.http.client.protocol.RequestExpectContinue;
import org.apache.http.client.protocol.ResponseContentEncoding;
import org.apache.http.client.protocol.ResponseProcessCookies;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Lookup;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.conn.util.PublicSuffixMatcherLoader;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.impl.conn.DefaultRoutePlanner;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.apache.http.impl.execchain.BackoffStrategyExec;
import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.http.impl.execchain.MainClientExec;
import org.apache.http.impl.execchain.ProtocolExec;
import org.apache.http.impl.execchain.RedirectExec;
import org.apache.http.impl.execchain.RetryExec;
import org.apache.http.impl.execchain.ServiceUnavailableRetryExec;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpProcessorBuilder;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.TextUtils;
import org.apache.http.util.VersionInfo;

/* loaded from: classes6.dex */
public class HttpClientBuilder {

    /* renamed from: A */
    public Map f74096A;

    /* renamed from: B */
    public CookieStore f74097B;

    /* renamed from: C */
    public CredentialsProvider f74098C;

    /* renamed from: D */
    public String f74099D;

    /* renamed from: E */
    public HttpHost f74100E;

    /* renamed from: F */
    public Collection f74101F;

    /* renamed from: G */
    public SocketConfig f74102G;

    /* renamed from: H */
    public ConnectionConfig f74103H;

    /* renamed from: I */
    public RequestConfig f74104I;

    /* renamed from: J */
    public boolean f74105J;

    /* renamed from: K */
    public boolean f74106K;

    /* renamed from: L */
    public long f74107L;

    /* renamed from: M */
    public TimeUnit f74108M;

    /* renamed from: N */
    public boolean f74109N;

    /* renamed from: O */
    public boolean f74110O;

    /* renamed from: P */
    public boolean f74111P;

    /* renamed from: Q */
    public boolean f74112Q;

    /* renamed from: R */
    public boolean f74113R;

    /* renamed from: S */
    public boolean f74114S;

    /* renamed from: T */
    public boolean f74115T;

    /* renamed from: U */
    public boolean f74116U;

    /* renamed from: V */
    public int f74117V = 0;

    /* renamed from: W */
    public int f74118W = 0;

    /* renamed from: X */
    public long f74119X = -1;

    /* renamed from: Y */
    public TimeUnit f74120Y = TimeUnit.MILLISECONDS;

    /* renamed from: Z */
    public List f74121Z;

    /* renamed from: a */
    public HttpRequestExecutor f74122a;

    /* renamed from: a0 */
    public PublicSuffixMatcher f74123a0;

    /* renamed from: b */
    public HostnameVerifier f74124b;

    /* renamed from: c */
    public LayeredConnectionSocketFactory f74125c;

    /* renamed from: d */
    public SSLContext f74126d;

    /* renamed from: e */
    public HttpClientConnectionManager f74127e;

    /* renamed from: f */
    public boolean f74128f;

    /* renamed from: g */
    public SchemePortResolver f74129g;

    /* renamed from: h */
    public ConnectionReuseStrategy f74130h;

    /* renamed from: i */
    public ConnectionKeepAliveStrategy f74131i;

    /* renamed from: j */
    public AuthenticationStrategy f74132j;

    /* renamed from: k */
    public AuthenticationStrategy f74133k;

    /* renamed from: l */
    public UserTokenHandler f74134l;

    /* renamed from: m */
    public HttpProcessor f74135m;

    /* renamed from: n */
    public DnsResolver f74136n;

    /* renamed from: o */
    public LinkedList f74137o;

    /* renamed from: p */
    public LinkedList f74138p;

    /* renamed from: q */
    public LinkedList f74139q;

    /* renamed from: r */
    public LinkedList f74140r;

    /* renamed from: s */
    public HttpRequestRetryHandler f74141s;

    /* renamed from: t */
    public HttpRoutePlanner f74142t;

    /* renamed from: u */
    public RedirectStrategy f74143u;

    /* renamed from: v */
    public ConnectionBackoffStrategy f74144v;

    /* renamed from: w */
    public BackoffManager f74145w;

    /* renamed from: x */
    public ServiceUnavailableRetryStrategy f74146x;

    /* renamed from: y */
    public Lookup f74147y;

    /* renamed from: z */
    public Lookup f74148z;

    /* renamed from: org.apache.http.impl.client.HttpClientBuilder$a */
    /* loaded from: classes6.dex */
    public class C12583a implements Closeable {

        /* renamed from: a */
        public final /* synthetic */ IdleConnectionEvictor f74149a;

        public C12583a(IdleConnectionEvictor idleConnectionEvictor) {
            this.f74149a = idleConnectionEvictor;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f74149a.shutdown();
            try {
                this.f74149a.awaitTermination(1L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: org.apache.http.impl.client.HttpClientBuilder$b */
    /* loaded from: classes6.dex */
    public class C12584b implements Closeable {

        /* renamed from: a */
        public final /* synthetic */ HttpClientConnectionManager f74151a;

        public C12584b(HttpClientConnectionManager httpClientConnectionManager) {
            this.f74151a = httpClientConnectionManager;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f74151a.shutdown();
        }
    }

    /* renamed from: a */
    public static String[] m24662a(String str) {
        if (TextUtils.isBlank(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    public static HttpClientBuilder create() {
        return new HttpClientBuilder();
    }

    public void addCloseable(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        if (this.f74121Z == null) {
            this.f74121Z = new ArrayList();
        }
        this.f74121Z.add(closeable);
    }

    public final HttpClientBuilder addInterceptorFirst(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        if (this.f74139q == null) {
            this.f74139q = new LinkedList();
        }
        this.f74139q.addFirst(httpResponseInterceptor);
        return this;
    }

    public final HttpClientBuilder addInterceptorLast(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        if (this.f74140r == null) {
            this.f74140r = new LinkedList();
        }
        this.f74140r.addLast(httpResponseInterceptor);
        return this;
    }

    public CloseableHttpClient build() {
        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager;
        HttpRoutePlanner httpRoutePlanner;
        ArrayList arrayList;
        HttpClientConnectionManager httpClientConnectionManager;
        long j;
        TimeUnit timeUnit;
        ConnectionBackoffStrategy connectionBackoffStrategy;
        String[] strArr;
        String[] strArr2;
        ConnectionSocketFactory sSLConnectionSocketFactory;
        PublicSuffixMatcher publicSuffixMatcher = this.f74123a0;
        if (publicSuffixMatcher == null) {
            publicSuffixMatcher = PublicSuffixMatcherLoader.getDefault();
        }
        PublicSuffixMatcher publicSuffixMatcher2 = publicSuffixMatcher;
        HttpRequestExecutor httpRequestExecutor = this.f74122a;
        if (httpRequestExecutor == null) {
            httpRequestExecutor = new HttpRequestExecutor();
        }
        HttpRequestExecutor httpRequestExecutor2 = httpRequestExecutor;
        HttpClientConnectionManager httpClientConnectionManager2 = this.f74127e;
        if (httpClientConnectionManager2 == null) {
            ConnectionSocketFactory connectionSocketFactory = this.f74125c;
            if (connectionSocketFactory == null) {
                if (this.f74109N) {
                    strArr = m24662a(System.getProperty("https.protocols"));
                } else {
                    strArr = null;
                }
                if (this.f74109N) {
                    strArr2 = m24662a(System.getProperty("https.cipherSuites"));
                } else {
                    strArr2 = null;
                }
                HostnameVerifier hostnameVerifier = this.f74124b;
                if (hostnameVerifier == null) {
                    hostnameVerifier = new DefaultHostnameVerifier(publicSuffixMatcher2);
                }
                if (this.f74126d != null) {
                    sSLConnectionSocketFactory = new SSLConnectionSocketFactory(this.f74126d, strArr, strArr2, hostnameVerifier);
                } else if (this.f74109N) {
                    sSLConnectionSocketFactory = new SSLConnectionSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault(), strArr, strArr2, hostnameVerifier);
                } else {
                    connectionSocketFactory = new SSLConnectionSocketFactory(SSLContexts.createDefault(), hostnameVerifier);
                }
                connectionSocketFactory = sSLConnectionSocketFactory;
            }
            Registry build = RegistryBuilder.create().register("http", PlainConnectionSocketFactory.getSocketFactory()).register(UriUtil.HTTPS_SCHEME, connectionSocketFactory).build();
            DnsResolver dnsResolver = this.f74136n;
            long j2 = this.f74119X;
            TimeUnit timeUnit2 = this.f74120Y;
            if (timeUnit2 == null) {
                timeUnit2 = TimeUnit.MILLISECONDS;
            }
            PoolingHttpClientConnectionManager poolingHttpClientConnectionManager2 = new PoolingHttpClientConnectionManager(build, null, null, dnsResolver, j2, timeUnit2);
            SocketConfig socketConfig = this.f74102G;
            if (socketConfig != null) {
                poolingHttpClientConnectionManager2.setDefaultSocketConfig(socketConfig);
            }
            ConnectionConfig connectionConfig = this.f74103H;
            if (connectionConfig != null) {
                poolingHttpClientConnectionManager2.setDefaultConnectionConfig(connectionConfig);
            }
            if (this.f74109N && "true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true"))) {
                int parseInt = Integer.parseInt(System.getProperty("http.maxConnections", "5"));
                poolingHttpClientConnectionManager2.setDefaultMaxPerRoute(parseInt);
                poolingHttpClientConnectionManager2.setMaxTotal(parseInt * 2);
            }
            int i = this.f74117V;
            if (i > 0) {
                poolingHttpClientConnectionManager2.setMaxTotal(i);
            }
            int i2 = this.f74118W;
            if (i2 > 0) {
                poolingHttpClientConnectionManager2.setDefaultMaxPerRoute(i2);
            }
            poolingHttpClientConnectionManager = poolingHttpClientConnectionManager2;
        } else {
            poolingHttpClientConnectionManager = httpClientConnectionManager2;
        }
        ConnectionReuseStrategy connectionReuseStrategy = this.f74130h;
        if (connectionReuseStrategy == null) {
            if (this.f74109N) {
                if ("true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true"))) {
                    connectionReuseStrategy = DefaultClientConnectionReuseStrategy.INSTANCE;
                } else {
                    connectionReuseStrategy = NoConnectionReuseStrategy.INSTANCE;
                }
            } else {
                connectionReuseStrategy = DefaultClientConnectionReuseStrategy.INSTANCE;
            }
        }
        ConnectionReuseStrategy connectionReuseStrategy2 = connectionReuseStrategy;
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy = this.f74131i;
        if (connectionKeepAliveStrategy == null) {
            connectionKeepAliveStrategy = DefaultConnectionKeepAliveStrategy.INSTANCE;
        }
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy2 = connectionKeepAliveStrategy;
        AuthenticationStrategy authenticationStrategy = this.f74132j;
        if (authenticationStrategy == null) {
            authenticationStrategy = TargetAuthenticationStrategy.INSTANCE;
        }
        AuthenticationStrategy authenticationStrategy2 = authenticationStrategy;
        AuthenticationStrategy authenticationStrategy3 = this.f74133k;
        if (authenticationStrategy3 == null) {
            authenticationStrategy3 = ProxyAuthenticationStrategy.INSTANCE;
        }
        AuthenticationStrategy authenticationStrategy4 = authenticationStrategy3;
        UserTokenHandler userTokenHandler = this.f74134l;
        if (userTokenHandler == null) {
            if (!this.f74115T) {
                userTokenHandler = DefaultUserTokenHandler.INSTANCE;
            } else {
                userTokenHandler = NoopUserTokenHandler.INSTANCE;
            }
        }
        UserTokenHandler userTokenHandler2 = userTokenHandler;
        String str = this.f74099D;
        if (str == null) {
            if (this.f74109N) {
                str = System.getProperty("http.agent");
            }
            if (str == null && !this.f74116U) {
                str = VersionInfo.getUserAgent("Apache-HttpClient", "org.apache.http.client", getClass());
            }
        }
        String str2 = str;
        ClientExecChain decorateMainExec = decorateMainExec(createMainExec(httpRequestExecutor2, poolingHttpClientConnectionManager, connectionReuseStrategy2, connectionKeepAliveStrategy2, new ImmutableHttpProcessor(new RequestTargetHost(), new RequestUserAgent(str2)), authenticationStrategy2, authenticationStrategy4, userTokenHandler2));
        HttpProcessor httpProcessor = this.f74135m;
        if (httpProcessor == null) {
            HttpProcessorBuilder create = HttpProcessorBuilder.create();
            LinkedList linkedList = this.f74137o;
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    create.addFirst((HttpRequestInterceptor) it.next());
                }
            }
            LinkedList linkedList2 = this.f74139q;
            if (linkedList2 != null) {
                Iterator it2 = linkedList2.iterator();
                while (it2.hasNext()) {
                    create.addFirst((HttpResponseInterceptor) it2.next());
                }
            }
            create.addAll(new RequestDefaultHeaders(this.f74101F), new RequestContent(), new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent(str2), new RequestExpectContinue());
            if (!this.f74113R) {
                create.add(new RequestAddCookies());
            }
            if (!this.f74112Q) {
                if (this.f74096A != null) {
                    ArrayList arrayList2 = new ArrayList(this.f74096A.keySet());
                    Collections.sort(arrayList2);
                    create.add(new RequestAcceptEncoding(arrayList2));
                } else {
                    create.add(new RequestAcceptEncoding());
                }
            }
            if (!this.f74114S) {
                create.add(new RequestAuthCache());
            }
            if (!this.f74113R) {
                create.add(new ResponseProcessCookies());
            }
            if (!this.f74112Q) {
                if (this.f74096A != null) {
                    RegistryBuilder create2 = RegistryBuilder.create();
                    for (Map.Entry entry : this.f74096A.entrySet()) {
                        create2.register((String) entry.getKey(), entry.getValue());
                    }
                    create.add(new ResponseContentEncoding(create2.build()));
                } else {
                    create.add(new ResponseContentEncoding());
                }
            }
            LinkedList linkedList3 = this.f74138p;
            if (linkedList3 != null) {
                Iterator it3 = linkedList3.iterator();
                while (it3.hasNext()) {
                    create.addLast((HttpRequestInterceptor) it3.next());
                }
            }
            LinkedList linkedList4 = this.f74140r;
            if (linkedList4 != null) {
                Iterator it4 = linkedList4.iterator();
                while (it4.hasNext()) {
                    create.addLast((HttpResponseInterceptor) it4.next());
                }
            }
            httpProcessor = create.build();
        }
        ServiceUnavailableRetryExec decorateProtocolExec = decorateProtocolExec(new ProtocolExec(decorateMainExec, httpProcessor));
        if (!this.f74111P) {
            HttpRequestRetryHandler httpRequestRetryHandler = this.f74141s;
            if (httpRequestRetryHandler == null) {
                httpRequestRetryHandler = DefaultHttpRequestRetryHandler.INSTANCE;
            }
            decorateProtocolExec = new RetryExec(decorateProtocolExec, httpRequestRetryHandler);
        }
        HttpRoutePlanner httpRoutePlanner2 = this.f74142t;
        if (httpRoutePlanner2 == null) {
            SchemePortResolver schemePortResolver = this.f74129g;
            if (schemePortResolver == null) {
                schemePortResolver = DefaultSchemePortResolver.INSTANCE;
            }
            HttpHost httpHost = this.f74100E;
            if (httpHost != null) {
                httpRoutePlanner = new DefaultProxyRoutePlanner(httpHost, schemePortResolver);
            } else if (this.f74109N) {
                httpRoutePlanner = new SystemDefaultRoutePlanner(schemePortResolver, ProxySelector.getDefault());
            } else {
                httpRoutePlanner = new DefaultRoutePlanner(schemePortResolver);
            }
        } else {
            httpRoutePlanner = httpRoutePlanner2;
        }
        ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy = this.f74146x;
        if (serviceUnavailableRetryStrategy != null) {
            decorateProtocolExec = new ServiceUnavailableRetryExec(decorateProtocolExec, serviceUnavailableRetryStrategy);
        }
        if (!this.f74110O) {
            RedirectStrategy redirectStrategy = this.f74143u;
            if (redirectStrategy == null) {
                redirectStrategy = DefaultRedirectStrategy.INSTANCE;
            }
            decorateProtocolExec = new RedirectExec(decorateProtocolExec, httpRoutePlanner, redirectStrategy);
        }
        BackoffManager backoffManager = this.f74145w;
        if (backoffManager != null && (connectionBackoffStrategy = this.f74144v) != null) {
            decorateProtocolExec = new BackoffStrategyExec(decorateProtocolExec, connectionBackoffStrategy, backoffManager);
        }
        Lookup lookup = this.f74147y;
        if (lookup == null) {
            lookup = RegistryBuilder.create().register("Basic", new BasicSchemeFactory()).register("Digest", new DigestSchemeFactory()).register("NTLM", new NTLMSchemeFactory()).register("Negotiate", new SPNegoSchemeFactory()).register("Kerberos", new KerberosSchemeFactory()).build();
        }
        Lookup<CookieSpecProvider> lookup2 = this.f74148z;
        if (lookup2 == null) {
            lookup2 = CookieSpecRegistries.createDefault(publicSuffixMatcher2);
        }
        CookieStore cookieStore = this.f74097B;
        if (cookieStore == null) {
            cookieStore = new BasicCookieStore();
        }
        CredentialsProvider credentialsProvider = this.f74098C;
        if (credentialsProvider == null) {
            if (this.f74109N) {
                credentialsProvider = new SystemDefaultCredentialsProvider();
            } else {
                credentialsProvider = new BasicCredentialsProvider();
            }
        }
        if (this.f74121Z != null) {
            arrayList = new ArrayList(this.f74121Z);
        } else {
            arrayList = null;
        }
        if (!this.f74128f) {
            if (arrayList == null) {
                arrayList = new ArrayList(1);
            }
            if (!this.f74105J && !this.f74106K) {
                httpClientConnectionManager = poolingHttpClientConnectionManager;
            } else {
                long j3 = this.f74107L;
                if (j3 > 0) {
                    j = j3;
                } else {
                    j = 10;
                }
                TimeUnit timeUnit3 = this.f74108M;
                if (timeUnit3 != null) {
                    timeUnit = timeUnit3;
                } else {
                    timeUnit = TimeUnit.SECONDS;
                }
                httpClientConnectionManager = poolingHttpClientConnectionManager;
                IdleConnectionEvictor idleConnectionEvictor = new IdleConnectionEvictor(httpClientConnectionManager, j, timeUnit, j3, timeUnit3);
                arrayList.add(new C12583a(idleConnectionEvictor));
                idleConnectionEvictor.start();
            }
            arrayList.add(new C12584b(httpClientConnectionManager));
        } else {
            httpClientConnectionManager = poolingHttpClientConnectionManager;
        }
        ArrayList arrayList3 = arrayList;
        RequestConfig requestConfig = this.f74104I;
        if (requestConfig == null) {
            requestConfig = RequestConfig.DEFAULT;
        }
        return new C18236Pf0(decorateProtocolExec, httpClientConnectionManager, httpRoutePlanner, lookup2, lookup, cookieStore, credentialsProvider, requestConfig, arrayList3);
    }

    public ClientExecChain createMainExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpProcessor httpProcessor, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        return new MainClientExec(httpRequestExecutor, httpClientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpProcessor, authenticationStrategy, authenticationStrategy2, userTokenHandler);
    }

    public ClientExecChain decorateMainExec(ClientExecChain clientExecChain) {
        return clientExecChain;
    }

    public ClientExecChain decorateProtocolExec(ClientExecChain clientExecChain) {
        return clientExecChain;
    }

    public final HttpClientBuilder disableAuthCaching() {
        this.f74114S = true;
        return this;
    }

    public final HttpClientBuilder disableAutomaticRetries() {
        this.f74111P = true;
        return this;
    }

    public final HttpClientBuilder disableConnectionState() {
        this.f74115T = true;
        return this;
    }

    public final HttpClientBuilder disableContentCompression() {
        this.f74112Q = true;
        return this;
    }

    public final HttpClientBuilder disableCookieManagement() {
        this.f74113R = true;
        return this;
    }

    public final HttpClientBuilder disableDefaultUserAgent() {
        this.f74116U = true;
        return this;
    }

    public final HttpClientBuilder disableRedirectHandling() {
        this.f74110O = true;
        return this;
    }

    public final HttpClientBuilder evictExpiredConnections() {
        this.f74105J = true;
        return this;
    }

    @Deprecated
    public final HttpClientBuilder evictIdleConnections(Long l, TimeUnit timeUnit) {
        return evictIdleConnections(l.longValue(), timeUnit);
    }

    public final HttpClientBuilder setBackoffManager(BackoffManager backoffManager) {
        this.f74145w = backoffManager;
        return this;
    }

    public final HttpClientBuilder setConnectionBackoffStrategy(ConnectionBackoffStrategy connectionBackoffStrategy) {
        this.f74144v = connectionBackoffStrategy;
        return this;
    }

    public final HttpClientBuilder setConnectionManager(HttpClientConnectionManager httpClientConnectionManager) {
        this.f74127e = httpClientConnectionManager;
        return this;
    }

    public final HttpClientBuilder setConnectionManagerShared(boolean z) {
        this.f74128f = z;
        return this;
    }

    public final HttpClientBuilder setConnectionReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        this.f74130h = connectionReuseStrategy;
        return this;
    }

    public final HttpClientBuilder setConnectionTimeToLive(long j, TimeUnit timeUnit) {
        this.f74119X = j;
        this.f74120Y = timeUnit;
        return this;
    }

    public final HttpClientBuilder setContentDecoderRegistry(Map<String, InputStreamFactory> map) {
        this.f74096A = map;
        return this;
    }

    public final HttpClientBuilder setDefaultAuthSchemeRegistry(Lookup<AuthSchemeProvider> lookup) {
        this.f74147y = lookup;
        return this;
    }

    public final HttpClientBuilder setDefaultConnectionConfig(ConnectionConfig connectionConfig) {
        this.f74103H = connectionConfig;
        return this;
    }

    public final HttpClientBuilder setDefaultCookieSpecRegistry(Lookup<CookieSpecProvider> lookup) {
        this.f74148z = lookup;
        return this;
    }

    public final HttpClientBuilder setDefaultCookieStore(CookieStore cookieStore) {
        this.f74097B = cookieStore;
        return this;
    }

    public final HttpClientBuilder setDefaultCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.f74098C = credentialsProvider;
        return this;
    }

    public final HttpClientBuilder setDefaultHeaders(Collection<? extends Header> collection) {
        this.f74101F = collection;
        return this;
    }

    public final HttpClientBuilder setDefaultRequestConfig(RequestConfig requestConfig) {
        this.f74104I = requestConfig;
        return this;
    }

    public final HttpClientBuilder setDefaultSocketConfig(SocketConfig socketConfig) {
        this.f74102G = socketConfig;
        return this;
    }

    public final HttpClientBuilder setDnsResolver(DnsResolver dnsResolver) {
        this.f74136n = dnsResolver;
        return this;
    }

    @Deprecated
    public final HttpClientBuilder setHostnameVerifier(X509HostnameVerifier x509HostnameVerifier) {
        this.f74124b = x509HostnameVerifier;
        return this;
    }

    public final HttpClientBuilder setHttpProcessor(HttpProcessor httpProcessor) {
        this.f74135m = httpProcessor;
        return this;
    }

    public final HttpClientBuilder setKeepAliveStrategy(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.f74131i = connectionKeepAliveStrategy;
        return this;
    }

    public final HttpClientBuilder setMaxConnPerRoute(int i) {
        this.f74118W = i;
        return this;
    }

    public final HttpClientBuilder setMaxConnTotal(int i) {
        this.f74117V = i;
        return this;
    }

    public final HttpClientBuilder setProxy(HttpHost httpHost) {
        this.f74100E = httpHost;
        return this;
    }

    public final HttpClientBuilder setProxyAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.f74133k = authenticationStrategy;
        return this;
    }

    public final HttpClientBuilder setPublicSuffixMatcher(PublicSuffixMatcher publicSuffixMatcher) {
        this.f74123a0 = publicSuffixMatcher;
        return this;
    }

    public final HttpClientBuilder setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.f74143u = redirectStrategy;
        return this;
    }

    public final HttpClientBuilder setRequestExecutor(HttpRequestExecutor httpRequestExecutor) {
        this.f74122a = httpRequestExecutor;
        return this;
    }

    public final HttpClientBuilder setRetryHandler(HttpRequestRetryHandler httpRequestRetryHandler) {
        this.f74141s = httpRequestRetryHandler;
        return this;
    }

    public final HttpClientBuilder setRoutePlanner(HttpRoutePlanner httpRoutePlanner) {
        this.f74142t = httpRoutePlanner;
        return this;
    }

    public final HttpClientBuilder setSSLContext(SSLContext sSLContext) {
        this.f74126d = sSLContext;
        return this;
    }

    public final HttpClientBuilder setSSLHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f74124b = hostnameVerifier;
        return this;
    }

    public final HttpClientBuilder setSSLSocketFactory(LayeredConnectionSocketFactory layeredConnectionSocketFactory) {
        this.f74125c = layeredConnectionSocketFactory;
        return this;
    }

    public final HttpClientBuilder setSchemePortResolver(SchemePortResolver schemePortResolver) {
        this.f74129g = schemePortResolver;
        return this;
    }

    public final HttpClientBuilder setServiceUnavailableRetryStrategy(ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy) {
        this.f74146x = serviceUnavailableRetryStrategy;
        return this;
    }

    @Deprecated
    public final HttpClientBuilder setSslcontext(SSLContext sSLContext) {
        return setSSLContext(sSLContext);
    }

    public final HttpClientBuilder setTargetAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.f74132j = authenticationStrategy;
        return this;
    }

    public final HttpClientBuilder setUserAgent(String str) {
        this.f74099D = str;
        return this;
    }

    public final HttpClientBuilder setUserTokenHandler(UserTokenHandler userTokenHandler) {
        this.f74134l = userTokenHandler;
        return this;
    }

    public final HttpClientBuilder useSystemProperties() {
        this.f74109N = true;
        return this;
    }

    public final HttpClientBuilder evictIdleConnections(long j, TimeUnit timeUnit) {
        this.f74106K = true;
        this.f74107L = j;
        this.f74108M = timeUnit;
        return this;
    }

    public final HttpClientBuilder addInterceptorFirst(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        if (this.f74137o == null) {
            this.f74137o = new LinkedList();
        }
        this.f74137o.addFirst(httpRequestInterceptor);
        return this;
    }

    public final HttpClientBuilder addInterceptorLast(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        if (this.f74138p == null) {
            this.f74138p = new LinkedList();
        }
        this.f74138p.addLast(httpRequestInterceptor);
        return this;
    }
}
