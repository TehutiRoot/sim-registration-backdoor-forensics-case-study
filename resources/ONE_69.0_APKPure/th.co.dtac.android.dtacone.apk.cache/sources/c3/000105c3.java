package p000;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: pR */
/* loaded from: classes2.dex */
public final class C13086pR implements TextWatcher {

    /* renamed from: a */
    public final EditText f76802a;

    /* renamed from: b */
    public final boolean f76803b;

    /* renamed from: c */
    public EmojiCompat.InitCallback f76804c;

    /* renamed from: d */
    public int f76805d = Integer.MAX_VALUE;

    /* renamed from: e */
    public int f76806e = 0;

    /* renamed from: f */
    public boolean f76807f = true;

    /* renamed from: pR$a */
    /* loaded from: classes2.dex */
    public static class RunnableC13087a extends EmojiCompat.InitCallback implements Runnable {

        /* renamed from: a */
        public final Reference f76808a;

        public RunnableC13087a(EditText editText) {
            this.f76808a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            Handler handler;
            super.onInitialized();
            EditText editText = (EditText) this.f76808a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C13086pR.m23852c((EditText) this.f76808a.get(), 1);
        }
    }

    public C13086pR(EditText editText, boolean z) {
        this.f76802a = editText;
        this.f76803b = z;
    }

    /* renamed from: c */
    public static void m23852c(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.get().process(editableText);
            C12438oR.m26122b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: a */
    public EmojiCompat.InitCallback m23854a() {
        if (this.f76804c == null) {
            this.f76804c = new RunnableC13087a(this.f76802a);
        }
        return this.f76804c;
    }

    /* renamed from: b */
    public boolean m23853b() {
        return this.f76807f;
    }

    /* renamed from: d */
    public void m23851d(int i) {
        this.f76806e = i;
    }

    /* renamed from: e */
    public void m23850e(boolean z) {
        if (this.f76807f != z) {
            if (this.f76804c != null) {
                EmojiCompat.get().unregisterInitCallback(this.f76804c);
            }
            this.f76807f = z;
            if (z) {
                m23852c(this.f76802a, EmojiCompat.get().getLoadState());
            }
        }
    }

    /* renamed from: f */
    public void m23849f(int i) {
        this.f76805d = i;
    }

    /* renamed from: g */
    public final boolean m23848g() {
        if (this.f76807f && (this.f76803b || EmojiCompat.isConfigured())) {
            return false;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f76802a.isInEditMode() && !m23848g() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int loadState = EmojiCompat.get().getLoadState();
            if (loadState != 0) {
                if (loadState != 1) {
                    if (loadState != 3) {
                        return;
                    }
                } else {
                    EmojiCompat.get().process((Spannable) charSequence, i, i + i3, this.f76805d, this.f76806e);
                    return;
                }
            }
            EmojiCompat.get().registerInitCallback(m23854a());
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}