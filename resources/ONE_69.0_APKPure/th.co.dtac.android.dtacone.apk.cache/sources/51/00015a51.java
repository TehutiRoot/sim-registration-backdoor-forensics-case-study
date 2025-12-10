package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import androidx.autofill.HintConstants;
import io.reactivex.SingleSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidAllowCamera;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidAllowCamera;", "kotlin.jvm.PlatformType", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistValidateCardViewModel$isAllowCamera$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistValidateCardViewModel$isAllowCamera$2 extends Lambda implements Function1<String, SingleSource<? extends UpdatePrepaidAllowCamera>> {
    final /* synthetic */ MrtrPrepaidReregistValidateCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistValidateCardViewModel$isAllowCamera$2(MrtrPrepaidReregistValidateCardViewModel mrtrPrepaidReregistValidateCardViewModel) {
        super(1);
        this.this$0 = mrtrPrepaidReregistValidateCardViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SingleSource<? extends UpdatePrepaidAllowCamera> invoke(@NotNull String phoneNumber) {
        MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        mrtrPrepaidReregistRepository = this.this$0.f106836b;
        return mrtrPrepaidReregistRepository.getAllowCamera(phoneNumber);
    }
}