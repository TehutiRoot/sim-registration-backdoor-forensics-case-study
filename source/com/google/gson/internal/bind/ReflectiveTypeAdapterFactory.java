package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a */
    public final ConstructorConstructor f56779a;

    /* renamed from: b */
    public final FieldNamingStrategy f56780b;

    /* renamed from: c */
    public final Excluder f56781c;

    /* renamed from: d */
    public final JsonAdapterAnnotationTypeAdapterFactory f56782d;

    /* renamed from: e */
    public final List f56783e;

    /* loaded from: classes4.dex */
    public static abstract class Adapter<T, A> extends TypeAdapter<T> {
        private final C8747c fieldsData;

        public Adapter(C8747c c8747c) {
            this.fieldsData = c8747c;
        }

        public abstract A createAccumulator();

        public abstract T finalize(A a);

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A createAccumulator = createAccumulator();
            Map map = this.fieldsData.f56795a;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    AbstractC8746b abstractC8746b = (AbstractC8746b) map.get(jsonReader.nextName());
                    if (abstractC8746b == null) {
                        jsonReader.skipValue();
                    } else {
                        readField(createAccumulator, jsonReader, abstractC8746b);
                    }
                }
                jsonReader.endObject();
                return finalize(createAccumulator);
            } catch (IllegalAccessException e) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        public abstract void readField(A a, JsonReader jsonReader, AbstractC8746b abstractC8746b) throws IllegalAccessException, IOException;

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (AbstractC8746b abstractC8746b : this.fieldsData.f56796b) {
                    abstractC8746b.mo37507c(jsonWriter, t);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        private final ObjectConstructor<T> constructor;

        public FieldReflectionAdapter(ObjectConstructor<T> objectConstructor, C8747c c8747c) {
            super(c8747c);
            this.constructor = objectConstructor;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T createAccumulator() {
            return this.constructor.construct();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(T t) {
            return t;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(T t, JsonReader jsonReader, AbstractC8746b abstractC8746b) throws IllegalAccessException, IOException {
            abstractC8746b.mo37508b(jsonReader, t);
        }
    }

    /* loaded from: classes4.dex */
    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {
        static final Map<Class<?>, Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
        private final Map<String, Integer> componentIndices;
        private final Constructor<T> constructor;
        private final Object[] constructorArgsDefaults;

        public RecordAdapter(Class<T> cls, C8747c c8747c, boolean z) {
            super(c8747c);
            this.componentIndices = new HashMap();
            Constructor<T> canonicalRecordConstructor = ReflectionHelper.getCanonicalRecordConstructor(cls);
            this.constructor = canonicalRecordConstructor;
            if (z) {
                ReflectiveTypeAdapterFactory.m37515b(null, canonicalRecordConstructor);
            } else {
                ReflectionHelper.makeAccessible(canonicalRecordConstructor);
            }
            String[] recordComponentNames = ReflectionHelper.getRecordComponentNames(cls);
            for (int i = 0; i < recordComponentNames.length; i++) {
                this.componentIndices.put(recordComponentNames[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            this.constructorArgsDefaults = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.constructorArgsDefaults[i2] = PRIMITIVE_DEFAULTS.get(parameterTypes[i2]);
            }
        }

        private static Map<Class<?>, Object> primitiveDefaults() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public Object[] createAccumulator() {
            return (Object[]) this.constructorArgsDefaults.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(Object[] objArr) {
            try {
                return this.constructor.newInstance(objArr);
            } catch (IllegalAccessException e) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(Object[] objArr, JsonReader jsonReader, AbstractC8746b abstractC8746b) throws IOException {
            Integer num = this.componentIndices.get(abstractC8746b.f56793c);
            if (num != null) {
                abstractC8746b.mo37509a(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' for field with name '" + abstractC8746b.f56793c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    /* loaded from: classes4.dex */
    public class C8745a extends AbstractC8746b {

        /* renamed from: d */
        public final /* synthetic */ boolean f56784d;

        /* renamed from: e */
        public final /* synthetic */ Method f56785e;

        /* renamed from: f */
        public final /* synthetic */ TypeAdapter f56786f;

        /* renamed from: g */
        public final /* synthetic */ TypeAdapter f56787g;

        /* renamed from: h */
        public final /* synthetic */ boolean f56788h;

        /* renamed from: i */
        public final /* synthetic */ boolean f56789i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8745a(String str, Field field, boolean z, Method method, TypeAdapter typeAdapter, TypeAdapter typeAdapter2, boolean z2, boolean z3) {
            super(str, field);
            this.f56784d = z;
            this.f56785e = method;
            this.f56786f = typeAdapter;
            this.f56787g = typeAdapter2;
            this.f56788h = z2;
            this.f56789i = z3;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC8746b
        /* renamed from: a */
        public void mo37509a(JsonReader jsonReader, int i, Object[] objArr) {
            Object read = this.f56787g.read(jsonReader);
            if (read == null && this.f56788h) {
                throw new JsonParseException("null is not allowed as value for record component '" + this.f56793c + "' of primitive type; at path " + jsonReader.getPath());
            }
            objArr[i] = read;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC8746b
        /* renamed from: b */
        public void mo37508b(JsonReader jsonReader, Object obj) {
            Object read = this.f56787g.read(jsonReader);
            if (read != null || !this.f56788h) {
                if (this.f56784d) {
                    ReflectiveTypeAdapterFactory.m37515b(obj, this.f56792b);
                } else if (this.f56789i) {
                    String accessibleObjectDescription = ReflectionHelper.getAccessibleObjectDescription(this.f56792b, false);
                    throw new JsonIOException("Cannot set value of 'static final' " + accessibleObjectDescription);
                }
                this.f56792b.set(obj, read);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC8746b
        /* renamed from: c */
        public void mo37507c(JsonWriter jsonWriter, Object obj) {
            Object obj2;
            if (this.f56784d) {
                Method method = this.f56785e;
                if (method == null) {
                    ReflectiveTypeAdapterFactory.m37515b(obj, this.f56792b);
                } else {
                    ReflectiveTypeAdapterFactory.m37515b(obj, method);
                }
            }
            Method method2 = this.f56785e;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    String accessibleObjectDescription = ReflectionHelper.getAccessibleObjectDescription(this.f56785e, false);
                    throw new JsonIOException("Accessor " + accessibleObjectDescription + " threw exception", e.getCause());
                }
            } else {
                obj2 = this.f56792b.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            jsonWriter.name(this.f56791a);
            this.f56786f.write(jsonWriter, obj2);
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8746b {

        /* renamed from: a */
        public final String f56791a;

        /* renamed from: b */
        public final Field f56792b;

        /* renamed from: c */
        public final String f56793c;

        public AbstractC8746b(String str, Field field) {
            this.f56791a = str;
            this.f56792b = field;
            this.f56793c = field.getName();
        }

        /* renamed from: a */
        public abstract void mo37509a(JsonReader jsonReader, int i, Object[] objArr);

        /* renamed from: b */
        public abstract void mo37508b(JsonReader jsonReader, Object obj);

        /* renamed from: c */
        public abstract void mo37507c(JsonWriter jsonWriter, Object obj);
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$c */
    /* loaded from: classes4.dex */
    public static class C8747c {

        /* renamed from: c */
        public static final C8747c f56794c = new C8747c(Collections.emptyMap(), Collections.emptyList());

        /* renamed from: a */
        public final Map f56795a;

        /* renamed from: b */
        public final List f56796b;

        public C8747c(Map map, List list) {
            this.f56795a = map;
            this.f56796b = list;
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<ReflectionAccessFilter> list) {
        this.f56779a = constructorConstructor;
        this.f56780b = fieldNamingStrategy;
        this.f56781c = excluder;
        this.f56782d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f56783e = list;
    }

    /* renamed from: b */
    public static void m37515b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (ReflectionAccessFilterHelper.canAccess(accessibleObject, obj)) {
            return;
        }
        String accessibleObjectDescription = ReflectionHelper.getAccessibleObjectDescription(accessibleObject, true);
        throw new JsonIOException(accessibleObjectDescription + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    /* renamed from: d */
    public static IllegalArgumentException m37513d(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ReflectionHelper.fieldToString(field) + " and " + ReflectionHelper.fieldToString(field2) + "\nSee " + TroubleshootingGuide.createUrl("duplicate-fields"));
    }

    /* renamed from: c */
    public final AbstractC8746b m37514c(Gson gson, Field field, Method method, String str, TypeToken typeToken, boolean z, boolean z2) {
        boolean z3;
        TypeAdapter typeAdapter;
        TypeAdapter typeAdapter2;
        TypeAdapter typeAdapterRuntimeTypeWrapper;
        boolean isPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z4 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z3 = true;
        } else {
            z3 = false;
        }
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        if (jsonAdapter != null) {
            typeAdapter = this.f56782d.m37529c(this.f56779a, gson, typeToken, jsonAdapter, false);
        } else {
            typeAdapter = null;
        }
        if (typeAdapter != null) {
            z4 = true;
        }
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken);
        }
        TypeAdapter typeAdapter3 = typeAdapter;
        if (z) {
            if (z4) {
                typeAdapterRuntimeTypeWrapper = typeAdapter3;
            } else {
                typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter3, typeToken.getType());
            }
            typeAdapter2 = typeAdapterRuntimeTypeWrapper;
        } else {
            typeAdapter2 = typeAdapter3;
        }
        return new C8745a(str, field, z2, method, typeAdapter2, typeAdapter3, isPrimitive, z3);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        boolean z;
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (ReflectionHelper.isAnonymousOrNonStaticLocal(rawType)) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                @Override // com.google.gson.TypeAdapter
                public T read(JsonReader jsonReader) throws IOException {
                    jsonReader.skipValue();
                    return null;
                }

                public String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t) throws IOException {
                    jsonWriter.nullValue();
                }
            };
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.f56783e, rawType);
        if (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            if (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE) {
                z = true;
            } else {
                z = false;
            }
            if (ReflectionHelper.isRecord(rawType)) {
                return new RecordAdapter(rawType, m37512e(gson, typeToken, rawType, z, true), z);
            }
            return new FieldReflectionAdapter(this.f56779a.get(typeToken), m37512e(gson, typeToken, rawType, z, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C8747c m37512e(com.google.gson.Gson r24, com.google.gson.reflect.TypeToken r25, java.lang.Class r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.m37512e(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$c");
    }

    /* renamed from: f */
    public final List m37511f(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.f56780b.translateName(field));
        }
        String value = serializedName.value();
        String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    /* renamed from: g */
    public final boolean m37510g(Field field, boolean z) {
        return !this.f56781c.excludeField(field, z);
    }
}
