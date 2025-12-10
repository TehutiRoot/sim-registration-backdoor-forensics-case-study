package co.omise.android.p009ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import co.omise.android.C5511R;
import co.omise.android.api.Request;
import co.omise.android.models.PaymentMethod;
import co.omise.android.models.Source;
import co.omise.android.models.SourceType;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u001a\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m28850d2 = {"Lco/omise/android/ui/InternetBankingChooserFragment;", "Lco/omise/android/ui/OmiseListFragment;", "Lco/omise/android/ui/InternetBankingResource;", "()V", "allowedBanks", "", "Lco/omise/android/models/SourceType$InternetBanking;", "getAllowedBanks", "()Ljava/util/List;", "allowedBanks$delegate", "Lkotlin/Lazy;", "requester", "Lco/omise/android/ui/PaymentCreatorRequester;", "Lco/omise/android/models/Source;", "getRequester", "()Lco/omise/android/ui/PaymentCreatorRequester;", "setRequester", "(Lco/omise/android/ui/PaymentCreatorRequester;)V", "listItems", "onListItemClicked", "", "item", "onViewCreated", Promotion.ACTION_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.InternetBankingChooserFragment */
/* loaded from: classes3.dex */
public final class InternetBankingChooserFragment extends OmiseListFragment<InternetBankingResource> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String EXTRA_INTERNET_BANKING_METHODS = "InternetBankingChooserFragment.internetBankingMethods";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy allowedBanks$delegate = LazyKt__LazyJVMKt.lazy(new C5618a());
    @Nullable
    private PaymentCreatorRequester<Source> requester;

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28850d2 = {"Lco/omise/android/ui/InternetBankingChooserFragment$Companion;", "", "()V", "EXTRA_INTERNET_BANKING_METHODS", "", "newInstance", "Lco/omise/android/ui/InternetBankingChooserFragment;", "availableBanks", "", "Lco/omise/android/models/PaymentMethod;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InternetBankingChooserFragment$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InternetBankingChooserFragment newInstance(@NotNull List<PaymentMethod> availableBanks) {
            Intrinsics.checkNotNullParameter(availableBanks, "availableBanks");
            InternetBankingChooserFragment internetBankingChooserFragment = new InternetBankingChooserFragment();
            Bundle bundle = new Bundle();
            Object[] array = availableBanks.toArray(new PaymentMethod[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            bundle.putParcelableArray(InternetBankingChooserFragment.EXTRA_INTERNET_BANKING_METHODS, (Parcelable[]) array);
            internetBankingChooserFragment.setArguments(bundle);
            return internetBankingChooserFragment;
        }

        private Companion() {
        }
    }

    /* renamed from: co.omise.android.ui.InternetBankingChooserFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5618a extends Lambda implements Function0 {
        public C5618a() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
            if (r0 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
            if (r0 == null) goto L40;
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
                co.omise.android.ui.InternetBankingChooserFragment r0 = co.omise.android.p009ui.InternetBankingChooserFragment.this
                android.os.Bundle r0 = r0.getArguments()
                if (r0 != 0) goto Ld
                java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
                return r0
            Ld:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 33
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                r4 = 0
                java.lang.String r5 = "InternetBankingChooserFragment.internetBankingMethods"
                if (r1 < r2) goto L48
                java.lang.Class<co.omise.android.models.PaymentMethod> r1 = co.omise.android.models.PaymentMethod.class
                java.lang.Object[] r0 = p000.AbstractC5381bd.m51966a(r0, r5, r1)
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
                co.omise.android.models.PaymentMethod[] r0 = (co.omise.android.models.PaymentMethod[]) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                int r2 = r0.length
            L86:
                java.lang.String r3 = "null cannot be cast to non-null type co.omise.android.models.BackendType.Source"
                if (r4 >= r2) goto Lab
                r5 = r0[r4]
                co.omise.android.models.BackendType r6 = co.omise.android.models.PaymentMethodKt.getBackendType(r5)
                boolean r6 = r6 instanceof co.omise.android.models.BackendType.Source
                if (r6 == 0) goto La8
                co.omise.android.models.BackendType r6 = co.omise.android.models.PaymentMethodKt.getBackendType(r5)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r3)
                co.omise.android.models.BackendType$Source r6 = (co.omise.android.models.BackendType.Source) r6
                co.omise.android.models.SourceType r3 = r6.getSourceType()
                boolean r3 = r3 instanceof co.omise.android.models.SourceType.InternetBanking
                if (r3 == 0) goto La8
                r1.add(r5)
            La8:
                int r4 = r4 + 1
                goto L86
            Lab:
                java.util.ArrayList r0 = new java.util.ArrayList
                r2 = 10
                int r2 = p000.AbstractC10176es.collectionSizeOrDefault(r1, r2)
                r0.<init>(r2)
                java.util.Iterator r1 = r1.iterator()
            Lba:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Lde
                java.lang.Object r2 = r1.next()
                co.omise.android.models.PaymentMethod r2 = (co.omise.android.models.PaymentMethod) r2
                co.omise.android.models.BackendType r2 = co.omise.android.models.PaymentMethodKt.getBackendType(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                co.omise.android.models.BackendType$Source r2 = (co.omise.android.models.BackendType.Source) r2
                co.omise.android.models.SourceType r2 = r2.getSourceType()
                java.lang.String r4 = "null cannot be cast to non-null type co.omise.android.models.SourceType.InternetBanking"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
                co.omise.android.models.SourceType$InternetBanking r2 = (co.omise.android.models.SourceType.InternetBanking) r2
                r0.add(r2)
                goto Lba
            Lde:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: co.omise.android.p009ui.InternetBankingChooserFragment.C5618a.invoke():java.util.List");
        }
    }

    /* renamed from: co.omise.android.ui.InternetBankingChooserFragment$b */
    /* loaded from: classes3.dex */
    public static final class C5619b extends Lambda implements Function1 {
        public C5619b() {
            super(1);
        }

        /* renamed from: a */
        public final void m51176a(Object obj) {
            View view = InternetBankingChooserFragment.this.getView();
            if (view != null) {
                InternetBankingChooserFragment.this.setAllViewsEnabled(view, true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51176a(((Result) obj).m74096unboximpl());
            return Unit.INSTANCE;
        }
    }

    private final List<SourceType.InternetBanking> getAllowedBanks() {
        return (List) this.allowedBanks$delegate.getValue();
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
    public List<InternetBankingResource> listItems() {
        return PaymentMethodResourcesKt.getInternetBankingResources(getAllowedBanks());
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
        setTitle(getString(C5511R.C5518string.internet_banking_chooser_title));
        setHasOptionsMenu(true);
    }

    public final void setRequester(@Nullable PaymentCreatorRequester<Source> paymentCreatorRequester) {
        this.requester = paymentCreatorRequester;
    }

    @Override // co.omise.android.p009ui.OmiseListFragment
    public void onListItemClicked(@NotNull InternetBankingResource item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PaymentCreatorRequester<Source> paymentCreatorRequester = this.requester;
        if (paymentCreatorRequester == null) {
            return;
        }
        View view = getView();
        if (view != null) {
            setAllViewsEnabled(view, false);
        }
        Request<Source> build = new Source.CreateSourceRequestBuilder(paymentCreatorRequester.getAmount(), paymentCreatorRequester.getCurrency(), item.getSourceType()).build();
        PaymentCreatorRequester<Source> paymentCreatorRequester2 = this.requester;
        if (paymentCreatorRequester2 != null) {
            paymentCreatorRequester2.request(build, new C5619b());
        }
    }
}
