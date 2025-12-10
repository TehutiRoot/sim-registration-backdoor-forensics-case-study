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
    public static Method f34026a;

    /* renamed from: androidx.core.telephony.SubscriptionManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C4072a {
        @DoNotInline
        /* renamed from: a */
        public static int m57110a(int i) {
            return SubscriptionManager.getSlotIndex(i);
        }
    }

    public static int getSlotIndex(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return C4072a.m57110a(i);
        }
        try {
            if (f34026a == null) {
                if (i2 >= 26) {
                    f34026a = AbstractC10116dy.m31607a().getDeclaredMethod("getSlotIndex", Integer.TYPE);
                } else {
                    f34026a = AbstractC10116dy.m31607a().getDeclaredMethod("getSlotId", Integer.TYPE);
                }
                f34026a.setAccessible(true);
            }
            Integer num = (Integer) f34026a.invoke(null, Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
