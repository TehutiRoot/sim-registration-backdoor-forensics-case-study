package com.google.gson;

import com.google.gson.internal.ReflectionAccessFilterHelper;

/* loaded from: classes4.dex */
public interface ReflectionAccessFilter {
    public static final ReflectionAccessFilter BLOCK_INACCESSIBLE_JAVA = new C8685a();
    public static final ReflectionAccessFilter BLOCK_ALL_JAVA = new C8686b();
    public static final ReflectionAccessFilter BLOCK_ALL_ANDROID = new C8687c();
    public static final ReflectionAccessFilter BLOCK_ALL_PLATFORM = new C8688d();

    /* loaded from: classes4.dex */
    public enum FilterResult {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    /* renamed from: com.google.gson.ReflectionAccessFilter$a */
    /* loaded from: classes4.dex */
    public class C8685a implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult check(Class cls) {
            if (ReflectionAccessFilterHelper.isJavaType(cls)) {
                return FilterResult.BLOCK_INACCESSIBLE;
            }
            return FilterResult.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_INACCESSIBLE_JAVA";
        }
    }

    /* renamed from: com.google.gson.ReflectionAccessFilter$b */
    /* loaded from: classes4.dex */
    public class C8686b implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult check(Class cls) {
            if (ReflectionAccessFilterHelper.isJavaType(cls)) {
                return FilterResult.BLOCK_ALL;
            }
            return FilterResult.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_JAVA";
        }
    }

    /* renamed from: com.google.gson.ReflectionAccessFilter$c */
    /* loaded from: classes4.dex */
    public class C8687c implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult check(Class cls) {
            if (ReflectionAccessFilterHelper.isAndroidType(cls)) {
                return FilterResult.BLOCK_ALL;
            }
            return FilterResult.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_ANDROID";
        }
    }

    /* renamed from: com.google.gson.ReflectionAccessFilter$d */
    /* loaded from: classes4.dex */
    public class C8688d implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult check(Class cls) {
            if (ReflectionAccessFilterHelper.isAnyPlatformType(cls)) {
                return FilterResult.BLOCK_ALL;
            }
            return FilterResult.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_PLATFORM";
        }
    }

    FilterResult check(Class<?> cls);
}
