package th.p047co.dtac.android.dtacone.manager.face;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/face/FaceDetection;", "Lth/co/dtac/android/dtacone/manager/face/IFace;", "Lcom/google/android/gms/vision/face/FaceDetector;", "detector", "Lcom/google/mlkit/vision/face/FaceDetector;", "detectorMlKit", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "pref", "<init>", "(Lcom/google/android/gms/vision/face/FaceDetector;Lcom/google/mlkit/vision/face/FaceDetector;Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "onDetected", "(Landroid/graphics/Bitmap;)Z", "Lkotlin/Function0;", "", FirebaseAnalytics.Param.SUCCESS, "fail", "onDetectedMlKit", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/android/gms/vision/face/FaceDetector;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/google/mlkit/vision/face/FaceDetector;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.manager.face.FaceDetection */
/* loaded from: classes7.dex */
public class FaceDetection implements IFace {
    public static final int $stable = 8;

    /* renamed from: a */
    public final FaceDetector f84928a;

    /* renamed from: b */
    public final com.google.mlkit.vision.face.FaceDetector f84929b;

    /* renamed from: c */
    public final PreferencesRepository f84930c;

    @Inject
    public FaceDetection(@NotNull FaceDetector detector, @NotNull com.google.mlkit.vision.face.FaceDetector detectorMlKit, @NotNull PreferencesRepository pref) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(detectorMlKit, "detectorMlKit");
        Intrinsics.checkNotNullParameter(pref, "pref");
        this.f84928a = detector;
        this.f84929b = detectorMlKit;
        this.f84930c = pref;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19295a(Function0 function0, Exception exc) {
        m19290f(function0, exc);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19294b(Function1 function1, Object obj) {
        m19289g(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19293c(Function1 function1, Object obj) {
        m19291e(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m19292d(Function0 function0, Exception exc) {
        m19288h(function0, exc);
    }

    /* renamed from: e */
    public static final void m19291e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m19290f(Function0 fail, Exception e) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(e, "e");
        fail.invoke();
    }

    /* renamed from: g */
    public static final void m19289g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m19288h(Function0 fail, Exception e) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(e, "e");
        fail.invoke();
    }

    @Override // th.p047co.dtac.android.dtacone.manager.face.IFace
    public boolean onDetected(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        String minFaceCounter = this.f84930c.getString(Constant.PREF_MINIMUM_FACE, "1");
        boolean z = false;
        if (this.f84930c.getBoolean(Constant.PREF_SLOW_FACE_DETECT)) {
            int size = this.f84928a.detect(new Frame.Builder().setBitmap(Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 4, bitmap.getHeight() / 4, true)).build()).size();
            Intrinsics.checkNotNullExpressionValue(minFaceCounter, "minFaceCounter");
            if (size < Integer.parseInt(minFaceCounter)) {
                return false;
            }
            return true;
        }
        Frame build = new Frame.Builder().setBitmap(bitmap).build();
        long nanoTime = System.nanoTime();
        int size2 = this.f84928a.detect(build).size();
        Intrinsics.checkNotNullExpressionValue(minFaceCounter, "minFaceCounter");
        if (size2 >= Integer.parseInt(minFaceCounter)) {
            z = true;
        }
        if (TimeUnit.SECONDS.convert(System.nanoTime() - nanoTime, TimeUnit.NANOSECONDS) > 15) {
            this.f84930c.setBoolean(Constant.PREF_SLOW_FACE_DETECT, true);
        }
        return z;
    }

    @Override // th.p047co.dtac.android.dtacone.manager.face.IFace
    public void onDetectedMlKit(@NotNull Bitmap bitmap, @NotNull Function0<Unit> success, @NotNull final Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        String string = this.f84930c.getString(Constant.PREF_MINIMUM_FACE, "1");
        boolean z = this.f84930c.getBoolean(Constant.PREF_SLOW_FACE_DETECT);
        InputImage fromBitmap = InputImage.fromBitmap(bitmap, 0);
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(bitmap, 0)");
        if (z) {
            Task<List<Face>> process = this.f84929b.process(fromBitmap);
            final FaceDetection$onDetectedMlKit$1 faceDetection$onDetectedMlKit$1 = new FaceDetection$onDetectedMlKit$1(string, success, fail);
            process.addOnSuccessListener(new OnSuccessListener() { // from class: lU
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    FaceDetection.m19293c(faceDetection$onDetectedMlKit$1, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: mU
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    FaceDetection.m19295a(fail, exc);
                }
            });
            return;
        }
        long nanoTime = System.nanoTime();
        Task<List<Face>> process2 = this.f84929b.process(fromBitmap);
        final FaceDetection$onDetectedMlKit$3 faceDetection$onDetectedMlKit$3 = new FaceDetection$onDetectedMlKit$3(string, success, fail, nanoTime, this);
        process2.addOnSuccessListener(new OnSuccessListener() { // from class: nU
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FaceDetection.m19294b(faceDetection$onDetectedMlKit$3, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: oU
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                FaceDetection.m19292d(fail, exc);
            }
        });
    }
}
