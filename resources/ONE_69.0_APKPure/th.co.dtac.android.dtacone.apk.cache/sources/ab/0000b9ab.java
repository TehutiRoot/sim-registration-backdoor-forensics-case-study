package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.util.ImageStore;
import com.mixpanel.android.util.MPLog;
import com.mixpanel.android.util.RemoteService;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class DecideChecker {

    /* renamed from: f */
    public static final JSONArray f58496f = new JSONArray();

    /* renamed from: a */
    public final MPConfig f58497a;

    /* renamed from: b */
    public final Context f58498b;

    /* renamed from: c */
    public final Map f58499c = new HashMap();

    /* renamed from: d */
    public final ImageStore f58500d;

    /* renamed from: e */
    public final C19574dR1 f58501e;

    /* loaded from: classes5.dex */
    public static class UnintelligibleMessageException extends Exception {
        private static final long serialVersionUID = -6501269367559104957L;

        public UnintelligibleMessageException(String str, JSONException jSONException) {
            super(str, jSONException);
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.DecideChecker$a */
    /* loaded from: classes5.dex */
    public static class C9126a {

        /* renamed from: a */
        public final List f58502a = new ArrayList();

        /* renamed from: b */
        public JSONArray f58503b = DecideChecker.f58496f;

        /* renamed from: c */
        public JSONArray f58504c = DecideChecker.f58496f;

        /* renamed from: d */
        public boolean f58505d = false;

        /* renamed from: e */
        public JSONArray f58506e;
    }

    public DecideChecker(Context context, MPConfig mPConfig) {
        this.f58498b = context;
        this.f58497a = mPConfig;
        this.f58500d = m33659d(context);
        this.f58501e = C19574dR1.m31836g(context);
    }

    /* renamed from: c */
    public static byte[] m33660c(RemoteService remoteService, Context context, String str) {
        MPConfig mPConfig = MPConfig.getInstance(context);
        if (!remoteService.isOnline(context, mPConfig.getOfflineMode())) {
            return null;
        }
        try {
            return remoteService.performRequest(str, null, mPConfig.getSSLSocketFactory());
        } catch (FileNotFoundException e) {
            MPLog.m33444v("MixpanelAPI.DChecker", "Cannot get " + str + ", file not found.", e);
            return null;
        } catch (MalformedURLException e2) {
            MPLog.m33448e("MixpanelAPI.DChecker", "Cannot interpret " + str + " as a URL.", e2);
            return null;
        } catch (IOException e3) {
            MPLog.m33444v("MixpanelAPI.DChecker", "Cannot get " + str + ".", e3);
            return null;
        } catch (OutOfMemoryError e4) {
            MPLog.m33448e("MixpanelAPI.DChecker", "Out of memory when getting to " + str + ".", e4);
            return null;
        }
    }

    /* renamed from: g */
    public static int m33656g(Display display) {
        Point point = new Point();
        display.getSize(point);
        return point.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mixpanel.android.mpmetrics.DecideChecker.C9126a m33654i(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.DecideChecker.m33654i(java.lang.String):com.mixpanel.android.mpmetrics.DecideChecker$a");
    }

    /* renamed from: b */
    public void m33661b(DecideMessages decideMessages) {
        this.f58499c.put(decideMessages.m33647e(), decideMessages);
    }

    /* renamed from: d */
    public ImageStore m33659d(Context context) {
        return new ImageStore(context, "DecideChecker");
    }

    /* renamed from: e */
    public DecideMessages m33658e(String str) {
        return (DecideMessages) this.f58499c.get(str);
    }

    /* renamed from: f */
    public final String m33657f(String str, String str2, RemoteService remoteService) {
        String str3;
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            if (str2 != null) {
                str3 = URLEncoder.encode(str2, "utf-8");
            } else {
                str3 = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("?version=1&lib=android&token=");
            sb.append(encode);
            if (str3 != null) {
                sb.append("&distinct_id=");
                sb.append(str3);
            }
            sb.append("&properties=");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("$android_lib_version", "5.4.1");
                jSONObject.putOpt("$android_app_version", this.f58501e.m31840c());
                jSONObject.putOpt("$android_version", Build.VERSION.RELEASE);
                jSONObject.putOpt("$android_app_release", this.f58501e.m31841b());
                jSONObject.putOpt("$android_device_model", Build.MODEL);
                sb.append(URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e) {
                MPLog.m33448e("MixpanelAPI.DChecker", "Exception constructing properties JSON", e.getCause());
            }
            String str4 = this.f58497a.getDecideEndpoint() + sb.toString();
            MPLog.m33445v("MixpanelAPI.DChecker", "Querying decide server, url: " + str4);
            byte[] m33660c = m33660c(remoteService, this.f58498b, str4);
            if (m33660c == null) {
                return null;
            }
            try {
                return new String(m33660c, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF not supported on this platform?", e2);
            }
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException("Mixpanel library requires utf-8 string encoding to be available", e3);
        }
    }

    /* renamed from: h */
    public final Bitmap m33655h(InAppNotification inAppNotification, Context context) {
        String[] strArr = {inAppNotification.getImage2xUrl(), inAppNotification.getImageUrl()};
        int m33656g = m33656g(((WindowManager) context.getSystemService("window")).getDefaultDisplay());
        if (inAppNotification.getType() == InAppNotification.Type.TAKEOVER && m33656g >= 720) {
            strArr = new String[]{inAppNotification.getImage4xUrl(), inAppNotification.getImage2xUrl(), inAppNotification.getImageUrl()};
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            try {
                return this.f58500d.getImage(str);
            } catch (ImageStore.CantGetImageException e) {
                MPLog.m33444v("MixpanelAPI.DChecker", "Can't load image " + str + " for a notification", e);
            }
        }
        return null;
    }

    /* renamed from: j */
    public final C9126a m33653j(String str, String str2, RemoteService remoteService) {
        String m33657f = m33657f(str, str2, remoteService);
        MPLog.m33445v("MixpanelAPI.DChecker", "Mixpanel decide server response was:\n" + m33657f);
        if (m33657f != null) {
            C9126a m33654i = m33654i(m33657f);
            Iterator it = m33654i.f58502a.iterator();
            while (it.hasNext()) {
                InAppNotification inAppNotification = (InAppNotification) it.next();
                Bitmap m33655h = m33655h(inAppNotification, this.f58498b);
                if (m33655h == null) {
                    MPLog.m33447i("MixpanelAPI.DChecker", "Could not retrieve image for notification " + inAppNotification.getId() + ", will not show the notification.");
                    it.remove();
                } else {
                    inAppNotification.m33620b(m33655h);
                }
            }
            return m33654i;
        }
        return null;
    }

    /* renamed from: k */
    public void m33652k(String str, RemoteService remoteService) {
        DecideMessages decideMessages = (DecideMessages) this.f58499c.get(str);
        if (decideMessages != null) {
            try {
                C9126a m33653j = m33653j(decideMessages.m33647e(), decideMessages.m33651a(), remoteService);
                if (m33653j != null) {
                    decideMessages.m33642j(m33653j.f58502a, m33653j.f58503b, m33653j.f58504c, m33653j.f58505d, m33653j.f58506e);
                }
            } catch (UnintelligibleMessageException e) {
                MPLog.m33448e("MixpanelAPI.DChecker", e.getMessage(), e);
            }
        }
    }
}