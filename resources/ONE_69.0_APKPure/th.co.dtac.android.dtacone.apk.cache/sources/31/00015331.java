package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Observer;
import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.take_photo.CameraPreviewState;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.CameraViewFragment$onViewCreated$2$2;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.CameraViewFragment$onViewCreated$2$2 */
/* loaded from: classes9.dex */
public final class CameraViewFragment$onViewCreated$2$2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ CameraViewFragment f104864a;

    public CameraViewFragment$onViewCreated$2$2(CameraViewFragment cameraViewFragment) {
        this.f104864a = cameraViewFragment;
    }

    /* renamed from: d */
    public static final void m3552d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final void m3551e(CameraViewFragment this$0) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        frameLayout = this$0.f104847B;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("disableCameraFrame");
            frameLayout = null;
        }
        ViewVisibleExtKt.toGone(frameLayout);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: c */
    public final void onChanged(CameraPreviewState cameraPreviewState) {
        ImageView imageView;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        ImageView imageView2;
        this.f104864a.resetFaceDetectorAttemptCount();
        ImageView imageView3 = null;
        if (Intrinsics.areEqual(cameraPreviewState, CameraPreviewState.Capture.INSTANCE)) {
            frameLayout2 = this.f104864a.f104847B;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("disableCameraFrame");
                frameLayout2 = null;
            }
            ViewVisibleExtKt.toGone(frameLayout2);
            imageView2 = this.f104864a.f104848C;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("capture");
            } else {
                imageView3 = imageView2;
            }
            imageView3.setEnabled(true);
        } else if (Intrinsics.areEqual(cameraPreviewState, CameraPreviewState.Idle.INSTANCE)) {
            frameLayout = this.f104864a.f104847B;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("disableCameraFrame");
            } else {
                imageView3 = frameLayout;
            }
            ViewVisibleExtKt.toVisible(imageView3);
        } else {
            Completable timer = Completable.timer(500L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread());
            final CameraViewFragment$onViewCreated$2$2$onChanged$1 cameraViewFragment$onViewCreated$2$2$onChanged$1 = new CameraViewFragment$onViewCreated$2$2$onChanged$1(this.f104864a);
            Completable doOnSubscribe = timer.doOnSubscribe(new Consumer() { // from class: qk
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CameraViewFragment$onViewCreated$2$2.m3552d(cameraViewFragment$onViewCreated$2$2$onChanged$1, obj);
                }
            });
            final CameraViewFragment cameraViewFragment = this.f104864a;
            doOnSubscribe.subscribe(new Action() { // from class: rk
                @Override // io.reactivex.functions.Action
                public final void run() {
                    CameraViewFragment$onViewCreated$2$2.m3551e(cameraViewFragment);
                }
            });
            imageView = this.f104864a.f104848C;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("capture");
            } else {
                imageView3 = imageView;
            }
            imageView3.setEnabled(false);
        }
    }
}