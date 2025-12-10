package th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.check_sim_info.response.MnpCheckSimInfoResponse;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpViewModel$uploadImage$1 */
/* loaded from: classes9.dex */
public final class MrtrMnpViewModel$uploadImage$1 extends Lambda implements Function1<String, ObservableSource<? extends UploadImageResponse>> {
    final /* synthetic */ MrtrMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpViewModel$uploadImage$1(MrtrMnpViewModel mrtrMnpViewModel) {
        super(1);
        this.this$0 = mrtrMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends UploadImageResponse> invoke(@NotNull String it) {
        MrtrMnpRepository mrtrMnpRepository;
        String m2347k;
        String str;
        String encryptString;
        Intrinsics.checkNotNullParameter(it, "it");
        mrtrMnpRepository = this.this$0.f106363b;
        MnpCheckSimInfoResponse checkSimInfoResponse = this.this$0.getCheckSimInfoResponse();
        String cardNumber = checkSimInfoResponse != null ? checkSimInfoResponse.getCardNumber() : null;
        m2347k = this.this$0.m2347k(it);
        if (this.this$0.isPrepaid()) {
            str = PermissionConstant.MNP_PREPAID;
        } else {
            str = PermissionConstant.MNP_POSTPAID;
        }
        String str2 = str;
        MrtrMnpViewModel mrtrMnpViewModel = this.this$0;
        encryptString = mrtrMnpViewModel.encryptString(mrtrMnpViewModel.getSubscriberNumber());
        return mrtrMnpRepository.uploadImage(new UploadImageRequest(cardNumber, m2347k, str2, encryptString, null, 16, null)).toObservable();
    }
}