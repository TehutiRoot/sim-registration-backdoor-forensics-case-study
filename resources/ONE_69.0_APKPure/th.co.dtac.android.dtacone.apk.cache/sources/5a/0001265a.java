package th.p047co.dtac.android.dtacone.p051rx;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.model.bitmap.FaceDetectedBitmap;
import th.p047co.dtac.android.dtacone.viewmodel.face_recognition.detection.FaceDetectionViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/bitmap/FaceDetectedBitmap;", "kotlin.jvm.PlatformType", "bitmap", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.rx.RxFaceDetection$applyDetectByBitmapWithConfig$1$1 */
/* loaded from: classes8.dex */
public final class RxFaceDetection$applyDetectByBitmapWithConfig$1$1 extends Lambda implements Function1<BitmapCollection, ObservableSource<? extends FaceDetectedBitmap>> {
    final /* synthetic */ int $maxTakePhotoCounter;
    final /* synthetic */ RxFaceDetection this$0;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/bitmap/FaceDetectedBitmap;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/bitmap/FaceDetectedBitmap;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.rx.RxFaceDetection$applyDetectByBitmapWithConfig$1$1$2 */
    /* loaded from: classes8.dex */
    public static final class C144092 extends Lambda implements Function1<Boolean, FaceDetectedBitmap> {
        final /* synthetic */ BitmapCollection $bitmap;
        final /* synthetic */ int $maxTakePhotoCounter;
        final /* synthetic */ RxFaceDetection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144092(RxFaceDetection rxFaceDetection, int i, BitmapCollection bitmapCollection) {
            super(1);
            this.this$0 = rxFaceDetection;
            this.$maxTakePhotoCounter = i;
            this.$bitmap = bitmapCollection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FaceDetectedBitmap invoke(@NotNull Boolean it) {
            int i;
            int i2;
            FaceDetectionViewModel.STATE_DETECT state_detect;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean booleanValue = it.booleanValue();
            RxFaceDetection rxFaceDetection = this.this$0;
            i = rxFaceDetection.f86993c;
            rxFaceDetection.f86993c = i + 1;
            if (!booleanValue) {
                i2 = this.this$0.f86993c;
                state_detect = i2 > this.$maxTakePhotoCounter ? FaceDetectionViewModel.STATE_DETECT.CONFIRM_BY_RTR : FaceDetectionViewModel.STATE_DETECT.NOT_FOND;
            } else {
                state_detect = FaceDetectionViewModel.STATE_DETECT.DETECTED;
            }
            Bitmap bitmap = this.$bitmap.getBitmap();
            Intrinsics.checkNotNull(bitmap);
            return new FaceDetectedBitmap(state_detect, bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxFaceDetection$applyDetectByBitmapWithConfig$1$1(RxFaceDetection rxFaceDetection, int i) {
        super(1);
        this.this$0 = rxFaceDetection;
        this.$maxTakePhotoCounter = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invoke$lambda$0(RxFaceDetection this$0, BitmapCollection bitmap) {
        FaceDetection faceDetection;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        faceDetection = this$0.f86991a;
        Bitmap bitmap2 = bitmap.getBitmap();
        Intrinsics.checkNotNull(bitmap2);
        return Boolean.valueOf(faceDetection.onDetected(bitmap2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceDetectedBitmap invoke$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (FaceDetectedBitmap) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends FaceDetectedBitmap> invoke(@NotNull final BitmapCollection bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final RxFaceDetection rxFaceDetection = this.this$0;
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.rx.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean invoke$lambda$0;
                invoke$lambda$0 = RxFaceDetection$applyDetectByBitmapWithConfig$1$1.invoke$lambda$0(RxFaceDetection.this, bitmap);
                return invoke$lambda$0;
            }
        });
        final C144092 c144092 = new C144092(this.this$0, this.$maxTakePhotoCounter, bitmap);
        return fromCallable.map(new Function() { // from class: th.co.dtac.android.dtacone.rx.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                FaceDetectedBitmap invoke$lambda$1;
                invoke$lambda$1 = RxFaceDetection$applyDetectByBitmapWithConfig$1$1.invoke$lambda$1(Function1.this, obj);
                return invoke$lambda$1;
            }
        });
    }
}