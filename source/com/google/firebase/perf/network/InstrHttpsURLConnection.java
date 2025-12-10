package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class InstrHttpsURLConnection extends HttpsURLConnection {

    /* renamed from: a */
    public final C20244hf0 f56223a;

    /* renamed from: b */
    public final HttpsURLConnection f56224b;

    public InstrHttpsURLConnection(HttpsURLConnection httpsURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        super(httpsURLConnection.getURL());
        this.f56224b = httpsURLConnection;
        this.f56223a = new C20244hf0(httpsURLConnection, timer, networkRequestMetricBuilder);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f56223a.m30819a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.f56223a.m30817b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f56223a.m30815c();
    }

    public boolean equals(Object obj) {
        return this.f56223a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f56223a.m30814d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f56224b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f56223a.m30813e();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.f56223a.m30812f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f56223a.m30810h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f56223a.m30809i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f56223a.m30808j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f56223a.m30807k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f56223a.m30806l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f56223a.m30805m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f56223a.m30804n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f56223a.m30803o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f56223a.m30802p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f56223a.m30801q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.f56223a.m30800r(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.f56223a.m30798t(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.f56223a.m30797u(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.f56223a.m30796v(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
        return this.f56223a.m30795w(str, j);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f56223a.m30794x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f56224b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f56223a.m30793y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.f56223a.m30792z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f56223a.m30845A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f56223a.m30844B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f56224b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f56224b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.f56223a.m30843C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.f56224b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.f56223a.m30842D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f56223a.m30841E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f56223a.m30840F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f56223a.m30839G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f56223a.m30838H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.f56223a.m30837I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.f56223a.m30836J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f56224b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.f56224b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f56223a.m30835K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f56223a.m30834L();
    }

    public int hashCode() {
        return this.f56223a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.f56223a.m30833M(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.f56223a.m30832N(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.f56223a.m30831O(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.f56223a.m30830P(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.f56223a.m30829Q(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.f56223a.m30828R(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.f56223a.m30827S(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f56224b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.f56223a.m30825U(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.f56223a.m30824V(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.f56223a.m30823W(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f56223a.m30822X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f56223a.m30821Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f56224b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.f56223a.m30820Z(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f56223a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f56223a.m30816b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.f56223a.m30811g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f56223a.m30799s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        this.f56223a.m30826T(j);
    }
}
