package co.omise.android.p009ui;

import android.os.Bundle;
import android.text.Editable;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.omise.android.C5511R;
import co.omise.android.api.Request;
import co.omise.android.extensions.EditTextExtensionsKt;
import co.omise.android.extensions.ViewExtensionsKt;
import co.omise.android.models.Billing;
import co.omise.android.models.Item;
import co.omise.android.models.Shipping;
import co.omise.android.models.Source;
import co.omise.android.models.SourceType;
import co.omise.android.p009ui.AtomeFormFragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u000bH\u0002J\u0010\u0010J\u001a\u00020H2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010K\u001a\u00020H2\u0006\u0010&\u001a\u00020\u000bH\u0002J\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0002J&\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010T2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\u001a\u0010W\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\b\u0010X\u001a\u00020MH\u0002J\u0010\u0010Y\u001a\u00020M2\u0006\u0010Z\u001a\u00020HH\u0002J\u0010\u0010[\u001a\u00020M2\u0006\u0010Z\u001a\u00020HH\u0002J\u0010\u0010\\\u001a\u00020M2\u0006\u0010Z\u001a\u00020HH\u0002J\u0010\u0010]\u001a\u00020M2\u0006\u0010Z\u001a\u00020HH\u0002J\b\u0010^\u001a\u00020MH\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR#\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\rR#\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\rR#\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\rR#\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001e\u0010\rR#\u0010 \u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b!\u0010\u0007R\u001b\u0010#\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b$\u0010\rR\u001b\u0010&\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b'\u0010\rR#\u0010)\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\t\u001a\u0004\b*\u0010\u0007R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R#\u00103\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\t\u001a\u0004\b4\u0010\u0007R#\u00106\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\t\u001a\u0004\b7\u0010\rR#\u00109\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b:\u0010\rR#\u0010<\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\t\u001a\u0004\b=\u0010\rR#\u0010?\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\b@\u0010\rR\u001b\u0010B\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\t\u001a\u0004\bD\u0010E¨\u0006_"}, m28850d2 = {"Lco/omise/android/ui/AtomeFormFragment;", "Lco/omise/android/ui/OmiseFragment;", "()V", "billingAddressErrorText", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getBillingAddressErrorText", "()Landroid/widget/TextView;", "billingAddressErrorText$delegate", "Lkotlin/Lazy;", "billingCityEdit", "Lco/omise/android/ui/OmiseEditText;", "getBillingCityEdit", "()Lco/omise/android/ui/OmiseEditText;", "billingCityEdit$delegate", "billingCountryEdit", "getBillingCountryEdit", "billingCountryEdit$delegate", "billingPostalEdit", "getBillingPostalEdit", "billingPostalEdit$delegate", "billingStreetEdit", "getBillingStreetEdit", "billingStreetEdit$delegate", "checkBoxBillingShipping", "Landroid/widget/CheckBox;", "getCheckBoxBillingShipping", "()Landroid/widget/CheckBox;", "checkBoxBillingShipping$delegate", "emailEdit", "getEmailEdit", "emailEdit$delegate", "emailErrorText", "getEmailErrorText", "emailErrorText$delegate", "fullNameEdit", "getFullNameEdit", "fullNameEdit$delegate", "phoneNumberEdit", "getPhoneNumberEdit", "phoneNumberEdit$delegate", "phoneNumberErrorText", "getPhoneNumberErrorText", "phoneNumberErrorText$delegate", "requester", "Lco/omise/android/ui/PaymentCreatorRequester;", "Lco/omise/android/models/Source;", "getRequester", "()Lco/omise/android/ui/PaymentCreatorRequester;", "setRequester", "(Lco/omise/android/ui/PaymentCreatorRequester;)V", "shippingAddressErrorText", "getShippingAddressErrorText", "shippingAddressErrorText$delegate", "shippingCityEdit", "getShippingCityEdit", "shippingCityEdit$delegate", "shippingCountryEdit", "getShippingCountryEdit", "shippingCountryEdit$delegate", "shippingPostalEdit", "getShippingPostalEdit", "shippingPostalEdit$delegate", "shippingStreetEdit", "getShippingStreetEdit", "shippingStreetEdit$delegate", "submitButton", "Landroid/widget/Button;", "getSubmitButton", "()Landroid/widget/Button;", "submitButton$delegate", "isCountryCodeValid", "", "countryCodeEdit", "isEmailValid", "isPhoneNumberValid", "onBillingShippingCheckboxClicked", "", Promotion.ACTION_VIEW, "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "submitForm", "updateBillingAddressErrorText", "hasFocus", "updateEmailErrorText", "updatePhoneErrorText", "updateShippingAddressErrorText", "updateSubmitButton", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.AtomeFormFragment */
/* loaded from: classes3.dex */
public final class AtomeFormFragment extends OmiseFragment {
    @Nullable
    private PaymentCreatorRequester<Source> requester;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy fullNameEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5533i());
    @NotNull
    private final Lazy emailEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5531g());
    @NotNull
    private final Lazy emailErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5532h());
    @NotNull
    private final Lazy phoneNumberEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5542r());
    @NotNull
    private final Lazy phoneNumberErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5543s());
    @NotNull
    private final Lazy shippingStreetEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5548x());
    @NotNull
    private final Lazy shippingPostalEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5547w());
    @NotNull
    private final Lazy shippingCityEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5545u());
    @NotNull
    private final Lazy shippingCountryEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5546v());
    @NotNull
    private final Lazy shippingAddressErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5544t());
    @NotNull
    private final Lazy billingStreetEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5529e());
    @NotNull
    private final Lazy billingPostalEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5528d());
    @NotNull
    private final Lazy billingCityEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5526b());
    @NotNull
    private final Lazy billingCountryEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5527c());
    @NotNull
    private final Lazy billingAddressErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5525a());
    @NotNull
    private final Lazy checkBoxBillingShipping$delegate = LazyKt__LazyJVMKt.lazy(new C5530f());
    @NotNull
    private final Lazy submitButton$delegate = LazyKt__LazyJVMKt.lazy(new C5549y());

    /* renamed from: co.omise.android.ui.AtomeFormFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5525a extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5525a() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.text_billing_address_error);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$b */
    /* loaded from: classes3.dex */
    public static final class C5526b extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5526b() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_billing_city);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$c */
    /* loaded from: classes3.dex */
    public static final class C5527c extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5527c() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_billing_country);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$d */
    /* loaded from: classes3.dex */
    public static final class C5528d extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5528d() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_billing_postal);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$e */
    /* loaded from: classes3.dex */
    public static final class C5529e extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5529e() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_billing_street);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$f */
    /* loaded from: classes3.dex */
    public static final class C5530f extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5530f() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CheckBox invoke() {
            return (CheckBox) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.checkbox_billing_shipping);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$g */
    /* loaded from: classes3.dex */
    public static final class C5531g extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5531g() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_email);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$h */
    /* loaded from: classes3.dex */
    public static final class C5532h extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5532h() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.text_atome_email_error);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$i */
    /* loaded from: classes3.dex */
    public static final class C5533i extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5533i() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_full_name);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5534j extends FunctionReferenceImpl implements Function0 {
        public C5534j(Object obj) {
            super(0, obj, AtomeFormFragment.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51278a() {
            ((AtomeFormFragment) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51278a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5535k extends FunctionReferenceImpl implements Function0 {
        public C5535k(Object obj) {
            super(0, obj, AtomeFormFragment.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51277a() {
            ((AtomeFormFragment) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51277a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5536l extends FunctionReferenceImpl implements Function0 {
        public C5536l(Object obj) {
            super(0, obj, AtomeFormFragment.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51276a() {
            ((AtomeFormFragment) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51276a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5537m extends FunctionReferenceImpl implements Function0 {
        public C5537m(Object obj) {
            super(0, obj, AtomeFormFragment.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51275a() {
            ((AtomeFormFragment) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51275a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5538n extends FunctionReferenceImpl implements Function0 {
        public C5538n(Object obj) {
            super(0, obj, AtomeFormFragment.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51274a() {
            ((AtomeFormFragment) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51274a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5539o extends FunctionReferenceImpl implements Function0 {
        public C5539o(Object obj) {
            super(0, obj, AtomeFormFragment.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51273a() {
            ((AtomeFormFragment) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51273a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5540p extends FunctionReferenceImpl implements Function0 {
        public C5540p(Object obj) {
            super(0, obj, AtomeFormFragment.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51272a() {
            ((AtomeFormFragment) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51272a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5541q extends FunctionReferenceImpl implements Function0 {
        public C5541q(Object obj) {
            super(0, obj, AtomeFormFragment.class, "submitForm", "submitForm()V", 0);
        }

        /* renamed from: a */
        public final void m51271a() {
            ((AtomeFormFragment) this.receiver).submitForm();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51271a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$r */
    /* loaded from: classes3.dex */
    public static final class C5542r extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5542r() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_phone_number);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$s */
    /* loaded from: classes3.dex */
    public static final class C5543s extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5543s() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.text_phone_number_error);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$t */
    /* loaded from: classes3.dex */
    public static final class C5544t extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5544t() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.text_shipping_address_error);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$u */
    /* loaded from: classes3.dex */
    public static final class C5545u extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5545u() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_shipping_city);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$v */
    /* loaded from: classes3.dex */
    public static final class C5546v extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5546v() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_shipping_country);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$w */
    /* loaded from: classes3.dex */
    public static final class C5547w extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5547w() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_shipping_postal);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$x */
    /* loaded from: classes3.dex */
    public static final class C5548x extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5548x() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.edit_shipping_street);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$y */
    /* loaded from: classes3.dex */
    public static final class C5549y extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5549y() {
            super(0);
            AtomeFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Button invoke() {
            return (Button) AtomeFormFragment.this._$_findCachedViewById(C5511R.C5514id.button_submit);
        }
    }

    /* renamed from: co.omise.android.ui.AtomeFormFragment$z */
    /* loaded from: classes3.dex */
    public static final class C5550z extends Lambda implements Function1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5550z() {
            super(1);
            AtomeFormFragment.this = r1;
        }

        /* renamed from: a */
        public final void m51262a(Object obj) {
            View view = AtomeFormFragment.this.getView();
            if (view != null) {
                AtomeFormFragment.this.setAllViewsEnabled(view, true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51262a(((Result) obj).m74096unboximpl());
            return Unit.INSTANCE;
        }
    }

    private final TextView getBillingAddressErrorText() {
        return (TextView) this.billingAddressErrorText$delegate.getValue();
    }

    private final OmiseEditText getBillingCityEdit() {
        return (OmiseEditText) this.billingCityEdit$delegate.getValue();
    }

    private final OmiseEditText getBillingCountryEdit() {
        return (OmiseEditText) this.billingCountryEdit$delegate.getValue();
    }

    private final OmiseEditText getBillingPostalEdit() {
        return (OmiseEditText) this.billingPostalEdit$delegate.getValue();
    }

    private final OmiseEditText getBillingStreetEdit() {
        return (OmiseEditText) this.billingStreetEdit$delegate.getValue();
    }

    private final CheckBox getCheckBoxBillingShipping() {
        return (CheckBox) this.checkBoxBillingShipping$delegate.getValue();
    }

    private final OmiseEditText getEmailEdit() {
        Object value = this.emailEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-emailEdit>(...)");
        return (OmiseEditText) value;
    }

    private final TextView getEmailErrorText() {
        return (TextView) this.emailErrorText$delegate.getValue();
    }

    private final OmiseEditText getFullNameEdit() {
        Object value = this.fullNameEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-fullNameEdit>(...)");
        return (OmiseEditText) value;
    }

    private final OmiseEditText getPhoneNumberEdit() {
        Object value = this.phoneNumberEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-phoneNumberEdit>(...)");
        return (OmiseEditText) value;
    }

    private final TextView getPhoneNumberErrorText() {
        return (TextView) this.phoneNumberErrorText$delegate.getValue();
    }

    private final TextView getShippingAddressErrorText() {
        return (TextView) this.shippingAddressErrorText$delegate.getValue();
    }

    private final OmiseEditText getShippingCityEdit() {
        return (OmiseEditText) this.shippingCityEdit$delegate.getValue();
    }

    private final OmiseEditText getShippingCountryEdit() {
        return (OmiseEditText) this.shippingCountryEdit$delegate.getValue();
    }

    private final OmiseEditText getShippingPostalEdit() {
        return (OmiseEditText) this.shippingPostalEdit$delegate.getValue();
    }

    private final OmiseEditText getShippingStreetEdit() {
        return (OmiseEditText) this.shippingStreetEdit$delegate.getValue();
    }

    private final Button getSubmitButton() {
        Object value = this.submitButton$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-submitButton>(...)");
        return (Button) value;
    }

    private final boolean isCountryCodeValid(OmiseEditText omiseEditText) {
        if (omiseEditText.length() == 2) {
            return true;
        }
        return false;
    }

    private final boolean isEmailValid(OmiseEditText omiseEditText) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        Editable text = omiseEditText.getText();
        Intrinsics.checkNotNull(text);
        return pattern.matcher(text).matches();
    }

    private final boolean isPhoneNumberValid(OmiseEditText omiseEditText) {
        Pattern pattern = Patterns.PHONE;
        Editable text = omiseEditText.getText();
        Intrinsics.checkNotNull(text);
        return pattern.matcher(text).matches();
    }

    /* renamed from: m */
    public static /* synthetic */ void m51293m(AtomeFormFragment atomeFormFragment, View view, boolean z) {
        m73922onViewCreated$lambda3$lambda2(atomeFormFragment, view, z);
    }

    /* renamed from: n */
    public static /* synthetic */ void m51292n(AtomeFormFragment atomeFormFragment, View view, boolean z) {
        m73920onViewCreated$lambda1$lambda0(atomeFormFragment, view, z);
    }

    /* renamed from: o */
    public static /* synthetic */ void m51291o(AtomeFormFragment atomeFormFragment, View view, boolean z) {
        m73923onViewCreated$lambda5$lambda4(atomeFormFragment, view, z);
    }

    public final void onBillingShippingCheckboxClicked(View view) {
        if (view instanceof CheckBox) {
            CheckBox checkBox = (CheckBox) view;
            boolean isChecked = checkBox.isChecked();
            if (checkBox.getId() == C5511R.C5514id.checkbox_billing_shipping) {
                if (isChecked) {
                    ((LinearLayout) _$_findCachedViewById(C5511R.C5514id.billing_address)).setVisibility(8);
                } else {
                    ((LinearLayout) _$_findCachedViewById(C5511R.C5514id.billing_address)).setVisibility(0);
                }
            }
        }
    }

    /* renamed from: onViewCreated$lambda-1$lambda-0 */
    public static final void m73920onViewCreated$lambda1$lambda0(AtomeFormFragment this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateEmailErrorText(z);
    }

    /* renamed from: onViewCreated$lambda-11$lambda-10 */
    public static final void m73921onViewCreated$lambda11$lambda10(AtomeFormFragment this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateBillingAddressErrorText(z);
    }

    /* renamed from: onViewCreated$lambda-3$lambda-2 */
    public static final void m73922onViewCreated$lambda3$lambda2(AtomeFormFragment this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updatePhoneErrorText(z);
    }

    /* renamed from: onViewCreated$lambda-5$lambda-4 */
    public static final void m73923onViewCreated$lambda5$lambda4(AtomeFormFragment this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateShippingAddressErrorText(z);
    }

    /* renamed from: onViewCreated$lambda-9$lambda-8 */
    public static final void m73924onViewCreated$lambda9$lambda8(AtomeFormFragment this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateShippingAddressErrorText(z);
    }

    /* renamed from: p */
    public static /* synthetic */ void m51290p(AtomeFormFragment atomeFormFragment, View view, boolean z) {
        m73924onViewCreated$lambda9$lambda8(atomeFormFragment, view, z);
    }

    /* renamed from: q */
    public static /* synthetic */ void m51289q(AtomeFormFragment atomeFormFragment, View view) {
        atomeFormFragment.onBillingShippingCheckboxClicked(view);
    }

    /* renamed from: r */
    public static /* synthetic */ void m51288r(AtomeFormFragment atomeFormFragment, View view, boolean z) {
        m73921onViewCreated$lambda11$lambda10(atomeFormFragment, view, z);
    }

    public final void submitForm() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String obj;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        String obj6;
        String obj7;
        String obj8;
        String obj9;
        String obj10;
        String obj11;
        PaymentCreatorRequester<Source> paymentCreatorRequester = this.requester;
        if (paymentCreatorRequester == null) {
            return;
        }
        Source.CreateSourceRequestBuilder createSourceRequestBuilder = new Source.CreateSourceRequestBuilder(paymentCreatorRequester.getAmount(), paymentCreatorRequester.getCurrency(), SourceType.Atome.INSTANCE);
        Editable text = getFullNameEdit().getText();
        if (text != null && (obj11 = text.toString()) != null) {
            str = StringsKt__StringsKt.trim(obj11).toString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        createSourceRequestBuilder.name(str);
        Editable text2 = getEmailEdit().getText();
        if (text2 != null && (obj10 = text2.toString()) != null) {
            str2 = StringsKt__StringsKt.trim(obj10).toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        createSourceRequestBuilder.email(str2);
        Editable text3 = getPhoneNumberEdit().getText();
        if (text3 != null && (obj9 = text3.toString()) != null) {
            str3 = StringsKt__StringsKt.trim(obj9).toString();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        createSourceRequestBuilder.phoneNumber(str3);
        Editable text4 = getShippingStreetEdit().getText();
        if (text4 != null && (obj8 = text4.toString()) != null) {
            str4 = StringsKt__StringsKt.trim(obj8).toString();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        Editable text5 = getShippingPostalEdit().getText();
        if (text5 != null && (obj7 = text5.toString()) != null) {
            str5 = StringsKt__StringsKt.trim(obj7).toString();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        Editable text6 = getShippingCityEdit().getText();
        if (text6 != null && (obj6 = text6.toString()) != null) {
            str7 = StringsKt__StringsKt.trim(obj6).toString();
        } else {
            str7 = null;
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        Editable text7 = getShippingCountryEdit().getText();
        if (text7 != null && (obj5 = text7.toString()) != null) {
            str9 = StringsKt__StringsKt.trim(obj5).toString();
        } else {
            str9 = null;
        }
        if (str9 == null) {
            str10 = "";
        } else {
            str10 = str9;
        }
        createSourceRequestBuilder.shipping(new Shipping(str8, str10, str6, null, str4, null, 40, null)).items(AbstractC10108ds.listOf(new Item("3427842", "Shoes", "Prada shoes", "1", String.valueOf(paymentCreatorRequester.getAmount()), "www.kan.com/product/shoes", "www.kan.com/product/shoes/image", "Gucci")));
        if (!getCheckBoxBillingShipping().isChecked()) {
            Editable text8 = getBillingStreetEdit().getText();
            if (text8 != null && (obj4 = text8.toString()) != null) {
                str11 = StringsKt__StringsKt.trim(obj4).toString();
            } else {
                str11 = null;
            }
            if (str11 == null) {
                str12 = "";
            } else {
                str12 = str11;
            }
            Editable text9 = getBillingPostalEdit().getText();
            if (text9 != null && (obj3 = text9.toString()) != null) {
                str13 = StringsKt__StringsKt.trim(obj3).toString();
            } else {
                str13 = null;
            }
            if (str13 == null) {
                str14 = "";
            } else {
                str14 = str13;
            }
            Editable text10 = getBillingCityEdit().getText();
            if (text10 != null && (obj2 = text10.toString()) != null) {
                str15 = StringsKt__StringsKt.trim(obj2).toString();
            } else {
                str15 = null;
            }
            if (str15 == null) {
                str16 = "";
            } else {
                str16 = str15;
            }
            Editable text11 = getBillingCountryEdit().getText();
            if (text11 != null && (obj = text11.toString()) != null) {
                str17 = StringsKt__StringsKt.trim(obj).toString();
            } else {
                str17 = null;
            }
            if (str17 == null) {
                str18 = "";
            } else {
                str18 = str17;
            }
            createSourceRequestBuilder.billing(new Billing(str16, str18, str14, null, str12, null, 40, null));
        } else {
            createSourceRequestBuilder.billing(new Billing(str8, str10, str6, null, str4, null, 40, null));
        }
        Request<Source> build = createSourceRequestBuilder.build();
        View view = getView();
        if (view != null) {
            setAllViewsEnabled(view, false);
        }
        paymentCreatorRequester.request(build, new C5550z());
    }

    private final void updateBillingAddressErrorText(boolean z) {
        Editable text;
        if (!z && ((text = getBillingCountryEdit().getText()) == null || text.length() != 0)) {
            OmiseEditText billingCountryEdit = getBillingCountryEdit();
            Intrinsics.checkNotNullExpressionValue(billingCountryEdit, "billingCountryEdit");
            if (!isCountryCodeValid(billingCountryEdit)) {
                getBillingAddressErrorText().setVisibility(0);
                getBillingAddressErrorText().setText(getString(C5511R.C5518string.error_invalid_address));
                return;
            }
        }
        TextView billingAddressErrorText = getBillingAddressErrorText();
        billingAddressErrorText.setText("");
        billingAddressErrorText.setVisibility(8);
    }

    private final void updateEmailErrorText(boolean z) {
        Editable text;
        if (!z && (((text = getEmailEdit().getText()) == null || text.length() != 0) && !isEmailValid(getEmailEdit()))) {
            getEmailErrorText().setVisibility(0);
            getEmailErrorText().setText(getString(C5511R.C5518string.error_invalid_email));
            return;
        }
        TextView emailErrorText = getEmailErrorText();
        emailErrorText.setText("");
        emailErrorText.setVisibility(8);
    }

    private final void updatePhoneErrorText(boolean z) {
        if (!z && !isPhoneNumberValid(getPhoneNumberEdit())) {
            getPhoneNumberErrorText().setVisibility(0);
            getPhoneNumberErrorText().setText(getString(C5511R.C5518string.error_invalid_phone_number));
            return;
        }
        TextView phoneNumberErrorText = getPhoneNumberErrorText();
        phoneNumberErrorText.setText("");
        phoneNumberErrorText.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
        if (isCountryCodeValid(r2) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateShippingAddressErrorText(boolean r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L46
            co.omise.android.ui.OmiseEditText r2 = r1.getShippingStreetEdit()
            boolean r2 = r2.isValid()
            if (r2 == 0) goto L30
            co.omise.android.ui.OmiseEditText r2 = r1.getShippingPostalEdit()
            boolean r2 = r2.isValid()
            if (r2 == 0) goto L30
            co.omise.android.ui.OmiseEditText r2 = r1.getShippingCityEdit()
            boolean r2 = r2.isValid()
            if (r2 == 0) goto L30
            co.omise.android.ui.OmiseEditText r2 = r1.getShippingCountryEdit()
            java.lang.String r0 = "shippingCountryEdit"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            boolean r2 = r1.isCountryCodeValid(r2)
            if (r2 == 0) goto L30
            goto L46
        L30:
            android.widget.TextView r2 = r1.getShippingAddressErrorText()
            r0 = 0
            r2.setVisibility(r0)
            android.widget.TextView r2 = r1.getShippingAddressErrorText()
            int r0 = co.omise.android.C5511R.C5518string.error_invalid_address
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            return
        L46:
            android.widget.TextView r2 = r1.getShippingAddressErrorText()
            java.lang.String r0 = ""
            r2.setText(r0)
            r0 = 8
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.omise.android.p009ui.AtomeFormFragment.updateShippingAddressErrorText(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0074, code lost:
        if (isCountryCodeValid(r1) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateSubmitButton() {
        /*
            r3 = this;
            android.widget.Button r0 = r3.getSubmitButton()
            co.omise.android.ui.OmiseEditText r1 = r3.getEmailEdit()
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L15
            int r1 = r1.length()
            if (r1 != 0) goto L15
            goto L1f
        L15:
            co.omise.android.ui.OmiseEditText r1 = r3.getEmailEdit()
            boolean r1 = r3.isEmailValid(r1)
            if (r1 == 0) goto L78
        L1f:
            co.omise.android.ui.OmiseEditText r1 = r3.getPhoneNumberEdit()
            boolean r1 = r3.isPhoneNumberValid(r1)
            if (r1 == 0) goto L78
            co.omise.android.ui.OmiseEditText r1 = r3.getShippingStreetEdit()
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L78
            co.omise.android.ui.OmiseEditText r1 = r3.getShippingPostalEdit()
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L78
            co.omise.android.ui.OmiseEditText r1 = r3.getShippingCityEdit()
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L78
            co.omise.android.ui.OmiseEditText r1 = r3.getShippingCountryEdit()
            java.lang.String r2 = "shippingCountryEdit"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r1 = r3.isCountryCodeValid(r1)
            if (r1 == 0) goto L78
            co.omise.android.ui.OmiseEditText r1 = r3.getBillingCityEdit()
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L67
            int r1 = r1.length()
            if (r1 != 0) goto L67
            goto L76
        L67:
            co.omise.android.ui.OmiseEditText r1 = r3.getBillingCountryEdit()
            java.lang.String r2 = "billingCountryEdit"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r1 = r3.isCountryCodeValid(r1)
            if (r1 == 0) goto L78
        L76:
            r1 = 1
            goto L79
        L78:
            r1 = 0
        L79:
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.omise.android.p009ui.AtomeFormFragment.updateSubmitButton():void");
    }

    @Override // co.omise.android.p009ui.OmiseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // co.omise.android.p009ui.OmiseFragment
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

    @Nullable
    public final PaymentCreatorRequester<Source> getRequester() {
        return this.requester;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C5511R.C5515layout.fragment_atome_form, viewGroup, false);
    }

    @Override // co.omise.android.p009ui.OmiseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        OmiseEditText emailEdit = getEmailEdit();
        emailEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: c7
            {
                AtomeFormFragment.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                AtomeFormFragment.m51292n(AtomeFormFragment.this, view2, z);
            }
        });
        EditTextExtensionsKt.setOnAfterTextChangeListener(emailEdit, new C5534j(this));
        OmiseEditText phoneNumberEdit = getPhoneNumberEdit();
        phoneNumberEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d7
            {
                AtomeFormFragment.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                AtomeFormFragment.m51293m(AtomeFormFragment.this, view2, z);
            }
        });
        EditTextExtensionsKt.setOnAfterTextChangeListener(phoneNumberEdit, new C5535k(this));
        OmiseEditText shippingStreetEdit = getShippingStreetEdit();
        shippingStreetEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: e7
            {
                AtomeFormFragment.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                AtomeFormFragment.m51291o(AtomeFormFragment.this, view2, z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(shippingStreetEdit, "");
        EditTextExtensionsKt.setOnAfterTextChangeListener(shippingStreetEdit, new C5536l(this));
        OmiseEditText shippingPostalEdit = getShippingPostalEdit();
        Intrinsics.checkNotNullExpressionValue(shippingPostalEdit, "");
        EditTextExtensionsKt.setOnAfterTextChangeListener(shippingPostalEdit, new C5537m(this));
        OmiseEditText shippingCityEdit = getShippingCityEdit();
        Intrinsics.checkNotNullExpressionValue(shippingCityEdit, "");
        EditTextExtensionsKt.setOnAfterTextChangeListener(shippingCityEdit, new C5538n(this));
        OmiseEditText shippingCountryEdit = getShippingCountryEdit();
        shippingCountryEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: f7
            {
                AtomeFormFragment.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                AtomeFormFragment.m51290p(AtomeFormFragment.this, view2, z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(shippingCountryEdit, "");
        EditTextExtensionsKt.setOnAfterTextChangeListener(shippingCountryEdit, new C5539o(this));
        OmiseEditText billingCountryEdit = getBillingCountryEdit();
        billingCountryEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: g7
            {
                AtomeFormFragment.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                AtomeFormFragment.m51288r(AtomeFormFragment.this, view2, z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(billingCountryEdit, "");
        EditTextExtensionsKt.setOnAfterTextChangeListener(billingCountryEdit, new C5540p(this));
        getCheckBoxBillingShipping().toggle();
        getCheckBoxBillingShipping().setOnClickListener(new View.OnClickListener() { // from class: h7
            {
                AtomeFormFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AtomeFormFragment.m51289q(AtomeFormFragment.this, view2);
            }
        });
        ViewExtensionsKt.setOnClickListener(getSubmitButton(), new C5541q(this));
    }

    public final void setRequester(@Nullable PaymentCreatorRequester<Source> paymentCreatorRequester) {
        this.requester = paymentCreatorRequester;
    }
}
