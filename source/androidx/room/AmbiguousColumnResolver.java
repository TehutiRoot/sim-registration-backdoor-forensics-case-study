package androidx.room;

import androidx.annotation.RestrictTo;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001b\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJQ\u0010\u0013\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00110\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J]\u0010\u001b\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00152\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00102\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u00110\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m28850d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "<init>", "()V", "", "", "resultColumns", "mappings", "", "resolve", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "", "Landroidx/room/AmbiguousColumnResolver$b;", "content", "pattern", "Lkotlin/Function3;", "", "", "onHashMatch", OperatorName.CURVE_TO, "(Ljava/util/List;[Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "T", "", "current", "depth", "Lkotlin/Function1;", "block", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Solution", "room-common"}, m28849k = 1, m28848mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,253:1\n1#2:254\n13579#3,2:255\n13644#3,3:257\n13644#3,2:260\n11335#3:262\n11670#3,2:263\n11672#3:267\n13646#3:268\n1855#4,2:265\n1726#4,3:269\n1549#4:272\n1620#4,3:273\n1855#4,2:278\n37#5,2:276\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n*L\n85#1:255,2\n87#1:257,3\n96#1:260,2\n118#1:262\n118#1:263,2\n118#1:267\n96#1:268\n120#1:265,2\n141#1:269,3\n151#1:272\n151#1:273,3\n188#1:278,2\n151#1:276,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AmbiguousColumnResolver {
    @NotNull
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    /* loaded from: classes2.dex */
    public static final class Solution implements Comparable {

        /* renamed from: d */
        public static final Companion f37236d = new Companion(null);

        /* renamed from: e */
        public static final Solution f37237e = new Solution(CollectionsKt__CollectionsKt.emptyList(), Integer.MAX_VALUE, Integer.MAX_VALUE);

        /* renamed from: a */
        public final List f37238a;

        /* renamed from: b */
        public final int f37239b;

        /* renamed from: c */
        public final int f37240c;

        @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m28850d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "<init>", "()V", "", "Landroidx/room/AmbiguousColumnResolver$a;", "matches", "Landroidx/room/AmbiguousColumnResolver$Solution;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "(Ljava/util/List;)Landroidx/room/AmbiguousColumnResolver$Solution;", "NO_SOLUTION", "Landroidx/room/AmbiguousColumnResolver$Solution;", "getNO_SOLUTION", "()Landroidx/room/AmbiguousColumnResolver$Solution;", "room-common"}, m28849k = 1, m28848mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1#2:254\n1774#3,3:255\n1855#3,2:258\n1777#3:260\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n*L\n232#1:255,3\n234#1:258,2\n232#1:260\n*E\n"})
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Solution build(@NotNull List<C4980a> matches) {
                Intrinsics.checkNotNullParameter(matches, "matches");
                List<C4980a> list = matches;
                int i = 0;
                int i2 = 0;
                for (C4980a c4980a : list) {
                    i2 += ((c4980a.m52933b().getLast() - c4980a.m52933b().getFirst()) + 1) - c4980a.m52934a().size();
                }
                Iterator<T> it = list.iterator();
                if (it.hasNext()) {
                    int first = ((C4980a) it.next()).m52933b().getFirst();
                    while (it.hasNext()) {
                        int first2 = ((C4980a) it.next()).m52933b().getFirst();
                        if (first > first2) {
                            first = first2;
                        }
                    }
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        int last = ((C4980a) it2.next()).m52933b().getLast();
                        while (it2.hasNext()) {
                            int last2 = ((C4980a) it2.next()).m52933b().getLast();
                            if (last < last2) {
                                last = last2;
                            }
                        }
                        IntRange intRange = new IntRange(first, last);
                        if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                            Iterator<Integer> it3 = intRange.iterator();
                            int i3 = 0;
                            while (it3.hasNext()) {
                                int nextInt = ((IntIterator) it3).nextInt();
                                Iterator<T> it4 = list.iterator();
                                int i4 = 0;
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    if (((C4980a) it4.next()).m52933b().contains(nextInt)) {
                                        i4++;
                                        continue;
                                    }
                                    if (i4 > 1) {
                                        i3++;
                                        if (i3 < 0) {
                                            CollectionsKt__CollectionsKt.throwCountOverflow();
                                        }
                                    }
                                }
                            }
                            i = i3;
                        }
                        return new Solution(matches, i2, i);
                    }
                    throw new NoSuchElementException();
                }
                throw new NoSuchElementException();
            }

            @NotNull
            public final Solution getNO_SOLUTION() {
                return Solution.f37237e;
            }

            public Companion() {
            }
        }

        public Solution(List matches, int i, int i2) {
            Intrinsics.checkNotNullParameter(matches, "matches");
            this.f37238a = matches;
            this.f37239b = i;
            this.f37240c = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(Solution other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int compare = Intrinsics.compare(this.f37240c, other.f37240c);
            if (compare != 0) {
                return compare;
            }
            return Intrinsics.compare(this.f37239b, other.f37239b);
        }

        /* renamed from: c */
        public final List m52935c() {
            return this.f37238a;
        }
    }

    /* renamed from: androidx.room.AmbiguousColumnResolver$a */
    /* loaded from: classes2.dex */
    public static final class C4980a {

        /* renamed from: a */
        public final IntRange f37241a;

        /* renamed from: b */
        public final List f37242b;

        public C4980a(IntRange resultRange, List resultIndices) {
            Intrinsics.checkNotNullParameter(resultRange, "resultRange");
            Intrinsics.checkNotNullParameter(resultIndices, "resultIndices");
            this.f37241a = resultRange;
            this.f37242b = resultIndices;
        }

        /* renamed from: a */
        public final List m52934a() {
            return this.f37242b;
        }

        /* renamed from: b */
        public final IntRange m52933b() {
            return this.f37241a;
        }
    }

    /* renamed from: androidx.room.AmbiguousColumnResolver$b */
    /* loaded from: classes2.dex */
    public static final class C4981b {

        /* renamed from: a */
        public final String f37243a;

        /* renamed from: b */
        public final int f37244b;

        public C4981b(String name, int i) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f37243a = name;
            this.f37244b = i;
        }

        /* renamed from: a */
        public final String m52932a() {
            return this.f37243a;
        }

        /* renamed from: b */
        public final int m52931b() {
            return this.f37244b;
        }

        /* renamed from: c */
        public final String m52930c() {
            return this.f37243a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C4981b) {
                C4981b c4981b = (C4981b) obj;
                return Intrinsics.areEqual(this.f37243a, c4981b.f37243a) && this.f37244b == c4981b.f37244b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f37243a.hashCode() * 31) + this.f37244b;
        }

        public String toString() {
            return "ResultColumn(name=" + this.f37243a + ", index=" + this.f37244b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m52939b(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        ambiguousColumnResolver.m52940a(list, list2, i, function1);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @JvmStatic
    @NotNull
    public static final int[][] resolve(@NotNull String[] resultColumns, @NotNull String[][] mappings) {
        Intrinsics.checkNotNullParameter(resultColumns, "resultColumns");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        int length = resultColumns.length;
        for (int i = 0; i < length; i++) {
            String str = resultColumns[i];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = str.substring(1, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i] = lowerCase;
        }
        int length2 = mappings.length;
        for (int i2 = 0; i2 < length2; i2++) {
            int length3 = mappings[i2].length;
            for (int i3 = 0; i3 < length3; i3++) {
                String[] strArr = mappings[i2];
                String str2 = strArr[i3];
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = str2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr[i3] = lowerCase2;
            }
        }
        Set createSetBuilder = CG1.createSetBuilder();
        for (String[] strArr2 : mappings) {
            AbstractC10410hs.addAll(createSetBuilder, strArr2);
        }
        Set build = CG1.build(createSetBuilder);
        List createListBuilder = AbstractC10108ds.createListBuilder();
        int length4 = resultColumns.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length4) {
            String str3 = resultColumns[i4];
            int i6 = i5 + 1;
            if (build.contains(str3)) {
                createListBuilder.add(new C4981b(str3, i5));
            }
            i4++;
            i5 = i6;
        }
        List<C4981b> build2 = AbstractC10108ds.build(createListBuilder);
        int length5 = mappings.length;
        ArrayList<List> arrayList = new ArrayList(length5);
        for (int i7 = 0; i7 < length5; i7++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length6) {
            String[] strArr3 = mappings[i8];
            int i10 = i9 + 1;
            INSTANCE.m52938c(build2, strArr3, new AmbiguousColumnResolver$resolve$1$1(strArr3, arrayList, i9));
            if (((List) arrayList.get(i9)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                for (String str4 : strArr3) {
                    List createListBuilder2 = AbstractC10108ds.createListBuilder();
                    for (C4981b c4981b : build2) {
                        if (Intrinsics.areEqual(str4, c4981b.m52930c())) {
                            createListBuilder2.add(Integer.valueOf(c4981b.m52931b()));
                        }
                    }
                    List build3 = AbstractC10108ds.build(createListBuilder2);
                    if (!build3.isEmpty()) {
                        arrayList2.add(build3);
                    } else {
                        throw new IllegalStateException(("Column " + str4 + " not found in result").toString());
                    }
                }
                m52939b(INSTANCE, arrayList2, null, 0, new AmbiguousColumnResolver$resolve$1$2(arrayList, i9), 6, null);
            }
            i8++;
            i9 = i10;
        }
        if (!arrayList.isEmpty()) {
            for (List list : arrayList) {
                if (!(!list.isEmpty())) {
                    throw new IllegalStateException("Failed to find matches for all mappings".toString());
                }
            }
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Solution.f37236d.getNO_SOLUTION();
        m52939b(INSTANCE, arrayList, null, 0, new AmbiguousColumnResolver$resolve$4(objectRef), 6, null);
        List<C4980a> m52935c = ((Solution) objectRef.element).m52935c();
        ArrayList arrayList3 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(m52935c, 10));
        for (C4980a c4980a : m52935c) {
            arrayList3.add(CollectionsKt___CollectionsKt.toIntArray(c4980a.m52934a()));
        }
        return (int[][]) arrayList3.toArray(new int[0]);
    }

    /* renamed from: a */
    public final void m52940a(List list, List list2, int i, Function1 function1) {
        if (i == list.size()) {
            function1.invoke(CollectionsKt___CollectionsKt.toList(list2));
            return;
        }
        for (Object obj : (Iterable) list.get(i)) {
            list2.add(obj);
            INSTANCE.m52940a(list, list2, i + 1, function1);
            AbstractC10410hs.removeLast(list2);
        }
    }

    /* renamed from: c */
    public final void m52938c(List list, String[] strArr, Function3 function3) {
        int i = 0;
        int i2 = 0;
        for (String str : strArr) {
            i2 += str.hashCode();
        }
        int length = strArr.length;
        int i3 = 0;
        for (C4981b c4981b : list.subList(0, length)) {
            i3 += c4981b.m52930c().hashCode();
        }
        while (true) {
            if (i2 == i3) {
                function3.invoke(Integer.valueOf(i), Integer.valueOf(length), list.subList(i, length));
            }
            int i4 = i + 1;
            int i5 = length + 1;
            if (i5 > list.size()) {
                return;
            }
            i3 = (i3 - ((C4981b) list.get(i)).m52930c().hashCode()) + ((C4981b) list.get(length)).m52930c().hashCode();
            i = i4;
            length = i5;
        }
    }
}
