package co.omise.android.p009ui;

import android.os.Bundle;
import android.view.View;
import co.omise.android.C5511R;
import co.omise.android.api.Request;
import co.omise.android.models.Bank;
import co.omise.android.models.Source;
import co.omise.android.models.SourceType;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, m28850d2 = {"Lco/omise/android/ui/FpxBankChooserFragment;", "Lco/omise/android/ui/OmiseListFragment;", "Lco/omise/android/ui/FpxResource;", "()V", "requester", "Lco/omise/android/ui/PaymentCreatorRequester;", "Lco/omise/android/models/Source;", "getRequester", "()Lco/omise/android/ui/PaymentCreatorRequester;", "setRequester", "(Lco/omise/android/ui/PaymentCreatorRequester;)V", "listItems", "", "onListItemClicked", "", "item", "onViewCreated", Promotion.ACTION_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.FpxBankChooserFragment */
/* loaded from: classes3.dex */
public final class FpxBankChooserFragment extends OmiseListFragment<FpxResource> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String FPX_BANKS = "FpxBankChooserFragment.banks";
    @NotNull
    private static final String FPX_EMAIL = "FpxBankChooserFragment.email";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    private PaymentCreatorRequester<Source> requester;

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28850d2 = {"Lco/omise/android/ui/FpxBankChooserFragment$Companion;", "", "()V", "FPX_BANKS", "", "FPX_EMAIL", "newInstance", "Lco/omise/android/ui/FpxBankChooserFragment;", "banks", "", "Lco/omise/android/models/Bank;", "email", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.FpxBankChooserFragment$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FpxBankChooserFragment newInstance(@Nullable List<Bank> list, @NotNull String email) {
            Bank[] bankArr;
            Intrinsics.checkNotNullParameter(email, "email");
            FpxBankChooserFragment fpxBankChooserFragment = new FpxBankChooserFragment();
            Bundle bundle = new Bundle();
            if (list != null) {
                Object[] array = list.toArray(new Bank[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                bankArr = (Bank[]) array;
            } else {
                bankArr = null;
            }
            bundle.putParcelableArray(FpxBankChooserFragment.FPX_BANKS, bankArr);
            bundle.putString(FpxBankChooserFragment.FPX_EMAIL, email);
            fpxBankChooserFragment.setArguments(bundle);
            return fpxBankChooserFragment;
        }

        private Companion() {
        }
    }

    /* renamed from: co.omise.android.ui.FpxBankChooserFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5605a extends Lambda implements Function1 {
        public C5605a() {
            super(1);
        }

        /* renamed from: a */
        public final void m51192a(Object obj) {
            View view = FpxBankChooserFragment.this.getView();
            if (view != null) {
                FpxBankChooserFragment.this.setAllViewsEnabled(view, true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51192a(((Result) obj).m74096unboximpl());
            return Unit.INSTANCE;
        }
    }

    @Override // co.omise.android.p009ui.OmiseListFragment, co.omise.android.p009ui.OmiseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // co.omise.android.p009ui.OmiseListFragment, co.omise.android.p009ui.OmiseFragment
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r0 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r0 == 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Parcelable[]] */
    @Override // co.omise.android.p009ui.OmiseListFragment
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<co.omise.android.p009ui.FpxResource> listItems() {
        /*
            r15 = this;
            android.os.Bundle r0 = r15.getArguments()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L7b
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.lang.String r6 = "FpxBankChooserFragment.banks"
            if (r3 < r4) goto L42
            java.lang.Class<co.omise.android.models.Bank> r1 = co.omise.android.models.Bank.class
            java.lang.Object[] r0 = p000.AbstractC5381bd.m51966a(r0, r6, r1)
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            if (r0 == 0) goto L74
            java.lang.String r1 = "getParcelableArray(key, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r0.length
            r4 = 0
        L28:
            if (r4 >= r3) goto L34
            r6 = r0[r4]
            if (r6 == 0) goto L31
            r1.add(r6)
        L31:
            int r4 = r4 + 1
            goto L28
        L34:
            co.omise.android.models.Bank[] r0 = new co.omise.android.models.Bank[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r5)
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            if (r0 != 0) goto L78
            goto L74
        L42:
            android.os.Parcelable[] r0 = r0.getParcelableArray(r6)
            if (r0 == 0) goto L74
            java.lang.String r3 = "getParcelableArray(key)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.length
            r6 = 0
        L54:
            if (r6 >= r4) goto L67
            r7 = r0[r6]
            boolean r8 = r7 instanceof co.omise.android.models.Bank
            if (r8 != 0) goto L5d
            r7 = r1
        L5d:
            co.omise.android.models.Bank r7 = (co.omise.android.models.Bank) r7
            if (r7 == 0) goto L64
            r3.add(r7)
        L64:
            int r6 = r6 + 1
            goto L54
        L67:
            co.omise.android.models.Bank[] r0 = new co.omise.android.models.Bank[r2]
            java.lang.Object[] r0 = r3.toArray(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r5)
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            if (r0 != 0) goto L78
        L74:
            co.omise.android.models.Bank[] r0 = new co.omise.android.models.Bank[r2]
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
        L78:
            r1 = r0
            co.omise.android.models.Bank[] r1 = (co.omise.android.models.Bank[]) r1
        L7b:
            if (r1 != 0) goto L7f
            co.omise.android.models.Bank[] r1 = new co.omise.android.models.Bank[r2]
        L7f:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r1.length
            r0.<init>(r3)
            int r3 = r1.length
        L86:
            if (r2 >= r3) goto Laf
            r4 = r1[r2]
            co.omise.android.ui.FpxResource$Companion r5 = co.omise.android.p009ui.FpxResource.Companion
            java.lang.String r6 = r4.getCode()
            int r8 = r5.getBankImageFromCode(r6)
            java.lang.String r9 = r4.getName()
            java.lang.String r12 = r4.getCode()
            java.lang.Boolean r11 = r4.getActive()
            co.omise.android.ui.FpxResource r4 = new co.omise.android.ui.FpxResource
            r13 = 4
            r14 = 0
            r10 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.add(r4)
            int r2 = r2 + 1
            goto L86
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.omise.android.p009ui.FpxBankChooserFragment.listItems():java.util.List");
    }

    @Override // co.omise.android.p009ui.OmiseListFragment, co.omise.android.p009ui.OmiseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // co.omise.android.p009ui.OmiseListFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setTitle(getString(C5511R.C5518string.payment_method_fpx_title));
        getNoDataText().setText(getString(C5511R.C5518string.banks_no_data));
        setHasOptionsMenu(true);
    }

    public final void setRequester(@Nullable PaymentCreatorRequester<Source> paymentCreatorRequester) {
        this.requester = paymentCreatorRequester;
    }

    @Override // co.omise.android.p009ui.OmiseListFragment
    public void onListItemClicked(@NotNull FpxResource item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PaymentCreatorRequester<Source> paymentCreatorRequester = this.requester;
        if (paymentCreatorRequester == null) {
            return;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(FPX_EMAIL) : null;
        if (string == null) {
            string = "";
        }
        String bankCode = item.getBankCode();
        String str = bankCode != null ? bankCode : "";
        View view = getView();
        if (view != null) {
            setAllViewsEnabled(view, false);
        }
        Request<Source> build = new Source.CreateSourceRequestBuilder(paymentCreatorRequester.getAmount(), paymentCreatorRequester.getCurrency(), new SourceType.Fpx(null, 1, null)).email(string).bank(str).build();
        View view2 = getView();
        if (view2 != null) {
            setAllViewsEnabled(view2, false);
        }
        paymentCreatorRequester.request(build, new C5605a());
    }
}
