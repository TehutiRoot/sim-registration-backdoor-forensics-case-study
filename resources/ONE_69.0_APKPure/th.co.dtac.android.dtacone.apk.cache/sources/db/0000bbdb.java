package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class getAcsSignedContent implements getValue {
    private static int getWarnings = 0;
    private static int initialize = 1;
    private final Object ThreeDS2Service$1652f99f;
    private final getAcsTransactionID ThreeDS2ServiceInstance;
    private final setShowDividers get;
    private final setAutoHandwritingEnabled valueOf;
    private final Context values;

    public getAcsSignedContent(Context context, getAcsTransactionID getacstransactionid, Object obj, setShowDividers setshowdividers, setAutoHandwritingEnabled setautohandwritingenabled) {
        this.values = context;
        this.ThreeDS2ServiceInstance = getacstransactionid;
        this.ThreeDS2Service$1652f99f = obj;
        this.get = setshowdividers;
        this.valueOf = setautohandwritingenabled;
    }

    public static getValue ThreeDS2Service(Context context, setAutoHandwritingEnabled setautohandwritingenabled) {
        try {
            getAcsSignedContent getacssignedcontent = new getAcsSignedContent(context, getAcsTransactionID.valueOf(), ((Class) get3DSServerTransactionID.ThreeDS2Service(ViewConfiguration.getJumpTapTimeout() >> 16, TextUtils.lastIndexOf("", '0', 0) + 73, (char) (48086 - Color.green(0)))).getDeclaredConstructor(Context.class).newInstance(context), setShowDividers.ThreeDS2Service(context), setautohandwritingenabled);
            int i = getWarnings;
            int i2 = (((i ^ 9) | (i & 9)) << 1) - (((~i) & 9) | (i & (-10)));
            initialize = i2 % 128;
            if (i2 % 2 != 0) {
                return getacssignedcontent;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getValue
    public close ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, C9571lz c9571lz) throws setId {
        setAcsRefNumber ThreeDS2Service = getAcsRefNumber.ThreeDS2Service(this.values);
        ChallengeParameters challengeParameters = this.ThreeDS2ServiceInstance.get(configParameters);
        ArrayList arrayList = new ArrayList();
        arrayList.add(challengeParameters);
        arrayList.add(this.get);
        try {
            arrayList.addAll(Arrays.asList((Object[]) ((Class) get3DSServerTransactionID.ThreeDS2Service(Color.green(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 72, (char) (48086 - Gravity.getAbsoluteGravity(0, 0)))).getDeclaredMethod("ThreeDS2ServiceInstance", null).invoke(this.ThreeDS2Service$1652f99f, null)));
            completed completedVar = new completed(arrayList);
            this.valueOf.ThreeDS2Service(completedVar);
            close values = ChallengeStatusReceiver.values(ThreeDS2Service, completedVar, c9571lz);
            int i = initialize;
            int i2 = i & 17;
            int i3 = (i | 17) & (~i2);
            int i4 = -(-(i2 << 1));
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            getWarnings = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 19 / 0;
            }
            return values;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}