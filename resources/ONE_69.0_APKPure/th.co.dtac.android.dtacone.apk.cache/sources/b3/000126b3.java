package th.p047co.dtac.android.dtacone.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012 \b\u0002\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u00072\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR,\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u0007\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/RecallDisposable;", "", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "viewModel", "Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable", "", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "", "recallApiMapper", "<init>", "(Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;Lio/reactivex/disposables/CompositeDisposable;Ljava/util/Map;)V", "Lio/reactivex/disposables/Disposable;", "disposable", "liveData", "func", "", ProductAction.ACTION_ADD, "(Lio/reactivex/disposables/Disposable;Landroidx/lifecycle/MutableLiveData;Ljava/lang/String;)V", "recallFail", "()V", "dispose", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CURVE_TO, "Ljava/util/Map;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecallDisposable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecallDisposable.kt\nth/co/dtac/android/dtacone/util/RecallDisposable\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,51:1\n215#2,2:52\n*S KotlinDebug\n*F\n+ 1 RecallDisposable.kt\nth/co/dtac/android/dtacone/util/RecallDisposable\n*L\n25#1:52,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.util.RecallDisposable */
/* loaded from: classes8.dex */
public final class RecallDisposable {
    public static final int $stable = 8;

    /* renamed from: a */
    public final BaseViewModel f87075a;

    /* renamed from: b */
    public final CompositeDisposable f87076b;

    /* renamed from: c */
    public final Map f87077c;

    public RecallDisposable(@NotNull BaseViewModel viewModel, @NotNull CompositeDisposable compositeDisposable, @NotNull Map<MutableLiveData<Resource<Object>>, String> recallApiMapper) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(recallApiMapper, "recallApiMapper");
        this.f87075a = viewModel;
        this.f87076b = compositeDisposable;
        this.f87077c = recallApiMapper;
    }

    public final void add(@NotNull Disposable disposable, @NotNull MutableLiveData<Resource<Object>> liveData, @NotNull String func) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(func, "func");
        if (!this.f87077c.containsKey(liveData)) {
            DisposableKt.addTo(disposable, this.f87076b);
            this.f87077c.put(liveData, func);
        }
    }

    public final void dispose() {
        this.f87076b.dispose();
    }

    public final void recallFail() {
        for (Map.Entry entry : this.f87077c.entrySet()) {
            Resource resource = (Resource) ((MutableLiveData) entry.getKey()).getValue();
            if (resource != null && resource.getStatus() != StatusResource.SUCCESS) {
                String str = (String) entry.getValue();
            }
        }
    }

    public /* synthetic */ RecallDisposable(BaseViewModel baseViewModel, CompositeDisposable compositeDisposable, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseViewModel, (i & 2) != 0 ? new CompositeDisposable() : compositeDisposable, (i & 4) != 0 ? new LinkedHashMap() : map);
    }
}