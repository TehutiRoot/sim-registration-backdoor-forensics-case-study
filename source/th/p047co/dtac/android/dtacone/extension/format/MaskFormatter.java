package th.p047co.dtac.android.dtacone.extension.format;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006$"}, m28850d2 = {"Lth/co/dtac/android/dtacone/extension/format/MaskFormatter;", "Landroid/text/TextWatcher;", "", "format", "Landroid/widget/EditText;", "editText", "<init>", "(Ljava/lang/String;Landroid/widget/EditText;)V", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "editable", "afterTextChanged", "(Landroid/text/Editable;)V", "before", "onTextChanged", TextBundle.TEXT_ENTRY, "", "deleteFlag", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Z)Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "Landroid/widget/EditText;", "Lth/co/dtac/android/dtacone/extension/format/TextFormatter;", OperatorName.CURVE_TO, "Lkotlin/Lazy;", "()Lth/co/dtac/android/dtacone/extension/format/TextFormatter;", "formatter", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.extension.format.MaskFormatter */
/* loaded from: classes7.dex */
public final class MaskFormatter implements TextWatcher {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f84755a;

    /* renamed from: b */
    public final EditText f84756b;

    /* renamed from: c */
    public final Lazy f84757c;

    public MaskFormatter(@NotNull String format, @NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f84755a = format;
        this.f84756b = editText;
        this.f84757c = LazyKt__LazyJVMKt.lazy(new MaskFormatter$formatter$2(this));
    }

    /* renamed from: a */
    public final TextFormatter m19472a() {
        return (TextFormatter) this.f84757c.getValue();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
    }

    /* renamed from: b */
    public final String m19471b(String str, boolean z) {
        if (z) {
            str = m19472a().delete(str);
        }
        return m19472a().maskText(m19472a().removeMaskText(str));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        boolean z2 = false;
        if (i3 > 1) {
            z = true;
        } else {
            z = false;
        }
        String valueOf = String.valueOf(charSequence);
        if (i2 > 0) {
            z2 = true;
        }
        int selectionStart = this.f84756b.getSelectionStart();
        if (!z2 && selectionStart == valueOf.length()) {
            selectionStart++;
        }
        String m19471b = m19471b(valueOf, z2);
        this.f84756b.removeTextChangedListener(this);
        this.f84756b.setText(m19471b);
        EditText editText = this.f84756b;
        if (selectionStart > m19471b.length() || z) {
            selectionStart = m19471b.length();
        }
        editText.setSelection(selectionStart);
        this.f84756b.addTextChangedListener(this);
    }
}
