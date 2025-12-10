package com.airbnb.lottie;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class Lottie {
    public static void initialize(@NonNull LottieConfig lottieConfig) {
        C5655L.setFetcher(lottieConfig.f40934a);
        C5655L.setCacheProvider(lottieConfig.f40935b);
        C5655L.setTraceEnabled(lottieConfig.f40936c);
        C5655L.setNetworkCacheEnabled(lottieConfig.f40937d);
        C5655L.setNetworkCacheEnabled(lottieConfig.f40937d);
        C5655L.setDisablePathInterpolatorCache(lottieConfig.f40938e);
    }
}
