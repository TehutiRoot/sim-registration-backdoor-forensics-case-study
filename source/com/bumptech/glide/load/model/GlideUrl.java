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
    public final Headers f42194a;

    /* renamed from: b */
    public final URL f42195b;

    /* renamed from: c */
    public final String f42196c;

    /* renamed from: d */
    public String f42197d;

    /* renamed from: e */
    public URL f42198e;

    /* renamed from: f */
    public volatile byte[] f42199f;

    /* renamed from: g */
    public int f42200g;

    public GlideUrl(URL url) {
        this(url, Headers.DEFAULT);
    }

    /* renamed from: a */
    public final byte[] m50295a() {
        if (this.f42199f == null) {
            this.f42199f = getCacheKey().getBytes(Key.CHARSET);
        }
        return this.f42199f;
    }

    /* renamed from: b */
    public final String m50294b() {
        if (TextUtils.isEmpty(this.f42197d)) {
            String str = this.f42196c;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) Preconditions.checkNotNull(this.f42195b)).toString();
            }
            this.f42197d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f42197d;
    }

    /* renamed from: c */
    public final URL m50293c() {
        if (this.f42198e == null) {
            this.f42198e = new URL(m50294b());
        }
        return this.f42198e;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof GlideUrl)) {
            return false;
        }
        GlideUrl glideUrl = (GlideUrl) obj;
        if (!getCacheKey().equals(glideUrl.getCacheKey()) || !this.f42194a.equals(glideUrl.f42194a)) {
            return false;
        }
        return true;
    }

    public String getCacheKey() {
        String str = this.f42196c;
        if (str == null) {
            return ((URL) Preconditions.checkNotNull(this.f42195b)).toString();
        }
        return str;
    }

    public Map<String, String> getHeaders() {
        return this.f42194a.getHeaders();
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        if (this.f42200g == 0) {
            int hashCode = getCacheKey().hashCode();
            this.f42200g = hashCode;
            this.f42200g = (hashCode * 31) + this.f42194a.hashCode();
        }
        return this.f42200g;
    }

    public String toString() {
        return getCacheKey();
    }

    public String toStringUrl() {
        return m50294b();
    }

    public URL toURL() throws MalformedURLException {
        return m50293c();
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(m50295a());
    }

    public GlideUrl(String str) {
        this(str, Headers.DEFAULT);
    }

    public GlideUrl(URL url, Headers headers) {
        this.f42195b = (URL) Preconditions.checkNotNull(url);
        this.f42196c = null;
        this.f42194a = (Headers) Preconditions.checkNotNull(headers);
    }

    public GlideUrl(String str, Headers headers) {
        this.f42195b = null;
        this.f42196c = Preconditions.checkNotEmpty(str);
        this.f42194a = (Headers) Preconditions.checkNotNull(headers);
    }
}
