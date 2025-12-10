package th.p047co.dtac.android.dtacone.repository.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.consent.GetConsentVersionTypeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_pre2post.MrtrPre2PostModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/consent/GetConsentVersionTypeResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository$getConsentVersionType$1 */
/* loaded from: classes8.dex */
public final class MrtrPre2PostRepository$getConsentVersionType$1 extends Lambda implements Function1<GetConsentVersionTypeResponse, GetConsentVersionTypeResponse> {
    final /* synthetic */ MrtrPre2PostRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostRepository$getConsentVersionType$1(MrtrPre2PostRepository mrtrPre2PostRepository) {
        super(1);
        this.this$0 = mrtrPre2PostRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final GetConsentVersionTypeResponse invoke(@NotNull GetConsentVersionTypeResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MrtrPre2PostModel model = this.this$0.getModel();
        String consentType = it.getConsentType();
        if (consentType == null) {
            consentType = "";
        }
        model.setConsentType(consentType);
        MrtrPre2PostModel model2 = this.this$0.getModel();
        String consentVersion = it.getConsentVersion();
        model2.setConsentVersion(consentVersion != null ? consentVersion : "");
        MrtrPre2PostModel model3 = this.this$0.getModel();
        Boolean isShowConsent = it.isShowConsent();
        model3.setShowConsent(isShowConsent != null ? isShowConsent.booleanValue() : false);
        return it;
    }
}