package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class HardwareConfigState {
    public static final boolean BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED;
    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean HARDWARE_BITMAPS_SUPPORTED;
    @Deprecated
    public static final int NO_MAX_FD_COUNT = -1;

    /* renamed from: e */
    public static final File f42337e;

    /* renamed from: f */
    public static volatile HardwareConfigState f42338f;

    /* renamed from: b */
    public int f42340b;

    /* renamed from: c */
    public boolean f42341c = true;

    /* renamed from: d */
    public final AtomicBoolean f42342d = new AtomicBoolean(false);

    /* renamed from: a */
    public final int f42339a = 20000;

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i < 29) {
            z = true;
        } else {
            z = false;
        }
        BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = z;
        if (i >= 28) {
            z2 = true;
        }
        HARDWARE_BITMAPS_SUPPORTED = z2;
        f42337e = new File("/proc/self/fd");
    }

    /* renamed from: d */
    public static boolean m50207d() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        for (String str : Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static HardwareConfigState getInstance() {
        if (f42338f == null) {
            synchronized (HardwareConfigState.class) {
                try {
                    if (f42338f == null) {
                        f42338f = new HardwareConfigState();
                    }
                } finally {
                }
            }
        }
        return f42338f;
    }

    /* renamed from: a */
    public final boolean m50210a() {
        if (BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED && !this.f42342d.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m50209b() {
        if (m50207d()) {
            return 500;
        }
        return this.f42339a;
    }

    public void blockHardwareBitmaps() {
        Util.assertMainThread();
        this.f42342d.set(false);
    }

    /* renamed from: c */
    public final synchronized boolean m50208c() {
        try {
            boolean z = true;
            int i = this.f42340b + 1;
            this.f42340b = i;
            if (i >= 50) {
                this.f42340b = 0;
                int length = f42337e.list().length;
                long m50209b = m50209b();
                if (length >= m50209b) {
                    z = false;
                }
                this.f42341c = z;
                if (!z && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + m50209b);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f42341c;
    }

    /* renamed from: e */
    public boolean m50206e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        Bitmap.Config config;
        boolean isHardwareConfigAllowed = isHardwareConfigAllowed(i, i2, z, z2);
        if (isHardwareConfigAllowed) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return isHardwareConfigAllowed;
    }

    public boolean isHardwareConfigAllowed(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (!HARDWARE_BITMAPS_SUPPORTED) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (m50210a()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (z2) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (i >= 0 && i2 >= 0) {
            if (!m50208c()) {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            }
            return true;
        } else {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
    }

    public void unblockHardwareBitmaps() {
        Util.assertMainThread();
        this.f42342d.set(true);
    }
}
