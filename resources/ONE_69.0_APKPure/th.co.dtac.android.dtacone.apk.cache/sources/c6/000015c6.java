package p000;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: Wp */
/* loaded from: classes4.dex */
public abstract class AbstractC1627Wp extends AccessibilityDelegateCompat {

    /* renamed from: d */
    public final AccessibilityNodeInfoCompat.AccessibilityActionCompat f7397d;

    public AbstractC1627Wp(Context context, int i) {
        this.f7397d = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(this.f7397d);
    }
}