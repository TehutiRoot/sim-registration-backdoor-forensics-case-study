package co.omise.android.request;

import android.app.Activity;
import co.omise.android.models.Amount;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.AbstractC11663a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m29143d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012J\b\u0010 \u001a\u00020\fH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m29142d2 = {"Lco/omise/android/request/GooglePay;", "", "pKey", "", "cardNetworks", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.PRICE, "", "currencyCode", "merchantId", "requestBillingAddress", "", "requestPhoneNumber", "(Ljava/lang/String;Ljava/util/ArrayList;JLjava/lang/String;Ljava/lang/String;ZZ)V", "allowedCardAuthMethods", "Lorg/json/JSONArray;", "baseRequest", "Lorg/json/JSONObject;", "gateway", "merchantInfo", "allowedCardNetworks", "baseCardPaymentMethod", "cardPaymentMethod", "createPaymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "activity", "Landroid/app/Activity;", "gatewayTokenizationSpecification", "getPaymentDataRequest", "getTransactionInfo", "isReadyToPayRequest", "isTestMode", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class GooglePay {
    @NotNull
    private final JSONArray allowedCardAuthMethods;
    @NotNull
    private final JSONObject baseRequest;
    @NotNull
    private final ArrayList<String> cardNetworks;
    @NotNull
    private final String currencyCode;
    @NotNull
    private final String gateway;
    @NotNull
    private final JSONObject merchantInfo;
    @NotNull
    private final String pKey;
    private final long price;
    private final boolean requestBillingAddress;
    private final boolean requestPhoneNumber;

    public GooglePay(@NotNull String pKey, @NotNull ArrayList<String> cardNetworks, long j, @NotNull String currencyCode, @NotNull String merchantId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(pKey, "pKey");
        Intrinsics.checkNotNullParameter(cardNetworks, "cardNetworks");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        this.pKey = pKey;
        this.cardNetworks = cardNetworks;
        this.price = j;
        this.currencyCode = currencyCode;
        this.requestBillingAddress = z;
        this.requestPhoneNumber = z2;
        this.gateway = "omise";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apiVersion", 2);
        jSONObject.put("apiVersionMinor", 0);
        this.baseRequest = jSONObject;
        this.allowedCardAuthMethods = new JSONArray((Collection) AbstractC10100ds.listOf("PAN_ONLY"));
        JSONObject put = new JSONObject().put("merchantId", merchantId);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject().put(\"merchantId\", merchantId)");
        this.merchantInfo = put;
    }

    private final JSONArray allowedCardNetworks() {
        HashMap hashMapOf = AbstractC11663a.hashMapOf(TuplesKt.m29136to("American Express", "AMEX"), TuplesKt.m29136to("JCB", "JCB"), TuplesKt.m29136to("MasterCard", "MASTERCARD"), TuplesKt.m29136to("Visa", "VISA"));
        ArrayList arrayList = new ArrayList();
        if (true ^ this.cardNetworks.isEmpty()) {
            Iterator<String> it = this.cardNetworks.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (hashMapOf.get(next) != null) {
                    arrayList.add(String.valueOf(hashMapOf.get(next)));
                }
            }
        } else {
            arrayList = CollectionsKt__CollectionsKt.arrayListOf("AMEX", "JCB", "MASTERCARD", "VISA");
        }
        return new JSONArray((Collection) arrayList);
    }

    private final JSONObject baseCardPaymentMethod() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", this.allowedCardAuthMethods);
        jSONObject2.put("allowedCardNetworks", allowedCardNetworks());
        jSONObject2.put("billingAddressRequired", this.requestBillingAddress);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("format", "FULL");
        jSONObject3.put("phoneNumberRequired", this.requestPhoneNumber);
        Unit unit = Unit.INSTANCE;
        jSONObject2.put("billingAddressParameters", jSONObject3);
        jSONObject.put("type", "CARD");
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    private final JSONObject cardPaymentMethod() {
        JSONObject baseCardPaymentMethod = baseCardPaymentMethod();
        baseCardPaymentMethod.put("tokenizationSpecification", gatewayTokenizationSpecification());
        return baseCardPaymentMethod;
    }

    private final JSONObject gatewayTokenizationSpecification() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "PAYMENT_GATEWAY");
        jSONObject.put("parameters", new JSONObject(AbstractC11663a.mapOf(TuplesKt.m29136to("gateway", this.gateway), TuplesKt.m29136to("gatewayMerchantId", this.pKey))));
        return jSONObject;
    }

    private final JSONObject getTransactionInfo(long j, String str) throws JSONException {
        String amount = new Amount(j, str).toString(2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalPrice", amount);
        jSONObject.put("totalPriceStatus", "FINAL");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        jSONObject.put("currencyCode", upperCase);
        return jSONObject;
    }

    private final boolean isTestMode() {
        return AbstractC19741eO1.startsWith$default(this.pKey, "pkey_test_", false, 2, null);
    }

    @NotNull
    public final PaymentsClient createPaymentsClient(@NotNull Activity activity) {
        int i;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isTestMode()) {
            i = 3;
        } else {
            i = 1;
        }
        Wallet.WalletOptions build = new Wallet.WalletOptions.Builder().setEnvironment(i).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
        PaymentsClient paymentsClient = Wallet.getPaymentsClient(activity, build);
        Intrinsics.checkNotNullExpressionValue(paymentsClient, "getPaymentsClient(activity, walletOptions)");
        return paymentsClient;
    }

    @Nullable
    public final JSONObject getPaymentDataRequest() {
        try {
            JSONObject jSONObject = this.baseRequest;
            jSONObject.put("allowedPaymentMethods", new JSONArray().put(cardPaymentMethod()));
            jSONObject.put("transactionInfo", getTransactionInfo(this.price, this.currencyCode));
            jSONObject.put("merchantInfo", this.merchantInfo);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    public final JSONObject isReadyToPayRequest() {
        try {
            JSONObject jSONObject = this.baseRequest;
            jSONObject.put("allowedPaymentMethods", new JSONArray().put(baseCardPaymentMethod()));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public /* synthetic */ GooglePay(String str, ArrayList arrayList, long j, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, arrayList, j, str2, str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }
}