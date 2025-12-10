package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import ch.qos.logback.core.CoreConstants;
import coil.ComponentRegistry;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.ExifOrientationPolicy;
import coil.disk.DiskCache;
import coil.memory.MemoryCache;
import coil.request.CachePolicy;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.size.Precision;
import coil.transition.CrossfadeTransition;
import coil.transition.Transition;
import coil.util.Contexts;
import coil.util.ImageLoaderOptions;
import coil.util.Logger;
import coil.util.Requests;
import coil.util.Utils;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u001dJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, m28850d2 = {"Lcoil/ImageLoader;", "", "components", "Lcoil/ComponentRegistry;", "getComponents", "()Lcoil/ComponentRegistry;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "diskCache", "Lcoil/disk/DiskCache;", "getDiskCache", "()Lcoil/disk/DiskCache;", "memoryCache", "Lcoil/memory/MemoryCache;", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "enqueue", "Lcoil/request/Disposable;", "request", "Lcoil/request/ImageRequest;", "execute", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newBuilder", "Lcoil/ImageLoader$Builder;", "shutdown", "", "Builder", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface ImageLoader {

    @Metadata(m28851d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\n\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\n\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0017\u001a\u00020\u00002\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\u00002\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\f¢\u0006\u0004\b\u001c\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\u00002\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\f¢\u0006\u0004\b\u001f\u0010\u000eJ\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010$J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b'\u0010$J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b(\u0010$J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b9\u0010$J\u0015\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020)¢\u0006\u0004\b9\u0010,J\u0015\u0010<\u001a\u00020\u00002\u0006\u00106\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bG\u0010FJ\u0015\u0010H\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bH\u0010FJ\u0015\u0010I\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bI\u0010FJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bJ\u0010FJ\u0017\u0010L\u001a\u00020\u00002\b\b\u0001\u0010K\u001a\u00020)¢\u0006\u0004\bL\u0010,J\u0017\u0010L\u001a\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\bL\u0010OJ\u0017\u0010P\u001a\u00020\u00002\b\b\u0001\u0010K\u001a\u00020)¢\u0006\u0004\bP\u0010,J\u0017\u0010P\u001a\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\bP\u0010OJ\u0017\u0010Q\u001a\u00020\u00002\b\b\u0001\u0010K\u001a\u00020)¢\u0006\u0004\bQ\u0010,J\u0017\u0010Q\u001a\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\bQ\u0010OJ\u0015\u0010S\u001a\u00020\u00002\u0006\u0010.\u001a\u00020R¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020\u00002\u0006\u0010.\u001a\u00020R¢\u0006\u0004\bU\u0010TJ\u0015\u0010V\u001a\u00020\u00002\u0006\u0010.\u001a\u00020R¢\u0006\u0004\bV\u0010TJ\u0017\u0010X\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010W¢\u0006\u0004\bX\u0010YJ\r\u0010[\u001a\u00020Z¢\u0006\u0004\b[\u0010\\J\u0019\u0010_\u001a\u00020\u00002\b\b\u0001\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\ba\u0010$J\u0017\u0010b\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\bb\u0010$J(\u0010c\u001a\u00020\u00002\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\bc\u0010\u0018J\u0017\u0010c\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u0019H\u0007¢\u0006\u0004\bc\u0010\u001aJ\u0017\u0010f\u001a\u00020\u00002\u0006\u0010f\u001a\u00020eH\u0007¢\u0006\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010n\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR \u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR \u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010qR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010{\u001a\u00020x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}¨\u0006~"}, m28850d2 = {"Lcoil/ImageLoader$Builder;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lcoil/RealImageLoader;", "imageLoader", "(Lcoil/RealImageLoader;)V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)Lcoil/ImageLoader$Builder;", "Lkotlin/Function0;", "initializer", "(Lkotlin/jvm/functions/Function0;)Lcoil/ImageLoader$Builder;", "Lokhttp3/Call$Factory;", "callFactory", "(Lokhttp3/Call$Factory;)Lcoil/ImageLoader$Builder;", "Lkotlin/Function1;", "Lcoil/ComponentRegistry$Builder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "components", "(Lkotlin/jvm/functions/Function1;)Lcoil/ImageLoader$Builder;", "Lcoil/ComponentRegistry;", "(Lcoil/ComponentRegistry;)Lcoil/ImageLoader$Builder;", "Lcoil/memory/MemoryCache;", "memoryCache", "(Lcoil/memory/MemoryCache;)Lcoil/ImageLoader$Builder;", "Lcoil/disk/DiskCache;", "diskCache", "(Lcoil/disk/DiskCache;)Lcoil/ImageLoader$Builder;", "", "enable", "allowHardware", "(Z)Lcoil/ImageLoader$Builder;", "allowRgb565", "addLastModifiedToFileCacheKey", "networkObserverEnabled", "respectCacheHeaders", "", "maxParallelism", "bitmapFactoryMaxParallelism", "(I)Lcoil/ImageLoader$Builder;", "Lcoil/decode/ExifOrientationPolicy;", "policy", "bitmapFactoryExifOrientationPolicy", "(Lcoil/decode/ExifOrientationPolicy;)Lcoil/ImageLoader$Builder;", "Lcoil/EventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "eventListener", "(Lcoil/EventListener;)Lcoil/ImageLoader$Builder;", "Lcoil/EventListener$Factory;", "factory", "eventListenerFactory", "(Lcoil/EventListener$Factory;)Lcoil/ImageLoader$Builder;", "crossfade", "durationMillis", "Lcoil/transition/Transition$Factory;", "transitionFactory", "(Lcoil/transition/Transition$Factory;)Lcoil/ImageLoader$Builder;", "Lcoil/size/Precision;", "precision", "(Lcoil/size/Precision;)Lcoil/ImageLoader$Builder;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "(Landroid/graphics/Bitmap$Config;)Lcoil/ImageLoader$Builder;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lcoil/ImageLoader$Builder;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "drawableResId", "placeholder", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)Lcoil/ImageLoader$Builder;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "fallback", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "(Lcoil/request/CachePolicy;)Lcoil/ImageLoader$Builder;", "diskCachePolicy", "networkCachePolicy", "Lcoil/util/Logger;", "logger", "(Lcoil/util/Logger;)Lcoil/ImageLoader$Builder;", "Lcoil/ImageLoader;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lcoil/ImageLoader;", "", "percent", "availableMemoryPercentage", "(D)Lcoil/ImageLoader$Builder;", "trackWeakReferences", "launchInterceptorChainOnMainThread", "componentRegistry", "registry", "Lcoil/transition/Transition;", "transition", "(Lcoil/transition/Transition;)Lcoil/ImageLoader$Builder;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "applicationContext", "Lcoil/request/DefaultRequestOptions;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/DefaultRequestOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lkotlin/Lazy;", OperatorName.CURVE_TO, "Lkotlin/Lazy;", "d", "e", OperatorName.FILL_NON_ZERO, "Lcoil/EventListener$Factory;", OperatorName.NON_STROKING_GRAY, "Lcoil/ComponentRegistry;", "Lcoil/util/ImageLoaderOptions;", OperatorName.CLOSE_PATH, "Lcoil/util/ImageLoaderOptions;", "options", "i", "Lcoil/util/Logger;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n1#2:596\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Context f40398a;

        /* renamed from: b */
        public DefaultRequestOptions f40399b;

        /* renamed from: c */
        public Lazy f40400c;

        /* renamed from: d */
        public Lazy f40401d;

        /* renamed from: e */
        public Lazy f40402e;

        /* renamed from: f */
        public EventListener.Factory f40403f;

        /* renamed from: g */
        public ComponentRegistry f40404g;

        /* renamed from: h */
        public ImageLoaderOptions f40405h;

        /* renamed from: i */
        public Logger f40406i;

        public Builder(@NotNull Context context) {
            this.f40398a = context.getApplicationContext();
            this.f40399b = Requests.getDEFAULT_REQUEST_OPTIONS();
            this.f40400c = null;
            this.f40401d = null;
            this.f40402e = null;
            this.f40403f = null;
            this.f40404g = null;
            this.f40405h = new ImageLoaderOptions(false, false, false, 0, null, 31, null);
            this.f40406i = null;
        }

        /* renamed from: b */
        public static final EventListener m51149b(EventListener eventListener, ImageRequest imageRequest) {
            return eventListener;
        }

        @NotNull
        public final Builder addLastModifiedToFileCacheKey(boolean z) {
            this.f40405h = ImageLoaderOptions.copy$default(this.f40405h, z, false, false, 0, null, 30, null);
            return this;
        }

        @NotNull
        public final Builder allowHardware(boolean z) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : z, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder allowRgb565(boolean z) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : z, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'memoryCache'.", replaceWith = @ReplaceWith(expression = "memoryCache { MemoryCache.Builder(context).maxSizePercent(percent).build() }", imports = {"coil.memory.MemoryCache"}))
        @NotNull
        public final Builder availableMemoryPercentage(@FloatRange(from = 0.0d, m64743to = 1.0d) double d) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder bitmapConfig(@NotNull Bitmap.Config config) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : config, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder bitmapFactoryExifOrientationPolicy(@NotNull ExifOrientationPolicy exifOrientationPolicy) {
            this.f40405h = ImageLoaderOptions.copy$default(this.f40405h, false, false, false, 0, exifOrientationPolicy, 15, null);
            return this;
        }

        @NotNull
        public final Builder bitmapFactoryMaxParallelism(int i) {
            if (i > 0) {
                this.f40405h = ImageLoaderOptions.copy$default(this.f40405h, false, false, false, i, null, 23, null);
                return this;
            }
            throw new IllegalArgumentException("maxParallelism must be > 0.".toString());
        }

        @NotNull
        public final ImageLoader build() {
            Context context = this.f40398a;
            DefaultRequestOptions defaultRequestOptions = this.f40399b;
            Lazy lazy = this.f40400c;
            if (lazy == null) {
                lazy = LazyKt__LazyJVMKt.lazy(new ImageLoader$Builder$build$1(this));
            }
            Lazy lazy2 = lazy;
            Lazy lazy3 = this.f40401d;
            if (lazy3 == null) {
                lazy3 = LazyKt__LazyJVMKt.lazy(new ImageLoader$Builder$build$2(this));
            }
            Lazy lazy4 = lazy3;
            Lazy lazy5 = this.f40402e;
            if (lazy5 == null) {
                lazy5 = LazyKt__LazyJVMKt.lazy(ImageLoader$Builder$build$3.INSTANCE);
            }
            Lazy lazy6 = lazy5;
            EventListener.Factory factory = this.f40403f;
            if (factory == null) {
                factory = EventListener.Factory.NONE;
            }
            EventListener.Factory factory2 = factory;
            ComponentRegistry componentRegistry = this.f40404g;
            if (componentRegistry == null) {
                componentRegistry = new ComponentRegistry();
            }
            return new RealImageLoader(context, defaultRequestOptions, lazy2, lazy4, lazy6, factory2, componentRegistry, this.f40405h, this.f40406i);
        }

        @NotNull
        public final Builder callFactory(@NotNull Call.Factory factory) {
            this.f40402e = AbstractC21973ri0.lazyOf(factory);
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with 'components'.", replaceWith = @ReplaceWith(expression = "components(builder)", imports = {}))
        public final /* synthetic */ Builder componentRegistry(Function1 function1) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        public final /* synthetic */ Builder components(Function1<? super ComponentRegistry.Builder, Unit> function1) {
            ComponentRegistry.Builder builder = new ComponentRegistry.Builder();
            function1.invoke(builder);
            return components(builder.build());
        }

        @NotNull
        public final Builder crossfade(boolean z) {
            return crossfade(z ? 100 : 0);
        }

        @NotNull
        public final Builder decoderDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : coroutineDispatcher, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder diskCache(@Nullable DiskCache diskCache) {
            this.f40401d = AbstractC21973ri0.lazyOf(diskCache);
            return this;
        }

        @NotNull
        public final Builder diskCachePolicy(@NotNull CachePolicy cachePolicy) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : cachePolicy, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder dispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : coroutineDispatcher, (r32 & 4) != 0 ? r1.f40665c : coroutineDispatcher, (r32 & 8) != 0 ? r1.f40666d : coroutineDispatcher, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder error(@DrawableRes int i) {
            return error(Contexts.getDrawableCompat(this.f40398a, i));
        }

        @NotNull
        public final Builder eventListener(@NotNull final EventListener eventListener) {
            return eventListenerFactory(new EventListener.Factory() { // from class: id0
                @Override // coil.EventListener.Factory
                public final EventListener create(ImageRequest imageRequest) {
                    EventListener m51149b;
                    m51149b = ImageLoader.Builder.m51149b(EventListener.this, imageRequest);
                    return m51149b;
                }
            });
        }

        @NotNull
        public final Builder eventListenerFactory(@NotNull EventListener.Factory factory) {
            this.f40403f = factory;
            return this;
        }

        @NotNull
        public final Builder fallback(@DrawableRes int i) {
            return fallback(Contexts.getDrawableCompat(this.f40398a, i));
        }

        @NotNull
        public final Builder fetcherDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : coroutineDispatcher, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder interceptorDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : coroutineDispatcher, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'interceptorDispatcher'.", replaceWith = @ReplaceWith(expression = "interceptorDispatcher(if (enable) Dispatchers.Main.immediate else Dispatchers.IO)", imports = {"kotlinx.coroutines.Dispatchers"}))
        @NotNull
        public final Builder launchInterceptorChainOnMainThread(boolean z) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder logger(@Nullable Logger logger) {
            this.f40406i = logger;
            return this;
        }

        @NotNull
        public final Builder memoryCache(@Nullable MemoryCache memoryCache) {
            this.f40400c = AbstractC21973ri0.lazyOf(memoryCache);
            return this;
        }

        @NotNull
        public final Builder memoryCachePolicy(@NotNull CachePolicy cachePolicy) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : cachePolicy, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder networkCachePolicy(@NotNull CachePolicy cachePolicy) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : cachePolicy);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder networkObserverEnabled(boolean z) {
            this.f40405h = ImageLoaderOptions.copy$default(this.f40405h, false, z, false, 0, null, 29, null);
            return this;
        }

        @NotNull
        public final Builder okHttpClient(@NotNull OkHttpClient okHttpClient) {
            return callFactory(okHttpClient);
        }

        @NotNull
        public final Builder placeholder(@DrawableRes int i) {
            return placeholder(Contexts.getDrawableCompat(this.f40398a, i));
        }

        @NotNull
        public final Builder precision(@NotNull Precision precision) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : precision, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder respectCacheHeaders(boolean z) {
            this.f40405h = ImageLoaderOptions.copy$default(this.f40405h, false, false, z, 0, null, 27, null);
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'memoryCache'.", replaceWith = @ReplaceWith(expression = "memoryCache { MemoryCache.Builder(context).weakReferencesEnabled(enable).build() }", imports = {"coil.memory.MemoryCache"}))
        @NotNull
        public final Builder trackWeakReferences(boolean z) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder transformationDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : coroutineDispatcher, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'transitionFactory'.", replaceWith = @ReplaceWith(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        @NotNull
        public final Builder transition(@NotNull Transition transition) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder transitionFactory(@NotNull Transition.Factory factory) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : factory, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder callFactory(@NotNull Function0<? extends Call.Factory> function0) {
            this.f40402e = LazyKt__LazyJVMKt.lazy(function0);
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with 'components'.", replaceWith = @ReplaceWith(expression = "components(registry)", imports = {}))
        @NotNull
        public final Builder componentRegistry(@NotNull ComponentRegistry componentRegistry) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder components(@NotNull ComponentRegistry componentRegistry) {
            this.f40404g = componentRegistry;
            return this;
        }

        @NotNull
        public final Builder crossfade(int i) {
            Transition.Factory factory;
            if (i > 0) {
                factory = new CrossfadeTransition.Factory(i, false, 2, null);
            } else {
                factory = Transition.Factory.NONE;
            }
            transitionFactory(factory);
            return this;
        }

        @NotNull
        public final Builder diskCache(@NotNull Function0<? extends DiskCache> function0) {
            this.f40401d = LazyKt__LazyJVMKt.lazy(function0);
            return this;
        }

        @NotNull
        public final Builder error(@Nullable Drawable drawable) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : drawable != null ? drawable.mutate() : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder fallback(@Nullable Drawable drawable) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : drawable != null ? drawable.mutate() : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        @NotNull
        public final Builder memoryCache(@NotNull Function0<? extends MemoryCache> function0) {
            this.f40400c = LazyKt__LazyJVMKt.lazy(function0);
            return this;
        }

        @NotNull
        public final Builder okHttpClient(@NotNull Function0<? extends OkHttpClient> function0) {
            return callFactory(function0);
        }

        @NotNull
        public final Builder placeholder(@Nullable Drawable drawable) {
            DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.f40663a : null, (r32 & 2) != 0 ? r1.f40664b : null, (r32 & 4) != 0 ? r1.f40665c : null, (r32 & 8) != 0 ? r1.f40666d : null, (r32 & 16) != 0 ? r1.f40667e : null, (r32 & 32) != 0 ? r1.f40668f : null, (r32 & 64) != 0 ? r1.f40669g : null, (r32 & 128) != 0 ? r1.f40670h : false, (r32 & 256) != 0 ? r1.f40671i : false, (r32 & 512) != 0 ? r1.f40672j : drawable != null ? drawable.mutate() : null, (r32 & 1024) != 0 ? r1.f40673k : null, (r32 & 2048) != 0 ? r1.f40674l : null, (r32 & 4096) != 0 ? r1.f40675m : null, (r32 & 8192) != 0 ? r1.f40676n : null, (r32 & 16384) != 0 ? this.f40399b.f40677o : null);
            this.f40399b = copy;
            return this;
        }

        public Builder(@NotNull RealImageLoader realImageLoader) {
            this.f40398a = realImageLoader.getContext().getApplicationContext();
            this.f40399b = realImageLoader.getDefaults();
            this.f40400c = realImageLoader.getMemoryCacheLazy();
            this.f40401d = realImageLoader.getDiskCacheLazy();
            this.f40402e = realImageLoader.getCallFactoryLazy();
            this.f40403f = realImageLoader.getEventListenerFactory();
            this.f40404g = realImageLoader.getComponentRegistry();
            this.f40405h = realImageLoader.getOptions();
            this.f40406i = realImageLoader.getLogger();
        }
    }

    @NotNull
    Disposable enqueue(@NotNull ImageRequest imageRequest);

    @Nullable
    Object execute(@NotNull ImageRequest imageRequest, @NotNull Continuation<? super ImageResult> continuation);

    @NotNull
    ComponentRegistry getComponents();

    @NotNull
    DefaultRequestOptions getDefaults();

    @Nullable
    DiskCache getDiskCache();

    @Nullable
    MemoryCache getMemoryCache();

    @NotNull
    Builder newBuilder();

    void shutdown();
}
