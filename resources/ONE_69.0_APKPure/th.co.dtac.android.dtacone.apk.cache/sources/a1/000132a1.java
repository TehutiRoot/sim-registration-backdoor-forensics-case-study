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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentNonTelcoFragment$initView$4 */
/* loaded from: classes10.dex */
public final class OneMnpConsentNonTelcoFragment$initView$4 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OneMnpConsentNonTelcoFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "consentTMN", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentNonTelcoFragment$initView$4$1 */
    /* loaded from: classes10.dex */
    public static final class C147731 extends Lambda implements Function1<ConsentNonTelco, Unit> {
        final /* synthetic */ OneMnpConsentNonTelcoFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147731(OneMnpConsentNonTelcoFragment oneMnpConsentNonTelcoFragment) {
            super(1);
            this.this$0 = oneMnpConsentNonTelcoFragment;
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
            OneFontButton oneFontButton2;
            OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
            oneFontTextView = this.this$0.f91848n;
            OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel2 = null;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("consentNontelcoTitleTextView");
                oneFontTextView = null;
            }
            oneFontTextView.setText(consentNonTelco.getConsentTitle());
            oneFontTextView2 = this.this$0.f91852r;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("consentNontelcoTitleDetailTextView");
                oneFontTextView2 = null;
            }
            oneFontTextView2.setText(consentNonTelco.getConsent());
            oneFontButton = this.this$0.f91847m;
            if (oneFontButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allowConsentTMNButton");
                oneFontButton = null;
            }
            oneFontButton.setText(consentNonTelco.getConsentAgree());
            oneFontButton2 = this.this$0.f91846l;
            if (oneFontButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("notAllowConsentTMNScrollButton");
                oneFontButton2 = null;
            }
            oneFontButton2.setText(consentNonTelco.getConsentDecline());
            oneConsentNonTelcoViewModel = this.this$0.f91843i;
            if (oneConsentNonTelcoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                oneConsentNonTelcoViewModel2 = oneConsentNonTelcoViewModel;
            }
            oneConsentNonTelcoViewModel2.getConsentNonTelco().setValue(consentNonTelco);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpConsentNonTelcoFragment$initView$4(OneMnpConsentNonTelcoFragment oneMnpConsentNonTelcoFragment) {
        super(1);
        this.this$0 = oneMnpConsentNonTelcoFragment;
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
        compositeSubscription = this.this$0.f91844j;
        oneConsentNonTelcoViewModel = this.this$0.f91843i;
        Subscription subscription = null;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            oneConsentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = oneConsentNonTelcoViewModel.getConsentByLanguage(it);
        if (consentByLanguage != null) {
            final C147731 c147731 = new C147731(this.this$0);
            subscription = consentByLanguage.subscribe(new Action1() { // from class: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.a
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    OneMnpConsentNonTelcoFragment$initView$4.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
        compositeSubscription.add(subscription);
    }
}