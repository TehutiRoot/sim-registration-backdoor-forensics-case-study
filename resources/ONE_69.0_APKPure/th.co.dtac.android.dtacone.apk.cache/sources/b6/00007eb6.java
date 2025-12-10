package com.airbnb.lottie;

import androidx.annotation.NonNull;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import java.io.File;

/* loaded from: classes3.dex */
public class LottieConfig {

    /* renamed from: a */
    public final LottieNetworkFetcher f40946a;

    /* renamed from: b */
    public final LottieNetworkCacheProvider f40947b;

    /* renamed from: c */
    public final boolean f40948c;

    /* renamed from: d */
    public final boolean f40949d;

    /* renamed from: e */
    public final boolean f40950e;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public LottieNetworkFetcher f40951a;

        /* renamed from: b */
        public LottieNetworkCacheProvider f40952b;

        /* renamed from: c */
        public boolean f40953c = false;

        /* renamed from: d */
        public boolean f40954d = true;

        /* renamed from: e */
        public boolean f40955e = true;

        /* renamed from: com.airbnb.lottie.LottieConfig$Builder$a */
        /* loaded from: classes3.dex */
        public class C5652a implements LottieNetworkCacheProvider {

            /* renamed from: a */
            public final /* synthetic */ File f40956a;

            public C5652a(File file) {
                this.f40956a = file;
            }

            @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
            public File getCacheDir() {
                if (this.f40956a.isDirectory()) {
                    return this.f40956a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* renamed from: com.airbnb.lottie.LottieConfig$Builder$b */
        /* loaded from: classes3.dex */
        public class C5653b implements LottieNetworkCacheProvider {

            /* renamed from: a */
            public final /* synthetic */ LottieNetworkCacheProvider f40958a;

            public C5653b(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
                this.f40958a = lottieNetworkCacheProvider;
            }

            @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
            public File getCacheDir() {
                File cacheDir = this.f40958a.getCacheDir();
                if (cacheDir.isDirectory()) {
                    return cacheDir;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @NonNull
        public LottieConfig build() {
            return new LottieConfig(this.f40951a, this.f40952b, this.f40953c, this.f40954d, this.f40955e);
        }

        @NonNull
        public Builder setDisablePathInterpolatorCache(boolean z) {
            this.f40955e = z;
            return this;
        }

        @NonNull
        public Builder setEnableNetworkCache(boolean z) {
            this.f40954d = z;
            return this;
        }

        @NonNull
        public Builder setEnableSystraceMarkers(boolean z) {
            this.f40953c = z;
            return this;
        }

        @NonNull
        public Builder setNetworkCacheDir(@NonNull File file) {
            if (this.f40952b == null) {
                this.f40952b = new C5652a(file);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @NonNull
        public Builder setNetworkCacheProvider(@NonNull LottieNetworkCacheProvider lottieNetworkCacheProvider) {
            if (this.f40952b == null) {
                this.f40952b = new C5653b(lottieNetworkCacheProvider);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @NonNull
        public Builder setNetworkFetcher(@NonNull LottieNetworkFetcher lottieNetworkFetcher) {
            this.f40951a = lottieNetworkFetcher;
            return this;
        }
    }

    public LottieConfig(LottieNetworkFetcher lottieNetworkFetcher, LottieNetworkCacheProvider lottieNetworkCacheProvider, boolean z, boolean z2, boolean z3) {
        this.f40946a = lottieNetworkFetcher;
        this.f40947b = lottieNetworkCacheProvider;
        this.f40948c = z;
        this.f40949d = z2;
        this.f40950e = z3;
    }
}