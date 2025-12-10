package th.p047co.dtac.android.dtacone.util;

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
import th.p047co.dtac.android.dtacone.extension.format.TextFormatter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u001b\u0010%\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/BankAccountNumberMaskFormatter;", "Landroid/text/TextWatcher;", "", "format", "Landroid/widget/EditText;", "editText", "<init>", "(Ljava/lang/String;Landroid/widget/EditText;)V", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "editable", "afterTextChanged", "(Landroid/text/Editable;)V", "before", "onTextChanged", TextBundle.TEXT_ENTRY, "", "deleteFlag", "textCursor", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;ZI)V", OperatorName.CURVE_TO, "(Ljava/lang/String;Z)Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "Landroid/widget/EditText;", "Lth/co/dtac/android/dtacone/extension/format/TextFormatter;", "Lkotlin/Lazy;", "()Lth/co/dtac/android/dtacone/extension/format/TextFormatter;", "formatter", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.BankAccountNumberMaskFormatter */
/* loaded from: classes8.dex */
public final class BankAccountNumberMaskFormatter implements TextWatcher {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f87012a;

    /* renamed from: b */
    public final EditText f87013b;

    /* renamed from: c */
    public final Lazy f87014c;

    public BankAccountNumberMaskFormatter(@NotNull String format, @NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f87012a = format;
        this.f87013b = editText;
        this.f87014c = LazyKt__LazyJVMKt.lazy(new BankAccountNumberMaskFormatter$formatter$2(this));
    }

    /* renamed from: a */
    public final TextFormatter m16825a() {
        return (TextFormatter) this.f87014c.getValue();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
    }

    /* renamed from: b */
    public final void m16824b(String str, boolean z, int i) {
        String m16823c = m16823c(str, z);
        this.f87013b.removeTextChangedListener(this);
        this.f87013b.setText(m16823c);
        EditText editText = this.f87013b;
        if (i > m16823c.length()) {
            i = m16823c.length();
        }
        editText.setSelection(i);
        this.f87013b.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public final String m16823c(String str, boolean z) {
        if (z) {
            str = m16825a().delete(str);
        }
        return m16825a().maskText(m16825a().removeMaskText(str));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        int i4;
        String valueOf = String.valueOf(charSequence);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        int selectionStart = this.f87013b.getSelectionStart();
        if (!z && selectionStart == valueOf.length()) {
            i4 = selectionStart + 1;
        } else {
            i4 = selectionStart;
        }
        if (selectionStart == 1) {
            if (!AbstractC19741eO1.startsWith$default(valueOf, "0", false, 2, null) && !AbstractC19741eO1.startsWith$default(valueOf, "6", false, 2, null)) {
                this.f87013b.removeTextChangedListener(this);
                this.f87013b.setText("");
                this.f87013b.setSelection(0);
                this.f87013b.addTextChangedListener(this);
                return;
            }
            return;
        }
        if (AbstractC19741eO1.startsWith$default(valueOf, "00", false, 2, null)) {
            valueOf = AbstractC19741eO1.replaceFirst$default(valueOf, "00", "0", false, 4, (Object) null);
        } else if (AbstractC19741eO1.startsWith$default(valueOf, "66", false, 2, null)) {
            valueOf = AbstractC19741eO1.replaceFirst$default(valueOf, "66", "0", false, 4, (Object) null);
        }
        m16824b(valueOf, z, i4);
    }
}