package com.google.android.gms.analytics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.gtm.zzfc;
import com.google.android.gms.internal.gtm.zzfu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes3.dex */
public class HitBuilders {

    @VisibleForTesting
    @Deprecated
    /* loaded from: classes3.dex */
    public static class AppViewBuilder extends HitBuilder<AppViewBuilder> {
        public AppViewBuilder() {
            set("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder addImpression(@Nullable Product product, @Nullable String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder addProduct(@Nullable Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder addPromotion(@Nullable Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static class ExceptionBuilder extends HitBuilder<ExceptionBuilder> {
        public ExceptionBuilder() {
            set("&t", "exception");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder addImpression(@Nullable Product product, @Nullable String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder addProduct(@Nullable Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder addPromotion(@Nullable Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public ExceptionBuilder setDescription(@NonNull String str) {
            set("&exd", str);
            return this;
        }

        @NonNull
        public ExceptionBuilder setFatal(boolean z) {
            set("&exf", zzfu.zzc(z));
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static class HitBuilder<T extends HitBuilder> {

        /* renamed from: b */
        public ProductAction f44382b;

        /* renamed from: a */
        public final Map f44381a = new HashMap();

        /* renamed from: c */
        public final Map f44383c = new HashMap();

        /* renamed from: d */
        public final List f44384d = new ArrayList();

        /* renamed from: e */
        public final List f44385e = new ArrayList();

        /* renamed from: a */
        public final HitBuilder m48759a(String str, String str2) {
            if (str2 != null) {
                this.f44381a.put(str, str2);
            }
            return this;
        }

        @NonNull
        public T addImpression(@Nullable Product product, @Nullable String str) {
            if (product == null) {
                zzfc.zze("product should be non-null");
                return this;
            }
            if (str == null) {
                str = "";
            }
            if (!this.f44383c.containsKey(str)) {
                this.f44383c.put(str, new ArrayList());
            }
            ((List) this.f44383c.get(str)).add(product);
            return this;
        }

        @NonNull
        public T addProduct(@Nullable Product product) {
            if (product == null) {
                zzfc.zze("product should be non-null");
                return this;
            }
            this.f44385e.add(product);
            return this;
        }

        @NonNull
        public T addPromotion(@Nullable Promotion promotion) {
            if (promotion == null) {
                zzfc.zze("promotion should be non-null");
                return this;
            }
            this.f44384d.add(promotion);
            return this;
        }

        @NonNull
        public Map<String, String> build() {
            HashMap hashMap = new HashMap(this.f44381a);
            ProductAction productAction = this.f44382b;
            if (productAction != null) {
                hashMap.putAll(productAction.zza());
            }
            int i = 1;
            for (Promotion promotion : this.f44384d) {
                hashMap.putAll(promotion.zza(zzd.zzl(i)));
                i++;
            }
            int i2 = 1;
            for (Product product : this.f44385e) {
                hashMap.putAll(product.zza(zzd.zzj(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry entry : this.f44383c.entrySet()) {
                String zzg = zzd.zzg(i3);
                int i4 = 1;
                for (Product product2 : (List) entry.getValue()) {
                    hashMap.putAll(product2.zza(zzg.concat(zzd.zzi(i4))));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    hashMap.put(zzg.concat("nm"), (String) entry.getKey());
                }
                i3++;
            }
            return hashMap;
        }

        @Nullable
        @VisibleForTesting
        public String get(@NonNull String str) {
            return (String) this.f44381a.get(str);
        }

        @NonNull
        public final T set(@Nullable String str, @Nullable String str2) {
            if (str != null) {
                this.f44381a.put(str, str2);
            } else {
                zzfc.zze("HitBuilder.set() called with a null paramName.");
            }
            return this;
        }

        @NonNull
        public final T setAll(@Nullable Map<String, String> map) {
            if (map == null) {
                return this;
            }
            this.f44381a.putAll(new HashMap(map));
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0034, code lost:
            if (r15.contains("=") == false) goto L30;
         */
        @androidx.annotation.NonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T setCampaignParamsFromUrl(@androidx.annotation.NonNull java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.HitBuilders.HitBuilder.setCampaignParamsFromUrl(java.lang.String):com.google.android.gms.analytics.HitBuilders$HitBuilder");
        }

        @NonNull
        public T setCustomDimension(int i, @NonNull String str) {
            set(zzd.zza(i), str);
            return this;
        }

        @NonNull
        public T setCustomMetric(int i, float f) {
            set(zzd.zzd(i), Float.toString(f));
            return this;
        }

        @NonNull
        public T setHitType(@NonNull String str) {
            set("&t", str);
            return this;
        }

        @NonNull
        public T setNewSession() {
            set("&sc", "start");
            return this;
        }

        @NonNull
        public T setNonInteraction(boolean z) {
            set("&ni", zzfu.zzc(z));
            return this;
        }

        @NonNull
        public T setProductAction(@NonNull ProductAction productAction) {
            this.f44382b = productAction;
            return this;
        }

        @NonNull
        public T setPromotionAction(@NonNull String str) {
            this.f44381a.put("&promoa", str);
            return this;
        }
    }

    @VisibleForTesting
    @Deprecated
    /* loaded from: classes3.dex */
    public static class ItemBuilder extends HitBuilder<ItemBuilder> {
        public ItemBuilder() {
            set("&t", "item");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder addImpression(@Nullable Product product, @Nullable String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder addProduct(@Nullable Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder addPromotion(@Nullable Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public ItemBuilder setCategory(@NonNull String str) {
            set("&iv", str);
            return this;
        }

        @NonNull
        public ItemBuilder setCurrencyCode(@NonNull String str) {
            set("&cu", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public ItemBuilder setName(@NonNull String str) {
            set("&in", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @NonNull
        public ItemBuilder setPrice(double d) {
            set("&ip", Double.toString(d));
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public ItemBuilder setQuantity(long j) {
            set("&iq", Long.toString(j));
            return this;
        }

        @NonNull
        public ItemBuilder setSku(@NonNull String str) {
            set("&ic", str);
            return this;
        }

        @NonNull
        public ItemBuilder setTransactionId(@NonNull String str) {
            set("&ti", str);
            return this;
        }
    }

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static class ScreenViewBuilder extends HitBuilder<ScreenViewBuilder> {
        public ScreenViewBuilder() {
            set("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder addImpression(@Nullable Product product, @Nullable String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder addProduct(@Nullable Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder addPromotion(@Nullable Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static class SocialBuilder extends HitBuilder<SocialBuilder> {
        public SocialBuilder() {
            set("&t", NotificationCompat.CATEGORY_SOCIAL);
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder addImpression(@Nullable Product product, @Nullable String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder addProduct(@Nullable Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder addPromotion(@Nullable Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @NonNull
        public SocialBuilder setAction(@NonNull String str) {
            set("&sa", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public SocialBuilder setNetwork(@NonNull String str) {
            set("&sn", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public SocialBuilder setTarget(@NonNull String str) {
            set("&st", str);
            return this;
        }
    }

    @VisibleForTesting
    @Deprecated
    /* loaded from: classes3.dex */
    public static class TransactionBuilder extends HitBuilder<TransactionBuilder> {
        public TransactionBuilder() {
            set("&t", "transaction");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder addImpression(@Nullable Product product, @Nullable String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder addProduct(@Nullable Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder addPromotion(@Nullable Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @NonNull
        public TransactionBuilder setAffiliation(@NonNull String str) {
            set("&ta", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public TransactionBuilder setCurrencyCode(@NonNull String str) {
            set("&cu", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public TransactionBuilder setRevenue(double d) {
            set("&tr", Double.toString(d));
            return this;
        }

        @NonNull
        public TransactionBuilder setShipping(double d) {
            set("&ts", Double.toString(d));
            return this;
        }

        @NonNull
        public TransactionBuilder setTax(double d) {
            set("&tt", Double.toString(d));
            return this;
        }

        @NonNull
        public TransactionBuilder setTransactionId(@NonNull String str) {
            set("&ti", str);
            return this;
        }
    }

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static class EventBuilder extends HitBuilder<EventBuilder> {
        public EventBuilder() {
            set("&t", "event");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder addImpression(@Nullable Product product, @Nullable String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder addProduct(@Nullable Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder addPromotion(@Nullable Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @NonNull
        public EventBuilder setAction(@NonNull String str) {
            set("&ea", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public EventBuilder setCategory(@NonNull String str) {
            set("&ec", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public EventBuilder setLabel(@NonNull String str) {
            set("&el", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public EventBuilder setValue(long j) {
            set("&ev", Long.toString(j));
            return this;
        }

        public EventBuilder(@NonNull String str, @NonNull String str2) {
            this();
            setCategory(str);
            setAction(str2);
        }
    }

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static class TimingBuilder extends HitBuilder<TimingBuilder> {
        public TimingBuilder() {
            set("&t", "timing");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder addImpression(@Nullable Product product, @Nullable String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder addProduct(@Nullable Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder addPromotion(@Nullable Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public TimingBuilder setCategory(@NonNull String str) {
            set("&utc", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public TimingBuilder setLabel(@NonNull String str) {
            set("&utl", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public TimingBuilder setValue(long j) {
            set("&utt", Long.toString(j));
            return this;
        }

        @NonNull
        public TimingBuilder setVariable(@NonNull String str) {
            set("&utv", str);
            return this;
        }

        public TimingBuilder(@NonNull String str, @NonNull String str2, long j) {
            this();
            setVariable(str2);
            setValue(j);
            setCategory(str);
        }
    }
}
