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
    public static Method f34027a;

    /* renamed from: b */
    public static Method f34028b;

    /* renamed from: androidx.core.telephony.TelephonyManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C4073a {
        @SuppressLint({"MissingPermission"})
        @Nullable
        @RequiresPermission("android.permission.READ_PHONE_STATE")
        @DoNotInline
        /* renamed from: a */
        public static String m57109a(TelephonyManager telephonyManager, int i) {
            return telephonyManager.getDeviceId(i);
        }
    }

    /* renamed from: androidx.core.telephony.TelephonyManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C4074b {
        @SuppressLint({"MissingPermission"})
        @Nullable
        @RequiresPermission("android.permission.READ_PHONE_STATE")
        @DoNotInline
        /* renamed from: a */
        public static String m57108a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* renamed from: androidx.core.telephony.TelephonyManagerCompat$c */
    /* loaded from: classes2.dex */
    public static class C4075c {
        @DoNotInline
        /* renamed from: a */
        public static int m57107a(TelephonyManager telephonyManager) {
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
            return C4074b.m57108a(telephonyManager);
        }
        if (i >= 22 && (subscriptionId = getSubscriptionId(telephonyManager)) != Integer.MAX_VALUE && subscriptionId != -1) {
            int slotIndex = SubscriptionManagerCompat.getSlotIndex(subscriptionId);
            if (i >= 23) {
                return C4073a.m57109a(telephonyManager, slotIndex);
            }
            try {
                if (f34027a == null) {
                    Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getDeviceId", Integer.TYPE);
                    f34027a = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                return (String) f34027a.invoke(telephonyManager, Integer.valueOf(slotIndex));
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
            return C4075c.m57107a(telephonyManager);
        }
        if (i >= 22) {
            try {
                if (f34028b == null) {
                    Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                    f34028b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Integer num = (Integer) f34028b.invoke(telephonyManager, null);
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
