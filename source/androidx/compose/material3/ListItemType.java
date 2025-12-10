package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class ListItemType implements Comparable {

    /* renamed from: a */
    public static final Companion f25858a = new Companion(null);

    /* renamed from: b */
    public static final int f25859b = m60623d(1);

    /* renamed from: c */
    public static final int f25860c = m60623d(2);

    /* renamed from: d */
    public static final int f25861d = m60623d(3);

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, m28850d2 = {"Landroidx/compose/material3/ListItemType$Companion;", "", "()V", "OneLine", "Landroidx/compose/material3/ListItemType;", "getOneLine-AlXitO8", "()I", "I", "ThreeLine", "getThreeLine-AlXitO8", "TwoLine", "getTwoLine-AlXitO8", "getListItemType", "hasOverline", "", "hasSupporting", "getListItemType-7AlIA9s$material3_release", "(ZZ)I", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getListItemType-7AlIA9s$material3_release  reason: not valid java name */
        public final int m70451getListItemType7AlIA9s$material3_release(boolean z, boolean z2) {
            if (z && z2) {
                return m70453getThreeLineAlXitO8();
            }
            if (!z && !z2) {
                return m70452getOneLineAlXitO8();
            }
            return m70454getTwoLineAlXitO8();
        }

        /* renamed from: getOneLine-AlXitO8  reason: not valid java name */
        public final int m70452getOneLineAlXitO8() {
            return ListItemType.f25859b;
        }

        /* renamed from: getThreeLine-AlXitO8  reason: not valid java name */
        public final int m70453getThreeLineAlXitO8() {
            return ListItemType.f25861d;
        }

        /* renamed from: getTwoLine-AlXitO8  reason: not valid java name */
        public final int m70454getTwoLineAlXitO8() {
            return ListItemType.f25860c;
        }

        public Companion() {
        }
    }

    /* renamed from: d */
    public static int m60623d(int i) {
        return i;
    }

    /* renamed from: e */
    public static final boolean m60622e(int i, int i2) {
        return i == i2;
    }
}
