package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.api.info.CertificateInfo;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/* loaded from: classes5.dex */
public class setAutoHandwritingEnabled {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getSDKVersion = 1;
    private final Object ThreeDS2Service$77524075;
    private Date get;
    private final RuntimeErrorEvent valueOf;
    private ChallengeParameters values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setAutoHandwritingEnabled$2 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C97372 {
        private static int ThreeDS2Service = 0;
        private static int ThreeDS2ServiceInstance = 1;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[CertificateInfo.CertificateType.valuesCustom().length];
            values = iArr;
            try {
                iArr[CertificateInfo.CertificateType.CERTIFICATE.ordinal()] = 1;
                int i = ThreeDS2Service;
                int i2 = (i & (-66)) | ((~i) & 65);
                int i3 = (i & 65) << 1;
                ThreeDS2ServiceInstance = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[CertificateInfo.CertificateType.PUBLIC_KEY.ordinal()] = 2;
                int i4 = ThreeDS2ServiceInstance;
                int i5 = (i4 & (-18)) | ((~i4) & 17);
                int i6 = (i4 & 17) << 1;
                ThreeDS2Service = ((i5 & i6) + (i6 | i5)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i7 = ThreeDS2ServiceInstance;
            int i8 = (((i7 | 55) << 1) - (~(-(i7 ^ 55)))) - 1;
            ThreeDS2Service = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 44 / 0;
            }
        }
    }

    public setAutoHandwritingEnabled(RuntimeErrorEvent runtimeErrorEvent, Object obj) {
        this.valueOf = runtimeErrorEvent;
        this.ThreeDS2Service$77524075 = obj;
    }

    public static setAutoHandwritingEnabled ThreeDS2Service() {
        try {
            setAutoHandwritingEnabled setautohandwritingenabled = new setAutoHandwritingEnabled(timedout.valueOf(), ((Class) get3DSServerTransactionID.ThreeDS2Service(Gravity.getAbsoluteGravity(0, 0) + 259, KeyEvent.normalizeMetaState(0) + 66, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 40024))).getMethod(CoreConstants.VALUE_OF, null).invoke(null, null));
            int i = getSDKVersion;
            ThreeDS2ServiceInstance = (((((i ^ 97) | (i & 97)) << 1) - (~(-(((~i) & 97) | (i & (-98)))))) - 1) % 128;
            return setautohandwritingenabled;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public void valueOf(Date date) {
        this.get = new Date(date.getTime());
        int i = getSDKVersion;
        ThreeDS2ServiceInstance = ((i ^ 11) + ((i & 11) << 1)) % 128;
    }

    public com.netcetera.threeds.sdk.api.info.SDKInfo valueOf(String str) throws com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException {
        getTransactionStatus ThreeDS2Service;
        ArrayList arrayList;
        Object[] objArr;
        Class cls;
        Class<?>[] clsArr;
        com.netcetera.threeds.sdk.api.info.CertificateInfo certificateInfo;
        int i = 0;
        int i2 = ThreeDS2ServiceInstance;
        int i3 = i2 ^ 81;
        int i4 = 1;
        int i5 = ((i2 & 81) | i3) << 1;
        int i6 = -i3;
        int i7 = (i5 & i6) + (i6 | i5);
        getSDKVersion = i7 % 128;
        if (i7 % 2 != 0) {
            if (this.values == null) {
                int i8 = i2 & 49;
                int i9 = ((((i2 ^ 49) | i8) << 1) - (~(-((i2 | 49) & (~i8))))) - 1;
                getSDKVersion = i9 % 128;
                if (i9 % 2 == 0) {
                    throw setForegroundGravity.getType.valueOf(new Object[1]);
                }
                throw setForegroundGravity.getType.valueOf(new Object[0]);
            }
            ArrayList arrayList2 = new ArrayList();
            int i10 = getSDKVersion;
            ThreeDS2ServiceInstance = (((i10 ^ 112) + ((i10 & 112) << 1)) - 1) % 128;
            for (String str2 : this.values.ThreeDS2ServiceInstance(str)) {
                try {
                    ThreeDS2Service = this.values.ThreeDS2Service(str2, str);
                    arrayList = new ArrayList();
                    int i11 = getSDKVersion;
                    ThreeDS2ServiceInstance = (((i11 ^ 70) + ((i11 & 70) << i4)) - i4) % 128;
                    for (String str3 : ThreeDS2Service.ThreeDS2Service()) {
                        int i12 = getSDKVersion;
                        ThreeDS2ServiceInstance = ((i12 & 1) + (i12 | i4)) % 128;
                        if (C97372.values[this.valueOf.valueOf(str3).ordinal()] != i4) {
                            arrayList.add(new setIsCredential(str3));
                            int i13 = getSDKVersion;
                            int i14 = i13 & 17;
                            ThreeDS2ServiceInstance = ((i14 - (~(-(-((i13 ^ 17) | i14))))) - i4) % 128;
                        } else {
                            Object obj = this.ThreeDS2Service$77524075;
                            Object[] objArr2 = new Object[i4];
                            objArr2[i] = str3;
                            arrayList.add(new setDescendantFocusability((X509Certificate) ((Class) get3DSServerTransactionID.ThreeDS2Service(Color.argb(i, i, i, i) + 259, 66 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 40024))).getMethod(CoreConstants.VALUE_OF, String.class).invoke(obj, objArr2)));
                            int i15 = getSDKVersion;
                            int i16 = i15 & 27;
                            ThreeDS2ServiceInstance = (i16 + ((i15 ^ 27) | i16)) % 128;
                        }
                        int i17 = getSDKVersion;
                        int i18 = (i17 & (-126)) | ((~i17) & 125);
                        int i19 = (i17 & 125) << 1;
                        ThreeDS2ServiceInstance = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
                        i = 0;
                        i4 = 1;
                    }
                } catch (setId unused) {
                }
                try {
                    String values = ThreeDS2Service.values().values();
                    if (C97372.values[this.valueOf.valueOf(values).ordinal()] != 1) {
                        com.netcetera.threeds.sdk.api.info.CertificateInfo setiscredential = new setIsCredential(values);
                        int i20 = getSDKVersion;
                        int i21 = (i20 & (-80)) | ((~i20) & 79);
                        int i22 = (i20 & 79) << 1;
                        ThreeDS2ServiceInstance = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
                        certificateInfo = setiscredential;
                    } else {
                        Object obj2 = this.ThreeDS2Service$77524075;
                        try {
                            objArr = new Object[]{values};
                            cls = (Class) get3DSServerTransactionID.ThreeDS2Service(260 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 66 - KeyEvent.getDeadChar(0, 0), (char) (40024 - (ViewConfiguration.getWindowTouchSlop() >> 8)));
                            clsArr = new Class[1];
                        } catch (Throwable th2) {
                            th = th2;
                            i4 = 1;
                        }
                        try {
                            clsArr[0] = String.class;
                            com.netcetera.threeds.sdk.api.info.CertificateInfo setdescendantfocusability = new setDescendantFocusability((X509Certificate) cls.getMethod(CoreConstants.VALUE_OF, clsArr).invoke(obj2, objArr));
                            int i23 = ThreeDS2ServiceInstance;
                            int i24 = i23 & 3;
                            int i25 = (i23 | 3) & (~i24);
                            int i26 = i24 << 1;
                            getSDKVersion = (((i25 | i26) << 1) - (i25 ^ i26)) % 128;
                            certificateInfo = setdescendantfocusability;
                        } catch (Throwable th3) {
                            th = th3;
                            i4 = 1;
                            try {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            } catch (setId unused2) {
                            }
                        }
                    }
                    try {
                        arrayList2.add(new setTooltipText(arrayList, certificateInfo, ThreeDS2Service.values().ThreeDS2Service(), ThreeDS2Service.ThreeDS2ServiceInstance(), Collections.singletonList(str2)));
                        int i27 = getSDKVersion;
                        int i28 = i27 ^ 33;
                        i4 = 1;
                        int i29 = -(-((i27 & 33) << 1));
                        ThreeDS2ServiceInstance = ((i28 & i29) + (i29 | i28)) % 128;
                    } catch (setId unused3) {
                        i4 = 1;
                    }
                } catch (setId unused4) {
                    i4 = 1;
                    getSDKVersion = (ThreeDS2ServiceInstance + 37) % 128;
                    i = 0;
                }
                getSDKVersion = (ThreeDS2ServiceInstance + 37) % 128;
                i = 0;
            }
            setViewTranslationCallback setviewtranslationcallback = new setViewTranslationCallback(arrayList2, this.get);
            ThreeDS2ServiceInstance = (getSDKVersion + 51) % 128;
            return setviewtranslationcallback;
        }
        throw null;
    }

    public void ThreeDS2Service(ChallengeParameters challengeParameters) {
        int i = getSDKVersion;
        int i2 = i & 101;
        int i3 = -(-((i ^ 101) | i2));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        ThreeDS2ServiceInstance = i4;
        this.values = challengeParameters;
        getSDKVersion = (((i4 & (-68)) | ((~i4) & 67)) + ((i4 & 67) << 1)) % 128;
    }

    public void valueOf() {
        int i = getSDKVersion;
        int i2 = i & 85;
        int i3 = ((i ^ 85) | i2) << 1;
        int i4 = -((i | 85) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 != 0) {
            this.values = null;
            this.get = null;
            int i6 = 62 / 0;
            return;
        }
        this.values = null;
        this.get = null;
    }
}
