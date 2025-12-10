package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements Quirk {

    /* renamed from: a */
    public final Range f10521a;

    public AeFpsRangeLegacyQuirk(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f10521a = m63643c((Range[]) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: b */
    public static boolean m63644b(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Range m63645a(Range range) {
        int intValue = ((Integer) range.getUpper()).intValue();
        int intValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            intValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            intValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    /* renamed from: c */
    public final Range m63643c(Range[] rangeArr) {
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range m63645a = m63645a(range2);
                if (((Integer) m63645a.getUpper()).intValue() == 30 && (range == null || ((Integer) m63645a.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = m63645a;
                }
            }
        }
        return range;
    }

    @Nullable
    public Range<Integer> getRange() {
        return this.f10521a;
    }
}
