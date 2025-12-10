package io.fotoapparat.hardware.orientation;

import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000*\n\u0010\u0002\"\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m29142d2 = {"toClosestRightAngle", "", "DeviceRotationDegrees", "fotoapparat_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class RotationKt {
    public static final int toClosestRightAngle(int i) {
        int i2;
        if (i % 90 > 45) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return (((i / 90) + i2) * 90) % 360;
    }
}