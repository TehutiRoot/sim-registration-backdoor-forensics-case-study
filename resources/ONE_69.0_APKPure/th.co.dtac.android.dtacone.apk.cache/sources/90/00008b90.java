package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.BackgroundDetector;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes3.dex */
public final class C6333c implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ GoogleApiManager f44840a;

    public C6333c(GoogleApiManager googleApiManager) {
        this.f44840a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        Handler handler;
        Handler handler2;
        GoogleApiManager googleApiManager = this.f44840a;
        handler = googleApiManager.f44778n;
        handler2 = googleApiManager.f44778n;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}