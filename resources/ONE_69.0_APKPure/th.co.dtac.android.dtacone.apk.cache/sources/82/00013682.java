package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.OnePostpaidPackageNameItemBinding;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/viewholder/OnePostpaidPackageNameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OnePostpaidPackageNameItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/OnePostpaidPackageNameItemBinding;)V", "Landroid/view/View;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", "getCardView", "()Landroid/view/View;", "setCardView", "(Landroid/view/View;)V", "cardView", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvPackageName", "()Landroid/widget/TextView;", "setTvPackageName", "(Landroid/widget/TextView;)V", "tvPackageName", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.viewholder.OnePostpaidPackageNameViewHolder */
/* loaded from: classes10.dex */
public final class OnePostpaidPackageNameViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    /* renamed from: a */
    public View f93367a;

    /* renamed from: b */
    public TextView f93368b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidPackageNameViewHolder(@NotNull OnePostpaidPackageNameItemBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout constraintLayout = binding.cardView;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.cardView");
        this.f93367a = constraintLayout;
        OneFontTextView oneFontTextView = binding.tvPackageName;
        Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.tvPackageName");
        this.f93368b = oneFontTextView;
    }

    @NotNull
    public final View getCardView() {
        return this.f93367a;
    }

    @NotNull
    public final TextView getTvPackageName() {
        return this.f93368b;
    }

    public final void setCardView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f93367a = view;
    }

    public final void setTvPackageName(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f93368b = textView;
    }
}