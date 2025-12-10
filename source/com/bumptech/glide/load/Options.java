package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class Options implements Key {

    /* renamed from: a */
    public final ArrayMap f41845a = new CachedHashCodeArrayMap();

    /* renamed from: a */
    public static void m50502a(Option option, Object obj, MessageDigest messageDigest) {
        option.update(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof Options) {
            return this.f41845a.equals(((Options) obj).f41845a);
        }
        return false;
    }

    @Nullable
    public <T> T get(@NonNull Option<T> option) {
        if (this.f41845a.containsKey(option)) {
            return (T) this.f41845a.get(option);
        }
        return option.getDefaultValue();
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f41845a.hashCode();
    }

    public void putAll(@NonNull Options options) {
        this.f41845a.putAll((SimpleArrayMap) options.f41845a);
    }

    public Options remove(@NonNull Option<?> option) {
        this.f41845a.remove(option);
        return this;
    }

    @NonNull
    public <T> Options set(@NonNull Option<T> option, @NonNull T t) {
        this.f41845a.put(option, t);
        return this;
    }

    public String toString() {
        return "Options{values=" + this.f41845a + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.f41845a.size(); i++) {
            m50502a((Option) this.f41845a.keyAt(i), this.f41845a.valueAt(i), messageDigest);
        }
    }
}
