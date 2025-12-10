package co.omise.android.p009ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.ActionBar;
import co.omise.android.C5511R;
import co.omise.android.CardNumber;
import co.omise.android.api.Client;
import co.omise.android.api.Request;
import co.omise.android.api.RequestListener;
import co.omise.android.extensions.APIErrorExtensionsKt;
import co.omise.android.extensions.EditTextExtensionsKt;
import co.omise.android.extensions.ViewExtensionsKt;
import co.omise.android.models.APIError;
import co.omise.android.models.BackendType;
import co.omise.android.models.Capability;
import co.omise.android.models.CardParam;
import co.omise.android.models.CountryInfo;
import co.omise.android.models.PaymentMethod;
import co.omise.android.models.PaymentMethodKt;
import co.omise.android.models.Source;
import co.omise.android.models.SourceType;
import co.omise.android.models.Token;
import co.omise.android.p009ui.CountryListDialogFragment;
import co.omise.android.p009ui.CreditCardActivity;
import co.omise.android.p009ui.InputValidationException;
import com.google.android.material.snackbar.Snackbar;
import java.io.IOError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010m\u001a\u00020nH\u0002J\b\u0010o\u001a\u00020nH\u0002J\b\u0010p\u001a\u00020nH\u0002J\u0010\u0010q\u001a\u00020n2\u0006\u0010r\u001a\u00020sH\u0002J\b\u0010t\u001a\u00020nH\u0002J\b\u0010u\u001a\u00020nH\u0002J\b\u0010v\u001a\u00020wH\u0002J\u0012\u0010x\u001a\u00020n2\b\u0010y\u001a\u0004\u0018\u00010zH\u0014J\u0010\u0010{\u001a\u00020w2\u0006\u0010|\u001a\u00020}H\u0016J\u000e\u0010~\u001a\u00020n2\u0006\u0010+\u001a\u00020,J\u0011\u0010\u007f\u001a\u00020n2\u0007\u0010\u0080\u0001\u001a\u00020wH\u0002J\t\u0010\u0081\u0001\u001a\u00020nH\u0002J\t\u0010\u0082\u0001\u001a\u00020nH\u0002J\t\u0010\u0083\u0001\u001a\u00020nH\u0002J\t\u0010\u0084\u0001\u001a\u00020nH\u0002J\u0010\u0010\u0085\u0001\u001a\u0004\u0018\u00010?*\u00030\u0086\u0001H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR'\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b\"\u0010\u001aR\u001b\u0010$\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b)\u0010\u001aR\u000e\u0010+\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b.\u0010&R\u001b\u00100\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b1\u0010\u001aR'\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b4\u0010\u0011R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u000b\u001a\u0004\b8\u00109R\u001b\u0010;\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u000b\u001a\u0004\b<\u0010\u001aR\u000e\u0010>\u001a\u00020?X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010@\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u000b\u001a\u0004\bA\u0010&R\u001b\u0010C\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u000b\u001a\u0004\bD\u0010\u001aR\u001b\u0010F\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u000b\u001a\u0004\bH\u0010IR\u001b\u0010K\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\u000b\u001a\u0004\bM\u0010NR\u001b\u0010P\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u000b\u001a\u0004\bQ\u0010\u001aR\u001b\u0010S\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010\u000b\u001a\u0004\bU\u0010VR\"\u0010Y\u001a\u0004\u0018\u00010\u00052\b\u0010X\u001a\u0004\u0018\u00010\u0005@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\bZ\u0010[R\u001b\u0010\\\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010\u000b\u001a\u0004\b]\u0010&R\u001b\u0010_\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010\u000b\u001a\u0004\b`\u0010\u001aR\u001b\u0010b\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010\u000b\u001a\u0004\bc\u0010&R\u001b\u0010e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010\u000b\u001a\u0004\bf\u0010\u001aR\u001b\u0010h\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010\u000b\u001a\u0004\bj\u0010k¨\u0006\u0087\u0001"}, m28850d2 = {"Lco/omise/android/ui/CreditCardActivity;", "Lco/omise/android/ui/OmiseActivity;", "()V", "avsCountries", "", "Lco/omise/android/models/CountryInfo;", "billingAddressContainer", "Landroid/widget/LinearLayout;", "getBillingAddressContainer", "()Landroid/widget/LinearLayout;", "billingAddressContainer$delegate", "Lkotlin/Lazy;", "billingAddressEditTexts", "", "Lco/omise/android/ui/OmiseEditText;", "Landroid/widget/TextView;", "getBillingAddressEditTexts", "()Ljava/util/Map;", "billingAddressEditTexts$delegate", "cardNameEdit", "Lco/omise/android/ui/CardNameEditText;", "getCardNameEdit", "()Lco/omise/android/ui/CardNameEditText;", "cardNameEdit$delegate", "cardNameErrorText", "getCardNameErrorText", "()Landroid/widget/TextView;", "cardNameErrorText$delegate", "cardNumberEdit", "Lco/omise/android/ui/CreditCardEditText;", "getCardNumberEdit", "()Lco/omise/android/ui/CreditCardEditText;", "cardNumberEdit$delegate", "cardNumberErrorText", "getCardNumberErrorText", "cardNumberErrorText$delegate", "cityEdit", "getCityEdit", "()Lco/omise/android/ui/OmiseEditText;", "cityEdit$delegate", "cityErrorText", "getCityErrorText", "cityErrorText$delegate", "client", "Lco/omise/android/api/Client;", "countryEdit", "getCountryEdit", "countryEdit$delegate", "countryErrorText", "getCountryErrorText", "countryErrorText$delegate", "editTexts", "getEditTexts", "editTexts$delegate", "expiryDateEdit", "Lco/omise/android/ui/ExpiryDateEditText;", "getExpiryDateEdit", "()Lco/omise/android/ui/ExpiryDateEditText;", "expiryDateEdit$delegate", "expiryDateErrorText", "getExpiryDateErrorText", "expiryDateErrorText$delegate", "pKey", "", "postalCodeEdit", "getPostalCodeEdit", "postalCodeEdit$delegate", "postalCodeErrorText", "getPostalCodeErrorText", "postalCodeErrorText$delegate", "scrollView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "scrollView$delegate", "securityCodeEdit", "Lco/omise/android/ui/SecurityCodeEditText;", "getSecurityCodeEdit", "()Lco/omise/android/ui/SecurityCodeEditText;", "securityCodeEdit$delegate", "securityCodeErrorText", "getSecurityCodeErrorText", "securityCodeErrorText$delegate", "securityCodeTooltipButton", "Landroid/widget/ImageButton;", "getSecurityCodeTooltipButton", "()Landroid/widget/ImageButton;", "securityCodeTooltipButton$delegate", "value", "selectedCountry", "setSelectedCountry", "(Lco/omise/android/models/CountryInfo;)V", "stateEdit", "getStateEdit", "stateEdit$delegate", "stateErrorText", "getStateErrorText", "stateErrorText$delegate", "street1Edit", "getStreet1Edit", "street1Edit$delegate", "street1ErrorText", "getStreet1ErrorText", "street1ErrorText$delegate", "submitButton", "Landroid/widget/Button;", "getSubmitButton", "()Landroid/widget/Button;", "submitButton$delegate", "disableForm", "", "enableForm", "getCapability", "handleRequestFailed", "throwable", "", "initialize", "invalidateBillingAddressForm", "isBillingAddressRequired", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setClient", "setFormEnabled", "enabled", "showCountryDropdownDialog", "showSecurityCodeTooltipDialog", "submit", "updateSubmitButton", "getErrorMessage", "Landroid/widget/EditText;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.CreditCardActivity */
/* loaded from: classes3.dex */
public final class CreditCardActivity extends OmiseActivity {
    @NotNull
    private final List<CountryInfo> avsCountries;
    @NotNull
    private final Lazy billingAddressEditTexts$delegate;
    private Client client;
    @NotNull
    private final Lazy editTexts$delegate;
    private String pKey;
    @Nullable
    private CountryInfo selectedCountry;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy cardNumberEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5567e());
    @NotNull
    private final Lazy cardNameEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5565c());
    @NotNull
    private final Lazy expiryDateEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5574l());
    @NotNull
    private final Lazy securityCodeEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5583u());
    @NotNull
    private final Lazy countryEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5571i());
    @NotNull
    private final Lazy street1Edit$delegate = LazyKt__LazyJVMKt.lazy(new C5588z());
    @NotNull
    private final Lazy cityEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5569g());
    @NotNull
    private final Lazy stateEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5586x());
    @NotNull
    private final Lazy postalCodeEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5580r());
    @NotNull
    private final Lazy submitButton$delegate = LazyKt__LazyJVMKt.lazy(new C5564b0());
    @NotNull
    private final Lazy scrollView$delegate = LazyKt__LazyJVMKt.lazy(new C5582t());
    @NotNull
    private final Lazy cardNumberErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5568f());
    @NotNull
    private final Lazy cardNameErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5566d());
    @NotNull
    private final Lazy expiryDateErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5575m());
    @NotNull
    private final Lazy securityCodeErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5584v());
    @NotNull
    private final Lazy countryErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5572j());
    @NotNull
    private final Lazy street1ErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5562a0());
    @NotNull
    private final Lazy cityErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5570h());
    @NotNull
    private final Lazy stateErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5587y());
    @NotNull
    private final Lazy postalCodeErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5581s());
    @NotNull
    private final Lazy securityCodeTooltipButton$delegate = LazyKt__LazyJVMKt.lazy(new C5585w());
    @NotNull
    private final Lazy billingAddressContainer$delegate = LazyKt__LazyJVMKt.lazy(new C5561a());

    /* renamed from: co.omise.android.ui.CreditCardActivity$a */
    /* loaded from: classes3.dex */
    public static final class C5561a extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5561a() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LinearLayout invoke() {
            return (LinearLayout) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.billing_address_container);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$a0 */
    /* loaded from: classes3.dex */
    public static final class C5562a0 extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5562a0() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.text_street1_error);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$b */
    /* loaded from: classes3.dex */
    public static final class C5563b extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5563b() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map invoke() {
            return AbstractC11687a.mapOf(TuplesKt.m28844to(CreditCardActivity.this.getCountryEdit(), CreditCardActivity.this.getCountryErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getStreet1Edit(), CreditCardActivity.this.getStreet1ErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getCityEdit(), CreditCardActivity.this.getCityErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getStateEdit(), CreditCardActivity.this.getStateErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getPostalCodeEdit(), CreditCardActivity.this.getPostalCodeErrorText()));
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$b0 */
    /* loaded from: classes3.dex */
    public static final class C5564b0 extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5564b0() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Button invoke() {
            return (Button) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.button_submit);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$c */
    /* loaded from: classes3.dex */
    public static final class C5565c extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5565c() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CardNameEditText invoke() {
            return (CardNameEditText) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.edit_card_name);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$d */
    /* loaded from: classes3.dex */
    public static final class C5566d extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5566d() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.text_card_name_error);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$e */
    /* loaded from: classes3.dex */
    public static final class C5567e extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5567e() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CreditCardEditText invoke() {
            return (CreditCardEditText) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.edit_card_number);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$f */
    /* loaded from: classes3.dex */
    public static final class C5568f extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5568f() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.text_card_number_error);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$g */
    /* loaded from: classes3.dex */
    public static final class C5569g extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5569g() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.edit_city);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$h */
    /* loaded from: classes3.dex */
    public static final class C5570h extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5570h() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.text_city_error);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$i */
    /* loaded from: classes3.dex */
    public static final class C5571i extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5571i() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.edit_country);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$j */
    /* loaded from: classes3.dex */
    public static final class C5572j extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5572j() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.text_country_error);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$k */
    /* loaded from: classes3.dex */
    public static final class C5573k extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5573k() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map invoke() {
            return AbstractC11687a.mapOf(TuplesKt.m28844to(CreditCardActivity.this.getCardNumberEdit(), CreditCardActivity.this.getCardNumberErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getCardNameEdit(), CreditCardActivity.this.getCardNameErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getExpiryDateEdit(), CreditCardActivity.this.getExpiryDateErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getSecurityCodeEdit(), CreditCardActivity.this.getSecurityCodeErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getCountryEdit(), CreditCardActivity.this.getCountryErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getStreet1Edit(), CreditCardActivity.this.getStreet1ErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getCityEdit(), CreditCardActivity.this.getCityErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getStateEdit(), CreditCardActivity.this.getStateErrorText()), TuplesKt.m28844to(CreditCardActivity.this.getPostalCodeEdit(), CreditCardActivity.this.getPostalCodeErrorText()));
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$l */
    /* loaded from: classes3.dex */
    public static final class C5574l extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5574l() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ExpiryDateEditText invoke() {
            return (ExpiryDateEditText) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.edit_expiry_date);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$m */
    /* loaded from: classes3.dex */
    public static final class C5575m extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5575m() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.text_expiry_date_error);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5576n extends FunctionReferenceImpl implements Function0 {
        public C5576n(Object obj) {
            super(0, obj, CreditCardActivity.class, "submit", "submit()V", 0);
        }

        /* renamed from: a */
        public final void m51220a() {
            ((CreditCardActivity) this.receiver).submit();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51220a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5577o extends FunctionReferenceImpl implements Function0 {
        public C5577o(Object obj) {
            super(0, obj, CreditCardActivity.class, "showSecurityCodeTooltipDialog", "showSecurityCodeTooltipDialog()V", 0);
        }

        /* renamed from: a */
        public final void m51219a() {
            ((CreditCardActivity) this.receiver).showSecurityCodeTooltipDialog();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51219a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5578p extends FunctionReferenceImpl implements Function0 {
        public C5578p(Object obj) {
            super(0, obj, CreditCardActivity.class, "showCountryDropdownDialog", "showCountryDropdownDialog()V", 0);
        }

        /* renamed from: a */
        public final void m51218a() {
            ((CreditCardActivity) this.receiver).showCountryDropdownDialog();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51218a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5579q extends FunctionReferenceImpl implements Function0 {
        public C5579q(Object obj) {
            super(0, obj, CreditCardActivity.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51217a() {
            ((CreditCardActivity) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51217a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$r */
    /* loaded from: classes3.dex */
    public static final class C5580r extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5580r() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.edit_postal_code);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$s */
    /* loaded from: classes3.dex */
    public static final class C5581s extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5581s() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.text_postal_code_error);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$t */
    /* loaded from: classes3.dex */
    public static final class C5582t extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5582t() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ScrollView invoke() {
            return (ScrollView) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.scrollview);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$u */
    /* loaded from: classes3.dex */
    public static final class C5583u extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5583u() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SecurityCodeEditText invoke() {
            return (SecurityCodeEditText) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.edit_security_code);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$v */
    /* loaded from: classes3.dex */
    public static final class C5584v extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5584v() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.text_security_code_error);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$w */
    /* loaded from: classes3.dex */
    public static final class C5585w extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5585w() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ImageButton invoke() {
            return (ImageButton) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.button_security_code_tooltip);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$x */
    /* loaded from: classes3.dex */
    public static final class C5586x extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5586x() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.edit_state);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$y */
    /* loaded from: classes3.dex */
    public static final class C5587y extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5587y() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.text_state_error);
        }
    }

    /* renamed from: co.omise.android.ui.CreditCardActivity$z */
    /* loaded from: classes3.dex */
    public static final class C5588z extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5588z() {
            super(0);
            CreditCardActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) CreditCardActivity.this._$_findCachedViewById(C5511R.C5514id.edit_street1);
        }
    }

    public CreditCardActivity() {
        List<CountryInfo> all = CountryInfo.Companion.getALL();
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"US", "GB", "CA"}).contains(((CountryInfo) obj).getCode())) {
                arrayList.add(obj);
            }
        }
        this.avsCountries = arrayList;
        this.editTexts$delegate = LazyKt__LazyJVMKt.lazy(new C5573k());
        this.billingAddressEditTexts$delegate = LazyKt__LazyJVMKt.lazy(new C5563b());
    }

    public static final /* synthetic */ Client access$getClient$p(CreditCardActivity creditCardActivity) {
        return creditCardActivity.client;
    }

    public static final /* synthetic */ ScrollView access$getScrollView(CreditCardActivity creditCardActivity) {
        return creditCardActivity.getScrollView();
    }

    public static final /* synthetic */ void access$handleRequestFailed(CreditCardActivity creditCardActivity, Throwable th2) {
        creditCardActivity.handleRequestFailed(th2);
    }

    public static final /* synthetic */ void access$setSelectedCountry(CreditCardActivity creditCardActivity, CountryInfo countryInfo) {
        creditCardActivity.setSelectedCountry(countryInfo);
    }

    private final void disableForm() {
        setFormEnabled(false);
    }

    private final void enableForm() {
        setFormEnabled(true);
    }

    private final LinearLayout getBillingAddressContainer() {
        Object value = this.billingAddressContainer$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-billingAddressContainer>(...)");
        return (LinearLayout) value;
    }

    private final Map<OmiseEditText, TextView> getBillingAddressEditTexts() {
        return (Map) this.billingAddressEditTexts$delegate.getValue();
    }

    private final void getCapability() {
        Request<Capability> build = new Capability.GetCapabilitiesRequestBuilder().build();
        Client client = this.client;
        if (client == null) {
            Intrinsics.throwUninitializedPropertyAccessException("client");
            client = null;
        }
        client.send(build, new RequestListener<Capability>() { // from class: co.omise.android.ui.CreditCardActivity$getCapability$1
            @Override // co.omise.android.api.RequestListener
            public void onRequestFailed(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Snackbar.make(CreditCardActivity.access$getScrollView(CreditCardActivity.this), String.valueOf(throwable.getMessage()), 0).show();
            }

            @Override // co.omise.android.api.RequestListener
            public void onRequestSucceed(@NotNull Capability model) {
                Object obj;
                Intrinsics.checkNotNullParameter(model, "model");
                String country = model.getCountry();
                if (country == null) {
                    country = Locale.getDefault().getCountry();
                }
                CreditCardActivity creditCardActivity = CreditCardActivity.this;
                Iterator<T> it = CountryInfo.Companion.getALL().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((CountryInfo) obj).getCode(), country)) {
                        break;
                    }
                }
                CreditCardActivity.access$setSelectedCountry(creditCardActivity, (CountryInfo) obj);
            }
        });
    }

    public final CardNameEditText getCardNameEdit() {
        Object value = this.cardNameEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cardNameEdit>(...)");
        return (CardNameEditText) value;
    }

    public final TextView getCardNameErrorText() {
        Object value = this.cardNameErrorText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cardNameErrorText>(...)");
        return (TextView) value;
    }

    public final CreditCardEditText getCardNumberEdit() {
        Object value = this.cardNumberEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cardNumberEdit>(...)");
        return (CreditCardEditText) value;
    }

    public final TextView getCardNumberErrorText() {
        Object value = this.cardNumberErrorText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cardNumberErrorText>(...)");
        return (TextView) value;
    }

    public final OmiseEditText getCityEdit() {
        Object value = this.cityEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cityEdit>(...)");
        return (OmiseEditText) value;
    }

    public final TextView getCityErrorText() {
        Object value = this.cityErrorText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cityErrorText>(...)");
        return (TextView) value;
    }

    public final OmiseEditText getCountryEdit() {
        Object value = this.countryEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-countryEdit>(...)");
        return (OmiseEditText) value;
    }

    public final TextView getCountryErrorText() {
        Object value = this.countryErrorText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-countryErrorText>(...)");
        return (TextView) value;
    }

    private final Map<OmiseEditText, TextView> getEditTexts() {
        return (Map) this.editTexts$delegate.getValue();
    }

    private final String getErrorMessage(EditText editText) {
        if (Intrinsics.areEqual(editText, getCardNumberEdit())) {
            return getString(C5511R.C5518string.error_invalid_card_number);
        }
        if (Intrinsics.areEqual(editText, getCardNameEdit())) {
            return getString(C5511R.C5518string.error_invalid_card_name);
        }
        if (Intrinsics.areEqual(editText, getExpiryDateEdit())) {
            return getString(C5511R.C5518string.error_invalid_expiration_date);
        }
        if (Intrinsics.areEqual(editText, getSecurityCodeEdit())) {
            return getString(C5511R.C5518string.error_invalid_security_code);
        }
        if (Intrinsics.areEqual(editText, getStreet1Edit())) {
            return getString(C5511R.C5518string.error_required_street1);
        }
        if (Intrinsics.areEqual(editText, getCityEdit())) {
            return getString(C5511R.C5518string.error_required_city);
        }
        if (Intrinsics.areEqual(editText, getStateEdit())) {
            return getString(C5511R.C5518string.error_required_state);
        }
        if (Intrinsics.areEqual(editText, getPostalCodeEdit())) {
            return getString(C5511R.C5518string.error_required_postal_code);
        }
        return null;
    }

    public final ExpiryDateEditText getExpiryDateEdit() {
        Object value = this.expiryDateEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-expiryDateEdit>(...)");
        return (ExpiryDateEditText) value;
    }

    public final TextView getExpiryDateErrorText() {
        Object value = this.expiryDateErrorText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-expiryDateErrorText>(...)");
        return (TextView) value;
    }

    public final OmiseEditText getPostalCodeEdit() {
        Object value = this.postalCodeEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-postalCodeEdit>(...)");
        return (OmiseEditText) value;
    }

    public final TextView getPostalCodeErrorText() {
        Object value = this.postalCodeErrorText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-postalCodeErrorText>(...)");
        return (TextView) value;
    }

    public final ScrollView getScrollView() {
        Object value = this.scrollView$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-scrollView>(...)");
        return (ScrollView) value;
    }

    public final SecurityCodeEditText getSecurityCodeEdit() {
        Object value = this.securityCodeEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-securityCodeEdit>(...)");
        return (SecurityCodeEditText) value;
    }

    public final TextView getSecurityCodeErrorText() {
        Object value = this.securityCodeErrorText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-securityCodeErrorText>(...)");
        return (TextView) value;
    }

    private final ImageButton getSecurityCodeTooltipButton() {
        Object value = this.securityCodeTooltipButton$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-securityCodeTooltipButton>(...)");
        return (ImageButton) value;
    }

    public final OmiseEditText getStateEdit() {
        Object value = this.stateEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-stateEdit>(...)");
        return (OmiseEditText) value;
    }

    public final TextView getStateErrorText() {
        Object value = this.stateErrorText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-stateErrorText>(...)");
        return (TextView) value;
    }

    public final OmiseEditText getStreet1Edit() {
        Object value = this.street1Edit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-street1Edit>(...)");
        return (OmiseEditText) value;
    }

    public final TextView getStreet1ErrorText() {
        Object value = this.street1ErrorText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-street1ErrorText>(...)");
        return (TextView) value;
    }

    private final Button getSubmitButton() {
        Object value = this.submitButton$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-submitButton>(...)");
        return (Button) value;
    }

    public final void handleRequestFailed(Throwable th2) {
        String string;
        enableForm();
        if (th2 instanceof IOError) {
            string = getString(C5511R.C5518string.error_io, th2.getMessage());
        } else if (th2 instanceof APIError) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
            string = APIErrorExtensionsKt.getMessageFromResources((APIError) th2, resources);
        } else {
            string = getString(C5511R.C5518string.error_unknown, th2.getMessage());
        }
        Intrinsics.checkNotNullExpressionValue(string, "when (throwable) {\n     …le.message)\n            }");
        Snackbar.make(getScrollView(), string, 0).show();
    }

    private final void initialize() {
        setTitle(C5511R.C5518string.default_form_title);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ViewExtensionsKt.setOnClickListener(getSubmitButton(), new C5576n(this));
        ViewExtensionsKt.setOnClickListener(getSecurityCodeTooltipButton(), new C5577o(this));
        ViewExtensionsKt.setOnClickListener(getCountryEdit(), new C5578p(this));
        for (Map.Entry<OmiseEditText, TextView> entry : getEditTexts().entrySet()) {
            final OmiseEditText key = entry.getKey();
            final TextView value = entry.getValue();
            key.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Oz
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    CreditCardActivity.m51236v(key, value, this, view, z);
                }
            });
            EditTextExtensionsKt.setOnAfterTextChangeListener(key, new C5579q(this));
        }
        invalidateBillingAddressForm();
        getCapability();
    }

    /* renamed from: initialize$lambda-5$lambda-4 */
    public static final void m73942initialize$lambda5$lambda4(OmiseEditText editText, TextView errorText, CreditCardActivity this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(editText, "$editText");
        Intrinsics.checkNotNullParameter(errorText, "$errorText");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            try {
                editText.validate();
                return;
            } catch (InputValidationException.EmptyInputException unused) {
                if (this$0.isBillingAddressRequired()) {
                    errorText.setText(this$0.getErrorMessage(editText));
                    return;
                } else {
                    errorText.setText((CharSequence) null);
                    return;
                }
            } catch (InputValidationException.InvalidInputException unused2) {
                errorText.setText(this$0.getErrorMessage(editText));
                return;
            }
        }
        errorText.setText((CharSequence) null);
    }

    private final void invalidateBillingAddressForm() {
        String str;
        int i;
        OmiseEditText countryEdit = getCountryEdit();
        CountryInfo countryInfo = this.selectedCountry;
        if (countryInfo != null) {
            str = countryInfo.getName();
        } else {
            str = null;
        }
        countryEdit.setText(str);
        LinearLayout billingAddressContainer = getBillingAddressContainer();
        if (isBillingAddressRequired()) {
            i = 0;
        } else {
            i = 8;
        }
        billingAddressContainer.setVisibility(i);
        for (Map.Entry<OmiseEditText, TextView> entry : getBillingAddressEditTexts().entrySet()) {
            OmiseEditText key = entry.getKey();
            TextView value = entry.getValue();
            if (!Intrinsics.areEqual(key, getCountryEdit())) {
                key.setText((CharSequence) null);
                value.setText((CharSequence) null);
            }
        }
    }

    private final boolean isBillingAddressRequired() {
        CountryInfo countryInfo = this.selectedCountry;
        if (countryInfo != null && CollectionsKt___CollectionsKt.contains(this.avsCountries, countryInfo)) {
            return true;
        }
        return false;
    }

    private final void setFormEnabled(boolean z) {
        for (Map.Entry<OmiseEditText, TextView> entry : getEditTexts().entrySet()) {
            entry.getKey().setEnabled(z);
        }
        getSubmitButton().setEnabled(z);
    }

    public final void setSelectedCountry(CountryInfo countryInfo) {
        this.selectedCountry = countryInfo;
        if (countryInfo != null) {
            invalidateBillingAddressForm();
        }
    }

    public final void showCountryDropdownDialog() {
        CountryListDialogFragment countryListDialogFragment = new CountryListDialogFragment();
        countryListDialogFragment.setListener(new CountryListDialogFragment.CountryListDialogListener() { // from class: co.omise.android.ui.CreditCardActivity$showCountryDropdownDialog$1
            @Override // co.omise.android.p009ui.CountryListDialogFragment.CountryListDialogListener
            public void onCountrySelected(@NotNull CountryInfo country) {
                Intrinsics.checkNotNullParameter(country, "country");
                CreditCardActivity.access$setSelectedCountry(CreditCardActivity.this, country);
            }
        });
        countryListDialogFragment.show(getSupportFragmentManager(), (String) null);
    }

    public final void showSecurityCodeTooltipDialog() {
        SecurityCodeTooltipDialogFragment.Companion.newInstant(CardNumber.brand(getCardNumberEdit().getCardNumber())).show(getSupportFragmentManager(), (String) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [T, co.omise.android.api.Request] */
    public final void submit() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Parcelable parcelable;
        BackendType.Source source;
        SourceType sourceType;
        Parcelable parcelable2;
        Object parcelableExtra;
        Object parcelableExtra2;
        disableForm();
        String cardName = getCardNameEdit().getCardName();
        String cardNumber = getCardNumberEdit().getCardNumber();
        int expiryMonth = getExpiryDateEdit().getExpiryMonth();
        int expiryYear = getExpiryDateEdit().getExpiryYear();
        String securityCode = getSecurityCodeEdit().getSecurityCode();
        CountryInfo countryInfo = this.selectedCountry;
        if (countryInfo != null) {
            str = countryInfo.getCode();
        } else {
            str = null;
        }
        Editable textOrNull = EditTextExtensionsKt.getTextOrNull(getStreet1Edit());
        if (textOrNull != null) {
            str2 = textOrNull.toString();
        } else {
            str2 = null;
        }
        Editable textOrNull2 = EditTextExtensionsKt.getTextOrNull(getCityEdit());
        if (textOrNull2 != null) {
            str3 = textOrNull2.toString();
        } else {
            str3 = null;
        }
        Editable textOrNull3 = EditTextExtensionsKt.getTextOrNull(getStateEdit());
        if (textOrNull3 != null) {
            str4 = textOrNull3.toString();
        } else {
            str4 = null;
        }
        Editable textOrNull4 = EditTextExtensionsKt.getTextOrNull(getPostalCodeEdit());
        if (textOrNull4 != null) {
            str5 = textOrNull4.toString();
        } else {
            str5 = null;
        }
        Request<Token> build = new Token.CreateTokenRequestBuilder(new CardParam(cardName, cardNumber, expiryMonth, expiryYear, securityCode, str3, str4, str5, str, str2, null, null, 3072, null), null, 2, null).build();
        int intExtra = getIntent().getIntExtra(OmiseActivity.EXTRA_SELECTED_INSTALLMENTS_TERM, 0);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (intExtra != 0) {
            long longExtra = getIntent().getLongExtra(OmiseActivity.EXTRA_AMOUNT, 0L);
            String stringExtra = getIntent().getStringExtra(OmiseActivity.EXTRA_CURRENCY);
            if (stringExtra != null) {
                Intrinsics.checkNotNullExpressionValue(stringExtra, "requireNotNull(intent.ge…ame} must not be null.\" }");
                Intent intent = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "intent");
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    parcelableExtra2 = intent.getParcelableExtra(OmiseActivity.EXTRA_SELECTED_INSTALLMENTS_PAYMENT_METHOD, PaymentMethod.class);
                    parcelable = (Parcelable) parcelableExtra2;
                } else {
                    Parcelable parcelableExtra3 = intent.getParcelableExtra(OmiseActivity.EXTRA_SELECTED_INSTALLMENTS_PAYMENT_METHOD);
                    if (!(parcelableExtra3 instanceof PaymentMethod)) {
                        parcelableExtra3 = null;
                    }
                    parcelable = (PaymentMethod) parcelableExtra3;
                }
                if (parcelable != null) {
                    BackendType backendType = PaymentMethodKt.getBackendType((PaymentMethod) parcelable);
                    if (backendType instanceof BackendType.Source) {
                        source = (BackendType.Source) backendType;
                    } else {
                        source = null;
                    }
                    if (source != null && (sourceType = source.getSourceType()) != null) {
                        Intent intent2 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent2, "intent");
                        if (i >= 33) {
                            parcelableExtra = intent2.getParcelableExtra(OmiseActivity.EXTRA_CAPABILITY, Capability.class);
                            parcelable2 = (Parcelable) parcelableExtra;
                        } else {
                            Parcelable parcelableExtra4 = intent2.getParcelableExtra(OmiseActivity.EXTRA_CAPABILITY);
                            if (!(parcelableExtra4 instanceof Capability)) {
                                parcelableExtra4 = null;
                            }
                            parcelable2 = (Capability) parcelableExtra4;
                        }
                        if (parcelable2 != null) {
                            objectRef.element = new Source.CreateSourceRequestBuilder(longExtra, stringExtra, sourceType).installmentTerm(intExtra).zeroInterestInstallments(((Capability) parcelable2).getZeroInterestInstallments()).build();
                        } else {
                            throw new IllegalArgumentException(("EXTRA_CAPABILITY must not be null.").toString());
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalArgumentException(("EXTRA_SELECTED_INSTALLMENTS_PAYMENT_METHOD must not be null.").toString());
                }
            } else {
                throw new IllegalArgumentException(("EXTRA_CURRENCY must not be null.").toString());
            }
        }
        Client client = this.client;
        if (client == null) {
            Intrinsics.throwUninitializedPropertyAccessException("client");
            client = null;
        }
        client.send(build, new RequestListener<Token>() { // from class: co.omise.android.ui.CreditCardActivity$submit$1
            @Override // co.omise.android.api.RequestListener
            public void onRequestFailed(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                CreditCardActivity.access$handleRequestFailed(this, throwable);
            }

            @Override // co.omise.android.api.RequestListener
            public void onRequestSucceed(@NotNull Token model) {
                Intrinsics.checkNotNullParameter(model, "model");
                final Intent intent3 = new Intent();
                intent3.putExtra(OmiseActivity.EXTRA_TOKEN, model.getId());
                intent3.putExtra(OmiseActivity.EXTRA_TOKEN_OBJECT, model);
                intent3.putExtra(OmiseActivity.EXTRA_CARD_OBJECT, model.getCard());
                if (objectRef.element == null) {
                    this.setResult(-1, intent3);
                    this.finish();
                    return;
                }
                Client access$getClient$p = CreditCardActivity.access$getClient$p(this);
                if (access$getClient$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("client");
                    access$getClient$p = null;
                }
                final CreditCardActivity creditCardActivity = this;
                access$getClient$p.send(objectRef.element, new RequestListener<Source>() { // from class: co.omise.android.ui.CreditCardActivity$submit$1$onRequestSucceed$1
                    @Override // co.omise.android.api.RequestListener
                    public void onRequestFailed(@NotNull Throwable throwable) {
                        Intrinsics.checkNotNullParameter(throwable, "throwable");
                        CreditCardActivity.access$handleRequestFailed(creditCardActivity, throwable);
                    }

                    @Override // co.omise.android.api.RequestListener
                    public void onRequestSucceed(@NotNull Source model2) {
                        Intrinsics.checkNotNullParameter(model2, "model");
                        intent3.putExtra(OmiseActivity.EXTRA_SOURCE_OBJECT, model2);
                        creditCardActivity.setResult(-1, intent3);
                        creditCardActivity.finish();
                    }
                });
            }
        });
    }

    public final void updateSubmitButton() {
        boolean z;
        Map<OmiseEditText, TextView> editTexts = getEditTexts();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<OmiseEditText, TextView> entry : editTexts.entrySet()) {
            OmiseEditText key = entry.getKey();
            if (isBillingAddressRequired() || !getBillingAddressEditTexts().containsKey(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(Boolean.valueOf(((OmiseEditText) entry2.getKey()).isValid()));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                boolean booleanValue = ((Boolean) it.next()).booleanValue();
                if (((Boolean) next).booleanValue() && booleanValue) {
                    z = true;
                } else {
                    z = false;
                }
                next = Boolean.valueOf(z);
            }
            getSubmitButton().setEnabled(((Boolean) next).booleanValue());
            return;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* renamed from: v */
    public static /* synthetic */ void m51236v(OmiseEditText omiseEditText, TextView textView, CreditCardActivity creditCardActivity, View view, boolean z) {
        m73942initialize$lambda5$lambda4(omiseEditText, textView, creditCardActivity, view, z);
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra(OmiseActivity.EXTRA_IS_SECURE, true)) {
            getWindow().addFlags(8192);
        }
        setContentView(C5511R.C5515layout.activity_credit_card);
        if (getIntent().hasExtra(OmiseActivity.EXTRA_PKEY)) {
            String stringExtra = getIntent().getStringExtra(OmiseActivity.EXTRA_PKEY);
            if (stringExtra != null) {
                this.pKey = stringExtra;
                if (this.client == null) {
                    this.client = new Client(stringExtra);
                }
                getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: co.omise.android.ui.CreditCardActivity$onCreate$onBackPressedCallback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(true);
                        CreditCardActivity.this = this;
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        CreditCardActivity.this.setResult(0);
                        CreditCardActivity.this.finish();
                    }
                });
                initialize();
                return;
            }
            throw new IllegalArgumentException(("EXTRA_PKEY must not be null.").toString());
        }
        throw new IllegalArgumentException(("Could not find EXTRA_PKEY.").toString());
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

    public final void setClient(@NotNull Client client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }
}
