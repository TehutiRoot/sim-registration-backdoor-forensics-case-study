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
    public static Context f61237a;

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
                return DeviceName.m31806b(this.model);
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
        public final Context f61238a;

        /* renamed from: b */
        public final Handler f61239b;

        /* renamed from: c */
        public String f61240c;

        /* renamed from: d */
        public String f61241d;

        /* renamed from: device.DeviceName$Request$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10093a implements Runnable {

            /* renamed from: a */
            public final Callback f61242a;

            /* renamed from: b */
            public DeviceInfo f61243b;

            /* renamed from: c */
            public Exception f61244c;

            /* renamed from: device.DeviceName$Request$a$a */
            /* loaded from: classes5.dex */
            public class RunnableC10094a implements Runnable {
                public RunnableC10094a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    RunnableC10093a runnableC10093a = RunnableC10093a.this;
                    runnableC10093a.f61242a.onFinished(runnableC10093a.f61243b, runnableC10093a.f61244c);
                }
            }

            public RunnableC10093a(Callback callback) {
                this.f61242a = callback;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Request request = Request.this;
                    this.f61243b = DeviceName.getDeviceInfo(request.f61238a, request.f61240c, request.f61241d);
                } catch (Exception e) {
                    this.f61244c = e;
                }
                Request.this.f61239b.post(new RunnableC10094a());
            }
        }

        public void request(Callback callback) {
            if (this.f61240c == null && this.f61241d == null) {
                this.f61240c = Build.DEVICE;
                this.f61241d = Build.MODEL;
            }
            RunnableC10093a runnableC10093a = new RunnableC10093a(callback);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new Thread(runnableC10093a).start();
            } else {
                runnableC10093a.run();
            }
        }

        public Request setCodename(String str) {
            this.f61240c = str;
            return this;
        }

        public Request setModel(String str) {
            this.f61241d = str;
            return this;
        }

        public Request(Context context) {
            this.f61238a = context;
            this.f61239b = new Handler(context.getMainLooper());
        }
    }

    /* renamed from: b */
    public static String m31806b(String str) {
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
    public static Context m31805c() {
        Context context = f61237a;
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
        return getDeviceName(str, str2, m31806b(str2));
    }

    public static void init(Context context) {
        f61237a = context.getApplicationContext();
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
        String str4 = getDeviceInfo(m31805c(), str, str2).marketName;
        return str4 == null ? str3 : str4;
    }
}
