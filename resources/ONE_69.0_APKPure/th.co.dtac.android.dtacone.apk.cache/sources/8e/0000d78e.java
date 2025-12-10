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
public class C11539jk {

    /* renamed from: a */
    public final CameraStateRegistry f67390a;

    /* renamed from: b */
    public final MutableLiveData f67391b;

    /* renamed from: jk$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11540a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67392a;

        static {
            int[] iArr = new int[CameraInternal.State.values().length];
            f67392a = iArr;
            try {
                iArr[CameraInternal.State.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67392a[CameraInternal.State.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67392a[CameraInternal.State.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67392a[CameraInternal.State.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67392a[CameraInternal.State.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67392a[CameraInternal.State.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67392a[CameraInternal.State.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67392a[CameraInternal.State.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public C11539jk(CameraStateRegistry cameraStateRegistry) {
        this.f67390a = cameraStateRegistry;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f67391b = mutableLiveData;
        mutableLiveData.postValue(CameraState.create(CameraState.Type.CLOSED));
    }

    /* renamed from: a */
    public LiveData m29470a() {
        return this.f67391b;
    }

    /* renamed from: b */
    public final CameraState m29469b() {
        if (this.f67390a.isCameraClosing()) {
            return CameraState.create(CameraState.Type.OPENING);
        }
        return CameraState.create(CameraState.Type.PENDING_OPEN);
    }

    /* renamed from: c */
    public void m29468c(CameraInternal.State state, CameraState.StateError stateError) {
        CameraState m29469b;
        switch (C11540a.f67392a[state.ordinal()]) {
            case 1:
                m29469b = m29469b();
                break;
            case 2:
                m29469b = CameraState.create(CameraState.Type.OPENING, stateError);
                break;
            case 3:
            case 4:
                m29469b = CameraState.create(CameraState.Type.OPEN, stateError);
                break;
            case 5:
            case 6:
                m29469b = CameraState.create(CameraState.Type.CLOSING, stateError);
                break;
            case 7:
            case 8:
                m29469b = CameraState.create(CameraState.Type.CLOSED, stateError);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + state);
        }
        Logger.m63178d("CameraStateMachine", "New public camera state " + m29469b + " from " + state + " and " + stateError);
        if (!Objects.equals((CameraState) this.f67391b.getValue(), m29469b)) {
            Logger.m63178d("CameraStateMachine", "Publishing new public camera state " + m29469b);
            this.f67391b.postValue(m29469b);
        }
    }
}