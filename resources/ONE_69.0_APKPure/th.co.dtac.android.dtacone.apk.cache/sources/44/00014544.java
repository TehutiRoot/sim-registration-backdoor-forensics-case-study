package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import com.google.mlkit.vision.text.Text;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "visionText", "Lcom/google/mlkit/vision/text/Text;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel$recognizeTextOnIdCard$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineTakePhotoViewModel$recognizeTextOnIdCard$1 extends Lambda implements Function1<Text, Unit> {
    final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineTakePhotoViewModel$recognizeTextOnIdCard$1(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel) {
        super(1);
        this.this$0 = oneRegisterTrueOnlineTakePhotoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Text text) {
        invoke2(text);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Text visionText) {
        MutableStateFlow mutableStateFlow;
        String m9353d;
        mutableStateFlow = this.this$0.f98146i;
        mutableStateFlow.setValue(visionText);
        String text = visionText.getText();
        StringBuilder sb = new StringBuilder();
        sb.append("recognizeTextOnIdCard: ");
        sb.append(text);
        OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel = this.this$0;
        Intrinsics.checkNotNullExpressionValue(visionText, "visionText");
        m9353d = oneRegisterTrueOnlineTakePhotoViewModel.m9353d(visionText);
        oneRegisterTrueOnlineTakePhotoViewModel.setIdCardBirthday(m9353d);
    }
}