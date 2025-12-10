package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public class MediaStoreSignature implements Key {

    /* renamed from: a */
    public final String f42704a;

    /* renamed from: b */
    public final long f42705b;

    /* renamed from: c */
    public final int f42706c;

    public MediaStoreSignature(@Nullable String str, long j, int i) {
        this.f42704a = str == null ? "" : str;
        this.f42705b = j;
        this.f42706c = i;
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
        if (this.f42705b == mediaStoreSignature.f42705b && this.f42706c == mediaStoreSignature.f42706c && this.f42704a.equals(mediaStoreSignature.f42704a)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        long j = this.f42705b;
        return (((this.f42704a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f42706c;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f42705b).putInt(this.f42706c).array());
        messageDigest.update(this.f42704a.getBytes(Key.CHARSET));
    }
}
