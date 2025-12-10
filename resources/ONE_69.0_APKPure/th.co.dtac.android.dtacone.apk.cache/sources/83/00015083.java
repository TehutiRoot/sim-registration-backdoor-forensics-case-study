package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostConsentNonTelcoFragment$initView$3;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostConsentNonTelcoFragment$initView$3 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostConsentNonTelcoFragment$initView$3 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MrtrPre2PostConsentNonTelcoFragment f103076a;

    public MrtrPre2PostConsentNonTelcoFragment$initView$3(MrtrPre2PostConsentNonTelcoFragment mrtrPre2PostConsentNonTelcoFragment) {
        this.f103076a = mrtrPre2PostConsentNonTelcoFragment;
    }

    /* renamed from: c */
    public static final void m5242c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(String it) {
        CompositeSubscription compositeSubscription;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.f103076a.f103069j;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.f103076a.f103068i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(it);
        Intrinsics.checkNotNull(consentByLanguage);
        final MrtrPre2PostConsentNonTelcoFragment$initView$3$onChanged$1 mrtrPre2PostConsentNonTelcoFragment$initView$3$onChanged$1 = new MrtrPre2PostConsentNonTelcoFragment$initView$3$onChanged$1(this.f103076a);
        compositeSubscription.add(consentByLanguage.subscribe(new Action1() { // from class: oB0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MrtrPre2PostConsentNonTelcoFragment$initView$3.m5242c(mrtrPre2PostConsentNonTelcoFragment$initView$3$onChanged$1, obj);
            }
        }));
    }
}