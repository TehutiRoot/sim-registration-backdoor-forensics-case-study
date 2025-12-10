package co.omise.android.p009ui;

import androidx.recyclerview.widget.DiffUtil;
import co.omise.android.models.CountryInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, m29142d2 = {"Lco/omise/android/ui/CountryDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lco/omise/android/models/CountryInfo;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* renamed from: co.omise.android.ui.CountryDiffCallback */
/* loaded from: classes3.dex */
public final class CountryDiffCallback extends DiffUtil.ItemCallback<CountryInfo> {
    @NotNull
    public static final CountryDiffCallback INSTANCE = new CountryDiffCallback();

    private CountryDiffCallback() {
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull CountryInfo oldItem, @NotNull CountryInfo newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.getName(), newItem.getName());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull CountryInfo oldItem, @NotNull CountryInfo newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }
}