package th.p047co.dtac.android.dtacone.adapter.postpaid_search_package;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.databinding.ZPostpaidPackageMessageItemBinding;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/postpaid_search_package/PostpaidPackageNotifyMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageMessageItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageMessageItemBinding;)V", "", "warningMessage", "", "bind", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageMessageItemBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageMessageItemBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_search_package.PostpaidPackageNotifyMessageViewHolder */
/* loaded from: classes7.dex */
public final class PostpaidPackageNotifyMessageViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ZPostpaidPackageMessageItemBinding f81500a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostpaidPackageNotifyMessageViewHolder(@NotNull ZPostpaidPackageMessageItemBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f81500a = binding;
    }

    public final void bind(@Nullable String str) {
        this.f81500a.tvPackageMessage.setText(str);
    }

    @NotNull
    public final ZPostpaidPackageMessageItemBinding getBinding() {
        return this.f81500a;
    }
}