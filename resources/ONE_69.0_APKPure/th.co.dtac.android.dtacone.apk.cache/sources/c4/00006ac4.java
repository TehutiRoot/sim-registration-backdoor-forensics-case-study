package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class TelephonyManagerCompat {

    /* renamed from: a */
    public static Method f34115a;

    /* renamed from: b */
    public static Method f34116b;

    /* renamed from: androidx.core.telephony.TelephonyManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C4055a {
        @SuppressLint({"MissingPermission"})
        @Nullable
        @RequiresPermission("android.permission.READ_PHONE_STATE")
        @DoNotInline
        /* renamed from: a */
        public static String m57059a(TelephonyManager telephonyManager, int i) {
            return telephonyManager.getDeviceId(i);
        }
    }

    /* renamed from: androidx.core.telephony.TelephonyManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C4056b {
        @SuppressLint({"MissingPermission"})
        @Nullable
        @RequiresPermission("android.permission.READ_PHONE_STATE")
        @DoNotInline
        /* renamed from: a */
        public static String m57058a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* renamed from: androidx.core.telephony.TelephonyManagerCompat$c */
    /* loaded from: classes2.dex */
    public static class C4057c {
        @DoNotInline
        /* renamed from: a */
        public static int m57057a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    @Nullable
    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"MissingPermission"})
    public static String getImei(@NonNull TelephonyManager telephonyManager) {
        int subscriptionId;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return C4056b.m57058a(telephonyManager);
        }
        if (i >= 22 && (subscriptionId = getSubscriptionId(telephonyManager)) != Integer.MAX_VALUE && subscriptionId != -1) {
            int slotIndex = SubscriptionManagerCompat.getSlotIndex(subscriptionId);
            if (i >= 23) {
                return C4055a.m57059a(telephonyManager, slotIndex);
            }
            try {
                if (f34115a == null) {
                    Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getDeviceId", Integer.TYPE);
                    f34115a = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                return (String) f34115a.invoke(telephonyManager, Integer.valueOf(slotIndex));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        return telephonyManager.getDeviceId();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int getSubscriptionId(@NonNull TelephonyManager telephonyManager) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C4057c.m57057a(telephonyManager);
        }
        if (i >= 22) {
            try {
                if (f34116b == null) {
                    Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                    f34116b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Integer num = (Integer) f34116b.invoke(telephonyManager, null);
                if (num != null && num.intValue() != -1) {
                    return num.intValue();
                }
                return Integer.MAX_VALUE;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }
}