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
    public static class C4086a {
        /* renamed from: a */
        public static void m56975a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    /* renamed from: androidx.core.view.DisplayCompat$b */
    /* loaded from: classes2.dex */
    public static class C4087b {
        /* renamed from: a */
        public static ModeCompat m56974a(Context context, Display display) {
            Display.Mode mode = display.getMode();
            Point m56985a = DisplayCompat.m56985a(context, display);
            if (m56985a != null && !m56971d(mode, m56985a)) {
                return new ModeCompat(mode, m56985a);
            }
            return new ModeCompat(mode, true);
        }

        /* renamed from: b */
        public static ModeCompat[] m56973b(Context context, Display display) {
            ModeCompat modeCompat;
            Display.Mode[] supportedModes = display.getSupportedModes();
            ModeCompat[] modeCompatArr = new ModeCompat[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point m56985a = DisplayCompat.m56985a(context, display);
            if (m56985a != null && !m56971d(mode, m56985a)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    if (m56970e(supportedModes[i], mode)) {
                        modeCompat = new ModeCompat(supportedModes[i], m56985a);
                    } else {
                        modeCompat = new ModeCompat(supportedModes[i], false);
                    }
                    modeCompatArr[i] = modeCompat;
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    modeCompatArr[i2] = new ModeCompat(supportedModes[i2], m56970e(supportedModes[i2], mode));
                }
            }
            return modeCompatArr;
        }

        /* renamed from: c */
        public static boolean m56972c(Display display) {
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
        public static boolean m56971d(Display.Mode mode, Point point) {
            if ((mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public static boolean m56970e(Display.Mode mode, Display.Mode mode2) {
            if (mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static Point m56985a(Context context, Display display) {
        Point m56978h;
        if (Build.VERSION.SDK_INT < 28) {
            m56978h = m56978h("sys.display-size", display);
        } else {
            m56978h = m56978h("vendor.display-size", display);
        }
        if (m56978h != null) {
            return m56978h;
        }
        if (!m56981e(context) || !m56982d(display)) {
            return null;
        }
        return new Point(3840, 2160);
    }

    /* renamed from: b */
    public static Point m56984b(Context context, Display display) {
        Point m56985a = m56985a(context, display);
        if (m56985a != null) {
            return m56985a;
        }
        Point point = new Point();
        C4086a.m56975a(display, point);
        return point;
    }

    /* renamed from: c */
    public static String m56983c(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m56982d(Display display) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4087b.m56972c(display);
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m56981e(Context context) {
        if (m56980f(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m56980f(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static Point m56979g(String str) {
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
            return C4087b.m56974a(context, display);
        }
        return new ModeCompat(m56984b(context, display));
    }

    @NonNull
    @SuppressLint({"ArrayReturn"})
    public static ModeCompat[] getSupportedModes(@NonNull Context context, @NonNull Display display) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4087b.m56973b(context, display);
        }
        return new ModeCompat[]{getMode(context, display)};
    }

    /* renamed from: h */
    public static Point m56978h(String str, Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String m56983c = m56983c(str);
        if (!TextUtils.isEmpty(m56983c) && m56983c != null) {
            try {
                return m56979g(m56983c);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* loaded from: classes2.dex */
    public static final class ModeCompat {

        /* renamed from: a */
        public final Display.Mode f34236a;

        /* renamed from: b */
        public final Point f34237b;

        /* renamed from: c */
        public final boolean f34238c;

        /* renamed from: androidx.core.view.DisplayCompat$ModeCompat$a */
        /* loaded from: classes2.dex */
        public static class C4085a {
            @DoNotInline
            /* renamed from: a */
            public static int m56977a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @DoNotInline
            /* renamed from: b */
            public static int m56976b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public ModeCompat(Point point) {
            Preconditions.checkNotNull(point, "physicalSize == null");
            this.f34237b = point;
            this.f34236a = null;
            this.f34238c = true;
        }

        public int getPhysicalHeight() {
            return this.f34237b.y;
        }

        public int getPhysicalWidth() {
            return this.f34237b.x;
        }

        @Deprecated
        public boolean isNative() {
            return this.f34238c;
        }

        @Nullable
        @RequiresApi(23)
        public Display.Mode toMode() {
            return this.f34236a;
        }

        public ModeCompat(Display.Mode mode, boolean z) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            this.f34237b = new Point(C4085a.m56976b(mode), C4085a.m56977a(mode));
            this.f34236a = mode;
            this.f34238c = z;
        }

        public ModeCompat(Display.Mode mode, Point point) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            Preconditions.checkNotNull(point, "physicalSize == null");
            this.f34237b = point;
            this.f34236a = mode;
            this.f34238c = true;
        }
    }
}