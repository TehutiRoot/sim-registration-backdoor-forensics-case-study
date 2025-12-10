package p000;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* renamed from: K5 */
/* loaded from: classes.dex */
public class C0704K5 {

    /* renamed from: a */
    public final EditText f3214a;

    /* renamed from: b */
    public final EmojiEditTextHelper f3215b;

    public C0704K5(EditText editText) {
        this.f3214a = editText;
        this.f3215b = new EmojiEditTextHelper(editText, false);
    }

    /* renamed from: a */
    public KeyListener m67766a(KeyListener keyListener) {
        if (m67765b(keyListener)) {
            return this.f3215b.getKeyListener(keyListener);
        }
        return keyListener;
    }

    /* renamed from: b */
    public boolean m67765b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* renamed from: c */
    public boolean m67764c() {
        return this.f3215b.isEnabled();
    }

    /* renamed from: d */
    public void m67763d(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3214a.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_emojiCompatEnabled)) {
                z = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTextView_emojiCompatEnabled, true);
            }
            obtainStyledAttributes.recycle();
            m67761f(z);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* renamed from: e */
    public InputConnection m67762e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f3215b.onCreateInputConnection(inputConnection, editorInfo);
    }

    /* renamed from: f */
    public void m67761f(boolean z) {
        this.f3215b.setEnabled(z);
    }
}