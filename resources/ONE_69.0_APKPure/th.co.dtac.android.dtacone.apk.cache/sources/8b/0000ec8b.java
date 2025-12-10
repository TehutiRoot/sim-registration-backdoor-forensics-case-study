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

/* renamed from: oR */
/* loaded from: classes2.dex */
public final class C12438oR implements InputFilter {

    /* renamed from: a */
    public final TextView f72783a;

    /* renamed from: b */
    public EmojiCompat.InitCallback f72784b;

    /* renamed from: oR$a */
    /* loaded from: classes2.dex */
    public static class RunnableC12439a extends EmojiCompat.InitCallback implements Runnable {

        /* renamed from: a */
        public final Reference f72785a;

        /* renamed from: b */
        public final Reference f72786b;

        public RunnableC12439a(TextView textView, C12438oR c12438oR) {
            this.f72785a = new WeakReference(textView);
            this.f72786b = new WeakReference(c12438oR);
        }

        /* renamed from: a */
        public final boolean m26121a(TextView textView, InputFilter inputFilter) {
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
            TextView textView = (TextView) this.f72785a.get();
            if (textView != null && (handler = textView.getHandler()) != null) {
                handler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence process;
            TextView textView = (TextView) this.f72785a.get();
            if (!m26121a(textView, (InputFilter) this.f72786b.get()) || !textView.isAttachedToWindow() || text == (process = EmojiCompat.get().process((text = textView.getText())))) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(process);
            int selectionEnd = Selection.getSelectionEnd(process);
            textView.setText(process);
            if (process instanceof Spannable) {
                C12438oR.m26122b((Spannable) process, selectionStart, selectionEnd);
            }
        }
    }

    public C12438oR(TextView textView) {
        this.f72783a = textView;
    }

    /* renamed from: b */
    public static void m26122b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* renamed from: a */
    public EmojiCompat.InitCallback m26123a() {
        if (this.f72784b == null) {
            this.f72784b = new RunnableC12439a(this.f72783a, this);
        }
        return this.f72784b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f72783a.isInEditMode()) {
            return charSequence;
        }
        int loadState = EmojiCompat.get().getLoadState();
        if (loadState != 0) {
            if (loadState != 1) {
                if (loadState != 3) {
                    return charSequence;
                }
            } else if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != this.f72783a.getText()) && charSequence != null) {
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return EmojiCompat.get().process(charSequence, 0, charSequence.length());
            } else {
                return charSequence;
            }
        }
        EmojiCompat.get().registerInitCallback(m26123a());
        return charSequence;
    }
}