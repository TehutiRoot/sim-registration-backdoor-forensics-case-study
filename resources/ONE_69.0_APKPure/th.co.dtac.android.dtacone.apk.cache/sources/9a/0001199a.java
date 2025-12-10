package th.p047co.dtac.android.dtacone.manager.compressor;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/manager/compressor/ICompressor;", "", "getFileByName", "Ljava/io/File;", "bitmapName", "", "quality", "", "type", "Landroid/graphics/Bitmap$CompressFormat;", "getFileByPath", ClientCookie.PATH_ATTR, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.compressor.ICompressor */
/* loaded from: classes7.dex */
public interface ICompressor {
    @NotNull
    File getFileByName(@NotNull String str, int i);

    @NotNull
    File getFileByName(@NotNull String str, int i, @NotNull Bitmap.CompressFormat compressFormat);

    @NotNull
    File getFileByPath(@NotNull String str, int i);
}