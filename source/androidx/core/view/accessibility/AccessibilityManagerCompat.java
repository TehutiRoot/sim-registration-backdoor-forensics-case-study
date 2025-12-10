package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes2.dex */
public final class AccessibilityManagerCompat {

    @Deprecated
    /* loaded from: classes2.dex */
    public interface AccessibilityStateChangeListener {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public static abstract class AccessibilityStateChangeListenerCompat implements AccessibilityStateChangeListener {
    }

    /* loaded from: classes2.dex */
    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityManagerCompat$a  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static class accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4188a implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: a */
        public AccessibilityStateChangeListener f34314a;

        public accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4188a(AccessibilityStateChangeListener accessibilityStateChangeListener) {
            this.f34314a = accessibilityStateChangeListener;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4188a)) {
                return false;
            }
            return this.f34314a.equals(((accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4188a) obj).f34314a);
        }

        public int hashCode() {
            return this.f34314a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.f34314a.onAccessibilityStateChanged(z);
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C4189b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m56633a(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4190c(touchExplorationStateChangeListener));
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m56632b(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4190c(touchExplorationStateChangeListener));
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityManagerCompat$c  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4190c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        public final TouchExplorationStateChangeListener f34315a;

        public accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4190c(TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            this.f34315a = touchExplorationStateChangeListener;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4190c)) {
                return false;
            }
            return this.f34315a.equals(((accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4190c) obj).f34315a);
        }

        public int hashCode() {
            return this.f34315a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f34315a.onTouchExplorationStateChanged(z);
        }
    }

    @Deprecated
    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityStateChangeListener accessibilityStateChangeListener) {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4188a(accessibilityStateChangeListener));
    }

    public static boolean addTouchExplorationStateChangeListener(@NonNull AccessibilityManager accessibilityManager, @NonNull TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return C4189b.m56633a(accessibilityManager, touchExplorationStateChangeListener);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityStateChangeListener accessibilityStateChangeListener) {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4188a(accessibilityStateChangeListener));
    }

    public static boolean removeTouchExplorationStateChangeListener(@NonNull AccessibilityManager accessibilityManager, @NonNull TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return C4189b.m56632b(accessibilityManager, touchExplorationStateChangeListener);
    }
}
