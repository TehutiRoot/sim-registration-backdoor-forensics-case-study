package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;

/* renamed from: IT1 */
/* loaded from: classes4.dex */
public abstract class IT1 {
    /* renamed from: a */
    public static void m68011a(Context context, int i) {
        Resources.Theme m68010b;
        context.getTheme().applyStyle(i, true);
        if ((context instanceof Activity) && (m68010b = m68010b((Activity) context)) != null) {
            m68010b.applyStyle(i, true);
        }
    }

    /* renamed from: b */
    public static Resources.Theme m68010b(Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window != null && (peekDecorView = window.peekDecorView()) != null && (context = peekDecorView.getContext()) != null) {
            return context.getTheme();
        }
        return null;
    }
}