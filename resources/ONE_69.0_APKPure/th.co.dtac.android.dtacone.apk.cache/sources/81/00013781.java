package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidConsentNonTelcoFragment$initView$6;

/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidConsentNonTelcoFragment$initView$6 */
/* loaded from: classes10.dex */
public final class OnePostpaidConsentNonTelcoFragment$initView$6 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ OnePostpaidConsentNonTelcoFragment f93885a;

    public OnePostpaidConsentNonTelcoFragment$initView$6(OnePostpaidConsentNonTelcoFragment onePostpaidConsentNonTelcoFragment) {
        this.f93885a = onePostpaidConsentNonTelcoFragment;
    }

    /* renamed from: a */
    public static /* synthetic */ void m12312a(Function1 function1, Object obj) {
        m12310c(function1, obj);
    }

    /* renamed from: c */
    public static final void m12310c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f93885a.f93875u;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel = this.f93885a.f93872r;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            oneConsentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = oneConsentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final OnePostpaidConsentNonTelcoFragment$initView$6$onChanged$1 onePostpaidConsentNonTelcoFragment$initView$6$onChanged$1 = new OnePostpaidConsentNonTelcoFragment$initView$6$onChanged$1(this.f93885a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: J11
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OnePostpaidConsentNonTelcoFragment$initView$6.m12312a(Function1.this, obj);
            }
        }));
    }
}