package p000;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Bl */
/* loaded from: classes.dex */
public abstract class AbstractC0129Bl {
    /* renamed from: a */
    public static CameraCaptureSession.CaptureCallback m68879a(CameraCaptureCallback cameraCaptureCallback) {
        if (cameraCaptureCallback == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m68878b(cameraCaptureCallback, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return Camera2CaptureCallbacks.m63812a(arrayList);
    }

    /* renamed from: b */
    public static void m68878b(CameraCaptureCallback cameraCaptureCallback, List list) {
        if (cameraCaptureCallback instanceof CameraCaptureCallbacks.ComboCameraCaptureCallback) {
            for (CameraCaptureCallback cameraCaptureCallback2 : ((CameraCaptureCallbacks.ComboCameraCaptureCallback) cameraCaptureCallback).getCallbacks()) {
                m68878b(cameraCaptureCallback2, list);
            }
        } else if (cameraCaptureCallback instanceof C0052Al) {
            list.add(((C0052Al) cameraCaptureCallback).m69051b());
        } else {
            list.add(new C17215zl(cameraCaptureCallback));
        }
    }
}
