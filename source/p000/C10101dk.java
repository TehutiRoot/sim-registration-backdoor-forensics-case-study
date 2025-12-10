package p000;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* renamed from: dk */
/* loaded from: classes.dex */
public class C10101dk extends C5506ck {
    public C10101dk(Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.C2388f, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public Set getConcurrentCameraIds() {
        try {
            return this.f10487a.getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
