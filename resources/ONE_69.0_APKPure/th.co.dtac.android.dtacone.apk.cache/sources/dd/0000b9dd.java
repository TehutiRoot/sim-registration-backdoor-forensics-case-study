package com.mixpanel.android.mpmetrics;

import android.R;
import android.content.Context;
import android.util.SparseArray;
import com.mixpanel.android.util.MPLog;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class ResourceReader implements ResourceIds {

    /* renamed from: a */
    public final Context f58638a;

    /* renamed from: b */
    public final Map f58639b = new HashMap();

    /* renamed from: c */
    public final SparseArray f58640c = new SparseArray();

    /* loaded from: classes5.dex */
    public static class Drawables extends ResourceReader {

        /* renamed from: d */
        public final String f58641d;

        public Drawables(String str, Context context) {
            super(context);
            this.f58641d = str;
            initialize();
        }

        @Override // com.mixpanel.android.mpmetrics.ResourceReader
        public String getLocalClassName(Context context) {
            return this.f58641d + ".R$drawable";
        }

        @Override // com.mixpanel.android.mpmetrics.ResourceReader
        public Class<?> getSystemClass() {
            return R.drawable.class;
        }
    }

    /* loaded from: classes5.dex */
    public static class Ids extends ResourceReader {

        /* renamed from: d */
        public final String f58642d;

        public Ids(String str, Context context) {
            super(context);
            this.f58642d = str;
            initialize();
        }

        @Override // com.mixpanel.android.mpmetrics.ResourceReader
        public String getLocalClassName(Context context) {
            return this.f58642d + ".R$id";
        }

        @Override // com.mixpanel.android.mpmetrics.ResourceReader
        public Class<?> getSystemClass() {
            return R.id.class;
        }
    }

    public ResourceReader(Context context) {
        this.f58638a = context;
    }

    /* renamed from: a */
    public static void m33562a(Class cls, String str, Map map) {
        Field[] fields;
        try {
            for (Field field : cls.getFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getType() == Integer.TYPE) {
                    String name = field.getName();
                    int i = field.getInt(null);
                    if (str != null) {
                        name = str + ":" + name;
                    }
                    map.put(name, Integer.valueOf(i));
                }
            }
        } catch (IllegalAccessException e) {
            MPLog.m33448e("MixpanelAPI.RsrcReader", "Can't read built-in id names from " + cls.getName(), e);
        }
    }

    public abstract String getLocalClassName(Context context);

    public abstract Class<?> getSystemClass();

    @Override // com.mixpanel.android.mpmetrics.ResourceIds
    public int idFromName(String str) {
        return ((Integer) this.f58639b.get(str)).intValue();
    }

    public void initialize() {
        this.f58639b.clear();
        this.f58640c.clear();
        m33562a(getSystemClass(), "android", this.f58639b);
        String localClassName = getLocalClassName(this.f58638a);
        try {
            m33562a(Class.forName(localClassName), null, this.f58639b);
        } catch (ClassNotFoundException unused) {
            MPLog.m33443w("MixpanelAPI.RsrcReader", "Can't load names for Android view ids from '" + localClassName + "', ids by name will not be available in the events editor.");
            MPLog.m33447i("MixpanelAPI.RsrcReader", "You may be missing a Resources class for your package due to your proguard configuration, or you may be using an applicationId in your build that isn't the same as the package declared in your AndroidManifest.xml file.\nIf you're using proguard, you can fix this issue by adding the following to your proguard configuration:\n\n-keep class **.R$* {\n    <fields>;\n}\n\nIf you're not using proguard, or if your proguard configuration already contains the directive above, you can add the following to your AndroidManifest.xml file to explicitly point the Mixpanel library to the appropriate library for your resources class:\n\n<meta-data android:name=\"com.mixpanel.android.MPConfig.ResourcePackageName\" android:value=\"YOUR_PACKAGE_NAME\" />\n\nwhere YOUR_PACKAGE_NAME is the same string you use for the \"package\" attribute in your <manifest> tag.");
        }
        for (Map.Entry entry : this.f58639b.entrySet()) {
            this.f58640c.put(((Integer) entry.getValue()).intValue(), entry.getKey());
        }
    }

    @Override // com.mixpanel.android.mpmetrics.ResourceIds
    public boolean knownIdName(String str) {
        return this.f58639b.containsKey(str);
    }

    @Override // com.mixpanel.android.mpmetrics.ResourceIds
    public String nameForId(int i) {
        return (String) this.f58640c.get(i);
    }
}