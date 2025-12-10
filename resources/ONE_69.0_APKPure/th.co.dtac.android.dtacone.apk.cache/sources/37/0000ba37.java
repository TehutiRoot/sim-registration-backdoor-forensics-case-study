package com.mixpanel.android.viewcrawler;

import com.mixpanel.android.mpmetrics.OnMixpanelTweaksUpdatedListener;
import com.mixpanel.android.mpmetrics.Tweaks;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public interface UpdatesFromMixpanel {
    void addOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener);

    void applyPersistedUpdates();

    Tweaks getTweaks();

    void removeOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener);

    void setEventBindings(JSONArray jSONArray);

    void setVariants(JSONArray jSONArray);

    void startUpdates();

    void storeVariants(JSONArray jSONArray);
}