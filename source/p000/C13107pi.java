package p000;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;

/* renamed from: pi */
/* loaded from: classes.dex */
public final /* synthetic */ class C13107pi implements CameraCharacteristicsProvider {

    /* renamed from: a */
    public final /* synthetic */ CameraCharacteristicsCompat f76663a;

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public final Object get(CameraCharacteristics.Key key) {
        return this.f76663a.get(key);
    }
}
