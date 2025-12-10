package p000;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: kR */
/* loaded from: classes2.dex */
public final class C11653kR implements InputFilter {

    /* renamed from: a */
    public final TextView f67915a;

    /* renamed from: b */
    public EmojiCompat.InitCallback f67916b;

    /* renamed from: kR$a */
    /* loaded from: classes2.dex */
    public static class RunnableC11654a extends EmojiCompat.InitCallback implements Runnable {

        /* renamed from: a */
        public final Reference f67917a;

        /* renamed from: b */
        public final Reference f67918b;

        public RunnableC11654a(TextView textView, C11653kR c11653kR) {
            this.f67917a = new WeakReference(textView);
            this.f67918b = new WeakReference(c11653kR);
        }

        /* renamed from: a */
        public final boolean m28929a(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            Handler handler;
            super.onInitialized();
            TextView textView = (TextView) this.f67917a.get();
            if (textView != null && (handler = textView.getHandler()) != null) {
                handler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence process;
            TextView textView = (TextView) this.f67917a.get();
            if (!m28929a(textView, (InputFilter) this.f67918b.get()) || !textView.isAttachedToWindow() || text == (process = EmojiCompat.get().process((text = textView.getText())))) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(process);
            int selectionEnd = Selection.getSelectionEnd(process);
            textView.setText(process);
            if (process instanceof Spannable) {
                C11653kR.m28930b((Spannable) process, selectionStart, selectionEnd);
            }
        }
    }

    public C11653kR(TextView textView) {
        this.f67915a = textView;
    }

    /* renamed from: b */
    public static void m28930b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* renamed from: a */
    public EmojiCompat.InitCallback m28931a() {
        if (this.f67916b == null) {
            this.f67916b = new RunnableC11654a(this.f67915a, this);
        }
        return this.f67916b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f67915a.isInEditMode()) {
            return charSequence;
        }
        int loadState = EmojiCompat.get().getLoadState();
        if (loadState != 0) {
            if (loadState != 1) {
                if (loadState != 3) {
                    return charSequence;
                }
            } else if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != this.f67915a.getText()) && charSequence != null) {
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return EmojiCompat.get().process(charSequence, 0, charSequence.length());
            } else {
                return charSequence;
            }
        }
        EmojiCompat.get().registerInitCallback(m28931a());
        return charSequence;
    }
}
