package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import android.graphics.Bitmap;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import io.fotoapparat.result.BitmapPhoto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.extension.BitMapExtenKt;
import th.p047co.dtac.android.dtacone.viewmodel.take_photo.TakePhotoViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "photo", "Lio/fotoapparat/result/BitmapPhoto;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.CameraViewFragment$processImage$1 */
/* loaded from: classes9.dex */
public final class CameraViewFragment$processImage$1 extends Lambda implements Function1<BitmapPhoto, Unit> {
    final /* synthetic */ CameraViewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraViewFragment$processImage$1(CameraViewFragment cameraViewFragment) {
        super(1);
        this.this$0 = cameraViewFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BitmapPhoto bitmapPhoto) {
        invoke2(bitmapPhoto);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable BitmapPhoto bitmapPhoto) {
        TakePhotoViewModel takePhotoViewModel;
        TakePhotoViewModel takePhotoViewModel2;
        TakePhotoViewModel takePhotoViewModel3;
        if (bitmapPhoto != null) {
            CameraViewFragment cameraViewFragment = this.this$0;
            Bitmap rotate = BitMapExtenKt.rotate(bitmapPhoto.bitmap, bitmapPhoto.rotationDegrees);
            takePhotoViewModel = cameraViewFragment.f104857x;
            TakePhotoViewModel takePhotoViewModel4 = null;
            if (takePhotoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                takePhotoViewModel = null;
            }
            String currentPhotoFrameType = takePhotoViewModel.getCurrentPhotoFrameType();
            if (Intrinsics.areEqual(currentPhotoFrameType, "card")) {
                rotate = BitMapExtenKt.cropAspectRatio$default(rotate, 3, 2, 0.83f, 0.0f, 0.28f, 8, null);
            } else if (Intrinsics.areEqual(currentPhotoFrameType, OptionalModuleUtils.FACE)) {
                rotate = BitMapExtenKt.cropSquare$default(rotate, 0.83f, 0.0f, 0.28f, 2, null);
            }
            takePhotoViewModel2 = cameraViewFragment.f104857x;
            if (takePhotoViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                takePhotoViewModel2 = null;
            }
            if (!takePhotoViewModel2.isRequireFaceDetection()) {
                takePhotoViewModel3 = cameraViewFragment.f104857x;
                if (takePhotoViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    takePhotoViewModel4 = takePhotoViewModel3;
                }
                takePhotoViewModel4.openConfirmPhoto(rotate);
                return;
            }
            cameraViewFragment.getFaceRecognitionViewModel().faceDetection(rotate);
        }
    }
}