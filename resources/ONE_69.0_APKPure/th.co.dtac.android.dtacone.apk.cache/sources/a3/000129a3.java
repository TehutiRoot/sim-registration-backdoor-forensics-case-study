package th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemOneBankBinding;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolBankContentResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolBankListResponse;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolBankListResponse;", "Lkotlin/collections/ArrayList;", "bankList", "<init>", "(Ljava/util/ArrayList;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$ViewHolder;I)V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$OnClickListener;", "onClickListener", "setOnClickListener", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$OnClickListener;", "OnClickListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolBankListAdapter */
/* loaded from: classes10.dex */
public final class OneBuyDolBankListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ArrayList f88323a;

    /* renamed from: b */
    public OnClickListener f88324b;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$OnClickListener;", "", "onSelectBankItem", "", "position", "", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolBankListResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolBankListAdapter$OnClickListener */
    /* loaded from: classes10.dex */
    public interface OnClickListener {
        void onSelectBankItem(int i, @NotNull OneBuyDolBankListResponse oneBuyDolBankListResponse);
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneBankBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneBankBinding;)V", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolBankListResponse;", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$OnClickListener;", "onClickListener", "", "bind", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolBankListResponse;Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneBankBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolBankListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemOneBankBinding f88325a;

        /* renamed from: b */
        public final /* synthetic */ OneBuyDolBankListAdapter f88326b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneBuyDolBankListAdapter oneBuyDolBankListAdapter, ItemOneBankBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f88326b = oneBuyDolBankListAdapter;
            this.f88325a = binding;
        }

        public final void bind(@NotNull OneBuyDolBankListResponse item, @Nullable OnClickListener onClickListener) {
            OneBuyDolBankContentResponse oneBuyDolBankContentResponse;
            Intrinsics.checkNotNullParameter(item, "item");
            ItemOneBankBinding itemOneBankBinding = this.f88325a;
            ConstraintLayout root = itemOneBankBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "root");
            OnSingleClickListenerKt.setOnSingleClickListener(root, new OneBuyDolBankListAdapter$ViewHolder$bind$1$1(onClickListener, this, item));
            Glide.with(itemOneBankBinding.getRoot()).m74229load(item.getLogo()).centerCrop().into(itemOneBankBinding.bankBrandImageView);
            OneFontTextView oneFontTextView = itemOneBankBinding.bankNameTextView;
            List<OneBuyDolBankContentResponse> contentList = item.getContentList();
            oneFontTextView.setText((contentList == null || (oneBuyDolBankContentResponse = (OneBuyDolBankContentResponse) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) contentList)) == null || (r4 = oneBuyDolBankContentResponse.getName()) == null) ? "" : "");
        }
    }

    public OneBuyDolBankListAdapter(@NotNull ArrayList<OneBuyDolBankListResponse> bankList) {
        Intrinsics.checkNotNullParameter(bankList, "bankList");
        this.f88323a = bankList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f88323a.size();
    }

    public final void setOnClickListener(@NotNull OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f88324b = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f88323a.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "bankList[position]");
        holder.bind((OneBuyDolBankListResponse) obj, this.f88324b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOneBankBinding inflate = ItemOneBankBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        return new ViewHolder(this, inflate);
    }
}