package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lx */
/* loaded from: classes5.dex */
public class C9569lx extends LinearLayout {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final int values;

    public C9569lx(Context context, int i) {
        super(context);
        this.values = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = get;
        int i4 = i3 & 9;
        int i5 = (i3 | 9) & (~i4);
        int i6 = i4 << 1;
        ThreeDS2Service = ((i5 & i6) + (i5 | i6)) % 128;
        if (this.values < View.MeasureSpec.getSize(i)) {
            int i7 = ThreeDS2Service;
            int i8 = ((i7 | 5) << 1) - (i7 ^ 5);
            get = i8 % 128;
            if (i8 % 2 == 0) {
                i = View.MeasureSpec.makeMeasureSpec(this.values, View.MeasureSpec.getMode(i));
                int i9 = get;
                int i10 = i9 & 5;
                int i11 = ((i9 ^ 5) | i10) << 1;
                int i12 = -((i9 | 5) & (~i10));
                ThreeDS2Service = ((i11 & i12) + (i12 | i11)) % 128;
            } else {
                View.MeasureSpec.makeMeasureSpec(this.values, View.MeasureSpec.getMode(i));
                throw null;
            }
        }
        super.onMeasure(i, i2);
        int i13 = ThreeDS2Service;
        int i14 = i13 & 121;
        int i15 = (i13 ^ 121) | i14;
        int i16 = (i14 & i15) + (i15 | i14);
        get = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        throw null;
    }
}