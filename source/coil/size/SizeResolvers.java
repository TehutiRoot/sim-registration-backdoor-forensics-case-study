package coil.size;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0004¨\u0006\u0005"}, m28850d2 = {"SizeResolver", "Lcoil/size/SizeResolver;", "size", "Lcoil/size/Size;", "create", "coil-base_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@JvmName(name = "SizeResolvers")
/* loaded from: classes3.dex */
public final class SizeResolvers {
    @JvmName(name = "create")
    @NotNull
    public static final SizeResolver create(@NotNull Size size) {
        return new RealSizeResolver(size);
    }
}
