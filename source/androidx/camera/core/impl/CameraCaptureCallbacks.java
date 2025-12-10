package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CameraCaptureCallbacks {

    /* loaded from: classes.dex */
    public static final class ComboCameraCaptureCallback extends CameraCaptureCallback {

        /* renamed from: a */
        public final List f11089a = new ArrayList();

        public ComboCameraCaptureCallback(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
                if (!(cameraCaptureCallback instanceof C2500a)) {
                    this.f11089a.add(cameraCaptureCallback);
                }
            }
        }

        @NonNull
        public List<CameraCaptureCallback> getCallbacks() {
            return this.f11089a;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled() {
            for (CameraCaptureCallback cameraCaptureCallback : this.f11089a) {
                cameraCaptureCallback.onCaptureCancelled();
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureResult cameraCaptureResult) {
            for (CameraCaptureCallback cameraCaptureCallback : this.f11089a) {
                cameraCaptureCallback.onCaptureCompleted(cameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureFailure cameraCaptureFailure) {
            for (CameraCaptureCallback cameraCaptureCallback : this.f11089a) {
                cameraCaptureCallback.onCaptureFailed(cameraCaptureFailure);
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraCaptureCallbacks$a */
    /* loaded from: classes.dex */
    public static final class C2500a extends CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
        }
    }

    /* renamed from: a */
    public static CameraCaptureCallback m62971a(List list) {
        if (list.isEmpty()) {
            return createNoOpCallback();
        }
        if (list.size() == 1) {
            return (CameraCaptureCallback) list.get(0);
        }
        return new ComboCameraCaptureCallback(list);
    }

    @NonNull
    public static CameraCaptureCallback createComboCallback(@NonNull CameraCaptureCallback... cameraCaptureCallbackArr) {
        return m62971a(Arrays.asList(cameraCaptureCallbackArr));
    }

    @NonNull
    public static CameraCaptureCallback createNoOpCallback() {
        return new C2500a();
    }
}
