package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "Landroid/graphics/Bitmap;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.QRViewModel$start$2 */
/* loaded from: classes9.dex */
public final class QRViewModel$start$2 extends Lambda implements Function1<Pair<? extends Bitmap, ? extends String>, String> {
    public static final QRViewModel$start$2 INSTANCE = new QRViewModel$start$2();

    public QRViewModel$start$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(Pair<? extends Bitmap, ? extends String> pair) {
        return invoke2((Pair<Bitmap, String>) pair);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String invoke2(@NotNull Pair<Bitmap, String> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.component2();
    }
}