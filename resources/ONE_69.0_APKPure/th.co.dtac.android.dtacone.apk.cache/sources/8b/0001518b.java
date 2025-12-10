package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment$initView$2;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment$initView$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidTelcoFragment$initView$2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MrtrPrepaidTelcoFragment f103732a;

    public MrtrPrepaidTelcoFragment$initView$2(MrtrPrepaidTelcoFragment mrtrPrepaidTelcoFragment) {
        this.f103732a = mrtrPrepaidTelcoFragment;
    }

    /* renamed from: c */
    public static final void m4664c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f103732a.f103728k;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f103732a.f103726i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final MrtrPrepaidTelcoFragment$initView$2$onChanged$1 mrtrPrepaidTelcoFragment$initView$2$onChanged$1 = new MrtrPrepaidTelcoFragment$initView$2$onChanged$1(this.f103732a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: UF0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MrtrPrepaidTelcoFragment$initView$2.m4664c(mrtrPrepaidTelcoFragment$initView$2$onChanged$1, obj);
            }
        }));
    }
}