package th.p047co.dtac.android.dtacone.viewmodel.ocr;

import android.graphics.Bitmap;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOCRSubscriberViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OCRSubscriberViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/ocr/OCRSubscriberViewModel$getMobileNumberFromOCRForPrepaid$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1#2:116\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.ocr.OCRSubscriberViewModel$getMobileNumberFromOCRForPrepaid$2 */
/* loaded from: classes9.dex */
public final class OCRSubscriberViewModel$getMobileNumberFromOCRForPrepaid$2 extends Lambda implements Function1<Bitmap, Unit> {
    final /* synthetic */ TextRecognizer $recognizer;
    final /* synthetic */ OCRSubscriberViewModel this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "visionText", "Lcom/google/mlkit/vision/text/Text;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.ocr.OCRSubscriberViewModel$getMobileNumberFromOCRForPrepaid$2$1 */
    /* loaded from: classes9.dex */
    public static final class C166801 extends Lambda implements Function1<Text, Unit> {
        final /* synthetic */ OCRSubscriberViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166801(OCRSubscriberViewModel oCRSubscriberViewModel) {
            super(1);
            this.this$0 = oCRSubscriberViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Text text) {
            invoke2(text);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Text text) {
            OCRSubscriberViewModel oCRSubscriberViewModel = this.this$0;
            String text2 = text.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "visionText.text");
            oCRSubscriberViewModel.m1951c(text2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRSubscriberViewModel$getMobileNumberFromOCRForPrepaid$2(TextRecognizer textRecognizer, OCRSubscriberViewModel oCRSubscriberViewModel) {
        super(1);
        this.$recognizer = textRecognizer;
        this.this$0 = oCRSubscriberViewModel;
    }

    public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void invoke$lambda$2(OCRSubscriberViewModel this$0, Exception e) {
        MutableLiveData mutableLiveData;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e, "e");
        e.getMessage();
        mutableLiveData = this$0.f106943g;
        mutableLiveData.setValue(Resource.Companion.error("ไม่พบเบอร์", "", null));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Bitmap bitmap) {
        InputImage fromBitmap = InputImage.fromBitmap(bitmap, 0);
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(it, 0)");
        Task<Text> process = this.$recognizer.process(fromBitmap);
        final C166801 c166801 = new C166801(this.this$0);
        Task<Text> addOnSuccessListener = process.addOnSuccessListener(new OnSuccessListener() { // from class: th.co.dtac.android.dtacone.viewmodel.ocr.a
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                OCRSubscriberViewModel$getMobileNumberFromOCRForPrepaid$2.invoke$lambda$0(c166801, obj);
            }
        });
        final OCRSubscriberViewModel oCRSubscriberViewModel = this.this$0;
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: th.co.dtac.android.dtacone.viewmodel.ocr.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                OCRSubscriberViewModel$getMobileNumberFromOCRForPrepaid$2.invoke$lambda$2(OCRSubscriberViewModel.this, exc);
            }
        });
    }
}