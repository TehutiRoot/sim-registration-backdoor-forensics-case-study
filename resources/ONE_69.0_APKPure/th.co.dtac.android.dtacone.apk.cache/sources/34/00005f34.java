package androidx.compose.p003ui.draw;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DrawModifierNodeKt;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.node.ObserverModifierNode;
import androidx.compose.p003ui.node.ObserverModifierNodeKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.draw.CacheDrawModifierNodeImpl */
/* loaded from: classes2.dex */
public final class CacheDrawModifierNodeImpl extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {

    /* renamed from: n */
    public final CacheDrawScope f28964n;

    /* renamed from: o */
    public boolean f28965o;

    /* renamed from: p */
    public Function1 f28966p;

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, Function1 block) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f28964n = cacheDrawScope;
        this.f28966p = block;
        cacheDrawScope.setCacheParams$ui_release(this);
    }

    /* renamed from: a */
    public final DrawResult m59802a() {
        if (!this.f28965o) {
            CacheDrawScope cacheDrawScope = this.f28964n;
            cacheDrawScope.setDrawResult$ui_release(null);
            ObserverModifierNodeKt.observeReads(this, new CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1(this, cacheDrawScope));
            if (cacheDrawScope.getDrawResult$ui_release() != null) {
                this.f28965o = true;
            } else {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
        }
        DrawResult drawResult$ui_release = this.f28964n.getDrawResult$ui_release();
        Intrinsics.checkNotNull(drawResult$ui_release);
        return drawResult$ui_release;
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        m59802a().getBlock$ui_release().invoke(contentDrawScope);
    }

    public final Function1 getBlock() {
        return this.f28966p;
    }

    @Override // androidx.compose.p003ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return DelegatableNodeKt.requireDensity(this);
    }

    @Override // androidx.compose.p003ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this);
    }

    @Override // androidx.compose.p003ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo71606getSizeNHjbRc() {
        return IntSizeKt.m74012toSizeozmzZPI(DelegatableNodeKt.m73078requireCoordinator64DMado(this, NodeKind.m73145constructorimpl(128)).mo73000getSizeYbymL2g());
    }

    @Override // androidx.compose.p003ui.draw.CacheDrawModifierNode
    public void invalidateDrawCache() {
        this.f28965o = false;
        this.f28964n.setDrawResult$ui_release(null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.p003ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateDrawCache();
    }

    public final void setBlock(Function1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f28966p = value;
        invalidateDrawCache();
    }
}