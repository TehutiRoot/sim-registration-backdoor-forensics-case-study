package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CameraThreadConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class Camera2CameraFactory implements CameraFactory {

    /* renamed from: a */
    public final CameraCoordinator f10376a;

    /* renamed from: b */
    public final CameraThreadConfig f10377b;

    /* renamed from: c */
    public final CameraStateRegistry f10378c;

    /* renamed from: d */
    public final CameraManagerCompat f10379d;

    /* renamed from: e */
    public final List f10380e;

    /* renamed from: f */
    public final DisplayInfoManager f10381f;

    /* renamed from: g */
    public final Map f10382g = new HashMap();

    public Camera2CameraFactory(@NonNull Context context, @NonNull CameraThreadConfig cameraThreadConfig, @Nullable CameraSelector cameraSelector) throws InitializationException {
        this.f10377b = cameraThreadConfig;
        CameraManagerCompat from = CameraManagerCompat.from(context, cameraThreadConfig.getSchedulerHandler());
        this.f10379d = from;
        this.f10381f = DisplayInfoManager.getInstance(context);
        this.f10380e = m63868a(AbstractC10474ik.m30912b(this, cameraSelector));
        Camera2CameraCoordinator camera2CameraCoordinator = new Camera2CameraCoordinator(from);
        this.f10376a = camera2CameraCoordinator;
        CameraStateRegistry cameraStateRegistry = new CameraStateRegistry(camera2CameraCoordinator, 1);
        this.f10378c = cameraStateRegistry;
        camera2CameraCoordinator.addListener(cameraStateRegistry);
    }

    /* renamed from: a */
    public final List m63868a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.equals("0") && !str.equals("1")) {
                if (m63866c(str)) {
                    arrayList.add(str);
                } else {
                    Logger.m63178d("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public Camera2CameraInfoImpl m63867b(String str) {
        try {
            Camera2CameraInfoImpl camera2CameraInfoImpl = (Camera2CameraInfoImpl) this.f10382g.get(str);
            if (camera2CameraInfoImpl == null) {
                Camera2CameraInfoImpl camera2CameraInfoImpl2 = new Camera2CameraInfoImpl(str, this.f10379d);
                this.f10382g.put(str, camera2CameraInfoImpl2);
                return camera2CameraInfoImpl2;
            }
            return camera2CameraInfoImpl;
        } catch (CameraAccessExceptionCompat e) {
            throw CameraUnavailableExceptionHelper.createFrom(e);
        }
    }

    /* renamed from: c */
    public final boolean m63866c(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f10379d.getCameraCharacteristicsCompat(str).get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(CameraUnavailableExceptionHelper.createFrom(e));
        }
    }

    @Override // androidx.camera.core.impl.CameraFactory
    @NonNull
    public Set<String> getAvailableCameraIds() {
        return new LinkedHashSet(this.f10380e);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    @NonNull
    public CameraInternal getCamera(@NonNull String str) throws CameraUnavailableException {
        if (this.f10380e.contains(str)) {
            return new Camera2CameraImpl(this.f10379d, str, m63867b(str), this.f10376a, this.f10378c, this.f10377b.getCameraExecutor(), this.f10377b.getSchedulerHandler(), this.f10381f);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // androidx.camera.core.impl.CameraFactory
    @NonNull
    public CameraCoordinator getCameraCoordinator() {
        return this.f10376a;
    }

    @Override // androidx.camera.core.impl.CameraFactory
    @NonNull
    public CameraManagerCompat getCameraManager() {
        return this.f10379d;
    }
}