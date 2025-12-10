package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netcetera.threeds.sdk.infrastructure.C9376eu;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.co */
/* loaded from: classes5.dex */
public class C9309co extends AbstractC9290bx {
    private static int getSDKVersion = 1;
    private static int getWarnings;
    private final InterfaceC9390fn cleanup;
    private final setLinksClickable initialize;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.co$get */
    /* loaded from: classes5.dex */
    public interface get extends forEach {
        void ThreeDS2Service(isEmpty isempty);

        void valueOf(isEmpty isempty);
    }

    public C9309co(Context context, InterfaceC9390fn interfaceC9390fn, setLinksClickable setlinksclickable) {
        super(context);
        this.cleanup = interfaceC9390fn;
        this.initialize = setlinksclickable;
    }

    public static /* synthetic */ void ThreeDS2Service(C9309co c9309co, isEmpty isempty, String str, String str2) {
        int i = getSDKVersion;
        int i2 = i & 55;
        int i3 = ((((i ^ 55) | i2) << 1) - (~(-((i | 55) & (~i2))))) - 1;
        getWarnings = i3 % 128;
        int i4 = i3 % 2;
        c9309co.values(isempty, str, str2);
        if (i4 == 0) {
            int i5 = getWarnings;
            getSDKVersion = ((i5 & 113) + (i5 | 113)) % 128;
            return;
        }
        throw null;
    }

    private void values(isEmpty isempty, String str, String str2) {
        values(new C9307cm(isempty, str, str2));
        int i = getWarnings;
        int i2 = i & 79;
        int i3 = ((i | 79) & (~i2)) + (i2 << 1);
        getSDKVersion = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx
    public void ThreeDS2ServiceInstance(Context context) {
        C9263ba valueOf = this.cleanup.valueOf(context, this.initialize);
        valueOf.ThreeDS2Service(new get() { // from class: com.netcetera.threeds.sdk.infrastructure.co.1
            private static int ThreeDS2Service = 1;
            private static int values;

            @Override // com.netcetera.threeds.sdk.infrastructure.C9309co.get
            public void ThreeDS2Service(isEmpty isempty) {
                int i = values;
                int i2 = i & 125;
                int i3 = ((i | 125) & (~i2)) + (i2 << 1);
                ThreeDS2Service = i3 % 128;
                if (i3 % 2 == 0) {
                    C9309co.ThreeDS2Service(C9309co.this, isempty, C9376eu.values.ThreeDS2Service.get(), C9376eu.ThreeDS2Service.ThreeDS2ServiceInstance.valueOf());
                    int i4 = 16 / 0;
                    return;
                }
                C9309co.ThreeDS2Service(C9309co.this, isempty, C9376eu.values.ThreeDS2Service.get(), C9376eu.ThreeDS2Service.ThreeDS2ServiceInstance.valueOf());
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.forEach
            public void ThreeDS2ServiceInstance(isEmpty isempty) {
                int i = ThreeDS2Service;
                int i2 = ((i ^ 35) - (~((i & 35) << 1))) - 1;
                values = i2 % 128;
                if (i2 % 2 == 0) {
                    C9309co.ThreeDS2Service(C9309co.this, isempty, C9376eu.values.get.get(), C9376eu.ThreeDS2Service.values.valueOf());
                } else {
                    C9309co.ThreeDS2Service(C9309co.this, isempty, C9376eu.values.get.get(), C9376eu.ThreeDS2Service.values.valueOf());
                    throw null;
                }
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.C9309co.get
            public void valueOf(isEmpty isempty) {
                int i = ThreeDS2Service;
                int i2 = i & 47;
                int i3 = -(-((i ^ 47) | i2));
                values = ((i2 & i3) + (i3 | i2)) % 128;
                C9309co.ThreeDS2Service(C9309co.this, isempty, C9376eu.values.ThreeDS2Service.get(), C9376eu.ThreeDS2Service.values.valueOf());
                int i4 = ThreeDS2Service;
                int i5 = i4 & 119;
                int i6 = ((i4 ^ 119) | i5) << 1;
                int i7 = -((i4 | 119) & (~i5));
                values = ((i6 & i7) + (i7 | i6)) % 128;
            }
        });
        values(valueOf);
        int i = getSDKVersion;
        int i2 = i & 17;
        int i3 = i2 + ((i ^ 17) | i2);
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx
    public final ViewGroup get(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        int i = getWarnings;
        int i2 = (i & 55) + (i | 55);
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
        return frameLayout;
    }
}
