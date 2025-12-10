package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";

    /* renamed from: b */
    public static final WeakHashMap f33972b = new WeakHashMap();

    /* renamed from: a */
    public final Context f33973a;

    /* renamed from: androidx.core.hardware.display.DisplayManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C3990a {
        @DoNotInline
        /* renamed from: a */
        public static Display m57247a(DisplayManager displayManager, int i) {
            return displayManager.getDisplay(i);
        }

        @DoNotInline
        /* renamed from: b */
        public static Display[] m57246b(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    public DisplayManagerCompat(Context context) {
        this.f33973a = context;
    }

    @NonNull
    public static DisplayManagerCompat getInstance(@NonNull Context context) {
        DisplayManagerCompat displayManagerCompat;
        WeakHashMap weakHashMap = f33972b;
        synchronized (weakHashMap) {
            try {
                displayManagerCompat = (DisplayManagerCompat) weakHashMap.get(context);
                if (displayManagerCompat == null) {
                    displayManagerCompat = new DisplayManagerCompat(context);
                    weakHashMap.put(context, displayManagerCompat);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return displayManagerCompat;
    }

    @Nullable
    public Display getDisplay(int i) {
        return C3990a.m57247a((DisplayManager) this.f33973a.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION), i);
    }

    @NonNull
    public Display[] getDisplays() {
        return C3990a.m57246b((DisplayManager) this.f33973a.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION));
    }

    @NonNull
    public Display[] getDisplays(@Nullable String str) {
        return C3990a.m57246b((DisplayManager) this.f33973a.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION));
    }
}