package io.fotoapparat.hardware.orientation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\t"}, m28850d2 = {"computeDisplayOrientation", "Lio/fotoapparat/hardware/orientation/Orientation;", "screenOrientation", "cameraOrientation", "cameraIsMirrored", "", "computeImageOrientation", "deviceOrientation", "computePreviewOrientation", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class OrientationResolverKt {
    @NotNull
    public static final Orientation computeDisplayOrientation(@NotNull Orientation screenOrientation, @NotNull Orientation cameraOrientation, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(screenOrientation, "screenOrientation");
        Intrinsics.checkNotNullParameter(cameraOrientation, "cameraOrientation");
        int degrees = screenOrientation.getDegrees();
        int degrees2 = cameraOrientation.getDegrees();
        if (z) {
            i = (360 - ((degrees2 + degrees) % 360)) % 360;
        } else {
            i = ((degrees2 - degrees) + 360) % 360;
        }
        return OrientationKt.toOrientation(i);
    }

    @NotNull
    public static final Orientation computeImageOrientation(@NotNull Orientation deviceOrientation, @NotNull Orientation cameraOrientation, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(deviceOrientation, "deviceOrientation");
        Intrinsics.checkNotNullParameter(cameraOrientation, "cameraOrientation");
        int degrees = deviceOrientation.getDegrees();
        int degrees2 = cameraOrientation.getDegrees();
        if (z) {
            i = ((degrees2 - degrees) + 360) % 360;
        } else {
            i = (degrees2 + degrees) % 360;
        }
        return OrientationKt.toOrientation(360 - i);
    }

    @NotNull
    public static final Orientation computePreviewOrientation(@NotNull Orientation screenOrientation, @NotNull Orientation cameraOrientation, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(screenOrientation, "screenOrientation");
        Intrinsics.checkNotNullParameter(cameraOrientation, "cameraOrientation");
        if (z) {
            i = -1;
        } else {
            i = 1;
        }
        return OrientationKt.toOrientation((((i * screenOrientation.getDegrees()) + 720) - cameraOrientation.getDegrees()) % 360);
    }
}
