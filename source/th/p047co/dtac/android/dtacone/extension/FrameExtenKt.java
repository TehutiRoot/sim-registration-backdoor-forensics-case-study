package th.p047co.dtac.android.dtacone.extension;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.preview.Frame;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28850d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Lio/fotoapparat/preview/Frame;", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.FrameExtenKt */
/* loaded from: classes7.dex */
public final class FrameExtenKt {
    @NotNull
    public static final Bitmap toBitmap(@NotNull Frame frame) {
        float f;
        Intrinsics.checkNotNullParameter(frame, "<this>");
        int length = frame.getImage().length;
        Timber.m1406d("Size :" + length, new Object[0]);
        int i = frame.getSize().width;
        int i2 = frame.getSize().height;
        Timber.m1406d("w:" + i + "  h:" + i2, new Object[0]);
        YuvImage yuvImage = new YuvImage(frame.getImage(), 17, frame.getSize().width, frame.getSize().height, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Resolution size = frame.getSize();
            int i3 = size.width;
            int i4 = (int) (i3 * 0.45d);
            int i5 = (size.height - i4) / 2;
            int i6 = ((i3 - i4) / 2) - ((int) (i3 * 0.12d));
            Rect rect = new Rect(i6, i5, i4 + i6, i5 + i4);
            int height = rect.height();
            int width = rect.width();
            int i7 = rect.left;
            int i8 = rect.top;
            int i9 = rect.right;
            int i10 = rect.bottom;
            Timber.m1406d("h:" + height + " w:" + width + " l:" + i7 + " t:" + i8 + " r:" + i9 + " b:" + i10, new Object[0]);
            yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            Matrix matrix = new Matrix();
            if (frame.getRotation() != 0) {
                f = frame.getRotation() * (-1);
            } else {
                f = 0.0f;
            }
            matrix.postRotate(f);
            Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(bmp, 0, 0, …h, bmp.height, mat, true)");
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return createBitmap;
        } finally {
        }
    }
}
