package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import coil.decode.Decoder;
import coil.fetch.Fetcher;
import coil.memory.MemoryCache;
import coil.request.Parameters;
import coil.size.Dimension;
import coil.size.DisplaySizeResolver;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.SizeResolvers;
import coil.size.Sizes;
import coil.size.ViewSizeResolver;
import coil.size.ViewSizeResolvers;
import coil.target.ImageViewTarget;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transform.Transformation;
import coil.transition.CrossfadeTransition;
import coil.transition.Transition;
import coil.util.Collections;
import coil.util.Contexts;
import coil.util.Requests;
import coil.util.Utils;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000Á\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b\u008b\u0001\u0018\u00002\u00020\u0001:\u0004Ð\u0001Ñ\u0001B÷\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u001c\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\b\u00108\u001a\u0004\u0018\u00010\t\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\u0010=\u001a\u0004\u0018\u000109\u0012\b\u0010>\u001a\u0004\u0018\u00010;\u0012\b\u0010?\u001a\u0004\u0018\u000109\u0012\b\u0010@\u001a\u0004\u0018\u00010;\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020G2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020\"2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u000209H\u0016¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR-\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001a\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010!\u001a\u00020 8\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010#\u001a\u00020\"8\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010$\u001a\u00020\"8\u0006¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u008c\u0001\u001a\u0006\b\u0090\u0001\u0010\u008e\u0001R\u001b\u0010%\u001a\u00020\"8\u0006¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u008c\u0001\u001a\u0006\b\u0092\u0001\u0010\u008e\u0001R\u001b\u0010&\u001a\u00020\"8\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u008c\u0001\u001a\u0006\b\u0094\u0001\u0010\u008e\u0001R\u001b\u0010(\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010)\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u0096\u0001\u001a\u0006\b\u009a\u0001\u0010\u0098\u0001R\u001b\u0010*\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u0096\u0001\u001a\u0006\b\u009c\u0001\u0010\u0098\u0001R\u001b\u0010,\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001b\u0010-\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u009e\u0001\u001a\u0006\b¢\u0001\u0010 \u0001R\u001b\u0010.\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b£\u0001\u0010\u009e\u0001\u001a\u0006\b¤\u0001\u0010 \u0001R\u001b\u0010/\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u009e\u0001\u001a\u0006\b¦\u0001\u0010 \u0001R\u001b\u00101\u001a\u0002008\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001b\u00103\u001a\u0002028\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u001b\u00105\u001a\u0002048\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u001b\u00107\u001a\u0002068\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001b\u00108\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b·\u0001\u0010`\u001a\u0005\b¸\u0001\u0010bR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0018\u0010=\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010º\u0001R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¼\u0001R\u0018\u0010?\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010º\u0001R\u0018\u0010@\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010¼\u0001R\u001b\u0010B\u001a\u00020A8\u0006¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001b\u0010D\u001a\u00020C8\u0006¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0016\u0010Ë\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0016\u0010Í\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Ê\u0001R\u0016\u0010Ï\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ê\u0001¨\u0006Ò\u0001"}, m28850d2 = {"Lcoil/request/ImageRequest;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "data", "Lcoil/target/Target;", TypedValues.AttributesType.S_TARGET, "Lcoil/request/ImageRequest$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "colorSpace", "Lcoil/size/Precision;", "precision", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "fetcherFactory", "Lcoil/decode/Decoder$Factory;", "decoderFactory", "", "Lcoil/transform/Transformation;", "transformations", "Lcoil/transition/Transition$Factory;", "transitionFactory", "Lokhttp3/Headers;", "headers", "Lcoil/request/Tags;", "tags", "", "allowConversionToBitmap", "allowHardware", "allowRgb565", "premultipliedAlpha", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlinx/coroutines/CoroutineDispatcher;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcoil/size/SizeResolver;", "sizeResolver", "Lcoil/size/Scale;", "scale", "Lcoil/request/Parameters;", "parameters", "placeholderMemoryCacheKey", "", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "Lcoil/request/DefinedRequestOptions;", "defined", "Lcoil/request/DefaultRequestOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lcoil/target/Target;Lcoil/request/ImageRequest$Listener;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Precision;Lkotlin/Pair;Lcoil/decode/Decoder$Factory;Ljava/util/List;Lcoil/transition/Transition$Factory;Lokhttp3/Headers;Lcoil/request/Tags;ZZZZLcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lcoil/request/Parameters;Lcoil/memory/MemoryCache$Key;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Lcoil/request/DefinedRequestOptions;Lcoil/request/DefaultRequestOptions;)V", "Lcoil/request/ImageRequest$Builder;", "newBuilder", "(Landroid/content/Context;)Lcoil/request/ImageRequest$Builder;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", OperatorName.CURVE_TO, "Lcoil/target/Target;", "getTarget", "()Lcoil/target/Target;", "d", "Lcoil/request/ImageRequest$Listener;", "getListener", "()Lcoil/request/ImageRequest$Listener;", "e", "Lcoil/memory/MemoryCache$Key;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", OperatorName.FILL_NON_ZERO, "Ljava/lang/String;", "getDiskCacheKey", "()Ljava/lang/String;", OperatorName.NON_STROKING_GRAY, "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", OperatorName.CLOSE_PATH, "Landroid/graphics/ColorSpace;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "i", "Lcoil/size/Precision;", "getPrecision", "()Lcoil/size/Precision;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlin/Pair;", "getFetcherFactory", "()Lkotlin/Pair;", OperatorName.NON_STROKING_CMYK, "Lcoil/decode/Decoder$Factory;", "getDecoderFactory", "()Lcoil/decode/Decoder$Factory;", OperatorName.LINE_TO, "Ljava/util/List;", "getTransformations", "()Ljava/util/List;", OperatorName.MOVE_TO, "Lcoil/transition/Transition$Factory;", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", OperatorName.ENDPATH, "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "o", "Lcoil/request/Tags;", "getTags", "()Lcoil/request/Tags;", "p", "Z", "getAllowConversionToBitmap", "()Z", OperatorName.SAVE, "getAllowHardware", PDPageLabelRange.STYLE_ROMAN_LOWER, "getAllowRgb565", OperatorName.CLOSE_AND_STROKE, "getPremultipliedAlpha", "t", "Lcoil/request/CachePolicy;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "u", "getDiskCachePolicy", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getNetworkCachePolicy", OperatorName.SET_LINE_WIDTH, "Lkotlinx/coroutines/CoroutineDispatcher;", "getInterceptorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "x", "getFetcherDispatcher", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getDecoderDispatcher", "z", "getTransformationDispatcher", "A", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "B", "Lcoil/size/SizeResolver;", "getSizeResolver", "()Lcoil/size/SizeResolver;", "C", "Lcoil/size/Scale;", "getScale", "()Lcoil/size/Scale;", "D", "Lcoil/request/Parameters;", "getParameters", "()Lcoil/request/Parameters;", ExifInterface.LONGITUDE_EAST, "getPlaceholderMemoryCacheKey", "F", "Ljava/lang/Integer;", OperatorName.STROKING_COLOR_GRAY, "Landroid/graphics/drawable/Drawable;", "H", "I", OperatorName.SET_LINE_CAPSTYLE, "K", "L", "Lcoil/request/DefinedRequestOptions;", "getDefined", "()Lcoil/request/DefinedRequestOptions;", "M", "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "getPlaceholder", "()Landroid/graphics/drawable/Drawable;", "placeholder", "getError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getFallback", "fallback", "Builder", "Listener", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ImageRequest {

    /* renamed from: A */
    public final Lifecycle f40697A;

    /* renamed from: B */
    public final SizeResolver f40698B;

    /* renamed from: C */
    public final Scale f40699C;

    /* renamed from: D */
    public final Parameters f40700D;

    /* renamed from: E */
    public final MemoryCache.Key f40701E;

    /* renamed from: F */
    public final Integer f40702F;

    /* renamed from: G */
    public final Drawable f40703G;

    /* renamed from: H */
    public final Integer f40704H;

    /* renamed from: I */
    public final Drawable f40705I;

    /* renamed from: J */
    public final Integer f40706J;

    /* renamed from: K */
    public final Drawable f40707K;

    /* renamed from: L */
    public final DefinedRequestOptions f40708L;

    /* renamed from: M */
    public final DefaultRequestOptions f40709M;

    /* renamed from: a */
    public final Context f40710a;

    /* renamed from: b */
    public final Object f40711b;

    /* renamed from: c */
    public final Target f40712c;

    /* renamed from: d */
    public final Listener f40713d;

    /* renamed from: e */
    public final MemoryCache.Key f40714e;

    /* renamed from: f */
    public final String f40715f;

    /* renamed from: g */
    public final Bitmap.Config f40716g;

    /* renamed from: h */
    public final ColorSpace f40717h;

    /* renamed from: i */
    public final Precision f40718i;

    /* renamed from: j */
    public final Pair f40719j;

    /* renamed from: k */
    public final Decoder.Factory f40720k;

    /* renamed from: l */
    public final List f40721l;

    /* renamed from: m */
    public final Transition.Factory f40722m;

    /* renamed from: n */
    public final Headers f40723n;

    /* renamed from: o */
    public final Tags f40724o;

    /* renamed from: p */
    public final boolean f40725p;

    /* renamed from: q */
    public final boolean f40726q;

    /* renamed from: r */
    public final boolean f40727r;

    /* renamed from: s */
    public final boolean f40728s;

    /* renamed from: t */
    public final CachePolicy f40729t;

    /* renamed from: u */
    public final CachePolicy f40730u;

    /* renamed from: v */
    public final CachePolicy f40731v;

    /* renamed from: w */
    public final CoroutineDispatcher f40732w;

    /* renamed from: x */
    public final CoroutineDispatcher f40733x;

    /* renamed from: y */
    public final CoroutineDispatcher f40734y;

    /* renamed from: z */
    public final CoroutineDispatcher f40735z;

    @Metadata(m28851d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001e\u0010\u001bJÎ\u0001\u0010*\u001a\u00020\u00002#\b\u0006\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\t0\u001f2#\b\u0006\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\t0\u001f28\b\u0006\u0010'\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110%¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\t0$28\b\u0006\u0010)\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110(¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\t0$H\u0086\b¢\u0006\u0004\b*\u0010+J\u0017\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010,¢\u0006\u0004\b*\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00100J\u0015\u00102\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b2\u00100J\u0015\u00103\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b3\u00100J\u0015\u00104\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b4\u00100J!\u00107\u001a\u00020\u00002\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020605\"\u000206¢\u0006\u0004\b7\u00108J\u001b\u00107\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020609¢\u0006\u0004\b7\u0010:J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00002\b\b\u0001\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ!\u0010C\u001a\u00020\u00002\b\b\u0001\u0010E\u001a\u00020B2\b\b\u0001\u0010F\u001a\u00020B¢\u0006\u0004\bC\u0010GJ\u001d\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020H2\u0006\u0010F\u001a\u00020H¢\u0006\u0004\bC\u0010IJ\u0015\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020J¢\u0006\u0004\bC\u0010KJ\u0015\u0010C\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0010¢\u0006\u0004\bC\u0010MJ\u0015\u0010N\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0013¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ*\u0010V\u001a\u00020\u0000\"\n\b\u0000\u0010S\u0018\u0001*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000TH\u0086\b¢\u0006\u0004\bV\u0010WJ3\u0010V\u001a\u00020\u0000\"\b\b\u0000\u0010S*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000T2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000X¢\u0006\u0004\bV\u0010ZJ\u0015\u0010\\\u001a\u00020\u00002\u0006\u0010U\u001a\u00020[¢\u0006\u0004\b\\\u0010]J\u0015\u0010`\u001a\u00020\u00002\u0006\u0010_\u001a\u00020^¢\u0006\u0004\b`\u0010aJ\u0015\u0010b\u001a\u00020\u00002\u0006\u0010_\u001a\u00020^¢\u0006\u0004\bb\u0010aJ\u0015\u0010c\u001a\u00020\u00002\u0006\u0010_\u001a\u00020^¢\u0006\u0004\bc\u0010aJ\u0015\u0010d\u001a\u00020\u00002\u0006\u0010_\u001a\u00020^¢\u0006\u0004\bd\u0010aJ\u0015\u0010g\u001a\u00020\u00002\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hJ\u0015\u0010i\u001a\u00020\u00002\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bi\u0010hJ\u0015\u0010j\u001a\u00020\u00002\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bj\u0010hJ\u0015\u0010l\u001a\u00020\u00002\u0006\u0010l\u001a\u00020k¢\u0006\u0004\bl\u0010mJ\u001d\u0010o\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00182\u0006\u0010n\u001a\u00020\u0018¢\u0006\u0004\bo\u0010pJ\u001d\u0010q\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00182\u0006\u0010n\u001a\u00020\u0018¢\u0006\u0004\bq\u0010pJ\u0015\u0010r\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\br\u0010\u001bJ&\u0010s\u001a\u00020\u0000\"\n\b\u0000\u0010S\u0018\u0001*\u00020\u00012\b\u0010s\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\bs\u0010\u0017J1\u0010s\u001a\u00020\u0000\"\b\b\u0000\u0010S*\u00020\u00012\u000e\u0010Y\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000X2\b\u0010s\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bs\u0010tJ\u0015\u0010v\u001a\u00020\u00002\u0006\u0010v\u001a\u00020u¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bx\u0010\u001bJ\u0017\u0010x\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bx\u0010\u001dJ\u0017\u0010z\u001a\u00020\u00002\b\b\u0001\u0010y\u001a\u00020B¢\u0006\u0004\bz\u0010DJ\u0017\u0010z\u001a\u00020\u00002\b\u0010|\u001a\u0004\u0018\u00010{¢\u0006\u0004\bz\u0010}J\u0017\u0010~\u001a\u00020\u00002\b\b\u0001\u0010y\u001a\u00020B¢\u0006\u0004\b~\u0010DJ\u0017\u0010~\u001a\u00020\u00002\b\u0010|\u001a\u0004\u0018\u00010{¢\u0006\u0004\b~\u0010}J\u0017\u0010\u007f\u001a\u00020\u00002\b\b\u0001\u0010y\u001a\u00020B¢\u0006\u0004\b\u007f\u0010DJ\u0017\u0010\u007f\u001a\u00020\u00002\b\u0010|\u001a\u0004\u0018\u00010{¢\u0006\u0004\b\u007f\u0010}J\u001a\u0010\u0082\u0001\u001a\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0086\u0001\u0010\u0082\u0001\u001a\u00020\u00002%\b\u0006\u0010\"\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010{¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(z\u0012\u0004\u0012\u00020\t0\u001f2%\b\u0006\u0010'\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010{¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\t0\u001f2#\b\u0006\u0010)\u001a\u001d\u0012\u0013\u0012\u00110{¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\t0\u001fH\u0086\b¢\u0006\u0006\b\u0082\u0001\u0010\u0084\u0001J\u001c\u0010\u0082\u0001\u001a\u00020\u00002\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0085\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0086\u0001J\u0017\u0010\u0087\u0001\u001a\u00020\u00002\u0006\u0010_\u001a\u00020^¢\u0006\u0005\b\u0087\u0001\u0010aJ\u0018\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020B¢\u0006\u0005\b\u0087\u0001\u0010DJ\u001a\u0010\u008b\u0001\u001a\u00020\u00002\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001c\u0010\u008f\u0001\u001a\u00020\u00002\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\u00002\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\r¢\u0006\u0006\b\u008f\u0001\u0010\u0091\u0001J0\u0010\u0092\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0017\u0010\u0094\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0005\b\u0094\u0001\u0010\u001bJ\u001a\u0010\u0096\u0001\u001a\u00020\u00002\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0099\u0001\u001a\u00020\u00002\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0010\u0010\u009b\u0001\u001a\u00020\u0006¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001c\u0010\u009e\u0001\u001a\u00020\u00002\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001c\u0010¡\u0001\u001a\u00020\u00002\b\u0010¡\u0001\u001a\u00030 \u0001H\u0007¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001c\u0010\u008a\u0001\u001a\u00020\u00002\b\u0010\u008a\u0001\u001a\u00030£\u0001H\u0007¢\u0006\u0006\b\u008a\u0001\u0010¤\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010¥\u0001R\u0019\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\n\u0010¦\u0001R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010§\u0001R\u001b\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010¨\u0001R\u0019\u0010*\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010©\u0001R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001a\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001a\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R/\u0010V\u001a\u0019\u0012\b\u0012\u0006\u0012\u0002\b\u00030T\u0012\b\u0012\u0006\u0012\u0002\b\u00030X\u0018\u00010´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001e\u00107\u001a\b\u0012\u0004\u0012\u000206098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u001b\u0010l\u001a\u0005\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R+\u0010v\u001a\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030X\u0012\u0004\u0012\u00020\u0001\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010`\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001a\u0010b\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001a\u0010c\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010Æ\u0001R\u0018\u0010d\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010Ä\u0001R\u001a\u0010g\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u001a\u0010i\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ê\u0001R\u001a\u0010j\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Ê\u0001R\u001a\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001a\u00102\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Î\u0001R\u001a\u00103\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Î\u0001R\u001a\u00104\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Î\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u001a\u0010x\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010«\u0001R\u001b\u0010Ø\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001b\u0010Û\u0001\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u001b\u0010Ý\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010×\u0001R\u001b\u0010ß\u0001\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010Ú\u0001R\u001b\u0010á\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bà\u0001\u0010×\u0001R\u001b\u0010ã\u0001\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010Ú\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001b\u0010è\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u001a\u0010N\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u001b\u0010ì\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010å\u0001R\u001b\u0010î\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010ç\u0001R\u001b\u0010ð\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ê\u0001¨\u0006ñ\u0001"}, m28850d2 = {"Lcoil/request/ImageRequest$Builder;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lcoil/request/ImageRequest;", "request", "(Lcoil/request/ImageRequest;Landroid/content/Context;)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/lifecycle/Lifecycle;", OperatorName.CURVE_TO, "()Landroidx/lifecycle/Lifecycle;", "Lcoil/size/SizeResolver;", "e", "()Lcoil/size/SizeResolver;", "Lcoil/size/Scale;", "d", "()Lcoil/size/Scale;", "data", "(Ljava/lang/Object;)Lcoil/request/ImageRequest$Builder;", "", Action.KEY_ATTRIBUTE, "memoryCacheKey", "(Ljava/lang/String;)Lcoil/request/ImageRequest$Builder;", "Lcoil/memory/MemoryCache$Key;", "(Lcoil/memory/MemoryCache$Key;)Lcoil/request/ImageRequest$Builder;", "diskCacheKey", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", Constant.ServiceAPIName.onStart, "onCancel", "Lkotlin/Function2;", "Lcoil/request/ErrorResult;", "result", "onError", "Lcoil/request/SuccessResult;", "onSuccess", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcoil/request/ImageRequest$Builder;", "Lcoil/request/ImageRequest$Listener;", "(Lcoil/request/ImageRequest$Listener;)Lcoil/request/ImageRequest$Builder;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lcoil/request/ImageRequest$Builder;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "", "Lcoil/transform/Transformation;", "transformations", "([Lcoil/transform/Transformation;)Lcoil/request/ImageRequest$Builder;", "", "(Ljava/util/List;)Lcoil/request/ImageRequest$Builder;", "Landroid/graphics/Bitmap$Config;", "config", "bitmapConfig", "(Landroid/graphics/Bitmap$Config;)Lcoil/request/ImageRequest$Builder;", "Landroid/graphics/ColorSpace;", "colorSpace", "(Landroid/graphics/ColorSpace;)Lcoil/request/ImageRequest$Builder;", "", "size", "(I)Lcoil/request/ImageRequest$Builder;", "width", "height", "(II)Lcoil/request/ImageRequest$Builder;", "Lcoil/size/Dimension;", "(Lcoil/size/Dimension;Lcoil/size/Dimension;)Lcoil/request/ImageRequest$Builder;", "Lcoil/size/Size;", "(Lcoil/size/Size;)Lcoil/request/ImageRequest$Builder;", "resolver", "(Lcoil/size/SizeResolver;)Lcoil/request/ImageRequest$Builder;", "scale", "(Lcoil/size/Scale;)Lcoil/request/ImageRequest$Builder;", "Lcoil/size/Precision;", "precision", "(Lcoil/size/Precision;)Lcoil/request/ImageRequest$Builder;", "T", "Lcoil/fetch/Fetcher$Factory;", "factory", "fetcherFactory", "(Lcoil/fetch/Fetcher$Factory;)Lcoil/request/ImageRequest$Builder;", "Ljava/lang/Class;", "type", "(Lcoil/fetch/Fetcher$Factory;Ljava/lang/Class;)Lcoil/request/ImageRequest$Builder;", "Lcoil/decode/Decoder$Factory;", "decoderFactory", "(Lcoil/decode/Decoder$Factory;)Lcoil/request/ImageRequest$Builder;", "", "enable", "allowConversionToBitmap", "(Z)Lcoil/request/ImageRequest$Builder;", "allowHardware", "allowRgb565", "premultipliedAlpha", "Lcoil/request/CachePolicy;", "policy", "memoryCachePolicy", "(Lcoil/request/CachePolicy;)Lcoil/request/ImageRequest$Builder;", "diskCachePolicy", "networkCachePolicy", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lcoil/request/ImageRequest$Builder;", "value", "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcoil/request/ImageRequest$Builder;", "setHeader", "removeHeader", "tag", "(Ljava/lang/Class;Ljava/lang/Object;)Lcoil/request/ImageRequest$Builder;", "Lcoil/request/Tags;", "tags", "(Lcoil/request/Tags;)Lcoil/request/ImageRequest$Builder;", "placeholderMemoryCacheKey", "drawableResId", "placeholder", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)Lcoil/request/ImageRequest$Builder;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "fallback", "Landroid/widget/ImageView;", "imageView", TypedValues.AttributesType.S_TARGET, "(Landroid/widget/ImageView;)Lcoil/request/ImageRequest$Builder;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcoil/request/ImageRequest$Builder;", "Lcoil/target/Target;", "(Lcoil/target/Target;)Lcoil/request/ImageRequest$Builder;", "crossfade", "durationMillis", "Lcoil/transition/Transition$Factory;", "transition", "transitionFactory", "(Lcoil/transition/Transition$Factory;)Lcoil/request/ImageRequest$Builder;", "Landroidx/lifecycle/LifecycleOwner;", Constant.REGISTER_LEVEL_OWNER, "lifecycle", "(Landroidx/lifecycle/LifecycleOwner;)Lcoil/request/ImageRequest$Builder;", "(Landroidx/lifecycle/Lifecycle;)Lcoil/request/ImageRequest$Builder;", "setParameter", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcoil/request/ImageRequest$Builder;", "removeParameter", "Lcoil/request/Parameters;", "parameters", "(Lcoil/request/Parameters;)Lcoil/request/ImageRequest$Builder;", "Lcoil/request/DefaultRequestOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "(Lcoil/request/DefaultRequestOptions;)Lcoil/request/ImageRequest$Builder;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lcoil/request/ImageRequest;", "Lcoil/fetch/Fetcher;", "fetcher", "(Lcoil/fetch/Fetcher;)Lcoil/request/ImageRequest$Builder;", "Lcoil/decode/Decoder;", "decoder", "(Lcoil/decode/Decoder;)Lcoil/request/ImageRequest$Builder;", "Lcoil/transition/Transition;", "(Lcoil/transition/Transition;)Lcoil/request/ImageRequest$Builder;", "Landroid/content/Context;", "Lcoil/request/DefaultRequestOptions;", "Ljava/lang/Object;", "Lcoil/target/Target;", "Lcoil/request/ImageRequest$Listener;", OperatorName.FILL_NON_ZERO, "Lcoil/memory/MemoryCache$Key;", OperatorName.NON_STROKING_GRAY, "Ljava/lang/String;", OperatorName.CLOSE_PATH, "Landroid/graphics/Bitmap$Config;", "i", "Landroid/graphics/ColorSpace;", OperatorName.SET_LINE_JOINSTYLE, "Lcoil/size/Precision;", "Lkotlin/Pair;", OperatorName.NON_STROKING_CMYK, "Lkotlin/Pair;", OperatorName.LINE_TO, "Lcoil/decode/Decoder$Factory;", OperatorName.MOVE_TO, "Ljava/util/List;", OperatorName.ENDPATH, "Lcoil/transition/Transition$Factory;", "Lokhttp3/Headers$Builder;", "o", "Lokhttp3/Headers$Builder;", "", "p", "Ljava/util/Map;", OperatorName.SAVE, "Z", PDPageLabelRange.STYLE_ROMAN_LOWER, "Ljava/lang/Boolean;", OperatorName.CLOSE_AND_STROKE, "t", "u", "Lcoil/request/CachePolicy;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.SET_LINE_WIDTH, "x", "Lkotlinx/coroutines/CoroutineDispatcher;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "z", "A", "Lcoil/request/Parameters$Builder;", "B", "Lcoil/request/Parameters$Builder;", "C", "D", "Ljava/lang/Integer;", "placeholderResId", ExifInterface.LONGITUDE_EAST, "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "F", "errorResId", OperatorName.STROKING_COLOR_GRAY, "errorDrawable", "H", "fallbackResId", "I", "fallbackDrawable", OperatorName.SET_LINE_CAPSTYLE, "Landroidx/lifecycle/Lifecycle;", "K", "Lcoil/size/SizeResolver;", "sizeResolver", "L", "Lcoil/size/Scale;", "M", "resolvedLifecycle", "N", "resolvedSizeResolver", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "resolvedScale", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n1#2:1058\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: A */
        public CoroutineDispatcher f40736A;

        /* renamed from: B */
        public Parameters.Builder f40737B;

        /* renamed from: C */
        public MemoryCache.Key f40738C;

        /* renamed from: D */
        public Integer f40739D;

        /* renamed from: E */
        public Drawable f40740E;

        /* renamed from: F */
        public Integer f40741F;

        /* renamed from: G */
        public Drawable f40742G;

        /* renamed from: H */
        public Integer f40743H;

        /* renamed from: I */
        public Drawable f40744I;

        /* renamed from: J */
        public Lifecycle f40745J;

        /* renamed from: K */
        public SizeResolver f40746K;

        /* renamed from: L */
        public Scale f40747L;

        /* renamed from: M */
        public Lifecycle f40748M;

        /* renamed from: N */
        public SizeResolver f40749N;

        /* renamed from: O */
        public Scale f40750O;

        /* renamed from: a */
        public final Context f40751a;

        /* renamed from: b */
        public DefaultRequestOptions f40752b;

        /* renamed from: c */
        public Object f40753c;

        /* renamed from: d */
        public Target f40754d;

        /* renamed from: e */
        public Listener f40755e;

        /* renamed from: f */
        public MemoryCache.Key f40756f;

        /* renamed from: g */
        public String f40757g;

        /* renamed from: h */
        public Bitmap.Config f40758h;

        /* renamed from: i */
        public ColorSpace f40759i;

        /* renamed from: j */
        public Precision f40760j;

        /* renamed from: k */
        public Pair f40761k;

        /* renamed from: l */
        public Decoder.Factory f40762l;

        /* renamed from: m */
        public List f40763m;

        /* renamed from: n */
        public Transition.Factory f40764n;

        /* renamed from: o */
        public Headers.Builder f40765o;

        /* renamed from: p */
        public Map f40766p;

        /* renamed from: q */
        public boolean f40767q;

        /* renamed from: r */
        public Boolean f40768r;

        /* renamed from: s */
        public Boolean f40769s;

        /* renamed from: t */
        public boolean f40770t;

        /* renamed from: u */
        public CachePolicy f40771u;

        /* renamed from: v */
        public CachePolicy f40772v;

        /* renamed from: w */
        public CachePolicy f40773w;

        /* renamed from: x */
        public CoroutineDispatcher f40774x;

        /* renamed from: y */
        public CoroutineDispatcher f40775y;

        /* renamed from: z */
        public CoroutineDispatcher f40776z;

        @JvmOverloads
        public Builder(@NotNull ImageRequest imageRequest) {
            this(imageRequest, null, 2, null);
        }

        public static /* synthetic */ Builder listener$default(Builder builder, Function1 function1, Function1 function12, Function2 function2, Function2 function22, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = ImageRequest$Builder$listener$1.INSTANCE;
            }
            if ((i & 2) != 0) {
                function12 = ImageRequest$Builder$listener$2.INSTANCE;
            }
            if ((i & 4) != 0) {
                function2 = ImageRequest$Builder$listener$3.INSTANCE;
            }
            if ((i & 8) != 0) {
                function22 = ImageRequest$Builder$listener$4.INSTANCE;
            }
            return builder.listener(new ImageRequest$Builder$listener$5(function1, function12, function2, function22));
        }

        public static /* synthetic */ Builder setParameter$default(Builder builder, String str, Object obj, String str2, int i, Object obj2) {
            if ((i & 4) != 0) {
                if (obj != null) {
                    str2 = obj.toString();
                } else {
                    str2 = null;
                }
            }
            return builder.setParameter(str, obj, str2);
        }

        public static /* synthetic */ Builder target$default(Builder builder, Function1 function1, Function1 function12, Function1 function13, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = ImageRequest$Builder$target$1.INSTANCE;
            }
            if ((i & 2) != 0) {
                function12 = ImageRequest$Builder$target$2.INSTANCE;
            }
            if ((i & 4) != 0) {
                function13 = ImageRequest$Builder$target$3.INSTANCE;
            }
            return builder.target(new ImageRequest$Builder$target$4(function1, function12, function13));
        }

        /* renamed from: a */
        public final void m51039a() {
            this.f40750O = null;
        }

        @NotNull
        public final Builder addHeader(@NotNull String str, @NotNull String str2) {
            Headers.Builder builder = this.f40765o;
            if (builder == null) {
                builder = new Headers.Builder();
                this.f40765o = builder;
            }
            builder.add(str, str2);
            return this;
        }

        @NotNull
        public final Builder allowConversionToBitmap(boolean z) {
            this.f40767q = z;
            return this;
        }

        @NotNull
        public final Builder allowHardware(boolean z) {
            this.f40768r = Boolean.valueOf(z);
            return this;
        }

        @NotNull
        public final Builder allowRgb565(boolean z) {
            this.f40769s = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: b */
        public final void m51038b() {
            this.f40748M = null;
            this.f40749N = null;
            this.f40750O = null;
        }

        @NotNull
        public final Builder bitmapConfig(@NotNull Bitmap.Config config) {
            this.f40758h = config;
            return this;
        }

        @NotNull
        public final ImageRequest build() {
            Headers headers;
            Tags tags;
            boolean allowHardware;
            boolean allowRgb565;
            Parameters parameters;
            Context context = this.f40751a;
            Object obj = this.f40753c;
            if (obj == null) {
                obj = NullRequestData.INSTANCE;
            }
            Object obj2 = obj;
            Target target = this.f40754d;
            Listener listener = this.f40755e;
            MemoryCache.Key key = this.f40756f;
            String str = this.f40757g;
            Bitmap.Config config = this.f40758h;
            if (config == null) {
                config = this.f40752b.getBitmapConfig();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f40759i;
            Precision precision = this.f40760j;
            if (precision == null) {
                precision = this.f40752b.getPrecision();
            }
            Precision precision2 = precision;
            Pair pair = this.f40761k;
            Decoder.Factory factory = this.f40762l;
            List list = this.f40763m;
            Transition.Factory factory2 = this.f40764n;
            if (factory2 == null) {
                factory2 = this.f40752b.getTransitionFactory();
            }
            Transition.Factory factory3 = factory2;
            Headers.Builder builder = this.f40765o;
            if (builder != null) {
                headers = builder.build();
            } else {
                headers = null;
            }
            Headers orEmpty = Utils.orEmpty(headers);
            Map<Class<?>, ? extends Object> map = this.f40766p;
            if (map != null) {
                tags = Tags.Companion.from(map);
            } else {
                tags = null;
            }
            Tags orEmpty2 = Utils.orEmpty(tags);
            boolean z = this.f40767q;
            Boolean bool = this.f40768r;
            if (bool != null) {
                allowHardware = bool.booleanValue();
            } else {
                allowHardware = this.f40752b.getAllowHardware();
            }
            boolean z2 = allowHardware;
            Boolean bool2 = this.f40769s;
            if (bool2 != null) {
                allowRgb565 = bool2.booleanValue();
            } else {
                allowRgb565 = this.f40752b.getAllowRgb565();
            }
            boolean z3 = allowRgb565;
            boolean z4 = this.f40770t;
            CachePolicy cachePolicy = this.f40771u;
            if (cachePolicy == null) {
                cachePolicy = this.f40752b.getMemoryCachePolicy();
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.f40772v;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.f40752b.getDiskCachePolicy();
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.f40773w;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.f40752b.getNetworkCachePolicy();
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            CoroutineDispatcher coroutineDispatcher = this.f40774x;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.f40752b.getInterceptorDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            CoroutineDispatcher coroutineDispatcher3 = this.f40775y;
            if (coroutineDispatcher3 == null) {
                coroutineDispatcher3 = this.f40752b.getFetcherDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
            CoroutineDispatcher coroutineDispatcher5 = this.f40776z;
            if (coroutineDispatcher5 == null) {
                coroutineDispatcher5 = this.f40752b.getDecoderDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher6 = coroutineDispatcher5;
            CoroutineDispatcher coroutineDispatcher7 = this.f40736A;
            if (coroutineDispatcher7 == null) {
                coroutineDispatcher7 = this.f40752b.getTransformationDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher8 = coroutineDispatcher7;
            Lifecycle lifecycle = this.f40745J;
            if (lifecycle == null && (lifecycle = this.f40748M) == null) {
                lifecycle = m51037c();
            }
            Lifecycle lifecycle2 = lifecycle;
            SizeResolver sizeResolver = this.f40746K;
            if (sizeResolver == null && (sizeResolver = this.f40749N) == null) {
                sizeResolver = m51035e();
            }
            SizeResolver sizeResolver2 = sizeResolver;
            Scale scale = this.f40747L;
            if (scale == null && (scale = this.f40750O) == null) {
                scale = m51036d();
            }
            Scale scale2 = scale;
            Parameters.Builder builder2 = this.f40737B;
            if (builder2 != null) {
                parameters = builder2.build();
            } else {
                parameters = null;
            }
            return new ImageRequest(context, obj2, target, listener, key, str, config2, colorSpace, precision2, pair, factory, list, factory3, orEmpty, orEmpty2, z, z2, z3, z4, cachePolicy2, cachePolicy4, cachePolicy6, coroutineDispatcher2, coroutineDispatcher4, coroutineDispatcher6, coroutineDispatcher8, lifecycle2, sizeResolver2, scale2, Utils.orEmpty(parameters), this.f40738C, this.f40739D, this.f40740E, this.f40741F, this.f40742G, this.f40743H, this.f40744I, new DefinedRequestOptions(this.f40745J, this.f40746K, this.f40747L, this.f40774x, this.f40775y, this.f40776z, this.f40736A, this.f40764n, this.f40760j, this.f40758h, this.f40768r, this.f40769s, this.f40771u, this.f40772v, this.f40773w), this.f40752b, null);
        }

        /* renamed from: c */
        public final Lifecycle m51037c() {
            Context context;
            Target target = this.f40754d;
            if (target instanceof ViewTarget) {
                context = ((ViewTarget) target).getView().getContext();
            } else {
                context = this.f40751a;
            }
            Lifecycle lifecycle = Contexts.getLifecycle(context);
            if (lifecycle == null) {
                return GlobalLifecycle.INSTANCE;
            }
            return lifecycle;
        }

        @RequiresApi(26)
        @NotNull
        public final Builder colorSpace(@NotNull ColorSpace colorSpace) {
            this.f40759i = colorSpace;
            return this;
        }

        @NotNull
        public final Builder crossfade(boolean z) {
            return crossfade(z ? 100 : 0);
        }

        /* renamed from: d */
        public final Scale m51036d() {
            ViewSizeResolver viewSizeResolver;
            ViewTarget viewTarget;
            View view;
            SizeResolver sizeResolver = this.f40746K;
            View view2 = null;
            if (sizeResolver instanceof ViewSizeResolver) {
                viewSizeResolver = (ViewSizeResolver) sizeResolver;
            } else {
                viewSizeResolver = null;
            }
            if (viewSizeResolver != null && (view = viewSizeResolver.getView()) != null) {
                view2 = view;
            } else {
                Target target = this.f40754d;
                if (target instanceof ViewTarget) {
                    viewTarget = (ViewTarget) target;
                } else {
                    viewTarget = null;
                }
                if (viewTarget != null) {
                    view2 = viewTarget.getView();
                }
            }
            if (view2 instanceof ImageView) {
                return Utils.getScale((ImageView) view2);
            }
            return Scale.FIT;
        }

        @NotNull
        public final Builder data(@Nullable Object obj) {
            this.f40753c = obj;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'decoderFactory'.", replaceWith = @ReplaceWith(expression = "decoderFactory { _, _, _ -> decoder }", imports = {}))
        @NotNull
        public final Builder decoder(@NotNull Decoder decoder) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder decoderDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            this.f40776z = coroutineDispatcher;
            return this;
        }

        @NotNull
        public final Builder decoderFactory(@NotNull Decoder.Factory factory) {
            this.f40762l = factory;
            return this;
        }

        @NotNull
        public final Builder defaults(@NotNull DefaultRequestOptions defaultRequestOptions) {
            this.f40752b = defaultRequestOptions;
            m51039a();
            return this;
        }

        @NotNull
        public final Builder diskCacheKey(@Nullable String str) {
            this.f40757g = str;
            return this;
        }

        @NotNull
        public final Builder diskCachePolicy(@NotNull CachePolicy cachePolicy) {
            this.f40772v = cachePolicy;
            return this;
        }

        @NotNull
        public final Builder dispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            this.f40775y = coroutineDispatcher;
            this.f40776z = coroutineDispatcher;
            this.f40736A = coroutineDispatcher;
            return this;
        }

        /* renamed from: e */
        public final SizeResolver m51035e() {
            ImageView.ScaleType scaleType;
            Target target = this.f40754d;
            if (target instanceof ViewTarget) {
                View view = ((ViewTarget) target).getView();
                if ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) {
                    return SizeResolvers.create(Size.ORIGINAL);
                }
                return ViewSizeResolvers.create$default(view, false, 2, null);
            }
            return new DisplaySizeResolver(this.f40751a);
        }

        @NotNull
        public final Builder error(@DrawableRes int i) {
            this.f40741F = Integer.valueOf(i);
            this.f40742G = null;
            return this;
        }

        @NotNull
        public final Builder fallback(@DrawableRes int i) {
            this.f40743H = Integer.valueOf(i);
            this.f40744I = null;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'fetcherFactory'.", replaceWith = @ReplaceWith(expression = "fetcherFactory<Any> { _, _, _ -> fetcher }", imports = {}))
        @NotNull
        public final Builder fetcher(@NotNull Fetcher fetcher) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder fetcherDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            this.f40775y = coroutineDispatcher;
            return this;
        }

        public final /* synthetic */ <T> Builder fetcherFactory(Fetcher.Factory<T> factory) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return fetcherFactory(factory, Object.class);
        }

        @NotNull
        public final Builder headers(@NotNull Headers headers) {
            this.f40765o = headers.newBuilder();
            return this;
        }

        @NotNull
        public final Builder interceptorDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            this.f40774x = coroutineDispatcher;
            return this;
        }

        @NotNull
        public final Builder lifecycle(@Nullable LifecycleOwner lifecycleOwner) {
            return lifecycle(lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null);
        }

        @NotNull
        public final Builder listener(@NotNull Function1<? super ImageRequest, Unit> function1, @NotNull Function1<? super ImageRequest, Unit> function12, @NotNull Function2<? super ImageRequest, ? super ErrorResult, Unit> function2, @NotNull Function2<? super ImageRequest, ? super SuccessResult, Unit> function22) {
            return listener(new ImageRequest$Builder$listener$5(function1, function12, function2, function22));
        }

        @NotNull
        public final Builder memoryCacheKey(@Nullable String str) {
            return memoryCacheKey(str != null ? new MemoryCache.Key(str, null, 2, null) : null);
        }

        @NotNull
        public final Builder memoryCachePolicy(@NotNull CachePolicy cachePolicy) {
            this.f40771u = cachePolicy;
            return this;
        }

        @NotNull
        public final Builder networkCachePolicy(@NotNull CachePolicy cachePolicy) {
            this.f40773w = cachePolicy;
            return this;
        }

        @NotNull
        public final Builder parameters(@NotNull Parameters parameters) {
            this.f40737B = parameters.newBuilder();
            return this;
        }

        @NotNull
        public final Builder placeholder(@DrawableRes int i) {
            this.f40739D = Integer.valueOf(i);
            this.f40740E = null;
            return this;
        }

        @NotNull
        public final Builder placeholderMemoryCacheKey(@Nullable String str) {
            return placeholderMemoryCacheKey(str != null ? new MemoryCache.Key(str, null, 2, null) : null);
        }

        @NotNull
        public final Builder precision(@NotNull Precision precision) {
            this.f40760j = precision;
            return this;
        }

        @NotNull
        public final Builder premultipliedAlpha(boolean z) {
            this.f40770t = z;
            return this;
        }

        @NotNull
        public final Builder removeHeader(@NotNull String str) {
            Headers.Builder builder = this.f40765o;
            if (builder != null) {
                builder.removeAll(str);
            }
            return this;
        }

        @NotNull
        public final Builder removeParameter(@NotNull String str) {
            Parameters.Builder builder = this.f40737B;
            if (builder != null) {
                builder.remove(str);
            }
            return this;
        }

        @NotNull
        public final Builder scale(@NotNull Scale scale) {
            this.f40747L = scale;
            return this;
        }

        @NotNull
        public final Builder setHeader(@NotNull String str, @NotNull String str2) {
            Headers.Builder builder = this.f40765o;
            if (builder == null) {
                builder = new Headers.Builder();
                this.f40765o = builder;
            }
            builder.set(str, str2);
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setParameter(@NotNull String str, @Nullable Object obj) {
            return setParameter$default(this, str, obj, null, 4, null);
        }

        @NotNull
        public final Builder size(@InterfaceC2055Px int i) {
            return size(i, i);
        }

        public final /* synthetic */ <T> Builder tag(T t) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return tag(Object.class, t);
        }

        @NotNull
        public final Builder tags(@NotNull Tags tags) {
            this.f40766p = AbstractC11687a.toMutableMap(tags.asMap());
            return this;
        }

        @NotNull
        public final Builder target(@NotNull ImageView imageView) {
            return target(new ImageViewTarget(imageView));
        }

        @NotNull
        public final Builder transformationDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
            this.f40736A = coroutineDispatcher;
            return this;
        }

        @NotNull
        public final Builder transformations(@NotNull Transformation... transformationArr) {
            return transformations(ArraysKt___ArraysKt.toList(transformationArr));
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'transitionFactory'.", replaceWith = @ReplaceWith(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        @NotNull
        public final Builder transition(@NotNull Transition transition) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder transitionFactory(@NotNull Transition.Factory factory) {
            this.f40764n = factory;
            return this;
        }

        public Builder(@NotNull Context context) {
            this.f40751a = context;
            this.f40752b = Requests.getDEFAULT_REQUEST_OPTIONS();
            this.f40753c = null;
            this.f40754d = null;
            this.f40755e = null;
            this.f40756f = null;
            this.f40757g = null;
            this.f40758h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f40759i = null;
            }
            this.f40760j = null;
            this.f40761k = null;
            this.f40762l = null;
            this.f40763m = CollectionsKt__CollectionsKt.emptyList();
            this.f40764n = null;
            this.f40765o = null;
            this.f40766p = null;
            this.f40767q = true;
            this.f40768r = null;
            this.f40769s = null;
            this.f40770t = true;
            this.f40771u = null;
            this.f40772v = null;
            this.f40773w = null;
            this.f40774x = null;
            this.f40775y = null;
            this.f40776z = null;
            this.f40736A = null;
            this.f40737B = null;
            this.f40738C = null;
            this.f40739D = null;
            this.f40740E = null;
            this.f40741F = null;
            this.f40742G = null;
            this.f40743H = null;
            this.f40744I = null;
            this.f40745J = null;
            this.f40746K = null;
            this.f40747L = null;
            this.f40748M = null;
            this.f40749N = null;
            this.f40750O = null;
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
        public final <T> Builder fetcherFactory(@NotNull Fetcher.Factory<T> factory, @NotNull Class<T> cls) {
            this.f40761k = TuplesKt.m28844to(factory, cls);
            return this;
        }

        @NotNull
        public final Builder lifecycle(@Nullable Lifecycle lifecycle) {
            this.f40745J = lifecycle;
            return this;
        }

        @NotNull
        public final Builder listener(@Nullable Listener listener) {
            this.f40755e = listener;
            return this;
        }

        @NotNull
        public final Builder memoryCacheKey(@Nullable MemoryCache.Key key) {
            this.f40756f = key;
            return this;
        }

        @NotNull
        public final Builder placeholderMemoryCacheKey(@Nullable MemoryCache.Key key) {
            this.f40738C = key;
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setParameter(@NotNull String str, @Nullable Object obj, @Nullable String str2) {
            Parameters.Builder builder = this.f40737B;
            if (builder == null) {
                builder = new Parameters.Builder();
                this.f40737B = builder;
            }
            builder.set(str, obj, str2);
            return this;
        }

        @NotNull
        public final Builder size(@InterfaceC2055Px int i, @InterfaceC2055Px int i2) {
            return size(Sizes.Size(i, i2));
        }

        @NotNull
        public final <T> Builder tag(@NotNull Class<? super T> cls, @Nullable T t) {
            if (t == null) {
                Map map = this.f40766p;
                if (map != null) {
                    map.remove(cls);
                }
            } else {
                Map map2 = this.f40766p;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f40766p = map2;
                }
                T cast = cls.cast(t);
                Intrinsics.checkNotNull(cast);
                map2.put(cls, cast);
            }
            return this;
        }

        @NotNull
        public final Builder target(@NotNull Function1<? super Drawable, Unit> function1, @NotNull Function1<? super Drawable, Unit> function12, @NotNull Function1<? super Drawable, Unit> function13) {
            return target(new ImageRequest$Builder$target$4(function1, function12, function13));
        }

        @NotNull
        public final Builder transformations(@NotNull List<? extends Transformation> list) {
            this.f40763m = Collections.toImmutableList(list);
            return this;
        }

        @NotNull
        public final Builder error(@Nullable Drawable drawable) {
            this.f40742G = drawable;
            this.f40741F = 0;
            return this;
        }

        @NotNull
        public final Builder fallback(@Nullable Drawable drawable) {
            this.f40744I = drawable;
            this.f40743H = 0;
            return this;
        }

        @NotNull
        public final Builder placeholder(@Nullable Drawable drawable) {
            this.f40740E = drawable;
            this.f40739D = 0;
            return this;
        }

        @NotNull
        public final Builder size(@NotNull Dimension dimension, @NotNull Dimension dimension2) {
            return size(new Size(dimension, dimension2));
        }

        @NotNull
        public final Builder target(@Nullable Target target) {
            this.f40754d = target;
            m51038b();
            return this;
        }

        @NotNull
        public final Builder size(@NotNull Size size) {
            return size(SizeResolvers.create(size));
        }

        @NotNull
        public final Builder size(@NotNull SizeResolver sizeResolver) {
            this.f40746K = sizeResolver;
            m51038b();
            return this;
        }

        @JvmOverloads
        public Builder(@NotNull ImageRequest imageRequest, @NotNull Context context) {
            this.f40751a = context;
            this.f40752b = imageRequest.getDefaults();
            this.f40753c = imageRequest.getData();
            this.f40754d = imageRequest.getTarget();
            this.f40755e = imageRequest.getListener();
            this.f40756f = imageRequest.getMemoryCacheKey();
            this.f40757g = imageRequest.getDiskCacheKey();
            this.f40758h = imageRequest.getDefined().getBitmapConfig();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f40759i = imageRequest.getColorSpace();
            }
            this.f40760j = imageRequest.getDefined().getPrecision();
            this.f40761k = imageRequest.getFetcherFactory();
            this.f40762l = imageRequest.getDecoderFactory();
            this.f40763m = imageRequest.getTransformations();
            this.f40764n = imageRequest.getDefined().getTransitionFactory();
            this.f40765o = imageRequest.getHeaders().newBuilder();
            this.f40766p = AbstractC11687a.toMutableMap(imageRequest.getTags().asMap());
            this.f40767q = imageRequest.getAllowConversionToBitmap();
            this.f40768r = imageRequest.getDefined().getAllowHardware();
            this.f40769s = imageRequest.getDefined().getAllowRgb565();
            this.f40770t = imageRequest.getPremultipliedAlpha();
            this.f40771u = imageRequest.getDefined().getMemoryCachePolicy();
            this.f40772v = imageRequest.getDefined().getDiskCachePolicy();
            this.f40773w = imageRequest.getDefined().getNetworkCachePolicy();
            this.f40774x = imageRequest.getDefined().getInterceptorDispatcher();
            this.f40775y = imageRequest.getDefined().getFetcherDispatcher();
            this.f40776z = imageRequest.getDefined().getDecoderDispatcher();
            this.f40736A = imageRequest.getDefined().getTransformationDispatcher();
            this.f40737B = imageRequest.getParameters().newBuilder();
            this.f40738C = imageRequest.getPlaceholderMemoryCacheKey();
            this.f40739D = imageRequest.f40702F;
            this.f40740E = imageRequest.f40703G;
            this.f40741F = imageRequest.f40704H;
            this.f40742G = imageRequest.f40705I;
            this.f40743H = imageRequest.f40706J;
            this.f40744I = imageRequest.f40707K;
            this.f40745J = imageRequest.getDefined().getLifecycle();
            this.f40746K = imageRequest.getDefined().getSizeResolver();
            this.f40747L = imageRequest.getDefined().getScale();
            if (imageRequest.getContext() == context) {
                this.f40748M = imageRequest.getLifecycle();
                this.f40749N = imageRequest.getSizeResolver();
                this.f40750O = imageRequest.getScale();
                return;
            }
            this.f40748M = null;
            this.f40749N = null;
            this.f40750O = null;
        }

        public /* synthetic */ Builder(ImageRequest imageRequest, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageRequest, (i & 2) != 0 ? imageRequest.getContext() : context);
        }
    }

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, m28850d2 = {"Lcoil/request/ImageRequest$Listener;", "", "onCancel", "", "request", "Lcoil/request/ImageRequest;", "onError", "result", "Lcoil/request/ErrorResult;", Constant.ServiceAPIName.onStart, "onSuccess", "Lcoil/request/SuccessResult;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public interface Listener {

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class DefaultImpls {
            @MainThread
            @Deprecated
            public static void onCancel(@NotNull Listener listener, @NotNull ImageRequest imageRequest) {
                AbstractC21270nd0.m26113e(listener, imageRequest);
            }

            @MainThread
            @Deprecated
            public static void onError(@NotNull Listener listener, @NotNull ImageRequest imageRequest, @NotNull ErrorResult errorResult) {
                AbstractC21270nd0.m26112f(listener, imageRequest, errorResult);
            }

            @MainThread
            @Deprecated
            public static void onStart(@NotNull Listener listener, @NotNull ImageRequest imageRequest) {
                AbstractC21270nd0.m26111g(listener, imageRequest);
            }

            @MainThread
            @Deprecated
            public static void onSuccess(@NotNull Listener listener, @NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult) {
                AbstractC21270nd0.m26110h(listener, imageRequest, successResult);
            }
        }

        @MainThread
        void onCancel(@NotNull ImageRequest imageRequest);

        @MainThread
        void onError(@NotNull ImageRequest imageRequest, @NotNull ErrorResult errorResult);

        @MainThread
        void onStart(@NotNull ImageRequest imageRequest);

        @MainThread
        void onSuccess(@NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult);
    }

    public /* synthetic */ ImageRequest(Context context, Object obj, Target target, Listener listener, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, Decoder.Factory factory, List list, Transition.Factory factory2, Headers headers, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, target, listener, key, str, config, colorSpace, precision, pair, factory, list, factory2, headers, tags, z, z2, z3, z4, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, sizeResolver, scale, parameters, key2, num, drawable, num2, drawable2, num3, drawable3, definedRequestOptions, defaultRequestOptions);
    }

    public static /* synthetic */ Builder newBuilder$default(ImageRequest imageRequest, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = imageRequest.f40710a;
        }
        return imageRequest.newBuilder(context);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (Intrinsics.areEqual(this.f40710a, imageRequest.f40710a) && Intrinsics.areEqual(this.f40711b, imageRequest.f40711b) && Intrinsics.areEqual(this.f40712c, imageRequest.f40712c) && Intrinsics.areEqual(this.f40713d, imageRequest.f40713d) && Intrinsics.areEqual(this.f40714e, imageRequest.f40714e) && Intrinsics.areEqual(this.f40715f, imageRequest.f40715f) && this.f40716g == imageRequest.f40716g && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f40717h, imageRequest.f40717h)) && this.f40718i == imageRequest.f40718i && Intrinsics.areEqual(this.f40719j, imageRequest.f40719j) && Intrinsics.areEqual(this.f40720k, imageRequest.f40720k) && Intrinsics.areEqual(this.f40721l, imageRequest.f40721l) && Intrinsics.areEqual(this.f40722m, imageRequest.f40722m) && Intrinsics.areEqual(this.f40723n, imageRequest.f40723n) && Intrinsics.areEqual(this.f40724o, imageRequest.f40724o) && this.f40725p == imageRequest.f40725p && this.f40726q == imageRequest.f40726q && this.f40727r == imageRequest.f40727r && this.f40728s == imageRequest.f40728s && this.f40729t == imageRequest.f40729t && this.f40730u == imageRequest.f40730u && this.f40731v == imageRequest.f40731v && Intrinsics.areEqual(this.f40732w, imageRequest.f40732w) && Intrinsics.areEqual(this.f40733x, imageRequest.f40733x) && Intrinsics.areEqual(this.f40734y, imageRequest.f40734y) && Intrinsics.areEqual(this.f40735z, imageRequest.f40735z) && Intrinsics.areEqual(this.f40701E, imageRequest.f40701E) && Intrinsics.areEqual(this.f40702F, imageRequest.f40702F) && Intrinsics.areEqual(this.f40703G, imageRequest.f40703G) && Intrinsics.areEqual(this.f40704H, imageRequest.f40704H) && Intrinsics.areEqual(this.f40705I, imageRequest.f40705I) && Intrinsics.areEqual(this.f40706J, imageRequest.f40706J) && Intrinsics.areEqual(this.f40707K, imageRequest.f40707K) && Intrinsics.areEqual(this.f40697A, imageRequest.f40697A) && Intrinsics.areEqual(this.f40698B, imageRequest.f40698B) && this.f40699C == imageRequest.f40699C && Intrinsics.areEqual(this.f40700D, imageRequest.f40700D) && Intrinsics.areEqual(this.f40708L, imageRequest.f40708L) && Intrinsics.areEqual(this.f40709M, imageRequest.f40709M))) {
                return true;
            }
        }
        return false;
    }

    public final boolean getAllowConversionToBitmap() {
        return this.f40725p;
    }

    public final boolean getAllowHardware() {
        return this.f40726q;
    }

    public final boolean getAllowRgb565() {
        return this.f40727r;
    }

    @NotNull
    public final Bitmap.Config getBitmapConfig() {
        return this.f40716g;
    }

    @Nullable
    public final ColorSpace getColorSpace() {
        return this.f40717h;
    }

    @NotNull
    public final Context getContext() {
        return this.f40710a;
    }

    @NotNull
    public final Object getData() {
        return this.f40711b;
    }

    @NotNull
    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.f40734y;
    }

    @Nullable
    public final Decoder.Factory getDecoderFactory() {
        return this.f40720k;
    }

    @NotNull
    public final DefaultRequestOptions getDefaults() {
        return this.f40709M;
    }

    @NotNull
    public final DefinedRequestOptions getDefined() {
        return this.f40708L;
    }

    @Nullable
    public final String getDiskCacheKey() {
        return this.f40715f;
    }

    @NotNull
    public final CachePolicy getDiskCachePolicy() {
        return this.f40730u;
    }

    @Nullable
    public final Drawable getError() {
        return Requests.getDrawableCompat(this, this.f40705I, this.f40704H, this.f40709M.getError());
    }

    @Nullable
    public final Drawable getFallback() {
        return Requests.getDrawableCompat(this, this.f40707K, this.f40706J, this.f40709M.getFallback());
    }

    @NotNull
    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.f40733x;
    }

    @Nullable
    public final Pair<Fetcher.Factory<?>, Class<?>> getFetcherFactory() {
        return this.f40719j;
    }

    @NotNull
    public final Headers getHeaders() {
        return this.f40723n;
    }

    @NotNull
    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.f40732w;
    }

    @NotNull
    public final Lifecycle getLifecycle() {
        return this.f40697A;
    }

    @Nullable
    public final Listener getListener() {
        return this.f40713d;
    }

    @Nullable
    public final MemoryCache.Key getMemoryCacheKey() {
        return this.f40714e;
    }

    @NotNull
    public final CachePolicy getMemoryCachePolicy() {
        return this.f40729t;
    }

    @NotNull
    public final CachePolicy getNetworkCachePolicy() {
        return this.f40731v;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.f40700D;
    }

    @Nullable
    public final Drawable getPlaceholder() {
        return Requests.getDrawableCompat(this, this.f40703G, this.f40702F, this.f40709M.getPlaceholder());
    }

    @Nullable
    public final MemoryCache.Key getPlaceholderMemoryCacheKey() {
        return this.f40701E;
    }

    @NotNull
    public final Precision getPrecision() {
        return this.f40718i;
    }

    public final boolean getPremultipliedAlpha() {
        return this.f40728s;
    }

    @NotNull
    public final Scale getScale() {
        return this.f40699C;
    }

    @NotNull
    public final SizeResolver getSizeResolver() {
        return this.f40698B;
    }

    @NotNull
    public final Tags getTags() {
        return this.f40724o;
    }

    @Nullable
    public final Target getTarget() {
        return this.f40712c;
    }

    @NotNull
    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.f40735z;
    }

    @NotNull
    public final List<Transformation> getTransformations() {
        return this.f40721l;
    }

    @NotNull
    public final Transition.Factory getTransitionFactory() {
        return this.f40722m;
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
        int hashCode = ((this.f40710a.hashCode() * 31) + this.f40711b.hashCode()) * 31;
        Target target = this.f40712c;
        int i14 = 0;
        if (target != null) {
            i = target.hashCode();
        } else {
            i = 0;
        }
        int i15 = (hashCode + i) * 31;
        Listener listener = this.f40713d;
        if (listener != null) {
            i2 = listener.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        MemoryCache.Key key = this.f40714e;
        if (key != null) {
            i3 = key.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        String str = this.f40715f;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (((i17 + i4) * 31) + this.f40716g.hashCode()) * 31;
        ColorSpace colorSpace = this.f40717h;
        if (colorSpace != null) {
            i5 = colorSpace.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode3 = (((hashCode2 + i5) * 31) + this.f40718i.hashCode()) * 31;
        Pair pair = this.f40719j;
        if (pair != null) {
            i6 = pair.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (hashCode3 + i6) * 31;
        Decoder.Factory factory = this.f40720k;
        if (factory != null) {
            i7 = factory.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode4 = (((((((((((((((((((((((((((((((((((((((i18 + i7) * 31) + this.f40721l.hashCode()) * 31) + this.f40722m.hashCode()) * 31) + this.f40723n.hashCode()) * 31) + this.f40724o.hashCode()) * 31) + AbstractC1705Xp.m65430a(this.f40725p)) * 31) + AbstractC1705Xp.m65430a(this.f40726q)) * 31) + AbstractC1705Xp.m65430a(this.f40727r)) * 31) + AbstractC1705Xp.m65430a(this.f40728s)) * 31) + this.f40729t.hashCode()) * 31) + this.f40730u.hashCode()) * 31) + this.f40731v.hashCode()) * 31) + this.f40732w.hashCode()) * 31) + this.f40733x.hashCode()) * 31) + this.f40734y.hashCode()) * 31) + this.f40735z.hashCode()) * 31) + this.f40697A.hashCode()) * 31) + this.f40698B.hashCode()) * 31) + this.f40699C.hashCode()) * 31) + this.f40700D.hashCode()) * 31;
        MemoryCache.Key key2 = this.f40701E;
        if (key2 != null) {
            i8 = key2.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (hashCode4 + i8) * 31;
        Integer num = this.f40702F;
        if (num != null) {
            i9 = num.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        Drawable drawable = this.f40703G;
        if (drawable != null) {
            i10 = drawable.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 31;
        Integer num2 = this.f40704H;
        if (num2 != null) {
            i11 = num2.hashCode();
        } else {
            i11 = 0;
        }
        int i22 = (i21 + i11) * 31;
        Drawable drawable2 = this.f40705I;
        if (drawable2 != null) {
            i12 = drawable2.hashCode();
        } else {
            i12 = 0;
        }
        int i23 = (i22 + i12) * 31;
        Integer num3 = this.f40706J;
        if (num3 != null) {
            i13 = num3.hashCode();
        } else {
            i13 = 0;
        }
        int i24 = (i23 + i13) * 31;
        Drawable drawable3 = this.f40707K;
        if (drawable3 != null) {
            i14 = drawable3.hashCode();
        }
        return ((((i24 + i14) * 31) + this.f40708L.hashCode()) * 31) + this.f40709M.hashCode();
    }

    @JvmOverloads
    @NotNull
    public final Builder newBuilder() {
        return newBuilder$default(this, null, 1, null);
    }

    public ImageRequest(Context context, Object obj, Target target, Listener listener, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, Decoder.Factory factory, List list, Transition.Factory factory2, Headers headers, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions) {
        this.f40710a = context;
        this.f40711b = obj;
        this.f40712c = target;
        this.f40713d = listener;
        this.f40714e = key;
        this.f40715f = str;
        this.f40716g = config;
        this.f40717h = colorSpace;
        this.f40718i = precision;
        this.f40719j = pair;
        this.f40720k = factory;
        this.f40721l = list;
        this.f40722m = factory2;
        this.f40723n = headers;
        this.f40724o = tags;
        this.f40725p = z;
        this.f40726q = z2;
        this.f40727r = z3;
        this.f40728s = z4;
        this.f40729t = cachePolicy;
        this.f40730u = cachePolicy2;
        this.f40731v = cachePolicy3;
        this.f40732w = coroutineDispatcher;
        this.f40733x = coroutineDispatcher2;
        this.f40734y = coroutineDispatcher3;
        this.f40735z = coroutineDispatcher4;
        this.f40697A = lifecycle;
        this.f40698B = sizeResolver;
        this.f40699C = scale;
        this.f40700D = parameters;
        this.f40701E = key2;
        this.f40702F = num;
        this.f40703G = drawable;
        this.f40704H = num2;
        this.f40705I = drawable2;
        this.f40706J = num3;
        this.f40707K = drawable3;
        this.f40708L = definedRequestOptions;
        this.f40709M = defaultRequestOptions;
    }

    @JvmOverloads
    @NotNull
    public final Builder newBuilder(@NotNull Context context) {
        return new Builder(this, context);
    }
}
