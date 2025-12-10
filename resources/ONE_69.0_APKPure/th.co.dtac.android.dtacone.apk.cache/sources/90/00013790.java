package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidConsentTelcoFragment$initView$2;

/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidConsentTelcoFragment$initView$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidConsentTelcoFragment$initView$2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ OnePostpaidConsentTelcoFragment f93909a;

    public OnePostpaidConsentTelcoFragment$initView$2(OnePostpaidConsentTelcoFragment onePostpaidConsentTelcoFragment) {
        this.f93909a = onePostpaidConsentTelcoFragment;
    }

    /* renamed from: a */
    public static /* synthetic */ void m12301a(Function1 function1, Object obj) {
        m12299c(function1, obj);
    }

    /* renamed from: c */
    public static final void m12299c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f93909a.f93904p;
        oneConsentNonTelcoViewModel = this.f93909a.f93903o;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            oneConsentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = oneConsentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final OnePostpaidConsentTelcoFragment$initView$2$onChanged$1 onePostpaidConsentTelcoFragment$initView$2$onChanged$1 = new OnePostpaidConsentTelcoFragment$initView$2$onChanged$1(this.f93909a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: K11
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OnePostpaidConsentTelcoFragment$initView$2.m12301a(Function1.this, obj);
            }
        }));
    }
}