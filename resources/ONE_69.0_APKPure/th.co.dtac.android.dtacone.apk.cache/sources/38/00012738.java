package th.p047co.dtac.android.dtacone.util.format;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/format/MoneyNoFloatWatcher;", "Landroid/text/TextWatcher;", "Landroid/widget/EditText;", "edt", "<init>", "(Landroid/widget/EditText;)V", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "p1", "p2", "p3", "onTextChanged", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/EditText;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "current", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.format.MoneyNoFloatWatcher */
/* loaded from: classes8.dex */
public final class MoneyNoFloatWatcher implements TextWatcher {
    public static final int $stable = 8;

    /* renamed from: a */
    public final EditText f87160a;

    /* renamed from: b */
    public String f87161b;

    public MoneyNoFloatWatcher(@NotNull EditText edt) {
        Intrinsics.checkNotNullParameter(edt, "edt");
        this.f87160a = edt;
        this.f87161b = "";
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        if (!Intrinsics.areEqual(String.valueOf(editable), this.f87161b)) {
            this.f87160a.removeTextChangedListener(this);
            String formatted = NumberFormat.getCurrencyInstance().format(Long.parseLong(new Regex("[$,.]").replace(String.valueOf(editable), "")));
            Intrinsics.checkNotNullExpressionValue(formatted, "formatted");
            String symbol = NumberFormat.getCurrencyInstance().getCurrency().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getCurrencyInstance().currency.symbol");
            String str = (String) StringsKt__StringsKt.split$default((CharSequence) AbstractC19741eO1.replace$default(formatted, symbol, "", false, 4, (Object) null), new String[]{"."}, false, 0, 6, (Object) null).get(0);
            this.f87161b = str;
            this.f87160a.setText(str);
            this.f87160a.setSelection(str.length());
            this.f87160a.addTextChangedListener(this);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
    }
}