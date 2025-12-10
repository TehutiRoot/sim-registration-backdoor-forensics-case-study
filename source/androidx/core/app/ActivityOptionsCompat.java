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
    public static class C3824a extends ActivityOptionsCompat {

        /* renamed from: a */
        public final ActivityOptions f33449a;

        public C3824a(ActivityOptions activityOptions) {
            this.f33449a = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Rect getLaunchBounds() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return C3828e.m57948a(this.f33449a);
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(PendingIntent pendingIntent) {
            if (Build.VERSION.SDK_INT >= 23) {
                C3827d.m57949c(this.f33449a, pendingIntent);
            }
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat setLaunchBounds(Rect rect) {
            if (Build.VERSION.SDK_INT < 24) {
                return this;
            }
            return new C3824a(C3828e.m57947b(this.f33449a, rect));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Bundle toBundle() {
            return this.f33449a.toBundle();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof C3824a) {
                this.f33449a.update(((C3824a) activityOptionsCompat).f33449a);
            }
        }
    }

    /* renamed from: androidx.core.app.ActivityOptionsCompat$b */
    /* loaded from: classes2.dex */
    public static class C3825b {
        @DoNotInline
        /* renamed from: a */
        public static ActivityOptions m57957a(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m57956b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: c */
        public static ActivityOptions m57955c(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    /* renamed from: androidx.core.app.ActivityOptionsCompat$c */
    /* loaded from: classes2.dex */
    public static class C3826c {
        @DoNotInline
        /* renamed from: a */
        public static ActivityOptions m57954a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m57953b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @DoNotInline
        /* renamed from: c */
        public static ActivityOptions m57952c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    /* renamed from: androidx.core.app.ActivityOptionsCompat$d */
    /* loaded from: classes2.dex */
    public static class C3827d {
        @DoNotInline
        /* renamed from: a */
        public static ActivityOptions m57951a() {
            return ActivityOptions.makeBasic();
        }

        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m57950b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m57949c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* renamed from: androidx.core.app.ActivityOptionsCompat$e */
    /* loaded from: classes2.dex */
    public static class C3828e {
        @DoNotInline
        /* renamed from: a */
        public static Rect m57948a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @DoNotInline
        /* renamed from: b */
        public static ActivityOptions m57947b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    @NonNull
    public static ActivityOptionsCompat makeBasic() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C3824a(C3827d.m57951a());
        }
        return new ActivityOptionsCompat();
    }

    @NonNull
    public static ActivityOptionsCompat makeClipRevealAnimation(@NonNull View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C3824a(C3827d.m57950b(view, i, i2, i3, i4));
        }
        return new ActivityOptionsCompat();
    }

    @NonNull
    public static ActivityOptionsCompat makeCustomAnimation(@NonNull Context context, int i, int i2) {
        return new C3824a(C3825b.m57957a(context, i, i2));
    }

    @NonNull
    public static ActivityOptionsCompat makeScaleUpAnimation(@NonNull View view, int i, int i2, int i3, int i4) {
        return new C3824a(C3825b.m57956b(view, i, i2, i3, i4));
    }

    @NonNull
    public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity activity, @NonNull View view, @NonNull String str) {
        return new C3824a(C3826c.m57954a(activity, view, str));
    }

    @NonNull
    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return new C3824a(C3826c.m57952c());
    }

    @NonNull
    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(@NonNull View view, @NonNull Bitmap bitmap, int i, int i2) {
        return new C3824a(C3825b.m57955c(view, bitmap, i, i2));
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
        return new C3824a(C3826c.m57953b(activity, pairArr2));
    }
}
