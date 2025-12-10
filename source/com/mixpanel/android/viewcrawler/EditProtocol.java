package com.mixpanel.android.viewcrawler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mixpanel.android.mpmetrics.ResourceIds;
import com.mixpanel.android.util.ImageStore;
import com.mixpanel.android.util.JSONUtils;
import com.mixpanel.android.util.MPLog;
import com.mixpanel.android.util.MPPair;
import com.mixpanel.android.viewcrawler.Pathfinder;
import com.mixpanel.android.viewcrawler.ViewVisitor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class EditProtocol {

    /* renamed from: e */
    public static final Class[] f58760e = new Class[0];

    /* renamed from: f */
    public static final List f58761f = Collections.emptyList();

    /* renamed from: a */
    public final Context f58762a;

    /* renamed from: b */
    public final ResourceIds f58763b;

    /* renamed from: c */
    public final ImageStore f58764c;

    /* renamed from: d */
    public final ViewVisitor.OnLayoutErrorListener f58765d;

    /* loaded from: classes5.dex */
    public static class BadInstructionsException extends Exception {
        private static final long serialVersionUID = -4062004792184145311L;

        public BadInstructionsException(String str) {
            super(str);
        }

        public BadInstructionsException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* loaded from: classes5.dex */
    public static class CantGetEditAssetsException extends Exception {
        public CantGetEditAssetsException(String str) {
            super(str);
        }

        public CantGetEditAssetsException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* loaded from: classes5.dex */
    public static class Edit {
        public final List<String> imageUrls;
        public final ViewVisitor visitor;

        public Edit(ViewVisitor viewVisitor, List list) {
            this.visitor = viewVisitor;
            this.imageUrls = list;
        }
    }

    /* loaded from: classes5.dex */
    public static class InapplicableInstructionsException extends BadInstructionsException {
        private static final long serialVersionUID = 3977056710817909104L;

        public InapplicableInstructionsException(String str) {
            super(str);
        }
    }

    public EditProtocol(Context context, ResourceIds resourceIds, ImageStore imageStore, ViewVisitor.OnLayoutErrorListener onLayoutErrorListener) {
        this.f58762a = context;
        this.f58763b = resourceIds;
        this.f58764c = imageStore;
        this.f58765d = onLayoutErrorListener;
    }

    /* renamed from: a */
    public final Object m33449a(Object obj, String str, List list) {
        try {
            if ("java.lang.CharSequence".equals(str)) {
                return obj;
            }
            if (!TypedValues.Custom.S_BOOLEAN.equals(str) && !"java.lang.Boolean".equals(str)) {
                if (!"int".equals(str) && !"java.lang.Integer".equals(str)) {
                    if (!TypedValues.Custom.S_FLOAT.equals(str) && !"java.lang.Float".equals(str)) {
                        if ("android.graphics.drawable.Drawable".equals(str)) {
                            return m33448b((JSONObject) obj, list);
                        }
                        if ("android.graphics.drawable.BitmapDrawable".equals(str)) {
                            return m33448b((JSONObject) obj, list);
                        }
                        if ("android.graphics.drawable.ColorDrawable".equals(str)) {
                            return new ColorDrawable(((Number) obj).intValue());
                        }
                        throw new BadInstructionsException("Don't know how to interpret type " + str + " (arg was " + obj + ")");
                    }
                    return Float.valueOf(((Number) obj).floatValue());
                }
                return Integer.valueOf(((Number) obj).intValue());
            }
            return obj;
        } catch (ClassCastException unused) {
            throw new BadInstructionsException("Couldn't interpret <" + obj + "> as " + str);
        }
    }

    /* renamed from: b */
    public final Drawable m33448b(JSONObject jSONObject, List list) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        try {
            if (!jSONObject.isNull(ImagesContract.URL)) {
                String string = jSONObject.getString(ImagesContract.URL);
                if (jSONObject.isNull("dimensions")) {
                    z = false;
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("dimensions");
                    i = jSONObject2.getInt("left");
                    i2 = jSONObject2.getInt("right");
                    i3 = jSONObject2.getInt("top");
                    i4 = jSONObject2.getInt("bottom");
                    z = true;
                }
                try {
                    Bitmap image = this.f58764c.getImage(string);
                    list.add(string);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), image);
                    if (z) {
                        bitmapDrawable.setBounds(i, i3, i2, i4);
                    }
                    return bitmapDrawable;
                } catch (ImageStore.CantGetImageException e) {
                    throw new CantGetEditAssetsException(e.getMessage(), e.getCause());
                }
            }
            throw new BadInstructionsException("Can't construct a BitmapDrawable with a null url");
        } catch (JSONException e2) {
            throw new BadInstructionsException("Couldn't read drawable description", e2);
        }
    }

    /* renamed from: c */
    public Edit m33447c(JSONObject jSONObject) {
        ViewVisitor layoutUpdateVisitor;
        Integer m33441i;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            List m33445e = m33445e(jSONObject.getJSONArray(ClientCookie.PATH_ATTR), this.f58763b);
            if (m33445e.size() != 0) {
                if (jSONObject.getString("change_type").equals("property")) {
                    String string = jSONObject.getJSONObject("property").getString("classname");
                    if (string != null) {
                        try {
                            C17622Fo1 m33444f = m33444f(Class.forName(string), jSONObject.getJSONObject("property"));
                            JSONArray jSONArray = jSONObject.getJSONArray("args");
                            Object[] objArr = new Object[jSONArray.length()];
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                                objArr[i] = m33449a(jSONArray2.get(0), jSONArray2.getString(1), arrayList);
                            }
                            C13106ph m68349a = m33444f.m68349a(objArr);
                            if (m68349a != null) {
                                layoutUpdateVisitor = new ViewVisitor.PropertySetVisitor(m33445e, m68349a, m33444f.f1701c);
                            } else {
                                throw new BadInstructionsException("Can't update a read-only property " + m33444f.f1699a + " (add a mutator to make this work)");
                            }
                        } catch (ClassNotFoundException e) {
                            throw new BadInstructionsException("Can't find class for visit path: " + str, e);
                        }
                    } else {
                        throw new BadInstructionsException("Can't bind an edit property without a target class");
                    }
                } else if (jSONObject.getString("change_type").equals("layout")) {
                    JSONArray jSONArray3 = jSONObject.getJSONArray("args");
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray3.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject optJSONObject = jSONArray3.optJSONObject(i2);
                        String string2 = optJSONObject.getString("view_id_name");
                        String string3 = optJSONObject.getString("anchor_id_name");
                        Integer m33441i2 = m33441i(-1, string2, this.f58763b);
                        if (string3.equals("0")) {
                            m33441i = 0;
                        } else if (string3.equals("-1")) {
                            m33441i = -1;
                        } else {
                            m33441i = m33441i(-1, string3, this.f58763b);
                        }
                        if (m33441i2 != null && m33441i != null) {
                            arrayList2.add(new ViewVisitor.LayoutRule(m33441i2.intValue(), optJSONObject.getInt("verb"), m33441i.intValue()));
                        }
                        MPLog.m33451w("MixpanelAPI.EProtocol", "View (" + string2 + ") or anchor (" + string3 + ") not found.");
                    }
                    layoutUpdateVisitor = new ViewVisitor.LayoutUpdateVisitor(m33445e, arrayList2, jSONObject.getString("name"), this.f58765d);
                } else {
                    throw new BadInstructionsException("Can't figure out the edit type");
                }
                return new Edit(layoutUpdateVisitor, arrayList);
            }
            throw new InapplicableInstructionsException("Edit will not be bound to any element in the UI.");
        } catch (NoSuchMethodException e2) {
            throw new BadInstructionsException("Can't create property mutator", e2);
        } catch (JSONException e3) {
            throw new BadInstructionsException("Can't interpret instructions due to JSONException", e3);
        }
    }

    /* renamed from: d */
    public ViewVisitor m33446d(JSONObject jSONObject, ViewVisitor.OnEventListener onEventListener) {
        try {
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("event_type");
            List m33445e = m33445e(jSONObject.getJSONArray(ClientCookie.PATH_ATTR), this.f58763b);
            if (m33445e.size() != 0) {
                if ("click".equals(string2)) {
                    return new ViewVisitor.AddAccessibilityEventVisitor(m33445e, 1, string, onEventListener);
                }
                if ("selected".equals(string2)) {
                    return new ViewVisitor.AddAccessibilityEventVisitor(m33445e, 4, string, onEventListener);
                }
                if ("text_changed".equals(string2)) {
                    return new ViewVisitor.AddTextChangeListener(m33445e, string, onEventListener);
                }
                if ("detected".equals(string2)) {
                    return new ViewVisitor.ViewDetectorVisitor(m33445e, string, onEventListener);
                }
                throw new BadInstructionsException("Mixpanel can't track event type \"" + string2 + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
            throw new InapplicableInstructionsException("event '" + string + "' will not be bound to any element in the UI.");
        } catch (JSONException e) {
            throw new BadInstructionsException("Can't interpret instructions due to JSONException", e);
        }
    }

    /* renamed from: e */
    public List m33445e(JSONArray jSONArray, ResourceIds resourceIds) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String optionalStringKey = JSONUtils.optionalStringKey(jSONObject, "prefix");
            String optionalStringKey2 = JSONUtils.optionalStringKey(jSONObject, "view_class");
            int optInt = jSONObject.optInt(FirebaseAnalytics.Param.INDEX, -1);
            String optionalStringKey3 = JSONUtils.optionalStringKey(jSONObject, "contentDescription");
            int optInt2 = jSONObject.optInt("id", -1);
            String optionalStringKey4 = JSONUtils.optionalStringKey(jSONObject, "mp_id_name");
            String optionalStringKey5 = JSONUtils.optionalStringKey(jSONObject, "tag");
            if ("shortest".equals(optionalStringKey)) {
                i = 1;
            } else if (optionalStringKey == null) {
                i = 0;
            } else {
                MPLog.m33451w("MixpanelAPI.EProtocol", "Unrecognized prefix type \"" + optionalStringKey + "\". No views will be matched");
                return f58761f;
            }
            Integer m33441i = m33441i(optInt2, optionalStringKey4, resourceIds);
            if (m33441i == null) {
                return f58761f;
            }
            arrayList.add(new Pathfinder.PathElement(i, optionalStringKey2, optInt, m33441i.intValue(), optionalStringKey3, optionalStringKey5));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final C17622Fo1 m33444f(Class cls, JSONObject jSONObject) {
        C13106ph c13106ph;
        try {
            String string = jSONObject.getString("name");
            String str = null;
            if (jSONObject.has("get")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("get");
                c13106ph = new C13106ph(cls, jSONObject2.getString("selector"), f58760e, Class.forName(jSONObject2.getJSONObject("result").getString("type")));
            } else {
                c13106ph = null;
            }
            if (jSONObject.has("set")) {
                str = jSONObject.getJSONObject("set").getString("selector");
            }
            return new C17622Fo1(string, cls, c13106ph, str);
        } catch (ClassNotFoundException e) {
            throw new BadInstructionsException("Can't read property JSON, relevant arg/return class not found", e);
        } catch (NoSuchMethodException e2) {
            throw new BadInstructionsException("Can't create property reader", e2);
        } catch (JSONException e3) {
            throw new BadInstructionsException("Can't read property JSON", e3);
        }
    }

    /* renamed from: g */
    public C19974g32 m33443g(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("config").getJSONArray("classes");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                Class<?> cls = Class.forName(jSONObject2.getString("name"));
                JSONArray jSONArray2 = jSONObject2.getJSONArray("properties");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList.add(m33444f(cls, jSONArray2.getJSONObject(i2)));
                }
            }
            return new C19974g32(this.f58762a, arrayList, this.f58763b);
        } catch (ClassNotFoundException e) {
            throw new BadInstructionsException("Can't resolve types for snapshot configuration", e);
        } catch (JSONException e2) {
            throw new BadInstructionsException("Can't read snapshot configuration", e2);
        }
    }

    /* renamed from: h */
    public MPPair m33442h(JSONObject jSONObject) {
        Object string;
        try {
            String string2 = jSONObject.getString("name");
            String string3 = jSONObject.getString("type");
            if ("number".equals(string3)) {
                String string4 = jSONObject.getString("encoding");
                if ("d".equals(string4)) {
                    string = Double.valueOf(jSONObject.getDouble("value"));
                } else if (OperatorName.LINE_TO.equals(string4)) {
                    string = Long.valueOf(jSONObject.getLong("value"));
                } else {
                    throw new BadInstructionsException("number must have encoding of type \"l\" for long or \"d\" for double in: " + jSONObject);
                }
            } else if (TypedValues.Custom.S_BOOLEAN.equals(string3)) {
                string = Boolean.valueOf(jSONObject.getBoolean("value"));
            } else if (TypedValues.Custom.S_STRING.equals(string3)) {
                string = jSONObject.getString("value");
            } else {
                throw new BadInstructionsException("Unrecognized tweak type " + string3 + " in: " + jSONObject);
            }
            return new MPPair(string2, string);
        } catch (JSONException e) {
            throw new BadInstructionsException("Can't read tweak update", e);
        }
    }

    /* renamed from: i */
    public final Integer m33441i(int i, String str, ResourceIds resourceIds) {
        int i2;
        if (str != null) {
            if (resourceIds.knownIdName(str)) {
                i2 = resourceIds.idFromName(str);
            } else {
                MPLog.m33451w("MixpanelAPI.EProtocol", "Path element contains an id name not known to the system. No views will be matched.\nMake sure that you're not stripping your packages R class out with proguard.\nid name was \"" + str + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                return null;
            }
        } else {
            i2 = -1;
        }
        if (-1 != i2 && -1 != i && i2 != i) {
            MPLog.m33457e("MixpanelAPI.EProtocol", "Path contains both a named and an explicit id, and they don't match. No views will be matched.");
            return null;
        } else if (-1 != i2) {
            return Integer.valueOf(i2);
        } else {
            return Integer.valueOf(i);
        }
    }
}
