package coil.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import coil.ComponentRegistry;
import coil.EventListener;
import coil.base.R;
import coil.decode.DataSource;
import coil.decode.Decoder;
import coil.disk.DiskCache;
import coil.fetch.Fetcher;
import coil.intercept.Interceptor;
import coil.intercept.RealInterceptorChain;
import coil.memory.MemoryCache;
import coil.request.Parameters;
import coil.request.Tags;
import coil.request.ViewTargetRequestManager;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import com.google.android.gms.common.internal.ImagesContract;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Deferred;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\n\u001a\u00020\f*\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\n\u0010\r\u001a\u0015\u0010\n\u001a\u00020\u000e*\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\n\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0080\n¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010\"\u001a\u00020\u001d*\u00020\u001d2\u001c\u0010!\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0018\u00010\u001eH\u0080\b¢\u0006\u0004\b\"\u0010#\u001a\u001e\u0010\"\u001a\u00020\u001d*\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010$H\u0080\b¢\u0006\u0004\b\"\u0010&\u001a\u001b\u0010)\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010,\u001a\u00020\u0001*\u00020+H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010.\u001a\u00020\u0010*\u00020'H\u0000¢\u0006\u0004\b.\u0010/\u001a*\u00105\u001a\u00020'*\u0002002\u0006\u00102\u001a\u0002012\f\u00104\u001a\b\u0012\u0004\u0012\u00020'03H\u0080\b¢\u0006\u0004\b5\u00106\u001a*\u00107\u001a\u00020'*\u0002002\u0006\u00102\u001a\u0002012\f\u00104\u001a\b\u0012\u0004\u0012\u00020'03H\u0080\b¢\u0006\u0004\b7\u00106\u001a\u001b\u00109\u001a\u00020'*\u0002082\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b9\u0010:\u001a\u000f\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b<\u0010=\u001a\u0017\u0010@\u001a\u00020\u00102\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\b@\u0010A\u001a\u001b\u0010D\u001a\u00020B*\u00020B2\u0006\u0010C\u001a\u00020\u0005H\u0000¢\u0006\u0004\bD\u0010E\u001a\u0013\u0010H\u001a\u00020G*\u00020FH\u0000¢\u0006\u0004\bH\u0010I\u001a\u0017\u0010M\u001a\u00020L2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bM\u0010N\u001a\u001f\u0010P\u001a\u00020'2\u0006\u0010K\u001a\u00020J2\u0006\u0010O\u001a\u00020LH\u0000¢\u0006\u0004\bP\u0010Q\" \u0010X\u001a\b\u0012\u0004\u0012\u00020S0R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u001a\u0010]\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u001c\u0010c\u001a\u0004\u0018\u00010^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u001a\u0010h\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0014\u0010i\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bi\u0010j\"\u0014\u0010k\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bk\u0010j\"\u0014\u0010l\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bl\u0010j\"\u0014\u0010m\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bm\u0010j\"\u0014\u0010n\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bn\u0010j\"\u0018\u0010s\u001a\u00020p*\u00020o8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r\"\u0018\u0010w\u001a\u00020\u0005*\u00020t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v\"\u0018\u0010{\u001a\u00020'*\u00020x8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\by\u0010z\"\u0018\u0010}\u001a\u00020'*\u00020x8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b|\u0010z\"\u0018\u0010~\u001a\u00020\u0010*\u00020x8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007f\"\u001b\u00102\u001a\u000201*\u00030\u0080\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u001d\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005*\u00020>8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u001c\u0010\u0089\u0001\u001a\u00020'*\u00030\u0086\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u001d\u0010\u008d\u0001\u001a\u00020'*\u00030\u008a\u00018À\u0002X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u001c\u0010\u0091\u0001\u001a\u00030\u008e\u0001*\u00020J8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u001c\u0010\u0093\u0001\u001a\u00020\u0010*\u00030\u0092\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u001d\u0010\u0098\u0001\u001a\u00030\u0095\u0001*\u00030\u0092\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u0099\u0001"}, m28850d2 = {"Ljava/io/Closeable;", "", "closeQuietly", "(Ljava/io/Closeable;)V", "Landroid/webkit/MimeTypeMap;", "", ImagesContract.URL, "getMimeTypeFromUrl", "(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Headers;", "orEmpty", "(Lokhttp3/Headers;)Lokhttp3/Headers;", "Lcoil/request/Tags;", "(Lcoil/request/Tags;)Lcoil/request/Tags;", "Lcoil/request/Parameters;", "(Lcoil/request/Parameters;)Lcoil/request/Parameters;", "", "isMainThread", "()Z", "T", "Lkotlinx/coroutines/Deferred;", "getCompletedOrNull", "(Lkotlinx/coroutines/Deferred;)Ljava/lang/Object;", "Lcoil/memory/MemoryCache;", "Lcoil/memory/MemoryCache$Key;", Action.KEY_ATTRIBUTE, "Lcoil/memory/MemoryCache$Value;", "get", "(Lcoil/memory/MemoryCache;Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$Value;", "Lcoil/ComponentRegistry$Builder;", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "pair", "addFirst", "(Lcoil/ComponentRegistry$Builder;Lkotlin/Pair;)Lcoil/ComponentRegistry$Builder;", "Lcoil/decode/Decoder$Factory;", "factory", "(Lcoil/ComponentRegistry$Builder;Lcoil/decode/Decoder$Factory;)Lcoil/ComponentRegistry$Builder;", "", "defaultValue", "toNonNegativeInt", "(Ljava/lang/String;I)I", "Lcoil/disk/DiskCache$Editor;", "abortQuietly", "(Lcoil/disk/DiskCache$Editor;)V", "isMinOrMax", "(I)Z", "Lcoil/size/Size;", "Lcoil/size/Scale;", "scale", "Lkotlin/Function0;", "original", "widthPx", "(Lcoil/size/Size;Lcoil/size/Scale;Lkotlin/jvm/functions/Function0;)I", "heightPx", "Lcoil/size/Dimension;", "toPx", "(Lcoil/size/Dimension;Lcoil/size/Scale;)I", "", "unsupported", "()Ljava/lang/Void;", "Landroid/net/Uri;", "uri", "isAssetUri", "(Landroid/net/Uri;)Z", "Lokhttp3/Headers$Builder;", "line", "addUnsafeNonAscii", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "Lokhttp3/Response;", "Lokhttp3/ResponseBody;", "requireBody", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "defaultMemoryCacheSizePercent", "(Landroid/content/Context;)D", "percent", "calculateMemoryCacheSize", "(Landroid/content/Context;D)I", "", "Landroid/graphics/Bitmap$Config;", PDPageLabelRange.STYLE_LETTERS_LOWER, "[Landroid/graphics/Bitmap$Config;", "getVALID_TRANSFORMATION_CONFIGS", "()[Landroid/graphics/Bitmap$Config;", "VALID_TRANSFORMATION_CONFIGS", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/graphics/Bitmap$Config;", "getDEFAULT_BITMAP_CONFIG", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "Landroid/graphics/ColorSpace;", OperatorName.CURVE_TO, "Landroid/graphics/ColorSpace;", "getNULL_COLOR_SPACE", "()Landroid/graphics/ColorSpace;", "NULL_COLOR_SPACE", "d", "Lokhttp3/Headers;", "getEMPTY_HEADERS", "()Lokhttp3/Headers;", "EMPTY_HEADERS", "MIME_TYPE_JPEG", "Ljava/lang/String;", "MIME_TYPE_WEBP", "MIME_TYPE_HEIC", "MIME_TYPE_HEIF", "ASSET_FILE_PATH_ROOT", "Landroid/view/View;", "Lcoil/request/ViewTargetRequestManager;", "getRequestManager", "(Landroid/view/View;)Lcoil/request/ViewTargetRequestManager;", "requestManager", "Lcoil/decode/DataSource;", "getEmoji", "(Lcoil/decode/DataSource;)Ljava/lang/String;", "emoji", "Landroid/graphics/drawable/Drawable;", "getWidth", "(Landroid/graphics/drawable/Drawable;)I", "width", "getHeight", "height", "isVector", "(Landroid/graphics/drawable/Drawable;)Z", "Landroid/widget/ImageView;", "getScale", "(Landroid/widget/ImageView;)Lcoil/size/Scale;", "getFirstPathSegment", "(Landroid/net/Uri;)Ljava/lang/String;", "firstPathSegment", "Landroid/content/res/Configuration;", "getNightMode", "(Landroid/content/res/Configuration;)I", "nightMode", "", "getIdentityHashCode", "(Ljava/lang/Object;)I", "identityHashCode", "Ljava/io/File;", "getSafeCacheDir", "(Landroid/content/Context;)Ljava/io/File;", "safeCacheDir", "Lcoil/intercept/Interceptor$Chain;", "isPlaceholderCached", "(Lcoil/intercept/Interceptor$Chain;)Z", "Lcoil/EventListener;", "getEventListener", "(Lcoil/intercept/Interceptor$Chain;)Lcoil/EventListener;", "eventListener", "coil-base_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@JvmName(name = "-Utils")
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dimension.kt\ncoil/size/-Dimensions\n+ 4 Contexts.kt\ncoil/util/-Contexts\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,302:1\n1#2:303\n57#3:304\n78#4:305\n78#4:307\n31#5:306\n31#5:308\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n*L\n226#1:304\n258#1:305\n270#1:307\n258#1:306\n270#1:308\n*E\n"})
/* renamed from: coil.util.-Utils  reason: invalid class name */
/* loaded from: classes3.dex */
public final class Utils {
    @NotNull
    public static final String ASSET_FILE_PATH_ROOT = "android_asset";
    @NotNull
    public static final String MIME_TYPE_HEIC = "image/heic";
    @NotNull
    public static final String MIME_TYPE_HEIF = "image/heif";
    @NotNull
    public static final String MIME_TYPE_JPEG = "image/jpeg";
    @NotNull
    public static final String MIME_TYPE_WEBP = "image/webp";

    /* renamed from: a */
    public static final Bitmap.Config[] f40858a;

    /* renamed from: b */
    public static final Bitmap.Config f40859b;

    /* renamed from: c */
    public static final ColorSpace f40860c = null;

    /* renamed from: d */
    public static final Headers f40861d;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: coil.util.-Utils$WhenMappings */
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataSource.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataSource.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataSource.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            try {
                iArr3[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        f40858a = configArr;
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f40859b = config;
        f40861d = new Headers.Builder().build();
    }

    public static final void abortQuietly(@NotNull DiskCache.Editor editor) {
        try {
            editor.abort();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ComponentRegistry.Builder addFirst(@NotNull ComponentRegistry.Builder builder, @Nullable Pair<? extends Fetcher.Factory<?>, ? extends Class<?>> pair) {
        if (pair != 0) {
            builder.getFetcherFactories$coil_base_release().add(0, pair);
        }
        return builder;
    }

    @NotNull
    public static final Headers.Builder addUnsafeNonAscii(@NotNull Headers.Builder builder, @NotNull String str) {
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            String substring = str.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String obj = StringsKt__StringsKt.trim(substring).toString();
            String substring2 = str.substring(indexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            builder.addUnsafeNonAscii(obj, substring2);
            return builder;
        }
        throw new IllegalArgumentException(("Unexpected header: " + str).toString());
    }

    public static final int calculateMemoryCacheSize(@NotNull Context context, double d) {
        int i;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            if ((context.getApplicationInfo().flags & 1048576) != 0) {
                i = activityManager.getLargeMemoryClass();
            } else {
                i = activityManager.getMemoryClass();
            }
        } catch (Exception unused) {
            i = 256;
        }
        double d2 = 1024;
        return (int) (d * i * d2 * d2);
    }

    public static final void closeQuietly(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final double defaultMemoryCacheSizePercent(@NotNull Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            if (!((ActivityManager) systemService).isLowRamDevice()) {
                return 0.2d;
            }
            return 0.15d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    @Nullable
    public static final MemoryCache.Value get(@NotNull MemoryCache memoryCache, @Nullable MemoryCache.Key key) {
        if (key != null) {
            return memoryCache.get(key);
        }
        return null;
    }

    @Nullable
    public static final <T> T getCompletedOrNull(@NotNull Deferred<? extends T> deferred) {
        try {
            return deferred.getCompleted();
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final Bitmap.Config getDEFAULT_BITMAP_CONFIG() {
        return f40859b;
    }

    @NotNull
    public static final Headers getEMPTY_HEADERS() {
        return f40861d;
    }

    @NotNull
    public static final String getEmoji(@NotNull DataSource dataSource) {
        int i = WhenMappings.$EnumSwitchMapping$0[dataSource.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return Emoji.CLOUD;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Emoji.FLOPPY;
        }
        return Emoji.BRAIN;
    }

    @NotNull
    public static final EventListener getEventListener(@NotNull Interceptor.Chain chain) {
        if (chain instanceof RealInterceptorChain) {
            return ((RealInterceptorChain) chain).getEventListener();
        }
        return EventListener.NONE;
    }

    @Nullable
    public static final String getFirstPathSegment(@NotNull Uri uri) {
        return (String) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) uri.getPathSegments());
    }

    public static final int getHeight(@NotNull Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            return bitmap.getHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public static final int getIdentityHashCode(@NotNull Object obj) {
        return System.identityHashCode(obj);
    }

    @Nullable
    public static final String getMimeTypeFromUrl(@NotNull MimeTypeMap mimeTypeMap, @Nullable String str) {
        if (str == null || AbstractC20204hN1.isBlank(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringBeforeLast$default(StringsKt__StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    @Nullable
    public static final ColorSpace getNULL_COLOR_SPACE() {
        return f40860c;
    }

    public static final int getNightMode(@NotNull Configuration configuration) {
        return configuration.uiMode & 48;
    }

    @NotNull
    public static final ViewTargetRequestManager getRequestManager(@NotNull View view) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        Object tag = view.getTag(R.id.coil_request_manager);
        ViewTargetRequestManager viewTargetRequestManager = null;
        if (tag instanceof ViewTargetRequestManager) {
            onAttachStateChangeListener = (ViewTargetRequestManager) tag;
        } else {
            onAttachStateChangeListener = null;
        }
        if (onAttachStateChangeListener == null) {
            synchronized (view) {
                try {
                    Object tag2 = view.getTag(R.id.coil_request_manager);
                    if (tag2 instanceof ViewTargetRequestManager) {
                        viewTargetRequestManager = (ViewTargetRequestManager) tag2;
                    }
                    if (viewTargetRequestManager != null) {
                        onAttachStateChangeListener = viewTargetRequestManager;
                    } else {
                        onAttachStateChangeListener = new ViewTargetRequestManager(view);
                        view.addOnAttachStateChangeListener(onAttachStateChangeListener);
                        view.setTag(R.id.coil_request_manager, onAttachStateChangeListener);
                    }
                } finally {
                }
            }
        }
        return onAttachStateChangeListener;
    }

    @NotNull
    public static final File getSafeCacheDir(@NotNull Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null".toString());
    }

    @NotNull
    public static final Scale getScale(@NotNull ImageView imageView) {
        int i;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        if (scaleType == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$1[scaleType.ordinal()];
        }
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            return Scale.FILL;
        }
        return Scale.FIT;
    }

    @NotNull
    public static final Bitmap.Config[] getVALID_TRANSFORMATION_CONFIGS() {
        return f40858a;
    }

    public static final int getWidth(@NotNull Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            return bitmap.getWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public static final int heightPx(@NotNull Size size, @NotNull Scale scale, @NotNull Function0<Integer> function0) {
        if (Sizes.isOriginal(size)) {
            return function0.invoke().intValue();
        }
        return toPx(size.getHeight(), scale);
    }

    public static final boolean isAssetUri(@NotNull Uri uri) {
        if (Intrinsics.areEqual(uri.getScheme(), "file") && Intrinsics.areEqual(getFirstPathSegment(uri), ASSET_FILE_PATH_ROOT)) {
            return true;
        }
        return false;
    }

    public static final boolean isMainThread() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean isMinOrMax(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final boolean isPlaceholderCached(@NotNull Interceptor.Chain chain) {
        if ((chain instanceof RealInterceptorChain) && ((RealInterceptorChain) chain).isPlaceholderCached()) {
            return true;
        }
        return false;
    }

    public static final boolean isVector(@NotNull Drawable drawable) {
        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof VectorDrawableCompat)) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final Headers orEmpty(@Nullable Headers headers) {
        return headers == null ? f40861d : headers;
    }

    @NotNull
    public static final ResponseBody requireBody(@NotNull Response response) {
        ResponseBody body = response.body();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("response body == null".toString());
    }

    public static final int toNonNegativeInt(@NotNull String str, int i) {
        Long longOrNull = AbstractC20032gN1.toLongOrNull(str);
        if (longOrNull != null) {
            long longValue = longOrNull.longValue();
            if (longValue > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (longValue < 0) {
                return 0;
            }
            return (int) longValue;
        }
        return i;
    }

    public static final int toPx(@NotNull Dimension dimension, @NotNull Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).f40827px;
        }
        int i = WhenMappings.$EnumSwitchMapping$2[scale.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Integer.MAX_VALUE;
            }
            throw new NoWhenBranchMatchedException();
        }
        return Integer.MIN_VALUE;
    }

    @NotNull
    public static final Void unsupported() {
        throw new IllegalStateException("Unsupported".toString());
    }

    public static final int widthPx(@NotNull Size size, @NotNull Scale scale, @NotNull Function0<Integer> function0) {
        if (Sizes.isOriginal(size)) {
            return function0.invoke().intValue();
        }
        return toPx(size.getWidth(), scale);
    }

    @NotNull
    public static final ComponentRegistry.Builder addFirst(@NotNull ComponentRegistry.Builder builder, @Nullable Decoder.Factory factory) {
        if (factory != null) {
            builder.getDecoderFactories$coil_base_release().add(0, factory);
        }
        return builder;
    }

    @NotNull
    public static final Tags orEmpty(@Nullable Tags tags) {
        return tags == null ? Tags.EMPTY : tags;
    }

    @NotNull
    public static final Parameters orEmpty(@Nullable Parameters parameters) {
        return parameters == null ? Parameters.EMPTY : parameters;
    }
}
