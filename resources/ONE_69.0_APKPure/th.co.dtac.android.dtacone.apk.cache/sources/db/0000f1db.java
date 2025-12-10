package org.apache.http.impl.bootstrap;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.ExceptionLogger;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseFactory;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.DefaultBHttpServerConnection;
import org.apache.http.impl.DefaultBHttpServerConnectionFactory;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.protocol.HttpExpectationVerifier;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpProcessorBuilder;
import org.apache.http.protocol.HttpRequestHandler;
import org.apache.http.protocol.HttpRequestHandlerMapper;
import org.apache.http.protocol.HttpService;
import org.apache.http.protocol.ResponseConnControl;
import org.apache.http.protocol.ResponseContent;
import org.apache.http.protocol.ResponseDate;
import org.apache.http.protocol.ResponseServer;
import org.apache.http.protocol.UriHttpRequestHandlerMapper;

/* loaded from: classes6.dex */
public class ServerBootstrap {

    /* renamed from: a */
    public int f74091a;

    /* renamed from: b */
    public InetAddress f74092b;

    /* renamed from: c */
    public SocketConfig f74093c;

    /* renamed from: d */
    public ConnectionConfig f74094d;

    /* renamed from: e */
    public LinkedList f74095e;

    /* renamed from: f */
    public LinkedList f74096f;

    /* renamed from: g */
    public LinkedList f74097g;

    /* renamed from: h */
    public LinkedList f74098h;

    /* renamed from: i */
    public String f74099i;

    /* renamed from: j */
    public HttpProcessor f74100j;

    /* renamed from: k */
    public ConnectionReuseStrategy f74101k;

    /* renamed from: l */
    public HttpResponseFactory f74102l;

    /* renamed from: m */
    public HttpRequestHandlerMapper f74103m;

    /* renamed from: n */
    public Map f74104n;

    /* renamed from: o */
    public HttpExpectationVerifier f74105o;

    /* renamed from: p */
    public ServerSocketFactory f74106p;

    /* renamed from: q */
    public SSLContext f74107q;

    /* renamed from: r */
    public SSLServerSetupHandler f74108r;

    /* renamed from: s */
    public HttpConnectionFactory f74109s;

    /* renamed from: t */
    public ExceptionLogger f74110t;

    public static ServerBootstrap bootstrap() {
        return new ServerBootstrap();
    }

    public final ServerBootstrap addInterceptorFirst(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        if (this.f74097g == null) {
            this.f74097g = new LinkedList();
        }
        this.f74097g.addFirst(httpResponseInterceptor);
        return this;
    }

    public final ServerBootstrap addInterceptorLast(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        if (this.f74098h == null) {
            this.f74098h = new LinkedList();
        }
        this.f74098h.addLast(httpResponseInterceptor);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.apache.http.protocol.HttpRequestHandlerMapper] */
    /* JADX WARN: Type inference failed for: r2v24, types: [org.apache.http.protocol.UriHttpRequestHandlerMapper] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public HttpServer create() {
        int i;
        HttpProcessor httpProcessor = this.f74100j;
        if (httpProcessor == null) {
            HttpProcessorBuilder create = HttpProcessorBuilder.create();
            LinkedList linkedList = this.f74095e;
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    create.addFirst((HttpRequestInterceptor) it.next());
                }
            }
            LinkedList linkedList2 = this.f74097g;
            if (linkedList2 != null) {
                Iterator it2 = linkedList2.iterator();
                while (it2.hasNext()) {
                    create.addFirst((HttpResponseInterceptor) it2.next());
                }
            }
            String str = this.f74099i;
            if (str == null) {
                str = "Apache-HttpCore/1.1";
            }
            create.addAll(new ResponseDate(), new ResponseServer(str), new ResponseContent(), new ResponseConnControl());
            LinkedList linkedList3 = this.f74096f;
            if (linkedList3 != null) {
                Iterator it3 = linkedList3.iterator();
                while (it3.hasNext()) {
                    create.addLast((HttpRequestInterceptor) it3.next());
                }
            }
            LinkedList linkedList4 = this.f74098h;
            if (linkedList4 != null) {
                Iterator it4 = linkedList4.iterator();
                while (it4.hasNext()) {
                    create.addLast((HttpResponseInterceptor) it4.next());
                }
            }
            httpProcessor = create.build();
        }
        HttpProcessor httpProcessor2 = httpProcessor;
        ?? r2 = this.f74103m;
        if (r2 == 0) {
            r2 = new UriHttpRequestHandlerMapper();
            Map map = this.f74104n;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    r2.register((String) entry.getKey(), (HttpRequestHandler) entry.getValue());
                }
            }
        }
        HttpRequestHandlerMapper httpRequestHandlerMapper = r2;
        ConnectionReuseStrategy connectionReuseStrategy = this.f74101k;
        if (connectionReuseStrategy == null) {
            connectionReuseStrategy = DefaultConnectionReuseStrategy.INSTANCE;
        }
        ConnectionReuseStrategy connectionReuseStrategy2 = connectionReuseStrategy;
        HttpResponseFactory httpResponseFactory = this.f74102l;
        if (httpResponseFactory == null) {
            httpResponseFactory = DefaultHttpResponseFactory.INSTANCE;
        }
        HttpService httpService = new HttpService(httpProcessor2, connectionReuseStrategy2, httpResponseFactory, httpRequestHandlerMapper, this.f74105o);
        ServerSocketFactory serverSocketFactory = this.f74106p;
        if (serverSocketFactory == null) {
            SSLContext sSLContext = this.f74107q;
            if (sSLContext != null) {
                serverSocketFactory = sSLContext.getServerSocketFactory();
            } else {
                serverSocketFactory = ServerSocketFactory.getDefault();
            }
        }
        ServerSocketFactory serverSocketFactory2 = serverSocketFactory;
        HttpConnectionFactory httpConnectionFactory = this.f74109s;
        if (httpConnectionFactory == null) {
            if (this.f74094d != null) {
                httpConnectionFactory = new DefaultBHttpServerConnectionFactory(this.f74094d);
            } else {
                httpConnectionFactory = DefaultBHttpServerConnectionFactory.INSTANCE;
            }
        }
        HttpConnectionFactory httpConnectionFactory2 = httpConnectionFactory;
        ExceptionLogger exceptionLogger = this.f74110t;
        if (exceptionLogger == null) {
            exceptionLogger = ExceptionLogger.NO_OP;
        }
        ExceptionLogger exceptionLogger2 = exceptionLogger;
        int i2 = this.f74091a;
        if (i2 > 0) {
            i = i2;
        } else {
            i = 0;
        }
        InetAddress inetAddress = this.f74092b;
        SocketConfig socketConfig = this.f74093c;
        if (socketConfig == null) {
            socketConfig = SocketConfig.DEFAULT;
        }
        return new HttpServer(i, inetAddress, socketConfig, serverSocketFactory2, httpService, httpConnectionFactory2, this.f74108r, exceptionLogger2);
    }

    public final ServerBootstrap registerHandler(String str, HttpRequestHandler httpRequestHandler) {
        if (str != null && httpRequestHandler != null) {
            if (this.f74104n == null) {
                this.f74104n = new HashMap();
            }
            this.f74104n.put(str, httpRequestHandler);
        }
        return this;
    }

    public final ServerBootstrap setConnectionConfig(ConnectionConfig connectionConfig) {
        this.f74094d = connectionConfig;
        return this;
    }

    public final ServerBootstrap setConnectionFactory(HttpConnectionFactory<? extends DefaultBHttpServerConnection> httpConnectionFactory) {
        this.f74109s = httpConnectionFactory;
        return this;
    }

    public final ServerBootstrap setConnectionReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        this.f74101k = connectionReuseStrategy;
        return this;
    }

    public final ServerBootstrap setExceptionLogger(ExceptionLogger exceptionLogger) {
        this.f74110t = exceptionLogger;
        return this;
    }

    public final ServerBootstrap setExpectationVerifier(HttpExpectationVerifier httpExpectationVerifier) {
        this.f74105o = httpExpectationVerifier;
        return this;
    }

    public final ServerBootstrap setHandlerMapper(HttpRequestHandlerMapper httpRequestHandlerMapper) {
        this.f74103m = httpRequestHandlerMapper;
        return this;
    }

    public final ServerBootstrap setHttpProcessor(HttpProcessor httpProcessor) {
        this.f74100j = httpProcessor;
        return this;
    }

    public final ServerBootstrap setListenerPort(int i) {
        this.f74091a = i;
        return this;
    }

    public final ServerBootstrap setLocalAddress(InetAddress inetAddress) {
        this.f74092b = inetAddress;
        return this;
    }

    public final ServerBootstrap setResponseFactory(HttpResponseFactory httpResponseFactory) {
        this.f74102l = httpResponseFactory;
        return this;
    }

    public final ServerBootstrap setServerInfo(String str) {
        this.f74099i = str;
        return this;
    }

    public final ServerBootstrap setServerSocketFactory(ServerSocketFactory serverSocketFactory) {
        this.f74106p = serverSocketFactory;
        return this;
    }

    public final ServerBootstrap setSocketConfig(SocketConfig socketConfig) {
        this.f74093c = socketConfig;
        return this;
    }

    public final ServerBootstrap setSslContext(SSLContext sSLContext) {
        this.f74107q = sSLContext;
        return this;
    }

    public final ServerBootstrap setSslSetupHandler(SSLServerSetupHandler sSLServerSetupHandler) {
        this.f74108r = sSLServerSetupHandler;
        return this;
    }

    public final ServerBootstrap addInterceptorFirst(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        if (this.f74095e == null) {
            this.f74095e = new LinkedList();
        }
        this.f74095e.addFirst(httpRequestInterceptor);
        return this;
    }

    public final ServerBootstrap addInterceptorLast(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        if (this.f74096f == null) {
            this.f74096f = new LinkedList();
        }
        this.f74096f.addLast(httpRequestInterceptor);
        return this;
    }
}