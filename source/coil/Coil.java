package coil;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\n\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28850d2 = {"Lcoil/Coil;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcoil/ImageLoader;", "imageLoader", "(Landroid/content/Context;)Lcoil/ImageLoader;", "", "setImageLoader", "(Lcoil/ImageLoader;)V", "Lcoil/ImageLoaderFactory;", "factory", "(Lcoil/ImageLoaderFactory;)V", "reset", "Lcoil/request/ImageRequest;", "request", "Lcoil/request/Disposable;", "enqueue", "(Lcoil/request/ImageRequest;)Lcoil/request/Disposable;", "Lcoil/request/ImageResult;", "execute", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/ImageLoader;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/ImageLoaderFactory;", "imageLoaderFactory", "coil-singleton_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coil.kt\ncoil/Coil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes3.dex */
public final class Coil {
    @NotNull
    public static final Coil INSTANCE = new Coil();

    /* renamed from: a */
    public static ImageLoader f40384a;

    /* renamed from: b */
    public static ImageLoaderFactory f40385b;

    @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with 'context.imageLoader.enqueue(request)'.", replaceWith = @ReplaceWith(expression = "request.context.imageLoader.enqueue(request)", imports = {"coil.imageLoader"}))
    @JvmStatic
    @NotNull
    public static final Disposable enqueue(@NotNull ImageRequest imageRequest) {
        throw new IllegalStateException("Unsupported".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with 'context.imageLoader.execute(request)'.", replaceWith = @ReplaceWith(expression = "request.context.imageLoader.execute(request)", imports = {"coil.imageLoader"}))
    @JvmStatic
    @Nullable
    public static final Object execute(@NotNull ImageRequest imageRequest, @NotNull Continuation<? super ImageResult> continuation) {
        throw new IllegalStateException("Unsupported".toString());
    }

    @JvmStatic
    @NotNull
    public static final ImageLoader imageLoader(@NotNull Context context) {
        ImageLoader imageLoader = f40384a;
        if (imageLoader == null) {
            return INSTANCE.m51151a(context);
        }
        return imageLoader;
    }

    @JvmStatic
    public static final synchronized void reset() {
        synchronized (Coil.class) {
            f40384a = null;
            f40385b = null;
        }
    }

    @JvmStatic
    public static final synchronized void setImageLoader(@NotNull ImageLoader imageLoader) {
        synchronized (Coil.class) {
            f40385b = null;
            f40384a = imageLoader;
        }
    }

    /* renamed from: a */
    public final synchronized ImageLoader m51151a(Context context) {
        ImageLoaderFactory imageLoaderFactory;
        ImageLoader create;
        try {
            ImageLoader imageLoader = f40384a;
            if (imageLoader != null) {
                return imageLoader;
            }
            ImageLoaderFactory imageLoaderFactory2 = f40385b;
            if (imageLoaderFactory2 != null) {
                create = imageLoaderFactory2.newImageLoader();
                if (create == null) {
                }
                f40385b = null;
                f40384a = create;
                return create;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof ImageLoaderFactory) {
                imageLoaderFactory = (ImageLoaderFactory) applicationContext;
            } else {
                imageLoaderFactory = null;
            }
            if (imageLoaderFactory != null) {
                create = imageLoaderFactory.newImageLoader();
            } else {
                create = ImageLoaders.create(context);
            }
            f40385b = null;
            f40384a = create;
            return create;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @JvmStatic
    public static final synchronized void setImageLoader(@NotNull ImageLoaderFactory imageLoaderFactory) {
        synchronized (Coil.class) {
            f40385b = imageLoaderFactory;
            f40384a = null;
        }
    }
}
