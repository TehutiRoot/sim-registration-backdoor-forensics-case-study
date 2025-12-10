package th.p047co.dtac.android.dtacone.util.bitmap.draw;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;

@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH&J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\"\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH&J\"\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH&¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/bitmap/draw/IDrawBitmap;", "", "drawIdCardFromIdCardData", "Landroid/graphics/Bitmap;", "cardInformation", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "drawIdCardWithSave", "", "bitmapName", "", "drawWatermarkWithSave", "waterMarkText", "oneDrawIdCardFromIdCardData", "oneSaveImageWithWatermarkFromOriginalImage", "originalImageName", "waterMarkImageName", "oneSaveImageWithWatermarkFromOriginalImagePrepaid", "oneSaveImageWithWatermarkFromOriginalImageVertical", "oneSaveImageWithWatermarkFrontFromOriginalImage", "oneSaveImageWithWatermarkFrontFromOriginalImagePrepaid", "oneSaveImageWithWatermarkFrontFromOriginalImageReadCardPrepaid", "saveImageWithWatermarkFromOriginalImage", "saveImageWithWatermarkFrontFromOriginalImage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.bitmap.draw.IDrawBitmap */
/* loaded from: classes8.dex */
public interface IDrawBitmap {

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.bitmap.draw.IDrawBitmap$DefaultImpls */
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Bitmap drawWatermarkWithSave$default(IDrawBitmap iDrawBitmap, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "ใช้เพื่อประกอบการอัพเดทข้อมูลร้านค้าเท่านั้น";
                }
                return iDrawBitmap.drawWatermarkWithSave(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawWatermarkWithSave");
        }

        public static /* synthetic */ Bitmap saveImageWithWatermarkFromOriginalImage$default(IDrawBitmap iDrawBitmap, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = "ใช้เพื่อประกอบการอัพเดทข้อมูลร้านค้าเท่านั้น";
                }
                return iDrawBitmap.saveImageWithWatermarkFromOriginalImage(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveImageWithWatermarkFromOriginalImage");
        }

        public static /* synthetic */ Bitmap saveImageWithWatermarkFrontFromOriginalImage$default(IDrawBitmap iDrawBitmap, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = "ใช้เพื่อประกอบการอัพเดทข้อมูลร้านค้าเท่านั้น";
                }
                return iDrawBitmap.saveImageWithWatermarkFrontFromOriginalImage(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveImageWithWatermarkFrontFromOriginalImage");
        }
    }

    @Nullable
    Bitmap drawIdCardFromIdCardData(@Nullable IdCardInformationCollection idCardInformationCollection);

    void drawIdCardWithSave(@NotNull IdCardInformationCollection idCardInformationCollection, @NotNull String str);

    @NotNull
    Bitmap drawWatermarkWithSave(@NotNull String str, @NotNull String str2);

    @Nullable
    Bitmap oneDrawIdCardFromIdCardData(@Nullable IdCardInformationCollection idCardInformationCollection);

    @NotNull
    Bitmap oneSaveImageWithWatermarkFromOriginalImage(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    Bitmap oneSaveImageWithWatermarkFromOriginalImagePrepaid(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    Bitmap oneSaveImageWithWatermarkFromOriginalImageVertical(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    Bitmap oneSaveImageWithWatermarkFrontFromOriginalImage(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    Bitmap oneSaveImageWithWatermarkFrontFromOriginalImagePrepaid(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    Bitmap oneSaveImageWithWatermarkFrontFromOriginalImageReadCardPrepaid(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    Bitmap saveImageWithWatermarkFromOriginalImage(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    Bitmap saveImageWithWatermarkFrontFromOriginalImage(@NotNull String str, @NotNull String str2, @NotNull String str3);
}