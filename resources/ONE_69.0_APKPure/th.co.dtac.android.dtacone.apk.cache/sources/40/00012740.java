package th.p047co.dtac.android.dtacone.util.format;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/format/PhoneNumberWithCapTextWatcher;", "Landroid/text/TextWatcher;", "Landroid/widget/EditText;", "vEdt", "", "isFilterNumber", "<init>", "(Landroid/widget/EditText;Z)V", "Landroid/text/Editable;", TextBundle.TEXT_ENTRY, "", "afterTextChanged", "(Landroid/text/Editable;)V", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/EditText;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "MAX_LEN", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.format.PhoneNumberWithCapTextWatcher */
/* loaded from: classes8.dex */
public final class PhoneNumberWithCapTextWatcher implements TextWatcher {
    public static final int $stable = 8;

    /* renamed from: a */
    public final EditText f87182a;

    /* renamed from: b */
    public final int f87183b;

    public PhoneNumberWithCapTextWatcher(@NotNull EditText vEdt, boolean z) {
        Intrinsics.checkNotNullParameter(vEdt, "vEdt");
        this.f87182a = vEdt;
        this.f87183b = 12;
        if (z) {
            vEdt.setFilters(new InputFilter[]{new PhoneNumberFilter(), new InputFilter.LengthFilter(12)});
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f87182a.removeTextChangedListener(this);
        if (text.toString().length() > 0) {
            if (text.toString().length() >= 2) {
                String substring = text.toString().substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (Intrinsics.areEqual("66", substring)) {
                    this.f87182a.setText(text.replace(0, 2, "0"));
                }
            }
            if (StringsKt___StringsKt.last(text) == '-') {
                text.replace(text.length() - 1, text.length(), "");
            }
            if (StringsKt__StringsKt.contains((CharSequence) text.toString(), (CharSequence) HelpFormatter.DEFAULT_OPT_PREFIX, true)) {
                this.f87182a.setText(new Regex("[-]").replace(text, ""));
            }
        }
        this.f87182a.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
    }

    public /* synthetic */ PhoneNumberWithCapTextWatcher(EditText editText, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(editText, (i & 2) != 0 ? true : z);
    }
}