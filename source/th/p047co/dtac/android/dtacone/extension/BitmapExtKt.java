package th.p047co.dtac.android.dtacone.extension;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.CoreConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.CapturePhotoUtils;

@Metadata(m28851d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\n\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0001\u001a&\u0010\f\u001a\u00020\r*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0001\u001a\n\u0010\u0014\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0015"}, m28850d2 = {"scaleDown", "Landroid/graphics/Bitmap;", "maxImageSize", "", "filter", "", "toBase64", "", "toBitmap", "Landroid/view/View;", "", "toByteArray", "toGallery", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "fileName", "description", "toInputSteam", "Ljava/io/InputStream;", "toRotate", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.BitmapExtKt */
/* loaded from: classes7.dex */
public final class BitmapExtKt {
    @NotNull
    public static final Bitmap scaleDown(@NotNull Bitmap bitmap, float f, boolean z) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * min), Math.round(min * bitmap.getHeight()), z);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap scaleDown$default(Bitmap bitmap, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return scaleDown(bitmap, f, z);
    }

    @NotNull
    public static final String toBase64(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        String bitmapToBase64 = BitmapUtil.bitmapToBase64(bitmap);
        Intrinsics.checkNotNullExpressionValue(bitmapToBase64, "bitmapToBase64(this)");
        return bitmapToBase64;
    }

    @NotNull
    public static final Bitmap toBitmap(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Bitmap bytes2Bitmap = BitmapUtil.bytes2Bitmap(bArr);
        Intrinsics.checkNotNullExpressionValue(bytes2Bitmap, "bytes2Bitmap(this)");
        return bytes2Bitmap;
    }

    @NotNull
    public static final byte[] toByteArray(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        byte[] bitmap2Bytes = BitmapUtil.bitmap2Bytes(bitmap);
        Intrinsics.checkNotNullExpressionValue(bitmap2Bytes, "bitmap2Bytes(this)");
        return bitmap2Bytes;
    }

    public static final void toGallery(@NotNull View view, @NotNull Context context, @NotNull String fileName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        CapturePhotoUtils capturePhotoUtils = CapturePhotoUtils.INSTANCE;
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "context.contentResolver");
        capturePhotoUtils.insertImage(context, contentResolver, toBitmap(view), fileName, str);
    }

    public static /* synthetic */ void toGallery$default(View view, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        toGallery(view, context, str, str2);
    }

    @NotNull
    public static final InputStream toInputSteam(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    @NotNull
    public static final Bitmap toRotate(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        int attributeInt = new ExifInterface(toInputSteam(bitmap)).getAttributeInt(ExifInterface.TAG_ORIENTATION, 0);
        Matrix matrix = new Matrix();
        if (attributeInt != 90) {
            if (attributeInt != 180) {
                if (attributeInt != 270) {
                    return bitmap;
                }
                matrix.setRotate(90.0f);
            } else {
                matrix.setRotate(180.0f);
            }
        } else {
            matrix.setRotate(-90.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(this, 0, 0,…th, height, matrix, true)");
        bitmap.recycle();
        return createBitmap;
    }

    @NotNull
    public static final Bitmap toBitmap(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Bitmap view2Bitmap = BitmapUtil.view2Bitmap(view);
        Intrinsics.checkNotNullExpressionValue(view2Bitmap, "view2Bitmap(this)");
        return view2Bitmap;
    }
}
