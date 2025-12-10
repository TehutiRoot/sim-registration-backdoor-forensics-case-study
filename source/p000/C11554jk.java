package p000;

import androidx.camera.core.CameraState;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.Objects;

/* renamed from: jk */
/* loaded from: classes.dex */
public class C11554jk {

    /* renamed from: a */
    public final CameraStateRegistry f67347a;

    /* renamed from: b */
    public final MutableLiveData f67348b;

    /* renamed from: jk$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11555a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67349a;

        static {
            int[] iArr = new int[CameraInternal.State.values().length];
            f67349a = iArr;
            try {
                iArr[CameraInternal.State.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67349a[CameraInternal.State.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67349a[CameraInternal.State.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67349a[CameraInternal.State.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67349a[CameraInternal.State.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67349a[CameraInternal.State.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67349a[CameraInternal.State.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67349a[CameraInternal.State.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public C11554jk(CameraStateRegistry cameraStateRegistry) {
        this.f67347a = cameraStateRegistry;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f67348b = mutableLiveData;
        mutableLiveData.postValue(CameraState.create(CameraState.Type.CLOSED));
    }

    /* renamed from: a */
    public LiveData m29135a() {
        return this.f67348b;
    }

    /* renamed from: b */
    public final CameraState m29134b() {
        if (this.f67347a.isCameraClosing()) {
            return CameraState.create(CameraState.Type.OPENING);
        }
        return CameraState.create(CameraState.Type.PENDING_OPEN);
    }

    /* renamed from: c */
    public void m29133c(CameraInternal.State state, CameraState.StateError stateError) {
        CameraState m29134b;
        switch (C11555a.f67349a[state.ordinal()]) {
            case 1:
                m29134b = m29134b();
                break;
            case 2:
                m29134b = CameraState.create(CameraState.Type.OPENING, stateError);
                break;
            case 3:
            case 4:
                m29134b = CameraState.create(CameraState.Type.OPEN, stateError);
                break;
            case 5:
            case 6:
                m29134b = CameraState.create(CameraState.Type.CLOSING, stateError);
                break;
            case 7:
            case 8:
                m29134b = CameraState.create(CameraState.Type.CLOSED, stateError);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + state);
        }
        Logger.m63230d("CameraStateMachine", "New public camera state " + m29134b + " from " + state + " and " + stateError);
        if (!Objects.equals((CameraState) this.f67348b.getValue(), m29134b)) {
            Logger.m63230d("CameraStateMachine", "Publishing new public camera state " + m29134b);
            this.f67348b.postValue(m29134b);
        }
    }
}
