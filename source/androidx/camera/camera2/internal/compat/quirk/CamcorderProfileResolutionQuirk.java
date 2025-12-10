package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.quirk.ProfileResolutionQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements ProfileResolutionQuirk {

    /* renamed from: a */
    public final StreamConfigurationMapCompat f10522a;

    /* renamed from: b */
    public List f10523b = null;

    public CamcorderProfileResolutionQuirk(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f10522a = cameraCharacteristicsCompat.getStreamConfigurationMapCompat();
    }

    /* renamed from: a */
    public static boolean m63640a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.quirk.ProfileResolutionQuirk
    @NonNull
    public List<Size> getSupportedResolutions() {
        List emptyList;
        if (this.f10523b == null) {
            Size[] outputSizes = this.f10522a.getOutputSizes(34);
            if (outputSizes != null) {
                emptyList = Arrays.asList((Size[]) outputSizes.clone());
            } else {
                emptyList = Collections.emptyList();
            }
            this.f10523b = emptyList;
            Logger.m63230d("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f10523b);
        }
        return new ArrayList(this.f10523b);
    }
}
