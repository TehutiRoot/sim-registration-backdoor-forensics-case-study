package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SettingsJsonParser {

    /* renamed from: a */
    public final CurrentTimeProvider f55402a;

    public SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.f55402a = currentTimeProvider;
    }

    /* renamed from: a */
    public static GG1 m38773a(int i) {
        if (i != 3) {
            Logger logger = Logger.getLogger();
            logger.m39138e("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
            return new C8490a();
        }
        return new C8491b();
    }

    public Settings parseSettingsJson(JSONObject jSONObject) throws JSONException {
        return m38773a(jSONObject.getInt("settings_version")).mo38771a(this.f55402a, jSONObject);
    }
}
