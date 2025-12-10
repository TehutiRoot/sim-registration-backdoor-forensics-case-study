package ch.qos.logback.core.net.ssl;

import javax.net.ssl.SSLServerSocket;

/* loaded from: classes.dex */
public class SSLConfigurableServerSocket implements SSLConfigurable {

    /* renamed from: a */
    public final SSLServerSocket f39945a;

    public SSLConfigurableServerSocket(SSLServerSocket sSLServerSocket) {
        this.f39945a = sSLServerSocket;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getDefaultCipherSuites() {
        return this.f39945a.getEnabledCipherSuites();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getDefaultProtocols() {
        return this.f39945a.getEnabledProtocols();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getSupportedCipherSuites() {
        return this.f39945a.getSupportedCipherSuites();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getSupportedProtocols() {
        return this.f39945a.getSupportedProtocols();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setEnabledCipherSuites(String[] strArr) {
        this.f39945a.setEnabledCipherSuites(strArr);
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setEnabledProtocols(String[] strArr) {
        this.f39945a.setEnabledProtocols(strArr);
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setNeedClientAuth(boolean z) {
        this.f39945a.setNeedClientAuth(z);
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setWantClientAuth(boolean z) {
        this.f39945a.setWantClientAuth(z);
    }
}
