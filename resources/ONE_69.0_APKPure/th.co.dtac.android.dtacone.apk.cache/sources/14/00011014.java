package th.p047co.dtac.android.dtacone.adapter.settings.view_holder;

import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.databinding.ZSettingSectionItemBinding;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/settings/view_holder/SectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lth/co/dtac/android/dtacone/databinding/ZSettingSectionItemBinding;", "(Lth/co/dtac/android/dtacone/databinding/ZSettingSectionItemBinding;)V", "frameLayout", "Landroid/widget/FrameLayout;", "getFrameLayout", "()Landroid/widget/FrameLayout;", "setFrameLayout", "(Landroid/widget/FrameLayout;)V", "tvSection", "Landroid/widget/TextView;", "getTvSection", "()Landroid/widget/TextView;", "setTvSection", "(Landroid/widget/TextView;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.adapter.settings.view_holder.SectionViewHolder */
/* loaded from: classes7.dex */
public final class SectionViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    public FrameLayout frameLayout;
    public TextView tvSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionViewHolder(@NotNull ZSettingSectionItemBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        FrameLayout frameLayout = binding.section;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.section");
        setFrameLayout(frameLayout);
        DtacFontTextView dtacFontTextView = binding.tvSection;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.tvSection");
        setTvSection(dtacFontTextView);
    }

    @NotNull
    public final FrameLayout getFrameLayout() {
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("frameLayout");
        return null;
    }

    @NotNull
    public final TextView getTvSection() {
        TextView textView = this.tvSection;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvSection");
        return null;
    }

    public final void setFrameLayout(@NotNull FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.frameLayout = frameLayout;
    }

    public final void setTvSection(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvSection = textView;
    }
}