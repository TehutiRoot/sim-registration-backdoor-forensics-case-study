package p000;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: qd0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC21786qd0 {

    /* renamed from: a */
    public static boolean f77015a = true;

    /* renamed from: a */
    public static void m23465a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            m23464b(imageView, matrix);
        }
    }

    /* renamed from: b */
    public static void m23464b(ImageView imageView, Matrix matrix) {
        if (f77015a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f77015a = false;
            }
        }
    }
}
