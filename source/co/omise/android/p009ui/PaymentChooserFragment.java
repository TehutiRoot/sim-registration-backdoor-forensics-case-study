package co.omise.android.p009ui;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import co.omise.android.C5511R;
import co.omise.android.api.Request;
import co.omise.android.models.Capability;
import co.omise.android.models.CapabilityKt;
import co.omise.android.models.Source;
import co.omise.android.models.SourceType;
import co.omise.android.models.SupportedEcontext;
import co.omise.android.p009ui.PaymentMethodResource;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006-"}, m28850d2 = {"Lco/omise/android/ui/PaymentChooserFragment;", "Lco/omise/android/ui/OmiseListFragment;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "capability", "Lco/omise/android/models/Capability;", "getCapability", "()Lco/omise/android/models/Capability;", "capability$delegate", "Lkotlin/Lazy;", NotificationCompat.CATEGORY_NAVIGATION, "Lco/omise/android/ui/PaymentCreatorNavigation;", "getNavigation", "()Lco/omise/android/ui/PaymentCreatorNavigation;", "setNavigation", "(Lco/omise/android/ui/PaymentCreatorNavigation;)V", "requester", "Lco/omise/android/ui/PaymentCreatorRequester;", "Lco/omise/android/models/Source;", "getRequester", "()Lco/omise/android/ui/PaymentCreatorRequester;", "setRequester", "(Lco/omise/android/ui/PaymentCreatorRequester;)V", "listItems", "", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onListItemClicked", "item", "onOptionsItemSelected", "", "Landroid/view/MenuItem;", "onViewCreated", Promotion.ACTION_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "sendRequest", "sourceType", "Lco/omise/android/models/SourceType;", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.PaymentChooserFragment */
/* loaded from: classes3.dex */
public final class PaymentChooserFragment extends OmiseListFragment<PaymentMethodResource> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String EXTRA_CAPABILITY = "PaymentChooserFragment.capability";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy capability$delegate = LazyKt__LazyJVMKt.lazy(new C5625a());
    @Nullable
    private PaymentCreatorNavigation navigation;
    @Nullable
    private PaymentCreatorRequester<Source> requester;

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28850d2 = {"Lco/omise/android/ui/PaymentChooserFragment$Companion;", "", "()V", "EXTRA_CAPABILITY", "", "newInstance", "Lco/omise/android/ui/PaymentChooserFragment;", "capability", "Lco/omise/android/models/Capability;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentChooserFragment$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PaymentChooserFragment newInstance(@NotNull Capability capability) {
            Intrinsics.checkNotNullParameter(capability, "capability");
            PaymentChooserFragment paymentChooserFragment = new PaymentChooserFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(PaymentChooserFragment.EXTRA_CAPABILITY, capability);
            paymentChooserFragment.setArguments(bundle);
            return paymentChooserFragment;
        }

        private Companion() {
        }
    }

    /* renamed from: co.omise.android.ui.PaymentChooserFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5625a extends Lambda implements Function0 {
        public C5625a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcelable] */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Capability invoke() {
            Object obj;
            Object parcelable;
            Bundle arguments = PaymentChooserFragment.this.getArguments();
            Capability capability = null;
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(PaymentChooserFragment.EXTRA_CAPABILITY, Capability.class);
                    obj = (Parcelable) parcelable;
                } else {
                    ?? parcelable2 = arguments.getParcelable(PaymentChooserFragment.EXTRA_CAPABILITY);
                    if (parcelable2 instanceof Capability) {
                        capability = parcelable2;
                    }
                    obj = capability;
                }
                capability = (Capability) obj;
            }
            if (capability != null) {
                return capability;
            }
            throw new IllegalArgumentException("Capability must not be null.".toString());
        }
    }

    /* renamed from: co.omise.android.ui.PaymentChooserFragment$b */
    /* loaded from: classes3.dex */
    public static final class C5626b extends Lambda implements Function1 {
        public C5626b() {
            super(1);
        }

        /* renamed from: a */
        public final void m51167a(Object obj) {
            View view = PaymentChooserFragment.this.getView();
            if (view != null) {
                PaymentChooserFragment.this.setAllViewsEnabled(view, true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51167a(((Result) obj).m74096unboximpl());
            return Unit.INSTANCE;
        }
    }

    private final void sendRequest(SourceType sourceType) {
        PaymentCreatorRequester<Source> paymentCreatorRequester = this.requester;
        if (paymentCreatorRequester == null) {
            return;
        }
        Request<Source> build = new Source.CreateSourceRequestBuilder(paymentCreatorRequester.getAmount(), paymentCreatorRequester.getCurrency(), sourceType).build();
        View view = getView();
        if (view != null) {
            setAllViewsEnabled(view, false);
        }
        paymentCreatorRequester.request(build, new C5626b());
    }

    @Override // co.omise.android.p009ui.OmiseListFragment, co.omise.android.p009ui.OmiseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // co.omise.android.p009ui.OmiseListFragment, co.omise.android.p009ui.OmiseFragment
    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
                return null;
            }
            map.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @NotNull
    public final Capability getCapability() {
        return (Capability) this.capability$delegate.getValue();
    }

    @Nullable
    public final PaymentCreatorNavigation getNavigation() {
        return this.navigation;
    }

    @Nullable
    public final PaymentCreatorRequester<Source> getRequester() {
        return this.requester;
    }

    @Override // co.omise.android.p009ui.OmiseListFragment
    @NotNull
    public List<PaymentMethodResource> listItems() {
        return PaymentMethodResourcesKt.getPaymentMethodResources(getCapability());
    }

    @Override // co.omise.android.p009ui.OmiseFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(C5511R.C5516menu.menu_toolbar, menu);
    }

    @Override // co.omise.android.p009ui.OmiseListFragment, co.omise.android.p009ui.OmiseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // co.omise.android.p009ui.OmiseFragment, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C5511R.C5514id.close_menu && (activity = getActivity()) != null) {
            activity.setResult(0);
            activity.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.omise.android.p009ui.OmiseListFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setTitle(getString(C5511R.C5518string.payment_chooser_title));
        setHasOptionsMenu(true);
    }

    public final void setNavigation(@Nullable PaymentCreatorNavigation paymentCreatorNavigation) {
        this.navigation = paymentCreatorNavigation;
    }

    public final void setRequester(@Nullable PaymentCreatorRequester<Source> paymentCreatorRequester) {
        this.requester = paymentCreatorRequester;
    }

    @Override // co.omise.android.p009ui.OmiseListFragment
    public void onListItemClicked(@NotNull PaymentMethodResource item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PaymentCreatorNavigation paymentCreatorNavigation = this.navigation;
        if (paymentCreatorNavigation != null) {
            if (Intrinsics.areEqual(item, PaymentMethodResource.CreditCard.INSTANCE)) {
                paymentCreatorNavigation.navigateToCreditCardForm();
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.Installments.INSTANCE)) {
                paymentCreatorNavigation.navigateToInstallmentChooser(CapabilityKt.getInstallmentMethods(getCapability()));
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.InternetBankings.INSTANCE)) {
                paymentCreatorNavigation.navigateToInternetBankingChooser(CapabilityKt.getInternetBankingMethods(getCapability()));
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.MobileBankings.INSTANCE)) {
                paymentCreatorNavigation.navigateToMobileBankingChooser(CapabilityKt.getMobileBankingMethods(getCapability()));
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.ConvenienceStore.INSTANCE)) {
                paymentCreatorNavigation.navigateToEContextForm(SupportedEcontext.ConvenienceStore.INSTANCE);
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.PayEasy.INSTANCE)) {
                paymentCreatorNavigation.navigateToEContextForm(SupportedEcontext.PayEasy.INSTANCE);
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.Netbanking.INSTANCE)) {
                paymentCreatorNavigation.navigateToEContextForm(SupportedEcontext.Netbanking.INSTANCE);
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.TrueMoney.INSTANCE)) {
                paymentCreatorNavigation.navigateToTrueMoneyForm();
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.TrueMoneyJumpApp.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.TescoLotus.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.Alipay.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.PayNow.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.PromptPay.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.AlipayCn.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.AlipayHk.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.Dana.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.Gcash.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.Kakaopay.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.TouchNGo.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.RabbitLinepay.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.OcbcDigital.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.Boost.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.ShopeePay.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.ShopeePayJumpApp.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.DuitNowQR.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.MaybankQR.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.GrabPay.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.PayPay.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.GrabPayRMS.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.TouchNGoAlipay.INSTANCE) || Intrinsics.areEqual(item, PaymentMethodResource.WeChatPay.INSTANCE)) {
                SourceType sourceType = item.getSourceType();
                if (sourceType != null) {
                    sendRequest(sourceType);
                    return;
                }
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.Fpx.INSTANCE)) {
                paymentCreatorNavigation.navigateToFpxEmailForm();
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.GooglePay.INSTANCE)) {
                paymentCreatorNavigation.navigateToGooglePayForm();
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.DuitNowOBW.INSTANCE)) {
                paymentCreatorNavigation.navigateToDuitNowOBWBankChooser(getCapability());
                return;
            } else if (Intrinsics.areEqual(item, PaymentMethodResource.Atome.INSTANCE)) {
                paymentCreatorNavigation.navigateToAtomeForm();
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("PaymentCreatorNavigation must not be null.");
    }
}
