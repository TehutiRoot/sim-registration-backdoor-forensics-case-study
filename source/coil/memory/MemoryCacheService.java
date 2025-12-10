package coil.memory;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.DecodeUtils;
import coil.intercept.EngineInterceptor;
import coil.intercept.Interceptor;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import coil.transform.Transformation;
import coil.util.Bitmaps;
import coil.util.Logger;
import coil.util.Requests;
import coil.util.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010 \u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J-\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b(\u0010)J7\u0010*\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b*\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010/R\u0018\u00101\u001a\u00020\u001d*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u00100R\u001a\u00104\u001a\u0004\u0018\u000102*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00103¨\u00066"}, m28850d2 = {"Lcoil/memory/MemoryCacheService;", "", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/request/RequestService;", "requestService", "Lcoil/util/Logger;", "logger", "<init>", "(Lcoil/ImageLoader;Lcoil/request/RequestService;Lcoil/util/Logger;)V", "Lcoil/request/ImageRequest;", "request", "mappedData", "Lcoil/request/Options;", "options", "Lcoil/EventListener;", "eventListener", "Lcoil/memory/MemoryCache$Key;", "newCacheKey", "(Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;)Lcoil/memory/MemoryCache$Key;", "cacheKey", "Lcoil/size/Size;", "size", "Lcoil/size/Scale;", "scale", "Lcoil/memory/MemoryCache$Value;", "getCacheValue", "(Lcoil/request/ImageRequest;Lcoil/memory/MemoryCache$Key;Lcoil/size/Size;Lcoil/size/Scale;)Lcoil/memory/MemoryCache$Value;", "cacheValue", "", "isCacheValueValid$coil_base_release", "(Lcoil/request/ImageRequest;Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$Value;Lcoil/size/Size;Lcoil/size/Scale;)Z", "isCacheValueValid", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "result", "setCacheValue", "(Lcoil/memory/MemoryCache$Key;Lcoil/request/ImageRequest;Lcoil/intercept/EngineInterceptor$ExecuteResult;)Z", "Lcoil/intercept/Interceptor$Chain;", "chain", "Lcoil/request/SuccessResult;", "newResult", "(Lcoil/intercept/Interceptor$Chain;Lcoil/request/ImageRequest;Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$Value;)Lcoil/request/SuccessResult;", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/ImageLoader;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/RequestService;", "Lcoil/util/Logger;", "(Lcoil/memory/MemoryCache$Value;)Z", "isSampled", "", "(Lcoil/memory/MemoryCache$Value;)Ljava/lang/String;", "diskCacheKey", "Companion", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMemoryCacheService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCacheService.kt\ncoil/memory/MemoryCacheService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\ncoil/util/-Collections\n+ 4 Logs.kt\ncoil/util/-Logs\n+ 5 Dimension.kt\ncoil/size/-Dimensions\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,236:1\n1#2:237\n22#3,4:238\n21#4,4:242\n21#4,4:246\n21#4,4:252\n21#4,4:256\n57#5:250\n57#5:251\n45#6:260\n28#7:261\n*S KotlinDebug\n*F\n+ 1 MemoryCacheService.kt\ncoil/memory/MemoryCacheService\n*L\n62#1:238,4\n93#1:242,4\n116#1:246,4\n166#1:252,4\n176#1:256,4\n137#1:250\n138#1:251\n213#1:260\n213#1:261\n*E\n"})
/* loaded from: classes3.dex */
public final class MemoryCacheService {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTRA_DISK_CACHE_KEY = "coil#disk_cache_key";
    @NotNull
    public static final String EXTRA_IS_SAMPLED = "coil#is_sampled";
    @NotNull
    public static final String EXTRA_TRANSFORMATION_INDEX = "coil#transformation_";
    @NotNull
    public static final String EXTRA_TRANSFORMATION_SIZE = "coil#transformation_size";

    /* renamed from: a */
    public final ImageLoader f40621a;

    /* renamed from: b */
    public final RequestService f40622b;

    /* renamed from: c */
    public final Logger f40623c;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28850d2 = {"Lcoil/memory/MemoryCacheService$Companion;", "", "()V", "EXTRA_DISK_CACHE_KEY", "", "getEXTRA_DISK_CACHE_KEY$coil_base_release$annotations", "EXTRA_IS_SAMPLED", "getEXTRA_IS_SAMPLED$coil_base_release$annotations", "EXTRA_TRANSFORMATION_INDEX", "getEXTRA_TRANSFORMATION_INDEX$coil_base_release$annotations", "EXTRA_TRANSFORMATION_SIZE", "getEXTRA_TRANSFORMATION_SIZE$coil_base_release$annotations", "TAG", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getEXTRA_DISK_CACHE_KEY$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEXTRA_IS_SAMPLED$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEXTRA_TRANSFORMATION_INDEX$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEXTRA_TRANSFORMATION_SIZE$coil_base_release$annotations() {
        }

        public Companion() {
        }
    }

    public MemoryCacheService(@NotNull ImageLoader imageLoader, @NotNull RequestService requestService, @Nullable Logger logger) {
        this.f40621a = imageLoader;
        this.f40622b = requestService;
        this.f40623c = logger;
    }

    /* renamed from: a */
    public final String m51054a(MemoryCache.Value value) {
        Object obj = value.getExtras().get(EXTRA_DISK_CACHE_KEY);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m51053b(MemoryCache.Value value) {
        Boolean bool;
        Object obj = value.getExtras().get(EXTRA_IS_SAMPLED);
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m51052c(ImageRequest imageRequest, MemoryCache.Key key, MemoryCache.Value value, Size size, Scale scale) {
        int i;
        String str;
        boolean m51053b = m51053b(value);
        if (Sizes.isOriginal(size)) {
            if (!m51053b) {
                return true;
            }
            Logger logger = this.f40623c;
            if (logger != null && logger.getLevel() <= 3) {
                logger.log("MemoryCacheService", 3, imageRequest.getData() + ": Requested original size, but cached image is sampled.", null);
            }
            return false;
        }
        String str2 = key.getExtras().get(EXTRA_TRANSFORMATION_SIZE);
        if (str2 != null) {
            return Intrinsics.areEqual(str2, size.toString());
        }
        int width = value.getBitmap().getWidth();
        int height = value.getBitmap().getHeight();
        Dimension width2 = size.getWidth();
        int i2 = Integer.MAX_VALUE;
        if (width2 instanceof Dimension.Pixels) {
            i = ((Dimension.Pixels) width2).f40827px;
        } else {
            i = Integer.MAX_VALUE;
        }
        Dimension height2 = size.getHeight();
        if (height2 instanceof Dimension.Pixels) {
            i2 = ((Dimension.Pixels) height2).f40827px;
        }
        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(width, height, i, i2, scale);
        boolean allowInexactSize = Requests.getAllowInexactSize(imageRequest);
        if (!allowInexactSize) {
            str = "MemoryCacheService";
            if ((Utils.isMinOrMax(i) || Math.abs(i - width) <= 1) && (Utils.isMinOrMax(i2) || Math.abs(i2 - height) <= 1)) {
                return true;
            }
        } else {
            double coerceAtMost = AbstractC11719c.coerceAtMost(computeSizeMultiplier, 1.0d);
            str = "MemoryCacheService";
            if (Math.abs(i - (width * coerceAtMost)) <= 1.0d || Math.abs(i2 - (coerceAtMost * height)) <= 1.0d) {
                return true;
            }
        }
        if (computeSizeMultiplier == 1.0d || allowInexactSize) {
            String str3 = str;
            if (computeSizeMultiplier > 1.0d && m51053b) {
                Logger logger2 = this.f40623c;
                if (logger2 != null && logger2.getLevel() <= 3) {
                    logger2.log(str3, 3, imageRequest.getData() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + size.getWidth() + ", " + size.getHeight() + ", " + scale + ").", null);
                    return false;
                }
                return false;
            }
            return true;
        }
        Logger logger3 = this.f40623c;
        if (logger3 != null && logger3.getLevel() <= 3) {
            logger3.log(str, 3, imageRequest.getData() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + size.getWidth() + ", " + size.getHeight() + ", " + scale + ").", null);
            return false;
        }
        return false;
    }

    @Nullable
    public final MemoryCache.Value getCacheValue(@NotNull ImageRequest imageRequest, @NotNull MemoryCache.Key key, @NotNull Size size, @NotNull Scale scale) {
        MemoryCache.Value value;
        if (!imageRequest.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        MemoryCache memoryCache = this.f40621a.getMemoryCache();
        if (memoryCache != null) {
            value = memoryCache.get(key);
        } else {
            value = null;
        }
        if (value == null || !isCacheValueValid$coil_base_release(imageRequest, key, value, size, scale)) {
            return null;
        }
        return value;
    }

    @VisibleForTesting
    public final boolean isCacheValueValid$coil_base_release(@NotNull ImageRequest imageRequest, @NotNull MemoryCache.Key key, @NotNull MemoryCache.Value value, @NotNull Size size, @NotNull Scale scale) {
        if (!this.f40622b.isConfigValidForHardware(imageRequest, Bitmaps.getSafeConfig(value.getBitmap()))) {
            Logger logger = this.f40623c;
            if (logger != null && logger.getLevel() <= 3) {
                logger.log("MemoryCacheService", 3, imageRequest.getData() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
                return false;
            }
            return false;
        }
        return m51052c(imageRequest, key, value, size, scale);
    }

    @Nullable
    public final MemoryCache.Key newCacheKey(@NotNull ImageRequest imageRequest, @NotNull Object obj, @NotNull Options options, @NotNull EventListener eventListener) {
        MemoryCache.Key memoryCacheKey = imageRequest.getMemoryCacheKey();
        if (memoryCacheKey != null) {
            return memoryCacheKey;
        }
        eventListener.keyStart(imageRequest, obj);
        String key = this.f40621a.getComponents().key(obj, options);
        eventListener.keyEnd(imageRequest, key);
        if (key == null) {
            return null;
        }
        List<Transformation> transformations = imageRequest.getTransformations();
        Map<String, String> memoryCacheKeys = imageRequest.getParameters().memoryCacheKeys();
        if (transformations.isEmpty() && memoryCacheKeys.isEmpty()) {
            return new MemoryCache.Key(key, null, 2, null);
        }
        Map mutableMap = AbstractC11687a.toMutableMap(memoryCacheKeys);
        if (!transformations.isEmpty()) {
            List<Transformation> transformations2 = imageRequest.getTransformations();
            int size = transformations2.size();
            for (int i = 0; i < size; i++) {
                mutableMap.put(EXTRA_TRANSFORMATION_INDEX + i, transformations2.get(i).getCacheKey());
            }
            mutableMap.put(EXTRA_TRANSFORMATION_SIZE, options.getSize().toString());
        }
        return new MemoryCache.Key(key, mutableMap);
    }

    @NotNull
    public final SuccessResult newResult(@NotNull Interceptor.Chain chain, @NotNull ImageRequest imageRequest, @NotNull MemoryCache.Key key, @NotNull MemoryCache.Value value) {
        return new SuccessResult(new BitmapDrawable(imageRequest.getContext().getResources(), value.getBitmap()), imageRequest, DataSource.MEMORY_CACHE, key, m51054a(value), m51053b(value), Utils.isPlaceholderCached(chain));
    }

    public final boolean setCacheValue(@Nullable MemoryCache.Key key, @NotNull ImageRequest imageRequest, @NotNull EngineInterceptor.ExecuteResult executeResult) {
        MemoryCache memoryCache;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (imageRequest.getMemoryCachePolicy().getWriteEnabled() && (memoryCache = this.f40621a.getMemoryCache()) != null && key != null) {
            Drawable drawable = executeResult.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) drawable;
            } else {
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(EXTRA_IS_SAMPLED, Boolean.valueOf(executeResult.isSampled()));
                String diskCacheKey = executeResult.getDiskCacheKey();
                if (diskCacheKey != null) {
                    linkedHashMap.put(EXTRA_DISK_CACHE_KEY, diskCacheKey);
                }
                memoryCache.set(key, new MemoryCache.Value(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
