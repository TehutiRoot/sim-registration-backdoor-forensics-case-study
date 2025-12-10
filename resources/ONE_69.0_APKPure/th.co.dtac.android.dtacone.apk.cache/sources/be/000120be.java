package th.p047co.dtac.android.dtacone.model.take_photo;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/QrResult;", "", "bitmap", "Landroid/graphics/Bitmap;", "value", "", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.take_photo.QrResult */
/* loaded from: classes8.dex */
public final class QrResult {
    public static final int $stable = 8;
    @NotNull
    private final Bitmap bitmap;
    @Nullable
    private final String value;

    public QrResult(@NotNull Bitmap bitmap, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.bitmap = bitmap;
        this.value = str;
    }

    public static /* synthetic */ QrResult copy$default(QrResult qrResult, Bitmap bitmap, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = qrResult.bitmap;
        }
        if ((i & 2) != 0) {
            str = qrResult.value;
        }
        return qrResult.copy(bitmap, str);
    }

    @NotNull
    public final Bitmap component1() {
        return this.bitmap;
    }

    @Nullable
    public final String component2() {
        return this.value;
    }

    @NotNull
    public final QrResult copy(@NotNull Bitmap bitmap, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new QrResult(bitmap, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QrResult) {
            QrResult qrResult = (QrResult) obj;
            return Intrinsics.areEqual(this.bitmap, qrResult.bitmap) && Intrinsics.areEqual(this.value, qrResult.value);
        }
        return false;
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.bitmap.hashCode() * 31;
        String str = this.value;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        Bitmap bitmap = this.bitmap;
        String str = this.value;
        return "QrResult(bitmap=" + bitmap + ", value=" + str + ")";
    }
}