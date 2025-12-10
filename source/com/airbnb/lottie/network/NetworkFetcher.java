package com.airbnb.lottie.network;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.utils.Logger;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class NetworkFetcher {

    /* renamed from: a */
    public final NetworkCache f41522a;

    /* renamed from: b */
    public final LottieNetworkFetcher f41523b;

    public NetworkFetcher(@Nullable NetworkCache networkCache, @NonNull LottieNetworkFetcher lottieNetworkFetcher) {
        this.f41522a = networkCache;
        this.f41523b = lottieNetworkFetcher;
    }

    /* renamed from: a */
    public final LottieComposition m50723a(Context context, String str, String str2) {
        NetworkCache networkCache;
        Pair m50729a;
        LottieResult<LottieComposition> fromJsonInputStreamSync;
        if (str2 == null || (networkCache = this.f41522a) == null || (m50729a = networkCache.m50729a(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) m50729a.first;
        InputStream inputStream = (InputStream) m50729a.second;
        if (fileExtension == FileExtension.ZIP) {
            fromJsonInputStreamSync = LottieCompositionFactory.fromZipStreamSync(context, new ZipInputStream(inputStream), str2);
        } else {
            fromJsonInputStreamSync = LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str2);
        }
        if (fromJsonInputStreamSync.getValue() != null) {
            return fromJsonInputStreamSync.getValue();
        }
        return null;
    }

    /* renamed from: b */
    public final LottieResult m50722b(Context context, String str, String str2) {
        boolean z;
        Logger.debug("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                LottieFetchResult fetchSync = this.f41523b.fetchSync(str);
                if (fetchSync.isSuccessful()) {
                    LottieResult m50721c = m50721c(context, str, fetchSync.bodyByteStream(), fetchSync.contentType(), str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    if (m50721c.getValue() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    Logger.debug(sb.toString());
                    try {
                        fetchSync.close();
                    } catch (IOException e) {
                        Logger.warning("LottieFetchResult close failed ", e);
                    }
                    return m50721c;
                }
                LottieResult lottieResult = new LottieResult((Throwable) new IllegalArgumentException(fetchSync.error()));
                try {
                    fetchSync.close();
                } catch (IOException e2) {
                    Logger.warning("LottieFetchResult close failed ", e2);
                }
                return lottieResult;
            } catch (Exception e3) {
                LottieResult lottieResult2 = new LottieResult((Throwable) e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        Logger.warning("LottieFetchResult close failed ", e4);
                    }
                }
                return lottieResult2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    Logger.warning("LottieFetchResult close failed ", e5);
                }
            }
            throw th2;
        }
    }

    /* renamed from: c */
    public final LottieResult m50721c(Context context, String str, InputStream inputStream, String str2, String str3) {
        LottieResult m50719e;
        FileExtension fileExtension;
        NetworkCache networkCache;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            Logger.debug("Received json response.");
            fileExtension = FileExtension.JSON;
            m50719e = m50720d(str, inputStream, str3);
        } else {
            Logger.debug("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            m50719e = m50719e(context, str, inputStream, str3);
            fileExtension = fileExtension2;
        }
        if (str3 != null && m50719e.getValue() != null && (networkCache = this.f41522a) != null) {
            networkCache.m50725e(str, fileExtension);
        }
        return m50719e;
    }

    /* renamed from: d */
    public final LottieResult m50720d(String str, InputStream inputStream, String str2) {
        NetworkCache networkCache;
        if (str2 != null && (networkCache = this.f41522a) != null) {
            return LottieCompositionFactory.fromJsonInputStreamSync(new FileInputStream(networkCache.m50724f(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
        }
        return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null);
    }

    /* renamed from: e */
    public final LottieResult m50719e(Context context, String str, InputStream inputStream, String str2) {
        NetworkCache networkCache;
        if (str2 != null && (networkCache = this.f41522a) != null) {
            return LottieCompositionFactory.fromZipStreamSync(context, new ZipInputStream(new FileInputStream(networkCache.m50724f(str, inputStream, FileExtension.ZIP))), str);
        }
        return LottieCompositionFactory.fromZipStreamSync(context, new ZipInputStream(inputStream), null);
    }

    @NonNull
    @WorkerThread
    public LottieResult<LottieComposition> fetchSync(Context context, @NonNull String str, @Nullable String str2) {
        LottieComposition m50723a = m50723a(context, str, str2);
        if (m50723a != null) {
            return new LottieResult<>(m50723a);
        }
        Logger.debug("Animation for " + str + " not found in cache. Fetching from network.");
        return m50722b(context, str, str2);
    }
}
