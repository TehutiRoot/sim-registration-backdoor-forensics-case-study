package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class ActivityOptionsCompat {
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    /* renamed from: androidx.core.app.ActivityOptionsCompat$a */
    /* loaded from: classes2.dex */
    public static class C3806a extends ActivityOptionsCompat {

        /* renamed from: a */
        public final ActivityOptions f33537a;

        public C3806a(ActivityOptions activityOptions) {
            this.f33537a = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Rect getLaunchBounds() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return C3810e.m57898a(this.f33537a);
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(PendingIntent pendingIntent) {
            if (Build.VERSION.SDK_INT >= 23) {
                C3809d.m57899c(this.f33537a, pendingIntent);
            }
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat setLaunchBounds(Rect rect) {
            if (Build.VERSION.SDK_INT < 24) {
                return this;
            }
            return new C3806a(C3810e.m57897b(this.f33537a, rect));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Bundle toBundle() {
            return this.f33537a.toBundle();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof C3806a) {
                this.f33537a.update(((C3806a) activityOptionsCompat).f33537a);
            }
        }
    }

    /* renamed from: androidx.core.app.ActivityOptionsCompat$b */
    /* loaded from: classes2.dex */
    public static class C3807b {
        @DoNotInline
        /* renamed from: a */
        public static ActivityOptions m57907a(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m57906b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: c */
        public static ActivityOptions m57905c(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    /* renamed from: androidx.core.app.ActivityOptionsCompat$c */
    /* loaded from: classes2.dex */
    public static class C3808c {
        @DoNotInline
        /* renamed from: a */
        public static ActivityOptions m57904a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m57903b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @DoNotInline
        /* renamed from: c */
        public static ActivityOptions m57902c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    /* renamed from: androidx.core.app.ActivityOptionsCompat$d */
    /* loaded from: classes2.dex */
    public static class C3809d {
        @DoNotInline
        /* renamed from: a */
        public static ActivityOptions m57901a() {
            return ActivityOptions.makeBasic();
        }

        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m57900b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m57899c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* renamed from: androidx.core.app.ActivityOptionsCompat$e */
    /* loaded from: classes2.dex */
    public static class C3810e {
        @DoNotInline
        /* renamed from: a */
        public static Rect m57898a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m57897b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    @NonNull
    public static ActivityOptionsCompat makeBasic() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C3806a(C3809d.m57901a());
        }
        return new ActivityOptionsCompat();
    }

    @NonNull
    public static ActivityOptionsCompat makeClipRevealAnimation(@NonNull View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C3806a(C3809d.m57900b(view, i, i2, i3, i4));
        }
        return new ActivityOptionsCompat();
    }

    @NonNull
    public static ActivityOptionsCompat makeCustomAnimation(@NonNull Context context, int i, int i2) {
        return new C3806a(C3807b.m57907a(context, i, i2));
    }

    @NonNull
    public static ActivityOptionsCompat makeScaleUpAnimation(@NonNull View view, int i, int i2, int i3, int i4) {
        return new C3806a(C3807b.m57906b(view, i, i2, i3, i4));
    }

    @NonNull
    public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity activity, @NonNull View view, @NonNull String str) {
        return new C3806a(C3808c.m57904a(activity, view, str));
    }

    @NonNull
    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return new C3806a(C3808c.m57902c());
    }

    @NonNull
    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(@NonNull View view, @NonNull Bitmap bitmap, int i, int i2) {
        return new C3806a(C3807b.m57905c(view, bitmap, i, i2));
    }

    @Nullable
    public Rect getLaunchBounds() {
        return null;
    }

    public void requestUsageTimeReport(@NonNull PendingIntent pendingIntent) {
    }

    @NonNull
    public ActivityOptionsCompat setLaunchBounds(@Nullable Rect rect) {
        return this;
    }

    @Nullable
    public Bundle toBundle() {
        return null;
    }

    public void update(@NonNull ActivityOptionsCompat activityOptionsCompat) {
    }

    @NonNull
    public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity activity, @Nullable androidx.core.util.Pair<View, String>... pairArr) {
        Pair[] pairArr2;
        if (pairArr != null) {
            pairArr2 = new Pair[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                androidx.core.util.Pair<View, String> pair = pairArr[i];
                pairArr2[i] = Pair.create(pair.first, pair.second);
            }
        } else {
            pairArr2 = null;
        }
        return new C3806a(C3808c.m57903b(activity, pairArr2));
    }
}