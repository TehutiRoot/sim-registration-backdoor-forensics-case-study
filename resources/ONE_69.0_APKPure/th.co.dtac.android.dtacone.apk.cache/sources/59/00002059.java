package androidx.camera.extensions.internal;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface VendorProcessor {
    void close();

    void onDeInit();

    void onInit();
}