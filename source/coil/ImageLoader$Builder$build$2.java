package coil;

import android.content.Context;
import coil.ImageLoader;
import coil.disk.DiskCache;
import coil.util.SingletonDiskCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lcoil/disk/DiskCache;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class ImageLoader$Builder$build$2 extends Lambda implements Function0<DiskCache> {
    final /* synthetic */ ImageLoader.Builder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoader$Builder$build$2(ImageLoader.Builder builder) {
        super(0);
        this.this$0 = builder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DiskCache invoke() {
        Context context;
        SingletonDiskCache singletonDiskCache = SingletonDiskCache.INSTANCE;
        context = this.this$0.f40398a;
        return singletonDiskCache.get(context);
    }
}
