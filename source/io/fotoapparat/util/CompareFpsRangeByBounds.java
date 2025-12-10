package io.fotoapparat.util;

import io.fotoapparat.parameter.FpsRange;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28850d2 = {"Lio/fotoapparat/util/CompareFpsRangeByBounds;", "Ljava/util/Comparator;", "Lio/fotoapparat/parameter/FpsRange;", "()V", "compare", "", "fpsRange1", "fpsRange2", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class CompareFpsRangeByBounds implements Comparator<FpsRange> {
    @NotNull
    public static final CompareFpsRangeByBounds INSTANCE = new CompareFpsRangeByBounds();

    @Override // java.util.Comparator
    public int compare(@NotNull FpsRange fpsRange1, @NotNull FpsRange fpsRange2) {
        Intrinsics.checkNotNullParameter(fpsRange1, "fpsRange1");
        Intrinsics.checkNotNullParameter(fpsRange2, "fpsRange2");
        int compare = Intrinsics.compare(fpsRange1.getMin(), fpsRange2.getMin());
        return compare == 0 ? Intrinsics.compare(fpsRange1.getMax(), fpsRange2.getMax()) : compare;
    }
}
