package th.p047co.dtac.android.dtacone.adapter.postpaid_search_package;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.adapter.listener.item.OnClickItemListener;
import th.p047co.dtac.android.dtacone.adapter.postpaid_search_package.PostpaidPackageNameViewHolder;
import th.p047co.dtac.android.dtacone.databinding.ZPostpaidPackageNameItemBinding;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.PackageGroups;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/postpaid_search_package/PostpaidPackageNameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageNameItemBinding;", "binding", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroups;", "onClickItem", "<init>", "(Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageNameItemBinding;Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;)V", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroups;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageNameItemBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageNameItemBinding;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "getOnClickItem", "()Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_search_package.PostpaidPackageNameViewHolder */
/* loaded from: classes7.dex */
public final class PostpaidPackageNameViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ZPostpaidPackageNameItemBinding f81407a;

    /* renamed from: b */
    public final OnClickItemListener f81408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostpaidPackageNameViewHolder(@NotNull ZPostpaidPackageNameItemBinding binding, @Nullable OnClickItemListener<? super PackageGroups> onClickItemListener) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f81407a = binding;
        this.f81408b = onClickItemListener;
    }

    /* renamed from: b */
    public static /* synthetic */ void m20274b(PostpaidPackageNameViewHolder postpaidPackageNameViewHolder, PackageGroups packageGroups, View view) {
        m20273c(postpaidPackageNameViewHolder, packageGroups, view);
    }

    /* renamed from: c */
    public static final void m20273c(PostpaidPackageNameViewHolder this$0, PackageGroups item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        OnClickItemListener onClickItemListener = this$0.f81408b;
        if (onClickItemListener != null) {
            onClickItemListener.setOnClickItem(item);
        }
    }

    public final void bind(@NotNull final PackageGroups item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ZPostpaidPackageNameItemBinding zPostpaidPackageNameItemBinding = this.f81407a;
        DtacFontTextView dtacFontTextView = zPostpaidPackageNameItemBinding.tvPackageName;
        Integer packageGroupCode = item.getPackageGroupCode();
        String packageGroupDescription = item.getPackageGroupDescription();
        dtacFontTextView.setText(packageGroupCode + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + packageGroupDescription);
        zPostpaidPackageNameItemBinding.cardView.setOnClickListener(new View.OnClickListener() { // from class: rl1
            {
                PostpaidPackageNameViewHolder.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostpaidPackageNameViewHolder.m20274b(PostpaidPackageNameViewHolder.this, item, view);
            }
        });
    }

    @NotNull
    public final ZPostpaidPackageNameItemBinding getBinding() {
        return this.f81407a;
    }

    @Nullable
    public final OnClickItemListener<PackageGroups> getOnClickItem() {
        return this.f81408b;
    }
}
