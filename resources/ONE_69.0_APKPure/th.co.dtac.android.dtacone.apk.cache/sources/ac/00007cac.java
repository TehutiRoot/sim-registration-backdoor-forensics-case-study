package co.omise.android.p009ui;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import co.omise.android.C5500R;
import co.omise.android.api.Request;
import co.omise.android.extensions.EditTextExtensionsKt;
import co.omise.android.extensions.ViewExtensionsKt;
import co.omise.android.models.Source;
import co.omise.android.models.SourceType;
import co.omise.android.models.SupportedEcontext;
import co.omise.android.p009ui.EContextFormFragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0002J&\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u001a\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u0002032\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010=\u001a\u00020;H\u0002J\u0018\u0010>\u001a\u00020;2\u0006\u0010<\u001a\u0002032\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020;H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\rR-\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00110\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R#\u0010\u0018\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\rR\u001b\u0010\u001b\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R#\u0010\u001e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\rR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b*\u0010+R\u001d\u0010-\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\b\u001a\u0004\b/\u00100¨\u0006C"}, m29142d2 = {"Lco/omise/android/ui/EContextFormFragment;", "Lco/omise/android/ui/OmiseFragment;", "()V", "emailEdit", "Lco/omise/android/ui/OmiseEditText;", "getEmailEdit", "()Lco/omise/android/ui/OmiseEditText;", "emailEdit$delegate", "Lkotlin/Lazy;", "emailErrorText", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getEmailErrorText", "()Landroid/widget/TextView;", "emailErrorText$delegate", "formInputWithErrorTexts", "", "Lkotlin/Pair;", "getFormInputWithErrorTexts", "()Ljava/util/List;", "formInputWithErrorTexts$delegate", "fullNameEdit", "getFullNameEdit", "fullNameEdit$delegate", "fullNameErrorText", "getFullNameErrorText", "fullNameErrorText$delegate", "phoneNumberEdit", "getPhoneNumberEdit", "phoneNumberEdit$delegate", "phoneNumberErrorText", "getPhoneNumberErrorText", "phoneNumberErrorText$delegate", "requester", "Lco/omise/android/ui/PaymentCreatorRequester;", "Lco/omise/android/models/Source;", "getRequester", "()Lco/omise/android/ui/PaymentCreatorRequester;", "setRequester", "(Lco/omise/android/ui/PaymentCreatorRequester;)V", "submitButton", "Landroid/widget/Button;", "getSubmitButton", "()Landroid/widget/Button;", "submitButton$delegate", "type", "Lco/omise/android/models/SupportedEcontext;", "getType", "()Lco/omise/android/models/SupportedEcontext;", "type$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", Promotion.ACTION_VIEW, "submitForm", "updateErrorText", "hasFocus", "", "updateSubmitButton", "Companion", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* renamed from: co.omise.android.ui.EContextFormFragment */
/* loaded from: classes3.dex */
public final class EContextFormFragment extends OmiseFragment {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String EXTRA_ECONTEXT_TYPE = "EContextFormFragment.econtextType";
    @Nullable
    private PaymentCreatorRequester<Source> requester;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy type$delegate = LazyKt__LazyJVMKt.lazy(new C5591l());
    @NotNull
    private final Lazy fullNameEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5583d());
    @NotNull
    private final Lazy emailEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5580a());
    @NotNull
    private final Lazy phoneNumberEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5587h());
    @NotNull
    private final Lazy fullNameErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5584e());
    @NotNull
    private final Lazy emailErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5581b());
    @NotNull
    private final Lazy phoneNumberErrorText$delegate = LazyKt__LazyJVMKt.lazy(new C5588i());
    @NotNull
    private final Lazy submitButton$delegate = LazyKt__LazyJVMKt.lazy(new C5589j());
    @NotNull
    private final Lazy formInputWithErrorTexts$delegate = LazyKt__LazyJVMKt.lazy(new C5582c());

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lco/omise/android/ui/EContextFormFragment$Companion;", "", "()V", "EXTRA_ECONTEXT_TYPE", "", "newInstance", "Lco/omise/android/ui/EContextFormFragment;", "eContext", "Lco/omise/android/models/SupportedEcontext;", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* renamed from: co.omise.android.ui.EContextFormFragment$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EContextFormFragment newInstance(@NotNull SupportedEcontext eContext) {
            Intrinsics.checkNotNullParameter(eContext, "eContext");
            EContextFormFragment eContextFormFragment = new EContextFormFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(EContextFormFragment.EXTRA_ECONTEXT_TYPE, eContext);
            eContextFormFragment.setArguments(bundle);
            return eContextFormFragment;
        }

        private Companion() {
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5580a extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5580a() {
            super(0);
            EContextFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) EContextFormFragment.this._$_findCachedViewById(C5500R.C5503id.edit_email);
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$b */
    /* loaded from: classes3.dex */
    public static final class C5581b extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5581b() {
            super(0);
            EContextFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) EContextFormFragment.this._$_findCachedViewById(C5500R.C5503id.text_email_error);
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$c */
    /* loaded from: classes3.dex */
    public static final class C5582c extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5582c() {
            super(0);
            EContextFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final List invoke() {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(EContextFormFragment.this.getFullNameEdit(), EContextFormFragment.this.getFullNameErrorText()), new Pair(EContextFormFragment.this.getEmailEdit(), EContextFormFragment.this.getEmailErrorText()), new Pair(EContextFormFragment.this.getPhoneNumberEdit(), EContextFormFragment.this.getPhoneNumberErrorText())});
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$d */
    /* loaded from: classes3.dex */
    public static final class C5583d extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5583d() {
            super(0);
            EContextFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) EContextFormFragment.this._$_findCachedViewById(C5500R.C5503id.edit_full_name);
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$e */
    /* loaded from: classes3.dex */
    public static final class C5584e extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5584e() {
            super(0);
            EContextFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) EContextFormFragment.this._$_findCachedViewById(C5500R.C5503id.text_full_name_error);
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5585f extends FunctionReferenceImpl implements Function0 {
        public C5585f(Object obj) {
            super(0, obj, EContextFormFragment.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51196a() {
            ((EContextFormFragment) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51196a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5586g extends FunctionReferenceImpl implements Function0 {
        public C5586g(Object obj) {
            super(0, obj, EContextFormFragment.class, "submitForm", "submitForm()V", 0);
        }

        /* renamed from: a */
        public final void m51195a() {
            ((EContextFormFragment) this.receiver).submitForm();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51195a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$h */
    /* loaded from: classes3.dex */
    public static final class C5587h extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5587h() {
            super(0);
            EContextFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) EContextFormFragment.this._$_findCachedViewById(C5500R.C5503id.edit_phone_number);
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$i */
    /* loaded from: classes3.dex */
    public static final class C5588i extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5588i() {
            super(0);
            EContextFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) EContextFormFragment.this._$_findCachedViewById(C5500R.C5503id.text_phone_number_error);
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$j */
    /* loaded from: classes3.dex */
    public static final class C5589j extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5589j() {
            super(0);
            EContextFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Button invoke() {
            return (Button) EContextFormFragment.this._$_findCachedViewById(C5500R.C5503id.button_submit);
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$k */
    /* loaded from: classes3.dex */
    public static final class C5590k extends Lambda implements Function1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5590k() {
            super(1);
            EContextFormFragment.this = r1;
        }

        /* renamed from: a */
        public final void m51191a(Object obj) {
            View view = EContextFormFragment.this.getView();
            if (view != null) {
                EContextFormFragment.this.setAllViewsEnabled(view, true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51191a(((Result) obj).m74280unboximpl());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.EContextFormFragment$l */
    /* loaded from: classes3.dex */
    public static final class C5591l extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5591l() {
            super(0);
            EContextFormFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SupportedEcontext invoke() {
            Object obj;
            Object parcelable;
            Bundle arguments = EContextFormFragment.this.getArguments();
            Parcelable parcelable2 = null;
            if (arguments == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = arguments.getParcelable(EContextFormFragment.EXTRA_ECONTEXT_TYPE, SupportedEcontext.class);
                obj = (Parcelable) parcelable;
            } else {
                Parcelable parcelable3 = arguments.getParcelable(EContextFormFragment.EXTRA_ECONTEXT_TYPE);
                if (parcelable3 instanceof SupportedEcontext) {
                    parcelable2 = parcelable3;
                }
                obj = (SupportedEcontext) parcelable2;
            }
            return (SupportedEcontext) obj;
        }
    }

    public final OmiseEditText getEmailEdit() {
        Object value = this.emailEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-emailEdit>(...)");
        return (OmiseEditText) value;
    }

    public final TextView getEmailErrorText() {
        return (TextView) this.emailErrorText$delegate.getValue();
    }

    private final List<Pair<OmiseEditText, TextView>> getFormInputWithErrorTexts() {
        return (List) this.formInputWithErrorTexts$delegate.getValue();
    }

    public final OmiseEditText getFullNameEdit() {
        Object value = this.fullNameEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-fullNameEdit>(...)");
        return (OmiseEditText) value;
    }

    public final TextView getFullNameErrorText() {
        return (TextView) this.fullNameErrorText$delegate.getValue();
    }

    public final OmiseEditText getPhoneNumberEdit() {
        Object value = this.phoneNumberEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-phoneNumberEdit>(...)");
        return (OmiseEditText) value;
    }

    public final TextView getPhoneNumberErrorText() {
        return (TextView) this.phoneNumberErrorText$delegate.getValue();
    }

    private final Button getSubmitButton() {
        Object value = this.submitButton$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-submitButton>(...)");
        return (Button) value;
    }

    private final SupportedEcontext getType() {
        return (SupportedEcontext) this.type$delegate.getValue();
    }

    /* renamed from: m */
    public static /* synthetic */ void m51202m(EContextFormFragment eContextFormFragment, View view, boolean z) {
        eContextFormFragment.updateErrorText(view, z);
    }

    public final void submitForm() {
        String str;
        String str2;
        String obj;
        String obj2;
        String obj3;
        PaymentCreatorRequester<Source> paymentCreatorRequester = this.requester;
        if (paymentCreatorRequester == null) {
            return;
        }
        Editable text = getFullNameEdit().getText();
        String str3 = null;
        if (text != null && (obj3 = text.toString()) != null) {
            str = StringsKt__StringsKt.trim(obj3).toString();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        Editable text2 = getEmailEdit().getText();
        if (text2 != null && (obj2 = text2.toString()) != null) {
            str2 = StringsKt__StringsKt.trim(obj2).toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        Editable text3 = getPhoneNumberEdit().getText();
        if (text3 != null && (obj = text3.toString()) != null) {
            str3 = StringsKt__StringsKt.trim(obj).toString();
        }
        if (str3 != null) {
            str4 = str3;
        }
        Request<Source> build = new Source.CreateSourceRequestBuilder(paymentCreatorRequester.getAmount(), paymentCreatorRequester.getCurrency(), SourceType.Econtext.INSTANCE).name(str).email(str2).phoneNumber(str4).build();
        View view = getView();
        if (view != null) {
            setAllViewsEnabled(view, false);
        }
        paymentCreatorRequester.request(build, new C5590k());
    }

    public final void updateErrorText(View view, boolean z) {
        String string;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type co.omise.android.ui.OmiseEditText");
        OmiseEditText omiseEditText = (OmiseEditText) view;
        Iterator<T> it = getFormInputWithErrorTexts().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (Intrinsics.areEqual(pair.getFirst(), omiseEditText)) {
                TextView textView = (TextView) pair.getSecond();
                if (!z && !omiseEditText.isValid()) {
                    if (Intrinsics.areEqual(omiseEditText, getFullNameEdit())) {
                        string = getString(C5500R.C5507string.error_invalid_full_name);
                    } else if (Intrinsics.areEqual(omiseEditText, getEmailEdit())) {
                        string = getString(C5500R.C5507string.error_invalid_email);
                    } else if (Intrinsics.areEqual(omiseEditText, getPhoneNumberEdit())) {
                        string = getString(C5500R.C5507string.error_invalid_phone_number);
                    } else {
                        string = getString(C5500R.C5507string.error_unknown_without_reason);
                    }
                    textView.setText(string);
                    textView.setVisibility(0);
                    return;
                }
                textView.setText("");
                textView.setVisibility(4);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void updateSubmitButton() {
        boolean z;
        List<Pair<OmiseEditText, TextView>> formInputWithErrorTexts = getFormInputWithErrorTexts();
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(formInputWithErrorTexts, 10));
        Iterator<T> it = formInputWithErrorTexts.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((OmiseEditText) ((Pair) it.next()).getFirst()).isValid()));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
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
        return inflater.inflate(C5500R.C5504layout.fragment_econtext_form, viewGroup, false);
    }

    @Override // co.omise.android.p009ui.OmiseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        SupportedEcontext type = getType();
        if (Intrinsics.areEqual(type, SupportedEcontext.ConvenienceStore.INSTANCE)) {
            string = getString(C5500R.C5507string.title_convenience_store);
        } else if (Intrinsics.areEqual(type, SupportedEcontext.PayEasy.INSTANCE)) {
            string = getString(C5500R.C5507string.title_pay_easy);
        } else if (Intrinsics.areEqual(type, SupportedEcontext.Netbanking.INSTANCE)) {
            string = getString(C5500R.C5507string.title_netbank);
        } else if (type == null) {
            string = getString(C5500R.C5507string.econtext_title);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        setTitle(string);
        setHasOptionsMenu(true);
        Iterator<T> it = getFormInputWithErrorTexts().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((OmiseEditText) pair.getFirst()).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: NL
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    EContextFormFragment.m51202m(EContextFormFragment.this, view2, z);
                }
            });
            EditTextExtensionsKt.setOnAfterTextChangeListener((EditText) pair.getFirst(), new C5585f(this));
        }
        ViewExtensionsKt.setOnClickListener(getSubmitButton(), new C5586g(this));
    }

    public final void setRequester(@Nullable PaymentCreatorRequester<Source> paymentCreatorRequester) {
        this.requester = paymentCreatorRequester;
    }
}