package th.p047co.dtac.android.dtacone.view.fragment.eSIM.consent;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.consent.ESimPrepaidTelcoFragment$initView$2;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.consent.ESimPrepaidTelcoFragment$initView$2 */
/* loaded from: classes9.dex */
public final class ESimPrepaidTelcoFragment$initView$2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ESimPrepaidTelcoFragment f100611a;

    public ESimPrepaidTelcoFragment$initView$2(ESimPrepaidTelcoFragment eSimPrepaidTelcoFragment) {
        this.f100611a = eSimPrepaidTelcoFragment;
    }

    /* renamed from: c */
    public static final void m7585c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f100611a.f100607k;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f100611a.f100605i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final ESimPrepaidTelcoFragment$initView$2$onChanged$1 eSimPrepaidTelcoFragment$initView$2$onChanged$1 = new ESimPrepaidTelcoFragment$initView$2$onChanged$1(this.f100611a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: TP
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                ESimPrepaidTelcoFragment$initView$2.m7585c(eSimPrepaidTelcoFragment$initView$2$onChanged$1, obj);
            }
        }));
    }
}