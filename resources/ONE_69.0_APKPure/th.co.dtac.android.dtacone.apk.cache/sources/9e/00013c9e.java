package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidTMNFragment$initView$6;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidTMNFragment$initView$6 */
/* loaded from: classes10.dex */
public final class OnePrepaidTMNFragment$initView$6 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ OnePrepaidTMNFragment f95813a;

    public OnePrepaidTMNFragment$initView$6(OnePrepaidTMNFragment onePrepaidTMNFragment) {
        this.f95813a = onePrepaidTMNFragment;
    }

    /* renamed from: a */
    public static /* synthetic */ void m10627a(Function1 function1, Object obj) {
        m10625c(function1, obj);
    }

    /* renamed from: c */
    public static final void m10625c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f95813a.f95808k;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f95813a.f95807j;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final OnePrepaidTMNFragment$initView$6$onChanged$1 onePrepaidTMNFragment$initView$6$onChanged$1 = new OnePrepaidTMNFragment$initView$6$onChanged$1(this.f95813a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: G91
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OnePrepaidTMNFragment$initView$6.m10627a(Function1.this, obj);
            }
        }));
    }
}