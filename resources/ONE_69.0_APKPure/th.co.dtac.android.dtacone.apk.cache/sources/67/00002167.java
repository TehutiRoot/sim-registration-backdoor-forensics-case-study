package androidx.camera.video.internal.encoder;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface TimeProvider {
    long realtimeUs();

    long uptimeUs();
}