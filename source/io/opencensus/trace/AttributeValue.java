package io.opencensus.trace;

import io.opencensus.common.Function;
import io.opencensus.internal.Utils;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class AttributeValue {

    /* renamed from: io.opencensus.trace.AttributeValue$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC10682a extends AttributeValue {
        /* renamed from: a */
        public static AttributeValue m30161a(Boolean bool) {
            return new C10693a((Boolean) Utils.checkNotNull(bool, "booleanValue"));
        }

        /* renamed from: b */
        public abstract Boolean mo30142b();

        @Override // io.opencensus.trace.AttributeValue
        public final Object match(Function function, Function function2, Function function3, Function function4) {
            return function2.apply(mo30142b());
        }

        @Override // io.opencensus.trace.AttributeValue
        public final Object match(Function function, Function function2, Function function3, Function function4, Function function5) {
            return function2.apply(mo30142b());
        }
    }

    /* renamed from: io.opencensus.trace.AttributeValue$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC10683b extends AttributeValue {
        /* renamed from: a */
        public static AttributeValue m30160a(Double d) {
            return new C10694b((Double) Utils.checkNotNull(d, "doubleValue"));
        }

        /* renamed from: b */
        public abstract Double mo30141b();

        @Override // io.opencensus.trace.AttributeValue
        public final Object match(Function function, Function function2, Function function3, Function function4) {
            return function4.apply(mo30141b());
        }

        @Override // io.opencensus.trace.AttributeValue
        public final Object match(Function function, Function function2, Function function3, Function function4, Function function5) {
            return function4.apply(mo30141b());
        }
    }

    /* renamed from: io.opencensus.trace.AttributeValue$c */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC10684c extends AttributeValue {
        /* renamed from: a */
        public static AttributeValue m30159a(Long l) {
            return new C10695c((Long) Utils.checkNotNull(l, "longValue"));
        }

        /* renamed from: b */
        public abstract Long mo30140b();

        @Override // io.opencensus.trace.AttributeValue
        public final Object match(Function function, Function function2, Function function3, Function function4) {
            return function3.apply(mo30140b());
        }

        @Override // io.opencensus.trace.AttributeValue
        public final Object match(Function function, Function function2, Function function3, Function function4, Function function5) {
            return function3.apply(mo30140b());
        }
    }

    /* renamed from: io.opencensus.trace.AttributeValue$d */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC10685d extends AttributeValue {
        /* renamed from: a */
        public static AttributeValue m30158a(String str) {
            return new C10701d((String) Utils.checkNotNull(str, "stringValue"));
        }

        /* renamed from: b */
        public abstract String mo30137b();

        @Override // io.opencensus.trace.AttributeValue
        public final Object match(Function function, Function function2, Function function3, Function function4) {
            return function.apply(mo30137b());
        }

        @Override // io.opencensus.trace.AttributeValue
        public final Object match(Function function, Function function2, Function function3, Function function4, Function function5) {
            return function.apply(mo30137b());
        }
    }

    public static AttributeValue booleanAttributeValue(boolean z) {
        return AbstractC10682a.m30161a(Boolean.valueOf(z));
    }

    public static AttributeValue doubleAttributeValue(double d) {
        return AbstractC10683b.m30160a(Double.valueOf(d));
    }

    public static AttributeValue longAttributeValue(long j) {
        return AbstractC10684c.m30159a(Long.valueOf(j));
    }

    public static AttributeValue stringAttributeValue(String str) {
        return AbstractC10685d.m30158a(str);
    }

    @Deprecated
    public abstract <T> T match(Function<? super String, T> function, Function<? super Boolean, T> function2, Function<? super Long, T> function3, Function<Object, T> function4);

    public abstract <T> T match(Function<? super String, T> function, Function<? super Boolean, T> function2, Function<? super Long, T> function3, Function<? super Double, T> function4, Function<Object, T> function5);
}
