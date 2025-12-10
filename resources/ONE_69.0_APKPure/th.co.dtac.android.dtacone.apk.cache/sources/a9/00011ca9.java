package th.p047co.dtac.android.dtacone.model.bitmap;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/bitmap/ComposeBitmap;", "", "bitmapIdCard", "", "bitmapCompare", "([B[B)V", "getBitmapCompare", "()[B", "getBitmapIdCard", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.bitmap.ComposeBitmap */
/* loaded from: classes8.dex */
public final class ComposeBitmap {
    public static final int $stable = 8;
    @NotNull
    private final byte[] bitmapCompare;
    @NotNull
    private final byte[] bitmapIdCard;

    public ComposeBitmap(@NotNull byte[] bitmapIdCard, @NotNull byte[] bitmapCompare) {
        Intrinsics.checkNotNullParameter(bitmapIdCard, "bitmapIdCard");
        Intrinsics.checkNotNullParameter(bitmapCompare, "bitmapCompare");
        this.bitmapIdCard = bitmapIdCard;
        this.bitmapCompare = bitmapCompare;
    }

    @NotNull
    public final byte[] getBitmapCompare() {
        return this.bitmapCompare;
    }

    @NotNull
    public final byte[] getBitmapIdCard() {
        return this.bitmapIdCard;
    }
}