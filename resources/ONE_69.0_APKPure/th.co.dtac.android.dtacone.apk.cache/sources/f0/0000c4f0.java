package device;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class DeviceName {

    /* renamed from: a */
    public static Context f61321a;

    /* loaded from: classes5.dex */
    public interface Callback {
        void onFinished(DeviceInfo deviceInfo, Exception exc);
    }

    /* loaded from: classes5.dex */
    public static final class DeviceInfo {
        public final String codename;
        @Deprecated
        public final String manufacturer;
        public final String marketName;
        public final String model;

        public String getName() {
            if (TextUtils.isEmpty(this.marketName)) {
                return DeviceName.m31790b(this.model);
            }
            return this.marketName;
        }

        public DeviceInfo(String str, String str2, String str3) {
            this(null, str, str2, str3);
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
        public final Context f61322a;

        /* renamed from: b */
        public final Handler f61323b;

        /* renamed from: c */
        public String f61324c;

        /* renamed from: d */
        public String f61325d;

        /* renamed from: device.DeviceName$Request$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10085a implements Runnable {

            /* renamed from: a */
            public final Callback f61326a;

            /* renamed from: b */
            public DeviceInfo f61327b;

            /* renamed from: c */
            public Exception f61328c;

            /* renamed from: device.DeviceName$Request$a$a */
            /* loaded from: classes5.dex */
            public class RunnableC10086a implements Runnable {
                public RunnableC10086a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    RunnableC10085a runnableC10085a = RunnableC10085a.this;
                    runnableC10085a.f61326a.onFinished(runnableC10085a.f61327b, runnableC10085a.f61328c);
                }
            }

            public RunnableC10085a(Callback callback) {
                this.f61326a = callback;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Request request = Request.this;
                    this.f61327b = DeviceName.getDeviceInfo(request.f61322a, request.f61324c, request.f61325d);
                } catch (Exception e) {
                    this.f61328c = e;
                }
                Request.this.f61323b.post(new RunnableC10086a());
            }
        }

        public void request(Callback callback) {
            if (this.f61324c == null && this.f61325d == null) {
                this.f61324c = Build.DEVICE;
                this.f61325d = Build.MODEL;
            }
            RunnableC10085a runnableC10085a = new RunnableC10085a(callback);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new Thread(runnableC10085a).start();
            } else {
                runnableC10085a.run();
            }
        }

        public Request setCodename(String str) {
            this.f61324c = str;
            return this;
        }

        public Request setModel(String str) {
            this.f61325d = str;
            return this;
        }

        public Request(Context context) {
            this.f61322a = context;
            this.f61323b = new Handler(context.getMainLooper());
        }
    }

    /* renamed from: b */
    public static String m31790b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : charArray) {
            if (z && Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
                z = false;
            } else {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static Context m31789c() {
        Context context = f61321a;
        if (context != null) {
            return context;
        }
        try {
            try {
                return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
            } catch (Exception unused) {
                return (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            }
        } catch (Exception unused2) {
            throw new RuntimeException("DeviceName must be initialized before usage.");
        }
    }

    @WorkerThread
    public static DeviceInfo getDeviceInfo(Context context) {
        return getDeviceInfo(context.getApplicationContext(), Build.DEVICE, Build.MODEL);
    }

    public static String getDeviceName() {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        return getDeviceName(str, str2, m31790b(str2));
    }

    public static void init(Context context) {
        f61321a = context.getApplicationContext();
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
        try {
            DeviceInfo queryToDevice = new DeviceDatabase(context).queryToDevice(str, str2);
            if (queryToDevice != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("manufacturer", queryToDevice.manufacturer);
                jSONObject.put("codename", queryToDevice.codename);
                jSONObject.put("model", queryToDevice.model);
                jSONObject.put("market_name", queryToDevice.marketName);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(format, jSONObject.toString());
                edit.apply();
                return queryToDevice;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (str.equals(Build.DEVICE) && Build.MODEL.equals(str2)) {
            return new DeviceInfo(Build.MANUFACTURER, str, str, str2);
        }
        return new DeviceInfo(null, null, str, str2);
    }

    public static String getDeviceName(String str, String str2, String str3) {
        String str4 = getDeviceInfo(m31789c(), str, str2).marketName;
        return str4 == null ? str3 : str4;
    }
}