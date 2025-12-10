package io.fotoapparat.result.transformer;

import android.graphics.Bitmap;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.exception.UnableToDecodeBitmapException;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.result.BitmapPhoto;
import io.fotoapparat.result.Photo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m28850d2 = {"Lio/fotoapparat/result/transformer/BitmapPhotoTransformer;", "Lkotlin/Function1;", "Lio/fotoapparat/result/Photo;", "Lio/fotoapparat/result/BitmapPhoto;", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/result/transformer/ResolutionTransformer;", "sizeTransformer", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "input", "invoke", "(Lio/fotoapparat/result/Photo;)Lio/fotoapparat/result/BitmapPhoto;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function1;", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class BitmapPhotoTransformer implements Function1<Photo, BitmapPhoto> {

    /* renamed from: a */
    public final Function1 f63041a;

    public BitmapPhotoTransformer(@NotNull Function1<? super Resolution, Resolution> sizeTransformer) {
        Intrinsics.checkNotNullParameter(sizeTransformer, "sizeTransformer");
        this.f63041a = sizeTransformer;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public BitmapPhoto invoke(@NotNull Photo input) {
        Resolution m30482c;
        float m30484a;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(input, "input");
        m30482c = BitmapPhotoTransformerKt.m30482c(input);
        Resolution resolution = (Resolution) this.f63041a.invoke(m30482c);
        m30484a = BitmapPhotoTransformerKt.m30484a(m30482c, resolution);
        bitmap = BitmapPhotoTransformerKt.m30483b(input, m30484a, m30482c, resolution);
        if (bitmap != null) {
            if (bitmap.getWidth() != resolution.width || bitmap.getHeight() != resolution.height) {
                bitmap = Bitmap.createScaledBitmap(bitmap, resolution.width, resolution.height, true);
            }
            Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
            return new BitmapPhoto(bitmap, input.rotationDegrees);
        }
        throw new UnableToDecodeBitmapException();
    }
}
