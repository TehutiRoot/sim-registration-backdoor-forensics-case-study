package io.fotoapparat.characteristic;

import android.hardware.Camera;
import io.fotoapparat.characteristic.LensPosition;
import io.fotoapparat.exception.camera.CameraException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28850d2 = {"", "Lio/fotoapparat/characteristic/LensPosition;", "toLensPosition", "(I)Lio/fotoapparat/characteristic/LensPosition;", "toCameraId", "(Lio/fotoapparat/characteristic/LensPosition;)I", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class LensPositionCharacteristicKt {
    public static final int toCameraId(@NotNull LensPosition lensPosition) {
        Integer num;
        Intrinsics.checkNotNullParameter(lensPosition, "<this>");
        Iterator<Integer> it = AbstractC11719c.until(0, Camera.getNumberOfCameras()).iterator();
        while (true) {
            if (it.hasNext()) {
                num = it.next();
                if (Intrinsics.areEqual(lensPosition, CameraInfoProviderKt.getCharacteristics(num.intValue()).getLensPosition())) {
                    break;
                }
            } else {
                num = null;
                break;
            }
        }
        Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        throw new CameraException("Device has no camera for the desired lens position(s).", null, 2, null);
    }

    @NotNull
    public static final LensPosition toLensPosition(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return LensPosition.External.INSTANCE;
                }
                throw new IllegalArgumentException("Lens position " + i + " is not supported.");
            }
            return LensPosition.Front.INSTANCE;
        }
        return LensPosition.Back.INSTANCE;
    }
}
