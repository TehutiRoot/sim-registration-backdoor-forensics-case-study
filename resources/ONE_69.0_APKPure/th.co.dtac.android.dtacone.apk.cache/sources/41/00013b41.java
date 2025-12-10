package th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OnePre2PostModel;
import th.p047co.dtac.android.dtacone.model.consent.GetConsentVersionTypeResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/consent/GetConsentVersionTypeResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository$getConsentVersionType$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostRepository$getConsentVersionType$1 extends Lambda implements Function1<GetConsentVersionTypeResponse, GetConsentVersionTypeResponse> {
    final /* synthetic */ OnePre2PostRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostRepository$getConsentVersionType$1(OnePre2PostRepository onePre2PostRepository) {
        super(1);
        this.this$0 = onePre2PostRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final GetConsentVersionTypeResponse invoke(@NotNull GetConsentVersionTypeResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OnePre2PostModel onePre2PostModel = this.this$0.getOnePre2PostModel();
        String consentType = it.getConsentType();
        if (consentType == null) {
            consentType = "";
        }
        onePre2PostModel.setConsentType(consentType);
        OnePre2PostModel onePre2PostModel2 = this.this$0.getOnePre2PostModel();
        String consentVersion = it.getConsentVersion();
        onePre2PostModel2.setConsentVersion(consentVersion != null ? consentVersion : "");
        OnePre2PostModel onePre2PostModel3 = this.this$0.getOnePre2PostModel();
        Boolean isShowConsent = it.isShowConsent();
        onePre2PostModel3.setShowConsent(isShowConsent != null ? isShowConsent.booleanValue() : false);
        return it;
    }
}