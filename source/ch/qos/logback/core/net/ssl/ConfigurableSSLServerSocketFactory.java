package ch.qos.logback.core.net.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/* loaded from: classes.dex */
public class ConfigurableSSLServerSocketFactory extends ServerSocketFactory {

    /* renamed from: a */
    public final SSLParametersConfiguration f39935a;

    /* renamed from: b */
    public final SSLServerSocketFactory f39936b;

    public ConfigurableSSLServerSocketFactory(SSLParametersConfiguration sSLParametersConfiguration, SSLServerSocketFactory sSLServerSocketFactory) {
        this.f39935a = sSLParametersConfiguration;
        this.f39936b = sSLServerSocketFactory;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i) throws IOException {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.f39936b.createServerSocket(i);
        this.f39935a.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2) throws IOException {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.f39936b.createServerSocket(i, i2);
        this.f39935a.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) throws IOException {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.f39936b.createServerSocket(i, i2, inetAddress);
        this.f39935a.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }
}
