package p000;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.C2390g;

/* renamed from: yM1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23126yM1 extends C2390g {
    public C23126yM1(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // androidx.camera.camera2.internal.compat.C2390g, androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.InterfaceC2380a
    /* renamed from: a */
    public Size[] mo278a(int i) {
        return this.f10491a.getOutputSizes(i);
    }
}
