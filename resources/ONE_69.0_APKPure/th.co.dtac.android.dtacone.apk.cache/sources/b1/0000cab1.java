package io.fotoapparat.result;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m29142d2 = {"Lio/fotoapparat/result/BitmapPhoto;", "", "bitmap", "Landroid/graphics/Bitmap;", "rotationDegrees", "", "(Landroid/graphics/Bitmap;I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class BitmapPhoto {
    @JvmField
    @NotNull
    public final Bitmap bitmap;
    @JvmField
    public final int rotationDegrees;

    public BitmapPhoto(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.bitmap = bitmap;
        this.rotationDegrees = i;
    }

    public static /* synthetic */ BitmapPhoto copy$default(BitmapPhoto bitmapPhoto, Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bitmap = bitmapPhoto.bitmap;
        }
        if ((i2 & 2) != 0) {
            i = bitmapPhoto.rotationDegrees;
        }
        return bitmapPhoto.copy(bitmap, i);
    }

    @NotNull
    public final Bitmap component1() {
        return this.bitmap;
    }

    public final int component2() {
        return this.rotationDegrees;
    }

    @NotNull
    public final BitmapPhoto copy(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new BitmapPhoto(bitmap, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BitmapPhoto) {
            BitmapPhoto bitmapPhoto = (BitmapPhoto) obj;
            return Intrinsics.areEqual(this.bitmap, bitmapPhoto.bitmap) && this.rotationDegrees == bitmapPhoto.rotationDegrees;
        }
        return false;
    }

    public int hashCode() {
        return (this.bitmap.hashCode() * 31) + this.rotationDegrees;
    }

    @NotNull
    public String toString() {
        Bitmap bitmap = this.bitmap;
        int i = this.rotationDegrees;
        return "BitmapPhoto(bitmap=" + bitmap + ", rotationDegrees=" + i + ")";
    }
}