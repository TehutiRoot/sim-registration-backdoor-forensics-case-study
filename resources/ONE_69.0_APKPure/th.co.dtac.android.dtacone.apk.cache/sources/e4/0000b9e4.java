package com.mixpanel.android.mpmetrics;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mixpanel.android.util.MPLog;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class Tweaks {
    public static final int BOOLEAN_TYPE = 1;
    public static final int DOUBLE_TYPE = 2;
    public static final int LONG_TYPE = 3;
    public static final int STRING_TYPE = 4;

    /* renamed from: a */
    public final ConcurrentMap f58648a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ConcurrentMap f58649b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentMap f58650c = new ConcurrentHashMap();

    /* renamed from: d */
    public final List f58651d = new ArrayList();

    /* loaded from: classes5.dex */
    public interface OnTweakDeclaredListener {
        void onTweakDeclared();
    }

    /* loaded from: classes5.dex */
    public static class TweakValue {

        /* renamed from: a */
        public final Object f58652a;

        /* renamed from: b */
        public final Object f58653b;

        /* renamed from: c */
        public final Number f58654c;

        /* renamed from: d */
        public final Number f58655d;

        /* renamed from: e */
        public final String f58656e;
        public final int type;

        public /* synthetic */ TweakValue(int i, Object obj, Number number, Number number2, Object obj2, String str, C9159d c9159d) {
            this(i, obj, number, number2, obj2, str);
        }

        public static TweakValue fromJson(JSONObject jSONObject) {
            String string;
            String string2;
            Object string3;
            Number number;
            Number number2;
            Object obj;
            int i;
            Object valueOf;
            Object valueOf2;
            Number number3;
            int i2;
            Number valueOf3;
            try {
                string = jSONObject.getString("name");
                string2 = jSONObject.getString("type");
            } catch (JSONException unused) {
            }
            if ("number".equals(string2)) {
                String string4 = jSONObject.getString("encoding");
                if ("d".equals(string4)) {
                    valueOf = Double.valueOf(jSONObject.getDouble("value"));
                    valueOf2 = Double.valueOf(jSONObject.getDouble("default"));
                    if (!jSONObject.isNull("minimum")) {
                        number3 = Double.valueOf(jSONObject.getDouble("minimum"));
                    } else {
                        number3 = null;
                    }
                    i2 = 2;
                    if (!jSONObject.isNull("maximum")) {
                        valueOf3 = Double.valueOf(jSONObject.getDouble("maximum"));
                        obj = valueOf;
                        string3 = valueOf2;
                        number = number3;
                        i = i2;
                        number2 = valueOf3;
                    }
                    valueOf3 = null;
                    obj = valueOf;
                    string3 = valueOf2;
                    number = number3;
                    i = i2;
                    number2 = valueOf3;
                } else if (!OperatorName.LINE_TO.equals(string4)) {
                    return null;
                } else {
                    valueOf = Long.valueOf(jSONObject.getLong("value"));
                    valueOf2 = Long.valueOf(jSONObject.getLong("default"));
                    if (!jSONObject.isNull("minimum")) {
                        number3 = Long.valueOf(jSONObject.getLong("minimum"));
                    } else {
                        number3 = null;
                    }
                    i2 = 3;
                    if (!jSONObject.isNull("maximum")) {
                        valueOf3 = Long.valueOf(jSONObject.getLong("maximum"));
                        obj = valueOf;
                        string3 = valueOf2;
                        number = number3;
                        i = i2;
                        number2 = valueOf3;
                    }
                    valueOf3 = null;
                    obj = valueOf;
                    string3 = valueOf2;
                    number = number3;
                    i = i2;
                    number2 = valueOf3;
                }
                return null;
            } else if (TypedValues.Custom.S_BOOLEAN.equals(string2)) {
                Object valueOf4 = Boolean.valueOf(jSONObject.getBoolean("value"));
                string3 = Boolean.valueOf(jSONObject.getBoolean("default"));
                number = null;
                number2 = null;
                obj = valueOf4;
                i = 1;
            } else {
                if (TypedValues.Custom.S_STRING.equals(string2)) {
                    Object string5 = jSONObject.getString("value");
                    string3 = jSONObject.getString("default");
                    number = null;
                    number2 = null;
                    obj = string5;
                    i = 4;
                }
                return null;
            }
            return new TweakValue(i, string3, number, number2, obj, string);
        }

        /* renamed from: b */
        public final boolean m33544b(Object obj) {
            try {
                Number number = (Number) obj;
                if (Math.min(Math.max(number.longValue(), this.f58654c.longValue()), this.f58655d.longValue()) != this.f58654c.longValue()) {
                    if (Math.min(Math.max(number.longValue(), this.f58654c.longValue()), this.f58655d.longValue()) == this.f58655d.longValue()) {
                        return false;
                    }
                    return true;
                }
                return false;
            } catch (ClassCastException unused) {
                return true;
            }
        }

        public Boolean getBooleanValue() {
            Boolean bool = Boolean.FALSE;
            Object obj = this.f58653b;
            if (obj != null) {
                try {
                    bool = (Boolean) obj;
                } catch (ClassCastException unused) {
                }
            }
            Object obj2 = this.f58652a;
            if (obj2 != null) {
                try {
                    return (Boolean) obj2;
                } catch (ClassCastException unused2) {
                    return bool;
                }
            }
            return bool;
        }

        public Object getDefaultValue() {
            return this.f58653b;
        }

        public Number getMaximum() {
            return this.f58655d;
        }

        public Number getMinimum() {
            return this.f58654c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Number] */
        public Number getNumberValue() {
            int i = 0;
            Object obj = this.f58653b;
            if (obj != null) {
                try {
                    i = (Number) obj;
                } catch (ClassCastException unused) {
                }
            }
            Object obj2 = this.f58652a;
            if (obj2 != null) {
                try {
                    return (Number) obj2;
                } catch (ClassCastException unused2) {
                    return i;
                }
            }
            return i;
        }

        public String getStringValue() {
            String str;
            try {
                str = (String) this.f58653b;
            } catch (ClassCastException unused) {
                str = null;
            }
            try {
                return (String) this.f58652a;
            } catch (ClassCastException unused2) {
                return str;
            }
        }

        public Object getValue() {
            return this.f58652a;
        }

        public TweakValue updateValue(Object obj) {
            return new TweakValue(this.type, this.f58653b, this.f58654c, this.f58655d, obj, this.f58656e);
        }

        public TweakValue(int i, Object obj, Number number, Number number2, Object obj2, String str) {
            Object obj3;
            Long l = obj2;
            this.type = i;
            this.f58656e = str;
            this.f58654c = number;
            this.f58655d = number2;
            if (number == null || number2 == null) {
                obj3 = obj;
            } else {
                if (m33544b(obj)) {
                    obj3 = obj;
                } else {
                    obj3 = Long.valueOf(Math.min(Math.max(((Number) obj).longValue(), number.longValue()), number2.longValue()));
                    MPLog.m33443w("MixpanelAPI.Tweaks", "Attempt to define a tweak \"" + str + "\" with default value " + obj3 + " out of its bounds [" + number + ", " + number2 + "]Tweak \"" + str + "\" new default value: " + obj3 + ".");
                }
                if (!m33544b(l)) {
                    Long valueOf = Long.valueOf(Math.min(Math.max(((Number) l).longValue(), number.longValue()), number2.longValue()));
                    MPLog.m33443w("MixpanelAPI.Tweaks", "Attempt to define a tweak \"" + str + "\" with value " + obj3 + " out of its bounds [" + number + ", " + number2 + "]Tweak \"" + str + "\" new value: " + valueOf + ".");
                    l = valueOf;
                }
            }
            this.f58653b = obj3;
            this.f58652a = l;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$a */
    /* loaded from: classes5.dex */
    public class C9156a implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58657a;

        public C9156a(String str) {
            this.f58657a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Byte get() {
            return Byte.valueOf(Tweaks.this.m33552h(this.f58657a).getNumberValue().byteValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$b */
    /* loaded from: classes5.dex */
    public class C9157b implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58659a;

        public C9157b(String str) {
            this.f58659a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Short get() {
            return Short.valueOf(Tweaks.this.m33552h(this.f58659a).getNumberValue().shortValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$c */
    /* loaded from: classes5.dex */
    public class C9158c implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58661a;

        public C9158c(String str) {
            this.f58661a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Boolean get() {
            return Tweaks.this.m33552h(this.f58661a).getBooleanValue();
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$d */
    /* loaded from: classes5.dex */
    public class C9159d implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58663a;

        public C9159d(String str) {
            this.f58663a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public String get() {
            return Tweaks.this.m33552h(this.f58663a).getStringValue();
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$e */
    /* loaded from: classes5.dex */
    public class C9160e implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58665a;

        public C9160e(String str) {
            this.f58665a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Double get() {
            return Double.valueOf(Tweaks.this.m33552h(this.f58665a).getNumberValue().doubleValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$f */
    /* loaded from: classes5.dex */
    public class C9161f implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58667a;

        public C9161f(String str) {
            this.f58667a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Double get() {
            return Double.valueOf(Tweaks.this.m33552h(this.f58667a).getNumberValue().doubleValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$g */
    /* loaded from: classes5.dex */
    public class C9162g implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58669a;

        public C9162g(String str) {
            this.f58669a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Float get() {
            return Float.valueOf(Tweaks.this.m33552h(this.f58669a).getNumberValue().floatValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$h */
    /* loaded from: classes5.dex */
    public class C9163h implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58671a;

        public C9163h(String str) {
            this.f58671a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Float get() {
            return Float.valueOf(Tweaks.this.m33552h(this.f58671a).getNumberValue().floatValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$i */
    /* loaded from: classes5.dex */
    public class C9164i implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58673a;

        public C9164i(String str) {
            this.f58673a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Long get() {
            return Long.valueOf(Tweaks.this.m33552h(this.f58673a).getNumberValue().longValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$j */
    /* loaded from: classes5.dex */
    public class C9165j implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58675a;

        public C9165j(String str) {
            this.f58675a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Long get() {
            return Long.valueOf(Tweaks.this.m33552h(this.f58675a).getNumberValue().longValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$k */
    /* loaded from: classes5.dex */
    public class C9166k implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58677a;

        public C9166k(String str) {
            this.f58677a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Integer get() {
            return Integer.valueOf(Tweaks.this.m33552h(this.f58677a).getNumberValue().intValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$l */
    /* loaded from: classes5.dex */
    public class C9167l implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58679a;

        public C9167l(String str) {
            this.f58679a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Integer get() {
            return Integer.valueOf(Tweaks.this.m33552h(this.f58679a).getNumberValue().intValue());
        }
    }

    public synchronized void addOnTweakDeclaredListener(OnTweakDeclaredListener onTweakDeclaredListener) {
        if (onTweakDeclaredListener != null) {
            this.f58651d.add(onTweakDeclaredListener);
        } else {
            throw new NullPointerException("listener cannot be null");
        }
    }

    public void addUndeclaredTweak(String str, TweakValue tweakValue) {
        if (str != null && tweakValue != null) {
            this.f58650c.put(str, tweakValue);
        }
    }

    /* renamed from: b */
    public Tweak m33558b(String str, boolean z) {
        declareTweak(str, Boolean.valueOf(z), null, null, 1);
        return new C9158c(str);
    }

    /* renamed from: c */
    public Tweak m33557c(String str, byte b) {
        declareTweak(str, Byte.valueOf(b), null, null, 3);
        return new C9156a(str);
    }

    /* renamed from: d */
    public Tweak m33556d(String str, double d) {
        declareTweak(str, Double.valueOf(d), null, null, 2);
        return new C9160e(str);
    }

    public void declareTweak(String str, Object obj, Number number, Number number2, int i) {
        TweakValue tweakValue;
        if (this.f58648a.containsKey(str)) {
            MPLog.m33443w("MixpanelAPI.Tweaks", "Attempt to define a tweak \"" + str + "\" twice with the same name");
            return;
        }
        if (this.f58650c.containsKey(str)) {
            tweakValue = (TweakValue) this.f58650c.get(str);
            this.f58650c.remove(str);
        } else {
            tweakValue = new TweakValue(i, obj, number, number2, obj, str, null);
        }
        this.f58648a.put(str, tweakValue);
        this.f58649b.put(str, tweakValue);
        int size = this.f58651d.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((OnTweakDeclaredListener) this.f58651d.get(i2)).onTweakDeclared();
        }
    }

    /* renamed from: e */
    public Tweak m33555e(String str, double d, double d2, double d3) {
        declareTweak(str, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), 2);
        return new C9161f(str);
    }

    /* renamed from: f */
    public Tweak m33554f(String str, float f) {
        declareTweak(str, Float.valueOf(f), null, null, 2);
        return new C9162g(str);
    }

    /* renamed from: g */
    public Tweak m33553g(String str, float f, float f2, float f3) {
        declareTweak(str, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), 2);
        return new C9163h(str);
    }

    public synchronized Map<String, TweakValue> getAllValues() {
        return new HashMap(this.f58648a);
    }

    public synchronized Map<String, TweakValue> getDefaultValues() {
        return new HashMap(this.f58649b);
    }

    /* renamed from: h */
    public final synchronized TweakValue m33552h(String str) {
        return (TweakValue) this.f58648a.get(str);
    }

    /* renamed from: i */
    public Tweak m33551i(String str, int i) {
        declareTweak(str, Integer.valueOf(i), null, null, 3);
        return new C9166k(str);
    }

    public synchronized boolean isNewValue(String str, Object obj) {
        if (!this.f58648a.containsKey(str)) {
            return false;
        }
        return !((TweakValue) this.f58648a.get(str)).f58652a.equals(obj);
    }

    /* renamed from: j */
    public Tweak m33550j(String str, int i, int i2, int i3) {
        declareTweak(str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 3);
        return new C9167l(str);
    }

    /* renamed from: k */
    public Tweak m33549k(String str, long j) {
        declareTweak(str, Long.valueOf(j), null, null, 3);
        return new C9164i(str);
    }

    /* renamed from: l */
    public Tweak m33548l(String str, long j, long j2, long j3) {
        declareTweak(str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), 3);
        return new C9165j(str);
    }

    /* renamed from: m */
    public Tweak m33547m(String str, short s) {
        declareTweak(str, Short.valueOf(s), null, null, 3);
        return new C9157b(str);
    }

    /* renamed from: n */
    public Tweak m33546n(String str, String str2) {
        declareTweak(str, str2, null, null, 4);
        return new C9159d(str);
    }

    public synchronized void set(String str, Object obj) {
        if (!this.f58648a.containsKey(str)) {
            MPLog.m33443w("MixpanelAPI.Tweaks", "Attempt to set a tweak \"" + str + "\" which has never been defined.");
            return;
        }
        this.f58648a.put(str, ((TweakValue) this.f58648a.get(str)).updateValue(obj));
    }
}