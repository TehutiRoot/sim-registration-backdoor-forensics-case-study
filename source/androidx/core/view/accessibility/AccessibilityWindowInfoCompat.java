package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;

    /* renamed from: a */
    public final Object f34330a;

    /* renamed from: androidx.core.view.accessibility.AccessibilityWindowInfoCompat$a */
    /* loaded from: classes2.dex */
    public static class C4198a {
        @DoNotInline
        /* renamed from: a */
        public static void m56608a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @DoNotInline
        /* renamed from: b */
        public static AccessibilityWindowInfo m56607b(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        @DoNotInline
        /* renamed from: c */
        public static int m56606c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m56605d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m56604e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @DoNotInline
        /* renamed from: f */
        public static AccessibilityWindowInfo m56603f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @DoNotInline
        /* renamed from: g */
        public static AccessibilityNodeInfo m56602g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @DoNotInline
        /* renamed from: h */
        public static int m56601h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @DoNotInline
        /* renamed from: i */
        public static boolean m56600i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @DoNotInline
        /* renamed from: j */
        public static boolean m56599j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @DoNotInline
        /* renamed from: k */
        public static boolean m56598k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @DoNotInline
        /* renamed from: l */
        public static AccessibilityWindowInfo m56597l() {
            return AccessibilityWindowInfo.obtain();
        }

        @DoNotInline
        /* renamed from: m */
        public static AccessibilityWindowInfo m56596m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityWindowInfoCompat$b */
    /* loaded from: classes2.dex */
    public static class C4199b {
        @DoNotInline
        /* renamed from: a */
        public static AccessibilityNodeInfo m56595a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @DoNotInline
        /* renamed from: b */
        public static CharSequence m56594b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityWindowInfoCompat$c */
    /* loaded from: classes2.dex */
    public static class C4200c {
        @DoNotInline
        /* renamed from: a */
        public static int m56593a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m56592b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m56591c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    public AccessibilityWindowInfoCompat(Object obj) {
        this.f34330a = obj;
    }

    /* renamed from: a */
    public static String m56610a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "<UNKNOWN>";
                    }
                    return "TYPE_ACCESSIBILITY_OVERLAY";
                }
                return "TYPE_SYSTEM";
            }
            return "TYPE_INPUT_METHOD";
        }
        return "TYPE_APPLICATION";
    }

    /* renamed from: b */
    public static AccessibilityWindowInfoCompat m56609b(Object obj) {
        if (obj != null) {
            return new AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    @Nullable
    public static AccessibilityWindowInfoCompat obtain() {
        return m56609b(C4198a.m56597l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (AccessibilityWindowInfoCompat) obj;
        Object obj2 = this.f34330a;
        if (obj2 == null) {
            if (accessibilityWindowInfoCompat.f34330a == null) {
                return true;
            }
            return false;
        }
        return obj2.equals(accessibilityWindowInfoCompat.f34330a);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getAnchor() {
        if (Build.VERSION.SDK_INT >= 24) {
            return AccessibilityNodeInfoCompat.m56620l(C4199b.m56595a((AccessibilityWindowInfo) this.f34330a));
        }
        return null;
    }

    public void getBoundsInScreen(@NonNull Rect rect) {
        C4198a.m56608a((AccessibilityWindowInfo) this.f34330a, rect);
    }

    @Nullable
    public AccessibilityWindowInfoCompat getChild(int i) {
        return m56609b(C4198a.m56607b((AccessibilityWindowInfo) this.f34330a, i));
    }

    public int getChildCount() {
        return C4198a.m56606c((AccessibilityWindowInfo) this.f34330a);
    }

    public int getDisplayId() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C4200c.m56593a((AccessibilityWindowInfo) this.f34330a);
        }
        return 0;
    }

    public int getId() {
        return C4198a.m56605d((AccessibilityWindowInfo) this.f34330a);
    }

    public int getLayer() {
        return C4198a.m56604e((AccessibilityWindowInfo) this.f34330a);
    }

    @Nullable
    public AccessibilityWindowInfoCompat getParent() {
        return m56609b(C4198a.m56603f((AccessibilityWindowInfo) this.f34330a));
    }

    public void getRegionInScreen(@NonNull Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            C4200c.m56592b((AccessibilityWindowInfo) this.f34330a, region);
            return;
        }
        Rect rect = new Rect();
        C4198a.m56608a((AccessibilityWindowInfo) this.f34330a, rect);
        region.set(rect);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getRoot() {
        return AccessibilityNodeInfoCompat.m56620l(C4198a.m56602g((AccessibilityWindowInfo) this.f34330a));
    }

    @Nullable
    public CharSequence getTitle() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4199b.m56594b((AccessibilityWindowInfo) this.f34330a);
        }
        return null;
    }

    public int getType() {
        return C4198a.m56601h((AccessibilityWindowInfo) this.f34330a);
    }

    public int hashCode() {
        Object obj = this.f34330a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return C4198a.m56600i((AccessibilityWindowInfo) this.f34330a);
    }

    public boolean isActive() {
        return C4198a.m56599j((AccessibilityWindowInfo) this.f34330a);
    }

    public boolean isFocused() {
        return C4198a.m56598k((AccessibilityWindowInfo) this.f34330a);
    }

    public boolean isInPictureInPictureMode() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C4200c.m56591c((AccessibilityWindowInfo) this.f34330a);
        }
        return false;
    }

    @Deprecated
    public void recycle() {
    }

    @NonNull
    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        getBoundsInScreen(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(getId());
        sb.append(", type=");
        sb.append(m56610a(getType()));
        sb.append(", layer=");
        sb.append(getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(isFocused());
        sb.append(", active=");
        sb.append(isActive());
        sb.append(", hasParent=");
        boolean z2 = false;
        if (getParent() != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", hasChildren=");
        if (getChildCount() > 0) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Nullable
    public AccessibilityWindowInfo unwrap() {
        return (AccessibilityWindowInfo) this.f34330a;
    }

    @Nullable
    public static AccessibilityWindowInfoCompat obtain(@Nullable AccessibilityWindowInfoCompat accessibilityWindowInfoCompat) {
        if (accessibilityWindowInfoCompat == null) {
            return null;
        }
        return m56609b(C4198a.m56596m((AccessibilityWindowInfo) accessibilityWindowInfoCompat.f34330a));
    }
}
