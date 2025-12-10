package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.verify.request.MrtrChangeSimVerifyRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$uploadImage$1 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$uploadImage$1 extends Lambda implements Function1<String, ObservableSource<? extends UploadImageResponse>> {
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$uploadImage$1(MrtrChangeSimViewModel mrtrChangeSimViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends UploadImageResponse> invoke(@NotNull String it) {
        MrtrChangeSimRepository mrtrChangeSimRepository;
        MrtrChangeSimRepository mrtrChangeSimRepository2;
        String m2388s;
        MrtrChangeSimRepository mrtrChangeSimRepository3;
        Intrinsics.checkNotNullParameter(it, "it");
        mrtrChangeSimRepository = this.this$0.f106258b;
        mrtrChangeSimRepository2 = this.this$0.f106258b;
        MrtrChangeSimVerifyRequest verifyRequest = mrtrChangeSimRepository2.getVerifyRequest();
        String newSIMCardNumber = verifyRequest != null ? verifyRequest.getNewSIMCardNumber() : null;
        m2388s = this.this$0.m2388s(it);
        mrtrChangeSimRepository3 = this.this$0.f106258b;
        MrtrChangeSimVerifyRequest verifyRequest2 = mrtrChangeSimRepository3.getVerifyRequest();
        return mrtrChangeSimRepository.uploadImage(new UploadImageRequest(newSIMCardNumber, m2388s, PermissionConstant.M_CHNG_SIM, verifyRequest2 != null ? verifyRequest2.getSubscriberNumber() : null, null, 16, null)).toObservable();
    }
}