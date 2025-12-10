package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit.UploadRetailerDocumentResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/UploadRetailerDocumentResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneOnlineRegisterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOnlineRegisterViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/onlineRegister/viewModel/OneOnlineRegisterViewModel$uploadDocumentSequence$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1292:1\n1#2:1293\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel$uploadDocumentSequence$5 */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterViewModel$uploadDocumentSequence$5 extends Lambda implements Function1<UploadRetailerDocumentResponse, Unit> {
    final /* synthetic */ OneOnlineRegisterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegisterViewModel$uploadDocumentSequence$5(OneOnlineRegisterViewModel oneOnlineRegisterViewModel) {
        super(1);
        this.this$0 = oneOnlineRegisterViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UploadRetailerDocumentResponse uploadRetailerDocumentResponse) {
        invoke2(uploadRetailerDocumentResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(UploadRetailerDocumentResponse uploadRetailerDocumentResponse) {
        List m12897F;
        m12897F = this.this$0.m12897F();
        String fileName = uploadRetailerDocumentResponse.getFileName();
        if (fileName == null) {
            fileName = "";
        }
        m12897F.add(fileName);
        uploadRetailerDocumentResponse.getMessage();
        uploadRetailerDocumentResponse.getFileName();
    }
}