package io.fotoapparat.hardware.orientation;

import io.fotoapparat.hardware.orientation.Orientation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000*\n\u0010\u0003\"\u00020\u00012\u00020\u0001*\n\u0010\u0004\"\u00020\u00012\u00020\u0001¨\u0006\u0005"}, m28850d2 = {"toOrientation", "Lio/fotoapparat/hardware/orientation/Orientation;", "", "DeviceOrientation", "ScreenOrientation", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class OrientationKt {
    @NotNull
    public static final Orientation toOrientation(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        if (i != 360) {
                            throw new IllegalArgumentException("Cannot convert " + i + " to absolute Orientation.");
                        }
                    } else {
                        return Orientation.Horizontal.ReverseLandscape.INSTANCE;
                    }
                } else {
                    return Orientation.Vertical.ReversePortrait.INSTANCE;
                }
            } else {
                return Orientation.Horizontal.Landscape.INSTANCE;
            }
        }
        return Orientation.Vertical.Portrait.INSTANCE;
    }
}
