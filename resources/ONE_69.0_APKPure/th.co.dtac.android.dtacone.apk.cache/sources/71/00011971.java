package th.p047co.dtac.android.dtacone.facedector;

import android.graphics.Bitmap;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFace;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFaceDetector;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Err;
import timber.log.Timber;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.facedector.FaceDetectorFactory$detectInImage$1 */
/* loaded from: classes7.dex */
public final class FaceDetectorFactory$detectInImage$1 extends Lambda implements Function1<Bitmap, Unit> {
    final /* synthetic */ Bitmap $image;
    final /* synthetic */ Function2<Err, Bitmap, Unit> $onFail;
    final /* synthetic */ Function1<Bitmap, Unit> $onSuccess;
    final /* synthetic */ FaceDetectorFactory this$0;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "", "Lcom/google/firebase/ml/vision/face/FirebaseVisionFace;", "kotlin.jvm.PlatformType", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.facedector.FaceDetectorFactory$detectInImage$1$1 */
    /* loaded from: classes7.dex */
    public static final class C142101 extends Lambda implements Function1<List<FirebaseVisionFace>, Unit> {
        final /* synthetic */ Bitmap $image;
        final /* synthetic */ Function2<Err, Bitmap, Unit> $onFail;
        final /* synthetic */ Function1<Bitmap, Unit> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142101(Function1<? super Bitmap, Unit> function1, Bitmap bitmap, Function2<? super Err, ? super Bitmap, Unit> function2) {
            super(1);
            this.$onSuccess = function1;
            this.$image = bitmap;
            this.$onFail = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<FirebaseVisionFace> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(List<FirebaseVisionFace> list) {
            if (list.size() > 0) {
                this.$onSuccess.invoke(this.$image);
            } else {
                this.$onFail.invoke(new Err(null, null, null, null, null, null, null, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null), this.$image);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaceDetectorFactory$detectInImage$1(FaceDetectorFactory faceDetectorFactory, Function1<? super Bitmap, Unit> function1, Bitmap bitmap, Function2<? super Err, ? super Bitmap, Unit> function2) {
        super(1);
        this.this$0 = faceDetectorFactory;
        this.$onSuccess = function1;
        this.$image = bitmap;
        this.$onFail = function2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19617a(Function1 function1, Object obj) {
        invoke$lambda$0(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19616b(Function1 function1, Bitmap bitmap, Exception exc) {
        invoke$lambda$1(function1, bitmap, exc);
    }

    public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void invoke$lambda$1(Function1 onSuccess, Bitmap image, Exception it) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(image, "$image");
        Intrinsics.checkNotNullParameter(it, "it");
        Timber.m1416e(it);
        onSuccess.invoke(image);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Bitmap bitmap) {
        FirebaseVisionFaceDetector firebaseVisionFaceDetector;
        firebaseVisionFaceDetector = this.this$0.f84877a;
        if (firebaseVisionFaceDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detector");
            firebaseVisionFaceDetector = null;
        }
        Task<List<FirebaseVisionFace>> detectInImage = firebaseVisionFaceDetector.detectInImage(FirebaseVisionImage.fromBitmap(bitmap));
        final C142101 c142101 = new C142101(this.$onSuccess, this.$image, this.$onFail);
        Task<List<FirebaseVisionFace>> addOnSuccessListener = detectInImage.addOnSuccessListener(new OnSuccessListener() { // from class: th.co.dtac.android.dtacone.facedector.a
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FaceDetectorFactory$detectInImage$1.m19617a(Function1.this, obj);
            }
        });
        final Function1<Bitmap, Unit> function1 = this.$onSuccess;
        final Bitmap bitmap2 = this.$image;
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: th.co.dtac.android.dtacone.facedector.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                FaceDetectorFactory$detectInImage$1.m19616b(Function1.this, bitmap2, exc);
            }
        });
    }
}