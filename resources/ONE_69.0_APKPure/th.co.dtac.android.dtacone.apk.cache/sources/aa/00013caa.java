package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidTelcoFragment$initView$2;

/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidTelcoFragment$initView$2 */
/* loaded from: classes10.dex */
public final class OnePrepaidTelcoFragment$initView$2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ OnePrepaidTelcoFragment f95831a;

    public OnePrepaidTelcoFragment$initView$2(OnePrepaidTelcoFragment onePrepaidTelcoFragment) {
        this.f95831a = onePrepaidTelcoFragment;
    }

    /* renamed from: a */
    public static /* synthetic */ void m10616a(Function1 function1, Object obj) {
        m10614c(function1, obj);
    }

    /* renamed from: c */
    public static final void m10614c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f95831a.f95827k;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel = this.f95831a.f95826j;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
            oneConsentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = oneConsentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final OnePrepaidTelcoFragment$initView$2$onChanged$1 onePrepaidTelcoFragment$initView$2$onChanged$1 = new OnePrepaidTelcoFragment$initView$2$onChanged$1(this.f95831a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: H91
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OnePrepaidTelcoFragment$initView$2.m10616a(Function1.this, obj);
            }
        }));
    }
}