package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class ImageViewCompat {

    /* renamed from: androidx.core.widget.ImageViewCompat$a */
    /* loaded from: classes2.dex */
    public static class C4217a {
        @DoNotInline
        /* renamed from: a */
        public static ColorStateList m56523a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @DoNotInline
        /* renamed from: b */
        public static PorterDuff.Mode m56522b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56521c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m56520d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @Nullable
    public static ColorStateList getImageTintList(@NonNull ImageView imageView) {
        return C4217a.m56523a(imageView);
    }

    @Nullable
    public static PorterDuff.Mode getImageTintMode(@NonNull ImageView imageView) {
        return C4217a.m56522b(imageView);
    }

    public static void setImageTintList(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C4217a.m56521c(imageView, colorStateList);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && C4217a.m56523a(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static void setImageTintMode(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C4217a.m56520d(imageView, mode);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && C4217a.m56523a(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
