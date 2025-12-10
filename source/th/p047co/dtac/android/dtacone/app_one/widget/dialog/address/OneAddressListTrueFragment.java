package th.p047co.dtac.android.dtacone.app_one.widget.dialog.address;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00052\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010$\u001a\u00020\u00052\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListTrueFragment;", "Landroidx/fragment/app/ListFragment;", "Landroid/widget/AdapterView$OnItemClickListener;", "<init>", "()V", "", "o", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "", FirebaseAnalytics.Param.ITEMS, "setItems", "(Ljava/util/List;)V", "notifyDataSetChanged", "getSelectedItem", "()Ljava/lang/Object;", "item", "setSelectedItem", "(Ljava/lang/Object;)V", "Landroid/widget/AdapterView;", "parent", "", "position", "", "id", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Landroid/widget/ArrayAdapter;", OperatorName.LINE_TO, "Landroid/widget/ArrayAdapter;", "adapter", OperatorName.MOVE_TO, "Ljava/lang/Object;", OperatorName.ENDPATH, "()I", "pageId", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneAddressListTrueFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneAddressListTrueFragment.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListTrueFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1855#2,2:75\n*S KotlinDebug\n*F\n+ 1 OneAddressListTrueFragment.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListTrueFragment\n*L\n39#1:75,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressListTrueFragment */
/* loaded from: classes7.dex */
public final class OneAddressListTrueFragment extends ListFragment implements AdapterView.OnItemClickListener {

    /* renamed from: l */
    public ArrayAdapter f83048l;

    /* renamed from: m */
    public Object f83049m;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListTrueFragment$Companion;", "", "()V", "EXTRA_PAGE_ID", "", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListTrueFragment;", "pageId", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressListTrueFragment$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneAddressListTrueFragment newInstance(int i) {
            Bundle bundle = new Bundle();
            OneAddressListTrueFragment oneAddressListTrueFragment = new OneAddressListTrueFragment();
            bundle.putInt("EXTRA_PAGE_ID", i);
            oneAddressListTrueFragment.setArguments(bundle);
            return oneAddressListTrueFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: n */
    private final int m19651n() {
        return requireArguments().getInt("EXTRA_PAGE_ID");
    }

    /* renamed from: o */
    private final void m19650o() {
        boolean z;
        if (this.f83048l == null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            int i = R.layout.one_location_address_row;
            if (getTargetRequestCode() != 3) {
                z = true;
            } else {
                z = false;
            }
            OneMailingAddressTrueAdapter oneMailingAddressTrueAdapter = new OneMailingAddressTrueAdapter(requireContext, i, z);
            this.f83048l = oneMailingAddressTrueAdapter;
            setListAdapter(oneMailingAddressTrueAdapter);
            getListView().setOnItemClickListener(this);
        }
    }

    @Nullable
    public final Object getSelectedItem() {
        return this.f83049m;
    }

    public final void notifyDataSetChanged() {
        ArrayAdapter arrayAdapter = this.f83048l;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(@NotNull AdapterView<?> parent, @NotNull View view, int i, long j) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        Object itemAtPosition = parent.getItemAtPosition(i);
        Intrinsics.checkNotNull(itemAtPosition, "null cannot be cast to non-null type kotlin.Any");
        this.f83049m = itemAtPosition;
        Fragment parentFragment = getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment");
        ((OneAddressInfoDialogTrueFragment) parentFragment).setMailAddressPage(m19651n() + 1);
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        m19650o();
    }

    public final void setItems(@Nullable List<? extends Object> list) {
        int i;
        ArrayAdapter arrayAdapter = this.f83048l;
        if (arrayAdapter != null) {
            arrayAdapter.clear();
        }
        if (list != null) {
            for (Object obj : list) {
                ArrayAdapter arrayAdapter2 = this.f83048l;
                if (arrayAdapter2 != null) {
                    if (arrayAdapter2 != null) {
                        i = arrayAdapter2.getCount();
                    } else {
                        i = 0;
                    }
                    arrayAdapter2.insert(obj, i);
                }
            }
        }
        ArrayAdapter arrayAdapter3 = this.f83048l;
        if (arrayAdapter3 != null) {
            arrayAdapter3.notifyDataSetChanged();
        }
    }

    public final void setSelectedItem(@Nullable Object obj) {
        this.f83049m = obj;
    }
}
