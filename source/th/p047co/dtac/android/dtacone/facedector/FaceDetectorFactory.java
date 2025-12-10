package th.p047co.dtac.android.dtacone.facedector;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.firebase.p015ml.vision.FirebaseVision;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFaceDetector;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFaceDetectorOptions;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Single;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Err;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003JE\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\t2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/facedector/FaceDetectorFactory;", "Lth/co/dtac/android/dtacone/facedector/FaceDetector;", "<init>", "()V", "", "init", "close", "Landroid/graphics/Bitmap;", ResponseProcessor.CONTENT_TYPE_IMAGE, "Lkotlin/Function1;", "onSuccess", "Lkotlin/Function2;", "Lth/co/dtac/android/dtacone/model/Err;", "onFail", "detectInImage", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lcom/google/firebase/ml/vision/face/FirebaseVisionFaceDetectorOptions;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Lcom/google/firebase/ml/vision/face/FirebaseVisionFaceDetectorOptions;", "Lcom/google/firebase/ml/vision/face/FirebaseVisionFaceDetector;", "Lcom/google/firebase/ml/vision/face/FirebaseVisionFaceDetector;", "detector", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.facedector.FaceDetectorFactory */
/* loaded from: classes7.dex */
public final class FaceDetectorFactory implements FaceDetector {
    public static final int $stable = 8;

    /* renamed from: a */
    public FirebaseVisionFaceDetector f84767a;

    /* renamed from: a */
    public final FirebaseVisionFaceDetectorOptions m19450a() {
        FirebaseVisionFaceDetectorOptions build = new FirebaseVisionFaceDetectorOptions.Builder().setClassificationMode(1).setContourMode(1).setLandmarkMode(1).setPerformanceMode(2).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ATE)\n            .build()");
        return build;
    }

    @Override // th.p047co.dtac.android.dtacone.facedector.FaceDetector
    public void close() {
        FirebaseVisionFaceDetector firebaseVisionFaceDetector = this.f84767a;
        if (firebaseVisionFaceDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detector");
            firebaseVisionFaceDetector = null;
        }
        firebaseVisionFaceDetector.close();
    }

    @Override // th.p047co.dtac.android.dtacone.facedector.FaceDetector
    public void detectInImage(@NotNull Bitmap image, @NotNull Function1<? super Bitmap, Unit> onSuccess, @NotNull Function2<? super Err, ? super Bitmap, Unit> onFail) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Single observeOn = Single.just(image).observeOn(Schedulers.m29798io());
        Intrinsics.checkNotNullExpressionValue(observeOn, "just(image)\n            …bserveOn(Schedulers.io())");
        SubscribersKt.subscribeBy$default(observeOn, (Function1) null, new FaceDetectorFactory$detectInImage$1(this, onSuccess, image, onFail), 1, (Object) null);
    }

    @Override // th.p047co.dtac.android.dtacone.facedector.FaceDetector
    public void init() {
        FirebaseVisionFaceDetector visionFaceDetector = FirebaseVision.getInstance().getVisionFaceDetector(m19450a());
        Intrinsics.checkNotNullExpressionValue(visionFaceDetector, "getInstance()\n          …ildFaceDetectionOption())");
        this.f84767a = visionFaceDetector;
    }
}
