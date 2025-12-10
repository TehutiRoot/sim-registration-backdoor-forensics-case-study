package ch.qos.logback.classic.net;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import java.security.NoSuchAlgorithmException;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

/* loaded from: classes.dex */
public class SimpleSSLSocketServer extends SimpleSocketServer {

    /* renamed from: h */
    public final ServerSocketFactory f39568h;

    public SimpleSSLSocketServer(LoggerContext loggerContext, int i) throws NoSuchAlgorithmException {
        this(loggerContext, i, SSLContext.getDefault());
    }

    public static void main(String[] strArr) throws Exception {
        SimpleSocketServer.doMain(SimpleSSLSocketServer.class, strArr);
    }

    @Override // ch.qos.logback.classic.net.SimpleSocketServer
    public ServerSocketFactory getServerSocketFactory() {
        return this.f39568h;
    }

    public SimpleSSLSocketServer(LoggerContext loggerContext, int i, SSLContext sSLContext) {
        super(loggerContext, i);
        if (sSLContext == null) {
            throw new NullPointerException("SSL context required");
        }
        SSLParametersConfiguration sSLParametersConfiguration = new SSLParametersConfiguration();
        sSLParametersConfiguration.setContext(loggerContext);
        this.f39568h = new ConfigurableSSLServerSocketFactory(sSLParametersConfiguration, sSLContext.getServerSocketFactory());
    }
}