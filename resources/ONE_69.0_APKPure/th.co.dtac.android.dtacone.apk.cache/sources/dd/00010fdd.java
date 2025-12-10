package th.p047co.dtac.android.dtacone.adapter.postpaid_package;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.OnePostpaidPackageSetGroupBinding;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/postpaid_package/OnePostpaidPackageGroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OnePostpaidPackageSetGroupBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/OnePostpaidPackageSetGroupBinding;)V", "Landroid/widget/TextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getTvGroup", "()Landroid/widget/TextView;", "setTvGroup", "(Landroid/widget/TextView;)V", "tvGroup", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_package.OnePostpaidPackageGroupViewHolder */
/* loaded from: classes7.dex */
public final class OnePostpaidPackageGroupViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    /* renamed from: a */
    public TextView f81462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidPackageGroupViewHolder(@NotNull OnePostpaidPackageSetGroupBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        OneFontTextView oneFontTextView = binding.tvPackageSetGroup;
        Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.tvPackageSetGroup");
        this.f81462a = oneFontTextView;
    }

    @NotNull
    public final TextView getTvGroup() {
        return this.f81462a;
    }

    public final void setTvGroup(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81462a = textView;
    }
}