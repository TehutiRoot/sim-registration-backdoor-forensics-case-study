package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
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
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.load.resource.gif.GifOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BaseRequestOptions<T extends BaseRequestOptions<T>> implements Cloneable {

    /* renamed from: a */
    public int f42537a;

    /* renamed from: e */
    public Drawable f42541e;

    /* renamed from: f */
    public int f42542f;

    /* renamed from: g */
    public Drawable f42543g;

    /* renamed from: h */
    public int f42544h;

    /* renamed from: m */
    public boolean f42549m;

    /* renamed from: o */
    public Drawable f42551o;

    /* renamed from: p */
    public int f42552p;

    /* renamed from: t */
    public boolean f42556t;

    /* renamed from: u */
    public Resources.Theme f42557u;

    /* renamed from: v */
    public boolean f42558v;

    /* renamed from: w */
    public boolean f42559w;

    /* renamed from: x */
    public boolean f42560x;

    /* renamed from: z */
    public boolean f42562z;

    /* renamed from: b */
    public float f42538b = 1.0f;

    /* renamed from: c */
    public DiskCacheStrategy f42539c = DiskCacheStrategy.AUTOMATIC;

    /* renamed from: d */
    public Priority f42540d = Priority.NORMAL;

    /* renamed from: i */
    public boolean f42545i = true;

    /* renamed from: j */
    public int f42546j = -1;

    /* renamed from: k */
    public int f42547k = -1;

    /* renamed from: l */
    public Key f42548l = EmptySignature.obtain();

    /* renamed from: n */
    public boolean f42550n = true;

    /* renamed from: q */
    public Options f42553q = new Options();

    /* renamed from: r */
    public Map f42554r = new CachedHashCodeArrayMap();

    /* renamed from: s */
    public Class f42555s = Object.class;

    /* renamed from: y */
    public boolean f42561y = true;

    /* renamed from: c */
    public static boolean m50075c(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public boolean m50077a() {
        return this.f42561y;
    }

    @NonNull
    @CheckResult
    public T apply(@NonNull BaseRequestOptions<?> baseRequestOptions) {
        if (this.f42558v) {
            return (T) m74049clone().apply(baseRequestOptions);
        }
        if (m50075c(baseRequestOptions.f42537a, 2)) {
            this.f42538b = baseRequestOptions.f42538b;
        }
        if (m50075c(baseRequestOptions.f42537a, 262144)) {
            this.f42559w = baseRequestOptions.f42559w;
        }
        if (m50075c(baseRequestOptions.f42537a, 1048576)) {
            this.f42562z = baseRequestOptions.f42562z;
        }
        if (m50075c(baseRequestOptions.f42537a, 4)) {
            this.f42539c = baseRequestOptions.f42539c;
        }
        if (m50075c(baseRequestOptions.f42537a, 8)) {
            this.f42540d = baseRequestOptions.f42540d;
        }
        if (m50075c(baseRequestOptions.f42537a, 16)) {
            this.f42541e = baseRequestOptions.f42541e;
            this.f42542f = 0;
            this.f42537a &= -33;
        }
        if (m50075c(baseRequestOptions.f42537a, 32)) {
            this.f42542f = baseRequestOptions.f42542f;
            this.f42541e = null;
            this.f42537a &= -17;
        }
        if (m50075c(baseRequestOptions.f42537a, 64)) {
            this.f42543g = baseRequestOptions.f42543g;
            this.f42544h = 0;
            this.f42537a &= -129;
        }
        if (m50075c(baseRequestOptions.f42537a, 128)) {
            this.f42544h = baseRequestOptions.f42544h;
            this.f42543g = null;
            this.f42537a &= -65;
        }
        if (m50075c(baseRequestOptions.f42537a, 256)) {
            this.f42545i = baseRequestOptions.f42545i;
        }
        if (m50075c(baseRequestOptions.f42537a, 512)) {
            this.f42547k = baseRequestOptions.f42547k;
            this.f42546j = baseRequestOptions.f42546j;
        }
        if (m50075c(baseRequestOptions.f42537a, 1024)) {
            this.f42548l = baseRequestOptions.f42548l;
        }
        if (m50075c(baseRequestOptions.f42537a, 4096)) {
            this.f42555s = baseRequestOptions.f42555s;
        }
        if (m50075c(baseRequestOptions.f42537a, 8192)) {
            this.f42551o = baseRequestOptions.f42551o;
            this.f42552p = 0;
            this.f42537a &= -16385;
        }
        if (m50075c(baseRequestOptions.f42537a, 16384)) {
            this.f42552p = baseRequestOptions.f42552p;
            this.f42551o = null;
            this.f42537a &= -8193;
        }
        if (m50075c(baseRequestOptions.f42537a, 32768)) {
            this.f42557u = baseRequestOptions.f42557u;
        }
        if (m50075c(baseRequestOptions.f42537a, 65536)) {
            this.f42550n = baseRequestOptions.f42550n;
        }
        if (m50075c(baseRequestOptions.f42537a, 131072)) {
            this.f42549m = baseRequestOptions.f42549m;
        }
        if (m50075c(baseRequestOptions.f42537a, 2048)) {
            this.f42554r.putAll(baseRequestOptions.f42554r);
            this.f42561y = baseRequestOptions.f42561y;
        }
        if (m50075c(baseRequestOptions.f42537a, 524288)) {
            this.f42560x = baseRequestOptions.f42560x;
        }
        if (!this.f42550n) {
            this.f42554r.clear();
            int i = this.f42537a;
            this.f42549m = false;
            this.f42537a = i & (-133121);
            this.f42561y = true;
        }
        this.f42537a |= baseRequestOptions.f42537a;
        this.f42553q.putAll(baseRequestOptions.f42553q);
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T autoClone() {
        if (this.f42556t && !this.f42558v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f42558v = true;
        return lock();
    }

    /* renamed from: b */
    public final boolean m50076b(int i) {
        return m50075c(this.f42537a, i);
    }

    @NonNull
    @CheckResult
    public T centerCrop() {
        return (T) m50067k(DownsampleStrategy.CENTER_OUTSIDE, new CenterCrop());
    }

    @NonNull
    @CheckResult
    public T centerInside() {
        return (T) m50071g(DownsampleStrategy.CENTER_INSIDE, new CenterInside());
    }

    @NonNull
    @CheckResult
    public T circleCrop() {
        return (T) m50067k(DownsampleStrategy.CENTER_INSIDE, new CircleCrop());
    }

    /* renamed from: d */
    public final BaseRequestOptions m50074d(DownsampleStrategy downsampleStrategy, Transformation transformation) {
        return m50070h(downsampleStrategy, transformation, false);
    }

    @NonNull
    @CheckResult
    public T decode(@NonNull Class<?> cls) {
        if (this.f42558v) {
            return (T) m74049clone().decode(cls);
        }
        this.f42555s = (Class) Preconditions.checkNotNull(cls);
        this.f42537a |= 4096;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T disallowHardwareConfig() {
        return set(Downsampler.ALLOW_HARDWARE_CONFIG, Boolean.FALSE);
    }

    @NonNull
    @CheckResult
    public T diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy) {
        if (this.f42558v) {
            return (T) m74049clone().diskCacheStrategy(diskCacheStrategy);
        }
        this.f42539c = (DiskCacheStrategy) Preconditions.checkNotNull(diskCacheStrategy);
        this.f42537a |= 4;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T dontAnimate() {
        return set(GifOptions.DISABLE_ANIMATION, Boolean.TRUE);
    }

    @NonNull
    @CheckResult
    public T dontTransform() {
        if (this.f42558v) {
            return (T) m74049clone().dontTransform();
        }
        this.f42554r.clear();
        int i = this.f42537a;
        this.f42549m = false;
        this.f42550n = false;
        this.f42537a = (i & (-133121)) | 65536;
        this.f42561y = true;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        return set(DownsampleStrategy.OPTION, Preconditions.checkNotNull(downsampleStrategy));
    }

    /* renamed from: e */
    public final BaseRequestOptions m50073e(DownsampleStrategy downsampleStrategy, Transformation transformation) {
        if (this.f42558v) {
            return m74049clone().m50073e(downsampleStrategy, transformation);
        }
        downsample(downsampleStrategy);
        return m50068j(transformation, false);
    }

    @NonNull
    @CheckResult
    public T encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return set(BitmapEncoder.COMPRESSION_FORMAT, Preconditions.checkNotNull(compressFormat));
    }

    @NonNull
    @CheckResult
    public T encodeQuality(@IntRange(from = 0, m64742to = 100) int i) {
        return set(BitmapEncoder.COMPRESSION_QUALITY, Integer.valueOf(i));
    }

    public boolean equals(Object obj) {
        if (obj instanceof BaseRequestOptions) {
            return isEquivalentTo((BaseRequestOptions) obj);
        }
        return false;
    }

    @NonNull
    @CheckResult
    public T error(@Nullable Drawable drawable) {
        if (this.f42558v) {
            return (T) m74049clone().error(drawable);
        }
        this.f42541e = drawable;
        this.f42542f = 0;
        this.f42537a = (this.f42537a | 16) & (-33);
        return selfOrThrowIfLocked();
    }

    /* renamed from: f */
    public BaseRequestOptions m50072f(Option option) {
        if (this.f42558v) {
            return m74049clone().m50072f(option);
        }
        this.f42553q.remove(option);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T fallback(@Nullable Drawable drawable) {
        if (this.f42558v) {
            return (T) m74049clone().fallback(drawable);
        }
        this.f42551o = drawable;
        this.f42552p = 0;
        this.f42537a = (this.f42537a | 8192) & (-16385);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T fitCenter() {
        return (T) m50071g(DownsampleStrategy.FIT_CENTER, new FitCenter());
    }

    @NonNull
    @CheckResult
    public T format(@NonNull DecodeFormat decodeFormat) {
        Preconditions.checkNotNull(decodeFormat);
        return (T) set(Downsampler.DECODE_FORMAT, decodeFormat).set(GifOptions.DECODE_FORMAT, decodeFormat);
    }

    @NonNull
    @CheckResult
    public T frame(@IntRange(from = 0) long j) {
        return set(VideoDecoder.TARGET_FRAME, Long.valueOf(j));
    }

    /* renamed from: g */
    public final BaseRequestOptions m50071g(DownsampleStrategy downsampleStrategy, Transformation transformation) {
        return m50070h(downsampleStrategy, transformation, true);
    }

    @NonNull
    public final DiskCacheStrategy getDiskCacheStrategy() {
        return this.f42539c;
    }

    public final int getErrorId() {
        return this.f42542f;
    }

    @Nullable
    public final Drawable getErrorPlaceholder() {
        return this.f42541e;
    }

    @Nullable
    public final Drawable getFallbackDrawable() {
        return this.f42551o;
    }

    public final int getFallbackId() {
        return this.f42552p;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.f42560x;
    }

    @NonNull
    public final Options getOptions() {
        return this.f42553q;
    }

    public final int getOverrideHeight() {
        return this.f42546j;
    }

    public final int getOverrideWidth() {
        return this.f42547k;
    }

    @Nullable
    public final Drawable getPlaceholderDrawable() {
        return this.f42543g;
    }

    public final int getPlaceholderId() {
        return this.f42544h;
    }

    @NonNull
    public final Priority getPriority() {
        return this.f42540d;
    }

    @NonNull
    public final Class<?> getResourceClass() {
        return this.f42555s;
    }

    @NonNull
    public final Key getSignature() {
        return this.f42548l;
    }

    public final float getSizeMultiplier() {
        return this.f42538b;
    }

    @Nullable
    public final Resources.Theme getTheme() {
        return this.f42557u;
    }

    @NonNull
    public final Map<Class<?>, Transformation<?>> getTransformations() {
        return this.f42554r;
    }

    public final boolean getUseAnimationPool() {
        return this.f42562z;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.f42559w;
    }

    /* renamed from: h */
    public final BaseRequestOptions m50070h(DownsampleStrategy downsampleStrategy, Transformation transformation, boolean z) {
        BaseRequestOptions m50073e;
        if (z) {
            m50073e = m50067k(downsampleStrategy, transformation);
        } else {
            m50073e = m50073e(downsampleStrategy, transformation);
        }
        m50073e.f42561y = true;
        return m50073e;
    }

    public int hashCode() {
        return Util.hashCode(this.f42557u, Util.hashCode(this.f42548l, Util.hashCode(this.f42555s, Util.hashCode(this.f42554r, Util.hashCode(this.f42553q, Util.hashCode(this.f42540d, Util.hashCode(this.f42539c, Util.hashCode(this.f42560x, Util.hashCode(this.f42559w, Util.hashCode(this.f42550n, Util.hashCode(this.f42549m, Util.hashCode(this.f42547k, Util.hashCode(this.f42546j, Util.hashCode(this.f42545i, Util.hashCode(this.f42551o, Util.hashCode(this.f42552p, Util.hashCode(this.f42543g, Util.hashCode(this.f42544h, Util.hashCode(this.f42541e, Util.hashCode(this.f42542f, Util.hashCode(this.f42538b)))))))))))))))))))));
    }

    /* renamed from: i */
    public final BaseRequestOptions m50069i() {
        return this;
    }

    public final boolean isAutoCloneEnabled() {
        return this.f42558v;
    }

    public final boolean isDiskCacheStrategySet() {
        return m50076b(4);
    }

    public final boolean isEquivalentTo(BaseRequestOptions<?> baseRequestOptions) {
        if (Float.compare(baseRequestOptions.f42538b, this.f42538b) == 0 && this.f42542f == baseRequestOptions.f42542f && Util.bothNullOrEqual(this.f42541e, baseRequestOptions.f42541e) && this.f42544h == baseRequestOptions.f42544h && Util.bothNullOrEqual(this.f42543g, baseRequestOptions.f42543g) && this.f42552p == baseRequestOptions.f42552p && Util.bothNullOrEqual(this.f42551o, baseRequestOptions.f42551o) && this.f42545i == baseRequestOptions.f42545i && this.f42546j == baseRequestOptions.f42546j && this.f42547k == baseRequestOptions.f42547k && this.f42549m == baseRequestOptions.f42549m && this.f42550n == baseRequestOptions.f42550n && this.f42559w == baseRequestOptions.f42559w && this.f42560x == baseRequestOptions.f42560x && this.f42539c.equals(baseRequestOptions.f42539c) && this.f42540d == baseRequestOptions.f42540d && this.f42553q.equals(baseRequestOptions.f42553q) && this.f42554r.equals(baseRequestOptions.f42554r) && this.f42555s.equals(baseRequestOptions.f42555s) && Util.bothNullOrEqual(this.f42548l, baseRequestOptions.f42548l) && Util.bothNullOrEqual(this.f42557u, baseRequestOptions.f42557u)) {
            return true;
        }
        return false;
    }

    public final boolean isLocked() {
        return this.f42556t;
    }

    public final boolean isMemoryCacheable() {
        return this.f42545i;
    }

    public final boolean isPrioritySet() {
        return m50076b(8);
    }

    public final boolean isSkipMemoryCacheSet() {
        return m50076b(256);
    }

    public final boolean isTransformationAllowed() {
        return this.f42550n;
    }

    public final boolean isTransformationRequired() {
        return this.f42549m;
    }

    public final boolean isTransformationSet() {
        return m50076b(2048);
    }

    public final boolean isValidOverride() {
        return Util.isValidDimensions(this.f42547k, this.f42546j);
    }

    /* renamed from: j */
    public BaseRequestOptions m50068j(Transformation transformation, boolean z) {
        if (this.f42558v) {
            return m74049clone().m50068j(transformation, z);
        }
        DrawableTransformation drawableTransformation = new DrawableTransformation(transformation, z);
        m50066l(Bitmap.class, transformation, z);
        m50066l(Drawable.class, drawableTransformation, z);
        m50066l(BitmapDrawable.class, drawableTransformation.asBitmapDrawable(), z);
        m50066l(GifDrawable.class, new GifDrawableTransformation(transformation), z);
        return selfOrThrowIfLocked();
    }

    /* renamed from: k */
    public final BaseRequestOptions m50067k(DownsampleStrategy downsampleStrategy, Transformation transformation) {
        if (this.f42558v) {
            return m74049clone().m50067k(downsampleStrategy, transformation);
        }
        downsample(downsampleStrategy);
        return transform(transformation);
    }

    /* renamed from: l */
    public BaseRequestOptions m50066l(Class cls, Transformation transformation, boolean z) {
        if (this.f42558v) {
            return m74049clone().m50066l(cls, transformation, z);
        }
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(transformation);
        this.f42554r.put(cls, transformation);
        int i = this.f42537a;
        this.f42550n = true;
        this.f42537a = 67584 | i;
        this.f42561y = false;
        if (z) {
            this.f42537a = i | 198656;
            this.f42549m = true;
        }
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T lock() {
        this.f42556t = true;
        return (T) m50069i();
    }

    @NonNull
    @CheckResult
    public T onlyRetrieveFromCache(boolean z) {
        if (this.f42558v) {
            return (T) m74049clone().onlyRetrieveFromCache(z);
        }
        this.f42560x = z;
        this.f42537a |= 524288;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T optionalCenterCrop() {
        return (T) m50073e(DownsampleStrategy.CENTER_OUTSIDE, new CenterCrop());
    }

    @NonNull
    @CheckResult
    public T optionalCenterInside() {
        return (T) m50074d(DownsampleStrategy.CENTER_INSIDE, new CenterInside());
    }

    @NonNull
    @CheckResult
    public T optionalCircleCrop() {
        return (T) m50073e(DownsampleStrategy.CENTER_OUTSIDE, new CircleCrop());
    }

    @NonNull
    @CheckResult
    public T optionalFitCenter() {
        return (T) m50074d(DownsampleStrategy.FIT_CENTER, new FitCenter());
    }

    @NonNull
    @CheckResult
    public T optionalTransform(@NonNull Transformation<Bitmap> transformation) {
        return (T) m50068j(transformation, false);
    }

    @NonNull
    @CheckResult
    public T override(int i, int i2) {
        if (this.f42558v) {
            return (T) m74049clone().override(i, i2);
        }
        this.f42547k = i;
        this.f42546j = i2;
        this.f42537a |= 512;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T placeholder(@Nullable Drawable drawable) {
        if (this.f42558v) {
            return (T) m74049clone().placeholder(drawable);
        }
        this.f42543g = drawable;
        this.f42544h = 0;
        this.f42537a = (this.f42537a | 64) & (-129);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T priority(@NonNull Priority priority) {
        if (this.f42558v) {
            return (T) m74049clone().priority(priority);
        }
        this.f42540d = (Priority) Preconditions.checkNotNull(priority);
        this.f42537a |= 8;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public final T selfOrThrowIfLocked() {
        if (!this.f42556t) {
            return (T) m50069i();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @NonNull
    @CheckResult
    public <Y> T set(@NonNull Option<Y> option, @NonNull Y y) {
        if (this.f42558v) {
            return (T) m74049clone().set(option, y);
        }
        Preconditions.checkNotNull(option);
        Preconditions.checkNotNull(y);
        this.f42553q.set(option, y);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T signature(@NonNull Key key) {
        if (this.f42558v) {
            return (T) m74049clone().signature(key);
        }
        this.f42548l = (Key) Preconditions.checkNotNull(key);
        this.f42537a |= 1024;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T sizeMultiplier(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        if (this.f42558v) {
            return (T) m74049clone().sizeMultiplier(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.f42538b = f;
            this.f42537a |= 2;
            return selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @NonNull
    @CheckResult
    public T skipMemoryCache(boolean z) {
        if (this.f42558v) {
            return (T) m74049clone().skipMemoryCache(true);
        }
        this.f42545i = !z;
        this.f42537a |= 256;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T theme(@Nullable Resources.Theme theme) {
        if (this.f42558v) {
            return (T) m74049clone().theme(theme);
        }
        this.f42557u = theme;
        if (theme != null) {
            this.f42537a |= 32768;
            return set(ResourceDrawableDecoder.THEME, theme);
        }
        this.f42537a &= -32769;
        return (T) m50072f(ResourceDrawableDecoder.THEME);
    }

    @NonNull
    @CheckResult
    public T timeout(@IntRange(from = 0) int i) {
        return set(HttpGlideUrlLoader.TIMEOUT, Integer.valueOf(i));
    }

    @NonNull
    @CheckResult
    public T transform(@NonNull Transformation<Bitmap> transformation) {
        return (T) m50068j(transformation, true);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public T transforms(@NonNull Transformation<Bitmap>... transformationArr) {
        return (T) m50068j(new MultiTransformation(transformationArr), true);
    }

    @NonNull
    @CheckResult
    public T useAnimationPool(boolean z) {
        if (this.f42558v) {
            return (T) m74049clone().useAnimationPool(z);
        }
        this.f42562z = z;
        this.f42537a |= 1048576;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T useUnlimitedSourceGeneratorsPool(boolean z) {
        if (this.f42558v) {
            return (T) m74049clone().useUnlimitedSourceGeneratorsPool(z);
        }
        this.f42559w = z;
        this.f42537a |= 262144;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    /* renamed from: clone */
    public T m74049clone() {
        try {
            T t = (T) super.clone();
            Options options = new Options();
            t.f42553q = options;
            options.putAll(this.f42553q);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            t.f42554r = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.f42554r);
            t.f42556t = false;
            t.f42558v = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    @CheckResult
    public <Y> T optionalTransform(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation) {
        return (T) m50066l(cls, transformation, false);
    }

    @NonNull
    @CheckResult
    public T transform(@NonNull Transformation<Bitmap>... transformationArr) {
        if (transformationArr.length > 1) {
            return (T) m50068j(new MultiTransformation(transformationArr), true);
        }
        if (transformationArr.length == 1) {
            return transform(transformationArr[0]);
        }
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T override(int i) {
        return override(i, i);
    }

    @NonNull
    @CheckResult
    public <Y> T transform(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation) {
        return (T) m50066l(cls, transformation, true);
    }

    @NonNull
    @CheckResult
    public T error(@DrawableRes int i) {
        if (this.f42558v) {
            return (T) m74049clone().error(i);
        }
        this.f42542f = i;
        this.f42541e = null;
        this.f42537a = (this.f42537a | 32) & (-17);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T fallback(@DrawableRes int i) {
        if (this.f42558v) {
            return (T) m74049clone().fallback(i);
        }
        this.f42552p = i;
        this.f42551o = null;
        this.f42537a = (this.f42537a | 16384) & (-8193);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T placeholder(@DrawableRes int i) {
        if (this.f42558v) {
            return (T) m74049clone().placeholder(i);
        }
        this.f42544h = i;
        this.f42543g = null;
        this.f42537a = (this.f42537a | 128) & (-65);
        return selfOrThrowIfLocked();
    }
}
