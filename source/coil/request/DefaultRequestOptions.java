package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.size.Precision;
import coil.transition.Transition;
import coil.util.Utils;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b/\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J©\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010I¨\u0006N"}, m28850d2 = {"Lcoil/request/DefaultRequestOptions;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Lcoil/transition/Transition$Factory;", "transitionFactory", "Lcoil/size/Precision;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "Landroid/graphics/drawable/Drawable;", "placeholder", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "fallback", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "copy", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)Lcoil/request/DefaultRequestOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/CoroutineDispatcher;", "getInterceptorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFetcherDispatcher", OperatorName.CURVE_TO, "getDecoderDispatcher", "d", "getTransformationDispatcher", "e", "Lcoil/transition/Transition$Factory;", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", OperatorName.FILL_NON_ZERO, "Lcoil/size/Precision;", "getPrecision", "()Lcoil/size/Precision;", OperatorName.NON_STROKING_GRAY, "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", OperatorName.CLOSE_PATH, "Z", "getAllowHardware", "()Z", "i", "getAllowRgb565", OperatorName.SET_LINE_JOINSTYLE, "Landroid/graphics/drawable/Drawable;", "getPlaceholder", "()Landroid/graphics/drawable/Drawable;", OperatorName.NON_STROKING_CMYK, "getError", OperatorName.LINE_TO, "getFallback", OperatorName.MOVE_TO, "Lcoil/request/CachePolicy;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", OperatorName.ENDPATH, "getDiskCachePolicy", "o", "getNetworkCachePolicy", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class DefaultRequestOptions {

    /* renamed from: a */
    public final CoroutineDispatcher f40663a;

    /* renamed from: b */
    public final CoroutineDispatcher f40664b;

    /* renamed from: c */
    public final CoroutineDispatcher f40665c;

    /* renamed from: d */
    public final CoroutineDispatcher f40666d;

    /* renamed from: e */
    public final Transition.Factory f40667e;

    /* renamed from: f */
    public final Precision f40668f;

    /* renamed from: g */
    public final Bitmap.Config f40669g;

    /* renamed from: h */
    public final boolean f40670h;

    /* renamed from: i */
    public final boolean f40671i;

    /* renamed from: j */
    public final Drawable f40672j;

    /* renamed from: k */
    public final Drawable f40673k;

    /* renamed from: l */
    public final Drawable f40674l;

    /* renamed from: m */
    public final CachePolicy f40675m;

    /* renamed from: n */
    public final CachePolicy f40676n;

    /* renamed from: o */
    public final CachePolicy f40677o;

    public DefaultRequestOptions() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    @NotNull
    public final DefaultRequestOptions copy(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull CoroutineDispatcher coroutineDispatcher3, @NotNull CoroutineDispatcher coroutineDispatcher4, @NotNull Transition.Factory factory, @NotNull Precision precision, @NotNull Bitmap.Config config, boolean z, boolean z2, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @NotNull CachePolicy cachePolicy, @NotNull CachePolicy cachePolicy2, @NotNull CachePolicy cachePolicy3) {
        return new DefaultRequestOptions(coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, factory, precision, config, z, z2, drawable, drawable2, drawable3, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultRequestOptions) {
            DefaultRequestOptions defaultRequestOptions = (DefaultRequestOptions) obj;
            if (Intrinsics.areEqual(this.f40663a, defaultRequestOptions.f40663a) && Intrinsics.areEqual(this.f40664b, defaultRequestOptions.f40664b) && Intrinsics.areEqual(this.f40665c, defaultRequestOptions.f40665c) && Intrinsics.areEqual(this.f40666d, defaultRequestOptions.f40666d) && Intrinsics.areEqual(this.f40667e, defaultRequestOptions.f40667e) && this.f40668f == defaultRequestOptions.f40668f && this.f40669g == defaultRequestOptions.f40669g && this.f40670h == defaultRequestOptions.f40670h && this.f40671i == defaultRequestOptions.f40671i && Intrinsics.areEqual(this.f40672j, defaultRequestOptions.f40672j) && Intrinsics.areEqual(this.f40673k, defaultRequestOptions.f40673k) && Intrinsics.areEqual(this.f40674l, defaultRequestOptions.f40674l) && this.f40675m == defaultRequestOptions.f40675m && this.f40676n == defaultRequestOptions.f40676n && this.f40677o == defaultRequestOptions.f40677o) {
                return true;
            }
        }
        return false;
    }

    public final boolean getAllowHardware() {
        return this.f40670h;
    }

    public final boolean getAllowRgb565() {
        return this.f40671i;
    }

    @NotNull
    public final Bitmap.Config getBitmapConfig() {
        return this.f40669g;
    }

    @NotNull
    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.f40665c;
    }

    @NotNull
    public final CachePolicy getDiskCachePolicy() {
        return this.f40676n;
    }

    @Nullable
    public final Drawable getError() {
        return this.f40673k;
    }

    @Nullable
    public final Drawable getFallback() {
        return this.f40674l;
    }

    @NotNull
    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.f40664b;
    }

    @NotNull
    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.f40663a;
    }

    @NotNull
    public final CachePolicy getMemoryCachePolicy() {
        return this.f40675m;
    }

    @NotNull
    public final CachePolicy getNetworkCachePolicy() {
        return this.f40677o;
    }

    @Nullable
    public final Drawable getPlaceholder() {
        return this.f40672j;
    }

    @NotNull
    public final Precision getPrecision() {
        return this.f40668f;
    }

    @NotNull
    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.f40666d;
    }

    @NotNull
    public final Transition.Factory getTransitionFactory() {
        return this.f40667e;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = ((((((((((((((((this.f40663a.hashCode() * 31) + this.f40664b.hashCode()) * 31) + this.f40665c.hashCode()) * 31) + this.f40666d.hashCode()) * 31) + this.f40667e.hashCode()) * 31) + this.f40668f.hashCode()) * 31) + this.f40669g.hashCode()) * 31) + AbstractC1705Xp.m65430a(this.f40670h)) * 31) + AbstractC1705Xp.m65430a(this.f40671i)) * 31;
        Drawable drawable = this.f40672j;
        int i3 = 0;
        if (drawable != null) {
            i = drawable.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        Drawable drawable2 = this.f40673k;
        if (drawable2 != null) {
            i2 = drawable2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Drawable drawable3 = this.f40674l;
        if (drawable3 != null) {
            i3 = drawable3.hashCode();
        }
        return ((((((i5 + i3) * 31) + this.f40675m.hashCode()) * 31) + this.f40676n.hashCode()) * 31) + this.f40677o.hashCode();
    }

    public DefaultRequestOptions(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull CoroutineDispatcher coroutineDispatcher3, @NotNull CoroutineDispatcher coroutineDispatcher4, @NotNull Transition.Factory factory, @NotNull Precision precision, @NotNull Bitmap.Config config, boolean z, boolean z2, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @NotNull CachePolicy cachePolicy, @NotNull CachePolicy cachePolicy2, @NotNull CachePolicy cachePolicy3) {
        this.f40663a = coroutineDispatcher;
        this.f40664b = coroutineDispatcher2;
        this.f40665c = coroutineDispatcher3;
        this.f40666d = coroutineDispatcher4;
        this.f40667e = factory;
        this.f40668f = precision;
        this.f40669g = config;
        this.f40670h = z;
        this.f40671i = z2;
        this.f40672j = drawable;
        this.f40673k = drawable2;
        this.f40674l = drawable3;
        this.f40675m = cachePolicy;
        this.f40676n = cachePolicy2;
        this.f40677o = cachePolicy3;
    }

    public /* synthetic */ DefaultRequestOptions(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Transition.Factory factory, Precision precision, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getMain().getImmediate() : coroutineDispatcher, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher2, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher3, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher4, (i & 16) != 0 ? Transition.Factory.NONE : factory, (i & 32) != 0 ? Precision.AUTOMATIC : precision, (i & 64) != 0 ? Utils.getDEFAULT_BITMAP_CONFIG() : config, (i & 128) != 0 ? true : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : drawable, (i & 1024) != 0 ? null : drawable2, (i & 2048) == 0 ? drawable3 : null, (i & 4096) != 0 ? CachePolicy.ENABLED : cachePolicy, (i & 8192) != 0 ? CachePolicy.ENABLED : cachePolicy2, (i & 16384) != 0 ? CachePolicy.ENABLED : cachePolicy3);
    }
}
