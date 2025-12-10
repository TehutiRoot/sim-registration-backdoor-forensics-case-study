package ch.qos.logback.core.net;

import ch.qos.logback.core.net.ssl.ConfigurableSSLSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

/* loaded from: classes.dex */
public abstract class SSLSocketAppenderBase<E> extends AbstractSocketAppender<E> implements SSLComponent {

    /* renamed from: u */
    public SSLConfiguration f39886u;

    /* renamed from: v */
    public SocketFactory f39887v;

    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public SocketFactory getSocketFactory() {
        return this.f39887v;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public SSLConfiguration getSsl() {
        if (this.f39886u == null) {
            this.f39886u = new SSLConfiguration();
        }
        return this.f39886u;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public void setSsl(SSLConfiguration sSLConfiguration) {
        this.f39886u = sSLConfiguration;
    }

    @Override // ch.qos.logback.core.net.AbstractSocketAppender, ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        try {
            SSLContext createContext = getSsl().createContext(this);
            SSLParametersConfiguration parameters = getSsl().getParameters();
            parameters.setContext(getContext());
            this.f39887v = new ConfigurableSSLSocketFactory(parameters, createContext.getSocketFactory());
            super.start();
        } catch (Exception e) {
            addError(e.getMessage(), e);
        }
    }
}
