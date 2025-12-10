package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMrtrChangeSimViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrChangeSimViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/mrtr_change_sim/MrtrChangeSimViewModel$uploadImage$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1504:1\n1#2:1505\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$uploadImage$5 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$uploadImage$5 extends Lambda implements Function1<UploadImageResponse, Unit> {
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$uploadImage$5(MrtrChangeSimViewModel mrtrChangeSimViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UploadImageResponse uploadImageResponse) {
        invoke2(uploadImageResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(UploadImageResponse uploadImageResponse) {
        MrtrChangeSimRepository mrtrChangeSimRepository;
        String filename = uploadImageResponse.getFilename();
        if (filename != null) {
            mrtrChangeSimRepository = this.this$0.f106258b;
            mrtrChangeSimRepository.getAttachmentNames().add(filename);
        }
    }
}