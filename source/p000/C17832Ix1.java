package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import com.google.android.material.color.ColorResourcesOverride;
import java.util.Map;

/* renamed from: Ix1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17832Ix1 implements ColorResourcesOverride {

    /* renamed from: Ix1$b */
    /* loaded from: classes4.dex */
    public static class C0635b {

        /* renamed from: a */
        public static final C17832Ix1 f2649a = new C17832Ix1();
    }

    /* renamed from: a */
    public static ColorResourcesOverride m67840a() {
        return C0635b.f2649a;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(Context context, Map map) {
        if (AbstractC17960Kx1.m67574a(context, map)) {
            LS1.m67520a(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public Context wrapContextIfPossible(Context context, Map map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        if (AbstractC17960Kx1.m67574a(contextThemeWrapper, map)) {
            return contextThemeWrapper;
        }
        return context;
    }

    public C17832Ix1() {
    }
}
