package co.omise.android.extensions;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28850d2 = {"textOrNull", "Landroid/text/Editable;", "Landroid/widget/EditText;", "getTextOrNull", "(Landroid/widget/EditText;)Landroid/text/Editable;", "disableOptions", "", "setOnAfterTextChangeListener", "action", "Lkotlin/Function0;", "sdk_productionRelease"}, m28849k = 2, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public final class EditTextExtensionsKt {
    public static final void disableOptions(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: co.omise.android.extensions.EditTextExtensionsKt$disableOptions$1
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(@Nullable ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
                return false;
            }
        });
    }

    @Nullable
    public static final Editable getTextOrNull(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Editable text = editText.getText();
        if (AbstractC20204hN1.isBlank(text)) {
            return null;
        }
        return text;
    }

    public static final void setOnAfterTextChangeListener(@NotNull EditText editText, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        editText.addTextChangedListener(new TextWatcher() { // from class: co.omise.android.extensions.EditTextExtensionsKt$setOnAfterTextChangeListener$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                action.invoke();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence p0, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(p0, "p0");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence p0, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(p0, "p0");
            }
        });
    }
}
