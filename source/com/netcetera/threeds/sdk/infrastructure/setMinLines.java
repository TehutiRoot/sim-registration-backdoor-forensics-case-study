package com.netcetera.threeds.sdk.infrastructure;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setMinLines {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final Handler ThreeDS2ServiceInstance;
    private final long valueOf;

    public setMinLines(long j, Handler handler) {
        this.valueOf = j;
        this.ThreeDS2ServiceInstance = handler;
    }

    public static setMinLines ThreeDS2Service(int i) {
        setMinLines setminlines = new setMinLines(TimeUnit.MINUTES.toMillis(i), new Handler(Looper.getMainLooper()));
        int i2 = ThreeDS2Service;
        int i3 = i2 & CameraActivity.REQUEST_CODE;
        int i4 = (i2 | CameraActivity.REQUEST_CODE) & (~i3);
        int i5 = -(-(i3 << 1));
        get = ((i4 & i5) + (i4 | i5)) % 128;
        return setminlines;
    }

    public setFontFeatureSettings values(setJustificationMode setjustificationmode) {
        setMaxLines setmaxlines = new setMaxLines(setjustificationmode, new setLines(), this.ThreeDS2ServiceInstance, this.valueOf);
        int i = get;
        int i2 = i & 15;
        int i3 = ((i ^ 15) | i2) << 1;
        int i4 = -((i | 15) & (~i2));
        ThreeDS2Service = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        return setmaxlines;
    }
}
