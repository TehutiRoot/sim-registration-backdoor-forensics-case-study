package com.mixpanel.android.viewcrawler;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.mixpanel.android.util.MPLog;
import com.mixpanel.android.viewcrawler.ViewVisitor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mixpanel.android.viewcrawler.a */
/* loaded from: classes5.dex */
public class C9223a implements ViewVisitor.OnEventListener {

    /* renamed from: e */
    public static String f58861e = "MixpanelAPI.DynamicEventTracker";

    /* renamed from: a */
    public final MixpanelAPI f58862a;

    /* renamed from: b */
    public final Handler f58863b;

    /* renamed from: d */
    public final Map f58865d = new HashMap();

    /* renamed from: c */
    public final Runnable f58864c = new RunnableC9225b();

    /* renamed from: com.mixpanel.android.viewcrawler.a$b */
    /* loaded from: classes5.dex */
    public final class RunnableC9225b implements Runnable {
        public RunnableC9225b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (C9223a.this.f58865d) {
                try {
                    Iterator it = C9223a.this.f58865d.entrySet().iterator();
                    while (it.hasNext()) {
                        C9227d c9227d = (C9227d) ((Map.Entry) it.next()).getValue();
                        if (currentTimeMillis - c9227d.f58868a > 1000) {
                            C9223a.this.f58862a.track(c9227d.f58869b, c9227d.f58870c);
                            it.remove();
                        }
                    }
                    if (!C9223a.this.f58865d.isEmpty()) {
                        C9223a.this.f58863b.postDelayed(this, 500L);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.a$c */
    /* loaded from: classes5.dex */
    public static class C9226c {

        /* renamed from: a */
        public final int f58867a;

        public C9226c(View view, String str) {
            this.f58867a = view.hashCode() ^ str.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9226c) || this.f58867a != obj.hashCode()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f58867a;
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.a$d */
    /* loaded from: classes5.dex */
    public static class C9227d {

        /* renamed from: a */
        public final long f58868a;

        /* renamed from: b */
        public final String f58869b;

        /* renamed from: c */
        public final JSONObject f58870c;

        public C9227d(String str, JSONObject jSONObject, long j) {
            this.f58869b = str;
            this.f58870c = jSONObject;
            this.f58868a = j;
        }
    }

    public C9223a(MixpanelAPI mixpanelAPI, Handler handler) {
        this.f58862a = mixpanelAPI;
        this.f58863b = handler;
    }

    /* renamed from: d */
    public static String m33372d(View view) {
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text == null) {
                return null;
            }
            return text.toString();
        } else if (!(view instanceof ViewGroup)) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount && sb.length() < 128; i++) {
                String m33372d = m33372d(viewGroup.getChildAt(i));
                if (m33372d != null && m33372d.length() > 0) {
                    if (z) {
                        sb.append(", ");
                    }
                    sb.append(m33372d);
                    z = true;
                }
            }
            if (sb.length() > 128) {
                return sb.substring(0, 128);
            }
            if (!z) {
                return null;
            }
            return sb.toString();
        }
    }

    @Override // com.mixpanel.android.viewcrawler.ViewVisitor.OnEventListener
    public void OnEvent(View view, String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$text", m33372d(view));
            jSONObject.put("$from_binding", true);
            jSONObject.put("time", currentTimeMillis / 1000);
        } catch (JSONException e) {
            MPLog.m33456e(f58861e, "Can't format properties from view due to JSON issue", e);
        }
        if (z) {
            C9226c c9226c = new C9226c(view, str);
            C9227d c9227d = new C9227d(str, jSONObject, currentTimeMillis);
            synchronized (this.f58865d) {
                try {
                    boolean isEmpty = this.f58865d.isEmpty();
                    this.f58865d.put(c9226c, c9227d);
                    if (isEmpty) {
                        this.f58863b.postDelayed(this.f58864c, 1000L);
                    }
                } finally {
                }
            }
            return;
        }
        this.f58862a.track(str, jSONObject);
    }
}
