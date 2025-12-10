package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidTMNFragment$initView$6;

/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidTMNFragment$initView$6 */
/* loaded from: classes10.dex */
public final class OnePostpaidTMNFragment$initView$6 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ OnePostpaidTMNFragment f93936a;

    public OnePostpaidTMNFragment$initView$6(OnePostpaidTMNFragment onePostpaidTMNFragment) {
        this.f93936a = onePostpaidTMNFragment;
    }

    /* renamed from: a */
    public static /* synthetic */ void m12289a(Function1 function1, Object obj) {
        m12287c(function1, obj);
    }

    /* renamed from: c */
    public static final void m12287c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f93936a.f93927r;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel = this.f93936a.f93919j;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
            oneConsentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = oneConsentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final OnePostpaidTMNFragment$initView$6$onChanged$1 onePostpaidTMNFragment$initView$6$onChanged$1 = new OnePostpaidTMNFragment$initView$6$onChanged$1(this.f93936a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: M51
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OnePostpaidTMNFragment$initView$6.m12289a(Function1.this, obj);
            }
        }));
    }
}