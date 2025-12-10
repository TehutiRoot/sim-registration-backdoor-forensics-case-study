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
    public final ConcurrentMap f58636a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ConcurrentMap f58637b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentMap f58638c = new ConcurrentHashMap();

    /* renamed from: d */
    public final List f58639d = new ArrayList();

    /* loaded from: classes5.dex */
    public interface OnTweakDeclaredListener {
        void onTweakDeclared();
    }

    /* loaded from: classes5.dex */
    public static class TweakValue {

        /* renamed from: a */
        public final Object f58640a;

        /* renamed from: b */
        public final Object f58641b;

        /* renamed from: c */
        public final Number f58642c;

        /* renamed from: d */
        public final Number f58643d;

        /* renamed from: e */
        public final String f58644e;
        public final int type;

        public /* synthetic */ TweakValue(int i, Object obj, Number number, Number number2, Object obj2, String str, C9170d c9170d) {
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
        public final boolean m33552b(Object obj) {
            try {
                Number number = (Number) obj;
                if (Math.min(Math.max(number.longValue(), this.f58642c.longValue()), this.f58643d.longValue()) != this.f58642c.longValue()) {
                    if (Math.min(Math.max(number.longValue(), this.f58642c.longValue()), this.f58643d.longValue()) == this.f58643d.longValue()) {
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
            Object obj = this.f58641b;
            if (obj != null) {
                try {
                    bool = (Boolean) obj;
                } catch (ClassCastException unused) {
                }
            }
            Object obj2 = this.f58640a;
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
            return this.f58641b;
        }

        public Number getMaximum() {
            return this.f58643d;
        }

        public Number getMinimum() {
            return this.f58642c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Number] */
        public Number getNumberValue() {
            int i = 0;
            Object obj = this.f58641b;
            if (obj != null) {
                try {
                    i = (Number) obj;
                } catch (ClassCastException unused) {
                }
            }
            Object obj2 = this.f58640a;
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
                str = (String) this.f58641b;
            } catch (ClassCastException unused) {
                str = null;
            }
            try {
                return (String) this.f58640a;
            } catch (ClassCastException unused2) {
                return str;
            }
        }

        public Object getValue() {
            return this.f58640a;
        }

        public TweakValue updateValue(Object obj) {
            return new TweakValue(this.type, this.f58641b, this.f58642c, this.f58643d, obj, this.f58644e);
        }

        public TweakValue(int i, Object obj, Number number, Number number2, Object obj2, String str) {
            Object obj3;
            Long l = obj2;
            this.type = i;
            this.f58644e = str;
            this.f58642c = number;
            this.f58643d = number2;
            if (number == null || number2 == null) {
                obj3 = obj;
            } else {
                if (m33552b(obj)) {
                    obj3 = obj;
                } else {
                    obj3 = Long.valueOf(Math.min(Math.max(((Number) obj).longValue(), number.longValue()), number2.longValue()));
                    MPLog.m33451w("MixpanelAPI.Tweaks", "Attempt to define a tweak \"" + str + "\" with default value " + obj3 + " out of its bounds [" + number + ", " + number2 + "]Tweak \"" + str + "\" new default value: " + obj3 + ".");
                }
                if (!m33552b(l)) {
                    Long valueOf = Long.valueOf(Math.min(Math.max(((Number) l).longValue(), number.longValue()), number2.longValue()));
                    MPLog.m33451w("MixpanelAPI.Tweaks", "Attempt to define a tweak \"" + str + "\" with value " + obj3 + " out of its bounds [" + number + ", " + number2 + "]Tweak \"" + str + "\" new value: " + valueOf + ".");
                    l = valueOf;
                }
            }
            this.f58641b = obj3;
            this.f58640a = l;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$a */
    /* loaded from: classes5.dex */
    public class C9167a implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58645a;

        public C9167a(String str) {
            this.f58645a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Byte get() {
            return Byte.valueOf(Tweaks.this.m33560h(this.f58645a).getNumberValue().byteValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$b */
    /* loaded from: classes5.dex */
    public class C9168b implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58647a;

        public C9168b(String str) {
            this.f58647a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Short get() {
            return Short.valueOf(Tweaks.this.m33560h(this.f58647a).getNumberValue().shortValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$c */
    /* loaded from: classes5.dex */
    public class C9169c implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58649a;

        public C9169c(String str) {
            this.f58649a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Boolean get() {
            return Tweaks.this.m33560h(this.f58649a).getBooleanValue();
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$d */
    /* loaded from: classes5.dex */
    public class C9170d implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58651a;

        public C9170d(String str) {
            this.f58651a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public String get() {
            return Tweaks.this.m33560h(this.f58651a).getStringValue();
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$e */
    /* loaded from: classes5.dex */
    public class C9171e implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58653a;

        public C9171e(String str) {
            this.f58653a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Double get() {
            return Double.valueOf(Tweaks.this.m33560h(this.f58653a).getNumberValue().doubleValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$f */
    /* loaded from: classes5.dex */
    public class C9172f implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58655a;

        public C9172f(String str) {
            this.f58655a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Double get() {
            return Double.valueOf(Tweaks.this.m33560h(this.f58655a).getNumberValue().doubleValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$g */
    /* loaded from: classes5.dex */
    public class C9173g implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58657a;

        public C9173g(String str) {
            this.f58657a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Float get() {
            return Float.valueOf(Tweaks.this.m33560h(this.f58657a).getNumberValue().floatValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$h */
    /* loaded from: classes5.dex */
    public class C9174h implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58659a;

        public C9174h(String str) {
            this.f58659a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Float get() {
            return Float.valueOf(Tweaks.this.m33560h(this.f58659a).getNumberValue().floatValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$i */
    /* loaded from: classes5.dex */
    public class C9175i implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58661a;

        public C9175i(String str) {
            this.f58661a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Long get() {
            return Long.valueOf(Tweaks.this.m33560h(this.f58661a).getNumberValue().longValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$j */
    /* loaded from: classes5.dex */
    public class C9176j implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58663a;

        public C9176j(String str) {
            this.f58663a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Long get() {
            return Long.valueOf(Tweaks.this.m33560h(this.f58663a).getNumberValue().longValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$k */
    /* loaded from: classes5.dex */
    public class C9177k implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58665a;

        public C9177k(String str) {
            this.f58665a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Integer get() {
            return Integer.valueOf(Tweaks.this.m33560h(this.f58665a).getNumberValue().intValue());
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.Tweaks$l */
    /* loaded from: classes5.dex */
    public class C9178l implements Tweak {

        /* renamed from: a */
        public final /* synthetic */ String f58667a;

        public C9178l(String str) {
            this.f58667a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.Tweak
        /* renamed from: a */
        public Integer get() {
            return Integer.valueOf(Tweaks.this.m33560h(this.f58667a).getNumberValue().intValue());
        }
    }

    public synchronized void addOnTweakDeclaredListener(OnTweakDeclaredListener onTweakDeclaredListener) {
        if (onTweakDeclaredListener != null) {
            this.f58639d.add(onTweakDeclaredListener);
        } else {
            throw new NullPointerException("listener cannot be null");
        }
    }

    public void addUndeclaredTweak(String str, TweakValue tweakValue) {
        if (str != null && tweakValue != null) {
            this.f58638c.put(str, tweakValue);
        }
    }

    /* renamed from: b */
    public Tweak m33566b(String str, boolean z) {
        declareTweak(str, Boolean.valueOf(z), null, null, 1);
        return new C9169c(str);
    }

    /* renamed from: c */
    public Tweak m33565c(String str, byte b) {
        declareTweak(str, Byte.valueOf(b), null, null, 3);
        return new C9167a(str);
    }

    /* renamed from: d */
    public Tweak m33564d(String str, double d) {
        declareTweak(str, Double.valueOf(d), null, null, 2);
        return new C9171e(str);
    }

    public void declareTweak(String str, Object obj, Number number, Number number2, int i) {
        TweakValue tweakValue;
        if (this.f58636a.containsKey(str)) {
            MPLog.m33451w("MixpanelAPI.Tweaks", "Attempt to define a tweak \"" + str + "\" twice with the same name");
            return;
        }
        if (this.f58638c.containsKey(str)) {
            tweakValue = (TweakValue) this.f58638c.get(str);
            this.f58638c.remove(str);
        } else {
            tweakValue = new TweakValue(i, obj, number, number2, obj, str, null);
        }
        this.f58636a.put(str, tweakValue);
        this.f58637b.put(str, tweakValue);
        int size = this.f58639d.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((OnTweakDeclaredListener) this.f58639d.get(i2)).onTweakDeclared();
        }
    }

    /* renamed from: e */
    public Tweak m33563e(String str, double d, double d2, double d3) {
        declareTweak(str, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), 2);
        return new C9172f(str);
    }

    /* renamed from: f */
    public Tweak m33562f(String str, float f) {
        declareTweak(str, Float.valueOf(f), null, null, 2);
        return new C9173g(str);
    }

    /* renamed from: g */
    public Tweak m33561g(String str, float f, float f2, float f3) {
        declareTweak(str, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), 2);
        return new C9174h(str);
    }

    public synchronized Map<String, TweakValue> getAllValues() {
        return new HashMap(this.f58636a);
    }

    public synchronized Map<String, TweakValue> getDefaultValues() {
        return new HashMap(this.f58637b);
    }

    /* renamed from: h */
    public final synchronized TweakValue m33560h(String str) {
        return (TweakValue) this.f58636a.get(str);
    }

    /* renamed from: i */
    public Tweak m33559i(String str, int i) {
        declareTweak(str, Integer.valueOf(i), null, null, 3);
        return new C9177k(str);
    }

    public synchronized boolean isNewValue(String str, Object obj) {
        if (!this.f58636a.containsKey(str)) {
            return false;
        }
        return !((TweakValue) this.f58636a.get(str)).f58640a.equals(obj);
    }

    /* renamed from: j */
    public Tweak m33558j(String str, int i, int i2, int i3) {
        declareTweak(str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 3);
        return new C9178l(str);
    }

    /* renamed from: k */
    public Tweak m33557k(String str, long j) {
        declareTweak(str, Long.valueOf(j), null, null, 3);
        return new C9175i(str);
    }

    /* renamed from: l */
    public Tweak m33556l(String str, long j, long j2, long j3) {
        declareTweak(str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), 3);
        return new C9176j(str);
    }

    /* renamed from: m */
    public Tweak m33555m(String str, short s) {
        declareTweak(str, Short.valueOf(s), null, null, 3);
        return new C9168b(str);
    }

    /* renamed from: n */
    public Tweak m33554n(String str, String str2) {
        declareTweak(str, str2, null, null, 4);
        return new C9170d(str);
    }

    public synchronized void set(String str, Object obj) {
        if (!this.f58636a.containsKey(str)) {
            MPLog.m33451w("MixpanelAPI.Tweaks", "Attempt to set a tweak \"" + str + "\" which has never been defined.");
            return;
        }
        this.f58636a.put(str, ((TweakValue) this.f58636a.get(str)).updateValue(obj));
    }
}
