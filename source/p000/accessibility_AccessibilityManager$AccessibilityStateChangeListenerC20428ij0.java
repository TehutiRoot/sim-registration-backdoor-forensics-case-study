package p000;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ij0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0 implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final MutableState f62876a;

    /* renamed from: b */
    public final MutableState f62877b;

    public accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0() {
        MutableState m31891g;
        MutableState m31891g2;
        Boolean bool = Boolean.FALSE;
        m31891g = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f62876a = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f62877b = m31891g2;
    }

    /* renamed from: a */
    public final boolean m30586a() {
        return ((Boolean) this.f62876a.getValue()).booleanValue();
    }

    /* renamed from: b */
    public final boolean m30585b() {
        return ((Boolean) this.f62877b.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final boolean m30584c() {
        if (m30586a() && m30585b()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m30583d(AccessibilityManager am) {
        Intrinsics.checkNotNullParameter(am, "am");
        m30582e(am.isEnabled());
        m30581f(am.isTouchExplorationEnabled());
        am.addTouchExplorationStateChangeListener(this);
        am.addAccessibilityStateChangeListener(this);
    }

    /* renamed from: e */
    public final void m30582e(boolean z) {
        this.f62876a.setValue(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void m30581f(boolean z) {
        this.f62877b.setValue(Boolean.valueOf(z));
    }

    /* renamed from: g */
    public final void m30580g(AccessibilityManager am) {
        Intrinsics.checkNotNullParameter(am, "am");
        am.removeTouchExplorationStateChangeListener(this);
        am.removeAccessibilityStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        m30582e(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        m30581f(z);
    }
}
