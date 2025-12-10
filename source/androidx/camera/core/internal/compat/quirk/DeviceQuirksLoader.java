package androidx.camera.core.internal.compat.quirk;

import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class DeviceQuirksLoader {
    /* renamed from: a */
    public static List m62793a() {
        ArrayList arrayList = new ArrayList();
        if (ImageCaptureRotationOptionQuirk.m62788e()) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (SurfaceOrderQuirk.m62781a()) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (CaptureFailedRetryQuirk.m62794a()) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (LowMemoryQuirk.m62782a()) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (LargeJpegImageQuirk.m62783a()) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (IncorrectJpegMetadataQuirk.m62784d()) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        return arrayList;
    }
}
