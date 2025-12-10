package p000;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;

/* renamed from: TD */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1355TD {
    /* renamed from: a */
    public static /* synthetic */ void m66362a(EditText[] editTextArr, View view, boolean z) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        ViewUtils.hideKeyboard(view);
    }

    /* renamed from: b */
    public static void m66361b(final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: SD
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                AbstractC1355TD.m66362a(editTextArr, view, z);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        ViewUtils.requestFocusAndShowKeyboard(editTextArr[0]);
    }
}