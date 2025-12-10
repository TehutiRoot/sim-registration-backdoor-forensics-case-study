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
public final class C10332gq extends URLConnection implements AutoCloseable {

    /* renamed from: a */
    public final URLConnection f62313a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10332gq(URLConnection uRLConnection) {
        super(uRLConnection.getURL());
        Objects.requireNonNull(uRLConnection, "urlConnection");
        this.f62313a = uRLConnection;
    }

    /* renamed from: b */
    public static C10332gq m30978b(URL url) {
        return new C10332gq(url.openConnection());
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f62313a.addRequestProperty(str, str2);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        IOUtils.close(this.f62313a);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f62313a.connect();
    }

    public boolean equals(Object obj) {
        return this.f62313a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f62313a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f62313a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f62313a.getContent();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f62313a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f62313a.getContentLength();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        long contentLengthLong;
        contentLengthLong = this.f62313a.getContentLengthLong();
        return contentLengthLong;
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f62313a.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f62313a.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f62313a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f62313a.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f62313a.getDoOutput();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f62313a.getExpiration();
    }

    @Override // java.net.URLConnection
    public String getHeaderField(int i) {
        return this.f62313a.getHeaderField(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.f62313a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.f62313a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.f62313a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
        long headerFieldLong;
        headerFieldLong = this.f62313a.getHeaderFieldLong(str, j);
        return headerFieldLong;
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f62313a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f62313a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f62313a.getInputStream();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f62313a.getLastModified();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f62313a.getOutputStream();
    }

    @Override // java.net.URLConnection
    public Permission getPermission() {
        return this.f62313a.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f62313a.getReadTimeout();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f62313a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f62313a.getRequestProperty(str);
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f62313a.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f62313a.getUseCaches();
    }

    public int hashCode() {
        return this.f62313a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.f62313a.setAllowUserInteraction(z);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.f62313a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.f62313a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.f62313a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.f62313a.setDoOutput(z);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.f62313a.setIfModifiedSince(j);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.f62313a.setReadTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f62313a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.f62313a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f62313a.toString();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f62313a.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f62313a.getHeaderField(str);
    }
}
