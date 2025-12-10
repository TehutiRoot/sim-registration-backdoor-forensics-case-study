package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class ObjectKey implements Key {

    /* renamed from: a */
    public final Object f42719a;

    public ObjectKey(@NonNull Object obj) {
        this.f42719a = Preconditions.checkNotNull(obj);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.f42719a.equals(((ObjectKey) obj).f42719a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f42719a.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f42719a + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f42719a.toString().getBytes(Key.CHARSET));
    }
}