package th.p047co.dtac.android.dtacone.util.format;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/format/PriceTextWatcher;", "Landroid/text/TextWatcher;", "Landroid/widget/EditText;", "editText", "<init>", "(Landroid/widget/EditText;)V", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "currentText", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.format.PriceTextWatcher */
/* loaded from: classes8.dex */
public final class PriceTextWatcher implements TextWatcher {
    public static final int $stable = 8;

    /* renamed from: a */
    public final EditText f87184a;

    /* renamed from: b */
    public String f87185b;

    public PriceTextWatcher(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f87184a = editText;
        this.f87185b = "";
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        long j;
        if (!Intrinsics.areEqual(String.valueOf(editable), this.f87185b)) {
            this.f87184a.removeTextChangedListener(this);
            String replace$default = AbstractC19741eO1.replace$default(String.valueOf(editable), ",", "", false, 4, (Object) null);
            String str = "";
            if (replace$default.length() > 0 && replace$default.charAt(0) == '0' && replace$default.length() > 1) {
                if (editable != null) {
                    editable.replace(0, 1, "");
                }
            } else {
                if (replace$default.length() > 0) {
                    Long longOrNull = AbstractC19568dO1.toLongOrNull(replace$default);
                    if (longOrNull != null) {
                        j = longOrNull.longValue();
                    } else {
                        j = 0;
                    }
                    str = String.format("%,d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                }
                this.f87185b = str;
                this.f87184a.setText(str);
                try {
                    if (str.length() > 0) {
                        this.f87184a.setSelection(str.length());
                    }
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
            this.f87184a.addTextChangedListener(this);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @NotNull
    public final EditText getEditText() {
        return this.f87184a;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}