package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: androidx.emoji2.text.a */
/* loaded from: classes2.dex */
public class C4528a implements EmojiCompat.GlyphChecker {

    /* renamed from: b */
    public static final ThreadLocal f35190b = new ThreadLocal();

    /* renamed from: a */
    public final TextPaint f35191a;

    public C4528a() {
        TextPaint textPaint = new TextPaint();
        this.f35191a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: a */
    public static StringBuilder m54738a() {
        ThreadLocal threadLocal = f35190b;
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
        StringBuilder m54738a = m54738a();
        m54738a.setLength(0);
        while (i < i2) {
            m54738a.append(charSequence.charAt(i));
            i++;
        }
        return PaintCompat.hasGlyph(this.f35191a, m54738a.toString());
    }
}
