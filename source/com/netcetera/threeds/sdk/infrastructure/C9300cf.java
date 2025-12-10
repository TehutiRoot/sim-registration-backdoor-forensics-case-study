package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;
import org.bouncycastle.crypto.signers.PSSSigner;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cf */
/* loaded from: classes5.dex */
public class C9300cf implements keys {
    public static int ThreeDS2Service = 1143082546;
    public static int ThreeDS2ServiceInstance = 19;
    private static int cleanup = 0;
    public static int get = 1512397051;
    private static int getSDKVersion = 1;
    public static short[] valueOf;
    public static byte[] values = {107, -40, -127, 98, 38, -47, 40, -123, 97, -40, 32, 32, -43, -9, -7, 102, -47, 41, Ascii.f52687GS, -44, 39, -47, -41, -38, -7, -5, 97, Ascii.f52686FS, 35, -45, 35, -38, -47, 35, -9, -7, 99, 35, -41, 37, -49, Ascii.f52686FS, -38, Ascii.f52686FS, 37, PSSSigner.TRAILER_IMPLICIT, 0};
    private final initCause getSDKInfo;
    private final InterfaceC9652ns getWarnings;
    private final keys initialize;

    public C9300cf(keys keysVar, initCause initcause) {
        this.getWarnings = C9653nt.ThreeDS2ServiceInstance(C9300cf.class);
        this.getSDKInfo = initcause;
        this.initialize = keysVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        cleanup = (getSDKVersion + 37) % 128;
        TextUtils.lastIndexOf("", '0');
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getFadingEdgeLength();
        View.MeasureSpec.getMode(0);
        threeDS2ServiceInstance.ThreeDS2Service(this.getSDKInfo);
        keys keysVar = this.initialize;
        if (keysVar != null) {
            keysVar.valueOf(threeDS2ServiceInstance);
            cleanup = (getSDKVersion + 109) % 128;
        }
        getSDKVersion = (cleanup + 119) % 128;
    }

    public C9300cf(initCause initcause) {
        this(null, initcause);
    }
}
