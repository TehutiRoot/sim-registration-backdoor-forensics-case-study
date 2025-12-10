package th.p047co.dtac.android.dtacone.adapter.settings.view_holder;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.databinding.ZOtherMenuItemRowBinding;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/settings/view_holder/SettingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lth/co/dtac/android/dtacone/databinding/ZOtherMenuItemRowBinding;", "(Lth/co/dtac/android/dtacone/databinding/ZOtherMenuItemRowBinding;)V", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "setCardView", "(Landroidx/cardview/widget/CardView;)V", "ivIcon", "Landroid/widget/ImageView;", "getIvIcon", "()Landroid/widget/ImageView;", "setIvIcon", "(Landroid/widget/ImageView;)V", "ivIconRight", "getIvIconRight", "setIvIconRight", "tvSubTitle", "Landroid/widget/TextView;", "getTvSubTitle", "()Landroid/widget/TextView;", "setTvSubTitle", "(Landroid/widget/TextView;)V", "tvTitle", "getTvTitle", "setTvTitle", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.adapter.settings.view_holder.SettingViewHolder */
/* loaded from: classes7.dex */
public final class SettingViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    public CardView cardView;
    public ImageView ivIcon;
    public ImageView ivIconRight;
    public TextView tvSubTitle;
    public TextView tvTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingViewHolder(@NotNull ZOtherMenuItemRowBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        DtacFontTextView dtacFontTextView = binding.settingTitle;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.settingTitle");
        setTvTitle(dtacFontTextView);
        DtacFontTextView dtacFontTextView2 = binding.subSettingTitle;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.subSettingTitle");
        setTvSubTitle(dtacFontTextView2);
        ImageView imageView = binding.settingIcon;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.settingIcon");
        setIvIcon(imageView);
        DtacCardView dtacCardView = binding.cardviewSetting;
        Intrinsics.checkNotNullExpressionValue(dtacCardView, "binding.cardviewSetting");
        setCardView(dtacCardView);
        ImageView imageView2 = binding.iconRight;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.iconRight");
        setIvIconRight(imageView2);
    }

    @NotNull
    public final CardView getCardView() {
        CardView cardView = this.cardView;
        if (cardView != null) {
            return cardView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardView");
        return null;
    }

    @NotNull
    public final ImageView getIvIcon() {
        ImageView imageView = this.ivIcon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivIcon");
        return null;
    }

    @NotNull
    public final ImageView getIvIconRight() {
        ImageView imageView = this.ivIconRight;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivIconRight");
        return null;
    }

    @NotNull
    public final TextView getTvSubTitle() {
        TextView textView = this.tvSubTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvSubTitle");
        return null;
    }

    @NotNull
    public final TextView getTvTitle() {
        TextView textView = this.tvTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
        return null;
    }

    public final void setCardView(@NotNull CardView cardView) {
        Intrinsics.checkNotNullParameter(cardView, "<set-?>");
        this.cardView = cardView;
    }

    public final void setIvIcon(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.ivIcon = imageView;
    }

    public final void setIvIconRight(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.ivIconRight = imageView;
    }

    public final void setTvSubTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvSubTitle = textView;
    }

    public final void setTvTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvTitle = textView;
    }
}
