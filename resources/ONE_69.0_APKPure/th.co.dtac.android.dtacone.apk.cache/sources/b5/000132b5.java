package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.consent;

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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentTelcoFragment$initView$2 */
/* loaded from: classes10.dex */
public final class OneMnpConsentTelcoFragment$initView$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OneMnpConsentTelcoFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "consent", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentTelcoFragment$initView$2$1 */
    /* loaded from: classes10.dex */
    public static final class C147771 extends Lambda implements Function1<ConsentNonTelco, Unit> {
        final /* synthetic */ OneMnpConsentTelcoFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147771(OneMnpConsentTelcoFragment oneMnpConsentTelcoFragment) {
            super(1);
            this.this$0 = oneMnpConsentTelcoFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelco consentNonTelco) {
            invoke2(consentNonTelco);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ConsentNonTelco consentNonTelco) {
            OneFontTextView oneFontTextView;
            OneFontTextView oneFontTextView2;
            OneFontButton oneFontButton;
            OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
            oneFontTextView = this.this$0.f91875m;
            OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel2 = null;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("consentTelcoTitleTextView");
                oneFontTextView = null;
            }
            oneFontTextView.setText(consentNonTelco.getConsentTitle());
            oneFontTextView2 = this.this$0.f91878p;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("consentTelcoDetailTextView");
                oneFontTextView2 = null;
            }
            oneFontTextView2.setText(consentNonTelco.getConsent());
            oneFontButton = this.this$0.f91876n;
            if (oneFontButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allowConsentTelcoButton");
                oneFontButton = null;
            }
            oneFontButton.setText(consentNonTelco.getConsentAgree());
            oneConsentNonTelcoViewModel = this.this$0.f91871i;
            if (oneConsentNonTelcoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                oneConsentNonTelcoViewModel2 = oneConsentNonTelcoViewModel;
            }
            oneConsentNonTelcoViewModel2.getConsentNonTelco().setValue(consentNonTelco);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpConsentTelcoFragment$initView$2(OneMnpConsentTelcoFragment oneMnpConsentTelcoFragment) {
        super(1);
        this.this$0 = oneMnpConsentTelcoFragment;
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
        compositeSubscription = this.this$0.f91872j;
        oneConsentNonTelcoViewModel = this.this$0.f91871i;
        Subscription subscription = null;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            oneConsentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = oneConsentNonTelcoViewModel.getConsentByLanguage(it);
        if (consentByLanguage != null) {
            final C147771 c147771 = new C147771(this.this$0);
            subscription = consentByLanguage.subscribe(new Action1() { // from class: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.b
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    OneMnpConsentTelcoFragment$initView$2.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
        compositeSubscription.add(subscription);
    }
}