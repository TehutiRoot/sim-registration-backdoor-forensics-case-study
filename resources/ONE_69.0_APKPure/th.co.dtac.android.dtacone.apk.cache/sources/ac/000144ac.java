package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.camera.view.LifecycleCameraController;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$1$1 */
/* loaded from: classes10.dex */
public final class TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$1$1 extends Lambda implements Function1<Context, PreviewView> {
    final /* synthetic */ LifecycleCameraController $cameraController;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$1$1(LifecycleCameraController lifecycleCameraController, LifecycleOwner lifecycleOwner) {
        super(1);
        this.$cameraController = lifecycleCameraController;
        this.$lifecycleOwner = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final PreviewView invoke(@NotNull Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PreviewView previewView = new PreviewView(it);
        LifecycleCameraController lifecycleCameraController = this.$cameraController;
        LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        previewView.setController(lifecycleCameraController);
        previewView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        lifecycleCameraController.bindToLifecycle(lifecycleOwner);
        previewView.setScaleType(PreviewView.ScaleType.FILL_CENTER);
        return previewView;
    }
}