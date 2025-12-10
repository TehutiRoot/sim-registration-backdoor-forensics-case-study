package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemAdditionalAdvanceBinding;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OnePre2PostThemeModel;
import th.p047co.dtac.android.dtacone.model.blacklist.ExtraAdvanceMasterInformation;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B)\b\u0007\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceCheckBlackListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceCheckBlackListAdapter$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/blacklist/ExtraAdvanceMasterInformation;", "Lkotlin/collections/ArrayList;", "item", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;", "themeModel", "<init>", "(Ljava/util/ArrayList;Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceCheckBlackListAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceCheckBlackListAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", "getItem", "()Ljava/util/ArrayList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;", "getThemeModel", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleTrueDeviceCheckBlackListAdapter */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueDeviceCheckBlackListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ArrayList f89713a;

    /* renamed from: b */
    public final OnePre2PostThemeModel f89714b;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceCheckBlackListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemAdditionalAdvanceBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceCheckBlackListAdapter;Lth/co/dtac/android/dtacone/databinding/ItemAdditionalAdvanceBinding;)V", "Lth/co/dtac/android/dtacone/model/blacklist/ExtraAdvanceMasterInformation;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/blacklist/ExtraAdvanceMasterInformation;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemAdditionalAdvanceBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ItemAdditionalAdvanceBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleTrueDeviceCheckBlackListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemAdditionalAdvanceBinding f89715a;

        /* renamed from: b */
        public final /* synthetic */ OneDeviceSaleTrueDeviceCheckBlackListAdapter f89716b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneDeviceSaleTrueDeviceCheckBlackListAdapter oneDeviceSaleTrueDeviceCheckBlackListAdapter, ItemAdditionalAdvanceBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f89716b = oneDeviceSaleTrueDeviceCheckBlackListAdapter;
            this.f89715a = binding;
        }

        public final void bind(@Nullable ExtraAdvanceMasterInformation extraAdvanceMasterInformation) {
            String extraAdvancePayment;
            ItemAdditionalAdvanceBinding itemAdditionalAdvanceBinding = this.f89715a;
            itemAdditionalAdvanceBinding.valueTextView.setTextColor(ContextCompat.getColor(this.itemView.getContext(), this.f89716b.getThemeModel().getFontColor()));
            if (getAbsoluteAdapterPosition() % 2 == 0) {
                itemAdditionalAdvanceBinding.rowItemLayout.setBackgroundResource(R.color.whiteThree);
            }
            String str = "";
            itemAdditionalAdvanceBinding.labelTextView.setText((extraAdvanceMasterInformation == null || (r3 = extraAdvanceMasterInformation.getDisplayRankingPrice()) == null) ? "" : "");
            OneFontTextView oneFontTextView = itemAdditionalAdvanceBinding.valueTextView;
            if (extraAdvanceMasterInformation != null && (extraAdvancePayment = extraAdvanceMasterInformation.getExtraAdvancePayment()) != null) {
                str = extraAdvancePayment;
            }
            oneFontTextView.setText(str);
        }

        @NotNull
        public final ItemAdditionalAdvanceBinding getBinding() {
            return this.f89715a;
        }
    }

    @Inject
    public OneDeviceSaleTrueDeviceCheckBlackListAdapter(@NotNull ArrayList<ExtraAdvanceMasterInformation> item, @NotNull OnePre2PostThemeModel themeModel) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(themeModel, "themeModel");
        this.f89713a = item;
        this.f89714b = themeModel;
    }

    @NotNull
    public final ArrayList<ExtraAdvanceMasterInformation> getItem() {
        return this.f89713a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f89713a.size();
    }

    @NotNull
    public final OnePre2PostThemeModel getThemeModel() {
        return this.f89714b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((ExtraAdvanceMasterInformation) this.f89713a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemAdditionalAdvanceBinding inflate = ItemAdditionalAdvanceBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ViewHolder(this, inflate);
    }
}