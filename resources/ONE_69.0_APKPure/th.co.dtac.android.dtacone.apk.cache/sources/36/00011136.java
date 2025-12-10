package th.p047co.dtac.android.dtacone.app_one.util.theme;

import android.os.Build;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

@Metadata(m29143d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\u0004\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\t\u001a\u00020\u0004¨\u0006\r"}, m29142d2 = {"setTheme", "", "Landroid/widget/EditText;", "editTextColor", "", "editTextBackground", "editTextHighlightColor", "editTextCursor", "Landroid/widget/TextView;", "fontColor", "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomClearableEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.theme.CustomsThemeKt */
/* loaded from: classes7.dex */
public final class CustomsThemeKt {
    public static final void setTheme(@NotNull OneCustomClearableEditText oneCustomClearableEditText, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(oneCustomClearableEditText, "<this>");
        oneCustomClearableEditText.setTextColor(ResourcesCompat.getColor(oneCustomClearableEditText.getResources(), i, null));
        oneCustomClearableEditText.setFocusColor(i);
        oneCustomClearableEditText.setBackgroundResource(i2);
        oneCustomClearableEditText.setHighlightColor(ResourcesCompat.getColor(oneCustomClearableEditText.getResources(), i3, null));
        oneCustomClearableEditText.setTextAndCompoundColor(i);
        oneCustomClearableEditText.setLinkTextColor(ResourcesCompat.getColor(oneCustomClearableEditText.getResources(), i, null));
        if (Build.VERSION.SDK_INT >= 29) {
            oneCustomClearableEditText.setTextCursorDrawable(i4);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            Intrinsics.checkNotNullExpressionValue(declaredField, "TextView::class.java.get…eld(\"mCursorDrawableRes\")");
            declaredField.setAccessible(true);
            declaredField.set(oneCustomClearableEditText, Integer.valueOf(i4));
        } catch (Exception unused) {
        }
    }

    public static final void setTheme(@NotNull OneEditText oneEditText, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(oneEditText, "<this>");
        oneEditText.setTextColor(ResourcesCompat.getColor(oneEditText.getResources(), i, null));
        oneEditText.setBackgroundResource(i2);
        oneEditText.setHighlightColor(ResourcesCompat.getColor(oneEditText.getResources(), i3, null));
        oneEditText.setLinkTextColor(ResourcesCompat.getColor(oneEditText.getResources(), i, null));
        if (Build.VERSION.SDK_INT >= 29) {
            oneEditText.setTextCursorDrawable(i4);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            Intrinsics.checkNotNullExpressionValue(declaredField, "TextView::class.java.get…eld(\"mCursorDrawableRes\")");
            declaredField.setAccessible(true);
            declaredField.set(oneEditText, Integer.valueOf(i4));
        } catch (Exception unused) {
        }
    }

    public static final void setTheme(@NotNull EditText editText, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setTextColor(ResourcesCompat.getColor(editText.getResources(), i, null));
        editText.setBackgroundResource(i2);
        editText.setHighlightColor(ResourcesCompat.getColor(editText.getResources(), i3, null));
        editText.setLinkTextColor(ResourcesCompat.getColor(editText.getResources(), i, null));
        if (Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(i4);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            Intrinsics.checkNotNullExpressionValue(declaredField, "TextView::class.java.get…eld(\"mCursorDrawableRes\")");
            declaredField.setAccessible(true);
            declaredField.set(editText, Integer.valueOf(i4));
        } catch (Exception unused) {
        }
    }

    public static final void setTheme(@NotNull OneFontTextView oneFontTextView, int i) {
        Intrinsics.checkNotNullParameter(oneFontTextView, "<this>");
        oneFontTextView.setTextColor(ContextCompat.getColor(oneFontTextView.getContext(), i));
    }

    public static final void setTheme(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), i));
    }
}