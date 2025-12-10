package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.settings.b */
/* loaded from: classes4.dex */
public class C8480b implements DH1 {
    /* renamed from: b */
    public static Settings.FeatureFlagData m38762b(JSONObject jSONObject) {
        return new Settings.FeatureFlagData(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    /* renamed from: c */
    public static Settings.SessionData m38761c(JSONObject jSONObject) {
        return new Settings.SessionData(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    public static long m38760d(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }

    @Override // p000.DH1
    /* renamed from: a */
    public Settings mo38763a(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) {
        Settings.SessionData m38761c;
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", DateTimeConstants.SECONDS_PER_HOUR);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            m38761c = m38761c(jSONObject.getJSONObject("session"));
        } else {
            m38761c = m38761c(new JSONObject());
        }
        return new Settings(m38760d(currentTimeProvider, optInt2, jSONObject), m38761c, m38762b(jSONObject.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}