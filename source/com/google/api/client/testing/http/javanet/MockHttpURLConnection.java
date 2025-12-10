package com.google.api.client.testing.http.javanet;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Beta
/* loaded from: classes4.dex */
public class MockHttpURLConnection extends HttpURLConnection {

    /* renamed from: a */
    public boolean f52252a;

    /* renamed from: b */
    public boolean f52253b;

    /* renamed from: c */
    public boolean f52254c;

    /* renamed from: d */
    public OutputStream f52255d;

    /* renamed from: e */
    public InputStream f52256e;

    /* renamed from: f */
    public InputStream f52257f;

    /* renamed from: g */
    public Map f52258g;
    @Deprecated
    public static final byte[] INPUT_BUF = new byte[1];
    @Deprecated
    public static final byte[] ERROR_BUF = new byte[5];

    public MockHttpURLConnection(URL url) {
        super(url);
        this.f52253b = false;
        this.f52254c = false;
        this.f52255d = new ByteArrayOutputStream(0);
        this.f52256e = null;
        this.f52257f = null;
        this.f52258g = new LinkedHashMap();
    }

    public MockHttpURLConnection addHeader(String str, String str2) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        if (this.f52258g.containsKey(str)) {
            ((List) this.f52258g.get(str)).add(str2);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            this.f52258g.put(str, arrayList);
        }
        return this;
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
    }

    public final boolean doOutputCalled() {
        return this.f52252a;
    }

    public int getChunkLength() {
        return ((HttpURLConnection) this).chunkLength;
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f52257f;
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        List list = (List) this.f52258g.get(str);
        if (list == null) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f52258g;
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        if (((HttpURLConnection) this).responseCode < 400) {
            return this.f52256e;
        }
        throw new IOException();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        OutputStream outputStream = this.f52255d;
        if (outputStream != null) {
            return outputStream;
        }
        return super.getOutputStream();
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return ((HttpURLConnection) this).responseCode;
    }

    public boolean isSetFixedLengthStreamingModeIntCalled() {
        return this.f52253b;
    }

    public boolean isSetFixedLengthStreamingModeLongCalled() {
        return this.f52254c;
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.f52252a = true;
    }

    public MockHttpURLConnection setErrorStream(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream);
        if (this.f52257f == null) {
            this.f52257f = inputStream;
        }
        return this;
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.f52253b = true;
        super.setFixedLengthStreamingMode(i);
    }

    public MockHttpURLConnection setInputStream(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream);
        if (this.f52256e == null) {
            this.f52256e = inputStream;
        }
        return this;
    }

    public MockHttpURLConnection setOutputStream(OutputStream outputStream) {
        this.f52255d = outputStream;
        return this;
    }

    public MockHttpURLConnection setResponseCode(int i) {
        boolean z;
        if (i >= -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        ((HttpURLConnection) this).responseCode = i;
        return this;
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return false;
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        this.f52254c = true;
        super.setFixedLengthStreamingMode(j);
    }
}
