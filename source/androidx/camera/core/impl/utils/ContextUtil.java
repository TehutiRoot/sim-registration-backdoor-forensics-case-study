package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ContextUtil {

    /* renamed from: androidx.camera.core.impl.utils.ContextUtil$a */
    /* loaded from: classes.dex */
    public static class C2530a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static Context m62879a(@NonNull Context context, @Nullable String str) {
            return context.createAttributionContext(str);
        }

        @Nullable
        @DoNotInline
        /* renamed from: b */
        public static String m62878b(@NonNull Context context) {
            return context.getAttributionTag();
        }
    }

    @NonNull
    public static Context getApplicationContext(@NonNull Context context) {
        String m62878b;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30 && (m62878b = C2530a.m62878b(context)) != null) {
            return C2530a.m62879a(applicationContext, m62878b);
        }
        return applicationContext;
    }

    @Nullable
    public static Application getApplicationFromContext(@NonNull Context context) {
        for (Context applicationContext = getApplicationContext(context); applicationContext instanceof ContextWrapper; applicationContext = getBaseContext((ContextWrapper) applicationContext)) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }

    @NonNull
    public static Context getBaseContext(@NonNull ContextWrapper contextWrapper) {
        String m62878b;
        Context baseContext = contextWrapper.getBaseContext();
        if (Build.VERSION.SDK_INT >= 30 && (m62878b = C2530a.m62878b(contextWrapper)) != null) {
            return C2530a.m62879a(baseContext, m62878b);
        }
        return baseContext;
    }
}
