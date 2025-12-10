package th.p047co.dtac.android.dtacone.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\f\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/ObserveSingleEvent;", "T", "", "<init>", "()V", "Lkotlin/Function1;", "", "onSuccess", "Landroidx/lifecycle/Observer;", "Lth/co/dtac/android/dtacone/model/Resource;", "observeResourceLiveData", "(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/Observer;", "observeLiveData", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/lang/Object;", "", "Z", "hasBeenHandled", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.ObserveSingleEvent */
/* loaded from: classes9.dex */
public final class ObserveSingleEvent<T> {
    public static final int $stable = 8;

    /* renamed from: a */
    public boolean f105130a;

    /* renamed from: th.co.dtac.android.dtacone.viewmodel.ObserveSingleEvent$a */
    /* loaded from: classes9.dex */
    public static final class C16479a implements Observer {

        /* renamed from: b */
        public final /* synthetic */ Function1 f105132b;

        public C16479a(Function1 function1) {
            this.f105132b = function1;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            Object m3353a = ObserveSingleEvent.this.m3353a();
            if (m3353a != null) {
                this.f105132b.invoke(m3353a);
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.viewmodel.ObserveSingleEvent$b */
    /* loaded from: classes9.dex */
    public static final class C16480b implements Observer {

        /* renamed from: a */
        public final /* synthetic */ Function1 f105133a;

        public C16480b(Function1 function1) {
            this.f105133a = function1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(Resource res) {
            Intrinsics.checkNotNullParameter(res, "res");
            Resource<T> resourceContentIfNotHandled = res.getResourceContentIfNotHandled();
            if (resourceContentIfNotHandled != null) {
                Function1 function1 = this.f105133a;
                if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
                    function1.invoke(resourceContentIfNotHandled.getData());
                }
            }
        }
    }

    /* renamed from: a */
    public final Object m3353a() {
        if (this.f105130a) {
            return null;
        }
        this.f105130a = true;
        return this;
    }

    @NotNull
    public final Observer<T> observeLiveData(@NotNull Function1<Object, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        return new C16479a(onSuccess);
    }

    @NotNull
    public final Observer<Resource<T>> observeResourceLiveData(@NotNull Function1<Object, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        return new C16480b(onSuccess);
    }
}