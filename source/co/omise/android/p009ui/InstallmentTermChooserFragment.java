package co.omise.android.p009ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import co.omise.android.C5511R;
import co.omise.android.api.Request;
import co.omise.android.models.Amount;
import co.omise.android.models.BackendType;
import co.omise.android.models.PaymentMethod;
import co.omise.android.models.PaymentMethodKt;
import co.omise.android.models.Source;
import co.omise.android.models.SourceType;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u001a\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m28850d2 = {"Lco/omise/android/ui/InstallmentTermChooserFragment;", "Lco/omise/android/ui/OmiseListFragment;", "Lco/omise/android/ui/InstallmentTermResource;", "()V", "installment", "Lco/omise/android/models/PaymentMethod;", "getInstallment", "()Lco/omise/android/models/PaymentMethod;", "installment$delegate", "Lkotlin/Lazy;", "requester", "Lco/omise/android/ui/PaymentCreatorRequester;", "Lco/omise/android/models/Source;", "getRequester", "()Lco/omise/android/ui/PaymentCreatorRequester;", "setRequester", "(Lco/omise/android/ui/PaymentCreatorRequester;)V", "listItems", "", "onListItemClicked", "", "item", "onViewCreated", Promotion.ACTION_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.InstallmentTermChooserFragment */
/* loaded from: classes3.dex */
public final class InstallmentTermChooserFragment extends OmiseListFragment<InstallmentTermResource> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String EXTRA_INSTALLMENT = "InstallmentTermChooserFragment.installment";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy installment$delegate = LazyKt__LazyJVMKt.lazy(new C5616a());
    @Nullable
    private PaymentCreatorRequester<Source> requester;

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28850d2 = {"Lco/omise/android/ui/InstallmentTermChooserFragment$Companion;", "", "()V", "EXTRA_INSTALLMENT", "", "newInstance", "Lco/omise/android/ui/InstallmentTermChooserFragment;", "installment", "Lco/omise/android/models/PaymentMethod;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentTermChooserFragment$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InstallmentTermChooserFragment newInstance(@NotNull PaymentMethod installment) {
            Intrinsics.checkNotNullParameter(installment, "installment");
            InstallmentTermChooserFragment installmentTermChooserFragment = new InstallmentTermChooserFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(InstallmentTermChooserFragment.EXTRA_INSTALLMENT, installment);
            installmentTermChooserFragment.setArguments(bundle);
            return installmentTermChooserFragment;
        }

        private Companion() {
        }
    }

    /* renamed from: co.omise.android.ui.InstallmentTermChooserFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5616a extends Lambda implements Function0 {
        public C5616a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PaymentMethod invoke() {
            Object obj;
            Object parcelable;
            Bundle arguments = InstallmentTermChooserFragment.this.getArguments();
            Parcelable parcelable2 = null;
            if (arguments == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = arguments.getParcelable(InstallmentTermChooserFragment.EXTRA_INSTALLMENT, PaymentMethod.class);
                obj = (Parcelable) parcelable;
            } else {
                Parcelable parcelable3 = arguments.getParcelable(InstallmentTermChooserFragment.EXTRA_INSTALLMENT);
                if (parcelable3 instanceof PaymentMethod) {
                    parcelable2 = parcelable3;
                }
                obj = (PaymentMethod) parcelable2;
            }
            return (PaymentMethod) obj;
        }
    }

    /* renamed from: co.omise.android.ui.InstallmentTermChooserFragment$b */
    /* loaded from: classes3.dex */
    public static final class C5617b extends Lambda implements Function1 {
        public C5617b() {
            super(1);
        }

        /* renamed from: a */
        public final void m51178a(Object obj) {
            View view = InstallmentTermChooserFragment.this.getView();
            if (view != null) {
                InstallmentTermChooserFragment.this.setAllViewsEnabled(view, true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51178a(((Result) obj).m74096unboximpl());
            return Unit.INSTANCE;
        }
    }

    private final PaymentMethod getInstallment() {
        return (PaymentMethod) this.installment$delegate.getValue();
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

    @Override // co.omise.android.p009ui.OmiseListFragment
    @NotNull
    public List<InstallmentTermResource> listItems() {
        BackendType backendType;
        BackendType.Source source;
        SourceType sourceType;
        String string;
        int i;
        Map map;
        SourceType sourceType2;
        double d;
        double d2;
        PaymentCreatorRequester<Source> paymentCreatorRequester = this.requester;
        Intrinsics.checkNotNull(paymentCreatorRequester);
        String currency = paymentCreatorRequester.getCurrency();
        SourceType.Installment.Bay bay = SourceType.Installment.Bay.INSTANCE;
        Amount.Companion companion = Amount.Companion;
        Pair m28844to = TuplesKt.m28844to(bay, companion.fromLocalAmount(500.0d, currency));
        SourceType.Installment.BayWlb bayWlb = SourceType.Installment.BayWlb.INSTANCE;
        Pair m28844to2 = TuplesKt.m28844to(bayWlb, companion.fromLocalAmount(500.0d, currency));
        SourceType.Installment.FirstChoice firstChoice = SourceType.Installment.FirstChoice.INSTANCE;
        Pair m28844to3 = TuplesKt.m28844to(firstChoice, companion.fromLocalAmount(300.0d, currency));
        SourceType.Installment.FirstChoiceWlb firstChoiceWlb = SourceType.Installment.FirstChoiceWlb.INSTANCE;
        Pair m28844to4 = TuplesKt.m28844to(firstChoiceWlb, companion.fromLocalAmount(300.0d, currency));
        SourceType.Installment.Bbl bbl = SourceType.Installment.Bbl.INSTANCE;
        Pair m28844to5 = TuplesKt.m28844to(bbl, companion.fromLocalAmount(500.0d, currency));
        SourceType.Installment.BblWlb bblWlb = SourceType.Installment.BblWlb.INSTANCE;
        Pair m28844to6 = TuplesKt.m28844to(bblWlb, companion.fromLocalAmount(500.0d, currency));
        SourceType.Installment.Mbb mbb = SourceType.Installment.Mbb.INSTANCE;
        Pair m28844to7 = TuplesKt.m28844to(mbb, companion.fromLocalAmount(83.33d, currency));
        SourceType.Installment.Ktc ktc = SourceType.Installment.Ktc.INSTANCE;
        Pair m28844to8 = TuplesKt.m28844to(ktc, companion.fromLocalAmount(300.0d, currency));
        SourceType.Installment.KtcWlb ktcWlb = SourceType.Installment.KtcWlb.INSTANCE;
        Pair m28844to9 = TuplesKt.m28844to(ktcWlb, companion.fromLocalAmount(300.0d, currency));
        SourceType.Installment.KBank kBank = SourceType.Installment.KBank.INSTANCE;
        Pair m28844to10 = TuplesKt.m28844to(kBank, companion.fromLocalAmount(300.0d, currency));
        SourceType.Installment.KBankWlb kBankWlb = SourceType.Installment.KBankWlb.INSTANCE;
        Pair m28844to11 = TuplesKt.m28844to(kBankWlb, companion.fromLocalAmount(300.0d, currency));
        SourceType.Installment.Scb scb = SourceType.Installment.Scb.INSTANCE;
        Pair m28844to12 = TuplesKt.m28844to(scb, companion.fromLocalAmount(500.0d, currency));
        SourceType.Installment.ScbWlb scbWlb = SourceType.Installment.ScbWlb.INSTANCE;
        Pair m28844to13 = TuplesKt.m28844to(scbWlb, companion.fromLocalAmount(500.0d, currency));
        SourceType.Installment.Ttb ttb = SourceType.Installment.Ttb.INSTANCE;
        Pair m28844to14 = TuplesKt.m28844to(ttb, companion.fromLocalAmount(500.0d, currency));
        SourceType.Installment.TtbWlb ttbWlb = SourceType.Installment.TtbWlb.INSTANCE;
        Pair m28844to15 = TuplesKt.m28844to(ttbWlb, companion.fromLocalAmount(500.0d, currency));
        SourceType.Installment.Uob uob = SourceType.Installment.Uob.INSTANCE;
        Map mapOf = AbstractC11687a.mapOf(m28844to, m28844to2, m28844to3, m28844to4, m28844to5, m28844to6, m28844to7, m28844to8, m28844to9, m28844to10, m28844to11, m28844to12, m28844to13, m28844to14, m28844to15, TuplesKt.m28844to(uob, companion.fromLocalAmount(500.0d, currency)));
        Double valueOf = Double.valueOf(0.0074d);
        Pair m28844to16 = TuplesKt.m28844to(bay, valueOf);
        Pair m28844to17 = TuplesKt.m28844to(bayWlb, valueOf);
        Double valueOf2 = Double.valueOf(0.0116d);
        Pair m28844to18 = TuplesKt.m28844to(firstChoice, valueOf2);
        Pair m28844to19 = TuplesKt.m28844to(firstChoiceWlb, valueOf2);
        Pair m28844to20 = TuplesKt.m28844to(bbl, valueOf);
        Pair m28844to21 = TuplesKt.m28844to(bblWlb, valueOf);
        Pair m28844to22 = TuplesKt.m28844to(mbb, Double.valueOf(0.0d));
        Pair m28844to23 = TuplesKt.m28844to(ktc, valueOf);
        Pair m28844to24 = TuplesKt.m28844to(ktcWlb, valueOf);
        Double valueOf3 = Double.valueOf(0.0065d);
        Pair m28844to25 = TuplesKt.m28844to(kBank, valueOf3);
        Pair m28844to26 = TuplesKt.m28844to(kBankWlb, valueOf3);
        Pair m28844to27 = TuplesKt.m28844to(scb, valueOf);
        Pair m28844to28 = TuplesKt.m28844to(scbWlb, valueOf);
        Double valueOf4 = Double.valueOf(0.008d);
        Map map2 = mapOf;
        Map mapOf2 = AbstractC11687a.mapOf(m28844to16, m28844to17, m28844to18, m28844to19, m28844to20, m28844to21, m28844to22, m28844to23, m28844to24, m28844to25, m28844to26, m28844to27, m28844to28, TuplesKt.m28844to(ttb, valueOf4), TuplesKt.m28844to(ttbWlb, valueOf4), TuplesKt.m28844to(uob, Double.valueOf(0.0064d)));
        PaymentMethod installment = getInstallment();
        List<Integer> list = null;
        if (installment != null) {
            backendType = PaymentMethodKt.getBackendType(installment);
        } else {
            backendType = null;
        }
        if (backendType instanceof BackendType.Source) {
            source = (BackendType.Source) backendType;
        } else {
            source = null;
        }
        if (source != null) {
            sourceType = source.getSourceType();
        } else {
            sourceType = null;
        }
        Intrinsics.checkNotNull(sourceType);
        String name = sourceType.getName();
        Intrinsics.checkNotNull(name);
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        boolean contains$default = StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "_wlb_", false, 2, (Object) null);
        PaymentMethod installment2 = getInstallment();
        if (installment2 != null) {
            list = installment2.getInstallmentTerms();
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList<Number> arrayList = new ArrayList();
        for (Object obj : list) {
            int intValue = ((Number) obj).intValue();
            Map map3 = map2;
            Amount amount = (Amount) map3.get(sourceType);
            PaymentCreatorRequester<Source> paymentCreatorRequester2 = this.requester;
            Intrinsics.checkNotNull(paymentCreatorRequester2);
            long amount2 = paymentCreatorRequester2.getAmount();
            if (!paymentCreatorRequester2.getCapability().getZeroInterestInstallments()) {
                Double d3 = (Double) mapOf2.get(sourceType);
                if (d3 != null) {
                    d2 = d3.doubleValue();
                    map = mapOf2;
                    sourceType2 = sourceType;
                } else {
                    map = mapOf2;
                    sourceType2 = sourceType;
                    d2 = 0.0d;
                }
                d = amount2 * d2;
            } else {
                map = mapOf2;
                sourceType2 = sourceType;
                d = 0.0d;
            }
            double d4 = (amount2 + d) / intValue;
            if (amount == null || d4 >= amount.getAmount()) {
                arrayList.add(obj);
            }
            map2 = map3;
            mapOf2 = map;
            sourceType = sourceType2;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList, 10));
        for (Number number : arrayList) {
            int intValue2 = number.intValue();
            if (intValue2 > 1) {
                string = getString(C5511R.C5518string.payment_method_installment_term_months_title, Integer.valueOf(intValue2));
            } else {
                string = getString(C5511R.C5518string.payment_method_installment_term_month_title, Integer.valueOf(intValue2));
            }
            String str = string;
            Intrinsics.checkNotNullExpressionValue(str, "if (this > 1) {\n        …                        }");
            if (contains$default) {
                i = C5511R.C5513drawable.ic_next;
            } else {
                i = C5511R.C5513drawable.ic_redirect;
            }
            arrayList2.add(new InstallmentTermResource(null, str, intValue2, i, 1, null));
        }
        return arrayList2;
    }

    @Override // co.omise.android.p009ui.OmiseListFragment, co.omise.android.p009ui.OmiseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // co.omise.android.p009ui.OmiseListFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String str;
        Object obj;
        Integer titleRes;
        BackendType backendType;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Iterator<T> it = InstallmentResource.Companion.getAll().iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                SourceType sourceType = ((InstallmentResource) obj).getSourceType();
                PaymentMethod installment = getInstallment();
                if (installment != null) {
                    backendType = PaymentMethodKt.getBackendType(installment);
                } else {
                    backendType = null;
                }
                Intrinsics.checkNotNull(backendType, "null cannot be cast to non-null type co.omise.android.models.BackendType.Source");
                if (Intrinsics.areEqual(sourceType, ((BackendType.Source) backendType).getSourceType())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InstallmentResource installmentResource = (InstallmentResource) obj;
        if (installmentResource != null && ((titleRes = installmentResource.getTitleRes()) == null || (str = getString(titleRes.intValue())) == null)) {
            str = getTitle();
        }
        setTitle(str);
        setHasOptionsMenu(true);
    }

    public final void setRequester(@Nullable PaymentCreatorRequester<Source> paymentCreatorRequester) {
        this.requester = paymentCreatorRequester;
    }

    @Override // co.omise.android.p009ui.OmiseListFragment
    public void onListItemClicked(@NotNull InstallmentTermResource item) {
        Intent intent;
        Intent intent2;
        Intrinsics.checkNotNullParameter(item, "item");
        PaymentCreatorRequester<Source> paymentCreatorRequester = this.requester;
        if (paymentCreatorRequester == null) {
            return;
        }
        PaymentMethod installment = getInstallment();
        Boolean bool = null;
        BackendType backendType = installment != null ? PaymentMethodKt.getBackendType(installment) : null;
        BackendType.Source source = backendType instanceof BackendType.Source ? (BackendType.Source) backendType : null;
        SourceType sourceType = source != null ? source.getSourceType() : null;
        Intrinsics.checkNotNull(sourceType);
        String name = sourceType.getName();
        Intrinsics.checkNotNull(name);
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "_wlb_", false, 2, (Object) null)) {
            Intent intent3 = new Intent(getActivity(), CreditCardActivity.class);
            FragmentActivity activity = getActivity();
            intent3.putExtra(OmiseActivity.EXTRA_PKEY, (activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getStringExtra(OmiseActivity.EXTRA_PKEY));
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && (intent = activity2.getIntent()) != null) {
                bool = Boolean.valueOf(intent.getBooleanExtra(OmiseActivity.EXTRA_IS_SECURE, true));
            }
            intent3.putExtra(OmiseActivity.EXTRA_IS_SECURE, bool);
            intent3.putExtra(OmiseActivity.EXTRA_SELECTED_INSTALLMENTS_TERM, item.getInstallmentTerm());
            intent3.putExtra(OmiseActivity.EXTRA_SELECTED_INSTALLMENTS_PAYMENT_METHOD, getInstallment());
            intent3.putExtra(OmiseActivity.EXTRA_CURRENCY, paymentCreatorRequester.getCurrency());
            intent3.putExtra(OmiseActivity.EXTRA_CAPABILITY, paymentCreatorRequester.getCapability());
            intent3.putExtra(OmiseActivity.EXTRA_AMOUNT, paymentCreatorRequester.getAmount());
            FragmentActivity activity3 = getActivity();
            if (activity3 != null) {
                activity3.startActivityForResult(intent3, 101);
                return;
            }
            return;
        }
        View view = getView();
        if (view != null) {
            setAllViewsEnabled(view, false);
        }
        Request<Source> build = new Source.CreateSourceRequestBuilder(paymentCreatorRequester.getAmount(), paymentCreatorRequester.getCurrency(), sourceType).installmentTerm(item.getInstallmentTerm()).zeroInterestInstallments(paymentCreatorRequester.getCapability().getZeroInterestInstallments()).build();
        PaymentCreatorRequester<Source> paymentCreatorRequester2 = this.requester;
        if (paymentCreatorRequester2 != null) {
            paymentCreatorRequester2.request(build, new C5617b());
        }
    }
}
