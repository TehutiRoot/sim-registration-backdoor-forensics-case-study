package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidNonTelcoFragment$initView$6;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidNonTelcoFragment$initView$6 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidNonTelcoFragment$initView$6 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MrtrPrepaidNonTelcoFragment f103715a;

    public MrtrPrepaidNonTelcoFragment$initView$6(MrtrPrepaidNonTelcoFragment mrtrPrepaidNonTelcoFragment) {
        this.f103715a = mrtrPrepaidNonTelcoFragment;
    }

    /* renamed from: c */
    public static final void m4674c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f103715a.f103710k;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f103715a.f103708i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final MrtrPrepaidNonTelcoFragment$initView$6$onChanged$1 mrtrPrepaidNonTelcoFragment$initView$6$onChanged$1 = new MrtrPrepaidNonTelcoFragment$initView$6$onChanged$1(this.f103715a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: WD0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MrtrPrepaidNonTelcoFragment$initView$6.m4674c(mrtrPrepaidNonTelcoFragment$initView$6$onChanged$1, obj);
            }
        }));
    }
}