package com.airbnb.lottie;

import androidx.annotation.NonNull;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import java.io.File;

/* loaded from: classes3.dex */
public class LottieConfig {

    /* renamed from: a */
    public final LottieNetworkFetcher f40934a;

    /* renamed from: b */
    public final LottieNetworkCacheProvider f40935b;

    /* renamed from: c */
    public final boolean f40936c;

    /* renamed from: d */
    public final boolean f40937d;

    /* renamed from: e */
    public final boolean f40938e;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public LottieNetworkFetcher f40939a;

        /* renamed from: b */
        public LottieNetworkCacheProvider f40940b;

        /* renamed from: c */
        public boolean f40941c = false;

        /* renamed from: d */
        public boolean f40942d = true;

        /* renamed from: e */
        public boolean f40943e = true;

        /* renamed from: com.airbnb.lottie.LottieConfig$Builder$a */
        /* loaded from: classes3.dex */
        public class C5663a implements LottieNetworkCacheProvider {

            /* renamed from: a */
            public final /* synthetic */ File f40944a;

            public C5663a(File file) {
                this.f40944a = file;
            }

            @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
            public File getCacheDir() {
                if (this.f40944a.isDirectory()) {
                    return this.f40944a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* renamed from: com.airbnb.lottie.LottieConfig$Builder$b */
        /* loaded from: classes3.dex */
        public class C5664b implements LottieNetworkCacheProvider {

            /* renamed from: a */
            public final /* synthetic */ LottieNetworkCacheProvider f40946a;

            public C5664b(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
                this.f40946a = lottieNetworkCacheProvider;
            }

            @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
            public File getCacheDir() {
                File cacheDir = this.f40946a.getCacheDir();
                if (cacheDir.isDirectory()) {
                    return cacheDir;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @NonNull
        public LottieConfig build() {
            return new LottieConfig(this.f40939a, this.f40940b, this.f40941c, this.f40942d, this.f40943e);
        }

        @NonNull
        public Builder setDisablePathInterpolatorCache(boolean z) {
            this.f40943e = z;
            return this;
        }

        @NonNull
        public Builder setEnableNetworkCache(boolean z) {
            this.f40942d = z;
            return this;
        }

        @NonNull
        public Builder setEnableSystraceMarkers(boolean z) {
            this.f40941c = z;
            return this;
        }

        @NonNull
        public Builder setNetworkCacheDir(@NonNull File file) {
            if (this.f40940b == null) {
                this.f40940b = new C5663a(file);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @NonNull
        public Builder setNetworkCacheProvider(@NonNull LottieNetworkCacheProvider lottieNetworkCacheProvider) {
            if (this.f40940b == null) {
                this.f40940b = new C5664b(lottieNetworkCacheProvider);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @NonNull
        public Builder setNetworkFetcher(@NonNull LottieNetworkFetcher lottieNetworkFetcher) {
            this.f40939a = lottieNetworkFetcher;
            return this;
        }
    }

    public LottieConfig(LottieNetworkFetcher lottieNetworkFetcher, LottieNetworkCacheProvider lottieNetworkCacheProvider, boolean z, boolean z2, boolean z3) {
        this.f40934a = lottieNetworkFetcher;
        this.f40935b = lottieNetworkCacheProvider;
        this.f40936c = z;
        this.f40937d = z2;
        this.f40938e = z3;
    }
}
