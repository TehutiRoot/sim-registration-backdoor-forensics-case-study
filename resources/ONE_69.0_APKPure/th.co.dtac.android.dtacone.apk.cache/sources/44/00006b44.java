package androidx.core.view;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes2.dex */
public final class DragAndDropPermissionsCompat {

    /* renamed from: a */
    public final DragAndDropPermissions f34240a;

    /* renamed from: androidx.core.view.DragAndDropPermissionsCompat$a */
    /* loaded from: classes2.dex */
    public static class C4091a {
        @DoNotInline
        /* renamed from: a */
        public static void m56957a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @DoNotInline
        /* renamed from: b */
        public static DragAndDropPermissions m56956b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public DragAndDropPermissionsCompat(DragAndDropPermissions dragAndDropPermissions) {
        this.f34240a = dragAndDropPermissions;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static DragAndDropPermissionsCompat request(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        DragAndDropPermissions m56956b;
        if (Build.VERSION.SDK_INT >= 24 && (m56956b = C4091a.m56956b(activity, dragEvent)) != null) {
            return new DragAndDropPermissionsCompat(m56956b);
        }
        return null;
    }

    public void release() {
        if (Build.VERSION.SDK_INT >= 24) {
            C4091a.m56957a(this.f34240a);
        }
    }
}