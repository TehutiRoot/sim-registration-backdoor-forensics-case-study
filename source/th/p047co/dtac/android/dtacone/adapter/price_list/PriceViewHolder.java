package th.p047co.dtac.android.dtacone.adapter.price_list;

import android.view.View;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/price_list/PriceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacRadioButton;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacRadioButton;", "getRdbEpinPrice", "()Lth/co/dtac/android/dtacone/widget/view/DtacRadioButton;", "rdbEpinPrice", "Landroid/widget/RadioGroup;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/RadioGroup;", "getRdbGroupPrice", "()Landroid/widget/RadioGroup;", "rdbGroupPrice", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.price_list.PriceViewHolder */
/* loaded from: classes7.dex */
public final class PriceViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    /* renamed from: a */
    public final DtacRadioButton f81428a;

    /* renamed from: b */
    public final RadioGroup f81429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewById = view.findViewById(R.id.rdbPrice);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.rdbPrice)");
        this.f81428a = (DtacRadioButton) findViewById;
        View findViewById2 = view.findViewById(R.id.rdbGroupPrice);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.rdbGroupPrice)");
        this.f81429b = (RadioGroup) findViewById2;
    }

    @NotNull
    public final DtacRadioButton getRdbEpinPrice() {
        return this.f81428a;
    }

    @NotNull
    public final RadioGroup getRdbGroupPrice() {
        return this.f81429b;
    }
}
