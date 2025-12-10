package androidx.camera.camera2.internal.concurrent;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.Identifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class Camera2CameraCoordinator implements CameraCoordinator {

    /* renamed from: a */
    public final CameraManagerCompat f10574a;

    /* renamed from: f */
    public int f10579f = 0;

    /* renamed from: c */
    public final Map f10576c = new HashMap();

    /* renamed from: e */
    public Set f10578e = new HashSet();

    /* renamed from: b */
    public final List f10575b = new ArrayList();

    /* renamed from: d */
    public List f10577d = new ArrayList();

    public Camera2CameraCoordinator(@NonNull CameraManagerCompat cameraManagerCompat) {
        this.f10574a = cameraManagerCompat;
        m63560d();
    }

    /* renamed from: a */
    public static /* synthetic */ List m63563a(String str, List list) {
        return m63561c(str, list);
    }

    /* renamed from: b */
    public static CameraSelector m63562b(CameraManagerCompat cameraManagerCompat, final String str) {
        CameraSelector.Builder addCameraFilter = new CameraSelector.Builder().addCameraFilter(new CameraFilter() { // from class: Vh
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                return Camera2CameraCoordinator.m63563a(str, list);
            }

            @Override // androidx.camera.core.CameraFilter
            public /* synthetic */ Identifier getIdentifier() {
                return AbstractC0822Lj.m67491a(this);
            }
        });
        try {
            addCameraFilter.requireLensFacing(((Integer) cameraManagerCompat.getCameraCharacteristicsCompat(str).get(CameraCharacteristics.LENS_FACING)).intValue());
            return addCameraFilter.build();
        } catch (CameraAccessExceptionCompat e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ List m63561c(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            if (str.equals(Camera2CameraInfo.from(cameraInfo).getCameraId())) {
                return Collections.singletonList(cameraInfo);
            }
        }
        throw new IllegalArgumentException("No camera can be find for id: " + str);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void addListener(@NonNull CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.f10575b.add(concurrentCameraModeListener);
    }

    /* renamed from: d */
    public final void m63560d() {
        try {
            this.f10578e = this.f10574a.getConcurrentCameraIds();
        } catch (CameraAccessExceptionCompat unused) {
            Logger.m63228e("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        for (Set set : this.f10578e) {
            ArrayList arrayList = new ArrayList(set);
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                if (!this.f10576c.containsKey(str)) {
                    this.f10576c.put(str, new ArrayList());
                }
                if (!this.f10576c.containsKey(str2)) {
                    this.f10576c.put(str2, new ArrayList());
                }
                ((List) this.f10576c.get(str)).add((String) arrayList.get(1));
                ((List) this.f10576c.get(str2)).add((String) arrayList.get(0));
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    @NonNull
    public List<CameraInfo> getActiveConcurrentCameraInfos() {
        return this.f10577d;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public int getCameraOperatingMode() {
        return this.f10579f;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    @NonNull
    public List<List<CameraSelector>> getConcurrentCameraSelectors() {
        ArrayList arrayList = new ArrayList();
        for (Set<String> set : this.f10578e) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : set) {
                arrayList2.add(m63562b(this.f10574a, str));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    @Nullable
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public String getPairedConcurrentCameraId(@NonNull String str) {
        if (!this.f10576c.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) this.f10576c.get(str)) {
            for (CameraInfo cameraInfo : this.f10577d) {
                if (str2.equals(Camera2CameraInfo.from(cameraInfo).getCameraId())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void removeListener(@NonNull CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.f10575b.remove(concurrentCameraModeListener);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setActiveConcurrentCameraInfos(@NonNull List<CameraInfo> list) {
        this.f10577d = new ArrayList(list);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setCameraOperatingMode(int i) {
        if (i != this.f10579f) {
            for (CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener : this.f10575b) {
                concurrentCameraModeListener.onCameraOperatingModeUpdated(this.f10579f, i);
            }
        }
        if (this.f10579f == 2 && i != 2) {
            this.f10577d.clear();
        }
        this.f10579f = i;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void shutdown() {
        this.f10575b.clear();
        this.f10576c.clear();
        this.f10577d.clear();
        this.f10578e.clear();
        this.f10579f = 0;
    }
}
