package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ConcurrentCamera {

    /* renamed from: a */
    public List f10779a;

    /* loaded from: classes.dex */
    public static final class SingleCameraConfig {

        /* renamed from: a */
        public CameraSelector f10780a;

        /* renamed from: b */
        public LifecycleOwner f10781b;

        /* renamed from: c */
        public UseCaseGroup f10782c;

        public SingleCameraConfig(@NonNull CameraSelector cameraSelector, @NonNull UseCaseGroup useCaseGroup, @NonNull LifecycleOwner lifecycleOwner) {
            this.f10780a = cameraSelector;
            this.f10782c = useCaseGroup;
            this.f10781b = lifecycleOwner;
        }

        @NonNull
        public CameraSelector getCameraSelector() {
            return this.f10780a;
        }

        @NonNull
        public LifecycleOwner getLifecycleOwner() {
            return this.f10781b;
        }

        @NonNull
        public UseCaseGroup getUseCaseGroup() {
            return this.f10782c;
        }
    }

    public ConcurrentCamera(@NonNull List<Camera> list) {
        this.f10779a = list;
    }

    @NonNull
    public List<Camera> getCameras() {
        return this.f10779a;
    }
}
