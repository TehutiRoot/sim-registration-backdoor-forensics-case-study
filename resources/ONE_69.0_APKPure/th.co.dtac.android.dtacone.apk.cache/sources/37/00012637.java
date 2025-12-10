package th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.consent.GetConsentVersionTypeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.MrtrPrepaidReregist;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/consent/GetConsentVersionTypeResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository$getConsentVersionType$1 */
/* loaded from: classes8.dex */
public final class MrtrPrepaidReregistRepository$getConsentVersionType$1 extends Lambda implements Function1<GetConsentVersionTypeResponse, GetConsentVersionTypeResponse> {
    final /* synthetic */ MrtrPrepaidReregistRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistRepository$getConsentVersionType$1(MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository) {
        super(1);
        this.this$0 = mrtrPrepaidReregistRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final GetConsentVersionTypeResponse invoke(@NotNull GetConsentVersionTypeResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MrtrPrepaidReregist model = this.this$0.getModel();
        String consentVersion = it.getConsentVersion();
        if (consentVersion == null) {
            consentVersion = "";
        }
        model.setConsentVersion(consentVersion);
        MrtrPrepaidReregist model2 = this.this$0.getModel();
        String consentType = it.getConsentType();
        model2.setConsentType(consentType != null ? consentType : "");
        MrtrPrepaidReregist model3 = this.this$0.getModel();
        Boolean isShowConsent = it.isShowConsent();
        model3.setShowConsent(isShowConsent != null ? isShowConsent.booleanValue() : false);
        return it;
    }
}