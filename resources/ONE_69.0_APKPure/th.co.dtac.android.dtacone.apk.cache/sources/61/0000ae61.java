package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class AbtExperimentInfo {

    /* renamed from: g */
    public static final String[] f54540g = {RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", RemoteConfigConstants.ExperimentDescriptionFieldKey.VARIANT_ID};

    /* renamed from: h */
    public static final DateFormat f54541h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    public final String f54542a;

    /* renamed from: b */
    public final String f54543b;

    /* renamed from: c */
    public final String f54544c;

    /* renamed from: d */
    public final Date f54545d;

    /* renamed from: e */
    public final long f54546e;

    /* renamed from: f */
    public final long f54547f;

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j, long j2) {
        this.f54542a = str;
        this.f54543b = str2;
        this.f54544c = str3;
        this.f54545d = date;
        this.f54546e = j;
        this.f54547f = j2;
    }

    /* renamed from: a */
    public static AbtExperimentInfo m39297a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str = conditionalUserProperty.triggerEventName;
        if (str == null) {
            str = "";
        }
        return new AbtExperimentInfo(conditionalUserProperty.name, String.valueOf(conditionalUserProperty.value), str, new Date(conditionalUserProperty.creationTimestamp), conditionalUserProperty.triggerTimeout, conditionalUserProperty.timeToLive);
    }

    /* renamed from: b */
    public static AbtExperimentInfo m39296b(Map map) {
        String str;
        m39289i(map);
        try {
            Date parse = f54541h.parse((String) map.get("experimentStartTime"));
            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
            String str2 = (String) map.get(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID);
            String str3 = (String) map.get(RemoteConfigConstants.ExperimentDescriptionFieldKey.VARIANT_ID);
            if (map.containsKey("triggerEvent")) {
                str = (String) map.get("triggerEvent");
            } else {
                str = "";
            }
            return new AbtExperimentInfo(str2, str3, str, parse, parseLong, parseLong2);
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    /* renamed from: h */
    public static void m39290h(AbtExperimentInfo abtExperimentInfo) {
        m39289i(abtExperimentInfo.m39291g());
    }

    /* renamed from: i */
    public static void m39289i(Map map) {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : f54540g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
    }

    /* renamed from: c */
    public String m39295c() {
        return this.f54542a;
    }

    /* renamed from: d */
    public long m39294d() {
        return this.f54545d.getTime();
    }

    /* renamed from: e */
    public String m39293e() {
        return this.f54543b;
    }

    /* renamed from: f */
    public AnalyticsConnector.ConditionalUserProperty m39292f(String str) {
        String str2;
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.origin = str;
        conditionalUserProperty.creationTimestamp = m39294d();
        conditionalUserProperty.name = this.f54542a;
        conditionalUserProperty.value = this.f54543b;
        if (TextUtils.isEmpty(this.f54544c)) {
            str2 = null;
        } else {
            str2 = this.f54544c;
        }
        conditionalUserProperty.triggerEventName = str2;
        conditionalUserProperty.triggerTimeout = this.f54546e;
        conditionalUserProperty.timeToLive = this.f54547f;
        return conditionalUserProperty;
    }

    /* renamed from: g */
    public Map m39291g() {
        HashMap hashMap = new HashMap();
        hashMap.put(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, this.f54542a);
        hashMap.put(RemoteConfigConstants.ExperimentDescriptionFieldKey.VARIANT_ID, this.f54543b);
        hashMap.put("triggerEvent", this.f54544c);
        hashMap.put("experimentStartTime", f54541h.format(this.f54545d));
        hashMap.put("triggerTimeoutMillis", Long.toString(this.f54546e));
        hashMap.put("timeToLiveMillis", Long.toString(this.f54547f));
        return hashMap;
    }
}