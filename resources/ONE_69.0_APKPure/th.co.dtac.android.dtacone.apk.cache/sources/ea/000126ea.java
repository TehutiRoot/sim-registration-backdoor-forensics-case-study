package th.p047co.dtac.android.dtacone.util.bitmap;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/bitmap/IBitmapEditor;", "", "cropImage", "", "bitmap", "Landroid/graphics/Bitmap;", "loadInternalBitmap", "name", "", "rotateExistImage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.bitmap.IBitmapEditor */
/* loaded from: classes8.dex */
public interface IBitmapEditor {
    @NotNull
    byte[] cropImage(@NotNull Bitmap bitmap);

    @NotNull
    Bitmap loadInternalBitmap(@NotNull String str);

    @NotNull
    Bitmap rotateExistImage(@NotNull String str);
}