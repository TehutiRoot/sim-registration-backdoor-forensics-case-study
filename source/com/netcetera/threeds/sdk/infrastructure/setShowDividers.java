package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setShowDividers implements ChallengeParameters {
    private static int get = 0;
    private static int valueOf = 1;
    private final setBaselineAligned values;

    public setShowDividers(setBaselineAligned setbaselinealigned) {
        this.values = setbaselinealigned;
    }

    public static setShowDividers ThreeDS2Service(Context context) {
        try {
            setShowDividers setshowdividers = new setShowDividers((setBaselineAligned) ((Class) get3DSServerTransactionID.ThreeDS2Service(1938 - (ViewConfiguration.getFadingEdgeLength() >> 16), 63 - Color.red(0), (char) (TextUtils.lastIndexOf("", '0') + 38198))).getMethod("values", Context.class).invoke(null, context));
            valueOf = (get + 17) % 128;
            return setshowdividers;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ChallengeParameters
    public Set<String> ThreeDS2ServiceInstance(String str) {
        List<setOverscrollFooter> ThreeDS2ServiceInstance = this.values.valueOf(str).ThreeDS2ServiceInstance();
        HashSet hashSet = new HashSet();
        Iterator<setOverscrollFooter> it = ThreeDS2ServiceInstance.iterator();
        int i = valueOf;
        int i2 = i ^ 31;
        int i3 = -(-((i & 31) << 1));
        get = ((i2 & i3) + (i3 | i2)) % 128;
        while (!(!it.hasNext())) {
            int i4 = valueOf;
            int i5 = (((i4 | 74) << 1) - (i4 ^ 74)) - 1;
            get = i5 % 128;
            if (i5 % 2 == 0) {
                hashSet.addAll(it.next().ThreeDS2ServiceInstance());
                int i6 = get;
                valueOf = (((i6 & (-62)) | ((~i6) & 61)) + ((i6 & 61) << 1)) % 128;
            } else {
                hashSet.addAll(it.next().ThreeDS2ServiceInstance());
                throw null;
            }
        }
        int i7 = valueOf;
        int i8 = i7 ^ CameraActivity.REQUEST_CODE;
        int i9 = ((i7 & CameraActivity.REQUEST_CODE) | i8) << 1;
        int i10 = -i8;
        get = ((i9 ^ i10) + ((i9 & i10) << 1)) % 128;
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca A[SYNTHETIC] */
    @Override // com.netcetera.threeds.sdk.infrastructure.ChallengeParameters
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netcetera.threeds.sdk.infrastructure.getTransactionStatus ThreeDS2Service(java.lang.String r10, java.lang.String r11) throws com.netcetera.threeds.sdk.infrastructure.setId {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setShowDividers.ThreeDS2Service(java.lang.String, java.lang.String):com.netcetera.threeds.sdk.infrastructure.getTransactionStatus");
    }
}
