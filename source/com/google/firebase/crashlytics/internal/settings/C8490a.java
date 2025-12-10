package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.settings.a */
/* loaded from: classes4.dex */
public class C8490a implements GG1 {
    /* renamed from: b */
    public static Settings m38772b(CurrentTimeProvider currentTimeProvider) {
        return new Settings(currentTimeProvider.getCurrentTimeMillis() + ((long) DateTimeConstants.MILLIS_PER_HOUR), new Settings.SessionData(8, 4), new Settings.FeatureFlagData(true, false, false), 0, DateTimeConstants.SECONDS_PER_HOUR, 10.0d, 1.2d, 60);
    }

    @Override // p000.GG1
    /* renamed from: a */
    public Settings mo38771a(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) {
        return m38772b(currentTimeProvider);
    }
}
