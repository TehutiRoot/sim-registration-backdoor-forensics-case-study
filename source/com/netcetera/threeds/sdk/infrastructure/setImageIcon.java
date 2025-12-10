package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* loaded from: classes5.dex */
public class setImageIcon implements setSelected.ThreeDS2Service {
    private final setOnItemClickListener ThreeDS2Service;
    private final setOnItemLongClickListener get$2eb70107;
    private final setRecyclerListener valueOf;

    public setImageIcon(setOnItemLongClickListener setonitemlongclicklistener, setOnItemClickListener setonitemclicklistener, setRecyclerListener setrecyclerlistener) {
        this.get$2eb70107 = setonitemlongclicklistener;
        this.ThreeDS2Service = setonitemclicklistener;
        this.valueOf = setrecyclerlistener;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) setEmptyView.ThreeDS2ServiceInstance((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1005 - Color.blue(0), (ViewConfiguration.getEdgeSlop() >> 16) + 63)).getDeclaredMethod("ThreeDS2Service", (Class) setEmptyView.ThreeDS2ServiceInstance((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1005, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 62), setOnItemClickListener.class, setRecyclerListener.class).invoke(null, this.get$2eb70107, this.ThreeDS2Service, this.valueOf);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
