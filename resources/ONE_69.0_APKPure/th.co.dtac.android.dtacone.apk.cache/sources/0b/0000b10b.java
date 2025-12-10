package com.google.firebase.p015ml.common.internal.modeldownload;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzak */
/* loaded from: classes4.dex */
public final class zzak {

    /* renamed from: a */
    public final URL f55774a;

    public zzak(String str) {
        this.f55774a = new URL(str);
    }

    public final URLConnection openConnection() throws IOException {
        return this.f55774a.openConnection();
    }
}