package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class TintContextWrapper extends ContextWrapper {

    /* renamed from: c */
    public static final Object f9944c = new Object();

    /* renamed from: d */
    public static ArrayList f9945d;

    /* renamed from: a */
    public final Resources f9946a;

    /* renamed from: b */
    public final Resources.Theme f9947b;

    public TintContextWrapper(Context context) {
        super(context);
        if (VectorEnabledTintResources.shouldBeUsed()) {
            VectorEnabledTintResources vectorEnabledTintResources = new VectorEnabledTintResources(this, context.getResources());
            this.f9946a = vectorEnabledTintResources;
            Resources.Theme newTheme = vectorEnabledTintResources.newTheme();
            this.f9947b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f9946a = new C22108sT1(this, context.getResources());
        this.f9947b = null;
    }

    /* renamed from: a */
    public static boolean m64154a(Context context) {
        if (!(context instanceof TintContextWrapper) && !(context.getResources() instanceof C22108sT1) && !(context.getResources() instanceof VectorEnabledTintResources)) {
            return VectorEnabledTintResources.shouldBeUsed();
        }
        return false;
    }

    public static Context wrap(@NonNull Context context) {
        TintContextWrapper tintContextWrapper;
        if (m64154a(context)) {
            synchronized (f9944c) {
                try {
                    ArrayList arrayList = f9945d;
                    if (arrayList == null) {
                        f9945d = new ArrayList();
                    } else {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            WeakReference weakReference = (WeakReference) f9945d.get(size);
                            if (weakReference == null || weakReference.get() == null) {
                                f9945d.remove(size);
                            }
                        }
                        for (int size2 = f9945d.size() - 1; size2 >= 0; size2--) {
                            WeakReference weakReference2 = (WeakReference) f9945d.get(size2);
                            if (weakReference2 != null) {
                                tintContextWrapper = (TintContextWrapper) weakReference2.get();
                            } else {
                                tintContextWrapper = null;
                            }
                            if (tintContextWrapper != null && tintContextWrapper.getBaseContext() == context) {
                                return tintContextWrapper;
                            }
                        }
                    }
                    TintContextWrapper tintContextWrapper2 = new TintContextWrapper(context);
                    f9945d.add(new WeakReference(tintContextWrapper2));
                    return tintContextWrapper2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f9946a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f9946a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f9947b;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f9947b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
