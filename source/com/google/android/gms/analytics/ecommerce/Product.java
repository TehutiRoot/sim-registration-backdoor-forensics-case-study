package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.analytics.zzd;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes3.dex */
public class Product {

    /* renamed from: a */
    public final Map f44394a = new HashMap();

    /* renamed from: a */
    public final void m48744a(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.f44394a.put(str, str2);
    }

    @NonNull
    public Product setBrand(@NonNull String str) {
        m48744a("br", str);
        return this;
    }

    @NonNull
    public Product setCategory(@NonNull String str) {
        m48744a("ca", str);
        return this;
    }

    @NonNull
    public Product setCouponCode(@NonNull String str) {
        m48744a("cc", str);
        return this;
    }

    @NonNull
    public Product setCustomDimension(int i, @NonNull String str) {
        m48744a(zzd.zzc(i), str);
        return this;
    }

    @NonNull
    public Product setCustomMetric(int i, int i2) {
        m48744a(zzd.zzf(i), Integer.toString(i2));
        return this;
    }

    @NonNull
    public Product setId(@NonNull String str) {
        m48744a("id", str);
        return this;
    }

    @NonNull
    public Product setName(@NonNull String str) {
        m48744a("nm", str);
        return this;
    }

    @NonNull
    public Product setPosition(int i) {
        m48744a("ps", Integer.toString(i));
        return this;
    }

    @NonNull
    public Product setPrice(double d) {
        m48744a("pr", Double.toString(d));
        return this;
    }

    @NonNull
    public Product setQuantity(int i) {
        m48744a("qt", Integer.toString(i));
        return this;
    }

    @NonNull
    public Product setVariant(@NonNull String str) {
        m48744a("va", str);
        return this;
    }

    @NonNull
    public String toString() {
        return zzj.zzb(this.f44394a);
    }

    @NonNull
    public final Map zza(@NonNull String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f44394a.entrySet()) {
            hashMap.put(str.concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        return hashMap;
    }
}
