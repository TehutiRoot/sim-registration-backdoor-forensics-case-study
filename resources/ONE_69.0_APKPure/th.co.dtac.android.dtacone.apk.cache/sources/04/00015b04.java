package th.p047co.dtac.android.dtacone.viewmodel.upPass;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderReadException;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.cardreader.IdCardCommand;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.IdCardReaderState;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001LB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000e¢\u0006\u0004\b \u0010\u0010J\r\u0010!\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020+0/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u000106058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010-R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00150/8\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u00103R\u0016\u0010F\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010E¨\u0006M"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/upPass/IdCardReaderViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/manager/cardreader/IdCardCommand;", "idCardCommand", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "cardReaderService", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", "drawBitmap", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "temporaryCache", "<init>", "(Lth/co/dtac/android/dtacone/manager/cardreader/IdCardCommand;Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;Lth/co/dtac/android/dtacone/manager/TemporaryCache;)V", "", "startConnectMonitoring", "()V", "", "cause", "", "attempt", "", OperatorName.CURVE_TO, "(Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;Ljava/lang/Throwable;J)Z", "throwable", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/Throwable;)Z", "stopConnectMonitoring", "", "name", "setBitmapName", "(Ljava/lang/String;)V", "startFetchingCardDataLoop", "stopFetchingCardDataLoop", "Lth/co/dtac/android/dtacone/manager/cardreader/IdCardCommand;", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "d", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "e", "Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/IdCardReaderState;", OperatorName.NON_STROKING_GRAY, "Lkotlinx/coroutines/flow/MutableStateFlow;", "_cardReaderState", "Lkotlinx/coroutines/flow/StateFlow;", OperatorName.CLOSE_PATH, "Lkotlinx/coroutines/flow/StateFlow;", "getCardReaderState", "()Lkotlinx/coroutines/flow/StateFlow;", "cardReaderState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "i", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_onSuccessReadFinish", "Lkotlinx/coroutines/flow/SharedFlow;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlinx/coroutines/flow/SharedFlow;", "getOnSuccessReadFinish", "()Lkotlinx/coroutines/flow/SharedFlow;", "onSuccessReadFinish", OperatorName.NON_STROKING_CMYK, "_isConnected", OperatorName.LINE_TO, "isConnected", OperatorName.MOVE_TO, "Z", "isConnectLooping", OperatorName.ENDPATH, "Ljava/lang/String;", "bitmapName", "o", "isFetchLooping", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.IdCardReaderViewModel */
/* loaded from: classes9.dex */
public final class IdCardReaderViewModel extends BaseViewModel {

    /* renamed from: b */
    public final IdCardCommand f107104b;

    /* renamed from: c */
    public final CardReaderService f107105c;

    /* renamed from: d */
    public final BitmapUtil f107106d;

    /* renamed from: e */
    public final DrawBitmap f107107e;

    /* renamed from: f */
    public final TemporaryCache f107108f;

    /* renamed from: g */
    public final MutableStateFlow f107109g;

    /* renamed from: h */
    public final StateFlow f107110h;

    /* renamed from: i */
    public final MutableSharedFlow f107111i;

    /* renamed from: j */
    public final SharedFlow f107112j;

    /* renamed from: k */
    public final MutableStateFlow f107113k;

    /* renamed from: l */
    public final StateFlow f107114l;

    /* renamed from: m */
    public boolean f107115m;

    /* renamed from: n */
    public String f107116n;

    /* renamed from: o */
    public boolean f107117o;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/upPass/IdCardReaderViewModel$Companion;", "", "()V", "TAG", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.IdCardReaderViewModel$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Inject
    public IdCardReaderViewModel(@NotNull IdCardCommand idCardCommand, @NotNull CardReaderService cardReaderService, @NotNull BitmapUtil bitmapUtil, @NotNull DrawBitmap drawBitmap, @NotNull TemporaryCache temporaryCache) {
        Intrinsics.checkNotNullParameter(idCardCommand, "idCardCommand");
        Intrinsics.checkNotNullParameter(cardReaderService, "cardReaderService");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(drawBitmap, "drawBitmap");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        this.f107104b = idCardCommand;
        this.f107105c = cardReaderService;
        this.f107106d = bitmapUtil;
        this.f107107e = drawBitmap;
        this.f107108f = temporaryCache;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(IdCardReaderState.Disconnected.INSTANCE);
        this.f107109g = MutableStateFlow;
        this.f107110h = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f107111i = MutableSharedFlow$default;
        this.f107112j = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.valueOf(cardReaderService.isConnected()));
        this.f107113k = MutableStateFlow2;
        this.f107114l = FlowKt.asStateFlow(MutableStateFlow2);
        startConnectMonitoring();
        this.f107116n = BitmapUtil.IMAGE_ID_CARD;
    }

    /* renamed from: b */
    private final boolean m1858b(Throwable th2) {
        if ((th2 instanceof CardReaderReadException) && AbstractC19741eO1.equals("trans apdu error", th2.getMessage(), true)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m1857c(CardReaderService cardReaderService, Throwable th2, long j) {
        if (m1858b(th2) && j < 2) {
            cardReaderService.unlockDevice();
            return true;
        }
        return false;
    }

    private final void startConnectMonitoring() {
        if (!this.f107115m) {
            this.f107115m = true;
            AbstractC1539Vc.m65885e(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new IdCardReaderViewModel$startConnectMonitoring$1(this, null), 2, null);
        }
    }

    @NotNull
    public final StateFlow<IdCardReaderState> getCardReaderState() {
        return this.f107110h;
    }

    @NotNull
    public final SharedFlow<IdCardInformationCollection> getOnSuccessReadFinish() {
        return this.f107112j;
    }

    @NotNull
    public final StateFlow<Boolean> isConnected() {
        return this.f107114l;
    }

    public final void setBitmapName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f107116n = name;
    }

    public final void startFetchingCardDataLoop() {
        if (!this.f107117o) {
            this.f107117o = true;
            AbstractC1539Vc.m65885e(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new IdCardReaderViewModel$startFetchingCardDataLoop$1(this, null), 2, null);
        }
    }

    public final void stopConnectMonitoring() {
        this.f107117o = false;
        this.f107115m = false;
    }

    public final void stopFetchingCardDataLoop() {
        this.f107117o = false;
    }
}