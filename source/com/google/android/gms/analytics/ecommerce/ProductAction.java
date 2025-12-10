package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes3.dex */
public class ProductAction {
    @NonNull
    public static final String ACTION_ADD = "add";
    @NonNull
    public static final String ACTION_CHECKOUT = "checkout";
    @NonNull
    public static final String ACTION_CHECKOUT_OPTION = "checkout_option";
    @NonNull
    @Deprecated
    public static final String ACTION_CHECKOUT_OPTIONS = "checkout_options";
    @NonNull
    public static final String ACTION_CLICK = "click";
    @NonNull
    public static final String ACTION_DETAIL = "detail";
    @NonNull
    public static final String ACTION_PURCHASE = "purchase";
    @NonNull
    public static final String ACTION_REFUND = "refund";
    @NonNull
    public static final String ACTION_REMOVE = "remove";

    /* renamed from: a */
    public final Map f44395a = new HashMap();

    public ProductAction(@NonNull String str) {
        m48743a("&pa", str);
    }

    /* renamed from: a */
    public final void m48743a(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.f44395a.put(str, str2);
    }

    @NonNull
    public ProductAction setCheckoutOptions(@NonNull String str) {
        m48743a("&col", str);
        return this;
    }

    @NonNull
    public ProductAction setCheckoutStep(int i) {
        m48743a("&cos", Integer.toString(i));
        return this;
    }

    @NonNull
    public ProductAction setProductActionList(@NonNull String str) {
        m48743a("&pal", str);
        return this;
    }

    @NonNull
    public ProductAction setProductListSource(@NonNull String str) {
        m48743a("&pls", str);
        return this;
    }

    @NonNull
    public ProductAction setTransactionAffiliation(@NonNull String str) {
        m48743a("&ta", str);
        return this;
    }

    @NonNull
    public ProductAction setTransactionCouponCode(@NonNull String str) {
        m48743a("&tcc", str);
        return this;
    }

    @NonNull
    public ProductAction setTransactionId(@NonNull String str) {
        m48743a("&ti", str);
        return this;
    }

    @NonNull
    public ProductAction setTransactionRevenue(double d) {
        m48743a("&tr", Double.toString(d));
        return this;
    }

    @NonNull
    public ProductAction setTransactionShipping(double d) {
        m48743a("&ts", Double.toString(d));
        return this;
    }

    @NonNull
    public ProductAction setTransactionTax(double d) {
        m48743a("&tt", Double.toString(d));
        return this;
    }

    @NonNull
    public String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f44395a.entrySet()) {
            if (((String) entry.getKey()).startsWith("&")) {
                hashMap.put(((String) entry.getKey()).substring(1), (String) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return zzj.zzb(hashMap);
    }

    @NonNull
    @VisibleForTesting
    public final Map zza() {
        return new HashMap(this.f44395a);
    }
}
