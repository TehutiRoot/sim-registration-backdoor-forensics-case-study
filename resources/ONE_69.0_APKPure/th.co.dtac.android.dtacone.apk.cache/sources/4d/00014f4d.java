package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrMnpConsentNonTelcoFragment$initView$3;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrMnpConsentNonTelcoFragment$initView$3 */
/* loaded from: classes9.dex */
public final class MrtrMnpConsentNonTelcoFragment$initView$3 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MrtrMnpConsentNonTelcoFragment f102313a;

    public MrtrMnpConsentNonTelcoFragment$initView$3(MrtrMnpConsentNonTelcoFragment mrtrMnpConsentNonTelcoFragment) {
        this.f102313a = mrtrMnpConsentNonTelcoFragment;
    }

    /* renamed from: c */
    public static final void m5938c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f102313a.f102308j;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f102313a.f102307i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final MrtrMnpConsentNonTelcoFragment$initView$3$onChanged$1 mrtrMnpConsentNonTelcoFragment$initView$3$onChanged$1 = new MrtrMnpConsentNonTelcoFragment$initView$3$onChanged$1(this.f102313a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: iw0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MrtrMnpConsentNonTelcoFragment$initView$3.m5938c(mrtrMnpConsentNonTelcoFragment$initView$3$onChanged$1, obj);
            }
        }));
    }
}