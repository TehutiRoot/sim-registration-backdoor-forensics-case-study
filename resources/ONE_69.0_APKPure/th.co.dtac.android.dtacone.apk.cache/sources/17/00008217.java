package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public class MediaStoreSignature implements Key {

    /* renamed from: a */
    public final String f42716a;

    /* renamed from: b */
    public final long f42717b;

    /* renamed from: c */
    public final int f42718c;

    public MediaStoreSignature(@Nullable String str, long j, int i) {
        this.f42716a = str == null ? "" : str;
        this.f42717b = j;
        this.f42718c = i;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaStoreSignature mediaStoreSignature = (MediaStoreSignature) obj;
        if (this.f42717b == mediaStoreSignature.f42717b && this.f42718c == mediaStoreSignature.f42718c && this.f42716a.equals(mediaStoreSignature.f42716a)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        long j = this.f42717b;
        return (((this.f42716a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f42718c;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f42717b).putInt(this.f42718c).array());
        messageDigest.update(this.f42716a.getBytes(Key.CHARSET));
    }
}