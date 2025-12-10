package th.p047co.dtac.android.dtacone.app_one.util.format;

import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFilter;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010!\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010%\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010 ¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/format/OnePhoneNumberWatcher;", "Landroid/text/TextWatcher;", "Landroid/widget/EditText;", "vEdt", "<init>", "(Landroid/widget/EditText;)V", "Landroid/text/Editable;", TextBundle.TEXT_ENTRY, "", "afterTextChanged", "(Landroid/text/Editable;)V", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/EditText;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "isFormatting", OperatorName.CURVE_TO, "isFromClipboard", "d", "deletingHyphen", "e", "I", "hyphenStart", OperatorName.FILL_NON_ZERO, "deletingBackward", OperatorName.NON_STROKING_GRAY, "MAX_LEN", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.util.format.OnePhoneNumberWatcher */
/* loaded from: classes7.dex */
public final class OnePhoneNumberWatcher implements TextWatcher {
    public static final int $stable = 8;

    /* renamed from: a */
    public final EditText f82388a;

    /* renamed from: b */
    public boolean f82389b;

    /* renamed from: c */
    public boolean f82390c;

    /* renamed from: d */
    public boolean f82391d;

    /* renamed from: e */
    public int f82392e;

    /* renamed from: f */
    public boolean f82393f;

    /* renamed from: g */
    public final int f82394g;

    public OnePhoneNumberWatcher(@NotNull EditText vEdt) {
        Intrinsics.checkNotNullParameter(vEdt, "vEdt");
        this.f82388a = vEdt;
        this.f82394g = 12;
        vEdt.setFilters(new InputFilter[]{new PhoneNumberFilter(), new InputFilter.LengthFilter(12)});
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void afterTextChanged(@org.jetbrains.annotations.NotNull android.text.Editable r17) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.util.format.OnePhoneNumberWatcher.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
        if (this.f82389b) {
            return;
        }
        if (i3 > 1) {
            this.f82390c = true;
        }
        int selectionStart = Selection.getSelectionStart(s);
        int selectionEnd = Selection.getSelectionEnd(s);
        if (s.length() > 1 && i2 == 1 && i3 == 0 && s.charAt(i) == '-' && selectionStart == selectionEnd) {
            this.f82391d = true;
            this.f82392e = i;
            if (selectionStart == i + 1) {
                this.f82393f = true;
                return;
            } else {
                this.f82393f = false;
                return;
            }
        }
        this.f82391d = false;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
    }
}
