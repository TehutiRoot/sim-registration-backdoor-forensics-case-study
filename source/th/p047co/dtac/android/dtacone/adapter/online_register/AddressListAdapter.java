package th.p047co.dtac.android.dtacone.adapter.online_register;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.online_register.AddressListAdapter;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.address_from_postcode.response.AmphurItem;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.address_from_postcode.response.GetAddressFromPostcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.address_from_postcode.response.TumbonItem;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003012B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0013R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/AddressListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "mContext", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/GetAddressFromPostcodeResponse;", "data", "", "dataType", "", "selectedAmphurPos", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/GetAddressFromPostcodeResponse;Ljava/lang/String;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/adapter/online_register/AddressListAdapter$OnClickData;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/online_register/AddressListAdapter$OnClickData;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/GetAddressFromPostcodeResponse;", "getData", "()Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/GetAddressFromPostcodeResponse;", OperatorName.CURVE_TO, "Ljava/lang/String;", "getDataType", "()Ljava/lang/String;", "d", "I", "getSelectedAmphurPos", "e", "Lth/co/dtac/android/dtacone/adapter/online_register/AddressListAdapter$OnClickData;", "Companion", "MainPackItemViewHolder", "OnClickData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressListAdapter.kt\nth/co/dtac/android/dtacone/adapter/online_register/AddressListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.online_register.AddressListAdapter */
/* loaded from: classes7.dex */
public final class AddressListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NotNull
    public static final String AMPHUR = "AMPHUR";
    @NotNull
    public static final String TUMBON = "TUMBON";

    /* renamed from: a */
    public final Context f81331a;

    /* renamed from: b */
    public final GetAddressFromPostcodeResponse f81332b;

    /* renamed from: c */
    public final String f81333c;

    /* renamed from: d */
    public final int f81334d;

    /* renamed from: e */
    public OnClickData f81335e;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/AddressListAdapter$Companion;", "", "()V", "AMPHUR", "", "TUMBON", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.online_register.AddressListAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/AddressListAdapter$MainPackItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/online_register/AddressListAdapter;Landroid/view/View;)V", "Landroid/widget/LinearLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/LinearLayout;", "getItemLayout", "()Landroid/widget/LinearLayout;", "setItemLayout", "(Landroid/widget/LinearLayout;)V", "itemLayout", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvMainPackName", "()Landroid/widget/TextView;", "setTvMainPackName", "(Landroid/widget/TextView;)V", "tvMainPackName", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.online_register.AddressListAdapter$MainPackItemViewHolder */
    /* loaded from: classes7.dex */
    public final class MainPackItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public LinearLayout f81336a;

        /* renamed from: b */
        public TextView f81337b;

        /* renamed from: c */
        public final /* synthetic */ AddressListAdapter f81338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainPackItemViewHolder(@NotNull AddressListAdapter addressListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81338c = addressListAdapter;
            View findViewById = view.findViewById(R.id.itemLayout);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f81336a = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvMainPackName);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81337b = (TextView) findViewById2;
        }

        @NotNull
        public final LinearLayout getItemLayout() {
            return this.f81336a;
        }

        @NotNull
        public final TextView getTvMainPackName() {
            return this.f81337b;
        }

        public final void setItemLayout(@NotNull LinearLayout linearLayout) {
            Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
            this.f81336a = linearLayout;
        }

        public final void setTvMainPackName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.f81337b = textView;
        }
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/AddressListAdapter$OnClickData;", "", "onClickAmphur", "", "data", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/AmphurItem;", "pos", "", "onClicktumbon", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/address_from_postcode/response/TumbonItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.online_register.AddressListAdapter$OnClickData */
    /* loaded from: classes7.dex */
    public interface OnClickData {
        void onClickAmphur(@NotNull AmphurItem amphurItem, int i);

        void onClicktumbon(@NotNull TumbonItem tumbonItem, int i);
    }

    public AddressListAdapter(@NotNull Context mContext, @NotNull GetAddressFromPostcodeResponse data, @NotNull String dataType, int i) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        this.f81331a = mContext;
        this.f81332b = data;
        this.f81333c = dataType;
        this.f81334d = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20304a(AmphurItem amphurItem, AddressListAdapter addressListAdapter, int i, View view) {
        m20302c(amphurItem, addressListAdapter, i, view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20303b(TumbonItem tumbonItem, AddressListAdapter addressListAdapter, int i, View view) {
        m20301d(tumbonItem, addressListAdapter, i, view);
    }

    /* renamed from: c */
    public static final void m20302c(AmphurItem amphurItem, AddressListAdapter this$0, int i, View view) {
        OnClickData onClickData;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (amphurItem != null && (onClickData = this$0.f81335e) != null) {
            onClickData.onClickAmphur(amphurItem, i);
        }
    }

    /* renamed from: d */
    public static final void m20301d(TumbonItem tumbonItem, AddressListAdapter this$0, int i, View view) {
        OnClickData onClickData;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (tumbonItem != null && (onClickData = this$0.f81335e) != null) {
            onClickData.onClicktumbon(tumbonItem, i);
        }
    }

    @NotNull
    public final GetAddressFromPostcodeResponse getData() {
        return this.f81332b;
    }

    @NotNull
    public final String getDataType() {
        return this.f81333c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        AmphurItem amphurItem;
        List<TumbonItem> tumbon;
        if (Intrinsics.areEqual(this.f81333c, "AMPHUR")) {
            List<AmphurItem> amphur = this.f81332b.getAmphur();
            if (amphur == null) {
                return 0;
            }
            return amphur.size();
        }
        List<AmphurItem> amphur2 = this.f81332b.getAmphur();
        if (amphur2 == null || (amphurItem = amphur2.get(this.f81334d)) == null || (tumbon = amphurItem.getTumbon()) == null) {
            return 0;
        }
        return tumbon.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @NotNull
    public final Context getMContext() {
        return this.f81331a;
    }

    public final int getSelectedAmphurPos() {
        return this.f81334d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, final int i) {
        final TumbonItem tumbonItem;
        AmphurItem amphurItem;
        List<TumbonItem> tumbon;
        final AmphurItem amphurItem2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        String str = null;
        if (Intrinsics.areEqual(this.f81333c, "AMPHUR")) {
            List<AmphurItem> amphur = this.f81332b.getAmphur();
            if (amphur != null) {
                amphurItem2 = amphur.get(i);
            } else {
                amphurItem2 = null;
            }
            if (holder instanceof MainPackItemViewHolder) {
                MainPackItemViewHolder mainPackItemViewHolder = (MainPackItemViewHolder) holder;
                TextView tvMainPackName = mainPackItemViewHolder.getTvMainPackName();
                if (amphurItem2 != null) {
                    str = amphurItem2.getAmphurName();
                }
                tvMainPackName.setText(str);
                mainPackItemViewHolder.getItemLayout().setOnClickListener(new View.OnClickListener() { // from class: w2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AddressListAdapter.m20304a(amphurItem2, this, i, view);
                    }
                });
                return;
            }
            return;
        }
        List<AmphurItem> amphur2 = this.f81332b.getAmphur();
        if (amphur2 != null && (amphurItem = amphur2.get(this.f81334d)) != null && (tumbon = amphurItem.getTumbon()) != null) {
            tumbonItem = tumbon.get(i);
        } else {
            tumbonItem = null;
        }
        if (holder instanceof MainPackItemViewHolder) {
            MainPackItemViewHolder mainPackItemViewHolder2 = (MainPackItemViewHolder) holder;
            TextView tvMainPackName2 = mainPackItemViewHolder2.getTvMainPackName();
            if (tumbonItem != null) {
                str = tumbonItem.getTumbonName();
            }
            tvMainPackName2.setText(str);
            mainPackItemViewHolder2.getItemLayout().setOnClickListener(new View.OnClickListener() { // from class: x2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddressListAdapter.m20303b(tumbonItem, this, i, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f81331a).inflate(R.layout.item_main_pack_row, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new MainPackItemViewHolder(this, view);
    }

    public final void setListener(@NotNull OnClickData listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81335e = listener;
    }
}
