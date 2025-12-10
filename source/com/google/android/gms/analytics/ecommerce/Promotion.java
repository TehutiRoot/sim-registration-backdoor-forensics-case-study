package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes3.dex */
public class Promotion {
    @NonNull
    public static final String ACTION_CLICK = "click";
    @NonNull
    public static final String ACTION_VIEW = "view";

    /* renamed from: a */
    public final Map f44396a = new HashMap();

    /* renamed from: a */
    public final void m48742a(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.f44396a.put(str, str2);
    }

    @NonNull
    public Promotion setCreative(@NonNull String str) {
        m48742a("cr", str);
        return this;
    }

    @NonNull
    public Promotion setId(@NonNull String str) {
        m48742a("id", str);
        return this;
    }

    @NonNull
    public Promotion setName(@NonNull String str) {
        m48742a("nm", str);
        return this;
    }

    @NonNull
    public Promotion setPosition(@NonNull String str) {
        m48742a("ps", str);
        return this;
    }

    @NonNull
    public String toString() {
        return zzj.zzb(this.f44396a);
    }

    @NonNull
    public final Map zza(@NonNull String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f44396a.entrySet()) {
            hashMap.put(str.concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        return hashMap;
    }
}
