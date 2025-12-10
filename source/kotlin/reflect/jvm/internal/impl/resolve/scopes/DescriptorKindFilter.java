package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1855#2,2:262\n1726#2,3:264\n288#2,2:267\n1603#2,9:269\n1855#2:278\n1856#2:280\n1612#2:281\n1603#2,9:286\n1855#2:295\n1856#2:297\n1612#2:298\n766#2:303\n857#2,2:304\n1603#2,9:306\n1855#2:315\n1856#2:317\n1612#2:318\n1#3:279\n1#3:296\n1#3:316\n210#4:282\n210#4:299\n3792#5:283\n4307#5,2:284\n3792#5:300\n4307#5,2:301\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n*L\n98#1:262,2\n103#1:264,3\n129#1:267,2\n131#1:269,9\n131#1:278\n131#1:280\n131#1:281\n197#1:286,9\n197#1:295\n197#1:297\n197#1:298\n203#1:303\n203#1:304,2\n204#1:306,9\n204#1:315\n204#1:317\n204#1:318\n131#1:279\n197#1:296\n204#1:316\n196#1:282\n202#1:299\n196#1:283\n196#1:284,2\n202#1:300\n202#1:301,2\n*E\n"})
/* loaded from: classes6.dex */
public final class DescriptorKindFilter {
    @JvmField
    @NotNull
    public static final DescriptorKindFilter ALL;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter CALLABLES;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter CLASSIFIERS;
    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter FUNCTIONS;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter PACKAGES;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter TYPE_ALIASES;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter VALUES;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter VARIABLES;

    /* renamed from: c */
    public static int f69934c;

    /* renamed from: d */
    public static final int f69935d;

    /* renamed from: e */
    public static final int f69936e;

    /* renamed from: f */
    public static final int f69937f;

    /* renamed from: g */
    public static final int f69938g;

    /* renamed from: h */
    public static final int f69939h;

    /* renamed from: i */
    public static final int f69940i;

    /* renamed from: j */
    public static final int f69941j;

    /* renamed from: k */
    public static final int f69942k;

    /* renamed from: l */
    public static final int f69943l;

    /* renamed from: m */
    public static final int f69944m;

    /* renamed from: n */
    public static final List f69945n;

    /* renamed from: o */
    public static final List f69946o;

    /* renamed from: a */
    public final List f69947a;

    /* renamed from: b */
    public final int f69948b;

    @SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1#2:262\n3792#3:263\n4307#3,2:264\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n*L\n210#1:263\n210#1:264,2\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Companion {

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter$Companion$a */
        /* loaded from: classes6.dex */
        public static final class C11953a {

            /* renamed from: a */
            public final int f69949a;

            /* renamed from: b */
            public final String f69950b;

            public C11953a(int i, String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f69949a = i;
                this.f69950b = name;
            }

            /* renamed from: a */
            public final int m27739a() {
                return this.f69949a;
            }

            /* renamed from: b */
            public final String m27738b() {
                return this.f69950b;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m27740a() {
            int i = DescriptorKindFilter.f69934c;
            DescriptorKindFilter.f69934c <<= 1;
            return i;
        }

        public final int getALL_KINDS_MASK() {
            return DescriptorKindFilter.f69941j;
        }

        public final int getCLASSIFIERS_MASK() {
            return DescriptorKindFilter.f69942k;
        }

        public final int getFUNCTIONS_MASK() {
            return DescriptorKindFilter.f69939h;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.f69935d;
        }

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.f69938g;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.f69936e;
        }

        public final int getTYPE_ALIASES_MASK() {
            return DescriptorKindFilter.f69937f;
        }

        public final int getVARIABLES_MASK() {
            return DescriptorKindFilter.f69940i;
        }

        public Companion() {
        }
    }

    static {
        Companion.C11953a c11953a;
        DescriptorKindFilter descriptorKindFilter;
        Companion.C11953a c11953a2;
        Companion companion = new Companion(null);
        Companion = companion;
        f69934c = 1;
        int m27740a = companion.m27740a();
        f69935d = m27740a;
        int m27740a2 = companion.m27740a();
        f69936e = m27740a2;
        int m27740a3 = companion.m27740a();
        f69937f = m27740a3;
        int m27740a4 = companion.m27740a();
        f69938g = m27740a4;
        int m27740a5 = companion.m27740a();
        f69939h = m27740a5;
        int m27740a6 = companion.m27740a();
        f69940i = m27740a6;
        int m27740a7 = companion.m27740a() - 1;
        f69941j = m27740a7;
        int i = m27740a | m27740a2 | m27740a3;
        f69942k = i;
        int i2 = m27740a2 | m27740a5 | m27740a6;
        f69943l = i2;
        int i3 = m27740a5 | m27740a6;
        f69944m = i3;
        ALL = new DescriptorKindFilter(m27740a7, null, 2, null);
        CALLABLES = new DescriptorKindFilter(i3, null, 2, null);
        NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(m27740a, null, 2, null);
        SINGLETON_CLASSIFIERS = new DescriptorKindFilter(m27740a2, null, 2, null);
        TYPE_ALIASES = new DescriptorKindFilter(m27740a3, null, 2, null);
        CLASSIFIERS = new DescriptorKindFilter(i, null, 2, null);
        PACKAGES = new DescriptorKindFilter(m27740a4, null, 2, null);
        FUNCTIONS = new DescriptorKindFilter(m27740a5, null, 2, null);
        VARIABLES = new DescriptorKindFilter(m27740a6, null, 2, null);
        VALUES = new DescriptorKindFilter(i2, null, 2, null);
        Field[] fields = DescriptorKindFilter.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            if (obj instanceof DescriptorKindFilter) {
                descriptorKindFilter = (DescriptorKindFilter) obj;
            } else {
                descriptorKindFilter = null;
            }
            if (descriptorKindFilter != null) {
                int i4 = descriptorKindFilter.f69948b;
                String name = field2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "field.name");
                c11953a2 = new Companion.C11953a(i4, name);
            } else {
                c11953a2 = null;
            }
            if (c11953a2 != null) {
                arrayList2.add(c11953a2);
            }
        }
        f69945n = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.areEqual(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "field.name");
                c11953a = new Companion.C11953a(intValue, name2);
            } else {
                c11953a = null;
            }
            if (c11953a != null) {
                arrayList5.add(c11953a);
            }
        }
        f69946o = arrayList5;
    }

    public DescriptorKindFilter(int i, @NotNull List<? extends DescriptorKindExclude> excludes) {
        Intrinsics.checkNotNullParameter(excludes, "excludes");
        this.f69947a = excludes;
        for (DescriptorKindExclude descriptorKindExclude : excludes) {
            i &= ~descriptorKindExclude.getFullyExcludedDescriptorKinds();
        }
        this.f69948b = i;
    }

    public final boolean acceptsKinds(int i) {
        if ((i & this.f69948b) != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(DescriptorKindFilter.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        if (Intrinsics.areEqual(this.f69947a, descriptorKindFilter.f69947a) && this.f69948b == descriptorKindFilter.f69948b) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<DescriptorKindExclude> getExcludes() {
        return this.f69947a;
    }

    public final int getKindMask() {
        return this.f69948b;
    }

    public int hashCode() {
        return (this.f69947a.hashCode() * 31) + this.f69948b;
    }

    @Nullable
    public final DescriptorKindFilter restrictedToKindsOrNull(int i) {
        int i2 = i & this.f69948b;
        if (i2 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i2, this.f69947a);
    }

    @NotNull
    public String toString() {
        Object obj;
        String str;
        String str2;
        Iterator it = f69945n.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Companion.C11953a) obj).m27739a() == this.f69948b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Companion.C11953a c11953a = (Companion.C11953a) obj;
        if (c11953a != null) {
            str = c11953a.m27738b();
        } else {
            str = null;
        }
        if (str == null) {
            ArrayList arrayList = new ArrayList();
            for (Companion.C11953a c11953a2 : f69946o) {
                if (acceptsKinds(c11953a2.m27739a())) {
                    str2 = c11953a2.m27738b();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = CollectionsKt___CollectionsKt.joinToString$default(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + str + ", " + this.f69947a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ DescriptorKindFilter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
