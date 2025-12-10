package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28850d2 = {"androidx/navigation/NavGraph$iterator$1", "", "Landroidx/navigation/NavDestination;", "", "hasNext", "()Z", "next", "()Landroidx/navigation/NavDestination;", "", ProductAction.ACTION_REMOVE, "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", FirebaseAnalytics.Param.INDEX, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "wentToNext", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph$iterator$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
/* loaded from: classes2.dex */
public final class NavGraph$iterator$1 implements Iterator<NavDestination>, KMutableIterator {

    /* renamed from: a */
    public int f36341a = -1;

    /* renamed from: b */
    public boolean f36342b;

    /* renamed from: c */
    public final /* synthetic */ NavGraph f36343c;

    public NavGraph$iterator$1(NavGraph navGraph) {
        this.f36343c = navGraph;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f36341a + 1 < this.f36343c.getNodes().size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f36342b) {
            SparseArrayCompat<NavDestination> nodes = this.f36343c.getNodes();
            nodes.valueAt(this.f36341a).setParent(null);
            nodes.removeAt(this.f36341a);
            this.f36341a--;
            this.f36342b = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element".toString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public NavDestination next() {
        if (hasNext()) {
            this.f36342b = true;
            SparseArrayCompat<NavDestination> nodes = this.f36343c.getNodes();
            int i = this.f36341a + 1;
            this.f36341a = i;
            NavDestination valueAt = nodes.valueAt(i);
            Intrinsics.checkNotNullExpressionValue(valueAt, "nodes.valueAt(++index)");
            return valueAt;
        }
        throw new NoSuchElementException();
    }
}
