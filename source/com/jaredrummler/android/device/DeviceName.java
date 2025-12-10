package com.jaredrummler.android.device;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class DeviceName {

    /* loaded from: classes5.dex */
    public interface Callback {
        void onFinished(DeviceInfo deviceInfo, Exception exc);
    }

    /* loaded from: classes5.dex */
    public static final class DeviceInfo {
        public final String codename;
        public final String manufacturer;
        public final String marketName;
        public final String model;

        public String getName() {
            if (TextUtils.isEmpty(this.marketName)) {
                return DeviceName.m33715b(this.model);
            }
            return this.marketName;
        }

        public DeviceInfo(String str, String str2, String str3, String str4) {
            this.manufacturer = str;
            this.marketName = str2;
            this.codename = str3;
            this.model = str4;
        }

        public DeviceInfo(JSONObject jSONObject) {
            this.manufacturer = jSONObject.getString("manufacturer");
            this.marketName = jSONObject.getString("market_name");
            this.codename = jSONObject.getString("codename");
            this.model = jSONObject.getString("model");
        }
    }

    /* loaded from: classes5.dex */
    public static final class Request {

        /* renamed from: a */
        public final Context f58360a;

        /* renamed from: b */
        public final Handler f58361b;

        /* renamed from: c */
        public String f58362c;

        /* renamed from: d */
        public String f58363d;

        /* renamed from: com.jaredrummler.android.device.DeviceName$Request$a */
        /* loaded from: classes5.dex */
        public final class RunnableC9117a implements Runnable {

            /* renamed from: a */
            public final Callback f58364a;

            /* renamed from: b */
            public DeviceInfo f58365b;

            /* renamed from: c */
            public Exception f58366c;

            /* renamed from: com.jaredrummler.android.device.DeviceName$Request$a$a */
            /* loaded from: classes5.dex */
            public class RunnableC9118a implements Runnable {
                public RunnableC9118a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    RunnableC9117a runnableC9117a = RunnableC9117a.this;
                    runnableC9117a.f58364a.onFinished(runnableC9117a.f58365b, runnableC9117a.f58366c);
                }
            }

            public RunnableC9117a(Callback callback) {
                this.f58364a = callback;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Request request = Request.this;
                    this.f58365b = DeviceName.getDeviceInfo(request.f58360a, request.f58362c, request.f58363d);
                } catch (Exception e) {
                    this.f58366c = e;
                }
                Request.this.f58361b.post(new RunnableC9118a());
            }
        }

        public void request(Callback callback) {
            if (this.f58362c == null && this.f58363d == null) {
                this.f58362c = Build.DEVICE;
                this.f58363d = Build.MODEL;
            }
            RunnableC9117a runnableC9117a = new RunnableC9117a(callback);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new Thread(runnableC9117a).start();
            } else {
                runnableC9117a.run();
            }
        }

        public Request setCodename(String str) {
            this.f58362c = str;
            return this;
        }

        public Request setModel(String str) {
            this.f58363d = str;
            return this;
        }

        public Request(Context context) {
            this.f58360a = context;
            this.f58361b = new Handler(context.getMainLooper());
        }
    }

    /* renamed from: b */
    public static String m33715b(String str) {
        char[] charArray;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "";
        boolean z = true;
        for (char c : str.toCharArray()) {
            if (z && Character.isLetter(c)) {
                str2 = str2 + Character.toUpperCase(c);
                z = false;
            } else {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                str2 = str2 + c;
            }
        }
        return str2;
    }

    /* renamed from: c */
    public static String m33714c(String str) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                        sb.append('\n');
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
                bufferedReader = bufferedReader2;
            }
            String sb2 = sb.toString();
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return sb2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @WorkerThread
    public static DeviceInfo getDeviceInfo(Context context) {
        return getDeviceInfo(context.getApplicationContext(), Build.DEVICE, Build.MODEL);
    }

    public static String getDeviceName() {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        return getDeviceName(str, str2, m33715b(str2));
    }

    public static Request with(Context context) {
        return new Request(context.getApplicationContext());
    }

    @WorkerThread
    public static DeviceInfo getDeviceInfo(Context context, String str) {
        return getDeviceInfo(context, str, null);
    }

    public static String getDeviceName(String str, String str2) {
        return getDeviceName(str, str, str2);
    }

    @WorkerThread
    public static DeviceInfo getDeviceInfo(Context context, String str, String str2) {
        NetworkInfo activeNetworkInfo;
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_names", 0);
        String format = String.format("%s:%s", str, str2);
        String string = sharedPreferences.getString(format, null);
        if (string != null) {
            try {
                return new DeviceInfo(new JSONObject(string));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected())) {
            try {
                JSONArray jSONArray = new JSONArray(m33714c(String.format("https://raw.githubusercontent.com/jaredrummler/AndroidDeviceNames/master/json/devices/%s.json", str.toLowerCase(Locale.ENGLISH))));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    DeviceInfo deviceInfo = new DeviceInfo(jSONObject);
                    if ((str.equalsIgnoreCase(deviceInfo.codename) && str2 == null) || (str.equalsIgnoreCase(deviceInfo.codename) && str2.equalsIgnoreCase(deviceInfo.model))) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(format, jSONObject.toString());
                        edit.apply();
                        return deviceInfo;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (str.equals(Build.DEVICE) && str2.equals(Build.MODEL)) {
            return new DeviceInfo(Build.MANUFACTURER, getDeviceName(), str, str2);
        }
        return new DeviceInfo(null, null, str, str2);
    }

    public static String getDeviceName(String str, String str2, String str3) {
        if (str == null || !str.equals("acer_S57")) {
            if (str2 != null && str2.equals("S57")) {
                return "Liquid Jade Z";
            }
            if (str == null || !str.equals("acer_t08")) {
                if (str2 != null && str2.equals("T08")) {
                    return "Liquid Zest Plus";
                }
                if (str != null && (str.equals("grouper") || str.equals("tilapia"))) {
                    return "Nexus 7 (2012)";
                }
                if (str != null && (str.equals("deb") || str.equals("flo"))) {
                    return "Nexus 7 (2013)";
                }
                if (str != null && str.equals("sailfish")) {
                    return "Pixel";
                }
                if (str != null && str.equals("dragon")) {
                    return "Pixel C";
                }
                if (str != null && str.equals("marlin")) {
                    return "Pixel XL";
                }
                if (str != null && str.equals("flounder")) {
                    return "Nexus 9";
                }
                if (str != null && str.equals("angler")) {
                    return "Nexus 6P";
                }
                if (str == null || !str.equals("g2")) {
                    if (str2 != null && (str2.equals("LG-D800") || str2.equals("LG-D801") || str2.equals("LG-D802") || str2.equals("LG-D802T") || str2.equals("LG-D802TR") || str2.equals("LG-D803") || str2.equals("LG-D805") || str2.equals("LG-D806") || str2.equals("LG-F320K") || str2.equals("LG-F320L") || str2.equals("LG-F320S") || str2.equals("LG-LS980") || str2.equals("VS980 4G"))) {
                        return "LG G2";
                    }
                    if (str == null || !str.equals("g3")) {
                        if (str2 != null && (str2.equals("AS985") || str2.equals("LG-AS990") || str2.equals("LG-D850") || str2.equals("LG-D851") || str2.equals("LG-D852") || str2.equals("LG-D852G") || str2.equals("LG-D855") || str2.equals("LG-D856") || str2.equals("LG-D857") || str2.equals("LG-D858") || str2.equals("LG-D858HK") || str2.equals("LG-D859") || str2.equals("LG-F400K") || str2.equals("LG-F400L") || str2.equals("LG-F400S") || str2.equals("LGL24") || str2.equals("LGLS990") || str2.equals("LGUS990") || str2.equals("LGV31") || str2.equals("VS985 4G"))) {
                            return "LG G3";
                        }
                        if (str == null || !str.equals("p1")) {
                            if (str2 != null && (str2.equals("AS986") || str2.equals("LG-AS811") || str2.equals("LG-AS991") || str2.equals("LG-F500K") || str2.equals("LG-F500L") || str2.equals("LG-F500S") || str2.equals("LG-H810") || str2.equals("LG-H811") || str2.equals("LG-H812") || str2.equals("LG-H815") || str2.equals("LG-H818") || str2.equals("LG-H819") || str2.equals("LGLS991") || str2.equals("LGUS991") || str2.equals("LGV32") || str2.equals("VS986"))) {
                                return "LG G4";
                            }
                            if (str == null || !str.equals("h1")) {
                                if (str2 != null && (str2.equals("LG-F700K") || str2.equals("LG-F700L") || str2.equals("LG-F700S") || str2.equals("LG-H820") || str2.equals("LG-H820PR") || str2.equals("LG-H830") || str2.equals("LG-H831") || str2.equals("LG-H850") || str2.equals("LG-H858") || str2.equals("LG-H860") || str2.equals("LG-H868") || str2.equals("LGAS992") || str2.equals("LGLS992") || str2.equals("LGUS992") || str2.equals("RS988") || str2.equals("VS987"))) {
                                    return "LG G5";
                                }
                                if (str == null || !str.equals("lucye")) {
                                    if (str2 != null && (str2.equals("LG-AS993") || str2.equals("LG-H870") || str2.equals("LG-H870AR") || str2.equals("LG-H870DS") || str2.equals("LG-H870S") || str2.equals("LG-H871") || str2.equals("LG-H872") || str2.equals("LG-H872PR") || str2.equals("LG-H873") || str2.equals("LG-LS993") || str2.equals("LGM-G600K") || str2.equals("LGM-G600L") || str2.equals("LGM-G600S") || str2.equals("LGUS997") || str2.equals("VS988"))) {
                                        return "LG G6";
                                    }
                                    if (str != null && str.equals("mako")) {
                                        return "Nexus 4";
                                    }
                                    if (str != null && str.equals("hammerhead")) {
                                        return "Nexus 5";
                                    }
                                    if (str != null && str.equals("bullhead")) {
                                        return "Nexus 5X";
                                    }
                                    if (str != null && str.equals("shamu")) {
                                        return "Nexus 6";
                                    }
                                    if ((str != null && str.equals("OnePlus")) || (str2 != null && str2.equals("ONE E1003"))) {
                                        return "OnePlus";
                                    }
                                    if ((str != null && str.equals("OnePlus2")) || (str2 != null && str2.equals("ONE A2003"))) {
                                        return "OnePlus2";
                                    }
                                    if ((str != null && str.equals("OnePlus3")) || (str2 != null && str2.equals("ONEPLUS A3000"))) {
                                        return "OnePlus3";
                                    }
                                    if ((str != null && str.equals("OnePlus5")) || (str2 != null && str2.equals("ONEPLUS A5000"))) {
                                        return "OnePlus5";
                                    }
                                    if (str == null || (!str.equals("a53g") && !str.equals("a5lte") && !str.equals("a5ltechn") && !str.equals("a5ltectc") && !str.equals("a5ltezh") && !str.equals("a5ltezt") && !str.equals("a5ulte") && !str.equals("a5ultebmc") && !str.equals("a5ultektt") && !str.equals("a5ultelgt") && !str.equals("a5ulteskt"))) {
                                        if (str2 != null && (str2.equals("SM-A5000") || str2.equals("SM-A5009") || str2.equals("SM-A500F") || str2.equals("SM-A500F1") || str2.equals("SM-A500FU") || str2.equals("SM-A500G") || str2.equals("SM-A500H") || str2.equals("SM-A500K") || str2.equals("SM-A500L") || str2.equals("SM-A500M") || str2.equals("SM-A500S") || str2.equals("SM-A500W") || str2.equals("SM-A500X") || str2.equals("SM-A500XZ") || str2.equals("SM-A500Y") || str2.equals("SM-A500YZ"))) {
                                            return "Galaxy A5";
                                        }
                                        if (str == null || !str.equals("vivaltods5m")) {
                                            if (str2 != null && (str2.equals("SM-G313HU") || str2.equals("SM-G313HY") || str2.equals("SM-G313M") || str2.equals("SM-G313MY"))) {
                                                return "Galaxy Ace 4";
                                            }
                                            if (str == null || (!str.equals("GT-S6352") && !str.equals("GT-S6802") && !str.equals("GT-S6802B") && !str.equals("SCH-I579") && !str.equals("SCH-I589") && !str.equals("SCH-i579") && !str.equals("SCH-i589"))) {
                                                if (str2 != null && (str2.equals("GT-S6352") || str2.equals("GT-S6802") || str2.equals("GT-S6802B") || str2.equals("SCH-I589") || str2.equals("SCH-i579") || str2.equals("SCH-i589"))) {
                                                    return "Galaxy Ace Duos";
                                                }
                                                if (str == null || (!str.equals("GT-S7500") && !str.equals("GT-S7500L") && !str.equals("GT-S7500T") && !str.equals("GT-S7500W") && !str.equals("GT-S7508"))) {
                                                    if (str2 != null && (str2.equals("GT-S7500") || str2.equals("GT-S7500L") || str2.equals("GT-S7500T") || str2.equals("GT-S7500W") || str2.equals("GT-S7508"))) {
                                                        return "Galaxy Ace Plus";
                                                    }
                                                    if (str == null || (!str.equals("heat3gtfnvzw") && !str.equals("heatnfc3g") && !str.equals("heatqlte"))) {
                                                        if (str2 != null && (str2.equals("SM-G310HN") || str2.equals("SM-G357FZ") || str2.equals("SM-S765C") || str2.equals("SM-S766C"))) {
                                                            return "Galaxy Ace Style";
                                                        }
                                                        if (str == null || (!str.equals("vivalto3g") && !str.equals("vivalto3mve3g") && !str.equals("vivalto5mve3g") && !str.equals("vivaltolte") && !str.equals("vivaltonfc3g"))) {
                                                            if (str2 != null && (str2.equals("SM-G313F") || str2.equals("SM-G313HN") || str2.equals("SM-G313ML") || str2.equals("SM-G313MU") || str2.equals("SM-G316H") || str2.equals("SM-G316HU") || str2.equals("SM-G316M") || str2.equals("SM-G316MY"))) {
                                                                return "Galaxy Ace4";
                                                            }
                                                            if (str == null || (!str.equals("core33g") && !str.equals("coreprimelte") && !str.equals("coreprimelteaio") && !str.equals("coreprimeltelra") && !str.equals("coreprimeltespr") && !str.equals("coreprimeltetfnvzw") && !str.equals("coreprimeltevzw") && !str.equals("coreprimeve3g") && !str.equals("coreprimevelte") && !str.equals("cprimeltemtr") && !str.equals("cprimeltetmo") && !str.equals("rossalte") && !str.equals("rossaltectc") && !str.equals("rossaltexsa"))) {
                                                                if (str2 != null && (str2.equals("SAMSUNG-SM-G360AZ") || str2.equals("SM-G3606") || str2.equals("SM-G3608") || str2.equals("SM-G3609") || str2.equals("SM-G360F") || str2.equals("SM-G360FY") || str2.equals("SM-G360GY") || str2.equals("SM-G360H") || str2.equals("SM-G360HU") || str2.equals("SM-G360M") || str2.equals("SM-G360P") || str2.equals("SM-G360R6") || str2.equals("SM-G360T") || str2.equals("SM-G360T1") || str2.equals("SM-G360V") || str2.equals("SM-G361F") || str2.equals("SM-G361H") || str2.equals("SM-G361HU") || str2.equals("SM-G361M") || str2.equals("SM-S820L"))) {
                                                                    return "Galaxy Core Prime";
                                                                }
                                                                if (str == null || (!str.equals("kanas") && !str.equals("kanas3g") && !str.equals("kanas3gcmcc") && !str.equals("kanas3gctc") && !str.equals("kanas3gnfc"))) {
                                                                    if (str2 != null && (str2.equals("SM-G3556D") || str2.equals("SM-G3558") || str2.equals("SM-G3559") || str2.equals("SM-G355H") || str2.equals("SM-G355HN") || str2.equals("SM-G355HQ") || str2.equals("SM-G355M"))) {
                                                                        return "Galaxy Core2";
                                                                    }
                                                                    if (str == null || (!str.equals("e53g") && !str.equals("e5lte") && !str.equals("e5ltetfnvzw") && !str.equals("e5ltetw"))) {
                                                                        if (str2 != null && (str2.equals("SM-E500F") || str2.equals("SM-E500H") || str2.equals("SM-E500M") || str2.equals("SM-E500YZ") || str2.equals("SM-S978L"))) {
                                                                            return "Galaxy E5";
                                                                        }
                                                                        if (str == null || (!str.equals("e73g") && !str.equals("e7lte") && !str.equals("e7ltechn") && !str.equals("e7ltectc") && !str.equals("e7ltehktw"))) {
                                                                            if (str2 != null && (str2.equals("SM-E7000") || str2.equals("SM-E7009") || str2.equals("SM-E700F") || str2.equals("SM-E700H") || str2.equals("SM-E700M"))) {
                                                                                return "Galaxy E7";
                                                                            }
                                                                            if (str == null || (!str.equals("SCH-I629") && !str.equals("nevis") && !str.equals("nevis3g") && !str.equals("nevis3gcmcc") && !str.equals("nevisds") && !str.equals("nevisnvess") && !str.equals("nevisp") && !str.equals("nevisvess") && !str.equals("nevisw"))) {
                                                                                if (str2 != null && (str2.equals("GT-S6790") || str2.equals("GT-S6790E") || str2.equals("GT-S6790L") || str2.equals("GT-S6790N") || str2.equals("GT-S6810") || str2.equals("GT-S6810B") || str2.equals("GT-S6810E") || str2.equals("GT-S6810L") || str2.equals("GT-S6810M") || str2.equals("GT-S6810P") || str2.equals("GT-S6812") || str2.equals("GT-S6812B") || str2.equals("GT-S6812C") || str2.equals("GT-S6812i") || str2.equals("GT-S6818") || str2.equals("GT-S6818V") || str2.equals("SCH-I629"))) {
                                                                                    return "Galaxy Fame";
                                                                                }
                                                                                if (str == null || !str.equals("grandprimelteatt")) {
                                                                                    if (str2 != null && str2.equals("SAMSUNG-SM-G530A")) {
                                                                                        return "Galaxy Go Prime";
                                                                                    }
                                                                                    if (str == null || (!str.equals("baffinlite") && !str.equals("baffinlitedtv") && !str.equals("baffinq3g"))) {
                                                                                        if (str2 != null && (str2.equals("GT-I9060") || str2.equals("GT-I9060L") || str2.equals("GT-I9063T") || str2.equals("GT-I9082C") || str2.equals("GT-I9168") || str2.equals("GT-I9168I"))) {
                                                                                            return "Galaxy Grand Neo";
                                                                                        }
                                                                                        if (str == null || (!str.equals("fortuna3g") && !str.equals("fortuna3gdtv") && !str.equals("fortunalte") && !str.equals("fortunaltectc") && !str.equals("fortunaltezh") && !str.equals("fortunaltezt") && !str.equals("fortunave3g") && !str.equals("gprimelteacg") && !str.equals("gprimeltecan") && !str.equals("gprimeltemtr") && !str.equals("gprimeltespr") && !str.equals("gprimeltetfnvzw") && !str.equals("gprimeltetmo") && !str.equals("gprimelteusc") && !str.equals("grandprimelte") && !str.equals("grandprimelteaio") && !str.equals("grandprimeve3g") && !str.equals("grandprimeve3gdtv") && !str.equals("grandprimevelte") && !str.equals("grandprimevelteltn") && !str.equals("grandprimeveltezt"))) {
                                                                                            if (str2 != null && (str2.equals("SAMSUNG-SM-G530AZ") || str2.equals("SM-G5306W") || str2.equals("SM-G5308W") || str2.equals("SM-G5309W") || str2.equals("SM-G530BT") || str2.equals("SM-G530F") || str2.equals("SM-G530FZ") || str2.equals("SM-G530H") || str2.equals("SM-G530M") || str2.equals("SM-G530MU") || str2.equals("SM-G530P") || str2.equals("SM-G530R4") || str2.equals("SM-G530R7") || str2.equals("SM-G530T") || str2.equals("SM-G530T1") || str2.equals("SM-G530W") || str2.equals("SM-G530Y") || str2.equals("SM-G531BT") || str2.equals("SM-G531F") || str2.equals("SM-G531H") || str2.equals("SM-G531M") || str2.equals("SM-G531Y") || str2.equals("SM-S920L") || str2.equals("gprimelteacg"))) {
                                                                                                return "Galaxy Grand Prime";
                                                                                            }
                                                                                            if (str == null || (!str.equals("ms013g") && !str.equals("ms013gdtv") && !str.equals("ms013gss") && !str.equals("ms01lte") && !str.equals("ms01ltektt") && !str.equals("ms01ltelgt") && !str.equals("ms01lteskt"))) {
                                                                                                if (str2 != null && (str2.equals("SM-G710") || str2.equals("SM-G7102") || str2.equals("SM-G7102T") || str2.equals("SM-G7105") || str2.equals("SM-G7105H") || str2.equals("SM-G7105L") || str2.equals("SM-G7106") || str2.equals("SM-G7108") || str2.equals("SM-G7109") || str2.equals("SM-G710K") || str2.equals("SM-G710L") || str2.equals("SM-G710S"))) {
                                                                                                    return "Galaxy Grand2";
                                                                                                }
                                                                                                if (str == null || (!str.equals("j13g") && !str.equals("j13gtfnvzw") && !str.equals("j1lte") && !str.equals("j1nlte") && !str.equals("j1qltevzw") && !str.equals("j1xlte") && !str.equals("j1xlteaio") && !str.equals("j1xlteatt") && !str.equals("j1xltecan") && !str.equals("j1xqltespr") && !str.equals("j1xqltetfnvzw"))) {
                                                                                                    if (str2 != null && (str2.equals("SAMSUNG-SM-J120A") || str2.equals("SAMSUNG-SM-J120AZ") || str2.equals("SM-J100F") || str2.equals("SM-J100FN") || str2.equals("SM-J100G") || str2.equals("SM-J100H") || str2.equals("SM-J100M") || str2.equals("SM-J100ML") || str2.equals("SM-J100MU") || str2.equals("SM-J100VPP") || str2.equals("SM-J100Y") || str2.equals("SM-J120F") || str2.equals("SM-J120FN") || str2.equals("SM-J120M") || str2.equals("SM-J120P") || str2.equals("SM-J120W") || str2.equals("SM-S120VL") || str2.equals("SM-S777C"))) {
                                                                                                        return "Galaxy J1";
                                                                                                    }
                                                                                                    if (str == null || (!str.equals("j1acelte") && !str.equals("j1acelteltn") && !str.equals("j1acevelte") && !str.equals("j1pop3g"))) {
                                                                                                        if (str2 != null && (str2.equals("SM-J110F") || str2.equals("SM-J110G") || str2.equals("SM-J110H") || str2.equals("SM-J110L") || str2.equals("SM-J110M") || str2.equals("SM-J111F") || str2.equals("SM-J111M"))) {
                                                                                                            return "Galaxy J1 Ace";
                                                                                                        }
                                                                                                        if (str == null || (!str.equals("j53g") && !str.equals("j5lte") && !str.equals("j5ltechn") && !str.equals("j5ltekx") && !str.equals("j5nlte") && !str.equals("j5ylte"))) {
                                                                                                            if (str2 != null && (str2.equals("SM-J5007") || str2.equals("SM-J5008") || str2.equals("SM-J500F") || str2.equals("SM-J500FN") || str2.equals("SM-J500G") || str2.equals("SM-J500H") || str2.equals("SM-J500M") || str2.equals("SM-J500N0") || str2.equals("SM-J500Y"))) {
                                                                                                                return "Galaxy J5";
                                                                                                            }
                                                                                                            if (str == null || (!str.equals("j75ltektt") && !str.equals("j7e3g") && !str.equals("j7elte") && !str.equals("j7ltechn"))) {
                                                                                                                if (str2 != null && (str2.equals("SM-J7008") || str2.equals("SM-J700F") || str2.equals("SM-J700H") || str2.equals("SM-J700K") || str2.equals("SM-J700M"))) {
                                                                                                                    return "Galaxy J7";
                                                                                                                }
                                                                                                                if (str == null || (!str.equals("maguro") && !str.equals("toro") && !str.equals("toroplus"))) {
                                                                                                                    if (str2 != null && str2.equals("Galaxy X")) {
                                                                                                                        return "Galaxy Nexus";
                                                                                                                    }
                                                                                                                    if (str == null || (!str.equals("lt033g") && !str.equals("lt03ltektt") && !str.equals("lt03ltelgt") && !str.equals("lt03lteskt") && !str.equals("p4notelte") && !str.equals("p4noteltektt") && !str.equals("p4noteltelgt") && !str.equals("p4notelteskt") && !str.equals("p4noteltespr") && !str.equals("p4notelteusc") && !str.equals("p4noteltevzw") && !str.equals("p4noterf") && !str.equals("p4noterfktt") && !str.equals("p4notewifi") && !str.equals("p4notewifi43241any") && !str.equals("p4notewifiany") && !str.equals("p4notewifiktt") && !str.equals("p4notewifiww"))) {
                                                                                                                        if (str2 != null && (str2.equals("GT-N8000") || str2.equals("GT-N8005") || str2.equals("GT-N8010") || str2.equals("GT-N8013") || str2.equals("GT-N8020") || str2.equals("SCH-I925") || str2.equals("SCH-I925U") || str2.equals("SHV-E230K") || str2.equals("SHV-E230L") || str2.equals("SHV-E230S") || str2.equals("SHW-M480K") || str2.equals("SHW-M480W") || str2.equals("SHW-M485W") || str2.equals("SHW-M486W") || str2.equals("SM-P601") || str2.equals("SM-P602") || str2.equals("SM-P605K") || str2.equals("SM-P605L") || str2.equals("SM-P605S") || str2.equals("SPH-P600"))) {
                                                                                                                            return "Galaxy Note 10.1";
                                                                                                                        }
                                                                                                                        if (str == null || (!str.equals("SC-01G") && !str.equals("SCL24") && !str.equals("tbeltektt") && !str.equals("tbeltelgt") && !str.equals("tbelteskt") && !str.equals("tblte") && !str.equals("tblteatt") && !str.equals("tbltecan") && !str.equals("tbltechn") && !str.equals("tbltespr") && !str.equals("tbltetmo") && !str.equals("tblteusc") && !str.equals("tbltevzw"))) {
                                                                                                                            if (str2 != null && (str2.equals("SAMSUNG-SM-N915A") || str2.equals("SC-01G") || str2.equals("SCL24") || str2.equals("SM-N9150") || str2.equals("SM-N915F") || str2.equals("SM-N915FY") || str2.equals("SM-N915G") || str2.equals("SM-N915K") || str2.equals("SM-N915L") || str2.equals("SM-N915P") || str2.equals("SM-N915R4") || str2.equals("SM-N915S") || str2.equals("SM-N915T") || str2.equals("SM-N915T3") || str2.equals("SM-N915V") || str2.equals("SM-N915W8") || str2.equals("SM-N915X"))) {
                                                                                                                                return "Galaxy Note Edge";
                                                                                                                            }
                                                                                                                            if (str == null || (!str.equals("v1a3g") && !str.equals("v1awifi") && !str.equals("v1awifikx") && !str.equals("viennalte") && !str.equals("viennalteatt") && !str.equals("viennaltekx") && !str.equals("viennaltevzw"))) {
                                                                                                                                if (str2 != null && (str2.equals("SAMSUNG-SM-P907A") || str2.equals("SM-P900") || str2.equals("SM-P901") || str2.equals("SM-P905") || str2.equals("SM-P905F0") || str2.equals("SM-P905M") || str2.equals("SM-P905V"))) {
                                                                                                                                    return "Galaxy Note Pro 12.2";
                                                                                                                                }
                                                                                                                                if (str == null || (!str.equals("tre3caltektt") && !str.equals("tre3caltelgt") && !str.equals("tre3calteskt") && !str.equals("tre3g") && !str.equals("trelte") && !str.equals("treltektt") && !str.equals("treltelgt") && !str.equals("trelteskt") && !str.equals("trhplte") && !str.equals("trlte") && !str.equals("trlteatt") && !str.equals("trltecan") && !str.equals("trltechn") && !str.equals("trltechnzh") && !str.equals("trltespr") && !str.equals("trltetmo") && !str.equals("trlteusc") && !str.equals("trltevzw"))) {
                                                                                                                                    if (str2 != null && (str2.equals("SAMSUNG-SM-N910A") || str2.equals("SM-N9100") || str2.equals("SM-N9106W") || str2.equals("SM-N9108V") || str2.equals("SM-N9109W") || str2.equals("SM-N910C") || str2.equals("SM-N910F") || str2.equals("SM-N910G") || str2.equals("SM-N910H") || str2.equals("SM-N910K") || str2.equals("SM-N910L") || str2.equals("SM-N910P") || str2.equals("SM-N910R4") || str2.equals("SM-N910S") || str2.equals("SM-N910T") || str2.equals("SM-N910T2") || str2.equals("SM-N910T3") || str2.equals("SM-N910U") || str2.equals("SM-N910V") || str2.equals("SM-N910W8") || str2.equals("SM-N910X") || str2.equals("SM-N916K") || str2.equals("SM-N916L") || str2.equals("SM-N916S"))) {
                                                                                                                                        return "Galaxy Note4";
                                                                                                                                    }
                                                                                                                                    if (str == null || (!str.equals("noblelte") && !str.equals("noblelteacg") && !str.equals("noblelteatt") && !str.equals("nobleltebmc") && !str.equals("nobleltechn") && !str.equals("nobleltecmcc") && !str.equals("nobleltehk") && !str.equals("nobleltektt") && !str.equals("nobleltelgt") && !str.equals("nobleltelra") && !str.equals("noblelteskt") && !str.equals("nobleltespr") && !str.equals("nobleltetmo") && !str.equals("noblelteusc") && !str.equals("nobleltevzw"))) {
                                                                                                                                        if (str2 != null && (str2.equals("SAMSUNG-SM-N920A") || str2.equals("SM-N9200") || str2.equals("SM-N9208") || str2.equals("SM-N920C") || str2.equals("SM-N920F") || str2.equals("SM-N920G") || str2.equals("SM-N920I") || str2.equals("SM-N920K") || str2.equals("SM-N920L") || str2.equals("SM-N920P") || str2.equals("SM-N920R4") || str2.equals("SM-N920R6") || str2.equals("SM-N920R7") || str2.equals("SM-N920S") || str2.equals("SM-N920T") || str2.equals("SM-N920V") || str2.equals("SM-N920W8") || str2.equals("SM-N920X"))) {
                                                                                                                                            return "Galaxy Note5";
                                                                                                                                        }
                                                                                                                                        if (str == null || (!str.equals("SC-01J") && !str.equals("SCV34") && !str.equals("gracelte") && !str.equals("graceltektt") && !str.equals("graceltelgt") && !str.equals("gracelteskt") && !str.equals("graceqlteacg") && !str.equals("graceqlteatt") && !str.equals("graceqltebmc") && !str.equals("graceqltechn") && !str.equals("graceqltedcm") && !str.equals("graceqltelra") && !str.equals("graceqltespr") && !str.equals("graceqltetfnvzw") && !str.equals("graceqltetmo") && !str.equals("graceqlteue") && !str.equals("graceqlteusc") && !str.equals("graceqltevzw"))) {
                                                                                                                                            if (str2 != null && (str2.equals("SAMSUNG-SM-N930A") || str2.equals("SC-01J") || str2.equals("SCV34") || str2.equals("SGH-N037") || str2.equals("SM-N9300") || str2.equals("SM-N930F") || str2.equals("SM-N930K") || str2.equals("SM-N930L") || str2.equals("SM-N930P") || str2.equals("SM-N930R4") || str2.equals("SM-N930R6") || str2.equals("SM-N930R7") || str2.equals("SM-N930S") || str2.equals("SM-N930T") || str2.equals("SM-N930U") || str2.equals("SM-N930V") || str2.equals("SM-N930VL") || str2.equals("SM-N930W8") || str2.equals("SM-N930X"))) {
                                                                                                                                                return "Galaxy Note7";
                                                                                                                                            }
                                                                                                                                            if (str == null || (!str.equals("greatlte") && !str.equals("greatlteks") && !str.equals("greatqlte") && !str.equals("greatqltechn") && !str.equals("greatqltecmcc") && !str.equals("greatqltecs") && !str.equals("greatqlteue"))) {
                                                                                                                                                if (str2 != null && (str2.equals("SM-N9500") || str2.equals("SM-N9508") || str2.equals("SM-N950F") || str2.equals("SM-N950N") || str2.equals("SM-N950U") || str2.equals("SM-N950U1") || str2.equals("SM-N950W"))) {
                                                                                                                                                    return "Galaxy Note8";
                                                                                                                                                }
                                                                                                                                                if (str == null || (!str.equals("o5lte") && !str.equals("o5ltechn") && !str.equals("o5prolte") && !str.equals("on5ltemtr") && !str.equals("on5ltetfntmo") && !str.equals("on5ltetmo"))) {
                                                                                                                                                    if (str2 != null && (str2.equals("SM-G5500") || str2.equals("SM-G550FY") || str2.equals("SM-G550T") || str2.equals("SM-G550T1") || str2.equals("SM-G550T2") || str2.equals("SM-S550TL"))) {
                                                                                                                                                        return "Galaxy On5";
                                                                                                                                                    }
                                                                                                                                                    if (str == null || (!str.equals("o7lte") && !str.equals("o7ltechn") && !str.equals("on7elte"))) {
                                                                                                                                                        if (str2 != null && (str2.equals("SM-G6000") || str2.equals("SM-G600F") || str2.equals("SM-G600FY"))) {
                                                                                                                                                            return "Galaxy On7";
                                                                                                                                                        }
                                                                                                                                                        if (str == null || (!str.equals("kylechn") && !str.equals("kyleopen") && !str.equals("kyletdcmcc"))) {
                                                                                                                                                            if (str2 != null && (str2.equals("GT-S7562") || str2.equals("GT-S7568"))) {
                                                                                                                                                                return "Galaxy S Duos";
                                                                                                                                                            }
                                                                                                                                                            if (str == null || !str.equals("kyleprods")) {
                                                                                                                                                                if (str2 != null && (str2.equals("GT-S7582") || str2.equals("GT-S7582L"))) {
                                                                                                                                                                    return "Galaxy S Duos2";
                                                                                                                                                                }
                                                                                                                                                                if (str == null || !str.equals("vivalto3gvn")) {
                                                                                                                                                                    if (str2 != null && str2.equals("SM-G313HZ")) {
                                                                                                                                                                        return "Galaxy S Duos3";
                                                                                                                                                                    }
                                                                                                                                                                    if (str == null || (!str.equals("SC-03E") && !str.equals("c1att") && !str.equals("c1ktt") && !str.equals("c1lgt") && !str.equals("c1skt") && !str.equals("d2att") && !str.equals("d2can") && !str.equals("d2cri") && !str.equals("d2dcm") && !str.equals("d2lteMetroPCS") && !str.equals("d2lterefreshspr") && !str.equals("d2ltetmo") && !str.equals("d2mtr") && !str.equals("d2spi") && !str.equals("d2spr") && !str.equals("d2tfnspr") && !str.equals("d2tfnvzw") && !str.equals("d2tmo") && !str.equals("d2usc") && !str.equals("d2vmu") && !str.equals("d2vzw") && !str.equals("d2xar") && !str.equals("m0") && !str.equals("m0apt") && !str.equals("m0chn") && !str.equals("m0cmcc") && !str.equals("m0ctc") && !str.equals("m0ctcduos") && !str.equals("m0skt") && !str.equals("m3") && !str.equals("m3dcm"))) {
                                                                                                                                                                        if (str2 != null && (str2.equals("GT-I9300") || str2.equals("GT-I9300T") || str2.equals("GT-I9305") || str2.equals("GT-I9305N") || str2.equals("GT-I9305T") || str2.equals("GT-I9308") || str2.equals("Gravity") || str2.equals("GravityQuad") || str2.equals("SAMSUNG-SGH-I747") || str2.equals("SC-03E") || str2.equals("SC-06D") || str2.equals("SCH-I535") || str2.equals("SCH-I535PP") || str2.equals("SCH-I939") || str2.equals("SCH-I939D") || str2.equals("SCH-L710") || str2.equals("SCH-R530C") || str2.equals("SCH-R530M") || str2.equals("SCH-R530U") || str2.equals("SCH-R530X") || str2.equals("SCH-S960L") || str2.equals("SCH-S968C") || str2.equals("SGH-I747M") || str2.equals("SGH-I748") || str2.equals("SGH-T999") || str2.equals("SGH-T999L") || str2.equals("SGH-T999N") || str2.equals("SGH-T999V") || str2.equals("SHV-E210K") || str2.equals("SHV-E210L") || str2.equals("SHV-E210S") || str2.equals("SHW-M440S") || str2.equals("SPH-L710") || str2.equals("SPH-L710T"))) {
                                                                                                                                                                            return "Galaxy S3";
                                                                                                                                                                        }
                                                                                                                                                                        if (str == null || (!str.equals("golden") && !str.equals("goldenlteatt") && !str.equals("goldenltebmc") && !str.equals("goldenltevzw") && !str.equals("goldenve3g"))) {
                                                                                                                                                                            if (str2 != null && (str2.equals("GT-I8190") || str2.equals("GT-I8190L") || str2.equals("GT-I8190N") || str2.equals("GT-I8190T") || str2.equals("GT-I8200L") || str2.equals("SAMSUNG-SM-G730A") || str2.equals("SM-G730V") || str2.equals("SM-G730W8"))) {
                                                                                                                                                                                return "Galaxy S3 Mini";
                                                                                                                                                                            }
                                                                                                                                                                            if (str == null || (!str.equals("goldenve3g") && !str.equals("goldenvess3g"))) {
                                                                                                                                                                                if (str2 != null && (str2.equals("GT-I8200") || str2.equals("GT-I8200N") || str2.equals("GT-I8200Q"))) {
                                                                                                                                                                                    return "Galaxy S3 Mini Value Edition";
                                                                                                                                                                                }
                                                                                                                                                                                if (str == null || (!str.equals("s3ve3g") && !str.equals("s3ve3gdd") && !str.equals("s3ve3gds") && !str.equals("s3ve3gdsdd"))) {
                                                                                                                                                                                    if (str2 != null && (str2.equals("GT-I9300I") || str2.equals("GT-I9301I") || str2.equals("GT-I9301Q"))) {
                                                                                                                                                                                        return "Galaxy S3 Neo";
                                                                                                                                                                                    }
                                                                                                                                                                                    if (str == null || (!str.equals("SC-04E") && !str.equals("ja3g") && !str.equals("ja3gduosctc") && !str.equals("jaltektt") && !str.equals("jaltelgt") && !str.equals("jalteskt") && !str.equals("jflte") && !str.equals("jflteMetroPCS") && !str.equals("jflteaio") && !str.equals("jflteatt") && !str.equals("jfltecan") && !str.equals("jfltecri") && !str.equals("jfltecsp") && !str.equals("jfltelra") && !str.equals("jflterefreshspr") && !str.equals("jfltespr") && !str.equals("jfltetfnatt") && !str.equals("jfltetfntmo") && !str.equals("jfltetmo") && !str.equals("jflteusc") && !str.equals("jfltevzw") && !str.equals("jfltevzwpp") && !str.equals("jftdd") && !str.equals("jfvelte") && !str.equals("jfwifi") && !str.equals("jsglte") && !str.equals("ks01lte") && !str.equals("ks01ltektt") && !str.equals("ks01ltelgt"))) {
                                                                                                                                                                                        if (str2 != null && (str2.equals("GT-I9500") || str2.equals("GT-I9505") || str2.equals("GT-I9505X") || str2.equals("GT-I9506") || str2.equals("GT-I9507") || str2.equals("GT-I9507V") || str2.equals("GT-I9508") || str2.equals("GT-I9508C") || str2.equals("GT-I9508V") || str2.equals("GT-I9515") || str2.equals("GT-I9515L") || str2.equals("SAMSUNG-SGH-I337") || str2.equals("SAMSUNG-SGH-I337Z") || str2.equals("SC-04E") || str2.equals("SCH-I545") || str2.equals("SCH-I545L") || str2.equals("SCH-I545PP") || str2.equals("SCH-I959") || str2.equals("SCH-R970") || str2.equals("SCH-R970C") || str2.equals("SCH-R970X") || str2.equals("SGH-I337M") || str2.equals("SGH-M919") || str2.equals("SGH-M919N") || str2.equals("SGH-M919V") || str2.equals("SGH-S970G") || str2.equals("SHV-E300K") || str2.equals("SHV-E300L") || str2.equals("SHV-E300S") || str2.equals("SHV-E330K") || str2.equals("SHV-E330L") || str2.equals("SM-S975L") || str2.equals("SPH-L720") || str2.equals("SPH-L720T"))) {
                                                                                                                                                                                            return "Galaxy S4";
                                                                                                                                                                                        }
                                                                                                                                                                                        if (str == null || (!str.equals("serrano3g") && !str.equals("serranods") && !str.equals("serranolte") && !str.equals("serranoltebmc") && !str.equals("serranoltektt") && !str.equals("serranoltekx") && !str.equals("serranoltelra") && !str.equals("serranoltespr") && !str.equals("serranolteusc") && !str.equals("serranoltevzw") && !str.equals("serranove3g") && !str.equals("serranovelte") && !str.equals("serranovolteatt"))) {
                                                                                                                                                                                            if (str2 != null && (str2.equals("GT-I9190") || str2.equals("GT-I9192") || str2.equals("GT-I9192I") || str2.equals("GT-I9195") || str2.equals("GT-I9195I") || str2.equals("GT-I9195L") || str2.equals("GT-I9195T") || str2.equals("GT-I9195X") || str2.equals("GT-I9197") || str2.equals("SAMSUNG-SGH-I257") || str2.equals("SCH-I435") || str2.equals("SCH-I435L") || str2.equals("SCH-R890") || str2.equals("SGH-I257M") || str2.equals("SHV-E370D") || str2.equals("SHV-E370K") || str2.equals("SPH-L520"))) {
                                                                                                                                                                                                return "Galaxy S4 Mini";
                                                                                                                                                                                            }
                                                                                                                                                                                            if (str == null || (!str.equals("SC-04F") && !str.equals("SCL23") && !str.equals("k3g") && !str.equals("klte") && !str.equals("klteMetroPCS") && !str.equals("klteacg") && !str.equals("klteaio") && !str.equals("klteatt") && !str.equals("kltecan") && !str.equals("klteduoszn") && !str.equals("kltektt") && !str.equals("kltelgt") && !str.equals("kltelra") && !str.equals("klteskt") && !str.equals("kltespr") && !str.equals("kltetfnvzw") && !str.equals("kltetmo") && !str.equals("klteusc") && !str.equals("kltevzw") && !str.equals("kwifi") && !str.equals("lentisltektt") && !str.equals("lentisltelgt") && !str.equals("lentislteskt"))) {
                                                                                                                                                                                                if (str2 != null && (str2.equals("SAMSUNG-SM-G900A") || str2.equals("SAMSUNG-SM-G900AZ") || str2.equals("SC-04F") || str2.equals("SCL23") || str2.equals("SM-G9006W") || str2.equals("SM-G9008W") || str2.equals("SM-G9009W") || str2.equals("SM-G900F") || str2.equals("SM-G900FQ") || str2.equals("SM-G900H") || str2.equals("SM-G900I") || str2.equals("SM-G900K") || str2.equals("SM-G900L") || str2.equals("SM-G900M") || str2.equals("SM-G900MD") || str2.equals("SM-G900P") || str2.equals("SM-G900R4") || str2.equals("SM-G900R6") || str2.equals("SM-G900R7") || str2.equals("SM-G900S") || str2.equals("SM-G900T") || str2.equals("SM-G900T1") || str2.equals("SM-G900T3") || str2.equals("SM-G900T4") || str2.equals("SM-G900V") || str2.equals("SM-G900W8") || str2.equals("SM-G900X") || str2.equals("SM-G906K") || str2.equals("SM-G906L") || str2.equals("SM-G906S") || str2.equals("SM-S903VL"))) {
                                                                                                                                                                                                    return "Galaxy S5";
                                                                                                                                                                                                }
                                                                                                                                                                                                if (str == null || (!str.equals("s5neolte") && !str.equals("s5neoltecan"))) {
                                                                                                                                                                                                    if (str2 != null && (str2.equals("SM-G903F") || str2.equals("SM-G903M") || str2.equals("SM-G903W"))) {
                                                                                                                                                                                                        return "Galaxy S5 Neo";
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (str == null || (!str.equals("SC-05G") && !str.equals("zeroflte") && !str.equals("zeroflteacg") && !str.equals("zeroflteaio") && !str.equals("zeroflteatt") && !str.equals("zerofltebmc") && !str.equals("zerofltechn") && !str.equals("zerofltectc") && !str.equals("zerofltektt") && !str.equals("zerofltelgt") && !str.equals("zerofltelra") && !str.equals("zerofltemtr") && !str.equals("zeroflteskt") && !str.equals("zerofltespr") && !str.equals("zerofltetfnvzw") && !str.equals("zerofltetmo") && !str.equals("zeroflteusc") && !str.equals("zerofltevzw"))) {
                                                                                                                                                                                                        if (str2 != null && (str2.equals("SAMSUNG-SM-G920A") || str2.equals("SAMSUNG-SM-G920AZ") || str2.equals("SC-05G") || str2.equals("SM-G9200") || str2.equals("SM-G9208") || str2.equals("SM-G9209") || str2.equals("SM-G920F") || str2.equals("SM-G920I") || str2.equals("SM-G920K") || str2.equals("SM-G920L") || str2.equals("SM-G920P") || str2.equals("SM-G920R4") || str2.equals("SM-G920R6") || str2.equals("SM-G920R7") || str2.equals("SM-G920S") || str2.equals("SM-G920T") || str2.equals("SM-G920T1") || str2.equals("SM-G920V") || str2.equals("SM-G920W8") || str2.equals("SM-G920X") || str2.equals("SM-S906L") || str2.equals("SM-S907VL"))) {
                                                                                                                                                                                                            return "Galaxy S6";
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (str == null || (!str.equals("404SC") && !str.equals("SC-04G") && !str.equals("SCV31") && !str.equals("zerolte") && !str.equals("zerolteacg") && !str.equals("zerolteatt") && !str.equals("zeroltebmc") && !str.equals("zeroltechn") && !str.equals("zeroltektt") && !str.equals("zeroltelgt") && !str.equals("zeroltelra") && !str.equals("zerolteskt") && !str.equals("zeroltespr") && !str.equals("zeroltetmo") && !str.equals("zerolteusc") && !str.equals("zeroltevzw"))) {
                                                                                                                                                                                                            if (str2 != null && (str2.equals("404SC") || str2.equals("SAMSUNG-SM-G925A") || str2.equals("SC-04G") || str2.equals("SCV31") || str2.equals("SM-G9250") || str2.equals("SM-G925F") || str2.equals("SM-G925I") || str2.equals("SM-G925K") || str2.equals("SM-G925L") || str2.equals("SM-G925P") || str2.equals("SM-G925R4") || str2.equals("SM-G925R6") || str2.equals("SM-G925R7") || str2.equals("SM-G925S") || str2.equals("SM-G925T") || str2.equals("SM-G925V") || str2.equals("SM-G925W8") || str2.equals("SM-G925X"))) {
                                                                                                                                                                                                                return "Galaxy S6 Edge";
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (str == null || (!str.equals("zenlte") && !str.equals("zenlteatt") && !str.equals("zenltebmc") && !str.equals("zenltechn") && !str.equals("zenltektt") && !str.equals("zenltekx") && !str.equals("zenltelgt") && !str.equals("zenlteskt") && !str.equals("zenltespr") && !str.equals("zenltetmo") && !str.equals("zenlteusc") && !str.equals("zenltevzw"))) {
                                                                                                                                                                                                                if (str2 != null && (str2.equals("SAMSUNG-SM-G928A") || str2.equals("SM-G9280") || str2.equals("SM-G9287") || str2.equals("SM-G9287C") || str2.equals("SM-G928C") || str2.equals("SM-G928F") || str2.equals("SM-G928G") || str2.equals("SM-G928I") || str2.equals("SM-G928K") || str2.equals("SM-G928L") || str2.equals("SM-G928N0") || str2.equals("SM-G928P") || str2.equals("SM-G928R4") || str2.equals("SM-G928S") || str2.equals("SM-G928T") || str2.equals("SM-G928V") || str2.equals("SM-G928W8") || str2.equals("SM-G928X"))) {
                                                                                                                                                                                                                    return "Galaxy S6 Edge+";
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (str == null || (!str.equals("herolte") && !str.equals("heroltebmc") && !str.equals("heroltektt") && !str.equals("heroltelgt") && !str.equals("herolteskt") && !str.equals("heroqlteacg") && !str.equals("heroqlteaio") && !str.equals("heroqlteatt") && !str.equals("heroqltecctvzw") && !str.equals("heroqltechn") && !str.equals("heroqltelra") && !str.equals("heroqltemtr") && !str.equals("heroqltespr") && !str.equals("heroqltetfnvzw") && !str.equals("heroqltetmo") && !str.equals("heroqlteue") && !str.equals("heroqlteusc") && !str.equals("heroqltevzw"))) {
                                                                                                                                                                                                                    if (str2 != null && (str2.equals("SAMSUNG-SM-G930A") || str2.equals("SAMSUNG-SM-G930AZ") || str2.equals("SM-G9300") || str2.equals("SM-G9308") || str2.equals("SM-G930F") || str2.equals("SM-G930K") || str2.equals("SM-G930L") || str2.equals("SM-G930P") || str2.equals("SM-G930R4") || str2.equals("SM-G930R6") || str2.equals("SM-G930R7") || str2.equals("SM-G930S") || str2.equals("SM-G930T") || str2.equals("SM-G930T1") || str2.equals("SM-G930U") || str2.equals("SM-G930V") || str2.equals("SM-G930VC") || str2.equals("SM-G930VL") || str2.equals("SM-G930W8") || str2.equals("SM-G930X"))) {
                                                                                                                                                                                                                        return "Galaxy S7";
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (str == null || (!str.equals("SC-02H") && !str.equals("SCV33") && !str.equals("hero2lte") && !str.equals("hero2ltebmc") && !str.equals("hero2ltektt") && !str.equals("hero2ltelgt") && !str.equals("hero2lteskt") && !str.equals("hero2qlteatt") && !str.equals("hero2qltecctvzw") && !str.equals("hero2qltechn") && !str.equals("hero2qltespr") && !str.equals("hero2qltetmo") && !str.equals("hero2qlteue") && !str.equals("hero2qlteusc") && !str.equals("hero2qltevzw"))) {
                                                                                                                                                                                                                        if (str2 != null && (str2.equals("SAMSUNG-SM-G935A") || str2.equals("SC-02H") || str2.equals("SCV33") || str2.equals("SM-G9350") || str2.equals("SM-G935F") || str2.equals("SM-G935K") || str2.equals("SM-G935L") || str2.equals("SM-G935P") || str2.equals("SM-G935R4") || str2.equals("SM-G935S") || str2.equals("SM-G935T") || str2.equals("SM-G935U") || str2.equals("SM-G935V") || str2.equals("SM-G935VC") || str2.equals("SM-G935W8") || str2.equals("SM-G935X"))) {
                                                                                                                                                                                                                            return "Galaxy S7 Edge";
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (str == null || (!str.equals("SC-02J") && !str.equals("SCV36") && !str.equals("dreamlte") && !str.equals("dreamlteks") && !str.equals("dreamqltecan") && !str.equals("dreamqltechn") && !str.equals("dreamqltecmcc") && !str.equals("dreamqltesq") && !str.equals("dreamqlteue"))) {
                                                                                                                                                                                                                            if (str2 != null && (str2.equals("SC-02J") || str2.equals("SCV36") || str2.equals("SM-G9500") || str2.equals("SM-G9508") || str2.equals("SM-G950F") || str2.equals("SM-G950N") || str2.equals("SM-G950U") || str2.equals("SM-G950U1") || str2.equals("SM-G950W"))) {
                                                                                                                                                                                                                                return "Galaxy S8";
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (str == null || (!str.equals("SC-03J") && !str.equals("SCV35") && !str.equals("dream2lte") && !str.equals("dream2lteks") && !str.equals("dream2qltecan") && !str.equals("dream2qltechn") && !str.equals("dream2qltesq") && !str.equals("dream2qlteue"))) {
                                                                                                                                                                                                                                if (str2 != null && (str2.equals("SC-03J") || str2.equals("SCV35") || str2.equals("SM-G9550") || str2.equals("SM-G955F") || str2.equals("SM-G955N") || str2.equals("SM-G955U") || str2.equals("SM-G955U1") || str2.equals("SM-G955W"))) {
                                                                                                                                                                                                                                    return "Galaxy S8+";
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (str == null || (!str.equals("GT-P7500") && !str.equals("GT-P7500D") && !str.equals("GT-P7503") && !str.equals("GT-P7510") && !str.equals("SC-01D") && !str.equals("SCH-I905") && !str.equals("SGH-T859") && !str.equals("SHW-M300W") && !str.equals("SHW-M380K") && !str.equals("SHW-M380S") && !str.equals("SHW-M380W"))) {
                                                                                                                                                                                                                                    if (str2 != null && (str2.equals("GT-P7500") || str2.equals("GT-P7500D") || str2.equals("GT-P7503") || str2.equals("GT-P7510") || str2.equals("SC-01D") || str2.equals("SCH-I905") || str2.equals("SGH-T859") || str2.equals("SHW-M300W") || str2.equals("SHW-M380K") || str2.equals("SHW-M380S") || str2.equals("SHW-M380W"))) {
                                                                                                                                                                                                                                        return "Galaxy Tab 10.1";
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (str == null || (!str.equals("GT-P6200") && !str.equals("GT-P6200L") && !str.equals("GT-P6201") && !str.equals("GT-P6210") && !str.equals("GT-P6211") && !str.equals("SC-02D") && !str.equals("SGH-T869") && !str.equals("SHW-M430W"))) {
                                                                                                                                                                                                                                        if (str2 != null && (str2.equals("GT-P6200") || str2.equals("GT-P6200L") || str2.equals("GT-P6201") || str2.equals("GT-P6210") || str2.equals("GT-P6211") || str2.equals("SC-02D") || str2.equals("SGH-T869") || str2.equals("SHW-M430W"))) {
                                                                                                                                                                                                                                            return "Galaxy Tab 7.0 Plus";
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (str == null || (!str.equals("gteslteatt") && !str.equals("gtesltebmc") && !str.equals("gtesltelgt") && !str.equals("gteslteskt") && !str.equals("gtesltetmo") && !str.equals("gtesltetw") && !str.equals("gtesltevzw") && !str.equals("gtesqltespr") && !str.equals("gtesqlteusc"))) {
                                                                                                                                                                                                                                            if (str2 != null && (str2.equals("SAMSUNG-SM-T377A") || str2.equals("SM-T375L") || str2.equals("SM-T375S") || str2.equals("SM-T3777") || str2.equals("SM-T377P") || str2.equals("SM-T377R4") || str2.equals("SM-T377T") || str2.equals("SM-T377V") || str2.equals("SM-T377W"))) {
                                                                                                                                                                                                                                                return "Galaxy Tab E 8.0";
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (str == null || (!str.equals("gtel3g") && !str.equals("gtelltevzw") && !str.equals("gtelwifi") && !str.equals("gtelwifichn") && !str.equals("gtelwifiue"))) {
                                                                                                                                                                                                                                                if (str2 != null && (str2.equals("SM-T560") || str2.equals("SM-T560NU") || str2.equals("SM-T561") || str2.equals("SM-T561M") || str2.equals("SM-T561Y") || str2.equals("SM-T562") || str2.equals("SM-T567V"))) {
                                                                                                                                                                                                                                                    return "Galaxy Tab E 9.6";
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (str == null || (!str.equals("403SC") && !str.equals("degas2wifi") && !str.equals("degas2wifibmwchn") && !str.equals("degas3g") && !str.equals("degaslte") && !str.equals("degasltespr") && !str.equals("degasltevzw") && !str.equals("degasvelte") && !str.equals("degasveltechn") && !str.equals("degaswifi") && !str.equals("degaswifibmwzc") && !str.equals("degaswifidtv") && !str.equals("degaswifiopenbnn") && !str.equals("degaswifiue"))) {
                                                                                                                                                                                                                                                    if (str2 != null && (str2.equals("403SC") || str2.equals("SM-T230") || str2.equals("SM-T230NT") || str2.equals("SM-T230NU") || str2.equals("SM-T230NW") || str2.equals("SM-T230NY") || str2.equals("SM-T230X") || str2.equals("SM-T231") || str2.equals("SM-T232") || str2.equals("SM-T235") || str2.equals("SM-T235Y") || str2.equals("SM-T237P") || str2.equals("SM-T237V") || str2.equals("SM-T239") || str2.equals("SM-T2397") || str2.equals("SM-T239C") || str2.equals("SM-T239M"))) {
                                                                                                                                                                                                                                                        return "Galaxy Tab4 7.0";
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (str == null || (!str.equals("gvlte") && !str.equals("gvlteatt") && !str.equals("gvltevzw") && !str.equals("gvltexsp") && !str.equals("gvwifijpn") && !str.equals("gvwifiue"))) {
                                                                                                                                                                                                                                                        if (str2 != null && (str2.equals("SAMSUNG-SM-T677A") || str2.equals("SM-T670") || str2.equals("SM-T677") || str2.equals("SM-T677V"))) {
                                                                                                                                                                                                                                                            return "Galaxy View";
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (str == null || (!str.equals("GT-S5360") && !str.equals("GT-S5360B") && !str.equals("GT-S5360L") && !str.equals("GT-S5360T") && !str.equals("GT-S5363") && !str.equals("GT-S5368") && !str.equals("GT-S5369") && !str.equals("SCH-I509") && !str.equals("SCH-i509"))) {
                                                                                                                                                                                                                                                            if (str2 != null && (str2.equals("GT-S5360") || str2.equals("GT-S5360B") || str2.equals("GT-S5360L") || str2.equals("GT-S5360T") || str2.equals("GT-S5363") || str2.equals("GT-S5368") || str2.equals("GT-S5369") || str2.equals("SCH-I509") || str2.equals("SCH-i509"))) {
                                                                                                                                                                                                                                                                return "Galaxy Y";
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (str != null && str.equals("manta")) {
                                                                                                                                                                                                                                                                return "Nexus 10";
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (str == null || (!str.equals("D2104") && !str.equals("D2105"))) {
                                                                                                                                                                                                                                                                if (str2 != null && (str2.equals("D2104") || str2.equals("D2105"))) {
                                                                                                                                                                                                                                                                    return "Xperia E1 dual";
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (str == null || (!str.equals("D2202") && !str.equals("D2203") && !str.equals("D2206") && !str.equals("D2243"))) {
                                                                                                                                                                                                                                                                    if (str2 != null && (str2.equals("D2202") || str2.equals("D2203") || str2.equals("D2206") || str2.equals("D2243"))) {
                                                                                                                                                                                                                                                                        return "Xperia E3";
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (str == null || (!str.equals("E5603") && !str.equals("E5606") && !str.equals("E5653"))) {
                                                                                                                                                                                                                                                                        if (str2 != null && (str2.equals("E5603") || str2.equals("E5606") || str2.equals("E5653"))) {
                                                                                                                                                                                                                                                                            return "Xperia M5";
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (str == null || (!str.equals("E5633") && !str.equals("E5643") && !str.equals("E5663"))) {
                                                                                                                                                                                                                                                                            if (str2 != null && (str2.equals("E5633") || str2.equals("E5643") || str2.equals("E5663"))) {
                                                                                                                                                                                                                                                                                return "Xperia M5 Dual";
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            if (str == null || !str.equals("LT26i")) {
                                                                                                                                                                                                                                                                                if (str2 != null && str2.equals("LT26i")) {
                                                                                                                                                                                                                                                                                    return "Xperia S";
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (str == null || (!str.equals("D5303") && !str.equals("D5306") && !str.equals("D5316") && !str.equals("D5316N") && !str.equals("D5322"))) {
                                                                                                                                                                                                                                                                                    if (str2 != null && (str2.equals("D5303") || str2.equals("D5306") || str2.equals("D5316") || str2.equals("D5316N") || str2.equals("D5322"))) {
                                                                                                                                                                                                                                                                                        return "Xperia T2 Ultra";
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (str == null || !str.equals("txs03")) {
                                                                                                                                                                                                                                                                                        if (str2 != null && (str2.equals("SGPT12") || str2.equals("SGPT13"))) {
                                                                                                                                                                                                                                                                                            return "Xperia Tablet S";
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        if (str == null || (!str.equals("SGP311") && !str.equals("SGP312") && !str.equals("SGP321") && !str.equals("SGP351"))) {
                                                                                                                                                                                                                                                                                            if (str2 != null && (str2.equals("SGP311") || str2.equals("SGP312") || str2.equals("SGP321") || str2.equals("SGP351"))) {
                                                                                                                                                                                                                                                                                                return "Xperia Tablet Z";
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            if (str == null || (!str.equals("D6502") && !str.equals("D6503") && !str.equals("D6543") && !str.equals("SO-03F"))) {
                                                                                                                                                                                                                                                                                                if (str2 != null && (str2.equals("D6502") || str2.equals("D6503") || str2.equals("D6543") || str2.equals("SO-03F"))) {
                                                                                                                                                                                                                                                                                                    return "Xperia Z2";
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                if (str == null || (!str.equals("401SO") && !str.equals("D6603") && !str.equals("D6616") && !str.equals("D6643") && !str.equals("D6646") && !str.equals("D6653") && !str.equals("SO-01G") && !str.equals("SOL26") && !str.equals("leo"))) {
                                                                                                                                                                                                                                                                                                    if (str2 != null && (str2.equals("401SO") || str2.equals("D6603") || str2.equals("D6616") || str2.equals("D6643") || str2.equals("D6646") || str2.equals("D6653") || str2.equals("SO-01G") || str2.equals("SOL26"))) {
                                                                                                                                                                                                                                                                                                        return "Xperia Z3";
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    if (str == null || (!str.equals("402SO") && !str.equals("SO-03G") && !str.equals("SOV31"))) {
                                                                                                                                                                                                                                                                                                        if (str2 != null && (str2.equals("402SO") || str2.equals("SO-03G") || str2.equals("SOV31"))) {
                                                                                                                                                                                                                                                                                                            return "Xperia Z4";
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        if (str == null || (!str.equals("E5803") && !str.equals("E5823") && !str.equals("SO-02H"))) {
                                                                                                                                                                                                                                                                                                            if (str2 != null && (str2.equals("E5803") || str2.equals("E5823") || str2.equals("SO-02H"))) {
                                                                                                                                                                                                                                                                                                                return "Xperia Z5 Compact";
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            if (str == null || (!str.equals("LT26i") && !str.equals("SO-02D"))) {
                                                                                                                                                                                                                                                                                                                if (str2 != null && (str2.equals("LT26i") || str2.equals("SO-02D"))) {
                                                                                                                                                                                                                                                                                                                    return "Xperia S";
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                if (str == null || !(str.equals("SGP311") || str.equals("SGP321") || str.equals("SGP341") || str.equals("SO-03E"))) {
                                                                                                                                                                                                                                                                                                                    return (str2 == null || !(str2.equals("SGP311") || str2.equals("SGP321") || str2.equals("SGP341") || str2.equals("SO-03E"))) ? str3 : "Xperia Tablet Z";
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                return "Xperia Tablet Z";
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            return "Xperia S";
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        return "Xperia Z5 Compact";
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    return "Xperia Z4";
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                return "Xperia Z3";
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            return "Xperia Z2";
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        return "Xperia Tablet Z";
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    return "Xperia Tablet S";
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                return "Xperia T2 Ultra";
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            return "Xperia S";
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        return "Xperia M5 Dual";
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    return "Xperia M5";
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                return "Xperia E3";
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            return "Xperia E1 dual";
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        return "Galaxy Y";
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    return "Galaxy View";
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                return "Galaxy Tab4 7.0";
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            return "Galaxy Tab E 9.6";
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        return "Galaxy Tab E 8.0";
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    return "Galaxy Tab 7.0 Plus";
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                return "Galaxy Tab 10.1";
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            return "Galaxy S8+";
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return "Galaxy S8";
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    return "Galaxy S7 Edge";
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return "Galaxy S7";
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return "Galaxy S6 Edge+";
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return "Galaxy S6 Edge";
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return "Galaxy S6";
                                                                                                                                                                                                }
                                                                                                                                                                                                return "Galaxy S5 Neo";
                                                                                                                                                                                            }
                                                                                                                                                                                            return "Galaxy S5";
                                                                                                                                                                                        }
                                                                                                                                                                                        return "Galaxy S4 Mini";
                                                                                                                                                                                    }
                                                                                                                                                                                    return "Galaxy S4";
                                                                                                                                                                                }
                                                                                                                                                                                return "Galaxy S3 Neo";
                                                                                                                                                                            }
                                                                                                                                                                            return "Galaxy S3 Mini Value Edition";
                                                                                                                                                                        }
                                                                                                                                                                        return "Galaxy S3 Mini";
                                                                                                                                                                    }
                                                                                                                                                                    return "Galaxy S3";
                                                                                                                                                                }
                                                                                                                                                                return "Galaxy S Duos3";
                                                                                                                                                            }
                                                                                                                                                            return "Galaxy S Duos2";
                                                                                                                                                        }
                                                                                                                                                        return "Galaxy S Duos";
                                                                                                                                                    }
                                                                                                                                                    return "Galaxy On7";
                                                                                                                                                }
                                                                                                                                                return "Galaxy On5";
                                                                                                                                            }
                                                                                                                                            return "Galaxy Note8";
                                                                                                                                        }
                                                                                                                                        return "Galaxy Note7";
                                                                                                                                    }
                                                                                                                                    return "Galaxy Note5";
                                                                                                                                }
                                                                                                                                return "Galaxy Note4";
                                                                                                                            }
                                                                                                                            return "Galaxy Note Pro 12.2";
                                                                                                                        }
                                                                                                                        return "Galaxy Note Edge";
                                                                                                                    }
                                                                                                                    return "Galaxy Note 10.1";
                                                                                                                }
                                                                                                                return "Galaxy Nexus";
                                                                                                            }
                                                                                                            return "Galaxy J7";
                                                                                                        }
                                                                                                        return "Galaxy J5";
                                                                                                    }
                                                                                                    return "Galaxy J1 Ace";
                                                                                                }
                                                                                                return "Galaxy J1";
                                                                                            }
                                                                                            return "Galaxy Grand2";
                                                                                        }
                                                                                        return "Galaxy Grand Prime";
                                                                                    }
                                                                                    return "Galaxy Grand Neo";
                                                                                }
                                                                                return "Galaxy Go Prime";
                                                                            }
                                                                            return "Galaxy Fame";
                                                                        }
                                                                        return "Galaxy E7";
                                                                    }
                                                                    return "Galaxy E5";
                                                                }
                                                                return "Galaxy Core2";
                                                            }
                                                            return "Galaxy Core Prime";
                                                        }
                                                        return "Galaxy Ace4";
                                                    }
                                                    return "Galaxy Ace Style";
                                                }
                                                return "Galaxy Ace Plus";
                                            }
                                            return "Galaxy Ace Duos";
                                        }
                                        return "Galaxy Ace 4";
                                    }
                                    return "Galaxy A5";
                                }
                                return "LG G6";
                            }
                            return "LG G5";
                        }
                        return "LG G4";
                    }
                    return "LG G3";
                }
                return "LG G2";
            }
            return "Liquid Zest Plus";
        }
        return "Liquid Jade Z";
    }
}
