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
    public static final Date f56378g = new Date(0);

    /* renamed from: a */
    public JSONObject f56379a;

    /* renamed from: b */
    public JSONObject f56380b;

    /* renamed from: c */
    public Date f56381c;

    /* renamed from: d */
    public JSONArray f56382d;

    /* renamed from: e */
    public JSONObject f56383e;

    /* renamed from: f */
    public long f56384f;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public JSONObject f56385a;

        /* renamed from: b */
        public Date f56386b;

        /* renamed from: c */
        public JSONArray f56387c;

        /* renamed from: d */
        public JSONObject f56388d;

        /* renamed from: e */
        public long f56389e;

        public ConfigContainer build() throws JSONException {
            return new ConfigContainer(this.f56385a, this.f56386b, this.f56387c, this.f56388d, this.f56389e);
        }

        public Builder replaceConfigsWith(Map<String, String> map) {
            this.f56385a = new JSONObject(map);
            return this;
        }

        public Builder withAbtExperiments(JSONArray jSONArray) {
            try {
                this.f56387c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder withFetchTime(Date date) {
            this.f56386b = date;
            return this;
        }

        public Builder withPersonalizationMetadata(JSONObject jSONObject) {
            try {
                this.f56388d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder withTemplateVersionNumber(long j) {
            this.f56389e = j;
            return this;
        }

        public Builder() {
            this.f56385a = new JSONObject();
            this.f56386b = ConfigContainer.f56378g;
            this.f56387c = new JSONArray();
            this.f56388d = new JSONObject();
            this.f56389e = 0L;
        }

        public Builder replaceConfigsWith(JSONObject jSONObject) {
            try {
                this.f56385a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder(ConfigContainer configContainer) {
            this.f56385a = configContainer.getConfigs();
            this.f56386b = configContainer.getFetchTime();
            this.f56387c = configContainer.getAbtExperiments();
            this.f56388d = configContainer.getPersonalizationMetadata();
            this.f56389e = configContainer.getTemplateVersionNumber();
        }
    }

    /* renamed from: b */
    public static ConfigContainer m37750b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new ConfigContainer(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    /* renamed from: c */
    public static ConfigContainer m37749c(JSONObject jSONObject) {
        return m37750b(new JSONObject(jSONObject.toString()));
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
        return this.f56379a.toString().equals(((ConfigContainer) obj).toString());
    }

    public JSONArray getAbtExperiments() {
        return this.f56382d;
    }

    public Set<String> getChangedParams(ConfigContainer configContainer) throws JSONException {
        JSONObject configs = m37749c(configContainer.f56379a).getConfigs();
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
        return this.f56380b;
    }

    public Date getFetchTime() {
        return this.f56381c;
    }

    public JSONObject getPersonalizationMetadata() {
        return this.f56383e;
    }

    public long getTemplateVersionNumber() {
        return this.f56384f;
    }

    public int hashCode() {
        return this.f56379a.hashCode();
    }

    public String toString() {
        return this.f56379a.toString();
    }

    public ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        this.f56380b = jSONObject;
        this.f56381c = date;
        this.f56382d = jSONArray;
        this.f56383e = jSONObject2;
        this.f56384f = j;
        this.f56379a = jSONObject3;
    }

    public static Builder newBuilder(ConfigContainer configContainer) {
        return new Builder(configContainer);
    }
}