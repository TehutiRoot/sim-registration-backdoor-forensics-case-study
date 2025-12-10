package com.google.android.cameraview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.p005os.ParcelableCompat;
import androidx.core.p005os.ParcelableCompatCreatorCallbacks;
import androidx.core.view.ViewCompat;
import com.google.android.cameraview.AbstractC6207d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes3.dex */
public class CameraView extends FrameLayout {
    public static final int FACING_BACK = 0;
    public static final int FACING_FRONT = 1;
    public static final int FLASH_AUTO = 3;
    public static final int FLASH_OFF = 0;
    public static final int FLASH_ON = 1;
    public static final int FLASH_RED_EYE = 4;
    public static final int FLASH_TORCH = 2;

    /* renamed from: a */
    public AbstractC6207d f43801a;

    /* renamed from: b */
    public final C6191b f43802b;

    /* renamed from: c */
    public boolean f43803c;

    /* renamed from: d */
    public final AbstractC12349nJ f43804d;

    /* loaded from: classes3.dex */
    public static abstract class Callback {
        public void onCameraClosed(CameraView cameraView) {
        }

        public void onCameraOpened(CameraView cameraView) {
        }

        public void onPictureTaken(CameraView cameraView, byte[] bArr) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Facing {
    }

    /* loaded from: classes3.dex */
    public @interface Flash {
    }

    /* renamed from: com.google.android.cameraview.CameraView$a */
    /* loaded from: classes3.dex */
    public class C6190a extends AbstractC12349nJ {
        public C6190a(Context context) {
            super(context);
        }

        @Override // p000.AbstractC12349nJ
        /* renamed from: e */
        public void mo26139e(int i) {
            CameraView.this.f43801a.mo49193j(i);
        }
    }

    /* renamed from: com.google.android.cameraview.CameraView$b */
    /* loaded from: classes3.dex */
    public class C6191b implements AbstractC6207d.InterfaceC6208a {

        /* renamed from: a */
        public final ArrayList f43810a = new ArrayList();

        /* renamed from: b */
        public boolean f43811b;

        public C6191b() {
        }

        @Override // com.google.android.cameraview.AbstractC6207d.InterfaceC6208a
        /* renamed from: a */
        public void mo49187a() {
            Iterator it = this.f43810a.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).onCameraClosed(CameraView.this);
            }
        }

        @Override // com.google.android.cameraview.AbstractC6207d.InterfaceC6208a
        /* renamed from: b */
        public void mo49186b() {
            if (this.f43811b) {
                this.f43811b = false;
                CameraView.this.requestLayout();
            }
            Iterator it = this.f43810a.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).onCameraOpened(CameraView.this);
            }
        }

        /* renamed from: c */
        public void m49242c(Callback callback) {
            this.f43810a.add(callback);
        }

        /* renamed from: d */
        public void m49241d(Callback callback) {
            this.f43810a.remove(callback);
        }

        /* renamed from: e */
        public void m49240e() {
            this.f43811b = true;
        }

        @Override // com.google.android.cameraview.AbstractC6207d.InterfaceC6208a
        public void onPictureTaken(byte[] bArr) {
            Iterator it = this.f43810a.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).onPictureTaken(CameraView.this, bArr);
            }
        }
    }

    public CameraView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final AbstractC6209e m49245a(Context context) {
        return new C6211f(context, this);
    }

    public void addCallback(@NonNull Callback callback) {
        this.f43802b.m49242c(callback);
    }

    public boolean getAdjustViewBounds() {
        return this.f43803c;
    }

    @Nullable
    public AspectRatio getAspectRatio() {
        return this.f43801a.mo49202a();
    }

    public boolean getAutoFocus() {
        return this.f43801a.mo49201b();
    }

    public int getFacing() {
        return this.f43801a.mo49200c();
    }

    @Flash
    public int getFlash() {
        return this.f43801a.mo49199d();
    }

    public Set<AspectRatio> getSupportedAspectRatios() {
        return this.f43801a.mo49198e();
    }

    public boolean isCameraOpened() {
        return this.f43801a.mo49196g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.f43804d.m26141c(ViewCompat.getDisplay(this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f43804d.m26143a();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.f43803c) {
            if (!isCameraOpened()) {
                this.f43802b.m49240e();
                super.onMeasure(i, i2);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                int size = (int) (View.MeasureSpec.getSize(i) * getAspectRatio().toFloat());
                if (mode2 == Integer.MIN_VALUE) {
                    size = Math.min(size, View.MeasureSpec.getSize(i2));
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            } else if (mode != 1073741824 && mode2 == 1073741824) {
                int size2 = (int) (View.MeasureSpec.getSize(i2) * getAspectRatio().toFloat());
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(size2, View.MeasureSpec.getSize(i));
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), i2);
            } else {
                super.onMeasure(i, i2);
            }
        } else {
            super.onMeasure(i, i2);
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        AspectRatio aspectRatio = getAspectRatio();
        if (this.f43804d.m26140d() % BitmapUtil.IMAGE_180_DEGREE == 0) {
            aspectRatio = aspectRatio.inverse();
        }
        if (measuredHeight < (aspectRatio.getY() * measuredWidth) / aspectRatio.getX()) {
            this.f43801a.m49197f().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((measuredWidth * aspectRatio.getY()) / aspectRatio.getX(), 1073741824));
        } else {
            this.f43801a.m49197f().measure(View.MeasureSpec.makeMeasureSpec((aspectRatio.getX() * measuredHeight) / aspectRatio.getY(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setFacing(savedState.f43805a);
        setAspectRatio(savedState.f43806b);
        setAutoFocus(savedState.f43807c);
        setFlash(savedState.f43808d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f43805a = getFacing();
        savedState.f43806b = getAspectRatio();
        savedState.f43807c = getAutoFocus();
        savedState.f43808d = getFlash();
        return savedState;
    }

    public void removeCallback(@NonNull Callback callback) {
        this.f43802b.m49241d(callback);
    }

    public void setAdjustViewBounds(boolean z) {
        if (this.f43803c != z) {
            this.f43803c = z;
            requestLayout();
        }
    }

    public void setAspectRatio(@NonNull AspectRatio aspectRatio) {
        if (this.f43801a.mo49195h(aspectRatio)) {
            requestLayout();
        }
    }

    public void setAutoFocus(boolean z) {
        this.f43801a.mo49194i(z);
    }

    public void setFacing(int i) {
        this.f43801a.mo49192k(i);
    }

    public void setFlash(@Flash int i) {
        this.f43801a.mo49191l(i);
    }

    public void start() {
        if (!this.f43801a.mo49190m()) {
            Parcelable onSaveInstanceState = onSaveInstanceState();
            this.f43801a = new C6196a(this.f43802b, m49245a(getContext()));
            onRestoreInstanceState(onSaveInstanceState);
            this.f43801a.mo49190m();
        }
    }

    public void stop() {
        this.f43801a.mo49189n();
    }

    public void takePicture() {
        this.f43801a.mo49188o();
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            this.f43802b = null;
            this.f43804d = null;
            return;
        }
        AbstractC6209e m49245a = m49245a(context);
        C6191b c6191b = new C6191b();
        this.f43802b = c6191b;
        if (Build.VERSION.SDK_INT < 23) {
            this.f43801a = new C6198b(c6191b, m49245a, context);
        } else {
            this.f43801a = new C6206c(c6191b, m49245a, context);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CameraView, i, R.style.Widget_CameraView);
        this.f43803c = obtainStyledAttributes.getBoolean(R.styleable.CameraView_android_adjustViewBounds, false);
        setFacing(obtainStyledAttributes.getInt(R.styleable.CameraView_facing, 0));
        String string = obtainStyledAttributes.getString(R.styleable.CameraView_aspectRatio);
        if (string != null) {
            setAspectRatio(AspectRatio.parse(string));
        } else {
            setAspectRatio(InterfaceC12325mx.f72089a);
        }
        setAutoFocus(obtainStyledAttributes.getBoolean(R.styleable.CameraView_autoFocus, true));
        setFlash(obtainStyledAttributes.getInt(R.styleable.CameraView_flash, 3));
        obtainStyledAttributes.recycle();
        this.f43804d = new C6190a(context);
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new C6189a());

        /* renamed from: a */
        public int f43805a;

        /* renamed from: b */
        public AspectRatio f43806b;

        /* renamed from: c */
        public boolean f43807c;

        /* renamed from: d */
        public int f43808d;

        /* renamed from: com.google.android.cameraview.CameraView$SavedState$a */
        /* loaded from: classes3.dex */
        public class C6189a implements ParcelableCompatCreatorCallbacks {
            @Override // androidx.core.p005os.ParcelableCompatCreatorCallbacks
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // androidx.core.p005os.ParcelableCompatCreatorCallbacks
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            this.f43805a = parcel.readInt();
            this.f43806b = (AspectRatio) parcel.readParcelable(classLoader);
            this.f43807c = parcel.readByte() != 0;
            this.f43808d = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f43805a);
            parcel.writeParcelable(this.f43806b, 0);
            parcel.writeByte(this.f43807c ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f43808d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
