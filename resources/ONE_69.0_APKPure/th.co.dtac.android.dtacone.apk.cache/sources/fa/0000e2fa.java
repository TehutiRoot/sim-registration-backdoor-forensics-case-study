package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n11515#2,11:143\n13644#2,2:154\n13646#2:157\n11526#2:158\n1#3:156\n*S KotlinDebug\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n*L\n137#1:143,11\n137#1:154,2\n137#1:157\n137#1:158\n137#1:156\n*E\n"})
/* loaded from: classes6.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public Object[] f70388a;

    /* renamed from: b */
    public int f70389b;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ArrayMapImpl(Object[] objArr, int i) {
        super(null);
        this.f70388a = objArr;
        this.f70389b = i;
    }

    /* renamed from: a */
    private final void m27795a(int i) {
        Object[] objArr = this.f70388a;
        if (objArr.length <= i) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f70388a = copyOf;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i) {
        return (T) ArraysKt___ArraysKt.getOrNull(this.f70388a, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.f70389b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>() { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl$iterator$1

            /* renamed from: c */
            public int f70390c = -1;

            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                Object[] objArr;
                Object[] objArr2;
                Object[] objArr3;
                Object[] objArr4;
                do {
                    int i = this.f70390c + 1;
                    this.f70390c = i;
                    objArr = ArrayMapImpl.this.f70388a;
                    if (i >= objArr.length) {
                        break;
                    }
                    objArr4 = ArrayMapImpl.this.f70388a;
                } while (objArr4[this.f70390c] == null);
                int i2 = this.f70390c;
                objArr2 = ArrayMapImpl.this.f70388a;
                if (i2 < objArr2.length) {
                    objArr3 = ArrayMapImpl.this.f70388a;
                    Object obj = objArr3[this.f70390c];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                    setNext(obj);
                    return;
                }
                done();
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i, @NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m27795a(i);
        if (this.f70388a[i] == null) {
            this.f70389b = getSize() + 1;
        }
        this.f70388a[i] = value;
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}