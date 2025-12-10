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
    public int f58029A;

    /* renamed from: B */
    public int f58030B;

    /* renamed from: C */
    public int f58031C;

    /* renamed from: D */
    public int f58032D;

    /* renamed from: E */
    public int f58033E;

    /* renamed from: F */
    public boolean f58034F;

    /* renamed from: G */
    public Bitmap.CompressFormat f58035G;

    /* renamed from: H */
    public int f58036H;

    /* renamed from: I */
    public int f58037I;

    /* renamed from: J */
    public int f58038J;

    /* renamed from: K */
    public int f58039K;

    /* renamed from: L */
    public int f58040L;

    /* renamed from: M */
    public AtomicBoolean f58041M;

    /* renamed from: N */
    public AtomicBoolean f58042N;

    /* renamed from: O */
    public AtomicBoolean f58043O;

    /* renamed from: P */
    public ExecutorService f58044P;

    /* renamed from: Q */
    public TouchArea f58045Q;

    /* renamed from: R */
    public CropMode f58046R;

    /* renamed from: S */
    public ShowMode f58047S;

    /* renamed from: T */
    public ShowMode f58048T;

    /* renamed from: U */
    public float f58049U;

    /* renamed from: V */
    public int f58050V;

    /* renamed from: W */
    public int f58051W;

    /* renamed from: a */
    public int f58052a;

    /* renamed from: a0 */
    public boolean f58053a0;

    /* renamed from: b */
    public int f58054b;

    /* renamed from: b0 */
    public boolean f58055b0;

    /* renamed from: c */
    public float f58056c;

    /* renamed from: c0 */
    public boolean f58057c0;

    /* renamed from: d */
    public float f58058d;

    /* renamed from: d0 */
    public boolean f58059d0;

    /* renamed from: e */
    public float f58060e;

    /* renamed from: e0 */
    public PointF f58061e0;

    /* renamed from: f */
    public float f58062f;

    /* renamed from: f0 */
    public float f58063f0;

    /* renamed from: g */
    public boolean f58064g;

    /* renamed from: g0 */
    public float f58065g0;

    /* renamed from: h */
    public Matrix f58066h;

    /* renamed from: h0 */
    public int f58067h0;

    /* renamed from: i */
    public Paint f58068i;

    /* renamed from: i0 */
    public int f58069i0;

    /* renamed from: j */
    public Paint f58070j;

    /* renamed from: j0 */
    public int f58071j0;

    /* renamed from: k */
    public Paint f58072k;

    /* renamed from: k0 */
    public int f58073k0;

    /* renamed from: l */
    public Paint f58074l;

    /* renamed from: l0 */
    public int f58075l0;

    /* renamed from: m */
    public RectF f58076m;

    /* renamed from: m0 */
    public float f58077m0;

    /* renamed from: n */
    public RectF f58078n;

    /* renamed from: n0 */
    public boolean f58079n0;

    /* renamed from: o */
    public RectF f58080o;

    /* renamed from: o0 */
    public int f58081o0;

    /* renamed from: p */
    public PointF f58082p;

    /* renamed from: p0 */
    public boolean f58083p0;

    /* renamed from: q */
    public float f58084q;

    /* renamed from: r */
    public float f58085r;

    /* renamed from: s */
    public boolean f58086s;

    /* renamed from: t */
    public boolean f58087t;

    /* renamed from: u */
    public SimpleValueAnimator f58088u;

    /* renamed from: v */
    public final Interpolator f58089v;

    /* renamed from: w */
    public Interpolator f58090w;

    /* renamed from: x */
    public Handler f58091x;

    /* renamed from: y */
    public Uri f58092y;

    /* renamed from: z */
    public Uri f58093z;

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
        private final int f58094ID;

        CropMode(int i) {
            this.f58094ID = i;
        }

        public int getId() {
            return this.f58094ID;
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
        public static final Parcelable.Creator CREATOR = new C9026a();

        /* renamed from: A */
        public int f58095A;

        /* renamed from: B */
        public boolean f58096B;

        /* renamed from: C */
        public int f58097C;

        /* renamed from: D */
        public int f58098D;

        /* renamed from: E */
        public int f58099E;

        /* renamed from: F */
        public int f58100F;

        /* renamed from: G */
        public boolean f58101G;

        /* renamed from: H */
        public int f58102H;

        /* renamed from: I */
        public int f58103I;

        /* renamed from: J */
        public int f58104J;

        /* renamed from: K */
        public int f58105K;

        /* renamed from: a */
        public CropMode f58106a;

        /* renamed from: b */
        public int f58107b;

        /* renamed from: c */
        public int f58108c;

        /* renamed from: d */
        public int f58109d;

        /* renamed from: e */
        public ShowMode f58110e;

        /* renamed from: f */
        public ShowMode f58111f;

        /* renamed from: g */
        public boolean f58112g;

        /* renamed from: h */
        public boolean f58113h;

        /* renamed from: i */
        public int f58114i;

        /* renamed from: j */
        public int f58115j;

        /* renamed from: k */
        public float f58116k;

        /* renamed from: l */
        public float f58117l;

        /* renamed from: m */
        public float f58118m;

        /* renamed from: n */
        public float f58119n;

        /* renamed from: o */
        public float f58120o;

        /* renamed from: p */
        public boolean f58121p;

        /* renamed from: q */
        public int f58122q;

        /* renamed from: r */
        public int f58123r;

        /* renamed from: s */
        public float f58124s;

        /* renamed from: t */
        public float f58125t;

        /* renamed from: u */
        public boolean f58126u;

        /* renamed from: v */
        public int f58127v;

        /* renamed from: w */
        public int f58128w;

        /* renamed from: x */
        public Uri f58129x;

        /* renamed from: y */
        public Uri f58130y;

        /* renamed from: z */
        public Bitmap.CompressFormat f58131z;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$SavedState$a */
        /* loaded from: classes5.dex */
        public static class C9026a implements Parcelable.Creator {
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

        public /* synthetic */ SavedState(Parcel parcel, C9038j c9038j) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeSerializable(this.f58106a);
            parcel.writeInt(this.f58107b);
            parcel.writeInt(this.f58108c);
            parcel.writeInt(this.f58109d);
            parcel.writeSerializable(this.f58110e);
            parcel.writeSerializable(this.f58111f);
            parcel.writeInt(this.f58112g ? 1 : 0);
            parcel.writeInt(this.f58113h ? 1 : 0);
            parcel.writeInt(this.f58114i);
            parcel.writeInt(this.f58115j);
            parcel.writeFloat(this.f58116k);
            parcel.writeFloat(this.f58117l);
            parcel.writeFloat(this.f58118m);
            parcel.writeFloat(this.f58119n);
            parcel.writeFloat(this.f58120o);
            parcel.writeInt(this.f58121p ? 1 : 0);
            parcel.writeInt(this.f58122q);
            parcel.writeInt(this.f58123r);
            parcel.writeFloat(this.f58124s);
            parcel.writeFloat(this.f58125t);
            parcel.writeInt(this.f58126u ? 1 : 0);
            parcel.writeInt(this.f58127v);
            parcel.writeInt(this.f58128w);
            parcel.writeParcelable(this.f58129x, i);
            parcel.writeParcelable(this.f58130y, i);
            parcel.writeSerializable(this.f58131z);
            parcel.writeInt(this.f58095A);
            parcel.writeInt(this.f58096B ? 1 : 0);
            parcel.writeInt(this.f58097C);
            parcel.writeInt(this.f58098D);
            parcel.writeInt(this.f58099E);
            parcel.writeInt(this.f58100F);
            parcel.writeInt(this.f58101G ? 1 : 0);
            parcel.writeInt(this.f58102H);
            parcel.writeInt(this.f58103I);
            parcel.writeInt(this.f58104J);
            parcel.writeInt(this.f58105K);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f58106a = (CropMode) parcel.readSerializable();
            this.f58107b = parcel.readInt();
            this.f58108c = parcel.readInt();
            this.f58109d = parcel.readInt();
            this.f58110e = (ShowMode) parcel.readSerializable();
            this.f58111f = (ShowMode) parcel.readSerializable();
            this.f58112g = parcel.readInt() != 0;
            this.f58113h = parcel.readInt() != 0;
            this.f58114i = parcel.readInt();
            this.f58115j = parcel.readInt();
            this.f58116k = parcel.readFloat();
            this.f58117l = parcel.readFloat();
            this.f58118m = parcel.readFloat();
            this.f58119n = parcel.readFloat();
            this.f58120o = parcel.readFloat();
            this.f58121p = parcel.readInt() != 0;
            this.f58122q = parcel.readInt();
            this.f58123r = parcel.readInt();
            this.f58124s = parcel.readFloat();
            this.f58125t = parcel.readFloat();
            this.f58126u = parcel.readInt() != 0;
            this.f58127v = parcel.readInt();
            this.f58128w = parcel.readInt();
            this.f58129x = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
            this.f58130y = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
            this.f58131z = (Bitmap.CompressFormat) parcel.readSerializable();
            this.f58095A = parcel.readInt();
            this.f58096B = parcel.readInt() != 0;
            this.f58097C = parcel.readInt();
            this.f58098D = parcel.readInt();
            this.f58099E = parcel.readInt();
            this.f58100F = parcel.readInt();
            this.f58101G = parcel.readInt() != 0;
            this.f58102H = parcel.readInt();
            this.f58103I = parcel.readInt();
            this.f58104J = parcel.readInt();
            this.f58105K = parcel.readInt();
        }
    }

    /* loaded from: classes5.dex */
    public enum ShowMode {
        SHOW_ALWAYS(1),
        SHOW_ON_TOUCH(2),
        NOT_SHOW(3);
        

        /* renamed from: ID */
        private final int f58132ID;

        ShowMode(int i) {
            this.f58132ID = i;
        }

        public int getId() {
            return this.f58132ID;
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
    public class RunnableC9027a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Uri f58133a;

        /* renamed from: b */
        public final /* synthetic */ CropCallback f58134b;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$a$a */
        /* loaded from: classes5.dex */
        public class RunnableC9028a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f58136a;

            public RunnableC9028a(Bitmap bitmap) {
                this.f58136a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                CropCallback cropCallback = RunnableC9027a.this.f58134b;
                if (cropCallback != null) {
                    cropCallback.onSuccess(this.f58136a);
                }
                if (CropImageView.this.f58034F) {
                    CropImageView.this.invalidate();
                }
            }
        }

        public RunnableC9027a(Uri uri, CropCallback cropCallback) {
            this.f58133a = uri;
            this.f58134b = cropCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    CropImageView.this.f58042N.set(true);
                    Uri uri = this.f58133a;
                    if (uri != null) {
                        CropImageView.this.f58092y = uri;
                    }
                    CropImageView.this.f58091x.post(new RunnableC9028a(CropImageView.this.m33852H()));
                } catch (Exception e) {
                    CropImageView.this.m33798r0(this.f58134b, e);
                }
                CropImageView.this.f58042N.set(false);
            } catch (Throwable th2) {
                CropImageView.this.f58042N.set(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$b */
    /* loaded from: classes5.dex */
    public class C9029b implements Action {
        public C9029b() {
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            CropImageView.this.f58042N.set(false);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$c */
    /* loaded from: classes5.dex */
    public class C9030c implements Consumer {
        public C9030c() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Disposable disposable) {
            CropImageView.this.f58042N.set(true);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$d */
    /* loaded from: classes5.dex */
    public class CallableC9031d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Uri f58140a;

        public CallableC9031d(Uri uri) {
            this.f58140a = uri;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Bitmap call() {
            Uri uri = this.f58140a;
            if (uri != null) {
                CropImageView.this.f58092y = uri;
            }
            return CropImageView.this.m33852H();
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$e */
    /* loaded from: classes5.dex */
    public class RunnableC9032e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f58142a;

        /* renamed from: b */
        public final /* synthetic */ Uri f58143b;

        /* renamed from: c */
        public final /* synthetic */ SaveCallback f58144c;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$e$a */
        /* loaded from: classes5.dex */
        public class RunnableC9033a implements Runnable {
            public RunnableC9033a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC9032e runnableC9032e = RunnableC9032e.this;
                SaveCallback saveCallback = runnableC9032e.f58144c;
                if (saveCallback != null) {
                    saveCallback.onSuccess(runnableC9032e.f58143b);
                }
            }
        }

        public RunnableC9032e(Bitmap bitmap, Uri uri, SaveCallback saveCallback) {
            this.f58142a = bitmap;
            this.f58143b = uri;
            this.f58144c = saveCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    CropImageView.this.f58043O.set(true);
                    CropImageView.this.m33792u0(this.f58142a, this.f58143b);
                    CropImageView.this.f58091x.post(new RunnableC9033a());
                } catch (Exception e) {
                    CropImageView.this.m33798r0(this.f58144c, e);
                }
            } finally {
                CropImageView.this.f58043O.set(false);
            }
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$f */
    /* loaded from: classes5.dex */
    public class C9034f implements Action {
        public C9034f() {
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            CropImageView.this.f58043O.set(false);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$g */
    /* loaded from: classes5.dex */
    public class C9035g implements Consumer {
        public C9035g() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Disposable disposable) {
            CropImageView.this.f58043O.set(true);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$h */
    /* loaded from: classes5.dex */
    public class CallableC9036h implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f58149a;

        /* renamed from: b */
        public final /* synthetic */ Uri f58150b;

        public CallableC9036h(Bitmap bitmap, Uri uri) {
            this.f58149a = bitmap;
            this.f58150b = uri;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Uri call() {
            return CropImageView.this.m33792u0(this.f58149a, this.f58150b);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$i */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9037i {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58152a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f58153b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f58154c;

        static {
            int[] iArr = new int[ShowMode.values().length];
            f58154c = iArr;
            try {
                iArr[ShowMode.SHOW_ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58154c[ShowMode.NOT_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58154c[ShowMode.SHOW_ON_TOUCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CropMode.values().length];
            f58153b = iArr2;
            try {
                iArr2[CropMode.FIT_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58153b[CropMode.FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58153b[CropMode.RATIO_4_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58153b[CropMode.RATIO_3_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f58153b[CropMode.RATIO_16_9.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f58153b[CropMode.RATIO_9_16.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f58153b[CropMode.SQUARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f58153b[CropMode.CIRCLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f58153b[CropMode.CIRCLE_SQUARE.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f58153b[CropMode.CUSTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[TouchArea.values().length];
            f58152a = iArr3;
            try {
                iArr3[TouchArea.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f58152a[TouchArea.LEFT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f58152a[TouchArea.RIGHT_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f58152a[TouchArea.LEFT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f58152a[TouchArea.RIGHT_BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f58152a[TouchArea.OUT_OF_BOUNDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$j */
    /* loaded from: classes5.dex */
    public class C9038j implements SimpleValueAnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ RectF f58155a;

        /* renamed from: b */
        public final /* synthetic */ float f58156b;

        /* renamed from: c */
        public final /* synthetic */ float f58157c;

        /* renamed from: d */
        public final /* synthetic */ float f58158d;

        /* renamed from: e */
        public final /* synthetic */ float f58159e;

        /* renamed from: f */
        public final /* synthetic */ RectF f58160f;

        public C9038j(RectF rectF, float f, float f2, float f3, float f4, RectF rectF2) {
            this.f58155a = rectF;
            this.f58156b = f;
            this.f58157c = f2;
            this.f58158d = f3;
            this.f58159e = f4;
            this.f58160f = rectF2;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationFinished() {
            CropImageView.this.f58076m = this.f58160f;
            CropImageView.this.invalidate();
            CropImageView.this.f58087t = false;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationStarted() {
            CropImageView.this.f58087t = true;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationUpdated(float f) {
            CropImageView cropImageView = CropImageView.this;
            RectF rectF = this.f58155a;
            cropImageView.f58076m = new RectF(rectF.left + (this.f58156b * f), rectF.top + (this.f58157c * f), rectF.right + (this.f58158d * f), rectF.bottom + (this.f58159e * f));
            CropImageView.this.invalidate();
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$k */
    /* loaded from: classes5.dex */
    public class RunnableC9039k implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Callback f58162a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f58163b;

        public RunnableC9039k(Callback callback, Throwable th2) {
            this.f58162a = callback;
            this.f58163b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58162a.onError(this.f58163b);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$l */
    /* loaded from: classes5.dex */
    public class RunnableC9040l implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Uri f58165a;

        /* renamed from: b */
        public final /* synthetic */ RectF f58166b;

        /* renamed from: c */
        public final /* synthetic */ boolean f58167c;

        /* renamed from: d */
        public final /* synthetic */ LoadCallback f58168d;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$l$a */
        /* loaded from: classes5.dex */
        public class RunnableC9041a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f58170a;

            public RunnableC9041a(Bitmap bitmap) {
                this.f58170a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                CropImageView cropImageView = CropImageView.this;
                cropImageView.f58058d = cropImageView.f58029A;
                CropImageView.this.setImageDrawableInternal(new BitmapDrawable(CropImageView.this.getResources(), this.f58170a));
                LoadCallback loadCallback = RunnableC9040l.this.f58168d;
                if (loadCallback != null) {
                    loadCallback.onSuccess();
                }
            }
        }

        public RunnableC9040l(Uri uri, RectF rectF, boolean z, LoadCallback loadCallback) {
            this.f58165a = uri;
            this.f58166b = rectF;
            this.f58167c = z;
            this.f58168d = loadCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    CropImageView.this.f58041M.set(true);
                    CropImageView.this.f58092y = this.f58165a;
                    CropImageView.this.f58078n = this.f58166b;
                    if (this.f58167c) {
                        CropImageView.this.m33785y(this.f58165a);
                    }
                    CropImageView.this.f58091x.post(new RunnableC9041a(CropImageView.this.m33844P(this.f58165a)));
                } catch (Exception e) {
                    CropImageView.this.m33798r0(this.f58168d, e);
                }
                CropImageView.this.f58041M.set(false);
            } catch (Throwable th2) {
                CropImageView.this.f58041M.set(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$m */
    /* loaded from: classes5.dex */
    public class C9042m implements Action {
        public C9042m() {
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            CropImageView.this.f58041M.set(false);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$n */
    /* loaded from: classes5.dex */
    public class C9043n implements Consumer {
        public C9043n() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Disposable disposable) {
            CropImageView.this.f58041M.set(true);
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$o */
    /* loaded from: classes5.dex */
    public class C9044o implements CompletableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RectF f58174a;

        /* renamed from: b */
        public final /* synthetic */ Uri f58175b;

        /* renamed from: c */
        public final /* synthetic */ boolean f58176c;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$o$a */
        /* loaded from: classes5.dex */
        public class RunnableC9045a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f58178a;

            /* renamed from: b */
            public final /* synthetic */ CompletableEmitter f58179b;

            public RunnableC9045a(Bitmap bitmap, CompletableEmitter completableEmitter) {
                this.f58178a = bitmap;
                this.f58179b = completableEmitter;
            }

            @Override // java.lang.Runnable
            public void run() {
                CropImageView cropImageView = CropImageView.this;
                cropImageView.f58058d = cropImageView.f58029A;
                CropImageView.this.setImageDrawableInternal(new BitmapDrawable(CropImageView.this.getResources(), this.f58178a));
                this.f58179b.onComplete();
            }
        }

        public C9044o(RectF rectF, Uri uri, boolean z) {
            this.f58174a = rectF;
            this.f58175b = uri;
            this.f58176c = z;
        }

        @Override // io.reactivex.CompletableOnSubscribe
        public void subscribe(CompletableEmitter completableEmitter) {
            CropImageView.this.f58078n = this.f58174a;
            CropImageView.this.f58092y = this.f58175b;
            if (this.f58176c) {
                CropImageView.this.m33785y(this.f58175b);
            }
            CropImageView.this.f58091x.post(new RunnableC9045a(CropImageView.this.m33844P(this.f58175b), completableEmitter));
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$p */
    /* loaded from: classes5.dex */
    public class RunnableC9046p implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f58181a;

        public RunnableC9046p(Bitmap bitmap) {
            this.f58181a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = CropImageView.this;
            cropImageView.f58058d = cropImageView.f58029A;
            CropImageView.this.setImageDrawableInternal(new BitmapDrawable(CropImageView.this.getResources(), this.f58181a));
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$q */
    /* loaded from: classes5.dex */
    public class C9047q implements SimpleValueAnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ float f58183a;

        /* renamed from: b */
        public final /* synthetic */ float f58184b;

        /* renamed from: c */
        public final /* synthetic */ float f58185c;

        /* renamed from: d */
        public final /* synthetic */ float f58186d;

        /* renamed from: e */
        public final /* synthetic */ float f58187e;

        /* renamed from: f */
        public final /* synthetic */ float f58188f;

        public C9047q(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f58183a = f;
            this.f58184b = f2;
            this.f58185c = f3;
            this.f58186d = f4;
            this.f58187e = f5;
            this.f58188f = f6;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationFinished() {
            CropImageView.this.f58058d = this.f58187e % 360.0f;
            CropImageView.this.f58056c = this.f58188f;
            CropImageView.this.f58078n = null;
            CropImageView cropImageView = CropImageView.this;
            cropImageView.m33784y0(cropImageView.f58052a, CropImageView.this.f58054b);
            CropImageView.this.f58086s = false;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationStarted() {
            CropImageView.this.f58086s = true;
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationUpdated(float f) {
            CropImageView.this.f58058d = this.f58183a + (this.f58184b * f);
            CropImageView.this.f58056c = this.f58185c + (this.f58186d * f);
            CropImageView.this.m33788w0();
            CropImageView.this.invalidate();
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.CropImageView$r */
    /* loaded from: classes5.dex */
    public class RunnableC9048r implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CropCallback f58190a;

        /* renamed from: b */
        public final /* synthetic */ Uri f58191b;

        /* renamed from: c */
        public final /* synthetic */ SaveCallback f58192c;

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$r$a */
        /* loaded from: classes5.dex */
        public class RunnableC9049a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f58194a;

            public RunnableC9049a(Bitmap bitmap) {
                this.f58194a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                CropCallback cropCallback = RunnableC9048r.this.f58190a;
                if (cropCallback != null) {
                    cropCallback.onSuccess(this.f58194a);
                }
                if (CropImageView.this.f58034F) {
                    CropImageView.this.invalidate();
                }
            }
        }

        /* renamed from: com.isseiaoki.simplecropview.CropImageView$r$b */
        /* loaded from: classes5.dex */
        public class RunnableC9050b implements Runnable {
            public RunnableC9050b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC9048r runnableC9048r = RunnableC9048r.this;
                SaveCallback saveCallback = runnableC9048r.f58192c;
                if (saveCallback != null) {
                    saveCallback.onSuccess(runnableC9048r.f58191b);
                }
            }
        }

        public RunnableC9048r(CropCallback cropCallback, Uri uri, SaveCallback saveCallback) {
            this.f58190a = cropCallback;
            this.f58191b = uri;
            this.f58192c = saveCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap = null;
            try {
                try {
                    CropImageView.this.f58042N.set(true);
                    bitmap = CropImageView.this.m33852H();
                    CropImageView.this.f58091x.post(new RunnableC9049a(bitmap));
                    CropImageView.this.m33792u0(bitmap, this.f58191b);
                    CropImageView.this.f58091x.post(new RunnableC9050b());
                } catch (Exception e) {
                    if (bitmap == null) {
                        CropImageView.this.m33798r0(this.f58190a, e);
                    } else {
                        CropImageView.this.m33798r0(this.f58192c, e);
                    }
                }
            } finally {
                CropImageView.this.f58042N.set(false);
            }
        }
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    private SimpleValueAnimator getAnimator() {
        m33786x0();
        return this.f58088u;
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
            inputStream = getContext().getContentResolver().openInputStream(this.f58092y);
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(inputStream, false);
            int width = newInstance.getWidth();
            int height = newInstance.getHeight();
            Rect m33783z = m33783z(width, height);
            if (this.f58058d != 0.0f) {
                Matrix matrix = new Matrix();
                matrix.setRotate(-this.f58058d);
                RectF rectF = new RectF();
                matrix.mapRect(rectF, new RectF(m33783z));
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
                m33783z = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            }
            Bitmap decodeRegion = newInstance.decodeRegion(m33783z, new BitmapFactory.Options());
            if (this.f58058d != 0.0f) {
                Bitmap m33841S = m33841S(decodeRegion);
                if (decodeRegion != getBitmap() && decodeRegion != m33841S) {
                    decodeRegion.recycle();
                }
                decodeRegion = m33841S;
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
        RectF rectF = this.f58076m;
        return rectF.bottom - rectF.top;
    }

    private float getFrameW() {
        RectF rectF = this.f58076m;
        return rectF.right - rectF.left;
    }

    private float getRatioX() {
        int i = C9037i.f58153b[this.f58046R.ordinal()];
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
            return this.f58061e0.x;
        }
        return this.f58080o.width();
    }

    private float getRatioY() {
        int i = C9037i.f58153b[this.f58046R.ordinal()];
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
            return this.f58061e0.y;
        }
        return this.f58080o.height();
    }

    private void setCenter(PointF pointF) {
        this.f58082p = pointF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageDrawableInternal(Drawable drawable) {
        super.setImageDrawable(drawable);
        m33859A0();
    }

    private void setScale(float f) {
        this.f58056c = f;
    }

    /* renamed from: A */
    public final RectF m33860A(RectF rectF) {
        float m33843Q = m33843Q(rectF.width());
        float m33842R = m33842R(rectF.height());
        float width = rectF.width() / rectF.height();
        float f = m33843Q / m33842R;
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
        float f12 = this.f58077m0;
        float f13 = (f8 * f12) / 2.0f;
        float f14 = (f9 * f12) / 2.0f;
        return new RectF(f10 - f13, f11 - f14, f10 + f13, f11 + f14);
    }

    /* renamed from: A0 */
    public final void m33859A0() {
        if (getDrawable() != null) {
            m33784y0(this.f58052a, this.f58054b);
        }
    }

    /* renamed from: B */
    public final RectF m33858B(RectF rectF, Matrix matrix) {
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        return rectF2;
    }

    /* renamed from: C */
    public final float m33857C(int i, int i2, float f) {
        this.f58060e = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        this.f58062f = intrinsicHeight;
        if (this.f58060e <= 0.0f) {
            this.f58060e = i;
        }
        if (intrinsicHeight <= 0.0f) {
            this.f58062f = i2;
        }
        float f2 = i;
        float f3 = i2;
        float f4 = f2 / f3;
        float m33838V = m33838V(f) / m33840T(f);
        if (m33838V >= f4) {
            return f2 / m33838V(f);
        }
        if (m33838V < f4) {
            return f3 / m33840T(f);
        }
        return 1.0f;
    }

    /* renamed from: D */
    public final void m33856D() {
        RectF rectF = this.f58076m;
        float f = rectF.left;
        RectF rectF2 = this.f58080o;
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
    public final void m33855E() {
        RectF rectF = this.f58076m;
        float f = rectF.left;
        RectF rectF2 = this.f58080o;
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
    public final void m33854F(float f, float f2) {
        if (m33830b0(f, f2)) {
            this.f58045Q = TouchArea.LEFT_TOP;
            ShowMode showMode = this.f58048T;
            ShowMode showMode2 = ShowMode.SHOW_ON_TOUCH;
            if (showMode == showMode2) {
                this.f58055b0 = true;
            }
            if (this.f58047S == showMode2) {
                this.f58053a0 = true;
            }
        } else if (m33826d0(f, f2)) {
            this.f58045Q = TouchArea.RIGHT_TOP;
            ShowMode showMode3 = this.f58048T;
            ShowMode showMode4 = ShowMode.SHOW_ON_TOUCH;
            if (showMode3 == showMode4) {
                this.f58055b0 = true;
            }
            if (this.f58047S == showMode4) {
                this.f58053a0 = true;
            }
        } else if (m33832a0(f, f2)) {
            this.f58045Q = TouchArea.LEFT_BOTTOM;
            ShowMode showMode5 = this.f58048T;
            ShowMode showMode6 = ShowMode.SHOW_ON_TOUCH;
            if (showMode5 == showMode6) {
                this.f58055b0 = true;
            }
            if (this.f58047S == showMode6) {
                this.f58053a0 = true;
            }
        } else if (m33828c0(f, f2)) {
            this.f58045Q = TouchArea.RIGHT_BOTTOM;
            ShowMode showMode7 = this.f58048T;
            ShowMode showMode8 = ShowMode.SHOW_ON_TOUCH;
            if (showMode7 == showMode8) {
                this.f58055b0 = true;
            }
            if (this.f58047S == showMode8) {
                this.f58053a0 = true;
            }
        } else if (m33824e0(f, f2)) {
            if (this.f58047S == ShowMode.SHOW_ON_TOUCH) {
                this.f58053a0 = true;
            }
            this.f58045Q = TouchArea.CENTER;
        } else {
            this.f58045Q = TouchArea.OUT_OF_BOUNDS;
        }
    }

    /* renamed from: G */
    public final float m33853G(float f, float f2, float f3, float f4) {
        return (f < f2 || f > f3) ? f4 : f;
    }

    /* renamed from: H */
    public final Bitmap m33852H() {
        Bitmap croppedBitmapFromUri;
        if (this.f58092y == null) {
            croppedBitmapFromUri = getCroppedBitmap();
        } else {
            croppedBitmapFromUri = getCroppedBitmapFromUri();
            if (this.f58046R == CropMode.CIRCLE) {
                Bitmap circularBitmap = getCircularBitmap(croppedBitmapFromUri);
                if (croppedBitmapFromUri != getBitmap()) {
                    croppedBitmapFromUri.recycle();
                }
                croppedBitmapFromUri = circularBitmap;
            }
        }
        Bitmap m33790v0 = m33790v0(croppedBitmapFromUri);
        this.f58039K = m33790v0.getWidth();
        this.f58040L = m33790v0.getHeight();
        return m33790v0;
    }

    /* renamed from: I */
    public final void m33851I(Canvas canvas) {
        if (!this.f58057c0 || this.f58086s) {
            return;
        }
        m33845O(canvas);
        m33849K(canvas);
        if (this.f58053a0) {
            m33848L(canvas);
        }
        if (this.f58055b0) {
            m33846N(canvas);
        }
    }

    /* renamed from: J */
    public final void m33850J(Canvas canvas) {
        String str;
        int i;
        StringBuilder sb;
        int i2;
        String str2;
        Paint.FontMetrics fontMetrics = this.f58074l.getFontMetrics();
        this.f58074l.measureText("W");
        int i3 = (int) (fontMetrics.descent - fontMetrics.ascent);
        int density = (int) (this.f58080o.left + (this.f58050V * 0.5f * getDensity()));
        int density2 = (int) (this.f58080o.top + i3 + (this.f58050V * 0.5f * getDensity()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LOADED FROM: ");
        if (this.f58092y != null) {
            str = "Uri";
        } else {
            str = Registry.BUCKET_BITMAP;
        }
        sb2.append(str);
        float f = density;
        canvas.drawText(sb2.toString(), f, density2, this.f58074l);
        StringBuilder sb3 = new StringBuilder();
        if (this.f58092y == null) {
            sb3.append("INPUT_IMAGE_SIZE: ");
            sb3.append((int) this.f58060e);
            sb3.append("x");
            sb3.append((int) this.f58062f);
            i = density2 + i3;
            canvas.drawText(sb3.toString(), f, i, this.f58074l);
            sb = new StringBuilder();
        } else {
            i = density2 + i3;
            canvas.drawText("INPUT_IMAGE_SIZE: " + this.f58037I + "x" + this.f58038J, f, i, this.f58074l);
            sb = new StringBuilder();
        }
        sb.append("LOADED_IMAGE_SIZE: ");
        sb.append(getBitmap().getWidth());
        sb.append("x");
        sb.append(getBitmap().getHeight());
        int i4 = i + i3;
        canvas.drawText(sb.toString(), f, i4, this.f58074l);
        StringBuilder sb4 = new StringBuilder();
        if (this.f58039K > 0 && this.f58040L > 0) {
            sb4.append("OUTPUT_IMAGE_SIZE: ");
            sb4.append(this.f58039K);
            sb4.append("x");
            sb4.append(this.f58040L);
            int i5 = i4 + i3;
            canvas.drawText(sb4.toString(), f, i5, this.f58074l);
            int i6 = i5 + i3;
            canvas.drawText("EXIF ROTATION: " + this.f58029A, f, i6, this.f58074l);
            i4 = i6 + i3;
            canvas.drawText("CURRENT_ROTATION: " + ((int) this.f58058d), f, i4, this.f58074l);
        }
        canvas.drawText("FRAME_RECT: " + this.f58076m.toString(), f, i4 + i3, this.f58074l);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("ACTUAL_CROP_RECT: ");
        if (getActualCropRect() != null) {
            str2 = getActualCropRect().toString();
        } else {
            str2 = "";
        }
        sb5.append(str2);
        canvas.drawText(sb5.toString(), f, i2 + i3, this.f58074l);
    }

    /* renamed from: K */
    public final void m33849K(Canvas canvas) {
        this.f58070j.setAntiAlias(true);
        this.f58070j.setFilterBitmap(true);
        this.f58070j.setStyle(Paint.Style.STROKE);
        this.f58070j.setColor(this.f58071j0);
        this.f58070j.setStrokeWidth(this.f58063f0);
        canvas.drawRect(this.f58076m, this.f58070j);
    }

    /* renamed from: L */
    public final void m33848L(Canvas canvas) {
        this.f58070j.setColor(this.f58075l0);
        this.f58070j.setStrokeWidth(this.f58065g0);
        RectF rectF = this.f58076m;
        float f = rectF.left;
        float f2 = rectF.right;
        float f3 = f + ((f2 - f) / 3.0f);
        float f4 = f2 - ((f2 - f) / 3.0f);
        float f5 = rectF.top;
        float f6 = rectF.bottom;
        float f7 = f5 + ((f6 - f5) / 3.0f);
        float f8 = f6 - ((f6 - f5) / 3.0f);
        canvas.drawLine(f3, f5, f3, f6, this.f58070j);
        RectF rectF2 = this.f58076m;
        canvas.drawLine(f4, rectF2.top, f4, rectF2.bottom, this.f58070j);
        RectF rectF3 = this.f58076m;
        canvas.drawLine(rectF3.left, f7, rectF3.right, f7, this.f58070j);
        RectF rectF4 = this.f58076m;
        canvas.drawLine(rectF4.left, f8, rectF4.right, f8, this.f58070j);
    }

    /* renamed from: M */
    public final void m33847M(Canvas canvas) {
        this.f58070j.setStyle(Paint.Style.FILL);
        this.f58070j.setColor(-1157627904);
        RectF rectF = new RectF(this.f58076m);
        rectF.offset(0.0f, 1.0f);
        canvas.drawCircle(rectF.left, rectF.top, this.f58050V, this.f58070j);
        canvas.drawCircle(rectF.right, rectF.top, this.f58050V, this.f58070j);
        canvas.drawCircle(rectF.left, rectF.bottom, this.f58050V, this.f58070j);
        canvas.drawCircle(rectF.right, rectF.bottom, this.f58050V, this.f58070j);
    }

    /* renamed from: N */
    public final void m33846N(Canvas canvas) {
        if (this.f58083p0) {
            m33847M(canvas);
        }
        this.f58070j.setStyle(Paint.Style.FILL);
        this.f58070j.setColor(this.f58073k0);
        RectF rectF = this.f58076m;
        canvas.drawCircle(rectF.left, rectF.top, this.f58050V, this.f58070j);
        RectF rectF2 = this.f58076m;
        canvas.drawCircle(rectF2.right, rectF2.top, this.f58050V, this.f58070j);
        RectF rectF3 = this.f58076m;
        canvas.drawCircle(rectF3.left, rectF3.bottom, this.f58050V, this.f58070j);
        RectF rectF4 = this.f58076m;
        canvas.drawCircle(rectF4.right, rectF4.bottom, this.f58050V, this.f58070j);
    }

    /* renamed from: O */
    public final void m33845O(Canvas canvas) {
        CropMode cropMode;
        this.f58068i.setAntiAlias(true);
        this.f58068i.setFilterBitmap(true);
        this.f58068i.setColor(this.f58069i0);
        this.f58068i.setStyle(Paint.Style.FILL);
        Path path = new Path();
        RectF rectF = new RectF((float) Math.floor(this.f58080o.left), (float) Math.floor(this.f58080o.top), (float) Math.ceil(this.f58080o.right), (float) Math.ceil(this.f58080o.bottom));
        if (!this.f58087t && ((cropMode = this.f58046R) == CropMode.CIRCLE || cropMode == CropMode.CIRCLE_SQUARE)) {
            path.addRect(rectF, Path.Direction.CW);
            RectF rectF2 = this.f58076m;
            PointF pointF = new PointF((rectF2.left + rectF2.right) / 2.0f, (rectF2.top + rectF2.bottom) / 2.0f);
            RectF rectF3 = this.f58076m;
            path.addCircle(pointF.x, pointF.y, (rectF3.right - rectF3.left) / 2.0f, Path.Direction.CCW);
            canvas.drawPath(path, this.f58068i);
            return;
        }
        path.addRect(rectF, Path.Direction.CW);
        path.addRect(this.f58076m, Path.Direction.CCW);
        canvas.drawPath(path, this.f58068i);
    }

    /* renamed from: P */
    public final Bitmap m33844P(Uri uri) {
        if (uri != null) {
            this.f58029A = Utils.getExifOrientation(getContext(), this.f58092y);
            int maxSize = Utils.getMaxSize();
            int max = Math.max(this.f58052a, this.f58054b);
            if (max != 0) {
                maxSize = max;
            }
            Bitmap decodeSampledBitmapFromUri = Utils.decodeSampledBitmapFromUri(getContext(), this.f58092y, maxSize);
            this.f58037I = Utils.sInputImageWidth;
            this.f58038J = Utils.sInputImageHeight;
            return decodeSampledBitmapFromUri;
        }
        throw new IllegalStateException("Source Uri must not be null.");
    }

    /* renamed from: Q */
    public final float m33843Q(float f) {
        switch (C9037i.f58153b[this.f58046R.ordinal()]) {
            case 1:
                return this.f58080o.width();
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
                return this.f58061e0.x;
        }
    }

    /* renamed from: R */
    public final float m33842R(float f) {
        switch (C9037i.f58153b[this.f58046R.ordinal()]) {
            case 1:
                return this.f58080o.height();
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
                return this.f58061e0.y;
        }
    }

    /* renamed from: S */
    public final Bitmap m33841S(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setRotate(this.f58058d, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: T */
    public final float m33840T(float f) {
        return m33839U(f, this.f58060e, this.f58062f);
    }

    /* renamed from: U */
    public final float m33839U(float f, float f2, float f3) {
        return f % 180.0f == 0.0f ? f3 : f2;
    }

    /* renamed from: V */
    public final float m33838V(float f) {
        return m33837W(f, this.f58060e, this.f58062f);
    }

    /* renamed from: W */
    public final float m33837W(float f, float f2, float f3) {
        return f % 180.0f == 0.0f ? f2 : f3;
    }

    /* renamed from: X */
    public final Bitmap m33836X(Uri uri) {
        if (uri != null) {
            this.f58029A = Utils.getExifOrientation(getContext(), this.f58092y);
            int max = (int) (Math.max(this.f58052a, this.f58054b) * 0.1f);
            if (max == 0) {
                return null;
            }
            Bitmap decodeSampledBitmapFromUri = Utils.decodeSampledBitmapFromUri(getContext(), this.f58092y, max);
            this.f58037I = Utils.sInputImageWidth;
            this.f58038J = Utils.sInputImageHeight;
            return decodeSampledBitmapFromUri;
        }
        throw new IllegalStateException("Source Uri must not be null.");
    }

    /* renamed from: Y */
    public final void m33835Y(Context context, AttributeSet attributeSet, int i, float f) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.scv_CropImageView, i, 0);
        this.f58046R = CropMode.SQUARE;
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
                        this.f58046R = cropMode;
                        break;
                    }
                    i2++;
                }
                this.f58067h0 = obtainStyledAttributes.getColor(R.styleable.scv_CropImageView_scv_background_color, 0);
                this.f58069i0 = obtainStyledAttributes.getColor(R.styleable.scv_CropImageView_scv_overlay_color, -1157627904);
                this.f58071j0 = obtainStyledAttributes.getColor(R.styleable.scv_CropImageView_scv_frame_color, -1);
                this.f58073k0 = obtainStyledAttributes.getColor(R.styleable.scv_CropImageView_scv_handle_color, -1);
                this.f58075l0 = obtainStyledAttributes.getColor(R.styleable.scv_CropImageView_scv_guide_color, -1140850689);
                ShowMode[] values2 = ShowMode.values();
                int length2 = values2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break;
                    }
                    ShowMode showMode = values2[i3];
                    if (obtainStyledAttributes.getInt(R.styleable.scv_CropImageView_scv_guide_show_mode, 1) == showMode.getId()) {
                        this.f58047S = showMode;
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
                        this.f58048T = showMode2;
                        break;
                    }
                    i4++;
                }
                setGuideShowMode(this.f58047S);
                setHandleShowMode(this.f58048T);
                this.f58050V = obtainStyledAttributes.getDimensionPixelSize(R.styleable.scv_CropImageView_scv_handle_size, (int) (14.0f * f));
                this.f58051W = obtainStyledAttributes.getDimensionPixelSize(R.styleable.scv_CropImageView_scv_touch_padding, 0);
                this.f58049U = obtainStyledAttributes.getDimensionPixelSize(R.styleable.scv_CropImageView_scv_min_frame_size, (int) (50.0f * f));
                int i5 = (int) (f * 1.0f);
                this.f58063f0 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.scv_CropImageView_scv_frame_stroke_weight, i5);
                this.f58065g0 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.scv_CropImageView_scv_guide_stroke_weight, i5);
                this.f58057c0 = obtainStyledAttributes.getBoolean(R.styleable.scv_CropImageView_scv_crop_enabled, true);
                this.f58077m0 = m33853G(obtainStyledAttributes.getFloat(R.styleable.scv_CropImageView_scv_initial_frame_scale, 1.0f), 0.01f, 1.0f, 1.0f);
                this.f58079n0 = obtainStyledAttributes.getBoolean(R.styleable.scv_CropImageView_scv_animation_enabled, true);
                this.f58081o0 = obtainStyledAttributes.getInt(R.styleable.scv_CropImageView_scv_animation_duration, 100);
                this.f58083p0 = obtainStyledAttributes.getBoolean(R.styleable.scv_CropImageView_scv_handle_shadow_enabled, true);
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
    public final boolean m33834Z() {
        if (getFrameH() < this.f58049U) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public final boolean m33832a0(float f, float f2) {
        RectF rectF = this.f58076m;
        float f3 = f - rectF.left;
        float f4 = f2 - rectF.bottom;
        if (m33782z0(this.f58050V + this.f58051W) >= (f3 * f3) + (f4 * f4)) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public final boolean m33830b0(float f, float f2) {
        RectF rectF = this.f58076m;
        float f3 = f - rectF.left;
        float f4 = f2 - rectF.top;
        if (m33782z0(this.f58050V + this.f58051W) >= (f3 * f3) + (f4 * f4)) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public final boolean m33828c0(float f, float f2) {
        RectF rectF = this.f58076m;
        float f3 = f - rectF.right;
        float f4 = f2 - rectF.bottom;
        if (m33782z0(this.f58050V + this.f58051W) >= (f3 * f3) + (f4 * f4)) {
            return true;
        }
        return false;
    }

    public CropRequest crop(Uri uri) {
        return new CropRequest(this, uri);
    }

    public Single<Bitmap> cropAsSingle(Uri uri) {
        return Single.fromCallable(new CallableC9031d(uri)).doOnSubscribe(new C9030c()).doFinally(new C9029b());
    }

    public void cropAsync(Uri uri, CropCallback cropCallback) {
        this.f58044P.submit(new RunnableC9027a(uri, cropCallback));
    }

    /* renamed from: d0 */
    public final boolean m33826d0(float f, float f2) {
        RectF rectF = this.f58076m;
        float f3 = f - rectF.right;
        float f4 = f2 - rectF.top;
        if (m33782z0(this.f58050V + this.f58051W) >= (f3 * f3) + (f4 * f4)) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public final boolean m33824e0(float f, float f2) {
        RectF rectF = this.f58076m;
        if (rectF.left <= f && rectF.right >= f && rectF.top <= f2 && rectF.bottom >= f2) {
            this.f58045Q = TouchArea.CENTER;
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public final boolean m33822f0(float f) {
        RectF rectF = this.f58080o;
        if (rectF.left <= f && rectF.right >= f) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public final boolean m33820g0(float f) {
        RectF rectF = this.f58080o;
        if (rectF.top <= f && rectF.bottom >= f) {
            return true;
        }
        return false;
    }

    public RectF getActualCropRect() {
        RectF rectF = this.f58080o;
        if (rectF == null) {
            return null;
        }
        float f = rectF.left;
        float f2 = this.f58056c;
        float f3 = f / f2;
        float f4 = rectF.top / f2;
        RectF rectF2 = this.f58076m;
        return new RectF(Math.max(0.0f, (rectF2.left / f2) - f3), Math.max(0.0f, (rectF2.top / f2) - f4), Math.min(this.f58080o.right / this.f58056c, (rectF2.right / f2) - f3), Math.min(this.f58080o.bottom / this.f58056c, (rectF2.bottom / f2) - f4));
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
        Bitmap m33841S = m33841S(bitmap);
        Rect m33783z = m33783z(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(m33841S, m33783z.left, m33783z.top, m33783z.width(), m33783z.height(), (Matrix) null, false);
        if (m33841S != createBitmap && m33841S != bitmap) {
            m33841S.recycle();
        }
        if (this.f58046R == CropMode.CIRCLE) {
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
        return this.f58093z;
    }

    public Uri getSourceUri() {
        return this.f58092y;
    }

    /* renamed from: h0 */
    public final boolean m33818h0() {
        if (getFrameW() < this.f58049U) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public final void m33816i0(float f, float f2) {
        RectF rectF = this.f58076m;
        rectF.left += f;
        rectF.right += f;
        rectF.top += f2;
        rectF.bottom += f2;
        m33856D();
    }

    public boolean isCropping() {
        return this.f58042N.get();
    }

    public boolean isSaving() {
        return this.f58043O.get();
    }

    /* renamed from: j0 */
    public final void m33814j0(float f, float f2) {
        if (this.f58046R == CropMode.FREE) {
            RectF rectF = this.f58076m;
            rectF.left += f;
            rectF.bottom += f2;
            if (m33818h0()) {
                this.f58076m.left -= this.f58049U - getFrameW();
            }
            if (m33834Z()) {
                this.f58076m.bottom += this.f58049U - getFrameH();
            }
            m33855E();
            return;
        }
        float ratioY = (getRatioY() * f) / getRatioX();
        RectF rectF2 = this.f58076m;
        rectF2.left += f;
        rectF2.bottom -= ratioY;
        if (m33818h0()) {
            float frameW = this.f58049U - getFrameW();
            this.f58076m.left -= frameW;
            this.f58076m.bottom += (frameW * getRatioY()) / getRatioX();
        }
        if (m33834Z()) {
            float frameH = this.f58049U - getFrameH();
            this.f58076m.bottom += frameH;
            this.f58076m.left -= (frameH * getRatioX()) / getRatioY();
        }
        if (!m33822f0(this.f58076m.left)) {
            float f3 = this.f58080o.left;
            RectF rectF3 = this.f58076m;
            float f4 = rectF3.left;
            float f5 = f3 - f4;
            rectF3.left = f4 + f5;
            this.f58076m.bottom -= (f5 * getRatioY()) / getRatioX();
        }
        if (!m33820g0(this.f58076m.bottom)) {
            RectF rectF4 = this.f58076m;
            float f6 = rectF4.bottom;
            float f7 = f6 - this.f58080o.bottom;
            rectF4.bottom = f6 - f7;
            this.f58076m.left += (f7 * getRatioX()) / getRatioY();
        }
    }

    /* renamed from: k0 */
    public final void m33812k0(float f, float f2) {
        if (this.f58046R == CropMode.FREE) {
            RectF rectF = this.f58076m;
            rectF.left += f;
            rectF.top += f2;
            if (m33818h0()) {
                this.f58076m.left -= this.f58049U - getFrameW();
            }
            if (m33834Z()) {
                this.f58076m.top -= this.f58049U - getFrameH();
            }
            m33855E();
            return;
        }
        float ratioY = (getRatioY() * f) / getRatioX();
        RectF rectF2 = this.f58076m;
        rectF2.left += f;
        rectF2.top += ratioY;
        if (m33818h0()) {
            float frameW = this.f58049U - getFrameW();
            this.f58076m.left -= frameW;
            this.f58076m.top -= (frameW * getRatioY()) / getRatioX();
        }
        if (m33834Z()) {
            float frameH = this.f58049U - getFrameH();
            this.f58076m.top -= frameH;
            this.f58076m.left -= (frameH * getRatioX()) / getRatioY();
        }
        if (!m33822f0(this.f58076m.left)) {
            float f3 = this.f58080o.left;
            RectF rectF3 = this.f58076m;
            float f4 = rectF3.left;
            float f5 = f3 - f4;
            rectF3.left = f4 + f5;
            this.f58076m.top += (f5 * getRatioY()) / getRatioX();
        }
        if (!m33820g0(this.f58076m.top)) {
            float f6 = this.f58080o.top;
            RectF rectF4 = this.f58076m;
            float f7 = rectF4.top;
            float f8 = f6 - f7;
            rectF4.top = f7 + f8;
            this.f58076m.left += (f8 * getRatioX()) / getRatioY();
        }
    }

    /* renamed from: l0 */
    public final void m33810l0(float f, float f2) {
        if (this.f58046R == CropMode.FREE) {
            RectF rectF = this.f58076m;
            rectF.right += f;
            rectF.bottom += f2;
            if (m33818h0()) {
                this.f58076m.right += this.f58049U - getFrameW();
            }
            if (m33834Z()) {
                this.f58076m.bottom += this.f58049U - getFrameH();
            }
            m33855E();
            return;
        }
        float ratioY = (getRatioY() * f) / getRatioX();
        RectF rectF2 = this.f58076m;
        rectF2.right += f;
        rectF2.bottom += ratioY;
        if (m33818h0()) {
            float frameW = this.f58049U - getFrameW();
            this.f58076m.right += frameW;
            this.f58076m.bottom += (frameW * getRatioY()) / getRatioX();
        }
        if (m33834Z()) {
            float frameH = this.f58049U - getFrameH();
            this.f58076m.bottom += frameH;
            this.f58076m.right += (frameH * getRatioX()) / getRatioY();
        }
        if (!m33822f0(this.f58076m.right)) {
            RectF rectF3 = this.f58076m;
            float f3 = rectF3.right;
            float f4 = f3 - this.f58080o.right;
            rectF3.right = f3 - f4;
            this.f58076m.bottom -= (f4 * getRatioY()) / getRatioX();
        }
        if (!m33820g0(this.f58076m.bottom)) {
            RectF rectF4 = this.f58076m;
            float f5 = rectF4.bottom;
            float f6 = f5 - this.f58080o.bottom;
            rectF4.bottom = f5 - f6;
            this.f58076m.right -= (f6 * getRatioX()) / getRatioY();
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
    public final void m33808m0(float f, float f2) {
        if (this.f58046R == CropMode.FREE) {
            RectF rectF = this.f58076m;
            rectF.right += f;
            rectF.top += f2;
            if (m33818h0()) {
                this.f58076m.right += this.f58049U - getFrameW();
            }
            if (m33834Z()) {
                this.f58076m.top -= this.f58049U - getFrameH();
            }
            m33855E();
            return;
        }
        float ratioY = (getRatioY() * f) / getRatioX();
        RectF rectF2 = this.f58076m;
        rectF2.right += f;
        rectF2.top -= ratioY;
        if (m33818h0()) {
            float frameW = this.f58049U - getFrameW();
            this.f58076m.right += frameW;
            this.f58076m.top -= (frameW * getRatioY()) / getRatioX();
        }
        if (m33834Z()) {
            float frameH = this.f58049U - getFrameH();
            this.f58076m.top -= frameH;
            this.f58076m.right += (frameH * getRatioX()) / getRatioY();
        }
        if (!m33822f0(this.f58076m.right)) {
            RectF rectF3 = this.f58076m;
            float f3 = rectF3.right;
            float f4 = f3 - this.f58080o.right;
            rectF3.right = f3 - f4;
            this.f58076m.top += (f4 * getRatioY()) / getRatioX();
        }
        if (!m33820g0(this.f58076m.top)) {
            float f5 = this.f58080o.top;
            RectF rectF4 = this.f58076m;
            float f6 = rectF4.top;
            float f7 = f5 - f6;
            rectF4.top = f6 + f7;
            this.f58076m.right -= (f7 * getRatioX()) / getRatioY();
        }
    }

    /* renamed from: n0 */
    public final void m33806n0() {
        this.f58045Q = TouchArea.OUT_OF_BOUNDS;
        invalidate();
    }

    /* renamed from: o0 */
    public final void m33804o0(MotionEvent motionEvent) {
        invalidate();
        this.f58084q = motionEvent.getX();
        this.f58085r = motionEvent.getY();
        m33854F(motionEvent.getX(), motionEvent.getY());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        this.f58044P.shutdown();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawColor(this.f58067h0);
        if (this.f58064g) {
            m33788w0();
            Bitmap bitmap = getBitmap();
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, this.f58066h, this.f58072k);
                m33851I(canvas);
            }
            if (this.f58034F) {
                m33850J(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getDrawable() != null) {
            m33784y0(this.f58052a, this.f58054b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        this.f58052a = (size - getPaddingLeft()) - getPaddingRight();
        this.f58054b = (size2 - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f58046R = savedState.f58106a;
        this.f58067h0 = savedState.f58107b;
        this.f58069i0 = savedState.f58108c;
        this.f58071j0 = savedState.f58109d;
        this.f58047S = savedState.f58110e;
        this.f58048T = savedState.f58111f;
        this.f58053a0 = savedState.f58112g;
        this.f58055b0 = savedState.f58113h;
        this.f58050V = savedState.f58114i;
        this.f58051W = savedState.f58115j;
        this.f58049U = savedState.f58116k;
        this.f58061e0 = new PointF(savedState.f58117l, savedState.f58118m);
        this.f58063f0 = savedState.f58119n;
        this.f58065g0 = savedState.f58120o;
        this.f58057c0 = savedState.f58121p;
        this.f58073k0 = savedState.f58122q;
        this.f58075l0 = savedState.f58123r;
        this.f58077m0 = savedState.f58124s;
        this.f58058d = savedState.f58125t;
        this.f58079n0 = savedState.f58126u;
        this.f58081o0 = savedState.f58127v;
        this.f58029A = savedState.f58128w;
        this.f58092y = savedState.f58129x;
        this.f58093z = savedState.f58130y;
        this.f58035G = savedState.f58131z;
        this.f58036H = savedState.f58095A;
        this.f58034F = savedState.f58096B;
        this.f58030B = savedState.f58097C;
        this.f58031C = savedState.f58098D;
        this.f58032D = savedState.f58099E;
        this.f58033E = savedState.f58100F;
        this.f58083p0 = savedState.f58101G;
        this.f58037I = savedState.f58102H;
        this.f58038J = savedState.f58103I;
        this.f58039K = savedState.f58104J;
        this.f58040L = savedState.f58105K;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f58106a = this.f58046R;
        savedState.f58107b = this.f58067h0;
        savedState.f58108c = this.f58069i0;
        savedState.f58109d = this.f58071j0;
        savedState.f58110e = this.f58047S;
        savedState.f58111f = this.f58048T;
        savedState.f58112g = this.f58053a0;
        savedState.f58113h = this.f58055b0;
        savedState.f58114i = this.f58050V;
        savedState.f58115j = this.f58051W;
        savedState.f58116k = this.f58049U;
        PointF pointF = this.f58061e0;
        savedState.f58117l = pointF.x;
        savedState.f58118m = pointF.y;
        savedState.f58119n = this.f58063f0;
        savedState.f58120o = this.f58065g0;
        savedState.f58121p = this.f58057c0;
        savedState.f58122q = this.f58073k0;
        savedState.f58123r = this.f58075l0;
        savedState.f58124s = this.f58077m0;
        savedState.f58125t = this.f58058d;
        savedState.f58126u = this.f58079n0;
        savedState.f58127v = this.f58081o0;
        savedState.f58128w = this.f58029A;
        savedState.f58129x = this.f58092y;
        savedState.f58130y = this.f58093z;
        savedState.f58131z = this.f58035G;
        savedState.f58095A = this.f58036H;
        savedState.f58096B = this.f58034F;
        savedState.f58097C = this.f58030B;
        savedState.f58098D = this.f58031C;
        savedState.f58099E = this.f58032D;
        savedState.f58100F = this.f58033E;
        savedState.f58101G = this.f58083p0;
        savedState.f58102H = this.f58037I;
        savedState.f58103I = this.f58038J;
        savedState.f58104J = this.f58039K;
        savedState.f58105K = this.f58040L;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f58064g || !this.f58057c0 || !this.f58059d0 || this.f58086s || this.f58087t || this.f58041M.get() || this.f58042N.get()) {
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
                    m33806n0();
                    return true;
                }
                m33802p0(motionEvent);
                if (this.f58045Q != TouchArea.OUT_OF_BOUNDS) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            m33800q0(motionEvent);
            return true;
        }
        m33804o0(motionEvent);
        return true;
    }

    /* renamed from: p0 */
    public final void m33802p0(MotionEvent motionEvent) {
        float x = motionEvent.getX() - this.f58084q;
        float y = motionEvent.getY() - this.f58085r;
        int i = C9037i.f58152a[this.f58045Q.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            m33810l0(x, y);
                        }
                    } else {
                        m33814j0(x, y);
                    }
                } else {
                    m33808m0(x, y);
                }
            } else {
                m33812k0(x, y);
            }
        } else {
            m33816i0(x, y);
        }
        invalidate();
        this.f58084q = motionEvent.getX();
        this.f58085r = motionEvent.getY();
    }

    /* renamed from: q0 */
    public final void m33800q0(MotionEvent motionEvent) {
        ShowMode showMode = this.f58047S;
        ShowMode showMode2 = ShowMode.SHOW_ON_TOUCH;
        if (showMode == showMode2) {
            this.f58053a0 = false;
        }
        if (this.f58048T == showMode2) {
            this.f58055b0 = false;
        }
        this.f58045Q = TouchArea.OUT_OF_BOUNDS;
        invalidate();
    }

    /* renamed from: r0 */
    public final void m33798r0(Callback callback, Throwable th2) {
        if (callback == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            callback.onError(th2);
        } else {
            this.f58091x.post(new RunnableC9039k(callback, th2));
        }
    }

    public void rotateImage(RotateDegrees rotateDegrees, int i) {
        if (this.f58086s) {
            getAnimator().cancelAnimation();
        }
        float f = this.f58058d;
        float value = f + rotateDegrees.getValue();
        float f2 = value - f;
        float f3 = this.f58056c;
        float m33857C = m33857C(this.f58052a, this.f58054b, value);
        if (this.f58079n0) {
            SimpleValueAnimator animator = getAnimator();
            animator.addAnimatorListener(new C9047q(f, f2, f3, m33857C - f3, value, m33857C));
            animator.startAnimation(i);
            return;
        }
        this.f58058d = value % 360.0f;
        this.f58056c = m33857C;
        m33784y0(this.f58052a, this.f58054b);
    }

    /* renamed from: s0 */
    public final void m33796s0(int i) {
        if (this.f58080o == null) {
            return;
        }
        if (this.f58087t) {
            getAnimator().cancelAnimation();
        }
        RectF rectF = new RectF(this.f58076m);
        RectF m33860A = m33860A(this.f58080o);
        float f = m33860A.left - rectF.left;
        float f2 = m33860A.top - rectF.top;
        float f3 = m33860A.right - rectF.right;
        float f4 = m33860A.bottom - rectF.bottom;
        if (this.f58079n0) {
            SimpleValueAnimator animator = getAnimator();
            animator.addAnimatorListener(new C9038j(rectF, f, f2, f3, f4, m33860A));
            animator.startAnimation(i);
            return;
        }
        this.f58076m = m33860A(this.f58080o);
        invalidate();
    }

    public SaveRequest save(Bitmap bitmap) {
        return new SaveRequest(this, bitmap);
    }

    public Single<Uri> saveAsSingle(Bitmap bitmap, Uri uri) {
        return Single.fromCallable(new CallableC9036h(bitmap, uri)).doOnSubscribe(new C9035g()).doFinally(new C9034f());
    }

    public void saveAsync(Uri uri, Bitmap bitmap, SaveCallback saveCallback) {
        this.f58044P.submit(new RunnableC9032e(bitmap, uri, saveCallback));
    }

    public void setAnimationDuration(int i) {
        this.f58081o0 = i;
    }

    public void setAnimationEnabled(boolean z) {
        this.f58079n0 = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f58067h0 = i;
        invalidate();
    }

    public void setCompressFormat(Bitmap.CompressFormat compressFormat) {
        this.f58035G = compressFormat;
    }

    public void setCompressQuality(int i) {
        this.f58036H = i;
    }

    public void setCropEnabled(boolean z) {
        this.f58057c0 = z;
        invalidate();
    }

    public void setCropMode(CropMode cropMode, int i) {
        if (cropMode == CropMode.CUSTOM) {
            setCustomRatio(1, 1);
            return;
        }
        this.f58046R = cropMode;
        m33796s0(i);
    }

    public void setCustomRatio(int i, int i2, int i3) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.f58046R = CropMode.CUSTOM;
        this.f58061e0 = new PointF(i, i2);
        m33796s0(i3);
    }

    public void setDebug(boolean z) {
        this.f58034F = z;
        Logger.enabled = true;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f58059d0 = z;
    }

    public void setFrameColor(int i) {
        this.f58071j0 = i;
        invalidate();
    }

    public void setFrameStrokeWeightInDp(int i) {
        this.f58063f0 = i * getDensity();
        invalidate();
    }

    public void setGuideColor(int i) {
        this.f58075l0 = i;
        invalidate();
    }

    public void setGuideShowMode(ShowMode showMode) {
        this.f58047S = showMode;
        int i = C9037i.f58154c[showMode.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                this.f58053a0 = false;
            }
        } else {
            this.f58053a0 = true;
        }
        invalidate();
    }

    public void setGuideStrokeWeightInDp(int i) {
        this.f58065g0 = i * getDensity();
        invalidate();
    }

    public void setHandleColor(int i) {
        this.f58073k0 = i;
        invalidate();
    }

    public void setHandleShadowEnabled(boolean z) {
        this.f58083p0 = z;
    }

    public void setHandleShowMode(ShowMode showMode) {
        this.f58048T = showMode;
        int i = C9037i.f58154c[showMode.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                this.f58055b0 = false;
            }
        } else {
            this.f58055b0 = true;
        }
        invalidate();
    }

    public void setHandleSizeInDp(int i) {
        this.f58050V = (int) (i * getDensity());
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f58064g = false;
        m33794t0();
        setImageDrawableInternal(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f58064g = false;
        m33794t0();
        super.setImageResource(i);
        m33859A0();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        this.f58064g = false;
        super.setImageURI(uri);
        m33859A0();
    }

    public void setInitialFrameScale(float f) {
        this.f58077m0 = m33853G(f, 0.01f, 1.0f, 1.0f);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f58090w = interpolator;
        this.f58088u = null;
        m33786x0();
    }

    public void setLoggingEnabled(boolean z) {
        Logger.enabled = z;
    }

    public void setMinFrameSizeInDp(int i) {
        this.f58049U = i * getDensity();
    }

    public void setMinFrameSizeInPx(int i) {
        this.f58049U = i;
    }

    public void setOutputHeight(int i) {
        this.f58033E = i;
        this.f58032D = 0;
    }

    public void setOutputMaxSize(int i, int i2) {
        this.f58030B = i;
        this.f58031C = i2;
    }

    public void setOutputWidth(int i) {
        this.f58032D = i;
        this.f58033E = 0;
    }

    public void setOverlayColor(int i) {
        this.f58069i0 = i;
        invalidate();
    }

    public void setTouchPaddingInDp(int i) {
        this.f58051W = (int) (i * getDensity());
    }

    public void startCrop(Uri uri, CropCallback cropCallback, SaveCallback saveCallback) {
        this.f58044P.submit(new RunnableC9048r(cropCallback, uri, saveCallback));
    }

    public void startLoad(Uri uri, LoadCallback loadCallback) {
        loadAsync(uri, loadCallback);
    }

    /* renamed from: t0 */
    public final void m33794t0() {
        if (this.f58041M.get()) {
            return;
        }
        this.f58092y = null;
        this.f58093z = null;
        this.f58037I = 0;
        this.f58038J = 0;
        this.f58039K = 0;
        this.f58040L = 0;
        this.f58058d = this.f58029A;
    }

    /* renamed from: u0 */
    public final Uri m33792u0(Bitmap bitmap, Uri uri) {
        this.f58093z = uri;
        if (uri != null) {
            OutputStream outputStream = null;
            try {
                outputStream = getContext().getContentResolver().openOutputStream(uri);
                bitmap.compress(this.f58035G, this.f58036H, outputStream);
                Utils.copyExifInfo(getContext(), this.f58092y, uri, bitmap.getWidth(), bitmap.getHeight());
                Utils.updateGalleryInfo(getContext(), uri);
                return uri;
            } finally {
                Utils.closeQuietly(outputStream);
            }
        }
        throw new IllegalStateException("Save uri must not be null.");
    }

    /* renamed from: v0 */
    public final Bitmap m33790v0(Bitmap bitmap) {
        int i;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float m33843Q = m33843Q(this.f58076m.width()) / m33842R(this.f58076m.height());
        int i3 = this.f58032D;
        if (i3 > 0) {
            i = Math.round(i3 / m33843Q);
        } else {
            int i4 = this.f58033E;
            if (i4 > 0) {
                i3 = Math.round(i4 * m33843Q);
                i = i4;
            } else {
                i3 = this.f58030B;
                if (i3 > 0 && (i2 = this.f58031C) > 0 && (width > i3 || height > i2)) {
                    if (i3 / i2 >= m33843Q) {
                        i3 = Math.round(i2 * m33843Q);
                        i = i2;
                    } else {
                        i = Math.round(i3 / m33843Q);
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
    public final void m33788w0() {
        this.f58066h.reset();
        Matrix matrix = this.f58066h;
        PointF pointF = this.f58082p;
        matrix.setTranslate(pointF.x - (this.f58060e * 0.5f), pointF.y - (this.f58062f * 0.5f));
        Matrix matrix2 = this.f58066h;
        float f = this.f58056c;
        PointF pointF2 = this.f58082p;
        matrix2.postScale(f, f, pointF2.x, pointF2.y);
        Matrix matrix3 = this.f58066h;
        float f2 = this.f58058d;
        PointF pointF3 = this.f58082p;
        matrix3.postRotate(f2, pointF3.x, pointF3.y);
    }

    /* renamed from: x */
    public final RectF m33787x(RectF rectF) {
        RectF rectF2 = new RectF();
        float f = rectF.left;
        float f2 = this.f58056c;
        rectF2.set(f * f2, rectF.top * f2, rectF.right * f2, rectF.bottom * f2);
        RectF rectF3 = this.f58080o;
        rectF2.offset(rectF3.left, rectF3.top);
        rectF2.set(Math.max(this.f58080o.left, rectF2.left), Math.max(this.f58080o.top, rectF2.top), Math.min(this.f58080o.right, rectF2.right), Math.min(this.f58080o.bottom, rectF2.bottom));
        return rectF2;
    }

    /* renamed from: x0 */
    public final void m33786x0() {
        if (this.f58088u == null) {
            this.f58088u = new ValueAnimatorV14(this.f58090w);
        }
    }

    /* renamed from: y */
    public final void m33785y(Uri uri) {
        Bitmap m33836X = m33836X(uri);
        if (m33836X == null) {
            return;
        }
        this.f58091x.post(new RunnableC9046p(m33836X));
    }

    /* renamed from: y0 */
    public final void m33784y0(int i, int i2) {
        if (i != 0 && i2 != 0) {
            setCenter(new PointF(getPaddingLeft() + (i * 0.5f), getPaddingTop() + (i2 * 0.5f)));
            setScale(m33857C(i, i2, this.f58058d));
            m33788w0();
            RectF m33858B = m33858B(new RectF(0.0f, 0.0f, this.f58060e, this.f58062f), this.f58066h);
            this.f58080o = m33858B;
            RectF rectF = this.f58078n;
            if (rectF != null) {
                this.f58076m = m33787x(rectF);
            } else {
                this.f58076m = m33860A(m33858B);
            }
            this.f58064g = true;
            invalidate();
        }
    }

    /* renamed from: z */
    public final Rect m33783z(int i, int i2) {
        float f = i;
        float f2 = i2;
        float m33837W = m33837W(this.f58058d, f, f2) / this.f58080o.width();
        RectF rectF = this.f58080o;
        float f3 = rectF.left * m33837W;
        float f4 = rectF.top * m33837W;
        return new Rect(Math.max(Math.round((this.f58076m.left * m33837W) - f3), 0), Math.max(Math.round((this.f58076m.top * m33837W) - f4), 0), Math.min(Math.round((this.f58076m.right * m33837W) - f3), Math.round(m33837W(this.f58058d, f, f2))), Math.min(Math.round((this.f58076m.bottom * m33837W) - f4), Math.round(m33839U(this.f58058d, f, f2))));
    }

    /* renamed from: z0 */
    public final float m33782z0(float f) {
        return f * f;
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void cropAsync(CropCallback cropCallback) {
        cropAsync(null, cropCallback);
    }

    public Completable loadAsCompletable(Uri uri, boolean z, RectF rectF) {
        return Completable.create(new C9044o(rectF, uri, z)).doOnSubscribe(new C9043n()).doFinally(new C9042m());
    }

    public void loadAsync(Uri uri, boolean z, RectF rectF, LoadCallback loadCallback) {
        this.f58044P.submit(new RunnableC9040l(uri, rectF, z, loadCallback));
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58052a = 0;
        this.f58054b = 0;
        this.f58056c = 1.0f;
        this.f58058d = 0.0f;
        this.f58060e = 0.0f;
        this.f58062f = 0.0f;
        this.f58064g = false;
        this.f58066h = null;
        this.f58082p = new PointF();
        this.f58086s = false;
        this.f58087t = false;
        this.f58088u = null;
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        this.f58089v = decelerateInterpolator;
        this.f58090w = decelerateInterpolator;
        this.f58091x = new Handler(Looper.getMainLooper());
        this.f58092y = null;
        this.f58093z = null;
        this.f58029A = 0;
        this.f58032D = 0;
        this.f58033E = 0;
        this.f58034F = false;
        this.f58035G = Bitmap.CompressFormat.PNG;
        this.f58036H = 100;
        this.f58037I = 0;
        this.f58038J = 0;
        this.f58039K = 0;
        this.f58040L = 0;
        this.f58041M = new AtomicBoolean(false);
        this.f58042N = new AtomicBoolean(false);
        this.f58043O = new AtomicBoolean(false);
        this.f58045Q = TouchArea.OUT_OF_BOUNDS;
        this.f58046R = CropMode.SQUARE;
        ShowMode showMode = ShowMode.SHOW_ALWAYS;
        this.f58047S = showMode;
        this.f58048T = showMode;
        this.f58051W = 0;
        this.f58053a0 = true;
        this.f58055b0 = true;
        this.f58057c0 = true;
        this.f58059d0 = true;
        this.f58061e0 = new PointF(1.0f, 1.0f);
        this.f58063f0 = 2.0f;
        this.f58065g0 = 2.0f;
        this.f58079n0 = true;
        this.f58081o0 = 100;
        this.f58083p0 = true;
        this.f58044P = Executors.newSingleThreadExecutor();
        float density = getDensity();
        this.f58050V = (int) (14.0f * density);
        this.f58049U = 50.0f * density;
        float f = density * 1.0f;
        this.f58063f0 = f;
        this.f58065g0 = f;
        this.f58070j = new Paint();
        this.f58068i = new Paint();
        Paint paint = new Paint();
        this.f58072k = paint;
        paint.setFilterBitmap(true);
        Paint paint2 = new Paint();
        this.f58074l = paint2;
        paint2.setAntiAlias(true);
        this.f58074l.setStyle(Paint.Style.STROKE);
        this.f58074l.setColor(-1);
        this.f58074l.setTextSize(15.0f * density);
        this.f58066h = new Matrix();
        this.f58056c = 1.0f;
        this.f58067h0 = 0;
        this.f58071j0 = -1;
        this.f58069i0 = -1157627904;
        this.f58073k0 = -1;
        this.f58075l0 = -1140850689;
        m33835Y(context, attributeSet, i, density);
    }

    public Single<Bitmap> cropAsSingle() {
        return cropAsSingle(null);
    }

    public void setCustomRatio(int i, int i2) {
        setCustomRatio(i, i2, this.f58081o0);
    }

    public void setCropMode(CropMode cropMode) {
        setCropMode(cropMode, this.f58081o0);
    }

    public void rotateImage(RotateDegrees rotateDegrees) {
        rotateImage(rotateDegrees, this.f58081o0);
    }
}