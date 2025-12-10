package ch.qos.logback.classic.net.server;

import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

/* loaded from: classes.dex */
public class SSLServerSocketReceiver extends ServerSocketReceiver implements SSLComponent {

    /* renamed from: h */
    public SSLConfiguration f39600h;

    /* renamed from: i */
    public ServerSocketFactory f39601i;

    @Override // ch.qos.logback.classic.net.server.ServerSocketReceiver
    public ServerSocketFactory getServerSocketFactory() throws Exception {
        if (this.f39601i == null) {
            SSLContext createContext = getSsl().createContext(this);
            SSLParametersConfiguration parameters = getSsl().getParameters();
            parameters.setContext(getContext());
            this.f39601i = new ConfigurableSSLServerSocketFactory(parameters, createContext.getServerSocketFactory());
        }
        return this.f39601i;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public SSLConfiguration getSsl() {
        if (this.f39600h == null) {
            this.f39600h = new SSLConfiguration();
        }
        return this.f39600h;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public void setSsl(SSLConfiguration sSLConfiguration) {
        this.f39600h = sSLConfiguration;
    }
}
