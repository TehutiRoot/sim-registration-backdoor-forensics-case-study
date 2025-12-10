package co.omise.android.p009ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import co.omise.android.C5511R;
import co.omise.android.models.CountryInfo;
import co.omise.android.p009ui.CountryListDialogFragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.text.Collator;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m28850d2 = {"Lco/omise/android/ui/CountryListDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "listView", "Landroidx/recyclerview/widget/RecyclerView;", "getListView", "()Landroidx/recyclerview/widget/RecyclerView;", "listView$delegate", "Lkotlin/Lazy;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lco/omise/android/ui/CountryListDialogFragment$CountryListDialogListener;", "getListener", "()Lco/omise/android/ui/CountryListDialogFragment$CountryListDialogListener;", "setListener", "(Lco/omise/android/ui/CountryListDialogFragment$CountryListDialogListener;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar$delegate", "getTheme", "", "onCountryClick", "", "country", "Lco/omise/android/models/CountryInfo;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", Promotion.ACTION_VIEW, "CountryListDialogListener", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.CountryListDialogFragment */
/* loaded from: classes3.dex */
public final class CountryListDialogFragment extends DialogFragment {
    @Nullable
    private CountryListDialogListener listener;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy listView$delegate = LazyKt__LazyJVMKt.lazy(new C5558a());
    @NotNull
    private final Lazy toolbar$delegate = LazyKt__LazyJVMKt.lazy(new C5560c());

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lco/omise/android/ui/CountryListDialogFragment$CountryListDialogListener;", "", "onCountrySelected", "", "country", "Lco/omise/android/models/CountryInfo;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.CountryListDialogFragment$CountryListDialogListener */
    /* loaded from: classes3.dex */
    public interface CountryListDialogListener {
        void onCountrySelected(@NotNull CountryInfo countryInfo);
    }

    /* renamed from: co.omise.android.ui.CountryListDialogFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5558a extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5558a() {
            super(0);
            CountryListDialogFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RecyclerView invoke() {
            return (RecyclerView) CountryListDialogFragment.this._$_findCachedViewById(C5511R.C5514id.country_list);
        }
    }

    /* renamed from: co.omise.android.ui.CountryListDialogFragment$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5559b extends FunctionReferenceImpl implements Function1 {
        public C5559b(Object obj) {
            super(1, obj, CountryListDialogFragment.class, "onCountryClick", "onCountryClick(Lco/omise/android/models/CountryInfo;)V", 0);
        }

        /* renamed from: a */
        public final void m51238a(CountryInfo p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CountryListDialogFragment) this.receiver).onCountryClick(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51238a((CountryInfo) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: co.omise.android.ui.CountryListDialogFragment$c */
    /* loaded from: classes3.dex */
    public static final class C5560c extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5560c() {
            super(0);
            CountryListDialogFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Toolbar invoke() {
            return (Toolbar) CountryListDialogFragment.this._$_findCachedViewById(C5511R.C5514id.toolbar_country_list);
        }
    }

    private final RecyclerView getListView() {
        Object value = this.listView$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-listView>(...)");
        return (RecyclerView) value;
    }

    private final Toolbar getToolbar() {
        Object value = this.toolbar$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-toolbar>(...)");
        return (Toolbar) value;
    }

    /* renamed from: n */
    public static /* synthetic */ int m51241n(CountryInfo countryInfo, CountryInfo countryInfo2) {
        return m73941onViewCreated$lambda1(countryInfo, countryInfo2);
    }

    public final void onCountryClick(CountryInfo countryInfo) {
        CountryListDialogListener countryListDialogListener = this.listener;
        if (countryListDialogListener != null) {
            countryListDialogListener.onCountrySelected(countryInfo);
        }
        dismiss();
    }

    /* renamed from: onViewCreated$lambda-0 */
    public static final boolean m73940onViewCreated$lambda0(CountryListDialogFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (menuItem.getItemId() == C5511R.C5514id.close_menu) {
            this$0.dismiss();
            return true;
        }
        return true;
    }

    /* renamed from: onViewCreated$lambda-1 */
    public static final int m73941onViewCreated$lambda1(CountryInfo countryInfo, CountryInfo countryInfo2) {
        return Collator.getInstance().compare(countryInfo.getName(), countryInfo2.getName());
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

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
    public final CountryListDialogListener getListener() {
        return this.listener;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return C5511R.C5519style.OmiseFullScreenDialogTheme;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C5511R.C5515layout.dialog_country_list, viewGroup);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        getToolbar().setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: Oy
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m73940onViewCreated$lambda0;
                m73940onViewCreated$lambda0 = CountryListDialogFragment.m73940onViewCreated$lambda0(CountryListDialogFragment.this, menuItem);
                return m73940onViewCreated$lambda0;
            }
        });
        CountryListAdapter countryListAdapter = new CountryListAdapter(new C5559b(this));
        getListView().setAdapter(countryListAdapter);
        countryListAdapter.submitList(CollectionsKt___CollectionsKt.sortedWith(CountryInfo.Companion.getALL(), new Comparator() { // from class: Py
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CountryListDialogFragment.m51241n((CountryInfo) obj, (CountryInfo) obj2);
            }
        }));
    }

    public final void setListener(@Nullable CountryListDialogListener countryListDialogListener) {
        this.listener = countryListDialogListener;
    }
}
