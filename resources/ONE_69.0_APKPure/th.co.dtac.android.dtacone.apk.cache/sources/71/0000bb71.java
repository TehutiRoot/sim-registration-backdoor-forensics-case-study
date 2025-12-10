package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.common.base.Ascii;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;
import kotlin.p023io.encoding.Base64;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dd */
/* loaded from: classes5.dex */
public class C9316dd implements keys {
    public static int ThreeDS2Service = -1257112791;
    public static int ThreeDS2ServiceInstance = 912666880;
    public static int get = 12;
    private static int getWarnings = 1;
    private static int initialize;
    public static byte[] valueOf = {Ascii.SYN, -28, Base64.padSymbol, -56, -76, -42, -19, -44, 57, -112, ByteSourceJsonBootstrapper.UTF8_BOM_1, -37, -30, -27, 5, 8, -71, -42, Ascii.ETB, -99, -47, ByteSourceJsonBootstrapper.UTF8_BOM_1, -41, -11, -11, 16, -101, -37, -25, -32, -34, -37, -22, 7};
    public static short[] values;
    private final InterfaceC9641ns cleanup = C9642nt.ThreeDS2ServiceInstance(C9316dd.class);
    private final isEmpty getSDKInfo;

    public C9316dd(isEmpty isempty) {
        this.getSDKInfo = isempty;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        initialize = (getWarnings + 7) % 128;
        isEmpty isempty = this.getSDKInfo;
        if (!(!(isempty instanceof C9262bi))) {
            String valueOf2 = ((C9262bi) isempty).valueOf();
            if (C9658om.valueOf(valueOf2)) {
                Color.red(0);
                Process.myTid();
                View.MeasureSpec.getMode(0);
                Drawable.resolveOpacity(0, 0);
                KeyEvent.normalizeMetaState(0);
                threeDS2ServiceInstance.ThreeDS2ServiceInstance(valueOf2);
            }
        }
        int i = getWarnings + 93;
        initialize = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }
}