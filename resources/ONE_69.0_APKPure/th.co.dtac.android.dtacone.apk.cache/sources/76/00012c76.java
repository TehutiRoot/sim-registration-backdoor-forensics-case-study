package th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneConsentNonTelcoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentNonTelcoViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/consent_nontelco/viewModel/OneConsentNonTelcoViewModel$getConsentNonTelco$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1855#2,2:186\n*S KotlinDebug\n*F\n+ 1 OneConsentNonTelcoViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/consent_nontelco/viewModel/OneConsentNonTelcoViewModel$getConsentNonTelco$1\n*L\n59#1:186,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel$getConsentNonTelco$1 */
/* loaded from: classes10.dex */
public final class OneConsentNonTelcoViewModel$getConsentNonTelco$1 extends Lambda implements Function1<ConsentNonTelcoResponse, ConsentNonTelcoResponse> {
    public static final OneConsentNonTelcoViewModel$getConsentNonTelco$1 INSTANCE = new OneConsentNonTelcoViewModel$getConsentNonTelco$1();

    public OneConsentNonTelcoViewModel$getConsentNonTelco$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ConsentNonTelcoResponse invoke(@NotNull ConsentNonTelcoResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<ConsentNonTelco> consent = it.getConsent();
        if (consent != null) {
            for (ConsentNonTelco consentNonTelco : consent) {
                String consentTitle = consentNonTelco.getConsentTitle();
                String str = "";
                if (consentTitle == null) {
                    consentTitle = "";
                }
                consentNonTelco.setConsentTitle(consentTitle);
                String consent2 = consentNonTelco.getConsent();
                if (consent2 == null) {
                    consent2 = "";
                }
                consentNonTelco.setConsent(consent2);
                String consentAgree = consentNonTelco.getConsentAgree();
                if (consentAgree == null) {
                    consentAgree = "";
                }
                consentNonTelco.setConsentAgree(consentAgree);
                String consentDecline = consentNonTelco.getConsentDecline();
                if (consentDecline == null) {
                    consentDecline = "";
                }
                consentNonTelco.setConsentDecline(consentDecline);
                String language = consentNonTelco.getLanguage();
                if (language != null) {
                    str = language;
                }
                consentNonTelco.setLanguage(str);
            }
        }
        return it;
    }
}