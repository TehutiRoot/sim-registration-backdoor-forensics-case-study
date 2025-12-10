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
    public Object[] f70354a;

    /* renamed from: b */
    public int f70355b;

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
        this.f70354a = objArr;
        this.f70355b = i;
    }

    /* renamed from: a */
    private final void m27503a(int i) {
        Object[] objArr = this.f70354a;
        if (objArr.length <= i) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f70354a = copyOf;
        }
    }

    public static final /* synthetic */ Object[] access$getData$p(ArrayMapImpl arrayMapImpl) {
        return arrayMapImpl.f70354a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i) {
        return (T) ArraysKt___ArraysKt.getOrNull(this.f70354a, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.f70355b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>() { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl$iterator$1

            /* renamed from: c */
            public int f70356c = -1;

            {
                ArrayMapImpl.this = this;
            }

            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                do {
                    int i = this.f70356c + 1;
                    this.f70356c = i;
                    if (i >= ArrayMapImpl.access$getData$p(ArrayMapImpl.this).length) {
                        break;
                    }
                } while (ArrayMapImpl.access$getData$p(ArrayMapImpl.this)[this.f70356c] == null);
                if (this.f70356c >= ArrayMapImpl.access$getData$p(ArrayMapImpl.this).length) {
                    done();
                    return;
                }
                Object obj = ArrayMapImpl.access$getData$p(ArrayMapImpl.this)[this.f70356c];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                setNext(obj);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i, @NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m27503a(i);
        if (this.f70354a[i] == null) {
            this.f70355b = getSize() + 1;
        }
        this.f70354a[i] = value;
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}
