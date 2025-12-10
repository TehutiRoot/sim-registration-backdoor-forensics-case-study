package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.telco;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.telco.MrtrPrepaidReregistNonTelcoFragment$initView$6;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.telco.MrtrPrepaidReregistNonTelcoFragment$initView$6 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistNonTelcoFragment$initView$6 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MrtrPrepaidReregistNonTelcoFragment f103977a;

    public MrtrPrepaidReregistNonTelcoFragment$initView$6(MrtrPrepaidReregistNonTelcoFragment mrtrPrepaidReregistNonTelcoFragment) {
        this.f103977a = mrtrPrepaidReregistNonTelcoFragment;
    }

    /* renamed from: c */
    public static final void m4407c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f103977a.f103972j;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f103977a.f103971i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final MrtrPrepaidReregistNonTelcoFragment$initView$6$onChanged$1 mrtrPrepaidReregistNonTelcoFragment$initView$6$onChanged$1 = new MrtrPrepaidReregistNonTelcoFragment$initView$6$onChanged$1(this.f103977a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: NE0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MrtrPrepaidReregistNonTelcoFragment$initView$6.m4407c(mrtrPrepaidReregistNonTelcoFragment$initView$6$onChanged$1, obj);
            }
        }));
    }
}