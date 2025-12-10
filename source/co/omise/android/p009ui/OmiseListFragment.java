package co.omise.android.p009ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.omise.android.C5511R;
import co.omise.android.p009ui.OmiseListItem;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.perf.util.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000*\u0001\u0011\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H&J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0000H&¢\u0006\u0002\u0010%J\u001a\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0004R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m28850d2 = {"Lco/omise/android/ui/OmiseListFragment;", "T", "Lco/omise/android/ui/OmiseListItem;", "Lco/omise/android/ui/OmiseFragment;", "()V", "adapter", "Lco/omise/android/ui/OmiseListAdapter;", "getAdapter", "()Lco/omise/android/ui/OmiseListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "noDataText", "Landroid/widget/TextView;", "getNoDataText", "()Landroid/widget/TextView;", "noDataText$delegate", "onClickListener", "co/omise/android/ui/OmiseListFragment$onClickListener$1", "Lco/omise/android/ui/OmiseListFragment$onClickListener$1;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "listItems", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onListItemClicked", "", "item", "(Lco/omise/android/ui/OmiseListItem;)V", "onViewCreated", Promotion.ACTION_VIEW, "setUiEnabled", Constants.ENABLE_DISABLE, "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.OmiseListFragment */
/* loaded from: classes3.dex */
public abstract class OmiseListFragment<T extends OmiseListItem> extends OmiseFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy noDataText$delegate = LazyKt__LazyJVMKt.lazy(new C5623b());
    @NotNull
    private final Lazy recyclerView$delegate = LazyKt__LazyJVMKt.lazy(new C5624c());
    @NotNull
    private final OmiseListFragment$onClickListener$1 onClickListener = new OmiseListItemClickListener(this) { // from class: co.omise.android.ui.OmiseListFragment$onClickListener$1
        final /* synthetic */ OmiseListFragment<T> this$0;

        {
            this.this$0 = this;
        }

        @Override // co.omise.android.p009ui.OmiseListItemClickListener
        public void onClick(@NotNull OmiseListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.this$0.onListItemClicked(item);
        }
    };
    @NotNull
    private final Lazy adapter$delegate = LazyKt__LazyJVMKt.lazy(new C5622a());

    /* renamed from: co.omise.android.ui.OmiseListFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5622a extends Lambda implements Function0 {
        public C5622a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OmiseListAdapter invoke() {
            return new OmiseListAdapter(OmiseListFragment.this.listItems(), OmiseListFragment.this.onClickListener);
        }
    }

    /* renamed from: co.omise.android.ui.OmiseListFragment$b */
    /* loaded from: classes3.dex */
    public static final class C5623b extends Lambda implements Function0 {
        public C5623b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) OmiseListFragment.this._$_findCachedViewById(C5511R.C5514id.no_data_text);
        }
    }

    /* renamed from: co.omise.android.ui.OmiseListFragment$c */
    /* loaded from: classes3.dex */
    public static final class C5624c extends Lambda implements Function0 {
        public C5624c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RecyclerView invoke() {
            return (RecyclerView) OmiseListFragment.this._$_findCachedViewById(C5511R.C5514id.recycler_view);
        }
    }

    private final OmiseListAdapter getAdapter() {
        return (OmiseListAdapter) this.adapter$delegate.getValue();
    }

    private final RecyclerView getRecyclerView() {
        Object value = this.recyclerView$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
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

    @NotNull
    public final TextView getNoDataText() {
        Object value = this.noDataText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-noDataText>(...)");
        return (TextView) value;
    }

    @NotNull
    public abstract List<T> listItems();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C5511R.C5515layout.fragment_list, viewGroup, false);
    }

    @Override // co.omise.android.p009ui.OmiseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract void onListItemClicked(@NotNull T t);

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        Context context = getContext();
        if (context != null) {
            getRecyclerView().addItemDecoration(new C19298c72(context));
        }
        if (getAdapter().getItemCount() == 0) {
            getNoDataText().setVisibility(0);
        } else {
            getNoDataText().setVisibility(4);
        }
        getRecyclerView().setAdapter(getAdapter());
    }

    public final void setUiEnabled(boolean z) {
        getRecyclerView().setEnabled(z);
    }
}
