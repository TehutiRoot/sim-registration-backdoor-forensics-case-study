package co.omise.android.p009ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import co.omise.android.C5500R;
import co.omise.android.models.BackendType;
import co.omise.android.models.PaymentMethod;
import co.omise.android.models.PaymentMethodKt;
import co.omise.android.models.SourceType;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0002H\u0016J\u001a\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0018\u0010\bR\u001b\u0010\u001a\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001b\u0010\u000e¨\u0006("}, m29142d2 = {"Lco/omise/android/ui/InstallmentChooserFragment;", "Lco/omise/android/ui/OmiseListFragment;", "Lco/omise/android/ui/InstallmentResource;", "()V", "allowedInstallments", "", "Lco/omise/android/models/SourceType$Installment;", "getAllowedInstallments", "()Ljava/util/List;", "allowedInstallments$delegate", "Lkotlin/Lazy;", "capabilityInstallmentAmount", "", "getCapabilityInstallmentAmount", "()J", "capabilityInstallmentAmount$delegate", NotificationCompat.CATEGORY_NAVIGATION, "Lco/omise/android/ui/PaymentCreatorNavigation;", "getNavigation", "()Lco/omise/android/ui/PaymentCreatorNavigation;", "setNavigation", "(Lco/omise/android/ui/PaymentCreatorNavigation;)V", "paymentMethods", "Lco/omise/android/models/PaymentMethod;", "getPaymentMethods", "paymentMethods$delegate", "requestedInstallmentAmount", "getRequestedInstallmentAmount", "requestedInstallmentAmount$delegate", "addNoBanksSupportedMessage", "", "listItems", "onListItemClicked", "item", "onViewCreated", Promotion.ACTION_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* renamed from: co.omise.android.ui.InstallmentChooserFragment */
/* loaded from: classes3.dex */
public final class InstallmentChooserFragment extends OmiseListFragment<InstallmentResource> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String EXTRA_CAPABILITY_INSTALLMENT_AMOUNT = "InstallmentChooserFragment.capabilityInstallmentAmount";
    @NotNull
    private static final String EXTRA_INSTALLMENT_METHODS = "InstallmentChooserFragment.installmentMethods";
    @NotNull
    private static final String EXTRA_REQUESTED_INSTALLMENT_AMOUNT = "InstallmentChooserFragment.requestedInstallmentAmount";
    @Nullable
    private PaymentCreatorNavigation navigation;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy paymentMethods$delegate = LazyKt__LazyJVMKt.lazy(new C5603d());
    @NotNull
    private final Lazy requestedInstallmentAmount$delegate = LazyKt__LazyJVMKt.lazy(new C5604e());
    @NotNull
    private final Lazy capabilityInstallmentAmount$delegate = LazyKt__LazyJVMKt.lazy(new C5601b());
    @NotNull
    private final Lazy allowedInstallments$delegate = LazyKt__LazyJVMKt.lazy(new C5600a());

    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m29142d2 = {"Lco/omise/android/ui/InstallmentChooserFragment$Companion;", "", "()V", "EXTRA_CAPABILITY_INSTALLMENT_AMOUNT", "", "EXTRA_INSTALLMENT_METHODS", "EXTRA_REQUESTED_INSTALLMENT_AMOUNT", "newInstance", "Lco/omise/android/ui/InstallmentChooserFragment;", "availableBanks", "", "Lco/omise/android/models/PaymentMethod;", "requestedInstallmentAmount", "", "capabilityInstallmentAmount", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* renamed from: co.omise.android.ui.InstallmentChooserFragment$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InstallmentChooserFragment newInstance(@NotNull List<PaymentMethod> availableBanks, long j, long j2) {
            Intrinsics.checkNotNullParameter(availableBanks, "availableBanks");
            InstallmentChooserFragment installmentChooserFragment = new InstallmentChooserFragment();
            Bundle bundle = new Bundle();
            Object[] array = availableBanks.toArray(new PaymentMethod[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            bundle.putParcelableArray(InstallmentChooserFragment.EXTRA_INSTALLMENT_METHODS, (Parcelable[]) array);
            bundle.putLong(InstallmentChooserFragment.EXTRA_REQUESTED_INSTALLMENT_AMOUNT, j);
            bundle.putLong(InstallmentChooserFragment.EXTRA_CAPABILITY_INSTALLMENT_AMOUNT, j2);
            installmentChooserFragment.setArguments(bundle);
            return installmentChooserFragment;
        }

        private Companion() {
        }
    }

    /* renamed from: co.omise.android.ui.InstallmentChooserFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5600a extends Lambda implements Function0 {
        public C5600a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final List invoke() {
            List paymentMethods = InstallmentChooserFragment.this.getPaymentMethods();
            ArrayList<PaymentMethod> arrayList = new ArrayList();
            for (Object obj : paymentMethods) {
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                if (PaymentMethodKt.getBackendType(paymentMethod) instanceof BackendType.Source) {
                    BackendType backendType = PaymentMethodKt.getBackendType(paymentMethod);
                    Intrinsics.checkNotNull(backendType, "null cannot be cast to non-null type co.omise.android.models.BackendType.Source");
                    if (((BackendType.Source) backendType).getSourceType() instanceof SourceType.Installment) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(arrayList, 10));
            for (PaymentMethod paymentMethod2 : arrayList) {
                BackendType backendType2 = PaymentMethodKt.getBackendType(paymentMethod2);
                Intrinsics.checkNotNull(backendType2, "null cannot be cast to non-null type co.omise.android.models.BackendType.Source");
                SourceType sourceType = ((BackendType.Source) backendType2).getSourceType();
                Intrinsics.checkNotNull(sourceType, "null cannot be cast to non-null type co.omise.android.models.SourceType.Installment");
                arrayList2.add((SourceType.Installment) sourceType);
            }
            return arrayList2;
        }
    }

    /* renamed from: co.omise.android.ui.InstallmentChooserFragment$b */
    /* loaded from: classes3.dex */
    public static final class C5601b extends Lambda implements Function0 {
        public C5601b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Long invoke() {
            Bundle arguments = InstallmentChooserFragment.this.getArguments();
            if (arguments == null) {
                return 0L;
            }
            return Long.valueOf(arguments.getLong(InstallmentChooserFragment.EXTRA_CAPABILITY_INSTALLMENT_AMOUNT));
        }
    }

    /* renamed from: co.omise.android.ui.InstallmentChooserFragment$c */
    /* loaded from: classes3.dex */
    public static final class C5602c extends Lambda implements Function1 {

        /* renamed from: a */
        final /* synthetic */ InstallmentResource f40352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5602c(InstallmentResource installmentResource) {
            super(1);
            this.f40352a = installmentResource;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InstallmentResource it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String name = it.getSourceType().getName();
            String name2 = this.f40352a.getSourceType().getName();
            Intrinsics.checkNotNull(name2);
            return Boolean.valueOf(Intrinsics.areEqual(name, AbstractC19741eO1.replace$default(name2, "_wlb_", "_", false, 4, (Object) null)));
        }
    }

    /* renamed from: co.omise.android.ui.InstallmentChooserFragment$d */
    /* loaded from: classes3.dex */
    public static final class C5603d extends Lambda implements Function0 {
        public C5603d() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
            if (r0 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
            if (r0 == null) goto L23;
         */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List invoke() {
            /*
                r8 = this;
                co.omise.android.ui.InstallmentChooserFragment r0 = co.omise.android.p009ui.InstallmentChooserFragment.this
                android.os.Bundle r0 = r0.getArguments()
                if (r0 != 0) goto Ld
                java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
                return r0
            Ld:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 33
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                r4 = 0
                java.lang.String r5 = "InstallmentChooserFragment.installmentMethods"
                if (r1 < r2) goto L48
                java.lang.Class<co.omise.android.models.PaymentMethod> r1 = co.omise.android.models.PaymentMethod.class
                java.lang.Object[] r0 = p000.AbstractC5365bd.m51914a(r0, r5, r1)
                android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
                if (r0 == 0) goto L7a
                java.lang.String r1 = "getParcelableArray(key, T::class.java)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                int r2 = r0.length
                r5 = 0
            L2e:
                if (r5 >= r2) goto L3a
                r6 = r0[r5]
                if (r6 == 0) goto L37
                r1.add(r6)
            L37:
                int r5 = r5 + 1
                goto L2e
            L3a:
                co.omise.android.models.PaymentMethod[] r0 = new co.omise.android.models.PaymentMethod[r4]
                java.lang.Object[] r0 = r1.toArray(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)
                android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
                if (r0 != 0) goto L7e
                goto L7a
            L48:
                android.os.Parcelable[] r0 = r0.getParcelableArray(r5)
                if (r0 == 0) goto L7a
                java.lang.String r1 = "getParcelableArray(key)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                int r2 = r0.length
                r5 = 0
            L5a:
                if (r5 >= r2) goto L6d
                r6 = r0[r5]
                boolean r7 = r6 instanceof co.omise.android.models.PaymentMethod
                if (r7 != 0) goto L63
                r6 = 0
            L63:
                co.omise.android.models.PaymentMethod r6 = (co.omise.android.models.PaymentMethod) r6
                if (r6 == 0) goto L6a
                r1.add(r6)
            L6a:
                int r5 = r5 + 1
                goto L5a
            L6d:
                co.omise.android.models.PaymentMethod[] r0 = new co.omise.android.models.PaymentMethod[r4]
                java.lang.Object[] r0 = r1.toArray(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)
                android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
                if (r0 != 0) goto L7e
            L7a:
                co.omise.android.models.PaymentMethod[] r0 = new co.omise.android.models.PaymentMethod[r4]
                android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            L7e:
                java.util.List r0 = kotlin.collections.ArraysKt___ArraysKt.toList(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: co.omise.android.p009ui.InstallmentChooserFragment.C5603d.invoke():java.util.List");
        }
    }

    /* renamed from: co.omise.android.ui.InstallmentChooserFragment$e */
    /* loaded from: classes3.dex */
    public static final class C5604e extends Lambda implements Function0 {
        public C5604e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Long invoke() {
            Bundle arguments = InstallmentChooserFragment.this.getArguments();
            if (arguments == null) {
                return 0L;
            }
            return Long.valueOf(arguments.getLong(InstallmentChooserFragment.EXTRA_REQUESTED_INSTALLMENT_AMOUNT));
        }
    }

    private final void addNoBanksSupportedMessage() {
        LinearLayout linearLayout;
        View view = getView();
        if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(C5500R.C5503id.message_layout);
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    private final List<SourceType.Installment> getAllowedInstallments() {
        return (List) this.allowedInstallments$delegate.getValue();
    }

    private final long getCapabilityInstallmentAmount() {
        return ((Number) this.capabilityInstallmentAmount$delegate.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PaymentMethod> getPaymentMethods() {
        return (List) this.paymentMethods$delegate.getValue();
    }

    private final long getRequestedInstallmentAmount() {
        return ((Number) this.requestedInstallmentAmount$delegate.getValue()).longValue();
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
    public final PaymentCreatorNavigation getNavigation() {
        return this.navigation;
    }

    @Override // co.omise.android.p009ui.OmiseListFragment
    @NotNull
    public List<InstallmentResource> listItems() {
        boolean z;
        List<InstallmentResource> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) PaymentMethodResourcesKt.getInstallmentResources(getAllowedInstallments()));
        List<InstallmentResource> installmentResources = PaymentMethodResourcesKt.getInstallmentResources(getAllowedInstallments());
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(installmentResources, 10));
        for (InstallmentResource installmentResource : installmentResources) {
            arrayList.add(installmentResource.getSourceType().getName());
        }
        for (InstallmentResource installmentResource2 : PaymentMethodResourcesKt.getInstallmentResources(getAllowedInstallments())) {
            String name = installmentResource2.getSourceType().getName();
            Intrinsics.checkNotNull(name);
            if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "_wlb_", false, 2, (Object) null) && arrayList.contains(AbstractC19741eO1.replace$default(name, "_wlb_", "_", false, 4, (Object) null))) {
                AbstractC10396hs.removeAll(mutableList, (Function1) new C5602c(installmentResource2));
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(mutableList, 10));
        for (InstallmentResource installmentResource3 : mutableList) {
            if (getRequestedInstallmentAmount() >= getCapabilityInstallmentAmount()) {
                z = true;
            } else {
                z = false;
            }
            installmentResource3.setEnabled(Boolean.valueOf(z));
            arrayList2.add(installmentResource3);
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
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setTitle(getString(C5500R.C5507string.installments_title));
        setHasOptionsMenu(true);
        if (getRequestedInstallmentAmount() < getCapabilityInstallmentAmount()) {
            addNoBanksSupportedMessage();
        }
    }

    public final void setNavigation(@Nullable PaymentCreatorNavigation paymentCreatorNavigation) {
        this.navigation = paymentCreatorNavigation;
    }

    @Override // co.omise.android.p009ui.OmiseListFragment
    public void onListItemClicked(@NotNull InstallmentResource item) {
        Intrinsics.checkNotNullParameter(item, "item");
        for (PaymentMethod paymentMethod : getPaymentMethods()) {
            BackendType backendType = PaymentMethodKt.getBackendType(paymentMethod);
            Intrinsics.checkNotNull(backendType, "null cannot be cast to non-null type co.omise.android.models.BackendType.Source");
            if (Intrinsics.areEqual(((BackendType.Source) backendType).getSourceType(), item.getSourceType())) {
                PaymentCreatorNavigation paymentCreatorNavigation = this.navigation;
                if (paymentCreatorNavigation != null) {
                    paymentCreatorNavigation.navigateToInstallmentTermChooser(paymentMethod);
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}