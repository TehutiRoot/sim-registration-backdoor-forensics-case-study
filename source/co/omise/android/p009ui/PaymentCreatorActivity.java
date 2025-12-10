package co.omise.android.p009ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.ActionBar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import co.omise.android.C5511R;
import co.omise.android.api.Client;
import co.omise.android.api.Request;
import co.omise.android.api.RequestListener;
import co.omise.android.extensions.APIErrorExtensionsKt;
import co.omise.android.models.APIError;
import co.omise.android.models.Capability;
import co.omise.android.models.PaymentMethod;
import co.omise.android.models.Source;
import co.omise.android.models.Token;
import co.omise.android.p009ui.PaymentCreatorActivity;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u0012H\u0002J\b\u0010+\u001a\u00020)H\u0002J\"\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0012\u00102\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\u0010\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020:H\u0016J\u000e\u0010;\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$¨\u0006?"}, m28850d2 = {"Lco/omise/android/ui/PaymentCreatorActivity;", "Lco/omise/android/ui/OmiseActivity;", "()V", "amount", "", "capability", "Lco/omise/android/models/Capability;", "cardBrands", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "client", "Lco/omise/android/api/Client;", FirebaseAnalytics.Param.CURRENCY, "errorMessage", "Landroid/widget/TextView;", "googlepayMerchantId", "googlepayRequestBillingAddress", "", "googlepayRequestPhoneNumber", NotificationCompat.CATEGORY_NAVIGATION, "Lco/omise/android/ui/PaymentCreatorNavigation;", "getNavigation$annotations", "getNavigation", "()Lco/omise/android/ui/PaymentCreatorNavigation;", "setNavigation", "(Lco/omise/android/ui/PaymentCreatorNavigation;)V", "pkey", "progressBar", "Landroid/widget/ProgressBar;", "requester", "Lco/omise/android/ui/PaymentCreatorRequester;", "Lco/omise/android/models/Source;", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "getSnackbar", "()Lcom/google/android/material/snackbar/Snackbar;", "snackbar$delegate", "Lkotlin/Lazy;", "filterCapabilities", "initialize", "", "isActivityActive", "loadCapability", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setClient", "updateActivityWithCapability", "newCapability", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.PaymentCreatorActivity */
/* loaded from: classes3.dex */
public final class PaymentCreatorActivity extends OmiseActivity {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int REQUEST_CREDIT_CARD = 100;
    public static final int REQUEST_CREDIT_CARD_WITH_SOURCE = 101;
    private long amount;
    private Capability capability;
    private Client client;
    private String currency;
    private TextView errorMessage;
    private String googlepayMerchantId;
    private boolean googlepayRequestBillingAddress;
    private boolean googlepayRequestPhoneNumber;
    public PaymentCreatorNavigation navigation;
    private String pkey;
    private ProgressBar progressBar;
    private PaymentCreatorRequester<Source> requester;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private ArrayList<String> cardBrands = new ArrayList<>();
    @NotNull
    private final Lazy snackbar$delegate = LazyKt__LazyJVMKt.lazy(new C5627a());

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lco/omise/android/ui/PaymentCreatorActivity$Companion;", "", "()V", "REQUEST_CREDIT_CARD", "", "REQUEST_CREDIT_CARD_WITH_SOURCE", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentCreatorActivity$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: co.omise.android.ui.PaymentCreatorActivity$a */
    /* loaded from: classes3.dex */
    public static final class C5627a extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5627a() {
            super(0);
            PaymentCreatorActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Snackbar invoke() {
            Snackbar make = Snackbar.make((FrameLayout) PaymentCreatorActivity.this._$_findCachedViewById(C5511R.C5514id.payment_creator_container), "", -1);
            Intrinsics.checkNotNullExpressionValue(make, "make(payment_creator_con…\", Snackbar.LENGTH_SHORT)");
            return make;
        }
    }

    public static final /* synthetic */ TextView access$getErrorMessage$p(PaymentCreatorActivity paymentCreatorActivity) {
        return paymentCreatorActivity.errorMessage;
    }

    public static final /* synthetic */ ProgressBar access$getProgressBar$p(PaymentCreatorActivity paymentCreatorActivity) {
        return paymentCreatorActivity.progressBar;
    }

    public static final /* synthetic */ Snackbar access$getSnackbar(PaymentCreatorActivity paymentCreatorActivity) {
        return paymentCreatorActivity.getSnackbar();
    }

    public static final /* synthetic */ void access$updateActivityWithCapability(PaymentCreatorActivity paymentCreatorActivity, Capability capability) {
        paymentCreatorActivity.updateActivityWithCapability(capability);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Capability filterCapabilities(Capability capability) {
        Parcelable parcelable;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        Object parcelableExtra;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        List list2 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra(OmiseActivity.EXTRA_CAPABILITY, Capability.class);
            parcelable = (Parcelable) parcelableExtra;
        } else {
            Parcelable parcelableExtra2 = intent.getParcelableExtra(OmiseActivity.EXTRA_CAPABILITY);
            if (!(parcelableExtra2 instanceof Capability)) {
                parcelableExtra2 = null;
            }
            parcelable = (Capability) parcelableExtra2;
        }
        Capability capability2 = (Capability) parcelable;
        if (capability2 != null) {
            List<PaymentMethod> paymentMethods = capability2.getPaymentMethods();
            List<String> tokenizationMethods = capability2.getTokenizationMethods();
            if ((paymentMethods != null && !paymentMethods.isEmpty()) || (tokenizationMethods != null && !tokenizationMethods.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            if (paymentMethods != null && !z) {
                List<PaymentMethod> paymentMethods2 = capability.getPaymentMethods();
                if (paymentMethods2 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj : paymentMethods2) {
                        PaymentMethod paymentMethod = (PaymentMethod) obj;
                        ArrayList arrayList3 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(paymentMethods, 10));
                        for (PaymentMethod paymentMethod2 : paymentMethods) {
                            arrayList3.add(paymentMethod2.getName());
                        }
                        if (arrayList3.contains(paymentMethod.getName())) {
                            arrayList2.add(obj);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    list = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                } else {
                    list = null;
                }
                capability.setPaymentMethods(list);
            }
            if (tokenizationMethods != null && !z) {
                List<String> tokenizationMethods2 = capability.getTokenizationMethods();
                if (tokenizationMethods2 != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : tokenizationMethods2) {
                        if (tokenizationMethods.contains((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                capability.setTokenizationMethods(arrayList);
            }
            capability.setZeroInterestInstallments(capability2.getZeroInterestInstallments());
        }
        List<PaymentMethod> paymentMethods3 = capability.getPaymentMethods();
        if (paymentMethods3 != null) {
            list2 = CollectionsKt___CollectionsKt.toMutableList((Collection) paymentMethods3);
        }
        List<String> tokenizationMethods3 = capability.getTokenizationMethods();
        if (tokenizationMethods3 != null) {
            for (String str : tokenizationMethods3) {
                if (list2 != null) {
                    list2.add(new PaymentMethod(str, null, null, null, null, null, null, null, false, null, null, false, 4094, null));
                }
            }
        }
        capability.setPaymentMethods(list2);
        return capability;
    }

    @VisibleForTesting
    public static /* synthetic */ void getNavigation$annotations() {
    }

    public final Snackbar getSnackbar() {
        return (Snackbar) this.snackbar$delegate.getValue();
    }

    private final void initialize() {
        for (String str : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{OmiseActivity.EXTRA_PKEY, OmiseActivity.EXTRA_AMOUNT, OmiseActivity.EXTRA_CURRENCY})) {
            if (!getIntent().hasExtra(str)) {
                throw new IllegalArgumentException(("Could not found " + str + '.').toString());
            }
        }
        String stringExtra = getIntent().getStringExtra(OmiseActivity.EXTRA_PKEY);
        if (stringExtra != null) {
            this.pkey = stringExtra;
            if (this.client == null) {
                this.client = new Client(stringExtra);
            }
            this.amount = getIntent().getLongExtra(OmiseActivity.EXTRA_AMOUNT, 0L);
            String stringExtra2 = getIntent().getStringExtra(OmiseActivity.EXTRA_CURRENCY);
            if (stringExtra2 != null) {
                this.currency = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra(OmiseActivity.EXTRA_GOOGLEPAY_MERCHANT_ID);
                if (stringExtra3 == null) {
                    stringExtra3 = "[GOOGLEPAY_MERCHANT_ID]";
                }
                this.googlepayMerchantId = stringExtra3;
                this.googlepayRequestBillingAddress = getIntent().getBooleanExtra(OmiseActivity.EXTRA_GOOGLEPAY_REQUEST_BILLING_ADDRESS, false);
                this.googlepayRequestPhoneNumber = getIntent().getBooleanExtra(OmiseActivity.EXTRA_GOOGLEPAY_REQUEST_PHONE_NUMBER, false);
                return;
            }
            throw new IllegalArgumentException(("EXTRA_CURRENCY must not be null.").toString());
        }
        throw new IllegalArgumentException(("EXTRA_PKEY must not be null.").toString());
    }

    private final boolean isActivityActive() {
        if (!isFinishing() && !isDestroyed()) {
            return true;
        }
        return false;
    }

    private final void loadCapability() {
        ProgressBar progressBar = this.progressBar;
        Client client = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        TextView textView = this.errorMessage;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMessage");
            textView = null;
        }
        textView.setVisibility(8);
        Request<Capability> build = new Capability.GetCapabilitiesRequestBuilder().build();
        Client client2 = this.client;
        if (client2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("client");
        } else {
            client = client2;
        }
        client.send(build, new RequestListener<Capability>() { // from class: co.omise.android.ui.PaymentCreatorActivity$loadCapability$1
            @Override // co.omise.android.api.RequestListener
            public void onRequestFailed(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                ProgressBar access$getProgressBar$p = PaymentCreatorActivity.access$getProgressBar$p(PaymentCreatorActivity.this);
                TextView textView2 = null;
                if (access$getProgressBar$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                    access$getProgressBar$p = null;
                }
                access$getProgressBar$p.setVisibility(8);
                TextView access$getErrorMessage$p = PaymentCreatorActivity.access$getErrorMessage$p(PaymentCreatorActivity.this);
                if (access$getErrorMessage$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorMessage");
                    access$getErrorMessage$p = null;
                }
                access$getErrorMessage$p.setText(PaymentCreatorActivity.this.getString(C5511R.C5518string.error_loading_payment_methods));
                TextView access$getErrorMessage$p2 = PaymentCreatorActivity.access$getErrorMessage$p(PaymentCreatorActivity.this);
                if (access$getErrorMessage$p2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorMessage");
                } else {
                    textView2 = access$getErrorMessage$p2;
                }
                textView2.setVisibility(0);
            }

            @Override // co.omise.android.api.RequestListener
            public void onRequestSucceed(@NotNull Capability model) {
                Intrinsics.checkNotNullParameter(model, "model");
                PaymentCreatorActivity.access$updateActivityWithCapability(PaymentCreatorActivity.this, model);
                PaymentCreatorActivity.this.invalidateOptionsMenu();
                ProgressBar access$getProgressBar$p = PaymentCreatorActivity.access$getProgressBar$p(PaymentCreatorActivity.this);
                if (access$getProgressBar$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                    access$getProgressBar$p = null;
                }
                access$getProgressBar$p.setVisibility(8);
            }
        });
    }

    public final void updateActivityWithCapability(Capability capability) {
        Client client;
        String str;
        String str2;
        String str3;
        String str4;
        PaymentCreatorRequester<Source> paymentCreatorRequester;
        PaymentCreatorRequester<Source> paymentCreatorRequester2;
        this.capability = capability;
        Client client2 = this.client;
        if (client2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("client");
            client = null;
        } else {
            client = client2;
        }
        long j = this.amount;
        String str5 = this.currency;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.CURRENCY);
            str = null;
        } else {
            str = str5;
        }
        this.requester = new PaymentCreatorRequesterImpl(client, j, str, capability);
        String str6 = this.pkey;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pkey");
            str2 = null;
        } else {
            str2 = str6;
        }
        long j2 = this.amount;
        String str7 = this.currency;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.CURRENCY);
            str3 = null;
        } else {
            str3 = str7;
        }
        ArrayList<String> arrayList = this.cardBrands;
        String str8 = this.googlepayMerchantId;
        if (str8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googlepayMerchantId");
            str4 = null;
        } else {
            str4 = str8;
        }
        boolean z = this.googlepayRequestBillingAddress;
        boolean z2 = this.googlepayRequestPhoneNumber;
        PaymentCreatorRequester<Source> paymentCreatorRequester3 = this.requester;
        if (paymentCreatorRequester3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requester");
            paymentCreatorRequester = null;
        } else {
            paymentCreatorRequester = paymentCreatorRequester3;
        }
        setNavigation(new PaymentCreatorNavigationImpl(this, str2, j2, str3, arrayList, str4, z, z2, 100, paymentCreatorRequester, capability));
        this.capability = filterCapabilities(capability);
        Intent intent = getIntent();
        Capability capability2 = this.capability;
        if (capability2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("capability");
            capability2 = null;
        }
        intent.putExtra(OmiseActivity.EXTRA_CAPABILITY, capability2);
        if (isActivityActive()) {
            PaymentCreatorNavigation navigation = getNavigation();
            Capability capability3 = this.capability;
            if (capability3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("capability");
                capability3 = null;
            }
            navigation.navigateToPaymentChooser(capability3);
        }
        PaymentCreatorRequester<Source> paymentCreatorRequester4 = this.requester;
        if (paymentCreatorRequester4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requester");
            paymentCreatorRequester2 = null;
        } else {
            paymentCreatorRequester2 = paymentCreatorRequester4;
        }
        paymentCreatorRequester2.setListener(new PaymentCreatorRequestListener() { // from class: co.omise.android.ui.PaymentCreatorActivity$updateActivityWithCapability$1
            @Override // co.omise.android.p009ui.PaymentCreatorRequestListener
            public void onSourceCreated(@NotNull Object obj) {
                String string;
                String str9 = null;
                if (Result.m74094isSuccessimpl(obj)) {
                    if (Result.m74093isFailureimpl(obj)) {
                        obj = null;
                    }
                    Source source = (Source) obj;
                    if (source != null) {
                        PaymentCreatorActivity.this.getNavigation().createSourceFinished(source);
                        return;
                    }
                    return;
                }
                Throwable m74090exceptionOrNullimpl = Result.m74090exceptionOrNullimpl(obj);
                if (m74090exceptionOrNullimpl instanceof IOError) {
                    string = PaymentCreatorActivity.this.getString(C5511R.C5518string.error_io, ((IOError) m74090exceptionOrNullimpl).getMessage());
                } else if (m74090exceptionOrNullimpl instanceof APIError) {
                    Resources resources = PaymentCreatorActivity.this.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "resources");
                    string = APIErrorExtensionsKt.getMessageFromResources((APIError) m74090exceptionOrNullimpl, resources);
                } else {
                    PaymentCreatorActivity paymentCreatorActivity = PaymentCreatorActivity.this;
                    int i = C5511R.C5518string.error_unknown;
                    if (m74090exceptionOrNullimpl != null) {
                        str9 = m74090exceptionOrNullimpl.getMessage();
                    }
                    string = paymentCreatorActivity.getString(i, str9);
                }
                Intrinsics.checkNotNullExpressionValue(string, "when (val error = result…                        }");
                if (Result.m74090exceptionOrNullimpl(obj) != null) {
                    PaymentCreatorActivity paymentCreatorActivity2 = PaymentCreatorActivity.this;
                    PaymentCreatorActivity.access$getSnackbar(paymentCreatorActivity2).setText(string);
                    PaymentCreatorActivity.access$getSnackbar(paymentCreatorActivity2).show();
                }
            }
        });
        getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: Ij1
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z3) {
                U40.m66133a(this, fragment, z3);
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z3) {
                U40.m66132b(this, fragment, z3);
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                PaymentCreatorActivity.m51166v(PaymentCreatorActivity.this);
            }
        });
    }

    /* renamed from: updateActivityWithCapability$lambda-1 */
    public static final void m73947updateActivityWithCapability$lambda1(PaymentCreatorActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActionBar supportActionBar = this$0.getSupportActionBar();
        if (supportActionBar != null) {
            if (this$0.getSupportFragmentManager().findFragmentById(C5511R.C5514id.payment_creator_container) instanceof PaymentChooserFragment) {
                supportActionBar.setDisplayHomeAsUpEnabled(false);
                supportActionBar.setHomeButtonEnabled(false);
                return;
            }
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setHomeButtonEnabled(true);
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m51166v(PaymentCreatorActivity paymentCreatorActivity) {
        m73947updateActivityWithCapability$lambda1(paymentCreatorActivity);
    }

    @Override // co.omise.android.p009ui.OmiseActivity
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // co.omise.android.p009ui.OmiseActivity
    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById != null) {
                map.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @NotNull
    public final PaymentCreatorNavigation getNavigation() {
        PaymentCreatorNavigation paymentCreatorNavigation = this.navigation;
        if (paymentCreatorNavigation != null) {
            return paymentCreatorNavigation;
        }
        Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_NAVIGATION);
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Token token;
        String str;
        Parcelable parcelable;
        Object parcelableExtra;
        Token token2;
        Parcelable parcelable2;
        String str2;
        Parcelable parcelable3;
        Parcelable parcelable4;
        Object parcelableExtra2;
        Parcelable parcelable5;
        Object parcelableExtra3;
        super.onActivityResult(i, i2, intent);
        Parcelable parcelable6 = null;
        if (i == 101 && i2 == -1) {
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra3 = intent.getParcelableExtra(OmiseActivity.EXTRA_TOKEN_OBJECT, Token.class);
                    parcelable5 = (Parcelable) parcelableExtra3;
                } else {
                    Parcelable parcelableExtra4 = intent.getParcelableExtra(OmiseActivity.EXTRA_TOKEN_OBJECT);
                    if (!(parcelableExtra4 instanceof Token)) {
                        parcelableExtra4 = null;
                    }
                    parcelable5 = (Token) parcelableExtra4;
                }
                token2 = (Token) parcelable5;
            } else {
                token2 = null;
            }
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra2 = intent.getParcelableExtra(OmiseActivity.EXTRA_SOURCE_OBJECT, Source.class);
                    parcelable4 = (Parcelable) parcelableExtra2;
                } else {
                    Parcelable parcelableExtra5 = intent.getParcelableExtra(OmiseActivity.EXTRA_SOURCE_OBJECT);
                    if (!(parcelableExtra5 instanceof Source)) {
                        parcelableExtra5 = null;
                    }
                    parcelable4 = (Source) parcelableExtra5;
                }
                parcelable2 = (Source) parcelable4;
            } else {
                parcelable2 = null;
            }
            Intent intent2 = new Intent();
            if (token2 != null) {
                str2 = token2.getId();
            } else {
                str2 = null;
            }
            intent2.putExtra(OmiseActivity.EXTRA_TOKEN, str2);
            intent2.putExtra(OmiseActivity.EXTRA_TOKEN_OBJECT, token2);
            if (token2 != null) {
                parcelable3 = token2.getCard();
            } else {
                parcelable3 = null;
            }
            intent2.putExtra(OmiseActivity.EXTRA_CARD_OBJECT, parcelable3);
            intent2.putExtra(OmiseActivity.EXTRA_SOURCE_OBJECT, parcelable2);
            setResult(-1, intent2);
            finish();
        }
        if (i == 100 && i2 == -1) {
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra(OmiseActivity.EXTRA_TOKEN_OBJECT, Token.class);
                    parcelable = (Parcelable) parcelableExtra;
                } else {
                    Parcelable parcelableExtra6 = intent.getParcelableExtra(OmiseActivity.EXTRA_TOKEN_OBJECT);
                    if (!(parcelableExtra6 instanceof Token)) {
                        parcelableExtra6 = null;
                    }
                    parcelable = (Token) parcelableExtra6;
                }
                token = (Token) parcelable;
            } else {
                token = null;
            }
            Intent intent3 = new Intent();
            if (token != null) {
                str = token.getId();
            } else {
                str = null;
            }
            intent3.putExtra(OmiseActivity.EXTRA_TOKEN, str);
            intent3.putExtra(OmiseActivity.EXTRA_TOKEN_OBJECT, token);
            if (token != null) {
                parcelable6 = token.getCard();
            }
            intent3.putExtra(OmiseActivity.EXTRA_CARD_OBJECT, parcelable6);
            setResult(-1, intent3);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra(OmiseActivity.EXTRA_IS_SECURE, true)) {
            getWindow().addFlags(8192);
        }
        setContentView(C5511R.C5515layout.activity_payment_creator);
        View findViewById = findViewById(C5511R.C5514id.progressBar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.progressBar)");
        this.progressBar = (ProgressBar) findViewById;
        View findViewById2 = findViewById(C5511R.C5514id.errorMessage);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.errorMessage)");
        this.errorMessage = (TextView) findViewById2;
        ProgressBar progressBar = this.progressBar;
        TextView textView = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        TextView textView2 = this.errorMessage;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMessage");
        } else {
            textView = textView2;
        }
        textView.setVisibility(8);
        setTitle(getString(C5511R.C5518string.payment_chooser_title));
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: co.omise.android.ui.PaymentCreatorActivity$onCreate$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                if (PaymentCreatorActivity.this.getSupportFragmentManager().findFragmentById(C5511R.C5514id.payment_creator_container) instanceof PaymentChooserFragment) {
                    PaymentCreatorActivity.this.setResult(0);
                    PaymentCreatorActivity.this.finish();
                }
            }
        });
        initialize();
        loadCapability();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (!(getSupportFragmentManager().findFragmentById(C5511R.C5514id.payment_creator_container) instanceof PaymentChooserFragment)) {
            getMenuInflater().inflate(C5511R.C5516menu.menu_toolbar, menu);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C5511R.C5514id.close_menu) {
            setResult(0);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public final void setClient(@NotNull Client client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    public final void setNavigation(@NotNull PaymentCreatorNavigation paymentCreatorNavigation) {
        Intrinsics.checkNotNullParameter(paymentCreatorNavigation, "<set-?>");
        this.navigation = paymentCreatorNavigation;
    }
}
