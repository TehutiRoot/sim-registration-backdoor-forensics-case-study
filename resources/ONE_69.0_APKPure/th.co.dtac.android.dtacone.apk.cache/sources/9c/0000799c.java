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
    public SSLConfiguration f39598h;

    /* renamed from: i */
    public ServerSocketFactory f39599i;

    @Override // ch.qos.logback.classic.net.server.ServerSocketReceiver
    public ServerSocketFactory getServerSocketFactory() throws Exception {
        if (this.f39599i == null) {
            SSLContext createContext = getSsl().createContext(this);
            SSLParametersConfiguration parameters = getSsl().getParameters();
            parameters.setContext(getContext());
            this.f39599i = new ConfigurableSSLServerSocketFactory(parameters, createContext.getServerSocketFactory());
        }
        return this.f39599i;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public SSLConfiguration getSsl() {
        if (this.f39598h == null) {
            this.f39598h = new SSLConfiguration();
        }
        return this.f39598h;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public void setSsl(SSLConfiguration sSLConfiguration) {
        this.f39598h = sSLConfiguration;
    }
}