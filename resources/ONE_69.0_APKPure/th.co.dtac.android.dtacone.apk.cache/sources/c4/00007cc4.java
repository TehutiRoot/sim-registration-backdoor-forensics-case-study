package co.omise.android.p009ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.app.NotificationCompat;
import co.omise.android.C5500R;
import co.omise.android.extensions.EditTextExtensionsKt;
import co.omise.android.extensions.ViewExtensionsKt;
import co.omise.android.models.Source;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010(\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m29142d2 = {"Lco/omise/android/ui/FpxEmailFormFragment;", "Lco/omise/android/ui/OmiseFragment;", "()V", "allowedEmailFormat", "", "emailEdit", "Lco/omise/android/ui/OmiseEditText;", "getEmailEdit", "()Lco/omise/android/ui/OmiseEditText;", "emailEdit$delegate", "Lkotlin/Lazy;", NotificationCompat.CATEGORY_NAVIGATION, "Lco/omise/android/ui/PaymentCreatorNavigation;", "getNavigation", "()Lco/omise/android/ui/PaymentCreatorNavigation;", "setNavigation", "(Lco/omise/android/ui/PaymentCreatorNavigation;)V", "requester", "Lco/omise/android/ui/PaymentCreatorRequester;", "Lco/omise/android/models/Source;", "getRequester", "()Lco/omise/android/ui/PaymentCreatorRequester;", "setRequester", "(Lco/omise/android/ui/PaymentCreatorRequester;)V", "submitButton", "Landroid/widget/Button;", "getSubmitButton", "()Landroid/widget/Button;", "submitButton$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", Promotion.ACTION_VIEW, "submitForm", "updateSubmitButton", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* renamed from: co.omise.android.ui.FpxEmailFormFragment */
/* loaded from: classes3.dex */
public final class FpxEmailFormFragment extends OmiseFragment {
    @Nullable
    private PaymentCreatorNavigation navigation;
    @Nullable
    private PaymentCreatorRequester<Source> requester;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy emailEdit$delegate = LazyKt__LazyJVMKt.lazy(new C5595a());
    @NotNull
    private final Lazy submitButton$delegate = LazyKt__LazyJVMKt.lazy(new C5598d());
    @NotNull
    private final String allowedEmailFormat = "\\A[\\w+\\-.]+@[a-z\\d\\-.]+\\.[a-z]{2,}\\z";

    /* renamed from: co.omise.android.ui.FpxEmailFormFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5595a extends Lambda implements Function0 {
        public C5595a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseEditText invoke() {
            return (OmiseEditText) FpxEmailFormFragment.this._$_findCachedViewById(C5500R.C5503id.edit_email);
        }
    }

    /* renamed from: co.omise.android.ui.FpxEmailFormFragment$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5596b extends FunctionReferenceImpl implements Function0 {
        public C5596b(Object obj) {
            super(0, obj, FpxEmailFormFragment.class, "updateSubmitButton", "updateSubmitButton()V", 0);
        }

        /* renamed from: a */
        public final void m51186a() {
            ((FpxEmailFormFragment) this.receiver).updateSubmitButton();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51186a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.FpxEmailFormFragment$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5597c extends FunctionReferenceImpl implements Function0 {
        public C5597c(Object obj) {
            super(0, obj, FpxEmailFormFragment.class, "submitForm", "submitForm()V", 0);
        }

        /* renamed from: a */
        public final void m51185a() {
            ((FpxEmailFormFragment) this.receiver).submitForm();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51185a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.FpxEmailFormFragment$d */
    /* loaded from: classes3.dex */
    public static final class C5598d extends Lambda implements Function0 {
        public C5598d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Button invoke() {
            return (Button) FpxEmailFormFragment.this._$_findCachedViewById(C5500R.C5503id.button_submit);
        }
    }

    private final OmiseEditText getEmailEdit() {
        Object value = this.emailEdit$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-emailEdit>(...)");
        return (OmiseEditText) value;
    }

    private final Button getSubmitButton() {
        Object value = this.submitButton$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-submitButton>(...)");
        return (Button) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void submitForm() {
        /*
            r7 = this;
            co.omise.android.ui.PaymentCreatorRequester<co.omise.android.models.Source> r0 = r7.requester
            if (r0 != 0) goto L5
            return
        L5:
            co.omise.android.models.Capability r0 = r0.getCapability()
            java.util.List r0 = r0.getPaymentMethods()
            r1 = 0
            if (r0 == 0) goto L3a
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.next()
            r3 = r2
            co.omise.android.models.PaymentMethod r3 = (co.omise.android.models.PaymentMethod) r3
            java.lang.String r3 = r3.getName()
            r4 = 0
            r5 = 2
            java.lang.String r6 = "fpx"
            boolean r3 = p000.AbstractC19741eO1.equals$default(r3, r6, r4, r5, r1)
            if (r3 == 0) goto L14
            goto L31
        L30:
            r2 = r1
        L31:
            co.omise.android.models.PaymentMethod r2 = (co.omise.android.models.PaymentMethod) r2
            if (r2 == 0) goto L3a
            java.util.List r0 = r2.getBanks()
            goto L3b
        L3a:
            r0 = r1
        L3b:
            co.omise.android.ui.OmiseEditText r2 = r7.getEmailEdit()
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L53
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L53
            java.lang.CharSequence r1 = kotlin.text.StringsKt__StringsKt.trim(r2)
            java.lang.String r1 = r1.toString()
        L53:
            if (r1 != 0) goto L57
            java.lang.String r1 = ""
        L57:
            co.omise.android.ui.PaymentCreatorNavigation r2 = r7.navigation
            if (r2 == 0) goto L5e
            r2.navigateToFpxBankChooser(r0, r1)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.omise.android.p009ui.FpxEmailFormFragment.submitForm():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSubmitButton() {
        boolean z;
        String valueOf = String.valueOf(getEmailEdit().getText());
        Button submitButton = getSubmitButton();
        if (valueOf.length() == 0 || new Regex(this.allowedEmailFormat).matches(valueOf)) {
            z = true;
        } else {
            z = false;
        }
        submitButton.setEnabled(z);
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
    public final PaymentCreatorNavigation getNavigation() {
        return this.navigation;
    }

    @Nullable
    public final PaymentCreatorRequester<Source> getRequester() {
        return this.requester;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C5500R.C5504layout.fragment_fpx_email_form, viewGroup, false);
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
        setTitle(getString(C5500R.C5507string.payment_method_fpx_title));
        setHasOptionsMenu(true);
        EditTextExtensionsKt.setOnAfterTextChangeListener(getEmailEdit(), new C5596b(this));
        ViewExtensionsKt.setOnClickListener(getSubmitButton(), new C5597c(this));
    }

    public final void setNavigation(@Nullable PaymentCreatorNavigation paymentCreatorNavigation) {
        this.navigation = paymentCreatorNavigation;
    }

    public final void setRequester(@Nullable PaymentCreatorRequester<Source> paymentCreatorRequester) {
        this.requester = paymentCreatorRequester;
    }
}