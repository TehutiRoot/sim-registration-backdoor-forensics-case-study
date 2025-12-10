package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\r*\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001b¨\u0006("}, m28850d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "changed", "", OperatorName.LINE_TO, "t", PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleHostView;", "getRippleHostView", "(Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;)Landroidx/compose/material/ripple/RippleHostView;", "disposeRippleIfNeeded", "(Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "MaxRippleHosts", "", "Ljava/util/List;", "rippleHosts", OperatorName.CURVE_TO, "unusedRippleHosts", "Lwy1;", "d", "Lwy1;", "rippleHostMap", "e", "nextHostIndex", "material-ripple_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {

    /* renamed from: a */
    public final int f25492a;

    /* renamed from: b */
    public final List f25493b;

    /* renamed from: c */
    public final List f25494c;

    /* renamed from: d */
    public final C22882wy1 f25495d;

    /* renamed from: e */
    public int f25496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25492a = 5;
        ArrayList arrayList = new ArrayList();
        this.f25493b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f25494c = arrayList2;
        this.f25495d = new C22882wy1();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f25496e = 1;
        setTag(androidx.compose.p003ui.R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(@NotNull AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        Intrinsics.checkNotNullParameter(androidRippleIndicationInstance, "<this>");
        androidRippleIndicationInstance.resetHostView();
        RippleHostView m635b = this.f25495d.m635b(androidRippleIndicationInstance);
        if (m635b != null) {
            m635b.disposeRipple();
            this.f25495d.m634c(androidRippleIndicationInstance);
            this.f25494c.add(m635b);
        }
    }

    @NotNull
    public final RippleHostView getRippleHostView(@NotNull AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        Intrinsics.checkNotNullParameter(androidRippleIndicationInstance, "<this>");
        RippleHostView m635b = this.f25495d.m635b(androidRippleIndicationInstance);
        if (m635b != null) {
            return m635b;
        }
        RippleHostView rippleHostView = (RippleHostView) AbstractC10410hs.removeFirstOrNull(this.f25494c);
        if (rippleHostView == null) {
            if (this.f25496e > CollectionsKt__CollectionsKt.getLastIndex(this.f25493b)) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                rippleHostView = new RippleHostView(context);
                addView(rippleHostView);
                this.f25493b.add(rippleHostView);
            } else {
                rippleHostView = (RippleHostView) this.f25493b.get(this.f25496e);
                AndroidRippleIndicationInstance m636a = this.f25495d.m636a(rippleHostView);
                if (m636a != null) {
                    m636a.resetHostView();
                    this.f25495d.m634c(m636a);
                    rippleHostView.disposeRipple();
                }
            }
            int i = this.f25496e;
            if (i < this.f25492a - 1) {
                this.f25496e = i + 1;
            } else {
                this.f25496e = 0;
            }
        }
        this.f25495d.m633d(androidRippleIndicationInstance, rippleHostView);
        return rippleHostView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
