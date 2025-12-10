package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: androidx.core.provider.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4066c {

    /* renamed from: a */
    public static final LruCache f34010a = new LruCache(16);

    /* renamed from: b */
    public static final ExecutorService f34011b = AbstractC20127gx1.m30945a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    public static final Object f34012c = new Object();

    /* renamed from: d */
    public static final SimpleArrayMap f34013d = new SimpleArrayMap();

    /* renamed from: androidx.core.provider.c$a */
    /* loaded from: classes2.dex */
    public class CallableC4067a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ String f34014a;

        /* renamed from: b */
        public final /* synthetic */ Context f34015b;

        /* renamed from: c */
        public final /* synthetic */ FontRequest f34016c;

        /* renamed from: d */
        public final /* synthetic */ int f34017d;

        public CallableC4067a(String str, Context context, FontRequest fontRequest, int i) {
            this.f34014a = str;
            this.f34015b = context;
            this.f34016c = fontRequest;
            this.f34017d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C4071e call() {
            return AbstractC4066c.m57119c(this.f34014a, this.f34015b, this.f34016c, this.f34017d);
        }
    }

    /* renamed from: androidx.core.provider.c$b */
    /* loaded from: classes2.dex */
    public class C4068b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ C4061a f34018a;

        public C4068b(C4061a c4061a) {
            this.f34018a = c4061a;
        }

        @Override // androidx.core.util.Consumer
        /* renamed from: a */
        public void accept(C4071e c4071e) {
            if (c4071e == null) {
                c4071e = new C4071e(-3);
            }
            this.f34018a.m57132b(c4071e);
        }
    }

    /* renamed from: androidx.core.provider.c$c */
    /* loaded from: classes2.dex */
    public class CallableC4069c implements Callable {

        /* renamed from: a */
        public final /* synthetic */ String f34019a;

        /* renamed from: b */
        public final /* synthetic */ Context f34020b;

        /* renamed from: c */
        public final /* synthetic */ FontRequest f34021c;

        /* renamed from: d */
        public final /* synthetic */ int f34022d;

        public CallableC4069c(String str, Context context, FontRequest fontRequest, int i) {
            this.f34019a = str;
            this.f34020b = context;
            this.f34021c = fontRequest;
            this.f34022d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C4071e call() {
            try {
                return AbstractC4066c.m57119c(this.f34019a, this.f34020b, this.f34021c, this.f34022d);
            } catch (Throwable unused) {
                return new C4071e(-3);
            }
        }
    }

    /* renamed from: androidx.core.provider.c$d */
    /* loaded from: classes2.dex */
    public class C4070d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ String f34023a;

        public C4070d(String str) {
            this.f34023a = str;
        }

        @Override // androidx.core.util.Consumer
        /* renamed from: a */
        public void accept(C4071e c4071e) {
            synchronized (AbstractC4066c.f34012c) {
                try {
                    SimpleArrayMap simpleArrayMap = AbstractC4066c.f34013d;
                    ArrayList arrayList = (ArrayList) simpleArrayMap.get(this.f34023a);
                    if (arrayList == null) {
                        return;
                    }
                    simpleArrayMap.remove(this.f34023a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((Consumer) arrayList.get(i)).accept(c4071e);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a */
    public static String m57121a(FontRequest fontRequest, int i) {
        return fontRequest.m57139b() + HelpFormatter.DEFAULT_OPT_PREFIX + i;
    }

    /* renamed from: b */
    public static int m57120b(FontsContractCompat.FontFamilyResult fontFamilyResult) {
        int i = 1;
        if (fontFamilyResult.getStatusCode() != 0) {
            if (fontFamilyResult.getStatusCode() != 1) {
                return -3;
            }
            return -2;
        }
        FontsContractCompat.FontInfo[] fonts = fontFamilyResult.getFonts();
        if (fonts != null && fonts.length != 0) {
            i = 0;
            for (FontsContractCompat.FontInfo fontInfo : fonts) {
                int resultCode = fontInfo.getResultCode();
                if (resultCode != 0) {
                    if (resultCode < 0) {
                        return -3;
                    }
                    return resultCode;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C4071e m57119c(String str, Context context, FontRequest fontRequest, int i) {
        LruCache lruCache = f34010a;
        Typeface typeface = (Typeface) lruCache.get(str);
        if (typeface != null) {
            return new C4071e(typeface);
        }
        try {
            FontsContractCompat.FontFamilyResult m57126e = AbstractC4064b.m57126e(context, fontRequest, null);
            int m57120b = m57120b(m57126e);
            if (m57120b != 0) {
                return new C4071e(m57120b);
            }
            Typeface createFromFontInfo = TypefaceCompat.createFromFontInfo(context, null, m57126e.getFonts(), i);
            if (createFromFontInfo != null) {
                lruCache.put(str, createFromFontInfo);
                return new C4071e(createFromFontInfo);
            }
            return new C4071e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C4071e(-1);
        }
    }

    /* renamed from: d */
    public static Typeface m57118d(Context context, FontRequest fontRequest, int i, Executor executor, C4061a c4061a) {
        String m57121a = m57121a(fontRequest, i);
        Typeface typeface = (Typeface) f34010a.get(m57121a);
        if (typeface != null) {
            c4061a.m57132b(new C4071e(typeface));
            return typeface;
        }
        C4068b c4068b = new C4068b(c4061a);
        synchronized (f34012c) {
            try {
                SimpleArrayMap simpleArrayMap = f34013d;
                ArrayList arrayList = (ArrayList) simpleArrayMap.get(m57121a);
                if (arrayList != null) {
                    arrayList.add(c4068b);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c4068b);
                simpleArrayMap.put(m57121a, arrayList2);
                CallableC4069c callableC4069c = new CallableC4069c(m57121a, context, fontRequest, i);
                if (executor == null) {
                    executor = f34011b;
                }
                AbstractC20127gx1.m30943c(executor, callableC4069c, new C4070d(m57121a));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static Typeface m57117e(Context context, FontRequest fontRequest, C4061a c4061a, int i, int i2) {
        String m57121a = m57121a(fontRequest, i);
        Typeface typeface = (Typeface) f34010a.get(m57121a);
        if (typeface != null) {
            c4061a.m57132b(new C4071e(typeface));
            return typeface;
        } else if (i2 == -1) {
            C4071e m57119c = m57119c(m57121a, context, fontRequest, i);
            c4061a.m57132b(m57119c);
            return m57119c.f34024a;
        } else {
            try {
                C4071e c4071e = (C4071e) AbstractC20127gx1.m30942d(f34011b, new CallableC4067a(m57121a, context, fontRequest, i), i2);
                c4061a.m57132b(c4071e);
                return c4071e.f34024a;
            } catch (InterruptedException unused) {
                c4061a.m57132b(new C4071e(-3));
                return null;
            }
        }
    }

    /* renamed from: f */
    public static void m57116f() {
        f34010a.evictAll();
    }

    /* renamed from: androidx.core.provider.c$e */
    /* loaded from: classes2.dex */
    public static final class C4071e {

        /* renamed from: a */
        public final Typeface f34024a;

        /* renamed from: b */
        public final int f34025b;

        public C4071e(int i) {
            this.f34024a = null;
            this.f34025b = i;
        }

        /* renamed from: a */
        public boolean m57111a() {
            if (this.f34025b == 0) {
                return true;
            }
            return false;
        }

        public C4071e(Typeface typeface) {
            this.f34024a = typeface;
            this.f34025b = 0;
        }
    }
}
