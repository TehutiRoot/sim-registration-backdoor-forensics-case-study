package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpTMNFragment$initView$5 */
/* loaded from: classes10.dex */
public final class OneMnpTMNFragment$initView$5 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OneMnpTMNFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "consentTMN", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpTMNFragment$initView$5$1 */
    /* loaded from: classes10.dex */
    public static final class C147661 extends Lambda implements Function1<ConsentNonTelco, Unit> {
        final /* synthetic */ OneMnpTMNFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147661(OneMnpTMNFragment oneMnpTMNFragment) {
            super(1);
            this.this$0 = oneMnpTMNFragment;
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
            oneFontTextView = this.this$0.f91791l;
            OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel2 = null;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("consentTmnTitleTextView");
                oneFontTextView = null;
            }
            oneFontTextView.setText(consentNonTelco.getConsentTitle());
            oneFontTextView2 = this.this$0.f91793n;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("consentTmnDetailTextView");
                oneFontTextView2 = null;
            }
            oneFontTextView2.setText(consentNonTelco.getConsent());
            oneFontButton = this.this$0.f91794o;
            if (oneFontButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allowConsentTmnButton");
                oneFontButton = null;
            }
            oneFontButton.setText(consentNonTelco.getConsentAgree());
            oneFontButton2 = this.this$0.f91795p;
            if (oneFontButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("notAllowConsentTmnButton");
                oneFontButton2 = null;
            }
            oneFontButton2.setText(consentNonTelco.getConsentDecline());
            oneConsentNonTelcoViewModel = this.this$0.f91789j;
            if (oneConsentNonTelcoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
            } else {
                oneConsentNonTelcoViewModel2 = oneConsentNonTelcoViewModel;
            }
            oneConsentNonTelcoViewModel2.getConsentNonTelco().setValue(consentNonTelco);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpTMNFragment$initView$5(OneMnpTMNFragment oneMnpTMNFragment) {
        super(1);
        this.this$0 = oneMnpTMNFragment;
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
        compositeSubscription = this.this$0.f91799t;
        oneConsentNonTelcoViewModel = this.this$0.f91789j;
        Subscription subscription = null;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
            oneConsentNonTelcoViewModel = null;
        }
        Observable<ConsentNonTelco> consentByLanguage = oneConsentNonTelcoViewModel.getConsentByLanguage(it);
        if (consentByLanguage != null) {
            final C147661 c147661 = new C147661(this.this$0);
            subscription = consentByLanguage.subscribe(new Action1() { // from class: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.a
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    OneMnpTMNFragment$initView$5.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
        compositeSubscription.add(subscription);
    }
}