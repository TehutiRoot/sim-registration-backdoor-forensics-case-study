package p000;

import android.graphics.RenderEffect;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.AndroidTileMode_androidKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: Iw1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17862Iw1 {

    /* renamed from: a */
    public static final C17862Iw1 f2850a = new C17862Iw1();

    @DoNotInline
    @NotNull
    /* renamed from: a */
    public final RenderEffect m67947a(@Nullable androidx.compose.p003ui.graphics.RenderEffect renderEffect, float f, float f2, int i) {
        RenderEffect createBlurEffect;
        RenderEffect createBlurEffect2;
        if (renderEffect == null) {
            createBlurEffect2 = RenderEffect.createBlurEffect(f, f2, AndroidTileMode_androidKt.m71833toAndroidTileMode0vamqd0(i));
            Intrinsics.checkNotNullExpressionValue(createBlurEffect2, "{\n            android.gr…)\n            )\n        }");
            return createBlurEffect2;
        }
        createBlurEffect = RenderEffect.createBlurEffect(f, f2, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m71833toAndroidTileMode0vamqd0(i));
        Intrinsics.checkNotNullExpressionValue(createBlurEffect, "{\n            android.gr…)\n            )\n        }");
        return createBlurEffect;
    }

    @DoNotInline
    @NotNull
    /* renamed from: b */
    public final RenderEffect m67946b(@Nullable androidx.compose.p003ui.graphics.RenderEffect renderEffect, long j) {
        RenderEffect createOffsetEffect;
        RenderEffect createOffsetEffect2;
        if (renderEffect == null) {
            createOffsetEffect2 = RenderEffect.createOffsetEffect(Offset.m71686getXimpl(j), Offset.m71687getYimpl(j));
            Intrinsics.checkNotNullExpressionValue(createOffsetEffect2, "{\n            android.gr…et.x, offset.y)\n        }");
            return createOffsetEffect2;
        }
        createOffsetEffect = RenderEffect.createOffsetEffect(Offset.m71686getXimpl(j), Offset.m71687getYimpl(j), renderEffect.asAndroidRenderEffect());
        Intrinsics.checkNotNullExpressionValue(createOffsetEffect, "{\n            android.gr…)\n            )\n        }");
        return createOffsetEffect;
    }
}