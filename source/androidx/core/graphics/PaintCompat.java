package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.AbstractC3998a;
import androidx.core.util.Pair;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes2.dex */
public final class PaintCompat {

    /* renamed from: a */
    public static final ThreadLocal f33850a = new ThreadLocal();

    /* renamed from: androidx.core.graphics.PaintCompat$a */
    /* loaded from: classes2.dex */
    public static class C3993a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57367a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: androidx.core.graphics.PaintCompat$b */
    /* loaded from: classes2.dex */
    public static class C3994b {
        @DoNotInline
        /* renamed from: a */
        public static void m57366a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    /* renamed from: a */
    public static Pair m57368a() {
        ThreadLocal threadLocal = f33850a;
        Pair pair = (Pair) threadLocal.get();
        if (pair == null) {
            Pair pair2 = new Pair(new Rect(), new Rect());
            threadLocal.set(pair2);
            return pair2;
        }
        ((Rect) pair.first).setEmpty();
        ((Rect) pair.second).setEmpty();
        return pair;
    }

    public static boolean hasGlyph(@NonNull Paint paint, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3993a.m57367a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText(OperatorName.MOVE_TO);
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        Pair m57368a = m57368a();
        paint.getTextBounds("\udfffd", 0, 2, (Rect) m57368a.first);
        paint.getTextBounds(str, 0, length, (Rect) m57368a.second);
        return !((Rect) m57368a.first).equals(m57368a.second);
    }

    public static boolean setBlendMode(@NonNull Paint paint, @Nullable BlendModeCompat blendModeCompat) {
        PorterDuffXfermode porterDuffXfermode = null;
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 29) {
            if (blendModeCompat != null) {
                obj = AbstractC3998a.C4000b.m57338a(blendModeCompat);
            }
            C3994b.m57366a(paint, obj);
            return true;
        } else if (blendModeCompat != null) {
            PorterDuff.Mode m57339a = AbstractC3998a.m57339a(blendModeCompat);
            if (m57339a != null) {
                porterDuffXfermode = new PorterDuffXfermode(m57339a);
            }
            paint.setXfermode(porterDuffXfermode);
            if (m57339a != null) {
                return true;
            }
            return false;
        } else {
            paint.setXfermode(null);
            return true;
        }
    }
}
