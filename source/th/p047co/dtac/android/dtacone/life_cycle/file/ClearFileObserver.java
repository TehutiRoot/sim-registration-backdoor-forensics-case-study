package th.p047co.dtac.android.dtacone.life_cycle.file;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.ObservableKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.life_cycle.file.ClearFileObserver;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m28850d2 = {"Lth/co/dtac/android/dtacone/life_cycle/file/ClearFileObserver;", "Landroidx/lifecycle/LifecycleObserver;", "Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "<init>", "(Lth/co/dtac/android/dtacone/util/FileUtil;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;)V", "", "", "imageNameFiles", "", "clearFiles", "(Ljava/util/List;)V", "clearFile", "()V", "listOfImageNameObservable", "d", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/util/FileUtil;", "getFileUtil", "()Lth/co/dtac/android/dtacone/util/FileUtil;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "getThreadService", "()Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.life_cycle.file.ClearFileObserver */
/* loaded from: classes7.dex */
public final class ClearFileObserver implements LifecycleObserver {
    public static final int $stable = 8;

    /* renamed from: a */
    public final FileUtil f84772a;

    /* renamed from: b */
    public final Rx2ThreadService f84773b;

    public ClearFileObserver(@NotNull FileUtil fileUtil, @NotNull Rx2ThreadService threadService) {
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        this.f84772a = fileUtil;
        this.f84773b = threadService;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m19447a(Function1 function1, Object obj) {
        return m19443e(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m19446b(Function1 function1, Object obj) {
        return m19441g(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ Boolean m19445c(Function1 function1, Object obj) {
        return m19442f(function1, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void clearFiles$default(ClearFileObserver clearFileObserver, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        clearFileObserver.clearFiles(list);
    }

    /* renamed from: e */
    public static final boolean m19443e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: f */
    public static final Boolean m19442f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final Boolean m19441g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void clearFile() {
        m19444d(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{BitmapUtil.IMAGE_BARCODE, BitmapUtil.IMAGE_RTR_PROFILE, BitmapUtil.IMAGE_COMPARE, BitmapUtil.IMAGE_ID_CARD, BitmapUtil.IMAGE_ID_CARD_CROP, BitmapUtil.IMAGE_ID_CARD_WITH_WATERMARK, BitmapUtil.IMAGE_FACE, BitmapUtil.IMAGE_PREPAID_MERGED, BitmapUtil.IMAGE_SIGNATURE, BitmapUtil.IMAGE_SIGNATURE_PURE}));
    }

    public final void clearFiles(@NotNull List<String> imageNameFiles) {
        Intrinsics.checkNotNullParameter(imageNameFiles, "imageNameFiles");
        m19444d(imageNameFiles);
    }

    /* renamed from: d */
    public final void m19444d(List list) {
        Observable observable = ObservableKt.toObservable(list);
        final ClearFileObserver$clearFileObservable$clearFileObservable$1 clearFileObserver$clearFileObservable$clearFileObservable$1 = new ClearFileObserver$clearFileObservable$clearFileObservable$1(this);
        Observable filter = observable.filter(new Predicate() { // from class: Hp
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return ClearFileObserver.m19447a(clearFileObserver$clearFileObservable$clearFileObservable$1, obj);
            }
        });
        final ClearFileObserver$clearFileObservable$clearFileObservable$2 clearFileObserver$clearFileObservable$clearFileObservable$2 = new ClearFileObserver$clearFileObservable$clearFileObservable$2(this);
        Observable compose = filter.map(new Function() { // from class: Ip
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ClearFileObserver.m19445c(clearFileObserver$clearFileObservable$clearFileObservable$2, obj);
            }
        }).compose(this.f84773b.applyBackground());
        final ClearFileObserver$clearFileObservable$clearFileObservable$3 clearFileObserver$clearFileObservable$clearFileObservable$3 = ClearFileObserver$clearFileObservable$clearFileObservable$3.INSTANCE;
        compose.onErrorReturn(new Function() { // from class: Jp
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ClearFileObserver.m19446b(clearFileObserver$clearFileObservable$clearFileObservable$3, obj);
            }
        }).subscribe();
    }

    @NotNull
    public final FileUtil getFileUtil() {
        return this.f84772a;
    }

    @NotNull
    public final Rx2ThreadService getThreadService() {
        return this.f84773b;
    }
}
