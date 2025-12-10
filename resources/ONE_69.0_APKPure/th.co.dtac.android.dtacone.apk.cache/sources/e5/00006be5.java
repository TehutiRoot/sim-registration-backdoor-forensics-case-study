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
    public static class accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4170a implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: a */
        public AccessibilityStateChangeListener f34402a;

        public accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4170a(AccessibilityStateChangeListener accessibilityStateChangeListener) {
            this.f34402a = accessibilityStateChangeListener;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4170a)) {
                return false;
            }
            return this.f34402a.equals(((accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4170a) obj).f34402a);
        }

        public int hashCode() {
            return this.f34402a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.f34402a.onAccessibilityStateChanged(z);
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C4171b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m56583a(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4172c(touchExplorationStateChangeListener));
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m56582b(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4172c(touchExplorationStateChangeListener));
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityManagerCompat$c  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4172c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        public final TouchExplorationStateChangeListener f34403a;

        public accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4172c(TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            this.f34403a = touchExplorationStateChangeListener;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4172c)) {
                return false;
            }
            return this.f34403a.equals(((accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC4172c) obj).f34403a);
        }

        public int hashCode() {
            return this.f34403a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f34403a.onTouchExplorationStateChanged(z);
        }
    }

    @Deprecated
    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityStateChangeListener accessibilityStateChangeListener) {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4170a(accessibilityStateChangeListener));
    }

    public static boolean addTouchExplorationStateChangeListener(@NonNull AccessibilityManager accessibilityManager, @NonNull TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return C4171b.m56583a(accessibilityManager, touchExplorationStateChangeListener);
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
        return accessibilityManager.removeAccessibilityStateChangeListener(new accessibilityAccessibilityManager$AccessibilityStateChangeListenerC4170a(accessibilityStateChangeListener));
    }

    public static boolean removeTouchExplorationStateChangeListener(@NonNull AccessibilityManager accessibilityManager, @NonNull TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return C4171b.m56582b(accessibilityManager, touchExplorationStateChangeListener);
    }
}