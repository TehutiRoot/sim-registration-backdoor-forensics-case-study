package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
/* loaded from: classes3.dex */
public class HashAccumulator {

    /* renamed from: a */
    public int f44548a = 1;

    @NonNull
    @CanIgnoreReturnValue
    @KeepForSdk
    public HashAccumulator addObject(@Nullable Object obj) {
        int hashCode;
        int i = this.f44548a * 31;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.f44548a = i + hashCode;
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.f44548a;
    }

    @NonNull
    @CanIgnoreReturnValue
    public final HashAccumulator zaa(boolean z) {
        this.f44548a = (this.f44548a * 31) + (z ? 1 : 0);
        return this;
    }
}
