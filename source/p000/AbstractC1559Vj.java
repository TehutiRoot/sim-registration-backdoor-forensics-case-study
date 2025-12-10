package p000;

import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.LensFacingCameraFilter;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: Vj */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1559Vj {
    /* renamed from: a */
    public static CameraSelector m65742a(final CameraInfoInternal cameraInfoInternal) {
        return new CameraSelector.Builder().addCameraFilter(new CameraFilter() { // from class: Uj
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                return AbstractC1559Vj.m65740c(CameraInfoInternal.this, list);
            }

            @Override // androidx.camera.core.CameraFilter
            public /* synthetic */ Identifier getIdentifier() {
                return AbstractC0822Lj.m67491a(this);
            }
        }).addCameraFilter(new LensFacingCameraFilter(cameraInfoInternal.getLensFacing())).build();
    }

    /* renamed from: c */
    public static /* synthetic */ List m65740c(CameraInfoInternal cameraInfoInternal, List list) {
        String cameraId = cameraInfoInternal.getCameraId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            Preconditions.checkArgument(cameraInfo instanceof CameraInfoInternal);
            if (((CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                return Collections.singletonList(cameraInfo);
            }
        }
        throw new IllegalStateException("Unable to find camera with id " + cameraId + " from list of available cameras.");
    }

    /* renamed from: b */
    public static CameraInfoInternal m65741b(CameraInfoInternal cameraInfoInternal) {
        return cameraInfoInternal;
    }
}
