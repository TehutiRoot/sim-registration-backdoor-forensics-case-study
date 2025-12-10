package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(22)
/* loaded from: classes2.dex */
public class SubscriptionManagerCompat {

    /* renamed from: a */
    public static Method f34114a;

    /* renamed from: androidx.core.telephony.SubscriptionManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C4054a {
        @DoNotInline
        /* renamed from: a */
        public static int m57060a(int i) {
            return SubscriptionManager.getSlotIndex(i);
        }
    }

    public static int getSlotIndex(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return C4054a.m57060a(i);
        }
        try {
            if (f34114a == null) {
                if (i2 >= 26) {
                    f34114a = AbstractC10107dy.m31746a().getDeclaredMethod("getSlotIndex", Integer.TYPE);
                } else {
                    f34114a = AbstractC10107dy.m31746a().getDeclaredMethod("getSlotId", Integer.TYPE);
                }
                f34114a.setAccessible(true);
            }
            Integer num = (Integer) f34114a.invoke(null, Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}