package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import android.media.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraHandler;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.CameraFaceDetectFragmentBase$takePicture$1 */
/* loaded from: classes9.dex */
public final class CameraFaceDetectFragmentBase$takePicture$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CameraFaceDetectFragmentBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraFaceDetectFragmentBase$takePicture$1(CameraFaceDetectFragmentBase cameraFaceDetectFragmentBase) {
        super(0);
        this.this$0 = cameraFaceDetectFragmentBase;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        CameraHandler cameraHandler;
        MediaPlayer mediaPlayer3;
        this.this$0.visibleView(false);
        mediaPlayer = this.this$0.f104839q;
        if (mediaPlayer.isPlaying()) {
            mediaPlayer3 = this.this$0.f104839q;
            mediaPlayer3.stop();
        }
        mediaPlayer2 = this.this$0.f104839q;
        mediaPlayer2.start();
        cameraHandler = this.this$0.f104837o;
        if (cameraHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraHandler");
            cameraHandler = null;
        }
        cameraHandler.takePicture(this.this$0.processImage());
    }
}