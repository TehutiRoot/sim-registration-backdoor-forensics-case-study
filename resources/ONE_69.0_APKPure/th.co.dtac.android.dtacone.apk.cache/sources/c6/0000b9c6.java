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
    public final Pattern f58557a = Pattern.compile("(^|&)utm_source=([^&#=]*)([#&]|$)");

    /* renamed from: b */
    public final Pattern f58558b = Pattern.compile("(^|&)utm_medium=([^&#=]*)([#&]|$)");

    /* renamed from: c */
    public final Pattern f58559c = Pattern.compile("(^|&)utm_campaign=([^&#=]*)([#&]|$)");

    /* renamed from: d */
    public final Pattern f58560d = Pattern.compile("(^|&)utm_content=([^&#=]*)([#&]|$)");

    /* renamed from: e */
    public final Pattern f58561e = Pattern.compile("(^|&)utm_term=([^&#=]*)([#&]|$)");

    /* renamed from: a */
    public final String m33618a(Matcher matcher) {
        String group;
        if (matcher.find() && (group = matcher.group(2)) != null) {
            try {
                return URLDecoder.decode(group, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                MPLog.m33449e("MixpanelAPI.InstRfrRcvr", "Could not decode a parameter into UTF-8");
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
        String m33618a = m33618a(this.f58557a.matcher(string));
        if (m33618a != null) {
            hashMap.put("utm_source", m33618a);
        }
        String m33618a2 = m33618a(this.f58558b.matcher(string));
        if (m33618a2 != null) {
            hashMap.put("utm_medium", m33618a2);
        }
        String m33618a3 = m33618a(this.f58559c.matcher(string));
        if (m33618a3 != null) {
            hashMap.put("utm_campaign", m33618a3);
        }
        String m33618a4 = m33618a(this.f58560d.matcher(string));
        if (m33618a4 != null) {
            hashMap.put("utm_content", m33618a4);
        }
        String m33618a5 = m33618a(this.f58561e.matcher(string));
        if (m33618a5 != null) {
            hashMap.put("utm_term", m33618a5);
        }
        C18875Yk1.m65389S(context, "com.mixpanel.android.mpmetrics.ReferralInfo", hashMap);
    }
}