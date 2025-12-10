package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.viewholder;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.OnePostpaidPackageMessageItemBinding;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/viewholder/OnePostpaidPackageNotifyMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OnePostpaidPackageMessageItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/OnePostpaidPackageMessageItemBinding;)V", "Landroid/widget/TextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getTvPackageMessage", "()Landroid/widget/TextView;", "setTvPackageMessage", "(Landroid/widget/TextView;)V", "tvPackageMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.viewholder.OnePostpaidPackageNotifyMessageViewHolder */
/* loaded from: classes10.dex */
public final class OnePostpaidPackageNotifyMessageViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    /* renamed from: a */
    public TextView f93369a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidPackageNotifyMessageViewHolder(@NotNull OnePostpaidPackageMessageItemBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        OneFontTextView oneFontTextView = binding.tvPackageMessage;
        Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.tvPackageMessage");
        this.f93369a = oneFontTextView;
    }

    @NotNull
    public final TextView getTvPackageMessage() {
        return this.f93369a;
    }

    public final void setTvPackageMessage(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f93369a = textView;
    }
}