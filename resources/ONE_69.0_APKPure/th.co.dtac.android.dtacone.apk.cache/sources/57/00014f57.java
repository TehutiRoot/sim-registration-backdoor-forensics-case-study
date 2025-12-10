package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrMnpConsentTelcoFragment$initView$2;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrMnpConsentTelcoFragment$initView$2 */
/* loaded from: classes9.dex */
public final class MrtrMnpConsentTelcoFragment$initView$2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MrtrMnpConsentTelcoFragment f102328a;

    public MrtrMnpConsentTelcoFragment$initView$2(MrtrMnpConsentTelcoFragment mrtrMnpConsentTelcoFragment) {
        this.f102328a = mrtrMnpConsentTelcoFragment;
    }

    /* renamed from: c */
    public static final void m5925c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f102328a.f102324j;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f102328a.f102323i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final MrtrMnpConsentTelcoFragment$initView$2$onChanged$1 mrtrMnpConsentTelcoFragment$initView$2$onChanged$1 = new MrtrMnpConsentTelcoFragment$initView$2$onChanged$1(this.f102328a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: kw0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MrtrMnpConsentTelcoFragment$initView$2.m5925c(mrtrMnpConsentTelcoFragment$initView$2$onChanged$1, obj);
            }
        }));
    }
}