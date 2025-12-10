package io.fotoapparat.result;

import android.graphics.BitmapFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Landroid/graphics/BitmapFactory$Options;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class Photo$decodedBounds$2 extends Lambda implements Function0<BitmapFactory.Options> {
    final /* synthetic */ Photo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Photo$decodedBounds$2(Photo photo) {
        super(0);
        this.this$0 = photo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final BitmapFactory.Options invoke() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Photo photo = this.this$0;
        options.inJustDecodeBounds = true;
        byte[] bArr = photo.encodedImage;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return options;
    }
}
