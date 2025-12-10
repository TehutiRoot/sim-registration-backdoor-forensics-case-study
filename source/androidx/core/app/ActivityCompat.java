package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.p005os.BuildCompat;
import androidx.core.view.DragAndDropPermissionsCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ActivityCompat extends ContextCompat {

    /* renamed from: c */
    public static PermissionCompatDelegate f33444c;

    /* loaded from: classes2.dex */
    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    /* loaded from: classes2.dex */
    public interface PermissionCompatDelegate {
        boolean onActivityResult(@NonNull Activity activity, @IntRange(from = 0) int i, int i2, @Nullable Intent intent);

        boolean requestPermissions(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = 0) int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: androidx.core.app.ActivityCompat$a */
    /* loaded from: classes2.dex */
    public class RunnableC3814a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String[] f33445a;

        /* renamed from: b */
        public final /* synthetic */ Activity f33446b;

        /* renamed from: c */
        public final /* synthetic */ int f33447c;

        public RunnableC3814a(String[] strArr, Activity activity, int i) {
            this.f33445a = strArr;
            this.f33446b = activity;
            this.f33447c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f33445a.length];
            PackageManager packageManager = this.f33446b.getPackageManager();
            String packageName = this.f33446b.getPackageName();
            int length = this.f33445a.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f33445a[i], packageName);
            }
            ((OnRequestPermissionsResultCallback) this.f33446b).onRequestPermissionsResult(this.f33447c, this.f33445a, iArr);
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$b */
    /* loaded from: classes2.dex */
    public static class C3815b {
        @DoNotInline
        /* renamed from: a */
        public static void m57977a(Activity activity) {
            activity.finishAffinity();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57976b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m57975c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$c */
    /* loaded from: classes2.dex */
    public static class C3816c {
        @DoNotInline
        /* renamed from: a */
        public static void m57974a(Activity activity) {
            activity.finishAfterTransition();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57973b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m57972c(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57971d(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m57970e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$d */
    /* loaded from: classes2.dex */
    public static class C3817d {
        @DoNotInline
        /* renamed from: a */
        public static Uri m57969a(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$e */
    /* loaded from: classes2.dex */
    public static class C3818e {
        @DoNotInline
        /* renamed from: a */
        public static void m57968a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57967b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m57966c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$f */
    /* loaded from: classes2.dex */
    public static class C3819f {
        @DoNotInline
        /* renamed from: a */
        public static <T> T m57965a(Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$g */
    /* loaded from: classes2.dex */
    public static class C3820g {
        @DoNotInline
        /* renamed from: a */
        public static Display m57964a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57963b(@NonNull Activity activity, @Nullable LocusIdCompat locusIdCompat, @Nullable Bundle bundle) {
            LocusId locusId;
            if (locusIdCompat == null) {
                locusId = null;
            } else {
                locusId = locusIdCompat.toLocusId();
            }
            activity.setLocusContext(locusId, bundle);
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$h */
    /* loaded from: classes2.dex */
    public static class C3821h {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57962a(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @DoNotInline
        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        public static boolean m57961b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$i */
    /* loaded from: classes2.dex */
    public static class C3822i {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57960a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$j */
    /* loaded from: classes2.dex */
    public static class SharedElementCallbackC3823j extends android.app.SharedElementCallback {

        /* renamed from: a */
        public final SharedElementCallback f33448a;

        public SharedElementCallbackC3823j(SharedElementCallback sharedElementCallback) {
            this.f33448a = sharedElementCallback;
        }

        /* renamed from: a */
        public static /* synthetic */ void m57959a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            C3818e.m57968a(onSharedElementsReadyListener);
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f33448a.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f33448a.onCreateSnapshotView(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List list, Map map) {
            this.f33448a.onMapSharedElements(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List list) {
            this.f33448a.onRejectSharedElements(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List list, List list2, List list3) {
            this.f33448a.onSharedElementEnd(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List list, List list2, List list3) {
            this.f33448a.onSharedElementStart(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List list, List list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f33448a.onSharedElementsArrived(list, list2, new SharedElementCallback.OnSharedElementsReadyListener() { // from class: M1
                @Override // androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener
                public final void onSharedElementsReady() {
                    ActivityCompat.SharedElementCallbackC3823j.m57959a(onSharedElementsReadyListener);
                }
            });
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m57979b(Activity activity) {
        m57978c(activity);
    }

    /* renamed from: c */
    public static /* synthetic */ void m57978c(Activity activity) {
        if (!activity.isFinishing() && !AbstractC1424U1.m66149i(activity)) {
            activity.recreate();
        }
    }

    public static void finishAffinity(@NonNull Activity activity) {
        C3815b.m57977a(activity);
    }

    public static void finishAfterTransition(@NonNull Activity activity) {
        C3816c.m57974a(activity);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static PermissionCompatDelegate getPermissionCompatDelegate() {
        return f33444c;
    }

    @Nullable
    public static Uri getReferrer(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return C3817d.m57969a(activity);
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean isLaunchedFromBubble(@NonNull Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return C3821h.m57962a(activity);
        }
        if (i == 30) {
            if (C3820g.m57964a(activity) != null && C3820g.m57964a(activity).getDisplayId() != 0) {
                return true;
            }
            return false;
        } else if (i == 29 && activity.getWindowManager().getDefaultDisplay() != null && activity.getWindowManager().getDefaultDisplay().getDisplayId() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void postponeEnterTransition(@NonNull Activity activity) {
        C3816c.m57973b(activity);
    }

    public static void recreate(@NonNull final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: L1
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityCompat.m57979b(activity);
                }
            });
        }
    }

    @Nullable
    public static DragAndDropPermissionsCompat requestDragAndDropPermissions(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        return DragAndDropPermissionsCompat.request(activity, dragEvent);
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public static void requestPermissions(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = 0) int i) {
        String[] strArr2;
        PermissionCompatDelegate permissionCompatDelegate = f33444c;
        if (permissionCompatDelegate != null && permissionCompatDelegate.requestPermissions(activity, strArr, i)) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (!BuildCompat.isAtLeastT() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
            }
            C3818e.m57967b(activity, strArr, i);
        } else if (activity instanceof OnRequestPermissionsResultCallback) {
            new Handler(Looper.getMainLooper()).post(new RunnableC3814a(strArr2, activity, i));
        }
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull Activity activity, @IdRes int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C3819f.m57965a(activity, i);
        }
        T t = (T) activity.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(@NonNull Activity activity, @Nullable SharedElementCallback sharedElementCallback) {
        SharedElementCallbackC3823j sharedElementCallbackC3823j;
        if (sharedElementCallback != null) {
            sharedElementCallbackC3823j = new SharedElementCallbackC3823j(sharedElementCallback);
        } else {
            sharedElementCallbackC3823j = null;
        }
        C3816c.m57972c(activity, sharedElementCallbackC3823j);
    }

    public static void setExitSharedElementCallback(@NonNull Activity activity, @Nullable SharedElementCallback sharedElementCallback) {
        SharedElementCallbackC3823j sharedElementCallbackC3823j;
        if (sharedElementCallback != null) {
            sharedElementCallbackC3823j = new SharedElementCallbackC3823j(sharedElementCallback);
        } else {
            sharedElementCallbackC3823j = null;
        }
        C3816c.m57971d(activity, sharedElementCallbackC3823j);
    }

    public static void setLocusContext(@NonNull Activity activity, @Nullable LocusIdCompat locusIdCompat, @Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3820g.m57963b(activity, locusIdCompat, bundle);
        }
    }

    public static void setPermissionCompatDelegate(@Nullable PermissionCompatDelegate permissionCompatDelegate) {
        f33444c = permissionCompatDelegate;
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public static boolean shouldShowRequestPermissionRationale(@NonNull Activity activity, @NonNull String str) {
        if (!BuildCompat.isAtLeastT() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 32) {
            return C3822i.m57960a(activity, str);
        }
        if (i == 31) {
            return C3821h.m57961b(activity, str);
        }
        if (i < 23) {
            return false;
        }
        return C3818e.m57966c(activity, str);
    }

    public static void startActivityForResult(@NonNull Activity activity, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        C3815b.m57976b(activity, intent, i, bundle);
    }

    public static void startIntentSenderForResult(@NonNull Activity activity, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        C3815b.m57975c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void startPostponedEnterTransition(@NonNull Activity activity) {
        C3816c.m57970e(activity);
    }
}
