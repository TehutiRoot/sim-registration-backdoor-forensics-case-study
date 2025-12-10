package th.p047co.dtac.android.dtacone.extension.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28850d2 = {"toVisibleOrGone", "", "Landroid/view/View;", "isVisible", "", "value", "", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.view.VisibleExtensionKt */
/* loaded from: classes7.dex */
public final class VisibleExtensionKt {
    public static final void toVisibleOrGone(@NotNull View view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (str != null && str.length() != 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public static final void toVisibleOrGone(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}
