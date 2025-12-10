package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m28850d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", ExifInterface.LONGITUDE_EAST, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "fromIndex", "toIndex", "subList", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", PDPageLabelRange.STYLE_LETTERS_LOWER, "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, KMappedMarker {

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList$a */
    /* loaded from: classes2.dex */
    public static final class C3462a extends AbstractList implements ImmutableList {

        /* renamed from: a */
        public final ImmutableList f28510a;

        /* renamed from: b */
        public final int f28511b;

        /* renamed from: c */
        public final int f28512c;

        /* renamed from: d */
        public int f28513d;

        public C3462a(ImmutableList source, int i, int i2) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f28510a = source;
            this.f28511b = i;
            this.f28512c = i2;
            ListImplementation.checkRangeIndexes$runtime_release(i, i2, source.size());
            this.f28513d = i2 - i;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Object get(int i) {
            ListImplementation.checkElementIndex$runtime_release(i, this.f28513d);
            return this.f28510a.get(this.f28511b + i);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f28513d;
        }

        @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public ImmutableList subList(int i, int i2) {
            ListImplementation.checkRangeIndexes$runtime_release(i, i2, this.f28513d);
            ImmutableList immutableList = this.f28510a;
            int i3 = this.f28511b;
            return new C3462a(immutableList, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    @NotNull
    ImmutableList<E> subList(int i, int i2);

    @Override // java.util.List
    /* bridge */ /* synthetic */ List subList(int i, int i2);
}
