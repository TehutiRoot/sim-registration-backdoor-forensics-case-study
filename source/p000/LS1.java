package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;

/* renamed from: LS1 */
/* loaded from: classes4.dex */
public abstract class LS1 {
    /* renamed from: a */
    public static void m67520a(Context context, int i) {
        Resources.Theme m67519b;
        context.getTheme().applyStyle(i, true);
        if ((context instanceof Activity) && (m67519b = m67519b((Activity) context)) != null) {
            m67519b.applyStyle(i, true);
        }
    }

    /* renamed from: b */
    public static Resources.Theme m67519b(Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window != null && (peekDecorView = window.peekDecorView()) != null && (context = peekDecorView.getContext()) != null) {
            return context.getTheme();
        }
        return null;
    }
}
