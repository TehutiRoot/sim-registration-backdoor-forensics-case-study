package coil.decode;

import android.net.Uri;
import coil.annotation.ExperimentalCoilApi;
import coil.decode.ImageSource;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28850d2 = {"Lcoil/decode/ContentMetadata;", "Lcoil/decode/ImageSource$Metadata;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalCoilApi
/* loaded from: classes3.dex */
public final class ContentMetadata extends ImageSource.Metadata {

    /* renamed from: a */
    public final Uri f40481a;

    public ContentMetadata(@NotNull Uri uri) {
        this.f40481a = uri;
    }

    @NotNull
    public final Uri getUri() {
        return this.f40481a;
    }
}
