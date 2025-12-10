package androidx.compose.p003ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.motion.widget.Key;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0011\u0010;\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b:\u0010 ¨\u0006<"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "", "name", "", Key.ROTATION, "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "", FirebaseAnalytics.Param.INDEX, "get", "(I)Landroidx/compose/ui/graphics/vector/VectorNode;", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getRotation", "()F", OperatorName.CURVE_TO, "getPivotX", "d", "getPivotY", "e", "getScaleX", OperatorName.FILL_NON_ZERO, "getScaleY", OperatorName.NON_STROKING_GRAY, "getTranslationX", OperatorName.CLOSE_PATH, "getTranslationY", "i", "Ljava/util/List;", "getClipPathData", "()Ljava/util/List;", OperatorName.SET_LINE_JOINSTYLE, "getSize", "size", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.vector.VectorGroup */
/* loaded from: classes2.dex */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, KMappedMarker {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f29499a;

    /* renamed from: b */
    public final float f29500b;

    /* renamed from: c */
    public final float f29501c;

    /* renamed from: d */
    public final float f29502d;

    /* renamed from: e */
    public final float f29503e;

    /* renamed from: f */
    public final float f29504f;

    /* renamed from: g */
    public final float f29505g;

    /* renamed from: h */
    public final float f29506h;

    /* renamed from: i */
    public final List f29507i;

    /* renamed from: j */
    public final List f29508j;

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            if (Intrinsics.areEqual(this.f29499a, vectorGroup.f29499a) && this.f29500b == vectorGroup.f29500b && this.f29501c == vectorGroup.f29501c && this.f29502d == vectorGroup.f29502d && this.f29503e == vectorGroup.f29503e && this.f29504f == vectorGroup.f29504f && this.f29505g == vectorGroup.f29505g && this.f29506h == vectorGroup.f29506h && Intrinsics.areEqual(this.f29507i, vectorGroup.f29507i) && Intrinsics.areEqual(this.f29508j, vectorGroup.f29508j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @NotNull
    public final VectorNode get(int i) {
        return (VectorNode) this.f29508j.get(i);
    }

    @NotNull
    public final List<PathNode> getClipPathData() {
        return this.f29507i;
    }

    @NotNull
    public final String getName() {
        return this.f29499a;
    }

    public final float getPivotX() {
        return this.f29501c;
    }

    public final float getPivotY() {
        return this.f29502d;
    }

    public final float getRotation() {
        return this.f29500b;
    }

    public final float getScaleX() {
        return this.f29503e;
    }

    public final float getScaleY() {
        return this.f29504f;
    }

    public final int getSize() {
        return this.f29508j.size();
    }

    public final float getTranslationX() {
        return this.f29505g;
    }

    public final float getTranslationY() {
        return this.f29506h;
    }

    public int hashCode() {
        return (((((((((((((((((this.f29499a.hashCode() * 31) + Float.floatToIntBits(this.f29500b)) * 31) + Float.floatToIntBits(this.f29501c)) * 31) + Float.floatToIntBits(this.f29502d)) * 31) + Float.floatToIntBits(this.f29503e)) * 31) + Float.floatToIntBits(this.f29504f)) * 31) + Float.floatToIntBits(this.f29505g)) * 31) + Float.floatToIntBits(this.f29506h)) * 31) + this.f29507i.hashCode()) * 31) + this.f29508j.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<VectorNode> iterator() {
        return new VectorGroup$iterator$1(this);
    }

    public /* synthetic */ VectorGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? VectorKt.getEmptyPath() : list, (i & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorGroup(@NotNull String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<? extends PathNode> clipPathData, @NotNull List<? extends VectorNode> children) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f29499a = name;
        this.f29500b = f;
        this.f29501c = f2;
        this.f29502d = f3;
        this.f29503e = f4;
        this.f29504f = f5;
        this.f29505g = f6;
        this.f29506h = f7;
        this.f29507i = clipPathData;
        this.f29508j = children;
    }
}
