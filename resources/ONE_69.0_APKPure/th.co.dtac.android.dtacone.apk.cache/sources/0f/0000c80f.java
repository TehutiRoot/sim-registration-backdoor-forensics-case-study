package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.p028io.IOUtils;

/* renamed from: gq */
/* loaded from: classes6.dex */
public final class C10318gq extends URLConnection implements AutoCloseable {

    /* renamed from: a */
    public final URLConnection f62293a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10318gq(URLConnection uRLConnection) {
        super(uRLConnection.getURL());
        Objects.requireNonNull(uRLConnection, "urlConnection");
        this.f62293a = uRLConnection;
    }

    /* renamed from: b */
    public static C10318gq m31321b(URL url) {
        return new C10318gq(url.openConnection());
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f62293a.addRequestProperty(str, str2);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        IOUtils.close(this.f62293a);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f62293a.connect();
    }

    public boolean equals(Object obj) {
        return this.f62293a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f62293a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f62293a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f62293a.getContent();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f62293a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f62293a.getContentLength();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        long contentLengthLong;
        contentLengthLong = this.f62293a.getContentLengthLong();
        return contentLengthLong;
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f62293a.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f62293a.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f62293a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f62293a.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f62293a.getDoOutput();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f62293a.getExpiration();
    }

    @Override // java.net.URLConnection
    public String getHeaderField(int i) {
        return this.f62293a.getHeaderField(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.f62293a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.f62293a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.f62293a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
        long headerFieldLong;
        headerFieldLong = this.f62293a.getHeaderFieldLong(str, j);
        return headerFieldLong;
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f62293a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f62293a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f62293a.getInputStream();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f62293a.getLastModified();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f62293a.getOutputStream();
    }

    @Override // java.net.URLConnection
    public Permission getPermission() {
        return this.f62293a.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f62293a.getReadTimeout();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f62293a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f62293a.getRequestProperty(str);
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f62293a.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f62293a.getUseCaches();
    }

    public int hashCode() {
        return this.f62293a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.f62293a.setAllowUserInteraction(z);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.f62293a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.f62293a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.f62293a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.f62293a.setDoOutput(z);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.f62293a.setIfModifiedSince(j);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.f62293a.setReadTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f62293a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.f62293a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f62293a.toString();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f62293a.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f62293a.getHeaderField(str);
    }
}