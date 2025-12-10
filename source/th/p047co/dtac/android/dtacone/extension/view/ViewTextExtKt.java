package th.p047co.dtac.android.dtacone.extension.view;

import android.text.Editable;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberWatcher;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u0002¨\u0006\u0006"}, m28850d2 = {"toPhoneNumberAutoFormat", "", "Landroid/widget/EditText;", "toStringEmpty", "toStringFormat", "", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.view.ViewTextExtKt */
/* loaded from: classes7.dex */
public final class ViewTextExtKt {
    public static final void toPhoneNumberAutoFormat(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.addTextChangedListener(new PhoneNumberWatcher(editText));
    }

    public static final void toStringEmpty(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setText("");
    }

    @NotNull
    public static final String toStringFormat(@Nullable EditText editText) {
        Editable editable;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        return StringsKt__StringsKt.trim(String.valueOf(editable)).toString();
    }
}
