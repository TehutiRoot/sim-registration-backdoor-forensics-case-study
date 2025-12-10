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
    public static final JSONArray f58484f = new JSONArray();

    /* renamed from: a */
    public final MPConfig f58485a;

    /* renamed from: b */
    public final Context f58486b;

    /* renamed from: c */
    public final Map f58487c = new HashMap();

    /* renamed from: d */
    public final ImageStore f58488d;

    /* renamed from: e */
    public final C20038gQ1 f58489e;

    /* loaded from: classes5.dex */
    public static class UnintelligibleMessageException extends Exception {
        private static final long serialVersionUID = -6501269367559104957L;

        public UnintelligibleMessageException(String str, JSONException jSONException) {
            super(str, jSONException);
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.DecideChecker$a */
    /* loaded from: classes5.dex */
    public static class C9137a {

        /* renamed from: a */
        public final List f58490a = new ArrayList();

        /* renamed from: b */
        public JSONArray f58491b = DecideChecker.f58484f;

        /* renamed from: c */
        public JSONArray f58492c = DecideChecker.f58484f;

        /* renamed from: d */
        public boolean f58493d = false;

        /* renamed from: e */
        public JSONArray f58494e;
    }

    public DecideChecker(Context context, MPConfig mPConfig) {
        this.f58486b = context;
        this.f58485a = mPConfig;
        this.f58488d = m33667d(context);
        this.f58489e = C20038gQ1.m31135g(context);
    }

    /* renamed from: c */
    public static byte[] m33668c(RemoteService remoteService, Context context, String str) {
        MPConfig mPConfig = MPConfig.getInstance(context);
        if (!remoteService.isOnline(context, mPConfig.getOfflineMode())) {
            return null;
        }
        try {
            return remoteService.performRequest(str, null, mPConfig.getSSLSocketFactory());
        } catch (FileNotFoundException e) {
            MPLog.m33452v("MixpanelAPI.DChecker", "Cannot get " + str + ", file not found.", e);
            return null;
        } catch (MalformedURLException e2) {
            MPLog.m33456e("MixpanelAPI.DChecker", "Cannot interpret " + str + " as a URL.", e2);
            return null;
        } catch (IOException e3) {
            MPLog.m33452v("MixpanelAPI.DChecker", "Cannot get " + str + ".", e3);
            return null;
        } catch (OutOfMemoryError e4) {
            MPLog.m33456e("MixpanelAPI.DChecker", "Out of memory when getting to " + str + ".", e4);
            return null;
        }
    }

    /* renamed from: g */
    public static int m33664g(Display display) {
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
    public static com.mixpanel.android.mpmetrics.DecideChecker.C9137a m33662i(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.DecideChecker.m33662i(java.lang.String):com.mixpanel.android.mpmetrics.DecideChecker$a");
    }

    /* renamed from: b */
    public void m33669b(DecideMessages decideMessages) {
        this.f58487c.put(decideMessages.m33655e(), decideMessages);
    }

    /* renamed from: d */
    public ImageStore m33667d(Context context) {
        return new ImageStore(context, "DecideChecker");
    }

    /* renamed from: e */
    public DecideMessages m33666e(String str) {
        return (DecideMessages) this.f58487c.get(str);
    }

    /* renamed from: f */
    public final String m33665f(String str, String str2, RemoteService remoteService) {
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
                jSONObject.putOpt("$android_app_version", this.f58489e.m31139c());
                jSONObject.putOpt("$android_version", Build.VERSION.RELEASE);
                jSONObject.putOpt("$android_app_release", this.f58489e.m31140b());
                jSONObject.putOpt("$android_device_model", Build.MODEL);
                sb.append(URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e) {
                MPLog.m33456e("MixpanelAPI.DChecker", "Exception constructing properties JSON", e.getCause());
            }
            String str4 = this.f58485a.getDecideEndpoint() + sb.toString();
            MPLog.m33453v("MixpanelAPI.DChecker", "Querying decide server, url: " + str4);
            byte[] m33668c = m33668c(remoteService, this.f58486b, str4);
            if (m33668c == null) {
                return null;
            }
            try {
                return new String(m33668c, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF not supported on this platform?", e2);
            }
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException("Mixpanel library requires utf-8 string encoding to be available", e3);
        }
    }

    /* renamed from: h */
    public final Bitmap m33663h(InAppNotification inAppNotification, Context context) {
        String[] strArr = {inAppNotification.getImage2xUrl(), inAppNotification.getImageUrl()};
        int m33664g = m33664g(((WindowManager) context.getSystemService("window")).getDefaultDisplay());
        if (inAppNotification.getType() == InAppNotification.Type.TAKEOVER && m33664g >= 720) {
            strArr = new String[]{inAppNotification.getImage4xUrl(), inAppNotification.getImage2xUrl(), inAppNotification.getImageUrl()};
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            try {
                return this.f58488d.getImage(str);
            } catch (ImageStore.CantGetImageException e) {
                MPLog.m33452v("MixpanelAPI.DChecker", "Can't load image " + str + " for a notification", e);
            }
        }
        return null;
    }

    /* renamed from: j */
    public final C9137a m33661j(String str, String str2, RemoteService remoteService) {
        String m33665f = m33665f(str, str2, remoteService);
        MPLog.m33453v("MixpanelAPI.DChecker", "Mixpanel decide server response was:\n" + m33665f);
        if (m33665f != null) {
            C9137a m33662i = m33662i(m33665f);
            Iterator it = m33662i.f58490a.iterator();
            while (it.hasNext()) {
                InAppNotification inAppNotification = (InAppNotification) it.next();
                Bitmap m33663h = m33663h(inAppNotification, this.f58486b);
                if (m33663h == null) {
                    MPLog.m33455i("MixpanelAPI.DChecker", "Could not retrieve image for notification " + inAppNotification.getId() + ", will not show the notification.");
                    it.remove();
                } else {
                    inAppNotification.m33628b(m33663h);
                }
            }
            return m33662i;
        }
        return null;
    }

    /* renamed from: k */
    public void m33660k(String str, RemoteService remoteService) {
        DecideMessages decideMessages = (DecideMessages) this.f58487c.get(str);
        if (decideMessages != null) {
            try {
                C9137a m33661j = m33661j(decideMessages.m33655e(), decideMessages.m33659a(), remoteService);
                if (m33661j != null) {
                    decideMessages.m33650j(m33661j.f58490a, m33661j.f58491b, m33661j.f58492c, m33661j.f58493d, m33661j.f58494e);
                }
            } catch (UnintelligibleMessageException e) {
                MPLog.m33456e("MixpanelAPI.DChecker", e.getMessage(), e);
            }
        }
    }
}
