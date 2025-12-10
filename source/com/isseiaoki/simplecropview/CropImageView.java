package com.isseiaoki.simplecropview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.bumptech.glide.Registry;
import com.isseiaoki.simplecropview.animation.SimpleValueAnimator;
import com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener;
import com.isseiaoki.simplecropview.animation.ValueAnimatorV14;
import com.isseiaoki.simplecropview.callback.Callback;
import com.isseiaoki.simplecropview.callback.CropCallback;
import com.isseiaoki.simplecropview.callback.LoadCallback;
import com.isseiaoki.simplecropview.callback.SaveCallback;
import com.isseiaoki.simplecropview.util.Logger;
import com.isseiaoki.simplecropview.util.Utils;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes5.dex */
public class CropImageView extends ImageView {

    /* renamed from: A */
    public int f58017A;

    /* renamed from: B */
    public int f58018B;

    /* renamed from: C */
    public int f58019C;

    /* renamed from: D */
    public int f58020D;

    /* renamed from: E */
    public int f58021E;

    /* renamed from: F */
    public boolean f58022F;

    /* renamed from: G */
    public Bitmap.CompressFormat f58023G;

    /* renamed from: H */
    public int f58024H;

    /* renamed from: I */
    public int f58025I;

    /* renamed from: J */
    public int f58026J;

    /* renamed from: K */
    public int f58027K;

    /* renamed from: L */
    public int f58028L;

    /* renamed from: M */
    public AtomicBoolean f58029M;

    /* renamed from: N */
    public AtomicBoolean f58030N;

    /* renamed from: O */
    public AtomicBoolean f58031O;

    /* renamed from: P */
    public ExecutorService f58032P;

    /* renamed from: Q */
    public TouchArea f58033Q;

    /* renamed from: R */
    public CropMode f58034R;

    /* renamed from: S */
    public ShowMode f58035S;

    /* renamed from: T */
    public ShowMode f58036T;

    /* renamed from: U */
    public float f58037U;

    /* renamed from: V */
    public int f58038V;

    /* renamed from: W */
    public int f58039W;

    /* renamed from: a */
    public int f58040a;

    /* renamed from: a0 */
    public boolean f58041a0;

    /* renamed from: b */
    public int f58042b;

    /* renamed from: b0 */
    public boolean f58043b0;

    /* renamed from: c */
    public float f58044c;

    /* renamed from: c0 */
    public boolean f58045c0;

    /* renamed from: d */
    public float f58046d;

    /* renamed from: d0 */
    public boolean f58047d0;

    /* renamed from: e */
    public float f58048e;

    /* renamed from: e0 */
    public PointF f58049e0;

    /* renamed from: f */
    public float f58050f;

    /* renamed from: f0 */
    public float f58051f0;

    /* renamed from: g */
    public boolean f58052g;

    /* renamed from: g0 */
    public float f58053g0;

    /* renamed from: h */
    public Matrix f58054h;

    /* renamed from: h0 */
    public int f58055h0;

    /* renamed from: i */
    public Paint f58056i;

    /* renamed from: i0 */
    public int f58057i0;

    /* renamed from: j */
    public Paint f58058j;

    /* renamed from: j0 */
    public int f58059j0;

    /* renamed from: k */
    public Paint f58060k;

    /* renamed from: k0 */
    public int f58061k0;

    /* renamed from: l */
    public Paint f58062l;

    /* renamed from: l0 */
    public int f58063l0;

    /* renamed from: m */
    public RectF f58064m;

    /* renamed from: m0 */
    public float f58065m0;

    /* renamed from: n */
    public RectF f58066n;

    /* renamed from: n0 */
    public boolean f58067n0;

    /* renamed from: o */
    public RectF f58068o;

    /* renamed from: o0 */
    public int f58069o0;

    /* renamed from: p */
    public PointF f58070p;

    /* renamed from: p0 */
    public boolean f58071p0;

    /* renamed from: q */
    public float f58072q;

    /* renamed from: r */
    public float f58073r;

    /* renamed from: s */
    public boolean f58074s;

    /* renamed from: t */
    public boolean f58075t;

    /* renamed from: u */
    public SimpleValueAnimator f58076u;

    /* renamed from: v */
    public final Interpolator f58077v;

    /* renamed from: w */
    public Interpolator f58078w;

    /* renamed from: x */
    public Handler f58079x;

    /* renamed from: y */
    public Uri f58080y;

    /* renamed from: z */
    public Uri f58081z;

    /* loaded from: classes5.dex */
    public enum CropMode {
        FIT_IMAGE(0),
        RATIO_4_3(1),
        RATIO_3_4(2),
        SQUARE(3),
        RATIO_16_9(4),
        RATIO_9_16(5),
        FREE(6),
        CUSTOM(7),
        CIRCLE(8),
        CIRCLE_SQUARE(9);
        

        /* renamed from: ID */
        private final int f58082ID;

        CropMode(int i) {
            this.f58082ID = i;
        }

        public int getId() {
            return this.f58082ID;
        }
    }

    /* loaded from: classes5.dex */
    public enum RotateDegrees {
        ROTATE_90D(90),
        ROTATE_180D(BitmapUtil.IMAGE_180_DEGREE),
        ROTATE_270D(BitmapUtil.IMAGE_270_DEGREE),
        ROTATE_M90D(-90),
        ROTATE_M180D(-180),
        ROTATE_M270D(-270);
        
        private final int VALUE;

        RotateDegrees(int i) {
            this.VALUE = i;
        }

        public int getValue() {
            return this.VALUE;
        }
    }

    /* loaded from: classes5.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C9037a();

        /* renamed from: A */
        public int f58083A;

        /* renamed from: B */
        public boolean f58084B;

        /* renamed from: C */
        public int f58085C;

        /* renamed from: D */
        public int f58086D;

        /* renamed from: E */
        public int f58087E;

        /* renamed from: F */
        public int f58088F;

        /* renamed from: G */
        public boolean f58089G;

        /* renamed from: H */
        public int f58090H;

        /* renamed from: I */
        public int f58091I;

        /* renamed from: J */
        public int f58092J;

        /* renamed from: K */
        public int f58093K;

        /* renamed from: a */
        public CropMode f58094a;

        /* renamed from: b */
        public int f58095b;

        /* renamed from: c */
        public int f58096c;

        /* renamed from: d */
        public int f58097d;

        /* renamed from: e */
        public ShowMode f58098e;

        /* renamed from: f */
        public ShowMode f58099f;

        /* renamed from: g */
        public boolean f58100g;

        /* renamed from: h */
        public boolean f58101h;

        /* renamed from: i */
        public int f58102i;

        /* renamed from: j */
        public int f58103j;

        /* renamed from: k */
        public float f58104k;

        /* renamed from: l */
        public float f58105l;

        /* renamed from: m */
        public float f58106m;

        /* renamed from: n */
        public float f58107n;

        /* renamed from: o */
        public float f58108o;

        /* renamed from: p */
        public boolean f58109p;

        /* renamed from: q */
        public int f58110q;

        /* renamed from: r */
        public int f58111r;

        /* renamed from: s */
        public float f58112s;

        /* renamed from: t */
        public float f58113t;

        /* renamed from: u */
        public boolean f58114u;

        /* renamed from: v */
        public int f58115v;

        /* renamed from: w */
        public int f58116w;

        /* renamed from: x */
        public Uri f58117x;

        /* renamed from: y */
        public Uri f58118y;

        /* renamed from: z */
        public Bitmap.CompressFormat f58119z;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$SavedState$a */
        /* loaded from: classes5.dex */
        public static class C9037a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, C9049j c9049j) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeSerializable(this.f58094a);
            parcel.writeInt(this.f58095b);
            parcel.writeInt(this.f58096c);
            parcel.writeInt(this.f58097d);
            parcel.writeSerializable(this.f58098e);
            parcel.writeSerializable(this.f58099f);
            parcel.writeInt(this.f58100g ? 1 : 0);
            parcel.writeInt(this.f58101h ? 1 : 0);
            parcel.writeInt(this.f58102i);
            parcel.writeInt(this.f58103j);
            parcel.writeFloat(this.f58104k);
            parcel.writeFloat(this.f58105l);
            parcel.writeFloat(this.f58106m);
            parcel.writeFloat(this.f58107n);
            parcel.writeFloat(this.f58108o);
            parcel.writeInt(this.f58109p ? 1 : 0);
            parcel.writeInt(this.f58110q);
            parcel.writeInt(this.f58111r);
            parcel.writeFloat(this.f58112s);
            parcel.writeFloat(this.f58113t);
            parcel.writeInt(this.f58114u ? 1 : 0);
            parcel.writeInt(this.f58115v);
            parcel.writeInt(this.f58116w);
            parcel.writeParcelable(this.f58117x, i);
            parcel.writeParcelable(this.f58118y, i);
            parcel.writeSerializable(this.f58119z);
            parcel.writeInt(this.f58083A);
            parcel.writeInt(this.f58084B ? 1 : 0);
            parcel.writeInt(this.f58085C);
            parcel.writeInt(this.f58086D);
            parcel.writeInt(this.f58087E);
            parcel.writeInt(this.f58088F);
            parcel.writeInt(this.f58089G ? 1 : 0);
            parcel.writeInt(this.f58090H);
            parcel.writeInt(this.f58091I);
            parcel.writeInt(this.f58092J);
            parcel.writeInt(this.f58093K);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f58094a = (CropMode) parcel.readSerializable();
            this.f58095b = parcel.readInt();
            this.f58096c = parcel.readInt();
            this.f58097d = parcel.readInt();
            this.f58098e = (ShowMode) parcel.readSerializable();
            this.f58099f = (ShowMode) parcel.readSerializable();
            this.f58100g = parcel.readInt() != 0;
            this.f58101h = parcel.readInt() != 0;
            this.f58102i = parcel.readInt();
            this.f58103j = parcel.readInt();
            this.f58104k = parcel.readFloat();
            this.f58105l = parcel.readFloat();
            this.f58106m = parcel.readFloat();
            this.f58107n = parcel.readFloat();
            this.f58108o = parcel.readFloat();
            this.f58109p = parcel.readInt() != 0;
            this.f58110q = parcel.readInt();
            this.f58111r = parcel.readInt();
            this.f58112s = parcel.readFloat();
            this.f58113t = parcel.readFloat();
            this.f58114u = parcel.readInt() != 0;
            this.f58115v = parcel.readInt();
            this.f58116w = parcel.readInt();
            this.f58117x = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
            this.f58118y = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
            this.f58119z = (Bitmap.CompressFormat) parcel.readSerializable();
            this.f58083A = parcel.readInt();
            this.f58084B = parcel.readInt() != 0;
            this.f58085C = parcel.readInt();
            this.f58086D = parcel.readInt();
            this.f58087E = parcel.readInt();
            this.f58088F = parcel.readInt();
            this.f58089G = parcel.readInt() != 0;
            this.f58090H = parcel.readInt();
            this.f58091I = parcel.readInt();
            this.f58092J = parcel.readInt();
            this.f58093K = parcel.readInt();
        }
    }

    /* loaded from: classes5.dex */
    public enum ShowMode {
        SHOW_ALWAYS(1),
        SHOW_ON_TOUCH(2),
        NOT_SHOW(3);
        

        /* renamed from: ID */
        private final int f58120ID;

        ShowMode(int i) {
            this.f58120ID = i;
        }

        public int getId() {
            return this.f58120ID;
        }
    }

    /* loaded from: classes5.dex */
    public enum TouchArea {
        OUT_OF_BOUNDS,
        CENTER,
        LEFT_TOP,
        RIGHT_TOP,
        LEFT_BOTTOM,
        RIGHT_BOTTOM
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$a */
    /* loaded from: classes5.dex */
    public class RunnableC9038a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Uri f58121a;

        /* renamed from: b */
        public final /* synthetic */ CropCallback f58122b;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$a$a */
        /* loaded from: classes5.dex */
        public class RunnableC9039a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f58124a;

            public RunnableC9039a(Bitmap bitmap) {
                this.f58124a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                CropCallback cropCallback = RunnableC9038a.this.f58122b;
                if (cropCallback != null) {
                    cropCallback.onSuccess(this.f58124a);
                }
                if (CropImageView.this.f58022F) {
                    CropImageView.this.invalidate();
                }
            }
        }

        public RunnableC9038a(Uri uri, CropCallback cropCallback) {
            this.f58121a = uri;
            this.f58122b = cropCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    CropImageView.this.f58030N.set(true);
                    Uri uri = this.f58121a;
                    if (uri != null) {
                        CropImageView.this.f58080y = uri;
                    }
                    CropImageView.this.f58079x.post(new RunnableC9039a(CropImageView.this.m33860H()));
                } catch (Exception e) {
                    CropImageView.this.m33806r0(this.f58122b, e);
                }
                CropImageView.this.f58030N.set(false);
            } catch (Throwable th2) {
                CropImageView.this.f58030N.set(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$b */
    /* loaded from: classes5.dex */
    public class C9040b implements Action {
        public C9040b() {
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            CropImageView.this.f58030N.set(false);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$c */
    /* loaded from: classes5.dex */
    public class C9041c implements Consumer {
        public C9041c() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Disposable disposable) {
            CropImageView.this.f58030N.set(true);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$d */
    /* loaded from: classes5.dex */
    public class CallableC9042d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Uri f58128a;

        public CallableC9042d(Uri uri) {
            this.f58128a = uri;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Bitmap call() {
            Uri uri = this.f58128a;
            if (uri != null) {
                CropImageView.this.f58080y = uri;
            }
            return CropImageView.this.m33860H();
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$e */
    /* loaded from: classes5.dex */
    public class RunnableC9043e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f58130a;

        /* renamed from: b */
        public final /* synthetic */ Uri f58131b;

        /* renamed from: c */
        public final /* synthetic */ SaveCallback f58132c;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$e$a */
        /* loaded from: classes5.dex */
        public class RunnableC9044a implements Runnable {
            public RunnableC9044a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC9043e runnableC9043e = RunnableC9043e.this;
                SaveCallback saveCallback = runnableC9043e.f58132c;
                if (saveCallback != null) {
                    saveCallback.onSuccess(runnableC9043e.f58131b);
                }
            }
        }

        public RunnableC9043e(Bitmap bitmap, Uri uri, SaveCallback saveCallback) {
            this.f58130a = bitmap;
            this.f58131b = uri;
            this.f58132c = saveCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    CropImageView.this.f58031O.set(true);
                    CropImageView.this.m33800u0(this.f58130a, this.f58131b);
                    CropImageView.this.f58079x.post(new RunnableC9044a());
                } catch (Exception e) {
                    CropImageView.this.m33806r0(this.f58132c, e);
                }
            } finally {
                CropImageView.this.f58031O.set(false);
            }
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$f */
    /* loaded from: classes5.dex */
    public class C9045f implements Action {
        public C9045f() {
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            CropImageView.this.f58031O.set(false);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$g */
    /* loaded from: classes5.dex */
    public class C9046g implements Consumer {
        public C9046g() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Disposable disposable) {
            CropImageView.this.f58031O.set(true);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$h */
    /* loaded from: classes5.dex */
    public class CallableC9047h implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f58137a;

        /* renamed from: b */
        public final /* synthetic */ Uri f58138b;

        public CallableC9047h(Bitmap bitmap, Uri uri) {
            this.f58137a = bitmap;
            this.f58138b = uri;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Uri call() {
            return CropImageView.this.m33800u0(this.f58137a, this.f58138b);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$i */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9048i {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58140a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f58141b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f58142c;

        static {
            int[] iArr = new int[ShowMode.values().length];
            f58142c = iArr;
            try {
                iArr[ShowMode.SHOW_ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58142c[ShowMode.NOT_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58142c[ShowMode.SHOW_ON_TOUCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CropMode.values().length];
            f58141b = iArr2;
            try {
                iArr2[CropMode.FIT_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58141b[CropMode.FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58141b[CropMode.RATIO_4_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58141b[CropMode.RATIO_3_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f58141b[CropMode.RATIO_16_9.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f58141b[CropMode.RATIO_9_16.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f58141b[CropMode.SQUARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f58141b[CropMode.CIRCLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f58141b[CropMode.CIRCLE_SQUARE.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f58141b[CropMode.CUSTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[TouchArea.values().length];
            f58140a = iArr3;
            try {
                iArr3[TouchArea.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f58140a[TouchArea.LEFT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f58140a[TouchArea.RIGHT_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f58140a[TouchArea.LEFT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f58140a[TouchArea.RIGHT_BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f58140a[TouchArea.OUT_OF_BOUNDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$j */
    /* loaded from: classes5.dex */
    public class C9049j implements SimpleValueAnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ RectF f58143a;

        /* renamed from: b */
        public final /* synthetic */ float f58144b;

        /* renamed from: c */
        public final /* synthetic */ float f58145c;

        /* renamed from: d */
        public final /* synthetic */ float f58146d;

        /* renamed from: e */
        public final /* synthetic */ float f58147e;

        /* renamed from: f */
        public final /* synthetic */ RectF f58148f;

        public C9049j(RectF rectF, float f, float f2, float f3, float f4, RectF rectF2) {
            this.f58143a = rectF;
            this.f58144b = f;
            this.f58145c = f2;
            this.f58146d = f3;
            this.f58147e = f4;
            this.f58148f = rectF2;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationFinished() {
            CropImageView.this.f58064m = this.f58148f;
            CropImageView.this.invalidate();
            CropImageView.this.f58075t = false;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationStarted() {
            CropImageView.this.f58075t = true;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationUpdated(float f) {
            CropImageView cropImageView = CropImageView.this;
            RectF rectF = this.f58143a;
            cropImageView.f58064m = new RectF(rectF.left + (this.f58144b * f), rectF.top + (this.f58145c * f), rectF.right + (this.f58146d * f), rectF.bottom + (this.f58147e * f));
            CropImageView.this.invalidate();
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$k */
    /* loaded from: classes5.dex */
    public class RunnableC9050k implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Callback f58150a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f58151b;

        public RunnableC9050k(Callback callback, Throwable th2) {
            this.f58150a = callback;
            this.f58151b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58150a.onError(this.f58151b);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$l */
    /* loaded from: classes5.dex */
    public class RunnableC9051l implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Uri f58153a;

        /* renamed from: b */
        public final /* synthetic */ RectF f58154b;

        /* renamed from: c */
        public final /* synthetic */ boolean f58155c;

        /* renamed from: d */
        public final /* synthetic */ LoadCallback f58156d;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$l$a */
        /* loaded from: classes5.dex */
        public class RunnableC9052a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f58158a;

            public RunnableC9052a(Bitmap bitmap) {
                this.f58158a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                CropImageView cropImageView = CropImageView.this;
                cropImageView.f58046d = cropImageView.f58017A;
                CropImageView.this.setImageDrawableInternal(new BitmapDrawable(CropImageView.this.getResources(), this.f58158a));
                LoadCallback loadCallback = RunnableC9051l.this.f58156d;
                if (loadCallback != null) {
                    loadCallback.onSuccess();
                }
            }
        }

        public RunnableC9051l(Uri uri, RectF rectF, boolean z, LoadCallback loadCallback) {
            this.f58153a = uri;
            this.f58154b = rectF;
            this.f58155c = z;
            this.f58156d = loadCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    CropImageView.this.f58029M.set(true);
                    CropImageView.this.f58080y = this.f58153a;
                    CropImageView.this.f58066n = this.f58154b;
                    if (this.f58155c) {
                        CropImageView.this.m33793y(this.f58153a);
                    }
                    CropImageView.this.f58079x.post(new RunnableC9052a(CropImageView.this.m33852P(this.f58153a)));
                } catch (Exception e) {
                    CropImageView.this.m33806r0(this.f58156d, e);
                }
                CropImageView.this.f58029M.set(false);
            } catch (Throwable th2) {
                CropImageView.this.f58029M.set(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$m */
    /* loaded from: classes5.dex */
    public class C9053m implements Action {
        public C9053m() {
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            CropImageView.this.f58029M.set(false);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$n */
    /* loaded from: classes5.dex */
    public class C9054n implements Consumer {
        public C9054n() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Disposable disposable) {
            CropImageView.this.f58029M.set(true);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$o */
    /* loaded from: classes5.dex */
    public class C9055o implements CompletableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RectF f58162a;

        /* renamed from: b */
        public final /* synthetic */ Uri f58163b;

        /* renamed from: c */
        public final /* synthetic */ boolean f58164c;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$o$a */
        /* loaded from: classes5.dex */
        public class RunnableC9056a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f58166a;

            /* renamed from: b */
            public final /* synthetic */ CompletableEmitter f58167b;

            public RunnableC9056a(Bitmap bitmap, CompletableEmitter completableEmitter) {
                this.f58166a = bitmap;
                this.f58167b = completableEmitter;
            }

            @Override // java.lang.Runnable
            public void run() {
                CropImageView cropImageView = CropImageView.this;
                cropImageView.f58046d = cropImageView.f58017A;
                CropImageView.this.setImageDrawableInternal(new BitmapDrawable(CropImageView.this.getResources(), this.f58166a));
                this.f58167b.onComplete();
            }
        }

        public C9055o(RectF rectF, Uri uri, boolean z) {
            this.f58162a = rectF;
            this.f58163b = uri;
            this.f58164c = z;
        }

        @Override // io.reactivex.CompletableOnSubscribe
        public void subscribe(CompletableEmitter completableEmitter) {
            CropImageView.this.f58066n = this.f58162a;
            CropImageView.this.f58080y = this.f58163b;
            if (this.f58164c) {
                CropImageView.this.m33793y(this.f58163b);
            }
            CropImageView.this.f58079x.post(new RunnableC9056a(CropImageView.this.m33852P(this.f58163b), completableEmitter));
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$p */
    /* loaded from: classes5.dex */
    public class RunnableC9057p implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f58169a;

        public RunnableC9057p(Bitmap bitmap) {
            this.f58169a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = CropImageView.this;
            cropImageView.f58046d = cropImageView.f58017A;
            CropImageView.this.setImageDrawableInternal(new BitmapDrawable(CropImageView.this.getResources(), this.f58169a));
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$q */
    /* loaded from: classes5.dex */
    public class C9058q implements SimpleValueAnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ float f58171a;

        /* renamed from: b */
        public final /* synthetic */ float f58172b;

        /* renamed from: c */
        public final /* synthetic */ float f58173c;

        /* renamed from: d */
        public final /* synthetic */ float f58174d;

        /* renamed from: e */
        public final /* synthetic */ float f58175e;

        /* renamed from: f */
        public final /* synthetic */ float f58176f;

        public C9058q(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f58171a = f;
            this.f58172b = f2;
            this.f58173c = f3;
            this.f58174d = f4;
            this.f58175e = f5;
            this.f58176f = f6;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationFinished() {
            CropImageView.this.f58046d = this.f58175e % 360.0f;
            CropImageView.this.f58044c = this.f58176f;
            CropImageView.this.f58066n = null;
            CropImageView cropImageView = CropImageView.this;
            cropImageView.m33792y0(cropImageView.f58040a, CropImageView.this.f58042b);
            CropImageView.this.f58074s = false;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationStarted() {
            CropImageView.this.f58074s = true;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationUpdated(float f) {
            CropImageView.this.f58046d = this.f58171a + (this.f58172b * f);
            CropImageView.this.f58044c = this.f58173c + (this.f58174d * f);
            CropImageView.this.m33796w0();
            CropImageView.this.invalidate();
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$r */
    /* loaded from: classes5.dex */
    public class RunnableC9059r implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CropCallback f58178a;

        /* renamed from: b */
        public final /* synthetic */ Uri f58179b;

        /* renamed from: c */
        public final /* synthetic */ SaveCallback f58180c;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$r$a */
        /* loaded from: classes5.dex */
        public class RunnableC9060a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f58182a;

            public RunnableC9060a(Bitmap bitmap) {
                this.f58182a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                CropCallback cropCallback = RunnableC9059r.this.f58178a;
                if (cropCallback != null) {
                    cropCallback.onSuccess(this.f58182a);
                }
                if (CropImageView.this.f58022F) {
                    CropImageView.this.invalidate();
                }
            }
        }

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$r$b */
        /* loaded from: classes5.dex */
        public class RunnableC9061b implements Runnable {
            public RunnableC9061b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC9059r runnableC9059r = RunnableC9059r.this;
                SaveCallback saveCallback = runnableC9059r.f58180c;
                if (saveCallback != null) {
                    saveCallback.onSuccess(runnableC9059r.f58179b);
                }
            }
        }

        public RunnableC9059r(CropCallback cropCallback, Uri uri, SaveCallback saveCallback) {
            this.f58178a = cropCallback;
            this.f58179b = uri;
            this.f58180c = saveCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap = null;
            try {
                try {
                    CropImageView.this.f58030N.set(true);
                    bitmap = CropImageView.this.m33860H();
                    CropImageView.this.f58079x.post(new RunnableC9060a(bitmap));
                    CropImageView.this.m33800u0(bitmap, this.f58179b);
                    CropImageView.this.f58079x.post(new RunnableC9061b());
                } catch (Exception e) {
                    if (bitmap == null) {
                        CropImageView.this.m33806r0(this.f58178a, e);
                    } else {
                        CropImageView.this.m33806r0(this.f58180c, e);
                    }
                }
            } finally {
                CropImageView.this.f58030N.set(false);
            }
        }
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    private SimpleValueAnimator getAnimator() {
        m33794x0();
        return this.f58076u;
    }

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof BitmapDrawable)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    private Bitmap getCroppedBitmapFromUri() throws IOException {
        float f;
        float f2;
        InputStream inputStream = null;
        try {
            inputStream = getContext().getContentResolver().openInputStream(this.f58080y);
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(inputStream, false);
            int width = newInstance.getWidth();
            int height = newInstance.getHeight();
            Rect m33791z = m33791z(width, height);
            if (this.f58046d != 0.0f) {
                Matrix matrix = new Matrix();
                matrix.setRotate(-this.f58046d);
                RectF rectF = new RectF();
                matrix.mapRect(rectF, new RectF(m33791z));
                if (rectF.left < 0.0f) {
                    f = width;
                } else {
                    f = 0.0f;
                }
                if (rectF.top < 0.0f) {
                    f2 = height;
                } else {
                    f2 = 0.0f;
                }
                rectF.offset(f, f2);
                m33791z = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            }
            Bitmap decodeRegion = newInstance.decodeRegion(m33791z, new BitmapFactory.Options());
            if (this.f58046d != 0.0f) {
                Bitmap m33849S = m33849S(decodeRegion);
                if (decodeRegion != getBitmap() && decodeRegion != m33849S) {
                    decodeRegion.recycle();
                }
                decodeRegion = m33849S;
            }
            Utils.closeQuietly(inputStream);
            return decodeRegion;
        } catch (Throwable th2) {
            Utils.closeQuietly(inputStream);
            throw th2;
        }
    }

    private float getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    private float getFrameH() {
        RectF rectF = this.f58064m;
        return rectF.bottom - rectF.top;
    }

    private float getFrameW() {
        RectF rectF = this.f58064m;
        return rectF.right - rectF.left;
    }

    private float getRatioX() {
        int i = C9048i.f58141b[this.f58034R.ordinal()];
        if (i != 1) {
            if (i != 10) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                return 1.0f;
                            }
                            return 9.0f;
                        }
                        return 16.0f;
                    }
                    return 3.0f;
                }
                return 4.0f;
            }
            return this.f58049e0.x;
        }
        return this.f58068o.width();
    }

    private float getRatioY() {
        int i = C9048i.f58141b[this.f58034R.ordinal()];
        if (i != 1) {
            if (i != 10) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                return 1.0f;
                            }
                            return 16.0f;
                        }
                        return 9.0f;
                    }
                    return 4.0f;
                }
                return 3.0f;
            }
            return this.f58049e0.y;
        }
        return this.f58068o.height();
    }

    private void setCenter(PointF pointF) {
        this.f58070p = pointF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageDrawableInternal(Drawable drawable) {
        super.setImageDrawable(drawable);
        m33867A0();
    }

    private void setScale(float f) {
        this.f58044c = f;
    }

    /* renamed from: A */
    public final RectF m33868A(RectF rectF) {
        float m33851Q = m33851Q(rectF.width());
        float m33850R = m33850R(rectF.height());
        float width = rectF.width() / rectF.height();
        float f = m33851Q / m33850R;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        if (f >= width) {
            float f6 = (f3 + f5) * 0.5f;
            float width2 = (rectF.width() / f) * 0.5f;
            f5 = f6 + width2;
            f3 = f6 - width2;
        } else if (f < width) {
            float f7 = (f2 + f4) * 0.5f;
            float height = rectF.height() * f * 0.5f;
            f4 = f7 + height;
            f2 = f7 - height;
        }
        float f8 = f4 - f2;
        float f9 = f5 - f3;
        float f10 = f2 + (f8 / 2.0f);
        float f11 = f3 + (f9 / 2.0f);
        float f12 = this.f58065m0;
        float f13 = (f8 * f12) / 2.0f;
        float f14 = (f9 * f12) / 2.0f;
        return new RectF(f10 - f13, f11 - f14, f10 + f13, f11 + f14);
    }

    /* renamed from: A0 */
    public final void m33867A0() {
        if (getDrawable() != null) {
            m33792y0(this.f58040a, this.f58042b);
        }
    }

    /* renamed from: B */
    public final RectF m33866B(RectF rectF, Matrix matrix) {
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        return rectF2;
    }

    /* renamed from: C */
    public final float m33865C(int i, int i2, float f) {
        this.f58048e = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        this.f58050f = intrinsicHeight;
        if (this.f58048e <= 0.0f) {
            this.f58048e = i;
        }
        if (intrinsicHeight <= 0.0f) {
            this.f58050f = i2;
        }
        float f2 = i;
        float f3 = i2;
        float f4 = f2 / f3;
        float m33846V = m33846V(f) / m33848T(f);
        if (m33846V >= f4) {
            return f2 / m33846V(f);
        }
        if (m33846V < f4) {
            return f3 / m33848T(f);
        }
        return 1.0f;
    }

    /* renamed from: D */
    public final void m33864D() {
        RectF rectF = this.f58064m;
        float f = rectF.left;
        RectF rectF2 = this.f58068o;
        float f2 = f - rectF2.left;
        if (f2 < 0.0f) {
            rectF.left = f - f2;
            rectF.right -= f2;
        }
        float f3 = rectF.right;
        float f4 = f3 - rectF2.right;
        if (f4 > 0.0f) {
            rectF.left -= f4;
            rectF.right = f3 - f4;
        }
        float f5 = rectF.top;
        float f6 = f5 - rectF2.top;
        if (f6 < 0.0f) {
            rectF.top = f5 - f6;
            rectF.bottom -= f6;
        }
        float f7 = rectF.bottom;
        float f8 = f7 - rectF2.bottom;
        if (f8 > 0.0f) {
            rectF.top -= f8;
            rectF.bottom = f7 - f8;
        }
    }

    /* renamed from: E */
    public final void m33863E() {
        RectF rectF = this.f58064m;
        float f = rectF.left;
        RectF rectF2 = this.f58068o;
        float f2 = f - rectF2.left;
        float f3 = rectF.right;
        float f4 = f3 - rectF2.right;
        float f5 = rectF.top;
        float f6 = f5 - rectF2.top;
        float f7 = rectF.bottom;
        float f8 = f7 - rectF2.bottom;
        if (f2 < 0.0f) {
            rectF.left = f - f2;
        }
        if (f4 > 0.0f) {
            rectF.right = f3 - f4;
        }
        if (f6 < 0.0f) {
            rectF.top = f5 - f6;
        }
        if (f8 > 0.0f) {
            rectF.bottom = f7 - f8;
        }
    }

    /* renamed from: F */
    public final void m33862F(float f, float f2) {
        if (m33838b0(f, f2)) {
            this.f58033Q = TouchArea.LEFT_TOP;
            ShowMode showMode = this.f58036T;
            ShowMode showMode2 = ShowMode.SHOW_ON_TOUCH;
            if (showMode == showMode2) {
                this.f58043b0 = true;
            }
            if (this.f58035S == showMode2) {
                this.f58041a0 = true;
            }
        } else if (m33834d0(f, f2)) {
            this.f58033Q = TouchArea.RIGHT_TOP;
            ShowMode showMode3 = this.f58036T;
            ShowMode showMode4 = ShowMode.SHOW_ON_TOUCH;
            if (showMode3 == showMode4) {
                this.f58043b0 = true;
            }
            if (this.f58035S == showMode4) {
                this.f58041a0 = true;
            }
        } else if (m33840a0(f, f2)) {
            this.f58033Q = TouchArea.LEFT_BOTTOM;
            ShowMode showMode5 = this.f58036T;
            ShowMode showMode6 = ShowMode.SHOW_ON_TOUCH;
            if (showMode5 == showMode6) {
                this.f58043b0 = true;
            }
            if (this.f58035S == showMode6) {
                this.f58041a0 = true;
            }
        } else if (m33836c0(f, f2)) {
            this.f58033Q = TouchArea.RIGHT_BOTTOM;
            ShowMode showMode7 = this.f58036T;
            ShowMode showMode8 = ShowMode.SHOW_ON_TOUCH;
            if (showMode7 == showMode8) {
                this.f58043b0 = true;
            }
            if (this.f58035S == showMode8) {
                this.f58041a0 = true;
            }
        } else if (m33832e0(f, f2)) {
            if (this.f58035S == ShowMode.SHOW_ON_TOUCH) {
                this.f58041a0 = true;
            }
            this.f58033Q = TouchArea.CENTER;
        } else {
            this.f58033Q = TouchArea.OUT_OF_BOUNDS;
        }
    }

    /* renamed from: G */
    public final float m33861G(float f, float f2, float f3, float f4) {
        return (f < f2 || f > f3) ? f4 : f;
    }

    /* renamed from: H */
    public final Bitmap m33860H() {
        Bitmap croppedBitmapFromUri;
        if (this.f58080y == null) {
            croppedBitmapFromUri = getCroppedBitmap();
        } else {
            croppedBitmapFromUri = getCroppedBitmapFromUri();
            if (this.f58034R == CropMode.CIRCLE) {
                Bitmap circularBitmap = getCircularBitmap(croppedBitmapFromUri);
                if (croppedBitmapFromUri != getBitmap()) {
                    croppedBitmapFromUri.recycle();
                }
                croppedBitmapFromUri = circularBitmap;
            }
        }
        Bitmap m33798v0 = m33798v0(croppedBitmapFromUri);
        this.f58027K = m33798v0.getWidth();
        this.f58028L = m33798v0.getHeight();
        return m33798v0;
    }

    /* renamed from: I */
    public final void m33859I(Canvas canvas) {
        if (!this.f58045c0 || this.f58074s) {
            return;
        }
        m33853O(canvas);
        m33857K(canvas);
        if (this.f58041a0) {
            m33856L(canvas);
        }
        if (this.f58043b0) {
            m33854N(canvas);
        }
    }

    /* renamed from: J */
    public final void m33858J(Canvas canvas) {
        String str;
        int i;
        StringBuilder sb;
        int i2;
        String str2;
        Paint.FontMetrics fontMetrics = this.f58062l.getFontMetrics();
        this.f58062l.measureText("W");
        int i3 = (int) (fontMetrics.descent - fontMetrics.ascent);
        int density = (int) (this.f58068o.left + (this.f58038V * 0.5f * getDensity()));
        int density2 = (int) (this.f58068o.top + i3 + (this.f58038V * 0.5f * getDensity()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LOADED FROM: ");
        if (this.f58080y != null) {
            str = "Uri";
        } else {
            str = Registry.BUCKET_BITMAP;
        }
        sb2.append(str);
        float f = density;
        canvas.drawText(sb2.toString(), f, density2, this.f58062l);
        StringBuilder sb3 = new StringBuilder();
        if (this.f58080y == null) {
            sb3.append("INPUT_IMAGE_SIZE: ");
            sb3.append((int) this.f58048e);
            sb3.append("x");
            sb3.append((int) this.f58050f);
            i = density2 + i3;
            canvas.drawText(sb3.toString(), f, i, this.f58062l);
            sb = new StringBuilder();
        } else {
            i = density2 + i3;
            canvas.drawText("INPUT_IMAGE_SIZE: " + this.f58025I + "x" + this.f58026J, f, i, this.f58062l);
            sb = new StringBuilder();
        }
        sb.append("LOADED_IMAGE_SIZE: ");
        sb.append(getBitmap().getWidth());
        sb.append("x");
        sb.append(getBitmap().getHeight());
        int i4 = i + i3;
        canvas.drawText(sb.toString(), f, i4, this.f58062l);
        StringBuilder sb4 = new StringBuilder();
        if (this.f58027K > 0 && this.f58028L > 0) {
            sb4.append("OUTPUT_IMAGE_SIZE: ");
            sb4.append(this.f58027K);
            sb4.append("x");
            sb4.append(this.f58028L);
            int i5 = i4 + i3;
            canvas.drawText(sb4.toString(), f, i5, this.f58062l);
            int i6 = i5 + i3;
            canvas.drawText("EXIF ROTATION: " + this.f58017A, f, i6, this.f58062l);
            i4 = i6 + i3;
            canvas.drawText("CURRENT_ROTATION: " + ((int) this.f58046d), f, i4, this.f58062l);
        }
        canvas.drawText("FRAME_RECT: " + this.f58064m.toString(), f, i4 + i3, this.f58062l);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("ACTUAL_CROP_RECT: ");
        if (getActualCropRect() != null) {
            str2 = getActualCropRect().toString();
        } else {
            str2 = "";
        }
        sb5.append(str2);
        canvas.drawText(sb5.toString(), f, i2 + i3, this.f58062l);
    }

    /* renamed from: K */
    public final void m33857K(Canvas canvas) {
        this.f58058j.setAntiAlias(true);
        this.f58058j.setFilterBitmap(true);
        this.f58058j.setStyle(Paint.Style.STROKE);
        this.f58058j.setColor(this.f58059j0);
        this.f58058j.setStrokeWidth(this.f58051f0);
        canvas.drawRect(this.f58064m, this.f58058j);
    }

    /* renamed from: L */
    public final void m33856L(Canvas canvas) {
        this.f58058j.setColor(this.f58063l0);
        this.f58058j.setStrokeWidth(this.f58053g0);
        RectF rectF = this.f58064m;
        float f = rectF.left;
        float f2 = rectF.right;
        float f3 = f + ((f2 - f) / 3.0f);
        float f4 = f2 - ((f2 - f) / 3.0f);
        float f5 = rectF.top;
        float f6 = rectF.bottom;
        float f7 = f5 + ((f6 - f5) / 3.0f);
        float f8 = f6 - ((f6 - f5) / 3.0f);
        canvas.drawLine(f3, f5, f3, f6, this.f58058j);
        RectF rectF2 = this.f58064m;
        canvas.drawLine(f4, rectF2.top, f4, rectF2.bottom, this.f58058j);
        RectF rectF3 = this.f58064m;
        canvas.drawLine(rectF3.left, f7, rectF3.right, f7, this.f58058j);
        RectF rectF4 = this.f58064m;
        canvas.drawLine(rectF4.left, f8, rectF4.right, f8, this.f58058j);
    }

    /* renamed from: M */
    public final void m33855M(Canvas canvas) {
        this.f58058j.setStyle(Paint.Style.FILL);
        this.f58058j.setColor(-1157627904);
        RectF rectF = new RectF(this.f58064m);
        rectF.offset(0.0f, 1.0f);
        canvas.drawCircle(rectF.left, rectF.top, this.f58038V, this.f58058j);
        canvas.drawCircle(rectF.right, rectF.top, this.f58038V, this.f58058j);
        canvas.drawCircle(rectF.left, rectF.bottom, this.f58038V, this.f58058j);
        canvas.drawCircle(rectF.right, rectF.bottom, this.f58038V, this.f58058j);
    }

    /* renamed from: N */
    public final void m33854N(Canvas canvas) {
        if (this.f58071p0) {
            m33855M(canvas);
        }
        this.f58058j.setStyle(Paint.Style.FILL);
        this.f58058j.setColor(this.f58061k0);
        RectF rectF = this.f58064m;
        canvas.drawCircle(rectF.left, rectF.top, this.f58038V, this.f58058j);
        RectF rectF2 = this.f58064m;
        canvas.drawCircle(rectF2.right, rectF2.top, this.f58038V, this.f58058j);
        RectF rectF3 = this.f58064m;
        canvas.drawCircle(rectF3.left, rectF3.bottom, this.f58038V, this.f58058j);
        RectF rectF4 = this.f58064m;
        canvas.drawCircle(rectF4.right, rectF4.bottom, this.f58038V, this.f58058j);
    }

    /* renamed from: O */
    public final void m33853O(Canvas canvas) {
        CropMode cropMode;
        this.f58056i.setAntiAlias(true);
        this.f58056i.setFilterBitmap(true);
        this.f58056i.setColor(this.f58057i0);
        this.f58056i.setStyle(Paint.Style.FILL);
        Path path = new Path();
        RectF rectF = new RectF((float) Math.floor(this.f58068o.left), (float) Math.floor(this.f58068o.top), (float) Math.ceil(this.f58068o.right), (float) Math.ceil(this.f58068o.bottom));
        if (!this.f58075t && ((cropMode = this.f58034R) == CropMode.CIRCLE || cropMode == CropMode.CIRCLE_SQUARE)) {
            path.addRect(rectF, Path.Direction.CW);
            RectF rectF2 = this.f58064m;
            PointF pointF = new PointF((rectF2.left + rectF2.right) / 2.0f, (rectF2.top + rectF2.bottom) / 2.0f);
            RectF rectF3 = this.f58064m;
            path.addCircle(pointF.x, pointF.y, (rectF3.right - rectF3.left) / 2.0f, Path.Direction.CCW);
            canvas.drawPath(path, this.f58056i);
            return;
        }
        path.addRect(rectF, Path.Direction.CW);
        path.addRect(this.f58064m, Path.Direction.CCW);
        canvas.drawPath(path, this.f58056i);
    }

    /* renamed from: P */
    public final Bitmap m33852P(Uri uri) {
        if (uri != null) {
            this.f58017A = Utils.getExifOrientation(getContext(), this.f58080y);
            int maxSize = Utils.getMaxSize();
            int max = Math.max(this.f58040a, this.f58042b);
            if (max != 0) {
                maxSize = max;
            }
            Bitmap decodeSampledBitmapFromUri = Utils.decodeSampledBitmapFromUri(getContext(), this.f58080y, maxSize);
            this.f58025I = Utils.sInputImageWidth;
            this.f58026J = Utils.sInputImageHeight;
            return decodeSampledBitmapFromUri;
        }
        throw new IllegalStateException("Source Uri must not be null.");
    }

    /* renamed from: Q */
    public final float m33851Q(float f) {
        switch (C9048i.f58141b[this.f58034R.ordinal()]) {
            case 1:
                return this.f58068o.width();
            case 2:
            default:
                return f;
            case 3:
                return 4.0f;
            case 4:
                return 3.0f;
            case 5:
                return 16.0f;
            case 6:
                return 9.0f;
            case 7:
            case 8:
            case 9:
                return 1.0f;
            case 10:
                return this.f58049e0.x;
        }
    }

    /* renamed from: R */
    public final float m33850R(float f) {
        switch (C9048i.f58141b[this.f58034R.ordinal()]) {
            case 1:
                return this.f58068o.height();
            case 2:
            default:
                return f;
            case 3:
                return 3.0f;
            case 4:
                return 4.0f;
            case 5:
                return 9.0f;
            case 6:
                return 16.0f;
            case 7:
            case 8:
            case 9:
                return 1.0f;
            case 10:
                return this.f58049e0.y;
        }
    }

    /* renamed from: S */
    public final Bitmap m33849S(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setRotate(this.f58046d, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: T */
    public final float m33848T(float f) {
        return m33847U(f, this.f58048e, this.f58050f);
    }

    /* renamed from: U */
    public final float m33847U(float f, float f2, float f3) {
        return f % 180.0f == 0.0f ? f3 : f2;
    }

    /* renamed from: V */
    public final float m33846V(float f) {
        return m33845W(f, this.f58048e, this.f58050f);
    }

    /* renamed from: W */
    public final float m33845W(float f, float f2, float f3) {
        return f % 180.0f == 0.0f ? f2 : f3;
    }

    /* renamed from: X */
    public final Bitmap m33844X(Uri uri) {
        if (uri != null) {
            this.f58017A = Utils.getExifOrientation(getContext(), this.f58080y);
            int max = (int) (Math.max(this.f58040a, this.f58042b) * 0.1f);
            if (max == 0) {
                return null;
            }
            Bitmap decodeSampledBitmapFromUri = Utils.decodeSampledBitmapFromUri(getContext(), this.f58080y, max);
            this.f58025I = Utils.sInputImageWidth;
            this.f58026J = Utils.sInputImageHeight;
            return decodeSampledBitmapFromUri;
        }
        throw new IllegalStateException("Source Uri must not be null.");
    }

    /* renamed from: Y */
    public final void m33843Y(Context context, AttributeSet attributeSet, int i, float f) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.scv_CropImageView, i, 0);
        this.f58034R = CropMode.SQUARE;
        try {
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.scv_CropImageView_scv_img_src);
                if (drawable != null) {
                    setImageDrawable(drawable);
                }
                CropMode[] values = CropMode.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    CropMode cropMode = values[i2];
                    if (obtainStyledAttributes.getInt(R.styleable.scv_CropImageView_scv_crop_mode, 3) == cropMode.getId()) {
                        this.f58034R = cropMode;
                        break;
                    }
                    i2++;
                }
                this.f58055h0 = obtainStyledAttributes.getColor(R.styleable.scv_CropImageView_scv_background_color, 0);
                this.f58057i0 = obtainStyledAttributes.getColor(R.styleable.scv_CropImageView_scv_overlay_color, -1157627904);
                this.f58059j0 = obtainStyledAttributes.getColor(R.styleable.scv_CropImageView_scv_frame_color, -1);
                this.f58061k0 = obtainStyledAttributes.getColor(R.styleable.scv_CropImageView_scv_handle_color, -1);
                this.f58063l0 = obtainStyledAttributes.getColor(R.styleable.scv_CropImageView_scv_guide_color, -1140850689);
                ShowMode[] values2 = ShowMode.values();
                int length2 = values2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break;
                    }
                    ShowMode showMode = values2[i3];
                    if (obtainStyledAttributes.getInt(R.styleable.scv_CropImageView_scv_guide_show_mode, 1) == showMode.getId()) {
                        this.f58035S = showMode;
                        break;
                    }
                    i3++;
                }
                ShowMode[] values3 = ShowMode.values();
                int length3 = values3.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length3) {
                        break;
                    }
                    ShowMode showMode2 = values3[i4];
                    if (obtainStyledAttributes.getInt(R.styleable.scv_CropImageView_scv_handle_show_mode, 1) == showMode2.getId()) {
                        this.f58036T = showMode2;
                        break;
                    }
                    i4++;
                }
                setGuideShowMode(this.f58035S);
                setHandleShowMode(this.f58036T);
                this.f58038V = obtainStyledAttributes.getDimensionPixelSize(R.styleable.scv_CropImageView_scv_handle_size, (int) (14.0f * f));
                this.f58039W = obtainStyledAttributes.getDimensionPixelSize(R.styleable.scv_CropImageView_scv_touch_padding, 0);
                this.f58037U = obtainStyledAttributes.getDimensionPixelSize(R.styleable.scv_CropImageView_scv_min_frame_size, (int) (50.0f * f));
                int i5 = (int) (f * 1.0f);
                this.f58051f0 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.scv_CropImageView_scv_frame_stroke_weight, i5);
                this.f58053g0 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.scv_CropImageView_scv_guide_stroke_weight, i5);
                this.f58045c0 = obtainStyledAttributes.getBoolean(R.styleable.scv_CropImageView_scv_crop_enabled, true);
                this.f58065m0 = m33861G(obtainStyledAttributes.getFloat(R.styleable.scv_CropImageView_scv_initial_frame_scale, 1.0f), 0.01f, 1.0f, 1.0f);
                this.f58067n0 = obtainStyledAttributes.getBoolean(R.styleable.scv_CropImageView_scv_animation_enabled, true);
                this.f58069o0 = obtainStyledAttributes.getInt(R.styleable.scv_CropImageView_scv_animation_duration, 100);
                this.f58071p0 = obtainStyledAttributes.getBoolean(R.styleable.scv_CropImageView_scv_handle_shadow_enabled, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* renamed from: Z */
    public final boolean m33842Z() {
        if (getFrameH() < this.f58037U) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public final boolean m33840a0(float f, float f2) {
        RectF rectF = this.f58064m;
        float f3 = f - rectF.left;
        float f4 = f2 - rectF.bottom;
        if (m33790z0(this.f58038V + this.f58039W) >= (f3 * f3) + (f4 * f4)) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public final boolean m33838b0(float f, float f2) {
        RectF rectF = this.f58064m;
        float f3 = f - rectF.left;
        float f4 = f2 - rectF.top;
        if (m33790z0(this.f58038V + this.f58039W) >= (f3 * f3) + (f4 * f4)) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public final boolean m33836c0(float f, float f2) {
        RectF rectF = this.f58064m;
        float f3 = f - rectF.right;
        float f4 = f2 - rectF.bottom;
        if (m33790z0(this.f58038V + this.f58039W) >= (f3 * f3) + (f4 * f4)) {
            return true;
        }
        return false;
    }

    public CropRequest crop(Uri uri) {
        return new CropRequest(this, uri);
    }

    public Single<Bitmap> cropAsSingle(Uri uri) {
        return Single.fromCallable(new CallableC9042d(uri)).doOnSubscribe(new C9041c()).doFinally(new C9040b());
    }

    public void cropAsync(Uri uri, CropCallback cropCallback) {
        this.f58032P.submit(new RunnableC9038a(uri, cropCallback));
    }

    /* renamed from: d0 */
    public final boolean m33834d0(float f, float f2) {
        RectF rectF = this.f58064m;
        float f3 = f - rectF.right;
        float f4 = f2 - rectF.top;
        if (m33790z0(this.f58038V + this.f58039W) >= (f3 * f3) + (f4 * f4)) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public final boolean m33832e0(float f, float f2) {
        RectF rectF = this.f58064m;
        if (rectF.left <= f && rectF.right >= f && rectF.top <= f2 && rectF.bottom >= f2) {
            this.f58033Q = TouchArea.CENTER;
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public final boolean m33830f0(float f) {
        RectF rectF = this.f58068o;
        if (rectF.left <= f && rectF.right >= f) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public final boolean m33828g0(float f) {
        RectF rectF = this.f58068o;
        if (rectF.top <= f && rectF.bottom >= f) {
            return true;
        }
        return false;
    }

    public RectF getActualCropRect() {
        RectF rectF = this.f58068o;
        if (rectF == null) {
            return null;
        }
        float f = rectF.left;
        float f2 = this.f58044c;
        float f3 = f / f2;
        float f4 = rectF.top / f2;
        RectF rectF2 = this.f58064m;
        return new RectF(Math.max(0.0f, (rectF2.left / f2) - f3), Math.max(0.0f, (rectF2.top / f2) - f4), Math.min(this.f58068o.right / this.f58044c, (rectF2.right / f2) - f3), Math.min(this.f58068o.bottom / this.f58044c, (rectF2.bottom / f2) - f4));
    }

    public Bitmap getCircularBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Canvas canvas = new Canvas(createBitmap);
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawCircle(width, height, Math.min(width, height), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public Bitmap getCroppedBitmap() {
        Bitmap bitmap = getBitmap();
        if (bitmap == null) {
            return null;
        }
        Bitmap m33849S = m33849S(bitmap);
        Rect m33791z = m33791z(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(m33849S, m33791z.left, m33791z.top, m33791z.width(), m33791z.height(), (Matrix) null, false);
        if (m33849S != createBitmap && m33849S != bitmap) {
            m33849S.recycle();
        }
        if (this.f58034R == CropMode.CIRCLE) {
            Bitmap circularBitmap = getCircularBitmap(createBitmap);
            if (createBitmap != getBitmap()) {
                createBitmap.recycle();
            }
            return circularBitmap;
        }
        return createBitmap;
    }

    public Bitmap getImageBitmap() {
        return getBitmap();
    }

    public Uri getSaveUri() {
        return this.f58081z;
    }

    public Uri getSourceUri() {
        return this.f58080y;
    }

    /* renamed from: h0 */
    public final boolean m33826h0() {
        if (getFrameW() < this.f58037U) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public final void m33824i0(float f, float f2) {
        RectF rectF = this.f58064m;
        rectF.left += f;
        rectF.right += f;
        rectF.top += f2;
        rectF.bottom += f2;
        m33864D();
    }

    public boolean isCropping() {
        return this.f58030N.get();
    }

    public boolean isSaving() {
        return this.f58031O.get();
    }

    /* renamed from: j0 */
    public final void m33822j0(float f, float f2) {
        if (this.f58034R == CropMode.FREE) {
            RectF rectF = this.f58064m;
            rectF.left += f;
            rectF.bottom += f2;
            if (m33826h0()) {
                this.f58064m.left -= this.f58037U - getFrameW();
            }
            if (m33842Z()) {
                this.f58064m.bottom += this.f58037U - getFrameH();
            }
            m33863E();
            return;
        }
        float ratioY = (getRatioY() * f) / getRatioX();
        RectF rectF2 = this.f58064m;
        rectF2.left += f;
        rectF2.bottom -= ratioY;
        if (m33826h0()) {
            float frameW = this.f58037U - getFrameW();
            this.f58064m.left -= frameW;
            this.f58064m.bottom += (frameW * getRatioY()) / getRatioX();
        }
        if (m33842Z()) {
            float frameH = this.f58037U - getFrameH();
            this.f58064m.bottom += frameH;
            this.f58064m.left -= (frameH * getRatioX()) / getRatioY();
        }
        if (!m33830f0(this.f58064m.left)) {
            float f3 = this.f58068o.left;
            RectF rectF3 = this.f58064m;
            float f4 = rectF3.left;
            float f5 = f3 - f4;
            rectF3.left = f4 + f5;
            this.f58064m.bottom -= (f5 * getRatioY()) / getRatioX();
        }
        if (!m33828g0(this.f58064m.bottom)) {
            RectF rectF4 = this.f58064m;
            float f6 = rectF4.bottom;
            float f7 = f6 - this.f58068o.bottom;
            rectF4.bottom = f6 - f7;
            this.f58064m.left += (f7 * getRatioX()) / getRatioY();
        }
    }

    /* renamed from: k0 */
    public final void m33820k0(float f, float f2) {
        if (this.f58034R == CropMode.FREE) {
            RectF rectF = this.f58064m;
            rectF.left += f;
            rectF.top += f2;
            if (m33826h0()) {
                this.f58064m.left -= this.f58037U - getFrameW();
            }
            if (m33842Z()) {
                this.f58064m.top -= this.f58037U - getFrameH();
            }
            m33863E();
            return;
        }
        float ratioY = (getRatioY() * f) / getRatioX();
        RectF rectF2 = this.f58064m;
        rectF2.left += f;
        rectF2.top += ratioY;
        if (m33826h0()) {
            float frameW = this.f58037U - getFrameW();
            this.f58064m.left -= frameW;
            this.f58064m.top -= (frameW * getRatioY()) / getRatioX();
        }
        if (m33842Z()) {
            float frameH = this.f58037U - getFrameH();
            this.f58064m.top -= frameH;
            this.f58064m.left -= (frameH * getRatioX()) / getRatioY();
        }
        if (!m33830f0(this.f58064m.left)) {
            float f3 = this.f58068o.left;
            RectF rectF3 = this.f58064m;
            float f4 = rectF3.left;
            float f5 = f3 - f4;
            rectF3.left = f4 + f5;
            this.f58064m.top += (f5 * getRatioY()) / getRatioX();
        }
        if (!m33828g0(this.f58064m.top)) {
            float f6 = this.f58068o.top;
            RectF rectF4 = this.f58064m;
            float f7 = rectF4.top;
            float f8 = f6 - f7;
            rectF4.top = f7 + f8;
            this.f58064m.left += (f8 * getRatioX()) / getRatioY();
        }
    }

    /* renamed from: l0 */
    public final void m33818l0(float f, float f2) {
        if (this.f58034R == CropMode.FREE) {
            RectF rectF = this.f58064m;
            rectF.right += f;
            rectF.bottom += f2;
            if (m33826h0()) {
                this.f58064m.right += this.f58037U - getFrameW();
            }
            if (m33842Z()) {
                this.f58064m.bottom += this.f58037U - getFrameH();
            }
            m33863E();
            return;
        }
        float ratioY = (getRatioY() * f) / getRatioX();
        RectF rectF2 = this.f58064m;
        rectF2.right += f;
        rectF2.bottom += ratioY;
        if (m33826h0()) {
            float frameW = this.f58037U - getFrameW();
            this.f58064m.right += frameW;
            this.f58064m.bottom += (frameW * getRatioY()) / getRatioX();
        }
        if (m33842Z()) {
            float frameH = this.f58037U - getFrameH();
            this.f58064m.bottom += frameH;
            this.f58064m.right += (frameH * getRatioX()) / getRatioY();
        }
        if (!m33830f0(this.f58064m.right)) {
            RectF rectF3 = this.f58064m;
            float f3 = rectF3.right;
            float f4 = f3 - this.f58068o.right;
            rectF3.right = f3 - f4;
            this.f58064m.bottom -= (f4 * getRatioY()) / getRatioX();
        }
        if (!m33828g0(this.f58064m.bottom)) {
            RectF rectF4 = this.f58064m;
            float f5 = rectF4.bottom;
            float f6 = f5 - this.f58068o.bottom;
            rectF4.bottom = f5 - f6;
            this.f58064m.right -= (f6 * getRatioX()) / getRatioY();
        }
    }

    public LoadRequest load(Uri uri) {
        return new LoadRequest(this, uri);
    }

    public Completable loadAsCompletable(Uri uri) {
        return loadAsCompletable(uri, false, null);
    }

    public void loadAsync(Uri uri, LoadCallback loadCallback) {
        loadAsync(uri, false, null, loadCallback);
    }

    /* renamed from: m0 */
    public final void m33816m0(float f, float f2) {
        if (this.f58034R == CropMode.FREE) {
            RectF rectF = this.f58064m;
            rectF.right += f;
            rectF.top += f2;
            if (m33826h0()) {
                this.f58064m.right += this.f58037U - getFrameW();
            }
            if (m33842Z()) {
                this.f58064m.top -= this.f58037U - getFrameH();
            }
            m33863E();
            return;
        }
        float ratioY = (getRatioY() * f) / getRatioX();
        RectF rectF2 = this.f58064m;
        rectF2.right += f;
        rectF2.top -= ratioY;
        if (m33826h0()) {
            float frameW = this.f58037U - getFrameW();
            this.f58064m.right += frameW;
            this.f58064m.top -= (frameW * getRatioY()) / getRatioX();
        }
        if (m33842Z()) {
            float frameH = this.f58037U - getFrameH();
            this.f58064m.top -= frameH;
            this.f58064m.right += (frameH * getRatioX()) / getRatioY();
        }
        if (!m33830f0(this.f58064m.right)) {
            RectF rectF3 = this.f58064m;
            float f3 = rectF3.right;
            float f4 = f3 - this.f58068o.right;
            rectF3.right = f3 - f4;
            this.f58064m.top += (f4 * getRatioY()) / getRatioX();
        }
        if (!m33828g0(this.f58064m.top)) {
            float f5 = this.f58068o.top;
            RectF rectF4 = this.f58064m;
            float f6 = rectF4.top;
            float f7 = f5 - f6;
            rectF4.top = f6 + f7;
            this.f58064m.right -= (f7 * getRatioX()) / getRatioY();
        }
    }

    /* renamed from: n0 */
    public final void m33814n0() {
        this.f58033Q = TouchArea.OUT_OF_BOUNDS;
        invalidate();
    }

    /* renamed from: o0 */
    public final void m33812o0(MotionEvent motionEvent) {
        invalidate();
        this.f58072q = motionEvent.getX();
        this.f58073r = motionEvent.getY();
        m33862F(motionEvent.getX(), motionEvent.getY());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        this.f58032P.shutdown();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawColor(this.f58055h0);
        if (this.f58052g) {
            m33796w0();
            Bitmap bitmap = getBitmap();
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, this.f58054h, this.f58060k);
                m33859I(canvas);
            }
            if (this.f58022F) {
                m33858J(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getDrawable() != null) {
            m33792y0(this.f58040a, this.f58042b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        this.f58040a = (size - getPaddingLeft()) - getPaddingRight();
        this.f58042b = (size2 - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f58034R = savedState.f58094a;
        this.f58055h0 = savedState.f58095b;
        this.f58057i0 = savedState.f58096c;
        this.f58059j0 = savedState.f58097d;
        this.f58035S = savedState.f58098e;
        this.f58036T = savedState.f58099f;
        this.f58041a0 = savedState.f58100g;
        this.f58043b0 = savedState.f58101h;
        this.f58038V = savedState.f58102i;
        this.f58039W = savedState.f58103j;
        this.f58037U = savedState.f58104k;
        this.f58049e0 = new PointF(savedState.f58105l, savedState.f58106m);
        this.f58051f0 = savedState.f58107n;
        this.f58053g0 = savedState.f58108o;
        this.f58045c0 = savedState.f58109p;
        this.f58061k0 = savedState.f58110q;
        this.f58063l0 = savedState.f58111r;
        this.f58065m0 = savedState.f58112s;
        this.f58046d = savedState.f58113t;
        this.f58067n0 = savedState.f58114u;
        this.f58069o0 = savedState.f58115v;
        this.f58017A = savedState.f58116w;
        this.f58080y = savedState.f58117x;
        this.f58081z = savedState.f58118y;
        this.f58023G = savedState.f58119z;
        this.f58024H = savedState.f58083A;
        this.f58022F = savedState.f58084B;
        this.f58018B = savedState.f58085C;
        this.f58019C = savedState.f58086D;
        this.f58020D = savedState.f58087E;
        this.f58021E = savedState.f58088F;
        this.f58071p0 = savedState.f58089G;
        this.f58025I = savedState.f58090H;
        this.f58026J = savedState.f58091I;
        this.f58027K = savedState.f58092J;
        this.f58028L = savedState.f58093K;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f58094a = this.f58034R;
        savedState.f58095b = this.f58055h0;
        savedState.f58096c = this.f58057i0;
        savedState.f58097d = this.f58059j0;
        savedState.f58098e = this.f58035S;
        savedState.f58099f = this.f58036T;
        savedState.f58100g = this.f58041a0;
        savedState.f58101h = this.f58043b0;
        savedState.f58102i = this.f58038V;
        savedState.f58103j = this.f58039W;
        savedState.f58104k = this.f58037U;
        PointF pointF = this.f58049e0;
        savedState.f58105l = pointF.x;
        savedState.f58106m = pointF.y;
        savedState.f58107n = this.f58051f0;
        savedState.f58108o = this.f58053g0;
        savedState.f58109p = this.f58045c0;
        savedState.f58110q = this.f58061k0;
        savedState.f58111r = this.f58063l0;
        savedState.f58112s = this.f58065m0;
        savedState.f58113t = this.f58046d;
        savedState.f58114u = this.f58067n0;
        savedState.f58115v = this.f58069o0;
        savedState.f58116w = this.f58017A;
        savedState.f58117x = this.f58080y;
        savedState.f58118y = this.f58081z;
        savedState.f58119z = this.f58023G;
        savedState.f58083A = this.f58024H;
        savedState.f58084B = this.f58022F;
        savedState.f58085C = this.f58018B;
        savedState.f58086D = this.f58019C;
        savedState.f58087E = this.f58020D;
        savedState.f58088F = this.f58021E;
        savedState.f58089G = this.f58071p0;
        savedState.f58090H = this.f58025I;
        savedState.f58091I = this.f58026J;
        savedState.f58092J = this.f58027K;
        savedState.f58093K = this.f58028L;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f58052g || !this.f58045c0 || !this.f58047d0 || this.f58074s || this.f58075t || this.f58029M.get() || this.f58030N.get()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                    m33814n0();
                    return true;
                }
                m33810p0(motionEvent);
                if (this.f58033Q != TouchArea.OUT_OF_BOUNDS) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            m33808q0(motionEvent);
            return true;
        }
        m33812o0(motionEvent);
        return true;
    }

    /* renamed from: p0 */
    public final void m33810p0(MotionEvent motionEvent) {
        float x = motionEvent.getX() - this.f58072q;
        float y = motionEvent.getY() - this.f58073r;
        int i = C9048i.f58140a[this.f58033Q.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            m33818l0(x, y);
                        }
                    } else {
                        m33822j0(x, y);
                    }
                } else {
                    m33816m0(x, y);
                }
            } else {
                m33820k0(x, y);
            }
        } else {
            m33824i0(x, y);
        }
        invalidate();
        this.f58072q = motionEvent.getX();
        this.f58073r = motionEvent.getY();
    }

    /* renamed from: q0 */
    public final void m33808q0(MotionEvent motionEvent) {
        ShowMode showMode = this.f58035S;
        ShowMode showMode2 = ShowMode.SHOW_ON_TOUCH;
        if (showMode == showMode2) {
            this.f58041a0 = false;
        }
        if (this.f58036T == showMode2) {
            this.f58043b0 = false;
        }
        this.f58033Q = TouchArea.OUT_OF_BOUNDS;
        invalidate();
    }

    /* renamed from: r0 */
    public final void m33806r0(Callback callback, Throwable th2) {
        if (callback == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            callback.onError(th2);
        } else {
            this.f58079x.post(new RunnableC9050k(callback, th2));
        }
    }

    public void rotateImage(RotateDegrees rotateDegrees, int i) {
        if (this.f58074s) {
            getAnimator().cancelAnimation();
        }
        float f = this.f58046d;
        float value = f + rotateDegrees.getValue();
        float f2 = value - f;
        float f3 = this.f58044c;
        float m33865C = m33865C(this.f58040a, this.f58042b, value);
        if (this.f58067n0) {
            SimpleValueAnimator animator = getAnimator();
            animator.addAnimatorListener(new C9058q(f, f2, f3, m33865C - f3, value, m33865C));
            animator.startAnimation(i);
            return;
        }
        this.f58046d = value % 360.0f;
        this.f58044c = m33865C;
        m33792y0(this.f58040a, this.f58042b);
    }

    /* renamed from: s0 */
    public final void m33804s0(int i) {
        if (this.f58068o == null) {
            return;
        }
        if (this.f58075t) {
            getAnimator().cancelAnimation();
        }
        RectF rectF = new RectF(this.f58064m);
        RectF m33868A = m33868A(this.f58068o);
        float f = m33868A.left - rectF.left;
        float f2 = m33868A.top - rectF.top;
        float f3 = m33868A.right - rectF.right;
        float f4 = m33868A.bottom - rectF.bottom;
        if (this.f58067n0) {
            SimpleValueAnimator animator = getAnimator();
            animator.addAnimatorListener(new C9049j(rectF, f, f2, f3, f4, m33868A));
            animator.startAnimation(i);
            return;
        }
        this.f58064m = m33868A(this.f58068o);
        invalidate();
    }

    public SaveRequest save(Bitmap bitmap) {
        return new SaveRequest(this, bitmap);
    }

    public Single<Uri> saveAsSingle(Bitmap bitmap, Uri uri) {
        return Single.fromCallable(new CallableC9047h(bitmap, uri)).doOnSubscribe(new C9046g()).doFinally(new C9045f());
    }

    public void saveAsync(Uri uri, Bitmap bitmap, SaveCallback saveCallback) {
        this.f58032P.submit(new RunnableC9043e(bitmap, uri, saveCallback));
    }

    public void setAnimationDuration(int i) {
        this.f58069o0 = i;
    }

    public void setAnimationEnabled(boolean z) {
        this.f58067n0 = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f58055h0 = i;
        invalidate();
    }

    public void setCompressFormat(Bitmap.CompressFormat compressFormat) {
        this.f58023G = compressFormat;
    }

    public void setCompressQuality(int i) {
        this.f58024H = i;
    }

    public void setCropEnabled(boolean z) {
        this.f58045c0 = z;
        invalidate();
    }

    public void setCropMode(CropMode cropMode, int i) {
        if (cropMode == CropMode.CUSTOM) {
            setCustomRatio(1, 1);
            return;
        }
        this.f58034R = cropMode;
        m33804s0(i);
    }

    public void setCustomRatio(int i, int i2, int i3) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.f58034R = CropMode.CUSTOM;
        this.f58049e0 = new PointF(i, i2);
        m33804s0(i3);
    }

    public void setDebug(boolean z) {
        this.f58022F = z;
        Logger.enabled = true;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f58047d0 = z;
    }

    public void setFrameColor(int i) {
        this.f58059j0 = i;
        invalidate();
    }

    public void setFrameStrokeWeightInDp(int i) {
        this.f58051f0 = i * getDensity();
        invalidate();
    }

    public void setGuideColor(int i) {
        this.f58063l0 = i;
        invalidate();
    }

    public void setGuideShowMode(ShowMode showMode) {
        this.f58035S = showMode;
        int i = C9048i.f58142c[showMode.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                this.f58041a0 = false;
            }
        } else {
            this.f58041a0 = true;
        }
        invalidate();
    }

    public void setGuideStrokeWeightInDp(int i) {
        this.f58053g0 = i * getDensity();
        invalidate();
    }

    public void setHandleColor(int i) {
        this.f58061k0 = i;
        invalidate();
    }

    public void setHandleShadowEnabled(boolean z) {
        this.f58071p0 = z;
    }

    public void setHandleShowMode(ShowMode showMode) {
        this.f58036T = showMode;
        int i = C9048i.f58142c[showMode.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                this.f58043b0 = false;
            }
        } else {
            this.f58043b0 = true;
        }
        invalidate();
    }

    public void setHandleSizeInDp(int i) {
        this.f58038V = (int) (i * getDensity());
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f58052g = false;
        m33802t0();
        setImageDrawableInternal(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f58052g = false;
        m33802t0();
        super.setImageResource(i);
        m33867A0();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        this.f58052g = false;
        super.setImageURI(uri);
        m33867A0();
    }

    public void setInitialFrameScale(float f) {
        this.f58065m0 = m33861G(f, 0.01f, 1.0f, 1.0f);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f58078w = interpolator;
        this.f58076u = null;
        m33794x0();
    }

    public void setLoggingEnabled(boolean z) {
        Logger.enabled = z;
    }

    public void setMinFrameSizeInDp(int i) {
        this.f58037U = i * getDensity();
    }

    public void setMinFrameSizeInPx(int i) {
        this.f58037U = i;
    }

    public void setOutputHeight(int i) {
        this.f58021E = i;
        this.f58020D = 0;
    }

    public void setOutputMaxSize(int i, int i2) {
        this.f58018B = i;
        this.f58019C = i2;
    }

    public void setOutputWidth(int i) {
        this.f58020D = i;
        this.f58021E = 0;
    }

    public void setOverlayColor(int i) {
        this.f58057i0 = i;
        invalidate();
    }

    public void setTouchPaddingInDp(int i) {
        this.f58039W = (int) (i * getDensity());
    }

    public void startCrop(Uri uri, CropCallback cropCallback, SaveCallback saveCallback) {
        this.f58032P.submit(new RunnableC9059r(cropCallback, uri, saveCallback));
    }

    public void startLoad(Uri uri, LoadCallback loadCallback) {
        loadAsync(uri, loadCallback);
    }

    /* renamed from: t0 */
    public final void m33802t0() {
        if (this.f58029M.get()) {
            return;
        }
        this.f58080y = null;
        this.f58081z = null;
        this.f58025I = 0;
        this.f58026J = 0;
        this.f58027K = 0;
        this.f58028L = 0;
        this.f58046d = this.f58017A;
    }

    /* renamed from: u0 */
    public final Uri m33800u0(Bitmap bitmap, Uri uri) {
        this.f58081z = uri;
        if (uri != null) {
            OutputStream outputStream = null;
            try {
                outputStream = getContext().getContentResolver().openOutputStream(uri);
                bitmap.compress(this.f58023G, this.f58024H, outputStream);
                Utils.copyExifInfo(getContext(), this.f58080y, uri, bitmap.getWidth(), bitmap.getHeight());
                Utils.updateGalleryInfo(getContext(), uri);
                return uri;
            } finally {
                Utils.closeQuietly(outputStream);
            }
        }
        throw new IllegalStateException("Save uri must not be null.");
    }

    /* renamed from: v0 */
    public final Bitmap m33798v0(Bitmap bitmap) {
        int i;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float m33851Q = m33851Q(this.f58064m.width()) / m33850R(this.f58064m.height());
        int i3 = this.f58020D;
        if (i3 > 0) {
            i = Math.round(i3 / m33851Q);
        } else {
            int i4 = this.f58021E;
            if (i4 > 0) {
                i3 = Math.round(i4 * m33851Q);
                i = i4;
            } else {
                i3 = this.f58018B;
                if (i3 > 0 && (i2 = this.f58019C) > 0 && (width > i3 || height > i2)) {
                    if (i3 / i2 >= m33851Q) {
                        i3 = Math.round(i2 * m33851Q);
                        i = i2;
                    } else {
                        i = Math.round(i3 / m33851Q);
                    }
                } else {
                    i3 = 0;
                    i = 0;
                }
            }
        }
        if (i3 > 0 && i > 0) {
            Bitmap scaledBitmap = Utils.getScaledBitmap(bitmap, i3, i);
            if (bitmap != getBitmap() && bitmap != scaledBitmap) {
                bitmap.recycle();
            }
            return scaledBitmap;
        }
        return bitmap;
    }

    /* renamed from: w0 */
    public final void m33796w0() {
        this.f58054h.reset();
        Matrix matrix = this.f58054h;
        PointF pointF = this.f58070p;
        matrix.setTranslate(pointF.x - (this.f58048e * 0.5f), pointF.y - (this.f58050f * 0.5f));
        Matrix matrix2 = this.f58054h;
        float f = this.f58044c;
        PointF pointF2 = this.f58070p;
        matrix2.postScale(f, f, pointF2.x, pointF2.y);
        Matrix matrix3 = this.f58054h;
        float f2 = this.f58046d;
        PointF pointF3 = this.f58070p;
        matrix3.postRotate(f2, pointF3.x, pointF3.y);
    }

    /* renamed from: x */
    public final RectF m33795x(RectF rectF) {
        RectF rectF2 = new RectF();
        float f = rectF.left;
        float f2 = this.f58044c;
        rectF2.set(f * f2, rectF.top * f2, rectF.right * f2, rectF.bottom * f2);
        RectF rectF3 = this.f58068o;
        rectF2.offset(rectF3.left, rectF3.top);
        rectF2.set(Math.max(this.f58068o.left, rectF2.left), Math.max(this.f58068o.top, rectF2.top), Math.min(this.f58068o.right, rectF2.right), Math.min(this.f58068o.bottom, rectF2.bottom));
        return rectF2;
    }

    /* renamed from: x0 */
    public final void m33794x0() {
        if (this.f58076u == null) {
            this.f58076u = new ValueAnimatorV14(this.f58078w);
        }
    }

    /* renamed from: y */
    public final void m33793y(Uri uri) {
        Bitmap m33844X = m33844X(uri);
        if (m33844X == null) {
            return;
        }
        this.f58079x.post(new RunnableC9057p(m33844X));
    }

    /* renamed from: y0 */
    public final void m33792y0(int i, int i2) {
        if (i != 0 && i2 != 0) {
            setCenter(new PointF(getPaddingLeft() + (i * 0.5f), getPaddingTop() + (i2 * 0.5f)));
            setScale(m33865C(i, i2, this.f58046d));
            m33796w0();
            RectF m33866B = m33866B(new RectF(0.0f, 0.0f, this.f58048e, this.f58050f), this.f58054h);
            this.f58068o = m33866B;
            RectF rectF = this.f58066n;
            if (rectF != null) {
                this.f58064m = m33795x(rectF);
            } else {
                this.f58064m = m33868A(m33866B);
            }
            this.f58052g = true;
            invalidate();
        }
    }

    /* renamed from: z */
    public final Rect m33791z(int i, int i2) {
        float f = i;
        float f2 = i2;
        float m33845W = m33845W(this.f58046d, f, f2) / this.f58068o.width();
        RectF rectF = this.f58068o;
        float f3 = rectF.left * m33845W;
        float f4 = rectF.top * m33845W;
        return new Rect(Math.max(Math.round((this.f58064m.left * m33845W) - f3), 0), Math.max(Math.round((this.f58064m.top * m33845W) - f4), 0), Math.min(Math.round((this.f58064m.right * m33845W) - f3), Math.round(m33845W(this.f58046d, f, f2))), Math.min(Math.round((this.f58064m.bottom * m33845W) - f4), Math.round(m33847U(this.f58046d, f, f2))));
    }

    /* renamed from: z0 */
    public final float m33790z0(float f) {
        return f * f;
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void cropAsync(CropCallback cropCallback) {
        cropAsync(null, cropCallback);
    }

    public Completable loadAsCompletable(Uri uri, boolean z, RectF rectF) {
        return Completable.create(new C9055o(rectF, uri, z)).doOnSubscribe(new C9054n()).doFinally(new C9053m());
    }

    public void loadAsync(Uri uri, boolean z, RectF rectF, LoadCallback loadCallback) {
        this.f58032P.submit(new RunnableC9051l(uri, rectF, z, loadCallback));
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58040a = 0;
        this.f58042b = 0;
        this.f58044c = 1.0f;
        this.f58046d = 0.0f;
        this.f58048e = 0.0f;
        this.f58050f = 0.0f;
        this.f58052g = false;
        this.f58054h = null;
        this.f58070p = new PointF();
        this.f58074s = false;
        this.f58075t = false;
        this.f58076u = null;
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        this.f58077v = decelerateInterpolator;
        this.f58078w = decelerateInterpolator;
        this.f58079x = new Handler(Looper.getMainLooper());
        this.f58080y = null;
        this.f58081z = null;
        this.f58017A = 0;
        this.f58020D = 0;
        this.f58021E = 0;
        this.f58022F = false;
        this.f58023G = Bitmap.CompressFormat.PNG;
        this.f58024H = 100;
        this.f58025I = 0;
        this.f58026J = 0;
        this.f58027K = 0;
        this.f58028L = 0;
        this.f58029M = new AtomicBoolean(false);
        this.f58030N = new AtomicBoolean(false);
        this.f58031O = new AtomicBoolean(false);
        this.f58033Q = TouchArea.OUT_OF_BOUNDS;
        this.f58034R = CropMode.SQUARE;
        ShowMode showMode = ShowMode.SHOW_ALWAYS;
        this.f58035S = showMode;
        this.f58036T = showMode;
        this.f58039W = 0;
        this.f58041a0 = true;
        this.f58043b0 = true;
        this.f58045c0 = true;
        this.f58047d0 = true;
        this.f58049e0 = new PointF(1.0f, 1.0f);
        this.f58051f0 = 2.0f;
        this.f58053g0 = 2.0f;
        this.f58067n0 = true;
        this.f58069o0 = 100;
        this.f58071p0 = true;
        this.f58032P = Executors.newSingleThreadExecutor();
        float density = getDensity();
        this.f58038V = (int) (14.0f * density);
        this.f58037U = 50.0f * density;
        float f = density * 1.0f;
        this.f58051f0 = f;
        this.f58053g0 = f;
        this.f58058j = new Paint();
        this.f58056i = new Paint();
        Paint paint = new Paint();
        this.f58060k = paint;
        paint.setFilterBitmap(true);
        Paint paint2 = new Paint();
        this.f58062l = paint2;
        paint2.setAntiAlias(true);
        this.f58062l.setStyle(Paint.Style.STROKE);
        this.f58062l.setColor(-1);
        this.f58062l.setTextSize(15.0f * density);
        this.f58054h = new Matrix();
        this.f58044c = 1.0f;
        this.f58055h0 = 0;
        this.f58059j0 = -1;
        this.f58057i0 = -1157627904;
        this.f58061k0 = -1;
        this.f58063l0 = -1140850689;
        m33843Y(context, attributeSet, i, density);
    }

    public Single<Bitmap> cropAsSingle() {
        return cropAsSingle(null);
    }

    public void setCustomRatio(int i, int i2) {
        setCustomRatio(i, i2, this.f58069o0);
    }

    public void setCropMode(CropMode cropMode) {
        setCropMode(cropMode, this.f58069o0);
    }

    public void rotateImage(RotateDegrees rotateDegrees) {
        rotateImage(rotateDegrees, this.f58069o0);
    }
}
