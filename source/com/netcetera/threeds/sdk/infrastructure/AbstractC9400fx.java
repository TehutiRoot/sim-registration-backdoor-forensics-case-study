package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.fx */
/* loaded from: classes5.dex */
abstract class AbstractC9400fx implements InterfaceC9401fy {
    private static int addParam = 1;
    private static int removeParam;
    private final InterfaceC9387fk ConfigParameters;
    private final InterfaceC9395fs ThreeDS2Service;
    private final InterfaceC9390fn ThreeDS2Service$InitializationCallback;
    private final InterfaceC9391fo ThreeDS2ServiceInstance;
    private final InterfaceC9405gb apiKey;
    private final InterfaceC9396ft cleanup;
    private final InterfaceC9392fp createTransaction;
    private final InterfaceC9389fm get;
    private final InterfaceC9393fq getParamValue;
    private final InterfaceC9399fw getSDKInfo;
    private final InterfaceC9385fi getSDKVersion;
    private final InterfaceC9388fl getWarnings;
    private final InterfaceC9402fz initialize;
    private final InterfaceC9404ga onCompleted;
    private final InterfaceC9394fr onError;
    private final InterfaceC9398fv valueOf;
    private final InterfaceC9397fu values;

    public AbstractC9400fx(InterfaceC9398fv interfaceC9398fv, InterfaceC9397fu interfaceC9397fu, InterfaceC9395fs interfaceC9395fs, InterfaceC9391fo interfaceC9391fo, InterfaceC9389fm interfaceC9389fm, InterfaceC9385fi interfaceC9385fi, InterfaceC9388fl interfaceC9388fl, InterfaceC9399fw interfaceC9399fw, InterfaceC9402fz interfaceC9402fz, InterfaceC9396ft interfaceC9396ft, InterfaceC9404ga interfaceC9404ga, InterfaceC9390fn interfaceC9390fn, InterfaceC9392fp interfaceC9392fp, InterfaceC9394fr interfaceC9394fr, InterfaceC9387fk interfaceC9387fk, InterfaceC9405gb interfaceC9405gb, InterfaceC9393fq interfaceC9393fq) {
        this.valueOf = interfaceC9398fv;
        this.values = interfaceC9397fu;
        this.ThreeDS2Service = interfaceC9395fs;
        this.ThreeDS2ServiceInstance = interfaceC9391fo;
        this.get = interfaceC9389fm;
        this.getSDKVersion = interfaceC9385fi;
        this.getWarnings = interfaceC9388fl;
        this.getSDKInfo = interfaceC9399fw;
        this.initialize = interfaceC9402fz;
        this.cleanup = interfaceC9396ft;
        this.onCompleted = interfaceC9404ga;
        this.ThreeDS2Service$InitializationCallback = interfaceC9390fn;
        this.createTransaction = interfaceC9392fp;
        this.onError = interfaceC9394fr;
        this.ConfigParameters = interfaceC9387fk;
        this.apiKey = interfaceC9405gb;
        this.getParamValue = interfaceC9393fq;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9398fv
    public final setFastScrollEnabled.valueOf ThreeDS2Service() {
        int i = addParam;
        int i2 = i & 7;
        int i3 = ((i ^ 7) | i2) << 1;
        int i4 = -((i | 7) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        removeParam = i5 % 128;
        int i6 = i5 % 2;
        setFastScrollEnabled.valueOf ThreeDS2Service = this.valueOf.ThreeDS2Service();
        if (i6 != 0) {
            int i7 = 36 / 0;
        }
        int i8 = addParam;
        int i9 = (i8 & 99) + (i8 | 99);
        removeParam = i9 % 128;
        if (i9 % 2 == 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9402fz
    public final getOrDefault ThreeDS2ServiceInstance(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        int i = addParam;
        int i2 = ((i & (-124)) | ((~i) & CameraActivity.REQUEST_CODE)) + ((i & CameraActivity.REQUEST_CODE) << 1);
        removeParam = i2 % 128;
        if (i2 % 2 != 0) {
            getOrDefault ThreeDS2ServiceInstance = this.initialize.ThreeDS2ServiceInstance(context, interfaceC9515js, interfaceC9397fu, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
            int i3 = 97 / 0;
            return ThreeDS2ServiceInstance;
        }
        return this.initialize.ThreeDS2ServiceInstance(context, interfaceC9515js, interfaceC9397fu, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9388fl
    public setMinEms get() {
        int i = removeParam;
        int i2 = i & 107;
        int i3 = ((i ^ 107) | i2) << 1;
        int i4 = -((i | 107) & (~i2));
        addParam = ((i3 & i4) + (i4 | i3)) % 128;
        setMinEms setminems = this.getWarnings.get();
        int i5 = addParam;
        int i6 = i5 & 107;
        int i7 = -(-((i5 ^ 107) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        removeParam = i8 % 128;
        if (i8 % 2 == 0) {
            return setminems;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9397fu
    public final keys valueOf(isEmpty isempty) {
        int i = addParam;
        int i2 = i & 73;
        int i3 = (i ^ 73) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        removeParam = i4 % 128;
        int i5 = i4 % 2;
        keys valueOf = this.values.valueOf(isempty);
        if (i5 != 0) {
            int i6 = 63 / 0;
        }
        int i7 = addParam;
        int i8 = i7 & 27;
        int i9 = (i7 | 27) & (~i8);
        int i10 = i8 << 1;
        removeParam = ((i9 & i10) + (i9 | i10)) % 128;
        return valueOf;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9395fs
    public final getOrDefault values(Context context, InterfaceC9515js interfaceC9515js, setWidth setwidth, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, setLinksClickable setlinksclickable, InterfaceC9394fr interfaceC9394fr) {
        int i = removeParam;
        int i2 = ((i & 30) + (i | 30)) - 1;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ThreeDS2Service.values(context, interfaceC9515js, setwidth, interfaceC9385fi, interfaceC9404ga, setlinksclickable, interfaceC9394fr);
        }
        this.ThreeDS2Service.values(context, interfaceC9515js, setwidth, interfaceC9385fi, interfaceC9404ga, setlinksclickable, interfaceC9394fr);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9385fi
    public final AbstractC9239af ThreeDS2Service(Context context, InterfaceC9511jo interfaceC9511jo, setProperty setproperty) {
        int i = removeParam;
        addParam = (((i & 103) - (~(-(-(i | 103))))) - 1) % 128;
        AbstractC9239af ThreeDS2Service = this.getSDKVersion.ThreeDS2Service(context, interfaceC9511jo, setproperty);
        int i2 = removeParam;
        int i3 = (((i2 | 98) << 1) - (i2 ^ 98)) - 1;
        addParam = i3 % 128;
        if (i3 % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9404ga
    public setProperty ThreeDS2ServiceInstance() {
        int i = addParam;
        int i2 = (((i | 48) << 1) - (i ^ 48)) - 1;
        removeParam = i2 % 128;
        int i3 = i2 % 2;
        setProperty ThreeDS2ServiceInstance = this.onCompleted.ThreeDS2ServiceInstance();
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        int i5 = removeParam;
        int i6 = (i5 & (-2)) | ((~i5) & 1);
        int i7 = -(-((i5 & 1) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        addParam = i8 % 128;
        if (i8 % 2 != 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9387fk
    public keys get(getStackTrace getstacktrace) {
        int i = addParam;
        int i2 = (i & (-120)) | ((~i) & 119);
        int i3 = -(-((i & 119) << 1));
        removeParam = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        keys keysVar = this.ConfigParameters.get(getstacktrace);
        int i4 = addParam;
        removeParam = (((i4 | 53) << 1) - (i4 ^ 53)) % 128;
        return keysVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9391fo
    public AbstractC9260ay valueOf(Context context) {
        int i = removeParam;
        int i2 = i | 115;
        int i3 = i2 << 1;
        int i4 = -((~(i & 115)) & i2);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        addParam = i5 % 128;
        if (i5 % 2 == 0) {
            this.ThreeDS2ServiceInstance.valueOf(context);
            throw null;
        }
        AbstractC9260ay valueOf = this.ThreeDS2ServiceInstance.valueOf(context);
        int i6 = removeParam;
        int i7 = ((i6 ^ 125) | (i6 & 125)) << 1;
        int i8 = -(((~i6) & 125) | (i6 & (-126)));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        addParam = i9 % 128;
        if (i9 % 2 != 0) {
            return valueOf;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9392fp
    public setTextKeepState values() {
        addParam = (removeParam + 77) % 128;
        setTextKeepState values = this.createTransaction.values();
        addParam = (removeParam + 115) % 128;
        return values;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9396ft
    public final getOrDefault ThreeDS2Service(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        int i = addParam;
        int i2 = i & 53;
        int i3 = (i | 53) & (~i2);
        int i4 = -(-(i2 << 1));
        removeParam = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        getOrDefault ThreeDS2Service = this.cleanup.ThreeDS2Service(context, interfaceC9515js, interfaceC9397fu, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        int i5 = removeParam + 73;
        addParam = i5 % 128;
        if (i5 % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9405gb
    public equals get(C9613nb c9613nb, setHighlightColor sethighlightcolor) {
        removeParam = (addParam + 19) % 128;
        equals equalsVar = this.apiKey.get(c9613nb, sethighlightcolor);
        int i = addParam;
        int i2 = i & 105;
        int i3 = i2 + ((i ^ 105) | i2);
        removeParam = i3 % 128;
        if (i3 % 2 == 0) {
            return equalsVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9389fm
    public final setCollapseContentDescription valueOf(InterfaceC9498jb interfaceC9498jb) {
        int i = addParam;
        int i2 = i & 91;
        removeParam = ((i2 - (~(-(-((i ^ 91) | i2))))) - 1) % 128;
        setCollapseContentDescription valueOf = this.get.valueOf(interfaceC9498jb);
        int i3 = removeParam;
        int i4 = i3 & 33;
        int i5 = i4 + ((i3 ^ 33) | i4);
        addParam = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return valueOf;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9394fr
    public AbstractC9238ae ThreeDS2Service(Context context) {
        int i = removeParam;
        int i2 = i & 21;
        addParam = (i2 + ((i ^ 21) | i2)) % 128;
        AbstractC9238ae ThreeDS2Service = this.onError.ThreeDS2Service(context);
        int i3 = removeParam;
        int i4 = i3 & 55;
        int i5 = i3 | 55;
        addParam = ((i4 & i5) + (i5 | i4)) % 128;
        return ThreeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9399fw
    public final getOrDefault valueOf(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        int i = addParam;
        removeParam = ((i ^ 65) + ((i & 65) << 1)) % 128;
        getOrDefault valueOf = this.getSDKInfo.valueOf(context, interfaceC9515js, interfaceC9397fu, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        int i2 = removeParam;
        int i3 = ((i2 ^ 31) | (i2 & 31)) << 1;
        int i4 = -(((~i2) & 31) | (i2 & (-32)));
        addParam = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        return valueOf;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9390fn
    public C9263ba valueOf(Context context, setLinksClickable setlinksclickable) {
        int i = addParam;
        removeParam = (((i ^ 18) + ((i & 18) << 1)) - 1) % 128;
        C9263ba valueOf = this.ThreeDS2Service$InitializationCallback.valueOf(context, setlinksclickable);
        int i2 = removeParam;
        int i3 = i2 & 1;
        int i4 = (i2 ^ 1) | i3;
        addParam = ((i3 & i4) + (i4 | i3)) % 128;
        return valueOf;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9393fq
    public setFilters valueOf(C9582lz c9582lz) {
        int i = removeParam;
        int i2 = ((i ^ 51) | (i & 51)) << 1;
        int i3 = -(((~i) & 51) | (i & (-52)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        addParam = i4 % 128;
        int i5 = i4 % 2;
        InterfaceC9393fq interfaceC9393fq = this.getParamValue;
        if (i5 != 0) {
            return interfaceC9393fq.valueOf(c9582lz);
        }
        interfaceC9393fq.valueOf(c9582lz);
        throw null;
    }
}
