package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import com.airbnb.lottie.LottieComposition;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class LottieCompositionCache {

    /* renamed from: b */
    public static final LottieCompositionCache f41316b = new LottieCompositionCache();

    /* renamed from: a */
    public final LruCache f41317a = new LruCache(20);

    public static LottieCompositionCache getInstance() {
        return f41316b;
    }

    public void clear() {
        this.f41317a.evictAll();
    }

    @Nullable
    public LottieComposition get(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (LottieComposition) this.f41317a.get(str);
    }

    public void put(@Nullable String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.f41317a.put(str, lottieComposition);
    }

    public void resize(int i) {
        this.f41317a.resize(i);
    }
}