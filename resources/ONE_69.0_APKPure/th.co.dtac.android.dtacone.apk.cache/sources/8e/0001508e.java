package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p046rx.Observable;
import p046rx.Subscription;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.databinding.FragmentConsentTelcoBinding;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "language", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostConsentTelcoFragment$initView$2 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostConsentTelcoFragment$initView$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ MrtrPre2PostConsentTelcoFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "consent", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostConsentTelcoFragment$initView$2$1 */
    /* loaded from: classes9.dex */
    public static final class C163351 extends Lambda implements Function1<ConsentNonTelco, Unit> {
        final /* synthetic */ MrtrPre2PostConsentTelcoFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C163351(MrtrPre2PostConsentTelcoFragment mrtrPre2PostConsentTelcoFragment) {
            super(1);
            this.this$0 = mrtrPre2PostConsentTelcoFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelco consentNonTelco) {
            invoke2(consentNonTelco);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ConsentNonTelco consentNonTelco) {
            FragmentConsentTelcoBinding m5235o;
            FragmentConsentTelcoBinding m5235o2;
            FragmentConsentTelcoBinding m5235o3;
            ConsentNonTelcoViewModel consentNonTelcoViewModel;
            m5235o = this.this$0.m5235o();
            m5235o.telcoTitle.setText(consentNonTelco.getConsentTitle());
            m5235o2 = this.this$0.m5235o();
            m5235o2.telcoDetail.setText(consentNonTelco.getConsent());
            m5235o3 = this.this$0.m5235o();
            m5235o3.btnAllow.setText(consentNonTelco.getConsentAgree());
            consentNonTelcoViewModel = this.this$0.f103086i;
            if (consentNonTelcoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                consentNonTelcoViewModel = null;
            }
            consentNonTelcoViewModel.getConsentNonTelco().setValue(consentNonTelco);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostConsentTelcoFragment$initView$2(MrtrPre2PostConsentTelcoFragment mrtrPre2PostConsentTelcoFragment) {
        super(1);
        this.this$0 = mrtrPre2PostConsentTelcoFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String language) {
        CompositeSubscription compositeSubscription;
        ConsentNonTelcoViewModel consentNonTelcoViewModel;
        Intrinsics.checkNotNullParameter(language, "language");
        compositeSubscription = this.this$0.f103088k;
        consentNonTelcoViewModel = this.this$0.f103086i;
        Subscription subscription = null;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = consentNonTelcoViewModel.getConsentByLanguage(language);
        if (consentByLanguage != null) {
            final C163351 c163351 = new C163351(this.this$0);
            subscription = consentByLanguage.subscribe(new Action1() { // from class: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.a
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    MrtrPre2PostConsentTelcoFragment$initView$2.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
        compositeSubscription.add(subscription);
    }
}