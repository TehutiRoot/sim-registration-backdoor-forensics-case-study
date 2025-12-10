package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.databinding.ItemOneOwnerManagementUserBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.home.activity.OneHomeActivity;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.OneOwnerManagementThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerItemResponse;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002!\"B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter$ViewHolder;", "Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;", "activity", "", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerItemResponse;", "item", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter$ViewHolder;I)V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter$OnClickListener;", "onClickListener", "setOnClickListener", "(Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter$OnClickListener;", "OnClickListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.adapter.OneOwnerManagementListAdapter */
/* loaded from: classes10.dex */
public final class OneOwnerManagementListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final OneHomeActivity f93056a;

    /* renamed from: b */
    public final List f93057b;

    /* renamed from: c */
    public OnClickListener f93058c;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter$OnClickListener;", "", "onSelectOwnerItem", "", "position", "", "item", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerItemResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.adapter.OneOwnerManagementListAdapter$OnClickListener */
    /* loaded from: classes10.dex */
    public interface OnClickListener {
        void onSelectOwnerItem(int i, @NotNull OneOwnerItemResponse oneOwnerItemResponse);
    }

    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneOwnerManagementUserBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneOwnerManagementUserBinding;)V", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerItemResponse;", "item", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter$OnClickListener;", "onClickListener", "Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;", "activity", "", "bind", "(Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerItemResponse;Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerManagementListAdapter$OnClickListener;Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneOwnerManagementUserBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.adapter.OneOwnerManagementListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemOneOwnerManagementUserBinding f93059a;

        /* renamed from: b */
        public final /* synthetic */ OneOwnerManagementListAdapter f93060b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneOwnerManagementListAdapter oneOwnerManagementListAdapter, ItemOneOwnerManagementUserBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f93060b = oneOwnerManagementListAdapter;
            this.f93059a = binding;
        }

        public final void bind(@NotNull OneOwnerItemResponse item, @Nullable OnClickListener onClickListener, @NotNull OneHomeActivity activity) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(activity, "activity");
            ItemOneOwnerManagementUserBinding itemOneOwnerManagementUserBinding = this.f93059a;
            itemOneOwnerManagementUserBinding.ownerUserIdTextView.setText(PhoneNumberExtKt.toPretty(item.getUserId()));
            itemOneOwnerManagementUserBinding.ownerRegisterDateTextView.setText(item.getDisplayRegisterDate());
            itemOneOwnerManagementUserBinding.ownerRegisterTimeTextView.setText(item.getDisplayRegisterTime());
            CardView root = itemOneOwnerManagementUserBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "root");
            OnSingleClickListenerKt.setOnSingleClickListener(root, new OneOwnerManagementListAdapter$ViewHolder$bind$1$1(onClickListener, this, item));
            OneOwnerManagementThemeColorModel oneOwnerManagementThemeColorModel = activity.getOneOwnerManagementThemeColorModel();
            itemOneOwnerManagementUserBinding.ownerImageView.setImageResource(oneOwnerManagementThemeColorModel.getProfileImageIcon());
            itemOneOwnerManagementUserBinding.userItemArrowImageView.setImageResource(oneOwnerManagementThemeColorModel.getArrowImageIcon());
        }
    }

    public OneOwnerManagementListAdapter(@NotNull OneHomeActivity activity, @NotNull List<OneOwnerItemResponse> item) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f93056a = activity;
        this.f93057b = item;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f93057b.size();
    }

    public final void setOnClickListener(@NotNull OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f93058c = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((OneOwnerItemResponse) this.f93057b.get(i), this.f93058c, this.f93056a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOneOwnerManagementUserBinding inflate = ItemOneOwnerManagementUserBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        return new ViewHolder(this, inflate);
    }
}