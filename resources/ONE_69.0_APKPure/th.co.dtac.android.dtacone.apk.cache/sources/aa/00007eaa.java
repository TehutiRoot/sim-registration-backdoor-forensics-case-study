package com.airbnb.lottie;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class Lottie {
    public static void initialize(@NonNull LottieConfig lottieConfig) {
        C5644L.setFetcher(lottieConfig.f40946a);
        C5644L.setCacheProvider(lottieConfig.f40947b);
        C5644L.setTraceEnabled(lottieConfig.f40948c);
        C5644L.setNetworkCacheEnabled(lottieConfig.f40949d);
        C5644L.setNetworkCacheEnabled(lottieConfig.f40949d);
        C5644L.setDisablePathInterpolatorCache(lottieConfig.f40950e);
    }
}