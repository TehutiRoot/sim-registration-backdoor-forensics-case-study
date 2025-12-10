package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final class DisplayCompat {

    /* renamed from: androidx.core.view.DisplayCompat$a */
    /* loaded from: classes2.dex */
    public static class C4104a {
        /* renamed from: a */
        public static void m57025a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    /* renamed from: androidx.core.view.DisplayCompat$b */
    /* loaded from: classes2.dex */
    public static class C4105b {
        /* renamed from: a */
        public static ModeCompat m57024a(Context context, Display display) {
            Display.Mode mode = display.getMode();
            Point m57035a = DisplayCompat.m57035a(context, display);
            if (m57035a != null && !m57021d(mode, m57035a)) {
                return new ModeCompat(mode, m57035a);
            }
            return new ModeCompat(mode, true);
        }

        /* renamed from: b */
        public static ModeCompat[] m57023b(Context context, Display display) {
            ModeCompat modeCompat;
            Display.Mode[] supportedModes = display.getSupportedModes();
            ModeCompat[] modeCompatArr = new ModeCompat[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point m57035a = DisplayCompat.m57035a(context, display);
            if (m57035a != null && !m57021d(mode, m57035a)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    if (m57020e(supportedModes[i], mode)) {
                        modeCompat = new ModeCompat(supportedModes[i], m57035a);
                    } else {
                        modeCompat = new ModeCompat(supportedModes[i], false);
                    }
                    modeCompatArr[i] = modeCompat;
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    modeCompatArr[i2] = new ModeCompat(supportedModes[i2], m57020e(supportedModes[i2], mode));
                }
            }
            return modeCompatArr;
        }

        /* renamed from: c */
        public static boolean m57022c(Display display) {
            Display.Mode[] supportedModes;
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public static boolean m57021d(Display.Mode mode, Point point) {
            if ((mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public static boolean m57020e(Display.Mode mode, Display.Mode mode2) {
            if (mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static Point m57035a(Context context, Display display) {
        Point m57028h;
        if (Build.VERSION.SDK_INT < 28) {
            m57028h = m57028h("sys.display-size", display);
        } else {
            m57028h = m57028h("vendor.display-size", display);
        }
        if (m57028h != null) {
            return m57028h;
        }
        if (!m57031e(context) || !m57032d(display)) {
            return null;
        }
        return new Point(3840, 2160);
    }

    /* renamed from: b */
    public static Point m57034b(Context context, Display display) {
        Point m57035a = m57035a(context, display);
        if (m57035a != null) {
            return m57035a;
        }
        Point point = new Point();
        C4104a.m57025a(display, point);
        return point;
    }

    /* renamed from: c */
    public static String m57033c(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m57032d(Display display) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4105b.m57022c(display);
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m57031e(Context context) {
        if (m57030f(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m57030f(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static Point m57029g(String str) {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    @NonNull
    public static ModeCompat getMode(@NonNull Context context, @NonNull Display display) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4105b.m57024a(context, display);
        }
        return new ModeCompat(m57034b(context, display));
    }

    @NonNull
    @SuppressLint({"ArrayReturn"})
    public static ModeCompat[] getSupportedModes(@NonNull Context context, @NonNull Display display) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4105b.m57023b(context, display);
        }
        return new ModeCompat[]{getMode(context, display)};
    }

    /* renamed from: h */
    public static Point m57028h(String str, Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String m57033c = m57033c(str);
        if (!TextUtils.isEmpty(m57033c) && m57033c != null) {
            try {
                return m57029g(m57033c);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* loaded from: classes2.dex */
    public static final class ModeCompat {

        /* renamed from: a */
        public final Display.Mode f34148a;

        /* renamed from: b */
        public final Point f34149b;

        /* renamed from: c */
        public final boolean f34150c;

        /* renamed from: androidx.core.view.DisplayCompat$ModeCompat$a */
        /* loaded from: classes2.dex */
        public static class C4103a {
            @DoNotInline
            /* renamed from: a */
            public static int m57027a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @DoNotInline
            /* renamed from: b */
            public static int m57026b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public ModeCompat(Point point) {
            Preconditions.checkNotNull(point, "physicalSize == null");
            this.f34149b = point;
            this.f34148a = null;
            this.f34150c = true;
        }

        public int getPhysicalHeight() {
            return this.f34149b.y;
        }

        public int getPhysicalWidth() {
            return this.f34149b.x;
        }

        @Deprecated
        public boolean isNative() {
            return this.f34150c;
        }

        @Nullable
        @RequiresApi(23)
        public Display.Mode toMode() {
            return this.f34148a;
        }

        public ModeCompat(Display.Mode mode, boolean z) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            this.f34149b = new Point(C4103a.m57026b(mode), C4103a.m57027a(mode));
            this.f34148a = mode;
            this.f34150c = z;
        }

        public ModeCompat(Display.Mode mode, Point point) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            Preconditions.checkNotNull(point, "physicalSize == null");
            this.f34149b = point;
            this.f34148a = mode;
            this.f34150c = true;
        }
    }
}
