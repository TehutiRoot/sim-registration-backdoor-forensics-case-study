package com.netcetera.threeds.sdk.infrastructure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.w */
/* loaded from: classes5.dex */
public abstract class AbstractC9758w<T extends View> implements contains<T> {
    private static int ThreeDS2Service = 0;
    public static char[] getSDKInfo = {13801, 13809, 13772, 13823, 13806, 13812, 13767, 13808, 13775, 13759, 13761, 13811, 13800, 13748, 13816, 13803, 13819, 13802, 13804, 13805, 13807, 13822, 13754, 13813, 13814};
    public static char getSDKVersion = 5;
    private static int valueOf = 1;
    private final Context ThreeDS2ServiceInstance;
    protected final InterfaceC9652ns cleanup = C9653nt.ThreeDS2ServiceInstance(AbstractC9758w.class);
    private T values;

    public AbstractC9758w(Context context) {
        this.ThreeDS2ServiceInstance = context;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public T ThreeDS2Service() {
        ThreeDS2Service = (valueOf + 15) % 128;
        values();
        T t = this.values;
        valueOf = (ThreeDS2Service + 25) % 128;
        return t;
    }

    public abstract T get(Context context);

    public final void values() {
        ThreeDS2Service = (valueOf + 5) % 128;
        if (this.values == null) {
            this.values = get(this.ThreeDS2ServiceInstance);
        }
        int i = valueOf + 23;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9758w.ThreeDS2Service(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    @SuppressLint({"DiscouragedApi"})
    public void values(View view, String str) {
        valueOf = (ThreeDS2Service + 105) % 128;
        try {
            Resources resources = this.ThreeDS2ServiceInstance.getResources();
            Object[] objArr = new Object[1];
            ThreeDS2Service((ViewConfiguration.getWindowTouchSlop() >> 8) + 2, "\u0010\u0001", (byte) (59 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr);
            view.setId(resources.getIdentifier(str, ((String) objArr[0]).intern(), this.ThreeDS2ServiceInstance.getPackageName()));
        } catch (Throwable th2) {
            InterfaceC9652ns interfaceC9652ns = this.cleanup;
            Object[] objArr2 = new Object[1];
            ThreeDS2Service(TextUtils.lastIndexOf("", '0') + 42, "\t\u0006\u0013\u000b\u0017\u0004\u0018\u0002\u0018\u0017\u0001\u0004\u0002\u0018\u000e\u0005\u0001\u0005\u0018\u0002\u0018\u0017\u0016\u0011\u0003\u0017\u0010\u0001\u0001\u0017\u0002\u0007\r\u0001\u0012\u000e\u0014\f\u0005\u0004㘖", (byte) (79 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr2);
            interfaceC9652ns.valueOf(String.format(((String) objArr2[0]).intern(), str, th2.getMessage()));
        }
        ThreeDS2Service = (valueOf + 5) % 128;
    }
}
