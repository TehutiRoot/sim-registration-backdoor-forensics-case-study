package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import android.app.Dialog;
import android.graphics.Bitmap;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", ResponseProcessor.CONTENT_TYPE_IMAGE, "Landroid/graphics/Bitmap;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.CameraFaceDetectFragmentBase$faceNotFoundCount$1 */
/* loaded from: classes9.dex */
public final class CameraFaceDetectFragmentBase$faceNotFoundCount$1 extends Lambda implements Function1<Bitmap, Unit> {
    final /* synthetic */ CameraFaceDetectFragmentBase this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.CameraFaceDetectFragmentBase$faceNotFoundCount$1$1 */
    /* loaded from: classes9.dex */
    public static final class C164391 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Bitmap $image;
        final /* synthetic */ CameraFaceDetectFragmentBase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C164391(CameraFaceDetectFragmentBase cameraFaceDetectFragmentBase, Bitmap bitmap) {
            super(0);
            this.this$0 = cameraFaceDetectFragmentBase;
            this.$image = bitmap;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.takePhotoAfter(this.$image);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraFaceDetectFragmentBase$faceNotFoundCount$1(CameraFaceDetectFragmentBase cameraFaceDetectFragmentBase) {
        super(1);
        this.this$0 = cameraFaceDetectFragmentBase;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Bitmap image) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(image, "image");
        CameraFaceDetectFragmentBase$faceNotFoundCount$1$handelFail$1 cameraFaceDetectFragmentBase$faceNotFoundCount$1$handelFail$1 = new CameraFaceDetectFragmentBase$faceNotFoundCount$1$handelFail$1(this.this$0);
        CameraFaceDetectFragmentBase cameraFaceDetectFragmentBase = this.this$0;
        i = cameraFaceDetectFragmentBase.f104843u;
        cameraFaceDetectFragmentBase.f104843u = i + 1;
        i2 = this.this$0.f104843u;
        i3 = this.this$0.f104842t;
        if (i2 < i3) {
            this.this$0.showWarningNoFace();
            cameraFaceDetectFragmentBase$faceNotFoundCount$1$handelFail$1.invoke();
            return;
        }
        CameraFaceDetectFragmentBase cameraFaceDetectFragmentBase2 = this.this$0;
        Dialog createDialogConfirmUsedPhoto = cameraFaceDetectFragmentBase2.createDialogConfirmUsedPhoto(cameraFaceDetectFragmentBase$faceNotFoundCount$1$handelFail$1, new C164391(cameraFaceDetectFragmentBase2, image));
        if (createDialogConfirmUsedPhoto != null) {
            createDialogConfirmUsedPhoto.show();
        }
    }
}