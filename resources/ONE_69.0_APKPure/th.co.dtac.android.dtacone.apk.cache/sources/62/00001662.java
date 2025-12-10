package p000;

import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Identifier;
import androidx.camera.extensions.internal.VendorExtender;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: XT */
/* loaded from: classes.dex */
public final class C1669XT implements CameraFilter {

    /* renamed from: a */
    public final Identifier f7561a;

    /* renamed from: b */
    public final VendorExtender f7562b;

    public C1669XT(String str, VendorExtender vendorExtender) {
        this.f7561a = Identifier.create(str);
        this.f7562b = vendorExtender;
    }

    @Override // androidx.camera.core.CameraFilter
    public List filter(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            Preconditions.checkArgument(cameraInfo instanceof CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            if (this.f7562b.isExtensionAvailable(Camera2CameraInfo.from(cameraInfo).getCameraId(), Camera2CameraInfo.from(cameraInfo).getCameraCharacteristicsMap())) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.core.CameraFilter
    public Identifier getIdentifier() {
        return this.f7561a;
    }
}