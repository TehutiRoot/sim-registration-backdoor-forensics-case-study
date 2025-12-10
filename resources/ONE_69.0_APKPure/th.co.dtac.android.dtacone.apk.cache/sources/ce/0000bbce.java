package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.fx */
/* loaded from: classes5.dex */
abstract class AbstractC9389fx implements InterfaceC9390fy {
    private static int addParam = 1;
    private static int removeParam;
    private final InterfaceC9376fk ConfigParameters;
    private final InterfaceC9384fs ThreeDS2Service;
    private final InterfaceC9379fn ThreeDS2Service$InitializationCallback;
    private final InterfaceC9380fo ThreeDS2ServiceInstance;
    private final InterfaceC9394gb apiKey;
    private final InterfaceC9385ft cleanup;
    private final InterfaceC9381fp createTransaction;
    private final InterfaceC9378fm get;
    private final InterfaceC9382fq getParamValue;
    private final InterfaceC9388fw getSDKInfo;
    private final InterfaceC9374fi getSDKVersion;
    private final InterfaceC9377fl getWarnings;
    private final InterfaceC9391fz initialize;
    private final InterfaceC9393ga onCompleted;
    private final InterfaceC9383fr onError;
    private final InterfaceC9387fv valueOf;
    private final InterfaceC9386fu values;

    public AbstractC9389fx(InterfaceC9387fv interfaceC9387fv, InterfaceC9386fu interfaceC9386fu, InterfaceC9384fs interfaceC9384fs, InterfaceC9380fo interfaceC9380fo, InterfaceC9378fm interfaceC9378fm, InterfaceC9374fi interfaceC9374fi, InterfaceC9377fl interfaceC9377fl, InterfaceC9388fw interfaceC9388fw, InterfaceC9391fz interfaceC9391fz, InterfaceC9385ft interfaceC9385ft, InterfaceC9393ga interfaceC9393ga, InterfaceC9379fn interfaceC9379fn, InterfaceC9381fp interfaceC9381fp, InterfaceC9383fr interfaceC9383fr, InterfaceC9376fk interfaceC9376fk, InterfaceC9394gb interfaceC9394gb, InterfaceC9382fq interfaceC9382fq) {
        this.valueOf = interfaceC9387fv;
        this.values = interfaceC9386fu;
        this.ThreeDS2Service = interfaceC9384fs;
        this.ThreeDS2ServiceInstance = interfaceC9380fo;
        this.get = interfaceC9378fm;
        this.getSDKVersion = interfaceC9374fi;
        this.getWarnings = interfaceC9377fl;
        this.getSDKInfo = interfaceC9388fw;
        this.initialize = interfaceC9391fz;
        this.cleanup = interfaceC9385ft;
        this.onCompleted = interfaceC9393ga;
        this.ThreeDS2Service$InitializationCallback = interfaceC9379fn;
        this.createTransaction = interfaceC9381fp;
        this.onError = interfaceC9383fr;
        this.ConfigParameters = interfaceC9376fk;
        this.apiKey = interfaceC9394gb;
        this.getParamValue = interfaceC9382fq;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9387fv
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

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9391fz
    public final getOrDefault ThreeDS2ServiceInstance(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        int i = addParam;
        int i2 = ((i & (-124)) | ((~i) & CameraActivity.REQUEST_CODE)) + ((i & CameraActivity.REQUEST_CODE) << 1);
        removeParam = i2 % 128;
        if (i2 % 2 != 0) {
            getOrDefault ThreeDS2ServiceInstance = this.initialize.ThreeDS2ServiceInstance(context, interfaceC9504js, interfaceC9386fu, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
            int i3 = 97 / 0;
            return ThreeDS2ServiceInstance;
        }
        return this.initialize.ThreeDS2ServiceInstance(context, interfaceC9504js, interfaceC9386fu, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9377fl
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

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9386fu
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

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9384fs
    public final getOrDefault values(Context context, InterfaceC9504js interfaceC9504js, setWidth setwidth, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, setLinksClickable setlinksclickable, InterfaceC9383fr interfaceC9383fr) {
        int i = removeParam;
        int i2 = ((i & 30) + (i | 30)) - 1;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ThreeDS2Service.values(context, interfaceC9504js, setwidth, interfaceC9374fi, interfaceC9393ga, setlinksclickable, interfaceC9383fr);
        }
        this.ThreeDS2Service.values(context, interfaceC9504js, setwidth, interfaceC9374fi, interfaceC9393ga, setlinksclickable, interfaceC9383fr);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9374fi
    public final AbstractC9228af ThreeDS2Service(Context context, InterfaceC9500jo interfaceC9500jo, setProperty setproperty) {
        int i = removeParam;
        addParam = (((i & 103) - (~(-(-(i | 103))))) - 1) % 128;
        AbstractC9228af ThreeDS2Service = this.getSDKVersion.ThreeDS2Service(context, interfaceC9500jo, setproperty);
        int i2 = removeParam;
        int i3 = (((i2 | 98) << 1) - (i2 ^ 98)) - 1;
        addParam = i3 % 128;
        if (i3 % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9393ga
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

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9376fk
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

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9380fo
    public AbstractC9249ay valueOf(Context context) {
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
        AbstractC9249ay valueOf = this.ThreeDS2ServiceInstance.valueOf(context);
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

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9381fp
    public setTextKeepState values() {
        addParam = (removeParam + 77) % 128;
        setTextKeepState values = this.createTransaction.values();
        addParam = (removeParam + 115) % 128;
        return values;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9385ft
    public final getOrDefault ThreeDS2Service(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        int i = addParam;
        int i2 = i & 53;
        int i3 = (i | 53) & (~i2);
        int i4 = -(-(i2 << 1));
        removeParam = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        getOrDefault ThreeDS2Service = this.cleanup.ThreeDS2Service(context, interfaceC9504js, interfaceC9386fu, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
        int i5 = removeParam + 73;
        addParam = i5 % 128;
        if (i5 % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9394gb
    public equals get(C9602nb c9602nb, setHighlightColor sethighlightcolor) {
        removeParam = (addParam + 19) % 128;
        equals equalsVar = this.apiKey.get(c9602nb, sethighlightcolor);
        int i = addParam;
        int i2 = i & 105;
        int i3 = i2 + ((i ^ 105) | i2);
        removeParam = i3 % 128;
        if (i3 % 2 == 0) {
            return equalsVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9378fm
    public final setCollapseContentDescription valueOf(InterfaceC9487jb interfaceC9487jb) {
        int i = addParam;
        int i2 = i & 91;
        removeParam = ((i2 - (~(-(-((i ^ 91) | i2))))) - 1) % 128;
        setCollapseContentDescription valueOf = this.get.valueOf(interfaceC9487jb);
        int i3 = removeParam;
        int i4 = i3 & 33;
        int i5 = i4 + ((i3 ^ 33) | i4);
        addParam = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return valueOf;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9383fr
    public AbstractC9227ae ThreeDS2Service(Context context) {
        int i = removeParam;
        int i2 = i & 21;
        addParam = (i2 + ((i ^ 21) | i2)) % 128;
        AbstractC9227ae ThreeDS2Service = this.onError.ThreeDS2Service(context);
        int i3 = removeParam;
        int i4 = i3 & 55;
        int i5 = i3 | 55;
        addParam = ((i4 & i5) + (i5 | i4)) % 128;
        return ThreeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9388fw
    public final getOrDefault valueOf(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        int i = addParam;
        removeParam = ((i ^ 65) + ((i & 65) << 1)) % 128;
        getOrDefault valueOf = this.getSDKInfo.valueOf(context, interfaceC9504js, interfaceC9386fu, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
        int i2 = removeParam;
        int i3 = ((i2 ^ 31) | (i2 & 31)) << 1;
        int i4 = -(((~i2) & 31) | (i2 & (-32)));
        addParam = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        return valueOf;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9379fn
    public C9252ba valueOf(Context context, setLinksClickable setlinksclickable) {
        int i = addParam;
        removeParam = (((i ^ 18) + ((i & 18) << 1)) - 1) % 128;
        C9252ba valueOf = this.ThreeDS2Service$InitializationCallback.valueOf(context, setlinksclickable);
        int i2 = removeParam;
        int i3 = i2 & 1;
        int i4 = (i2 ^ 1) | i3;
        addParam = ((i3 & i4) + (i4 | i3)) % 128;
        return valueOf;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9382fq
    public setFilters valueOf(C9571lz c9571lz) {
        int i = removeParam;
        int i2 = ((i ^ 51) | (i & 51)) << 1;
        int i3 = -(((~i) & 51) | (i & (-52)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        addParam = i4 % 128;
        int i5 = i4 % 2;
        InterfaceC9382fq interfaceC9382fq = this.getParamValue;
        if (i5 != 0) {
            return interfaceC9382fq.valueOf(c9571lz);
        }
        interfaceC9382fq.valueOf(c9571lz);
        throw null;
    }
}