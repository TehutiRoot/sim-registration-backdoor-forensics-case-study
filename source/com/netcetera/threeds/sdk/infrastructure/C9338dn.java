package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.C9376eu;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dn */
/* loaded from: classes5.dex */
public class C9338dn extends AbstractC9328de {
    private static int ThreeDS2Service$InitializationCallback = 0;
    private static int createTransaction = 1;
    private final setWidth getSDKInfo;
    private final setLinksClickable getWarnings;
    private boolean initialize;

    public C9338dn(Context context, InterfaceC9515js interfaceC9515js, setLinksClickable setlinksclickable, setWidth setwidth, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.initialize = false;
        this.getWarnings = setlinksclickable;
        this.getSDKInfo = setwidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r2.initialize != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (r2.initialize != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.getServices r3) {
        /*
            r2 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9338dn.ThreeDS2Service$InitializationCallback
            r1 = r0 | 59
            int r1 = r1 << 1
            r0 = r0 ^ 59
            int r1 = r1 - r0
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9338dn.createTransaction = r1
            com.netcetera.threeds.sdk.infrastructure.setWidth r0 = r2.getSDKInfo
            android.net.Uri r3 = r3.ThreeDS2Service()
            boolean r3 = r0.get(r3)
            if (r3 != 0) goto L40
            int r3 = com.netcetera.threeds.sdk.infrastructure.C9338dn.createTransaction
            r0 = r3 & (-46)
            int r1 = ~r3
            r1 = r1 & 45
            r0 = r0 | r1
            r3 = r3 & 45
            int r3 = r3 << 1
            int r3 = -r3
            int r3 = -r3
            int r3 = ~r3
            int r0 = r0 - r3
            int r0 = r0 + (-1)
            int r3 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9338dn.ThreeDS2Service$InitializationCallback = r3
            int r0 = r0 % 2
            if (r0 == 0) goto L3c
            boolean r3 = r2.initialize
            r0 = 12
            int r0 = r0 / 0
            if (r3 == 0) goto L62
            goto L40
        L3c:
            boolean r3 = r2.initialize
            if (r3 == 0) goto L62
        L40:
            com.netcetera.threeds.sdk.infrastructure.eu$values r3 = com.netcetera.threeds.sdk.infrastructure.C9376eu.values.ThreeDS2Service
            java.lang.String r3 = r3.get()
            com.netcetera.threeds.sdk.infrastructure.eu$ThreeDS2Service r0 = com.netcetera.threeds.sdk.infrastructure.C9376eu.ThreeDS2Service.values
            java.lang.String r0 = r0.valueOf()
            r2.get(r3, r0)
            int r3 = com.netcetera.threeds.sdk.infrastructure.C9338dn.ThreeDS2Service$InitializationCallback
            r0 = r3 & 87
            r3 = r3 ^ 87
            r3 = r3 | r0
            int r3 = -r3
            int r3 = -r3
            r1 = r0 | r3
            int r1 = r1 << 1
            r3 = r3 ^ r0
            int r1 = r1 - r3
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9338dn.createTransaction = r1
        L62:
            int r3 = com.netcetera.threeds.sdk.infrastructure.C9338dn.ThreeDS2Service$InitializationCallback
            r0 = r3 | 73
            int r1 = r0 << 1
            r3 = r3 & 73
            int r3 = ~r3
            r3 = r3 & r0
            int r1 = r1 - r3
            int r3 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9338dn.createTransaction = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L79
            r3 = 33
            int r3 = r3 / 0
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9338dn.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.getServices):void");
    }

    private void get(String str, String str2) {
        values(new C9329df(setFastScrollEnabled.valueOf.ThreeDS2ServiceInstance, str, str2, this.initialize));
        int i = ThreeDS2Service$InitializationCallback;
        createTransaction = ((i ^ 97) + ((i & 97) << 1)) % 128;
    }

    public static getOrDefault valueOf(Context context, InterfaceC9515js interfaceC9515js, setWidth setwidth, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, setLinksClickable setlinksclickable, InterfaceC9394fr interfaceC9394fr) {
        C9338dn c9338dn = new C9338dn(context, interfaceC9515js, setlinksclickable, setwidth, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        int i = ThreeDS2Service$InitializationCallback;
        int i2 = i & 19;
        createTransaction = (((i | 19) & (~i2)) + (i2 << 1)) % 128;
        return c9338dn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(isEmpty isempty) {
        int i = ThreeDS2Service$InitializationCallback;
        int i2 = (i & (-74)) | ((~i) & 73);
        int i3 = (i & 73) << 1;
        createTransaction = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        get(C9376eu.values.get.get(), C9376eu.ThreeDS2Service.values.valueOf());
        int i4 = ThreeDS2Service$InitializationCallback + CameraActivity.REQUEST_CODE;
        createTransaction = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9288bv c9288bv = new C9288bv(context, get().ThreeDS2Service());
        C9752store c9752store = C9752store.get(context, get());
        c9752store.values(new C9335dk(this));
        C9752store valueOf = C9752store.valueOf(context, get());
        valueOf.values(new C9336dl(this, context));
        contains c9266bc = new C9266bc(new C9339do(this), context);
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf, c9752store);
        ThreeDS2Service(c9288bv);
        values(ThreeDS2Service);
        values(c9288bv);
        values(c9266bc);
        int i = createTransaction;
        int i2 = i & 121;
        int i3 = -(-((i ^ 121) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service$InitializationCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void valueOf(Context context, isEmpty isempty) {
        this.getWarnings.values(context, new C9337dm(this));
        int i = createTransaction;
        ThreeDS2Service$InitializationCallback = (((i & 60) + (i | 60)) - 1) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void valueOf() {
        int i = createTransaction;
        int i2 = i & 47;
        ThreeDS2Service$InitializationCallback = (i2 + ((i ^ 47) | i2)) % 128;
        get(C9376eu.values.ThreeDS2Service.get(), C9376eu.ThreeDS2Service.ThreeDS2ServiceInstance.valueOf());
        int i3 = createTransaction;
        ThreeDS2Service$InitializationCallback = (((i3 | 23) << 1) - (i3 ^ 23)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx, com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void valueOf(InterfaceC9311compute interfaceC9311compute, setAllCaps setallcaps) {
        int i = ThreeDS2Service$InitializationCallback;
        int i2 = (i & (-40)) | ((~i) & 39);
        int i3 = (i & 39) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        createTransaction = i4 % 128;
        if (i4 % 2 == 0) {
            super.valueOf(interfaceC9311compute, setallcaps);
            this.initialize = setBackInvokedCallbackEnabled.get(setallcaps);
            int i5 = 1 / 0;
        } else {
            super.valueOf(interfaceC9311compute, setallcaps);
            this.initialize = setBackInvokedCallbackEnabled.get(setallcaps);
        }
        int i6 = createTransaction;
        int i7 = i6 & 65;
        int i8 = (i6 | 65) & (~i7);
        int i9 = i7 << 1;
        ThreeDS2Service$InitializationCallback = (((i8 | i9) << 1) - (i8 ^ i9)) % 128;
    }
}
