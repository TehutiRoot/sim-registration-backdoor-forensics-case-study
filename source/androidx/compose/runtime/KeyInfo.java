package androidx.compose.runtime;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/runtime/KeyInfo;", "", "", Action.KEY_ATTRIBUTE, "objectKey", FirebaseAnalytics.Param.LOCATION, "nodes", FirebaseAnalytics.Param.INDEX, "<init>", "(ILjava/lang/Object;III)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getKey", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getObjectKey", "()Ljava/lang/Object;", OperatorName.CURVE_TO, "getLocation", "d", "getNodes", "e", "getIndex", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class KeyInfo {

    /* renamed from: a */
    public final int f28336a;

    /* renamed from: b */
    public final Object f28337b;

    /* renamed from: c */
    public final int f28338c;

    /* renamed from: d */
    public final int f28339d;

    /* renamed from: e */
    public final int f28340e;

    public KeyInfo(int i, @Nullable Object obj, int i2, int i3, int i4) {
        this.f28336a = i;
        this.f28337b = obj;
        this.f28338c = i2;
        this.f28339d = i3;
        this.f28340e = i4;
    }

    public final int getIndex() {
        return this.f28340e;
    }

    public final int getKey() {
        return this.f28336a;
    }

    public final int getLocation() {
        return this.f28338c;
    }

    public final int getNodes() {
        return this.f28339d;
    }

    @Nullable
    public final Object getObjectKey() {
        return this.f28337b;
    }
}
