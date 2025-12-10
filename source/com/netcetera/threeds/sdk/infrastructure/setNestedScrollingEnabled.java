package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setSelected;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setNestedScrollingEnabled implements setSelected {
    public static long ThreeDS2Service = 0;
    private static final setPaddingRelative get;
    private static int getSDKVersion = 0;
    private static int getWarnings = 1;
    public static char[] values;
    private final InterfaceC9652ns ThreeDS2ServiceInstance = C9653nt.ThreeDS2ServiceInstance(setNestedScrollingEnabled.class);
    private final setActivated valueOf;

    static {
        ThreeDS2Service();
        get = new setScrollCaptureHint();
        int i = getSDKVersion + 95;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            int i2 = 53 / 0;
        }
    }

    public setNestedScrollingEnabled(setActivated setactivated) {
        this.valueOf = setactivated;
    }

    public static void ThreeDS2Service() {
        values = new char[]{Matrix.MATRIX_TYPE_RANDOM_UT, 29793, 59515, 23637, 53324, 17454, 47161, 11293, 40989, 5347, 34998, 64707, 28885, 58551, 22707, 52365, 16592, 46234, 10620, 40303, 4419, 34121, 63846, 28025, 57619, 21770, 14280, 17404, 57318, 27592, 59345, 29619, 36772, 7040, 38784, 9086, 48939, 52062, 18248, 54058, 28462, 64272, 30541, 33543, 7905, 43762, 9950, 45780, 'O', 29821, 59511, 23626, 53333, 17445, 47163, 11269, 41048, 5348, 35063, 64720, 28871, 58534, 22782, 52417, 16523, 46210, 'O', 29821, 59511, 23626, 53333, 17445, 47163, 11269, 41048, 5348, 35063, 64720, 28871, 58534};
        ThreeDS2Service = 8057102380966179855L;
    }

    private void ThreeDS2ServiceInstance(Runnable runnable, Throwable th2) {
        int i = getSDKVersion + 117;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            if (runnable != null) {
                try {
                    runnable.run();
                    getWarnings = (getSDKVersion + 81) % 128;
                } catch (setId e) {
                    valueOf(th2);
                    String str = get.get(e);
                    InterfaceC9652ns interfaceC9652ns = this.ThreeDS2ServiceInstance;
                    Object[] objArr = new Object[1];
                    get((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Process.myPid() >> 22, ExpandableListView.getPackedPositionGroup(0L) + 26, objArr);
                    interfaceC9652ns.valueOf(((String) objArr[0]).intern(), str, e.getCause());
                    Object[] objArr2 = new Object[1];
                    get((char) (14236 - ImageFormat.getBitsPerPixel(0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26, 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
                    throw new RuntimeException(((String) objArr2[0]).intern(), e.getCause());
                } catch (RuntimeException e2) {
                    valueOf(th2);
                    InterfaceC9652ns interfaceC9652ns2 = this.ThreeDS2ServiceInstance;
                    Object[] objArr3 = new Object[1];
                    get((char) (14285 - AndroidCharacter.getMirror('0')), 26 - ExpandableListView.getPackedPositionType(0L), 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                    interfaceC9652ns2.valueOf(((String) objArr3[0]).intern(), e2);
                    throw e2;
                }
            }
            int i2 = getWarnings + 89;
            getSDKVersion = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            throw null;
        }
        throw null;
    }

    public static setSelected get(setShowSoftInputOnFocus setshowsoftinputonfocus) {
        setNestedScrollingEnabled setnestedscrollingenabled = new setNestedScrollingEnabled(new setTransitionName(setshowsoftinputonfocus, new setOnCapturedPointerListener(get)));
        int i = getWarnings + 85;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            return setnestedscrollingenabled;
        }
        throw null;
    }

    public static setSelected valueOf() {
        setNestedScrollingEnabled setnestedscrollingenabled = new setNestedScrollingEnabled(new setScrollCaptureCallback(get));
        int i = getSDKVersion + 99;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            return setnestedscrollingenabled;
        }
        throw null;
    }

    public static setSelected values() {
        setNestedScrollingEnabled setnestedscrollingenabled = new setNestedScrollingEnabled(new setAnimation(get));
        getSDKVersion = (getWarnings + 37) % 128;
        return setnestedscrollingenabled;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected
    public void ThreeDS2Service(setSelected.ThreeDS2Service threeDS2Service) {
        getSDKVersion = (getWarnings + 117) % 128;
        ThreeDS2Service(threeDS2Service, null);
        int i = getWarnings + 83;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
    }

    private static void get(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((values[i + i3] ^ (i3 * ThreeDS2Service)) ^ c);
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

    public static setSelected valueOf(com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver challengeStatusReceiver) {
        setNestedScrollingEnabled setnestedscrollingenabled = new setNestedScrollingEnabled(new setMinimumWidth(challengeStatusReceiver, new setOnCapturedPointerListener(get)));
        getSDKVersion = (getWarnings + 9) % 128;
        return setnestedscrollingenabled;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected
    public void ThreeDS2Service(setSelected.ThreeDS2Service threeDS2Service, Runnable runnable) {
        getWarnings = (getSDKVersion + CameraActivity.REQUEST_CODE) % 128;
        try {
            threeDS2Service.values();
            getSDKVersion = (getWarnings + 107) % 128;
        } catch (setId e) {
            ThreeDS2ServiceInstance(runnable, e);
            this.valueOf.ThreeDS2Service(e);
        } catch (Throwable th2) {
            ThreeDS2ServiceInstance(runnable, th2);
            this.valueOf.ThreeDS2Service(th2);
        }
    }

    public <T> T values(setSelected.valueOf<T> valueof, Runnable runnable) {
        int i = getSDKVersion + 93;
        getWarnings = i % 128;
        try {
            try {
                if (i % 2 != 0) {
                    return valueof.ThreeDS2ServiceInstance();
                }
                valueof.ThreeDS2ServiceInstance();
                throw null;
            } catch (setId e) {
                ThreeDS2ServiceInstance(runnable, e);
                this.valueOf.ThreeDS2Service(e);
                return null;
            }
        } catch (Throwable th2) {
            ThreeDS2ServiceInstance(runnable, th2);
            this.valueOf.ThreeDS2Service(th2);
            return null;
        }
    }

    private void valueOf(Throwable th2) {
        int i = getWarnings + 119;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            if (th2 instanceof setId) {
                String str = get.get((setId) th2);
                InterfaceC9652ns interfaceC9652ns = this.ThreeDS2ServiceInstance;
                Object[] objArr = new Object[1];
                get((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.argb(0, 0, 0, 0) + 48, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, objArr);
                interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), str, th2.getCause());
                return;
            }
            InterfaceC9652ns interfaceC9652ns2 = this.ThreeDS2ServiceInstance;
            Object[] objArr2 = new Object[1];
            get((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 66 - (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") + 15, objArr2);
            interfaceC9652ns2.ThreeDS2Service(((String) objArr2[0]).intern(), th2);
            getSDKVersion = (getWarnings + 41) % 128;
            return;
        }
        boolean z = th2 instanceof setId;
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected
    public <T> T ThreeDS2Service(setSelected.valueOf<T> valueof) {
        int i = getSDKVersion + 101;
        getWarnings = i % 128;
        int i2 = i % 2;
        T t = (T) values(valueof, null);
        if (i2 == 0) {
            int i3 = 42 / 0;
        }
        getSDKVersion = (getWarnings + 17) % 128;
        return t;
    }
}
