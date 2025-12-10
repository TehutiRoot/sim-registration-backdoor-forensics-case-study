package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.BitmapFactoryDecoder;
import coil.disk.DiskCache;
import coil.fetch.AssetUriFetcher;
import coil.fetch.BitmapFetcher;
import coil.fetch.ByteBufferFetcher;
import coil.fetch.ContentUriFetcher;
import coil.fetch.DrawableFetcher;
import coil.fetch.FileFetcher;
import coil.fetch.HttpUriFetcher;
import coil.fetch.ResourceUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.key.FileKeyer;
import coil.key.UriKeyer;
import coil.map.ByteArrayMapper;
import coil.map.FileUriMapper;
import coil.map.HttpUrlMapper;
import coil.map.ResourceIntMapper;
import coil.map.ResourceUriMapper;
import coil.map.StringMapper;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.OneShotDisposable;
import coil.request.RequestService;
import coil.target.ViewTarget;
import coil.util.ImageLoaderOptions;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.Call;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 w2\u00020\u0001:\u0001wBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J#\u0010,\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u001fH\u0083@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J)\u00104\u001a\u00020!2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J)\u00107\u001a\u00020!2\u0006\u0010/\u001a\u0002062\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b7\u0010A\u001a\u0004\bB\u0010CR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0006¢\u0006\f\n\u0004\b4\u0010A\u001a\u0004\bD\u0010CR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010e\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010L\u001a\u0004\bd\u0010NR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020g0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010%\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001d\u0010r\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\bn\u0010o*\u0004\bp\u0010qR\u001d\u0010v\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\bs\u0010t*\u0004\bu\u0010q\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006x"}, m29142d2 = {"Lcoil/RealImageLoader;", "Lcoil/ImageLoader;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcoil/request/DefaultRequestOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lkotlin/Lazy;", "Lcoil/memory/MemoryCache;", "memoryCacheLazy", "Lcoil/disk/DiskCache;", "diskCacheLazy", "Lokhttp3/Call$Factory;", "callFactoryLazy", "Lcoil/EventListener$Factory;", "eventListenerFactory", "Lcoil/ComponentRegistry;", "componentRegistry", "Lcoil/util/ImageLoaderOptions;", "options", "Lcoil/util/Logger;", "logger", "<init>", "(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil/EventListener$Factory;Lcoil/ComponentRegistry;Lcoil/util/ImageLoaderOptions;Lcoil/util/Logger;)V", "Lcoil/request/ImageRequest;", "request", "Lcoil/request/Disposable;", "enqueue", "(Lcoil/request/ImageRequest;)Lcoil/request/Disposable;", "Lcoil/request/ImageResult;", "execute", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "level", "", "onTrimMemory$coil_base_release", "(I)V", "onTrimMemory", "shutdown", "()V", "Lcoil/ImageLoader$Builder;", "newBuilder", "()Lcoil/ImageLoader$Builder;", "initialRequest", "type", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lcoil/request/ImageRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcoil/request/SuccessResult;", "result", "Lcoil/target/Target;", TypedValues.AttributesType.S_TARGET, "Lcoil/EventListener;", "eventListener", "d", "(Lcoil/request/SuccessResult;Lcoil/target/Target;Lcoil/EventListener;)V", "Lcoil/request/ErrorResult;", OperatorName.CURVE_TO, "(Lcoil/request/ErrorResult;Lcoil/target/Target;Lcoil/EventListener;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lcoil/request/ImageRequest;Lcoil/EventListener;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "Lkotlin/Lazy;", "getMemoryCacheLazy", "()Lkotlin/Lazy;", "getDiskCacheLazy", "e", "getCallFactoryLazy", OperatorName.FILL_NON_ZERO, "Lcoil/EventListener$Factory;", "getEventListenerFactory", "()Lcoil/EventListener$Factory;", OperatorName.NON_STROKING_GRAY, "Lcoil/ComponentRegistry;", "getComponentRegistry", "()Lcoil/ComponentRegistry;", OperatorName.CLOSE_PATH, "Lcoil/util/ImageLoaderOptions;", "getOptions", "()Lcoil/util/ImageLoaderOptions;", "i", "Lcoil/util/Logger;", "getLogger", "()Lcoil/util/Logger;", "Lkotlinx/coroutines/CoroutineScope;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlinx/coroutines/CoroutineScope;", Action.SCOPE_ATTRIBUTE, "Lcoil/util/SystemCallbacks;", OperatorName.NON_STROKING_CMYK, "Lcoil/util/SystemCallbacks;", "systemCallbacks", "Lcoil/request/RequestService;", OperatorName.LINE_TO, "Lcoil/request/RequestService;", "requestService", OperatorName.MOVE_TO, "getComponents", "components", "", "Lcoil/intercept/Interceptor;", OperatorName.ENDPATH, "Ljava/util/List;", "interceptors", "Ljava/util/concurrent/atomic/AtomicBoolean;", "o", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "getMemoryCache$delegate", "(Lcoil/RealImageLoader;)Ljava/lang/Object;", "memoryCache", "getDiskCache", "()Lcoil/disk/DiskCache;", "getDiskCache$delegate", "diskCache", "Companion", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRealImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 ComponentRegistry.kt\ncoil/ComponentRegistry$Builder\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Utils.kt\ncoil/util/-Utils\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 8 Logs.kt\ncoil/util/-Logs\n*L\n1#1,296:1\n274#1,15:326\n274#1,15:345\n48#2,4:297\n138#3:301\n138#3:302\n138#3:303\n138#3:304\n138#3:305\n138#3:306\n146#3:307\n146#3:308\n154#3:309\n154#3:310\n154#3:311\n154#3:312\n154#3:313\n154#3:314\n154#3:315\n154#3:316\n1#4:317\n1#4:319\n173#5:318\n45#6:320\n28#7:321\n21#8,4:322\n21#8,4:341\n21#8,4:360\n*S KotlinDebug\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n*L\n241#1:326,15\n255#1:345,15\n78#1:297,4\n85#1:301\n86#1:302\n87#1:303\n88#1:304\n89#1:305\n90#1:306\n92#1:307\n93#1:308\n95#1:309\n96#1:310\n97#1:311\n98#1:312\n99#1:313\n100#1:314\n101#1:315\n102#1:316\n170#1:319\n170#1:318\n171#1:320\n171#1:321\n238#1:322,4\n252#1:341,4\n261#1:360,4\n*E\n"})
/* loaded from: classes3.dex */
public final class RealImageLoader implements ImageLoader {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Context f40419a;

    /* renamed from: b */
    public final DefaultRequestOptions f40420b;

    /* renamed from: c */
    public final Lazy f40421c;

    /* renamed from: d */
    public final Lazy f40422d;

    /* renamed from: e */
    public final Lazy f40423e;

    /* renamed from: f */
    public final EventListener.Factory f40424f;

    /* renamed from: g */
    public final ComponentRegistry f40425g;

    /* renamed from: h */
    public final ImageLoaderOptions f40426h;

    /* renamed from: i */
    public final Logger f40427i;

    /* renamed from: j */
    public final CoroutineScope f40428j = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new RealImageLoader$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this)));

    /* renamed from: k */
    public final SystemCallbacks f40429k;

    /* renamed from: l */
    public final RequestService f40430l;

    /* renamed from: m */
    public final ComponentRegistry f40431m;

    /* renamed from: n */
    public final List f40432n;

    /* renamed from: o */
    public final AtomicBoolean f40433o;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lcoil/RealImageLoader$Companion;", "", "()V", "REQUEST_TYPE_ENQUEUE", "", "REQUEST_TYPE_EXECUTE", "TAG", "", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RealImageLoader(@NotNull Context context, @NotNull DefaultRequestOptions defaultRequestOptions, @NotNull Lazy<? extends MemoryCache> lazy, @NotNull Lazy<? extends DiskCache> lazy2, @NotNull Lazy<? extends Call.Factory> lazy3, @NotNull EventListener.Factory factory, @NotNull ComponentRegistry componentRegistry, @NotNull ImageLoaderOptions imageLoaderOptions, @Nullable Logger logger) {
        this.f40419a = context;
        this.f40420b = defaultRequestOptions;
        this.f40421c = lazy;
        this.f40422d = lazy2;
        this.f40423e = lazy3;
        this.f40424f = factory;
        this.f40425g = componentRegistry;
        this.f40426h = imageLoaderOptions;
        this.f40427i = logger;
        SystemCallbacks systemCallbacks = new SystemCallbacks(this, context, imageLoaderOptions.getNetworkObserverEnabled());
        this.f40429k = systemCallbacks;
        RequestService requestService = new RequestService(this, systemCallbacks, logger);
        this.f40430l = requestService;
        this.f40431m = componentRegistry.newBuilder().add(new HttpUrlMapper(), HttpUrl.class).add(new StringMapper(), String.class).add(new FileUriMapper(), Uri.class).add(new ResourceUriMapper(), Uri.class).add(new ResourceIntMapper(), Integer.class).add(new ByteArrayMapper(), byte[].class).add(new UriKeyer(), Uri.class).add(new FileKeyer(imageLoaderOptions.getAddLastModifiedToFileCacheKey()), File.class).add(new HttpUriFetcher.Factory(lazy3, lazy2, imageLoaderOptions.getRespectCacheHeaders()), Uri.class).add(new FileFetcher.Factory(), File.class).add(new AssetUriFetcher.Factory(), Uri.class).add(new ContentUriFetcher.Factory(), Uri.class).add(new ResourceUriFetcher.Factory(), Uri.class).add(new DrawableFetcher.Factory(), Drawable.class).add(new BitmapFetcher.Factory(), Bitmap.class).add(new ByteBufferFetcher.Factory(), ByteBuffer.class).add(new BitmapFactoryDecoder.Factory(imageLoaderOptions.getBitmapFactoryMaxParallelism(), imageLoaderOptions.getBitmapFactoryExifOrientationPolicy())).build();
        this.f40432n = CollectionsKt___CollectionsKt.plus((Collection<? extends EngineInterceptor>) getComponents().getInterceptors(), new EngineInterceptor(this, requestService, logger));
        this.f40433o = new AtomicBoolean(false);
        systemCallbacks.register();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8 A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:44:0x00f2, B:46:0x00f8, B:48:0x00fe, B:53:0x010b, B:56:0x0113, B:58:0x0125, B:60:0x012b, B:61:0x012e, B:63:0x0137, B:64:0x013a, B:57:0x0121), top: B:97:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113 A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:44:0x00f2, B:46:0x00f8, B:48:0x00fe, B:53:0x010b, B:56:0x0113, B:58:0x0125, B:60:0x012b, B:61:0x012e, B:63:0x0137, B:64:0x013a, B:57:0x0121), top: B:97:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121 A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:44:0x00f2, B:46:0x00f8, B:48:0x00fe, B:53:0x010b, B:56:0x0113, B:58:0x0125, B:60:0x012b, B:61:0x012e, B:63:0x0137, B:64:0x013a, B:57:0x0121), top: B:97:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:44:0x00f2, B:46:0x00f8, B:48:0x00fe, B:53:0x010b, B:56:0x0113, B:58:0x0125, B:60:0x012b, B:61:0x012e, B:63:0x0137, B:64:0x013a, B:57:0x0121), top: B:97:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137 A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:44:0x00f2, B:46:0x00f8, B:48:0x00fe, B:53:0x010b, B:56:0x0113, B:58:0x0125, B:60:0x012b, B:61:0x012e, B:63:0x0137, B:64:0x013a, B:57:0x0121), top: B:97:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190 A[Catch: all -> 0x004b, TryCatch #5 {all -> 0x004b, blocks: (B:14:0x0046, B:72:0x018a, B:74:0x0190, B:75:0x019b, B:77:0x019f), top: B:101:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019b A[Catch: all -> 0x004b, TryCatch #5 {all -> 0x004b, blocks: (B:14:0x0046, B:72:0x018a, B:74:0x0190, B:75:0x019b, B:77:0x019f), top: B:101:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7 A[Catch: all -> 0x01c8, TRY_LEAVE, TryCatch #3 {all -> 0x01c8, blocks: (B:82:0x01b3, B:84:0x01b7, B:89:0x01ca, B:90:0x01cd), top: B:99:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca A[Catch: all -> 0x01c8, TRY_ENTER, TryCatch #3 {all -> 0x01c8, blocks: (B:82:0x01b3, B:84:0x01b7, B:89:0x01ca, B:90:0x01cd), top: B:99:0x01b3 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m51145a(coil.request.ImageRequest r21, int r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.m51145a(coil.request.ImageRequest, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public final void m51144b(ImageRequest imageRequest, EventListener eventListener) {
        Logger logger = this.f40427i;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log("RealImageLoader", 4, "🏗  Cancelled - " + imageRequest.getData(), null);
        }
        eventListener.onCancel(imageRequest);
        ImageRequest.Listener listener = imageRequest.getListener();
        if (listener != null) {
            listener.onCancel(imageRequest);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r8 != null) goto L15;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m51143c(coil.request.ErrorResult r7, coil.target.Target r8, coil.EventListener r9) {
        /*
            r6 = this;
            coil.request.ImageRequest r0 = r7.getRequest()
            coil.util.Logger r1 = r6.f40427i
            if (r1 == 0) goto L36
            int r2 = r1.getLevel()
            r3 = 4
            if (r2 > r3) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "🚨 Failed - "
            r2.append(r4)
            java.lang.Object r4 = r0.getData()
            r2.append(r4)
            java.lang.String r4 = " - "
            r2.append(r4)
            java.lang.Throwable r4 = r7.getThrowable()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.log(r5, r3, r2, r4)
        L36:
            boolean r1 = r8 instanceof coil.transition.TransitionTarget
            if (r1 != 0) goto L3d
            if (r8 == 0) goto L69
            goto L50
        L3d:
            coil.request.ImageRequest r1 = r7.getRequest()
            coil.transition.Transition$Factory r1 = r1.getTransitionFactory()
            r2 = r8
            coil.transition.TransitionTarget r2 = (coil.transition.TransitionTarget) r2
            coil.transition.Transition r1 = r1.create(r2, r7)
            boolean r2 = r1 instanceof coil.transition.NoneTransition
            if (r2 == 0) goto L58
        L50:
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            r8.onError(r1)
            goto L69
        L58:
            coil.request.ImageRequest r8 = r7.getRequest()
            r9.transitionStart(r8, r1)
            r1.transition()
            coil.request.ImageRequest r8 = r7.getRequest()
            r9.transitionEnd(r8, r1)
        L69:
            r9.onError(r0, r7)
            coil.request.ImageRequest$Listener r8 = r0.getListener()
            if (r8 == 0) goto L75
            r8.onError(r0, r7)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.m51143c(coil.request.ErrorResult, coil.target.Target, coil.EventListener):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r8 != null) goto L15;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m51142d(coil.request.SuccessResult r7, coil.target.Target r8, coil.EventListener r9) {
        /*
            r6 = this;
            coil.request.ImageRequest r0 = r7.getRequest()
            coil.decode.DataSource r1 = r7.getDataSource()
            coil.util.Logger r2 = r6.f40427i
            if (r2 == 0) goto L41
            int r3 = r2.getLevel()
            r4 = 4
            if (r3 > r4) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = coil.util.Utils.getEmoji(r1)
            r3.append(r5)
            java.lang.String r5 = " Successful ("
            r3.append(r5)
            java.lang.String r1 = r1.name()
            r3.append(r1)
            java.lang.String r1 = ") - "
            r3.append(r1)
            java.lang.Object r1 = r0.getData()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 0
            java.lang.String r5 = "RealImageLoader"
            r2.log(r5, r4, r1, r3)
        L41:
            boolean r1 = r8 instanceof coil.transition.TransitionTarget
            if (r1 != 0) goto L48
            if (r8 == 0) goto L74
            goto L5b
        L48:
            coil.request.ImageRequest r1 = r7.getRequest()
            coil.transition.Transition$Factory r1 = r1.getTransitionFactory()
            r2 = r8
            coil.transition.TransitionTarget r2 = (coil.transition.TransitionTarget) r2
            coil.transition.Transition r1 = r1.create(r2, r7)
            boolean r2 = r1 instanceof coil.transition.NoneTransition
            if (r2 == 0) goto L63
        L5b:
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            r8.onSuccess(r1)
            goto L74
        L63:
            coil.request.ImageRequest r8 = r7.getRequest()
            r9.transitionStart(r8, r1)
            r1.transition()
            coil.request.ImageRequest r8 = r7.getRequest()
            r9.transitionEnd(r8, r1)
        L74:
            r9.onSuccess(r0, r7)
            coil.request.ImageRequest$Listener r8 = r0.getListener()
            if (r8 == 0) goto L80
            r8.onSuccess(r0, r7)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.m51142d(coil.request.SuccessResult, coil.target.Target, coil.EventListener):void");
    }

    @Override // coil.ImageLoader
    @NotNull
    public Disposable enqueue(@NotNull ImageRequest imageRequest) {
        Deferred<? extends ImageResult> m65888b;
        m65888b = AbstractC1539Vc.m65888b(this.f40428j, null, null, new RealImageLoader$enqueue$job$1(this, imageRequest, null), 3, null);
        if (imageRequest.getTarget() instanceof ViewTarget) {
            return Utils.getRequestManager(((ViewTarget) imageRequest.getTarget()).getView()).getDisposable(m65888b);
        }
        return new OneShotDisposable(m65888b);
    }

    @Override // coil.ImageLoader
    @Nullable
    public Object execute(@NotNull ImageRequest imageRequest, @NotNull Continuation<? super ImageResult> continuation) {
        return CoroutineScopeKt.coroutineScope(new RealImageLoader$execute$2(imageRequest, this, null), continuation);
    }

    @NotNull
    public final Lazy<Call.Factory> getCallFactoryLazy() {
        return this.f40423e;
    }

    @NotNull
    public final ComponentRegistry getComponentRegistry() {
        return this.f40425g;
    }

    @Override // coil.ImageLoader
    @NotNull
    public ComponentRegistry getComponents() {
        return this.f40431m;
    }

    @NotNull
    public final Context getContext() {
        return this.f40419a;
    }

    @Override // coil.ImageLoader
    @NotNull
    public DefaultRequestOptions getDefaults() {
        return this.f40420b;
    }

    @Override // coil.ImageLoader
    @Nullable
    public DiskCache getDiskCache() {
        return (DiskCache) this.f40422d.getValue();
    }

    @NotNull
    public final Lazy<DiskCache> getDiskCacheLazy() {
        return this.f40422d;
    }

    @NotNull
    public final EventListener.Factory getEventListenerFactory() {
        return this.f40424f;
    }

    @Nullable
    public final Logger getLogger() {
        return this.f40427i;
    }

    @Override // coil.ImageLoader
    @Nullable
    public MemoryCache getMemoryCache() {
        return (MemoryCache) this.f40421c.getValue();
    }

    @NotNull
    public final Lazy<MemoryCache> getMemoryCacheLazy() {
        return this.f40421c;
    }

    @NotNull
    public final ImageLoaderOptions getOptions() {
        return this.f40426h;
    }

    @Override // coil.ImageLoader
    @NotNull
    public ImageLoader.Builder newBuilder() {
        return new ImageLoader.Builder(this);
    }

    public final void onTrimMemory$coil_base_release(int i) {
        MemoryCache memoryCache;
        Lazy lazy = this.f40421c;
        if (lazy != null && (memoryCache = (MemoryCache) lazy.getValue()) != null) {
            memoryCache.trimMemory(i);
        }
    }

    @Override // coil.ImageLoader
    public void shutdown() {
        if (this.f40433o.getAndSet(true)) {
            return;
        }
        CoroutineScopeKt.cancel$default(this.f40428j, null, 1, null);
        this.f40429k.shutdown();
        MemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }
}