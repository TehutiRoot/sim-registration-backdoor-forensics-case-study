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

/* renamed from: lR */
/* loaded from: classes2.dex */
public final class C12219lR implements TextWatcher {

    /* renamed from: a */
    public final EditText f71623a;

    /* renamed from: b */
    public final boolean f71624b;

    /* renamed from: c */
    public EmojiCompat.InitCallback f71625c;

    /* renamed from: d */
    public int f71626d = Integer.MAX_VALUE;

    /* renamed from: e */
    public int f71627e = 0;

    /* renamed from: f */
    public boolean f71628f = true;

    /* renamed from: lR$a */
    /* loaded from: classes2.dex */
    public static class RunnableC12220a extends EmojiCompat.InitCallback implements Runnable {

        /* renamed from: a */
        public final Reference f71629a;

        public RunnableC12220a(EditText editText) {
            this.f71629a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            Handler handler;
            super.onInitialized();
            EditText editText = (EditText) this.f71629a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C12219lR.m26476c((EditText) this.f71629a.get(), 1);
        }
    }

    public C12219lR(EditText editText, boolean z) {
        this.f71623a = editText;
        this.f71624b = z;
    }

    /* renamed from: c */
    public static void m26476c(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.get().process(editableText);
            C11653kR.m28930b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: a */
    public EmojiCompat.InitCallback m26478a() {
        if (this.f71625c == null) {
            this.f71625c = new RunnableC12220a(this.f71623a);
        }
        return this.f71625c;
    }

    /* renamed from: b */
    public boolean m26477b() {
        return this.f71628f;
    }

    /* renamed from: d */
    public void m26475d(int i) {
        this.f71627e = i;
    }

    /* renamed from: e */
    public void m26474e(boolean z) {
        if (this.f71628f != z) {
            if (this.f71625c != null) {
                EmojiCompat.get().unregisterInitCallback(this.f71625c);
            }
            this.f71628f = z;
            if (z) {
                m26476c(this.f71623a, EmojiCompat.get().getLoadState());
            }
        }
    }

    /* renamed from: f */
    public void m26473f(int i) {
        this.f71626d = i;
    }

    /* renamed from: g */
    public final boolean m26472g() {
        if (this.f71628f && (this.f71624b || EmojiCompat.isConfigured())) {
            return false;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f71623a.isInEditMode() && !m26472g() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int loadState = EmojiCompat.get().getLoadState();
            if (loadState != 0) {
                if (loadState != 1) {
                    if (loadState != 3) {
                        return;
                    }
                } else {
                    EmojiCompat.get().process((Spannable) charSequence, i, i + i3, this.f71626d, this.f71627e);
                    return;
                }
            }
            EmojiCompat.get().registerInitCallback(m26478a());
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
