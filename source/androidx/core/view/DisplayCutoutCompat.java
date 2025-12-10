package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class DisplayCutoutCompat {

    /* renamed from: a */
    public final DisplayCutout f34151a;

    /* renamed from: androidx.core.view.DisplayCutoutCompat$a */
    /* loaded from: classes2.dex */
    public static class C4106a {
        @DoNotInline
        /* renamed from: a */
        public static DisplayCutout m57016a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @DoNotInline
        /* renamed from: b */
        public static List<Rect> m57015b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m57014c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m57013d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m57012e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @DoNotInline
        /* renamed from: f */
        public static int m57011f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* renamed from: androidx.core.view.DisplayCutoutCompat$b */
    /* loaded from: classes2.dex */
    public static class C4107b {
        @DoNotInline
        /* renamed from: a */
        public static DisplayCutout m57010a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* renamed from: androidx.core.view.DisplayCutoutCompat$c */
    /* loaded from: classes2.dex */
    public static class C4108c {
        @DoNotInline
        /* renamed from: a */
        public static DisplayCutout m57009a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @DoNotInline
        /* renamed from: b */
        public static Insets m57008b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public DisplayCutoutCompat(@Nullable Rect rect, @Nullable List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? C4106a.m57016a(rect, list) : null);
    }

    /* renamed from: a */
    public static DisplayCutout m57019a(androidx.core.graphics.Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, androidx.core.graphics.Insets insets2) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C4108c.m57009a(insets.toPlatformInsets(), rect, rect2, rect3, rect4, insets2.toPlatformInsets());
        }
        if (i >= 29) {
            return C4107b.m57010a(insets.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (i >= 28) {
            Rect rect5 = new Rect(insets.left, insets.top, insets.right, insets.bottom);
            ArrayList arrayList = new ArrayList();
            if (rect != null) {
                arrayList.add(rect);
            }
            if (rect2 != null) {
                arrayList.add(rect2);
            }
            if (rect3 != null) {
                arrayList.add(rect3);
            }
            if (rect4 != null) {
                arrayList.add(rect4);
            }
            return C4106a.m57016a(rect5, arrayList);
        }
        return null;
    }

    /* renamed from: c */
    public static DisplayCutoutCompat m57017c(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new DisplayCutoutCompat(displayCutout);
    }

    /* renamed from: b */
    public DisplayCutout m57018b() {
        return this.f34151a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DisplayCutoutCompat.class == obj.getClass()) {
            return ObjectsCompat.equals(this.f34151a, ((DisplayCutoutCompat) obj).f34151a);
        }
        return false;
    }

    @NonNull
    public List<Rect> getBoundingRects() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4106a.m57015b(this.f34151a);
        }
        return Collections.emptyList();
    }

    public int getSafeInsetBottom() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4106a.m57014c(this.f34151a);
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4106a.m57013d(this.f34151a);
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4106a.m57012e(this.f34151a);
        }
        return 0;
    }

    public int getSafeInsetTop() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4106a.m57011f(this.f34151a);
        }
        return 0;
    }

    @NonNull
    public androidx.core.graphics.Insets getWaterfallInsets() {
        if (Build.VERSION.SDK_INT >= 30) {
            return androidx.core.graphics.Insets.toCompatInsets(C4108c.m57008b(this.f34151a));
        }
        return androidx.core.graphics.Insets.NONE;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f34151a;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    @NonNull
    public String toString() {
        return "DisplayCutoutCompat{" + this.f34151a + "}";
    }

    public DisplayCutoutCompat(@NonNull androidx.core.graphics.Insets insets, @Nullable Rect rect, @Nullable Rect rect2, @Nullable Rect rect3, @Nullable Rect rect4, @NonNull androidx.core.graphics.Insets insets2) {
        this(m57019a(insets, rect, rect2, rect3, rect4, insets2));
    }

    public DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.f34151a = displayCutout;
    }
}
