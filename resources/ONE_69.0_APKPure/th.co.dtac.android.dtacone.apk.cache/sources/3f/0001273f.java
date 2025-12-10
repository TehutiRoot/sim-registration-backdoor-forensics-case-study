package th.p047co.dtac.android.dtacone.util.format;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0019\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/format/PhoneNumberWatcherV2;", "Landroid/text/TextWatcher;", "Landroid/widget/EditText;", "edt", "", "format", "<init>", "(Landroid/widget/EditText;Ljava/lang/String;)V", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "p0", "p1", "p2", "p3", "onTextChanged", "strAfter", "currentFormat", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "([C)Ljava/lang/String;", "Landroid/widget/EditText;", "Ljava/lang/String;", OperatorName.CURVE_TO, "d", "strBefor", "e", "I", "selectionIndex", OperatorName.FILL_NON_ZERO, "maxLength", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.format.PhoneNumberWatcherV2 */
/* loaded from: classes8.dex */
public final class PhoneNumberWatcherV2 implements TextWatcher {
    public static final int $stable = 8;

    /* renamed from: a */
    public final EditText f87176a;

    /* renamed from: b */
    public final String f87177b;

    /* renamed from: c */
    public String f87178c;

    /* renamed from: d */
    public String f87179d;

    /* renamed from: e */
    public int f87180e;

    /* renamed from: f */
    public final int f87181f;

    public PhoneNumberWatcherV2(@NotNull EditText edt, @NotNull String format) {
        Intrinsics.checkNotNullParameter(edt, "edt");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f87176a = edt;
        this.f87177b = format;
        this.f87178c = "";
        this.f87179d = "";
        this.f87181f = AbstractC19741eO1.replace$default(format, HelpFormatter.DEFAULT_OPT_PREFIX, "", false, 4, (Object) null).length();
    }

    /* renamed from: a */
    public final String m16754a(String str, String str2) {
        return "";
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        String str;
        int i;
        this.f87176a.removeTextChangedListener(this);
        String valueOf = String.valueOf(editable);
        if (valueOf.length() > 0) {
            this.f87180e = this.f87176a.getSelectionStart();
            this.f87178c = valueOf;
            int length = valueOf.length();
            String replace$default = AbstractC19741eO1.replace$default(this.f87178c, HelpFormatter.DEFAULT_OPT_PREFIX, "", false, 4, (Object) null);
            this.f87178c = replace$default;
            if (replace$default.length() > this.f87181f) {
                str = this.f87179d;
            } else {
                str = this.f87178c;
            }
            this.f87178c = str;
            char[] charArray = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            String m16754a = m16754a(this.f87178c, m16753b(charArray));
            int length2 = m16754a.length();
            int i2 = this.f87180e;
            if (length2 > length) {
                i = i2 + (length2 - length);
            } else {
                i = i2 + (length - length2);
            }
            this.f87180e = i;
            Intrinsics.checkNotNull(editable);
            editable.clear();
            editable.append((CharSequence) m16754a);
            try {
                this.f87176a.setSelection(this.f87180e);
            } catch (IndexOutOfBoundsException unused) {
                this.f87176a.setSelection(0);
            }
        }
        this.f87176a.addTextChangedListener(this);
    }

    /* renamed from: b */
    public final String m16753b(char[] cArr) {
        return "";
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        this.f87179d = String.valueOf(charSequence);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}