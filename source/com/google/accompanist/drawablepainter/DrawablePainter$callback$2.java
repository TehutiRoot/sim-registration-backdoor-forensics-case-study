package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "com/google/accompanist/drawablepainter/DrawablePainter$callback$2$1", "invoke", "()Lcom/google/accompanist/drawablepainter/DrawablePainter$callback$2$1;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class DrawablePainter$callback$2 extends Lambda implements Function0<C61821> {
    final /* synthetic */ DrawablePainter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawablePainter$callback$2(DrawablePainter drawablePainter) {
        super(0);
        this.this$0 = drawablePainter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1] */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final C61821 invoke() {
        final DrawablePainter drawablePainter = this.this$0;
        return new Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(@NotNull Drawable d) {
                int m49255f;
                long m49251a;
                Intrinsics.checkNotNullParameter(d, "d");
                DrawablePainter drawablePainter2 = DrawablePainter.this;
                m49255f = drawablePainter2.m49255f();
                drawablePainter2.m49253h(m49255f + 1);
                DrawablePainter drawablePainter3 = DrawablePainter.this;
                m49251a = DrawablePainterKt.m49251a(drawablePainter3.getDrawable());
                drawablePainter3.m49252i(m49251a);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(@NotNull Drawable d, @NotNull Runnable what, long j) {
                Handler m49250b;
                Intrinsics.checkNotNullParameter(d, "d");
                Intrinsics.checkNotNullParameter(what, "what");
                m49250b = DrawablePainterKt.m49250b();
                m49250b.postAtTime(what, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(@NotNull Drawable d, @NotNull Runnable what) {
                Handler m49250b;
                Intrinsics.checkNotNullParameter(d, "d");
                Intrinsics.checkNotNullParameter(what, "what");
                m49250b = DrawablePainterKt.m49250b();
                m49250b.removeCallbacks(what);
            }
        };
    }
}
