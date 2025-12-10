package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.p005os.TraceCompat;
import com.airbnb.lottie.network.DefaultLottieNetworkFetcher;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.network.NetworkFetcher;
import java.io.File;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.L */
/* loaded from: classes3.dex */
public class C5655L {
    public static boolean DBG = false;
    public static final String TAG = "LOTTIE";

    /* renamed from: a */
    public static boolean f40877a = false;

    /* renamed from: b */
    public static boolean f40878b = true;

    /* renamed from: c */
    public static boolean f40879c = true;

    /* renamed from: d */
    public static String[] f40880d;

    /* renamed from: e */
    public static long[] f40881e;

    /* renamed from: f */
    public static int f40882f;

    /* renamed from: g */
    public static int f40883g;

    /* renamed from: h */
    public static LottieNetworkFetcher f40884h;

    /* renamed from: i */
    public static LottieNetworkCacheProvider f40885i;

    /* renamed from: j */
    public static volatile NetworkFetcher f40886j;

    /* renamed from: k */
    public static volatile NetworkCache f40887k;

    /* renamed from: com.airbnb.lottie.L$a */
    /* loaded from: classes3.dex */
    public class C5656a implements LottieNetworkCacheProvider {

        /* renamed from: a */
        public final /* synthetic */ Context f40888a;

        public C5656a(Context context) {
            this.f40888a = context;
        }

        @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
        public File getCacheDir() {
            return new File(this.f40888a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void beginSection(String str) {
        if (!f40877a) {
            return;
        }
        int i = f40882f;
        if (i == 20) {
            f40883g++;
            return;
        }
        f40880d[i] = str;
        f40881e[i] = System.nanoTime();
        TraceCompat.beginSection(str);
        f40882f++;
    }

    public static float endSection(String str) {
        int i = f40883g;
        if (i > 0) {
            f40883g = i - 1;
            return 0.0f;
        } else if (!f40877a) {
            return 0.0f;
        } else {
            int i2 = f40882f - 1;
            f40882f = i2;
            if (i2 != -1) {
                if (str.equals(f40880d[i2])) {
                    TraceCompat.endSection();
                    return ((float) (System.nanoTime() - f40881e[f40882f])) / 1000000.0f;
                }
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f40880d[f40882f] + ".");
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
    }

    public static boolean getDisablePathInterpolatorCache() {
        return f40879c;
    }

    @Nullable
    public static NetworkCache networkCache(@NonNull Context context) {
        if (!f40878b) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        NetworkCache networkCache = f40887k;
        if (networkCache == null) {
            synchronized (NetworkCache.class) {
                try {
                    networkCache = f40887k;
                    if (networkCache == null) {
                        LottieNetworkCacheProvider lottieNetworkCacheProvider = f40885i;
                        if (lottieNetworkCacheProvider == null) {
                            lottieNetworkCacheProvider = new C5656a(applicationContext);
                        }
                        networkCache = new NetworkCache(lottieNetworkCacheProvider);
                        f40887k = networkCache;
                    }
                } finally {
                }
            }
        }
        return networkCache;
    }

    @NonNull
    public static NetworkFetcher networkFetcher(@NonNull Context context) {
        NetworkFetcher networkFetcher = f40886j;
        if (networkFetcher == null) {
            synchronized (NetworkFetcher.class) {
                try {
                    networkFetcher = f40886j;
                    if (networkFetcher == null) {
                        NetworkCache networkCache = networkCache(context);
                        LottieNetworkFetcher lottieNetworkFetcher = f40884h;
                        if (lottieNetworkFetcher == null) {
                            lottieNetworkFetcher = new DefaultLottieNetworkFetcher();
                        }
                        networkFetcher = new NetworkFetcher(networkCache, lottieNetworkFetcher);
                        f40886j = networkFetcher;
                    }
                } finally {
                }
            }
        }
        return networkFetcher;
    }

    public static void setCacheProvider(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        f40885i = lottieNetworkCacheProvider;
    }

    public static void setDisablePathInterpolatorCache(boolean z) {
        f40879c = z;
    }

    public static void setFetcher(LottieNetworkFetcher lottieNetworkFetcher) {
        f40884h = lottieNetworkFetcher;
    }

    public static void setNetworkCacheEnabled(boolean z) {
        f40878b = z;
    }

    public static void setTraceEnabled(boolean z) {
        if (f40877a == z) {
            return;
        }
        f40877a = z;
        if (z) {
            f40880d = new String[20];
            f40881e = new long[20];
        }
    }
}
