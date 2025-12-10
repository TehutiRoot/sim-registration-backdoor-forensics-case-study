package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* loaded from: classes3.dex */
public class RequestOptions extends BaseRequestOptions<RequestOptions> {

    /* renamed from: A */
    public static RequestOptions f42580A;

    /* renamed from: B */
    public static RequestOptions f42581B;

    /* renamed from: C */
    public static RequestOptions f42582C;

    /* renamed from: D */
    public static RequestOptions f42583D;

    /* renamed from: E */
    public static RequestOptions f42584E;

    /* renamed from: F */
    public static RequestOptions f42585F;

    /* renamed from: G */
    public static RequestOptions f42586G;

    /* renamed from: H */
    public static RequestOptions f42587H;

    @NonNull
    @CheckResult
    public static RequestOptions bitmapTransform(@NonNull Transformation<Bitmap> transformation) {
        return new RequestOptions().transform(transformation);
    }

    @NonNull
    @CheckResult
    public static RequestOptions centerCropTransform() {
        if (f42584E == null) {
            f42584E = new RequestOptions().centerCrop().autoClone();
        }
        return f42584E;
    }

    @NonNull
    @CheckResult
    public static RequestOptions centerInsideTransform() {
        if (f42583D == null) {
            f42583D = new RequestOptions().centerInside().autoClone();
        }
        return f42583D;
    }

    @NonNull
    @CheckResult
    public static RequestOptions circleCropTransform() {
        if (f42585F == null) {
            f42585F = new RequestOptions().circleCrop().autoClone();
        }
        return f42585F;
    }

    @NonNull
    @CheckResult
    public static RequestOptions decodeTypeOf(@NonNull Class<?> cls) {
        return new RequestOptions().decode(cls);
    }

    @NonNull
    @CheckResult
    public static RequestOptions diskCacheStrategyOf(@NonNull DiskCacheStrategy diskCacheStrategy) {
        return new RequestOptions().diskCacheStrategy(diskCacheStrategy);
    }

    @NonNull
    @CheckResult
    public static RequestOptions downsampleOf(@NonNull DownsampleStrategy downsampleStrategy) {
        return new RequestOptions().downsample(downsampleStrategy);
    }

    @NonNull
    @CheckResult
    public static RequestOptions encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
        return new RequestOptions().encodeFormat(compressFormat);
    }

    @NonNull
    @CheckResult
    public static RequestOptions encodeQualityOf(@IntRange(from = 0, m64742to = 100) int i) {
        return new RequestOptions().encodeQuality(i);
    }

    @NonNull
    @CheckResult
    public static RequestOptions errorOf(@Nullable Drawable drawable) {
        return new RequestOptions().error(drawable);
    }

    @NonNull
    @CheckResult
    public static RequestOptions fitCenterTransform() {
        if (f42582C == null) {
            f42582C = new RequestOptions().fitCenter().autoClone();
        }
        return f42582C;
    }

    @NonNull
    @CheckResult
    public static RequestOptions formatOf(@NonNull DecodeFormat decodeFormat) {
        return new RequestOptions().format(decodeFormat);
    }

    @NonNull
    @CheckResult
    public static RequestOptions frameOf(@IntRange(from = 0) long j) {
        return new RequestOptions().frame(j);
    }

    @NonNull
    @CheckResult
    public static RequestOptions noAnimation() {
        if (f42587H == null) {
            f42587H = new RequestOptions().dontAnimate().autoClone();
        }
        return f42587H;
    }

    @NonNull
    @CheckResult
    public static RequestOptions noTransformation() {
        if (f42586G == null) {
            f42586G = new RequestOptions().dontTransform().autoClone();
        }
        return f42586G;
    }

    @NonNull
    @CheckResult
    public static <T> RequestOptions option(@NonNull Option<T> option, @NonNull T t) {
        return new RequestOptions().set(option, t);
    }

    @NonNull
    @CheckResult
    public static RequestOptions overrideOf(int i, int i2) {
        return new RequestOptions().override(i, i2);
    }

    @NonNull
    @CheckResult
    public static RequestOptions placeholderOf(@Nullable Drawable drawable) {
        return new RequestOptions().placeholder(drawable);
    }

    @NonNull
    @CheckResult
    public static RequestOptions priorityOf(@NonNull Priority priority) {
        return new RequestOptions().priority(priority);
    }

    @NonNull
    @CheckResult
    public static RequestOptions signatureOf(@NonNull Key key) {
        return new RequestOptions().signature(key);
    }

    @NonNull
    @CheckResult
    public static RequestOptions sizeMultiplierOf(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        return new RequestOptions().sizeMultiplier(f);
    }

    @NonNull
    @CheckResult
    public static RequestOptions skipMemoryCacheOf(boolean z) {
        if (z) {
            if (f42580A == null) {
                f42580A = new RequestOptions().skipMemoryCache(true).autoClone();
            }
            return f42580A;
        }
        if (f42581B == null) {
            f42581B = new RequestOptions().skipMemoryCache(false).autoClone();
        }
        return f42581B;
    }

    @NonNull
    @CheckResult
    public static RequestOptions timeoutOf(@IntRange(from = 0) int i) {
        return new RequestOptions().timeout(i);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(Object obj) {
        if ((obj instanceof RequestOptions) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    @CheckResult
    public static RequestOptions errorOf(@DrawableRes int i) {
        return new RequestOptions().error(i);
    }

    @NonNull
    @CheckResult
    public static RequestOptions overrideOf(int i) {
        return overrideOf(i, i);
    }

    @NonNull
    @CheckResult
    public static RequestOptions placeholderOf(@DrawableRes int i) {
        return new RequestOptions().placeholder(i);
    }
}
