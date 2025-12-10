package th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment$initView$2;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment$initView$2 */
/* loaded from: classes9.dex */
public final class MrtrMultiSimConsentTelcoFragment$initView$2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MrtrMultiSimConsentTelcoFragment f104088a;

    public MrtrMultiSimConsentTelcoFragment$initView$2(MrtrMultiSimConsentTelcoFragment mrtrMultiSimConsentTelcoFragment) {
        this.f104088a = mrtrMultiSimConsentTelcoFragment;
    }

    /* renamed from: c */
    public static final void m4282c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f104088a.f104084j;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f104088a.f104083i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final MrtrMultiSimConsentTelcoFragment$initView$2$onChanged$1 mrtrMultiSimConsentTelcoFragment$initView$2$onChanged$1 = new MrtrMultiSimConsentTelcoFragment$initView$2$onChanged$1(this.f104088a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: Ax0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MrtrMultiSimConsentTelcoFragment$initView$2.m4282c(mrtrMultiSimConsentTelcoFragment$initView$2$onChanged$1, obj);
            }
        }));
    }
}