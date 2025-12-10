package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.C5655L;
import com.airbnb.lottie.LottieLogger;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class LogcatLogger implements LottieLogger {

    /* renamed from: a */
    public static final Set f41598a = new HashSet();

    @Override // com.airbnb.lottie.LottieLogger
    public void debug(String str) {
        debug(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void error(String str, Throwable th2) {
        boolean z = C5655L.DBG;
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void warning(String str) {
        warning(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void debug(String str, Throwable th2) {
        boolean z = C5655L.DBG;
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void warning(String str, Throwable th2) {
        Set set = f41598a;
        if (set.contains(str)) {
            return;
        }
        Log.w(C5655L.TAG, str, th2);
        set.add(str);
    }
}
