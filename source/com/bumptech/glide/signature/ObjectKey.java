package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class ObjectKey implements Key {

    /* renamed from: a */
    public final Object f42707a;

    public ObjectKey(@NonNull Object obj) {
        this.f42707a = Preconditions.checkNotNull(obj);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.f42707a.equals(((ObjectKey) obj).f42707a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f42707a.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f42707a + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f42707a.toString().getBytes(Key.CHARSET));
    }
}
