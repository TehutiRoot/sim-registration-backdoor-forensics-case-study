package th.p047co.dtac.android.dtacone.adapter.eSIM;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.esim.JsonMemberPackageItem;
import th.p047co.dtac.android.dtacone.model.esim.PackageBenefitItem;
import th.p047co.dtac.android.dtacone.util.format.MoneyFormat;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$ViewHolder;", "<init>", "()V", "Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$OnClickPackage;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "(Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$OnClickPackage;)V", "", "Lth/co/dtac/android/dtacone/model/esim/JsonMemberPackageItem;", "packageList", "setPackageList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$ViewHolder;", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$OnClickPackage;", "OnClickPackage", "ViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.eSIM.ESimPackageSetAdapter */
/* loaded from: classes7.dex */
public final class ESimPackageSetAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f81191a = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: b */
    public OnClickPackage f81192b;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$OnClickPackage;", "", "onItemClick", "", "get", "Lth/co/dtac/android/dtacone/model/esim/JsonMemberPackageItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.eSIM.ESimPackageSetAdapter$OnClickPackage */
    /* loaded from: classes7.dex */
    public interface OnClickPackage {
        void onItemClick(@Nullable JsonMemberPackageItem jsonMemberPackageItem);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0017\u001a\n \u000e*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\n \u000e*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/esim/JsonMemberPackageItem;", "item", "Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$OnClickPackage;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "bind", "(Lth/co/dtac/android/dtacone/model/esim/JsonMemberPackageItem;Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$OnClickPackage;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvTitle", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "tvPrice", "Landroidx/recyclerview/widget/RecyclerView;", OperatorName.CURVE_TO, "Landroidx/recyclerview/widget/RecyclerView;", "rvInfoList", "Landroid/widget/LinearLayout;", "d", "Landroid/widget/LinearLayout;", "validityBox", "e", "tvValidity", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.eSIM.ESimPackageSetAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final DtacFontTextView f81193a;

        /* renamed from: b */
        public final DtacFontTextView f81194b;

        /* renamed from: c */
        public final RecyclerView f81195c;

        /* renamed from: d */
        public final LinearLayout f81196d;

        /* renamed from: e */
        public final DtacFontTextView f81197e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f81193a = (DtacFontTextView) itemView.findViewById(R.id.package_list_tv_package_set_title);
            this.f81194b = (DtacFontTextView) itemView.findViewById(R.id.package_list_tv_price);
            this.f81195c = (RecyclerView) itemView.findViewById(R.id.rvInfoList);
            this.f81196d = (LinearLayout) itemView.findViewById(R.id.validityBox);
            this.f81197e = (DtacFontTextView) itemView.findViewById(R.id.tvValidity);
        }

        public final void bind(@Nullable JsonMemberPackageItem jsonMemberPackageItem, @Nullable OnClickPackage onClickPackage) {
            float f;
            List<PackageBenefitItem> list;
            String packageValidity;
            Float packagePrice;
            String str = "";
            this.f81193a.setText((jsonMemberPackageItem == null || (r2 = jsonMemberPackageItem.getPackageName()) == null) ? "" : "");
            DtacFontTextView dtacFontTextView = this.f81194b;
            if (jsonMemberPackageItem != null && (packagePrice = jsonMemberPackageItem.getPackagePrice()) != null) {
                f = packagePrice.floatValue();
            } else {
                f = 0.0f;
            }
            String covertToMoney = MoneyFormat.covertToMoney(f);
            dtacFontTextView.setText(covertToMoney + " .-");
            RecyclerView recyclerView = this.f81195c;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            if (jsonMemberPackageItem != null) {
                list = jsonMemberPackageItem.getPackageBenefit();
            } else {
                list = null;
            }
            recyclerView.setAdapter(new ESimPackageSubInfoAdapter(list, new ESimPackageSetAdapter$ViewHolder$bind$1$1(onClickPackage, jsonMemberPackageItem)));
            if (jsonMemberPackageItem != null && (packageValidity = jsonMemberPackageItem.getPackageValidity()) != null && packageValidity.length() > 0) {
                LinearLayout validityBox = this.f81196d;
                Intrinsics.checkNotNullExpressionValue(validityBox, "validityBox");
                ViewVisibleExtKt.toVisible(validityBox);
                DtacFontTextView tvValidity = this.f81197e;
                Intrinsics.checkNotNullExpressionValue(tvValidity, "tvValidity");
                String packageValidity2 = jsonMemberPackageItem.getPackageValidity();
                String packageValidityDescription = jsonMemberPackageItem.getPackageValidityDescription();
                if (packageValidityDescription != null) {
                    str = packageValidityDescription;
                }
                StringExtKt.setFontSize(tvValidity, packageValidity2, str);
                return;
            }
            LinearLayout validityBox2 = this.f81196d;
            Intrinsics.checkNotNullExpressionValue(validityBox2, "validityBox");
            ViewVisibleExtKt.toGone(validityBox2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81191a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void setListener(@NotNull OnClickPackage listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81192b = listener;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setPackageList(@Nullable List<JsonMemberPackageItem> list) {
        this.f81191a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.f81192b != null) {
            View view = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
            OnSingleClickListenerKt.setOnSingleClickListener(view, new ESimPackageSetAdapter$onBindViewHolder$1(this, i));
        }
        List list = this.f81191a;
        holder.bind(list != null ? (JsonMemberPackageItem) list.get(i) : null, this.f81192b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.z_esim_package_item_row, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}
