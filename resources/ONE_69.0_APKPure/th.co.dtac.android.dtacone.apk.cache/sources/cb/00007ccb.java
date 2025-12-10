package co.omise.android.p009ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.autofill.HintConstants;
import co.omise.android.C5500R;
import co.omise.android.api.Client;
import co.omise.android.api.Request;
import co.omise.android.api.RequestListener;
import co.omise.android.extensions.APIErrorExtensionsKt;
import co.omise.android.models.APIError;
import co.omise.android.models.Token;
import co.omise.android.models.TokenizationParam;
import co.omise.android.p009ui.GooglePayActivity;
import co.omise.android.p009ui.OmiseActivity;
import co.omise.android.request.GooglePay;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m29143d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\b\u0007*\u00011\u0018\u00002\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\"\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001a0#j\b\u0012\u0004\u0012\u00020\u001a`$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010\u001cR\u0016\u0010+\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, m29142d2 = {"Lco/omise/android/ui/GooglePayActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initialize", "possiblyShowGooglePayButton", "", "available", "setGooglePayAvailable", "requestPayment", "Lcom/google/android/gms/wallet/PaymentData;", "paymentData", "handlePaymentSuccess", "", "statusCode", "handleError", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "", "pKey", "Ljava/lang/String;", "Lco/omise/android/request/GooglePay;", "googlePay", "Lco/omise/android/request/GooglePay;", "Lcom/google/android/gms/wallet/PaymentsClient;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "cardNetworks", "Ljava/util/ArrayList;", "", FirebaseAnalytics.Param.PRICE, OperatorName.SET_LINE_CAPSTYLE, "currencyCode", "merchantId", "requestBillingAddress", "Z", "requestPhoneNumber", "loadPaymentDataRequestCode", "I", "co/omise/android/ui/GooglePayActivity$onBackPressedCallback$1", "onBackPressedCallback", "Lco/omise/android/ui/GooglePayActivity$onBackPressedCallback$1;", "<init>", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1})
/* renamed from: co.omise.android.ui.GooglePayActivity */
/* loaded from: classes3.dex */
public final class GooglePayActivity extends AppCompatActivity {
    private ArrayList<String> cardNetworks;
    private String currencyCode;
    private GooglePay googlePay;
    private String merchantId;
    private String pKey;
    private PaymentsClient paymentsClient;
    private long price;
    private boolean requestBillingAddress;
    private boolean requestPhoneNumber;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final int loadPaymentDataRequestCode = 991;
    @NotNull
    private final GooglePayActivity$onBackPressedCallback$1 onBackPressedCallback = new GooglePayActivity$onBackPressedCallback$1(this);

    /* renamed from: co.omise.android.ui.GooglePayActivity$a */
    /* loaded from: classes3.dex */
    public final class C5599a implements RequestListener {
        public C5599a() {
            GooglePayActivity.this = r1;
        }

        @Override // co.omise.android.api.RequestListener
        /* renamed from: a */
        public void onRequestSucceed(Token model) {
            Intrinsics.checkNotNullParameter(model, "model");
            Intent intent = new Intent();
            intent.putExtra(OmiseActivity.EXTRA_TOKEN, model.getId());
            intent.putExtra(OmiseActivity.EXTRA_TOKEN_OBJECT, model);
            intent.putExtra(OmiseActivity.EXTRA_CARD_OBJECT, model.getCard());
            GooglePayActivity.this.setResult(-1, intent);
            GooglePayActivity.this.finish();
        }

        @Override // co.omise.android.api.RequestListener
        public void onRequestFailed(Throwable throwable) {
            String string;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (throwable instanceof IOError) {
                string = GooglePayActivity.this.getString(C5500R.C5507string.error_io, throwable.getMessage());
            } else if (throwable instanceof APIError) {
                Resources resources = GooglePayActivity.this.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                string = APIErrorExtensionsKt.getMessageFromResources((APIError) throwable, resources);
            } else {
                string = GooglePayActivity.this.getString(C5500R.C5507string.error_unknown, throwable.getMessage());
            }
            Intrinsics.checkNotNullExpressionValue(string, "when (throwable) {\n     …essage)\n                }");
            Toast.makeText(GooglePayActivity.this.getBaseContext(), string, 1).show();
            GooglePayActivity.this.onBackPressedCallback.handleOnBackPressed();
        }
    }

    private final void handleError(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("Error code: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        Log.w("loadPaymentData failed", format);
    }

    private final void handlePaymentSuccess(PaymentData paymentData) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String json = paymentData.toJson();
        Intrinsics.checkNotNullExpressionValue(json, "paymentData.toJson()");
        try {
            JSONObject jSONObject = new JSONObject(json).getJSONObject("paymentMethodData");
            String paymentToken = jSONObject.getJSONObject("tokenizationData").getString("token");
            if (!this.requestBillingAddress) {
                str = "";
                str2 = str;
                str3 = str2;
                str4 = str3;
                str5 = str4;
                str6 = str5;
                str7 = str6;
                str8 = str7;
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("info").getJSONObject("billingAddress");
                String string = jSONObject2.getString("name");
                Intrinsics.checkNotNullExpressionValue(string, "billingAddress.getString(\"name\")");
                String string2 = jSONObject2.getString("locality");
                Intrinsics.checkNotNullExpressionValue(string2, "billingAddress.getString(\"locality\")");
                String string3 = jSONObject2.getString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
                Intrinsics.checkNotNullExpressionValue(string3, "billingAddress.getString(\"countryCode\")");
                String string4 = jSONObject2.getString(HintConstants.AUTOFILL_HINT_POSTAL_CODE);
                Intrinsics.checkNotNullExpressionValue(string4, "billingAddress.getString(\"postalCode\")");
                String string5 = jSONObject2.getString("administrativeArea");
                Intrinsics.checkNotNullExpressionValue(string5, "billingAddress.getString(\"administrativeArea\")");
                String string6 = jSONObject2.getString("address1");
                Intrinsics.checkNotNullExpressionValue(string6, "billingAddress.getString(\"address1\")");
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{jSONObject2.getString("address2"), jSONObject2.getString("address3")});
                ArrayList arrayList = new ArrayList();
                for (Object obj : listOf) {
                    if (!Intrinsics.areEqual((String) obj, "")) {
                        arrayList.add(obj);
                    }
                }
                String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, null, null, 0, null, null, 62, null);
                if (!this.requestPhoneNumber) {
                    str8 = "";
                } else {
                    String string7 = jSONObject2.getString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
                    Intrinsics.checkNotNullExpressionValue(string7, "billingAddress.getString(\"phoneNumber\")");
                    str8 = string7;
                }
                str6 = string6;
                str7 = joinToString$default;
                str4 = string4;
                str5 = string5;
                str2 = string2;
                str3 = string3;
                str = string;
            }
            Intrinsics.checkNotNullExpressionValue(paymentToken, "paymentToken");
            TokenizationParam tokenizationParam = new TokenizationParam("googlepay", paymentToken, str, str2, str3, str4, str5, str6, str7, str8);
            ((LinearLayout) _$_findCachedViewById(C5500R.C5503id.googlePayButton)).setClickable(false);
            String str9 = null;
            Request<Token> build = new Token.CreateTokenRequestBuilder(null, tokenizationParam, 1, null).build();
            C5599a c5599a = new C5599a();
            try {
                String str10 = this.pKey;
                if (str10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pKey");
                } else {
                    str9 = str10;
                }
                new Client(str9).send(build, c5599a);
            } catch (Exception e) {
                c5599a.onRequestFailed(e);
            }
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error: ");
            sb.append(e2);
        }
    }

    private final void initialize() {
        String stringExtra = getIntent().getStringExtra(OmiseActivity.EXTRA_PKEY);
        if (stringExtra != null) {
            this.pKey = stringExtra;
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra(OmiseActivity.EXTRA_CARD_BRANDS);
            if (stringArrayListExtra != null) {
                Intrinsics.checkNotNullExpressionValue(stringArrayListExtra, "requireNotNull(intent.ge…t be null.\"\n            }");
                this.cardNetworks = stringArrayListExtra;
                this.price = getIntent().getLongExtra(OmiseActivity.EXTRA_AMOUNT, 0L);
                String stringExtra2 = getIntent().getStringExtra(OmiseActivity.EXTRA_CURRENCY);
                if (stringExtra2 != null) {
                    this.currencyCode = stringExtra2;
                    String stringExtra3 = getIntent().getStringExtra(OmiseActivity.EXTRA_GOOGLEPAY_MERCHANT_ID);
                    if (stringExtra3 != null) {
                        this.merchantId = stringExtra3;
                        this.requestBillingAddress = getIntent().getBooleanExtra(OmiseActivity.EXTRA_GOOGLEPAY_REQUEST_BILLING_ADDRESS, false);
                        this.requestPhoneNumber = getIntent().getBooleanExtra(OmiseActivity.EXTRA_GOOGLEPAY_REQUEST_PHONE_NUMBER, false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    OmiseActivity.Companion companion = OmiseActivity.Companion;
                    sb.append("EXTRA_GOOGLEPAY_MERCHANT_ID");
                    sb.append(" must not be null.");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                StringBuilder sb2 = new StringBuilder();
                OmiseActivity.Companion companion2 = OmiseActivity.Companion;
                sb2.append("EXTRA_CURRENCY");
                sb2.append(" must not be null.");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            StringBuilder sb3 = new StringBuilder();
            OmiseActivity.Companion companion3 = OmiseActivity.Companion;
            sb3.append("EXTRA_CARD_BRANDS");
            sb3.append(" must not be null.");
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        StringBuilder sb4 = new StringBuilder();
        OmiseActivity.Companion companion4 = OmiseActivity.Companion;
        sb4.append("EXTRA_PKEY");
        sb4.append(" must not be null.");
        throw new IllegalArgumentException(sb4.toString().toString());
    }

    /* renamed from: onCreate$lambda-0 */
    public static final void m74127onCreate$lambda0(GooglePayActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestPayment();
    }

    private final void possiblyShowGooglePayButton() {
        GooglePay googlePay = this.googlePay;
        PaymentsClient paymentsClient = null;
        if (googlePay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googlePay");
            googlePay = null;
        }
        JSONObject isReadyToPayRequest = googlePay.isReadyToPayRequest();
        if (isReadyToPayRequest == null) {
            return;
        }
        IsReadyToPayRequest fromJson = IsReadyToPayRequest.fromJson(isReadyToPayRequest.toString());
        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(isReadyToPayJson.toString())");
        PaymentsClient paymentsClient2 = this.paymentsClient;
        if (paymentsClient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentsClient");
        } else {
            paymentsClient = paymentsClient2;
        }
        Task<Boolean> isReadyToPay = paymentsClient.isReadyToPay(fromJson);
        Intrinsics.checkNotNullExpressionValue(isReadyToPay, "paymentsClient.isReadyToPay(request)");
        isReadyToPay.addOnCompleteListener(new OnCompleteListener() { // from class: T60
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GooglePayActivity.m51182w(GooglePayActivity.this, task);
            }
        });
    }

    /* renamed from: possiblyShowGooglePayButton$lambda-8 */
    public static final void m74128possiblyShowGooglePayButton$lambda8(GooglePayActivity this$0, Task completedTask) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(completedTask, "completedTask");
        try {
            Boolean bool = (Boolean) completedTask.getResult(ApiException.class);
            if (bool != null) {
                this$0.setGooglePayAvailable(bool.booleanValue());
            }
        } catch (ApiException e) {
            Log.w("isReadyToPay failed", e);
            Toast.makeText(this$0, "Internal error occurred, please try a different payment method", 1).show();
            this$0.onBackPressedCallback.handleOnBackPressed();
        }
    }

    private final void requestPayment() {
        ((LinearLayout) _$_findCachedViewById(C5500R.C5503id.googlePayButton)).setClickable(false);
        GooglePay googlePay = this.googlePay;
        PaymentsClient paymentsClient = null;
        if (googlePay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googlePay");
            googlePay = null;
        }
        JSONObject paymentDataRequest = googlePay.getPaymentDataRequest();
        if (paymentDataRequest == null) {
            return;
        }
        PaymentDataRequest fromJson = PaymentDataRequest.fromJson(paymentDataRequest.toString());
        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(paymentDataRequestJson.toString())");
        PaymentsClient paymentsClient2 = this.paymentsClient;
        if (paymentsClient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentsClient");
        } else {
            paymentsClient = paymentsClient2;
        }
        AutoResolveHelper.resolveTask(paymentsClient.loadPaymentData(fromJson), this, this.loadPaymentDataRequestCode);
    }

    private final void setGooglePayAvailable(boolean z) {
        if (z) {
            ((LinearLayout) _$_findCachedViewById(C5500R.C5503id.googlePayButton)).setVisibility(0);
            return;
        }
        Toast.makeText(this, "Unfortunately, Google Pay is not available on this device", 1).show();
        this.onBackPressedCallback.handleOnBackPressed();
    }

    /* renamed from: v */
    public static /* synthetic */ void m51183v(GooglePayActivity googlePayActivity, View view) {
        m74127onCreate$lambda0(googlePayActivity, view);
    }

    /* renamed from: w */
    public static /* synthetic */ void m51182w(GooglePayActivity googlePayActivity, Task task) {
        m74128possiblyShowGooglePayButton$lambda8(googlePayActivity, task);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        PaymentData fromIntent;
        Status statusFromIntent;
        super.onActivityResult(i, i2, intent);
        if (i == this.loadPaymentDataRequestCode) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 == 1 && (statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent)) != null) {
                        handleError(statusFromIntent.getStatusCode());
                    }
                } else {
                    this.onBackPressedCallback.handleOnBackPressed();
                }
            } else if (intent != null && (fromIntent = PaymentData.getFromIntent(intent)) != null) {
                Intrinsics.checkNotNullExpressionValue(fromIntent, "getFromIntent(intent)");
                handlePaymentSuccess(fromIntent);
            }
            ((LinearLayout) _$_findCachedViewById(C5500R.C5503id.googlePayButton)).setClickable(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        ArrayList<String> arrayList;
        String str2;
        String str3;
        super.onCreate(bundle);
        setContentView(C5500R.C5504layout.activity_google_pay);
        getOnBackPressedDispatcher().addCallback(this, this.onBackPressedCallback);
        initialize();
        setTitle(C5500R.C5507string.googlepay);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        String str4 = this.pKey;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pKey");
            str = null;
        } else {
            str = str4;
        }
        ArrayList<String> arrayList2 = this.cardNetworks;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardNetworks");
            arrayList = null;
        } else {
            arrayList = arrayList2;
        }
        long j = this.price;
        String str5 = this.currencyCode;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currencyCode");
            str2 = null;
        } else {
            str2 = str5;
        }
        String str6 = this.merchantId;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantId");
            str3 = null;
        } else {
            str3 = str6;
        }
        GooglePay googlePay = new GooglePay(str, arrayList, j, str2, str3, this.requestBillingAddress, this.requestPhoneNumber);
        this.googlePay = googlePay;
        this.paymentsClient = googlePay.createPaymentsClient(this);
        possiblyShowGooglePayButton();
        ((LinearLayout) _$_findCachedViewById(C5500R.C5503id.googlePayButton)).setOnClickListener(new View.OnClickListener() { // from class: U60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GooglePayActivity.m51183v(GooglePayActivity.this, view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            setResult(0);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}