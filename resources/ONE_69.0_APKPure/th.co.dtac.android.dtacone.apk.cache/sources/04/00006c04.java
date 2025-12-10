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
    public final Object f34418a;

    /* renamed from: androidx.core.view.accessibility.AccessibilityWindowInfoCompat$a */
    /* loaded from: classes2.dex */
    public static class C4180a {
        @DoNotInline
        /* renamed from: a */
        public static void m56558a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @DoNotInline
        /* renamed from: b */
        public static AccessibilityWindowInfo m56557b(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        @DoNotInline
        /* renamed from: c */
        public static int m56556c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m56555d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m56554e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @DoNotInline
        /* renamed from: f */
        public static AccessibilityWindowInfo m56553f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @DoNotInline
        /* renamed from: g */
        public static AccessibilityNodeInfo m56552g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @DoNotInline
        /* renamed from: h */
        public static int m56551h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @DoNotInline
        /* renamed from: i */
        public static boolean m56550i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @DoNotInline
        /* renamed from: j */
        public static boolean m56549j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @DoNotInline
        /* renamed from: k */
        public static boolean m56548k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @DoNotInline
        /* renamed from: l */
        public static AccessibilityWindowInfo m56547l() {
            return AccessibilityWindowInfo.obtain();
        }

        @DoNotInline
        /* renamed from: m */
        public static AccessibilityWindowInfo m56546m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityWindowInfoCompat$b */
    /* loaded from: classes2.dex */
    public static class C4181b {
        @DoNotInline
        /* renamed from: a */
        public static AccessibilityNodeInfo m56545a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @DoNotInline
        /* renamed from: b */
        public static CharSequence m56544b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityWindowInfoCompat$c */
    /* loaded from: classes2.dex */
    public static class C4182c {
        @DoNotInline
        /* renamed from: a */
        public static int m56543a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m56542b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m56541c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    public AccessibilityWindowInfoCompat(Object obj) {
        this.f34418a = obj;
    }

    /* renamed from: a */
    public static String m56560a(int i) {
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
    public static AccessibilityWindowInfoCompat m56559b(Object obj) {
        if (obj != null) {
            return new AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    @Nullable
    public static AccessibilityWindowInfoCompat obtain() {
        return m56559b(C4180a.m56547l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (AccessibilityWindowInfoCompat) obj;
        Object obj2 = this.f34418a;
        if (obj2 == null) {
            if (accessibilityWindowInfoCompat.f34418a == null) {
                return true;
            }
            return false;
        }
        return obj2.equals(accessibilityWindowInfoCompat.f34418a);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getAnchor() {
        if (Build.VERSION.SDK_INT >= 24) {
            return AccessibilityNodeInfoCompat.m56570l(C4181b.m56545a((AccessibilityWindowInfo) this.f34418a));
        }
        return null;
    }

    public void getBoundsInScreen(@NonNull Rect rect) {
        C4180a.m56558a((AccessibilityWindowInfo) this.f34418a, rect);
    }

    @Nullable
    public AccessibilityWindowInfoCompat getChild(int i) {
        return m56559b(C4180a.m56557b((AccessibilityWindowInfo) this.f34418a, i));
    }

    public int getChildCount() {
        return C4180a.m56556c((AccessibilityWindowInfo) this.f34418a);
    }

    public int getDisplayId() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C4182c.m56543a((AccessibilityWindowInfo) this.f34418a);
        }
        return 0;
    }

    public int getId() {
        return C4180a.m56555d((AccessibilityWindowInfo) this.f34418a);
    }

    public int getLayer() {
        return C4180a.m56554e((AccessibilityWindowInfo) this.f34418a);
    }

    @Nullable
    public AccessibilityWindowInfoCompat getParent() {
        return m56559b(C4180a.m56553f((AccessibilityWindowInfo) this.f34418a));
    }

    public void getRegionInScreen(@NonNull Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            C4182c.m56542b((AccessibilityWindowInfo) this.f34418a, region);
            return;
        }
        Rect rect = new Rect();
        C4180a.m56558a((AccessibilityWindowInfo) this.f34418a, rect);
        region.set(rect);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getRoot() {
        return AccessibilityNodeInfoCompat.m56570l(C4180a.m56552g((AccessibilityWindowInfo) this.f34418a));
    }

    @Nullable
    public CharSequence getTitle() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4181b.m56544b((AccessibilityWindowInfo) this.f34418a);
        }
        return null;
    }

    public int getType() {
        return C4180a.m56551h((AccessibilityWindowInfo) this.f34418a);
    }

    public int hashCode() {
        Object obj = this.f34418a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return C4180a.m56550i((AccessibilityWindowInfo) this.f34418a);
    }

    public boolean isActive() {
        return C4180a.m56549j((AccessibilityWindowInfo) this.f34418a);
    }

    public boolean isFocused() {
        return C4180a.m56548k((AccessibilityWindowInfo) this.f34418a);
    }

    public boolean isInPictureInPictureMode() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C4182c.m56541c((AccessibilityWindowInfo) this.f34418a);
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
        sb.append(m56560a(getType()));
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
        return (AccessibilityWindowInfo) this.f34418a;
    }

    @Nullable
    public static AccessibilityWindowInfoCompat obtain(@Nullable AccessibilityWindowInfoCompat accessibilityWindowInfoCompat) {
        if (accessibilityWindowInfoCompat == null) {
            return null;
        }
        return m56559b(C4180a.m56546m((AccessibilityWindowInfo) accessibilityWindowInfoCompat.f34418a));
    }
}