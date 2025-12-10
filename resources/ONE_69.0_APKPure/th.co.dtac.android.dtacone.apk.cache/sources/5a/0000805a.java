package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes3.dex */
public class HttpUrlFetcher implements DataFetcher<InputStream> {

    /* renamed from: g */
    public static final InterfaceC5755b f41873g = new C5754a();

    /* renamed from: a */
    public final GlideUrl f41874a;

    /* renamed from: b */
    public final int f41875b;

    /* renamed from: c */
    public final InterfaceC5755b f41876c;

    /* renamed from: d */
    public HttpURLConnection f41877d;

    /* renamed from: e */
    public InputStream f41878e;

    /* renamed from: f */
    public volatile boolean f41879f;

    /* renamed from: com.bumptech.glide.load.data.HttpUrlFetcher$a */
    /* loaded from: classes3.dex */
    public static class C5754a implements InterfaceC5755b {
        @Override // com.bumptech.glide.load.data.HttpUrlFetcher.InterfaceC5755b
        /* renamed from: a */
        public HttpURLConnection mo50490a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.data.HttpUrlFetcher$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC5755b {
        /* renamed from: a */
        HttpURLConnection mo50490a(URL url);
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int i) {
        this(glideUrl, i, f41873g);
    }

    /* renamed from: b */
    public static int m50495b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    /* renamed from: d */
    public static boolean m50493d(int i) {
        if (i / 100 == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m50492e(int i) {
        if (i / 100 == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final HttpURLConnection m50496a(URL url, Map map) {
        try {
            HttpURLConnection mo50490a = this.f41876c.mo50490a(url);
            for (Map.Entry entry : map.entrySet()) {
                mo50490a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            mo50490a.setConnectTimeout(this.f41875b);
            mo50490a.setReadTimeout(this.f41875b);
            mo50490a.setUseCaches(false);
            mo50490a.setDoInput(true);
            mo50490a.setInstanceFollowRedirects(false);
            return mo50490a;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    /* renamed from: c */
    public final InputStream m50494c(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f41878e = ContentLengthInputStream.obtain(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got non empty content encoding: ");
                    sb.append(httpURLConnection.getContentEncoding());
                }
                this.f41878e = httpURLConnection.getInputStream();
            }
            return this.f41878e;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", m50495b(httpURLConnection), e);
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
        this.f41879f = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream = this.f41878e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f41877d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f41877d = null;
    }

    /* renamed from: f */
    public final InputStream m50491f(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection m50496a = m50496a(url, map);
            this.f41877d = m50496a;
            try {
                m50496a.connect();
                this.f41878e = this.f41877d.getInputStream();
                if (this.f41879f) {
                    return null;
                }
                int m50495b = m50495b(this.f41877d);
                if (m50493d(m50495b)) {
                    return m50494c(this.f41877d);
                }
                if (m50492e(m50495b)) {
                    String headerField = this.f41877d.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            cleanup();
                            return m50491f(url3, i + 1, url, map);
                        } catch (MalformedURLException e) {
                            throw new HttpException("Bad redirect url: " + headerField, m50495b, e);
                        }
                    }
                    throw new HttpException("Received empty or null redirect url", m50495b);
                } else if (m50495b == -1) {
                    throw new HttpException(m50495b);
                } else {
                    try {
                        throw new HttpException(this.f41877d.getResponseMessage(), m50495b);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", m50495b, e2);
                    }
                }
            } catch (IOException e3) {
                throw new HttpException("Failed to connect or obtain data", m50495b(this.f41877d), e3);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super InputStream> dataCallback) {
        StringBuilder sb;
        long logTime = LogTime.getLogTime();
        try {
            try {
                dataCallback.onDataReady(m50491f(this.f41874a.toURL(), 0, null, this.f41874a.getHeaders()));
            } catch (IOException e) {
                Log.isLoggable("HttpUrlFetcher", 3);
                dataCallback.onLoadFailed(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder();
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(LogTime.getElapsedMillis(logTime));
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(LogTime.getElapsedMillis(logTime));
            }
            throw th2;
        }
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int i, InterfaceC5755b interfaceC5755b) {
        this.f41874a = glideUrl;
        this.f41875b = i;
        this.f41876c = interfaceC5755b;
    }
}