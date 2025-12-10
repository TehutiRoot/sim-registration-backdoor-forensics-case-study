package coil.decode;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class ImageSources$ImageSource$3 extends Lambda implements Function0<File> {
    final /* synthetic */ File $cacheDirectory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSources$ImageSource$3(File file) {
        super(0);
        this.$cacheDirectory = file;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final File invoke() {
        return this.$cacheDirectory;
    }
}
