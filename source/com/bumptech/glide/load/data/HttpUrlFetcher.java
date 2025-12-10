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
    public static final InterfaceC5766b f41861g = new C5765a();

    /* renamed from: a */
    public final GlideUrl f41862a;

    /* renamed from: b */
    public final int f41863b;

    /* renamed from: c */
    public final InterfaceC5766b f41864c;

    /* renamed from: d */
    public HttpURLConnection f41865d;

    /* renamed from: e */
    public InputStream f41866e;

    /* renamed from: f */
    public volatile boolean f41867f;

    /* renamed from: com.bumptech.glide.load.data.HttpUrlFetcher$a */
    /* loaded from: classes3.dex */
    public static class C5765a implements InterfaceC5766b {
        @Override // com.bumptech.glide.load.data.HttpUrlFetcher.InterfaceC5766b
        /* renamed from: a */
        public HttpURLConnection mo50493a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.data.HttpUrlFetcher$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC5766b {
        /* renamed from: a */
        HttpURLConnection mo50493a(URL url);
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int i) {
        this(glideUrl, i, f41861g);
    }

    /* renamed from: b */
    public static int m50498b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    /* renamed from: d */
    public static boolean m50496d(int i) {
        if (i / 100 == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m50495e(int i) {
        if (i / 100 == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final HttpURLConnection m50499a(URL url, Map map) {
        try {
            HttpURLConnection mo50493a = this.f41864c.mo50493a(url);
            for (Map.Entry entry : map.entrySet()) {
                mo50493a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            mo50493a.setConnectTimeout(this.f41863b);
            mo50493a.setReadTimeout(this.f41863b);
            mo50493a.setUseCaches(false);
            mo50493a.setDoInput(true);
            mo50493a.setInstanceFollowRedirects(false);
            return mo50493a;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    /* renamed from: c */
    public final InputStream m50497c(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f41866e = ContentLengthInputStream.obtain(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got non empty content encoding: ");
                    sb.append(httpURLConnection.getContentEncoding());
                }
                this.f41866e = httpURLConnection.getInputStream();
            }
            return this.f41866e;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", m50498b(httpURLConnection), e);
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
        this.f41867f = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream = this.f41866e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f41865d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f41865d = null;
    }

    /* renamed from: f */
    public final InputStream m50494f(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection m50499a = m50499a(url, map);
            this.f41865d = m50499a;
            try {
                m50499a.connect();
                this.f41866e = this.f41865d.getInputStream();
                if (this.f41867f) {
                    return null;
                }
                int m50498b = m50498b(this.f41865d);
                if (m50496d(m50498b)) {
                    return m50497c(this.f41865d);
                }
                if (m50495e(m50498b)) {
                    String headerField = this.f41865d.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            cleanup();
                            return m50494f(url3, i + 1, url, map);
                        } catch (MalformedURLException e) {
                            throw new HttpException("Bad redirect url: " + headerField, m50498b, e);
                        }
                    }
                    throw new HttpException("Received empty or null redirect url", m50498b);
                } else if (m50498b == -1) {
                    throw new HttpException(m50498b);
                } else {
                    try {
                        throw new HttpException(this.f41865d.getResponseMessage(), m50498b);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", m50498b, e2);
                    }
                }
            } catch (IOException e3) {
                throw new HttpException("Failed to connect or obtain data", m50498b(this.f41865d), e3);
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
                dataCallback.onDataReady(m50494f(this.f41862a.toURL(), 0, null, this.f41862a.getHeaders()));
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

    public HttpUrlFetcher(GlideUrl glideUrl, int i, InterfaceC5766b interfaceC5766b) {
        this.f41862a = glideUrl;
        this.f41863b = i;
        this.f41864c = interfaceC5766b;
    }
}
