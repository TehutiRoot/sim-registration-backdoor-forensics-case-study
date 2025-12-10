package ch.qos.logback.core.net.server;

import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

/* loaded from: classes.dex */
public abstract class SSLServerSocketAppenderBase<E> extends AbstractServerSocketAppender<E> implements SSLComponent {

    /* renamed from: l */
    public SSLConfiguration f39925l;

    /* renamed from: m */
    public ServerSocketFactory f39926m;

    @Override // ch.qos.logback.core.net.server.AbstractServerSocketAppender
    public ServerSocketFactory getServerSocketFactory() {
        return this.f39926m;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public SSLConfiguration getSsl() {
        if (this.f39925l == null) {
            this.f39925l = new SSLConfiguration();
        }
        return this.f39925l;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public void setSsl(SSLConfiguration sSLConfiguration) {
        this.f39925l = sSLConfiguration;
    }

    @Override // ch.qos.logback.core.net.server.AbstractServerSocketAppender, ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        try {
            SSLContext createContext = getSsl().createContext(this);
            SSLParametersConfiguration parameters = getSsl().getParameters();
            parameters.setContext(getContext());
            this.f39926m = new ConfigurableSSLServerSocketFactory(parameters, createContext.getServerSocketFactory());
            super.start();
        } catch (Exception e) {
            addError(e.getMessage(), e);
        }
    }
}
