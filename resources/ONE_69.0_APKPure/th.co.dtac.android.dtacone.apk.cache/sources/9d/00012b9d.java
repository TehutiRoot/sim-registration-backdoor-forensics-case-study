package th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.consent;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.consent.OneChangeOwnerNonTelcoFragment$initView$6;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.fragment.consent.OneChangeOwnerNonTelcoFragment$initView$6 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerNonTelcoFragment$initView$6 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ OneChangeOwnerNonTelcoFragment f89205a;

    public OneChangeOwnerNonTelcoFragment$initView$6(OneChangeOwnerNonTelcoFragment oneChangeOwnerNonTelcoFragment) {
        this.f89205a = oneChangeOwnerNonTelcoFragment;
    }

    /* renamed from: a */
    public static /* synthetic */ void m15467a(Function1 function1, Object obj) {
        m15465c(function1, obj);
    }

    /* renamed from: c */
    public static final void m15465c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f89205a.f89200j;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel = this.f89205a.f89199i;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            oneConsentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = oneConsentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final OneChangeOwnerNonTelcoFragment$initView$6$onChanged$1 oneChangeOwnerNonTelcoFragment$initView$6$onChanged$1 = new OneChangeOwnerNonTelcoFragment$initView$6$onChanged$1(this.f89205a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: YM0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneChangeOwnerNonTelcoFragment$initView$6.m15467a(Function1.this, obj);
            }
        }));
    }
}