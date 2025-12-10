package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import android.graphics.Bitmap;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "Landroid/graphics/Bitmap;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.QRViewModel$qrValueObservable$2 */
/* loaded from: classes9.dex */
public final class QRViewModel$qrValueObservable$2 extends Lambda implements Function0<PublishSubject<Pair<? extends Bitmap, ? extends String>>> {
    public static final QRViewModel$qrValueObservable$2 INSTANCE = new QRViewModel$qrValueObservable$2();

    public QRViewModel$qrValueObservable$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final PublishSubject<Pair<? extends Bitmap, ? extends String>> invoke2() {
        return PublishSubject.create();
    }
}