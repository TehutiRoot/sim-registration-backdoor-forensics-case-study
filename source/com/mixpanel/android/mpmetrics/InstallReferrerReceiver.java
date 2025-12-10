package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.mixpanel.android.util.MPLog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class InstallReferrerReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public final Pattern f58545a = Pattern.compile("(^|&)utm_source=([^&#=]*)([#&]|$)");

    /* renamed from: b */
    public final Pattern f58546b = Pattern.compile("(^|&)utm_medium=([^&#=]*)([#&]|$)");

    /* renamed from: c */
    public final Pattern f58547c = Pattern.compile("(^|&)utm_campaign=([^&#=]*)([#&]|$)");

    /* renamed from: d */
    public final Pattern f58548d = Pattern.compile("(^|&)utm_content=([^&#=]*)([#&]|$)");

    /* renamed from: e */
    public final Pattern f58549e = Pattern.compile("(^|&)utm_term=([^&#=]*)([#&]|$)");

    /* renamed from: a */
    public final String m33626a(Matcher matcher) {
        String group;
        if (matcher.find() && (group = matcher.group(2)) != null) {
            try {
                return URLDecoder.decode(group, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                MPLog.m33457e("MixpanelAPI.InstRfrRcvr", "Could not decode a parameter into UTF-8");
                return null;
            }
        }
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String string;
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString("referrer")) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("referrer", string);
        String m33626a = m33626a(this.f58545a.matcher(string));
        if (m33626a != null) {
            hashMap.put("utm_source", m33626a);
        }
        String m33626a2 = m33626a(this.f58546b.matcher(string));
        if (m33626a2 != null) {
            hashMap.put("utm_medium", m33626a2);
        }
        String m33626a3 = m33626a(this.f58547c.matcher(string));
        if (m33626a3 != null) {
            hashMap.put("utm_campaign", m33626a3);
        }
        String m33626a4 = m33626a(this.f58548d.matcher(string));
        if (m33626a4 != null) {
            hashMap.put("utm_content", m33626a4);
        }
        String m33626a5 = m33626a(this.f58549e.matcher(string));
        if (m33626a5 != null) {
            hashMap.put("utm_term", m33626a5);
        }
        C19228bk1.m51844S(context, "com.mixpanel.android.mpmetrics.ReferralInfo", hashMap);
    }
}
