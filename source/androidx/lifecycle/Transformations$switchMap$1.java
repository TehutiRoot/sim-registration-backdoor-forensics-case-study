package androidx.lifecycle;

import androidx.lifecycle.Transformations;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "X", "Y", "value", "invoke", "(Ljava/lang/Object;)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class Transformations$switchMap$1 extends Lambda implements Function1<X, Unit> {
    final /* synthetic */ Ref.ObjectRef<LiveData<Y>> $liveData;
    final /* synthetic */ MediatorLiveData<Y> $result;
    final /* synthetic */ Function1<X, LiveData<Y>> $transform;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0003H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28850d2 = {"<anonymous>", "", "X", "Y", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.lifecycle.Transformations$switchMap$1$1 */
    /* loaded from: classes2.dex */
    public static final class C46801 extends Lambda implements Function1<Y, Unit> {
        final /* synthetic */ MediatorLiveData<Y> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46801(MediatorLiveData<Y> mediatorLiveData) {
            super(1);
            this.$result = mediatorLiveData;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C46801) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Y y) {
            this.$result.setValue(y);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$1(Function1<X, LiveData<Y>> function1, Ref.ObjectRef<LiveData<Y>> objectRef, MediatorLiveData<Y> mediatorLiveData) {
        super(1);
        this.$transform = function1;
        this.$liveData = objectRef;
        this.$result = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((Transformations$switchMap$1) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(X x) {
        ?? r4 = (LiveData) this.$transform.invoke(x);
        Object obj = this.$liveData.element;
        if (obj != r4) {
            if (obj != null) {
                MediatorLiveData<Y> mediatorLiveData = this.$result;
                Intrinsics.checkNotNull(obj);
                mediatorLiveData.removeSource((LiveData) obj);
            }
            this.$liveData.element = r4;
            if (r4 != 0) {
                MediatorLiveData<Y> mediatorLiveData2 = this.$result;
                Intrinsics.checkNotNull(r4);
                mediatorLiveData2.addSource(r4, new Transformations.C4679a(new C46801(this.$result)));
            }
        }
    }
}
