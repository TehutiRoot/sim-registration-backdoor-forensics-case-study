package io.fotoapparat.parameter.camera.convert;

import io.fotoapparat.parameter.FpsRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m29142d2 = {"toFpsRange", "Lio/fotoapparat/parameter/FpsRange;", "", "fotoapparat_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class FpsRangeConverterKt {
    @NotNull
    public static final FpsRange toFpsRange(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new FpsRange(iArr[0], iArr[1]);
    }
}