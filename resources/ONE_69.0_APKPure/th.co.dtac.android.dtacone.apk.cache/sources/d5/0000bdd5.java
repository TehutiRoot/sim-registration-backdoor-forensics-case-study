package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setAutoSizeTextTypeUniformWithConfiguration implements setMin {
    private static int cleanup = 1;
    public static long get = -5966534035073634899L;
    private static int initialize;
    public static char[] valueOf = {59156, 35461, 15464, 44578, 20885, 49989, 30062, 6302, 35408, 15414, 45031, 20831, 49960, 30432, 6233, 35341, 15792, 44882, 20745, 50420, 30385, 6147, 35820, 15790, 44828, 21125, 50358, 30218, 6622, 35760, 15720, 41172, 21184, 50297, 30664, 6534, 35706, 15666, 41103, 21112, 50236, 30620, 6477, 35617, 16092, 41029, 21049, 50660, 30551, 6452, 36068, 15952};
    private final setMin ThreeDS2Service;
    private final Logger ThreeDS2ServiceInstance = LoggerFactory.getLogger(setAutoSizeTextTypeUniformWithConfiguration.class);
    private final ExecutorService values;

    public setAutoSizeTextTypeUniformWithConfiguration(ExecutorService executorService, setMin setmin) {
        this.values = executorService;
        this.ThreeDS2Service = setmin;
    }

    public static setMin ThreeDS2Service(setMin setmin) {
        setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration = new setAutoSizeTextTypeUniformWithConfiguration(Executors.newSingleThreadExecutor(), setmin);
        int i = initialize + 1;
        cleanup = i % 128;
        if (i % 2 == 0) {
            int i2 = 33 / 0;
        }
        return setautosizetexttypeuniformwithconfiguration;
    }

    public static /* synthetic */ Void ThreeDS2ServiceInstance(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration, setScrollingCacheEnabled setscrollingcacheenabled, String str) {
        initialize = (cleanup + 95) % 128;
        Void valueOf2 = setautosizetexttypeuniformwithconfiguration.valueOf(setscrollingcacheenabled, str);
        int i = cleanup + 67;
        initialize = i % 128;
        if (i % 2 == 0) {
            return valueOf2;
        }
        throw null;
    }

    public static /* synthetic */ Void valueOf(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        initialize = (cleanup + 101) % 128;
        Void values = setautosizetexttypeuniformwithconfiguration.values();
        initialize = (cleanup + 107) % 128;
        return values;
    }

    public static /* synthetic */ Void values(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration, setScrollingCacheEnabled setscrollingcacheenabled, String str, String str2, String str3, String str4) {
        int i = cleanup + 9;
        initialize = i % 128;
        if (i % 2 == 0) {
            return setautosizetexttypeuniformwithconfiguration.ThreeDS2ServiceInstance(setscrollingcacheenabled, str, str2, str3, str4);
        }
        setautosizetexttypeuniformwithconfiguration.ThreeDS2ServiceInstance(setscrollingcacheenabled, str, str2, str3, str4);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMin
    public void get(setScrollingCacheEnabled setscrollingcacheenabled, String str) {
        try {
            this.values.submit(new setAutoSizeTextTypeUniformWithPresetSizes(this, setscrollingcacheenabled, str));
            cleanup = (initialize + 43) % 128;
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 59200), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 52, objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
    }

    private /* synthetic */ Void ThreeDS2ServiceInstance(setScrollingCacheEnabled setscrollingcacheenabled, String str, String str2, String str3, String str4) throws Exception {
        int i = initialize + 83;
        cleanup = i % 128;
        if (i % 2 != 0) {
            this.ThreeDS2Service.get(setscrollingcacheenabled, str, str2, str3, str4);
            return null;
        }
        this.ThreeDS2Service.get(setscrollingcacheenabled, str, str2, str3, str4);
        throw null;
    }

    private /* synthetic */ Void valueOf(setScrollingCacheEnabled setscrollingcacheenabled, String str) throws Exception {
        initialize = (cleanup + 21) % 128;
        this.ThreeDS2Service.get(setscrollingcacheenabled, str);
        int i = initialize + CameraActivity.REQUEST_CODE;
        cleanup = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    private /* synthetic */ Void values() throws Exception {
        initialize = (cleanup + 107) % 128;
        this.ThreeDS2Service.ThreeDS2ServiceInstance();
        cleanup = (initialize + 95) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMin
    public void get(setScrollingCacheEnabled setscrollingcacheenabled, String str, String str2, String str3, String str4) {
        try {
            this.values.submit(new setAutoSizeTextTypeWithDefaults(this, setscrollingcacheenabled, str, str2, str3, str4));
            cleanup = (initialize + 79) % 128;
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance((char) (View.MeasureSpec.getMode(0) + 59200), ViewConfiguration.getWindowTouchSlop() >> 8, TextUtils.indexOf("", "", 0) + 52, objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMin
    public void ThreeDS2ServiceInstance() {
        try {
            this.values.submit(new setSmoothScrollingEnabled(this));
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance((char) (59200 - Color.argb(0, 0, 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, View.MeasureSpec.getMode(0) + 52, objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
        this.values.shutdown();
        int i = initialize + CameraActivity.REQUEST_CODE;
        cleanup = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void ThreeDS2ServiceInstance(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((valueOf[i + i3] ^ (i3 * get)) ^ c);
                        ConfigParameters.ThreeDS2Service = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }
}