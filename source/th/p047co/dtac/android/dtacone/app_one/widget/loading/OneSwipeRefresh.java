package th.p047co.dtac.android.dtacone.app_one.widget.loading;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/loading/OneSwipeRefresh;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", OperatorName.CLOSE_AND_STROKE, "()V", "", TypedValues.Custom.S_COLOR, "setTheme", "(I)V", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh */
/* loaded from: classes7.dex */
public final class OneSwipeRefresh extends SwipeRefreshLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSwipeRefresh(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        m19645s();
    }

    /* renamed from: s */
    private final void m19645s() {
        int i = R.color.niceBlueFive;
        setColorSchemeResources(i, i, i);
    }

    public final void setTheme(int i) {
        setColorSchemeResources(i, i, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSwipeRefresh(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m19645s();
    }
}
