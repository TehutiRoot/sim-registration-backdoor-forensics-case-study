package th.p047co.dtac.android.dtacone.widget.view.listener;

import android.os.SystemClock;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/view/listener/OnSingleClickListener;", "Landroid/view/View$OnClickListener;", "Lkotlin/Function0;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "onClick", "(Landroid/view/View;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function0;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "lastClickTime", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.view.listener.OnSingleClickListener */
/* loaded from: classes9.dex */
public final class OnSingleClickListener implements View.OnClickListener {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Function0 f107481a;

    /* renamed from: b */
    public long f107482b;

    public OnSingleClickListener(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f107481a = block;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (SystemClock.elapsedRealtime() - this.f107482b < 1000) {
            return;
        }
        this.f107482b = SystemClock.elapsedRealtime();
        this.f107481a.invoke();
    }
}