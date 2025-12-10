package p000;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Bl */
/* loaded from: classes.dex */
public abstract class AbstractC0123Bl {
    /* renamed from: a */
    public static CameraCaptureSession.CaptureCallback m69084a(CameraCaptureCallback cameraCaptureCallback) {
        if (cameraCaptureCallback == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m69083b(cameraCaptureCallback, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return Camera2CaptureCallbacks.m63763a(arrayList);
    }

    /* renamed from: b */
    public static void m69083b(CameraCaptureCallback cameraCaptureCallback, List list) {
        if (cameraCaptureCallback instanceof CameraCaptureCallbacks.ComboCameraCaptureCallback) {
            for (CameraCaptureCallback cameraCaptureCallback2 : ((CameraCaptureCallbacks.ComboCameraCaptureCallback) cameraCaptureCallback).getCallbacks()) {
                m69083b(cameraCaptureCallback2, list);
            }
        } else if (cameraCaptureCallback instanceof C0054Al) {
            list.add(((C0054Al) cameraCaptureCallback).m69194b());
        } else {
            list.add(new C17240zl(cameraCaptureCallback));
        }
    }
}