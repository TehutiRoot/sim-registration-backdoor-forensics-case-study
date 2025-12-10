package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrPostpaidConsentNonTelcoFragment$initView$5;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrPostpaidConsentNonTelcoFragment$initView$5 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidConsentNonTelcoFragment$initView$5 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MrtrPostpaidConsentNonTelcoFragment f102344a;

    public MrtrPostpaidConsentNonTelcoFragment$initView$5(MrtrPostpaidConsentNonTelcoFragment mrtrPostpaidConsentNonTelcoFragment) {
        this.f102344a = mrtrPostpaidConsentNonTelcoFragment;
    }

    /* renamed from: c */
    public static final void m5906c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f102344a.f102338j;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f102344a.f102337i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final MrtrPostpaidConsentNonTelcoFragment$initView$5$onChanged$1 mrtrPostpaidConsentNonTelcoFragment$initView$5$onChanged$1 = new MrtrPostpaidConsentNonTelcoFragment$initView$5$onChanged$1(this.f102344a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: Py0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MrtrPostpaidConsentNonTelcoFragment$initView$5.m5906c(mrtrPostpaidConsentNonTelcoFragment$initView$5$onChanged$1, obj);
            }
        }));
    }
}