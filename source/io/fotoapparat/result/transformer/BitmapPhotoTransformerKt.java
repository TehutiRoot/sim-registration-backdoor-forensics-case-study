package io.fotoapparat.result.transformer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.result.Photo;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lio/fotoapparat/result/Photo;", "", "scaleFactor", "Lio/fotoapparat/parameter/Resolution;", "originalResolution", "desiredResolution", "Landroid/graphics/Bitmap;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lio/fotoapparat/result/Photo;FLio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/Resolution;)Landroid/graphics/Bitmap;", OperatorName.CURVE_TO, "(Lio/fotoapparat/result/Photo;)Lio/fotoapparat/parameter/Resolution;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/Resolution;)F", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class BitmapPhotoTransformerKt {
    /* renamed from: a */
    public static final float m30484a(Resolution resolution, Resolution resolution2) {
        return Math.min(resolution.width / resolution2.width, resolution.height / resolution2.height);
    }

    /* renamed from: b */
    public static final Bitmap m30483b(Photo photo, float f, Resolution resolution, Resolution resolution2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = (int) f;
        options.inSampleSize = i;
        options.inScaled = true;
        int i2 = resolution2.width;
        int i3 = resolution2.height;
        if (i2 > i3) {
            options.inDensity = resolution.width;
            options.inTargetDensity = i2 * i;
        } else {
            options.inDensity = resolution.height;
            options.inTargetDensity = i3 * i;
        }
        byte[] bArr = photo.encodedImage;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    /* renamed from: c */
    public static final Resolution m30482c(Photo photo) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        byte[] bArr = photo.encodedImage;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return new Resolution(options.outWidth, options.outHeight);
    }
}
