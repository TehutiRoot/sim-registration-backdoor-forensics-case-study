package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ConfigContainer {

    /* renamed from: g */
    public static final Date f56366g = new Date(0);

    /* renamed from: a */
    public JSONObject f56367a;

    /* renamed from: b */
    public JSONObject f56368b;

    /* renamed from: c */
    public Date f56369c;

    /* renamed from: d */
    public JSONArray f56370d;

    /* renamed from: e */
    public JSONObject f56371e;

    /* renamed from: f */
    public long f56372f;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public JSONObject f56373a;

        /* renamed from: b */
        public Date f56374b;

        /* renamed from: c */
        public JSONArray f56375c;

        /* renamed from: d */
        public JSONObject f56376d;

        /* renamed from: e */
        public long f56377e;

        public ConfigContainer build() throws JSONException {
            return new ConfigContainer(this.f56373a, this.f56374b, this.f56375c, this.f56376d, this.f56377e);
        }

        public Builder replaceConfigsWith(Map<String, String> map) {
            this.f56373a = new JSONObject(map);
            return this;
        }

        public Builder withAbtExperiments(JSONArray jSONArray) {
            try {
                this.f56375c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder withFetchTime(Date date) {
            this.f56374b = date;
            return this;
        }

        public Builder withPersonalizationMetadata(JSONObject jSONObject) {
            try {
                this.f56376d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder withTemplateVersionNumber(long j) {
            this.f56377e = j;
            return this;
        }

        public Builder() {
            this.f56373a = new JSONObject();
            this.f56374b = ConfigContainer.f56366g;
            this.f56375c = new JSONArray();
            this.f56376d = new JSONObject();
            this.f56377e = 0L;
        }

        public Builder replaceConfigsWith(JSONObject jSONObject) {
            try {
                this.f56373a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder(ConfigContainer configContainer) {
            this.f56373a = configContainer.getConfigs();
            this.f56374b = configContainer.getFetchTime();
            this.f56375c = configContainer.getAbtExperiments();
            this.f56376d = configContainer.getPersonalizationMetadata();
            this.f56377e = configContainer.getTemplateVersionNumber();
        }
    }

    /* renamed from: b */
    public static ConfigContainer m37758b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new ConfigContainer(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    /* renamed from: c */
    public static ConfigContainer m37757c(JSONObject jSONObject) {
        return m37758b(new JSONObject(jSONObject.toString()));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigContainer)) {
            return false;
        }
        return this.f56367a.toString().equals(((ConfigContainer) obj).toString());
    }

    public JSONArray getAbtExperiments() {
        return this.f56370d;
    }

    public Set<String> getChangedParams(ConfigContainer configContainer) throws JSONException {
        JSONObject configs = m37757c(configContainer.f56367a).getConfigs();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = getConfigs().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!configContainer.getConfigs().has(next)) {
                hashSet.add(next);
            } else if (!getConfigs().get(next).equals(configContainer.getConfigs().get(next))) {
                hashSet.add(next);
            } else if ((getPersonalizationMetadata().has(next) && !configContainer.getPersonalizationMetadata().has(next)) || (!getPersonalizationMetadata().has(next) && configContainer.getPersonalizationMetadata().has(next))) {
                hashSet.add(next);
            } else if (getPersonalizationMetadata().has(next) && configContainer.getPersonalizationMetadata().has(next) && !getPersonalizationMetadata().getJSONObject(next).toString().equals(configContainer.getPersonalizationMetadata().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else {
                configs.remove(next);
            }
        }
        Iterator<String> keys2 = configs.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public JSONObject getConfigs() {
        return this.f56368b;
    }

    public Date getFetchTime() {
        return this.f56369c;
    }

    public JSONObject getPersonalizationMetadata() {
        return this.f56371e;
    }

    public long getTemplateVersionNumber() {
        return this.f56372f;
    }

    public int hashCode() {
        return this.f56367a.hashCode();
    }

    public String toString() {
        return this.f56367a.toString();
    }

    public ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        this.f56368b = jSONObject;
        this.f56369c = date;
        this.f56370d = jSONArray;
        this.f56371e = jSONObject2;
        this.f56372f = j;
        this.f56367a = jSONObject3;
    }

    public static Builder newBuilder(ConfigContainer configContainer) {
        return new Builder(configContainer);
    }
}
