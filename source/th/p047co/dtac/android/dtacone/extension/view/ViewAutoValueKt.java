package th.p047co.dtac.android.dtacone.extension.view;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m28850d2 = {"toValue", "", "Landroid/view/View;", "value", "", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.view.ViewAutoValueKt */
/* loaded from: classes7.dex */
public final class ViewAutoValueKt {
    public static final void toValue(@NotNull View view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (str != null && (view instanceof TextView)) {
            ViewVisibleExtKt.toVisible(view);
            ((TextView) view).setText(str);
            return;
        }
        ViewVisibleExtKt.toGone(view);
    }
}
