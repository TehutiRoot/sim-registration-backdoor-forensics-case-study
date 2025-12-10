package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import com.google.android.material.color.ColorResourcesOverride;
import java.util.Map;

/* renamed from: Fy1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17671Fy1 implements ColorResourcesOverride {

    /* renamed from: Fy1$b */
    /* loaded from: classes4.dex */
    public static class C0419b {

        /* renamed from: a */
        public static final C17671Fy1 f1823a = new C17671Fy1();
    }

    /* renamed from: a */
    public static ColorResourcesOverride m68361a() {
        return C0419b.f1823a;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(Context context, Map map) {
        if (AbstractC17801Hy1.m68077a(context, map)) {
            IT1.m68011a(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public Context wrapContextIfPossible(Context context, Map map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        if (AbstractC17801Hy1.m68077a(contextThemeWrapper, map)) {
            return contextThemeWrapper;
        }
        return context;
    }

    public C17671Fy1() {
    }
}