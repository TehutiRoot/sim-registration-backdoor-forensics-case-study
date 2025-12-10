package com.google.firebase.crashlytics.internal.network;

import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes4.dex */
public class HttpGetRequest {

    /* renamed from: a */
    public final String f55363a;

    /* renamed from: b */
    public final Map f55364b;

    /* renamed from: c */
    public final Map f55365c = new HashMap();

    public HttpGetRequest(String str, Map<String, String> map) {
        this.f55363a = str;
        this.f55364b = map;
    }

    /* renamed from: a */
    public final String m38831a(Map map) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        if (entry.getValue() == null) {
            str = "";
        } else {
            str = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb.append(str);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            if (entry2.getValue() == null) {
                str2 = "";
            } else {
                str2 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final String m38830b(String str, Map map) {
        String m38831a = m38831a(map);
        if (m38831a.isEmpty()) {
            return str;
        }
        if (str.contains(CallerData.f39639NA)) {
            if (!str.endsWith("&")) {
                m38831a = "&" + m38831a;
            }
            return str + m38831a;
        }
        return str + CallerData.f39639NA + m38831a;
    }

    /* renamed from: c */
    public final String m38829c(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    public HttpResponse execute() throws IOException {
        HttpsURLConnection httpsURLConnection;
        CrashlyticsWorkers.checkBlockingThread();
        InputStream inputStream = null;
        String m38829c = null;
        inputStream = null;
        try {
            String m38830b = m38830b(this.f55363a, this.f55364b);
            Logger.getLogger().m39134v("GET Request URL: " + m38830b);
            httpsURLConnection = (HttpsURLConnection) new URL(m38830b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f55365c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        m38829c = m38829c(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new HttpResponse(responseCode, m38829c);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public HttpGetRequest header(String str, String str2) {
        this.f55365c.put(str, str2);
        return this;
    }

    public HttpGetRequest header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }
}
