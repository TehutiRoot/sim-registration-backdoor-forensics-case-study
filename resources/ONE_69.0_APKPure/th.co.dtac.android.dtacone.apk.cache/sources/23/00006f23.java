package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: androidx.emoji2.text.a */
/* loaded from: classes2.dex */
public class C4510a implements EmojiCompat.GlyphChecker {

    /* renamed from: b */
    public static final ThreadLocal f35278b = new ThreadLocal();

    /* renamed from: a */
    public final TextPaint f35279a;

    public C4510a() {
        TextPaint textPaint = new TextPaint();
        this.f35279a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: a */
    public static StringBuilder m54688a() {
        ThreadLocal threadLocal = f35278b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean hasGlyph(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        StringBuilder m54688a = m54688a();
        m54688a.setLength(0);
        while (i < i2) {
            m54688a.append(charSequence.charAt(i));
            i++;
        }
        return PaintCompat.hasGlyph(this.f35279a, m54688a.toString());
    }
}