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
    public final Map f44406a = new HashMap();

    /* renamed from: a */
    public final void m48741a(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.f44406a.put(str, str2);
    }

    @NonNull
    public Product setBrand(@NonNull String str) {
        m48741a("br", str);
        return this;
    }

    @NonNull
    public Product setCategory(@NonNull String str) {
        m48741a("ca", str);
        return this;
    }

    @NonNull
    public Product setCouponCode(@NonNull String str) {
        m48741a("cc", str);
        return this;
    }

    @NonNull
    public Product setCustomDimension(int i, @NonNull String str) {
        m48741a(zzd.zzc(i), str);
        return this;
    }

    @NonNull
    public Product setCustomMetric(int i, int i2) {
        m48741a(zzd.zzf(i), Integer.toString(i2));
        return this;
    }

    @NonNull
    public Product setId(@NonNull String str) {
        m48741a("id", str);
        return this;
    }

    @NonNull
    public Product setName(@NonNull String str) {
        m48741a("nm", str);
        return this;
    }

    @NonNull
    public Product setPosition(int i) {
        m48741a("ps", Integer.toString(i));
        return this;
    }

    @NonNull
    public Product setPrice(double d) {
        m48741a("pr", Double.toString(d));
        return this;
    }

    @NonNull
    public Product setQuantity(int i) {
        m48741a("qt", Integer.toString(i));
        return this;
    }

    @NonNull
    public Product setVariant(@NonNull String str) {
        m48741a("va", str);
        return this;
    }

    @NonNull
    public String toString() {
        return zzj.zzb(this.f44406a);
    }

    @NonNull
    public final Map zza(@NonNull String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f44406a.entrySet()) {
            hashMap.put(str.concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        return hashMap;
    }
}