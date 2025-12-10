package th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.consent_non_telco;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.consent_non_telco.ESimPostpaidConsentTelcoFragment$initView$2;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.postpaid.consent_non_telco.ESimPostpaidConsentTelcoFragment$initView$2 */
/* loaded from: classes9.dex */
public final class ESimPostpaidConsentTelcoFragment$initView$2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ESimPostpaidConsentTelcoFragment f100977a;

    public ESimPostpaidConsentTelcoFragment$initView$2(ESimPostpaidConsentTelcoFragment eSimPostpaidConsentTelcoFragment) {
        this.f100977a = eSimPostpaidConsentTelcoFragment;
    }

    /* renamed from: c */
    public static final void m7203c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f100977a.f100973j;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f100977a.f100972i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final ESimPostpaidConsentTelcoFragment$initView$2$onChanged$1 eSimPostpaidConsentTelcoFragment$initView$2$onChanged$1 = new ESimPostpaidConsentTelcoFragment$initView$2$onChanged$1(this.f100977a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: XN
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                ESimPostpaidConsentTelcoFragment$initView$2.m7203c(eSimPostpaidConsentTelcoFragment$initView$2$onChanged$1, obj);
            }
        }));
    }
}