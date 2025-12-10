package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ExpandableListView;

/* loaded from: classes5.dex */
public class setImageTintList implements Runnable {
    private final setOnItemClickListener ThreeDS2Service;
    private final setRecyclerListener get;
    private final setOnItemLongClickListener valueOf$2eb70107;

    public setImageTintList(setOnItemLongClickListener setonitemlongclicklistener, setOnItemClickListener setonitemclicklistener, setRecyclerListener setrecyclerlistener) {
        this.valueOf$2eb70107 = setonitemlongclicklistener;
        this.ThreeDS2Service = setonitemclicklistener;
        this.get = setrecyclerlistener;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((Class) setEmptyView.ThreeDS2ServiceInstance((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0') + 1006, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63)).getDeclaredMethod("ThreeDS2ServiceInstance", (Class) setEmptyView.ThreeDS2ServiceInstance((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 1005 - Color.argb(0, 0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62), setOnItemClickListener.class, setRecyclerListener.class).invoke(null, this.valueOf$2eb70107, this.ThreeDS2Service, this.get);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}