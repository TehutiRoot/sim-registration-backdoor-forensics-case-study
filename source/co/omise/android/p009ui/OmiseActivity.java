package co.omise.android.p009ui;

import android.content.Intent;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupConfirmFragment;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u000b"}, m28850d2 = {"Lco/omise/android/ui/OmiseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "performActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.OmiseActivity */
/* loaded from: classes3.dex */
public abstract class OmiseActivity extends AppCompatActivity {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTRA_AMOUNT = "OmiseActivity.amount";
    @NotNull
    public static final String EXTRA_CAPABILITY = "OmiseActivity.capability";
    @NotNull
    public static final String EXTRA_CARD_BRANDS = "OmiseActivity.cardBrands";
    @NotNull
    public static final String EXTRA_CARD_OBJECT = "OmiseActivity.cardObject";
    @NotNull
    public static final String EXTRA_CURRENCY = "OmiseActivity.currency";
    @NotNull
    public static final String EXTRA_GOOGLEPAY_MERCHANT_ID = "OmiseActivity.googlepayMerchantId";
    @NotNull
    public static final String EXTRA_GOOGLEPAY_REQUEST_BILLING_ADDRESS = "OmiseActivity.googlepayRequestBillingAddress";
    @NotNull
    public static final String EXTRA_GOOGLEPAY_REQUEST_PHONE_NUMBER = "OmiseActivity.googlepayRequestPhoneNumber";
    @NotNull
    public static final String EXTRA_IS_SECURE = "OmiseActivity.isSecure";
    @NotNull
    public static final String EXTRA_PKEY = "OmiseActivity.publicKey";
    @NotNull
    public static final String EXTRA_SELECTED_INSTALLMENTS_PAYMENT_METHOD = "OmiseActivity.selectedInstallmentsPaymentMethod";
    @NotNull
    public static final String EXTRA_SELECTED_INSTALLMENTS_TERM = "OmiseActivity.selectedInstallmentsTerm";
    @NotNull
    public static final String EXTRA_SOURCE_OBJECT = "OmiseActivity.sourceObject";
    @NotNull
    public static final String EXTRA_TOKEN = "OmiseActivity.token";
    @NotNull
    public static final String EXTRA_TOKEN_OBJECT = "OmiseActivity.tokenObject";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m28850d2 = {"Lco/omise/android/ui/OmiseActivity$Companion;", "", "()V", OneTopupConfirmFragment.EXTRA_AMOUNT, "", "EXTRA_CAPABILITY", "EXTRA_CARD_BRANDS", "EXTRA_CARD_OBJECT", "EXTRA_CURRENCY", "EXTRA_GOOGLEPAY_MERCHANT_ID", "EXTRA_GOOGLEPAY_REQUEST_BILLING_ADDRESS", "EXTRA_GOOGLEPAY_REQUEST_PHONE_NUMBER", "EXTRA_IS_SECURE", "EXTRA_PKEY", "EXTRA_SELECTED_INSTALLMENTS_PAYMENT_METHOD", "EXTRA_SELECTED_INSTALLMENTS_TERM", "EXTRA_SOURCE_OBJECT", "EXTRA_TOKEN", "EXTRA_TOKEN_OBJECT", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.OmiseActivity$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
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

    @VisibleForTesting
    public final void performActivityResult(int i, int i2, @Nullable Intent intent) {
        onActivityResult(i, i2, intent);
    }
}
