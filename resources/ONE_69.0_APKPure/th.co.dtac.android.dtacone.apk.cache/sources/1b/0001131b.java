package th.p047co.dtac.android.dtacone.app_one.widget.dialog.address;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
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
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001d\u001a\u00020\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListFragment;", "Landroidx/fragment/app/ListFragment;", "Landroid/widget/AdapterView$OnItemClickListener;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", FirebaseAnalytics.Param.ITEMS, "setItems", "(Ljava/util/List;)V", "notifyDataSetChanged", "getSelectedItem", "()Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "item", "setSelectedItem", "(Lth/co/dtac/android/dtacone/model/address/AddressItemData;)V", "Landroid/widget/AdapterView;", "parent", "", "position", "", "id", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Landroid/widget/ArrayAdapter;", OperatorName.LINE_TO, "Landroid/widget/ArrayAdapter;", "adapter", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", OperatorName.ENDPATH, "()I", "pageId", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneAddressListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneAddressListFragment.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1855#2,2:60\n*S KotlinDebug\n*F\n+ 1 OneAddressListFragment.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListFragment\n*L\n24#1:60,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressListFragment */
/* loaded from: classes7.dex */
public final class OneAddressListFragment extends ListFragment implements AdapterView.OnItemClickListener {

    /* renamed from: l */
    public ArrayAdapter f83138l;

    /* renamed from: m */
    public AddressItemData f83139m;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListFragment$Companion;", "", "()V", "EXTRA_PAGE_ID", "", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListFragment;", "pageId", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressListFragment$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneAddressListFragment newInstance(int i) {
            Bundle bundle = new Bundle();
            OneAddressListFragment oneAddressListFragment = new OneAddressListFragment();
            bundle.putInt("EXTRA_PAGE_ID", i);
            oneAddressListFragment.setArguments(bundle);
            return oneAddressListFragment;
        }

        public Companion() {
        }
    }

    @Nullable
    public final AddressItemData getSelectedItem() {
        return this.f83139m;
    }

    /* renamed from: n */
    public final int m19827n() {
        return requireArguments().getInt("EXTRA_PAGE_ID");
    }

    public final void notifyDataSetChanged() {
        ArrayAdapter arrayAdapter = this.f83138l;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(@NotNull AdapterView<?> parent, @NotNull View view, int i, long j) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        Object itemAtPosition = parent.getItemAtPosition(i);
        Intrinsics.checkNotNull(itemAtPosition, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.address.AddressItemData");
        this.f83139m = (AddressItemData) itemAtPosition;
        Fragment parentFragment = getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment");
        ((OneAddressInfoDialogFragment) parentFragment).setMailAddressPage(m19827n() + 1);
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        int i = R.layout.one_location_address_row;
        if (getTargetRequestCode() != 3) {
            z = true;
        } else {
            z = false;
        }
        OneMailingAddressAdapter oneMailingAddressAdapter = new OneMailingAddressAdapter(requireContext, i, z);
        this.f83138l = oneMailingAddressAdapter;
        setListAdapter(oneMailingAddressAdapter);
        getListView().setOnItemClickListener(this);
    }

    public final void setItems(@Nullable List<AddressItemData> list) {
        int i;
        ArrayAdapter arrayAdapter = this.f83138l;
        if (arrayAdapter != null) {
            arrayAdapter.clear();
        }
        if (list != null) {
            for (AddressItemData addressItemData : list) {
                ArrayAdapter arrayAdapter2 = this.f83138l;
                if (arrayAdapter2 != null) {
                    if (arrayAdapter2 != null) {
                        i = arrayAdapter2.getCount();
                    } else {
                        i = 0;
                    }
                    arrayAdapter2.insert(addressItemData, i);
                }
            }
        }
        ArrayAdapter arrayAdapter3 = this.f83138l;
        if (arrayAdapter3 != null) {
            arrayAdapter3.notifyDataSetChanged();
        }
    }

    public final void setSelectedItem(@Nullable AddressItemData addressItemData) {
        this.f83139m = addressItemData;
    }
}