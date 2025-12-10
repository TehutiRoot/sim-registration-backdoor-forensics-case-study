package co.omise.android.p009ui;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import co.omise.android.C5500R;
import co.omise.android.api.Request;
import co.omise.android.extensions.EditTextExtensionsKt;
import co.omise.android.extensions.ViewExtensionsKt;
import co.omise.android.models.Source;
import co.omise.android.models.SourceType;
import co.omise.android.p009ui.TrueMoneyFormFragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
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

@Metadata(m29143d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020$H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020$H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019¨\u0006+"}, m29142d2 = {"Lco/omise/android/ui/TrueMoneyFormFragment;", "Lco/omise/android/ui/OmiseFragment;", "()V", "phoneNumberEdit", "Lco/omise/android/ui/OmiseEditText;", "getPhoneNumberEdit", "()Lco/omise/android/ui/OmiseEditText;", "phoneNumberEdit$delegate", "Lkotlin/Lazy;", "phoneNumberErrorText", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getPhoneNumberErrorText", "()Landroid/widget/TextView;", "phoneNumberErrorText$delegate", "requester", "Lco/omise/android/ui/PaymentCreatorRequester;", "Lco/omise/android/models/Source;", "getRequester", "()Lco/omise/android/ui/PaymentCreatorRequester;", "setRequester", "(Lco/omise/android/ui/PaymentCreatorRequester;)V", "submitButton", "Landroid/widget/Button;", "getSubmitButton", "()Landroid/widget/Button;", "submitButton$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", Promotion.ACTION_VIEW, "submitForm", "updateErrorText", "hasFocus", "", "updateSubmitButton", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* renamed from: co.omise.android.ui.TrueMoneyFormFragment */
/* loaded from: classes3.dex */
public final class TrueMoneyFormFragment extends OmiseFragment {
    @Nullable
    private PaymentCreatorRequester<Source> requester;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy phoneNumberEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5622c());
    @NotNull
    private final Lazy phoneNumberErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5623d());
    @NotNull
    private final Lazy submitButton$delegate = LazyKt__LazyJVMKt.lazy(new C5624e());

    /* renamed from: co.omise.android.ui.TrueMoneyFormFragment$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5620a extends FunctionReferenceImpl implements Function0 {
        public C5620a(Object obj) {
            super(0, obj, TrueMoneyFormFragment.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51154a() {
            ((TrueMoneyFormFragment) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51154a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.TrueMoneyFormFragment$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5621b extends FunctionReferenceImpl implements Function0 {
        public C5621b(Object obj) {
            super(0, obj, TrueMoneyFormFragment.class, "submitForm", "submitForm()V", 0);
        }

        /* renamed from: a */
        public final void m51153a() {
            ((TrueMoneyFormFragment) this.receiver).submitForm();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51153a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.TrueMoneyFormFragment$c */
    /* loaded from: classes3.dex */
    public static final class C5622c extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5622c() {
            super(0);
            TrueMoneyFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) TrueMoneyFormFragment.this._$_findCachedViewById(C5500R.C5503id.edit_phone_number);
        }
    }

    /* renamed from: co.omise.android.ui.TrueMoneyFormFragment$d */
    /* loaded from: classes3.dex */
    public static final class C5623d extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5623d() {
            super(0);
            TrueMoneyFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) TrueMoneyFormFragment.this._$_findCachedViewById(C5500R.C5503id.text_phone_number_error);
        }
    }

    /* renamed from: co.omise.android.ui.TrueMoneyFormFragment$e */
    /* loaded from: classes3.dex */
    public static final class C5624e extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5624e() {
            super(0);
            TrueMoneyFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Button invoke() {
            return (Button) TrueMoneyFormFragment.this._$_findCachedViewById(C5500R.C5503id.button_submit);
        }
    }

    /* renamed from: co.omise.android.ui.TrueMoneyFormFragment$f */
    /* loaded from: classes3.dex */
    public static final class C5625f extends Lambda implements Function1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5625f() {
            super(1);
            TrueMoneyFormFragment.this = r1;
        }

        /* renamed from: a */
        public final void m51149a(Object obj) {
            View view = TrueMoneyFormFragment.this.getView();
            if (view != null) {
                TrueMoneyFormFragment.this.setAllViewsEnabled(view, true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51149a(((Result) obj).m74280unboximpl());
            return Unit.INSTANCE;
        }
    }

    private final OmiseEditText getPhoneNumberEdit() {
        Object value = this.phoneNumberEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-phoneNumberEdit>(...)");
        return (OmiseEditText) value;
    }

    private final TextView getPhoneNumberErrorText() {
        return (TextView) this.phoneNumberErrorText$delegate.getValue();
    }

    private final Button getSubmitButton() {
        Object value = this.submitButton$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-submitButton>(...)");
        return (Button) value;
    }

    /* renamed from: m */
    public static /* synthetic */ void m51155m(TrueMoneyFormFragment trueMoneyFormFragment, View view, boolean z) {
        m74133onViewCreated$lambda1$lambda0(trueMoneyFormFragment, view, z);
    }

    /* renamed from: onViewCreated$lambda-1$lambda-0 */
    public static final void m74133onViewCreated$lambda1$lambda0(TrueMoneyFormFragment this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateErrorText(z);
    }

    public final void submitForm() {
        String str;
        String obj;
        PaymentCreatorRequester<Source> paymentCreatorRequester = this.requester;
        if (paymentCreatorRequester == null) {
            return;
        }
        Editable text = getPhoneNumberEdit().getText();
        if (text != null && (obj = text.toString()) != null) {
            str = StringsKt__StringsKt.trim(obj).toString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        Request<Source> build = new Source.CreateSourceRequestBuilder(paymentCreatorRequester.getAmount(), paymentCreatorRequester.getCurrency(), SourceType.TrueMoney.INSTANCE).phoneNumber(str).build();
        View view = getView();
        if (view != null) {
            setAllViewsEnabled(view, false);
        }
        paymentCreatorRequester.request(build, new C5625f());
    }

    private final void updateErrorText(boolean z) {
        if (!z && !getPhoneNumberEdit().isValid()) {
            getPhoneNumberErrorText().setText(getString(C5500R.C5507string.error_invalid_phone_number));
            return;
        }
        TextView phoneNumberErrorText = getPhoneNumberErrorText();
        phoneNumberErrorText.setText("");
        phoneNumberErrorText.setVisibility(4);
    }

    public final void updateSubmitButton() {
        getSubmitButton().setEnabled(getPhoneNumberEdit().isValid());
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
        return inflater.inflate(C5500R.C5504layout.fragment_true_money_form, viewGroup, false);
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
        setTitle(getString(C5500R.C5507string.payment_truemoney_title));
        setHasOptionsMenu(true);
        OmiseEditText phoneNumberEdit = getPhoneNumberEdit();
        phoneNumberEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: EW1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                TrueMoneyFormFragment.m51155m(TrueMoneyFormFragment.this, view2, z);
            }
        });
        EditTextExtensionsKt.setOnAfterTextChangeListener(phoneNumberEdit, new C5620a(this));
        ViewExtensionsKt.setOnClickListener(getSubmitButton(), new C5621b(this));
    }

    public final void setRequester(@Nullable PaymentCreatorRequester<Source> paymentCreatorRequester) {
        this.requester = paymentCreatorRequester;
    }
}