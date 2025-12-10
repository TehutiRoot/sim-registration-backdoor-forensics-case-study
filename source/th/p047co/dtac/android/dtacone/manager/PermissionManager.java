package th.p047co.dtac.android.dtacone.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;

/* renamed from: th.co.dtac.android.dtacone.manager.PermissionManager */
/* loaded from: classes7.dex */
public class PermissionManager {
    public static final int REQUEST_ANY = 0;
    public static final int REQUEST_CALL_PHONE_PERMISSION = 2;
    public static final int REQUEST_CAMERA_PERMISSION = 5;
    public static final int REQUEST_LOCATION_PERMISSION = 1;
    public static final int REQUEST_POST_NOTIFICATIONS = 7;
    public static final int REQUEST_READ_CONTACT_PERMISSION = 3;
    public static final int REQUEST_SMS_PERMISSION = 4;
    public static final int REQUEST_WRITE_STORAGE_PERMISSION = 6;

    /* renamed from: a */
    public static String[] f84780a = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    /* renamed from: b */
    public static String[] f84781b = {"android.permission.CALL_PHONE"};

    /* renamed from: c */
    public static String[] f84782c = {"android.permission.READ_CONTACTS"};

    /* renamed from: d */
    public static String[] f84783d = {"android.permission.CAMERA"};

    /* renamed from: e */
    public static String[] f84784e = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: f */
    public static String[] f84785f = {"android.permission.POST_NOTIFICATIONS"};

    /* renamed from: g */
    public static String[] f84786g = {"android.permission.READ_MEDIA_IMAGES"};

    /* renamed from: h */
    public static final String[] f84787h = {"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};

    /* renamed from: a */
    public static boolean m19440a(String[] strArr) {
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(Contextor.getInstance().getContext(), str) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m19439b() {
        return m19440a(f84781b);
    }

    public static boolean hasNotCameraPermission() {
        return m19440a(f84783d);
    }

    public static boolean hasNotLocationPermission() {
        return m19440a(f84780a);
    }

    @RequiresApi(api = 31)
    public static boolean hasNotLocationPermissionBluetooth() {
        return m19440a(f84787h);
    }

    public static boolean hasNotPostNotificationPermission() {
        return m19440a(f84785f);
    }

    public static boolean hasNotReadContactPermission() {
        return m19440a(f84782c);
    }

    public static boolean hasNotWriteStoragePermission() {
        return m19440a(f84784e);
    }

    public static void openPermissionSettings(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        context.startActivity(intent);
    }

    public static boolean requestCallPhonePermission(DialogFragment dialogFragment) {
        boolean m19439b = m19439b();
        if (m19439b) {
            dialogFragment.requestPermissions(f84781b, 2);
        }
        return m19439b;
    }

    public static boolean requestCameraPermission(Activity activity, int i) {
        boolean hasNotCameraPermission = hasNotCameraPermission();
        if (hasNotCameraPermission) {
            ActivityCompat.requestPermissions(activity, f84783d, i);
        }
        return hasNotCameraPermission;
    }

    public static boolean requestLocationPermission(Activity activity) {
        boolean hasNotLocationPermission = hasNotLocationPermission();
        if (hasNotLocationPermission) {
            ActivityCompat.requestPermissions(activity, f84780a, 1);
        }
        return hasNotLocationPermission;
    }

    public static boolean requestMultiplePermission(Activity activity, String[] strArr) {
        boolean hasNotLocationPermission = hasNotLocationPermission();
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i >= 31) {
            if (!hasNotLocationPermission() && !hasNotLocationPermissionBluetooth()) {
                hasNotLocationPermission = false;
            } else {
                hasNotLocationPermission = true;
            }
        }
        if (i >= 33) {
            if (!hasNotLocationPermission() && !hasNotLocationPermissionBluetooth() && !hasNotPostNotificationPermission()) {
                z = false;
            }
            hasNotLocationPermission = z;
        }
        if (hasNotLocationPermission) {
            ActivityCompat.requestPermissions(activity, strArr, 0);
        }
        return hasNotLocationPermission;
    }

    public static boolean requestReadContactPermission(Activity activity) {
        boolean hasNotReadContactPermission = hasNotReadContactPermission();
        if (hasNotReadContactPermission) {
            ActivityCompat.requestPermissions(activity, f84782c, 3);
        }
        return hasNotReadContactPermission;
    }

    public static boolean shouldShowRequest(Activity activity, String str) {
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, str);
    }

    public boolean hasNotWriteExternalStoragePermission() {
        return m19440a(f84784e);
    }

    public boolean hasNotWriteExternalStoragePermissionTiramisu() {
        return m19440a(f84786g);
    }
}
