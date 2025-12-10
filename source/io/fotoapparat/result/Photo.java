package io.fotoapparat.result;

import android.graphics.BitmapFactory;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r¨\u0006\""}, m28850d2 = {"Lio/fotoapparat/result/Photo;", "", "", "encodedImage", "", "rotationDegrees", "<init>", "([BI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "component1", "()[B", "component2", "copy", "([BI)Lio/fotoapparat/result/Photo;", "[B", "I", "Landroid/graphics/BitmapFactory$Options;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/Lazy;", "()Landroid/graphics/BitmapFactory$Options;", "decodedBounds", "getHeight", "height", "getWidth", "width", "Companion", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class Photo {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Lazy f63039a;
    @JvmField
    @NotNull
    public final byte[] encodedImage;
    @JvmField
    public final int rotationDegrees;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005¨\u0006\u0006"}, m28850d2 = {"Lio/fotoapparat/result/Photo$Companion;", "", "()V", "empty", "Lio/fotoapparat/result/Photo;", "empty$fotoapparat_release", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Photo empty$fotoapparat_release() {
            return new Photo(new byte[0], 0);
        }

        public Companion() {
        }
    }

    public Photo(@NotNull byte[] encodedImage, int i) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        this.encodedImage = encodedImage;
        this.rotationDegrees = i;
        this.f63039a = LazyKt__LazyJVMKt.lazy(new Photo$decodedBounds$2(this));
    }

    public static /* synthetic */ Photo copy$default(Photo photo, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr = photo.encodedImage;
        }
        if ((i2 & 2) != 0) {
            i = photo.rotationDegrees;
        }
        return photo.copy(bArr, i);
    }

    /* renamed from: a */
    public final BitmapFactory.Options m30485a() {
        return (BitmapFactory.Options) this.f63039a.getValue();
    }

    @NotNull
    public final byte[] component1() {
        return this.encodedImage;
    }

    public final int component2() {
        return this.rotationDegrees;
    }

    @NotNull
    public final Photo copy(@NotNull byte[] encodedImage, int i) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        return new Photo(encodedImage, i);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(Photo.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.fotoapparat.result.Photo");
        Photo photo = (Photo) obj;
        if (Arrays.equals(this.encodedImage, photo.encodedImage) && this.rotationDegrees == photo.rotationDegrees) {
            return true;
        }
        return false;
    }

    public final int getHeight() {
        return m30485a().outHeight;
    }

    public final int getWidth() {
        return m30485a().outWidth;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.encodedImage) * 31) + this.rotationDegrees;
    }

    @NotNull
    public String toString() {
        int length = this.encodedImage.length;
        int i = this.rotationDegrees;
        return "Photo(encodedImage=ByteArray(" + length + ") rotationDegrees=" + i + ")";
    }
}
