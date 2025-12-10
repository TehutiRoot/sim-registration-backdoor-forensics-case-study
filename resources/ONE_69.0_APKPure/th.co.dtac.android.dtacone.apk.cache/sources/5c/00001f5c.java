package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ExtendedCameraConfigProviderStore {

    /* renamed from: a */
    public static final Object f11234a = new Object();

    /* renamed from: b */
    public static final Map f11235b = new HashMap();

    public static void addConfig(@NonNull Object obj, @NonNull CameraConfigProvider cameraConfigProvider) {
        synchronized (f11234a) {
            f11235b.put(obj, cameraConfigProvider);
        }
    }

    public static void clear() {
        synchronized (f11234a) {
            f11235b.clear();
        }
    }

    @NonNull
    public static CameraConfigProvider getConfigProvider(@NonNull Object obj) {
        CameraConfigProvider cameraConfigProvider;
        synchronized (f11234a) {
            cameraConfigProvider = (CameraConfigProvider) f11235b.get(obj);
        }
        if (cameraConfigProvider == null) {
            return CameraConfigProvider.EMPTY;
        }
        return cameraConfigProvider;
    }
}