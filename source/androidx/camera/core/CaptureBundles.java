package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class CaptureBundles {

    /* renamed from: androidx.camera.core.CaptureBundles$a */
    /* loaded from: classes.dex */
    public static final class C2446a implements CaptureBundle {

        /* renamed from: a */
        public final List f10778a;

        public C2446a(List list) {
            if (list != null && !list.isEmpty()) {
                this.f10778a = Collections.unmodifiableList(new ArrayList(list));
                return;
            }
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }

        @Override // androidx.camera.core.impl.CaptureBundle
        public List getCaptureStages() {
            return this.f10778a;
        }
    }

    /* renamed from: a */
    public static CaptureBundle m63283a(CaptureStage... captureStageArr) {
        return new C2446a(Arrays.asList(captureStageArr));
    }

    @NonNull
    public static CaptureBundle singleDefaultCaptureBundle() {
        return m63283a(new CaptureStage.DefaultCaptureStage());
    }
}
