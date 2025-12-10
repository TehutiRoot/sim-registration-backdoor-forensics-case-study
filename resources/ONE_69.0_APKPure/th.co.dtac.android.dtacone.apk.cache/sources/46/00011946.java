package th.p047co.dtac.android.dtacone.extension;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import ch.qos.logback.core.CoreConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.WindowUtil;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001¨\u0006\n"}, m29142d2 = {"generateQRCode", "Landroid/graphics/Bitmap;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "dpWidth", "", "dpHeight", "mergeQrCodeWithLogoBitmaps", "logo", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.QRCodeExtKt */
/* loaded from: classes7.dex */
public final class QRCodeExtKt {
    @Nullable
    public static final Bitmap generateQRCode(@NotNull String str, @NotNull Context context, float f, float f2) {
        int i;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            QRCodeWriter qRCodeWriter = new QRCodeWriter();
            BarcodeFormat barcodeFormat = BarcodeFormat.QR_CODE;
            WindowUtil.Companion companion = WindowUtil.Companion;
            BitMatrix encode = qRCodeWriter.encode(str, barcodeFormat, AbstractC22237sr0.roundToInt(companion.convertDpToPx(context, f)), AbstractC22237sr0.roundToInt(companion.convertDpToPx(context, f2)));
            int width = encode.getWidth();
            int height = encode.getHeight();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
            for (int i2 = 0; i2 < width; i2++) {
                for (int i3 = 0; i3 < height; i3++) {
                    if (encode.get(i2, i3)) {
                        i = -16777216;
                    } else {
                        i = -1;
                    }
                    createBitmap.setPixel(i2, i3, i);
                }
            }
            return createBitmap;
        } catch (WriterException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ Bitmap generateQRCode$default(String str, Context context, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 300.0f;
        }
        if ((i & 4) != 0) {
            f2 = 300.0f;
        }
        return generateQRCode(str, context, f, f2);
    }

    @NotNull
    public static final Bitmap mergeQrCodeWithLogoBitmaps(@NotNull Bitmap bitmap, @NotNull Context context, @Nullable Bitmap bitmap2) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(this.width,… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        int width2 = canvas.getWidth();
        int height2 = canvas.getHeight();
        canvas.drawBitmap(bitmap, new Matrix(), null);
        Intrinsics.checkNotNull(bitmap2);
        WindowUtil.Companion companion = WindowUtil.Companion;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, (int) companion.convertDpToPx(context, 40.0f), (int) companion.convertDpToPx(context, 40.0f), true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(logo!…text, 40f).toInt(), true)");
        canvas.drawBitmap(createScaledBitmap, (width2 - createScaledBitmap.getWidth()) / 2.0f, (height2 - createScaledBitmap.getHeight()) / 2.0f, (Paint) null);
        return createBitmap;
    }
}