package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: CW1 */
/* loaded from: classes2.dex */
public abstract class CW1 {

    /* renamed from: a */
    public ConcurrentHashMap f756a = new ConcurrentHashMap();

    /* renamed from: CW1$a */
    /* loaded from: classes2.dex */
    public class C0187a implements InterfaceC0189c {
        public C0187a() {
        }

        @Override // p000.CW1.InterfaceC0189c
        /* renamed from: c */
        public int mo68760a(FontsContractCompat.FontInfo fontInfo) {
            return fontInfo.getWeight();
        }

        @Override // p000.CW1.InterfaceC0189c
        /* renamed from: d */
        public boolean mo68759b(FontsContractCompat.FontInfo fontInfo) {
            return fontInfo.isItalic();
        }
    }

    /* renamed from: CW1$b */
    /* loaded from: classes2.dex */
    public class C0188b implements InterfaceC0189c {
        public C0188b() {
        }

        @Override // p000.CW1.InterfaceC0189c
        /* renamed from: c */
        public int mo68760a(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
            return fontFileResourceEntry.getWeight();
        }

        @Override // p000.CW1.InterfaceC0189c
        /* renamed from: d */
        public boolean mo68759b(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
            return fontFileResourceEntry.isItalic();
        }
    }

    /* renamed from: CW1$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC0189c {
        /* renamed from: a */
        int mo68760a(Object obj);

        /* renamed from: b */
        boolean mo68759b(Object obj);
    }

    /* renamed from: e */
    public static Object m68768e(Object[] objArr, int i, InterfaceC0189c interfaceC0189c) {
        int i2;
        boolean z;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return m68767f(objArr, i2, z, interfaceC0189c);
    }

    /* renamed from: f */
    public static Object m68767f(Object[] objArr, int i, boolean z, InterfaceC0189c interfaceC0189c) {
        int i2;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(interfaceC0189c.mo68760a(obj2) - i) * 2;
            if (interfaceC0189c.mo68759b(obj2) == z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i4 = abs + i2;
            if (obj == null || i3 > i4) {
                obj = obj2;
                i3 = i4;
            }
        }
        return obj;
    }

    /* renamed from: h */
    public static long m68765h(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    public final void m68771a(Typeface typeface, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry) {
        long m68765h = m68765h(typeface);
        if (m68765h != 0) {
            this.f756a.put(Long.valueOf(m68765h), fontFamilyFilesResourceEntry);
        }
    }

    /* renamed from: b */
    public Typeface m68770b(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i, boolean z) {
        FontResourcesParserCompat.FontFileResourceEntry m68769d = m68769d(fontFamilyFilesResourceEntry, i, z);
        if (m68769d == null) {
            return null;
        }
        Typeface createFromResourcesFontFile = TypefaceCompat.createFromResourcesFontFile(context, resources, m68769d.getResourceId(), m68769d.getFileName(), 0, 0);
        m68771a(createFromResourcesFontFile, fontFamilyFilesResourceEntry);
        return createFromResourcesFontFile;
    }

    /* renamed from: c */
    public Typeface mo80c(Context context, Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = S32.m66375a(this, context, typeface, i, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 != null) {
            return typeface2;
        }
        return typeface;
    }

    public abstract Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i);

    public abstract Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i);

    public Typeface createFromInputStream(Context context, InputStream inputStream) {
        File tempFile = TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.copyToFile(tempFile, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(tempFile.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String str, int i2) {
        File tempFile = TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.copyToFile(tempFile, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(tempFile.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    /* renamed from: d */
    public final FontResourcesParserCompat.FontFileResourceEntry m68769d(FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i, boolean z) {
        return (FontResourcesParserCompat.FontFileResourceEntry) m68767f(fontFamilyFilesResourceEntry.getEntries(), i, z, new C0188b());
    }

    public FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        return (FontsContractCompat.FontInfo) m68768e(fontInfoArr, i, new C0187a());
    }

    /* renamed from: g */
    public FontResourcesParserCompat.FontFamilyFilesResourceEntry m68766g(Typeface typeface) {
        long m68765h = m68765h(typeface);
        if (m68765h == 0) {
            return null;
        }
        return (FontResourcesParserCompat.FontFamilyFilesResourceEntry) this.f756a.get(Long.valueOf(m68765h));
    }
}
