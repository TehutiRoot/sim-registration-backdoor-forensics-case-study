package coil;

import android.content.Context;
import androidx.annotation.WorkerThread;
import ch.qos.logback.core.CoreConstants;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m29142d2 = {"ImageLoader", "Lcoil/ImageLoader;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "create", "executeBlocking", "Lcoil/request/ImageResult;", "request", "Lcoil/request/ImageRequest;", "coil-base_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@JvmName(name = "ImageLoaders")
/* loaded from: classes3.dex */
public final class ImageLoaders {
    @JvmName(name = "create")
    @NotNull
    public static final ImageLoader create(@NotNull Context context) {
        return new ImageLoader.Builder(context).build();
    }

    @WorkerThread
    @NotNull
    public static final ImageResult executeBlocking(@NotNull ImageLoader imageLoader, @NotNull ImageRequest imageRequest) {
        Object m66133b;
        m66133b = AbstractC1455Uc.m66133b(null, new ImageLoaders$executeBlocking$1(imageLoader, imageRequest, null), 1, null);
        return (ImageResult) m66133b;
    }
}