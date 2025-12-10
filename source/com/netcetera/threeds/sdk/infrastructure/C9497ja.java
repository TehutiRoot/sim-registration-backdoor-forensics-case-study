package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode;
import java.security.KeyPair;
import java.util.List;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ja */
/* loaded from: classes5.dex */
public class C9497ja {
    private static int getSDKVersion = 1;
    private static int getWarnings;
    private final Object ThreeDS2Service$6b3b71a8;
    private final setScrollingCacheEnabled ThreeDS2ServiceInstance;
    private final setTextFontSize get;
    private final Object valueOf$45ad9d1c;
    private final C9406gc values;

    public C9497ja(setScrollingCacheEnabled setscrollingcacheenabled, setTextFontSize settextfontsize, Object obj, Object obj2, C9406gc c9406gc) {
        this.ThreeDS2ServiceInstance = setscrollingcacheenabled;
        this.get = settextfontsize;
        this.valueOf$45ad9d1c = obj;
        this.ThreeDS2Service$6b3b71a8 = obj2;
        this.values = c9406gc;
    }

    public static C9497ja ThreeDS2ServiceInstance(setScrollingCacheEnabled setscrollingcacheenabled) {
        try {
            try {
                C9497ja c9497ja = new C9497ja(setscrollingcacheenabled, new setForegroundTintList(), ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(View.getDefaultSize(0, 0) + 521, (char) (Color.blue(0) + 30126), 48 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getDeclaredConstructor(null).newInstance(null), ((Class) get3DSServerTransactionID.ThreeDS2Service(MotionEvent.axisFromString("") + 583, 59 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2835))).getMethod("ThreeDS2ServiceInstance", null).invoke(null, null), new C9406gc());
                int i = getWarnings;
                int i2 = i & 53;
                int i3 = i | 53;
                getSDKVersion = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
                return c9497ja;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th3;
        }
    }

    public com.netcetera.threeds.sdk.api.transaction.Transaction get(getTextFontSize gettextfontsize, getTextFontName gettextfontname, ProtocolErrorEvent protocolErrorEvent, InterfaceC9515js interfaceC9515js, setFastScrollEnabled.valueOf valueof, String str, String str2, C9613nb c9613nb, setProgressTintBlendMode setprogresstintblendmode, setIndeterminateTintMode.ThreeDS2Service threeDS2Service) throws setId {
        try {
            try {
                setLetterSpacing setletterspacing = (setLetterSpacing) ((Class) get3DSServerTransactionID.ThreeDS2Service((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3204, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48, (char) (ViewConfiguration.getScrollBarSize() >> 8))).getDeclaredConstructor(setTextFontSize.class, getTextFontName.class, setLineBreakWordStyle.class, setScrollingCacheEnabled.class, String.class).newInstance(this.get, gettextfontname, ((Class) get3DSServerTransactionID.ThreeDS2Service((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3301, TextUtils.indexOf((CharSequence) "", '0') + 50, (char) Color.red(0))).getDeclaredConstructor(null).newInstance(null), this.ThreeDS2ServiceInstance, str);
                try {
                    Object newInstance = ((Class) get3DSServerTransactionID.ThreeDS2Service(132 - View.getDefaultSize(0, 0), 65 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (19685 - TextUtils.getOffsetAfter("", 0)))).getDeclaredConstructor(List.class).newInstance(protocolErrorEvent.get());
                    try {
                        KeyPair keyPair = (KeyPair) ((Class) get3DSServerTransactionID.ThreeDS2Service(TextUtils.getCapsMode("", 0, 0) + 582, 60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (2835 - ((Process.getThreadPriority(0) + 20) >> 6)))).getMethod(CoreConstants.VALUE_OF, String.class).invoke(this.ThreeDS2Service$6b3b71a8, str2);
                        setHyphenationFrequency sethyphenationfrequency = setHyphenationFrequency.get$15db9c0f(newInstance);
                        InterfaceC9401fy valueOf = this.values.valueOf(valueof);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        com.netcetera.threeds.sdk.api.transaction.Transaction transaction = (com.netcetera.threeds.sdk.api.transaction.Transaction) ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance((ViewConfiguration.getFadingEdgeLength() >> 16) + 569, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 69 - ImageFormat.getBitsPerPixel(0))).getMethod("getSDKInfo", null).invoke(((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance((ViewConfiguration.getTapTimeout() >> 16) + 569, (char) TextUtils.getCapsMode("", 0, 0), 71 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("get", null).invoke(((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(568 - Process.getGidForName(""), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.blue(0) + 70)).getMethod("values", null).invoke(((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(Color.alpha(0) + 569, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 71)).getMethod(CoreConstants.VALUE_OF, null).invoke(((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(569 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) View.resolveSizeAndState(0, 0, 0), 69 - Process.getGidForName(""))).getMethod("ThreeDS2ServiceInstance", setProgressTintBlendMode.class, setIndeterminateTintMode.ThreeDS2Service.class).invoke(((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(569 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 70 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("ThreeDS2ServiceInstance", null).invoke(((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(((Process.getThreadPriority(0) + 20) >> 6) + 569, (char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 71)).getMethod("ThreeDS2Service", null).invoke(((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance((ViewConfiguration.getTapTimeout() >> 16) + 521, (char) (30126 - Gravity.getAbsoluteGravity(0, 0)), 48 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod(CoreConstants.VALUE_OF, com.netcetera.threeds.sdk.api.transaction.Transaction.class).invoke(this.valueOf$45ad9d1c, new C9491iu(gettextfontsize, setletterspacing, str2, valueOf, keyPair, C9480ii.values(sethyphenationfrequency, keyPair, interfaceC9515js, str2, this.ThreeDS2ServiceInstance.valueOf(valueof), valueOf, threeDS2Service), C9502jf.ThreeDS2Service(protocolErrorEvent.ThreeDS2Service(), interfaceC9515js), new C9611na(), C9495iz.get(), c9613nb)), null), null), setprogresstintblendmode, threeDS2Service), null), null), null), null);
                                                        int i = getSDKVersion;
                                                        int i2 = ((i ^ 111) | (i & 111)) << 1;
                                                        int i3 = -(((~i) & 111) | (i & (-112)));
                                                        getWarnings = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
                                                        return transaction;
                                                    } catch (Throwable th2) {
                                                        Throwable cause = th2.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (Throwable th3) {
                                                    Throwable cause2 = th3.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (Throwable th4) {
                                                Throwable cause3 = th4.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th4;
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause4 = th5.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th5;
                                        }
                                    } catch (Throwable th6) {
                                        Throwable cause5 = th6.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th6;
                                    }
                                } catch (Throwable th7) {
                                    Throwable cause6 = th7.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th8) {
                                Throwable cause7 = th8.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th8;
                            }
                        } catch (Throwable th9) {
                            Throwable cause8 = th9.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th9;
                        }
                    } catch (Throwable th10) {
                        Throwable cause9 = th10.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th10;
                    }
                } catch (Throwable th11) {
                    Throwable cause10 = th11.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th11;
                }
            } catch (Throwable th12) {
                Throwable cause11 = th12.getCause();
                if (cause11 != null) {
                    throw cause11;
                }
                throw th12;
            }
        } catch (Throwable th13) {
            Throwable cause12 = th13.getCause();
            if (cause12 != null) {
                throw cause12;
            }
            throw th13;
        }
    }
}
