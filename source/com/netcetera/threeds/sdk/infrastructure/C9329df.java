package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import com.netcetera.threeds.sdk.infrastructure.C9376eu;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.df */
/* loaded from: classes5.dex */
public class C9329df implements keys {
    private static int cleanup = 0;
    private static int getSDKInfo = 1;
    public static int[] valueOf = {121523324, 2064249111, -896084118, 1780446770, -338885214, -398515195, 1256684774, 187786563, -557981609, 2047191716, 350787578, 1066389845, -1165203854, 1712671615, 1603431391, -1237664709, -494467841, -1468437276};
    private final InterfaceC9652ns ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final setFastScrollEnabled.valueOf get;
    private final boolean getSDKVersion;
    private final String values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.df$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C93301 {
        private static int ThreeDS2Service = 0;
        static final /* synthetic */ int[] ThreeDS2ServiceInstance;
        private static int valueOf = 1;

        static {
            int[] iArr = new int[setFastScrollEnabled.valueOf.values().length];
            ThreeDS2ServiceInstance = iArr;
            try {
                iArr[setFastScrollEnabled.valueOf.valueOf.ordinal()] = 1;
                int i = valueOf;
                int i2 = ((i ^ 45) | (i & 45)) << 1;
                int i3 = -(((~i) & 45) | (i & (-46)));
                ThreeDS2Service = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThreeDS2ServiceInstance[setFastScrollEnabled.valueOf.ThreeDS2ServiceInstance.ordinal()] = 2;
                int i4 = valueOf;
                ThreeDS2Service = (((i4 & 84) + (i4 | 84)) - 1) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ThreeDS2ServiceInstance[setFastScrollEnabled.valueOf.get.ordinal()] = 3;
                int i5 = ThreeDS2Service;
                int i6 = i5 & 49;
                int i7 = -(-((i5 ^ 49) | i6));
                valueOf = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            int i8 = ThreeDS2Service;
            valueOf = ((((i8 ^ 119) | (i8 & 119)) << 1) - (((~i8) & 119) | (i8 & (-120)))) % 128;
        }
    }

    public C9329df(setFastScrollEnabled.valueOf valueof, String str) {
        this(valueof, str, C9376eu.ThreeDS2Service.values.valueOf(), false);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        getSDKInfo = (cleanup + 61) % 128;
        TextUtils.getTrimmedLength("");
        int i = C93301.ThreeDS2ServiceInstance[this.get.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    threeDS2ServiceInstance.valueOf(this.ThreeDS2ServiceInstance);
                    threeDS2ServiceInstance.get(this.values);
                    return;
                }
                return;
            }
            threeDS2ServiceInstance.ThreeDS2Service(Boolean.TRUE);
            if (this.getSDKVersion) {
                setTitleMarginEnd settitlemarginend = new setTitleMarginEnd();
                setTitleMarginEnd.values valuesVar = new setTitleMarginEnd.values();
                valuesVar.valueOf(this.ThreeDS2ServiceInstance);
                valuesVar.ThreeDS2Service(this.values);
                settitlemarginend.ThreeDS2Service(valuesVar);
                threeDS2ServiceInstance.valueOf(settitlemarginend);
                cleanup = (getSDKInfo + CameraActivity.REQUEST_CODE) % 128;
                return;
            }
            return;
        }
        threeDS2ServiceInstance.ThreeDS2Service(Boolean.TRUE);
    }

    public C9329df(setFastScrollEnabled.valueOf valueof, String str, String str2) {
        this(valueof, str, str2, false);
    }

    public C9329df(setFastScrollEnabled.valueOf valueof, String str, String str2, boolean z) {
        this.ThreeDS2Service = C9653nt.ThreeDS2ServiceInstance(C9329df.class);
        this.get = valueof;
        this.ThreeDS2ServiceInstance = str;
        this.values = str2;
        this.getSDKVersion = z;
    }
}
