package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.check_sim_info.response.MnpCheckSimInfoResponse;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$uploadImage$1 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$uploadImage$1 extends Lambda implements Function1<String, ObservableSource<? extends UploadImageResponse>> {
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$uploadImage$1(OneMnpViewModel oneMnpViewModel) {
        super(1);
        this.this$0 = oneMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends UploadImageResponse> invoke(@NotNull String it) {
        OneMnpRepository oneMnpRepository;
        String m13515T0;
        String str;
        String encryptString;
        Intrinsics.checkNotNullParameter(it, "it");
        oneMnpRepository = this.this$0.f92116c;
        MnpCheckSimInfoResponse checkSimInfoResponse = this.this$0.getCheckSimInfoResponse();
        String cardNumber = checkSimInfoResponse != null ? checkSimInfoResponse.getCardNumber() : null;
        m13515T0 = this.this$0.m13515T0(it);
        if (this.this$0.isPrepaid()) {
            str = PermissionConstant.MNP_PREPAID;
        } else {
            str = PermissionConstant.MNP_POSTPAID;
        }
        String str2 = str;
        OneMnpViewModel oneMnpViewModel = this.this$0;
        encryptString = oneMnpViewModel.encryptString(oneMnpViewModel.getSubscriberNumber());
        return oneMnpRepository.oneMnpUploadImage(new UploadImageRequest(cardNumber, m13515T0, str2, encryptString, null, 16, null)).toObservable();
    }
}