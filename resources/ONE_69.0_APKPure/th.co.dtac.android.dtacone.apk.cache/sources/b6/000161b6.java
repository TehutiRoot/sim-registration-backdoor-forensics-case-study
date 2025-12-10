package p000;

import android.widget.ImageView;
import androidx.core.view.MotionEventCompat;

/* renamed from: y12  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23134y12 {

    /* renamed from: y12$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C17095a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f108921a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f108921a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m445a(float f, float f2, float f3) {
        if (f < f2) {
            if (f2 < f3) {
                return;
            }
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
        throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
    }

    /* renamed from: b */
    public static int m444b(int i) {
        return (i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    /* renamed from: c */
    public static boolean m443c(ImageView imageView) {
        if (imageView.getDrawable() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m442d(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (C17095a.f108921a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}