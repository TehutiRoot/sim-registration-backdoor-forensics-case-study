package com.google.android.cameraview;

import android.content.Context;
import android.hardware.camera2.params.StreamConfigurationMap;
import com.google.android.cameraview.AbstractC6207d;

/* renamed from: com.google.android.cameraview.c */
/* loaded from: classes3.dex */
public class C6206c extends C6198b {
    public C6206c(AbstractC6207d.InterfaceC6208a interfaceC6208a, AbstractC6209e abstractC6209e, Context context) {
        super(interfaceC6208a, abstractC6209e, context);
    }

    @Override // com.google.android.cameraview.C6198b
    /* renamed from: w */
    public void mo49203w(KJ1 kj1, StreamConfigurationMap streamConfigurationMap) {
        android.util.Size[] highResolutionOutputSizes;
        android.util.Size[] highResolutionOutputSizes2;
        highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(256);
        if (highResolutionOutputSizes != null) {
            highResolutionOutputSizes2 = streamConfigurationMap.getHighResolutionOutputSizes(256);
            for (android.util.Size size : highResolutionOutputSizes2) {
                kj1.m67626a(new Size(size.getWidth(), size.getHeight()));
            }
        }
        if (kj1.m67624c()) {
            super.mo49203w(kj1, streamConfigurationMap);
        }
    }
}
