package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public class setWebViewClient implements setTransitionGroup {
    public static char[] ThreeDS2ServiceInstance = {18043, 21324, 27684, 30991, 4809, 12255, 14524, 54656, 61298, 63596, 38183, 44560, 48119, 21700, 24993, 31362, 5194, 8540, 14891, 55054, 57593, 64974, 38570, 45799, 42960, 39096, 36243, 58963, 56153, 52275, 8479, 7152, 3288, 25008, 23192, 20349, 41067, 38207, 36362, 57585, 54720, 52917, 9107};
    private static int cleanup = 1;
    public static long get = 1061179950560318753L;
    private static int initialize;
    private final Executor ThreeDS2Service;
    private final Executor valueOf;
    private final setTransitionGroup values;

    /* loaded from: classes5.dex */
    public static class ThreeDS2ServiceInstance implements setTouchscreenBlocksFocus {
        private static int ThreeDS2Service = 1;
        private static int ThreeDS2ServiceInstance;
        private final Executor get;
        private final setTouchscreenBlocksFocus values;

        public ThreeDS2ServiceInstance(Executor executor, setTouchscreenBlocksFocus settouchscreenblocksfocus) {
            this.get = executor;
            this.values = settouchscreenblocksfocus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void initialize(setId setid) {
            int i = ThreeDS2Service;
            int i2 = i & 95;
            ThreeDS2ServiceInstance = (i2 + ((i ^ 95) | i2)) % 128;
            this.values.values(setid);
            int i3 = ThreeDS2ServiceInstance;
            int i4 = i3 & 107;
            int i5 = ((i3 ^ 107) | i4) << 1;
            int i6 = -((i3 | 107) & (~i4));
            int i7 = (i5 & i6) + (i6 | i5);
            ThreeDS2Service = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            throw null;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
        public void ThreeDS2Service(setId setid) {
            this.get.execute(new setAdapter(this, setid));
            int i = ThreeDS2ServiceInstance + 47;
            ThreeDS2Service = i % 128;
            if (i % 2 != 0) {
                return;
            }
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void get(setAllCaps setallcaps) {
            int i = ThreeDS2ServiceInstance + 71;
            ThreeDS2Service = i % 128;
            if (i % 2 != 0) {
                this.values.ThreeDS2ServiceInstance(setallcaps);
            } else {
                this.values.ThreeDS2ServiceInstance(setallcaps);
                throw null;
            }
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
        public void ThreeDS2ServiceInstance(setAllCaps setallcaps) {
            this.get.execute(new setDataDirectorySuffix(this, setallcaps));
            ThreeDS2ServiceInstance = (ThreeDS2Service + 91) % 128;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
        public void valueOf(setCustomInsertionActionModeCallback setcustominsertionactionmodecallback) {
            this.get.execute(new setWebContentsDebuggingEnabled(this, setcustominsertionactionmodecallback));
            ThreeDS2ServiceInstance = (ThreeDS2Service + 61) % 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ThreeDS2ServiceInstance(setPopupTheme setpopuptheme) {
            int i = ThreeDS2ServiceInstance + 93;
            ThreeDS2Service = i % 128;
            if (i % 2 != 0) {
                this.values.get(setpopuptheme);
            } else {
                this.values.get(setpopuptheme);
                throw null;
            }
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
        public void get(setPopupTheme setpopuptheme) {
            this.get.execute(new setWebChromeClient(this, setpopuptheme));
            int i = ThreeDS2Service;
            int i2 = i & 101;
            int i3 = -(-((i ^ 101) | i2));
            ThreeDS2ServiceInstance = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
        public void valueOf(setId setid) {
            this.get.execute(new setChoiceMode(this, setid));
            int i = ThreeDS2ServiceInstance;
            int i2 = i & 49;
            int i3 = (i ^ 49) | i2;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            ThreeDS2Service = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ThreeDS2ServiceInstance(setId setid) {
            int i = ThreeDS2ServiceInstance;
            int i2 = i & 91;
            int i3 = (i ^ 91) | i2;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            ThreeDS2Service = i4 % 128;
            int i5 = i4 % 2;
            this.values.ThreeDS2Service(setid);
            if (i5 == 0) {
                int i6 = 77 / 0;
            }
            int i7 = ThreeDS2ServiceInstance;
            int i8 = (i7 & 121) + (i7 | 121);
            ThreeDS2Service = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void get(setId setid) {
            int i = ThreeDS2Service;
            ThreeDS2ServiceInstance = ((((i & (-2)) | ((~i) & 1)) - (~((i & 1) << 1))) - 1) % 128;
            this.values.valueOf(setid);
            ThreeDS2Service = (ThreeDS2ServiceInstance + 117) % 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void values(setCustomInsertionActionModeCallback setcustominsertionactionmodecallback) {
            int i = ThreeDS2Service;
            ThreeDS2ServiceInstance = ((((i | 112) << 1) - (i ^ 112)) - 1) % 128;
            this.values.valueOf(setcustominsertionactionmodecallback);
            int i2 = ThreeDS2ServiceInstance;
            int i3 = i2 ^ 111;
            ThreeDS2Service = (((((i2 & 111) | i3) << 1) - (~(-i3))) - 1) % 128;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
        public void values(setId setid) {
            this.get.execute(new setTextClassifier(this, setid));
            int i = ThreeDS2ServiceInstance + 100;
            ThreeDS2Service = ((~i) + (i << 1)) % 128;
        }
    }

    /* loaded from: classes5.dex */
    public static class valueOf implements setMotionEventSplittingEnabled {
        private static int ThreeDS2ServiceInstance = 1;
        private static int get;
        private final setMotionEventSplittingEnabled ThreeDS2Service;
        private final Executor valueOf;

        public valueOf(Executor executor, setMotionEventSplittingEnabled setmotioneventsplittingenabled) {
            this.valueOf = executor;
            this.ThreeDS2Service = setmotioneventsplittingenabled;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ThreeDS2Service(setId setid) {
            int i = ThreeDS2ServiceInstance;
            int i2 = ((i | 75) << 1) - (i ^ 75);
            get = i2 % 128;
            int i3 = i2 % 2;
            this.ThreeDS2Service.valueOf(setid);
            if (i3 != 0) {
                int i4 = 93 / 0;
            }
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setMotionEventSplittingEnabled
        public void values() {
            Executor executor = this.valueOf;
            setMotionEventSplittingEnabled setmotioneventsplittingenabled = this.ThreeDS2Service;
            Objects.requireNonNull(setmotioneventsplittingenabled);
            executor.execute(new setRendererPriorityPolicy(setmotioneventsplittingenabled));
            int i = get;
            int i2 = i ^ 99;
            int i3 = ((i & 99) | i2) << 1;
            int i4 = -i2;
            ThreeDS2ServiceInstance = ((i3 & i4) + (i3 | i4)) % 128;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setMotionEventSplittingEnabled
        public void valueOf(setId setid) {
            this.valueOf.execute(new setItemChecked(this, setid));
            int i = get;
            int i2 = ((i & 104) + (i | 104)) - 1;
            ThreeDS2ServiceInstance = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    public setWebViewClient(Executor executor, Executor executor2, setTransitionGroup settransitiongroup) {
        this.ThreeDS2Service = executor;
        this.valueOf = executor2;
        this.values = settransitiongroup;
    }

    public static setTransitionGroup ThreeDS2Service(setTransitionGroup settransitiongroup) {
        setWebViewClient setwebviewclient = new setWebViewClient(Executors.newSingleThreadExecutor(), setFastScrollAlwaysVisible.values(), settransitiongroup);
        int i = initialize + 89;
        cleanup = i % 128;
        if (i % 2 != 0) {
            return setwebviewclient;
        }
        throw null;
    }

    public static /* synthetic */ void get(setWebViewClient setwebviewclient, setLineSpacing setlinespacing, setTouchscreenBlocksFocus settouchscreenblocksfocus) {
        cleanup = (initialize + 1) % 128;
        setwebviewclient.ThreeDS2Service(setlinespacing, settouchscreenblocksfocus);
        cleanup = (initialize + 27) % 128;
    }

    public static /* synthetic */ void valueOf(setWebViewClient setwebviewclient, setCustomInsertionActionModeCallback setcustominsertionactionmodecallback, setMotionEventSplittingEnabled setmotioneventsplittingenabled) {
        cleanup = (initialize + 103) % 128;
        setwebviewclient.ThreeDS2ServiceInstance(setcustominsertionactionmodecallback, setmotioneventsplittingenabled);
        initialize = (cleanup + 23) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTransitionGroup
    public void ThreeDS2ServiceInstance(setLineSpacing setlinespacing, setTouchscreenBlocksFocus settouchscreenblocksfocus) {
        this.ThreeDS2Service.execute(new setPictureListener(this, setlinespacing, new ThreeDS2ServiceInstance(this.valueOf, settouchscreenblocksfocus)));
        int i = initialize + 33;
        cleanup = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTransitionGroup
    public void values(setCustomInsertionActionModeCallback setcustominsertionactionmodecallback, setMotionEventSplittingEnabled setmotioneventsplittingenabled) {
        this.ThreeDS2Service.execute(new setMapTrackballToArrowKeys(this, setcustominsertionactionmodecallback, new valueOf(this.valueOf, setmotioneventsplittingenabled)));
        initialize = (cleanup + 81) % 128;
    }

    private /* synthetic */ void ThreeDS2ServiceInstance(setCustomInsertionActionModeCallback setcustominsertionactionmodecallback, setMotionEventSplittingEnabled setmotioneventsplittingenabled) {
        initialize = (cleanup + 75) % 128;
        try {
            this.values.values(setcustominsertionactionmodecallback, setmotioneventsplittingenabled);
            cleanup = (initialize + 55) % 128;
        } catch (Throwable th2) {
            setForegroundGravity setforegroundgravity = setForegroundGravity.getSDKAppID;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 17928), TextUtils.indexOf("", "", 0, 0), 23 - Color.argb(0, 0, 0, 0), objArr);
            setmotioneventsplittingenabled.valueOf(setforegroundgravity.valueOf(((String) objArr[0]).intern(), th2));
        }
    }

    private /* synthetic */ void ThreeDS2Service(setLineSpacing setlinespacing, setTouchscreenBlocksFocus settouchscreenblocksfocus) {
        int i = initialize + 17;
        cleanup = i % 128;
        try {
            if (i % 2 != 0) {
                this.values.ThreeDS2ServiceInstance(setlinespacing, settouchscreenblocksfocus);
            } else {
                this.values.ThreeDS2ServiceInstance(setlinespacing, settouchscreenblocksfocus);
                throw null;
            }
        } catch (Throwable th2) {
            setForegroundGravity setforegroundgravity = setForegroundGravity.getSDKAppID;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance((char) (Process.getGidForName("") + 45717), ExpandableListView.getPackedPositionGroup(0L) + 23, 20 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            settouchscreenblocksfocus.valueOf(setforegroundgravity.valueOf(((String) objArr[0]).intern(), th2));
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
                        cArr[i3] = (char) ((ThreeDS2ServiceInstance[i + i3] ^ (i3 * get)) ^ c);
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
