package th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.consent_non_telco;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.consent_non_telco.ESimPostpaidConsentNonTelcoFragment$initView$3;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.postpaid.consent_non_telco.ESimPostpaidConsentNonTelcoFragment$initView$3 */
/* loaded from: classes9.dex */
public final class ESimPostpaidConsentNonTelcoFragment$initView$3 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ESimPostpaidConsentNonTelcoFragment f100962a;

    public ESimPostpaidConsentNonTelcoFragment$initView$3(ESimPostpaidConsentNonTelcoFragment eSimPostpaidConsentNonTelcoFragment) {
        this.f100962a = eSimPostpaidConsentNonTelcoFragment;
    }

    /* renamed from: c */
    public static final void m7215c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f100962a.f100956j;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f100962a.f100955i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final ESimPostpaidConsentNonTelcoFragment$initView$3$onChanged$1 eSimPostpaidConsentNonTelcoFragment$initView$3$onChanged$1 = new ESimPostpaidConsentNonTelcoFragment$initView$3$onChanged$1(this.f100962a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: WN
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                ESimPostpaidConsentNonTelcoFragment$initView$3.m7215c(eSimPostpaidConsentNonTelcoFragment$initView$3$onChanged$1, obj);
            }
        }));
    }
}