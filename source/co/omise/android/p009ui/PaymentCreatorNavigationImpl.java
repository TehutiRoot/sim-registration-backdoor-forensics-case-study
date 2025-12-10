package co.omise.android.p009ui;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import co.omise.android.C5511R;
import co.omise.android.models.Capability;
import co.omise.android.models.InstallmentAmount;
import co.omise.android.models.Limits;
import co.omise.android.models.PaymentMethod;
import co.omise.android.models.Source;
import co.omise.android.models.SupportedEcontext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: co.omise.android.ui.PaymentCreatorNavigationImpl */
/* loaded from: classes3.dex */
public final class PaymentCreatorNavigationImpl implements PaymentCreatorNavigation {

    /* renamed from: m */
    public static final Companion f40357m = new Companion(null);

    /* renamed from: a */
    public final PaymentCreatorActivity f40358a;

    /* renamed from: b */
    public final String f40359b;

    /* renamed from: c */
    public final long f40360c;

    /* renamed from: d */
    public final String f40361d;

    /* renamed from: e */
    public ArrayList f40362e;

    /* renamed from: f */
    public String f40363f;

    /* renamed from: g */
    public boolean f40364g;

    /* renamed from: h */
    public boolean f40365h;

    /* renamed from: i */
    public final int f40366i;

    /* renamed from: j */
    public final PaymentCreatorRequester f40367j;

    /* renamed from: k */
    public final Capability f40368k;

    /* renamed from: l */
    public final FragmentManager f40369l;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lco/omise/android/ui/PaymentCreatorNavigationImpl$Companion;", "", "()V", "FRAGMENT_STACK", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentCreatorNavigationImpl$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PaymentCreatorNavigationImpl(PaymentCreatorActivity activity, String pkey, long j, String currency, ArrayList cardBrands, String googlepayMerchantId, boolean z, boolean z2, int i, PaymentCreatorRequester requester, Capability capability) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pkey, "pkey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(cardBrands, "cardBrands");
        Intrinsics.checkNotNullParameter(googlepayMerchantId, "googlepayMerchantId");
        Intrinsics.checkNotNullParameter(requester, "requester");
        Intrinsics.checkNotNullParameter(capability, "capability");
        this.f40358a = activity;
        this.f40359b = pkey;
        this.f40360c = j;
        this.f40361d = currency;
        this.f40362e = cardBrands;
        this.f40363f = googlepayMerchantId;
        this.f40364g = z;
        this.f40365h = z2;
        this.f40366i = i;
        this.f40367j = requester;
        this.f40368k = capability;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        this.f40369l = supportFragmentManager;
    }

    /* renamed from: a */
    public final void m51164a(Fragment fragment) {
        this.f40369l.beginTransaction().add(C5511R.C5514id.payment_creator_container, fragment).addToBackStack("PaymentCreatorNavigation.fragmentStack").commit();
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void createSourceFinished(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intent intent = new Intent();
        intent.putExtra(OmiseActivity.EXTRA_SOURCE_OBJECT, source);
        this.f40358a.setResult(-1, intent);
        this.f40358a.finish();
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToAtomeForm() {
        AtomeFormFragment atomeFormFragment = new AtomeFormFragment();
        atomeFormFragment.setRequester(this.f40367j);
        m51164a(atomeFormFragment);
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToCreditCardForm() {
        Intent intent = new Intent(this.f40358a, CreditCardActivity.class);
        intent.putExtra(OmiseActivity.EXTRA_PKEY, this.f40359b);
        intent.putExtra(OmiseActivity.EXTRA_IS_SECURE, this.f40358a.getIntent().getBooleanExtra(OmiseActivity.EXTRA_IS_SECURE, true));
        this.f40358a.startActivityForResult(intent, this.f40366i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4 != null) goto L13;
     */
    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void navigateToDuitNowOBWBankChooser(co.omise.android.models.Capability r4) {
        /*
            r3 = this;
            java.lang.String r0 = "capability"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.List r4 = r4.getPaymentMethods()
            if (r4 == 0) goto L38
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r4.next()
            r1 = r0
            co.omise.android.models.PaymentMethod r1 = (co.omise.android.models.PaymentMethod) r1
            java.lang.String r1 = r1.getName()
            co.omise.android.models.SourceType$DuitNowOBW r2 = co.omise.android.models.SourceType.DuitNowOBW.INSTANCE
            java.lang.String r2 = r2.getName()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto Lf
            goto L2e
        L2d:
            r0 = 0
        L2e:
            co.omise.android.models.PaymentMethod r0 = (co.omise.android.models.PaymentMethod) r0
            if (r0 == 0) goto L38
            java.util.List r4 = r0.getBanks()
            if (r4 != 0) goto L3c
        L38:
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L3c:
            co.omise.android.ui.DuitNowOBWBankChooserFragment$Companion r0 = co.omise.android.p009ui.DuitNowOBWBankChooserFragment.Companion
            co.omise.android.ui.DuitNowOBWBankChooserFragment r4 = r0.newInstance(r4)
            co.omise.android.ui.PaymentCreatorRequester r0 = r3.f40367j
            r4.setRequester(r0)
            r3.m51164a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.omise.android.p009ui.PaymentCreatorNavigationImpl.navigateToDuitNowOBWBankChooser(co.omise.android.models.Capability):void");
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToEContextForm(SupportedEcontext eContext) {
        Intrinsics.checkNotNullParameter(eContext, "eContext");
        EContextFormFragment newInstance = EContextFormFragment.Companion.newInstance(eContext);
        newInstance.setRequester(this.f40367j);
        m51164a(newInstance);
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToFpxBankChooser(List list, String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        FpxBankChooserFragment newInstance = FpxBankChooserFragment.Companion.newInstance(list, email);
        newInstance.setRequester(this.f40367j);
        m51164a(newInstance);
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToFpxEmailForm() {
        FpxEmailFormFragment fpxEmailFormFragment = new FpxEmailFormFragment();
        fpxEmailFormFragment.setNavigation(this);
        fpxEmailFormFragment.setRequester(this.f40367j);
        m51164a(fpxEmailFormFragment);
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToGooglePayForm() {
        Intent intent = new Intent(this.f40358a, GooglePayActivity.class);
        intent.putExtra(OmiseActivity.EXTRA_PKEY, this.f40359b);
        intent.putExtra(OmiseActivity.EXTRA_AMOUNT, this.f40360c);
        intent.putExtra(OmiseActivity.EXTRA_CURRENCY, this.f40361d);
        intent.putStringArrayListExtra(OmiseActivity.EXTRA_CARD_BRANDS, this.f40362e);
        intent.putExtra(OmiseActivity.EXTRA_GOOGLEPAY_MERCHANT_ID, this.f40363f);
        intent.putExtra(OmiseActivity.EXTRA_GOOGLEPAY_REQUEST_BILLING_ADDRESS, this.f40364g);
        intent.putExtra(OmiseActivity.EXTRA_GOOGLEPAY_REQUEST_PHONE_NUMBER, this.f40365h);
        this.f40358a.startActivityForResult(intent, this.f40366i);
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToInstallmentChooser(List allowedInstalls) {
        long j;
        InstallmentAmount installmentAmount;
        Long min;
        Intrinsics.checkNotNullParameter(allowedInstalls, "allowedInstalls");
        Limits limits = this.f40368k.getLimits();
        if (limits != null && (installmentAmount = limits.getInstallmentAmount()) != null && (min = installmentAmount.getMin()) != null) {
            j = min.longValue();
        } else {
            j = 0;
        }
        InstallmentChooserFragment newInstance = InstallmentChooserFragment.Companion.newInstance(allowedInstalls, this.f40360c, j);
        newInstance.setNavigation(this);
        m51164a(newInstance);
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToInstallmentTermChooser(PaymentMethod installment) {
        Intrinsics.checkNotNullParameter(installment, "installment");
        InstallmentTermChooserFragment newInstance = InstallmentTermChooserFragment.Companion.newInstance(installment);
        newInstance.setRequester(this.f40367j);
        m51164a(newInstance);
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToInternetBankingChooser(List allowedBanks) {
        Intrinsics.checkNotNullParameter(allowedBanks, "allowedBanks");
        InternetBankingChooserFragment newInstance = InternetBankingChooserFragment.Companion.newInstance(allowedBanks);
        newInstance.setRequester(this.f40367j);
        m51164a(newInstance);
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToMobileBankingChooser(List allowedBanks) {
        Intrinsics.checkNotNullParameter(allowedBanks, "allowedBanks");
        MobileBankingChooserFragment newInstance = MobileBankingChooserFragment.Companion.newInstance(allowedBanks);
        newInstance.setRequester(this.f40367j);
        m51164a(newInstance);
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToPaymentChooser(Capability capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        PaymentChooserFragment newInstance = PaymentChooserFragment.Companion.newInstance(capability);
        newInstance.setNavigation(this);
        newInstance.setRequester(this.f40367j);
        m51164a(newInstance);
    }

    @Override // co.omise.android.p009ui.PaymentCreatorNavigation
    public void navigateToTrueMoneyForm() {
        TrueMoneyFormFragment trueMoneyFormFragment = new TrueMoneyFormFragment();
        trueMoneyFormFragment.setRequester(this.f40367j);
        m51164a(trueMoneyFormFragment);
    }
}
