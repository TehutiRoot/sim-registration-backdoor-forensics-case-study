package p000;

import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import kotlin.Pair;

/* renamed from: uF1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC22417uF1 {
    /* renamed from: a */
    public static /* synthetic */ Pair m1307a(Selectable selectable, long j, long j2, Offset offset, boolean z, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection, int i, Object obj) {
        boolean z2;
        Selection selection2;
        if (obj == null) {
            if ((i & 8) != 0) {
                z2 = true;
            } else {
                z2 = z;
            }
            if ((i & 64) != 0) {
                selection2 = null;
            } else {
                selection2 = selection;
            }
            return selectable.mo69837updateSelectionqCDeeow(j, j2, offset, z2, layoutCoordinates, selectionAdjustment, selection2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelection-qCDeeow");
    }
}
