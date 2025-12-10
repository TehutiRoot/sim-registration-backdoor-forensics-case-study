package coil.util;

import coil.decode.ExifOrientationPolicy;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m28850d2 = {"Lcoil/util/ImageLoaderOptions;", "", "", "addLastModifiedToFileCacheKey", "networkObserverEnabled", "respectCacheHeaders", "", "bitmapFactoryMaxParallelism", "Lcoil/decode/ExifOrientationPolicy;", "bitmapFactoryExifOrientationPolicy", "<init>", "(ZZZILcoil/decode/ExifOrientationPolicy;)V", "copy", "(ZZZILcoil/decode/ExifOrientationPolicy;)Lcoil/util/ImageLoaderOptions;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getAddLastModifiedToFileCacheKey", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getNetworkObserverEnabled", OperatorName.CURVE_TO, "getRespectCacheHeaders", "d", "I", "getBitmapFactoryMaxParallelism", "()I", "e", "Lcoil/decode/ExifOrientationPolicy;", "getBitmapFactoryExifOrientationPolicy", "()Lcoil/decode/ExifOrientationPolicy;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ImageLoaderOptions {

    /* renamed from: a */
    public final boolean f40863a;

    /* renamed from: b */
    public final boolean f40864b;

    /* renamed from: c */
    public final boolean f40865c;

    /* renamed from: d */
    public final int f40866d;

    /* renamed from: e */
    public final ExifOrientationPolicy f40867e;

    public ImageLoaderOptions() {
        this(false, false, false, 0, null, 31, null);
    }

    public static /* synthetic */ ImageLoaderOptions copy$default(ImageLoaderOptions imageLoaderOptions, boolean z, boolean z2, boolean z3, int i, ExifOrientationPolicy exifOrientationPolicy, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = imageLoaderOptions.f40863a;
        }
        if ((i2 & 2) != 0) {
            z2 = imageLoaderOptions.f40864b;
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            z3 = imageLoaderOptions.f40865c;
        }
        boolean z5 = z3;
        if ((i2 & 8) != 0) {
            i = imageLoaderOptions.f40866d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            exifOrientationPolicy = imageLoaderOptions.f40867e;
        }
        return imageLoaderOptions.copy(z, z4, z5, i3, exifOrientationPolicy);
    }

    @NotNull
    public final ImageLoaderOptions copy(boolean z, boolean z2, boolean z3, int i, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
        return new ImageLoaderOptions(z, z2, z3, i, exifOrientationPolicy);
    }

    public final boolean getAddLastModifiedToFileCacheKey() {
        return this.f40863a;
    }

    @NotNull
    public final ExifOrientationPolicy getBitmapFactoryExifOrientationPolicy() {
        return this.f40867e;
    }

    public final int getBitmapFactoryMaxParallelism() {
        return this.f40866d;
    }

    public final boolean getNetworkObserverEnabled() {
        return this.f40864b;
    }

    public final boolean getRespectCacheHeaders() {
        return this.f40865c;
    }

    public ImageLoaderOptions(boolean z, boolean z2, boolean z3, int i, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
        this.f40863a = z;
        this.f40864b = z2;
        this.f40865c = z3;
        this.f40866d = i;
        this.f40867e = exifOrientationPolicy;
    }

    public /* synthetic */ ImageLoaderOptions(boolean z, boolean z2, boolean z3, int i, ExifOrientationPolicy exifOrientationPolicy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) == 0 ? z3 : true, (i2 & 8) != 0 ? 4 : i, (i2 & 16) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
    }
}
