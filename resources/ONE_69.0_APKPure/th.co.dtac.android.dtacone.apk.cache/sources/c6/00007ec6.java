package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class LottieResult<V> {

    /* renamed from: a */
    public final Object f41008a;

    /* renamed from: b */
    public final Throwable f41009b;

    public LottieResult(V v) {
        this.f41008a = v;
        this.f41009b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        if (getValue() != null && getValue().equals(lottieResult.getValue())) {
            return true;
        }
        if (getException() == null || lottieResult.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    @Nullable
    public Throwable getException() {
        return this.f41009b;
    }

    @Nullable
    public V getValue() {
        return (V) this.f41008a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }

    public LottieResult(Throwable th2) {
        this.f41009b = th2;
        this.f41008a = null;
    }
}