package p000;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.C2372g;

/* renamed from: vN1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22680vN1 extends C2372g {
    public C22680vN1(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // androidx.camera.camera2.internal.compat.C2372g, androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.InterfaceC2362a
    /* renamed from: a */
    public Size[] mo910a(int i) {
        return this.f10579a.getOutputSizes(i);
    }
}