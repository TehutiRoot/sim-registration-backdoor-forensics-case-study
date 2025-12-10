package p046rx.internal.util;

import p046rx.functions.Func1;

/* renamed from: rx.internal.util.UtilityFunctions */
/* loaded from: classes7.dex */
public final class UtilityFunctions {

    /* renamed from: rx.internal.util.UtilityFunctions$AlwaysFalse */
    /* loaded from: classes7.dex */
    public enum AlwaysFalse implements Func1<Object, Boolean> {
        INSTANCE;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p046rx.functions.Func1
        public Boolean call(Object obj) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: rx.internal.util.UtilityFunctions$AlwaysTrue */
    /* loaded from: classes7.dex */
    public enum AlwaysTrue implements Func1<Object, Boolean> {
        INSTANCE;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p046rx.functions.Func1
        public Boolean call(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: rx.internal.util.UtilityFunctions$Identity */
    /* loaded from: classes7.dex */
    public enum Identity implements Func1<Object, Object> {
        INSTANCE;

        @Override // p046rx.functions.Func1
        public Object call(Object obj) {
            return obj;
        }
    }

    public static <T> Func1<? super T, Boolean> alwaysFalse() {
        return AlwaysFalse.INSTANCE;
    }

    public static <T> Func1<? super T, Boolean> alwaysTrue() {
        return AlwaysTrue.INSTANCE;
    }

    public static <T> Func1<T, T> identity() {
        return Identity.INSTANCE;
    }
}
