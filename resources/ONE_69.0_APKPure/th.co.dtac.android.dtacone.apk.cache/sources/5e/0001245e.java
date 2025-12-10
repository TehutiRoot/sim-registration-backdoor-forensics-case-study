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
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.presenter.prepaid.OCRPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "birthDay", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOCRPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OCRPresenter.kt\nth/co/dtac/android/dtacone/presenter/prepaid/OCRPresenter$getBirthdayFromOCRPostpaid$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n1#2:405\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.OCRPresenter$getBirthdayFromOCRPostpaid$1 */
/* loaded from: classes8.dex */
public final class OCRPresenter$getBirthdayFromOCRPostpaid$1 extends Lambda implements Function1<Bitmap, Unit> {
    final /* synthetic */ Boolean $ignoreDefault;
    final /* synthetic */ OCRPresenter this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "firebaseVisionText", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.OCRPresenter$getBirthdayFromOCRPostpaid$1$1 */
    /* loaded from: classes8.dex */
    public static final class C143551 extends Lambda implements Function1<FirebaseVisionText, Unit> {
        final /* synthetic */ Boolean $ignoreDefault;
        final /* synthetic */ OCRPresenter this$0;

        @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "birthDay", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.OCRPresenter$getBirthdayFromOCRPostpaid$1$1$1 */
        /* loaded from: classes8.dex */
        public static final class C143561 extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ OCRPresenter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C143561(OCRPresenter oCRPresenter) {
                super(1);
                this.this$0 = oCRPresenter;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull String birthDay) {
                CompositeDisposable m17670x;
                OCRPresenter.View view;
                OCRPresenter.View view2;
                Intrinsics.checkNotNullParameter(birthDay, "birthDay");
                m17670x = this.this$0.m17670x();
                OCRPresenter.View view3 = null;
                if (!m17670x.isDisposed()) {
                    view2 = this.this$0.f86158c;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                        view2 = null;
                    }
                    view2.onGetBirthdateFromOCR(birthDay);
                }
                view = this.this$0.f86158c;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view3 = view;
                }
                view3.dismissSecondaryLoading();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143551(OCRPresenter oCRPresenter, Boolean bool) {
            super(1);
            this.this$0 = oCRPresenter;
            this.$ignoreDefault = bool;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FirebaseVisionText firebaseVisionText) {
            invoke2(firebaseVisionText);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(FirebaseVisionText firebaseVisionText) {
            OCRPresenter oCRPresenter = this.this$0;
            String text = firebaseVisionText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "firebaseVisionText.text");
            oCRPresenter.m17682l(text, this.$ignoreDefault, new C143561(this.this$0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRPresenter$getBirthdayFromOCRPostpaid$1(OCRPresenter oCRPresenter, Boolean bool) {
        super(1);
        this.this$0 = oCRPresenter;
        this.$ignoreDefault = bool;
    }

    /* renamed from: b */
    public static /* synthetic */ void m17664b(Function1 function1, Object obj) {
        invoke$lambda$0(function1, obj);
    }

    public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void invoke$lambda$2(OCRPresenter this$0, Exception e) {
        OCRPresenter.View view;
        OCRPresenter.View view2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e, "e");
        e.getMessage();
        view = this$0.f86158c;
        OCRPresenter.View view3 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.onOCRFail();
        view2 = this$0.f86158c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view2;
        }
        view3.dismissSecondaryLoading();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Bitmap bitmap) {
        FirebaseVisionImage fromBitmap = FirebaseVisionImage.fromBitmap(bitmap);
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(birthDay)");
        FirebaseVisionTextRecognizer onDeviceTextRecognizer = FirebaseVision.getInstance().getOnDeviceTextRecognizer();
        Intrinsics.checkNotNullExpressionValue(onDeviceTextRecognizer, "getInstance().onDeviceTextRecognizer");
        Task<FirebaseVisionText> processImage = onDeviceTextRecognizer.processImage(fromBitmap);
        final C143551 c143551 = new C143551(this.this$0, this.$ignoreDefault);
        Task<FirebaseVisionText> addOnSuccessListener = processImage.addOnSuccessListener(new OnSuccessListener() { // from class: th.co.dtac.android.dtacone.presenter.prepaid.c
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                OCRPresenter$getBirthdayFromOCRPostpaid$1.m17664b(Function1.this, obj);
            }
        });
        final OCRPresenter oCRPresenter = this.this$0;
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: th.co.dtac.android.dtacone.presenter.prepaid.d
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                OCRPresenter$getBirthdayFromOCRPostpaid$1.invoke$lambda$2(OCRPresenter.this, exc);
            }
        });
    }
}