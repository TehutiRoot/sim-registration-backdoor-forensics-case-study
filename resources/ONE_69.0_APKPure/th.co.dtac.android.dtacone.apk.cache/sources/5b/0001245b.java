package th.p047co.dtac.android.dtacone.presenter.prepaid;

import android.graphics.Bitmap;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.FirebaseVision;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p015ml.vision.text.FirebaseVisionText;
import com.google.firebase.p015ml.vision.text.FirebaseVisionTextRecognizer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.presenter.prepaid.OCRPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOCRPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OCRPresenter.kt\nth/co/dtac/android/dtacone/presenter/prepaid/OCRPresenter$getBirthdayFromOCR$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n1#2:405\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.OCRPresenter$getBirthdayFromOCR$2 */
/* loaded from: classes8.dex */
public final class OCRPresenter$getBirthdayFromOCR$2 extends Lambda implements Function1<Bitmap, Unit> {
    final /* synthetic */ OCRPresenter this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "firebaseVisionText", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.OCRPresenter$getBirthdayFromOCR$2$1 */
    /* loaded from: classes8.dex */
    public static final class C143541 extends Lambda implements Function1<FirebaseVisionText, Unit> {
        final /* synthetic */ OCRPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143541(OCRPresenter oCRPresenter) {
            super(1);
            this.this$0 = oCRPresenter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FirebaseVisionText firebaseVisionText) {
            invoke2(firebaseVisionText);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(FirebaseVisionText firebaseVisionText) {
            OCRPresenter.View view;
            OCRPresenter oCRPresenter = this.this$0;
            String text = firebaseVisionText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "firebaseVisionText.text");
            OCRPresenter.View view2 = null;
            String m17680n = OCRPresenter.m17680n(oCRPresenter, text, null, 2, null);
            view = this.this$0.f86158c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view2 = view;
            }
            view2.onGetBirthdateFromOCR(m17680n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRPresenter$getBirthdayFromOCR$2(OCRPresenter oCRPresenter) {
        super(1);
        this.this$0 = oCRPresenter;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17667a(Function1 function1, Object obj) {
        invoke$lambda$0(function1, obj);
    }

    public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void invoke$lambda$2(OCRPresenter this$0, Exception e) {
        OCRPresenter.View view;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e, "e");
        e.getMessage();
        view = this$0.f86158c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.onOCRFail();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Bitmap bitmap) {
        FirebaseVisionImage fromBitmap = FirebaseVisionImage.fromBitmap(bitmap);
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(it)");
        FirebaseVisionTextRecognizer onDeviceTextRecognizer = FirebaseVision.getInstance().getOnDeviceTextRecognizer();
        Intrinsics.checkNotNullExpressionValue(onDeviceTextRecognizer, "getInstance().onDeviceTextRecognizer");
        Task<FirebaseVisionText> processImage = onDeviceTextRecognizer.processImage(fromBitmap);
        final C143541 c143541 = new C143541(this.this$0);
        Task<FirebaseVisionText> addOnSuccessListener = processImage.addOnSuccessListener(new OnSuccessListener() { // from class: th.co.dtac.android.dtacone.presenter.prepaid.a
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                OCRPresenter$getBirthdayFromOCR$2.m17667a(Function1.this, obj);
            }
        });
        final OCRPresenter oCRPresenter = this.this$0;
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: th.co.dtac.android.dtacone.presenter.prepaid.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                OCRPresenter$getBirthdayFromOCR$2.invoke$lambda$2(OCRPresenter.this, exc);
            }
        });
    }
}