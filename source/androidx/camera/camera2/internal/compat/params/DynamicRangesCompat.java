package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class DynamicRangesCompat {

    /* renamed from: a */
    public final InterfaceC2392a f10494a;

    /* renamed from: androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2392a {
        /* renamed from: a */
        Set mo63651a(DynamicRange dynamicRange);

        /* renamed from: b */
        boolean mo63650b(DynamicRange dynamicRange);

        Set getSupportedDynamicRanges();

        DynamicRangeProfiles unwrap();
    }

    public DynamicRangesCompat(InterfaceC2392a interfaceC2392a) {
        this.f10494a = interfaceC2392a;
    }

    @NonNull
    public static DynamicRangesCompat fromCameraCharacteristics(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        DynamicRangesCompat dynamicRangesCompat;
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            dynamicRangesCompat = toDynamicRangesCompat(AbstractC0315EL.m68508a(cameraCharacteristicsCompat.get(key)));
        } else {
            dynamicRangesCompat = null;
        }
        if (dynamicRangesCompat == null) {
            return C2402b.f10511a;
        }
        return dynamicRangesCompat;
    }

    @Nullable
    @RequiresApi(33)
    public static DynamicRangesCompat toDynamicRangesCompat(@Nullable DynamicRangeProfiles dynamicRangeProfiles) {
        boolean z;
        if (dynamicRangeProfiles == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new DynamicRangesCompat(new C2401a(dynamicRangeProfiles));
    }

    @NonNull
    public Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(@NonNull DynamicRange dynamicRange) {
        return this.f10494a.mo63651a(dynamicRange);
    }

    @NonNull
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return this.f10494a.getSupportedDynamicRanges();
    }

    public boolean isExtraLatencyPresent(@NonNull DynamicRange dynamicRange) {
        return this.f10494a.mo63650b(dynamicRange);
    }

    @Nullable
    @RequiresApi(33)
    public DynamicRangeProfiles toDynamicRangeProfiles() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 33) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f10494a.unwrap();
    }
}
