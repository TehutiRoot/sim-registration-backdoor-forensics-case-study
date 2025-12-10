package com.google.api.client.http.javanet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes4.dex */
public class DefaultConnectionFactory implements ConnectionFactory {

    /* renamed from: a */
    public final Proxy f52168a;

    public DefaultConnectionFactory() {
        this(null);
    }

    @Override // com.google.api.client.http.javanet.ConnectionFactory
    public HttpURLConnection openConnection(URL url) throws IOException {
        URLConnection openConnection;
        Proxy proxy = this.f52168a;
        if (proxy == null) {
            openConnection = url.openConnection();
        } else {
            openConnection = url.openConnection(proxy);
        }
        return (HttpURLConnection) openConnection;
    }

    public DefaultConnectionFactory(Proxy proxy) {
        this.f52168a = proxy;
    }
}
