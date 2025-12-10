package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CaptureConfig;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface CaptureStage {

    /* loaded from: classes.dex */
    public static final class DefaultCaptureStage implements CaptureStage {

        /* renamed from: a */
        public final CaptureConfig f11125a = new CaptureConfig.Builder().build();

        @Override // androidx.camera.core.impl.CaptureStage
        @NonNull
        public CaptureConfig getCaptureConfig() {
            return this.f11125a;
        }

        @Override // androidx.camera.core.impl.CaptureStage
        public int getId() {
            return 0;
        }
    }

    @NonNull
    CaptureConfig getCaptureConfig();

    int getId();
}
