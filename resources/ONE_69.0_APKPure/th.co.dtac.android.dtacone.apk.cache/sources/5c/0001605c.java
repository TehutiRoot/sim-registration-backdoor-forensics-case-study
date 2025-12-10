package p000;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: wd0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC22887wd0 {

    /* renamed from: a */
    public static boolean f108502a = true;

    /* renamed from: a */
    public static void m692a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            m691b(imageView, matrix);
        }
    }

    /* renamed from: b */
    public static void m691b(ImageView imageView, Matrix matrix) {
        if (f108502a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f108502a = false;
            }
        }
    }
}