package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistViewModel$uploadImage$1 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistViewModel$uploadImage$1 extends Lambda implements Function1<String, ObservableSource<? extends UploadImageResponse>> {
    final /* synthetic */ MrtrPrepaidReregistViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistViewModel$uploadImage$1(MrtrPrepaidReregistViewModel mrtrPrepaidReregistViewModel) {
        super(1);
        this.this$0 = mrtrPrepaidReregistViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends UploadImageResponse> invoke(@NotNull String it) {
        String m1963e;
        String encryptPhoneNumberString;
        Intrinsics.checkNotNullParameter(it, "it");
        MrtrPrepaidReregistRepository repository = this.this$0.getRepository();
        String simcardNumber = this.this$0.getRepository().getSimcardNumber();
        m1963e = this.this$0.m1963e(it);
        MrtrPrepaidReregistViewModel mrtrPrepaidReregistViewModel = this.this$0;
        encryptPhoneNumberString = mrtrPrepaidReregistViewModel.encryptPhoneNumberString(mrtrPrepaidReregistViewModel.getRepository().getSubscriberNumber());
        return repository.uploadImage(new UploadImageRequest(simcardNumber, m1963e, PermissionConstant.M_CHNG_OWNR_PRE, encryptPhoneNumberString, null, 16, null)).toObservable();
    }
}