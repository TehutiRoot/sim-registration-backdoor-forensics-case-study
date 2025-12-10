package coil.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.WorkerThread;
import coil.decode.DecodeUtils;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m28850d2 = {"Lcoil/util/DrawableUtils;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Bitmap$Config;", "config", "Lcoil/size/Size;", "size", "Lcoil/size/Scale;", "scale", "", "allowInexactSize", "Landroid/graphics/Bitmap;", "convertToBitmap", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lcoil/size/Size;Lcoil/size/Scale;Z)Landroid/graphics/Bitmap;", "bitmap", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(ZLandroid/graphics/Bitmap;Lcoil/size/Size;Lcoil/size/Scale;)Z", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDrawableUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableUtils.kt\ncoil/util/DrawableUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncoil/util/-Utils\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 5 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,96:1\n1#2:97\n219#3:98\n223#3:99\n219#3:105\n223#3:106\n95#4:100\n38#5:101\n49#5:102\n60#5:103\n71#5:104\n*S KotlinDebug\n*F\n+ 1 DrawableUtils.kt\ncoil/util/DrawableUtils\n*L\n54#1:98\n55#1:99\n89#1:105\n90#1:106\n61#1:100\n63#1:101\n63#1:102\n63#1:103\n63#1:104\n*E\n"})
/* loaded from: classes3.dex */
public final class DrawableUtils {
    @NotNull
    public static final DrawableUtils INSTANCE = new DrawableUtils();

    /* renamed from: a */
    public final boolean m51018a(Bitmap bitmap, Bitmap.Config config) {
        if (bitmap.getConfig() == Bitmaps.toSoftware(config)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m51017b(boolean z, Bitmap bitmap, Size size, Scale scale) {
        int px;
        int px2;
        if (z) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (Sizes.isOriginal(size)) {
            px = bitmap.getWidth();
        } else {
            px = Utils.toPx(size.getWidth(), scale);
        }
        if (Sizes.isOriginal(size)) {
            px2 = bitmap.getHeight();
        } else {
            px2 = Utils.toPx(size.getHeight(), scale);
        }
        if (DecodeUtils.computeSizeMultiplier(width, height, px, px2, scale) == 1.0d) {
            return true;
        }
        return false;
    }

    @WorkerThread
    @NotNull
    public final Bitmap convertToBitmap(@NotNull Drawable drawable, @NotNull Bitmap.Config config, @NotNull Size size, @NotNull Scale scale, boolean z) {
        int px;
        int px2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (m51018a(bitmap, config) && m51017b(z, bitmap, size, scale)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int width = Utils.getWidth(mutate);
        int i = 512;
        if (width <= 0) {
            width = 512;
        }
        int height = Utils.getHeight(mutate);
        if (height > 0) {
            i = height;
        }
        if (Sizes.isOriginal(size)) {
            px = width;
        } else {
            px = Utils.toPx(size.getWidth(), scale);
        }
        if (Sizes.isOriginal(size)) {
            px2 = i;
        } else {
            px2 = Utils.toPx(size.getHeight(), scale);
        }
        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(width, i, px, px2, scale);
        int roundToInt = AbstractC21140mr0.roundToInt(width * computeSizeMultiplier);
        int roundToInt2 = AbstractC21140mr0.roundToInt(computeSizeMultiplier * i);
        Bitmap createBitmap = Bitmap.createBitmap(roundToInt, roundToInt2, Bitmaps.toSoftware(config));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        Rect bounds = mutate.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        mutate.setBounds(0, 0, roundToInt, roundToInt2);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i2, i3, i4, i5);
        return createBitmap;
    }
}
