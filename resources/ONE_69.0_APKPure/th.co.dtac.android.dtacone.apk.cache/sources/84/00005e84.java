package androidx.compose.runtime.internal;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m29142d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "", "size", "", UserMetadata.KEYDATA_FILENAME, "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "", Action.KEY_ATTRIBUTE, "get", "(J)Ljava/lang/Object;", "value", "", "trySet", "(JLjava/lang/Object;)Z", "newWith", "(JLjava/lang/Object;)Landroidx/compose/runtime/internal/ThreadMap;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(J)I", "I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[J", OperatorName.CURVE_TO, "[Ljava/lang/Object;", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThreadMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,111:1\n12904#2,3:112\n*S KotlinDebug\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:112,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ThreadMap {

    /* renamed from: a */
    public final int f28758a;

    /* renamed from: b */
    public final long[] f28759b;

    /* renamed from: c */
    public final Object[] f28760c;

    public ThreadMap(int i, @NotNull long[] keys, @NotNull Object[] values) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f28758a = i;
        this.f28759b = keys;
        this.f28760c = values;
    }

    /* renamed from: a */
    public final int m59900a(long j) {
        int i = this.f28758a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i != 0) {
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                int i4 = ((this.f28759b[i3] - j) > 0L ? 1 : ((this.f28759b[i3] - j) == 0L ? 0 : -1));
                if (i4 < 0) {
                    i2 = i3 + 1;
                } else if (i4 > 0) {
                    i = i3 - 1;
                } else {
                    return i3;
                }
            }
            return -(i2 + 1);
        }
        long j2 = this.f28759b[0];
        if (j2 == j) {
            return 0;
        }
        if (j2 <= j) {
            return -1;
        }
        return -2;
    }

    @Nullable
    public final Object get(long j) {
        int m59900a = m59900a(j);
        if (m59900a >= 0) {
            return this.f28760c[m59900a];
        }
        return null;
    }

    @NotNull
    public final ThreadMap newWith(long j, @Nullable Object obj) {
        int i = this.f28758a;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : this.f28760c) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j2 = this.f28759b[i5];
                Object obj3 = this.f28760c[i5];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i2] = j2;
                    objArr[i2] = obj3;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr[i3] = j;
                objArr[i3] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = this.f28759b[i5];
                    Object obj4 = this.f28760c[i5];
                    if (obj4 != null) {
                        jArr[i2] = j3;
                        objArr[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr[0] = j;
            objArr[0] = obj;
        }
        return new ThreadMap(i4, jArr, objArr);
    }

    public final boolean trySet(long j, @Nullable Object obj) {
        int m59900a = m59900a(j);
        if (m59900a < 0) {
            return false;
        }
        this.f28760c[m59900a] = obj;
        return true;
    }
}