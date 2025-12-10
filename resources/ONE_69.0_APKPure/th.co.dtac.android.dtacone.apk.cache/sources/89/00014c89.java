package th.p047co.dtac.android.dtacone.view.fragment.eSIM.consent;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.consent.ESimPrepaidNonTelcoFragment$initView$6;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.consent.ESimPrepaidNonTelcoFragment$initView$6 */
/* loaded from: classes9.dex */
public final class ESimPrepaidNonTelcoFragment$initView$6 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ESimPrepaidNonTelcoFragment f100594a;

    public ESimPrepaidNonTelcoFragment$initView$6(ESimPrepaidNonTelcoFragment eSimPrepaidNonTelcoFragment) {
        this.f100594a = eSimPrepaidNonTelcoFragment;
    }

    /* renamed from: c */
    public static final void m7596c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f100594a.f100588k;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f100594a.f100586i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final ESimPrepaidNonTelcoFragment$initView$6$onChanged$1 eSimPrepaidNonTelcoFragment$initView$6$onChanged$1 = new ESimPrepaidNonTelcoFragment$initView$6$onChanged$1(this.f100594a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: JP
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                ESimPrepaidNonTelcoFragment$initView$6.m7596c(eSimPrepaidNonTelcoFragment$initView$6$onChanged$1, obj);
            }
        }));
    }
}