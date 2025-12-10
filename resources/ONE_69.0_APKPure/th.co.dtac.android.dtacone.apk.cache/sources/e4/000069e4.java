package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.provider.FontRequest;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class FontResourcesParserCompat {
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;

    /* loaded from: classes2.dex */
    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface FetchStrategy {
    }

    /* loaded from: classes2.dex */
    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {

        /* renamed from: a */
        public final FontFileResourceEntry[] f33913a;

        public FontFamilyFilesResourceEntry(@NonNull FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.f33913a = fontFileResourceEntryArr;
        }

        @NonNull
        public FontFileResourceEntry[] getEntries() {
            return this.f33913a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class FontFileResourceEntry {

        /* renamed from: a */
        public final String f33914a;

        /* renamed from: b */
        public final int f33915b;

        /* renamed from: c */
        public final boolean f33916c;

        /* renamed from: d */
        public final String f33917d;

        /* renamed from: e */
        public final int f33918e;

        /* renamed from: f */
        public final int f33919f;

        public FontFileResourceEntry(@NonNull String str, int i, boolean z, @Nullable String str2, int i2, int i3) {
            this.f33914a = str;
            this.f33915b = i;
            this.f33916c = z;
            this.f33917d = str2;
            this.f33918e = i2;
            this.f33919f = i3;
        }

        @NonNull
        public String getFileName() {
            return this.f33914a;
        }

        public int getResourceId() {
            return this.f33919f;
        }

        public int getTtcIndex() {
            return this.f33918e;
        }

        @Nullable
        public String getVariationSettings() {
            return this.f33917d;
        }

        public int getWeight() {
            return this.f33915b;
        }

        public boolean isItalic() {
            return this.f33916c;
        }
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$a */
    /* loaded from: classes2.dex */
    public static class C3956a {
        @DoNotInline
        /* renamed from: a */
        public static int m57362a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: a */
    public static int m57368a(TypedArray typedArray, int i) {
        return C3956a.m57362a(typedArray, i);
    }

    /* renamed from: b */
    public static FamilyResourceEntry m57367b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m57366c(xmlPullParser, resources);
        }
        m57364e(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    public static FamilyResourceEntry m57366c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamily);
        String string = obtainAttributes.getString(R.styleable.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m57364e(xmlPullParser);
            }
            return new ProviderResourceEntry(new FontRequest(string, string2, string3, readCerts(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m57365d(xmlPullParser, resources));
                } else {
                    m57364e(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[0]));
    }

    /* renamed from: d */
    public static FontFileResourceEntry m57365d(XmlPullParser xmlPullParser, Resources resources) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamilyFont);
        if (obtainAttributes.hasValue(R.styleable.FontFamilyFont_fontWeight)) {
            i = R.styleable.FontFamilyFont_fontWeight;
        } else {
            i = R.styleable.FontFamilyFont_android_fontWeight;
        }
        int i6 = obtainAttributes.getInt(i, 400);
        if (obtainAttributes.hasValue(R.styleable.FontFamilyFont_fontStyle)) {
            i2 = R.styleable.FontFamilyFont_fontStyle;
        } else {
            i2 = R.styleable.FontFamilyFont_android_fontStyle;
        }
        if (1 == obtainAttributes.getInt(i2, 0)) {
            z = true;
        } else {
            z = false;
        }
        if (obtainAttributes.hasValue(R.styleable.FontFamilyFont_ttcIndex)) {
            i3 = R.styleable.FontFamilyFont_ttcIndex;
        } else {
            i3 = R.styleable.FontFamilyFont_android_ttcIndex;
        }
        if (obtainAttributes.hasValue(R.styleable.FontFamilyFont_fontVariationSettings)) {
            i4 = R.styleable.FontFamilyFont_fontVariationSettings;
        } else {
            i4 = R.styleable.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i4);
        int i7 = obtainAttributes.getInt(i3, 0);
        if (obtainAttributes.hasValue(R.styleable.FontFamilyFont_font)) {
            i5 = R.styleable.FontFamilyFont_font;
        } else {
            i5 = R.styleable.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i5, 0);
        String string2 = obtainAttributes.getString(i5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m57364e(xmlPullParser);
        }
        return new FontFileResourceEntry(string2, i6, z, string, i7, resourceId);
    }

    /* renamed from: e */
    public static void m57364e(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: f */
    public static List m57363f(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    @Nullable
    public static FamilyResourceEntry parse(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m57367b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static List<List<byte[]>> readCerts(@NonNull Resources resources, @ArrayRes int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m57368a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m57363f(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m57363f(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProviderResourceEntry implements FamilyResourceEntry {

        /* renamed from: a */
        public final FontRequest f33920a;

        /* renamed from: b */
        public final int f33921b;

        /* renamed from: c */
        public final int f33922c;

        /* renamed from: d */
        public final String f33923d;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public ProviderResourceEntry(@NonNull FontRequest fontRequest, int i, int i2, @Nullable String str) {
            this.f33920a = fontRequest;
            this.f33922c = i;
            this.f33921b = i2;
            this.f33923d = str;
        }

        public int getFetchStrategy() {
            return this.f33922c;
        }

        @NonNull
        public FontRequest getRequest() {
            return this.f33920a;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public String getSystemFontFamilyName() {
            return this.f33923d;
        }

        public int getTimeout() {
            return this.f33921b;
        }

        public ProviderResourceEntry(@NonNull FontRequest fontRequest, int i, int i2) {
            this(fontRequest, i, i2, null);
        }
    }
}