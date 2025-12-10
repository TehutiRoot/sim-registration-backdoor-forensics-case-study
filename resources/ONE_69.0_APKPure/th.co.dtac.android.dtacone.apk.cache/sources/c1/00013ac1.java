package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent;

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
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentNonTelcoFragment$setupObserve$2$3 */
/* loaded from: classes10.dex */
public final class OnePre2PostConsentNonTelcoFragment$setupObserve$2$3 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OnePre2PostConsentNonTelcoFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "consentItem", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentNonTelcoFragment$setupObserve$2$3$1 */
    /* loaded from: classes10.dex */
    public static final class C150561 extends Lambda implements Function1<ConsentNonTelco, Unit> {
        final /* synthetic */ OnePre2PostConsentNonTelcoFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C150561(OnePre2PostConsentNonTelcoFragment onePre2PostConsentNonTelcoFragment) {
            super(1);
            this.this$0 = onePre2PostConsentNonTelcoFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelco consentNonTelco) {
            invoke2(consentNonTelco);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ConsentNonTelco consentNonTelco) {
            OnePre2PostViewModel m11142p;
            OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
            m11142p = this.this$0.m11142p();
            m11142p.setConsentNonTelcoTemp(consentNonTelco);
            OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel2 = null;
            OnePre2PostConsentNonTelcoFragment.m11136v(this.this$0, null, consentNonTelco, 1, null);
            oneConsentNonTelcoViewModel = this.this$0.f95169i;
            if (oneConsentNonTelcoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneConsentNonTelcoViewModel");
            } else {
                oneConsentNonTelcoViewModel2 = oneConsentNonTelcoViewModel;
            }
            oneConsentNonTelcoViewModel2.getConsentNonTelco().setValue(consentNonTelco);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostConsentNonTelcoFragment$setupObserve$2$3(OnePre2PostConsentNonTelcoFragment onePre2PostConsentNonTelcoFragment) {
        super(1);
        this.this$0 = onePre2PostConsentNonTelcoFragment;
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
    public final void invoke2(@NotNull String it) {
        CompositeSubscription compositeSubscription;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        compositeSubscription = this.this$0.f95170j;
        oneConsentNonTelcoViewModel = this.this$0.f95169i;
        Subscription subscription = null;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneConsentNonTelcoViewModel");
            oneConsentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = oneConsentNonTelcoViewModel.getConsentByLanguage(it);
        if (consentByLanguage != null) {
            final C150561 c150561 = new C150561(this.this$0);
            subscription = consentByLanguage.subscribe(new Action1() { // from class: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.a
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    OnePre2PostConsentNonTelcoFragment$setupObserve$2$3.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
        compositeSubscription.add(subscription);
    }
}