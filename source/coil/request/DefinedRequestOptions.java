package coil.request;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.SizeResolver;
import coil.transition.Transition;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b3\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJÁ\u0001\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010OR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010O¨\u0006T"}, m28850d2 = {"Lcoil/request/DefinedRequestOptions;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcoil/size/SizeResolver;", "sizeResolver", "Lcoil/size/Scale;", "scale", "Lkotlinx/coroutines/CoroutineDispatcher;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Lcoil/transition/Transition$Factory;", "transitionFactory", "Lcoil/size/Precision;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "copy", "(Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)Lcoil/request/DefinedRequestOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/size/SizeResolver;", "getSizeResolver", "()Lcoil/size/SizeResolver;", OperatorName.CURVE_TO, "Lcoil/size/Scale;", "getScale", "()Lcoil/size/Scale;", "d", "Lkotlinx/coroutines/CoroutineDispatcher;", "getInterceptorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "e", "getFetcherDispatcher", OperatorName.FILL_NON_ZERO, "getDecoderDispatcher", OperatorName.NON_STROKING_GRAY, "getTransformationDispatcher", OperatorName.CLOSE_PATH, "Lcoil/transition/Transition$Factory;", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", "i", "Lcoil/size/Precision;", "getPrecision", "()Lcoil/size/Precision;", OperatorName.SET_LINE_JOINSTYLE, "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", OperatorName.NON_STROKING_CMYK, "Ljava/lang/Boolean;", "getAllowHardware", "()Ljava/lang/Boolean;", OperatorName.LINE_TO, "getAllowRgb565", OperatorName.MOVE_TO, "Lcoil/request/CachePolicy;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", OperatorName.ENDPATH, "getDiskCachePolicy", "o", "getNetworkCachePolicy", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class DefinedRequestOptions {

    /* renamed from: a */
    public final Lifecycle f40678a;

    /* renamed from: b */
    public final SizeResolver f40679b;

    /* renamed from: c */
    public final Scale f40680c;

    /* renamed from: d */
    public final CoroutineDispatcher f40681d;

    /* renamed from: e */
    public final CoroutineDispatcher f40682e;

    /* renamed from: f */
    public final CoroutineDispatcher f40683f;

    /* renamed from: g */
    public final CoroutineDispatcher f40684g;

    /* renamed from: h */
    public final Transition.Factory f40685h;

    /* renamed from: i */
    public final Precision f40686i;

    /* renamed from: j */
    public final Bitmap.Config f40687j;

    /* renamed from: k */
    public final Boolean f40688k;

    /* renamed from: l */
    public final Boolean f40689l;

    /* renamed from: m */
    public final CachePolicy f40690m;

    /* renamed from: n */
    public final CachePolicy f40691n;

    /* renamed from: o */
    public final CachePolicy f40692o;

    public DefinedRequestOptions(@Nullable Lifecycle lifecycle, @Nullable SizeResolver sizeResolver, @Nullable Scale scale, @Nullable CoroutineDispatcher coroutineDispatcher, @Nullable CoroutineDispatcher coroutineDispatcher2, @Nullable CoroutineDispatcher coroutineDispatcher3, @Nullable CoroutineDispatcher coroutineDispatcher4, @Nullable Transition.Factory factory, @Nullable Precision precision, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CachePolicy cachePolicy, @Nullable CachePolicy cachePolicy2, @Nullable CachePolicy cachePolicy3) {
        this.f40678a = lifecycle;
        this.f40679b = sizeResolver;
        this.f40680c = scale;
        this.f40681d = coroutineDispatcher;
        this.f40682e = coroutineDispatcher2;
        this.f40683f = coroutineDispatcher3;
        this.f40684g = coroutineDispatcher4;
        this.f40685h = factory;
        this.f40686i = precision;
        this.f40687j = config;
        this.f40688k = bool;
        this.f40689l = bool2;
        this.f40690m = cachePolicy;
        this.f40691n = cachePolicy2;
        this.f40692o = cachePolicy3;
    }

    @NotNull
    public final DefinedRequestOptions copy(@Nullable Lifecycle lifecycle, @Nullable SizeResolver sizeResolver, @Nullable Scale scale, @Nullable CoroutineDispatcher coroutineDispatcher, @Nullable CoroutineDispatcher coroutineDispatcher2, @Nullable CoroutineDispatcher coroutineDispatcher3, @Nullable CoroutineDispatcher coroutineDispatcher4, @Nullable Transition.Factory factory, @Nullable Precision precision, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CachePolicy cachePolicy, @Nullable CachePolicy cachePolicy2, @Nullable CachePolicy cachePolicy3) {
        return new DefinedRequestOptions(lifecycle, sizeResolver, scale, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, factory, precision, config, bool, bool2, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefinedRequestOptions) {
            DefinedRequestOptions definedRequestOptions = (DefinedRequestOptions) obj;
            if (Intrinsics.areEqual(this.f40678a, definedRequestOptions.f40678a) && Intrinsics.areEqual(this.f40679b, definedRequestOptions.f40679b) && this.f40680c == definedRequestOptions.f40680c && Intrinsics.areEqual(this.f40681d, definedRequestOptions.f40681d) && Intrinsics.areEqual(this.f40682e, definedRequestOptions.f40682e) && Intrinsics.areEqual(this.f40683f, definedRequestOptions.f40683f) && Intrinsics.areEqual(this.f40684g, definedRequestOptions.f40684g) && Intrinsics.areEqual(this.f40685h, definedRequestOptions.f40685h) && this.f40686i == definedRequestOptions.f40686i && this.f40687j == definedRequestOptions.f40687j && Intrinsics.areEqual(this.f40688k, definedRequestOptions.f40688k) && Intrinsics.areEqual(this.f40689l, definedRequestOptions.f40689l) && this.f40690m == definedRequestOptions.f40690m && this.f40691n == definedRequestOptions.f40691n && this.f40692o == definedRequestOptions.f40692o) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final Boolean getAllowHardware() {
        return this.f40688k;
    }

    @Nullable
    public final Boolean getAllowRgb565() {
        return this.f40689l;
    }

    @Nullable
    public final Bitmap.Config getBitmapConfig() {
        return this.f40687j;
    }

    @Nullable
    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.f40683f;
    }

    @Nullable
    public final CachePolicy getDiskCachePolicy() {
        return this.f40691n;
    }

    @Nullable
    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.f40682e;
    }

    @Nullable
    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.f40681d;
    }

    @Nullable
    public final Lifecycle getLifecycle() {
        return this.f40678a;
    }

    @Nullable
    public final CachePolicy getMemoryCachePolicy() {
        return this.f40690m;
    }

    @Nullable
    public final CachePolicy getNetworkCachePolicy() {
        return this.f40692o;
    }

    @Nullable
    public final Precision getPrecision() {
        return this.f40686i;
    }

    @Nullable
    public final Scale getScale() {
        return this.f40680c;
    }

    @Nullable
    public final SizeResolver getSizeResolver() {
        return this.f40679b;
    }

    @Nullable
    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.f40684g;
    }

    @Nullable
    public final Transition.Factory getTransitionFactory() {
        return this.f40685h;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Lifecycle lifecycle = this.f40678a;
        int i15 = 0;
        if (lifecycle != null) {
            i = lifecycle.hashCode();
        } else {
            i = 0;
        }
        int i16 = i * 31;
        SizeResolver sizeResolver = this.f40679b;
        if (sizeResolver != null) {
            i2 = sizeResolver.hashCode();
        } else {
            i2 = 0;
        }
        int i17 = (i16 + i2) * 31;
        Scale scale = this.f40680c;
        if (scale != null) {
            i3 = scale.hashCode();
        } else {
            i3 = 0;
        }
        int i18 = (i17 + i3) * 31;
        CoroutineDispatcher coroutineDispatcher = this.f40681d;
        if (coroutineDispatcher != null) {
            i4 = coroutineDispatcher.hashCode();
        } else {
            i4 = 0;
        }
        int i19 = (i18 + i4) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.f40682e;
        if (coroutineDispatcher2 != null) {
            i5 = coroutineDispatcher2.hashCode();
        } else {
            i5 = 0;
        }
        int i20 = (i19 + i5) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.f40683f;
        if (coroutineDispatcher3 != null) {
            i6 = coroutineDispatcher3.hashCode();
        } else {
            i6 = 0;
        }
        int i21 = (i20 + i6) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.f40684g;
        if (coroutineDispatcher4 != null) {
            i7 = coroutineDispatcher4.hashCode();
        } else {
            i7 = 0;
        }
        int i22 = (i21 + i7) * 31;
        Transition.Factory factory = this.f40685h;
        if (factory != null) {
            i8 = factory.hashCode();
        } else {
            i8 = 0;
        }
        int i23 = (i22 + i8) * 31;
        Precision precision = this.f40686i;
        if (precision != null) {
            i9 = precision.hashCode();
        } else {
            i9 = 0;
        }
        int i24 = (i23 + i9) * 31;
        Bitmap.Config config = this.f40687j;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        int i25 = (i24 + i10) * 31;
        Boolean bool = this.f40688k;
        if (bool != null) {
            i11 = bool.hashCode();
        } else {
            i11 = 0;
        }
        int i26 = (i25 + i11) * 31;
        Boolean bool2 = this.f40689l;
        if (bool2 != null) {
            i12 = bool2.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (i26 + i12) * 31;
        CachePolicy cachePolicy = this.f40690m;
        if (cachePolicy != null) {
            i13 = cachePolicy.hashCode();
        } else {
            i13 = 0;
        }
        int i28 = (i27 + i13) * 31;
        CachePolicy cachePolicy2 = this.f40691n;
        if (cachePolicy2 != null) {
            i14 = cachePolicy2.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (i28 + i14) * 31;
        CachePolicy cachePolicy3 = this.f40692o;
        if (cachePolicy3 != null) {
            i15 = cachePolicy3.hashCode();
        }
        return i29 + i15;
    }
}
