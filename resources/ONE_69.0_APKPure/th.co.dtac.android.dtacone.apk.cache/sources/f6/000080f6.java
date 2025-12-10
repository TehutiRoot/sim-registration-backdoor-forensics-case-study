package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes3.dex */
public class GlideUrl implements Key {

    /* renamed from: a */
    public final Headers f42206a;

    /* renamed from: b */
    public final URL f42207b;

    /* renamed from: c */
    public final String f42208c;

    /* renamed from: d */
    public String f42209d;

    /* renamed from: e */
    public URL f42210e;

    /* renamed from: f */
    public volatile byte[] f42211f;

    /* renamed from: g */
    public int f42212g;

    public GlideUrl(URL url) {
        this(url, Headers.DEFAULT);
    }

    /* renamed from: a */
    public final byte[] m50292a() {
        if (this.f42211f == null) {
            this.f42211f = getCacheKey().getBytes(Key.CHARSET);
        }
        return this.f42211f;
    }

    /* renamed from: b */
    public final String m50291b() {
        if (TextUtils.isEmpty(this.f42209d)) {
            String str = this.f42208c;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) Preconditions.checkNotNull(this.f42207b)).toString();
            }
            this.f42209d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f42209d;
    }

    /* renamed from: c */
    public final URL m50290c() {
        if (this.f42210e == null) {
            this.f42210e = new URL(m50291b());
        }
        return this.f42210e;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof GlideUrl)) {
            return false;
        }
        GlideUrl glideUrl = (GlideUrl) obj;
        if (!getCacheKey().equals(glideUrl.getCacheKey()) || !this.f42206a.equals(glideUrl.f42206a)) {
            return false;
        }
        return true;
    }

    public String getCacheKey() {
        String str = this.f42208c;
        if (str == null) {
            return ((URL) Preconditions.checkNotNull(this.f42207b)).toString();
        }
        return str;
    }

    public Map<String, String> getHeaders() {
        return this.f42206a.getHeaders();
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        if (this.f42212g == 0) {
            int hashCode = getCacheKey().hashCode();
            this.f42212g = hashCode;
            this.f42212g = (hashCode * 31) + this.f42206a.hashCode();
        }
        return this.f42212g;
    }

    public String toString() {
        return getCacheKey();
    }

    public String toStringUrl() {
        return m50291b();
    }

    public URL toURL() throws MalformedURLException {
        return m50290c();
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(m50292a());
    }

    public GlideUrl(String str) {
        this(str, Headers.DEFAULT);
    }

    public GlideUrl(URL url, Headers headers) {
        this.f42207b = (URL) Preconditions.checkNotNull(url);
        this.f42208c = null;
        this.f42206a = (Headers) Preconditions.checkNotNull(headers);
    }

    public GlideUrl(String str, Headers headers) {
        this.f42207b = null;
        this.f42208c = Preconditions.checkNotEmpty(str);
        this.f42206a = (Headers) Preconditions.checkNotNull(headers);
    }
}