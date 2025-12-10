package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* loaded from: classes2.dex */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final String SPAN_ID = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* renamed from: a */
    public final int f34399a;

    /* renamed from: b */
    public final AccessibilityNodeInfoCompat f34400b;

    /* renamed from: c */
    public final int f34401c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public AccessibilityClickableSpanCompat(int i, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
        this.f34399a = i;
        this.f34400b = accessibilityNodeInfoCompat;
        this.f34401c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(SPAN_ID, this.f34399a);
        this.f34400b.performAction(this.f34401c, bundle);
    }
}