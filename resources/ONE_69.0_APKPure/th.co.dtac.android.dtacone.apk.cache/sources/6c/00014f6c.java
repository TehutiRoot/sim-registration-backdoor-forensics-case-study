package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrPostpaidConsentTelcoFragment$initView$2;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrPostpaidConsentTelcoFragment$initView$2 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidConsentTelcoFragment$initView$2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MrtrPostpaidConsentTelcoFragment f102359a;

    public MrtrPostpaidConsentTelcoFragment$initView$2(MrtrPostpaidConsentTelcoFragment mrtrPostpaidConsentTelcoFragment) {
        this.f102359a = mrtrPostpaidConsentTelcoFragment;
    }

    /* renamed from: c */
    public static final void m5894c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f102359a.f102355j;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f102359a.f102354i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final MrtrPostpaidConsentTelcoFragment$initView$2$onChanged$1 mrtrPostpaidConsentTelcoFragment$initView$2$onChanged$1 = new MrtrPostpaidConsentTelcoFragment$initView$2$onChanged$1(this.f102359a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: Qy0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MrtrPostpaidConsentTelcoFragment$initView$2.m5894c(mrtrPostpaidConsentTelcoFragment$initView$2$onChanged$1, obj);
            }
        }));
    }
}