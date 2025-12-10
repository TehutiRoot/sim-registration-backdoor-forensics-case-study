package com.google.gson;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class GsonBuilder {

    /* renamed from: a */
    public Excluder f56671a;

    /* renamed from: b */
    public LongSerializationPolicy f56672b;

    /* renamed from: c */
    public FieldNamingStrategy f56673c;

    /* renamed from: d */
    public final Map f56674d;

    /* renamed from: e */
    public final List f56675e;

    /* renamed from: f */
    public final List f56676f;

    /* renamed from: g */
    public boolean f56677g;

    /* renamed from: h */
    public String f56678h;

    /* renamed from: i */
    public int f56679i;

    /* renamed from: j */
    public int f56680j;

    /* renamed from: k */
    public boolean f56681k;

    /* renamed from: l */
    public boolean f56682l;

    /* renamed from: m */
    public boolean f56683m;

    /* renamed from: n */
    public FormattingStyle f56684n;

    /* renamed from: o */
    public boolean f56685o;

    /* renamed from: p */
    public Strictness f56686p;

    /* renamed from: q */
    public boolean f56687q;

    /* renamed from: r */
    public ToNumberStrategy f56688r;

    /* renamed from: s */
    public ToNumberStrategy f56689s;

    /* renamed from: t */
    public final ArrayDeque f56690t;

    public GsonBuilder() {
        this.f56671a = Excluder.DEFAULT;
        this.f56672b = LongSerializationPolicy.DEFAULT;
        this.f56673c = FieldNamingPolicy.IDENTITY;
        this.f56674d = new HashMap();
        this.f56675e = new ArrayList();
        this.f56676f = new ArrayList();
        this.f56677g = false;
        this.f56678h = Gson.f56641B;
        this.f56679i = 2;
        this.f56680j = 2;
        this.f56681k = false;
        this.f56682l = false;
        this.f56683m = true;
        this.f56684n = Gson.f56640A;
        this.f56685o = false;
        this.f56686p = Gson.f56645z;
        this.f56687q = true;
        this.f56688r = Gson.f56643D;
        this.f56689s = Gson.f56644E;
        this.f56690t = new ArrayDeque();
    }

    /* renamed from: a */
    public static void m37574a(String str, int i, int i2, List list) {
        TypeAdapterFactory typeAdapterFactory;
        TypeAdapterFactory typeAdapterFactory2;
        boolean z = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        TypeAdapterFactory typeAdapterFactory3 = null;
        if (str != null && !str.trim().isEmpty()) {
            typeAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
            if (z) {
                typeAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                typeAdapterFactory2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
            }
            typeAdapterFactory2 = null;
        } else if (i == 2 && i2 == 2) {
            return;
        } else {
            TypeAdapterFactory createAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i, i2);
            if (z) {
                typeAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i, i2);
                TypeAdapterFactory createAdapterFactory2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i, i2);
                typeAdapterFactory = createAdapterFactory;
                typeAdapterFactory2 = createAdapterFactory2;
            } else {
                typeAdapterFactory = createAdapterFactory;
                typeAdapterFactory2 = null;
            }
        }
        list.add(typeAdapterFactory);
        if (z) {
            list.add(typeAdapterFactory3);
            list.add(typeAdapterFactory2);
        }
    }

    /* renamed from: b */
    public static int m37573b(int i) {
        if (i >= 0 && i <= 3) {
            return i;
        }
        throw new IllegalArgumentException("Invalid style: " + i);
    }

    /* renamed from: c */
    public static boolean m37572c(Type type) {
        if ((type instanceof Class) && (type == Object.class || JsonElement.class.isAssignableFrom((Class) type))) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        Objects.requireNonNull(exclusionStrategy);
        this.f56671a = this.f56671a.withExclusionStrategy(exclusionStrategy, false, true);
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder addReflectionAccessFilter(ReflectionAccessFilter reflectionAccessFilter) {
        Objects.requireNonNull(reflectionAccessFilter);
        this.f56690t.addFirst(reflectionAccessFilter);
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        Objects.requireNonNull(exclusionStrategy);
        this.f56671a = this.f56671a.withExclusionStrategy(exclusionStrategy, true, false);
        return this;
    }

    public Gson create() {
        ArrayList arrayList = new ArrayList(this.f56675e.size() + this.f56676f.size() + 3);
        arrayList.addAll(this.f56675e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f56676f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m37574a(this.f56678h, this.f56679i, this.f56680j, arrayList);
        return new Gson(this.f56671a, this.f56673c, new HashMap(this.f56674d), this.f56677g, this.f56681k, this.f56685o, this.f56683m, this.f56684n, this.f56686p, this.f56682l, this.f56687q, this.f56672b, this.f56678h, this.f56679i, this.f56680j, new ArrayList(this.f56675e), new ArrayList(this.f56676f), arrayList, this.f56688r, this.f56689s, new ArrayList(this.f56690t));
    }

    @CanIgnoreReturnValue
    public GsonBuilder disableHtmlEscaping() {
        this.f56683m = false;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder disableInnerClassSerialization() {
        this.f56671a = this.f56671a.disableInnerClassSerialization();
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder disableJdkUnsafe() {
        this.f56687q = false;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder enableComplexMapKeySerialization() {
        this.f56681k = true;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        Objects.requireNonNull(iArr);
        this.f56671a = this.f56671a.withModifiers(iArr);
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.f56671a = this.f56671a.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder generateNonExecutableJson() {
        this.f56685o = true;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        boolean z;
        Objects.requireNonNull(type);
        boolean z2 = obj instanceof JsonSerializer;
        if (!z2 && !(obj instanceof JsonDeserializer) && !(obj instanceof InstanceCreator) && !(obj instanceof TypeAdapter)) {
            z = false;
        } else {
            z = true;
        }
        C$Gson$Preconditions.checkArgument(z);
        if (!m37572c(type)) {
            if (obj instanceof InstanceCreator) {
                this.f56674d.put(type, (InstanceCreator) obj);
            }
            if (z2 || (obj instanceof JsonDeserializer)) {
                this.f56675e.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
            }
            if (obj instanceof TypeAdapter) {
                this.f56675e.add(TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter) obj));
            }
            return this;
        }
        throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
    }

    @CanIgnoreReturnValue
    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory) {
        Objects.requireNonNull(typeAdapterFactory);
        this.f56675e.add(typeAdapterFactory);
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        boolean z;
        Objects.requireNonNull(cls);
        boolean z2 = obj instanceof JsonSerializer;
        if (!z2 && !(obj instanceof JsonDeserializer) && !(obj instanceof TypeAdapter)) {
            z = false;
        } else {
            z = true;
        }
        C$Gson$Preconditions.checkArgument(z);
        if (!JsonElement.class.isAssignableFrom(cls)) {
            if ((obj instanceof JsonDeserializer) || z2) {
                this.f56676f.add(TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
            }
            if (obj instanceof TypeAdapter) {
                this.f56675e.add(TypeAdapters.newTypeHierarchyFactory(cls, (TypeAdapter) obj));
            }
            return this;
        }
        throw new IllegalArgumentException("Cannot override built-in adapter for " + cls);
    }

    @CanIgnoreReturnValue
    public GsonBuilder serializeNulls() {
        this.f56677g = true;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.f56682l = true;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder setDateFormat(String str) {
        if (str != null) {
            try {
                new SimpleDateFormat(str);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("The date pattern '" + str + "' is not valid", e);
            }
        }
        this.f56678h = str;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder setExclusionStrategies(ExclusionStrategy... exclusionStrategyArr) {
        Objects.requireNonNull(exclusionStrategyArr);
        for (ExclusionStrategy exclusionStrategy : exclusionStrategyArr) {
            this.f56671a = this.f56671a.withExclusionStrategy(exclusionStrategy, true, true);
        }
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy) {
        return setFieldNamingStrategy(fieldNamingPolicy);
    }

    @CanIgnoreReturnValue
    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        Objects.requireNonNull(fieldNamingStrategy);
        this.f56673c = fieldNamingStrategy;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder setFormattingStyle(FormattingStyle formattingStyle) {
        Objects.requireNonNull(formattingStyle);
        this.f56684n = formattingStyle;
        return this;
    }

    @CanIgnoreReturnValue
    @InlineMe(imports = {"com.google.gson.Strictness"}, replacement = "this.setStrictness(Strictness.LENIENT)")
    @Deprecated
    public GsonBuilder setLenient() {
        return setStrictness(Strictness.LENIENT);
    }

    @CanIgnoreReturnValue
    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy) {
        Objects.requireNonNull(longSerializationPolicy);
        this.f56672b = longSerializationPolicy;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder setNumberToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        Objects.requireNonNull(toNumberStrategy);
        this.f56689s = toNumberStrategy;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder setObjectToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        Objects.requireNonNull(toNumberStrategy);
        this.f56688r = toNumberStrategy;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder setPrettyPrinting() {
        return setFormattingStyle(FormattingStyle.PRETTY);
    }

    @CanIgnoreReturnValue
    public GsonBuilder setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f56686p = strictness;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder setVersion(double d) {
        if (!Double.isNaN(d) && d >= 0.0d) {
            this.f56671a = this.f56671a.withVersion(d);
            return this;
        }
        throw new IllegalArgumentException("Invalid version: " + d);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public GsonBuilder setDateFormat(int i) {
        this.f56679i = m37573b(i);
        this.f56678h = null;
        return this;
    }

    @CanIgnoreReturnValue
    public GsonBuilder setDateFormat(int i, int i2) {
        this.f56679i = m37573b(i);
        this.f56680j = m37573b(i2);
        this.f56678h = null;
        return this;
    }

    public GsonBuilder(Gson gson) {
        this.f56671a = Excluder.DEFAULT;
        this.f56672b = LongSerializationPolicy.DEFAULT;
        this.f56673c = FieldNamingPolicy.IDENTITY;
        HashMap hashMap = new HashMap();
        this.f56674d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f56675e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f56676f = arrayList2;
        this.f56677g = false;
        this.f56678h = Gson.f56641B;
        this.f56679i = 2;
        this.f56680j = 2;
        this.f56681k = false;
        this.f56682l = false;
        this.f56683m = true;
        this.f56684n = Gson.f56640A;
        this.f56685o = false;
        this.f56686p = Gson.f56645z;
        this.f56687q = true;
        this.f56688r = Gson.f56643D;
        this.f56689s = Gson.f56644E;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f56690t = arrayDeque;
        this.f56671a = gson.f56651f;
        this.f56673c = gson.f56652g;
        hashMap.putAll(gson.f56653h);
        this.f56677g = gson.f56654i;
        this.f56681k = gson.f56655j;
        this.f56685o = gson.f56656k;
        this.f56683m = gson.f56657l;
        this.f56684n = gson.f56658m;
        this.f56686p = gson.f56659n;
        this.f56682l = gson.f56660o;
        this.f56672b = gson.f56665t;
        this.f56678h = gson.f56662q;
        this.f56679i = gson.f56663r;
        this.f56680j = gson.f56664s;
        arrayList.addAll(gson.f56666u);
        arrayList2.addAll(gson.f56667v);
        this.f56687q = gson.f56661p;
        this.f56688r = gson.f56668w;
        this.f56689s = gson.f56669x;
        arrayDeque.addAll(gson.f56670y);
    }
}
