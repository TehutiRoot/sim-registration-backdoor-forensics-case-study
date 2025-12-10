package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ConcurrentCamera {

    /* renamed from: a */
    public List f10867a;

    /* loaded from: classes.dex */
    public static final class SingleCameraConfig {

        /* renamed from: a */
        public CameraSelector f10868a;

        /* renamed from: b */
        public LifecycleOwner f10869b;

        /* renamed from: c */
        public UseCaseGroup f10870c;

        public SingleCameraConfig(@NonNull CameraSelector cameraSelector, @NonNull UseCaseGroup useCaseGroup, @NonNull LifecycleOwner lifecycleOwner) {
            this.f10868a = cameraSelector;
            this.f10870c = useCaseGroup;
            this.f10869b = lifecycleOwner;
        }

        @NonNull
        public CameraSelector getCameraSelector() {
            return this.f10868a;
        }

        @NonNull
        public LifecycleOwner getLifecycleOwner() {
            return this.f10869b;
        }

        @NonNull
        public UseCaseGroup getUseCaseGroup() {
            return this.f10870c;
        }
    }

    public ConcurrentCamera(@NonNull List<Camera> list) {
        this.f10867a = list;
    }

    @NonNull
    public List<Camera> getCameras() {
        return this.f10867a;
    }
}