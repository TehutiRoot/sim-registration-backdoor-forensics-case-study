package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.Lifecycle;
import coil.ImageLoader;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.util.Bitmaps;
import coil.util.HardwareBitmapService;
import coil.util.HardwareBitmaps;
import coil.util.Logger;
import coil.util.Requests;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m28850d2 = {"Lcoil/request/RequestService;", "", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/util/SystemCallbacks;", "systemCallbacks", "Lcoil/util/Logger;", "logger", "<init>", "(Lcoil/ImageLoader;Lcoil/util/SystemCallbacks;Lcoil/util/Logger;)V", "Lcoil/request/ImageRequest;", "initialRequest", "Lkotlinx/coroutines/Job;", "job", "Lcoil/request/RequestDelegate;", "requestDelegate", "(Lcoil/request/ImageRequest;Lkotlinx/coroutines/Job;)Lcoil/request/RequestDelegate;", "request", "", "throwable", "Lcoil/request/ErrorResult;", "errorResult", "(Lcoil/request/ImageRequest;Ljava/lang/Throwable;)Lcoil/request/ErrorResult;", "Lcoil/size/Size;", "size", "Lcoil/request/Options;", "options", "(Lcoil/request/ImageRequest;Lcoil/size/Size;)Lcoil/request/Options;", "Landroid/graphics/Bitmap$Config;", "requestedConfig", "", "isConfigValidForHardware", "(Lcoil/request/ImageRequest;Landroid/graphics/Bitmap$Config;)Z", "allowHardwareWorkerThread", "(Lcoil/request/Options;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lcoil/request/ImageRequest;Lcoil/size/Size;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lcoil/request/ImageRequest;)Z", "Lcoil/ImageLoader;", "Lcoil/util/SystemCallbacks;", "Lcoil/util/HardwareBitmapService;", OperatorName.CURVE_TO, "Lcoil/util/HardwareBitmapService;", "hardwareBitmapService", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestService.kt\ncoil/request/RequestService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
/* loaded from: classes3.dex */
public final class RequestService {

    /* renamed from: a */
    public final ImageLoader f40804a;

    /* renamed from: b */
    public final SystemCallbacks f40805b;

    /* renamed from: c */
    public final HardwareBitmapService f40806c;

    public RequestService(@NotNull ImageLoader imageLoader, @NotNull SystemCallbacks systemCallbacks, @Nullable Logger logger) {
        this.f40804a = imageLoader;
        this.f40805b = systemCallbacks;
        this.f40806c = HardwareBitmaps.HardwareBitmapService(logger);
    }

    /* renamed from: a */
    public final boolean m51034a(ImageRequest imageRequest, Size size) {
        if (!Bitmaps.isHardware(imageRequest.getBitmapConfig())) {
            return true;
        }
        if (isConfigValidForHardware(imageRequest, imageRequest.getBitmapConfig()) && this.f40806c.allowHardwareMainThread(size)) {
            return true;
        }
        return false;
    }

    @WorkerThread
    public final boolean allowHardwareWorkerThread(@NotNull Options options) {
        if (Bitmaps.isHardware(options.getConfig()) && !this.f40806c.allowHardwareWorkerThread()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m51033b(ImageRequest imageRequest) {
        if (!imageRequest.getTransformations().isEmpty() && !ArraysKt___ArraysKt.contains(Utils.getVALID_TRANSFORMATION_CONFIGS(), imageRequest.getBitmapConfig())) {
            return false;
        }
        return true;
    }

    @NotNull
    public final ErrorResult errorResult(@NotNull ImageRequest imageRequest, @NotNull Throwable th2) {
        Drawable error;
        if (th2 instanceof NullRequestDataException) {
            error = imageRequest.getFallback();
            if (error == null) {
                error = imageRequest.getError();
            }
        } else {
            error = imageRequest.getError();
        }
        return new ErrorResult(error, imageRequest, th2);
    }

    public final boolean isConfigValidForHardware(@NotNull ImageRequest imageRequest, @NotNull Bitmap.Config config) {
        if (!Bitmaps.isHardware(config)) {
            return true;
        }
        if (!imageRequest.getAllowHardware()) {
            return false;
        }
        Target target = imageRequest.getTarget();
        if (target instanceof ViewTarget) {
            View view = ((ViewTarget) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final Options options(@NotNull ImageRequest imageRequest, @NotNull Size size) {
        Bitmap.Config config;
        CachePolicy cachePolicy;
        Scale scale;
        boolean z;
        if (m51033b(imageRequest) && m51034a(imageRequest, size)) {
            config = imageRequest.getBitmapConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config2 = config;
        if (this.f40805b.isOnline()) {
            cachePolicy = imageRequest.getNetworkCachePolicy();
        } else {
            cachePolicy = CachePolicy.DISABLED;
        }
        CachePolicy cachePolicy2 = cachePolicy;
        Dimension width = size.getWidth();
        Dimension.Undefined undefined = Dimension.Undefined.INSTANCE;
        if (!Intrinsics.areEqual(width, undefined) && !Intrinsics.areEqual(size.getHeight(), undefined)) {
            scale = imageRequest.getScale();
        } else {
            scale = Scale.FIT;
        }
        Scale scale2 = scale;
        if (imageRequest.getAllowRgb565() && imageRequest.getTransformations().isEmpty() && config2 != Bitmap.Config.ALPHA_8) {
            z = true;
        } else {
            z = false;
        }
        return new Options(imageRequest.getContext(), config2, imageRequest.getColorSpace(), size, scale2, Requests.getAllowInexactSize(imageRequest), z, imageRequest.getPremultipliedAlpha(), imageRequest.getDiskCacheKey(), imageRequest.getHeaders(), imageRequest.getTags(), imageRequest.getParameters(), imageRequest.getMemoryCachePolicy(), imageRequest.getDiskCachePolicy(), cachePolicy2);
    }

    @NotNull
    public final RequestDelegate requestDelegate(@NotNull ImageRequest imageRequest, @NotNull Job job) {
        Lifecycle lifecycle = imageRequest.getLifecycle();
        Target target = imageRequest.getTarget();
        if (target instanceof ViewTarget) {
            return new ViewTargetRequestDelegate(this.f40804a, imageRequest, (ViewTarget) target, lifecycle, job);
        }
        return new BaseRequestDelegate(lifecycle, job);
    }
}
