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
    public final DragAndDropPermissions f34152a;

    /* renamed from: androidx.core.view.DragAndDropPermissionsCompat$a */
    /* loaded from: classes2.dex */
    public static class C4109a {
        @DoNotInline
        /* renamed from: a */
        public static void m57007a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @DoNotInline
        /* renamed from: b */
        public static DragAndDropPermissions m57006b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public DragAndDropPermissionsCompat(DragAndDropPermissions dragAndDropPermissions) {
        this.f34152a = dragAndDropPermissions;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static DragAndDropPermissionsCompat request(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        DragAndDropPermissions m57006b;
        if (Build.VERSION.SDK_INT >= 24 && (m57006b = C4109a.m57006b(activity, dragEvent)) != null) {
            return new DragAndDropPermissionsCompat(m57006b);
        }
        return null;
    }

    public void release() {
        if (Build.VERSION.SDK_INT >= 24) {
            C4109a.m57007a(this.f34152a);
        }
    }
}
