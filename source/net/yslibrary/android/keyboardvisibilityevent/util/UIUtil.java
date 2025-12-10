package net.yslibrary.android.keyboardvisibilityevent.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes6.dex */
public final class UIUtil {
    /* renamed from: a */
    public static InputMethodManager m26073a(Context context) {
        return (InputMethodManager) context.getSystemService("input_method");
    }

    public static float convertDpToPx(Context context, float f) {
        return f * (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static void hideKeyboard(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        m26073a(context).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void showKeyboard(Context context, EditText editText) {
        if (context != null && editText != null) {
            m26073a(context).showSoftInput(editText, 1);
        }
    }

    public static void showKeyboardInDialog(Dialog dialog, EditText editText) {
        if (dialog != null && editText != null) {
            dialog.getWindow().setSoftInputMode(4);
            editText.requestFocus();
        }
    }

    public static void hideKeyboard(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        if (decorView != null) {
            hideKeyboard(activity, decorView);
        }
    }
}
