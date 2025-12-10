package com.netcetera.threeds.sdk.infrastructure;

import android.widget.TextView;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bq */
/* loaded from: classes5.dex */
public class C9271bq implements setProperty {
    private static int ThreeDS2Service = 0;
    private static int values = 1;

    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    public void get(TextView textView, String str) {
        int i = ThreeDS2Service;
        int i2 = (i & (-98)) | ((~i) & 97);
        int i3 = -(-((i & 97) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        int i5 = i4 % 2;
        textView.setText(str);
        if (i5 == 0) {
            int i6 = 6 / 0;
        }
        int i7 = ThreeDS2Service;
        int i8 = (i7 | 93) << 1;
        int i9 = -(((~i7) & 93) | (i7 & (-94)));
        values = ((i8 & i9) + (i9 | i8)) % 128;
    }
}