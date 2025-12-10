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
    public final StreamConfigurationMapCompat f10610a;

    /* renamed from: b */
    public List f10611b = null;

    public CamcorderProfileResolutionQuirk(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f10610a = cameraCharacteristicsCompat.getStreamConfigurationMapCompat();
    }

    /* renamed from: a */
    public static boolean m63591a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
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
        if (this.f10611b == null) {
            Size[] outputSizes = this.f10610a.getOutputSizes(34);
            if (outputSizes != null) {
                emptyList = Arrays.asList((Size[]) outputSizes.clone());
            } else {
                emptyList = Collections.emptyList();
            }
            this.f10611b = emptyList;
            Logger.m63178d("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f10611b);
        }
        return new ArrayList(this.f10611b);
    }
}